package com.daaw;

import android.content.Context;
import com.google.android.gms.internal.ads.zzchu;
/* loaded from: classes.dex */
public final class hq4 implements wz7 {

    /* renamed from: a */
    public final gq4 f12850a;

    /* renamed from: b */
    public final m08 f12851b;

    /* renamed from: c */
    public final m08 f12852c;

    /* renamed from: d */
    public final m08 f12853d;

    /* renamed from: e */
    public final m08 f12854e;

    public hq4(gq4 gq4Var, m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4) {
        this.f12850a = gq4Var;
        this.f12851b = m08Var;
        this.f12852c = m08Var2;
        this.f12853d = m08Var3;
        this.f12854e = m08Var4;
    }

    @Override // com.daaw.m08
    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.f12851b.zzb();
        zzchu m8405a = ((u94) this.f12852c).m8405a();
        th6 m10155a = ((sm4) this.f12853d).m10155a();
        zw3 zw3Var = new zw3();
        if (m10155a.f27655B != null) {
            return new yw3(context, m8405a, m10155a.f27655B, m10155a.f27715t.f33682b, zw3Var, null);
        }
        return null;
    }
}
