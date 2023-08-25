package com.daaw;
/* loaded from: classes2.dex */
public abstract class th0 extends ph implements iu, qf0 {
    public uh0 s;

    @Override // com.daaw.iu
    public void a() {
        t().X(this);
    }

    @Override // com.daaw.qf0
    public boolean d() {
        return true;
    }

    @Override // com.daaw.qf0
    public ys0 e() {
        return null;
    }

    public final uh0 t() {
        uh0 uh0Var = this.s;
        if (uh0Var != null) {
            return uh0Var;
        }
        ug0.s("job");
        return null;
    }

    @Override // com.daaw.yk0
    public String toString() {
        return aq.a(this) + '@' + aq.b(this) + "[job@" + aq.b(t()) + ']';
    }

    public final void u(uh0 uh0Var) {
        this.s = uh0Var;
    }
}
