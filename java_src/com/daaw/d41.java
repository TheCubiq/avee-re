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

    /* renamed from: a */
    public final y31 f6519a;

    /* renamed from: c */
    public Context f6521c;

    /* renamed from: e */
    public sg0 f6523e;

    /* renamed from: b */
    public f61 f6520b = null;

    /* renamed from: d */
    public boolean f6522d = false;

    /* renamed from: f */
    public long f6524f = System.currentTimeMillis();

    public d41(Context context, Resources resources, sg0 sg0Var) {
        this.f6521c = null;
        this.f6521c = context;
        this.f6523e = sg0Var;
        y31 y31Var = new y31(sg0Var);
        this.f6519a = y31Var;
        y31Var.m4214P(resources);
        m24653d();
    }

    /* renamed from: a */
    public g40 m24656a() {
        return this.f6519a.m4227C();
    }

    /* renamed from: b */
    public int m24655b() {
        return this.f6519a.m4226D();
    }

    /* renamed from: c */
    public void m24654c(C3355vn c3355vn, od0 od0Var) {
        f61 f61Var = this.f6520b;
        if (f61Var != null) {
            f61Var.m22891p0(c3355vn, od0Var);
        }
    }

    /* renamed from: d */
    public void m24653d() {
        C3355vn m6692a = VisualizerViewCore.f3831y.m6692a(null);
        if (m6692a != null) {
            m24650g(m6692a);
        }
    }

    /* renamed from: e */
    public void m24652e() {
        f61 f61Var = this.f6520b;
        if (f61Var != null) {
            f61Var.mo2451l();
        }
    }

    /* renamed from: f */
    public void m24651f(C3355vn c3355vn) {
        f61 f61Var = this.f6520b;
        if (f61Var != null) {
            f61Var.m22887t0(c3355vn);
        }
    }

    /* renamed from: g */
    public void m24650g(C3355vn c3355vn) {
        if (this.f6520b == null) {
            this.f6520b = tv1.m8771i().m8775e(0, false, "");
        }
        this.f6520b.m22887t0(c3355vn);
        f61 f61Var = this.f6520b;
        if (f61Var != null) {
            f61Var.mo2451l();
        }
        this.f6523e.mo2871f();
    }

    /* renamed from: h */
    public void m24649h(f61 f61Var) {
        this.f6520b = f61Var;
        if (f61Var != null) {
            f61Var.mo2451l();
        }
        this.f6523e.mo2871f();
    }

    /* renamed from: i */
    public void m24648i(int i, int i2) {
        if (i2 <= 0) {
            this.f6519a.m4209U(i);
            return;
        }
        AbstractC3118tv mo7693e = this.f6520b.mo7693e(i2);
        if (mo7693e != null) {
            mo7693e.m8797U(i);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        if (this.f6522d && this.f6519a.f33263u.m4161y()) {
            f61 f61Var = this.f6520b;
            f40 m6692a = VisualizerViewCore.f3817B.m6692a(null);
            GLES20.glClearColor(0.1f, 0.1f, 0.1f, 1.0f);
            GLES20.glClear(16640);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            boolean z = true;
            this.f6519a.m4210T(1);
            y31 y31Var = this.f6519a;
            if (m6692a != null) {
                y31Var.m4216N(m6692a.f9088c, m6692a.f9086a, m6692a.f9087b);
            } else {
                y31Var.m4216N(-1, -1, -1);
            }
            VisualizerViewCore.f3816A.m10862a(Float.valueOf(this.f6519a.mo2887d()), Float.valueOf(this.f6519a.mo2884g()));
            if (f61Var != null) {
                f61Var.mo2435y(this.f6519a, null, null);
            }
            if (f61Var != null) {
                f61Var.m22888s0(m6692a != null, (m6692a == null || !m6692a.f9089d) ? false : false, m6692a != null ? m6692a.f9090e : null);
            }
            if (f61Var != null) {
                f61Var.mo2460B(this.f6519a, null);
            }
            this.f6519a.m4217M();
            this.f6519a.mo2882i(null);
            if (f61Var == null || m6692a == null || f61Var.m22895l0() == null) {
                return;
            }
            int[] m22895l0 = f61Var.m22895l0();
            VisualizerViewCore.f3818C.m8756a(m22895l0, Integer.valueOf(f61Var.m22893n0()), Integer.valueOf(f61Var.m22894m0()), m22895l0);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        lz1.m16363c("onSurfaceChanged: " + i + " ; " + i2);
        this.f6519a.m4213Q(dx0.m23837e(), i, i2);
        f61 f61Var = this.f6520b;
        if (f61Var != null) {
            f61Var.mo2451l();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.f6522d = true;
        this.f6519a.m4212R();
        f61 f61Var = this.f6520b;
        if (f61Var != null) {
            f61Var.mo2451l();
        }
    }
}
