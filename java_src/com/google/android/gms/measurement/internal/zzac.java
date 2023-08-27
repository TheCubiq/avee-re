package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import androidx.collection.ArrayMap;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.DataSchemeDataSource;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzbv;
import com.google.android.gms.internal.measurement.zzcd;
import com.google.android.gms.internal.measurement.zzhv;
import com.google.android.gms.internal.measurement.zzmy;
import com.google.android.gms.internal.measurement.zznq;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzac extends zzkm {
    private static final String[] zzb = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] zzc = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzd = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};
    private static final String[] zze = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zzf = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzg = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final zzah zzj;
    private final zzki zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzac(zzkp zzkpVar) {
        super(zzkpVar);
        this.zzk = new zzki(zzl());
        this.zzj = new zzah(this, zzm(), "google_app_measurement.db");
    }

    @Override // com.google.android.gms.measurement.internal.zzkm
    protected final boolean zzd() {
        return false;
    }

    public final void zze() {
        zzaj();
        c_().beginTransaction();
    }

    public final void b_() {
        zzaj();
        c_().setTransactionSuccessful();
    }

    public final void zzg() {
        zzaj();
        c_().endTransaction();
    }

    private final long zzb(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = c_().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                zzq().zze().zza("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long zza(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = c_().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    return cursor.getLong(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e) {
                zzq().zze().zza("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    private final String zza(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            try {
                cursor = c_().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    return cursor.getString(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
                return str2;
            } catch (SQLiteException e) {
                zzq().zze().zza("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SQLiteDatabase c_() {
        zzc();
        try {
            return this.zzj.getWritableDatabase();
        } catch (SQLiteException e) {
            zzq().zzh().zza("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzan zza(String str, String str2) {
        Cursor cursor;
        Cursor cursor2;
        Boolean valueOf;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzc();
        zzaj();
        Cursor cursor3 = null;
        try {
            cursor = c_().query("events", (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
                long j = cursor.getLong(0);
                long j2 = cursor.getLong(1);
                long j3 = cursor.getLong(2);
                long j4 = 0;
                long j5 = cursor.isNull(3) ? 0L : cursor.getLong(3);
                Long valueOf2 = cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4));
                Long valueOf3 = cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5));
                Long valueOf4 = cursor.isNull(6) ? null : Long.valueOf(cursor.getLong(6));
                if (cursor.isNull(7)) {
                    valueOf = null;
                } else {
                    try {
                        try {
                            valueOf = Boolean.valueOf(cursor.getLong(7) == 1);
                        } catch (SQLiteException e) {
                            e = e;
                            zzq().zze().zza("Error querying events. appId", zzex.zza(str), zzn().zza(str2), e);
                            if (cursor != null) {
                                cursor.close();
                            }
                            return null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor3 = cursor;
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        throw th;
                    }
                }
                if (!cursor.isNull(8)) {
                    j4 = cursor.getLong(8);
                }
                cursor2 = cursor;
                try {
                    zzan zzanVar = new zzan(str, str2, j, j2, j4, j3, j5, valueOf2, valueOf3, valueOf4, valueOf);
                    if (cursor2.moveToNext()) {
                        zzq().zze().zza("Got multiple records for event aggregates, expected one. appId", zzex.zza(str));
                    }
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return zzanVar;
                } catch (SQLiteException e2) {
                    e = e2;
                    cursor = cursor2;
                    zzq().zze().zza("Error querying events. appId", zzex.zza(str), zzn().zza(str2), e);
                    if (cursor != null) {
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor3 = cursor2;
                    if (cursor3 != null) {
                    }
                    throw th;
                }
            } catch (SQLiteException e3) {
                e = e3;
            } catch (Throwable th3) {
                th = th3;
                cursor2 = cursor;
            }
        } catch (SQLiteException e4) {
            e = e4;
            cursor = null;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final void zza(zzan zzanVar) {
        Preconditions.checkNotNull(zzanVar);
        zzc();
        zzaj();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzanVar.zza);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzanVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzanVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzanVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzanVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzanVar.zzg));
        contentValues.put("last_bundled_day", zzanVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzanVar.zzi);
        contentValues.put("last_sampling_rate", zzanVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzanVar.zze));
        contentValues.put("last_exempt_from_sampling", (zzanVar.zzk == null || !zzanVar.zzk.booleanValue()) ? null : 1L);
        try {
            if (c_().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                zzq().zze().zza("Failed to insert/update event aggregates (got -1). appId", zzex.zza(zzanVar.zza));
            }
        } catch (SQLiteException e) {
            zzq().zze().zza("Error storing event aggregates. appId", zzex.zza(zzanVar.zza), e);
        }
    }

    public final void zzb(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzc();
        zzaj();
        try {
            c_().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzq().zze().zza("Error deleting user property. appId", zzex.zza(str), zzn().zzc(str2), e);
        }
    }

    public final boolean zza(zzky zzkyVar) {
        Preconditions.checkNotNull(zzkyVar);
        zzc();
        zzaj();
        if (zzc(zzkyVar.zza, zzkyVar.zzc) == null) {
            if (zzkx.zza(zzkyVar.zzc)) {
                if (zzb("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzkyVar.zza}) >= zzs().zzd(zzkyVar.zza)) {
                    return false;
                }
            } else if (!"_npa".equals(zzkyVar.zzc) && zzb("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzkyVar.zza, zzkyVar.zzb}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzkyVar.zza);
        contentValues.put("origin", zzkyVar.zzb);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzkyVar.zzc);
        contentValues.put("set_timestamp", Long.valueOf(zzkyVar.zzd));
        zza(contentValues, "value", zzkyVar.zze);
        try {
            if (c_().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                zzq().zze().zza("Failed to insert/update user property (got -1). appId", zzex.zza(zzkyVar.zza));
            }
        } catch (SQLiteException e) {
            zzq().zze().zza("Error storing user property. appId", zzex.zza(zzkyVar.zza), e);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzky zzc(String str, String str2) {
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzc();
        zzaj();
        Cursor cursor2 = null;
        try {
            cursor = c_().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
        } catch (SQLiteException e) {
            e = e;
            cursor = null;
        } catch (Throwable th) {
            th = th;
            if (cursor2 != null) {
            }
            throw th;
        }
        try {
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
            try {
                try {
                    zzky zzkyVar = new zzky(str, cursor.getString(2), str2, cursor.getLong(0), zza(cursor, 1));
                    if (cursor.moveToNext()) {
                        zzq().zze().zza("Got multiple records for user property, expected one. appId", zzex.zza(str));
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return zzkyVar;
                } catch (SQLiteException e2) {
                    e = e2;
                    zzq().zze().zza("Error querying user property. appId", zzex.zza(str), zzn().zzc(str2), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
        } catch (Throwable th3) {
            th = th3;
            cursor2 = cursor;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<zzky> zza(String str) {
        Cursor cursor;
        Cursor cursor2;
        int i;
        int i2;
        int i3;
        int i4;
        Preconditions.checkNotEmpty(str);
        zzc();
        zzaj();
        ArrayList arrayList = new ArrayList();
        try {
            try {
                i = 0;
                i2 = 1;
                i3 = 2;
                i4 = 3;
                cursor2 = c_().query("user_attributes", new String[]{AppMeasurementSdk.ConditionalUserProperty.NAME, "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (!cursor2.moveToFirst()) {
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return arrayList;
                }
                while (true) {
                    String string = cursor2.getString(i);
                    String string2 = cursor2.getString(i2);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j = cursor2.getLong(i3);
                    try {
                        Object zza = zza(cursor2, i4);
                        if (zza == null) {
                            zzq().zze().zza("Read invalid user property value, ignoring it. appId", zzex.zza(str));
                        } else {
                            arrayList.add(new zzky(str, str2, string, j, zza));
                        }
                        if (!cursor2.moveToNext()) {
                            break;
                        }
                        i4 = 3;
                        i2 = 1;
                        i3 = 2;
                        i = 0;
                    } catch (SQLiteException e) {
                        e = e;
                        zzq().zze().zza("Error querying user properties. appId", zzex.zza(str), e);
                        if (zzmy.zzb() && zzs().zze(str, zzat.zzcm)) {
                            List<zzky> emptyList = Collections.emptyList();
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            return emptyList;
                        } else if (cursor2 != null) {
                            cursor2.close();
                            return null;
                        } else {
                            return null;
                        }
                    }
                }
                if (cursor2 != null) {
                    cursor2.close();
                }
                return arrayList;
            } catch (SQLiteException e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
                cursor = cursor2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor2 = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
        zzq().zze().zza("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013b A[Catch: all -> 0x0157, TryCatch #3 {all -> 0x0157, blocks: (B:22:0x00b7, B:24:0x00c1, B:29:0x00f1, B:26:0x00dc, B:28:0x00eb, B:52:0x0124, B:54:0x013b, B:56:0x0147), top: B:76:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<zzky> zza(String str, String str2, String str3) {
        String str4;
        Cursor cursor;
        int i;
        int i2;
        int i3;
        int i4;
        String str5;
        Preconditions.checkNotEmpty(str);
        zzc();
        zzaj();
        ArrayList arrayList = new ArrayList();
        Cursor cursor2 = null;
        try {
            try {
                i = 3;
                ArrayList arrayList2 = new ArrayList(3);
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
                        cursor = null;
                        zzq().zze().zza("(2)Error querying user properties", zzex.zza(str), str4, e);
                        if (zzmy.zzb()) {
                        }
                        if (cursor != null) {
                        }
                        return null;
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    arrayList2.add(String.valueOf(str3).concat("*"));
                    sb.append(" and name glob ?");
                }
                i2 = 0;
                i3 = 1;
                i4 = 2;
                cursor = c_().query("user_attributes", new String[]{AppMeasurementSdk.ConditionalUserProperty.NAME, "set_timestamp", "value", "origin"}, sb.toString(), (String[]) arrayList2.toArray(new String[arrayList2.size()]), null, null, "rowid", NativeContentAd.ASSET_HEADLINE);
            } catch (Throwable th) {
                th = th;
                if (cursor2 != null) {
                }
                throw th;
            }
            try {
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayList;
                }
                while (true) {
                    if (arrayList.size() >= 1000) {
                        break;
                    }
                    String string = cursor.getString(i2);
                    long j = cursor.getLong(i3);
                    try {
                        try {
                            Object zza = zza(cursor, i4);
                            str4 = cursor.getString(i);
                            if (zza == null) {
                                zzq().zze().zza("(2)Read invalid user property value, ignoring it", zzex.zza(str), str4, str3);
                                str5 = str4;
                            } else {
                                try {
                                    str5 = str4;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    zzq().zze().zza("(2)Error querying user properties", zzex.zza(str), str4, e);
                                    if (zzmy.zzb() || !zzs().zze(str, zzat.zzcm)) {
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        return null;
                                    }
                                    List<zzky> emptyList = Collections.emptyList();
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    return emptyList;
                                }
                                try {
                                    arrayList.add(new zzky(str, str4, string, j, zza));
                                } catch (SQLiteException e3) {
                                    e = e3;
                                    str4 = str5;
                                    zzq().zze().zza("(2)Error querying user properties", zzex.zza(str), str4, e);
                                    if (zzmy.zzb()) {
                                    }
                                    if (cursor != null) {
                                    }
                                    return null;
                                }
                            }
                            if (!cursor.moveToNext()) {
                                break;
                            }
                            str4 = str5;
                            i3 = 1;
                            i4 = 2;
                            i2 = 0;
                            i = 3;
                        } catch (Throwable th2) {
                            th = th2;
                            cursor2 = cursor;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e4) {
                        e = e4;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            } catch (SQLiteException e5) {
                e = e5;
            } catch (Throwable th3) {
                th = th3;
                cursor2 = cursor;
                if (cursor2 != null) {
                }
                throw th;
            }
        } catch (SQLiteException e6) {
            e = e6;
            str4 = str2;
        }
    }

    public final boolean zza(zzw zzwVar) {
        Preconditions.checkNotNull(zzwVar);
        zzc();
        zzaj();
        if (zzc(zzwVar.zza, zzwVar.zzc.zza) != null || zzb("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{zzwVar.zza}) < 1000) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzwVar.zza);
            contentValues.put("origin", zzwVar.zzb);
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzwVar.zzc.zza);
            zza(contentValues, "value", zzwVar.zzc.zza());
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzwVar.zze));
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzwVar.zzf);
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzwVar.zzh));
            zzo();
            contentValues.put("timed_out_event", zzkx.zza((Parcelable) zzwVar.zzg));
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzwVar.zzd));
            zzo();
            contentValues.put("triggered_event", zzkx.zza((Parcelable) zzwVar.zzi));
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzwVar.zzc.zzb));
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzwVar.zzj));
            zzo();
            contentValues.put("expired_event", zzkx.zza((Parcelable) zzwVar.zzk));
            try {
                if (c_().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                    zzq().zze().zza("Failed to insert/update conditional user property (got -1)", zzex.zza(zzwVar.zza));
                }
            } catch (SQLiteException e) {
                zzq().zze().zza("Error storing conditional user property", zzex.zza(zzwVar.zza), e);
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzw zzd(String str, String str2) {
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzc();
        zzaj();
        Cursor cursor2 = null;
        try {
            try {
                cursor = c_().query("conditional_properties", new String[]{"origin", "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
                String string = cursor.getString(0);
                try {
                    Object zza = zza(cursor, 1);
                    zzw zzwVar = new zzw(str, string, new zzkw(str2, cursor.getLong(8), zza, string), cursor.getLong(6), cursor.getInt(2) != 0, cursor.getString(3), (zzar) f_().zza(cursor.getBlob(5), zzar.CREATOR), cursor.getLong(4), (zzar) f_().zza(cursor.getBlob(7), zzar.CREATOR), cursor.getLong(9), (zzar) f_().zza(cursor.getBlob(10), zzar.CREATOR));
                    if (cursor.moveToNext()) {
                        zzq().zze().zza("Got multiple records for conditional property, expected one", zzex.zza(str), zzn().zzc(str2));
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return zzwVar;
                } catch (SQLiteException e) {
                    e = e;
                    zzq().zze().zza("Error querying conditional property", zzex.zza(str), zzn().zzc(str2), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (SQLiteException e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    public final int zze(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzc();
        zzaj();
        try {
            return c_().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzq().zze().zza("Error deleting conditional property", zzex.zza(str), zzn().zzc(str2), e);
            return 0;
        }
    }

    public final List<zzw> zzb(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzc();
        zzaj();
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
        return zza(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008e, code lost:
        zzq().zze().zza("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<zzw> zza(String str, String[] strArr) {
        Cursor cursor;
        zzc();
        zzaj();
        ArrayList arrayList = new ArrayList();
        try {
            int i = 0;
            int i2 = 5;
            Cursor query = c_().query("conditional_properties", new String[]{"app_id", "origin", AppMeasurementSdk.ConditionalUserProperty.NAME, "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, str, strArr, null, null, "rowid", NativeContentAd.ASSET_HEADLINE);
            try {
                if (!query.moveToFirst()) {
                    if (query != null) {
                        query.close();
                    }
                    return arrayList;
                }
                while (true) {
                    if (arrayList.size() >= 1000) {
                        break;
                    }
                    String string = query.getString(i);
                    String string2 = query.getString(1);
                    String string3 = query.getString(2);
                    Object zza = zza(query, 3);
                    boolean z = query.getInt(4) != 0;
                    arrayList.add(new zzw(string, string2, new zzkw(string3, query.getLong(10), zza, string2), query.getLong(8), z, query.getString(i2), (zzar) f_().zza(query.getBlob(7), zzar.CREATOR), query.getLong(6), (zzar) f_().zza(query.getBlob(9), zzar.CREATOR), query.getLong(11), (zzar) f_().zza(query.getBlob(12), zzar.CREATOR)));
                    if (!query.moveToNext()) {
                        break;
                    }
                    i2 = 5;
                    i = 0;
                }
                if (query != null) {
                    query.close();
                }
                return arrayList;
            } catch (SQLiteException e) {
                e = e;
                cursor = query;
                try {
                    zzq().zze().zza("Error querying conditional user property value", e);
                    List<zzw> emptyList = Collections.emptyList();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return emptyList;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = query;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0196 A[Catch: SQLiteException -> 0x0277, all -> 0x02a0, TryCatch #0 {all -> 0x02a0, blocks: (B:11:0x00ea, B:13:0x0147, B:18:0x0151, B:22:0x019b, B:24:0x01ce, B:28:0x01dd, B:27:0x01d9, B:29:0x01e0, B:31:0x01e8, B:36:0x01f2, B:38:0x01fd, B:41:0x0204, B:45:0x021f, B:47:0x022a, B:48:0x023c, B:50:0x0242, B:52:0x024e, B:53:0x0257, B:55:0x0260, B:44:0x021b, B:21:0x0196, B:69:0x0289), top: B:78:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01ce A[Catch: SQLiteException -> 0x0277, all -> 0x02a0, TryCatch #0 {all -> 0x02a0, blocks: (B:11:0x00ea, B:13:0x0147, B:18:0x0151, B:22:0x019b, B:24:0x01ce, B:28:0x01dd, B:27:0x01d9, B:29:0x01e0, B:31:0x01e8, B:36:0x01f2, B:38:0x01fd, B:41:0x0204, B:45:0x021f, B:47:0x022a, B:48:0x023c, B:50:0x0242, B:52:0x024e, B:53:0x0257, B:55:0x0260, B:44:0x021b, B:21:0x0196, B:69:0x0289), top: B:78:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01fd A[Catch: SQLiteException -> 0x0277, all -> 0x02a0, TryCatch #0 {all -> 0x02a0, blocks: (B:11:0x00ea, B:13:0x0147, B:18:0x0151, B:22:0x019b, B:24:0x01ce, B:28:0x01dd, B:27:0x01d9, B:29:0x01e0, B:31:0x01e8, B:36:0x01f2, B:38:0x01fd, B:41:0x0204, B:45:0x021f, B:47:0x022a, B:48:0x023c, B:50:0x0242, B:52:0x024e, B:53:0x0257, B:55:0x0260, B:44:0x021b, B:21:0x0196, B:69:0x0289), top: B:78:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x021b A[Catch: SQLiteException -> 0x0277, all -> 0x02a0, TryCatch #0 {all -> 0x02a0, blocks: (B:11:0x00ea, B:13:0x0147, B:18:0x0151, B:22:0x019b, B:24:0x01ce, B:28:0x01dd, B:27:0x01d9, B:29:0x01e0, B:31:0x01e8, B:36:0x01f2, B:38:0x01fd, B:41:0x0204, B:45:0x021f, B:47:0x022a, B:48:0x023c, B:50:0x0242, B:52:0x024e, B:53:0x0257, B:55:0x0260, B:44:0x021b, B:21:0x0196, B:69:0x0289), top: B:78:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x022a A[Catch: SQLiteException -> 0x0277, all -> 0x02a0, TryCatch #0 {all -> 0x02a0, blocks: (B:11:0x00ea, B:13:0x0147, B:18:0x0151, B:22:0x019b, B:24:0x01ce, B:28:0x01dd, B:27:0x01d9, B:29:0x01e0, B:31:0x01e8, B:36:0x01f2, B:38:0x01fd, B:41:0x0204, B:45:0x021f, B:47:0x022a, B:48:0x023c, B:50:0x0242, B:52:0x024e, B:53:0x0257, B:55:0x0260, B:44:0x021b, B:21:0x0196, B:69:0x0289), top: B:78:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0242 A[Catch: SQLiteException -> 0x0277, all -> 0x02a0, TryCatch #0 {all -> 0x02a0, blocks: (B:11:0x00ea, B:13:0x0147, B:18:0x0151, B:22:0x019b, B:24:0x01ce, B:28:0x01dd, B:27:0x01d9, B:29:0x01e0, B:31:0x01e8, B:36:0x01f2, B:38:0x01fd, B:41:0x0204, B:45:0x021f, B:47:0x022a, B:48:0x023c, B:50:0x0242, B:52:0x024e, B:53:0x0257, B:55:0x0260, B:44:0x021b, B:21:0x0196, B:69:0x0289), top: B:78:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0260 A[Catch: SQLiteException -> 0x0277, all -> 0x02a0, TRY_LEAVE, TryCatch #0 {all -> 0x02a0, blocks: (B:11:0x00ea, B:13:0x0147, B:18:0x0151, B:22:0x019b, B:24:0x01ce, B:28:0x01dd, B:27:0x01d9, B:29:0x01e0, B:31:0x01e8, B:36:0x01f2, B:38:0x01fd, B:41:0x0204, B:45:0x021f, B:47:0x022a, B:48:0x023c, B:50:0x0242, B:52:0x024e, B:53:0x0257, B:55:0x0260, B:44:0x021b, B:21:0x0196, B:69:0x0289), top: B:78:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzf zzb(String str) {
        Cursor cursor;
        boolean z;
        boolean z2;
        Preconditions.checkNotEmpty(str);
        zzc();
        zzaj();
        Cursor cursor2 = null;
        try {
            try {
                boolean z3 = false;
                cursor = c_().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "ssaid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id"}, "app_id=?", new String[]{str}, null, null, null);
            } catch (Throwable th) {
                th = th;
            }
        } catch (SQLiteException e) {
            e = e;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        try {
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
            try {
                zzf zzfVar = new zzf(this.zza.zzu(), str);
                zzfVar.zza(cursor.getString(0));
                zzfVar.zzb(cursor.getString(1));
                zzfVar.zze(cursor.getString(2));
                zzfVar.zzg(cursor.getLong(3));
                zzfVar.zza(cursor.getLong(4));
                zzfVar.zzb(cursor.getLong(5));
                zzfVar.zzg(cursor.getString(6));
                zzfVar.zzh(cursor.getString(7));
                zzfVar.zzd(cursor.getLong(8));
                zzfVar.zze(cursor.getLong(9));
                if (!cursor.isNull(10) && cursor.getInt(10) == 0) {
                    z = false;
                    zzfVar.zza(z);
                    zzfVar.zzj(cursor.getLong(11));
                    zzfVar.zzk(cursor.getLong(12));
                    zzfVar.zzl(cursor.getLong(13));
                    zzfVar.zzm(cursor.getLong(14));
                    zzfVar.zzh(cursor.getLong(15));
                    zzfVar.zzi(cursor.getLong(16));
                    zzfVar.zzc(!cursor.isNull(17) ? -2147483648L : cursor.getInt(17));
                    zzfVar.zzf(cursor.getString(18));
                    zzfVar.zzo(cursor.getLong(19));
                    zzfVar.zzn(cursor.getLong(20));
                    zzfVar.zzi(cursor.getString(21));
                    if (!zzs().zza(zzat.zzcf)) {
                        zzfVar.zzp(cursor.isNull(22) ? 0L : cursor.getLong(22));
                    }
                    if (!cursor.isNull(23) && cursor.getInt(23) == 0) {
                        z2 = false;
                        zzfVar.zzb(z2);
                        zzfVar.zzc((cursor.isNull(24) && cursor.getInt(24) == 0) ? true : true);
                        zzfVar.zzc(cursor.getString(25));
                        zzfVar.zzf(!cursor.isNull(26) ? 0L : cursor.getLong(26));
                        if (!cursor.isNull(27)) {
                            zzfVar.zza(Arrays.asList(cursor.getString(27).split(",", -1)));
                        }
                        if (zznq.zzb() && zzs().zze(str, zzat.zzbj)) {
                            zzfVar.zzd(cursor.getString(28));
                        }
                        zzfVar.zzb();
                        if (cursor.moveToNext()) {
                            zzq().zze().zza("Got multiple records for app, expected one. appId", zzex.zza(str));
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        return zzfVar;
                    }
                    z2 = true;
                    zzfVar.zzb(z2);
                    zzfVar.zzc((cursor.isNull(24) && cursor.getInt(24) == 0) ? true : true);
                    zzfVar.zzc(cursor.getString(25));
                    zzfVar.zzf(!cursor.isNull(26) ? 0L : cursor.getLong(26));
                    if (!cursor.isNull(27)) {
                    }
                    if (zznq.zzb()) {
                        zzfVar.zzd(cursor.getString(28));
                    }
                    zzfVar.zzb();
                    if (cursor.moveToNext()) {
                    }
                    if (cursor != null) {
                    }
                    return zzfVar;
                }
                z = true;
                zzfVar.zza(z);
                zzfVar.zzj(cursor.getLong(11));
                zzfVar.zzk(cursor.getLong(12));
                zzfVar.zzl(cursor.getLong(13));
                zzfVar.zzm(cursor.getLong(14));
                zzfVar.zzh(cursor.getLong(15));
                zzfVar.zzi(cursor.getLong(16));
                zzfVar.zzc(!cursor.isNull(17) ? -2147483648L : cursor.getInt(17));
                zzfVar.zzf(cursor.getString(18));
                zzfVar.zzo(cursor.getLong(19));
                zzfVar.zzn(cursor.getLong(20));
                zzfVar.zzi(cursor.getString(21));
                if (!zzs().zza(zzat.zzcf)) {
                }
                if (!cursor.isNull(23)) {
                    z2 = false;
                    zzfVar.zzb(z2);
                    zzfVar.zzc((cursor.isNull(24) && cursor.getInt(24) == 0) ? true : true);
                    zzfVar.zzc(cursor.getString(25));
                    zzfVar.zzf(!cursor.isNull(26) ? 0L : cursor.getLong(26));
                    if (!cursor.isNull(27)) {
                    }
                    if (zznq.zzb()) {
                    }
                    zzfVar.zzb();
                    if (cursor.moveToNext()) {
                    }
                    if (cursor != null) {
                    }
                    return zzfVar;
                }
                z2 = true;
                zzfVar.zzb(z2);
                zzfVar.zzc((cursor.isNull(24) && cursor.getInt(24) == 0) ? true : true);
                zzfVar.zzc(cursor.getString(25));
                zzfVar.zzf(!cursor.isNull(26) ? 0L : cursor.getLong(26));
                if (!cursor.isNull(27)) {
                }
                if (zznq.zzb()) {
                }
                zzfVar.zzb();
                if (cursor.moveToNext()) {
                }
                if (cursor != null) {
                }
                return zzfVar;
            } catch (SQLiteException e2) {
                e = e2;
                zzq().zze().zza("Error querying app. appId", zzex.zza(str), e);
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
        } catch (SQLiteException e3) {
            e = e3;
        } catch (Throwable th3) {
            th = th3;
            cursor2 = cursor;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    public final void zza(zzf zzfVar) {
        Preconditions.checkNotNull(zzfVar);
        zzc();
        zzaj();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzfVar.zzc());
        contentValues.put("app_instance_id", zzfVar.zzd());
        contentValues.put("gmp_app_id", zzfVar.zze());
        contentValues.put("resettable_device_id_hash", zzfVar.zzh());
        contentValues.put("last_bundle_index", Long.valueOf(zzfVar.zzs()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzfVar.zzj()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzfVar.zzk()));
        contentValues.put("app_version", zzfVar.zzl());
        contentValues.put("app_store", zzfVar.zzn());
        contentValues.put("gmp_version", Long.valueOf(zzfVar.zzo()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzfVar.zzp()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzfVar.zzr()));
        contentValues.put("day", Long.valueOf(zzfVar.zzw()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzfVar.zzx()));
        contentValues.put("daily_events_count", Long.valueOf(zzfVar.zzy()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzfVar.zzz()));
        contentValues.put("config_fetched_time", Long.valueOf(zzfVar.zzt()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzfVar.zzu()));
        contentValues.put("app_version_int", Long.valueOf(zzfVar.zzm()));
        contentValues.put("firebase_instance_id", zzfVar.zzi());
        contentValues.put("daily_error_events_count", Long.valueOf(zzfVar.zzab()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzfVar.zzaa()));
        contentValues.put("health_monitor_sample", zzfVar.zzac());
        contentValues.put("android_id", Long.valueOf(zzfVar.zzae()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzfVar.zzaf()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(zzfVar.zzag()));
        contentValues.put("admob_app_id", zzfVar.zzf());
        contentValues.put("dynamite_version", Long.valueOf(zzfVar.zzq()));
        if (zzfVar.zzai() != null) {
            if (zzfVar.zzai().size() == 0) {
                zzq().zzh().zza("Safelisted events should not be an empty list. appId", zzfVar.zzc());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", zzfVar.zzai()));
            }
        }
        if (zznq.zzb() && zzs().zze(zzfVar.zzc(), zzat.zzbj)) {
            contentValues.put("ga_app_id", zzfVar.zzg());
        }
        try {
            SQLiteDatabase c_ = c_();
            if (c_.update("apps", contentValues, "app_id = ?", new String[]{zzfVar.zzc()}) == 0 && c_.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzq().zze().zza("Failed to insert/update app (got -1). appId", zzex.zza(zzfVar.zzc()));
            }
        } catch (SQLiteException e) {
            zzq().zze().zza("Error storing app. appId", zzex.zza(zzfVar.zzc()), e);
        }
    }

    public final long zzc(String str) {
        Preconditions.checkNotEmpty(str);
        zzc();
        zzaj();
        try {
            return c_().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, zzs().zzb(str, zzat.zzo))))});
        } catch (SQLiteException e) {
            zzq().zze().zza("Error deleting over the limit events. appId", zzex.zza(str), e);
            return 0L;
        }
    }

    public final zzaf zza(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return zza(j, str, 1L, false, false, z3, false, z5);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzaf zza(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Cursor cursor;
        Cursor cursor2;
        Preconditions.checkNotEmpty(str);
        zzc();
        zzaj();
        String[] strArr = {str};
        zzaf zzafVar = new zzaf();
        try {
            try {
                SQLiteDatabase c_ = c_();
                cursor2 = c_.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (!cursor2.moveToFirst()) {
                        zzq().zzh().zza("Not updating daily counts, app is not known. appId", zzex.zza(str));
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        return zzafVar;
                    }
                    if (cursor2.getLong(0) == j) {
                        zzafVar.zzb = cursor2.getLong(1);
                        zzafVar.zza = cursor2.getLong(2);
                        zzafVar.zzc = cursor2.getLong(3);
                        zzafVar.zzd = cursor2.getLong(4);
                        zzafVar.zze = cursor2.getLong(5);
                    }
                    if (z) {
                        zzafVar.zzb += j2;
                    }
                    if (z2) {
                        zzafVar.zza += j2;
                    }
                    if (z3) {
                        zzafVar.zzc += j2;
                    }
                    if (z4) {
                        zzafVar.zzd += j2;
                    }
                    if (z5) {
                        zzafVar.zze += j2;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(zzafVar.zza));
                    contentValues.put("daily_events_count", Long.valueOf(zzafVar.zzb));
                    contentValues.put("daily_conversions_count", Long.valueOf(zzafVar.zzc));
                    contentValues.put("daily_error_events_count", Long.valueOf(zzafVar.zzd));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(zzafVar.zze));
                    c_.update("apps", contentValues, "app_id=?", strArr);
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return zzafVar;
                } catch (SQLiteException e) {
                    e = e;
                    zzq().zze().zza("Error updating daily counts. appId", zzex.zza(str), e);
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return zzafVar;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor2 = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            if (0 != 0) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] zzd(String str) {
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        zzc();
        zzaj();
        Cursor cursor2 = null;
        try {
            cursor = c_().query("apps", new String[]{"remote_config"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    byte[] blob = cursor.getBlob(0);
                    if (cursor.moveToNext()) {
                        zzq().zze().zza("Got multiple records for app config, expected one. appId", zzex.zza(str));
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return blob;
                } catch (SQLiteException e) {
                    e = e;
                    zzq().zze().zza("Error querying remote config. appId", zzex.zza(str), e);
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

    public final boolean zza(zzcd.zzg zzgVar, boolean z) {
        zzc();
        zzaj();
        Preconditions.checkNotNull(zzgVar);
        Preconditions.checkNotEmpty(zzgVar.zzx());
        Preconditions.checkState(zzgVar.zzk());
        zzu();
        long currentTimeMillis = zzl().currentTimeMillis();
        if (zzgVar.zzl() < currentTimeMillis - zzy.zzi() || zzgVar.zzl() > zzy.zzi() + currentTimeMillis) {
            zzq().zzh().zza("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzex.zza(zzgVar.zzx()), Long.valueOf(currentTimeMillis), Long.valueOf(zzgVar.zzl()));
        }
        try {
            byte[] zzc2 = f_().zzc(zzgVar.zzbk());
            zzq().zzw().zza("Saving bundle, size", Integer.valueOf(zzc2.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzgVar.zzx());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzgVar.zzl()));
            contentValues.put(DataSchemeDataSource.SCHEME_DATA, zzc2);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (zzgVar.zzaz()) {
                contentValues.put("retry_count", Integer.valueOf(zzgVar.zzba()));
            }
            try {
                if (c_().insert("queue", null, contentValues) == -1) {
                    zzq().zze().zza("Failed to insert bundle (got -1). appId", zzex.zza(zzgVar.zzx()));
                    return false;
                }
                return true;
            } catch (SQLiteException e) {
                zzq().zze().zza("Error storing bundle. appId", zzex.zza(zzgVar.zzx()), e);
                return false;
            }
        } catch (IOException e2) {
            zzq().zze().zza("Data loss. Failed to serialize bundle. appId", zzex.zza(zzgVar.zzx()), e2);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String d_() {
        Throwable th;
        Cursor cursor;
        try {
            cursor = c_().rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    String string = cursor.getString(0);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return string;
                } catch (SQLiteException e) {
                    e = e;
                    zzq().zze().zza("Database error getting next bundle app id", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
            }
            throw th;
        }
    }

    public final boolean e_() {
        return zzb("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    public final List<Pair<zzcd.zzg, Long>> zza(String str, int i, int i2) {
        byte[] zzb2;
        zzc();
        zzaj();
        Preconditions.checkArgument(i > 0);
        Preconditions.checkArgument(i2 > 0);
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = c_().query("queue", new String[]{"rowid", DataSchemeDataSource.SCHEME_DATA, "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i));
                if (!query.moveToFirst()) {
                    List<Pair<zzcd.zzg, Long>> emptyList = Collections.emptyList();
                    if (query != null) {
                        query.close();
                    }
                    return emptyList;
                }
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                do {
                    long j = query.getLong(0);
                    try {
                        zzb2 = f_().zzb(query.getBlob(1));
                    } catch (IOException e) {
                        zzq().zze().zza("Failed to unzip queued bundle. appId", zzex.zza(str), e);
                    }
                    if (!arrayList.isEmpty() && zzb2.length + i3 > i2) {
                        break;
                    }
                    try {
                        zzcd.zzg.zza zzaVar = (zzcd.zzg.zza) zzkt.zza(zzcd.zzg.zzbh(), zzb2);
                        if (!query.isNull(2)) {
                            zzaVar.zzi(query.getInt(2));
                        }
                        i3 += zzb2.length;
                        arrayList.add(Pair.create((zzcd.zzg) ((com.google.android.gms.internal.measurement.zzhv) zzaVar.zzy()), Long.valueOf(j)));
                    } catch (IOException e2) {
                        zzq().zze().zza("Failed to merge queued bundle. appId", zzex.zza(str), e2);
                    }
                    if (!query.moveToNext()) {
                        break;
                    }
                } while (i3 <= i2);
                if (query != null) {
                    query.close();
                }
                return arrayList;
            } catch (SQLiteException e3) {
                zzq().zze().zza("Error querying bundles. appId", zzex.zza(str), e3);
                List<Pair<zzcd.zzg, Long>> emptyList2 = Collections.emptyList();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyList2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzu() {
        int delete;
        zzc();
        zzaj();
        if (zzal()) {
            long zza = zzr().zzf.zza();
            long elapsedRealtime = zzl().elapsedRealtime();
            if (Math.abs(elapsedRealtime - zza) > zzat.zzx.zza(null).longValue()) {
                zzr().zzf.zza(elapsedRealtime);
                zzc();
                zzaj();
                if (!zzal() || (delete = c_().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzl().currentTimeMillis()), String.valueOf(zzy.zzi())})) <= 0) {
                    return;
                }
                zzq().zzw().zza("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(List<Long> list) {
        zzc();
        zzaj();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzal()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (zzb(sb3.toString(), (String[]) null) > 0) {
                zzq().zzh().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase c_ = c_();
                StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                c_.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                zzq().zze().zza("Error incrementing retry count. error", e);
            }
        }
    }

    private final boolean zza(String str, int i, zzbv.zzb zzbVar) {
        zzaj();
        zzc();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzbVar);
        if (TextUtils.isEmpty(zzbVar.zzc())) {
            zzq().zzh().zza("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzex.zza(str), Integer.valueOf(i), String.valueOf(zzbVar.zza() ? Integer.valueOf(zzbVar.zzb()) : null));
            return false;
        }
        byte[] zzbk = zzbVar.zzbk();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", zzbVar.zza() ? Integer.valueOf(zzbVar.zzb()) : null);
        contentValues.put("event_name", zzbVar.zzc());
        contentValues.put("session_scoped", zzbVar.zzj() ? Boolean.valueOf(zzbVar.zzk()) : null);
        contentValues.put(DataSchemeDataSource.SCHEME_DATA, zzbk);
        try {
            if (c_().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                zzq().zze().zza("Failed to insert event filter (got -1). appId", zzex.zza(str));
                return true;
            }
            return true;
        } catch (SQLiteException e) {
            zzq().zze().zza("Error storing event filter. appId", zzex.zza(str), e);
            return false;
        }
    }

    private final boolean zza(String str, int i, zzbv.zze zzeVar) {
        zzaj();
        zzc();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzeVar);
        if (TextUtils.isEmpty(zzeVar.zzc())) {
            zzq().zzh().zza("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzex.zza(str), Integer.valueOf(i), String.valueOf(zzeVar.zza() ? Integer.valueOf(zzeVar.zzb()) : null));
            return false;
        }
        byte[] zzbk = zzeVar.zzbk();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", zzeVar.zza() ? Integer.valueOf(zzeVar.zzb()) : null);
        contentValues.put("property_name", zzeVar.zzc());
        contentValues.put("session_scoped", zzeVar.zzg() ? Boolean.valueOf(zzeVar.zzh()) : null);
        contentValues.put(DataSchemeDataSource.SCHEME_DATA, zzbk);
        try {
            if (c_().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                zzq().zze().zza("Failed to insert property filter (got -1). appId", zzex.zza(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            zzq().zze().zza("Error storing property filter. appId", zzex.zza(str), e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<Integer, List<zzbv.zzb>> zzf(String str, String str2) {
        Cursor cursor;
        zzaj();
        zzc();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        ArrayMap arrayMap = new ArrayMap();
        ?? r9 = 0;
        try {
            try {
                cursor = c_().query("event_filters", new String[]{"audience_id", DataSchemeDataSource.SCHEME_DATA}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursor.moveToFirst()) {
                        Map<Integer, List<zzbv.zzb>> emptyMap = Collections.emptyMap();
                        if (cursor != null) {
                            cursor.close();
                        }
                        return emptyMap;
                    }
                    do {
                        try {
                            zzbv.zzb zzbVar = (zzbv.zzb) ((com.google.android.gms.internal.measurement.zzhv) ((zzbv.zzb.zza) zzkt.zza(zzbv.zzb.zzl(), cursor.getBlob(1))).zzy());
                            int i = cursor.getInt(0);
                            List list = (List) arrayMap.get(Integer.valueOf(i));
                            if (list == null) {
                                list = new ArrayList();
                                arrayMap.put(Integer.valueOf(i), list);
                            }
                            list.add(zzbVar);
                        } catch (IOException e) {
                            zzq().zze().zza("Failed to merge filter. appId", zzex.zza(str), e);
                        }
                    } while (cursor.moveToNext());
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayMap;
                } catch (SQLiteException e2) {
                    e = e2;
                    zzq().zze().zza("Database error querying filters. appId", zzex.zza(str), e);
                    if (!zzmy.zzb() || !zzs().zze(str, zzat.zzcm)) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    Map<Integer, List<zzbv.zzb>> emptyMap2 = Collections.emptyMap();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return emptyMap2;
                }
            } catch (Throwable th) {
                th = th;
                r9 = str2;
                if (r9 != 0) {
                    r9.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r9 != 0) {
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<Integer, List<zzbv.zzb>> zze(String str) {
        Preconditions.checkNotEmpty(str);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor query = c_().query("event_filters", new String[]{"audience_id", DataSchemeDataSource.SCHEME_DATA}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzbv.zzb>> emptyMap = Collections.emptyMap();
                    if (query != null) {
                        query.close();
                    }
                    return emptyMap;
                }
                do {
                    try {
                        zzbv.zzb zzbVar = (zzbv.zzb) ((com.google.android.gms.internal.measurement.zzhv) ((zzbv.zzb.zza) zzkt.zza(zzbv.zzb.zzl(), query.getBlob(1))).zzy());
                        if (zzbVar.zzf()) {
                            int i = query.getInt(0);
                            List list = (List) arrayMap.get(Integer.valueOf(i));
                            if (list == null) {
                                list = new ArrayList();
                                arrayMap.put(Integer.valueOf(i), list);
                            }
                            list.add(zzbVar);
                        }
                    } catch (IOException e) {
                        zzq().zze().zza("Failed to merge filter. appId", zzex.zza(str), e);
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return arrayMap;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            zzq().zze().zza("Database error querying filters. appId", zzex.zza(str), e2);
            Map<Integer, List<zzbv.zzb>> emptyMap2 = Collections.emptyMap();
            if (0 != 0) {
                cursor.close();
            }
            return emptyMap2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<Integer, List<zzbv.zze>> zzg(String str, String str2) {
        Cursor cursor;
        zzaj();
        zzc();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        ArrayMap arrayMap = new ArrayMap();
        ?? r9 = 0;
        try {
            try {
                cursor = c_().query("property_filters", new String[]{"audience_id", DataSchemeDataSource.SCHEME_DATA}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursor.moveToFirst()) {
                        Map<Integer, List<zzbv.zze>> emptyMap = Collections.emptyMap();
                        if (cursor != null) {
                            cursor.close();
                        }
                        return emptyMap;
                    }
                    do {
                        try {
                            zzbv.zze zzeVar = (zzbv.zze) ((com.google.android.gms.internal.measurement.zzhv) ((zzbv.zze.zza) zzkt.zza(zzbv.zze.zzi(), cursor.getBlob(1))).zzy());
                            int i = cursor.getInt(0);
                            List list = (List) arrayMap.get(Integer.valueOf(i));
                            if (list == null) {
                                list = new ArrayList();
                                arrayMap.put(Integer.valueOf(i), list);
                            }
                            list.add(zzeVar);
                        } catch (IOException e) {
                            zzq().zze().zza("Failed to merge filter", zzex.zza(str), e);
                        }
                    } while (cursor.moveToNext());
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayMap;
                } catch (SQLiteException e2) {
                    e = e2;
                    zzq().zze().zza("Database error querying filters. appId", zzex.zza(str), e);
                    if (!zzmy.zzb() || !zzs().zze(str, zzat.zzcm)) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    Map<Integer, List<zzbv.zze>> emptyMap2 = Collections.emptyMap();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return emptyMap2;
                }
            } catch (Throwable th) {
                th = th;
                r9 = str2;
                if (r9 != 0) {
                    r9.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r9 != 0) {
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<Integer, List<Integer>> zzf(String str) {
        Cursor cursor;
        zzaj();
        zzc();
        Preconditions.checkNotEmpty(str);
        ArrayMap arrayMap = new ArrayMap();
        SQLiteDatabase c_ = c_();
        ?? r2 = 0;
        try {
            try {
                cursor = c_.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
                try {
                    if (!cursor.moveToFirst()) {
                        Map<Integer, List<Integer>> emptyMap = Collections.emptyMap();
                        if (cursor != null) {
                            cursor.close();
                        }
                        return emptyMap;
                    }
                    do {
                        int i = cursor.getInt(0);
                        List list = (List) arrayMap.get(Integer.valueOf(i));
                        if (list == null) {
                            list = new ArrayList();
                            arrayMap.put(Integer.valueOf(i), list);
                        }
                        list.add(Integer.valueOf(cursor.getInt(1)));
                    } while (cursor.moveToNext());
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayMap;
                } catch (SQLiteException e) {
                    e = e;
                    zzq().zze().zza("Database error querying scoped filters. appId", zzex.zza(str), e);
                    if (!zzmy.zzb() || !zzs().zze(str, zzat.zzcm)) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    Map<Integer, List<Integer>> emptyMap2 = Collections.emptyMap();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return emptyMap2;
                }
            } catch (Throwable th) {
                th = th;
                r2 = c_;
                if (r2 != 0) {
                    r2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r2 != 0) {
            }
            throw th;
        }
    }

    private final boolean zzb(String str, List<Integer> list) {
        Preconditions.checkNotEmpty(str);
        zzaj();
        zzc();
        SQLiteDatabase c_ = c_();
        try {
            long zzb2 = zzb("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, zzs().zzb(str, zzat.zzae)));
            if (zzb2 <= max) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = list.get(i);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 140);
            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb3.append(sb2);
            sb3.append(" order by rowid desc limit -1 offset ?)");
            return c_.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e) {
            zzq().zze().zza("Database error querying filters. appId", zzex.zza(str), e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<Integer, zzcd.zzi> zzg(String str) {
        Cursor cursor;
        zzaj();
        zzc();
        Preconditions.checkNotEmpty(str);
        SQLiteDatabase c_ = c_();
        ?? r8 = 0;
        try {
            try {
                cursor = c_.query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (!cursor.moveToFirst()) {
                        if (!zzmy.zzb() || !zzs().zze(str, zzat.zzcm)) {
                            if (cursor != null) {
                                cursor.close();
                            }
                            return null;
                        }
                        Map<Integer, zzcd.zzi> emptyMap = Collections.emptyMap();
                        if (cursor != null) {
                            cursor.close();
                        }
                        return emptyMap;
                    }
                    ArrayMap arrayMap = new ArrayMap();
                    do {
                        int i = cursor.getInt(0);
                        try {
                            arrayMap.put(Integer.valueOf(i), (zzcd.zzi) ((com.google.android.gms.internal.measurement.zzhv) ((zzcd.zzi.zza) zzkt.zza(zzcd.zzi.zzi(), cursor.getBlob(1))).zzy()));
                        } catch (IOException e) {
                            zzq().zze().zza("Failed to merge filter results. appId, audienceId, error", zzex.zza(str), Integer.valueOf(i), e);
                        }
                    } while (cursor.moveToNext());
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayMap;
                } catch (SQLiteException e2) {
                    e = e2;
                    zzq().zze().zza("Database error querying filter results. appId", zzex.zza(str), e);
                    if (!zzmy.zzb() || !zzs().zze(str, zzat.zzcm)) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    Map<Integer, zzcd.zzi> emptyMap2 = Collections.emptyMap();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return emptyMap2;
                }
            } catch (Throwable th) {
                th = th;
                r8 = c_;
                if (r8 != 0) {
                    r8.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r8 != 0) {
            }
            throw th;
        }
    }

    private static void zza(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    private final Object zza(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            zzq().zze().zza("Loaded invalid null value from database");
            return null;
        } else if (type != 1) {
            if (type != 2) {
                if (type != 3) {
                    if (type == 4) {
                        zzq().zze().zza("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    zzq().zze().zza("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                    return null;
                }
                return cursor.getString(i);
            }
            return Double.valueOf(cursor.getDouble(i));
        } else {
            return Long.valueOf(cursor.getLong(i));
        }
    }

    public final long zzv() {
        return zza("select max(bundle_end_timestamp) from queue", (String[]) null, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzh(String str, String str2) {
        long zza;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzc();
        zzaj();
        SQLiteDatabase c_ = c_();
        c_.beginTransaction();
        long j = 0;
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
            sb.append("select ");
            sb.append(str2);
            sb.append(" from app2 where app_id=?");
            try {
                try {
                    zza = zza(sb.toString(), new String[]{str}, -1L);
                    if (zza == -1) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("app_id", str);
                        contentValues.put("first_open_count", (Integer) 0);
                        contentValues.put("previous_install_count", (Integer) 0);
                        if (c_.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                            zzq().zze().zza("Failed to insert column (got -1). appId", zzex.zza(str), str2);
                            c_.endTransaction();
                            return -1L;
                        }
                        zza = 0;
                    }
                } catch (SQLiteException e) {
                    e = e;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put(str2, Long.valueOf(1 + zza));
                    if (c_.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        zzq().zze().zza("Failed to update column (got 0). appId", zzex.zza(str), str2);
                        c_.endTransaction();
                        return -1L;
                    }
                    c_.setTransactionSuccessful();
                    c_.endTransaction();
                    return zza;
                } catch (SQLiteException e2) {
                    e = e2;
                    j = zza;
                    zzq().zze().zza("Error inserting column. appId", zzex.zza(str), str2, e);
                    c_.endTransaction();
                    return j;
                }
            } catch (Throwable th) {
                th = th;
                c_.endTransaction();
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final long zzw() {
        return zza("select max(timestamp) from raw_events", (String[]) null, 0L);
    }

    public final long zza(zzcd.zzg zzgVar) throws IOException {
        zzc();
        zzaj();
        Preconditions.checkNotNull(zzgVar);
        Preconditions.checkNotEmpty(zzgVar.zzx());
        byte[] zzbk = zzgVar.zzbk();
        long zza = f_().zza(zzbk);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzgVar.zzx());
        contentValues.put("metadata_fingerprint", Long.valueOf(zza));
        contentValues.put(TtmlNode.TAG_METADATA, zzbk);
        try {
            c_().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return zza;
        } catch (SQLiteException e) {
            zzq().zze().zza("Error storing raw event metadata. appId", zzex.zza(zzgVar.zzx()), e);
            throw e;
        }
    }

    public final boolean zzx() {
        return zzb("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    public final boolean zzy() {
        return zzb("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    public final long zzh(String str) {
        Preconditions.checkNotEmpty(str);
        return zza("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zza(long j) {
        Cursor cursor;
        zzc();
        zzaj();
        Cursor cursor2 = null;
        try {
            try {
                cursor = c_().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(j)});
                try {
                    if (!cursor.moveToFirst()) {
                        zzq().zzw().zza("No expired configs for apps with pending events");
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    String string = cursor.getString(0);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return string;
                } catch (SQLiteException e) {
                    e = e;
                    zzq().zze().zza("Error selecting expired configs", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = j;
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

    public final long zzz() {
        Cursor cursor = null;
        try {
            try {
                cursor = c_().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return -1L;
                }
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e) {
                zzq().zze().zza("Error querying raw events", e);
                if (cursor != null) {
                    cursor.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0091: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:32:0x0091 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<zzcd.zzc, Long> zza(String str, Long l) {
        Cursor cursor;
        Cursor cursor2;
        zzc();
        zzaj();
        Cursor cursor3 = null;
        try {
            try {
                cursor = c_().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, String.valueOf(l)});
                try {
                    if (!cursor.moveToFirst()) {
                        zzq().zzw().zza("Main event not found");
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    try {
                        Pair<zzcd.zzc, Long> create = Pair.create((zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) ((zzcd.zzc.zza) zzkt.zza(zzcd.zzc.zzj(), cursor.getBlob(0))).zzy()), Long.valueOf(cursor.getLong(1)));
                        if (cursor != null) {
                            cursor.close();
                        }
                        return create;
                    } catch (IOException e) {
                        zzq().zze().zza("Failed to merge main event. appId, eventId", zzex.zza(str), l, e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    zzq().zze().zza("Error selecting main event", e);
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

    public final boolean zza(String str, Long l, long j, zzcd.zzc zzcVar) {
        zzc();
        zzaj();
        Preconditions.checkNotNull(zzcVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        byte[] zzbk = zzcVar.zzbk();
        zzq().zzw().zza("Saving complex main event, appId, data size", zzn().zza(str), Integer.valueOf(zzbk.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", zzbk);
        try {
            if (c_().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                zzq().zze().zza("Failed to insert complex main event (got -1). appId", zzex.zza(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            zzq().zze().zza("Error storing complex main event. appId", zzex.zza(str), e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(String str, Bundle bundle) {
        zzc();
        zzaj();
        byte[] zzbk = f_().zza(new zzak(this.zzy, "", str, "dep", 0L, 0L, bundle)).zzbk();
        zzq().zzw().zza("Saving default event parameters, appId, data size", zzn().zza(str), Integer.valueOf(zzbk.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", zzbk);
        try {
            if (c_().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                zzq().zze().zza("Failed to insert default event parameters (got -1). appId", zzex.zza(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            zzq().zze().zza("Error storing default event parameters. appId", zzex.zza(str), e);
            return false;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00d6: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:47:0x00d6 */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle zzi(String str) {
        Cursor cursor;
        Cursor cursor2;
        zzc();
        zzaj();
        Cursor cursor3 = null;
        try {
            try {
                cursor = c_().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (!cursor.moveToFirst()) {
                        zzq().zzw().zza("Default event parameters not found");
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    try {
                        zzcd.zzc zzcVar = (zzcd.zzc) ((com.google.android.gms.internal.measurement.zzhv) ((zzcd.zzc.zza) zzkt.zza(zzcd.zzc.zzj(), cursor.getBlob(0))).zzy());
                        f_();
                        List<zzcd.zze> zza = zzcVar.zza();
                        Bundle bundle = new Bundle();
                        for (zzcd.zze zzeVar : zza) {
                            String zzb2 = zzeVar.zzb();
                            if (zzeVar.zzi()) {
                                bundle.putDouble(zzb2, zzeVar.zzj());
                            } else if (zzeVar.zzg()) {
                                bundle.putFloat(zzb2, zzeVar.zzh());
                            } else if (zzeVar.zzc()) {
                                bundle.putString(zzb2, zzeVar.zzd());
                            } else if (zzeVar.zze()) {
                                bundle.putLong(zzb2, zzeVar.zzf());
                            }
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        return bundle;
                    } catch (IOException e) {
                        zzq().zze().zza("Failed to retrieve default event parameters. appId", zzex.zza(str), e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    zzq().zze().zza("Error selecting default event parameters", e);
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

    public final zzad zzj(String str) {
        Preconditions.checkNotNull(str);
        zzc();
        zzaj();
        return zzad.zza(zza("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str}, "G1"));
    }

    public final boolean zza(zzak zzakVar, long j, boolean z) {
        zzc();
        zzaj();
        Preconditions.checkNotNull(zzakVar);
        Preconditions.checkNotEmpty(zzakVar.zza);
        byte[] zzbk = f_().zza(zzakVar).zzbk();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzakVar.zza);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzakVar.zzb);
        contentValues.put("timestamp", Long.valueOf(zzakVar.zzc));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put(DataSchemeDataSource.SCHEME_DATA, zzbk);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (c_().insert("raw_events", null, contentValues) == -1) {
                zzq().zze().zza("Failed to insert raw event (got -1). appId", zzex.zza(zzakVar.zza));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            zzq().zze().zza("Error storing raw event. appId", zzex.zza(zzakVar.zza), e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(String str, List<zzbv.zza> list) {
        boolean z;
        boolean z2;
        Preconditions.checkNotNull(list);
        for (int i = 0; i < list.size(); i++) {
            zzbv.zza.C0016zza zzbo = list.get(i).zzbo();
            if (zzbo.zzb() != 0) {
                for (int i2 = 0; i2 < zzbo.zzb(); i2++) {
                    zzbv.zzb.zza zzbo2 = zzbo.zzb(i2).zzbo();
                    zzbv.zzb.zza zzaVar = (zzbv.zzb.zza) ((zzhv.zzb) zzbo2.clone());
                    String zzb2 = zzgy.zzb(zzbo2.zza());
                    if (zzb2 != null) {
                        zzaVar.zza(zzb2);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    for (int i3 = 0; i3 < zzbo2.zzb(); i3++) {
                        zzbv.zzc zza = zzbo2.zza(i3);
                        String zza2 = zzhb.zza(zza.zzh());
                        if (zza2 != null) {
                            zzaVar.zza(i3, (zzbv.zzc) ((com.google.android.gms.internal.measurement.zzhv) zza.zzbo().zza(zza2).zzy()));
                            z2 = true;
                        }
                    }
                    if (z2) {
                        zzbo = zzbo.zza(i2, zzaVar);
                        list.set(i, (zzbv.zza) ((com.google.android.gms.internal.measurement.zzhv) zzbo.zzy()));
                    }
                }
            }
            if (zzbo.zza() != 0) {
                for (int i4 = 0; i4 < zzbo.zza(); i4++) {
                    zzbv.zze zza3 = zzbo.zza(i4);
                    String zza4 = zzha.zza(zza3.zzc());
                    if (zza4 != null) {
                        zzbo = zzbo.zza(i4, zza3.zzbo().zza(zza4));
                        list.set(i, (zzbv.zza) ((com.google.android.gms.internal.measurement.zzhv) zzbo.zzy()));
                    }
                }
            }
        }
        zzaj();
        zzc();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        SQLiteDatabase c_ = c_();
        c_.beginTransaction();
        try {
            zzaj();
            zzc();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase c_2 = c_();
            c_2.delete("property_filters", "app_id=?", new String[]{str});
            c_2.delete("event_filters", "app_id=?", new String[]{str});
            for (zzbv.zza zzaVar2 : list) {
                zzaj();
                zzc();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzaVar2);
                if (!zzaVar2.zza()) {
                    zzq().zzh().zza("Audience with no ID. appId", zzex.zza(str));
                } else {
                    int zzb3 = zzaVar2.zzb();
                    Iterator<zzbv.zzb> it = zzaVar2.zze().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().zza()) {
                                zzq().zzh().zza("Event filter with no ID. Audience definition ignored. appId, audienceId", zzex.zza(str), Integer.valueOf(zzb3));
                                break;
                            }
                        } else {
                            Iterator<zzbv.zze> it2 = zzaVar2.zzc().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!it2.next().zza()) {
                                        zzq().zzh().zza("Property filter with no ID. Audience definition ignored. appId, audienceId", zzex.zza(str), Integer.valueOf(zzb3));
                                        break;
                                    }
                                } else {
                                    Iterator<zzbv.zzb> it3 = zzaVar2.zze().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!zza(str, zzb3, it3.next())) {
                                                z = false;
                                                break;
                                            }
                                        } else {
                                            z = true;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        Iterator<zzbv.zze> it4 = zzaVar2.zzc().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                if (!zza(str, zzb3, it4.next())) {
                                                    z = false;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        zzaj();
                                        zzc();
                                        Preconditions.checkNotEmpty(str);
                                        SQLiteDatabase c_3 = c_();
                                        c_3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(zzb3)});
                                        c_3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(zzb3)});
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (zzbv.zza zzaVar3 : list) {
                arrayList.add(zzaVar3.zza() ? Integer.valueOf(zzaVar3.zzb()) : null);
            }
            zzb(str, arrayList);
            c_.setTransactionSuccessful();
        } finally {
            c_.endTransaction();
        }
    }

    private final boolean zzal() {
        return zzm().getDatabasePath("google_app_measurement.db").exists();
    }
}
