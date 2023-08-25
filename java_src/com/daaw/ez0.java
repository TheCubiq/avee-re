package com.daaw;

import com.daaw.C1659i6;
import java.util.Arrays;
import java.util.Comparator;
/* loaded from: classes.dex */
public class ez0 extends C1659i6 {

    /* renamed from: g */
    public int f8960g;

    /* renamed from: h */
    public de1[] f8961h;

    /* renamed from: i */
    public de1[] f8962i;

    /* renamed from: j */
    public int f8963j;

    /* renamed from: k */
    public C1238b f8964k;

    /* renamed from: l */
    public C1395gd f8965l;

    /* renamed from: com.daaw.ez0$a */
    /* loaded from: classes.dex */
    public class C1237a implements Comparator<de1> {
        public C1237a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(de1 de1Var, de1 de1Var2) {
            return de1Var.f6973c - de1Var2.f6973c;
        }
    }

    /* renamed from: com.daaw.ez0$b */
    /* loaded from: classes.dex */
    public class C1238b implements Comparable {

        /* renamed from: p */
        public de1 f8967p;

        /* renamed from: q */
        public ez0 f8968q;

        public C1238b(ez0 ez0Var) {
            this.f8968q = ez0Var;
        }

        /* renamed from: a */
        public boolean m22984a(de1 de1Var, float f) {
            boolean z = true;
            if (!this.f8967p.f6971a) {
                for (int i = 0; i < 9; i++) {
                    float f2 = de1Var.f6979i[i];
                    if (f2 != 0.0f) {
                        float f3 = f2 * f;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        this.f8967p.f6979i[i] = f3;
                    } else {
                        this.f8967p.f6979i[i] = 0.0f;
                    }
                }
                return true;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.f8967p.f6979i;
                fArr[i2] = fArr[i2] + (de1Var.f6979i[i2] * f);
                if (Math.abs(fArr[i2]) < 1.0E-4f) {
                    this.f8967p.f6979i[i2] = 0.0f;
                } else {
                    z = false;
                }
            }
            if (z) {
                ez0.this.m22986G(this.f8967p);
            }
            return false;
        }

        /* renamed from: b */
        public void m22983b(de1 de1Var) {
            this.f8967p = de1Var;
        }

        /* renamed from: c */
        public final boolean m22982c() {
            for (int i = 8; i >= 0; i--) {
                float f = this.f8967p.f6979i[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f8967p.f6973c - ((de1) obj).f6973c;
        }

        /* renamed from: d */
        public final boolean m22981d(de1 de1Var) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = de1Var.f6979i[i];
                float f2 = this.f8967p.f6979i[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        public void m22980e() {
            Arrays.fill(this.f8967p.f6979i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f8967p != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f8967p.f6979i[i] + " ";
                }
            }
            return str + "] " + this.f8967p;
        }
    }

    public ez0(C1395gd c1395gd) {
        super(c1395gd);
        this.f8960g = 128;
        this.f8961h = new de1[128];
        this.f8962i = new de1[128];
        this.f8963j = 0;
        this.f8964k = new C1238b(this);
        this.f8965l = c1395gd;
    }

    @Override // com.daaw.C1659i6
    /* renamed from: C */
    public void mo20108C(C1659i6 c1659i6, boolean z) {
        de1 de1Var = c1659i6.f13288a;
        if (de1Var == null) {
            return;
        }
        C1659i6.InterfaceC1660a interfaceC1660a = c1659i6.f13292e;
        int mo20079b = interfaceC1660a.mo20079b();
        for (int i = 0; i < mo20079b; i++) {
            de1 mo20077d = interfaceC1660a.mo20077d(i);
            float mo20074g = interfaceC1660a.mo20074g(i);
            this.f8964k.m22983b(mo20077d);
            if (this.f8964k.m22984a(de1Var, mo20074g)) {
                m22987F(mo20077d);
            }
            this.f13289b += c1659i6.f13289b * mo20074g;
        }
        m22986G(de1Var);
    }

    /* renamed from: F */
    public final void m22987F(de1 de1Var) {
        int i;
        int i2 = this.f8963j + 1;
        de1[] de1VarArr = this.f8961h;
        if (i2 > de1VarArr.length) {
            de1[] de1VarArr2 = (de1[]) Arrays.copyOf(de1VarArr, de1VarArr.length * 2);
            this.f8961h = de1VarArr2;
            this.f8962i = (de1[]) Arrays.copyOf(de1VarArr2, de1VarArr2.length * 2);
        }
        de1[] de1VarArr3 = this.f8961h;
        int i3 = this.f8963j;
        de1VarArr3[i3] = de1Var;
        int i4 = i3 + 1;
        this.f8963j = i4;
        if (i4 > 1 && de1VarArr3[i4 - 1].f6973c > de1Var.f6973c) {
            int i5 = 0;
            while (true) {
                i = this.f8963j;
                if (i5 >= i) {
                    break;
                }
                this.f8962i[i5] = this.f8961h[i5];
                i5++;
            }
            Arrays.sort(this.f8962i, 0, i, new C1237a());
            for (int i6 = 0; i6 < this.f8963j; i6++) {
                this.f8961h[i6] = this.f8962i[i6];
            }
        }
        de1Var.f6971a = true;
        de1Var.m24451a(this);
    }

    /* renamed from: G */
    public final void m22986G(de1 de1Var) {
        int i = 0;
        while (i < this.f8963j) {
            if (this.f8961h[i] == de1Var) {
                while (true) {
                    int i2 = this.f8963j;
                    if (i >= i2 - 1) {
                        this.f8963j = i2 - 1;
                        de1Var.f6971a = false;
                        return;
                    }
                    de1[] de1VarArr = this.f8961h;
                    int i3 = i + 1;
                    de1VarArr[i] = de1VarArr[i3];
                    i = i3;
                }
            } else {
                i++;
            }
        }
    }

    @Override // com.daaw.C1659i6, com.daaw.ak0.InterfaceC0642a
    /* renamed from: a */
    public void mo20106a(de1 de1Var) {
        this.f8964k.m22983b(de1Var);
        this.f8964k.m22980e();
        de1Var.f6979i[de1Var.f6975e] = 1.0f;
        m22987F(de1Var);
    }

    @Override // com.daaw.C1659i6, com.daaw.ak0.InterfaceC0642a
    /* renamed from: c */
    public de1 mo20104c(ak0 ak0Var, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f8963j; i2++) {
            de1 de1Var = this.f8961h[i2];
            if (!zArr[de1Var.f6973c]) {
                this.f8964k.m22983b(de1Var);
                C1238b c1238b = this.f8964k;
                if (i == -1) {
                    if (!c1238b.m22982c()) {
                    }
                    i = i2;
                } else {
                    if (!c1238b.m22981d(this.f8961h[i])) {
                    }
                    i = i2;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f8961h[i];
    }

    @Override // com.daaw.C1659i6, com.daaw.ak0.InterfaceC0642a
    public void clear() {
        this.f8963j = 0;
        this.f13289b = 0.0f;
    }

    @Override // com.daaw.C1659i6
    public String toString() {
        String str = " goal -> (" + this.f13289b + ") : ";
        for (int i = 0; i < this.f8963j; i++) {
            this.f8964k.m22983b(this.f8961h[i]);
            str = str + this.f8964k + " ";
        }
        return str;
    }
}
