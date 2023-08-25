package com.daaw;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
/* loaded from: classes.dex */
public class vv implements af0 {
    public static final String[] s = {"internalres:white", "internalres:black", "internalres:particle_circle_blur4", "internalres:vignette80", "internalres:rainbow128", "internalres:particle_blur01_more", "internalres:lens_flare", "internalres:lens_flare_2", "composition:0"};
    public static final String[] t = {"internalres:transparent", "internalres:white", "internalres:black", "internalres:particle_circle_blur4", "internalres:particle_blur01", "internalres:particle_blur_inv", "internalres:vignette80", "composition:0"};
    public static l31<Bitmap> u = new l31<>(null);
    public r40<de0, i2> a;
    public b b;
    public s40<y31, Bitmap, Bitmap> c;
    public s40<y31, Bitmap, Bitmap> d;
    public Object k;
    public qc0 e = null;
    public qc0 f = null;
    public i2 g = new i2(Uri.EMPTY, "", "");
    public String h = null;
    public int i = 0;
    public df0 j = null;
    public int l = 0;
    public boolean m = false;
    public int n = -1;
    public int o = 0;
    public l31<lo1<le0[], Object>> p = new l31<>(null);
    public boolean q = false;
    public ye0 r = new ye0(-16711936, true, 1.0f, 1.0f);

    /* loaded from: classes.dex */
    public static class a {
        public int a = 0;
        public a7 b = null;
        public jr1<Bitmap> c = null;
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    public vv(b bVar, r40<de0, i2> r40Var, s40<y31, Bitmap, Bitmap> s40Var, s40<y31, Bitmap, Bitmap> s40Var2) {
        this.b = bVar;
        this.a = r40Var;
        this.c = s40Var;
        this.d = s40Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [T, com.daaw.x6] */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.daaw.a7, T] */
    /* JADX WARN: Type inference failed for: r2v11, types: [T, com.daaw.lo1] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.daaw.a7, T] */
    public static boolean c(l31<qc0> l31Var, l31<qc0> l31Var2, y31 y31Var, df0 df0Var, l31<lo1<le0[], Object>> l31Var3, int i, s40<y31, Bitmap, Bitmap> s40Var, s40<y31, Bitmap, Bitmap> s40Var2) {
        if (df0Var == null) {
            l31Var.a = null;
            if (l31Var2 != null) {
                l31Var2.a = null;
            }
            return true;
        }
        Bitmap g = df0.g(df0Var);
        if (g == null) {
            l31Var.a = null;
            if (l31Var2 != null) {
                l31Var2.a = null;
            }
            return true;
        }
        if (l31Var2 != null) {
            Bitmap a2 = s40Var != null ? s40Var2.a(y31Var, g) : null;
            if (a2 != null) {
                l31Var2.a = new x6(new vr1(a2, 9729, 9729, 10497, false), true);
            } else {
                l31Var2.a = null;
            }
            if (a2 != null && g != a2) {
                a2.recycle();
            }
        }
        int d = df0Var.d();
        if (d > 1) {
            if (i == 0) {
                df0Var.h();
                l31Var3.a = new lo1(new le0[d], new a());
            }
            lo1<le0[], Object> lo1Var = l31Var3.a;
            a aVar = lo1Var != null ? (a) lo1Var.b : null;
            if (aVar == null) {
                return true;
            }
            if (aVar.a < d) {
                if (aVar.c == null) {
                    df0Var.a();
                    aVar.c = df0Var.e();
                }
                if (aVar.c.c()) {
                    Bitmap b2 = aVar.c.b();
                    if (b2 == null) {
                        b2 = Bitmap.createBitmap(32, 32, Bitmap.Config.ARGB_8888);
                    }
                    vr1 vr1Var = new vr1(v(b2, 0, u), 9729, 9729, 10497, false);
                    int i2 = aVar.a;
                    if (i2 == 0) {
                        le0[] le0VarArr = l31Var3.a.a;
                        le0VarArr[i2] = vr1Var;
                        aVar.b = new y6(le0VarArr, true);
                    }
                    int i3 = aVar.a;
                    l31Var3.a.a[i3] = vr1Var;
                    a7 a7Var = aVar.b;
                    if (a7Var != null) {
                        a7Var.k(i3, vr1Var);
                    }
                    aVar.a++;
                    aVar.c = null;
                }
                l31Var.a = aVar.b;
                return false;
            }
            l31Var.a = aVar.b;
            l31Var3.a = null;
        } else {
            Bitmap a3 = s40Var != null ? s40Var.a(y31Var, g) : g;
            l31Var.a = a3 != null ? new x6(new vr1(v(a3, 0, u), 9729, 9729, 10497, false), true) : 0;
            if (a3 != null && g != a3) {
                a3.recycle();
            }
        }
        return true;
    }

    public static Bitmap v(Bitmap bitmap, int i, l31<Bitmap> l31Var) {
        return bitmap;
    }

    public void A(float f) {
        ye0 ye0Var = this.r;
        if (ye0Var.d == f) {
            return;
        }
        ye0Var.d = f;
        o();
    }

    public void B(float f) {
        ye0 ye0Var = this.r;
        if (ye0Var.c == f) {
            return;
        }
        ye0Var.c = f;
        o();
    }

    public void C(String str) {
        this.h = str;
        int i0 = xi.i0(str);
        this.i = i0;
        if (i0 > 0) {
            F(null);
            return;
        }
        String str2 = this.h;
        if (str2 != null && str2.length() > 0) {
            F(new i2(Uri.EMPTY, this.h, ""));
            return;
        }
        r40<de0, i2> r40Var = this.a;
        F(r40Var != null ? r40Var.a(null) : null);
    }

    public void D(int i) {
        if (this.n == i) {
            return;
        }
        this.n = i;
        o();
    }

    public void E(boolean z) {
        if (this.m == z) {
            return;
        }
        this.m = z;
        o();
    }

    public void F(i2 i2Var) {
        i2 i2Var2;
        if (i2Var == null && this.g == null) {
            return;
        }
        if (i2Var != null && (i2Var2 = this.g) != null && br1.h(i2Var2.a.getPath(), i2Var.a.getPath()) && br1.h(this.g.b, i2Var.b) && br1.h(this.g.c, i2Var.c)) {
            return;
        }
        this.g = i2Var;
        o();
    }

    @Override // com.daaw.af0
    public void a(Object obj) {
        this.k = obj;
    }

    @Override // com.daaw.af0
    public void b(df0 df0Var, String str, String str2) {
        i2 i2Var = this.g;
        if (i2Var != null && br1.h(str2, i2Var.b) && br1.h(str2, this.g.b)) {
            o();
            df0.c(this.j);
            this.j = df0Var;
            this.o = 2;
        }
    }

    public void d() {
        qc0 qc0Var = this.e;
        if (qc0Var != null) {
            qc0Var.a();
        }
        this.e = null;
    }

    public void e() {
        qc0 qc0Var = this.f;
        if (qc0Var != null) {
            qc0Var.a();
        }
        this.f = null;
    }

    public boolean f(y31 y31Var, df0 df0Var, int i) {
        if (df0Var == null) {
            d();
            return true;
        }
        l31 l31Var = new l31(null);
        l31 l31Var2 = new l31(null);
        boolean c = c(l31Var, l31Var2, y31Var, df0Var, this.p, i, this.c, this.d);
        if (this.e != l31Var.a) {
            d();
        }
        this.e = (qc0) l31Var.a;
        e();
        this.f = (qc0) l31Var2.a;
        return c;
    }

    public int g() {
        return this.l;
    }

    public boolean h() {
        return this.q;
    }

    public ye0 i() {
        return this.r;
    }

    public String j() {
        return this.h;
    }

    public int k() {
        return this.n;
    }

    public boolean l() {
        return this.m;
    }

    public qc0 m(y31 y31Var) {
        int i = this.i;
        if (i > 0) {
            or1 B = y31Var.B(i);
            return B == null ? y31Var.u.c() : new z6(B.b(), false);
        }
        return this.e;
    }

    public qc0 n(y31 y31Var) {
        if (this.i > 0) {
            return null;
        }
        return this.f;
    }

    public final void o() {
        p();
        this.b.a();
    }

    public void p() {
        this.o = 0;
    }

    public boolean q(y31 y31Var, RectF rectF, int i) {
        if (this.o == 0) {
            df0.c(this.j);
            this.j = null;
            this.o = 1;
            i2 i2Var = this.g;
            if (i2Var == null) {
                o();
                df0.c(this.j);
                this.j = null;
                this.o = 2;
            } else {
                y31Var.u.a.c(this, new h2(i2Var.a, i2Var.b, i2Var.c, !this.m, (int) rectF.width(), (int) rectF.height(), (int) rectF.width(), (int) rectF.height(), this.l, this.n, this.q ? this.r : null));
            }
        }
        return true;
    }

    public boolean r(y31 y31Var, int i) {
        if (this.o == 2 && f(y31Var, this.j, i)) {
            this.o = 3;
            df0.c(this.j);
            this.j = null;
            return true;
        }
        return true;
    }

    public void s(y31 y31Var) {
        d();
        e();
    }

    public void t(de0 de0Var, e40 e40Var, vc0 vc0Var) {
        int i = this.i;
        if (i > 0) {
            vc0Var.a(i);
        }
        String str = this.h;
        if ((str == null || str.length() <= 0) && this.i <= 0) {
            r40<de0, i2> r40Var = this.a;
            F(r40Var != null ? r40Var.a(de0Var) : null);
        }
    }

    public void u(y31 y31Var, e40 e40Var) {
        if (this.o == 3 || this.i > 0) {
            return;
        }
        y31Var.z();
    }

    public void w(int i) {
        if (this.l == i) {
            return;
        }
        this.l = i;
        o();
    }

    public void x(boolean z) {
        ye0 ye0Var = this.r;
        if (ye0Var.b == z) {
            return;
        }
        ye0Var.b = z;
        o();
    }

    public void y(int i) {
        ye0 ye0Var = this.r;
        if (ye0Var.a == i) {
            return;
        }
        ye0Var.a = i;
        o();
    }

    public void z(boolean z) {
        if (this.q == z) {
            return;
        }
        this.q = z;
        o();
    }
}
