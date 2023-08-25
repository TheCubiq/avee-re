package com.daaw;

import android.net.Uri;
import android.os.Handler;
/* loaded from: classes.dex */
public final class uv2 implements yv2, xv2 {

    /* renamed from: p */
    public final Uri f29562p;

    /* renamed from: q */
    public final jx2 f29563q;

    /* renamed from: r */
    public final ps2 f29564r;

    /* renamed from: s */
    public final int f29565s;

    /* renamed from: t */
    public final Handler f29566t;

    /* renamed from: u */
    public final tv2 f29567u;

    /* renamed from: v */
    public final kq2 f29568v = new kq2();

    /* renamed from: w */
    public final int f29569w;

    /* renamed from: x */
    public xv2 f29570x;

    /* renamed from: y */
    public mq2 f29571y;

    /* renamed from: z */
    public boolean f29572z;

    public uv2(Uri uri, jx2 jx2Var, ps2 ps2Var, int i, Handler handler, tv2 tv2Var, String str, int i2) {
        this.f29562p = uri;
        this.f29563q = jx2Var;
        this.f29564r = ps2Var;
        this.f29565s = i;
        this.f29566t = handler;
        this.f29567u = tv2Var;
        this.f29569w = i2;
    }

    @Override // com.daaw.yv2
    /* renamed from: a */
    public final void mo3169a(wv2 wv2Var) {
        ((sv2) wv2Var).m9822A();
    }

    @Override // com.daaw.yv2
    /* renamed from: b */
    public final void mo3168b(op2 op2Var, boolean z, xv2 xv2Var) {
        this.f29570x = xv2Var;
        lw2 lw2Var = new lw2(-9223372036854775807L, false);
        this.f29571y = lw2Var;
        xv2Var.mo4485d(lw2Var, null);
    }

    @Override // com.daaw.yv2
    /* renamed from: c */
    public final wv2 mo3167c(int i, nx2 nx2Var) {
        az2.m26585c(i == 0);
        return new sv2(this.f29562p, this.f29563q.zza(), this.f29564r.zza(), this.f29565s, this.f29566t, this.f29567u, this, nx2Var, null, this.f29569w, null);
    }

    @Override // com.daaw.xv2
    /* renamed from: d */
    public final void mo4485d(mq2 mq2Var, Object obj) {
        kq2 kq2Var = this.f29568v;
        mq2Var.mo15851d(0, kq2Var, false);
        boolean z = kq2Var.f16696c != -9223372036854775807L;
        if (!this.f29572z || z) {
            this.f29571y = mq2Var;
            this.f29572z = z;
            this.f29570x.mo4485d(mq2Var, null);
        }
    }

    @Override // com.daaw.yv2
    public final void zza() {
    }

    @Override // com.daaw.yv2
    public final void zzd() {
        this.f29570x = null;
    }
}
