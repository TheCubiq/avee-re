package com.daaw;
/* loaded from: classes2.dex */
public abstract class l75 implements Runnable {

    /* renamed from: p */
    public final long f17103p;

    /* renamed from: q */
    public final long f17104q;

    /* renamed from: r */
    public final boolean f17105r;

    /* renamed from: s */
    public final /* synthetic */ gk5 f17106s;

    public l75(gk5 gk5Var, boolean z) {
        this.f17106s = gk5Var;
        this.f17103p = gk5Var.f11390b.mo15860a();
        this.f17104q = gk5Var.f11390b.mo15859b();
        this.f17105r = z;
    }

    /* renamed from: a */
    public abstract void mo2297a();

    /* renamed from: b */
    public void mo3430b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        z = this.f17106s.f11395g;
        if (z) {
            mo3430b();
            return;
        }
        try {
            mo2297a();
        } catch (Exception e) {
            this.f17106s.m21525k(e, false, this.f17105r);
            mo3430b();
        }
    }
}
