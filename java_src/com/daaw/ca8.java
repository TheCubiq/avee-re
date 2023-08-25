package com.daaw;

import android.os.Handler;
import android.os.Looper;
/* loaded from: classes2.dex */
public final class ca8 extends c86 {

    /* renamed from: c */
    public Handler f5682c;

    /* renamed from: d */
    public final z98 f5683d;

    /* renamed from: e */
    public final w98 f5684e;

    /* renamed from: f */
    public final h98 f5685f;

    public ca8(dr6 dr6Var) {
        super(dr6Var);
        this.f5683d = new z98(this);
        this.f5684e = new w98(this);
        this.f5685f = new h98(this);
    }

    /* renamed from: p */
    public static /* bridge */ /* synthetic */ void m25461p(ca8 ca8Var, long j) {
        ca8Var.mo6991f();
        ca8Var.m25459s();
        ca8Var.f25143a.mo3895i().m14156v().m20652b("Activity paused, time", Long.valueOf(j));
        ca8Var.f5685f.m20912a(j);
        if (ca8Var.f25143a.m24020z().m12675D()) {
            ca8Var.f5684e.m6280b(j);
        }
    }

    /* renamed from: q */
    public static /* bridge */ /* synthetic */ void m25460q(ca8 ca8Var, long j) {
        ca8Var.mo6991f();
        ca8Var.m25459s();
        ca8Var.f25143a.mo3895i().m14156v().m20652b("Activity resumed, time", Long.valueOf(j));
        if (ca8Var.f25143a.m24020z().m12675D() || ca8Var.f25143a.m24053F().f17016r.m12012b()) {
            ca8Var.f5684e.m6279c(j);
        }
        ca8Var.f5685f.m20911b();
        z98 z98Var = ca8Var.f5683d;
        z98Var.f34633a.mo6991f();
        if (z98Var.f34633a.f25143a.m24031n()) {
            z98Var.m2583b(z98Var.f34633a.f25143a.mo3909b().mo15860a(), false);
        }
    }

    @Override // com.daaw.c86
    /* renamed from: m */
    public final boolean mo5306m() {
        return false;
    }

    /* renamed from: s */
    public final void m25459s() {
        mo6991f();
        if (this.f5682c == null) {
            this.f5682c = new np3(Looper.getMainLooper());
        }
    }
}
