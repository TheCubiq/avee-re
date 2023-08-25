package com.daaw;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import com.daaw.y71;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class re5 extends c86 {

    /* renamed from: c */
    public final bd5 f25219c;

    /* renamed from: d */
    public boolean f25220d;

    public re5(dr6 dr6Var) {
        super(dr6Var);
        Context mo3905d = this.f25143a.mo3905d();
        this.f25143a.m24020z();
        this.f25219c = new bd5(this, mo3905d, "google_app_measurement_local.db");
    }

    @Override // com.daaw.c86
    /* renamed from: m */
    public final boolean mo5306m() {
        return false;
    }

    /* renamed from: n */
    public final SQLiteDatabase m11366n() {
        if (this.f25220d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f25219c.getWritableDatabase();
        if (writableDatabase == null) {
            this.f25220d = true;
            return null;
        }
        return writableDatabase;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x01f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x01cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x023e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x023e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x023e A[SYNTHETIC] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m11365o(int i) {
        int i2;
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursor2;
        long j;
        String str;
        String[] strArr;
        Parcel obtain;
        SafeParcelable safeParcelable;
        hk5 m14160q;
        String str2;
        mo6991f();
        Cursor cursor3 = null;
        if (this.f25220d) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (m11362s()) {
            int i3 = 5;
            while (i2 < 5) {
                try {
                    SQLiteDatabase m11366n = m11366n();
                    if (m11366n == null) {
                        this.f25220d = true;
                        return null;
                    }
                    try {
                        m11366n.beginTransaction();
                        try {
                            try {
                                cursor2 = m11366n.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                try {
                                    long j2 = -1;
                                    if (cursor2.moveToFirst()) {
                                        j = cursor2.getLong(0);
                                        try {
                                            cursor2.close();
                                        } catch (SQLiteDatabaseLockedException unused) {
                                            sQLiteDatabase2 = m11366n;
                                            cursor = null;
                                            sQLiteDatabase = sQLiteDatabase2;
                                            SystemClock.sleep(i3);
                                            i3 += 20;
                                            if (cursor != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                        } catch (SQLiteFullException e) {
                                            e = e;
                                            sQLiteDatabase2 = m11366n;
                                            cursor = null;
                                            sQLiteDatabase = sQLiteDatabase2;
                                            this.f25143a.mo3895i().m14160q().m20652b("Error reading entries from local database", e);
                                            this.f25220d = true;
                                            if (cursor != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                            sQLiteDatabase2 = m11366n;
                                            cursor = null;
                                            sQLiteDatabase = sQLiteDatabase2;
                                            if (sQLiteDatabase != null) {
                                            }
                                            this.f25143a.mo3895i().m14160q().m20652b("Error reading entries from local database", e);
                                            this.f25220d = true;
                                            if (cursor != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteDatabase2 = m11366n;
                                            sQLiteDatabase = sQLiteDatabase2;
                                            if (cursor3 != null) {
                                            }
                                            if (sQLiteDatabase != null) {
                                            }
                                            throw th;
                                        }
                                    } else {
                                        cursor2.close();
                                        j = -1;
                                    }
                                    if (j != -1) {
                                        str = "rowid<?";
                                        strArr = new String[]{String.valueOf(j)};
                                    } else {
                                        str = null;
                                        strArr = null;
                                    }
                                    cursor = m11366n.query("messages", new String[]{"rowid", "type", "entry"}, str, strArr, null, null, "rowid asc", Integer.toString(100));
                                    while (cursor.moveToNext()) {
                                        try {
                                            j2 = cursor.getLong(0);
                                            int i4 = cursor.getInt(1);
                                            byte[] blob = cursor.getBlob(2);
                                            if (i4 == 0) {
                                                obtain = Parcel.obtain();
                                                try {
                                                    try {
                                                        obtain.unmarshall(blob, 0, blob.length);
                                                        obtain.setDataPosition(0);
                                                        safeParcelable = (zzaw) zzaw.CREATOR.createFromParcel(obtain);
                                                    } catch (y71.C3677a unused2) {
                                                        this.f25143a.mo3895i().m14160q().m20653a("Failed to load event from local database");
                                                        obtain.recycle();
                                                    }
                                                    if (safeParcelable != null) {
                                                    }
                                                } finally {
                                                }
                                            } else if (i4 == 1) {
                                                obtain = Parcel.obtain();
                                                try {
                                                    try {
                                                        obtain.unmarshall(blob, 0, blob.length);
                                                        obtain.setDataPosition(0);
                                                        safeParcelable = (zzkw) zzkw.CREATOR.createFromParcel(obtain);
                                                    } finally {
                                                    }
                                                } catch (y71.C3677a unused3) {
                                                    this.f25143a.mo3895i().m14160q().m20653a("Failed to load user property from local database");
                                                    obtain.recycle();
                                                    safeParcelable = null;
                                                }
                                                if (safeParcelable != null) {
                                                }
                                            } else if (i4 == 2) {
                                                obtain = Parcel.obtain();
                                                try {
                                                    try {
                                                        obtain.unmarshall(blob, 0, blob.length);
                                                        obtain.setDataPosition(0);
                                                        safeParcelable = (zzac) zzac.CREATOR.createFromParcel(obtain);
                                                    } finally {
                                                    }
                                                } catch (y71.C3677a unused4) {
                                                    this.f25143a.mo3895i().m14160q().m20653a("Failed to load conditional user property from local database");
                                                    obtain.recycle();
                                                    safeParcelable = null;
                                                }
                                                if (safeParcelable != null) {
                                                }
                                            } else {
                                                if (i4 == 3) {
                                                    m14160q = this.f25143a.mo3895i().m14155w();
                                                    str2 = "Skipping app launch break";
                                                } else {
                                                    m14160q = this.f25143a.mo3895i().m14160q();
                                                    str2 = "Unknown record type in local database";
                                                }
                                                m14160q.m20653a(str2);
                                            }
                                            arrayList.add(safeParcelable);
                                        } catch (SQLiteDatabaseLockedException unused5) {
                                            sQLiteDatabase2 = m11366n;
                                        } catch (SQLiteFullException e3) {
                                            e = e3;
                                            sQLiteDatabase2 = m11366n;
                                        } catch (SQLiteException e4) {
                                            e = e4;
                                            sQLiteDatabase2 = m11366n;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            sQLiteDatabase2 = m11366n;
                                        }
                                    }
                                    sQLiteDatabase2 = m11366n;
                                    try {
                                        if (sQLiteDatabase2.delete("messages", "rowid <= ?", new String[]{Long.toString(j2)}) < arrayList.size()) {
                                            this.f25143a.mo3895i().m14160q().m20653a("Fewer entries removed from local database than expected");
                                        }
                                        sQLiteDatabase2.setTransactionSuccessful();
                                        sQLiteDatabase2.endTransaction();
                                        cursor.close();
                                        sQLiteDatabase2.close();
                                        return arrayList;
                                    } catch (SQLiteDatabaseLockedException unused6) {
                                        sQLiteDatabase = sQLiteDatabase2;
                                        SystemClock.sleep(i3);
                                        i3 += 20;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        i2 = sQLiteDatabase == null ? i2 + 1 : 0;
                                        sQLiteDatabase.close();
                                    } catch (SQLiteFullException e5) {
                                        e = e5;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        this.f25143a.mo3895i().m14160q().m20652b("Error reading entries from local database", e);
                                        this.f25220d = true;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                    } catch (SQLiteException e6) {
                                        e = e6;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        if (sQLiteDatabase != null) {
                                            try {
                                                if (sQLiteDatabase.inTransaction()) {
                                                    sQLiteDatabase.endTransaction();
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                cursor3 = cursor;
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                                if (sQLiteDatabase != null) {
                                                    sQLiteDatabase.close();
                                                }
                                                throw th;
                                            }
                                        }
                                        this.f25143a.mo3895i().m14160q().m20652b("Error reading entries from local database", e);
                                        this.f25220d = true;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                    } catch (Throwable th4) {
                                        th = th4;
                                        cursor3 = cursor;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        if (cursor3 != null) {
                                        }
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    sQLiteDatabase2 = m11366n;
                                    if (cursor2 != null) {
                                        try {
                                            cursor2.close();
                                        } catch (SQLiteDatabaseLockedException unused7) {
                                            cursor = null;
                                            sQLiteDatabase = sQLiteDatabase2;
                                            SystemClock.sleep(i3);
                                            i3 += 20;
                                            if (cursor != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                        } catch (SQLiteFullException e7) {
                                            e = e7;
                                            cursor = null;
                                            sQLiteDatabase = sQLiteDatabase2;
                                            this.f25143a.mo3895i().m14160q().m20652b("Error reading entries from local database", e);
                                            this.f25220d = true;
                                            if (cursor != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                        } catch (SQLiteException e8) {
                                            e = e8;
                                            cursor = null;
                                            sQLiteDatabase = sQLiteDatabase2;
                                            if (sQLiteDatabase != null) {
                                            }
                                            this.f25143a.mo3895i().m14160q().m20652b("Error reading entries from local database", e);
                                            this.f25220d = true;
                                            if (cursor != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                        } catch (Throwable th6) {
                                            th = th6;
                                            sQLiteDatabase = sQLiteDatabase2;
                                            if (cursor3 != null) {
                                            }
                                            if (sQLiteDatabase != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    throw th;
                                    break;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                sQLiteDatabase2 = m11366n;
                                cursor2 = null;
                                if (cursor2 != null) {
                                }
                                throw th;
                                break;
                                break;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            sQLiteDatabase2 = m11366n;
                        }
                    } catch (SQLiteDatabaseLockedException unused8) {
                        sQLiteDatabase2 = m11366n;
                    } catch (SQLiteFullException e9) {
                        e = e9;
                        sQLiteDatabase2 = m11366n;
                    } catch (SQLiteException e10) {
                        e = e10;
                        sQLiteDatabase2 = m11366n;
                    } catch (Throwable th9) {
                        th = th9;
                        sQLiteDatabase2 = m11366n;
                    }
                } catch (SQLiteDatabaseLockedException unused9) {
                    cursor = null;
                    sQLiteDatabase = null;
                } catch (SQLiteFullException e11) {
                    e = e11;
                    cursor = null;
                    sQLiteDatabase = null;
                } catch (SQLiteException e12) {
                    e = e12;
                    cursor = null;
                    sQLiteDatabase = null;
                } catch (Throwable th10) {
                    th = th10;
                    sQLiteDatabase = null;
                }
            }
            this.f25143a.mo3895i().m14155w().m20653a("Failed to read events from database in reasonable time");
            return null;
        }
        return arrayList;
    }

    /* renamed from: p */
    public final void m11364p() {
        int delete;
        mo6991f();
        try {
            SQLiteDatabase m11366n = m11366n();
            if (m11366n == null || (delete = m11366n.delete("messages", null, null)) <= 0) {
                return;
            }
            this.f25143a.mo3895i().m14156v().m20652b("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e) {
            this.f25143a.mo3895i().m14160q().m20652b("Error resetting local analytics data. error", e);
        }
    }

    /* renamed from: q */
    public final boolean m11363q() {
        return m11357x(3, new byte[0]);
    }

    /* renamed from: s */
    public final boolean m11362s() {
        Context mo3905d = this.f25143a.mo3905d();
        this.f25143a.m24020z();
        return mo3905d.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* renamed from: t */
    public final boolean m11361t() {
        int i;
        mo6991f();
        if (!this.f25220d && m11362s()) {
            int i2 = 5;
            while (i < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase m11366n = m11366n();
                    if (m11366n == null) {
                        this.f25220d = true;
                        return false;
                    }
                    m11366n.beginTransaction();
                    m11366n.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    m11366n.setTransactionSuccessful();
                    m11366n.endTransaction();
                    m11366n.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i2);
                    i2 += 20;
                    i = 0 == 0 ? i + 1 : 0;
                    sQLiteDatabase.close();
                } catch (SQLiteFullException e) {
                    this.f25143a.mo3895i().m14160q().m20652b("Error deleting app launch break from local database", e);
                    this.f25220d = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
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
                    this.f25143a.mo3895i().m14160q().m20652b("Error deleting app launch break from local database", e2);
                    this.f25220d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            this.f25143a.mo3895i().m14155w().m20653a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    /* renamed from: u */
    public final boolean m11360u(zzac zzacVar) {
        byte[] m24486c0 = this.f25143a.m24045N().m24486c0(zzacVar);
        if (m24486c0.length > 131072) {
            this.f25143a.mo3895i().m14158t().m20653a("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return m11357x(2, m24486c0);
    }

    /* renamed from: v */
    public final boolean m11359v(zzaw zzawVar) {
        Parcel obtain = Parcel.obtain();
        nu2.m14781a(zzawVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.f25143a.mo3895i().m14158t().m20653a("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return m11357x(0, marshall);
    }

    /* renamed from: w */
    public final boolean m11358w(zzkw zzkwVar) {
        Parcel obtain = Parcel.obtain();
        jc8.m18604a(zzkwVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.f25143a.mo3895i().m14158t().m20653a("User property too long for local database. Sending directly to service");
            return false;
        }
        return m11357x(1, marshall);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0129  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m11357x(int i, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        mo6991f();
        ?? r2 = 0;
        if (this.f25220d) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("entry", bArr);
        this.f25143a.m24020z();
        int i2 = 0;
        int i3 = 5;
        for (int i4 = 5; i2 < i4; i4 = 5) {
            Cursor cursor2 = null;
            cursor2 = null;
            cursor2 = null;
            r8 = null;
            SQLiteDatabase sQLiteDatabase2 = null;
            try {
                sQLiteDatabase = m11366n();
                try {
                    if (sQLiteDatabase == null) {
                        this.f25220d = true;
                        return r2;
                    }
                    sQLiteDatabase.beginTransaction();
                    cursor = sQLiteDatabase.rawQuery("select count(1) from messages", null);
                    long j = 0;
                    if (cursor != null) {
                        try {
                            if (cursor.moveToFirst()) {
                                j = cursor.getLong(r2);
                            }
                        } catch (SQLiteDatabaseLockedException unused) {
                            cursor2 = cursor;
                            try {
                                SystemClock.sleep(i3);
                                i3 += 20;
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
                                    cursor2.close();
                                }
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteFullException e) {
                            e = e;
                            sQLiteDatabase2 = sQLiteDatabase;
                            this.f25143a.mo3895i().m14160q().m20652b("Error writing entry; local database full", e);
                            this.f25220d = true;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabase2 == null) {
                                i2++;
                                r2 = 0;
                            }
                            sQLiteDatabase2.close();
                            i2++;
                            r2 = 0;
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
                                    }
                                    if (sQLiteDatabase != null) {
                                    }
                                    throw th;
                                }
                            }
                            this.f25143a.mo3895i().m14160q().m20652b("Error writing entry to local database", e);
                            this.f25220d = true;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabase2 == null) {
                                i2++;
                                r2 = 0;
                            }
                            sQLiteDatabase2.close();
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
                        this.f25143a.mo3895i().m14160q().m20653a("Data loss, local db full");
                        long j2 = (100000 - j) + 1;
                        String[] strArr = new String[1];
                        strArr[r2] = Long.toString(j2);
                        long delete = sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", strArr);
                        if (delete != j2) {
                            this.f25143a.mo3895i().m14160q().m20650d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(delete), Long.valueOf(j2 - delete));
                        }
                    }
                    sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    if (cursor != 0) {
                        cursor.close();
                    }
                    sQLiteDatabase.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused2) {
                } catch (SQLiteFullException e3) {
                    e = e3;
                    cursor = null;
                } catch (SQLiteException e4) {
                    e = e4;
                    cursor = null;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                sQLiteDatabase = null;
            } catch (SQLiteFullException e5) {
                e = e5;
                cursor = null;
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
        this.f25143a.mo3895i().m14156v().m20653a("Failed to write entry to local database");
        return false;
    }
}
