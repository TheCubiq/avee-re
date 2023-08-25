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
    public static b94 a;

    public static synchronized b94 e(Context context, @Nullable an3 an3Var, int i, boolean z, int i2, ga4 ga4Var) {
        synchronized (b94.class) {
            b94 b94Var = a;
            if (b94Var != null) {
                return b94Var;
            }
            g93.c(context);
            kj6 d = kj6.d(context);
            zzchu c = d.c(224400000, false, i2);
            d.e(an3Var);
            fc4 fc4Var = new fc4(null);
            c94 c94Var = new c94();
            c94Var.d(c);
            c94Var.c(context);
            fc4Var.b(new e94(c94Var, null));
            fc4Var.c(new vd4(ga4Var, null));
            b94 a2 = fc4Var.a();
            zzt.zzo().s(context, c);
            zzt.zzc().i(context);
            zzt.zzp().zzj(context);
            zzt.zzp().zzi(context);
            zzd.zza(context);
            zzt.zzb().d(context);
            zzt.zzv().zzb(context);
            ly3.d(context);
            if (((Boolean) zzba.zzc().b(g93.E5)).booleanValue()) {
                if (!((Boolean) zzba.zzc().b(g93.s0)).booleanValue()) {
                    x33 x33Var = new x33(new g43(context));
                    so5 so5Var = new so5(new oo5(context), a2.b());
                    zzt.zzp();
                    new rp5(context, c, x33Var, so5Var, UUID.randomUUID().toString(), a2.C()).b(zzt.zzo().h().zzP());
                }
            }
            a = a2;
            return a2;
        }
    }

    public static b94 f(Context context, @Nullable an3 an3Var, int i) {
        return e(context, an3Var, 224400000, false, i, new ga4());
    }

    public abstract dj6 A();

    public abstract pj6 B();

    public abstract on6 C();

    public abstract vo6 D();

    @Override // com.daaw.hf4
    public final o86 a(zzccb zzccbVar, int i) {
        return v(new wa6(zzccbVar, i));
    }

    public abstract g77 b();

    public abstract Executor c();

    public abstract ScheduledExecutorService d();

    public abstract ie4 g();

    public abstract xh4 h();

    public abstract ii4 i();

    public abstract yj4 j();

    public abstract jt4 k();

    public abstract r05 l();

    public abstract p15 m();

    public abstract n95 n();

    public abstract if5 o();

    public abstract dh5 p();

    public abstract xh5 q();

    public abstract kq5 r();

    public abstract zzc s();

    public abstract zzg t();

    public abstract zzac u();

    public abstract o86 v(wa6 wa6Var);

    public abstract cc6 w();

    public abstract td6 x();

    public abstract sf6 y();

    public abstract mh6 z();
}
