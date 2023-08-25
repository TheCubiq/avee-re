package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzchu;
/* loaded from: classes.dex */
public final class dc4 implements ud6 {

    /* renamed from: a */
    public final Context f6927a;

    /* renamed from: b */
    public final zzq f6928b;

    /* renamed from: c */
    public final String f6929c;

    /* renamed from: d */
    public final bb4 f6930d;

    /* renamed from: e */
    public final dc4 f6931e = this;

    /* renamed from: f */
    public final m08 f6932f;

    /* renamed from: g */
    public final m08 f6933g;

    /* renamed from: h */
    public final m08 f6934h;

    /* renamed from: i */
    public final m08 f6935i;

    /* renamed from: j */
    public final m08 f6936j;

    /* renamed from: k */
    public final m08 f6937k;

    public /* synthetic */ dc4(bb4 bb4Var, Context context, String str, zzq zzqVar, cc4 cc4Var) {
        m08 m08Var;
        m08 m08Var2;
        m08 m08Var3;
        this.f6930d = bb4Var;
        this.f6927a = context;
        this.f6928b = zzqVar;
        this.f6929c = str;
        wz7 m4374a = xz7.m4374a(context);
        this.f6932f = m4374a;
        wz7 m4374a2 = xz7.m4374a(zzqVar);
        this.f6933g = m4374a2;
        m08Var = bb4Var.f4660p;
        m08 m6638b = vz7.m6638b(new bz5(m08Var));
        this.f6934h = m6638b;
        m08 m6638b2 = vz7.m6638b(gz5.m21129a());
        this.f6935i = m6638b2;
        m08 m6638b3 = vz7.m6638b(yv4.m3166a());
        this.f6936j = m6638b3;
        m08Var2 = bb4Var.f4662q;
        m08Var3 = bb4Var.f4625U;
        this.f6937k = vz7.m6638b(new sd6(m4374a, m08Var2, m4374a2, m08Var3, m6638b, m6638b2, ti6.m9085a(), m6638b3));
    }

    @Override // com.daaw.ud6
    public final dy5 zza() {
        e94 e94Var;
        Context context = this.f6927a;
        zzq zzqVar = this.f6928b;
        String str = this.f6929c;
        rd6 rd6Var = (rd6) this.f6937k.zzb();
        az5 az5Var = (az5) this.f6934h.zzb();
        e94Var = this.f6930d.f4632b;
        zzchu m23650d = e94Var.m23650d();
        e08.m23801b(m23650d);
        return new dy5(context, zzqVar, str, rd6Var, az5Var, m23650d);
    }
}
