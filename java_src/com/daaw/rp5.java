package com.daaw;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class rp5 {
    public final x33 a;
    public final Context b;
    public final so5 c;
    public final zzchu d;
    public final String e;
    public final on6 f;
    public final zzg g = zzt.zzo().h();

    public rp5(Context context, zzchu zzchuVar, x33 x33Var, so5 so5Var, String str, on6 on6Var) {
        this.b = context;
        this.d = zzchuVar;
        this.a = x33Var;
        this.c = so5Var;
        this.e = str;
        this.f = on6Var;
    }

    public static final void c(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            t63 t63Var = (t63) arrayList.get(i);
            if (t63Var.j0() == 2 && t63Var.R() > j) {
                j = t63Var.R();
            }
        }
        if (j != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    public final /* synthetic */ Void a(boolean z, SQLiteDatabase sQLiteDatabase) {
        if (z) {
            this.b.deleteDatabase("OfflineUpload.db");
            return null;
        }
        if (((Boolean) zzba.zzc().b(g93.K7)).booleanValue()) {
            nn6 b = nn6.b("oa_upload");
            b.a("oa_failed_reqs", String.valueOf(kp5.a(sQLiteDatabase, 0)));
            b.a("oa_total_reqs", String.valueOf(kp5.a(sQLiteDatabase, 1)));
            b.a("oa_upload_time", String.valueOf(zzt.zzB().a()));
            b.a("oa_last_successful_time", String.valueOf(kp5.b(sQLiteDatabase, 2)));
            b.a("oa_session_id", this.g.zzP() ? "" : this.e);
            this.f.a(b);
            ArrayList c = kp5.c(sQLiteDatabase);
            c(sQLiteDatabase, c);
            int size = c.size();
            for (int i = 0; i < size; i++) {
                t63 t63Var = (t63) c.get(i);
                nn6 b2 = nn6.b("oa_signals");
                b2.a("oa_session_id", this.g.zzP() ? "" : this.e);
                o63 S = t63Var.S();
                String valueOf = S.P() ? String.valueOf(S.R() - 1) : "-1";
                String obj = p27.b(t63Var.X(), new ey6() { // from class: com.daaw.qp5
                    @Override // com.daaw.ey6
                    public final Object apply(Object obj2) {
                        return ((y43) obj2).name();
                    }
                }).toString();
                b2.a("oa_sig_ts", String.valueOf(t63Var.R()));
                b2.a("oa_sig_status", String.valueOf(t63Var.j0() - 1));
                b2.a("oa_sig_resp_lat", String.valueOf(t63Var.Q()));
                b2.a("oa_sig_render_lat", String.valueOf(t63Var.P()));
                b2.a("oa_sig_formats", obj);
                b2.a("oa_sig_nw_type", valueOf);
                b2.a("oa_sig_wifi", String.valueOf(t63Var.k0() - 1));
                b2.a("oa_sig_airplane", String.valueOf(t63Var.g0() - 1));
                b2.a("oa_sig_data", String.valueOf(t63Var.h0() - 1));
                b2.a("oa_sig_nw_resp", String.valueOf(t63Var.O()));
                b2.a("oa_sig_offline", String.valueOf(t63Var.i0() - 1));
                b2.a("oa_sig_nw_state", String.valueOf(t63Var.W().zza()));
                if (S.O() && S.P() && S.R() == 2) {
                    b2.a("oa_sig_cell_type", String.valueOf(S.Q() - 1));
                }
                this.f.a(b2);
            }
        } else {
            ArrayList c2 = kp5.c(sQLiteDatabase);
            u63 L = y63.L();
            L.t(this.b.getPackageName());
            L.v(Build.MODEL);
            L.w(kp5.a(sQLiteDatabase, 0));
            L.s(c2);
            L.y(kp5.a(sQLiteDatabase, 1));
            L.u(kp5.a(sQLiteDatabase, 3));
            L.z(zzt.zzB().a());
            L.x(kp5.b(sQLiteDatabase, 2));
            final y63 y63Var = (y63) L.n();
            c(sQLiteDatabase, c2);
            this.a.b(new w33() { // from class: com.daaw.op5
                @Override // com.daaw.w33
                public final void a(u53 u53Var) {
                    u53Var.A(y63.this);
                }
            });
            j73 L2 = k73.L();
            L2.s(this.d.q);
            L2.u(this.d.r);
            L2.t(true == this.d.s ? 0 : 2);
            final k73 k73Var = (k73) L2.n();
            this.a.b(new w33() { // from class: com.daaw.pp5
                @Override // com.daaw.w33
                public final void a(u53 u53Var) {
                    k73 k73Var2 = k73.this;
                    m53 m53Var = (m53) u53Var.t().k();
                    m53Var.t(k73Var2);
                    u53Var.y(m53Var);
                }
            });
            this.a.c(10004);
        }
        kp5.f(sQLiteDatabase);
        return null;
    }

    public final void b(final boolean z) {
        try {
            this.c.a(new em6() { // from class: com.daaw.np5
                @Override // com.daaw.em6
                public final Object zza(Object obj) {
                    rp5.this.a(z, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            k04.zzg("Error in offline signals database startup: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
