package com.daaw;
/* loaded from: classes.dex */
public final class n54 extends j54 {
    public n54(y24 y24Var) {
        super(y24Var);
    }

    @Override // com.daaw.j54
    /* renamed from: h */
    public final void mo10703h() {
    }

    @Override // com.daaw.j54
    /* renamed from: s */
    public final boolean mo10698s(String str) {
        String m24822j = d04.m24822j(str);
        y24 y24Var = (y24) this.f14367r.get();
        if (y24Var != null && m24822j != null) {
            y24Var.mo4236t(m24822j, this);
        }
        k04.zzj("VideoStreamNoopCache is doing nothing.");
        m18856j(str, m24822j, "noop", "Noop cache is a noop.");
        return false;
    }
}
