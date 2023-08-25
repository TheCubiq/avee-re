package com.daaw;
/* loaded from: classes.dex */
public final class oe4 implements wz7 {
    public final m08 a;
    public final m08 b;

    public oe4(m08 m08Var, m08 m08Var2) {
        this.a = m08Var;
        this.b = m08Var2;
    }

    @Override // com.daaw.m08
    public final /* synthetic */ Object zzb() {
        pm3 pm3Var = new pm3();
        String str = (String) this.b.zzb();
        return ((Boolean) gb3.a.e()).booleanValue() ? new om3(pm3Var, str) : new p04(str);
    }
}
