package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
/* loaded from: classes.dex */
public final class b05 implements wz7 {
    public final sz4 a;
    public final m08 b;
    public final m08 c;
    public final m08 d;
    public final m08 e;

    public b05(sz4 sz4Var, m08 m08Var, m08 m08Var2, m08 m08Var3, m08 m08Var4) {
        this.a = sz4Var;
        this.b = m08Var;
        this.c = m08Var2;
        this.d = m08Var3;
        this.e = m08Var4;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.b.zzb();
        final zzchu a = ((u94) this.c).a();
        final th6 a2 = ((sm4) this.d).a();
        final ri6 a3 = ((cq4) this.e).a();
        return new ly4(new fs4() { // from class: com.daaw.rz4
            @Override // com.daaw.fs4
            public final void zzn() {
                zzt.zzs().zzn(context, a.p, a2.D.toString(), a3.f);
            }
        }, z04.f);
    }
}
