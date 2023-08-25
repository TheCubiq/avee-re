package com.daaw;
/* loaded from: classes2.dex */
public final class d28 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ boolean f6420p;

    /* renamed from: q */
    public final /* synthetic */ p28 f6421q;

    public d28(p28 p28Var, boolean z) {
        this.f6421q = p28Var;
        this.f6420p = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean m24031n = this.f6421q.f25143a.m24031n();
        boolean m24032m = this.f6421q.f25143a.m24032m();
        this.f6421q.f25143a.m24035j(this.f6420p);
        if (m24032m == this.f6420p) {
            this.f6421q.f25143a.mo3895i().m14156v().m20652b("Default data collection state already set to", Boolean.valueOf(this.f6420p));
        }
        if (this.f6421q.f25143a.m24031n() == m24031n || this.f6421q.f25143a.m24031n() != this.f6421q.f25143a.m24032m()) {
            this.f6421q.f25143a.mo3895i().m14154x().m20651c("Default data collection is different than actual status", Boolean.valueOf(this.f6420p), Boolean.valueOf(m24031n));
        }
        this.f6421q.m13706P();
    }
}
