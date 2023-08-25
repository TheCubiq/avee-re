package com.daaw;

import com.daaw.ak0;
import com.daaw.de1;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.daaw.i6 */
/* loaded from: classes.dex */
public class C1659i6 implements ak0.InterfaceC0642a {

    /* renamed from: e */
    public InterfaceC1660a f13292e;

    /* renamed from: a */
    public de1 f13288a = null;

    /* renamed from: b */
    public float f13289b = 0.0f;

    /* renamed from: c */
    public boolean f13290c = false;

    /* renamed from: d */
    public ArrayList<de1> f13291d = new ArrayList<>();

    /* renamed from: f */
    public boolean f13293f = false;

    /* renamed from: com.daaw.i6$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1660a {
        /* renamed from: a */
        float mo20080a(de1 de1Var, boolean z);

        /* renamed from: b */
        int mo20079b();

        /* renamed from: c */
        void mo20078c(de1 de1Var, float f, boolean z);

        void clear();

        /* renamed from: d */
        de1 mo20077d(int i);

        /* renamed from: e */
        float mo20076e(de1 de1Var);

        /* renamed from: f */
        void mo20075f();

        /* renamed from: g */
        float mo20074g(int i);

        /* renamed from: h */
        void mo20073h(de1 de1Var, float f);

        /* renamed from: i */
        boolean mo20072i(de1 de1Var);

        /* renamed from: j */
        void mo20071j(float f);

        /* renamed from: k */
        float mo20070k(C1659i6 c1659i6, boolean z);
    }

    public C1659i6() {
    }

    public C1659i6(C1395gd c1395gd) {
        this.f13292e = new C1162e6(this, c1395gd);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m20110A() {
        StringBuilder sb;
        boolean z;
        StringBuilder sb2;
        String str;
        StringBuilder sb3;
        if (this.f13288a == null) {
            sb = new StringBuilder();
            sb.append("");
            sb.append("0");
        } else {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f13288a);
        }
        String str2 = sb.toString() + " = ";
        if (this.f13289b != 0.0f) {
            str2 = str2 + this.f13289b;
            z = true;
        } else {
            z = false;
        }
        int mo20079b = this.f13292e.mo20079b();
        for (int i = 0; i < mo20079b; i++) {
            de1 mo20077d = this.f13292e.mo20077d(i);
            if (mo20077d != null) {
                float mo20074g = this.f13292e.mo20074g(i);
                if (mo20074g != 0.0f) {
                    String de1Var = mo20077d.toString();
                    if (!z) {
                        if (mo20074g < 0.0f) {
                            sb2 = new StringBuilder();
                            sb2.append(str2);
                            str = "- ";
                            sb2.append(str);
                            str2 = sb2.toString();
                            mo20074g *= -1.0f;
                        }
                        if (mo20074g == 1.0f) {
                            sb3 = new StringBuilder();
                        } else {
                            sb3 = new StringBuilder();
                            sb3.append(str2);
                            sb3.append(mo20074g);
                            str2 = " ";
                        }
                        sb3.append(str2);
                        sb3.append(de1Var);
                        str2 = sb3.toString();
                        z = true;
                    } else if (mo20074g > 0.0f) {
                        str2 = str2 + " + ";
                        if (mo20074g == 1.0f) {
                        }
                        sb3.append(str2);
                        sb3.append(de1Var);
                        str2 = sb3.toString();
                        z = true;
                    } else {
                        sb2 = new StringBuilder();
                        sb2.append(str2);
                        str = " - ";
                        sb2.append(str);
                        str2 = sb2.toString();
                        mo20074g *= -1.0f;
                        if (mo20074g == 1.0f) {
                        }
                        sb3.append(str2);
                        sb3.append(de1Var);
                        str2 = sb3.toString();
                        z = true;
                    }
                }
            }
        }
        if (z) {
            return str2;
        }
        return str2 + "0.0";
    }

    /* renamed from: B */
    public void m20109B(ak0 ak0Var, de1 de1Var, boolean z) {
        if (de1Var.f6977g) {
            this.f13289b += de1Var.f6976f * this.f13292e.mo20076e(de1Var);
            this.f13292e.mo20080a(de1Var, z);
            if (z) {
                de1Var.m24449c(this);
            }
        }
    }

    /* renamed from: C */
    public void mo20108C(C1659i6 c1659i6, boolean z) {
        this.f13289b += c1659i6.f13289b * this.f13292e.mo20070k(c1659i6, z);
        if (z) {
            c1659i6.f13288a.m24449c(this);
        }
    }

    /* renamed from: D */
    public void m20107D(ak0 ak0Var) {
        if (ak0Var.f3253f.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int mo20079b = this.f13292e.mo20079b();
            for (int i = 0; i < mo20079b; i++) {
                de1 mo20077d = this.f13292e.mo20077d(i);
                if (mo20077d.f6974d != -1 || mo20077d.f6977g) {
                    this.f13291d.add(mo20077d);
                }
            }
            if (this.f13291d.size() > 0) {
                Iterator<de1> it = this.f13291d.iterator();
                while (it.hasNext()) {
                    de1 next = it.next();
                    if (next.f6977g) {
                        m20109B(ak0Var, next, true);
                    } else {
                        mo20108C(ak0Var.f3253f[next.f6974d], true);
                    }
                }
                this.f13291d.clear();
            } else {
                z = true;
            }
        }
    }

    @Override // com.daaw.ak0.InterfaceC0642a
    /* renamed from: a */
    public void mo20106a(de1 de1Var) {
        int i = de1Var.f6975e;
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
        this.f13292e.mo20073h(de1Var, f);
    }

    @Override // com.daaw.ak0.InterfaceC0642a
    /* renamed from: b */
    public void mo20105b(ak0.InterfaceC0642a interfaceC0642a) {
        if (interfaceC0642a instanceof C1659i6) {
            C1659i6 c1659i6 = (C1659i6) interfaceC0642a;
            this.f13288a = null;
            this.f13292e.clear();
            for (int i = 0; i < c1659i6.f13292e.mo20079b(); i++) {
                this.f13292e.mo20078c(c1659i6.f13292e.mo20077d(i), c1659i6.f13292e.mo20074g(i), true);
            }
        }
    }

    @Override // com.daaw.ak0.InterfaceC0642a
    /* renamed from: c */
    public de1 mo20104c(ak0 ak0Var, boolean[] zArr) {
        return m20083x(zArr, null);
    }

    @Override // com.daaw.ak0.InterfaceC0642a
    public void clear() {
        this.f13292e.clear();
        this.f13288a = null;
        this.f13289b = 0.0f;
    }

    /* renamed from: d */
    public C1659i6 m20103d(ak0 ak0Var, int i) {
        this.f13292e.mo20073h(ak0Var.m27406o(i, "ep"), 1.0f);
        this.f13292e.mo20073h(ak0Var.m27406o(i, "em"), -1.0f);
        return this;
    }

    /* renamed from: e */
    public C1659i6 m20102e(de1 de1Var, int i) {
        this.f13292e.mo20073h(de1Var, i);
        return this;
    }

    /* renamed from: f */
    public boolean m20101f(ak0 ak0Var) {
        boolean z;
        de1 m20100g = m20100g(ak0Var);
        if (m20100g == null) {
            z = true;
        } else {
            m20082y(m20100g);
            z = false;
        }
        if (this.f13292e.mo20079b() == 0) {
            this.f13293f = true;
        }
        return z;
    }

    /* renamed from: g */
    public de1 m20100g(ak0 ak0Var) {
        int mo20079b = this.f13292e.mo20079b();
        de1 de1Var = null;
        de1 de1Var2 = null;
        boolean z = false;
        boolean z2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < mo20079b; i++) {
            float mo20074g = this.f13292e.mo20074g(i);
            de1 mo20077d = this.f13292e.mo20077d(i);
            if (mo20077d.f6980j == de1.EnumC1078a.UNRESTRICTED) {
                if (de1Var == null || f > mo20074g) {
                    z = m20085v(mo20077d, ak0Var);
                    f = mo20074g;
                    de1Var = mo20077d;
                } else if (!z && m20085v(mo20077d, ak0Var)) {
                    f = mo20074g;
                    de1Var = mo20077d;
                    z = true;
                }
            } else if (de1Var == null && mo20074g < 0.0f) {
                if (de1Var2 == null || f2 > mo20074g) {
                    z2 = m20085v(mo20077d, ak0Var);
                    f2 = mo20074g;
                    de1Var2 = mo20077d;
                } else if (!z2 && m20085v(mo20077d, ak0Var)) {
                    f2 = mo20074g;
                    de1Var2 = mo20077d;
                    z2 = true;
                }
            }
        }
        return de1Var != null ? de1Var : de1Var2;
    }

    @Override // com.daaw.ak0.InterfaceC0642a
    public de1 getKey() {
        return this.f13288a;
    }

    /* renamed from: h */
    public C1659i6 m20099h(de1 de1Var, de1 de1Var2, int i, float f, de1 de1Var3, de1 de1Var4, int i2) {
        float f2;
        int i3;
        if (de1Var2 == de1Var3) {
            this.f13292e.mo20073h(de1Var, 1.0f);
            this.f13292e.mo20073h(de1Var4, 1.0f);
            this.f13292e.mo20073h(de1Var2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f13292e.mo20073h(de1Var, 1.0f);
            this.f13292e.mo20073h(de1Var2, -1.0f);
            this.f13292e.mo20073h(de1Var3, -1.0f);
            this.f13292e.mo20073h(de1Var4, 1.0f);
            if (i > 0 || i2 > 0) {
                i3 = (-i) + i2;
                f2 = i3;
            }
            return this;
        } else if (f <= 0.0f) {
            this.f13292e.mo20073h(de1Var, -1.0f);
            this.f13292e.mo20073h(de1Var2, 1.0f);
            f2 = i;
        } else if (f < 1.0f) {
            float f3 = 1.0f - f;
            this.f13292e.mo20073h(de1Var, f3 * 1.0f);
            this.f13292e.mo20073h(de1Var2, f3 * (-1.0f));
            this.f13292e.mo20073h(de1Var3, (-1.0f) * f);
            this.f13292e.mo20073h(de1Var4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                f2 = ((-i) * f3) + (i2 * f);
            }
            return this;
        } else {
            this.f13292e.mo20073h(de1Var4, -1.0f);
            this.f13292e.mo20073h(de1Var3, 1.0f);
            i3 = -i2;
            f2 = i3;
        }
        this.f13289b = f2;
        return this;
    }

    /* renamed from: i */
    public C1659i6 m20098i(de1 de1Var, int i) {
        this.f13288a = de1Var;
        float f = i;
        de1Var.f6976f = f;
        this.f13289b = f;
        this.f13293f = true;
        return this;
    }

    /* renamed from: j */
    public C1659i6 m20097j(de1 de1Var, de1 de1Var2, float f) {
        this.f13292e.mo20073h(de1Var, -1.0f);
        this.f13292e.mo20073h(de1Var2, f);
        return this;
    }

    /* renamed from: k */
    public C1659i6 m20096k(de1 de1Var, de1 de1Var2, de1 de1Var3, de1 de1Var4, float f) {
        this.f13292e.mo20073h(de1Var, -1.0f);
        this.f13292e.mo20073h(de1Var2, 1.0f);
        this.f13292e.mo20073h(de1Var3, f);
        this.f13292e.mo20073h(de1Var4, -f);
        return this;
    }

    /* renamed from: l */
    public C1659i6 m20095l(float f, float f2, float f3, de1 de1Var, de1 de1Var2, de1 de1Var3, de1 de1Var4) {
        this.f13289b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f13292e.mo20073h(de1Var, 1.0f);
            this.f13292e.mo20073h(de1Var2, -1.0f);
            this.f13292e.mo20073h(de1Var4, 1.0f);
            this.f13292e.mo20073h(de1Var3, -1.0f);
        } else if (f == 0.0f) {
            this.f13292e.mo20073h(de1Var, 1.0f);
            this.f13292e.mo20073h(de1Var2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f13292e.mo20073h(de1Var3, 1.0f);
            this.f13292e.mo20073h(de1Var4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f13292e.mo20073h(de1Var, 1.0f);
            this.f13292e.mo20073h(de1Var2, -1.0f);
            this.f13292e.mo20073h(de1Var4, f4);
            this.f13292e.mo20073h(de1Var3, -f4);
        }
        return this;
    }

    /* renamed from: m */
    public C1659i6 m20094m(de1 de1Var, int i) {
        InterfaceC1660a interfaceC1660a;
        float f;
        if (i < 0) {
            this.f13289b = i * (-1);
            interfaceC1660a = this.f13292e;
            f = 1.0f;
        } else {
            this.f13289b = i;
            interfaceC1660a = this.f13292e;
            f = -1.0f;
        }
        interfaceC1660a.mo20073h(de1Var, f);
        return this;
    }

    /* renamed from: n */
    public C1659i6 m20093n(de1 de1Var, de1 de1Var2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f13289b = i;
        }
        if (z) {
            this.f13292e.mo20073h(de1Var, 1.0f);
            this.f13292e.mo20073h(de1Var2, -1.0f);
        } else {
            this.f13292e.mo20073h(de1Var, -1.0f);
            this.f13292e.mo20073h(de1Var2, 1.0f);
        }
        return this;
    }

    /* renamed from: o */
    public C1659i6 m20092o(de1 de1Var, de1 de1Var2, de1 de1Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f13289b = i;
        }
        if (z) {
            this.f13292e.mo20073h(de1Var, 1.0f);
            this.f13292e.mo20073h(de1Var2, -1.0f);
            this.f13292e.mo20073h(de1Var3, -1.0f);
        } else {
            this.f13292e.mo20073h(de1Var, -1.0f);
            this.f13292e.mo20073h(de1Var2, 1.0f);
            this.f13292e.mo20073h(de1Var3, 1.0f);
        }
        return this;
    }

    /* renamed from: p */
    public C1659i6 m20091p(de1 de1Var, de1 de1Var2, de1 de1Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f13289b = i;
        }
        if (z) {
            this.f13292e.mo20073h(de1Var, 1.0f);
            this.f13292e.mo20073h(de1Var2, -1.0f);
            this.f13292e.mo20073h(de1Var3, 1.0f);
        } else {
            this.f13292e.mo20073h(de1Var, -1.0f);
            this.f13292e.mo20073h(de1Var2, 1.0f);
            this.f13292e.mo20073h(de1Var3, -1.0f);
        }
        return this;
    }

    /* renamed from: q */
    public C1659i6 m20090q(de1 de1Var, de1 de1Var2, de1 de1Var3, de1 de1Var4, float f) {
        this.f13292e.mo20073h(de1Var3, 0.5f);
        this.f13292e.mo20073h(de1Var4, 0.5f);
        this.f13292e.mo20073h(de1Var, -0.5f);
        this.f13292e.mo20073h(de1Var2, -0.5f);
        this.f13289b = -f;
        return this;
    }

    /* renamed from: r */
    public void m20089r() {
        float f = this.f13289b;
        if (f < 0.0f) {
            this.f13289b = f * (-1.0f);
            this.f13292e.mo20075f();
        }
    }

    /* renamed from: s */
    public boolean m20088s() {
        de1 de1Var = this.f13288a;
        return de1Var != null && (de1Var.f6980j == de1.EnumC1078a.UNRESTRICTED || this.f13289b >= 0.0f);
    }

    /* renamed from: t */
    public boolean m20087t(de1 de1Var) {
        return this.f13292e.mo20072i(de1Var);
    }

    public String toString() {
        return m20110A();
    }

    /* renamed from: u */
    public boolean m20086u() {
        return this.f13288a == null && this.f13289b == 0.0f && this.f13292e.mo20079b() == 0;
    }

    /* renamed from: v */
    public final boolean m20085v(de1 de1Var, ak0 ak0Var) {
        return de1Var.f6983m <= 1;
    }

    /* renamed from: w */
    public de1 m20084w(de1 de1Var) {
        return m20083x(null, de1Var);
    }

    /* renamed from: x */
    public final de1 m20083x(boolean[] zArr, de1 de1Var) {
        de1.EnumC1078a enumC1078a;
        int mo20079b = this.f13292e.mo20079b();
        de1 de1Var2 = null;
        float f = 0.0f;
        for (int i = 0; i < mo20079b; i++) {
            float mo20074g = this.f13292e.mo20074g(i);
            if (mo20074g < 0.0f) {
                de1 mo20077d = this.f13292e.mo20077d(i);
                if ((zArr == null || !zArr[mo20077d.f6973c]) && mo20077d != de1Var && (((enumC1078a = mo20077d.f6980j) == de1.EnumC1078a.SLACK || enumC1078a == de1.EnumC1078a.ERROR) && mo20074g < f)) {
                    f = mo20074g;
                    de1Var2 = mo20077d;
                }
            }
        }
        return de1Var2;
    }

    /* renamed from: y */
    public void m20082y(de1 de1Var) {
        de1 de1Var2 = this.f13288a;
        if (de1Var2 != null) {
            this.f13292e.mo20073h(de1Var2, -1.0f);
            this.f13288a = null;
        }
        float mo20080a = this.f13292e.mo20080a(de1Var, true) * (-1.0f);
        this.f13288a = de1Var;
        if (mo20080a == 1.0f) {
            return;
        }
        this.f13289b /= mo20080a;
        this.f13292e.mo20071j(mo20080a);
    }

    /* renamed from: z */
    public void m20081z() {
        this.f13288a = null;
        this.f13292e.clear();
        this.f13289b = 0.0f;
        this.f13293f = false;
    }
}
