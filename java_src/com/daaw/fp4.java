package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzas;
import com.google.android.gms.internal.ads.zzchu;
/* loaded from: classes.dex */
public final class fp4 implements wz7 {
    public final m08 a;
    public final m08 b;
    public final m08 c;

    public fp4(m08 m08Var, m08 m08Var2, m08 m08Var3) {
        this.a = m08Var;
        this.b = m08Var2;
        this.c = m08Var3;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.a.zzb();
        final zzchu a = ((u94) this.b).a();
        final ri6 a2 = ((cq4) this.c).a();
        return new ey6() { // from class: com.daaw.ep4
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                Context context2 = context;
                zzchu zzchuVar = a;
                ri6 ri6Var = a2;
                th6 th6Var = (th6) obj;
                zzas zzasVar = new zzas(context2);
                zzasVar.zzp(th6Var.C);
                zzasVar.zzq(th6Var.D.toString());
                zzasVar.zzo(zzchuVar.p);
                zzasVar.zzn(ri6Var.f);
                return zzasVar;
            }
        };
    }
}
