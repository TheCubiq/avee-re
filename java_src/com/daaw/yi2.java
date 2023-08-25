package com.daaw;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
/* loaded from: classes2.dex */
public final class yi2 {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r0 == false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m3725a(om5 om5Var, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        Cursor cursor;
        String[] split;
        if (om5Var == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Cursor cursor2 = null;
        try {
            cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
        } catch (SQLiteException e) {
            e = e;
            cursor = null;
        } catch (Throwable th) {
            th = th;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        try {
            try {
                boolean moveToFirst = cursor.moveToFirst();
                cursor.close();
            } catch (SQLiteException e2) {
                e = e2;
                om5Var.m14155w().m20651c("Error querying for table", str, e);
                if (cursor != null) {
                    cursor.close();
                }
                sQLiteDatabase.execSQL(str2);
                try {
                    HashSet hashSet = new HashSet();
                    Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
                    Collections.addAll(hashSet, rawQuery.getColumnNames());
                    rawQuery.close();
                    for (String str4 : str3.split(",")) {
                        if (!hashSet.remove(str4)) {
                            throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                        }
                    }
                    if (strArr != null) {
                        for (int i = 0; i < strArr.length; i += 2) {
                            if (!hashSet.remove(strArr[i])) {
                                sQLiteDatabase.execSQL(strArr[i + 1]);
                            }
                        }
                    }
                    if (hashSet.isEmpty()) {
                        return;
                    }
                    om5Var.m14155w().m20651c("Table has extra columns. table, columns", str, TextUtils.join(", ", hashSet));
                } catch (SQLiteException e3) {
                    om5Var.m14160q().m20652b("Failed to verify columns on table that was just created", str);
                    throw e3;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cursor2 = cursor;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    /* renamed from: b */
    public static void m3724b(om5 om5Var, SQLiteDatabase sQLiteDatabase) {
        if (om5Var == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            om5Var.m14155w().m20653a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            om5Var.m14155w().m20653a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            om5Var.m14155w().m20653a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        om5Var.m14155w().m20653a("Failed to turn on database write permission for owner");
    }
}
