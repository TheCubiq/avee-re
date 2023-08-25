package com.daaw;

import com.daaw.gb;
import com.daaw.qj;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes.dex */
public class rj extends jx1 {
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public gb x0 = new gb(this);
    public et y0 = new et(this);
    public gb.b z0 = null;
    public boolean A0 = false;
    public ak0 B0 = new ak0();
    public int G0 = 0;
    public int H0 = 0;
    public re[] I0 = new re[4];
    public re[] J0 = new re[4];
    public boolean K0 = false;
    public boolean L0 = false;
    public boolean M0 = false;
    public int N0 = 0;
    public int O0 = 0;
    public int P0 = 263;
    public boolean Q0 = false;
    public boolean R0 = false;
    public boolean S0 = false;
    public int T0 = 0;

    @Override // com.daaw.qj
    public void F0(boolean z, boolean z2) {
        super.F0(z, z2);
        int size = this.w0.size();
        for (int i = 0; i < size; i++) {
            this.w0.get(i).F0(z, z2);
        }
    }

    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [boolean] */
    @Override // com.daaw.jx1
    public void H0() {
        boolean z;
        ?? r11;
        boolean z2;
        this.S = 0;
        this.T = 0;
        int max = Math.max(0, N());
        int max2 = Math.max(0, t());
        this.R0 = false;
        this.S0 = false;
        boolean z3 = Z0(64) || Z0(128);
        ak0 ak0Var = this.B0;
        ak0Var.g = false;
        ak0Var.h = false;
        if (this.P0 != 0 && z3) {
            ak0Var.h = true;
        }
        qj.b[] bVarArr = this.M;
        qj.b bVar = bVarArr[1];
        qj.b bVar2 = bVarArr[0];
        ArrayList<qj> arrayList = this.w0;
        qj.b w = w();
        qj.b bVar3 = qj.b.WRAP_CONTENT;
        boolean z4 = w == bVar3 || K() == bVar3;
        a1();
        int size = this.w0.size();
        for (int i = 0; i < size; i++) {
            qj qjVar = this.w0.get(i);
            if (qjVar instanceof jx1) {
                ((jx1) qjVar).H0();
            }
        }
        int i2 = 0;
        boolean z5 = true;
        boolean z6 = false;
        while (z5) {
            int i3 = i2 + 1;
            try {
                this.B0.D();
                a1();
                j(this.B0);
                for (int i4 = 0; i4 < size; i4++) {
                    this.w0.get(i4).j(this.B0);
                }
                z5 = L0(this.B0);
                if (z5) {
                    this.B0.z();
                }
            } catch (Exception e) {
                e.printStackTrace();
                PrintStream printStream = System.out;
                printStream.println("EXCEPTION : " + e);
            }
            ak0 ak0Var2 = this.B0;
            if (z5) {
                e1(ak0Var2, su0.a);
            } else {
                G0(ak0Var2);
                for (int i5 = 0; i5 < size; i5++) {
                    this.w0.get(i5).G0(this.B0);
                }
            }
            if (z4 && i3 < 8 && su0.a[2]) {
                int i6 = 0;
                int i7 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    qj qjVar2 = this.w0.get(i8);
                    i6 = Math.max(i6, qjVar2.S + qjVar2.N());
                    i7 = Math.max(i7, qjVar2.T + qjVar2.t());
                }
                int max3 = Math.max(this.Z, i6);
                int max4 = Math.max(this.a0, i7);
                qj.b bVar4 = qj.b.WRAP_CONTENT;
                if (bVar2 != bVar4 || N() >= max3) {
                    z = false;
                } else {
                    B0(max3);
                    this.M[0] = bVar4;
                    z = true;
                    z6 = true;
                }
                if (bVar == bVar4 && t() < max4) {
                    e0(max4);
                    this.M[1] = bVar4;
                    z = true;
                    z6 = true;
                }
            } else {
                z = false;
            }
            int max5 = Math.max(this.Z, N());
            if (max5 > N()) {
                B0(max5);
                this.M[0] = qj.b.FIXED;
                z = true;
                z6 = true;
            }
            int max6 = Math.max(this.a0, t());
            if (max6 > t()) {
                e0(max6);
                r11 = 1;
                this.M[1] = qj.b.FIXED;
                z = true;
                z2 = true;
            } else {
                r11 = 1;
                z2 = z6;
            }
            if (!z2) {
                qj.b bVar5 = this.M[0];
                qj.b bVar6 = qj.b.WRAP_CONTENT;
                if (bVar5 == bVar6 && max > 0 && N() > max) {
                    this.R0 = r11;
                    this.M[0] = qj.b.FIXED;
                    B0(max);
                    z = true;
                    z2 = true;
                }
                if (this.M[r11] == bVar6 && max2 > 0 && t() > max2) {
                    this.S0 = r11;
                    this.M[r11] = qj.b.FIXED;
                    e0(max2);
                    z5 = true;
                    z6 = true;
                    i2 = i3;
                }
            }
            z5 = z;
            z6 = z2;
            i2 = i3;
        }
        this.w0 = arrayList;
        if (z6) {
            qj.b[] bVarArr2 = this.M;
            bVarArr2[0] = bVar2;
            bVarArr2[1] = bVar;
        }
        X(this.B0.v());
    }

    public void K0(qj qjVar, int i) {
        if (i == 0) {
            M0(qjVar);
        } else if (i == 1) {
            N0(qjVar);
        }
    }

    public boolean L0(ak0 ak0Var) {
        f(ak0Var);
        int size = this.w0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            qj qjVar = this.w0.get(i);
            qjVar.l0(0, false);
            qjVar.l0(1, false);
            if (qjVar instanceof ja) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                qj qjVar2 = this.w0.get(i2);
                if (qjVar2 instanceof ja) {
                    ((ja) qjVar2).K0();
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            qj qjVar3 = this.w0.get(i3);
            if (qjVar3.e()) {
                qjVar3.f(ak0Var);
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            qj qjVar4 = this.w0.get(i4);
            if (qjVar4 instanceof rj) {
                qj.b[] bVarArr = qjVar4.M;
                qj.b bVar = bVarArr[0];
                qj.b bVar2 = bVarArr[1];
                qj.b bVar3 = qj.b.WRAP_CONTENT;
                if (bVar == bVar3) {
                    qjVar4.i0(qj.b.FIXED);
                }
                if (bVar2 == bVar3) {
                    qjVar4.x0(qj.b.FIXED);
                }
                qjVar4.f(ak0Var);
                if (bVar == bVar3) {
                    qjVar4.i0(bVar);
                }
                if (bVar2 == bVar3) {
                    qjVar4.x0(bVar2);
                }
            } else {
                su0.a(this, ak0Var, qjVar4);
                if (!qjVar4.e()) {
                    qjVar4.f(ak0Var);
                }
            }
        }
        if (this.G0 > 0) {
            qe.a(this, ak0Var, 0);
        }
        if (this.H0 > 0) {
            qe.a(this, ak0Var, 1);
        }
        return true;
    }

    public final void M0(qj qjVar) {
        int i = this.G0 + 1;
        re[] reVarArr = this.J0;
        if (i >= reVarArr.length) {
            this.J0 = (re[]) Arrays.copyOf(reVarArr, reVarArr.length * 2);
        }
        this.J0[this.G0] = new re(qjVar, 0, W0());
        this.G0++;
    }

    public final void N0(qj qjVar) {
        int i = this.H0 + 1;
        re[] reVarArr = this.I0;
        if (i >= reVarArr.length) {
            this.I0 = (re[]) Arrays.copyOf(reVarArr, reVarArr.length * 2);
        }
        this.I0[this.H0] = new re(qjVar, 1, W0());
        this.H0++;
    }

    public boolean O0(boolean z) {
        return this.y0.f(z);
    }

    public boolean P0(boolean z) {
        return this.y0.g(z);
    }

    public boolean Q0(boolean z, int i) {
        return this.y0.h(z, i);
    }

    public gb.b R0() {
        return this.z0;
    }

    public int S0() {
        return this.P0;
    }

    public void T0() {
        this.y0.j();
    }

    public void U0() {
        this.y0.k();
    }

    public boolean V0() {
        return this.S0;
    }

    @Override // com.daaw.jx1, com.daaw.qj
    public void W() {
        this.B0.D();
        this.C0 = 0;
        this.E0 = 0;
        this.D0 = 0;
        this.F0 = 0;
        this.Q0 = false;
        super.W();
    }

    public boolean W0() {
        return this.A0;
    }

    public boolean X0() {
        return this.R0;
    }

    public long Y0(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.C0 = i8;
        this.D0 = i9;
        return this.x0.d(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }

    public boolean Z0(int i) {
        return (this.P0 & i) == i;
    }

    public final void a1() {
        this.G0 = 0;
        this.H0 = 0;
    }

    public void b1(gb.b bVar) {
        this.z0 = bVar;
        this.y0.n(bVar);
    }

    public void c1(int i) {
        this.P0 = i;
        ak0.r = su0.b(i, 256);
    }

    public void d1(boolean z) {
        this.A0 = z;
    }

    public void e1(ak0 ak0Var, boolean[] zArr) {
        zArr[2] = false;
        G0(ak0Var);
        int size = this.w0.size();
        for (int i = 0; i < size; i++) {
            this.w0.get(i).G0(ak0Var);
        }
    }

    public void f1() {
        this.x0.e(this);
    }
}
