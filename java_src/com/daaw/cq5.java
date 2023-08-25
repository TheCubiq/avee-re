package com.daaw;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class cq5 extends SQLiteOpenHelper {

    /* renamed from: p */
    public final Context f6085p;

    /* renamed from: q */
    public final g77 f6086q;

    public cq5(Context context, g77 g77Var) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) zzba.zzc().m23658b(g93.f10378B7)).intValue());
        this.f6085p = context;
        this.f6086q = g77Var;
    }

    /* renamed from: D */
    public static /* synthetic */ void m25126D(SQLiteDatabase sQLiteDatabase, String str, p04 p04Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        m25122M(sQLiteDatabase, p04Var);
    }

    /* renamed from: L */
    public static final void m25123L(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    /* renamed from: M */
    public static void m25122M(SQLiteDatabase sQLiteDatabase, p04 p04Var) {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{"url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i] = query.getString(columnIndex);
                }
                i++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i2 = 0; i2 < count; i2++) {
                p04Var.zza(strArr[i2]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    /* renamed from: n */
    public static /* synthetic */ Void m25120n(p04 p04Var, SQLiteDatabase sQLiteDatabase) {
        m25122M(sQLiteDatabase, p04Var);
        return null;
    }

    /* renamed from: E */
    public final void m25125E(final SQLiteDatabase sQLiteDatabase, final p04 p04Var, final String str) {
        this.f6086q.execute(new Runnable() { // from class: com.daaw.tp5
            @Override // java.lang.Runnable
            public final void run() {
                cq5.m25126D(sQLiteDatabase, str, p04Var);
            }
        });
    }

    /* renamed from: K */
    public final void m25124K(final p04 p04Var, final String str) {
        m25117w(new em6() { // from class: com.daaw.aq5
            @Override // com.daaw.em6
            public final Object zza(Object obj) {
                cq5.this.m25125E((SQLiteDatabase) obj, p04Var, str);
                return null;
            }
        });
    }

    /* renamed from: d */
    public final /* synthetic */ Void m25121d(eq5 eq5Var, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(eq5Var.f8697a));
        contentValues.put("gws_query_id", eq5Var.f8698b);
        contentValues.put("url", eq5Var.f8699c);
        contentValues.put("event_state", Integer.valueOf(eq5Var.f8700d - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        zzt.zzp();
        zzbr zzw = zzs.zzw(this.f6085p);
        if (zzw != null) {
            try {
                zzw.zze(nt0.m14830g3(this.f6085p));
            } catch (RemoteException e) {
                zze.zzb("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    /* renamed from: q */
    public final void m25119q(final String str) {
        m25117w(new em6() { // from class: com.daaw.wp5
            @Override // com.daaw.em6
            public final Object zza(Object obj) {
                cq5.m25123L((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    /* renamed from: u */
    public final void m25118u(final eq5 eq5Var) {
        m25117w(new em6() { // from class: com.daaw.up5
            @Override // com.daaw.em6
            public final Object zza(Object obj) {
                cq5.this.m25121d(eq5Var, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    /* renamed from: w */
    public final void m25117w(em6 em6Var) {
        s67.m10625r(this.f6086q.mo20112M(new Callable() { // from class: com.daaw.sp5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cq5.this.getWritableDatabase();
            }
        }), new bq5(this, em6Var), this.f6086q);
    }
}
