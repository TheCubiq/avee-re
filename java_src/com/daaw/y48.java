package com.daaw;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
/* loaded from: classes.dex */
public final class y48 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, wy8, fj8, du8, kq8, hi7, vd7, la8, yv7 {

    /* renamed from: p */
    public final /* synthetic */ j58 f33362p;

    public /* synthetic */ y48(j58 j58Var, v48 v48Var) {
        this.f33362p = j58Var;
    }

    @Override // com.daaw.wy8
    /* renamed from: a */
    public final void mo4123a(final ll4 ll4Var) {
        k65 k65Var;
        this.f33362p.f14404c0 = ll4Var;
        k65Var = this.f33362p.f14418k;
        k65Var.m18020d(25, new c35() { // from class: com.daaw.s48
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ((mv3) obj).mo9147a(ll4.this);
            }
        });
        k65Var.m18021c();
    }

    @Override // com.daaw.fj8
    /* renamed from: b */
    public final void mo4122b(ql7 ql7Var) {
        fb8 fb8Var;
        fb8Var = this.f33362p.f14424q;
        fb8Var.mo9136g(ql7Var);
        this.f33362p.f14385L = null;
        this.f33362p.f14393T = null;
    }

    @Override // com.daaw.fj8
    /* renamed from: c */
    public final void mo4121c(final boolean z) {
        boolean z2;
        k65 k65Var;
        j58 j58Var = this.f33362p;
        z2 = j58Var.f14397X;
        if (z2 == z) {
            return;
        }
        j58Var.f14397X = z;
        k65Var = this.f33362p.f14418k;
        k65Var.m18020d(23, new c35() { // from class: com.daaw.p48
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ((mv3) obj).mo9131k(z);
            }
        });
        k65Var.m18021c();
    }

    @Override // com.daaw.wy8
    /* renamed from: d */
    public final void mo4120d(f92 f92Var, tm7 tm7Var) {
        fb8 fb8Var;
        this.f33362p.f14384K = f92Var;
        fb8Var = this.f33362p.f14424q;
        fb8Var.mo9153S(f92Var, tm7Var);
    }

    @Override // com.daaw.wy8
    /* renamed from: e */
    public final void mo4119e(int i, long j) {
        fb8 fb8Var;
        fb8Var = this.f33362p.f14424q;
        fb8Var.mo9143c(i, j);
    }

    @Override // com.daaw.wy8
    /* renamed from: f */
    public final void mo4118f(long j, int i) {
        fb8 fb8Var;
        fb8Var = this.f33362p.f14424q;
        fb8Var.mo9128n(j, i);
    }

    @Override // com.daaw.fj8
    /* renamed from: g */
    public final void mo4117g(Exception exc) {
        fb8 fb8Var;
        fb8Var = this.f33362p.f14424q;
        fb8Var.mo9123s(exc);
    }

    @Override // com.daaw.fj8
    /* renamed from: h */
    public final void mo4116h(ql7 ql7Var) {
        fb8 fb8Var;
        this.f33362p.f14393T = ql7Var;
        fb8Var = this.f33362p.f14424q;
        fb8Var.mo9145b(ql7Var);
    }

    @Override // com.daaw.fj8
    /* renamed from: i */
    public final void mo4115i(String str, long j, long j2) {
        fb8 fb8Var;
        fb8Var = this.f33362p.f14424q;
        fb8Var.mo9157O(str, j, j2);
    }

    @Override // com.daaw.fj8
    /* renamed from: j */
    public final void mo4114j(Exception exc) {
        fb8 fb8Var;
        fb8Var = this.f33362p.f14424q;
        fb8Var.mo9124r(exc);
    }

    @Override // com.daaw.wy8
    /* renamed from: k */
    public final void mo4113k(ql7 ql7Var) {
        fb8 fb8Var;
        this.f33362p.f14392S = ql7Var;
        fb8Var = this.f33362p.f14424q;
        fb8Var.mo9130l(ql7Var);
    }

    @Override // com.daaw.fj8
    /* renamed from: l */
    public final void mo4112l(String str) {
        fb8 fb8Var;
        fb8Var = this.f33362p.f14424q;
        fb8Var.zzA(str);
    }

    @Override // com.daaw.fj8
    /* renamed from: m */
    public final void mo4111m(f92 f92Var, tm7 tm7Var) {
        fb8 fb8Var;
        this.f33362p.f14385L = f92Var;
        fb8Var = this.f33362p.f14424q;
        fb8Var.mo9125q(f92Var, tm7Var);
    }

    @Override // com.daaw.wy8
    /* renamed from: n */
    public final void mo4110n(ql7 ql7Var) {
        fb8 fb8Var;
        fb8Var = this.f33362p.f14424q;
        fb8Var.mo9126p(ql7Var);
        this.f33362p.f14384K = null;
        this.f33362p.f14392S = null;
    }

    @Override // com.daaw.fj8
    /* renamed from: o */
    public final void mo4109o(int i, long j, long j2) {
        fb8 fb8Var;
        fb8Var = this.f33362p.f14424q;
        fb8Var.mo9160J(i, j, j2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        j58.m18806o(this.f33362p, surfaceTexture);
        this.f33362p.m18836P(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f33362p.m18833S(null);
        this.f33362p.m18836P(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f33362p.m18836P(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // com.daaw.wy8
    /* renamed from: p */
    public final void mo4108p(Exception exc) {
        fb8 fb8Var;
        fb8Var = this.f33362p.f14424q;
        fb8Var.mo9140e(exc);
    }

    @Override // com.daaw.wy8
    /* renamed from: q */
    public final void mo4107q(String str, long j, long j2) {
        fb8 fb8Var;
        fb8Var = this.f33362p.f14424q;
        fb8Var.mo9138f(str, j, j2);
    }

    @Override // com.daaw.wy8
    /* renamed from: r */
    public final void mo4106r(String str) {
        fb8 fb8Var;
        fb8Var = this.f33362p.f14424q;
        fb8Var.mo9129m(str);
    }

    @Override // com.daaw.fj8
    /* renamed from: s */
    public final void mo4105s(long j) {
        fb8 fb8Var;
        fb8Var = this.f33362p.f14424q;
        fb8Var.mo9152T(j);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f33362p.m18836P(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f33362p.m18836P(0, 0);
    }

    @Override // com.daaw.wy8
    /* renamed from: t */
    public final void mo4104t(Object obj, long j) {
        fb8 fb8Var;
        Object obj2;
        k65 k65Var;
        fb8Var = this.f33362p.f14424q;
        fb8Var.mo9151U(obj, j);
        j58 j58Var = this.f33362p;
        obj2 = j58Var.f14387N;
        if (obj2 == obj) {
            k65Var = j58Var.f14418k;
            k65Var.m18020d(26, new c35() { // from class: com.daaw.g48
                @Override // com.daaw.c35
                public final void zza(Object obj3) {
                    mv3 mv3Var = (mv3) obj3;
                }
            });
            k65Var.m18021c();
        }
    }

    @Override // com.daaw.yv7
    public final void zza(boolean z) {
        this.f33362p.m18829W();
    }
}
