package com.daaw;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
/* renamed from: com.daaw.to */
/* loaded from: classes.dex */
public class C3104to {
    /* renamed from: a */
    public static void m8951a(ji1 ji1Var) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor mo18504B = ji1Var.mo18504B("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (mo18504B.moveToNext()) {
            try {
                arrayList.add(mo18504B.getString(0));
            } catch (Throwable th) {
                mo18504B.close();
                throw th;
            }
        }
        mo18504B.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                ji1Var.mo18496h("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    /* renamed from: b */
    public static Cursor m8950b(b61 b61Var, mi1 mi1Var, boolean z, CancellationSignal cancellationSignal) {
        Cursor m26467q = b61Var.m26467q(mi1Var, cancellationSignal);
        if (z && (m26467q instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) m26467q;
            int count = abstractWindowedCursor.getCount();
            return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? C2742qn.m12328a(abstractWindowedCursor) : m26467q;
        }
        return m26467q;
    }

    /* renamed from: c */
    public static int m8949c(File file) {
        FileChannel fileChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) == 4) {
                allocate.rewind();
                int i = allocate.getInt();
                channel.close();
                return i;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th) {
            if (0 != 0) {
                fileChannel.close();
            }
            throw th;
        }
    }
}
