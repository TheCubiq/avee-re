package com.daaw;

import com.daaw.ak0;
import com.daaw.de1;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class i6 implements ak0.a {
    public a e;
    public de1 a = null;
    public float b = 0.0f;
    public boolean c = false;
    public ArrayList<de1> d = new ArrayList<>();
    public boolean f = false;

    /* loaded from: classes.dex */
    public interface a {
        float a(de1 de1Var, boolean z);

        int b();

        void c(de1 de1Var, float f, boolean z);

        void clear();

        de1 d(int i);

        float e(de1 de1Var);

        void f();

        float g(int i);

        void h(de1 de1Var, float f);

        boolean i(de1 de1Var);

        void j(float f);

        float k(i6 i6Var, boolean z);
    }

    public i6() {
    }

    public i6(gd gdVar) {
        this.e = new e6(this, gdVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String A() {
        /*
            r9 = this;
            com.daaw.de1 r0 = r9.a
            java.lang.String r1 = ""
            if (r0 != 0) goto L14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            goto L21
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            com.daaw.de1 r1 = r9.a
            r0.append(r1)
        L21:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r9.b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r9.b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L53
        L52:
            r1 = 0
        L53:
            com.daaw.i6$a r5 = r9.e
            int r5 = r5.b()
        L59:
            if (r2 >= r5) goto Ld6
            com.daaw.i6$a r6 = r9.e
            com.daaw.de1 r6 = r6.d(r2)
            if (r6 != 0) goto L64
            goto Ld3
        L64:
            com.daaw.i6$a r7 = r9.e
            float r7 = r7.g(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L6f
            goto Ld3
        L6f:
            java.lang.String r6 = r6.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L86
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto Laf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto La6
        L86:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 <= 0) goto L9c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto Laf
        L9c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
        La6:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r8
        Laf:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto Lbb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto Lc8
        Lbb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        Lc8:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = 1
        Ld3:
            int r2 = r2 + 1
            goto L59
        Ld6:
            if (r1 != 0) goto Le9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        Le9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.i6.A():java.lang.String");
    }

    public void B(ak0 ak0Var, de1 de1Var, boolean z) {
        if (de1Var.g) {
            this.b += de1Var.f * this.e.e(de1Var);
            this.e.a(de1Var, z);
            if (z) {
                de1Var.c(this);
            }
        }
    }

    public void C(i6 i6Var, boolean z) {
        this.b += i6Var.b * this.e.k(i6Var, z);
        if (z) {
            i6Var.a.c(this);
        }
    }

    public void D(ak0 ak0Var) {
        if (ak0Var.f.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int b = this.e.b();
            for (int i = 0; i < b; i++) {
                de1 d = this.e.d(i);
                if (d.d != -1 || d.g) {
                    this.d.add(d);
                }
            }
            if (this.d.size() > 0) {
                Iterator<de1> it = this.d.iterator();
                while (it.hasNext()) {
                    de1 next = it.next();
                    if (next.g) {
                        B(ak0Var, next, true);
                    } else {
                        C(ak0Var.f[next.d], true);
                    }
                }
                this.d.clear();
            } else {
                z = true;
            }
        }
    }

    @Override // com.daaw.ak0.a
    public void a(de1 de1Var) {
        int i = de1Var.e;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.e.h(de1Var, f);
    }

    @Override // com.daaw.ak0.a
    public void b(ak0.a aVar) {
        if (aVar instanceof i6) {
            i6 i6Var = (i6) aVar;
            this.a = null;
            this.e.clear();
            for (int i = 0; i < i6Var.e.b(); i++) {
                this.e.c(i6Var.e.d(i), i6Var.e.g(i), true);
            }
        }
    }

    @Override // com.daaw.ak0.a
    public de1 c(ak0 ak0Var, boolean[] zArr) {
        return x(zArr, null);
    }

    @Override // com.daaw.ak0.a
    public void clear() {
        this.e.clear();
        this.a = null;
        this.b = 0.0f;
    }

    public i6 d(ak0 ak0Var, int i) {
        this.e.h(ak0Var.o(i, "ep"), 1.0f);
        this.e.h(ak0Var.o(i, "em"), -1.0f);
        return this;
    }

    public i6 e(de1 de1Var, int i) {
        this.e.h(de1Var, i);
        return this;
    }

    public boolean f(ak0 ak0Var) {
        boolean z;
        de1 g = g(ak0Var);
        if (g == null) {
            z = true;
        } else {
            y(g);
            z = false;
        }
        if (this.e.b() == 0) {
            this.f = true;
        }
        return z;
    }

    public de1 g(ak0 ak0Var) {
        int b = this.e.b();
        de1 de1Var = null;
        de1 de1Var2 = null;
        boolean z = false;
        boolean z2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < b; i++) {
            float g = this.e.g(i);
            de1 d = this.e.d(i);
            if (d.j == de1.a.UNRESTRICTED) {
                if (de1Var == null || f > g) {
                    z = v(d, ak0Var);
                    f = g;
                    de1Var = d;
                } else if (!z && v(d, ak0Var)) {
                    f = g;
                    de1Var = d;
                    z = true;
                }
            } else if (de1Var == null && g < 0.0f) {
                if (de1Var2 == null || f2 > g) {
                    z2 = v(d, ak0Var);
                    f2 = g;
                    de1Var2 = d;
                } else if (!z2 && v(d, ak0Var)) {
                    f2 = g;
                    de1Var2 = d;
                    z2 = true;
                }
            }
        }
        return de1Var != null ? de1Var : de1Var2;
    }

    @Override // com.daaw.ak0.a
    public de1 getKey() {
        return this.a;
    }

    public i6 h(de1 de1Var, de1 de1Var2, int i, float f, de1 de1Var3, de1 de1Var4, int i2) {
        float f2;
        int i3;
        if (de1Var2 == de1Var3) {
            this.e.h(de1Var, 1.0f);
            this.e.h(de1Var4, 1.0f);
            this.e.h(de1Var2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.e.h(de1Var, 1.0f);
            this.e.h(de1Var2, -1.0f);
            this.e.h(de1Var3, -1.0f);
            this.e.h(de1Var4, 1.0f);
            if (i > 0 || i2 > 0) {
                i3 = (-i) + i2;
                f2 = i3;
            }
            return this;
        } else if (f <= 0.0f) {
            this.e.h(de1Var, -1.0f);
            this.e.h(de1Var2, 1.0f);
            f2 = i;
        } else if (f < 1.0f) {
            float f3 = 1.0f - f;
            this.e.h(de1Var, f3 * 1.0f);
            this.e.h(de1Var2, f3 * (-1.0f));
            this.e.h(de1Var3, (-1.0f) * f);
            this.e.h(de1Var4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                f2 = ((-i) * f3) + (i2 * f);
            }
            return this;
        } else {
            this.e.h(de1Var4, -1.0f);
            this.e.h(de1Var3, 1.0f);
            i3 = -i2;
            f2 = i3;
        }
        this.b = f2;
        return this;
    }

    public i6 i(de1 de1Var, int i) {
        this.a = de1Var;
        float f = i;
        de1Var.f = f;
        this.b = f;
        this.f = true;
        return this;
    }

    public i6 j(de1 de1Var, de1 de1Var2, float f) {
        this.e.h(de1Var, -1.0f);
        this.e.h(de1Var2, f);
        return this;
    }

    public i6 k(de1 de1Var, de1 de1Var2, de1 de1Var3, de1 de1Var4, float f) {
        this.e.h(de1Var, -1.0f);
        this.e.h(de1Var2, 1.0f);
        this.e.h(de1Var3, f);
        this.e.h(de1Var4, -f);
        return this;
    }

    public i6 l(float f, float f2, float f3, de1 de1Var, de1 de1Var2, de1 de1Var3, de1 de1Var4) {
        this.b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.e.h(de1Var, 1.0f);
            this.e.h(de1Var2, -1.0f);
            this.e.h(de1Var4, 1.0f);
            this.e.h(de1Var3, -1.0f);
        } else if (f == 0.0f) {
            this.e.h(de1Var, 1.0f);
            this.e.h(de1Var2, -1.0f);
        } else if (f3 == 0.0f) {
            this.e.h(de1Var3, 1.0f);
            this.e.h(de1Var4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.e.h(de1Var, 1.0f);
            this.e.h(de1Var2, -1.0f);
            this.e.h(de1Var4, f4);
            this.e.h(de1Var3, -f4);
        }
        return this;
    }

    public i6 m(de1 de1Var, int i) {
        a aVar;
        float f;
        if (i < 0) {
            this.b = i * (-1);
            aVar = this.e;
            f = 1.0f;
        } else {
            this.b = i;
            aVar = this.e;
            f = -1.0f;
        }
        aVar.h(de1Var, f);
        return this;
    }

    public i6 n(de1 de1Var, de1 de1Var2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.e.h(de1Var, 1.0f);
            this.e.h(de1Var2, -1.0f);
        } else {
            this.e.h(de1Var, -1.0f);
            this.e.h(de1Var2, 1.0f);
        }
        return this;
    }

    public i6 o(de1 de1Var, de1 de1Var2, de1 de1Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.e.h(de1Var, 1.0f);
            this.e.h(de1Var2, -1.0f);
            this.e.h(de1Var3, -1.0f);
        } else {
            this.e.h(de1Var, -1.0f);
            this.e.h(de1Var2, 1.0f);
            this.e.h(de1Var3, 1.0f);
        }
        return this;
    }

    public i6 p(de1 de1Var, de1 de1Var2, de1 de1Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.e.h(de1Var, 1.0f);
            this.e.h(de1Var2, -1.0f);
            this.e.h(de1Var3, 1.0f);
        } else {
            this.e.h(de1Var, -1.0f);
            this.e.h(de1Var2, 1.0f);
            this.e.h(de1Var3, -1.0f);
        }
        return this;
    }

    public i6 q(de1 de1Var, de1 de1Var2, de1 de1Var3, de1 de1Var4, float f) {
        this.e.h(de1Var3, 0.5f);
        this.e.h(de1Var4, 0.5f);
        this.e.h(de1Var, -0.5f);
        this.e.h(de1Var2, -0.5f);
        this.b = -f;
        return this;
    }

    public void r() {
        float f = this.b;
        if (f < 0.0f) {
            this.b = f * (-1.0f);
            this.e.f();
        }
    }

    public boolean s() {
        de1 de1Var = this.a;
        return de1Var != null && (de1Var.j == de1.a.UNRESTRICTED || this.b >= 0.0f);
    }

    public boolean t(de1 de1Var) {
        return this.e.i(de1Var);
    }

    public String toString() {
        return A();
    }

    public boolean u() {
        return this.a == null && this.b == 0.0f && this.e.b() == 0;
    }

    public final boolean v(de1 de1Var, ak0 ak0Var) {
        return de1Var.m <= 1;
    }

    public de1 w(de1 de1Var) {
        return x(null, de1Var);
    }

    public final de1 x(boolean[] zArr, de1 de1Var) {
        de1.a aVar;
        int b = this.e.b();
        de1 de1Var2 = null;
        float f = 0.0f;
        for (int i = 0; i < b; i++) {
            float g = this.e.g(i);
            if (g < 0.0f) {
                de1 d = this.e.d(i);
                if ((zArr == null || !zArr[d.c]) && d != de1Var && (((aVar = d.j) == de1.a.SLACK || aVar == de1.a.ERROR) && g < f)) {
                    f = g;
                    de1Var2 = d;
                }
            }
        }
        return de1Var2;
    }

    public void y(de1 de1Var) {
        de1 de1Var2 = this.a;
        if (de1Var2 != null) {
            this.e.h(de1Var2, -1.0f);
            this.a = null;
        }
        float a2 = this.e.a(de1Var, true) * (-1.0f);
        this.a = de1Var;
        if (a2 == 1.0f) {
            return;
        }
        this.b /= a2;
        this.e.j(a2);
    }

    public void z() {
        this.a = null;
        this.e.clear();
        this.b = 0.0f;
        this.f = false;
    }
}
