package com.daaw;

import com.daaw.C2041lj;
import com.daaw.C2716qj;
/* loaded from: classes.dex */
public class k80 extends C2716qj {

    /* renamed from: w0 */
    public float f15776w0 = -1.0f;

    /* renamed from: x0 */
    public int f15777x0 = -1;

    /* renamed from: y0 */
    public int f15778y0 = -1;

    /* renamed from: z0 */
    public C2041lj f15779z0 = this.f23991C;

    /* renamed from: A0 */
    public int f15774A0 = 0;

    /* renamed from: B0 */
    public int f15775B0 = 0;

    /* renamed from: com.daaw.k80$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C1919a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15780a;

        static {
            int[] iArr = new int[C2041lj.EnumC2043b.values().length];
            f15780a = iArr;
            try {
                iArr[C2041lj.EnumC2043b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15780a[C2041lj.EnumC2043b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15780a[C2041lj.EnumC2043b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15780a[C2041lj.EnumC2043b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15780a[C2041lj.EnumC2043b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15780a[C2041lj.EnumC2043b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15780a[C2041lj.EnumC2043b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15780a[C2041lj.EnumC2043b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15780a[C2041lj.EnumC2043b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public k80() {
        this.f23999K.clear();
        this.f23999K.add(this.f15779z0);
        int length = this.f23998J.length;
        for (int i = 0; i < length; i++) {
            this.f23998J[i] = this.f15779z0;
        }
    }

    @Override // com.daaw.C2716qj
    /* renamed from: G0 */
    public void mo12457G0(ak0 ak0Var) {
        if (m12461E() == null) {
            return;
        }
        int m27397x = ak0Var.m27397x(this.f15779z0);
        if (this.f15774A0 == 1) {
            m12464C0(m27397x);
            m12462D0(0);
            m12432e0(m12461E().m12403t());
            m12466B0(0);
            return;
        }
        m12464C0(0);
        m12462D0(m27397x);
        m12466B0(m12461E().m12450N());
        m12432e0(0);
    }

    /* renamed from: H0 */
    public int m17981H0() {
        return this.f15774A0;
    }

    /* renamed from: I0 */
    public int m17980I0() {
        return this.f15777x0;
    }

    /* renamed from: J0 */
    public int m17979J0() {
        return this.f15778y0;
    }

    /* renamed from: K0 */
    public float m17978K0() {
        return this.f15776w0;
    }

    /* renamed from: L0 */
    public void m17977L0(int i) {
        if (i > -1) {
            this.f15776w0 = -1.0f;
            this.f15777x0 = i;
            this.f15778y0 = -1;
        }
    }

    /* renamed from: M0 */
    public void m17976M0(int i) {
        if (i > -1) {
            this.f15776w0 = -1.0f;
            this.f15777x0 = -1;
            this.f15778y0 = i;
        }
    }

    /* renamed from: N0 */
    public void m17975N0(float f) {
        if (f > -1.0f) {
            this.f15776w0 = f;
            this.f15777x0 = -1;
            this.f15778y0 = -1;
        }
    }

    /* renamed from: O0 */
    public void m17974O0(int i) {
        if (this.f15774A0 == i) {
            return;
        }
        this.f15774A0 = i;
        this.f23999K.clear();
        this.f15779z0 = this.f15774A0 == 1 ? this.f23990B : this.f23991C;
        this.f23999K.add(this.f15779z0);
        int length = this.f23998J.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f23998J[i2] = this.f15779z0;
        }
    }

    @Override // com.daaw.C2716qj
    /* renamed from: f */
    public void mo12431f(ak0 ak0Var) {
        C2865rj c2865rj = (C2865rj) m12461E();
        if (c2865rj == null) {
            return;
        }
        C2041lj mo12421k = c2865rj.mo12421k(C2041lj.EnumC2043b.LEFT);
        C2041lj mo12421k2 = c2865rj.mo12421k(C2041lj.EnumC2043b.RIGHT);
        C2716qj c2716qj = this.f24002N;
        boolean z = true;
        boolean z2 = c2716qj != null && c2716qj.f24001M[0] == C2716qj.EnumC2718b.WRAP_CONTENT;
        if (this.f15774A0 == 0) {
            mo12421k = c2865rj.mo12421k(C2041lj.EnumC2043b.TOP);
            mo12421k2 = c2865rj.mo12421k(C2041lj.EnumC2043b.BOTTOM);
            C2716qj c2716qj2 = this.f24002N;
            z2 = (c2716qj2 == null || c2716qj2.f24001M[1] != C2716qj.EnumC2718b.WRAP_CONTENT) ? false : false;
        }
        if (this.f15777x0 != -1) {
            de1 m27404q = ak0Var.m27404q(this.f15779z0);
            ak0Var.m27416e(m27404q, ak0Var.m27404q(mo12421k), this.f15777x0, 8);
            if (z2) {
                ak0Var.m27413h(ak0Var.m27404q(mo12421k2), m27404q, 0, 5);
            }
        } else if (this.f15778y0 == -1) {
            if (this.f15776w0 != -1.0f) {
                ak0Var.m27417d(ak0.m27402s(ak0Var, ak0Var.m27404q(this.f15779z0), ak0Var.m27404q(mo12421k2), this.f15776w0));
            }
        } else {
            de1 m27404q2 = ak0Var.m27404q(this.f15779z0);
            de1 m27404q3 = ak0Var.m27404q(mo12421k2);
            ak0Var.m27416e(m27404q2, m27404q3, -this.f15778y0, 8);
            if (z2) {
                ak0Var.m27413h(m27404q2, ak0Var.m27404q(mo12421k), 0, 5);
                ak0Var.m27413h(m27404q3, m27404q2, 0, 5);
            }
        }
    }

    @Override // com.daaw.C2716qj
    /* renamed from: g */
    public boolean mo12429g() {
        return true;
    }

    @Override // com.daaw.C2716qj
    /* renamed from: k */
    public C2041lj mo12421k(C2041lj.EnumC2043b enumC2043b) {
        switch (C1919a.f15780a[enumC2043b.ordinal()]) {
            case 1:
            case 2:
                if (this.f15774A0 == 1) {
                    return this.f15779z0;
                }
                break;
            case 3:
            case 4:
                if (this.f15774A0 == 0) {
                    return this.f15779z0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(enumC2043b.name());
    }
}
