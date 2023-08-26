package com.daaw.avee.Common;

import android.content.Context;
import com.daaw.avee.PlayerCore;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
/* loaded from: classes.dex */
public class RandomAccessFileTh {
    RandomAccessFile file;
    MappedByteBuffer mapped;
    boolean valid;

    public static RandomAccessFileTh createTemp(String str, int i) {
        tlog.d("createTempFile");
        try {
            Context appContext = PlayerCore.s().getAppContext();
            if (appContext != null) {
                RandomAccessFileTh randomAccessFileTh = new RandomAccessFileTh(new File(appContext.getCacheDir(), str), i);
                if (randomAccessFileTh.valid) {
                    return randomAccessFileTh;
                }
                return null;
            }
        } catch (IOException unused) {
        }
        try {
            RandomAccessFileTh randomAccessFileTh2 = new RandomAccessFileTh(File.createTempFile(str, null), i);
            if (randomAccessFileTh2.valid) {
                return randomAccessFileTh2;
            }
            return null;
        } catch (IOException unused2) {
            return null;
        }
    }

    public RandomAccessFileTh(File file, int i) throws FileNotFoundException {
        this.valid = false;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.file = randomAccessFile;
        try {
            this.mapped = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_WRITE, 0L, i);
            this.valid = true;
        } catch (IOException unused) {
            close();
        }
    }

    public void close() {
        try {
            this.file.close();
        } catch (IOException unused) {
        }
    }

    public void writeData(int i, byte[] bArr) {
        this.mapped.position(i);
        this.mapped.put(bArr);
    }

    public MappedByteBuffer getBuffer() {
        return this.mapped;
    }

    public void writeDataSrcFromStart(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        byteBuffer.position(0);
        this.mapped.put(byteBuffer);
        byteBuffer.position(position);
    }

    public void writeDataSized(ByteBuffer byteBuffer, int i) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        byteBuffer.limit(i + position);
        this.mapped.put(byteBuffer);
        byteBuffer.position(position);
        byteBuffer.limit(limit);
    }

    public void writeData(int i, ByteBuffer byteBuffer) {
        this.mapped.position(i);
        this.mapped.put(byteBuffer);
    }

    public void readData(int i, byte[] bArr, int i2, int i3) {
        this.mapped.position(i);
        this.mapped.get(bArr, i2, i3);
    }

    public ByteBuffer readAsByteBufferNotThSafe(int i) {
        this.mapped.position(Math.min(this.mapped.limit(), Math.max(0, i)));
        return this.mapped;
    }
}
