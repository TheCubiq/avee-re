package com.daaw;

import android.os.Handler;
/* loaded from: classes2.dex */
public final class h98 {

    /* renamed from: a */
    public e98 f12215a;

    /* renamed from: b */
    public final /* synthetic */ ca8 f12216b;

    public h98(ca8 ca8Var) {
        this.f12216b = ca8Var;
    }

    /* renamed from: a */
    public final void m20912a(long j) {
        Handler handler;
        this.f12215a = new e98(this, this.f12216b.f25143a.mo3909b().mo15860a(), j);
        handler = this.f12216b.f5682c;
        handler.postDelayed(this.f12215a, 2000L);
    }

    /* renamed from: b */
    public final void m20911b() {
        Handler handler;
        this.f12216b.mo6991f();
        e98 e98Var = this.f12215a;
        if (e98Var != null) {
            handler = this.f12216b.f5682c;
            handler.removeCallbacks(e98Var);
        }
        this.f12216b.f25143a.m24053F().f17016r.m12013a(false);
    }
}
