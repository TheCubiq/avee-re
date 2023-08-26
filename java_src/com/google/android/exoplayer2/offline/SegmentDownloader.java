package com.google.android.exoplayer2.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.FilterableManifest;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheUtil;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public abstract class SegmentDownloader<M extends FilterableManifest<M, K>, K> implements Downloader {
    private static final int BUFFER_SIZE_BYTES = 131072;
    private final Cache cache;
    private final CacheDataSource dataSource;
    private volatile long downloadedBytes;
    private volatile int downloadedSegments;
    private final Uri manifestUri;
    private final CacheDataSource offlineDataSource;
    private final PriorityTaskManager priorityTaskManager;
    private final ArrayList<K> streamKeys;
    private volatile int totalSegments = -1;
    private final AtomicBoolean isCanceled = new AtomicBoolean();

    protected abstract M getManifest(DataSource dataSource, Uri uri) throws IOException;

    protected abstract List<Segment> getSegments(DataSource dataSource, M m, boolean z) throws InterruptedException, IOException;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class Segment implements Comparable<Segment> {
        public final DataSpec dataSpec;
        public final long startTimeUs;

        public Segment(long j, DataSpec dataSpec) {
            this.startTimeUs = j;
            this.dataSpec = dataSpec;
        }

        @Override // java.lang.Comparable
        public int compareTo(Segment segment) {
            long j = this.startTimeUs - segment.startTimeUs;
            if (j == 0) {
                return 0;
            }
            return j < 0 ? -1 : 1;
        }
    }

    public SegmentDownloader(Uri uri, List<K> list, DownloaderConstructorHelper downloaderConstructorHelper) {
        this.manifestUri = uri;
        this.streamKeys = new ArrayList<>(list);
        this.cache = downloaderConstructorHelper.getCache();
        this.dataSource = downloaderConstructorHelper.buildCacheDataSource(false);
        this.offlineDataSource = downloaderConstructorHelper.buildCacheDataSource(true);
        this.priorityTaskManager = downloaderConstructorHelper.getPriorityTaskManager();
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public final void download() throws IOException, InterruptedException {
        this.priorityTaskManager.add(-1000);
        try {
            List<Segment> initDownload = initDownload();
            Collections.sort(initDownload);
            byte[] bArr = new byte[131072];
            CacheUtil.CachingCounters cachingCounters = new CacheUtil.CachingCounters();
            for (int i = 0; i < initDownload.size(); i++) {
                CacheUtil.cache(initDownload.get(i).dataSpec, this.cache, this.dataSource, bArr, this.priorityTaskManager, -1000, cachingCounters, this.isCanceled, true);
                this.downloadedSegments++;
                this.downloadedBytes += cachingCounters.newlyCachedBytes;
            }
        } finally {
            this.priorityTaskManager.remove(-1000);
        }
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public void cancel() {
        this.isCanceled.set(true);
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public final long getDownloadedBytes() {
        return this.downloadedBytes;
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public final float getDownloadPercentage() {
        int i = this.totalSegments;
        int i2 = this.downloadedSegments;
        if (i == -1 || i2 == -1) {
            return -1.0f;
        }
        if (i == 0) {
            return 100.0f;
        }
        return (i2 * 100.0f) / i;
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public final void remove() throws InterruptedException {
        try {
            List<Segment> segments = getSegments(this.offlineDataSource, getManifest(this.offlineDataSource, this.manifestUri), true);
            for (int i = 0; i < segments.size(); i++) {
                removeUri(segments.get(i).dataSpec.uri);
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            removeUri(this.manifestUri);
            throw th;
        }
        removeUri(this.manifestUri);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private List<Segment> initDownload() throws IOException, InterruptedException {
        FilterableManifest manifest = getManifest(this.dataSource, this.manifestUri);
        if (!this.streamKeys.isEmpty()) {
            manifest = (FilterableManifest) manifest.copy(this.streamKeys);
        }
        List<Segment> segments = getSegments(this.dataSource, manifest, false);
        CacheUtil.CachingCounters cachingCounters = new CacheUtil.CachingCounters();
        this.totalSegments = segments.size();
        this.downloadedSegments = 0;
        this.downloadedBytes = 0L;
        for (int size = segments.size() - 1; size >= 0; size--) {
            CacheUtil.getCached(segments.get(size).dataSpec, this.cache, cachingCounters);
            this.downloadedBytes += cachingCounters.alreadyCachedBytes;
            if (cachingCounters.alreadyCachedBytes == cachingCounters.contentLength) {
                this.downloadedSegments++;
                segments.remove(size);
            }
        }
        return segments;
    }

    private void removeUri(Uri uri) {
        CacheUtil.remove(this.cache, CacheUtil.generateKey(uri));
    }
}
