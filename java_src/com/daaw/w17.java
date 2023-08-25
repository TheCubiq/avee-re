package com.daaw;
/* loaded from: classes.dex */
public final class w17 extends kz6 {
    public final y17 r;

    public w17(y17 y17Var, int i) {
        super(y17Var.size(), i);
        this.r = y17Var;
    }

    @Override // com.daaw.kz6
    public final Object a(int i) {
        return this.r.get(i);
    }
}
