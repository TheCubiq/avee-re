package com.daaw;
/* loaded from: classes.dex */
public final class ff7 implements gf7 {
    public final dq7 a;
    public final vm7 b;

    public ff7(vm7 vm7Var) {
        this.b = vm7Var;
        this.a = pf7.a(vm7Var.Q());
    }

    public static ff7 a(vm7 vm7Var) {
        return new ff7(vm7Var);
    }

    public final vm7 b() {
        return this.b;
    }

    @Override // com.daaw.gf7
    public final dq7 zzd() {
        return this.a;
    }
}
