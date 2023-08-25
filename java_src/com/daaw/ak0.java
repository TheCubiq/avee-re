package com.daaw;

import com.daaw.de1;
import com.daaw.lj;
import java.util.Arrays;
import java.util.HashMap;
/* loaded from: classes.dex */
public class ak0 {
    public static int q = 1000;
    public static boolean r = true;
    public static long s;
    public static long t;
    public a c;
    public i6[] f;
    public final gd m;
    public a p;
    public int a = 0;
    public HashMap<String, de1> b = null;
    public int d = 32;
    public int e = 32;
    public boolean g = false;
    public boolean h = false;
    public boolean[] i = new boolean[32];
    public int j = 1;
    public int k = 0;
    public int l = 32;
    public de1[] n = new de1[q];
    public int o = 0;

    /* loaded from: classes.dex */
    public interface a {
        void a(de1 de1Var);

        void b(a aVar);

        de1 c(ak0 ak0Var, boolean[] zArr);

        void clear();

        de1 getKey();
    }

    /* loaded from: classes.dex */
    public class b extends i6 {
        public b(gd gdVar) {
            this.e = new ee1(this, gdVar);
        }
    }

    public ak0() {
        this.f = null;
        this.f = new i6[32];
        C();
        gd gdVar = new gd();
        this.m = gdVar;
        this.c = new ez0(gdVar);
        this.p = r ? new b(gdVar) : new i6(gdVar);
    }

    public static i6 s(ak0 ak0Var, de1 de1Var, de1 de1Var2, float f) {
        return ak0Var.r().j(de1Var, de1Var2, f);
    }

    public static dq0 w() {
        return null;
    }

    public void A(a aVar) {
        u(aVar);
        B(aVar, false);
        n();
    }

    public final int B(a aVar, boolean z) {
        for (int i = 0; i < this.j; i++) {
            this.i[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            if (i2 >= this.j * 2) {
                return i2;
            }
            if (aVar.getKey() != null) {
                this.i[aVar.getKey().c] = true;
            }
            de1 c = aVar.c(this, this.i);
            if (c != null) {
                boolean[] zArr = this.i;
                int i3 = c.c;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (c != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.k; i5++) {
                    i6 i6Var = this.f[i5];
                    if (i6Var.a.j != de1.a.UNRESTRICTED && !i6Var.f && i6Var.t(c)) {
                        float e = i6Var.e.e(c);
                        if (e < 0.0f) {
                            float f2 = (-i6Var.b) / e;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    i6 i6Var2 = this.f[i4];
                    i6Var2.a.d = -1;
                    i6Var2.y(c);
                    de1 de1Var = i6Var2.a;
                    de1Var.d = i4;
                    de1Var.g(i6Var2);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    public final void C() {
        int i = 0;
        if (r) {
            while (true) {
                i6[] i6VarArr = this.f;
                if (i >= i6VarArr.length) {
                    return;
                }
                i6 i6Var = i6VarArr[i];
                if (i6Var != null) {
                    this.m.a.a(i6Var);
                }
                this.f[i] = null;
                i++;
            }
        } else {
            while (true) {
                i6[] i6VarArr2 = this.f;
                if (i >= i6VarArr2.length) {
                    return;
                }
                i6 i6Var2 = i6VarArr2[i];
                if (i6Var2 != null) {
                    this.m.b.a(i6Var2);
                }
                this.f[i] = null;
                i++;
            }
        }
    }

    public void D() {
        gd gdVar;
        int i = 0;
        while (true) {
            gdVar = this.m;
            de1[] de1VarArr = gdVar.d;
            if (i >= de1VarArr.length) {
                break;
            }
            de1 de1Var = de1VarArr[i];
            if (de1Var != null) {
                de1Var.d();
            }
            i++;
        }
        gdVar.c.c(this.n, this.o);
        this.o = 0;
        Arrays.fill(this.m.d, (Object) null);
        HashMap<String, de1> hashMap = this.b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.a = 0;
        this.c.clear();
        this.j = 1;
        for (int i2 = 0; i2 < this.k; i2++) {
            this.f[i2].c = false;
        }
        C();
        this.k = 0;
        this.p = r ? new b(this.m) : new i6(this.m);
    }

    public final de1 a(de1.a aVar, String str) {
        de1 b2 = this.m.c.b();
        if (b2 == null) {
            b2 = new de1(aVar, str);
        } else {
            b2.d();
        }
        b2.f(aVar, str);
        int i = this.o;
        int i2 = q;
        if (i >= i2) {
            int i3 = i2 * 2;
            q = i3;
            this.n = (de1[]) Arrays.copyOf(this.n, i3);
        }
        de1[] de1VarArr = this.n;
        int i4 = this.o;
        this.o = i4 + 1;
        de1VarArr[i4] = b2;
        return b2;
    }

    public void b(qj qjVar, qj qjVar2, float f, int i) {
        lj.b bVar = lj.b.LEFT;
        de1 q2 = q(qjVar.k(bVar));
        lj.b bVar2 = lj.b.TOP;
        de1 q3 = q(qjVar.k(bVar2));
        lj.b bVar3 = lj.b.RIGHT;
        de1 q4 = q(qjVar.k(bVar3));
        lj.b bVar4 = lj.b.BOTTOM;
        de1 q5 = q(qjVar.k(bVar4));
        de1 q6 = q(qjVar2.k(bVar));
        de1 q7 = q(qjVar2.k(bVar2));
        de1 q8 = q(qjVar2.k(bVar3));
        de1 q9 = q(qjVar2.k(bVar4));
        i6 r2 = r();
        double d = f;
        double sin = Math.sin(d);
        double d2 = i;
        Double.isNaN(d2);
        r2.q(q3, q5, q7, q9, (float) (sin * d2));
        d(r2);
        i6 r3 = r();
        double cos = Math.cos(d);
        Double.isNaN(d2);
        r3.q(q2, q4, q6, q8, (float) (cos * d2));
        d(r3);
    }

    public void c(de1 de1Var, de1 de1Var2, int i, float f, de1 de1Var3, de1 de1Var4, int i2, int i3) {
        i6 r2 = r();
        r2.h(de1Var, de1Var2, i, f, de1Var3, de1Var4, i2);
        if (i3 != 8) {
            r2.d(this, i3);
        }
        d(r2);
    }

    public void d(i6 i6Var) {
        de1 w;
        if (i6Var == null) {
            return;
        }
        boolean z = true;
        if (this.k + 1 >= this.l || this.j + 1 >= this.e) {
            y();
        }
        boolean z2 = false;
        if (!i6Var.f) {
            i6Var.D(this);
            if (i6Var.u()) {
                return;
            }
            i6Var.r();
            if (i6Var.f(this)) {
                de1 p = p();
                i6Var.a = p;
                l(i6Var);
                this.p.b(i6Var);
                B(this.p, true);
                if (p.d == -1) {
                    if (i6Var.a == p && (w = i6Var.w(p)) != null) {
                        i6Var.y(w);
                    }
                    if (!i6Var.f) {
                        i6Var.a.g(i6Var);
                    }
                    this.k--;
                }
            } else {
                z = false;
            }
            if (!i6Var.s()) {
                return;
            }
            z2 = z;
        }
        if (z2) {
            return;
        }
        l(i6Var);
    }

    public i6 e(de1 de1Var, de1 de1Var2, int i, int i2) {
        if (i2 == 8 && de1Var2.g && de1Var.d == -1) {
            de1Var.e(this, de1Var2.f + i);
            return null;
        }
        i6 r2 = r();
        r2.n(de1Var, de1Var2, i);
        if (i2 != 8) {
            r2.d(this, i2);
        }
        d(r2);
        return r2;
    }

    public void f(de1 de1Var, int i) {
        i6 r2;
        int i2 = de1Var.d;
        if (i2 == -1) {
            de1Var.e(this, i);
            return;
        }
        if (i2 != -1) {
            i6 i6Var = this.f[i2];
            if (!i6Var.f) {
                if (i6Var.e.b() == 0) {
                    i6Var.f = true;
                } else {
                    r2 = r();
                    r2.m(de1Var, i);
                }
            }
            i6Var.b = i;
            return;
        }
        r2 = r();
        r2.i(de1Var, i);
        d(r2);
    }

    public void g(de1 de1Var, de1 de1Var2, int i, boolean z) {
        i6 r2 = r();
        de1 t2 = t();
        t2.e = 0;
        r2.o(de1Var, de1Var2, t2, i);
        d(r2);
    }

    public void h(de1 de1Var, de1 de1Var2, int i, int i2) {
        i6 r2 = r();
        de1 t2 = t();
        t2.e = 0;
        r2.o(de1Var, de1Var2, t2, i);
        if (i2 != 8) {
            m(r2, (int) (r2.e.e(t2) * (-1.0f)), i2);
        }
        d(r2);
    }

    public void i(de1 de1Var, de1 de1Var2, int i, boolean z) {
        i6 r2 = r();
        de1 t2 = t();
        t2.e = 0;
        r2.p(de1Var, de1Var2, t2, i);
        d(r2);
    }

    public void j(de1 de1Var, de1 de1Var2, int i, int i2) {
        i6 r2 = r();
        de1 t2 = t();
        t2.e = 0;
        r2.p(de1Var, de1Var2, t2, i);
        if (i2 != 8) {
            m(r2, (int) (r2.e.e(t2) * (-1.0f)), i2);
        }
        d(r2);
    }

    public void k(de1 de1Var, de1 de1Var2, de1 de1Var3, de1 de1Var4, float f, int i) {
        i6 r2 = r();
        r2.k(de1Var, de1Var2, de1Var3, de1Var4, f);
        if (i != 8) {
            r2.d(this, i);
        }
        d(r2);
    }

    public final void l(i6 i6Var) {
        cy0<i6> cy0Var;
        i6 i6Var2;
        if (r) {
            i6[] i6VarArr = this.f;
            int i = this.k;
            if (i6VarArr[i] != null) {
                cy0Var = this.m.a;
                i6Var2 = i6VarArr[i];
                cy0Var.a(i6Var2);
            }
        } else {
            i6[] i6VarArr2 = this.f;
            int i2 = this.k;
            if (i6VarArr2[i2] != null) {
                cy0Var = this.m.b;
                i6Var2 = i6VarArr2[i2];
                cy0Var.a(i6Var2);
            }
        }
        i6[] i6VarArr3 = this.f;
        int i3 = this.k;
        i6VarArr3[i3] = i6Var;
        de1 de1Var = i6Var.a;
        de1Var.d = i3;
        this.k = i3 + 1;
        de1Var.g(i6Var);
    }

    public void m(i6 i6Var, int i, int i2) {
        i6Var.e(o(i2, null), i);
    }

    public final void n() {
        for (int i = 0; i < this.k; i++) {
            i6 i6Var = this.f[i];
            i6Var.a.f = i6Var.b;
        }
    }

    public de1 o(int i, String str) {
        if (this.j + 1 >= this.e) {
            y();
        }
        de1 a2 = a(de1.a.ERROR, str);
        int i2 = this.a + 1;
        this.a = i2;
        this.j++;
        a2.c = i2;
        a2.e = i;
        this.m.d[i2] = a2;
        this.c.a(a2);
        return a2;
    }

    public de1 p() {
        if (this.j + 1 >= this.e) {
            y();
        }
        de1 a2 = a(de1.a.SLACK, null);
        int i = this.a + 1;
        this.a = i;
        this.j++;
        a2.c = i;
        this.m.d[i] = a2;
        return a2;
    }

    public de1 q(Object obj) {
        de1 de1Var = null;
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.e) {
            y();
        }
        if (obj instanceof lj) {
            lj ljVar = (lj) obj;
            de1Var = ljVar.e();
            if (de1Var == null) {
                ljVar.l(this.m);
                de1Var = ljVar.e();
            }
            int i = de1Var.c;
            if (i == -1 || i > this.a || this.m.d[i] == null) {
                if (i != -1) {
                    de1Var.d();
                }
                int i2 = this.a + 1;
                this.a = i2;
                this.j++;
                de1Var.c = i2;
                de1Var.j = de1.a.UNRESTRICTED;
                this.m.d[i2] = de1Var;
            }
        }
        return de1Var;
    }

    public i6 r() {
        i6 b2;
        if (r) {
            b2 = this.m.a.b();
            if (b2 == null) {
                b2 = new b(this.m);
                t++;
            }
            b2.z();
        } else {
            b2 = this.m.b.b();
            if (b2 == null) {
                b2 = new i6(this.m);
                s++;
            }
            b2.z();
        }
        de1.b();
        return b2;
    }

    public de1 t() {
        if (this.j + 1 >= this.e) {
            y();
        }
        de1 a2 = a(de1.a.SLACK, null);
        int i = this.a + 1;
        this.a = i;
        this.j++;
        a2.c = i;
        this.m.d[i] = a2;
        return a2;
    }

    public final int u(a aVar) {
        float f;
        boolean z;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= this.k) {
                z = false;
                break;
            }
            i6[] i6VarArr = this.f;
            if (i6VarArr[i].a.j != de1.a.UNRESTRICTED && i6VarArr[i].b < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            boolean z2 = false;
            int i2 = 0;
            while (!z2) {
                i2++;
                float f2 = Float.MAX_VALUE;
                int i3 = 0;
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                while (i3 < this.k) {
                    i6 i6Var = this.f[i3];
                    if (i6Var.a.j != de1.a.UNRESTRICTED && !i6Var.f && i6Var.b < f) {
                        int i7 = 1;
                        while (i7 < this.j) {
                            de1 de1Var = this.m.d[i7];
                            float e = i6Var.e.e(de1Var);
                            if (e > f) {
                                for (int i8 = 0; i8 < 9; i8++) {
                                    float f3 = de1Var.h[i8] / e;
                                    if ((f3 < f2 && i8 == i6) || i8 > i6) {
                                        i6 = i8;
                                        f2 = f3;
                                        i4 = i3;
                                        i5 = i7;
                                    }
                                }
                            }
                            i7++;
                            f = 0.0f;
                        }
                    }
                    i3++;
                    f = 0.0f;
                }
                if (i4 != -1) {
                    i6 i6Var2 = this.f[i4];
                    i6Var2.a.d = -1;
                    i6Var2.y(this.m.d[i5]);
                    de1 de1Var2 = i6Var2.a;
                    de1Var2.d = i4;
                    de1Var2.g(i6Var2);
                } else {
                    z2 = true;
                }
                if (i2 > this.j / 2) {
                    z2 = true;
                }
                f = 0.0f;
            }
            return i2;
        }
        return 0;
    }

    public gd v() {
        return this.m;
    }

    public int x(Object obj) {
        de1 e = ((lj) obj).e();
        if (e != null) {
            return (int) (e.f + 0.5f);
        }
        return 0;
    }

    public final void y() {
        int i = this.d * 2;
        this.d = i;
        this.f = (i6[]) Arrays.copyOf(this.f, i);
        gd gdVar = this.m;
        gdVar.d = (de1[]) Arrays.copyOf(gdVar.d, this.d);
        int i2 = this.d;
        this.i = new boolean[i2];
        this.e = i2;
        this.l = i2;
    }

    public void z() {
        if (this.g || this.h) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.k) {
                    z = true;
                    break;
                } else if (!this.f[i].f) {
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                n();
                return;
            }
        }
        A(this.c);
    }
}
