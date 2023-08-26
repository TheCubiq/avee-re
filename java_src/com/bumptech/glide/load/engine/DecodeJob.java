package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.provider.DataLoadProvider;
import com.bumptech.glide.util.LogTime;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class DecodeJob<A, T, Z> {
    private static final FileOpener DEFAULT_FILE_OPENER = new FileOpener();
    private static final String TAG = "DecodeJob";
    private final DiskCacheProvider diskCacheProvider;
    private final DiskCacheStrategy diskCacheStrategy;
    private final DataFetcher<A> fetcher;
    private final FileOpener fileOpener;
    private final int height;
    private volatile boolean isCancelled;
    private final DataLoadProvider<A, T> loadProvider;
    private final Priority priority;
    private final EngineKey resultKey;
    private final ResourceTranscoder<T, Z> transcoder;
    private final Transformation<T> transformation;
    private final int width;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface DiskCacheProvider {
        DiskCache getDiskCache();
    }

    public DecodeJob(EngineKey engineKey, int i, int i2, DataFetcher<A> dataFetcher, DataLoadProvider<A, T> dataLoadProvider, Transformation<T> transformation, ResourceTranscoder<T, Z> resourceTranscoder, DiskCacheProvider diskCacheProvider, DiskCacheStrategy diskCacheStrategy, Priority priority) {
        this(engineKey, i, i2, dataFetcher, dataLoadProvider, transformation, resourceTranscoder, diskCacheProvider, diskCacheStrategy, priority, DEFAULT_FILE_OPENER);
    }

    DecodeJob(EngineKey engineKey, int i, int i2, DataFetcher<A> dataFetcher, DataLoadProvider<A, T> dataLoadProvider, Transformation<T> transformation, ResourceTranscoder<T, Z> resourceTranscoder, DiskCacheProvider diskCacheProvider, DiskCacheStrategy diskCacheStrategy, Priority priority, FileOpener fileOpener) {
        this.resultKey = engineKey;
        this.width = i;
        this.height = i2;
        this.fetcher = dataFetcher;
        this.loadProvider = dataLoadProvider;
        this.transformation = transformation;
        this.transcoder = resourceTranscoder;
        this.diskCacheProvider = diskCacheProvider;
        this.diskCacheStrategy = diskCacheStrategy;
        this.priority = priority;
        this.fileOpener = fileOpener;
    }

    public Resource<Z> decodeResultFromCache() throws Exception {
        if (this.diskCacheStrategy.cacheResult()) {
            long logTime = LogTime.getLogTime();
            Resource<T> loadFromCache = loadFromCache(this.resultKey);
            if (Log.isLoggable(TAG, 2)) {
                logWithTimeAndKey("Decoded transformed from cache", logTime);
            }
            long logTime2 = LogTime.getLogTime();
            Resource<Z> transcode = transcode(loadFromCache);
            if (Log.isLoggable(TAG, 2)) {
                logWithTimeAndKey("Transcoded transformed from cache", logTime2);
            }
            return transcode;
        }
        return null;
    }

    public Resource<Z> decodeSourceFromCache() throws Exception {
        if (this.diskCacheStrategy.cacheSource()) {
            long logTime = LogTime.getLogTime();
            Resource<T> loadFromCache = loadFromCache(this.resultKey.getOriginalKey());
            if (Log.isLoggable(TAG, 2)) {
                logWithTimeAndKey("Decoded source from cache", logTime);
            }
            return transformEncodeAndTranscode(loadFromCache);
        }
        return null;
    }

    public Resource<Z> decodeFromSource() throws Exception {
        return transformEncodeAndTranscode(decodeSource());
    }

    public void cancel() {
        this.isCancelled = true;
        this.fetcher.cancel();
    }

    private Resource<Z> transformEncodeAndTranscode(Resource<T> resource) {
        long logTime = LogTime.getLogTime();
        Resource<T> transform = transform(resource);
        if (Log.isLoggable(TAG, 2)) {
            logWithTimeAndKey("Transformed resource from source", logTime);
        }
        writeTransformedToCache(transform);
        long logTime2 = LogTime.getLogTime();
        Resource<Z> transcode = transcode(transform);
        if (Log.isLoggable(TAG, 2)) {
            logWithTimeAndKey("Transcoded transformed from source", logTime2);
        }
        return transcode;
    }

    private void writeTransformedToCache(Resource<T> resource) {
        if (resource == null || !this.diskCacheStrategy.cacheResult()) {
            return;
        }
        long logTime = LogTime.getLogTime();
        this.diskCacheProvider.getDiskCache().put(this.resultKey, new SourceWriter(this.loadProvider.getEncoder(), resource));
        if (Log.isLoggable(TAG, 2)) {
            logWithTimeAndKey("Wrote transformed from source to cache", logTime);
        }
    }

    private Resource<T> decodeSource() throws Exception {
        try {
            long logTime = LogTime.getLogTime();
            A loadData = this.fetcher.loadData(this.priority);
            if (Log.isLoggable(TAG, 2)) {
                logWithTimeAndKey("Fetched data", logTime);
            }
            if (!this.isCancelled) {
                return decodeFromSourceData(loadData);
            }
            return null;
        } finally {
            this.fetcher.cleanup();
        }
    }

    private Resource<T> decodeFromSourceData(A a) throws IOException {
        if (this.diskCacheStrategy.cacheSource()) {
            return cacheAndDecodeSourceData(a);
        }
        long logTime = LogTime.getLogTime();
        Resource<T> decode = this.loadProvider.getSourceDecoder().decode(a, this.width, this.height);
        if (Log.isLoggable(TAG, 2)) {
            logWithTimeAndKey("Decoded from source", logTime);
            return decode;
        }
        return decode;
    }

    private Resource<T> cacheAndDecodeSourceData(A a) throws IOException {
        long logTime = LogTime.getLogTime();
        this.diskCacheProvider.getDiskCache().put(this.resultKey.getOriginalKey(), new SourceWriter(this.loadProvider.getSourceEncoder(), a));
        if (Log.isLoggable(TAG, 2)) {
            logWithTimeAndKey("Wrote source to cache", logTime);
        }
        long logTime2 = LogTime.getLogTime();
        Resource<T> loadFromCache = loadFromCache(this.resultKey.getOriginalKey());
        if (Log.isLoggable(TAG, 2) && loadFromCache != null) {
            logWithTimeAndKey("Decoded source from cache", logTime2);
        }
        return loadFromCache;
    }

    private Resource<T> loadFromCache(Key key) throws IOException {
        File file = this.diskCacheProvider.getDiskCache().get(key);
        if (file == null) {
            return null;
        }
        try {
            Resource<T> decode = this.loadProvider.getCacheDecoder().decode(file, this.width, this.height);
            if (decode == null) {
            }
            return decode;
        } finally {
            this.diskCacheProvider.getDiskCache().delete(key);
        }
    }

    private Resource<T> transform(Resource<T> resource) {
        if (resource == null) {
            return null;
        }
        Resource<T> transform = this.transformation.transform(resource, this.width, this.height);
        if (!resource.equals(transform)) {
            resource.recycle();
        }
        return transform;
    }

    private Resource<Z> transcode(Resource<T> resource) {
        if (resource == null) {
            return null;
        }
        return this.transcoder.transcode(resource);
    }

    private void logWithTimeAndKey(String str, long j) {
        Log.v(TAG, str + " in " + LogTime.getElapsedMillis(j) + ", key: " + this.resultKey);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class SourceWriter<DataType> implements DiskCache.Writer {
        private final DataType data;
        private final Encoder<DataType> encoder;

        public SourceWriter(Encoder<DataType> encoder, DataType datatype) {
            this.encoder = encoder;
            this.data = datatype;
        }

        @Override // com.bumptech.glide.load.engine.cache.DiskCache.Writer
        public boolean write(File file) {
            OutputStream outputStream = null;
            try {
                try {
                    outputStream = DecodeJob.this.fileOpener.open(file);
                    boolean encode = this.encoder.encode(this.data, outputStream);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                            return encode;
                        } catch (IOException unused) {
                            return encode;
                        }
                    }
                    return encode;
                } catch (FileNotFoundException e) {
                    if (Log.isLoggable(DecodeJob.TAG, 3)) {
                        Log.d(DecodeJob.TAG, "Failed to find file to write to disk cache", e);
                    }
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return false;
                }
            } catch (Throwable th) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    static class FileOpener {
        FileOpener() {
        }

        public OutputStream open(File file) throws FileNotFoundException {
            return new BufferedOutputStream(new FileOutputStream(file));
        }
    }
}
