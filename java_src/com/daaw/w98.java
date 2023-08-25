package com.daaw;

import android.os.Bundle;
/* loaded from: classes2.dex */
public final class w98 {

    /* renamed from: a */
    public long f31089a;

    /* renamed from: b */
    public long f31090b;

    /* renamed from: c */
    public final hl2 f31091c;

    /* renamed from: d */
    public final /* synthetic */ ca8 f31092d;

    public w98(ca8 ca8Var) {
        this.f31092d = ca8Var;
        this.f31091c = new k98(this, ca8Var.f25143a);
        long mo15859b = ca8Var.f25143a.mo3909b().mo15859b();
        this.f31089a = mo15859b;
        this.f31090b = mo15859b;
    }

    /* renamed from: a */
    public final void m6281a() {
        this.f31091c.m20638b();
        this.f31089a = 0L;
        this.f31090b = 0L;
    }

    /* renamed from: b */
    public final void m6280b(long j) {
        this.f31091c.m20638b();
    }

    /* renamed from: c */
    public final void m6279c(long j) {
        this.f31092d.mo6991f();
        this.f31091c.m20638b();
        this.f31089a = j;
        this.f31090b = j;
    }

    /* renamed from: d */
    public final boolean m6278d(boolean z, boolean z2, long j) {
        this.f31092d.mo6991f();
        this.f31092d.m25515g();
        rk8.m11208b();
        if (!this.f31092d.f25143a.m24020z().m12677B(null, m75.f18530f0) || this.f31092d.f25143a.m24031n()) {
            this.f31092d.f25143a.m24053F().f17013o.m4399b(this.f31092d.f25143a.mo3909b().mo15860a());
        }
        long j2 = j - this.f31089a;
        if (!z && j2 < 1000) {
            this.f31092d.f25143a.mo3895i().m14156v().m20652b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
            return false;
        }
        if (!z2) {
            j2 = j - this.f31090b;
            this.f31090b = j;
        }
        this.f31092d.f25143a.mo3895i().m14156v().m20652b("Recording user engagement, ms", Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        dd8.m24455y(this.f31092d.f25143a.m24048K().m11742s(!this.f31092d.f25143a.m24020z().m12675D()), bundle, true);
        if (!z2) {
            this.f31092d.f25143a.m24050I().m13683u("auto", "_e", bundle);
        }
        this.f31089a = j;
        this.f31091c.m20638b();
        this.f31091c.m20637d(3600000L);
        return true;
    }
}
