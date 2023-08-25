package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzd;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzac;
import com.google.android.gms.ads.nonagon.signalgeneration.zzc;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import com.google.android.gms.internal.ads.zzccb;
import com.google.android.gms.internal.ads.zzchu;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public abstract class b94 implements hf4 {
    @GuardedBy("AppComponent.class")
    @Nullable

    /* renamed from: a */
    public static b94 f4561a;

    /* renamed from: e */
    public static synchronized b94 m26324e(Context context, @Nullable an3 an3Var, int i, boolean z, int i2, ga4 ga4Var) {
        synchronized (b94.class) {
            b94 b94Var = f4561a;
            if (b94Var != null) {
                return b94Var;
            }
            g93.m21879c(context);
            kj6 m17696d = kj6.m17696d(context);
            zzchu m17697c = m17696d.m17697c(224400000, false, i2);
            m17696d.m17695e(an3Var);
            fc4 fc4Var = new fc4(null);
            c94 c94Var = new c94();
            c94Var.m25483d(m17697c);
            c94Var.m25484c(context);
            fc4Var.m22804b(new e94(c94Var, null));
            fc4Var.m22803c(new vd4(ga4Var, null));
            b94 m22805a = fc4Var.m22805a();
            zzt.zzo().m11904s(context, m17697c);
            zzt.zzc().m21047i(context);
            zzt.zzp().zzj(context);
            zzt.zzp().zzi(context);
            zzd.zza(context);
            zzt.zzb().m15597d(context);
            zzt.zzv().zzb(context);
            ly3.m16372d(context);
            if (((Boolean) zzba.zzc().m23658b(g93.f10407E5)).booleanValue()) {
                if (!((Boolean) zzba.zzc().m23658b(g93.f10820s0)).booleanValue()) {
                    x33 x33Var = new x33(new g43(context));
                    so5 so5Var = new so5(new oo5(context), m22805a.mo26279b());
                    zzt.zzp();
                    new rp5(context, m17697c, x33Var, so5Var, UUID.randomUUID().toString(), m22805a.mo26310C()).m11084b(zzt.zzo().m11915h().zzP());
                }
            }
            f4561a = m22805a;
            return m22805a;
        }
    }

    /* renamed from: f */
    public static b94 m26323f(Context context, @Nullable an3 an3Var, int i) {
        return m26324e(context, an3Var, 224400000, false, i, new ga4());
    }

    /* renamed from: A */
    public abstract dj6 mo26314A();

    /* renamed from: B */
    public abstract pj6 mo26312B();

    /* renamed from: C */
    public abstract on6 mo26310C();

    /* renamed from: D */
    public abstract vo6 mo26308D();

    @Override // com.daaw.hf4
    /* renamed from: a */
    public final o86 mo20830a(zzccb zzccbVar, int i) {
        return mo26241v(new wa6(zzccbVar, i));
    }

    /* renamed from: b */
    public abstract g77 mo26279b();

    /* renamed from: c */
    public abstract Executor mo26277c();

    /* renamed from: d */
    public abstract ScheduledExecutorService mo26275d();

    /* renamed from: g */
    public abstract ie4 mo26271g();

    /* renamed from: h */
    public abstract xh4 mo26269h();

    /* renamed from: i */
    public abstract ii4 mo26267i();

    /* renamed from: j */
    public abstract yj4 mo26265j();

    /* renamed from: k */
    public abstract jt4 mo26263k();

    /* renamed from: l */
    public abstract r05 mo26261l();

    /* renamed from: m */
    public abstract p15 mo26259m();

    /* renamed from: n */
    public abstract n95 mo26257n();

    /* renamed from: o */
    public abstract if5 mo26255o();

    /* renamed from: p */
    public abstract dh5 mo26253p();

    /* renamed from: q */
    public abstract xh5 mo26251q();

    /* renamed from: r */
    public abstract kq5 mo26249r();

    /* renamed from: s */
    public abstract zzc mo26247s();

    /* renamed from: t */
    public abstract zzg mo26245t();

    /* renamed from: u */
    public abstract zzac mo26243u();

    /* renamed from: v */
    public abstract o86 mo26241v(wa6 wa6Var);

    /* renamed from: w */
    public abstract cc6 mo26239w();

    /* renamed from: x */
    public abstract td6 mo26237x();

    /* renamed from: y */
    public abstract sf6 mo26235y();

    /* renamed from: z */
    public abstract mh6 mo26233z();
}
