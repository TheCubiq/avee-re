package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzet extends zzg {
    private final zzes zza;
    private boolean zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzet(zzgb zzgbVar) {
        super(zzgbVar);
        this.zza = new zzes(this, zzm(), "google_app_measurement_local.db");
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzy() {
        return false;
    }

    public final void zzaa() {
        zzc();
        try {
            int delete = zzad().delete("messages", null, null) + 0;
            if (delete > 0) {
                zzq().zzw().zza("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            zzq().zze().zza("Error resetting local analytics data. error", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0125  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zza(int i, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        zzc();
        ?? r2 = 0;
        if (this.zzb) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("entry", bArr);
        int i2 = 0;
        int i3 = 5;
        for (int i4 = 5; i2 < i4; i4 = 5) {
            Cursor cursor2 = null;
            r7 = null;
            cursor2 = null;
            Cursor cursor3 = null;
            cursor2 = null;
            SQLiteDatabase sQLiteDatabase2 = null;
            try {
                sQLiteDatabase = zzad();
                try {
                    if (sQLiteDatabase == null) {
                        this.zzb = true;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                        return r2;
                    }
                    sQLiteDatabase.beginTransaction();
                    long j = 0;
                    cursor = sQLiteDatabase.rawQuery("select count(1) from messages", null);
                    if (cursor != null) {
                        try {
                            if (cursor.moveToFirst()) {
                                j = cursor.getLong(r2);
                            }
                        } catch (SQLiteDatabaseLockedException unused) {
                            cursor3 = cursor;
                            SystemClock.sleep(i3);
                            i3 += 20;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            i2++;
                            r2 = 0;
                        } catch (SQLiteFullException e) {
                            e = e;
                            cursor2 = cursor;
                            try {
                                zzq().zze().zza("Error writing entry; local database full", e);
                                this.zzb = true;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                                i2++;
                                r2 = 0;
                            } catch (Throwable th) {
                                th = th;
                                if (cursor2 != null) {
                                }
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            sQLiteDatabase2 = sQLiteDatabase;
                            if (sQLiteDatabase2 != null) {
                                try {
                                    if (sQLiteDatabase2.inTransaction()) {
                                        sQLiteDatabase2.endTransaction();
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    cursor2 = cursor;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.close();
                                    }
                                    throw th;
                                }
                            }
                            zzq().zze().zza("Error writing entry to local database", e);
                            this.zzb = true;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabase2 != null) {
                                sQLiteDatabase2.close();
                            }
                            i2++;
                            r2 = 0;
                        } catch (Throwable th3) {
                            th = th3;
                            cursor2 = cursor;
                            if (cursor2 != null) {
                            }
                            if (sQLiteDatabase != null) {
                            }
                            throw th;
                        }
                    }
                    if (j >= 100000) {
                        zzq().zze().zza("Data loss, local db full");
                        long j2 = (100000 - j) + 1;
                        String[] strArr = new String[1];
                        strArr[r2] = Long.toString(j2);
                        long delete = sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", strArr);
                        if (delete != j2) {
                            zzq().zze().zza("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(delete), Long.valueOf(j2 - delete));
                        }
                    }
                    sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    if (cursor != 0) {
                        cursor.close();
                    }
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                        return true;
                    }
                    return true;
                } catch (SQLiteDatabaseLockedException unused2) {
                } catch (SQLiteFullException e3) {
                    e = e3;
                } catch (SQLiteException e4) {
                    e = e4;
                    cursor = null;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                sQLiteDatabase = null;
            } catch (SQLiteFullException e5) {
                e = e5;
                sQLiteDatabase = null;
            } catch (SQLiteException e6) {
                e = e6;
                cursor = null;
            } catch (Throwable th4) {
                th = th4;
                sQLiteDatabase = null;
                if (cursor2 != null) {
                }
                if (sQLiteDatabase != null) {
                }
                throw th;
            }
        }
        zzq().zzw().zza("Failed to write entry to local database");
        return false;
    }

    public final boolean zza(zzar zzarVar) {
        Parcel obtain = Parcel.obtain();
        zzarVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            zzq().zzf().zza("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return zza(0, marshall);
    }

    public final boolean zza(zzkw zzkwVar) {
        Parcel obtain = Parcel.obtain();
        zzkwVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            zzq().zzf().zza("User property too long for local database. Sending directly to service");
            return false;
        }
        return zza(1, marshall);
    }

    public final boolean zza(zzw zzwVar) {
        zzo();
        byte[] zza = zzkx.zza((Parcelable) zzwVar);
        if (zza.length > 131072) {
            zzq().zzf().zza("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return zza(2, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable>] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<AbstractSafeParcelable> zza(int i) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase2;
        SQLiteDatabase sQLiteDatabase3;
        long j;
        String str;
        String[] strArr;
        Parcel obtain;
        zzkw zzkwVar;
        zzw zzwVar;
        zzc();
        ?? r3 = 0;
        if (this.zzb) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (zzae()) {
            int i2 = 0;
            int i3 = 5;
            for (int i4 = 5; i2 < i4; i4 = 5) {
                try {
                    sQLiteDatabase = zzad();
                    try {
                        if (sQLiteDatabase == null) {
                            this.zzb = true;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            return r3;
                        }
                        try {
                            sQLiteDatabase.beginTransaction();
                            long zza = zza(sQLiteDatabase);
                            j = -1;
                            if (zza != -1) {
                                try {
                                    str = "rowid<?";
                                    strArr = new String[]{String.valueOf(zza)};
                                } catch (SQLiteFullException e) {
                                    e = e;
                                    cursor = r3;
                                    zzq().zze().zza("Error reading entries from local database", e);
                                    this.zzb = true;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.close();
                                    }
                                    i2++;
                                    r3 = 0;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    cursor = r3;
                                    if (sQLiteDatabase != null) {
                                        try {
                                            if (sQLiteDatabase.inTransaction()) {
                                                sQLiteDatabase.endTransaction();
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            r3 = cursor;
                                            if (r3 != 0) {
                                                r3.close();
                                            }
                                            if (sQLiteDatabase != null) {
                                                sQLiteDatabase.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    zzq().zze().zza("Error reading entries from local database", e);
                                    this.zzb = true;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.close();
                                    }
                                    i2++;
                                    r3 = 0;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (r3 != 0) {
                                    }
                                    if (sQLiteDatabase != null) {
                                    }
                                    throw th;
                                }
                            } else {
                                str = r3;
                                strArr = str;
                            }
                            sQLiteDatabase3 = sQLiteDatabase;
                        } catch (SQLiteFullException e3) {
                            e = e3;
                        } catch (SQLiteException e4) {
                            e = e4;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        try {
                            cursor = sQLiteDatabase.query("messages", new String[]{"rowid", "type", "entry"}, str, strArr, null, null, "rowid asc", Integer.toString(100));
                            while (cursor.moveToNext()) {
                                try {
                                    j = cursor.getLong(0);
                                    int i5 = cursor.getInt(1);
                                    byte[] blob = cursor.getBlob(2);
                                    if (i5 == 0) {
                                        obtain = Parcel.obtain();
                                        try {
                                            try {
                                                obtain.unmarshall(blob, 0, blob.length);
                                                obtain.setDataPosition(0);
                                                zzar createFromParcel = zzar.CREATOR.createFromParcel(obtain);
                                                if (createFromParcel != null) {
                                                    arrayList.add(createFromParcel);
                                                }
                                            } finally {
                                            }
                                        } catch (SafeParcelReader.ParseException unused) {
                                            zzq().zze().zza("Failed to load event from local database");
                                            obtain.recycle();
                                        }
                                    } else if (i5 == 1) {
                                        obtain = Parcel.obtain();
                                        try {
                                            try {
                                                obtain.unmarshall(blob, 0, blob.length);
                                                obtain.setDataPosition(0);
                                                zzkwVar = zzkw.CREATOR.createFromParcel(obtain);
                                            } finally {
                                            }
                                        } catch (SafeParcelReader.ParseException unused2) {
                                            zzq().zze().zza("Failed to load user property from local database");
                                            obtain.recycle();
                                            zzkwVar = null;
                                        }
                                        if (zzkwVar != null) {
                                            arrayList.add(zzkwVar);
                                        }
                                    } else if (i5 == 2) {
                                        obtain = Parcel.obtain();
                                        try {
                                            try {
                                                obtain.unmarshall(blob, 0, blob.length);
                                                obtain.setDataPosition(0);
                                                zzwVar = zzw.CREATOR.createFromParcel(obtain);
                                            } catch (SafeParcelReader.ParseException unused3) {
                                                zzq().zze().zza("Failed to load conditional user property from local database");
                                                obtain.recycle();
                                                zzwVar = null;
                                            }
                                            if (zzwVar != null) {
                                                arrayList.add(zzwVar);
                                            }
                                        } finally {
                                        }
                                    } else if (i5 == 3) {
                                        zzq().zzh().zza("Skipping app launch break");
                                    } else {
                                        zzq().zze().zza("Unknown record type in local database");
                                    }
                                } catch (SQLiteDatabaseLockedException unused4) {
                                    sQLiteDatabase2 = sQLiteDatabase3;
                                    SystemClock.sleep(i3);
                                    i3 += 20;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase2 == null) {
                                        sQLiteDatabase2.close();
                                    }
                                    i2++;
                                    r3 = 0;
                                } catch (SQLiteFullException e5) {
                                    e = e5;
                                    sQLiteDatabase = sQLiteDatabase3;
                                    zzq().zze().zza("Error reading entries from local database", e);
                                    this.zzb = true;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase != null) {
                                    }
                                    i2++;
                                    r3 = 0;
                                } catch (SQLiteException e6) {
                                    e = e6;
                                    sQLiteDatabase = sQLiteDatabase3;
                                    if (sQLiteDatabase != null) {
                                    }
                                    zzq().zze().zza("Error reading entries from local database", e);
                                    this.zzb = true;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase != null) {
                                    }
                                    i2++;
                                    r3 = 0;
                                } catch (Throwable th4) {
                                    th = th4;
                                    sQLiteDatabase = sQLiteDatabase3;
                                    r3 = cursor;
                                    if (r3 != 0) {
                                    }
                                    if (sQLiteDatabase != null) {
                                    }
                                    throw th;
                                }
                            }
                            if (sQLiteDatabase3.delete("messages", "rowid <= ?", new String[]{Long.toString(j)}) < arrayList.size()) {
                                zzq().zze().zza("Fewer entries removed from local database than expected");
                            }
                            sQLiteDatabase3.setTransactionSuccessful();
                            sQLiteDatabase3.endTransaction();
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabase3 != null) {
                                sQLiteDatabase3.close();
                            }
                            return arrayList;
                        } catch (SQLiteDatabaseLockedException unused5) {
                            sQLiteDatabase2 = sQLiteDatabase3;
                            cursor = null;
                            SystemClock.sleep(i3);
                            i3 += 20;
                            if (cursor != null) {
                            }
                            if (sQLiteDatabase2 == null) {
                            }
                            i2++;
                            r3 = 0;
                        } catch (SQLiteFullException e7) {
                            e = e7;
                            sQLiteDatabase = sQLiteDatabase3;
                            cursor = null;
                            zzq().zze().zza("Error reading entries from local database", e);
                            this.zzb = true;
                            if (cursor != null) {
                            }
                            if (sQLiteDatabase != null) {
                            }
                            i2++;
                            r3 = 0;
                        } catch (SQLiteException e8) {
                            e = e8;
                            sQLiteDatabase = sQLiteDatabase3;
                            cursor = null;
                            if (sQLiteDatabase != null) {
                            }
                            zzq().zze().zza("Error reading entries from local database", e);
                            this.zzb = true;
                            if (cursor != null) {
                            }
                            if (sQLiteDatabase != null) {
                            }
                            i2++;
                            r3 = 0;
                        } catch (Throwable th5) {
                            th = th5;
                            sQLiteDatabase = sQLiteDatabase3;
                            r3 = 0;
                            if (r3 != 0) {
                            }
                            if (sQLiteDatabase != null) {
                            }
                            throw th;
                        }
                    } catch (SQLiteDatabaseLockedException unused6) {
                        sQLiteDatabase3 = sQLiteDatabase;
                    }
                } catch (SQLiteDatabaseLockedException unused7) {
                    cursor = null;
                    sQLiteDatabase2 = null;
                } catch (SQLiteFullException e9) {
                    e = e9;
                    cursor = null;
                    sQLiteDatabase = null;
                } catch (SQLiteException e10) {
                    e = e10;
                    cursor = null;
                    sQLiteDatabase = null;
                } catch (Throwable th6) {
                    th = th6;
                    r3 = 0;
                    sQLiteDatabase = null;
                }
            }
            zzq().zzh().zza("Failed to read events from database in reasonable time");
            return null;
        }
        return arrayList;
    }

    public final boolean zzab() {
        return zza(3, new byte[0]);
    }

    public final boolean zzac() {
        zzc();
        if (!this.zzb && zzae()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase zzad = zzad();
                    if (zzad == null) {
                        this.zzb = true;
                        if (zzad != null) {
                            zzad.close();
                        }
                        return false;
                    }
                    zzad.beginTransaction();
                    zzad.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    zzad.setTransactionSuccessful();
                    zzad.endTransaction();
                    if (zzad != null) {
                        zzad.close();
                    }
                    return true;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i);
                    i += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteFullException e) {
                    zzq().zze().zza("Error deleting app launch break from local database", e);
                    this.zzb = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteException e2) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    zzq().zze().zza("Error deleting app launch break from local database", e2);
                    this.zzb = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            zzq().zzh().zza("Error deleting app launch break from local database in reasonable time");
            return false;
        }
        return false;
    }

    private static long zza(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (cursor.moveToFirst()) {
                return cursor.getLong(0);
            }
            if (cursor != null) {
                cursor.close();
                return -1L;
            }
            return -1L;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    private final SQLiteDatabase zzad() throws SQLiteException {
        if (this.zzb) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zza.getWritableDatabase();
        if (writableDatabase == null) {
            this.zzb = true;
            return null;
        }
        return writableDatabase;
    }

    private final boolean zzae() {
        return zzm().getDatabasePath("google_app_measurement_local.db").exists();
    }

    @Override // com.google.android.gms.measurement.internal.zzd, com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ void zza() {
        super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzd, com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ void zzb() {
        super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzd, com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ void zzc() {
        super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zza zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzhe zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzeq zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zziv zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzim zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzet zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzkb zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ zzal zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu, com.google.android.gms.measurement.internal.zzgw
    public final /* bridge */ /* synthetic */ Clock zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu, com.google.android.gms.measurement.internal.zzgw
    public final /* bridge */ /* synthetic */ Context zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ zzev zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ zzkx zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu, com.google.android.gms.measurement.internal.zzgw
    public final /* bridge */ /* synthetic */ zzfu zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu, com.google.android.gms.measurement.internal.zzgw
    public final /* bridge */ /* synthetic */ zzex zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ zzfj zzr() {
        return super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ zzy zzs() {
        return super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu, com.google.android.gms.measurement.internal.zzgw
    public final /* bridge */ /* synthetic */ zzx zzt() {
        return super.zzt();
    }
}
