package com.daaw;

import com.daaw.qj;
/* loaded from: classes.dex */
public class ja extends bb0 {
    public int y0 = 0;
    public boolean z0 = true;
    public int A0 = 0;

    public boolean H0() {
        return this.z0;
    }

    public int I0() {
        return this.y0;
    }

    public int J0() {
        return this.A0;
    }

    public void K0() {
        for (int i = 0; i < this.x0; i++) {
            qj qjVar = this.w0[i];
            int i2 = this.y0;
            if (i2 == 0 || i2 == 1) {
                qjVar.l0(0, true);
            } else if (i2 == 2 || i2 == 3) {
                qjVar.l0(1, true);
            }
        }
    }

    public void L0(boolean z) {
        this.z0 = z;
    }

    public void M0(int i) {
        this.y0 = i;
    }

    public void N0(int i) {
        this.A0 = i;
    }

    @Override // com.daaw.qj
    public void f(ak0 ak0Var) {
        Object[] objArr;
        boolean z;
        de1 de1Var;
        lj ljVar;
        int i;
        int i2;
        int i3;
        lj[] ljVarArr = this.J;
        ljVarArr[0] = this.B;
        ljVarArr[2] = this.C;
        ljVarArr[1] = this.D;
        ljVarArr[3] = this.E;
        int i4 = 0;
        while (true) {
            objArr = this.J;
            if (i4 >= objArr.length) {
                break;
            }
            objArr[i4].g = ak0Var.q(objArr[i4]);
            i4++;
        }
        int i5 = this.y0;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        lj ljVar2 = objArr[i5];
        for (int i6 = 0; i6 < this.x0; i6++) {
            qj qjVar = this.w0[i6];
            if ((this.z0 || qjVar.g()) && ((((i2 = this.y0) == 0 || i2 == 1) && qjVar.w() == qj.b.MATCH_CONSTRAINT && qjVar.B.d != null && qjVar.D.d != null) || (((i3 = this.y0) == 2 || i3 == 3) && qjVar.K() == qj.b.MATCH_CONSTRAINT && qjVar.C.d != null && qjVar.E.d != null))) {
                z = true;
                break;
            }
        }
        z = false;
        boolean z2 = this.B.h() || this.D.h();
        boolean z3 = this.C.h() || this.E.h();
        int i7 = !z && (((i = this.y0) == 0 && z2) || ((i == 2 && z3) || ((i == 1 && z2) || (i == 3 && z3)))) ? 5 : 4;
        for (int i8 = 0; i8 < this.x0; i8++) {
            qj qjVar2 = this.w0[i8];
            if (this.z0 || qjVar2.g()) {
                de1 q = ak0Var.q(qjVar2.J[this.y0]);
                lj[] ljVarArr2 = qjVar2.J;
                int i9 = this.y0;
                ljVarArr2[i9].g = q;
                int i10 = (ljVarArr2[i9].d == null || ljVarArr2[i9].d.b != this) ? 0 : ljVarArr2[i9].e + 0;
                if (i9 == 0 || i9 == 2) {
                    ak0Var.i(ljVar2.g, q, this.A0 - i10, z);
                } else {
                    ak0Var.g(ljVar2.g, q, this.A0 + i10, z);
                }
                ak0Var.e(ljVar2.g, q, this.A0 + i10, i7);
            }
        }
        int i11 = this.y0;
        if (i11 == 0) {
            ak0Var.e(this.D.g, this.B.g, 0, 8);
            ak0Var.e(this.B.g, this.N.D.g, 0, 4);
            de1Var = this.B.g;
            ljVar = this.N.B;
        } else if (i11 == 1) {
            ak0Var.e(this.B.g, this.D.g, 0, 8);
            ak0Var.e(this.B.g, this.N.B.g, 0, 4);
            de1Var = this.B.g;
            ljVar = this.N.D;
        } else if (i11 == 2) {
            ak0Var.e(this.E.g, this.C.g, 0, 8);
            ak0Var.e(this.C.g, this.N.E.g, 0, 4);
            de1Var = this.C.g;
            ljVar = this.N.C;
        } else if (i11 != 3) {
            return;
        } else {
            ak0Var.e(this.C.g, this.E.g, 0, 8);
            ak0Var.e(this.C.g, this.N.C.g, 0, 4);
            de1Var = this.C.g;
            ljVar = this.N.E;
        }
        ak0Var.e(de1Var, ljVar.g, 0, 0);
    }

    @Override // com.daaw.qj
    public boolean g() {
        return true;
    }

    @Override // com.daaw.qj
    public String toString() {
        String str = "[Barrier] " + p() + " {";
        for (int i = 0; i < this.x0; i++) {
            qj qjVar = this.w0[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + qjVar.p();
        }
        return str + "}";
    }
}
