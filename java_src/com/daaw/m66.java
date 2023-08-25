package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.nonagon.signalgeneration.zzae;
import com.google.android.gms.ads.nonagon.signalgeneration.zzao;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class m66 implements i76 {
    public final String a;
    public final g77 b;
    public final ScheduledExecutorService c;
    public final Context d;
    public final ri6 e;
    public final b94 f;

    public m66(g77 g77Var, ScheduledExecutorService scheduledExecutorService, String str, Context context, ri6 ri6Var, b94 b94Var) {
        this.b = g77Var;
        this.c = scheduledExecutorService;
        this.a = str;
        this.d = context;
        this.e = ri6Var;
        this.f = b94Var;
    }

    public static /* synthetic */ f77 a(m66 m66Var) {
        String str = m66Var.a;
        if (((Boolean) zzba.zzc().b(g93.B6)).booleanValue()) {
            str = AdFormat.UNKNOWN.name();
        }
        zzg t = m66Var.f.t();
        sp4 sp4Var = new sp4();
        sp4Var.c(m66Var.d);
        pi6 pi6Var = new pi6();
        pi6Var.J("adUnitId");
        pi6Var.e(m66Var.e.d);
        pi6Var.I(new zzq());
        sp4Var.f(pi6Var.g());
        t.zza(sp4Var.g());
        zzae zzaeVar = new zzae();
        zzaeVar.zza(str);
        t.zzb(zzaeVar.zzb());
        new lw4();
        return s67.f(s67.m((j67) s67.o(j67.D(t.zzc().zzc()), ((Long) zzba.zzc().b(g93.C6)).longValue(), TimeUnit.MILLISECONDS, m66Var.c), new ey6() { // from class: com.daaw.k66
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                zzao zzaoVar = (zzao) obj;
                return zzaoVar != null ? new n66(zzaoVar.zza) : new n66(null);
            }
        }, m66Var.b), Exception.class, new ey6() { // from class: com.daaw.l66
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                k04.zzh("", (Exception) obj);
                return new n66(null);
            }
        }, m66Var.b);
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 33;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return (!((Boolean) zzba.zzc().b(g93.A6)).booleanValue() || "adUnitId".equals(this.e.f)) ? this.b.M(new Callable() { // from class: com.daaw.i66
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new n66(null);
            }
        }) : s67.l(new v57() { // from class: com.daaw.j66
            @Override // com.daaw.v57
            public final f77 zza() {
                return m66.a(m66.this);
            }
        }, this.b);
    }
}
