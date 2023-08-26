package com.daaw.avee.Common;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import com.daaw.avee.PlayerCore;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
/* loaded from: classes.dex */
public class DbgFile {
    public RandomAccessFileTh rfile;

    public DbgFile(int i, String str) {
        try {
            Context appContext = PlayerCore.s().getAppContext();
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            tlog.d("canonical path: " + externalStoragePublicDirectory.getCanonicalPath());
            File file = new File(externalStoragePublicDirectory, str);
            this.rfile = new RandomAccessFileTh(file, i);
            appContext.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file)));
        } catch (IOException unused) {
        }
    }

    public void write(short s) {
        this.rfile.getBuffer().putShort(s);
    }

    public void write(ByteBuffer byteBuffer) {
        this.rfile.writeDataSrcFromStart(byteBuffer);
    }

    public void write(ByteBuffer byteBuffer, int i) {
        this.rfile.writeDataSized(byteBuffer, i);
    }

    public void write(ISimpleListShort iSimpleListShort) {
        int size = iSimpleListShort.size();
        short[] sArr = new short[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            sArr[i2] = iSimpleListShort.get(i2);
        }
        MappedByteBuffer buffer = this.rfile.getBuffer();
        int min = Math.min(buffer.capacity() / 2, size);
        int capacity = buffer.capacity() / 2;
        if (buffer.order() == ByteOrder.LITTLE_ENDIAN) {
            while (i < min) {
                short s = sArr[i];
                buffer.put((byte) (s & 255));
                buffer.put((byte) ((s & 65280) >> 8));
                i++;
            }
            return;
        }
        while (i < min) {
            short s2 = sArr[i];
            buffer.put((byte) ((s2 & 65280) >> 8));
            buffer.put((byte) (s2 & 255));
            i++;
        }
    }
}
