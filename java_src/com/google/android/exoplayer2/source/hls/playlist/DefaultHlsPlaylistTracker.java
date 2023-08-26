package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.google.android.exoplayer2.source.hls.HlsDataSourceFactory;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.UriUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
/* loaded from: classes.dex */
public final class DefaultHlsPlaylistTracker implements HlsPlaylistTracker, Loader.Callback<ParsingLoadable<HlsPlaylist>> {
    private static final double PLAYLIST_STUCK_TARGET_DURATION_COEFFICIENT = 3.5d;
    private final HlsDataSourceFactory dataSourceFactory;
    private MediaSourceEventListener.EventDispatcher eventDispatcher;
    private Loader initialPlaylistLoader;
    private boolean isLive;
    private HlsMasterPlaylist masterPlaylist;
    private final int minRetryCount;
    private final ParsingLoadable.Parser<HlsPlaylist> playlistParser;
    private Handler playlistRefreshHandler;
    private HlsMasterPlaylist.HlsUrl primaryHlsUrl;
    private HlsPlaylistTracker.PrimaryPlaylistListener primaryPlaylistListener;
    private HlsMediaPlaylist primaryUrlSnapshot;
    private final List<HlsPlaylistTracker.PlaylistEventListener> listeners = new ArrayList();
    private final IdentityHashMap<HlsMasterPlaylist.HlsUrl, MediaPlaylistBundle> playlistBundles = new IdentityHashMap<>();
    private long initialStartTimeUs = C.TIME_UNSET;

    public DefaultHlsPlaylistTracker(HlsDataSourceFactory hlsDataSourceFactory, int i, ParsingLoadable.Parser<HlsPlaylist> parser) {
        this.dataSourceFactory = hlsDataSourceFactory;
        this.minRetryCount = i;
        this.playlistParser = parser;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void start(Uri uri, MediaSourceEventListener.EventDispatcher eventDispatcher, HlsPlaylistTracker.PrimaryPlaylistListener primaryPlaylistListener) {
        this.playlistRefreshHandler = new Handler();
        this.eventDispatcher = eventDispatcher;
        this.primaryPlaylistListener = primaryPlaylistListener;
        ParsingLoadable parsingLoadable = new ParsingLoadable(this.dataSourceFactory.createDataSource(4), uri, 4, this.playlistParser);
        Assertions.checkState(this.initialPlaylistLoader == null);
        Loader loader = new Loader("DefaultHlsPlaylistTracker:MasterPlaylist");
        this.initialPlaylistLoader = loader;
        eventDispatcher.loadStarted(parsingLoadable.dataSpec, parsingLoadable.type, loader.startLoading(parsingLoadable, this, this.minRetryCount));
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void release() {
        this.primaryHlsUrl = null;
        this.primaryUrlSnapshot = null;
        this.masterPlaylist = null;
        this.initialStartTimeUs = C.TIME_UNSET;
        this.initialPlaylistLoader.release();
        this.initialPlaylistLoader = null;
        for (MediaPlaylistBundle mediaPlaylistBundle : this.playlistBundles.values()) {
            mediaPlaylistBundle.release();
        }
        this.playlistRefreshHandler.removeCallbacksAndMessages(null);
        this.playlistRefreshHandler = null;
        this.playlistBundles.clear();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void addListener(HlsPlaylistTracker.PlaylistEventListener playlistEventListener) {
        this.listeners.add(playlistEventListener);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void removeListener(HlsPlaylistTracker.PlaylistEventListener playlistEventListener) {
        this.listeners.remove(playlistEventListener);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public HlsMasterPlaylist getMasterPlaylist() {
        return this.masterPlaylist;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public HlsMediaPlaylist getPlaylistSnapshot(HlsMasterPlaylist.HlsUrl hlsUrl) {
        HlsMediaPlaylist playlistSnapshot = this.playlistBundles.get(hlsUrl).getPlaylistSnapshot();
        if (playlistSnapshot != null) {
            maybeSetPrimaryUrl(hlsUrl);
        }
        return playlistSnapshot;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public long getInitialStartTimeUs() {
        return this.initialStartTimeUs;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public boolean isSnapshotValid(HlsMasterPlaylist.HlsUrl hlsUrl) {
        return this.playlistBundles.get(hlsUrl).isSnapshotValid();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void maybeThrowPrimaryPlaylistRefreshError() throws IOException {
        Loader loader = this.initialPlaylistLoader;
        if (loader != null) {
            loader.maybeThrowError();
        }
        HlsMasterPlaylist.HlsUrl hlsUrl = this.primaryHlsUrl;
        if (hlsUrl != null) {
            maybeThrowPlaylistRefreshError(hlsUrl);
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void maybeThrowPlaylistRefreshError(HlsMasterPlaylist.HlsUrl hlsUrl) throws IOException {
        this.playlistBundles.get(hlsUrl).maybeThrowPlaylistRefreshError();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void refreshPlaylist(HlsMasterPlaylist.HlsUrl hlsUrl) {
        this.playlistBundles.get(hlsUrl).loadPlaylist();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public boolean isLive() {
        return this.isLive;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public void onLoadCompleted(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2) {
        HlsMasterPlaylist hlsMasterPlaylist;
        HlsPlaylist result = parsingLoadable.getResult();
        boolean z = result instanceof HlsMediaPlaylist;
        if (z) {
            hlsMasterPlaylist = HlsMasterPlaylist.createSingleVariantMasterPlaylist(result.baseUri);
        } else {
            hlsMasterPlaylist = (HlsMasterPlaylist) result;
        }
        this.masterPlaylist = hlsMasterPlaylist;
        this.primaryHlsUrl = hlsMasterPlaylist.variants.get(0);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(hlsMasterPlaylist.variants);
        arrayList.addAll(hlsMasterPlaylist.audios);
        arrayList.addAll(hlsMasterPlaylist.subtitles);
        createBundles(arrayList);
        MediaPlaylistBundle mediaPlaylistBundle = this.playlistBundles.get(this.primaryHlsUrl);
        if (!z) {
            mediaPlaylistBundle.loadPlaylist();
        } else {
            mediaPlaylistBundle.processLoadedPlaylist((HlsMediaPlaylist) result);
        }
        this.eventDispatcher.loadCompleted(parsingLoadable.dataSpec, 4, j, j2, parsingLoadable.bytesLoaded());
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public void onLoadCanceled(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2, boolean z) {
        this.eventDispatcher.loadCanceled(parsingLoadable.dataSpec, 4, j, j2, parsingLoadable.bytesLoaded());
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public int onLoadError(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2, IOException iOException) {
        boolean z = iOException instanceof ParserException;
        this.eventDispatcher.loadError(parsingLoadable.dataSpec, 4, j, j2, parsingLoadable.bytesLoaded(), iOException, z);
        return z ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean maybeSelectNewPrimaryUrl() {
        List<HlsMasterPlaylist.HlsUrl> list = this.masterPlaylist.variants;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            MediaPlaylistBundle mediaPlaylistBundle = this.playlistBundles.get(list.get(i));
            if (elapsedRealtime > mediaPlaylistBundle.blacklistUntilMs) {
                this.primaryHlsUrl = mediaPlaylistBundle.playlistUrl;
                mediaPlaylistBundle.loadPlaylist();
                return true;
            }
        }
        return false;
    }

    private void maybeSetPrimaryUrl(HlsMasterPlaylist.HlsUrl hlsUrl) {
        if (hlsUrl == this.primaryHlsUrl || !this.masterPlaylist.variants.contains(hlsUrl)) {
            return;
        }
        HlsMediaPlaylist hlsMediaPlaylist = this.primaryUrlSnapshot;
        if (hlsMediaPlaylist == null || !hlsMediaPlaylist.hasEndTag) {
            this.primaryHlsUrl = hlsUrl;
            this.playlistBundles.get(hlsUrl).loadPlaylist();
        }
    }

    private void createBundles(List<HlsMasterPlaylist.HlsUrl> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            HlsMasterPlaylist.HlsUrl hlsUrl = list.get(i);
            this.playlistBundles.put(hlsUrl, new MediaPlaylistBundle(hlsUrl));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPlaylistUpdated(HlsMasterPlaylist.HlsUrl hlsUrl, HlsMediaPlaylist hlsMediaPlaylist) {
        if (hlsUrl == this.primaryHlsUrl) {
            if (this.primaryUrlSnapshot == null) {
                this.isLive = !hlsMediaPlaylist.hasEndTag;
                this.initialStartTimeUs = hlsMediaPlaylist.startTimeUs;
            }
            this.primaryUrlSnapshot = hlsMediaPlaylist;
            this.primaryPlaylistListener.onPrimaryPlaylistRefreshed(hlsMediaPlaylist);
        }
        int size = this.listeners.size();
        for (int i = 0; i < size; i++) {
            this.listeners.get(i).onPlaylistChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean notifyPlaylistError(HlsMasterPlaylist.HlsUrl hlsUrl, boolean z) {
        int size = this.listeners.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            z2 |= !this.listeners.get(i).onPlaylistError(hlsUrl, z);
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HlsMediaPlaylist getLatestPlaylistSnapshot(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist hlsMediaPlaylist2) {
        if (hlsMediaPlaylist2.isNewerThan(hlsMediaPlaylist)) {
            return hlsMediaPlaylist2.copyWith(getLoadedPlaylistStartTimeUs(hlsMediaPlaylist, hlsMediaPlaylist2), getLoadedPlaylistDiscontinuitySequence(hlsMediaPlaylist, hlsMediaPlaylist2));
        }
        return hlsMediaPlaylist2.hasEndTag ? hlsMediaPlaylist.copyWithEndTag() : hlsMediaPlaylist;
    }

    private long getLoadedPlaylistStartTimeUs(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist hlsMediaPlaylist2) {
        if (hlsMediaPlaylist2.hasProgramDateTime) {
            return hlsMediaPlaylist2.startTimeUs;
        }
        HlsMediaPlaylist hlsMediaPlaylist3 = this.primaryUrlSnapshot;
        long j = hlsMediaPlaylist3 != null ? hlsMediaPlaylist3.startTimeUs : 0L;
        if (hlsMediaPlaylist == null) {
            return j;
        }
        int size = hlsMediaPlaylist.segments.size();
        HlsMediaPlaylist.Segment firstOldOverlappingSegment = getFirstOldOverlappingSegment(hlsMediaPlaylist, hlsMediaPlaylist2);
        if (firstOldOverlappingSegment != null) {
            return hlsMediaPlaylist.startTimeUs + firstOldOverlappingSegment.relativeStartTimeUs;
        }
        return ((long) size) == hlsMediaPlaylist2.mediaSequence - hlsMediaPlaylist.mediaSequence ? hlsMediaPlaylist.getEndTimeUs() : j;
    }

    private int getLoadedPlaylistDiscontinuitySequence(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist hlsMediaPlaylist2) {
        HlsMediaPlaylist.Segment firstOldOverlappingSegment;
        if (hlsMediaPlaylist2.hasDiscontinuitySequence) {
            return hlsMediaPlaylist2.discontinuitySequence;
        }
        HlsMediaPlaylist hlsMediaPlaylist3 = this.primaryUrlSnapshot;
        int i = hlsMediaPlaylist3 != null ? hlsMediaPlaylist3.discontinuitySequence : 0;
        return (hlsMediaPlaylist == null || (firstOldOverlappingSegment = getFirstOldOverlappingSegment(hlsMediaPlaylist, hlsMediaPlaylist2)) == null) ? i : (hlsMediaPlaylist.discontinuitySequence + firstOldOverlappingSegment.relativeDiscontinuitySequence) - hlsMediaPlaylist2.segments.get(0).relativeDiscontinuitySequence;
    }

    private static HlsMediaPlaylist.Segment getFirstOldOverlappingSegment(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist hlsMediaPlaylist2) {
        int i = (int) (hlsMediaPlaylist2.mediaSequence - hlsMediaPlaylist.mediaSequence);
        List<HlsMediaPlaylist.Segment> list = hlsMediaPlaylist.segments;
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class MediaPlaylistBundle implements Loader.Callback<ParsingLoadable<HlsPlaylist>>, Runnable {
        private long blacklistUntilMs;
        private long earliestNextLoadTimeMs;
        private long lastSnapshotChangeMs;
        private long lastSnapshotLoadMs;
        private boolean loadPending;
        private final ParsingLoadable<HlsPlaylist> mediaPlaylistLoadable;
        private final Loader mediaPlaylistLoader = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");
        private IOException playlistError;
        private HlsMediaPlaylist playlistSnapshot;
        private final HlsMasterPlaylist.HlsUrl playlistUrl;

        public MediaPlaylistBundle(HlsMasterPlaylist.HlsUrl hlsUrl) {
            this.playlistUrl = hlsUrl;
            this.mediaPlaylistLoadable = new ParsingLoadable<>(DefaultHlsPlaylistTracker.this.dataSourceFactory.createDataSource(4), UriUtil.resolveToUri(DefaultHlsPlaylistTracker.this.masterPlaylist.baseUri, hlsUrl.url), 4, DefaultHlsPlaylistTracker.this.playlistParser);
        }

        public HlsMediaPlaylist getPlaylistSnapshot() {
            return this.playlistSnapshot;
        }

        public boolean isSnapshotValid() {
            if (this.playlistSnapshot == null) {
                return false;
            }
            return this.playlistSnapshot.hasEndTag || this.playlistSnapshot.playlistType == 2 || this.playlistSnapshot.playlistType == 1 || this.lastSnapshotLoadMs + Math.max(30000L, C.usToMs(this.playlistSnapshot.durationUs)) > SystemClock.elapsedRealtime();
        }

        public void release() {
            this.mediaPlaylistLoader.release();
        }

        public void loadPlaylist() {
            this.blacklistUntilMs = 0L;
            if (this.loadPending || this.mediaPlaylistLoader.isLoading()) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime < this.earliestNextLoadTimeMs) {
                this.loadPending = true;
                DefaultHlsPlaylistTracker.this.playlistRefreshHandler.postDelayed(this, this.earliestNextLoadTimeMs - elapsedRealtime);
                return;
            }
            loadPlaylistImmediately();
        }

        public void maybeThrowPlaylistRefreshError() throws IOException {
            this.mediaPlaylistLoader.maybeThrowError();
            IOException iOException = this.playlistError;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCompleted(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2) {
            HlsPlaylist result = parsingLoadable.getResult();
            if (result instanceof HlsMediaPlaylist) {
                processLoadedPlaylist((HlsMediaPlaylist) result);
                DefaultHlsPlaylistTracker.this.eventDispatcher.loadCompleted(parsingLoadable.dataSpec, 4, j, j2, parsingLoadable.bytesLoaded());
                return;
            }
            this.playlistError = new ParserException("Loaded playlist has unexpected type.");
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCanceled(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2, boolean z) {
            DefaultHlsPlaylistTracker.this.eventDispatcher.loadCanceled(parsingLoadable.dataSpec, 4, j, j2, parsingLoadable.bytesLoaded());
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public int onLoadError(ParsingLoadable<HlsPlaylist> parsingLoadable, long j, long j2, IOException iOException) {
            boolean z = iOException instanceof ParserException;
            DefaultHlsPlaylistTracker.this.eventDispatcher.loadError(parsingLoadable.dataSpec, 4, j, j2, parsingLoadable.bytesLoaded(), iOException, z);
            boolean shouldBlacklist = ChunkedTrackBlacklistUtil.shouldBlacklist(iOException);
            boolean z2 = DefaultHlsPlaylistTracker.this.notifyPlaylistError(this.playlistUrl, shouldBlacklist) || !shouldBlacklist;
            if (z) {
                return 3;
            }
            if (shouldBlacklist) {
                z2 |= blacklistPlaylist();
            }
            return z2 ? 0 : 2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.loadPending = false;
            loadPlaylistImmediately();
        }

        private void loadPlaylistImmediately() {
            DefaultHlsPlaylistTracker.this.eventDispatcher.loadStarted(this.mediaPlaylistLoadable.dataSpec, this.mediaPlaylistLoadable.type, this.mediaPlaylistLoader.startLoading(this.mediaPlaylistLoadable, this, DefaultHlsPlaylistTracker.this.minRetryCount));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void processLoadedPlaylist(HlsMediaPlaylist hlsMediaPlaylist) {
            HlsMediaPlaylist hlsMediaPlaylist2 = this.playlistSnapshot;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.lastSnapshotLoadMs = elapsedRealtime;
            HlsMediaPlaylist latestPlaylistSnapshot = DefaultHlsPlaylistTracker.this.getLatestPlaylistSnapshot(hlsMediaPlaylist2, hlsMediaPlaylist);
            this.playlistSnapshot = latestPlaylistSnapshot;
            if (latestPlaylistSnapshot != hlsMediaPlaylist2) {
                this.playlistError = null;
                this.lastSnapshotChangeMs = elapsedRealtime;
                DefaultHlsPlaylistTracker.this.onPlaylistUpdated(this.playlistUrl, latestPlaylistSnapshot);
            } else if (!latestPlaylistSnapshot.hasEndTag) {
                if (hlsMediaPlaylist.mediaSequence + hlsMediaPlaylist.segments.size() < this.playlistSnapshot.mediaSequence) {
                    this.playlistError = new HlsPlaylistTracker.PlaylistResetException(this.playlistUrl.url);
                    DefaultHlsPlaylistTracker.this.notifyPlaylistError(this.playlistUrl, false);
                } else {
                    double usToMs = C.usToMs(this.playlistSnapshot.targetDurationUs);
                    Double.isNaN(usToMs);
                    if (elapsedRealtime - this.lastSnapshotChangeMs > usToMs * DefaultHlsPlaylistTracker.PLAYLIST_STUCK_TARGET_DURATION_COEFFICIENT) {
                        this.playlistError = new HlsPlaylistTracker.PlaylistStuckException(this.playlistUrl.url);
                        DefaultHlsPlaylistTracker.this.notifyPlaylistError(this.playlistUrl, true);
                        blacklistPlaylist();
                    }
                }
            }
            HlsMediaPlaylist hlsMediaPlaylist3 = this.playlistSnapshot;
            long j = hlsMediaPlaylist3.targetDurationUs;
            if (hlsMediaPlaylist3 == hlsMediaPlaylist2) {
                j /= 2;
            }
            this.earliestNextLoadTimeMs = elapsedRealtime + C.usToMs(j);
            if (this.playlistUrl != DefaultHlsPlaylistTracker.this.primaryHlsUrl || this.playlistSnapshot.hasEndTag) {
                return;
            }
            loadPlaylist();
        }

        private boolean blacklistPlaylist() {
            this.blacklistUntilMs = SystemClock.elapsedRealtime() + ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
            return DefaultHlsPlaylistTracker.this.primaryHlsUrl == this.playlistUrl && !DefaultHlsPlaylistTracker.this.maybeSelectNewPrimaryUrl();
        }
    }
}
