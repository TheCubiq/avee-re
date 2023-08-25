package com.daaw;

import com.daaw.C2041lj;
import com.daaw.de1;
import java.util.Arrays;
import java.util.HashMap;
/* loaded from: classes.dex */
public class ak0 {

    /* renamed from: q */
    public static int f3244q = 1000;

    /* renamed from: r */
    public static boolean f3245r = true;

    /* renamed from: s */
    public static long f3246s;

    /* renamed from: t */
    public static long f3247t;

    /* renamed from: c */
    public InterfaceC0642a f3250c;

    /* renamed from: f */
    public C1659i6[] f3253f;

    /* renamed from: m */
    public final C1395gd f3260m;

    /* renamed from: p */
    public InterfaceC0642a f3263p;

    /* renamed from: a */
    public int f3248a = 0;

    /* renamed from: b */
    public HashMap<String, de1> f3249b = null;

    /* renamed from: d */
    public int f3251d = 32;

    /* renamed from: e */
    public int f3252e = 32;

    /* renamed from: g */
    public boolean f3254g = false;

    /* renamed from: h */
    public boolean f3255h = false;

    /* renamed from: i */
    public boolean[] f3256i = new boolean[32];

    /* renamed from: j */
    public int f3257j = 1;

    /* renamed from: k */
    public int f3258k = 0;

    /* renamed from: l */
    public int f3259l = 32;

    /* renamed from: n */
    public de1[] f3261n = new de1[f3244q];

    /* renamed from: o */
    public int f3262o = 0;

    /* renamed from: com.daaw.ak0$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0642a {
        /* renamed from: a */
        void mo20106a(de1 de1Var);

        /* renamed from: b */
        void mo20105b(InterfaceC0642a interfaceC0642a);

        /* renamed from: c */
        de1 mo20104c(ak0 ak0Var, boolean[] zArr);

        void clear();

        de1 getKey();
    }

    /* renamed from: com.daaw.ak0$b */
    /* loaded from: classes.dex */
    public class C0643b extends C1659i6 {
        public C0643b(C1395gd c1395gd) {
            this.f13292e = new ee1(this, c1395gd);
        }
    }

    public ak0() {
        this.f3253f = null;
        this.f3253f = new C1659i6[32];
        m27422C();
        C1395gd c1395gd = new C1395gd();
        this.f3260m = c1395gd;
        this.f3250c = new ez0(c1395gd);
        this.f3263p = f3245r ? new C0643b(c1395gd) : new C1659i6(c1395gd);
    }

    /* renamed from: s */
    public static C1659i6 m27402s(ak0 ak0Var, de1 de1Var, de1 de1Var2, float f) {
        return ak0Var.m27403r().m20097j(de1Var, de1Var2, f);
    }

    /* renamed from: w */
    public static dq0 m27398w() {
        return null;
    }

    /* renamed from: A */
    public void m27424A(InterfaceC0642a interfaceC0642a) {
        m27400u(interfaceC0642a);
        m27423B(interfaceC0642a, false);
        m27407n();
    }

    /* renamed from: B */
    public final int m27423B(InterfaceC0642a interfaceC0642a, boolean z) {
        for (int i = 0; i < this.f3257j; i++) {
            this.f3256i[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            if (i2 >= this.f3257j * 2) {
                return i2;
            }
            if (interfaceC0642a.getKey() != null) {
                this.f3256i[interfaceC0642a.getKey().f6973c] = true;
            }
            de1 mo20104c = interfaceC0642a.mo20104c(this, this.f3256i);
            if (mo20104c != null) {
                boolean[] zArr = this.f3256i;
                int i3 = mo20104c.f6973c;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (mo20104c != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f3258k; i5++) {
                    C1659i6 c1659i6 = this.f3253f[i5];
                    if (c1659i6.f13288a.f6980j != de1.EnumC1078a.UNRESTRICTED && !c1659i6.f13293f && c1659i6.m20087t(mo20104c)) {
                        float mo20076e = c1659i6.f13292e.mo20076e(mo20104c);
                        if (mo20076e < 0.0f) {
                            float f2 = (-c1659i6.f13289b) / mo20076e;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C1659i6 c1659i62 = this.f3253f[i4];
                    c1659i62.f13288a.f6974d = -1;
                    c1659i62.m20082y(mo20104c);
                    de1 de1Var = c1659i62.f13288a;
                    de1Var.f6974d = i4;
                    de1Var.m24445g(c1659i62);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    /* renamed from: C */
    public final void m27422C() {
        int i = 0;
        if (f3245r) {
            while (true) {
                C1659i6[] c1659i6Arr = this.f3253f;
                if (i >= c1659i6Arr.length) {
                    return;
                }
                C1659i6 c1659i6 = c1659i6Arr[i];
                if (c1659i6 != null) {
                    this.f3260m.f11076a.mo23015a(c1659i6);
                }
                this.f3253f[i] = null;
                i++;
            }
        } else {
            while (true) {
                C1659i6[] c1659i6Arr2 = this.f3253f;
                if (i >= c1659i6Arr2.length) {
                    return;
                }
                C1659i6 c1659i62 = c1659i6Arr2[i];
                if (c1659i62 != null) {
                    this.f3260m.f11077b.mo23015a(c1659i62);
                }
                this.f3253f[i] = null;
                i++;
            }
        }
    }

    /* renamed from: D */
    public void m27421D() {
        C1395gd c1395gd;
        int i = 0;
        while (true) {
            c1395gd = this.f3260m;
            de1[] de1VarArr = c1395gd.f11079d;
            if (i >= de1VarArr.length) {
                break;
            }
            de1 de1Var = de1VarArr[i];
            if (de1Var != null) {
                de1Var.m24448d();
            }
            i++;
        }
        c1395gd.f11078c.mo23013c(this.f3261n, this.f3262o);
        this.f3262o = 0;
        Arrays.fill(this.f3260m.f11079d, (Object) null);
        HashMap<String, de1> hashMap = this.f3249b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f3248a = 0;
        this.f3250c.clear();
        this.f3257j = 1;
        for (int i2 = 0; i2 < this.f3258k; i2++) {
            this.f3253f[i2].f13290c = false;
        }
        m27422C();
        this.f3258k = 0;
        this.f3263p = f3245r ? new C0643b(this.f3260m) : new C1659i6(this.f3260m);
    }

    /* renamed from: a */
    public final de1 m27420a(de1.EnumC1078a enumC1078a, String str) {
        de1 mo23014b = this.f3260m.f11078c.mo23014b();
        if (mo23014b == null) {
            mo23014b = new de1(enumC1078a, str);
        } else {
            mo23014b.m24448d();
        }
        mo23014b.m24446f(enumC1078a, str);
        int i = this.f3262o;
        int i2 = f3244q;
        if (i >= i2) {
            int i3 = i2 * 2;
            f3244q = i3;
            this.f3261n = (de1[]) Arrays.copyOf(this.f3261n, i3);
        }
        de1[] de1VarArr = this.f3261n;
        int i4 = this.f3262o;
        this.f3262o = i4 + 1;
        de1VarArr[i4] = mo23014b;
        return mo23014b;
    }

    /* renamed from: b */
    public void m27419b(C2716qj c2716qj, C2716qj c2716qj2, float f, int i) {
        C2041lj.EnumC2043b enumC2043b = C2041lj.EnumC2043b.LEFT;
        de1 m27404q = m27404q(c2716qj.mo12421k(enumC2043b));
        C2041lj.EnumC2043b enumC2043b2 = C2041lj.EnumC2043b.TOP;
        de1 m27404q2 = m27404q(c2716qj.mo12421k(enumC2043b2));
        C2041lj.EnumC2043b enumC2043b3 = C2041lj.EnumC2043b.RIGHT;
        de1 m27404q3 = m27404q(c2716qj.mo12421k(enumC2043b3));
        C2041lj.EnumC2043b enumC2043b4 = C2041lj.EnumC2043b.BOTTOM;
        de1 m27404q4 = m27404q(c2716qj.mo12421k(enumC2043b4));
        de1 m27404q5 = m27404q(c2716qj2.mo12421k(enumC2043b));
        de1 m27404q6 = m27404q(c2716qj2.mo12421k(enumC2043b2));
        de1 m27404q7 = m27404q(c2716qj2.mo12421k(enumC2043b3));
        de1 m27404q8 = m27404q(c2716qj2.mo12421k(enumC2043b4));
        C1659i6 m27403r = m27403r();
        double d = f;
        double sin = Math.sin(d);
        double d2 = i;
        Double.isNaN(d2);
        m27403r.m20090q(m27404q2, m27404q4, m27404q6, m27404q8, (float) (sin * d2));
        m27417d(m27403r);
        C1659i6 m27403r2 = m27403r();
        double cos = Math.cos(d);
        Double.isNaN(d2);
        m27403r2.m20090q(m27404q, m27404q3, m27404q5, m27404q7, (float) (cos * d2));
        m27417d(m27403r2);
    }

    /* renamed from: c */
    public void m27418c(de1 de1Var, de1 de1Var2, int i, float f, de1 de1Var3, de1 de1Var4, int i2, int i3) {
        C1659i6 m27403r = m27403r();
        m27403r.m20099h(de1Var, de1Var2, i, f, de1Var3, de1Var4, i2);
        if (i3 != 8) {
            m27403r.m20103d(this, i3);
        }
        m27417d(m27403r);
    }

    /* renamed from: d */
    public void m27417d(C1659i6 c1659i6) {
        de1 m20084w;
        if (c1659i6 == null) {
            return;
        }
        boolean z = true;
        if (this.f3258k + 1 >= this.f3259l || this.f3257j + 1 >= this.f3252e) {
            m27396y();
        }
        boolean z2 = false;
        if (!c1659i6.f13293f) {
            c1659i6.m20107D(this);
            if (c1659i6.m20086u()) {
                return;
            }
            c1659i6.m20089r();
            if (c1659i6.m20101f(this)) {
                de1 m27405p = m27405p();
                c1659i6.f13288a = m27405p;
                m27409l(c1659i6);
                this.f3263p.mo20105b(c1659i6);
                m27423B(this.f3263p, true);
                if (m27405p.f6974d == -1) {
                    if (c1659i6.f13288a == m27405p && (m20084w = c1659i6.m20084w(m27405p)) != null) {
                        c1659i6.m20082y(m20084w);
                    }
                    if (!c1659i6.f13293f) {
                        c1659i6.f13288a.m24445g(c1659i6);
                    }
                    this.f3258k--;
                }
            } else {
                z = false;
            }
            if (!c1659i6.m20088s()) {
                return;
            }
            z2 = z;
        }
        if (z2) {
            return;
        }
        m27409l(c1659i6);
    }

    /* renamed from: e */
    public C1659i6 m27416e(de1 de1Var, de1 de1Var2, int i, int i2) {
        if (i2 == 8 && de1Var2.f6977g && de1Var.f6974d == -1) {
            de1Var.m24447e(this, de1Var2.f6976f + i);
            return null;
        }
        C1659i6 m27403r = m27403r();
        m27403r.m20093n(de1Var, de1Var2, i);
        if (i2 != 8) {
            m27403r.m20103d(this, i2);
        }
        m27417d(m27403r);
        return m27403r;
    }

    /* renamed from: f */
    public void m27415f(de1 de1Var, int i) {
        C1659i6 m27403r;
        int i2 = de1Var.f6974d;
        if (i2 == -1) {
            de1Var.m24447e(this, i);
            return;
        }
        if (i2 != -1) {
            C1659i6 c1659i6 = this.f3253f[i2];
            if (!c1659i6.f13293f) {
                if (c1659i6.f13292e.mo20079b() == 0) {
                    c1659i6.f13293f = true;
                } else {
                    m27403r = m27403r();
                    m27403r.m20094m(de1Var, i);
                }
            }
            c1659i6.f13289b = i;
            return;
        }
        m27403r = m27403r();
        m27403r.m20098i(de1Var, i);
        m27417d(m27403r);
    }

    /* renamed from: g */
    public void m27414g(de1 de1Var, de1 de1Var2, int i, boolean z) {
        C1659i6 m27403r = m27403r();
        de1 m27401t = m27401t();
        m27401t.f6975e = 0;
        m27403r.m20092o(de1Var, de1Var2, m27401t, i);
        m27417d(m27403r);
    }

    /* renamed from: h */
    public void m27413h(de1 de1Var, de1 de1Var2, int i, int i2) {
        C1659i6 m27403r = m27403r();
        de1 m27401t = m27401t();
        m27401t.f6975e = 0;
        m27403r.m20092o(de1Var, de1Var2, m27401t, i);
        if (i2 != 8) {
            m27408m(m27403r, (int) (m27403r.f13292e.mo20076e(m27401t) * (-1.0f)), i2);
        }
        m27417d(m27403r);
    }

    /* renamed from: i */
    public void m27412i(de1 de1Var, de1 de1Var2, int i, boolean z) {
        C1659i6 m27403r = m27403r();
        de1 m27401t = m27401t();
        m27401t.f6975e = 0;
        m27403r.m20091p(de1Var, de1Var2, m27401t, i);
        m27417d(m27403r);
    }

    /* renamed from: j */
    public void m27411j(de1 de1Var, de1 de1Var2, int i, int i2) {
        C1659i6 m27403r = m27403r();
        de1 m27401t = m27401t();
        m27401t.f6975e = 0;
        m27403r.m20091p(de1Var, de1Var2, m27401t, i);
        if (i2 != 8) {
            m27408m(m27403r, (int) (m27403r.f13292e.mo20076e(m27401t) * (-1.0f)), i2);
        }
        m27417d(m27403r);
    }

    /* renamed from: k */
    public void m27410k(de1 de1Var, de1 de1Var2, de1 de1Var3, de1 de1Var4, float f, int i) {
        C1659i6 m27403r = m27403r();
        m27403r.m20096k(de1Var, de1Var2, de1Var3, de1Var4, f);
        if (i != 8) {
            m27403r.m20103d(this, i);
        }
        m27417d(m27403r);
    }

    /* renamed from: l */
    public final void m27409l(C1659i6 c1659i6) {
        cy0<C1659i6> cy0Var;
        C1659i6 c1659i62;
        if (f3245r) {
            C1659i6[] c1659i6Arr = this.f3253f;
            int i = this.f3258k;
            if (c1659i6Arr[i] != null) {
                cy0Var = this.f3260m.f11076a;
                c1659i62 = c1659i6Arr[i];
                cy0Var.mo23015a(c1659i62);
            }
        } else {
            C1659i6[] c1659i6Arr2 = this.f3253f;
            int i2 = this.f3258k;
            if (c1659i6Arr2[i2] != null) {
                cy0Var = this.f3260m.f11077b;
                c1659i62 = c1659i6Arr2[i2];
                cy0Var.mo23015a(c1659i62);
            }
        }
        C1659i6[] c1659i6Arr3 = this.f3253f;
        int i3 = this.f3258k;
        c1659i6Arr3[i3] = c1659i6;
        de1 de1Var = c1659i6.f13288a;
        de1Var.f6974d = i3;
        this.f3258k = i3 + 1;
        de1Var.m24445g(c1659i6);
    }

    /* renamed from: m */
    public void m27408m(C1659i6 c1659i6, int i, int i2) {
        c1659i6.m20102e(m27406o(i2, null), i);
    }

    /* renamed from: n */
    public final void m27407n() {
        for (int i = 0; i < this.f3258k; i++) {
            C1659i6 c1659i6 = this.f3253f[i];
            c1659i6.f13288a.f6976f = c1659i6.f13289b;
        }
    }

    /* renamed from: o */
    public de1 m27406o(int i, String str) {
        if (this.f3257j + 1 >= this.f3252e) {
            m27396y();
        }
        de1 m27420a = m27420a(de1.EnumC1078a.ERROR, str);
        int i2 = this.f3248a + 1;
        this.f3248a = i2;
        this.f3257j++;
        m27420a.f6973c = i2;
        m27420a.f6975e = i;
        this.f3260m.f11079d[i2] = m27420a;
        this.f3250c.mo20106a(m27420a);
        return m27420a;
    }

    /* renamed from: p */
    public de1 m27405p() {
        if (this.f3257j + 1 >= this.f3252e) {
            m27396y();
        }
        de1 m27420a = m27420a(de1.EnumC1078a.SLACK, null);
        int i = this.f3248a + 1;
        this.f3248a = i;
        this.f3257j++;
        m27420a.f6973c = i;
        this.f3260m.f11079d[i] = m27420a;
        return m27420a;
    }

    /* renamed from: q */
    public de1 m27404q(Object obj) {
        de1 de1Var = null;
        if (obj == null) {
            return null;
        }
        if (this.f3257j + 1 >= this.f3252e) {
            m27396y();
        }
        if (obj instanceof C2041lj) {
            C2041lj c2041lj = (C2041lj) obj;
            de1Var = c2041lj.m16927e();
            if (de1Var == null) {
                c2041lj.m16920l(this.f3260m);
                de1Var = c2041lj.m16927e();
            }
            int i = de1Var.f6973c;
            if (i == -1 || i > this.f3248a || this.f3260m.f11079d[i] == null) {
                if (i != -1) {
                    de1Var.m24448d();
                }
                int i2 = this.f3248a + 1;
                this.f3248a = i2;
                this.f3257j++;
                de1Var.f6973c = i2;
                de1Var.f6980j = de1.EnumC1078a.UNRESTRICTED;
                this.f3260m.f11079d[i2] = de1Var;
            }
        }
        return de1Var;
    }

    /* renamed from: r */
    public C1659i6 m27403r() {
        C1659i6 mo23014b;
        if (f3245r) {
            mo23014b = this.f3260m.f11076a.mo23014b();
            if (mo23014b == null) {
                mo23014b = new C0643b(this.f3260m);
                f3247t++;
            }
            mo23014b.m20081z();
        } else {
            mo23014b = this.f3260m.f11077b.mo23014b();
            if (mo23014b == null) {
                mo23014b = new C1659i6(this.f3260m);
                f3246s++;
            }
            mo23014b.m20081z();
        }
        de1.m24450b();
        return mo23014b;
    }

    /* renamed from: t */
    public de1 m27401t() {
        if (this.f3257j + 1 >= this.f3252e) {
            m27396y();
        }
        de1 m27420a = m27420a(de1.EnumC1078a.SLACK, null);
        int i = this.f3248a + 1;
        this.f3248a = i;
        this.f3257j++;
        m27420a.f6973c = i;
        this.f3260m.f11079d[i] = m27420a;
        return m27420a;
    }

    /* renamed from: u */
    public final int m27400u(InterfaceC0642a interfaceC0642a) {
        float f;
        boolean z;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= this.f3258k) {
                z = false;
                break;
            }
            C1659i6[] c1659i6Arr = this.f3253f;
            if (c1659i6Arr[i].f13288a.f6980j != de1.EnumC1078a.UNRESTRICTED && c1659i6Arr[i].f13289b < 0.0f) {
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
                while (i3 < this.f3258k) {
                    C1659i6 c1659i6 = this.f3253f[i3];
                    if (c1659i6.f13288a.f6980j != de1.EnumC1078a.UNRESTRICTED && !c1659i6.f13293f && c1659i6.f13289b < f) {
                        int i7 = 1;
                        while (i7 < this.f3257j) {
                            de1 de1Var = this.f3260m.f11079d[i7];
                            float mo20076e = c1659i6.f13292e.mo20076e(de1Var);
                            if (mo20076e > f) {
                                for (int i8 = 0; i8 < 9; i8++) {
                                    float f3 = de1Var.f6978h[i8] / mo20076e;
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
                    C1659i6 c1659i62 = this.f3253f[i4];
                    c1659i62.f13288a.f6974d = -1;
                    c1659i62.m20082y(this.f3260m.f11079d[i5]);
                    de1 de1Var2 = c1659i62.f13288a;
                    de1Var2.f6974d = i4;
                    de1Var2.m24445g(c1659i62);
                } else {
                    z2 = true;
                }
                if (i2 > this.f3257j / 2) {
                    z2 = true;
                }
                f = 0.0f;
            }
            return i2;
        }
        return 0;
    }

    /* renamed from: v */
    public C1395gd m27399v() {
        return this.f3260m;
    }

    /* renamed from: x */
    public int m27397x(Object obj) {
        de1 m16927e = ((C2041lj) obj).m16927e();
        if (m16927e != null) {
            return (int) (m16927e.f6976f + 0.5f);
        }
        return 0;
    }

    /* renamed from: y */
    public final void m27396y() {
        int i = this.f3251d * 2;
        this.f3251d = i;
        this.f3253f = (C1659i6[]) Arrays.copyOf(this.f3253f, i);
        C1395gd c1395gd = this.f3260m;
        c1395gd.f11079d = (de1[]) Arrays.copyOf(c1395gd.f11079d, this.f3251d);
        int i2 = this.f3251d;
        this.f3256i = new boolean[i2];
        this.f3252e = i2;
        this.f3259l = i2;
    }

    /* renamed from: z */
    public void m27395z() {
        if (this.f3254g || this.f3255h) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f3258k) {
                    z = true;
                    break;
                } else if (!this.f3253f[i].f13293f) {
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                m27407n();
                return;
            }
        }
        m27424A(this.f3250c);
    }
}
