package com.daaw;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.internal.ads.zzchu;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public abstract class kc6 implements qz5 {

    /* renamed from: a */
    public final Context f16176a;

    /* renamed from: b */
    public final Executor f16177b;

    /* renamed from: c */
    public final b94 f16178c;

    /* renamed from: d */
    public final dd6 f16179d;

    /* renamed from: e */
    public final cf6 f16180e;

    /* renamed from: f */
    public final zzchu f16181f;

    /* renamed from: g */
    public final ViewGroup f16182g;

    /* renamed from: h */
    public final vo6 f16183h;
    @GuardedBy("this")

    /* renamed from: i */
    public final pi6 f16184i;
    @GuardedBy("this")
    @Nullable

    /* renamed from: j */
    public f77 f16185j;

    public kc6(Context context, Executor executor, b94 b94Var, cf6 cf6Var, dd6 dd6Var, pi6 pi6Var, zzchu zzchuVar) {
        this.f16176a = context;
        this.f16177b = executor;
        this.f16178c = b94Var;
        this.f16180e = cf6Var;
        this.f16179d = dd6Var;
        this.f16184i = pi6Var;
        this.f16181f = zzchuVar;
        this.f16182g = new FrameLayout(context);
        this.f16183h = b94Var.mo26308D();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045 A[Catch: all -> 0x00f4, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:9:0x0026, B:14:0x0045, B:17:0x0056, B:21:0x005c, B:23:0x006c, B:25:0x0074, B:27:0x0089, B:29:0x00a2, B:31:0x00a6, B:32:0x00af, B:12:0x003e), top: B:38:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056 A[Catch: all -> 0x00f4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:9:0x0026, B:14:0x0045, B:17:0x0056, B:21:0x005c, B:23:0x006c, B:25:0x0074, B:27:0x0089, B:29:0x00a2, B:31:0x00a6, B:32:0x00af, B:12:0x003e), top: B:38:0x0001 }] */
    @Override // com.daaw.qz5
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean mo4385a(zzl zzlVar, String str, oz5 oz5Var, pz5 pz5Var) {
        boolean z;
        to6 to6Var;
        if (((Boolean) ya3.f33452d.m16137e()).booleanValue()) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10774n9)).booleanValue()) {
                z = true;
                if (this.f16181f.f36995r >= ((Integer) zzba.zzc().m23658b(g93.f10785o9)).intValue() || !z) {
                    ry0.m10835e("loadAd must be called on the main UI thread.");
                }
                if (str != null) {
                    k04.zzg("Ad unit ID should not be null for app open ad.");
                    this.f16177b.execute(new Runnable() { // from class: com.daaw.ec6
                        @Override // java.lang.Runnable
                        public final void run() {
                            kc6.this.m17796j();
                        }
                    });
                    return false;
                } else if (this.f16185j != null) {
                    return false;
                } else {
                    if (((Boolean) ta3.f27158c.m16137e()).booleanValue()) {
                        cf6 cf6Var = this.f16180e;
                        if (cf6Var.zzd() != null) {
                            to6 zzh = ((di4) cf6Var.zzd()).zzh();
                            zzh.m8895h(7);
                            zzh.m8901b(zzlVar.zzp);
                            to6Var = zzh;
                            nj6.m15146a(this.f16176a, zzlVar.zzf);
                            if (((Boolean) zzba.zzc().m23658b(g93.f10599X7)).booleanValue() && zzlVar.zzf) {
                                this.f16178c.mo26253p().m24398m(true);
                            }
                            pi6 pi6Var = this.f16184i;
                            pi6Var.m13370J(str);
                            pi6Var.m13371I(zzq.zzb());
                            pi6Var.m13358e(zzlVar);
                            ri6 m13356g = pi6Var.m13356g();
                            io6 m20567b = ho6.m20567b(this.f16176a, so6.m10109f(m13356g), 7, zzlVar);
                            jc6 jc6Var = new jc6(null);
                            jc6Var.f14990a = m13356g;
                            f77 mo13423a = this.f16180e.mo13423a(new df6(jc6Var, null), new ye6() { // from class: com.daaw.fc6
                                @Override // com.daaw.ye6
                                /* renamed from: a */
                                public final qp4 mo3795a(xe6 xe6Var) {
                                    qp4 m17794l;
                                    m17794l = kc6.this.m17794l(xe6Var);
                                    return m17794l;
                                }
                            }, null);
                            this.f16185j = mo13423a;
                            s67.m10625r(mo13423a, new hc6(this, pz5Var, to6Var, m20567b, jc6Var), this.f16177b);
                            return true;
                        }
                    }
                    to6Var = null;
                    nj6.m15146a(this.f16176a, zzlVar.zzf);
                    if (((Boolean) zzba.zzc().m23658b(g93.f10599X7)).booleanValue()) {
                        this.f16178c.mo26253p().m24398m(true);
                    }
                    pi6 pi6Var2 = this.f16184i;
                    pi6Var2.m13370J(str);
                    pi6Var2.m13371I(zzq.zzb());
                    pi6Var2.m13358e(zzlVar);
                    ri6 m13356g2 = pi6Var2.m13356g();
                    io6 m20567b2 = ho6.m20567b(this.f16176a, so6.m10109f(m13356g2), 7, zzlVar);
                    jc6 jc6Var2 = new jc6(null);
                    jc6Var2.f14990a = m13356g2;
                    f77 mo13423a2 = this.f16180e.mo13423a(new df6(jc6Var2, null), new ye6() { // from class: com.daaw.fc6
                        @Override // com.daaw.ye6
                        /* renamed from: a */
                        public final qp4 mo3795a(xe6 xe6Var) {
                            qp4 m17794l;
                            m17794l = kc6.this.m17794l(xe6Var);
                            return m17794l;
                        }
                    }, null);
                    this.f16185j = mo13423a2;
                    s67.m10625r(mo13423a2, new hc6(this, pz5Var, to6Var, m20567b2, jc6Var2), this.f16177b);
                    return true;
                }
            }
        }
        z = false;
        if (this.f16181f.f36995r >= ((Integer) zzba.zzc().m23658b(g93.f10785o9)).intValue()) {
        }
        ry0.m10835e("loadAd must be called on the main UI thread.");
        if (str != null) {
        }
    }

    /* renamed from: b */
    public abstract qp4 mo8348b(wi4 wi4Var, up4 up4Var, pw4 pw4Var);

    /* renamed from: j */
    public final /* synthetic */ void m17796j() {
        this.f16179d.mo2194b(tj6.m9071d(6, null, null));
    }

    /* renamed from: k */
    public final void m17795k(zzw zzwVar) {
        this.f16184i.m13369K(zzwVar);
    }

    /* renamed from: l */
    public final synchronized qp4 m17794l(xe6 xe6Var) {
        jc6 jc6Var = (jc6) xe6Var;
        if (((Boolean) zzba.zzc().m23658b(g93.f10816r7)).booleanValue()) {
            wi4 wi4Var = new wi4(this.f16182g);
            sp4 sp4Var = new sp4();
            sp4Var.m10066c(this.f16176a);
            sp4Var.m10063f(jc6Var.f14990a);
            up4 m10062g = sp4Var.m10062g();
            lw4 lw4Var = new lw4();
            lw4Var.m16444f(this.f16179d, this.f16177b);
            lw4Var.m16435o(this.f16179d, this.f16177b);
            return mo8348b(wi4Var, m10062g, lw4Var.m16433q());
        }
        dd6 m24521c = dd6.m24521c(this.f16179d);
        lw4 lw4Var2 = new lw4();
        lw4Var2.m16445e(m24521c, this.f16177b);
        lw4Var2.m16440j(m24521c, this.f16177b);
        lw4Var2.m16439k(m24521c, this.f16177b);
        lw4Var2.m16438l(m24521c, this.f16177b);
        lw4Var2.m16444f(m24521c, this.f16177b);
        lw4Var2.m16435o(m24521c, this.f16177b);
        lw4Var2.m16434p(m24521c);
        wi4 wi4Var2 = new wi4(this.f16182g);
        sp4 sp4Var2 = new sp4();
        sp4Var2.m10066c(this.f16176a);
        sp4Var2.m10063f(jc6Var.f14990a);
        return mo8348b(wi4Var2, sp4Var2.m10062g(), lw4Var2.m16433q());
    }

    @Override // com.daaw.qz5
    public final boolean zza() {
        f77 f77Var = this.f16185j;
        return (f77Var == null || f77Var.isDone()) ? false : true;
    }
}
