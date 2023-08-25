package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzas;
import com.google.android.gms.internal.ads.zzchu;
/* loaded from: classes.dex */
public final class fp4 implements wz7 {

    /* renamed from: a */
    public final m08 f9754a;

    /* renamed from: b */
    public final m08 f9755b;

    /* renamed from: c */
    public final m08 f9756c;

    public fp4(m08 m08Var, m08 m08Var2, m08 m08Var3) {
        this.f9754a = m08Var;
        this.f9755b = m08Var2;
        this.f9756c = m08Var3;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.f9754a.zzb();
        final zzchu m8405a = ((u94) this.f9755b).m8405a();
        final ri6 m25128a = ((cq4) this.f9756c).m25128a();
        return new ey6() { // from class: com.daaw.ep4
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                Context context2 = context;
                zzchu zzchuVar = m8405a;
                ri6 ri6Var = m25128a;
                th6 th6Var = (th6) obj;
                zzas zzasVar = new zzas(context2);
                zzasVar.zzp(th6Var.f27656C);
                zzasVar.zzq(th6Var.f27657D.toString());
                zzasVar.zzo(zzchuVar.f36993p);
                zzasVar.zzn(ri6Var.f25346f);
                return zzasVar;
            }
        };
    }
}
