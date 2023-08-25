package com.daaw;
/* loaded from: classes.dex */
public final class n54 extends j54 {
    public n54(y24 y24Var) {
        super(y24Var);
    }

    @Override // com.daaw.j54
    public final void h() {
    }

    @Override // com.daaw.j54
    public final boolean s(String str) {
        String j = d04.j(str);
        y24 y24Var = (y24) this.r.get();
        if (y24Var != null && j != null) {
            y24Var.t(j, this);
        }
        k04.zzj("VideoStreamNoopCache is doing nothing.");
        j(str, j, "noop", "Noop cache is a noop.");
        return false;
    }
}
