package com.daaw;

import com.daaw.lj;
import com.daaw.qj;
/* loaded from: classes.dex */
public class k80 extends qj {
    public float w0 = -1.0f;
    public int x0 = -1;
    public int y0 = -1;
    public lj z0 = this.C;
    public int A0 = 0;
    public int B0 = 0;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[lj.b.values().length];
            a = iArr;
            try {
                iArr[lj.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[lj.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[lj.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[lj.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[lj.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[lj.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[lj.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[lj.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[lj.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public k80() {
        this.K.clear();
        this.K.add(this.z0);
        int length = this.J.length;
        for (int i = 0; i < length; i++) {
            this.J[i] = this.z0;
        }
    }

    @Override // com.daaw.qj
    public void G0(ak0 ak0Var) {
        if (E() == null) {
            return;
        }
        int x = ak0Var.x(this.z0);
        if (this.A0 == 1) {
            C0(x);
            D0(0);
            e0(E().t());
            B0(0);
            return;
        }
        C0(0);
        D0(x);
        B0(E().N());
        e0(0);
    }

    public int H0() {
        return this.A0;
    }

    public int I0() {
        return this.x0;
    }

    public int J0() {
        return this.y0;
    }

    public float K0() {
        return this.w0;
    }

    public void L0(int i) {
        if (i > -1) {
            this.w0 = -1.0f;
            this.x0 = i;
            this.y0 = -1;
        }
    }

    public void M0(int i) {
        if (i > -1) {
            this.w0 = -1.0f;
            this.x0 = -1;
            this.y0 = i;
        }
    }

    public void N0(float f) {
        if (f > -1.0f) {
            this.w0 = f;
            this.x0 = -1;
            this.y0 = -1;
        }
    }

    public void O0(int i) {
        if (this.A0 == i) {
            return;
        }
        this.A0 = i;
        this.K.clear();
        this.z0 = this.A0 == 1 ? this.B : this.C;
        this.K.add(this.z0);
        int length = this.J.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.J[i2] = this.z0;
        }
    }

    @Override // com.daaw.qj
    public void f(ak0 ak0Var) {
        rj rjVar = (rj) E();
        if (rjVar == null) {
            return;
        }
        lj k = rjVar.k(lj.b.LEFT);
        lj k2 = rjVar.k(lj.b.RIGHT);
        qj qjVar = this.N;
        boolean z = true;
        boolean z2 = qjVar != null && qjVar.M[0] == qj.b.WRAP_CONTENT;
        if (this.A0 == 0) {
            k = rjVar.k(lj.b.TOP);
            k2 = rjVar.k(lj.b.BOTTOM);
            qj qjVar2 = this.N;
            z2 = (qjVar2 == null || qjVar2.M[1] != qj.b.WRAP_CONTENT) ? false : false;
        }
        if (this.x0 != -1) {
            de1 q = ak0Var.q(this.z0);
            ak0Var.e(q, ak0Var.q(k), this.x0, 8);
            if (z2) {
                ak0Var.h(ak0Var.q(k2), q, 0, 5);
            }
        } else if (this.y0 == -1) {
            if (this.w0 != -1.0f) {
                ak0Var.d(ak0.s(ak0Var, ak0Var.q(this.z0), ak0Var.q(k2), this.w0));
            }
        } else {
            de1 q2 = ak0Var.q(this.z0);
            de1 q3 = ak0Var.q(k2);
            ak0Var.e(q2, q3, -this.y0, 8);
            if (z2) {
                ak0Var.h(q2, ak0Var.q(k), 0, 5);
                ak0Var.h(q3, q2, 0, 5);
            }
        }
    }

    @Override // com.daaw.qj
    public boolean g() {
        return true;
    }

    @Override // com.daaw.qj
    public lj k(lj.b bVar) {
        switch (a.a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.A0 == 1) {
                    return this.z0;
                }
                break;
            case 3:
            case 4:
                if (this.A0 == 0) {
                    return this.z0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }
}
