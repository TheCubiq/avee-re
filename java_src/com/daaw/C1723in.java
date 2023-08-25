package com.daaw;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
/* renamed from: com.daaw.in */
/* loaded from: classes2.dex */
public class C1723in {

    /* renamed from: a */
    public final FileChannel f13799a;

    /* renamed from: b */
    public final FileLock f13800b;

    public C1723in(FileChannel fileChannel, FileLock fileLock) {
        this.f13799a = fileChannel;
        this.f13800b = fileLock;
    }

    /* renamed from: a */
    public static C1723in m19627a(Context context, String str) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), str), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
            } catch (IOException | Error | OverlappingFileLockException unused) {
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException unused2) {
            fileChannel = null;
            fileLock = null;
        }
        try {
            return new C1723in(fileChannel, fileLock);
        } catch (IOException | Error | OverlappingFileLockException unused3) {
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException unused4) {
                }
            }
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused5) {
                }
            }
            return null;
        }
    }

    /* renamed from: b */
    public void m19626b() {
        try {
            this.f13800b.release();
            this.f13799a.close();
        } catch (IOException unused) {
        }
    }
}
