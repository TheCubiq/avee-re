package com.daaw;
/* loaded from: classes2.dex */
public abstract class th0 extends AbstractC2552ph implements InterfaceC1754iu, qf0 {

    /* renamed from: s */
    public uh0 f27646s;

    @Override // com.daaw.InterfaceC1754iu
    /* renamed from: a */
    public void mo1955a() {
        m9115t().m8231X(this);
    }

    @Override // com.daaw.qf0
    /* renamed from: d */
    public boolean mo3346d() {
        return true;
    }

    @Override // com.daaw.qf0
    /* renamed from: e */
    public ys0 mo3345e() {
        return null;
    }

    /* renamed from: t */
    public final uh0 m9115t() {
        uh0 uh0Var = this.f27646s;
        if (uh0Var != null) {
            return uh0Var;
        }
        ug0.m8255s("job");
        return null;
    }

    @Override // com.daaw.yk0
    public String toString() {
        return C0666aq.m27227a(this) + '@' + C0666aq.m27226b(this) + "[job@" + C0666aq.m27226b(m9115t()) + ']';
    }

    /* renamed from: u */
    public final void m9114u(uh0 uh0Var) {
        this.f27646s = uh0Var;
    }
}
