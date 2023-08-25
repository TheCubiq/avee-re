package com.daaw;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;
/* loaded from: classes2.dex */
public final class re5 extends c86 {
    public final bd5 c;
    public boolean d;

    public re5(dr6 dr6Var) {
        super(dr6Var);
        Context d = this.a.d();
        this.a.z();
        this.c = new bd5(this, d, "google_app_measurement_local.db");
    }

    @Override // com.daaw.c86
    public final boolean m() {
        return false;
    }

    public final SQLiteDatabase n() {
        if (this.d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        if (writableDatabase == null) {
            this.d = true;
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List o(int r23) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.re5.o(int):java.util.List");
    }

    public final void p() {
        int delete;
        f();
        try {
            SQLiteDatabase n = n();
            if (n == null || (delete = n.delete("messages", null, null)) <= 0) {
                return;
            }
            this.a.i().v().b("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e) {
            this.a.i().q().b("Error resetting local analytics data. error", e);
        }
    }

    public final boolean q() {
        return x(3, new byte[0]);
    }

    public final boolean s() {
        Context d = this.a.d();
        this.a.z();
        return d.getDatabasePath("google_app_measurement_local.db").exists();
    }

    public final boolean t() {
        int i;
        f();
        if (!this.d && s()) {
            int i2 = 5;
            while (i < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase n = n();
                    if (n == null) {
                        this.d = true;
                        return false;
                    }
                    n.beginTransaction();
                    n.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    n.setTransactionSuccessful();
                    n.endTransaction();
                    n.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i2);
                    i2 += 20;
                    i = 0 == 0 ? i + 1 : 0;
                    sQLiteDatabase.close();
                } catch (SQLiteFullException e) {
                    this.a.i().q().b("Error deleting app launch break from local database", e);
                    this.d = true;
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
                    this.a.i().q().b("Error deleting app launch break from local database", e2);
                    this.d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            this.a.i().w().a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final boolean u(zzac zzacVar) {
        byte[] c0 = this.a.N().c0(zzacVar);
        if (c0.length > 131072) {
            this.a.i().t().a("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return x(2, c0);
    }

    public final boolean v(zzaw zzawVar) {
        Parcel obtain = Parcel.obtain();
        nu2.a(zzawVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.a.i().t().a("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return x(0, marshall);
    }

    public final boolean w(zzkw zzkwVar) {
        Parcel obtain = Parcel.obtain();
        jc8.a(zzkwVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.a.i().t().a("User property too long for local database. Sending directly to service");
            return false;
        }
        return x(1, marshall);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0129  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.re5.x(int, byte[]):boolean");
    }
}
