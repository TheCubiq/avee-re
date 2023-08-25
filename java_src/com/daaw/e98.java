package com.daaw;

import android.os.Bundle;
/* loaded from: classes2.dex */
public final class e98 implements Runnable {

    /* renamed from: p */
    public final long f8275p;

    /* renamed from: q */
    public final long f8276q;

    /* renamed from: r */
    public final /* synthetic */ h98 f8277r;

    public e98(h98 h98Var, long j, long j2) {
        this.f8277r = h98Var;
        this.f8275p = j;
        this.f8276q = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8277r.f12216b.f25143a.mo3882r().m6978z(new Runnable() { // from class: com.daaw.b98
            @Override // java.lang.Runnable
            public final void run() {
                e98 e98Var = e98.this;
                h98 h98Var = e98Var.f8277r;
                long j = e98Var.f8275p;
                long j2 = e98Var.f8276q;
                h98Var.f12216b.mo6991f();
                h98Var.f12216b.f25143a.mo3895i().m14161p().m20653a("Application going to the background");
                h98Var.f12216b.f25143a.m24053F().f17016r.m12013a(true);
                Bundle bundle = new Bundle();
                if (!h98Var.f12216b.f25143a.m24020z().m12675D()) {
                    h98Var.f12216b.f5684e.m6280b(j2);
                    h98Var.f12216b.f5684e.m6278d(false, false, j2);
                }
                h98Var.f12216b.f25143a.m24050I().m13682v("auto", "_ab", j, bundle);
            }
        });
    }
}
