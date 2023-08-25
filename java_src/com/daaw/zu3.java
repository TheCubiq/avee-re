package com.daaw;
/* loaded from: classes.dex */
public final class zu3 extends bv3 {
    public final String p;
    public final int q;

    public zu3(String str, int i) {
        this.p = str;
        this.q = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zu3)) {
            zu3 zu3Var = (zu3) obj;
            if (ot0.a(this.p, zu3Var.p) && ot0.a(Integer.valueOf(this.q), Integer.valueOf(zu3Var.q))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.cv3
    public final int zzb() {
        return this.q;
    }

    @Override // com.daaw.cv3
    public final String zzc() {
        return this.p;
    }
}
