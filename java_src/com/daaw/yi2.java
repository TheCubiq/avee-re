package com.daaw;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;
/* loaded from: classes2.dex */
public final class yi2 {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r0 == false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.daaw.om5 r14, android.database.sqlite.SQLiteDatabase r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String[] r19) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.yi2.a(com.daaw.om5, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    public static void b(om5 om5Var, SQLiteDatabase sQLiteDatabase) {
        if (om5Var == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            om5Var.w().a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            om5Var.w().a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            om5Var.w().a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        om5Var.w().a("Failed to turn on database write permission for owner");
    }
}
