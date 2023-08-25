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

    /* renamed from: a */
    public final x33 f25490a;

    /* renamed from: b */
    public final Context f25491b;

    /* renamed from: c */
    public final so5 f25492c;

    /* renamed from: d */
    public final zzchu f25493d;

    /* renamed from: e */
    public final String f25494e;

    /* renamed from: f */
    public final on6 f25495f;

    /* renamed from: g */
    public final zzg f25496g = zzt.zzo().m11915h();

    public rp5(Context context, zzchu zzchuVar, x33 x33Var, so5 so5Var, String str, on6 on6Var) {
        this.f25491b = context;
        this.f25493d = zzchuVar;
        this.f25490a = x33Var;
        this.f25492c = so5Var;
        this.f25494e = str;
        this.f25495f = on6Var;
    }

    /* renamed from: c */
    public static final void m11083c(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            t63 t63Var = (t63) arrayList.get(i);
            if (t63Var.m9491j0() == 2 && t63Var.m9509R() > j) {
                j = t63Var.m9509R();
            }
        }
        if (j != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Void m11085a(boolean z, SQLiteDatabase sQLiteDatabase) {
        if (z) {
            this.f25491b.deleteDatabase("OfflineUpload.db");
            return null;
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10469K7)).booleanValue()) {
            nn6 m14953b = nn6.m14953b("oa_upload");
            m14953b.m14954a("oa_failed_reqs", String.valueOf(kp5.m17545a(sQLiteDatabase, 0)));
            m14953b.m14954a("oa_total_reqs", String.valueOf(kp5.m17545a(sQLiteDatabase, 1)));
            m14953b.m14954a("oa_upload_time", String.valueOf(zzt.zzB().mo15860a()));
            m14953b.m14954a("oa_last_successful_time", String.valueOf(kp5.m17544b(sQLiteDatabase, 2)));
            m14953b.m14954a("oa_session_id", this.f25496g.zzP() ? "" : this.f25494e);
            this.f25495f.mo7889a(m14953b);
            ArrayList m17543c = kp5.m17543c(sQLiteDatabase);
            m11083c(sQLiteDatabase, m17543c);
            int size = m17543c.size();
            for (int i = 0; i < size; i++) {
                t63 t63Var = (t63) m17543c.get(i);
                nn6 m14953b2 = nn6.m14953b("oa_signals");
                m14953b2.m14954a("oa_session_id", this.f25496g.zzP() ? "" : this.f25494e);
                o63 m9508S = t63Var.m9508S();
                String valueOf = m9508S.m14525P() ? String.valueOf(m9508S.m14523R() - 1) : "-1";
                String obj = p27.m13722b(t63Var.m9503X(), new ey6() { // from class: com.daaw.qp5
                    @Override // com.daaw.ey6
                    public final Object apply(Object obj2) {
                        return ((y43) obj2).name();
                    }
                }).toString();
                m14953b2.m14954a("oa_sig_ts", String.valueOf(t63Var.m9509R()));
                m14953b2.m14954a("oa_sig_status", String.valueOf(t63Var.m9491j0() - 1));
                m14953b2.m14954a("oa_sig_resp_lat", String.valueOf(t63Var.m9510Q()));
                m14953b2.m14954a("oa_sig_render_lat", String.valueOf(t63Var.m9511P()));
                m14953b2.m14954a("oa_sig_formats", obj);
                m14953b2.m14954a("oa_sig_nw_type", valueOf);
                m14953b2.m14954a("oa_sig_wifi", String.valueOf(t63Var.m9490k0() - 1));
                m14953b2.m14954a("oa_sig_airplane", String.valueOf(t63Var.m9494g0() - 1));
                m14953b2.m14954a("oa_sig_data", String.valueOf(t63Var.m9493h0() - 1));
                m14953b2.m14954a("oa_sig_nw_resp", String.valueOf(t63Var.m9512O()));
                m14953b2.m14954a("oa_sig_offline", String.valueOf(t63Var.m9492i0() - 1));
                m14953b2.m14954a("oa_sig_nw_state", String.valueOf(t63Var.m9504W().zza()));
                if (m9508S.m14526O() && m9508S.m14525P() && m9508S.m14523R() == 2) {
                    m14953b2.m14954a("oa_sig_cell_type", String.valueOf(m9508S.m14524Q() - 1));
                }
                this.f25495f.mo7889a(m14953b2);
            }
        } else {
            ArrayList m17543c2 = kp5.m17543c(sQLiteDatabase);
            u63 m4082L = y63.m4082L();
            m4082L.m8552t(this.f25491b.getPackageName());
            m4082L.m8550v(Build.MODEL);
            m4082L.m8549w(kp5.m17545a(sQLiteDatabase, 0));
            m4082L.m8553s(m17543c2);
            m4082L.m8547y(kp5.m17545a(sQLiteDatabase, 1));
            m4082L.m8551u(kp5.m17545a(sQLiteDatabase, 3));
            m4082L.m8546z(zzt.zzB().mo15860a());
            m4082L.m8548x(kp5.m17544b(sQLiteDatabase, 2));
            final y63 y63Var = (y63) m4082L.m22315n();
            m11083c(sQLiteDatabase, m17543c2);
            this.f25490a.m5590b(new w33() { // from class: com.daaw.op5
                @Override // com.daaw.w33
                /* renamed from: a */
                public final void mo2497a(u53 u53Var) {
                    u53Var.m8578A(y63.this);
                }
            });
            j73 m17997L = k73.m17997L();
            m17997L.m18765s(this.f25493d.f36994q);
            m17997L.m18763u(this.f25493d.f36995r);
            m17997L.m18764t(true == this.f25493d.f36996s ? 0 : 2);
            final k73 k73Var = (k73) m17997L.m22315n();
            this.f25490a.m5590b(new w33() { // from class: com.daaw.pp5
                @Override // com.daaw.w33
                /* renamed from: a */
                public final void mo2497a(u53 u53Var) {
                    k73 k73Var2 = k73.this;
                    m53 m53Var = (m53) u53Var.m8574t().m16587k();
                    m53Var.m16201t(k73Var2);
                    u53Var.m8569y(m53Var);
                }
            });
            this.f25490a.m5589c(10004);
        }
        kp5.m17540f(sQLiteDatabase);
        return null;
    }

    /* renamed from: b */
    public final void m11084b(final boolean z) {
        try {
            this.f25492c.m10115a(new em6() { // from class: com.daaw.np5
                @Override // com.daaw.em6
                public final Object zza(Object obj) {
                    rp5.this.m11085a(z, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            k04.zzg("Error in offline signals database startup: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
