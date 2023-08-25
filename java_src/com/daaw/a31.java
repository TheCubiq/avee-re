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

    /* renamed from: a */
    public RandomAccessFile f2747a;

    /* renamed from: b */
    public MappedByteBuffer f2748b;

    /* renamed from: c */
    public boolean f2749c;

    public a31(File file, int i) {
        this.f2749c = false;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.f2747a = randomAccessFile;
        try {
            this.f2748b = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_WRITE, 0L, i);
            this.f2749c = true;
        } catch (IOException unused) {
            m27724a();
        }
    }

    /* renamed from: b */
    public static a31 m27723b(String str, int i) {
        lz1.m16365a("createTempFile");
        try {
            Context m23837e = dx0.m23837e();
            if (m23837e != null) {
                a31 a31Var = new a31(new File(m23837e.getCacheDir(), str), i);
                if (a31Var.f2749c) {
                    return a31Var;
                }
                return null;
            }
        } catch (IOException unused) {
        }
        try {
            a31 a31Var2 = new a31(File.createTempFile(str, null), i);
            if (a31Var2.f2749c) {
                return a31Var2;
            }
            return null;
        } catch (IOException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public void m27724a() {
        try {
            this.f2747a.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: c */
    public ByteBuffer m27722c(int i) {
        this.f2748b.position(Math.min(this.f2748b.limit(), Math.max(0, i)));
        return this.f2748b;
    }

    /* renamed from: d */
    public void m27721d(int i, ByteBuffer byteBuffer) {
        this.f2748b.position(i);
        this.f2748b.put(byteBuffer);
    }
}
