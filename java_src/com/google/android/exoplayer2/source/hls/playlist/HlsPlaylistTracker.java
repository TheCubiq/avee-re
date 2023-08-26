package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist;
import java.io.IOException;
/* loaded from: classes.dex */
public interface HlsPlaylistTracker {

    /* loaded from: classes.dex */
    public interface PlaylistEventListener {
        void onPlaylistChanged();

        boolean onPlaylistError(HlsMasterPlaylist.HlsUrl hlsUrl, boolean z);
    }

    /* loaded from: classes.dex */
    public interface PrimaryPlaylistListener {
        void onPrimaryPlaylistRefreshed(HlsMediaPlaylist hlsMediaPlaylist);
    }

    void addListener(PlaylistEventListener playlistEventListener);

    long getInitialStartTimeUs();

    HlsMasterPlaylist getMasterPlaylist();

    HlsMediaPlaylist getPlaylistSnapshot(HlsMasterPlaylist.HlsUrl hlsUrl);

    boolean isLive();

    boolean isSnapshotValid(HlsMasterPlaylist.HlsUrl hlsUrl);

    void maybeThrowPlaylistRefreshError(HlsMasterPlaylist.HlsUrl hlsUrl) throws IOException;

    void maybeThrowPrimaryPlaylistRefreshError() throws IOException;

    void refreshPlaylist(HlsMasterPlaylist.HlsUrl hlsUrl);

    void release();

    void removeListener(PlaylistEventListener playlistEventListener);

    void start(Uri uri, MediaSourceEventListener.EventDispatcher eventDispatcher, PrimaryPlaylistListener primaryPlaylistListener);

    /* loaded from: classes.dex */
    public static final class PlaylistStuckException extends IOException {
        public final String url;

        public PlaylistStuckException(String str) {
            this.url = str;
        }
    }

    /* loaded from: classes.dex */
    public static final class PlaylistResetException extends IOException {
        public final String url;

        public PlaylistResetException(String str) {
            this.url = str;
        }
    }
}
