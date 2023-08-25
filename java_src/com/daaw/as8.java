package com.daaw;
/* loaded from: classes.dex */
public final class as8 implements tv8 {
    public final tv8 a;
    public final r84 b;

    public as8(tv8 tv8Var, r84 r84Var) {
        this.a = tv8Var;
        this.b = r84Var;
    }

    @Override // com.daaw.xv8
    public final int a(int i) {
        return this.a.a(0);
    }

    @Override // com.daaw.xv8
    public final f92 b(int i) {
        return this.a.b(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof as8) {
            as8 as8Var = (as8) obj;
            return this.a.equals(as8Var.a) && this.b.equals(as8Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + 527) * 31) + this.a.hashCode();
    }

    @Override // com.daaw.xv8
    public final int zzb(int i) {
        return this.a.zzb(i);
    }

    @Override // com.daaw.xv8
    public final int zzc() {
        return this.a.zzc();
    }

    @Override // com.daaw.xv8
    public final r84 zze() {
        return this.b;
    }
}
