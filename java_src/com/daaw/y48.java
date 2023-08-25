package com.daaw;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
/* loaded from: classes.dex */
public final class y48 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, wy8, fj8, du8, kq8, hi7, vd7, la8, yv7 {
    public final /* synthetic */ j58 p;

    public /* synthetic */ y48(j58 j58Var, v48 v48Var) {
        this.p = j58Var;
    }

    @Override // com.daaw.wy8
    public final void a(final ll4 ll4Var) {
        k65 k65Var;
        this.p.c0 = ll4Var;
        k65Var = this.p.k;
        k65Var.d(25, new c35() { // from class: com.daaw.s48
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ((mv3) obj).a(ll4.this);
            }
        });
        k65Var.c();
    }

    @Override // com.daaw.fj8
    public final void b(ql7 ql7Var) {
        fb8 fb8Var;
        fb8Var = this.p.q;
        fb8Var.g(ql7Var);
        this.p.L = null;
        this.p.T = null;
    }

    @Override // com.daaw.fj8
    public final void c(final boolean z) {
        boolean z2;
        k65 k65Var;
        j58 j58Var = this.p;
        z2 = j58Var.X;
        if (z2 == z) {
            return;
        }
        j58Var.X = z;
        k65Var = this.p.k;
        k65Var.d(23, new c35() { // from class: com.daaw.p48
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ((mv3) obj).k(z);
            }
        });
        k65Var.c();
    }

    @Override // com.daaw.wy8
    public final void d(f92 f92Var, tm7 tm7Var) {
        fb8 fb8Var;
        this.p.K = f92Var;
        fb8Var = this.p.q;
        fb8Var.S(f92Var, tm7Var);
    }

    @Override // com.daaw.wy8
    public final void e(int i, long j) {
        fb8 fb8Var;
        fb8Var = this.p.q;
        fb8Var.c(i, j);
    }

    @Override // com.daaw.wy8
    public final void f(long j, int i) {
        fb8 fb8Var;
        fb8Var = this.p.q;
        fb8Var.n(j, i);
    }

    @Override // com.daaw.fj8
    public final void g(Exception exc) {
        fb8 fb8Var;
        fb8Var = this.p.q;
        fb8Var.s(exc);
    }

    @Override // com.daaw.fj8
    public final void h(ql7 ql7Var) {
        fb8 fb8Var;
        this.p.T = ql7Var;
        fb8Var = this.p.q;
        fb8Var.b(ql7Var);
    }

    @Override // com.daaw.fj8
    public final void i(String str, long j, long j2) {
        fb8 fb8Var;
        fb8Var = this.p.q;
        fb8Var.O(str, j, j2);
    }

    @Override // com.daaw.fj8
    public final void j(Exception exc) {
        fb8 fb8Var;
        fb8Var = this.p.q;
        fb8Var.r(exc);
    }

    @Override // com.daaw.wy8
    public final void k(ql7 ql7Var) {
        fb8 fb8Var;
        this.p.S = ql7Var;
        fb8Var = this.p.q;
        fb8Var.l(ql7Var);
    }

    @Override // com.daaw.fj8
    public final void l(String str) {
        fb8 fb8Var;
        fb8Var = this.p.q;
        fb8Var.zzA(str);
    }

    @Override // com.daaw.fj8
    public final void m(f92 f92Var, tm7 tm7Var) {
        fb8 fb8Var;
        this.p.L = f92Var;
        fb8Var = this.p.q;
        fb8Var.q(f92Var, tm7Var);
    }

    @Override // com.daaw.wy8
    public final void n(ql7 ql7Var) {
        fb8 fb8Var;
        fb8Var = this.p.q;
        fb8Var.p(ql7Var);
        this.p.K = null;
        this.p.S = null;
    }

    @Override // com.daaw.fj8
    public final void o(int i, long j, long j2) {
        fb8 fb8Var;
        fb8Var = this.p.q;
        fb8Var.J(i, j, j2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        j58.o(this.p, surfaceTexture);
        this.p.P(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.p.S(null);
        this.p.P(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.p.P(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // com.daaw.wy8
    public final void p(Exception exc) {
        fb8 fb8Var;
        fb8Var = this.p.q;
        fb8Var.e(exc);
    }

    @Override // com.daaw.wy8
    public final void q(String str, long j, long j2) {
        fb8 fb8Var;
        fb8Var = this.p.q;
        fb8Var.f(str, j, j2);
    }

    @Override // com.daaw.wy8
    public final void r(String str) {
        fb8 fb8Var;
        fb8Var = this.p.q;
        fb8Var.m(str);
    }

    @Override // com.daaw.fj8
    public final void s(long j) {
        fb8 fb8Var;
        fb8Var = this.p.q;
        fb8Var.T(j);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.p.P(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.p.P(0, 0);
    }

    @Override // com.daaw.wy8
    public final void t(Object obj, long j) {
        fb8 fb8Var;
        Object obj2;
        k65 k65Var;
        fb8Var = this.p.q;
        fb8Var.U(obj, j);
        j58 j58Var = this.p;
        obj2 = j58Var.N;
        if (obj2 == obj) {
            k65Var = j58Var.k;
            k65Var.d(26, new c35() { // from class: com.daaw.g48
                @Override // com.daaw.c35
                public final void zza(Object obj3) {
                    mv3 mv3Var = (mv3) obj3;
                }
            });
            k65Var.c();
        }
    }

    @Override // com.daaw.yv7
    public final void zza(boolean z) {
        this.p.W();
    }
}
