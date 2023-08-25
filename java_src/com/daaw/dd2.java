package com.daaw;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class dd2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f6949a;

    /* renamed from: b */
    public final /* synthetic */ f01 f6950b;

    /* renamed from: c */
    public final /* synthetic */ C2842rb f6951c;

    public dd2(C2842rb c2842rb, String str, f01 f01Var) {
        this.f6951c = c2842rb;
        this.f6949a = str;
        this.f6950b = f01Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        n63 m11544A = C2842rb.m11544A(this.f6951c, this.f6949a);
        if (m11544A.m15499b() != null) {
            this.f6950b.mo6251c(m11544A.m15500a(), m11544A.m15499b());
            return null;
        }
        this.f6950b.mo6251c(m11544A.m15500a(), rt8.m10942r());
        return null;
    }
}
