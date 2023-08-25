package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.SystemClock;
import com.daaw.avee.R;
import com.daaw.de0;
import java.util.ArrayList;
import java.util.List;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public class y31 implements de0 {
    public final float[] d;
    public final c u;
    public final float a = -10.0f;
    public final float[] b = new float[16];
    public final float[] c = new float[16];
    public float e = 0.0f;
    public float f = 0.0f;
    public int g = 0;
    public long h = 0;
    public long i = 0;
    public long j = 0;
    public float k = 0.0f;
    public int l = 2;
    public int m = 2;
    public int n = 2;
    public int o = 2;
    public int p = 0;
    public int q = 0;
    public int r = -1;
    public g40 s = new g40();
    public e40 t = null;
    public List<or1> v = new ArrayList();
    public boolean w = false;
    public boolean x = true;
    public int y = 0;
    public int z = 0;
    public final pr1 A = new pr1();
    public final pr1 B = new pr1();
    public final pr1 C = new pr1();
    public final pr1 D = new pr1();
    public final pr1 E = new pr1();

    /* loaded from: classes.dex */
    public class a implements f0<y31, sr1> {
        public a() {
        }

        @Override // com.daaw.f0
        /* renamed from: b */
        public void a(y31 y31Var, sr1 sr1Var) {
            sr1Var.E("u_projView", false, y31.this.K());
            sr1Var.x("u_texture", 0);
        }
    }

    /* loaded from: classes.dex */
    public class b implements f0<y31, sr1> {
        public b() {
        }

        @Override // com.daaw.f0
        /* renamed from: b */
        public void a(y31 y31Var, sr1 sr1Var) {
            sr1Var.x("u_texture", 0);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements de0.a {
        public z6 A;
        public z6 B;
        public z6 C;
        public z6 D;
        public z6 E;
        public ok0 F;
        public Bitmap G;
        public Bitmap H;
        public Bitmap I;
        public Bitmap J;
        public Bitmap K;
        public Bitmap L;
        public Bitmap M;
        public z6[] N = new z6[5];
        public final sg0 a;
        public final aq0 b;
        public sr1 c;
        public sr1 d;
        public sr1 e;
        public sr1 f;
        public sr1 g;
        public sr1 h;
        public sr1 i;
        public sr1 j;
        public sr1 k;
        public tc l;
        public ue1 m;
        public q40 n;
        public qr1 o;
        public qr1 p;
        public qr1 q;
        public qr1 r;
        public qr1 s;
        public qr1 t;
        public qr1 u;
        public qr1 v;
        public qr1 w;
        public z6 x;
        public z6 y;
        public z6 z;

        public c(y31 y31Var, sg0 sg0Var) {
            this.a = sg0Var;
            this.b = new aq0(y31Var);
        }

        public void A(Resources resources) {
            this.G = BitmapFactory.decodeResource(resources, R.drawable.path_edge);
            this.H = BitmapFactory.decodeResource(resources, R.drawable.circle_w_a_64);
            this.I = BitmapFactory.decodeResource(resources, R.drawable.square_w_a_64);
            this.J = BitmapFactory.decodeResource(resources, R.drawable.square_ysides_w_a_64);
            this.K = BitmapFactory.decodeResource(resources, R.drawable.random16);
            this.L = BitmapFactory.decodeResource(resources, R.drawable.ic_launcher);
            this.M = BitmapFactory.decodeResource(resources, R.drawable.loading_placeholder);
        }

        public void B() {
            Context e = dx0.e();
            if (e == null) {
                return;
            }
            Resources resources = e.getResources();
            q40 q40Var = this.n;
            if (q40Var != null) {
                q40Var.b();
            }
            this.n = new q40();
            vr1 vr1Var = new vr1(-1, 2, 2, 9729, 9729, 10497, false);
            vr1 vr1Var2 = new vr1(-16777216, 2, 2, 9729, 9729, 10497, false);
            z6 z6Var = this.x;
            if (z6Var != null) {
                z6Var.a();
            }
            this.x = new z6(vr1Var, true);
            z6 z6Var2 = this.y;
            if (z6Var2 != null) {
                z6Var2.a();
            }
            this.y = new z6(vr1Var2, true);
            z6 z6Var3 = this.z;
            if (z6Var3 != null) {
                z6Var3.a();
            }
            this.z = new z6(new vr1(this.G, 9729, 9729, 10497, true), true);
            z6 z6Var4 = this.C;
            if (z6Var4 != null) {
                z6Var4.a();
            }
            this.C = new z6(new vr1(this.H, 9729, 9729, 10497, true), true);
            z6 z6Var5 = this.A;
            if (z6Var5 != null) {
                z6Var5.a();
            }
            this.A = new z6(new vr1(this.I, 9729, 9729, 10497, true), true);
            z6 z6Var6 = this.B;
            if (z6Var6 != null) {
                z6Var6.a();
            }
            this.B = new z6(new vr1(this.J, 9729, 9729, 10497, true), true);
            z6 z6Var7 = this.D;
            if (z6Var7 != null) {
                z6Var7.a();
            }
            this.D = new z6(new vr1(this.K, 9729, 9729, 10497, false), true);
            z6 z6Var8 = this.E;
            if (z6Var8 != null) {
                z6Var8.a();
            }
            this.E = new z6(new vr1(this.M, 9729, 9729, 10497, false), true);
            this.F = new ok0(this.E.d(), false);
            this.c = i(this.c);
            sr1 z = z(resources, R.raw.blur_vert, R.raw.blurh_frag);
            this.c = z;
            q6.f(z);
            this.d = i(this.d);
            sr1 z2 = z(resources, R.raw.blur_vert, R.raw.blurv_frag);
            this.d = z2;
            q6.f(z2);
            this.e = i(this.e);
            sr1 z3 = z(resources, R.raw.buffer_vert, R.raw.blur_kernel_frag);
            this.e = z3;
            q6.f(z3);
            this.f = i(this.f);
            sr1 z4 = z(resources, R.raw.blur_vert, R.raw.blur_stack_frag);
            this.f = z4;
            q6.f(z4);
            this.g = i(this.g);
            sr1 z5 = z(resources, R.raw.fxaa_vert, R.raw.fxaa_frag);
            this.g = z5;
            q6.f(z5);
            this.h = i(this.h);
            sr1 z6 = z(resources, R.raw.buffer_vert, R.raw.buffer_frag);
            this.h = z6;
            q6.f(z6);
            this.i = i(this.i);
            sr1 z7 = z(resources, R.raw.buffer_fx_ligh_vert, R.raw.buffer_fx_light_frag);
            this.i = z7;
            q6.f(z7);
            this.j = i(this.j);
            sr1 z8 = z(resources, R.raw.buffer_rgb_split_vert, R.raw.buffer_rgb_split_frag);
            this.j = z8;
            q6.f(z8);
            this.k = i(this.k);
            sr1 z9 = z(resources, R.raw.buffer_motion_blur_vert, R.raw.buffer_motion_blur_frag);
            this.k = z9;
            q6.f(z9);
            this.o = null;
            this.p = null;
            this.q = null;
            this.r = null;
            this.s = null;
            this.t = null;
            this.u = null;
            this.v = null;
            this.w = null;
            try {
                this.l = (tc) br1.i(this.l);
                uc ucVar = new uc(400);
                this.l = ucVar;
                this.o = ucVar.g(this.h);
                this.p = this.l.g(this.h);
                this.q = this.l.g(this.i);
                this.r = this.l.g(this.j);
                this.s = this.l.g(this.k);
                this.t = this.l.g(l());
                this.u = this.l.g(m());
                this.v = this.l.g(k());
                this.w = this.l.g(n());
            } catch (Exception e2) {
                lz1.c("Resources loading error: " + e2.getMessage());
                qw1<String> qw1Var = vy.a;
                qw1Var.a("Resources loading error: " + e2.getMessage());
            }
            try {
                this.m = new ue1(this.l);
            } catch (Exception e3) {
                lz1.c("Resources loading error: " + e3.getMessage());
                qw1<String> qw1Var2 = vy.a;
                qw1Var2.a("Resources loading error: " + e3.getMessage());
            }
        }

        @Override // com.daaw.de0.a
        public aq0 a() {
            return this.b;
        }

        @Override // com.daaw.de0.a
        public sg0 b() {
            return this.a;
        }

        @Override // com.daaw.de0.a
        public z6 c() {
            return this.x;
        }

        @Override // com.daaw.de0.a
        public z6 d() {
            return this.C;
        }

        @Override // com.daaw.de0.a
        public z6 e() {
            return this.A;
        }

        @Override // com.daaw.de0.a
        public z6 f() {
            return this.B;
        }

        public final sr1 i(sr1 sr1Var) {
            if (sr1Var != null) {
                sr1Var.e();
                return null;
            }
            return null;
        }

        public sr1 j() {
            return this.i;
        }

        public sr1 k() {
            return this.e;
        }

        public sr1 l() {
            return this.c;
        }

        public sr1 m() {
            return this.d;
        }

        public sr1 n() {
            return this.f;
        }

        public tc o() {
            return this.l;
        }

        public qr1 p() {
            return this.s;
        }

        public qr1 q() {
            return this.r;
        }

        public qr1 r() {
            return this.o;
        }

        public qr1 s() {
            return this.q;
        }

        public qr1 t() {
            return this.p;
        }

        public qr1 u() {
            return this.w;
        }

        public ue1 v() {
            return this.m;
        }

        public q40 w() {
            return this.n;
        }

        public sr1 x() {
            return this.g;
        }

        public boolean y() {
            return (this.l == null || this.m == null || this.h == null) ? false : true;
        }

        public sr1 z(Resources resources, int i, int i2) {
            try {
                sr1 sr1Var = new sr1(cr1.q(resources, i), cr1.q(resources, i2));
                if (sr1Var.k().length() != 0) {
                    lz1.c(sr1Var.k());
                }
                return sr1Var;
            } catch (Exception e) {
                lz1.c("(" + i + "; " + i2 + ") Resources loading error: " + e.getMessage());
                return null;
            }
        }
    }

    public y31(sg0 sg0Var) {
        float[] fArr = new float[16];
        this.d = fArr;
        this.u = new c(this, sg0Var);
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, 0.0f, 0.0f, -10.0f);
    }

    @Override // com.daaw.de0
    /* renamed from: A */
    public tc j() {
        return this.u.o();
    }

    public or1 B(int i) {
        if (i < this.v.size()) {
            return this.v.get(i);
        }
        return null;
    }

    public g40 C() {
        return this.s;
    }

    public int D() {
        return this.g;
    }

    public float E() {
        return this.f;
    }

    public int F() {
        int i = this.q;
        return i < 2 ? this.m : i;
    }

    public int G() {
        int i = this.p;
        return i < 2 ? this.l : i;
    }

    public boolean H() {
        return true;
    }

    public cs1 I() {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(34024, iArr, 0);
        int i = iArr[0];
        lz1.a("OGL Max render buffer size: " + i);
        lz1.a("fullscreen size: " + G() + "; " + F());
        return new cs1(Math.min(G(), i), Math.min(F(), i));
    }

    public int J() {
        return this.z;
    }

    public float[] K() {
        return this.b;
    }

    public boolean L(bs1 bs1Var, float f) {
        return true;
    }

    public void M() {
        this.u.l.r(this);
        this.z = 0;
    }

    public void N(int i, int i2, int i3) {
        g40 g40Var = this.s;
        g40Var.d = g40Var.e;
        g40Var.e = 0;
        g40Var.f = g40Var.g;
        g40Var.g = 0;
        g40Var.h = g40Var.i;
        g40Var.i = 0;
        g40Var.k = g40Var.j;
        g40Var.j = 0;
        this.p = i2;
        this.q = i3;
        if (i > 0) {
            this.g = i;
            this.i = 0L;
            float f = i * 0.001f;
            this.e = f;
            this.f = f;
            g40Var.b = (int) (1.0f / f);
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            int i4 = (int) (uptimeMillis - this.i);
            this.g = i4;
            g40 g40Var2 = this.s;
            int i5 = g40Var2.c + 1;
            g40Var2.c = i5;
            if (uptimeMillis - this.h >= 1000) {
                g40Var2.b = i5;
                g40Var2.c = 0;
                this.h = uptimeMillis;
            }
            this.i = uptimeMillis;
            if (i4 < 0) {
                this.g = 0;
            }
            if (this.g > 200) {
                this.g = 200;
            }
            float f2 = this.g * 0.001f;
            this.e = f2;
            this.f = (this.f * 0.5f) + (f2 * 0.5f);
        }
        long j = this.j + this.g;
        this.j = j;
        this.k = ((float) j) * 0.001f;
        this.s.a = 0;
        this.w = this.u.a.l() > 0;
        this.x = (this.u.a.g() & 1) != 0;
        q();
        o(null, true);
        this.u.r().c(true, new a());
        this.u.t().c(true, new b());
        p(this.u.j());
        this.u.j().E("u_projView", false, K());
        this.u.j().x("u_texture", 0);
        this.u.j().x("u_texture2", 1);
        this.u.j().s("maskadd", 0.0f);
        this.u.j().s("maskmul", 1.0f);
        this.u.j().s("mask_l_add", 1.0f);
        this.u.j().s("mask_l_mul", 0.0f);
        this.u.j().s("tex2_y_add", 0.0f);
        this.u.j().s("tex2_y_mul", 1.0f);
        this.u.j().v("Color2", 0.0f, 0.0f, 0.0f, 1.0f);
        this.u.j().s("saturation", 1.0f);
        if (this.u.F != null) {
            this.u.F.j(this.e);
        }
        this.u.l.s(this);
        this.u.a().o();
    }

    public void O(vk1 vk1Var) {
        this.u.a.h(vk1Var, this.s.b() > 0, "" + this.s.a + " / " + this.s.f + " / " + this.s.h);
    }

    public void P(Resources resources) {
        this.u.A(resources);
    }

    public boolean Q(Context context, int i, int i2) {
        if (this.n == i && this.o == i2) {
            return false;
        }
        this.n = i;
        this.o = i2;
        this.l = i;
        this.m = i2;
        return true;
    }

    public void R() {
        W();
        GLES20.glEnable(3042);
        this.u.B();
    }

    public void S(int i, or1 or1Var) {
        while (i >= this.v.size()) {
            this.v.add(null);
        }
        this.v.set(i, or1Var);
    }

    public void T(int i) {
        int i2;
        if (i == 2) {
            i2 = 33071;
        } else if (i != 1) {
            return;
        } else {
            i2 = 33648;
        }
        GLES20.glTexParameteri(3553, 10242, i2);
        GLES20.glTexParameteri(3553, 10243, i2);
    }

    public void U(int i) {
        this.z = i;
    }

    public void V() {
    }

    public void W() {
        this.r = -1;
    }

    @Override // com.daaw.de0
    public int a() {
        int i = this.q;
        return i < 2 ? this.m : i;
    }

    @Override // com.daaw.de0
    public de0.a b() {
        return this.u;
    }

    @Override // com.daaw.de0
    public boolean c() {
        return this.x;
    }

    @Override // com.daaw.de0
    public float d() {
        return this.e;
    }

    @Override // com.daaw.de0
    public void e(int i) {
        if (this.r == i) {
            return;
        }
        this.u.l.r(this);
        int i2 = NativeConstants.TLS1_2_VERSION;
        if (i != 0) {
            if (i == 1) {
                i2 = NativeConstants.TLS1_VERSION;
            } else if (i == 2) {
                GLES20.glBlendFunc(1, 1);
            } else if (i == 3) {
                i2 = 0;
            } else if (i != 4) {
                if (i == 5) {
                    GLES20.glBlendFunc(NativeConstants.TLS1_1_VERSION, 1);
                }
            }
            GLES20.glBlendFunc(1, i2);
        } else {
            GLES20.glBlendFunc(NativeConstants.TLS1_1_VERSION, NativeConstants.TLS1_2_VERSION);
        }
        this.r = i;
    }

    @Override // com.daaw.de0
    public int f() {
        int i = this.p;
        return i < 2 ? this.l : i;
    }

    @Override // com.daaw.de0
    public float g() {
        return this.k;
    }

    @Override // com.daaw.de0
    public boolean h() {
        return this.w;
    }

    @Override // com.daaw.de0
    public void i(e40 e40Var) {
        o(e40Var, false);
    }

    public void k() {
        this.s.e++;
    }

    public void l() {
        this.s.i++;
    }

    public void m() {
        this.s.j++;
    }

    public void n() {
        this.s.g++;
    }

    public void o(e40 e40Var, boolean z) {
        if (z || this.t != e40Var) {
            this.t = e40Var;
            m();
            this.u.l.r(this);
            if (e40Var != null) {
                e40Var.c();
                Matrix.orthoM(this.c, 0, 0.0f, e40Var.getWidth(), e40Var.getHeight(), 0.0f, 0.01f, 100.0f);
                Matrix.multiplyMM(this.b, 0, this.c, 0, this.d, 0);
                return;
            }
            GLES20.glViewport(0, 0, f(), a());
            GLES20.glBindFramebuffer(36160, 0);
            Matrix.orthoM(this.c, 0, 0.0f, f(), a(), 0.0f, 0.01f, 100.0f);
            Matrix.multiplyMM(this.b, 0, this.c, 0, this.d, 0);
        }
    }

    public void p(dc1 dc1Var) {
        this.u.l.r(this);
        if (dc1Var != null) {
            dc1Var.z();
        }
    }

    public void q() {
        for (int i = 0; i < this.v.size(); i++) {
            this.v.set(i, null);
        }
    }

    public void r(pr1 pr1Var, pr1 pr1Var2) {
        Matrix.multiplyMM(pr1Var.a(), 0, this.c, 0, pr1Var2.a(), 0);
    }

    public void s(pr1 pr1Var, bs1 bs1Var, e40 e40Var, float f, float f2, float f3, float f4, float f5, float f6) {
        float width;
        int height;
        if (e40Var == null) {
            width = f();
            height = a();
        } else {
            width = e40Var.getWidth();
            height = e40Var.getHeight();
        }
        float f7 = height;
        bs1Var.a = width;
        bs1Var.b = f7;
        this.D.d();
        this.D.e(width * f4, f7 * f5, f6);
        Matrix.perspectiveM(this.E.a(), 0, f, width / f7, f2, f3);
        Matrix.multiplyMM(pr1Var.a(), 0, this.E.a(), 0, this.D.a(), 0);
    }

    public void t(bs1 bs1Var, float f, e40 e40Var, float f2, float f3) {
        double d = f;
        double tan = Math.tan(Math.toRadians(f3 * 0.5f));
        Double.isNaN(d);
        float abs = (float) Math.abs(d * tan);
        bs1Var.b = abs;
        bs1Var.a = abs * f2;
    }

    public void u(float f, float f2, int i, w31 w31Var) {
        this.u.l.o(this, f, f2, 0.0f, f(), a(), i, bs1.s(), bs1.q(), w31Var, true);
    }

    public void v(float f, float f2, int i, bs1 bs1Var, bs1 bs1Var2, w31 w31Var) {
        this.u.l.o(this, f, f2, 0.0f, f(), a(), i, bs1Var, bs1Var2, w31Var, false);
    }

    public void w(int i, qc0 qc0Var, int i2) {
        this.u.l.o(this, 0.0f, 0.0f, 0.0f, f(), a(), i, bs1.s(), bs1.q(), new w31(i2, qc0Var, (qr1) null, (g0<y31, sr1, w31>) null), false);
    }

    public void x(int i, w31 w31Var) {
        u(0.0f, 0.0f, i, w31Var);
    }

    public void y(int i, bs1 bs1Var, bs1 bs1Var2, w31 w31Var) {
        this.u.l.o(this, -1.0f, -1.0f, 0.0f, 2.0f, 2.0f, i, bs1Var, bs1Var2, w31Var, false);
    }

    public void z() {
        this.s.a++;
    }
}
