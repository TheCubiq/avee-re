package com.daaw;
/* loaded from: classes.dex */
public final class zu3 extends bv3 {

    /* renamed from: p */
    public final String f35548p;

    /* renamed from: q */
    public final int f35549q;

    public zu3(String str, int i) {
        this.f35548p = str;
        this.f35549q = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zu3)) {
            zu3 zu3Var = (zu3) obj;
            if (ot0.m13981a(this.f35548p, zu3Var.f35548p) && ot0.m13981a(Integer.valueOf(this.f35549q), Integer.valueOf(zu3Var.f35549q))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.cv3
    public final int zzb() {
        return this.f35549q;
    }

    @Override // com.daaw.cv3
    public final String zzc() {
        return this.f35548p;
    }
}
