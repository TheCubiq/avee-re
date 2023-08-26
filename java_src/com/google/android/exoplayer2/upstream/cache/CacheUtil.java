package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class CacheUtil {
    public static final int DEFAULT_BUFFER_SIZE_BYTES = 131072;

    /* loaded from: classes.dex */
    public static class CachingCounters {
        public volatile long alreadyCachedBytes;
        public volatile long contentLength = -1;
        public volatile long newlyCachedBytes;

        public long totalCachedBytes() {
            return this.alreadyCachedBytes + this.newlyCachedBytes;
        }
    }

    public static String generateKey(Uri uri) {
        return uri.toString();
    }

    public static String getKey(DataSpec dataSpec) {
        return dataSpec.key != null ? dataSpec.key : generateKey(dataSpec.uri);
    }

    public static void getCached(DataSpec dataSpec, Cache cache, CachingCounters cachingCounters) {
        String key = getKey(dataSpec);
        long j = dataSpec.absoluteStreamPosition;
        long contentLength = dataSpec.length != -1 ? dataSpec.length : cache.getContentLength(key);
        cachingCounters.contentLength = contentLength;
        cachingCounters.alreadyCachedBytes = 0L;
        cachingCounters.newlyCachedBytes = 0L;
        long j2 = j;
        long j3 = contentLength;
        while (j3 != 0) {
            long cachedLength = cache.getCachedLength(key, j2, j3 != -1 ? j3 : Long.MAX_VALUE);
            if (cachedLength > 0) {
                cachingCounters.alreadyCachedBytes += cachedLength;
            } else {
                cachedLength = -cachedLength;
                if (cachedLength == Long.MAX_VALUE) {
                    return;
                }
            }
            j2 += cachedLength;
            if (j3 == -1) {
                cachedLength = 0;
            }
            j3 -= cachedLength;
        }
    }

    public static void cache(DataSpec dataSpec, Cache cache, DataSource dataSource, CachingCounters cachingCounters, AtomicBoolean atomicBoolean) throws IOException, InterruptedException {
        cache(dataSpec, cache, new CacheDataSource(cache, dataSource), new byte[131072], null, 0, cachingCounters, atomicBoolean, false);
    }

    public static void cache(DataSpec dataSpec, Cache cache, CacheDataSource cacheDataSource, byte[] bArr, PriorityTaskManager priorityTaskManager, int i, CachingCounters cachingCounters, AtomicBoolean atomicBoolean, boolean z) throws IOException, InterruptedException {
        CachingCounters cachingCounters2 = cachingCounters;
        Assertions.checkNotNull(cacheDataSource);
        Assertions.checkNotNull(bArr);
        if (cachingCounters2 != null) {
            getCached(dataSpec, cache, cachingCounters2);
        } else {
            cachingCounters2 = new CachingCounters();
        }
        CachingCounters cachingCounters3 = cachingCounters2;
        String key = getKey(dataSpec);
        long j = dataSpec.absoluteStreamPosition;
        long contentLength = dataSpec.length != -1 ? dataSpec.length : cache.getContentLength(key);
        while (true) {
            long j2 = 0;
            if (contentLength == 0) {
                return;
            }
            if (atomicBoolean != null && atomicBoolean.get()) {
                throw new InterruptedException();
            }
            long cachedLength = cache.getCachedLength(key, j, contentLength != -1 ? contentLength : Long.MAX_VALUE);
            if (cachedLength <= 0) {
                long j3 = -cachedLength;
                if (readAndDiscard(dataSpec, j, j3, cacheDataSource, bArr, priorityTaskManager, i, cachingCounters3) < j3) {
                    if (z && contentLength != -1) {
                        throw new EOFException();
                    }
                    return;
                }
                cachedLength = j3;
            }
            j += cachedLength;
            if (contentLength != -1) {
                j2 = cachedLength;
            }
            contentLength -= j2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long readAndDiscard(DataSpec dataSpec, long j, long j2, DataSource dataSource, byte[] bArr, PriorityTaskManager priorityTaskManager, int i, CachingCounters cachingCounters) throws IOException, InterruptedException {
        DataSpec dataSpec2 = dataSpec;
        while (true) {
            if (priorityTaskManager != null) {
                priorityTaskManager.proceed(i);
            }
            try {
                try {
                    if (Thread.interrupted()) {
                        throw new InterruptedException();
                        break;
                    }
                    DataSpec dataSpec3 = new DataSpec(dataSpec2.uri, dataSpec2.postBody, j, (dataSpec2.position + j) - dataSpec2.absoluteStreamPosition, -1L, dataSpec2.key, dataSpec2.flags | 2);
                    try {
                        long open = dataSource.open(dataSpec3);
                        if (cachingCounters.contentLength == -1 && open != -1) {
                            cachingCounters.contentLength = dataSpec3.absoluteStreamPosition + open;
                        }
                        long j3 = 0;
                        while (true) {
                            if (j3 == j2) {
                                break;
                            } else if (Thread.interrupted()) {
                                throw new InterruptedException();
                            } else {
                                int read = dataSource.read(bArr, 0, j2 != -1 ? (int) Math.min(bArr.length, j2 - j3) : bArr.length);
                                if (read == -1) {
                                    if (cachingCounters.contentLength == -1) {
                                        cachingCounters.contentLength = dataSpec3.absoluteStreamPosition + j3;
                                    }
                                } else {
                                    long j4 = read;
                                    j3 += j4;
                                    cachingCounters.newlyCachedBytes += j4;
                                }
                            }
                        }
                    } catch (PriorityTaskManager.PriorityTooLowException unused) {
                        dataSpec2 = dataSpec3;
                    }
                } catch (PriorityTaskManager.PriorityTooLowException unused2) {
                }
                Util.closeQuietly(dataSource);
            } finally {
                Util.closeQuietly(dataSource);
            }
        }
    }

    public static void remove(Cache cache, String str) {
        for (CacheSpan cacheSpan : cache.getCachedSpans(str)) {
            try {
                cache.removeSpan(cacheSpan);
            } catch (Cache.CacheException unused) {
            }
        }
    }

    private CacheUtil() {
    }
}
