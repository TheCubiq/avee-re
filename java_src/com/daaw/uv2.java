package com.daaw;

import android.net.Uri;
import android.os.Handler;
/* loaded from: classes.dex */
public final class uv2 implements yv2, xv2 {
    public final Uri p;
    public final jx2 q;
    public final ps2 r;
    public final int s;
    public final Handler t;
    public final tv2 u;
    public final kq2 v = new kq2();
    public final int w;
    public xv2 x;
    public mq2 y;
    public boolean z;

    public uv2(Uri uri, jx2 jx2Var, ps2 ps2Var, int i, Handler handler, tv2 tv2Var, String str, int i2) {
        this.p = uri;
        this.q = jx2Var;
        this.r = ps2Var;
        this.s = i;
        this.t = handler;
        this.u = tv2Var;
        this.w = i2;
    }

    @Override // com.daaw.yv2
    public final void a(wv2 wv2Var) {
        ((sv2) wv2Var).A();
    }

    @Override // com.daaw.yv2
    public final void b(op2 op2Var, boolean z, xv2 xv2Var) {
        this.x = xv2Var;
        lw2 lw2Var = new lw2(-9223372036854775807L, false);
        this.y = lw2Var;
        xv2Var.d(lw2Var, null);
    }

    @Override // com.daaw.yv2
    public final wv2 c(int i, nx2 nx2Var) {
        az2.c(i == 0);
        return new sv2(this.p, this.q.zza(), this.r.zza(), this.s, this.t, this.u, this, nx2Var, null, this.w, null);
    }

    @Override // com.daaw.xv2
    public final void d(mq2 mq2Var, Object obj) {
        kq2 kq2Var = this.v;
        mq2Var.d(0, kq2Var, false);
        boolean z = kq2Var.c != -9223372036854775807L;
        if (!this.z || z) {
            this.y = mq2Var;
            this.z = z;
            this.x.d(mq2Var, null);
        }
    }

    @Override // com.daaw.yv2
    public final void zza() {
    }

    @Override // com.daaw.yv2
    public final void zzd() {
        this.x = null;
    }
}
