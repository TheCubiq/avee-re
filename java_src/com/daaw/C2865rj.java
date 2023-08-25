package com.daaw;

import com.daaw.C1387gb;
import com.daaw.C2716qj;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
/* renamed from: com.daaw.rj */
/* loaded from: classes.dex */
public class C2865rj extends jx1 {

    /* renamed from: C0 */
    public int f25363C0;

    /* renamed from: D0 */
    public int f25364D0;

    /* renamed from: E0 */
    public int f25365E0;

    /* renamed from: F0 */
    public int f25366F0;

    /* renamed from: x0 */
    public C1387gb f25381x0 = new C1387gb(this);

    /* renamed from: y0 */
    public C1218et f25382y0 = new C1218et(this);

    /* renamed from: z0 */
    public C1387gb.InterfaceC1389b f25383z0 = null;

    /* renamed from: A0 */
    public boolean f25361A0 = false;

    /* renamed from: B0 */
    public ak0 f25362B0 = new ak0();

    /* renamed from: G0 */
    public int f25367G0 = 0;

    /* renamed from: H0 */
    public int f25368H0 = 0;

    /* renamed from: I0 */
    public C2854re[] f25369I0 = new C2854re[4];

    /* renamed from: J0 */
    public C2854re[] f25370J0 = new C2854re[4];

    /* renamed from: K0 */
    public boolean f25371K0 = false;

    /* renamed from: L0 */
    public boolean f25372L0 = false;

    /* renamed from: M0 */
    public boolean f25373M0 = false;

    /* renamed from: N0 */
    public int f25374N0 = 0;

    /* renamed from: O0 */
    public int f25375O0 = 0;

    /* renamed from: P0 */
    public int f25376P0 = 263;

    /* renamed from: Q0 */
    public boolean f25377Q0 = false;

    /* renamed from: R0 */
    public boolean f25378R0 = false;

    /* renamed from: S0 */
    public boolean f25379S0 = false;

    /* renamed from: T0 */
    public int f25380T0 = 0;

    @Override // com.daaw.C2716qj
    /* renamed from: F0 */
    public void mo11274F0(boolean z, boolean z2) {
        super.mo11274F0(z, z2);
        int size = this.f15492w0.size();
        for (int i = 0; i < size; i++) {
            this.f15492w0.get(i).mo11274F0(z, z2);
        }
    }

    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [boolean] */
    @Override // com.daaw.jx1
    /* renamed from: H0 */
    public void mo11273H0() {
        boolean z;
        ?? r11;
        boolean z2;
        this.f24007S = 0;
        this.f24008T = 0;
        int max = Math.max(0, m12450N());
        int max2 = Math.max(0, m12403t());
        this.f25378R0 = false;
        this.f25379S0 = false;
        boolean z3 = m11256Z0(64) || m11256Z0(128);
        ak0 ak0Var = this.f25362B0;
        ak0Var.f3254g = false;
        ak0Var.f3255h = false;
        if (this.f25376P0 != 0 && z3) {
            ak0Var.f3255h = true;
        }
        C2716qj.EnumC2718b[] enumC2718bArr = this.f24001M;
        C2716qj.EnumC2718b enumC2718b = enumC2718bArr[1];
        C2716qj.EnumC2718b enumC2718b2 = enumC2718bArr[0];
        ArrayList<C2716qj> arrayList = this.f15492w0;
        C2716qj.EnumC2718b m12397w = m12397w();
        C2716qj.EnumC2718b enumC2718b3 = C2716qj.EnumC2718b.WRAP_CONTENT;
        boolean z4 = m12397w == enumC2718b3 || m12453K() == enumC2718b3;
        m11255a1();
        int size = this.f15492w0.size();
        for (int i = 0; i < size; i++) {
            C2716qj c2716qj = this.f15492w0.get(i);
            if (c2716qj instanceof jx1) {
                ((jx1) c2716qj).mo11273H0();
            }
        }
        int i2 = 0;
        boolean z5 = true;
        boolean z6 = false;
        while (z5) {
            int i3 = i2 + 1;
            try {
                this.f25362B0.m27421D();
                m11255a1();
                m12423j(this.f25362B0);
                for (int i4 = 0; i4 < size; i4++) {
                    this.f15492w0.get(i4).m12423j(this.f25362B0);
                }
                z5 = m11271L0(this.f25362B0);
                if (z5) {
                    this.f25362B0.m27395z();
                }
            } catch (Exception e) {
                e.printStackTrace();
                PrintStream printStream = System.out;
                printStream.println("EXCEPTION : " + e);
            }
            ak0 ak0Var2 = this.f25362B0;
            if (z5) {
                m11251e1(ak0Var2, su0.f26648a);
            } else {
                mo12457G0(ak0Var2);
                for (int i5 = 0; i5 < size; i5++) {
                    this.f15492w0.get(i5).mo12457G0(this.f25362B0);
                }
            }
            if (z4 && i3 < 8 && su0.f26648a[2]) {
                int i6 = 0;
                int i7 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    C2716qj c2716qj2 = this.f15492w0.get(i8);
                    i6 = Math.max(i6, c2716qj2.f24007S + c2716qj2.m12450N());
                    i7 = Math.max(i7, c2716qj2.f24008T + c2716qj2.m12403t());
                }
                int max3 = Math.max(this.f24014Z, i6);
                int max4 = Math.max(this.f24016a0, i7);
                C2716qj.EnumC2718b enumC2718b4 = C2716qj.EnumC2718b.WRAP_CONTENT;
                if (enumC2718b2 != enumC2718b4 || m12450N() >= max3) {
                    z = false;
                } else {
                    m12466B0(max3);
                    this.f24001M[0] = enumC2718b4;
                    z = true;
                    z6 = true;
                }
                if (enumC2718b == enumC2718b4 && m12403t() < max4) {
                    m12432e0(max4);
                    this.f24001M[1] = enumC2718b4;
                    z = true;
                    z6 = true;
                }
            } else {
                z = false;
            }
            int max5 = Math.max(this.f24014Z, m12450N());
            if (max5 > m12450N()) {
                m12466B0(max5);
                this.f24001M[0] = C2716qj.EnumC2718b.FIXED;
                z = true;
                z6 = true;
            }
            int max6 = Math.max(this.f24016a0, m12403t());
            if (max6 > m12403t()) {
                m12432e0(max6);
                r11 = 1;
                this.f24001M[1] = C2716qj.EnumC2718b.FIXED;
                z = true;
                z2 = true;
            } else {
                r11 = 1;
                z2 = z6;
            }
            if (!z2) {
                C2716qj.EnumC2718b enumC2718b5 = this.f24001M[0];
                C2716qj.EnumC2718b enumC2718b6 = C2716qj.EnumC2718b.WRAP_CONTENT;
                if (enumC2718b5 == enumC2718b6 && max > 0 && m12450N() > max) {
                    this.f25378R0 = r11;
                    this.f24001M[0] = C2716qj.EnumC2718b.FIXED;
                    m12466B0(max);
                    z = true;
                    z2 = true;
                }
                if (this.f24001M[r11] == enumC2718b6 && max2 > 0 && m12403t() > max2) {
                    this.f25379S0 = r11;
                    this.f24001M[r11] = C2716qj.EnumC2718b.FIXED;
                    m12432e0(max2);
                    z5 = true;
                    z6 = true;
                    i2 = i3;
                }
            }
            z5 = z;
            z6 = z2;
            i2 = i3;
        }
        this.f15492w0 = arrayList;
        if (z6) {
            C2716qj.EnumC2718b[] enumC2718bArr2 = this.f24001M;
            enumC2718bArr2[0] = enumC2718b2;
            enumC2718bArr2[1] = enumC2718b;
        }
        mo12441X(this.f25362B0.m27399v());
    }

    /* renamed from: K0 */
    public void m11272K0(C2716qj c2716qj, int i) {
        if (i == 0) {
            m11270M0(c2716qj);
        } else if (i == 1) {
            m11269N0(c2716qj);
        }
    }

    /* renamed from: L0 */
    public boolean m11271L0(ak0 ak0Var) {
        mo12431f(ak0Var);
        int size = this.f15492w0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C2716qj c2716qj = this.f15492w0.get(i);
            c2716qj.m12418l0(0, false);
            c2716qj.m12418l0(1, false);
            if (c2716qj instanceof C1815ja) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C2716qj c2716qj2 = this.f15492w0.get(i2);
                if (c2716qj2 instanceof C1815ja) {
                    ((C1815ja) c2716qj2).m18696K0();
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            C2716qj c2716qj3 = this.f15492w0.get(i3);
            if (c2716qj3.m12433e()) {
                c2716qj3.mo12431f(ak0Var);
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            C2716qj c2716qj4 = this.f15492w0.get(i4);
            if (c2716qj4 instanceof C2865rj) {
                C2716qj.EnumC2718b[] enumC2718bArr = c2716qj4.f24001M;
                C2716qj.EnumC2718b enumC2718b = enumC2718bArr[0];
                C2716qj.EnumC2718b enumC2718b2 = enumC2718bArr[1];
                C2716qj.EnumC2718b enumC2718b3 = C2716qj.EnumC2718b.WRAP_CONTENT;
                if (enumC2718b == enumC2718b3) {
                    c2716qj4.m12424i0(C2716qj.EnumC2718b.FIXED);
                }
                if (enumC2718b2 == enumC2718b3) {
                    c2716qj4.m12394x0(C2716qj.EnumC2718b.FIXED);
                }
                c2716qj4.mo12431f(ak0Var);
                if (enumC2718b == enumC2718b3) {
                    c2716qj4.m12424i0(enumC2718b);
                }
                if (enumC2718b2 == enumC2718b3) {
                    c2716qj4.m12394x0(enumC2718b2);
                }
            } else {
                su0.m9852a(this, ak0Var, c2716qj4);
                if (!c2716qj4.m12433e()) {
                    c2716qj4.mo12431f(ak0Var);
                }
            }
        }
        if (this.f25367G0 > 0) {
            C2706qe.m12603a(this, ak0Var, 0);
        }
        if (this.f25368H0 > 0) {
            C2706qe.m12603a(this, ak0Var, 1);
        }
        return true;
    }

    /* renamed from: M0 */
    public final void m11270M0(C2716qj c2716qj) {
        int i = this.f25367G0 + 1;
        C2854re[] c2854reArr = this.f25370J0;
        if (i >= c2854reArr.length) {
            this.f25370J0 = (C2854re[]) Arrays.copyOf(c2854reArr, c2854reArr.length * 2);
        }
        this.f25370J0[this.f25367G0] = new C2854re(c2716qj, 0, m11259W0());
        this.f25367G0++;
    }

    /* renamed from: N0 */
    public final void m11269N0(C2716qj c2716qj) {
        int i = this.f25368H0 + 1;
        C2854re[] c2854reArr = this.f25369I0;
        if (i >= c2854reArr.length) {
            this.f25369I0 = (C2854re[]) Arrays.copyOf(c2854reArr, c2854reArr.length * 2);
        }
        this.f25369I0[this.f25368H0] = new C2854re(c2716qj, 1, m11259W0());
        this.f25368H0++;
    }

    /* renamed from: O0 */
    public boolean m11268O0(boolean z) {
        return this.f25382y0.m23217f(z);
    }

    /* renamed from: P0 */
    public boolean m11267P0(boolean z) {
        return this.f25382y0.m23216g(z);
    }

    /* renamed from: Q0 */
    public boolean m11266Q0(boolean z, int i) {
        return this.f25382y0.m23215h(z, i);
    }

    /* renamed from: R0 */
    public C1387gb.InterfaceC1389b m11265R0() {
        return this.f25383z0;
    }

    /* renamed from: S0 */
    public int m11264S0() {
        return this.f25376P0;
    }

    /* renamed from: T0 */
    public void m11263T0() {
        this.f25382y0.m23213j();
    }

    /* renamed from: U0 */
    public void m11262U0() {
        this.f25382y0.m23212k();
    }

    /* renamed from: V0 */
    public boolean m11261V0() {
        return this.f25379S0;
    }

    @Override // com.daaw.jx1, com.daaw.C2716qj
    /* renamed from: W */
    public void mo11260W() {
        this.f25362B0.m27421D();
        this.f25363C0 = 0;
        this.f25365E0 = 0;
        this.f25364D0 = 0;
        this.f25366F0 = 0;
        this.f25377Q0 = false;
        super.mo11260W();
    }

    /* renamed from: W0 */
    public boolean m11259W0() {
        return this.f25361A0;
    }

    /* renamed from: X0 */
    public boolean m11258X0() {
        return this.f25378R0;
    }

    /* renamed from: Y0 */
    public long m11257Y0(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f25363C0 = i8;
        this.f25364D0 = i9;
        return this.f25381x0.m21831d(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }

    /* renamed from: Z0 */
    public boolean m11256Z0(int i) {
        return (this.f25376P0 & i) == i;
    }

    /* renamed from: a1 */
    public final void m11255a1() {
        this.f25367G0 = 0;
        this.f25368H0 = 0;
    }

    /* renamed from: b1 */
    public void m11254b1(C1387gb.InterfaceC1389b interfaceC1389b) {
        this.f25383z0 = interfaceC1389b;
        this.f25382y0.m23209n(interfaceC1389b);
    }

    /* renamed from: c1 */
    public void m11253c1(int i) {
        this.f25376P0 = i;
        ak0.f3245r = su0.m9851b(i, 256);
    }

    /* renamed from: d1 */
    public void m11252d1(boolean z) {
        this.f25361A0 = z;
    }

    /* renamed from: e1 */
    public void m11251e1(ak0 ak0Var, boolean[] zArr) {
        zArr[2] = false;
        mo12457G0(ak0Var);
        int size = this.f15492w0.size();
        for (int i = 0; i < size; i++) {
            this.f15492w0.get(i).mo12457G0(ak0Var);
        }
    }

    /* renamed from: f1 */
    public void m11250f1() {
        this.f25381x0.m21830e(this);
    }
}
