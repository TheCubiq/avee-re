package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ReusableBufferedOutputStream;
import com.google.android.exoplayer2.util.Util;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes.dex */
public final class CacheDataSink implements DataSink {
    public static final int DEFAULT_BUFFER_SIZE = 20480;
    private final int bufferSize;
    private ReusableBufferedOutputStream bufferedOutputStream;
    private final Cache cache;
    private DataSpec dataSpec;
    private long dataSpecBytesWritten;
    private File file;
    private final long maxCacheFileSize;
    private OutputStream outputStream;
    private long outputStreamBytesWritten;
    private final boolean syncFileDescriptor;
    private FileOutputStream underlyingFileOutputStream;

    /* loaded from: classes.dex */
    public static class CacheDataSinkException extends Cache.CacheException {
        public CacheDataSinkException(IOException iOException) {
            super(iOException);
        }
    }

    public CacheDataSink(Cache cache, long j) {
        this(cache, j, DEFAULT_BUFFER_SIZE, true);
    }

    public CacheDataSink(Cache cache, long j, boolean z) {
        this(cache, j, DEFAULT_BUFFER_SIZE, z);
    }

    public CacheDataSink(Cache cache, long j, int i) {
        this(cache, j, i, true);
    }

    public CacheDataSink(Cache cache, long j, int i, boolean z) {
        this.cache = (Cache) Assertions.checkNotNull(cache);
        this.maxCacheFileSize = j;
        this.bufferSize = i;
        this.syncFileDescriptor = z;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void open(DataSpec dataSpec) throws CacheDataSinkException {
        if (dataSpec.length == -1 && !dataSpec.isFlagSet(2)) {
            this.dataSpec = null;
            return;
        }
        this.dataSpec = dataSpec;
        this.dataSpecBytesWritten = 0L;
        try {
            openNextOutputStream();
        } catch (IOException e) {
            throw new CacheDataSinkException(e);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void write(byte[] bArr, int i, int i2) throws CacheDataSinkException {
        if (this.dataSpec == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.outputStreamBytesWritten == this.maxCacheFileSize) {
                    closeCurrentOutputStream();
                    openNextOutputStream();
                }
                int min = (int) Math.min(i2 - i3, this.maxCacheFileSize - this.outputStreamBytesWritten);
                this.outputStream.write(bArr, i + i3, min);
                i3 += min;
                long j = min;
                this.outputStreamBytesWritten += j;
                this.dataSpecBytesWritten += j;
            } catch (IOException e) {
                throw new CacheDataSinkException(e);
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void close() throws CacheDataSinkException {
        if (this.dataSpec == null) {
            return;
        }
        try {
            closeCurrentOutputStream();
        } catch (IOException e) {
            throw new CacheDataSinkException(e);
        }
    }

    private void openNextOutputStream() throws IOException {
        this.file = this.cache.startFile(this.dataSpec.key, this.dataSpecBytesWritten + this.dataSpec.absoluteStreamPosition, this.dataSpec.length == -1 ? this.maxCacheFileSize : Math.min(this.dataSpec.length - this.dataSpecBytesWritten, this.maxCacheFileSize));
        FileOutputStream fileOutputStream = new FileOutputStream(this.file);
        this.underlyingFileOutputStream = fileOutputStream;
        if (this.bufferSize > 0) {
            ReusableBufferedOutputStream reusableBufferedOutputStream = this.bufferedOutputStream;
            if (reusableBufferedOutputStream == null) {
                this.bufferedOutputStream = new ReusableBufferedOutputStream(this.underlyingFileOutputStream, this.bufferSize);
            } else {
                reusableBufferedOutputStream.reset(fileOutputStream);
            }
            this.outputStream = this.bufferedOutputStream;
        } else {
            this.outputStream = fileOutputStream;
        }
        this.outputStreamBytesWritten = 0L;
    }

    private void closeCurrentOutputStream() throws IOException {
        OutputStream outputStream = this.outputStream;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            if (this.syncFileDescriptor) {
                this.underlyingFileOutputStream.getFD().sync();
            }
            Util.closeQuietly(this.outputStream);
            this.outputStream = null;
            File file = this.file;
            this.file = null;
            this.cache.commitFile(file);
        } catch (Throwable th) {
            Util.closeQuietly(this.outputStream);
            this.outputStream = null;
            File file2 = this.file;
            this.file = null;
            file2.delete();
            throw th;
        }
    }
}
