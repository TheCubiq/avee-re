package com.daaw;

import com.daaw.C2716qj;
/* renamed from: com.daaw.ja */
/* loaded from: classes.dex */
public class C1815ja extends bb0 {

    /* renamed from: y0 */
    public int f14570y0 = 0;

    /* renamed from: z0 */
    public boolean f14571z0 = true;

    /* renamed from: A0 */
    public int f14569A0 = 0;

    /* renamed from: H0 */
    public boolean m18699H0() {
        return this.f14571z0;
    }

    /* renamed from: I0 */
    public int m18698I0() {
        return this.f14570y0;
    }

    /* renamed from: J0 */
    public int m18697J0() {
        return this.f14569A0;
    }

    /* renamed from: K0 */
    public void m18696K0() {
        for (int i = 0; i < this.f4591x0; i++) {
            C2716qj c2716qj = this.f4590w0[i];
            int i2 = this.f14570y0;
            if (i2 == 0 || i2 == 1) {
                c2716qj.m12418l0(0, true);
            } else if (i2 == 2 || i2 == 3) {
                c2716qj.m12418l0(1, true);
            }
        }
    }

    /* renamed from: L0 */
    public void m18695L0(boolean z) {
        this.f14571z0 = z;
    }

    /* renamed from: M0 */
    public void m18694M0(int i) {
        this.f14570y0 = i;
    }

    /* renamed from: N0 */
    public void m18693N0(int i) {
        this.f14569A0 = i;
    }

    @Override // com.daaw.C2716qj
    /* renamed from: f */
    public void mo12431f(ak0 ak0Var) {
        Object[] objArr;
        boolean z;
        de1 de1Var;
        C2041lj c2041lj;
        int i;
        int i2;
        int i3;
        C2041lj[] c2041ljArr = this.f23998J;
        c2041ljArr[0] = this.f23990B;
        c2041ljArr[2] = this.f23991C;
        c2041ljArr[1] = this.f23992D;
        c2041ljArr[3] = this.f23993E;
        int i4 = 0;
        while (true) {
            objArr = this.f23998J;
            if (i4 >= objArr.length) {
                break;
            }
            objArr[i4].f17436g = ak0Var.m27404q(objArr[i4]);
            i4++;
        }
        int i5 = this.f14570y0;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        C2041lj c2041lj2 = objArr[i5];
        for (int i6 = 0; i6 < this.f4591x0; i6++) {
            C2716qj c2716qj = this.f4590w0[i6];
            if ((this.f14571z0 || c2716qj.mo12429g()) && ((((i2 = this.f14570y0) == 0 || i2 == 1) && c2716qj.m12397w() == C2716qj.EnumC2718b.MATCH_CONSTRAINT && c2716qj.f23990B.f17433d != null && c2716qj.f23992D.f17433d != null) || (((i3 = this.f14570y0) == 2 || i3 == 3) && c2716qj.m12453K() == C2716qj.EnumC2718b.MATCH_CONSTRAINT && c2716qj.f23991C.f17433d != null && c2716qj.f23993E.f17433d != null))) {
                z = true;
                break;
            }
        }
        z = false;
        boolean z2 = this.f23990B.m16924h() || this.f23992D.m16924h();
        boolean z3 = this.f23991C.m16924h() || this.f23993E.m16924h();
        int i7 = !z && (((i = this.f14570y0) == 0 && z2) || ((i == 2 && z3) || ((i == 1 && z2) || (i == 3 && z3)))) ? 5 : 4;
        for (int i8 = 0; i8 < this.f4591x0; i8++) {
            C2716qj c2716qj2 = this.f4590w0[i8];
            if (this.f14571z0 || c2716qj2.mo12429g()) {
                de1 m27404q = ak0Var.m27404q(c2716qj2.f23998J[this.f14570y0]);
                C2041lj[] c2041ljArr2 = c2716qj2.f23998J;
                int i9 = this.f14570y0;
                c2041ljArr2[i9].f17436g = m27404q;
                int i10 = (c2041ljArr2[i9].f17433d == null || c2041ljArr2[i9].f17433d.f17431b != this) ? 0 : c2041ljArr2[i9].f17434e + 0;
                if (i9 == 0 || i9 == 2) {
                    ak0Var.m27412i(c2041lj2.f17436g, m27404q, this.f14569A0 - i10, z);
                } else {
                    ak0Var.m27414g(c2041lj2.f17436g, m27404q, this.f14569A0 + i10, z);
                }
                ak0Var.m27416e(c2041lj2.f17436g, m27404q, this.f14569A0 + i10, i7);
            }
        }
        int i11 = this.f14570y0;
        if (i11 == 0) {
            ak0Var.m27416e(this.f23992D.f17436g, this.f23990B.f17436g, 0, 8);
            ak0Var.m27416e(this.f23990B.f17436g, this.f24002N.f23992D.f17436g, 0, 4);
            de1Var = this.f23990B.f17436g;
            c2041lj = this.f24002N.f23990B;
        } else if (i11 == 1) {
            ak0Var.m27416e(this.f23990B.f17436g, this.f23992D.f17436g, 0, 8);
            ak0Var.m27416e(this.f23990B.f17436g, this.f24002N.f23990B.f17436g, 0, 4);
            de1Var = this.f23990B.f17436g;
            c2041lj = this.f24002N.f23992D;
        } else if (i11 == 2) {
            ak0Var.m27416e(this.f23993E.f17436g, this.f23991C.f17436g, 0, 8);
            ak0Var.m27416e(this.f23991C.f17436g, this.f24002N.f23993E.f17436g, 0, 4);
            de1Var = this.f23991C.f17436g;
            c2041lj = this.f24002N.f23991C;
        } else if (i11 != 3) {
            return;
        } else {
            ak0Var.m27416e(this.f23991C.f17436g, this.f23993E.f17436g, 0, 8);
            ak0Var.m27416e(this.f23991C.f17436g, this.f24002N.f23991C.f17436g, 0, 4);
            de1Var = this.f23991C.f17436g;
            c2041lj = this.f24002N.f23993E;
        }
        ak0Var.m27416e(de1Var, c2041lj.f17436g, 0, 0);
    }

    @Override // com.daaw.C2716qj
    /* renamed from: g */
    public boolean mo12429g() {
        return true;
    }

    @Override // com.daaw.C2716qj
    public String toString() {
        String str = "[Barrier] " + m12411p() + " {";
        for (int i = 0; i < this.f4591x0; i++) {
            C2716qj c2716qj = this.f4590w0[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + c2716qj.m12411p();
        }
        return str + "}";
    }
}
