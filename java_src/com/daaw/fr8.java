package com.daaw;
/* loaded from: classes2.dex */
public final class fr8 extends dk8 {
    public final rt8 r;

    public fr8(rt8 rt8Var, int i) {
        super(rt8Var.size(), i);
        this.r = rt8Var;
    }

    @Override // com.daaw.dk8
    public final Object a(int i) {
        return this.r.get(i);
    }
}
