package com.daaw;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
/* loaded from: classes.dex */
public class a31 {
    public RandomAccessFile a;
    public MappedByteBuffer b;
    public boolean c;

    public a31(File file, int i) {
        this.c = false;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.a = randomAccessFile;
        try {
            this.b = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_WRITE, 0L, i);
            this.c = true;
        } catch (IOException unused) {
            a();
        }
    }

    public static a31 b(String str, int i) {
        lz1.a("createTempFile");
        try {
            Context e = dx0.e();
            if (e != null) {
                a31 a31Var = new a31(new File(e.getCacheDir(), str), i);
                if (a31Var.c) {
                    return a31Var;
                }
                return null;
            }
        } catch (IOException unused) {
        }
        try {
            a31 a31Var2 = new a31(File.createTempFile(str, null), i);
            if (a31Var2.c) {
                return a31Var2;
            }
            return null;
        } catch (IOException unused2) {
            return null;
        }
    }

    public void a() {
        try {
            this.a.close();
        } catch (IOException unused) {
        }
    }

    public ByteBuffer c(int i) {
        this.b.position(Math.min(this.b.limit(), Math.max(0, i)));
        return this.b;
    }

    public void d(int i, ByteBuffer byteBuffer) {
        this.b.position(i);
        this.b.put(byteBuffer);
    }
}
