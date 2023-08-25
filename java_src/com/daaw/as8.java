package com.daaw;
/* loaded from: classes.dex */
public final class as8 implements tv8 {

    /* renamed from: a */
    public final tv8 f3538a;

    /* renamed from: b */
    public final r84 f3539b;

    public as8(tv8 tv8Var, r84 r84Var) {
        this.f3538a = tv8Var;
        this.f3539b = r84Var;
    }

    @Override // com.daaw.xv8
    /* renamed from: a */
    public final int mo4483a(int i) {
        return this.f3538a.mo4483a(0);
    }

    @Override // com.daaw.xv8
    /* renamed from: b */
    public final f92 mo4482b(int i) {
        return this.f3538a.mo4482b(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof as8) {
            as8 as8Var = (as8) obj;
            return this.f3538a.equals(as8Var.f3538a) && this.f3539b.equals(as8Var.f3539b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f3539b.hashCode() + 527) * 31) + this.f3538a.hashCode();
    }

    @Override // com.daaw.xv8
    public final int zzb(int i) {
        return this.f3538a.zzb(i);
    }

    @Override // com.daaw.xv8
    public final int zzc() {
        return this.f3538a.zzc();
    }

    @Override // com.daaw.xv8
    public final r84 zze() {
        return this.f3539b;
    }
}
