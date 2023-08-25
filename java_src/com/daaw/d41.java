package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import com.daaw.avee.comp.Visualizer.VisualizerViewCore;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
/* loaded from: classes.dex */
public class d41 implements GLSurfaceView.Renderer {
    public final y31 a;
    public Context c;
    public sg0 e;
    public f61 b = null;
    public boolean d = false;
    public long f = System.currentTimeMillis();

    public d41(Context context, Resources resources, sg0 sg0Var) {
        this.c = null;
        this.c = context;
        this.e = sg0Var;
        y31 y31Var = new y31(sg0Var);
        this.a = y31Var;
        y31Var.P(resources);
        d();
    }

    public g40 a() {
        return this.a.C();
    }

    public int b() {
        return this.a.D();
    }

    public void c(vn vnVar, od0 od0Var) {
        f61 f61Var = this.b;
        if (f61Var != null) {
            f61Var.p0(vnVar, od0Var);
        }
    }

    public void d() {
        vn a = VisualizerViewCore.y.a(null);
        if (a != null) {
            g(a);
        }
    }

    public void e() {
        f61 f61Var = this.b;
        if (f61Var != null) {
            f61Var.l();
        }
    }

    public void f(vn vnVar) {
        f61 f61Var = this.b;
        if (f61Var != null) {
            f61Var.t0(vnVar);
        }
    }

    public void g(vn vnVar) {
        if (this.b == null) {
            this.b = tv1.i().e(0, false, "");
        }
        this.b.t0(vnVar);
        f61 f61Var = this.b;
        if (f61Var != null) {
            f61Var.l();
        }
        this.e.f();
    }

    public void h(f61 f61Var) {
        this.b = f61Var;
        if (f61Var != null) {
            f61Var.l();
        }
        this.e.f();
    }

    public void i(int i, int i2) {
        if (i2 <= 0) {
            this.a.U(i);
            return;
        }
        tv e = this.b.e(i2);
        if (e != null) {
            e.U(i);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        if (this.d && this.a.u.y()) {
            f61 f61Var = this.b;
            f40 a = VisualizerViewCore.B.a(null);
            GLES20.glClearColor(0.1f, 0.1f, 0.1f, 1.0f);
            GLES20.glClear(16640);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            boolean z = true;
            this.a.T(1);
            y31 y31Var = this.a;
            if (a != null) {
                y31Var.N(a.c, a.a, a.b);
            } else {
                y31Var.N(-1, -1, -1);
            }
            VisualizerViewCore.A.a(Float.valueOf(this.a.d()), Float.valueOf(this.a.g()));
            if (f61Var != null) {
                f61Var.y(this.a, null, null);
            }
            if (f61Var != null) {
                f61Var.s0(a != null, (a == null || !a.d) ? false : false, a != null ? a.e : null);
            }
            if (f61Var != null) {
                f61Var.B(this.a, null);
            }
            this.a.M();
            this.a.i(null);
            if (f61Var == null || a == null || f61Var.l0() == null) {
                return;
            }
            int[] l0 = f61Var.l0();
            VisualizerViewCore.C.a(l0, Integer.valueOf(f61Var.n0()), Integer.valueOf(f61Var.m0()), l0);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        lz1.c("onSurfaceChanged: " + i + " ; " + i2);
        this.a.Q(dx0.e(), i, i2);
        f61 f61Var = this.b;
        if (f61Var != null) {
            f61Var.l();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.d = true;
        this.a.R();
        f61 f61Var = this.b;
        if (f61Var != null) {
            f61Var.l();
        }
    }
}
