package com.daaw;
/* loaded from: classes.dex */
public final class az6 extends dz6 {
    public final /* synthetic */ bz6 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az6(bz6 bz6Var, fz6 fz6Var, CharSequence charSequence) {
        super(fz6Var, charSequence);
        this.v = bz6Var;
    }

    @Override // com.daaw.dz6
    public final int c(int i) {
        return i;
    }

    @Override // com.daaw.dz6
    public final int d(int i) {
        int i2 = i + 4000;
        if (i2 < this.r.length()) {
            return i2;
        }
        return -1;
    }
}
