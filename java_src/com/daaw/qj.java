package com.daaw;

import com.daaw.lj;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class qj {
    public static float v0 = 0.5f;
    public lj I;
    public lj[] J;
    public ArrayList<lj> K;
    public boolean[] L;
    public b[] M;
    public qj N;
    public int O;
    public int P;
    public float Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public float b0;
    public se c;
    public float c0;
    public se d;
    public Object d0;
    public int e0;
    public int f0;
    public String g0;
    public String h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public int m0;
    public int n0;
    public boolean o0;
    public boolean p0;
    public float[] q0;
    public qj[] r0;
    public qj[] s0;
    public qj t0;
    public qj u0;
    public boolean z;
    public boolean a = false;
    public kx1[] b = new kx1[2];
    public sb0 e = new sb0(this);
    public ms1 f = new ms1(this);
    public boolean[] g = {true, true};
    public int[] h = {0, 0, 0, 0};
    public boolean i = false;
    public int j = -1;
    public int k = -1;
    public int l = 0;
    public int m = 0;
    public int[] n = new int[2];
    public int o = 0;
    public int p = 0;
    public float q = 1.0f;
    public int r = 0;
    public int s = 0;
    public float t = 1.0f;
    public int u = -1;
    public float v = 1.0f;
    public int[] w = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float x = 0.0f;
    public boolean y = false;
    public boolean A = false;
    public lj B = new lj(this, lj.b.LEFT);
    public lj C = new lj(this, lj.b.TOP);
    public lj D = new lj(this, lj.b.RIGHT);
    public lj E = new lj(this, lj.b.BOTTOM);
    public lj F = new lj(this, lj.b.BASELINE);
    public lj G = new lj(this, lj.b.CENTER_X);
    public lj H = new lj(this, lj.b.CENTER_Y);

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[b.values().length];
            b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[lj.b.values().length];
            a = iArr2;
            try {
                iArr2[lj.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[lj.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[lj.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[lj.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[lj.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[lj.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[lj.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[lj.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[lj.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public qj() {
        lj ljVar = new lj(this, lj.b.CENTER);
        this.I = ljVar;
        this.J = new lj[]{this.B, this.D, this.C, this.E, this.F, ljVar};
        this.K = new ArrayList<>();
        this.L = new boolean[2];
        b bVar = b.FIXED;
        this.M = new b[]{bVar, bVar};
        this.N = null;
        this.O = 0;
        this.P = 0;
        this.Q = 0.0f;
        this.R = -1;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        float f = v0;
        this.b0 = f;
        this.c0 = f;
        this.e0 = 0;
        this.f0 = 0;
        this.g0 = null;
        this.h0 = null;
        this.k0 = false;
        this.l0 = false;
        this.m0 = 0;
        this.n0 = 0;
        this.q0 = new float[]{-1.0f, -1.0f};
        this.r0 = new qj[]{null, null};
        this.s0 = new qj[]{null, null};
        this.t0 = null;
        this.u0 = null;
        d();
    }

    public int A() {
        return this.w[0];
    }

    public void A0(int i) {
        this.f0 = i;
    }

    public int B() {
        return this.a0;
    }

    public void B0(int i) {
        this.O = i;
        int i2 = this.Z;
        if (i < i2) {
            this.O = i2;
        }
    }

    public int C() {
        return this.Z;
    }

    public void C0(int i) {
        this.S = i;
    }

    public qj D(int i) {
        lj ljVar;
        lj ljVar2;
        if (i != 0) {
            if (i == 1 && (ljVar2 = (ljVar = this.E).d) != null && ljVar2.d == ljVar) {
                return ljVar2.b;
            }
            return null;
        }
        lj ljVar3 = this.D;
        lj ljVar4 = ljVar3.d;
        if (ljVar4 == null || ljVar4.d != ljVar3) {
            return null;
        }
        return ljVar4.b;
    }

    public void D0(int i) {
        this.T = i;
    }

    public qj E() {
        return this.N;
    }

    public void E0(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.u == -1) {
            if (z3 && !z4) {
                this.u = 0;
            } else if (!z3 && z4) {
                this.u = 1;
                if (this.R == -1) {
                    this.v = 1.0f / this.v;
                }
            }
        }
        if (this.u == 0 && (!this.C.i() || !this.E.i())) {
            this.u = 1;
        } else if (this.u == 1 && (!this.B.i() || !this.D.i())) {
            this.u = 0;
        }
        if (this.u == -1 && (!this.C.i() || !this.E.i() || !this.B.i() || !this.D.i())) {
            if (this.C.i() && this.E.i()) {
                this.u = 0;
            } else if (this.B.i() && this.D.i()) {
                this.v = 1.0f / this.v;
                this.u = 1;
            }
        }
        if (this.u == -1) {
            int i = this.o;
            if (i > 0 && this.r == 0) {
                this.u = 0;
            } else if (i != 0 || this.r <= 0) {
            } else {
                this.v = 1.0f / this.v;
                this.u = 1;
            }
        }
    }

    public qj F(int i) {
        lj ljVar;
        lj ljVar2;
        if (i != 0) {
            if (i == 1 && (ljVar2 = (ljVar = this.C).d) != null && ljVar2.d == ljVar) {
                return ljVar2.b;
            }
            return null;
        }
        lj ljVar3 = this.B;
        lj ljVar4 = ljVar3.d;
        if (ljVar4 == null || ljVar4.d != ljVar3) {
            return null;
        }
        return ljVar4.b;
    }

    public void F0(boolean z, boolean z2) {
        int i;
        int i2;
        boolean k = z & this.e.k();
        boolean k2 = z2 & this.f.k();
        sb0 sb0Var = this.e;
        int i3 = sb0Var.h.g;
        ms1 ms1Var = this.f;
        int i4 = ms1Var.h.g;
        int i5 = sb0Var.i.g;
        int i6 = ms1Var.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i3 = 0;
            i6 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (k) {
            this.S = i3;
        }
        if (k2) {
            this.T = i4;
        }
        if (this.f0 == 8) {
            this.O = 0;
            this.P = 0;
            return;
        }
        if (k) {
            if (this.M[0] == b.FIXED && i8 < (i2 = this.O)) {
                i8 = i2;
            }
            this.O = i8;
            int i10 = this.Z;
            if (i8 < i10) {
                this.O = i10;
            }
        }
        if (k2) {
            if (this.M[1] == b.FIXED && i9 < (i = this.P)) {
                i9 = i;
            }
            this.P = i9;
            int i11 = this.a0;
            if (i9 < i11) {
                this.P = i11;
            }
        }
    }

    public int G() {
        return O() + this.O;
    }

    public void G0(ak0 ak0Var) {
        int x = ak0Var.x(this.B);
        int x2 = ak0Var.x(this.C);
        int x3 = ak0Var.x(this.D);
        int x4 = ak0Var.x(this.E);
        sb0 sb0Var = this.e;
        ft ftVar = sb0Var.h;
        if (ftVar.j) {
            ft ftVar2 = sb0Var.i;
            if (ftVar2.j) {
                x = ftVar.g;
                x3 = ftVar2.g;
            }
        }
        ms1 ms1Var = this.f;
        ft ftVar3 = ms1Var.h;
        if (ftVar3.j) {
            ft ftVar4 = ms1Var.i;
            if (ftVar4.j) {
                x2 = ftVar3.g;
                x4 = ftVar4.g;
            }
        }
        int i = x4 - x2;
        if (x3 - x < 0 || i < 0 || x == Integer.MIN_VALUE || x == Integer.MAX_VALUE || x2 == Integer.MIN_VALUE || x2 == Integer.MAX_VALUE || x3 == Integer.MIN_VALUE || x3 == Integer.MAX_VALUE || x4 == Integer.MIN_VALUE || x4 == Integer.MAX_VALUE) {
            x4 = 0;
            x = 0;
            x2 = 0;
            x3 = 0;
        }
        c0(x, x2, x3, x4);
    }

    public kx1 H(int i) {
        if (i == 0) {
            return this.e;
        }
        if (i == 1) {
            return this.f;
        }
        return null;
    }

    public float I() {
        return this.c0;
    }

    public int J() {
        return this.n0;
    }

    public b K() {
        return this.M[1];
    }

    public int L() {
        int i = this.B != null ? 0 + this.C.e : 0;
        return this.D != null ? i + this.E.e : i;
    }

    public int M() {
        return this.f0;
    }

    public int N() {
        if (this.f0 == 8) {
            return 0;
        }
        return this.O;
    }

    public int O() {
        qj qjVar = this.N;
        return (qjVar == null || !(qjVar instanceof rj)) ? this.S : ((rj) qjVar).C0 + this.S;
    }

    public int P() {
        qj qjVar = this.N;
        return (qjVar == null || !(qjVar instanceof rj)) ? this.T : ((rj) qjVar).D0 + this.T;
    }

    public boolean Q() {
        return this.y;
    }

    public void R(lj.b bVar, qj qjVar, lj.b bVar2, int i, int i2) {
        k(bVar).a(qjVar.k(bVar2), i, i2, true);
    }

    public final boolean S(int i) {
        int i2 = i * 2;
        lj[] ljVarArr = this.J;
        if (ljVarArr[i2].d != null && ljVarArr[i2].d.d != ljVarArr[i2]) {
            int i3 = i2 + 1;
            if (ljVarArr[i3].d != null && ljVarArr[i3].d.d == ljVarArr[i3]) {
                return true;
            }
        }
        return false;
    }

    public boolean T() {
        lj ljVar = this.B;
        lj ljVar2 = ljVar.d;
        if (ljVar2 == null || ljVar2.d != ljVar) {
            lj ljVar3 = this.D;
            lj ljVar4 = ljVar3.d;
            return ljVar4 != null && ljVar4.d == ljVar3;
        }
        return true;
    }

    public boolean U() {
        return this.z;
    }

    public boolean V() {
        lj ljVar = this.C;
        lj ljVar2 = ljVar.d;
        if (ljVar2 == null || ljVar2.d != ljVar) {
            lj ljVar3 = this.E;
            lj ljVar4 = ljVar3.d;
            return ljVar4 != null && ljVar4.d == ljVar3;
        }
        return true;
    }

    public void W() {
        this.B.k();
        this.C.k();
        this.D.k();
        this.E.k();
        this.F.k();
        this.G.k();
        this.H.k();
        this.I.k();
        this.N = null;
        this.x = 0.0f;
        this.O = 0;
        this.P = 0;
        this.Q = 0.0f;
        this.R = -1;
        this.S = 0;
        this.T = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        float f = v0;
        this.b0 = f;
        this.c0 = f;
        b[] bVarArr = this.M;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.d0 = null;
        this.e0 = 0;
        this.f0 = 0;
        this.h0 = null;
        this.i0 = false;
        this.j0 = false;
        this.m0 = 0;
        this.n0 = 0;
        this.o0 = false;
        this.p0 = false;
        float[] fArr = this.q0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.j = -1;
        this.k = -1;
        int[] iArr = this.w;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.l = 0;
        this.m = 0;
        this.q = 1.0f;
        this.t = 1.0f;
        this.p = Integer.MAX_VALUE;
        this.s = Integer.MAX_VALUE;
        this.o = 0;
        this.r = 0;
        this.i = false;
        this.u = -1;
        this.v = 1.0f;
        this.k0 = false;
        this.l0 = false;
        boolean[] zArr = this.g;
        zArr[0] = true;
        zArr[1] = true;
        this.A = false;
        boolean[] zArr2 = this.L;
        zArr2[0] = false;
        zArr2[1] = false;
    }

    public void X(gd gdVar) {
        this.B.l(gdVar);
        this.C.l(gdVar);
        this.D.l(gdVar);
        this.E.l(gdVar);
        this.F.l(gdVar);
        this.I.l(gdVar);
        this.G.l(gdVar);
        this.H.l(gdVar);
    }

    public void Y(int i) {
        this.Y = i;
        this.y = i > 0;
    }

    public void Z(Object obj) {
        this.d0 = obj;
    }

    public void a0(String str) {
        this.g0 = str;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:39:0x0085). Please submit an issue!!! */
    public void b0(String str) {
        float f;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.Q = 0.0f;
            return;
        }
        int i2 = -1;
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i3 = 0;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            if (substring.equalsIgnoreCase("W")) {
                i2 = 0;
            } else if (substring.equalsIgnoreCase("H")) {
                i2 = 1;
            }
            i3 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 < 0 || indexOf2 >= length - 1) {
            String substring2 = str.substring(i3);
            if (substring2.length() > 0) {
                f = Float.parseFloat(substring2);
            }
            f = 0.0f;
        } else {
            String substring3 = str.substring(i3, indexOf2);
            String substring4 = str.substring(indexOf2 + 1);
            if (substring3.length() > 0 && substring4.length() > 0) {
                float parseFloat = Float.parseFloat(substring3);
                float parseFloat2 = Float.parseFloat(substring4);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    f = i2 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                }
            }
            f = 0.0f;
        }
        i = (f > i ? 1 : (f == i ? 0 : -1));
        if (i > 0) {
            this.Q = f;
            this.R = i2;
        }
    }

    public void c0(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.S = i;
        this.T = i2;
        if (this.f0 == 8) {
            this.O = 0;
            this.P = 0;
            return;
        }
        b[] bVarArr = this.M;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i7 < (i6 = this.O)) {
            i7 = i6;
        }
        if (bVarArr[1] == bVar2 && i8 < (i5 = this.P)) {
            i8 = i5;
        }
        this.O = i7;
        this.P = i8;
        int i9 = this.a0;
        if (i8 < i9) {
            this.P = i9;
        }
        int i10 = this.Z;
        if (i7 < i10) {
            this.O = i10;
        }
    }

    public final void d() {
        this.K.add(this.B);
        this.K.add(this.C);
        this.K.add(this.D);
        this.K.add(this.E);
        this.K.add(this.G);
        this.K.add(this.H);
        this.K.add(this.I);
        this.K.add(this.F);
    }

    public void d0(boolean z) {
        this.y = z;
    }

    public boolean e() {
        return (this instanceof ru1) || (this instanceof k80);
    }

    public void e0(int i) {
        this.P = i;
        int i2 = this.a0;
        if (i < i2) {
            this.P = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0244 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:254:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(com.daaw.ak0 r48) {
        /*
            Method dump skipped, instructions count: 1256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.qj.f(com.daaw.ak0):void");
    }

    public void f0(float f) {
        this.b0 = f;
    }

    public boolean g() {
        return this.f0 != 8;
    }

    public void g0(int i) {
        this.m0 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:293:0x0433, code lost:
        if (r1[r22] == r4) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0313 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0403 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:303:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(com.daaw.ak0 r32, boolean r33, boolean r34, boolean r35, boolean r36, com.daaw.de1 r37, com.daaw.de1 r38, com.daaw.qj.b r39, boolean r40, com.daaw.lj r41, com.daaw.lj r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, int r52, int r53, int r54, int r55, float r56, boolean r57) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.qj.h(com.daaw.ak0, boolean, boolean, boolean, boolean, com.daaw.de1, com.daaw.de1, com.daaw.qj$b, boolean, com.daaw.lj, com.daaw.lj, int, int, int, int, float, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public void h0(int i, int i2) {
        this.S = i;
        int i3 = i2 - i;
        this.O = i3;
        int i4 = this.Z;
        if (i3 < i4) {
            this.O = i4;
        }
    }

    public void i(qj qjVar, float f, int i) {
        lj.b bVar = lj.b.CENTER;
        R(bVar, qjVar, bVar, i, 0);
        this.x = f;
    }

    public void i0(b bVar) {
        this.M[0] = bVar;
    }

    public void j(ak0 ak0Var) {
        ak0Var.q(this.B);
        ak0Var.q(this.C);
        ak0Var.q(this.D);
        ak0Var.q(this.E);
        if (this.Y > 0) {
            ak0Var.q(this.F);
        }
    }

    public void j0(int i, int i2, int i3, float f) {
        this.l = i;
        this.o = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.p = i3;
        this.q = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.l = 2;
    }

    public lj k(lj.b bVar) {
        switch (a.a[bVar.ordinal()]) {
            case 1:
                return this.B;
            case 2:
                return this.C;
            case 3:
                return this.D;
            case 4:
                return this.E;
            case 5:
                return this.F;
            case 6:
                return this.I;
            case 7:
                return this.G;
            case 8:
                return this.H;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public void k0(float f) {
        this.q0[0] = f;
    }

    public int l() {
        return this.Y;
    }

    public void l0(int i, boolean z) {
        this.L[i] = z;
    }

    public float m(int i) {
        if (i == 0) {
            return this.b0;
        }
        if (i == 1) {
            return this.c0;
        }
        return -1.0f;
    }

    public void m0(boolean z) {
        this.z = z;
    }

    public int n() {
        return P() + this.P;
    }

    public void n0(boolean z) {
        this.A = z;
    }

    public Object o() {
        return this.d0;
    }

    public void o0(int i) {
        this.w[1] = i;
    }

    public String p() {
        return this.g0;
    }

    public void p0(int i) {
        this.w[0] = i;
    }

    public b q(int i) {
        if (i == 0) {
            return w();
        }
        if (i == 1) {
            return K();
        }
        return null;
    }

    public void q0(int i) {
        if (i < 0) {
            i = 0;
        }
        this.a0 = i;
    }

    public float r() {
        return this.Q;
    }

    public void r0(int i) {
        if (i < 0) {
            i = 0;
        }
        this.Z = i;
    }

    public int s() {
        return this.R;
    }

    public void s0(int i, int i2) {
        this.S = i;
        this.T = i2;
    }

    public int t() {
        if (this.f0 == 8) {
            return 0;
        }
        return this.P;
    }

    public void t0(qj qjVar) {
        this.N = qjVar;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.h0 != null) {
            str = "type: " + this.h0 + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.g0 != null) {
            str2 = "id: " + this.g0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.S);
        sb.append(", ");
        sb.append(this.T);
        sb.append(") - (");
        sb.append(this.O);
        sb.append(" x ");
        sb.append(this.P);
        sb.append(")");
        return sb.toString();
    }

    public float u() {
        return this.b0;
    }

    public void u0(float f) {
        this.c0 = f;
    }

    public int v() {
        return this.m0;
    }

    public void v0(int i) {
        this.n0 = i;
    }

    public b w() {
        return this.M[0];
    }

    public void w0(int i, int i2) {
        this.T = i;
        int i3 = i2 - i;
        this.P = i3;
        int i4 = this.a0;
        if (i3 < i4) {
            this.P = i4;
        }
    }

    public int x() {
        lj ljVar = this.B;
        int i = ljVar != null ? 0 + ljVar.e : 0;
        lj ljVar2 = this.D;
        return ljVar2 != null ? i + ljVar2.e : i;
    }

    public void x0(b bVar) {
        this.M[1] = bVar;
    }

    public int y(int i) {
        if (i == 0) {
            return N();
        }
        if (i == 1) {
            return t();
        }
        return 0;
    }

    public void y0(int i, int i2, int i3, float f) {
        this.m = i;
        this.r = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.s = i3;
        this.t = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.m = 2;
    }

    public int z() {
        return this.w[1];
    }

    public void z0(float f) {
        this.q0[1] = f;
    }
}
