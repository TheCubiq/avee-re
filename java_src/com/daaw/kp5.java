package com.daaw;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class kp5 {
    /* renamed from: a */
    public static int m17545a(SQLiteDatabase sQLiteDatabase, int i) {
        int i2 = 0;
        if (i == 2) {
            return 0;
        }
        Cursor m17538h = m17538h(sQLiteDatabase, i);
        if (m17538h.getCount() > 0) {
            m17538h.moveToNext();
            i2 = m17538h.getInt(m17538h.getColumnIndexOrThrow("value"));
        }
        m17538h.close();
        return i2;
    }

    /* renamed from: b */
    public static long m17544b(SQLiteDatabase sQLiteDatabase, int i) {
        long j;
        Cursor m17538h = m17538h(sQLiteDatabase, 2);
        if (m17538h.getCount() > 0) {
            m17538h.moveToNext();
            j = m17538h.getLong(m17538h.getColumnIndexOrThrow("value"));
        } else {
            j = 0;
        }
        m17538h.close();
        return j;
    }

    /* renamed from: c */
    public static ArrayList m17543c(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(t63.m9505V(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (xs7 e) {
                k04.zzg("Unable to deserialize proto from offline signals database:");
                k04.zzg(e.getMessage());
            }
        }
        query.close();
        return arrayList;
    }

    /* renamed from: d */
    public static void m17542d(SQLiteDatabase sQLiteDatabase, long j, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    /* renamed from: e */
    public static void m17541e(SQLiteDatabase sQLiteDatabase) {
        m17537i(sQLiteDatabase, "failed_requests", 0);
        m17537i(sQLiteDatabase, "total_requests", 0);
        m17537i(sQLiteDatabase, "completed_requests", 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", "last_successful_request_time");
        contentValues.put("value", (Long) 0L);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    /* renamed from: f */
    public static void m17540f(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        m17536j(sQLiteDatabase, "failed_requests", 0);
        m17536j(sQLiteDatabase, "total_requests", 0);
        m17536j(sQLiteDatabase, "completed_requests", 0);
    }

    /* renamed from: g */
    public static void m17539g(SQLiteDatabase sQLiteDatabase, boolean z, boolean z2) {
        String format;
        if (z2) {
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "completed_requests"));
            if (z) {
                return;
            }
            format = String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests");
        } else {
            format = String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests");
        }
        sQLiteDatabase.execSQL(format);
    }

    /* renamed from: h */
    public static Cursor m17538h(SQLiteDatabase sQLiteDatabase, int i) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i == 0) {
            strArr2[0] = "failed_requests";
        } else if (i == 1) {
            strArr2[0] = "total_requests";
        } else if (i != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    /* renamed from: i */
    public static void m17537i(SQLiteDatabase sQLiteDatabase, String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    /* renamed from: j */
    public static void m17536j(SQLiteDatabase sQLiteDatabase, String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }
}
