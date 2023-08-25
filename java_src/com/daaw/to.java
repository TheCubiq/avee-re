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
/* loaded from: classes.dex */
public class to {
    public static void a(ji1 ji1Var) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor B = ji1Var.B("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (B.moveToNext()) {
            try {
                arrayList.add(B.getString(0));
            } catch (Throwable th) {
                B.close();
                throw th;
            }
        }
        B.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                ji1Var.h("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static Cursor b(b61 b61Var, mi1 mi1Var, boolean z, CancellationSignal cancellationSignal) {
        Cursor q = b61Var.q(mi1Var, cancellationSignal);
        if (z && (q instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) q;
            int count = abstractWindowedCursor.getCount();
            return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? qn.a(abstractWindowedCursor) : q;
        }
        return q;
    }

    public static int c(File file) {
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
