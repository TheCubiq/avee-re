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

    /* renamed from: a */
    public final String f18478a;

    /* renamed from: b */
    public final g77 f18479b;

    /* renamed from: c */
    public final ScheduledExecutorService f18480c;

    /* renamed from: d */
    public final Context f18481d;

    /* renamed from: e */
    public final ri6 f18482e;

    /* renamed from: f */
    public final b94 f18483f;

    public m66(g77 g77Var, ScheduledExecutorService scheduledExecutorService, String str, Context context, ri6 ri6Var, b94 b94Var) {
        this.f18479b = g77Var;
        this.f18480c = scheduledExecutorService;
        this.f18478a = str;
        this.f18481d = context;
        this.f18482e = ri6Var;
        this.f18483f = b94Var;
    }

    /* renamed from: a */
    public static /* synthetic */ f77 m16197a(m66 m66Var) {
        String str = m66Var.f18478a;
        if (((Boolean) zzba.zzc().m23658b(g93.f10377B6)).booleanValue()) {
            str = AdFormat.UNKNOWN.name();
        }
        zzg mo26245t = m66Var.f18483f.mo26245t();
        sp4 sp4Var = new sp4();
        sp4Var.m10066c(m66Var.f18481d);
        pi6 pi6Var = new pi6();
        pi6Var.m13370J("adUnitId");
        pi6Var.m13358e(m66Var.f18482e.f25344d);
        pi6Var.m13371I(new zzq());
        sp4Var.m10063f(pi6Var.m13356g());
        mo26245t.zza(sp4Var.m10062g());
        zzae zzaeVar = new zzae();
        zzaeVar.zza(str);
        mo26245t.zzb(zzaeVar.zzb());
        new lw4();
        return s67.m10637f(s67.m10630m((j67) s67.m10628o(j67.m18784D(mo26245t.zzc().zzc()), ((Long) zzba.zzc().m23658b(g93.f10388C6)).longValue(), TimeUnit.MILLISECONDS, m66Var.f18480c), new ey6() { // from class: com.daaw.k66
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                zzao zzaoVar = (zzao) obj;
                return zzaoVar != null ? new n66(zzaoVar.zza) : new n66(null);
            }
        }, m66Var.f18479b), Exception.class, new ey6() { // from class: com.daaw.l66
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                k04.zzh("", (Exception) obj);
                return new n66(null);
            }
        }, m66Var.f18479b);
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 33;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return (!((Boolean) zzba.zzc().m23658b(g93.f10366A6)).booleanValue() || "adUnitId".equals(this.f18482e.f25346f)) ? this.f18479b.mo20112M(new Callable() { // from class: com.daaw.i66
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new n66(null);
            }
        }) : s67.m10631l(new v57() { // from class: com.daaw.j66
            @Override // com.daaw.v57
            public final f77 zza() {
                return m66.m16197a(m66.this);
            }
        }, this.f18479b);
    }
}
