package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzchu;
/* loaded from: classes.dex */
public final class dc4 implements ud6 {
    public final Context a;
    public final zzq b;
    public final String c;
    public final bb4 d;
    public final dc4 e = this;
    public final m08 f;
    public final m08 g;
    public final m08 h;
    public final m08 i;
    public final m08 j;
    public final m08 k;

    public /* synthetic */ dc4(bb4 bb4Var, Context context, String str, zzq zzqVar, cc4 cc4Var) {
        m08 m08Var;
        m08 m08Var2;
        m08 m08Var3;
        this.d = bb4Var;
        this.a = context;
        this.b = zzqVar;
        this.c = str;
        wz7 a = xz7.a(context);
        this.f = a;
        wz7 a2 = xz7.a(zzqVar);
        this.g = a2;
        m08Var = bb4Var.p;
        m08 b = vz7.b(new bz5(m08Var));
        this.h = b;
        m08 b2 = vz7.b(gz5.a());
        this.i = b2;
        m08 b3 = vz7.b(yv4.a());
        this.j = b3;
        m08Var2 = bb4Var.q;
        m08Var3 = bb4Var.U;
        this.k = vz7.b(new sd6(a, m08Var2, a2, m08Var3, b, b2, ti6.a(), b3));
    }

    @Override // com.daaw.ud6
    public final dy5 zza() {
        e94 e94Var;
        Context context = this.a;
        zzq zzqVar = this.b;
        String str = this.c;
        rd6 rd6Var = (rd6) this.k.zzb();
        az5 az5Var = (az5) this.h.zzb();
        e94Var = this.d.b;
        zzchu d = e94Var.d();
        e08.b(d);
        return new dy5(context, zzqVar, str, rd6Var, az5Var, d);
    }
}
