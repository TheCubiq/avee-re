package com.daaw;

import android.content.Context;
import com.google.android.gms.internal.ads.zzchu;
/* loaded from: classes.dex */
public final class hq4 implements wz7 {
    public final gq4 a;
    public final m08 b;
    public final m08 c;
    public final m08 d;
    public final m08 e;

    public hq4(gq4 gq4Var, m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4) {
        this.a = gq4Var;
        this.b = m08Var;
        this.c = m08Var2;
        this.d = m08Var3;
        this.e = m08Var4;
    }

    @Override // com.daaw.m08
    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.b.zzb();
        zzchu a = ((u94) this.c).a();
        th6 a2 = ((sm4) this.d).a();
        zw3 zw3Var = new zw3();
        if (a2.B != null) {
            return new yw3(context, a, a2.B, a2.t.b, zw3Var, null);
        }
        return null;
    }
}
