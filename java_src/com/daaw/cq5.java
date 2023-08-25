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
    public final Context p;
    public final g77 q;

    public cq5(Context context, g77 g77Var) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) zzba.zzc().b(g93.B7)).intValue());
        this.p = context;
        this.q = g77Var;
    }

    public static /* synthetic */ void D(SQLiteDatabase sQLiteDatabase, String str, p04 p04Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        M(sQLiteDatabase, p04Var);
    }

    public static final void L(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    public static void M(SQLiteDatabase sQLiteDatabase, p04 p04Var) {
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

    public static /* synthetic */ Void n(p04 p04Var, SQLiteDatabase sQLiteDatabase) {
        M(sQLiteDatabase, p04Var);
        return null;
    }

    public final void E(final SQLiteDatabase sQLiteDatabase, final p04 p04Var, final String str) {
        this.q.execute(new Runnable() { // from class: com.daaw.tp5
            @Override // java.lang.Runnable
            public final void run() {
                cq5.D(sQLiteDatabase, str, p04Var);
            }
        });
    }

    public final void K(final p04 p04Var, final String str) {
        w(new em6() { // from class: com.daaw.aq5
            @Override // com.daaw.em6
            public final Object zza(Object obj) {
                cq5.this.E((SQLiteDatabase) obj, p04Var, str);
                return null;
            }
        });
    }

    public final /* synthetic */ Void d(eq5 eq5Var, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(eq5Var.a));
        contentValues.put("gws_query_id", eq5Var.b);
        contentValues.put("url", eq5Var.c);
        contentValues.put("event_state", Integer.valueOf(eq5Var.d - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        zzt.zzp();
        zzbr zzw = zzs.zzw(this.p);
        if (zzw != null) {
            try {
                zzw.zze(nt0.g3(this.p));
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

    public final void q(final String str) {
        w(new em6() { // from class: com.daaw.wp5
            @Override // com.daaw.em6
            public final Object zza(Object obj) {
                cq5.L((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void u(final eq5 eq5Var) {
        w(new em6() { // from class: com.daaw.up5
            @Override // com.daaw.em6
            public final Object zza(Object obj) {
                cq5.this.d(eq5Var, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    public final void w(em6 em6Var) {
        s67.r(this.q.M(new Callable() { // from class: com.daaw.sp5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cq5.this.getWritableDatabase();
            }
        }), new bq5(this, em6Var), this.q);
    }
}
