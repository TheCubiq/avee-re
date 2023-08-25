package com.daaw;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public final class uh2 extends pa8 {

    /* renamed from: f */
    public static final String[] f29069f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g */
    public static final String[] f29070g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h */
    public static final String[] f29071h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"};

    /* renamed from: i */
    public static final String[] f29072i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j */
    public static final String[] f29073j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k */
    public static final String[] f29074k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l */
    public static final String[] f29075l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m */
    public static final String[] f29076m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d */
    public final pg2 f29077d;

    /* renamed from: e */
    public final fa8 f29078e;

    public uh2(yb8 yb8Var) {
        super(yb8Var);
        this.f29078e = new fa8(this.f25143a.mo3909b());
        this.f25143a.m24020z();
        this.f29077d = new pg2(this, this.f25143a.mo3905d(), "google_app_measurement.db");
    }

    /* renamed from: H */
    public static final void m8176H(ContentValues contentValues, String str, Object obj) {
        ry0.m10834f("value");
        ry0.m10830j(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (!(obj instanceof Double)) {
            throw new IllegalArgumentException("Invalid value type");
        } else {
            contentValues.put("value", (Double) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0229: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:101:0x0229 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* renamed from: G */
    public final void m8177G(String str, long j, long j2, qb8 qb8Var) {
        ?? r4;
        Cursor cursor;
        Cursor rawQuery;
        String string;
        String str2;
        String[] strArr;
        ry0.m10830j(qb8Var);
        mo6991f();
        m13533g();
        Cursor cursor2 = null;
        r3 = null;
        r3 = null;
        String str3 = null;
        try {
            try {
                SQLiteDatabase m8168P = m8168P();
                r4 = TextUtils.isEmpty(null);
                try {
                    if (r4 != 0) {
                        rawQuery = m8168P.rawQuery("select app_id, metadata_fingerprint from raw_events where " + (j2 != -1 ? "rowid <= ? and " : "") + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", j2 != -1 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)});
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        }
                        str3 = rawQuery.getString(0);
                        string = rawQuery.getString(1);
                        rawQuery.close();
                    } else {
                        rawQuery = m8168P.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + (j2 != -1 ? " and rowid <= ?" : "") + " order by rowid limit 1;", j2 != -1 ? new String[]{null, String.valueOf(j2)} : new String[]{null});
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        } else {
                            string = rawQuery.getString(0);
                            rawQuery.close();
                        }
                    }
                    Cursor cursor3 = rawQuery;
                    String str4 = string;
                    try {
                        Cursor query = m8168P.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, str4}, null, null, "rowid", "2");
                        try {
                            if (!query.moveToFirst()) {
                                this.f25143a.mo3895i().m14160q().m20652b("Raw event metadata record is missing. appId", om5.m14152z(str3));
                                query.close();
                                return;
                            }
                            try {
                                try {
                                    j47 j47Var = (j47) ((g37) ec8.m23601C(j47.m19043O1(), query.getBlob(0))).m3975m();
                                    if (query.moveToNext()) {
                                        this.f25143a.mo3895i().m14155w().m20652b("Get multiple raw event metadata records, expected one. appId", om5.m14152z(str3));
                                    }
                                    query.close();
                                    ry0.m10830j(j47Var);
                                    qb8Var.f23846a = j47Var;
                                    if (j2 != -1) {
                                        str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr = new String[]{str3, str4, String.valueOf(j2)};
                                    } else {
                                        str2 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr = new String[]{str3, str4};
                                    }
                                    Cursor query2 = m8168P.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str2, strArr, null, null, "rowid", null);
                                    if (!query2.moveToFirst()) {
                                        this.f25143a.mo3895i().m14155w().m20652b("Raw event data disappeared while in transaction. appId", om5.m14152z(str3));
                                        query2.close();
                                        return;
                                    }
                                    do {
                                        long j3 = query2.getLong(0);
                                        try {
                                            fs6 fs6Var = (fs6) ec8.m23601C(it6.m19365H(), query2.getBlob(3));
                                            fs6Var.m22336A(query2.getString(1));
                                            fs6Var.m22332E(query2.getLong(2));
                                            if (!qb8Var.m12630a(j3, (it6) fs6Var.m3975m())) {
                                                query2.close();
                                                return;
                                            }
                                        } catch (IOException e) {
                                            this.f25143a.mo3895i().m14160q().m20651c("Data loss. Failed to merge raw event. appId", om5.m14152z(str3), e);
                                        }
                                    } while (query2.moveToNext());
                                    query2.close();
                                } catch (IOException e2) {
                                    this.f25143a.mo3895i().m14160q().m20651c("Data loss. Failed to merge raw event metadata. appId", om5.m14152z(str3), e2);
                                    query.close();
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                r4 = query;
                                this.f25143a.mo3895i().m14160q().m20651c("Data loss. Error selecting raw event. appId", om5.m14152z(str3), e);
                                if (r4 != 0) {
                                    r4.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = query;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        r4 = cursor3;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor2 = cursor3;
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                }
            } catch (Throwable th4) {
                th = th4;
                cursor2 = cursor;
            }
        } catch (SQLiteException e7) {
            e = e7;
            r4 = 0;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* renamed from: I */
    public final long m8175I(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = m8168P().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    rawQuery.close();
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                this.f25143a.mo3895i().m14160q().m20651c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: J */
    public final int m8174J(String str, String str2) {
        ry0.m10834f(str);
        ry0.m10834f(str2);
        mo6991f();
        m13533g();
        try {
            return m8168P().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.f25143a.mo3895i().m14160q().m20650d("Error deleting conditional property", om5.m14152z(str), this.f25143a.m24055D().m5131f(str2), e);
            return 0;
        }
    }

    /* renamed from: K */
    public final long m8173K(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = m8168P().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return j;
                }
                long j2 = cursor.getLong(0);
                cursor.close();
                return j2;
            } catch (SQLiteException e) {
                this.f25143a.mo3895i().m14160q().m20651c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: L */
    public final long m8172L(String str, String str2) {
        ry0.m10834f(str);
        ry0.m10834f("first_open_count");
        mo6991f();
        m13533g();
        SQLiteDatabase m8168P = m8168P();
        m8168P.beginTransaction();
        long j = 0;
        try {
            try {
                long m8173K = m8173K("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (m8173K == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (m8168P.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        this.f25143a.mo3895i().m14160q().m20651c("Failed to insert column (got -1). appId", om5.m14152z(str), "first_open_count");
                        return -1L;
                    }
                    m8173K = 0;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", Long.valueOf(1 + m8173K));
                    if (m8168P.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        this.f25143a.mo3895i().m14160q().m20651c("Failed to update column (got 0). appId", om5.m14152z(str), "first_open_count");
                        return -1L;
                    }
                    m8168P.setTransactionSuccessful();
                    return m8173K;
                } catch (SQLiteException e) {
                    e = e;
                    j = m8173K;
                    this.f25143a.mo3895i().m14160q().m20650d("Error inserting column. appId", om5.m14152z(str), "first_open_count", e);
                    m8168P.endTransaction();
                    return j;
                }
            } catch (SQLiteException e2) {
                e = e2;
            }
        } finally {
            m8168P.endTransaction();
        }
    }

    /* renamed from: M */
    public final long m8171M() {
        return m8173K("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /* renamed from: N */
    public final long m8170N() {
        return m8173K("select max(timestamp) from raw_events", null, 0L);
    }

    /* renamed from: O */
    public final long m8169O(String str) {
        ry0.m10834f(str);
        return m8173K("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* renamed from: P */
    public final SQLiteDatabase m8168P() {
        mo6991f();
        try {
            return this.f29077d.getWritableDatabase();
        } catch (SQLiteException e) {
            this.f25143a.mo3895i().m14155w().m20652b("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00d6: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:44:0x00d6 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle m8167Q(String str) {
        Cursor cursor;
        Cursor cursor2;
        mo6991f();
        m13533g();
        Cursor cursor3 = null;
        try {
            try {
                cursor = m8168P().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (!cursor.moveToFirst()) {
                        this.f25143a.mo3895i().m14156v().m20653a("Default event parameters not found");
                        cursor.close();
                        return null;
                    }
                    try {
                        it6 it6Var = (it6) ((fs6) ec8.m23601C(it6.m19365H(), cursor.getBlob(0))).m3975m();
                        this.f19771b.m3898g0();
                        List<ix6> m19361L = it6Var.m19361L();
                        Bundle bundle = new Bundle();
                        for (ix6 ix6Var : m19361L) {
                            String m19286J = ix6Var.m19286J();
                            if (ix6Var.m19273W()) {
                                bundle.putDouble(m19286J, ix6Var.m19292D());
                            } else if (ix6Var.m19272X()) {
                                bundle.putFloat(m19286J, ix6Var.m19291E());
                            } else if (ix6Var.m19269a0()) {
                                bundle.putString(m19286J, ix6Var.m19285K());
                            } else if (ix6Var.m19271Y()) {
                                bundle.putLong(m19286J, ix6Var.m19289G());
                            }
                        }
                        cursor.close();
                        return bundle;
                    } catch (IOException e) {
                        this.f25143a.mo3895i().m14160q().m20651c("Failed to retrieve default event parameters. appId", om5.m14152z(str), e);
                        cursor.close();
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    this.f25143a.mo3895i().m14160q().m20652b("Error selecting default event parameters", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011d A[Catch: SQLiteException -> 0x01d9, all -> 0x01f8, TryCatch #0 {SQLiteException -> 0x01d9, blocks: (B:4:0x0061, B:8:0x006b, B:10:0x00ce, B:15:0x00d8, B:19:0x0122, B:21:0x0151, B:25:0x0159, B:29:0x0174, B:31:0x017f, B:32:0x0191, B:34:0x01a2, B:36:0x01b0, B:37:0x01b9, B:39:0x01c2, B:28:0x0170, B:18:0x011d), top: B:57:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0170 A[Catch: SQLiteException -> 0x01d9, all -> 0x01f8, TryCatch #0 {SQLiteException -> 0x01d9, blocks: (B:4:0x0061, B:8:0x006b, B:10:0x00ce, B:15:0x00d8, B:19:0x0122, B:21:0x0151, B:25:0x0159, B:29:0x0174, B:31:0x017f, B:32:0x0191, B:34:0x01a2, B:36:0x01b0, B:37:0x01b9, B:39:0x01c2, B:28:0x0170, B:18:0x011d), top: B:57:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017f A[Catch: SQLiteException -> 0x01d9, all -> 0x01f8, TryCatch #0 {SQLiteException -> 0x01d9, blocks: (B:4:0x0061, B:8:0x006b, B:10:0x00ce, B:15:0x00d8, B:19:0x0122, B:21:0x0151, B:25:0x0159, B:29:0x0174, B:31:0x017f, B:32:0x0191, B:34:0x01a2, B:36:0x01b0, B:37:0x01b9, B:39:0x01c2, B:28:0x0170, B:18:0x011d), top: B:57:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c2 A[Catch: SQLiteException -> 0x01d9, all -> 0x01f8, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x01d9, blocks: (B:4:0x0061, B:8:0x006b, B:10:0x00ce, B:15:0x00d8, B:19:0x0122, B:21:0x0151, B:25:0x0159, B:29:0x0174, B:31:0x017f, B:32:0x0191, B:34:0x01a2, B:36:0x01b0, B:37:0x01b9, B:39:0x01c2, B:28:0x0170, B:18:0x011d), top: B:57:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fc  */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qu7 m8166R(String str) {
        Cursor cursor;
        boolean z;
        ry0.m10834f(str);
        mo6991f();
        m13533g();
        Cursor cursor2 = null;
        try {
            boolean z2 = true;
            cursor = m8168P().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return null;
                    }
                    qu7 qu7Var = new qu7(this.f19771b.m3906c0(), str);
                    qu7Var.m12162h(cursor.getString(0));
                    qu7Var.m12144w(cursor.getString(1));
                    qu7Var.m12197F(cursor.getString(2));
                    qu7Var.m12201B(cursor.getLong(3));
                    qu7Var.m12200C(cursor.getLong(4));
                    qu7Var.m12141z(cursor.getLong(5));
                    qu7Var.m12158j(cursor.getString(6));
                    qu7Var.m12160i(cursor.getString(7));
                    qu7Var.m12143x(cursor.getLong(8));
                    qu7Var.m12148s(cursor.getLong(9));
                    if (!cursor.isNull(10) && cursor.getInt(10) == 0) {
                        z = false;
                        qu7Var.m12199D(z);
                        qu7Var.m12149r(cursor.getLong(11));
                        qu7Var.m12151p(cursor.getLong(12));
                        qu7Var.m12152o(cursor.getLong(13));
                        qu7Var.m12154m(cursor.getLong(14));
                        qu7Var.m12155l(cursor.getLong(15));
                        qu7Var.m12146u(cursor.getLong(16));
                        qu7Var.m12156k(!cursor.isNull(17) ? -2147483648L : cursor.getInt(17));
                        qu7Var.m12145v(cursor.getString(18));
                        qu7Var.m12153n(cursor.getLong(19));
                        qu7Var.m12150q(cursor.getLong(20));
                        qu7Var.m12142y(cursor.getString(21));
                        if (!cursor.isNull(23) && cursor.getInt(23) == 0) {
                            z2 = false;
                        }
                        qu7Var.m12164g(z2);
                        qu7Var.m12166f(cursor.getString(24));
                        qu7Var.m12147t(!cursor.isNull(25) ? 0L : cursor.getLong(25));
                        if (!cursor.isNull(26)) {
                            qu7Var.m12196G(Arrays.asList(cursor.getString(26).split(",", -1)));
                        }
                        zm8.m2111b();
                        if (this.f25143a.m24020z().m12677B(null, m75.f18546n0) && this.f25143a.m24020z().m12677B(str, m75.f18550p0)) {
                            qu7Var.m12195H(cursor.getString(28));
                        }
                        qu7Var.m12170d();
                        if (cursor.moveToNext()) {
                            this.f25143a.mo3895i().m14160q().m20652b("Got multiple records for app, expected one. appId", om5.m14152z(str));
                        }
                        cursor.close();
                        return qu7Var;
                    }
                    z = true;
                    qu7Var.m12199D(z);
                    qu7Var.m12149r(cursor.getLong(11));
                    qu7Var.m12151p(cursor.getLong(12));
                    qu7Var.m12152o(cursor.getLong(13));
                    qu7Var.m12154m(cursor.getLong(14));
                    qu7Var.m12155l(cursor.getLong(15));
                    qu7Var.m12146u(cursor.getLong(16));
                    qu7Var.m12156k(!cursor.isNull(17) ? -2147483648L : cursor.getInt(17));
                    qu7Var.m12145v(cursor.getString(18));
                    qu7Var.m12153n(cursor.getLong(19));
                    qu7Var.m12150q(cursor.getLong(20));
                    qu7Var.m12142y(cursor.getString(21));
                    if (!cursor.isNull(23)) {
                        z2 = false;
                    }
                    qu7Var.m12164g(z2);
                    qu7Var.m12166f(cursor.getString(24));
                    qu7Var.m12147t(!cursor.isNull(25) ? 0L : cursor.getLong(25));
                    if (!cursor.isNull(26)) {
                    }
                    zm8.m2111b();
                    if (this.f25143a.m24020z().m12677B(null, m75.f18546n0)) {
                        qu7Var.m12195H(cursor.getString(28));
                    }
                    qu7Var.m12170d();
                    if (cursor.moveToNext()) {
                    }
                    cursor.close();
                    return qu7Var;
                } catch (SQLiteException e) {
                    e = e;
                    this.f25143a.mo3895i().m14160q().m20651c("Error querying app. appId", om5.m14152z(str), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0123: MOVE  (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:31:0x0123 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0126  */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzac m8165S(String str, String str2) {
        Cursor cursor;
        Cursor cursor2;
        ry0.m10834f(str);
        ry0.m10834f(str2);
        mo6991f();
        m13533g();
        Cursor cursor3 = null;
        try {
            try {
                cursor = m8168P().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return null;
                    }
                    String string = cursor.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str3 = string;
                    Object m8159Y = m8159Y(cursor, 1);
                    boolean z = cursor.getInt(2) != 0;
                    String string2 = cursor.getString(3);
                    long j = cursor.getLong(4);
                    ec8 m3898g0 = this.f19771b.m3898g0();
                    byte[] blob = cursor.getBlob(5);
                    Parcelable.Creator<zzaw> creator = zzaw.CREATOR;
                    zzac zzacVar = new zzac(str, str3, new zzkw(str2, cursor.getLong(8), m8159Y, str3), cursor.getLong(6), z, string2, (zzaw) m3898g0.m23574z(blob, creator), j, (zzaw) this.f19771b.m3898g0().m23574z(cursor.getBlob(7), creator), cursor.getLong(9), (zzaw) this.f19771b.m3898g0().m23574z(cursor.getBlob(10), creator));
                    if (cursor.moveToNext()) {
                        this.f25143a.mo3895i().m14160q().m20651c("Got multiple records for conditional property, expected one", om5.m14152z(str), this.f25143a.m24055D().m5131f(str2));
                    }
                    cursor.close();
                    return zzacVar;
                } catch (SQLiteException e) {
                    e = e;
                    this.f25143a.mo3895i().m14160q().m20650d("Error querying conditional property", om5.m14152z(str), this.f25143a.m24055D().m5131f(str2), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
    }

    /* renamed from: T */
    public final kf2 m8164T(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return m8163U(j, str, 1L, false, false, z3, false, z5);
    }

    /* renamed from: U */
    public final kf2 m8163U(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        ry0.m10834f(str);
        mo6991f();
        m13533g();
        String[] strArr = {str};
        kf2 kf2Var = new kf2();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase m8168P = m8168P();
                Cursor query = m8168P.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    this.f25143a.mo3895i().m14155w().m20652b("Not updating daily counts, app is not known. appId", om5.m14152z(str));
                    query.close();
                    return kf2Var;
                }
                if (query.getLong(0) == j) {
                    kf2Var.f16342b = query.getLong(1);
                    kf2Var.f16341a = query.getLong(2);
                    kf2Var.f16343c = query.getLong(3);
                    kf2Var.f16344d = query.getLong(4);
                    kf2Var.f16345e = query.getLong(5);
                }
                if (z) {
                    kf2Var.f16342b += j2;
                }
                if (z2) {
                    kf2Var.f16341a += j2;
                }
                if (z3) {
                    kf2Var.f16343c += j2;
                }
                if (z4) {
                    kf2Var.f16344d += j2;
                }
                if (z5) {
                    kf2Var.f16345e += j2;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j));
                contentValues.put("daily_public_events_count", Long.valueOf(kf2Var.f16341a));
                contentValues.put("daily_events_count", Long.valueOf(kf2Var.f16342b));
                contentValues.put("daily_conversions_count", Long.valueOf(kf2Var.f16343c));
                contentValues.put("daily_error_events_count", Long.valueOf(kf2Var.f16344d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(kf2Var.f16345e));
                m8168P.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return kf2Var;
            } catch (SQLiteException e) {
                this.f25143a.mo3895i().m14160q().m20651c("Error updating daily counts. appId", om5.m14152z(str), e);
                if (0 != 0) {
                    cursor.close();
                }
                return kf2Var;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final to2 m8162V(String str, String str2) {
        Cursor cursor;
        Cursor cursor2;
        Boolean bool;
        ry0.m10834f(str);
        ry0.m10834f(str2);
        mo6991f();
        m13533g();
        Cursor cursor3 = null;
        try {
            Cursor query = m8168P().query("events", (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                if (!query.moveToFirst()) {
                    query.close();
                    return null;
                }
                long j = query.getLong(0);
                long j2 = query.getLong(1);
                long j3 = query.getLong(2);
                long j4 = query.isNull(3) ? 0L : query.getLong(3);
                Long valueOf = query.isNull(4) ? null : Long.valueOf(query.getLong(4));
                Long valueOf2 = query.isNull(5) ? null : Long.valueOf(query.getLong(5));
                Long valueOf3 = query.isNull(6) ? null : Long.valueOf(query.getLong(6));
                if (query.isNull(7)) {
                    bool = null;
                } else {
                    bool = Boolean.valueOf(query.getLong(7) == 1);
                }
                cursor2 = query;
                try {
                    to2 to2Var = new to2(str, str2, j, j2, query.isNull(8) ? 0L : query.getLong(8), j3, j4, valueOf, valueOf2, valueOf3, bool);
                    if (cursor2.moveToNext()) {
                        this.f25143a.mo3895i().m14160q().m20652b("Got multiple records for event aggregates, expected one. appId", om5.m14152z(str));
                    }
                    cursor2.close();
                    return to2Var;
                } catch (SQLiteException e) {
                    e = e;
                    cursor = cursor2;
                    try {
                        this.f25143a.mo3895i().m14160q().m20650d("Error querying events. appId", om5.m14152z(str), this.f25143a.m24055D().m5133d(str2), e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        cursor3 = cursor;
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor3 = cursor2;
                    if (cursor3 != null) {
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursor2 = query;
            } catch (Throwable th3) {
                th = th3;
                cursor2 = query;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00a3: MOVE  (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:28:0x00a3 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mc8 m8160X(String str, String str2) {
        Cursor cursor;
        Cursor cursor2;
        ry0.m10834f(str);
        ry0.m10834f(str2);
        mo6991f();
        m13533g();
        Cursor cursor3 = null;
        try {
            try {
                cursor = m8168P().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return null;
                    }
                    long j = cursor.getLong(0);
                    Object m8159Y = m8159Y(cursor, 1);
                    if (m8159Y == null) {
                        cursor.close();
                        return null;
                    }
                    mc8 mc8Var = new mc8(str, cursor.getString(2), str2, j, m8159Y);
                    if (cursor.moveToNext()) {
                        this.f25143a.mo3895i().m14160q().m20652b("Got multiple records for user property, expected one. appId", om5.m14152z(str));
                    }
                    cursor.close();
                    return mc8Var;
                } catch (SQLiteException e) {
                    e = e;
                    this.f25143a.mo3895i().m14160q().m20650d("Error querying user property. appId", om5.m14152z(str), this.f25143a.m24055D().m5131f(str2), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
    }

    /* renamed from: Y */
    public final Object m8159Y(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            this.f25143a.mo3895i().m14160q().m20653a("Loaded invalid null value from database");
            return null;
        } else if (type != 1) {
            if (type != 2) {
                if (type != 3) {
                    if (type != 4) {
                        this.f25143a.mo3895i().m14160q().m20652b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                        return null;
                    }
                    this.f25143a.mo3895i().m14160q().m20653a("Loaded invalid blob type value, ignoring it");
                    return null;
                }
                return cursor.getString(i);
            }
            return Double.valueOf(cursor.getDouble(i));
        } else {
            return Long.valueOf(cursor.getLong(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m8158Z() {
        SQLiteException e;
        Cursor cursor;
        SQLiteDatabase m8168P = m8168P();
        ?? r1 = 0;
        try {
            try {
                cursor = m8168P.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return null;
                    }
                    String string = cursor.getString(0);
                    cursor.close();
                    return string;
                } catch (SQLiteException e2) {
                    e = e2;
                    this.f25143a.mo3895i().m14160q().m20652b("Database error getting next bundle app id", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                r1 = m8168P;
                th = th;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
            }
            throw th;
        }
    }

    /* renamed from: a0 */
    public final List m8157a0(String str, String str2, String str3) {
        ry0.m10834f(str);
        mo6991f();
        m13533g();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return m8156b0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0058, code lost:
        r2 = r27.f25143a.mo3895i().m14160q();
        r27.f25143a.m24020z();
        r2.m20652b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m8156b0(String str, String[] strArr) {
        mo6991f();
        m13533g();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                this.f25143a.m24020z();
                cursor = m8168P().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                while (true) {
                    int size = arrayList.size();
                    this.f25143a.m24020z();
                    if (size < 1000) {
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        String string3 = cursor.getString(2);
                        Object m8159Y = m8159Y(cursor, 3);
                        boolean z = cursor.getInt(4) != 0;
                        String string4 = cursor.getString(5);
                        long j = cursor.getLong(6);
                        ec8 m3898g0 = this.f19771b.m3898g0();
                        byte[] blob = cursor.getBlob(7);
                        Parcelable.Creator<zzaw> creator = zzaw.CREATOR;
                        arrayList.add(new zzac(string, string2, new zzkw(string3, cursor.getLong(10), m8159Y, string2), cursor.getLong(8), z, string4, (zzaw) m3898g0.m23574z(blob, creator), j, (zzaw) this.f19771b.m3898g0().m23574z(cursor.getBlob(9), creator), cursor.getLong(11), (zzaw) this.f19771b.m3898g0().m23574z(cursor.getBlob(12), creator)));
                        if (!cursor.moveToNext()) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                cursor.close();
                return arrayList;
            } catch (SQLiteException e) {
                this.f25143a.mo3895i().m14160q().m20652b("Error querying conditional user property value", e);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: c0 */
    public final List m8155c0(String str) {
        ry0.m10834f(str);
        mo6991f();
        m13533g();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                this.f25143a.m24020z();
                cursor = m8168P().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j = cursor.getLong(2);
                    Object m8159Y = m8159Y(cursor, 3);
                    if (m8159Y == null) {
                        this.f25143a.mo3895i().m14160q().m20652b("Read invalid user property value, ignoring it. appId", om5.m14152z(str));
                    } else {
                        arrayList.add(new mc8(str, str2, string, j, m8159Y));
                    }
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e) {
                this.f25143a.mo3895i().m14160q().m20651c("Error querying user properties. appId", om5.m14152z(str), e);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
        r0 = r17.f25143a.mo3895i().m14160q();
        r17.f25143a.m24020z();
        r0.m20652b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0124 A[DONT_GENERATE] */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m8154d0(String str, String str2, String str3) {
        String str4;
        ry0.m10834f(str);
        mo6991f();
        m13533g();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                try {
                    arrayList2.add(str);
                    StringBuilder sb = new StringBuilder("app_id=?");
                    if (TextUtils.isEmpty(str2)) {
                        str4 = str2;
                    } else {
                        str4 = str2;
                        try {
                            arrayList2.add(str4);
                            sb.append(" and origin=?");
                        } catch (SQLiteException e) {
                            e = e;
                            this.f25143a.mo3895i().m14160q().m20650d("(2)Error querying user properties", om5.m14152z(str), str4, e);
                            return Collections.emptyList();
                        }
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        arrayList2.add(str3 + "*");
                        sb.append(" and name glob ?");
                    }
                    String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                    String sb2 = sb.toString();
                    this.f25143a.m24020z();
                    cursor = m8168P().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, sb2, strArr, null, null, "rowid", "1001");
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return arrayList;
                    }
                    while (true) {
                        int size = arrayList.size();
                        this.f25143a.m24020z();
                        if (size < 1000) {
                            String string = cursor.getString(0);
                            long j = cursor.getLong(1);
                            Object m8159Y = m8159Y(cursor, 2);
                            str4 = cursor.getString(3);
                            if (m8159Y == null) {
                                this.f25143a.mo3895i().m14160q().m20650d("(2)Read invalid user property value, ignoring it", om5.m14152z(str), str4, str3);
                            } else {
                                arrayList.add(new mc8(str, str4, string, j, m8159Y));
                            }
                            if (!cursor.moveToNext()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    cursor.close();
                    return arrayList;
                } catch (SQLiteException e2) {
                    e = e2;
                    str4 = str2;
                    this.f25143a.mo3895i().m14160q().m20650d("(2)Error querying user properties", om5.m14152z(str), str4, e);
                    return Collections.emptyList();
                }
            } finally {
                if (0 != 0) {
                    cursor.close();
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
        }
    }

    /* renamed from: e0 */
    public final void m8153e0() {
        m13533g();
        m8168P().beginTransaction();
    }

    /* renamed from: f0 */
    public final void m8152f0() {
        m13533g();
        m8168P().endTransaction();
    }

    /* renamed from: g0 */
    public final void m8151g0(List list) {
        mo6991f();
        m13533g();
        ry0.m10830j(list);
        ry0.m10828l(list.size());
        if (m8140u()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (m8175I("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                this.f25143a.mo3895i().m14155w().m20653a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                m8168P().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                this.f25143a.mo3895i().m14160q().m20652b("Error incrementing retry count. error", e);
            }
        }
    }

    /* renamed from: h0 */
    public final void m8150h0() {
        mo6991f();
        m13533g();
        if (m8140u()) {
            long m4400a = this.f19771b.m3902e0().f6615e.m4400a();
            long mo15859b = this.f25143a.mo3909b().mo15859b();
            long abs = Math.abs(mo15859b - m4400a);
            this.f25143a.m24020z();
            if (abs > ((Long) m75.f18567z.m18786a(null)).longValue()) {
                this.f19771b.m3902e0().f6615e.m4399b(mo15859b);
                mo6991f();
                m13533g();
                if (m8140u()) {
                    SQLiteDatabase m8168P = m8168P();
                    this.f25143a.m24020z();
                    int delete = m8168P.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.f25143a.mo3909b().mo15860a()), String.valueOf(qa2.m12669g())});
                    if (delete > 0) {
                        this.f25143a.mo3895i().m14156v().m20652b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    @Override // com.daaw.pa8
    /* renamed from: k */
    public final boolean mo8149k() {
        return false;
    }

    /* renamed from: l */
    public final void m8148l(String str, String str2) {
        ry0.m10834f(str);
        ry0.m10834f(str2);
        mo6991f();
        m13533g();
        try {
            m8168P().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.f25143a.mo3895i().m14160q().m20650d("Error deleting user property. appId", om5.m14152z(str), this.f25143a.m24055D().m5131f(str2), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x032f, code lost:
        r11.put("session_scoped", r0);
        r11.put("data", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0343, code lost:
        if (m8168P().insertWithOnConflict("property_filters", null, r11, 5) != (-1)) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0345, code lost:
        r23.f25143a.mo3895i().m14160q().m20652b("Failed to insert property filter (got -1). appId", com.daaw.om5.m14152z(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0359, code lost:
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x035d, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x035e, code lost:
        r3 = r23.f25143a.mo3895i().m14160q();
        r7 = "Error storing property filter. appId";
        r8 = com.daaw.om5.m14152z(r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0370, code lost:
        m13533g();
        mo6991f();
        com.daaw.ry0.m10834f(r24);
        r0 = m8168P();
        r3 = r17;
        r0.delete("property_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r17 = r3;
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x03a7, code lost:
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0176, code lost:
        r0.m20651c(r8, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x017a, code lost:
        r11 = r0.m11146K().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0186, code lost:
        if (r11.hasNext() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0192, code lost:
        if (((com.daaw.a06) r11.next()).m27756M() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0194, code lost:
        r0 = r23.f25143a.mo3895i().m14155w();
        r8 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
        r9 = com.daaw.om5.m14152z(r24);
        r10 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a9, code lost:
        r11 = r0.m11147J().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01bf, code lost:
        if (r11.hasNext() == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01c1, code lost:
        r12 = (com.daaw.xp5) r11.next();
        m13533g();
        mo6991f();
        com.daaw.ry0.m10834f(r24);
        com.daaw.ry0.m10830j(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01db, code lost:
        if (r12.m4846J().isEmpty() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01dd, code lost:
        r0 = r23.f25143a.mo3895i().m14155w();
        r9 = com.daaw.om5.m14152z(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f5, code lost:
        if (r12.m4838R() == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01f7, code lost:
        r20 = java.lang.Integer.valueOf(r12.m4851E());
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0202, code lost:
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0204, code lost:
        r0.m20650d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r9, r11, java.lang.String.valueOf(r20));
        r21 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x020f, code lost:
        r3 = r12.m6531i();
        r21 = r7;
        r7 = new android.content.ContentValues();
        r7.put("app_id", r24);
        r7.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0228, code lost:
        if (r12.m4838R() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x022a, code lost:
        r9 = java.lang.Integer.valueOf(r12.m4851E());
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0233, code lost:
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0234, code lost:
        r7.put("filter_id", r9);
        r7.put("event_name", r12.m4846J());
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0244, code lost:
        if (r12.m4837S() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0246, code lost:
        r9 = java.lang.Boolean.valueOf(r12.m4840P());
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x024f, code lost:
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0250, code lost:
        r7.put("session_scoped", r9);
        r7.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0264, code lost:
        if (m8168P().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0266, code lost:
        r23.f25143a.mo3895i().m14160q().m20652b("Failed to insert event filter (got -1). appId", com.daaw.om5.m14152z(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0279, code lost:
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x027f, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0280, code lost:
        r3 = r23.f25143a.mo3895i().m14160q();
        r7 = "Error storing event filter. appId";
        r8 = com.daaw.om5.m14152z(r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0290, code lost:
        r3.m20651c(r7, r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0295, code lost:
        r21 = r7;
        r0 = r0.m11146K().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02a3, code lost:
        if (r0.hasNext() == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02a5, code lost:
        r3 = (com.daaw.a06) r0.next();
        m13533g();
        mo6991f();
        com.daaw.ry0.m10834f(r24);
        com.daaw.ry0.m10830j(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02bf, code lost:
        if (r3.m27761H().isEmpty() == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02c1, code lost:
        r0 = r23.f25143a.mo3895i().m14155w();
        r8 = com.daaw.om5.m14152z(r24);
        r9 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02d9, code lost:
        if (r3.m27756M() == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02db, code lost:
        r3 = java.lang.Integer.valueOf(r3.m27765D());
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02e4, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02e5, code lost:
        r0.m20650d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r8, r9, java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02ee, code lost:
        r7 = r3.m6531i();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r24);
        r11.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0305, code lost:
        if (r3.m27756M() == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0307, code lost:
        r12 = java.lang.Integer.valueOf(r3.m27765D());
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0310, code lost:
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0311, code lost:
        r11.put("filter_id", r12);
        r22 = r0;
        r11.put("property_name", r3.m27761H());
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0323, code lost:
        if (r3.m27755N() == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0325, code lost:
        r0 = java.lang.Boolean.valueOf(r3.m27757L());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x032e, code lost:
        r0 = null;
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8147m(String str, List list) {
        boolean z;
        String str2 = "app_id=? and audience_id=?";
        ry0.m10830j(list);
        int i = 0;
        while (i < list.size()) {
            nm5 nm5Var = (nm5) ((rn5) list.get(i)).m18675A();
            if (nm5Var.m15040s() != 0) {
                int i2 = 0;
                while (i2 < nm5Var.m15040s()) {
                    uo5 uo5Var = (uo5) nm5Var.m15036w(i2).m18675A();
                    uo5 uo5Var2 = (uo5) uo5Var.clone();
                    String m24377b = dh7.m24377b(uo5Var.m7867w());
                    if (m24377b != null) {
                        uo5Var2.m7870t(m24377b);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i3 = 0;
                    while (i3 < uo5Var.m7871s()) {
                        ds5 m7868v = uo5Var.m7868v(i3);
                        uo5 uo5Var3 = uo5Var;
                        String str3 = str2;
                        String m12790a = q38.m12790a(m7868v.m24001H(), gi7.f11333a, gi7.f11334b);
                        if (m12790a != null) {
                            ar5 ar5Var = (ar5) m7868v.m18675A();
                            ar5Var.m27129s(m12790a);
                            uo5Var2.m7869u(i3, (ds5) ar5Var.m3975m());
                            z = true;
                        }
                        i3++;
                        uo5Var = uo5Var3;
                        str2 = str3;
                    }
                    String str4 = str2;
                    if (z) {
                        nm5Var.m15038u(i2, uo5Var2);
                        list.set(i, (rn5) nm5Var.m3975m());
                    }
                    i2++;
                    str2 = str4;
                }
            }
            String str5 = str2;
            if (nm5Var.m15039t() != 0) {
                for (int i4 = 0; i4 < nm5Var.m15039t(); i4++) {
                    a06 m15035x = nm5Var.m15035x(i4);
                    String m12790a2 = q38.m12790a(m15035x.m27761H(), jj7.f15137a, jj7.f15138b);
                    if (m12790a2 != null) {
                        wy5 wy5Var = (wy5) m15035x.m18675A();
                        wy5Var.m5711s(m12790a2);
                        nm5Var.m15037v(i4, wy5Var);
                        list.set(i, (rn5) nm5Var.m3975m());
                    }
                }
            }
            i++;
            str2 = str5;
        }
        String str6 = str2;
        m13533g();
        mo6991f();
        ry0.m10834f(str);
        ry0.m10830j(list);
        SQLiteDatabase m8168P = m8168P();
        m8168P.beginTransaction();
        try {
            m13533g();
            mo6991f();
            ry0.m10834f(str);
            SQLiteDatabase m8168P2 = m8168P();
            m8168P2.delete("property_filters", "app_id=?", new String[]{str});
            m8168P2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = list.iterator();
            while (it.hasNext()) {
                rn5 rn5Var = (rn5) it.next();
                m13533g();
                mo6991f();
                ry0.m10834f(str);
                ry0.m10830j(rn5Var);
                if (rn5Var.m11143N()) {
                    int m11153D = rn5Var.m11153D();
                    Iterator it2 = rn5Var.m11147J().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((xp5) it2.next()).m4838R()) {
                                hk5 m14155w = this.f25143a.mo3895i().m14155w();
                                String str7 = "Event filter with no ID. Audience definition ignored. appId, audienceId";
                                Object m14152z = om5.m14152z(str);
                                Integer valueOf = Integer.valueOf(m11153D);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    this.f25143a.mo3895i().m14155w().m20652b("Audience with no ID. appId", om5.m14152z(str));
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                rn5 rn5Var2 = (rn5) it3.next();
                arrayList.add(rn5Var2.m11143N() ? Integer.valueOf(rn5Var2.m11153D()) : null);
            }
            ry0.m10834f(str);
            m13533g();
            mo6991f();
            SQLiteDatabase m8168P3 = m8168P();
            try {
                long m8175I = m8175I("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int max = Math.max(0, Math.min(2000, this.f25143a.m24020z().m12663n(str, m75.f18499G)));
                if (m8175I > max) {
                    ArrayList arrayList2 = new ArrayList();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= arrayList.size()) {
                            String join = TextUtils.join(",", arrayList2);
                            StringBuilder sb = new StringBuilder();
                            sb.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb.append("(" + join + ")");
                            sb.append(" order by rowid desc limit -1 offset ?)");
                            m8168P3.delete("audience_filter_values", sb.toString(), new String[]{str, Integer.toString(max)});
                            break;
                        }
                        Integer num = (Integer) arrayList.get(i5);
                        if (num == null) {
                            break;
                        }
                        arrayList2.add(Integer.toString(num.intValue()));
                        i5++;
                    }
                }
            } catch (SQLiteException e) {
                this.f25143a.mo3895i().m14160q().m20651c("Database error querying filters. appId", om5.m14152z(str), e);
            }
            m8168P.setTransactionSuccessful();
        } finally {
            m8168P.endTransaction();
        }
    }

    /* renamed from: n */
    public final void m8146n() {
        m13533g();
        m8168P().setTransactionSuccessful();
    }

    /* renamed from: o */
    public final void m8145o(qu7 qu7Var) {
        ry0.m10830j(qu7Var);
        mo6991f();
        m13533g();
        String m12169d0 = qu7Var.m12169d0();
        ry0.m10830j(m12169d0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", m12169d0);
        contentValues.put("app_instance_id", qu7Var.m12167e0());
        contentValues.put("gmp_app_id", qu7Var.m12159i0());
        contentValues.put("resettable_device_id_hash", qu7Var.m12176a());
        contentValues.put("last_bundle_index", Long.valueOf(qu7Var.m12178Y()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(qu7Var.m12177Z()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(qu7Var.m12179X()));
        contentValues.put("app_version", qu7Var.m12163g0());
        contentValues.put("app_store", qu7Var.m12165f0());
        contentValues.put("gmp_version", Long.valueOf(qu7Var.m12180W()));
        contentValues.put("dev_cert_hash", Long.valueOf(qu7Var.m12183T()));
        contentValues.put("measurement_enabled", Boolean.valueOf(qu7Var.m12193J()));
        contentValues.put("day", Long.valueOf(qu7Var.m12184S()));
        contentValues.put("daily_public_events_count", Long.valueOf(qu7Var.m12186Q()));
        contentValues.put("daily_events_count", Long.valueOf(qu7Var.m12187P()));
        contentValues.put("daily_conversions_count", Long.valueOf(qu7Var.m12189N()));
        contentValues.put("config_fetched_time", Long.valueOf(qu7Var.m12190M()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(qu7Var.m12181V()));
        contentValues.put("app_version_int", Long.valueOf(qu7Var.m12191L()));
        contentValues.put("firebase_instance_id", qu7Var.m12161h0());
        contentValues.put("daily_error_events_count", Long.valueOf(qu7Var.m12188O()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(qu7Var.m12185R()));
        contentValues.put("health_monitor_sample", qu7Var.m12157j0());
        qu7Var.m12202A();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(qu7Var.m12194I()));
        contentValues.put("admob_app_id", qu7Var.m12173b0());
        contentValues.put("dynamite_version", Long.valueOf(qu7Var.m12182U()));
        contentValues.put("session_stitching_token", qu7Var.m12174b());
        List m12172c = qu7Var.m12172c();
        if (m12172c != null) {
            if (m12172c.isEmpty()) {
                this.f25143a.mo3895i().m14155w().m20652b("Safelisted events should not be an empty list. appId", m12169d0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", m12172c));
            }
        }
        kj8.m17686b();
        if (this.f25143a.m24020z().m12677B(null, m75.f18540k0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase m8168P = m8168P();
            if (m8168P.update("apps", contentValues, "app_id = ?", new String[]{m12169d0}) == 0 && m8168P.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.f25143a.mo3895i().m14160q().m20652b("Failed to insert/update app (got -1). appId", om5.m14152z(m12169d0));
            }
        } catch (SQLiteException e) {
            this.f25143a.mo3895i().m14160q().m20651c("Error storing app. appId", om5.m14152z(m12169d0), e);
        }
    }

    /* renamed from: p */
    public final void m8144p(to2 to2Var) {
        ry0.m10830j(to2Var);
        mo6991f();
        m13533g();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", to2Var.f27916a);
        contentValues.put("name", to2Var.f27917b);
        contentValues.put("lifetime_count", Long.valueOf(to2Var.f27918c));
        contentValues.put("current_bundle_count", Long.valueOf(to2Var.f27919d));
        contentValues.put("last_fire_timestamp", Long.valueOf(to2Var.f27921f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(to2Var.f27922g));
        contentValues.put("last_bundled_day", to2Var.f27923h);
        contentValues.put("last_sampled_complex_event_id", to2Var.f27924i);
        contentValues.put("last_sampling_rate", to2Var.f27925j);
        contentValues.put("current_session_count", Long.valueOf(to2Var.f27920e));
        Boolean bool = to2Var.f27926k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (m8168P().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.f25143a.mo3895i().m14160q().m20652b("Failed to insert/update event aggregates (got -1). appId", om5.m14152z(to2Var.f27916a));
            }
        } catch (SQLiteException e) {
            this.f25143a.mo3895i().m14160q().m20651c("Error storing event aggregates. appId", om5.m14152z(to2Var.f27916a), e);
        }
    }

    /* renamed from: q */
    public final boolean m8143q() {
        return m8175I("select count(1) > 0 from raw_events", null) != 0;
    }

    /* renamed from: s */
    public final boolean m8142s() {
        return m8175I("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    /* renamed from: t */
    public final boolean m8141t() {
        return m8175I("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    /* renamed from: u */
    public final boolean m8140u() {
        Context mo3905d = this.f25143a.mo3905d();
        this.f25143a.m24020z();
        return mo3905d.getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: v */
    public final boolean m8139v(String str, Long l, long j, it6 it6Var) {
        mo6991f();
        m13533g();
        ry0.m10830j(it6Var);
        ry0.m10834f(str);
        ry0.m10830j(l);
        byte[] m6531i = it6Var.m6531i();
        this.f25143a.mo3895i().m14156v().m20651c("Saving complex main event, appId, data size", this.f25143a.m24055D().m5133d(str), Integer.valueOf(m6531i.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", m6531i);
        try {
            if (m8168P().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                this.f25143a.mo3895i().m14160q().m20652b("Failed to insert complex main event (got -1). appId", om5.m14152z(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            this.f25143a.mo3895i().m14160q().m20651c("Error storing complex main event. appId", om5.m14152z(str), e);
            return false;
        }
    }

    /* renamed from: w */
    public final boolean m8138w(zzac zzacVar) {
        ry0.m10830j(zzacVar);
        mo6991f();
        m13533g();
        String str = zzacVar.f37056p;
        ry0.m10830j(str);
        if (m8160X(str, zzacVar.f37058r.f37073q) == null) {
            long m8175I = m8175I("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f25143a.m24020z();
            if (m8175I >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzacVar.f37057q);
        contentValues.put("name", zzacVar.f37058r.f37073q);
        m8176H(contentValues, "value", ry0.m10830j(zzacVar.f37058r.m1073h()));
        contentValues.put("active", Boolean.valueOf(zzacVar.f37060t));
        contentValues.put("trigger_event_name", zzacVar.f37061u);
        contentValues.put("trigger_timeout", Long.valueOf(zzacVar.f37063w));
        contentValues.put("timed_out_event", this.f25143a.m24045N().m24486c0(zzacVar.f37062v));
        contentValues.put("creation_timestamp", Long.valueOf(zzacVar.f37059s));
        contentValues.put("triggered_event", this.f25143a.m24045N().m24486c0(zzacVar.f37064x));
        contentValues.put("triggered_timestamp", Long.valueOf(zzacVar.f37058r.f37074r));
        contentValues.put("time_to_live", Long.valueOf(zzacVar.f37065y));
        contentValues.put("expired_event", this.f25143a.m24045N().m24486c0(zzacVar.f37066z));
        try {
            if (m8168P().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                this.f25143a.mo3895i().m14160q().m20652b("Failed to insert/update conditional user property (got -1)", om5.m14152z(str));
            }
        } catch (SQLiteException e) {
            this.f25143a.mo3895i().m14160q().m20651c("Error storing conditional user property", om5.m14152z(str), e);
        }
        return true;
    }

    /* renamed from: x */
    public final boolean m8137x(mc8 mc8Var) {
        ry0.m10830j(mc8Var);
        mo6991f();
        m13533g();
        if (m8160X(mc8Var.f18794a, mc8Var.f18796c) == null) {
            if (dd8.m24491X(mc8Var.f18796c)) {
                if (m8175I("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{mc8Var.f18794a}) >= this.f25143a.m24020z().m12662o(mc8Var.f18794a, m75.f18500H, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(mc8Var.f18796c)) {
                long m8175I = m8175I("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{mc8Var.f18794a, mc8Var.f18795b});
                this.f25143a.m24020z();
                if (m8175I >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", mc8Var.f18794a);
        contentValues.put("origin", mc8Var.f18795b);
        contentValues.put("name", mc8Var.f18796c);
        contentValues.put("set_timestamp", Long.valueOf(mc8Var.f18797d));
        m8176H(contentValues, "value", mc8Var.f18798e);
        try {
            if (m8168P().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.f25143a.mo3895i().m14160q().m20652b("Failed to insert/update user property (got -1). appId", om5.m14152z(mc8Var.f18794a));
            }
        } catch (SQLiteException e) {
            this.f25143a.mo3895i().m14160q().m20651c("Error storing user property. appId", om5.m14152z(mc8Var.f18794a), e);
        }
        return true;
    }
}
