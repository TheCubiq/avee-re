package com.daaw;

import android.graphics.RectF;
import com.daaw.C3376vv;
import com.daaw.avee.R;
/* loaded from: classes.dex */
public class yv0 extends AbstractC3118tv {

    /* renamed from: r0 */
    public static final String[] f34112r0 = {"internalres:particle_blur01", "internalres:particle_circle_blur4", "internalres:particle_circle_w_a_64", "internalres:particle_sharp", "composition:0"};

    /* renamed from: s0 */
    public static final String[] f34113s0 = {"internalres:particle_blur01", "internalres:particle_circle_blur4", "internalres:particle_circle_w_a_64", "internalres:particle_sharp", "internalres:snowflake", "internalres:year2018", "composition:0"};

    /* renamed from: G */
    public int f34114G;

    /* renamed from: H */
    public zd0[] f34115H;

    /* renamed from: I */
    public float f34116I;

    /* renamed from: J */
    public pc0 f34117J;

    /* renamed from: K */
    public float f34118K;

    /* renamed from: L */
    public ae0 f34119L;

    /* renamed from: M */
    public int f34120M;

    /* renamed from: N */
    public float f34121N;

    /* renamed from: O */
    public float f34122O;

    /* renamed from: P */
    public xn0 f34123P;

    /* renamed from: Q */
    public xn0 f34124Q;

    /* renamed from: R */
    public boolean f34125R;

    /* renamed from: S */
    public boolean f34126S;

    /* renamed from: T */
    public qd0 f34127T;

    /* renamed from: U */
    public float f34128U;

    /* renamed from: V */
    public float f34129V;

    /* renamed from: W */
    public C3812z6 f34130W;

    /* renamed from: X */
    public ds1 f34131X;

    /* renamed from: Y */
    public ds1 f34132Y;

    /* renamed from: Z */
    public bs1 f34133Z;

    /* renamed from: a0 */
    public bs1 f34134a0;

    /* renamed from: b0 */
    public bs1 f34135b0;

    /* renamed from: c0 */
    public bs1 f34136c0;

    /* renamed from: d0 */
    public bs1 f34137d0;

    /* renamed from: e0 */
    public float[] f34138e0;

    /* renamed from: f0 */
    public final float[] f34139f0;

    /* renamed from: g0 */
    public float f34140g0;

    /* renamed from: h0 */
    public float f34141h0;

    /* renamed from: i0 */
    public final float f34142i0;

    /* renamed from: j0 */
    public C3376vv f34143j0;

    /* renamed from: k0 */
    public final pr1 f34144k0;

    /* renamed from: l0 */
    public float f34145l0;

    /* renamed from: m0 */
    public InterfaceC1348g0<y31, sr1, w31> f34146m0;

    /* renamed from: n0 */
    public t40<Integer, float[], float[], Boolean> f34147n0;

    /* renamed from: o0 */
    public t40<Integer, float[], int[], Boolean> f34148o0;

    /* renamed from: p0 */
    public t40<Integer, float[], int[], Boolean> f34149p0;

    /* renamed from: q0 */
    public t40<Integer, float[], int[], Boolean> f34150q0;

    /* renamed from: com.daaw.yv0$a */
    /* loaded from: classes.dex */
    public class C3748a implements C3376vv.InterfaceC3378b {
        public C3748a() {
        }

        @Override // com.daaw.C3376vv.InterfaceC3378b
        /* renamed from: a */
        public void mo2430a() {
            yv0.this.m8788m();
        }
    }

    /* renamed from: com.daaw.yv0$b */
    /* loaded from: classes.dex */
    public class C3749b implements InterfaceC1348g0<y31, sr1, w31> {
        public C3749b() {
        }

        @Override // com.daaw.InterfaceC1348g0
        /* renamed from: b */
        public void mo2428a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
            sr1Var.m9964E("u_projView", false, yv0.this.f34144k0.m13202a());
        }
    }

    /* renamed from: com.daaw.yv0$c */
    /* loaded from: classes.dex */
    public class C3750c implements t40<Integer, float[], int[], Boolean> {

        /* renamed from: a */
        public final /* synthetic */ RectF f34153a;

        /* renamed from: b */
        public final /* synthetic */ y31 f34154b;

        /* renamed from: c */
        public final /* synthetic */ float f34155c;

        /* renamed from: d */
        public final /* synthetic */ float f34156d;

        /* renamed from: e */
        public final /* synthetic */ float f34157e;

        /* renamed from: f */
        public final /* synthetic */ float f34158f;

        /* renamed from: g */
        public final /* synthetic */ bs1 f34159g;

        /* renamed from: h */
        public final /* synthetic */ float f34160h;

        public C3750c(RectF rectF, y31 y31Var, float f, float f2, float f3, float f4, bs1 bs1Var, float f5) {
            this.f34153a = rectF;
            this.f34154b = y31Var;
            this.f34155c = f;
            this.f34156d = f2;
            this.f34157e = f3;
            this.f34158f = f4;
            this.f34159g = bs1Var;
            this.f34160h = f5;
        }

        @Override // com.daaw.t40
        /* renamed from: a */
        public Boolean mo2575j(Integer num, float[] fArr, int[] iArr) {
            float f;
            if (yv0.this.f34115H[num.intValue()].mo2472e()) {
                if (yv0.this.f34127T != null) {
                    ds1 position = yv0.this.f34115H[num.intValue()].getPosition();
                    f = yv0.this.f34127T.mo12612p(position.f7696a - this.f34153a.centerX(), position.f7697b - this.f34153a.centerY(), yv0.this.f34135b0);
                } else {
                    f = 0.0f;
                }
                if (yv0.this.f34115H[num.intValue()].mo2473d(this.f34154b.m4225E(), this.f34155c, yv0.this.f34133Z, yv0.this.f34134a0, this.f34156d, this.f34157e, yv0.this.f34135b0, f, this.f34158f, this.f34159g, yv0.this.f34144k0, this.f34160h)) {
                    if (!this.f34154b.m4218L(yv0.this.f34133Z, Math.max(yv0.this.f34134a0.f5090a, yv0.this.f34134a0.f5091b))) {
                        yv0.this.f34115H[num.intValue()].setVisible(false);
                        return Boolean.FALSE;
                    }
                    yv0.this.f34115H[num.intValue()].setVisible(true);
                    yv0.this.f34115H[num.intValue()].mo2471f(this.f34154b.m4225E());
                    f80.m22870d(yv0.this.f34138e0, yv0.this.f34115H[num.intValue()].mo2476a(), yv0.this.f34139f0);
                    iArr[0] = f80.m22867g(yv0.this.f34138e0, 0);
                    ds1 position2 = yv0.this.f34115H[num.intValue()].getPosition();
                    yv0 yv0Var = yv0.this;
                    yv0Var.m3197k0(yv0Var.f34115H[num.intValue()], position2.f7696a, position2.f7697b, position2.f7698c, yv0.this.f34115H[num.intValue()].mo2470g(), fArr);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
            return Boolean.FALSE;
        }
    }

    /* renamed from: com.daaw.yv0$d */
    /* loaded from: classes.dex */
    public class C3751d implements t40<Integer, float[], float[], Boolean> {
        public C3751d() {
        }

        @Override // com.daaw.t40
        /* renamed from: a */
        public Boolean mo2575j(Integer num, float[] fArr, float[] fArr2) {
            return Boolean.FALSE;
        }
    }

    /* renamed from: com.daaw.yv0$e */
    /* loaded from: classes.dex */
    public class C3752e implements t40<Integer, float[], int[], Boolean> {
        public C3752e() {
        }

        @Override // com.daaw.t40
        /* renamed from: a */
        public Boolean mo2575j(Integer num, float[] fArr, int[] iArr) {
            ds1 position = yv0.this.f34115H[num.intValue()].getPosition();
            yv0 yv0Var = yv0.this;
            zd0 zd0Var = yv0Var.f34115H[num.intValue()];
            yv0 yv0Var2 = yv0.this;
            float f = yv0Var2.f34140g0;
            yv0Var.m3197k0(zd0Var, f + (f - position.f7696a), position.f7697b, position.f7698c, -yv0Var2.f34115H[num.intValue()].mo2470g(), fArr);
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.daaw.yv0$f */
    /* loaded from: classes.dex */
    public class C3753f implements t40<Integer, float[], int[], Boolean> {
        public C3753f() {
        }

        @Override // com.daaw.t40
        /* renamed from: a */
        public Boolean mo2575j(Integer num, float[] fArr, int[] iArr) {
            ds1 position = yv0.this.f34115H[num.intValue()].getPosition();
            yv0 yv0Var = yv0.this;
            zd0 zd0Var = yv0Var.f34115H[num.intValue()];
            float f = position.f7696a;
            yv0 yv0Var2 = yv0.this;
            float f2 = yv0Var2.f34141h0;
            yv0Var.m3197k0(zd0Var, f, f2 + (f2 - position.f7697b), position.f7698c, -yv0Var2.f34115H[num.intValue()].mo2470g(), fArr);
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.daaw.yv0$g */
    /* loaded from: classes.dex */
    public class C3754g implements t40<Integer, float[], int[], Boolean> {
        public C3754g() {
        }

        @Override // com.daaw.t40
        /* renamed from: a */
        public Boolean mo2575j(Integer num, float[] fArr, int[] iArr) {
            ds1 position = yv0.this.f34115H[num.intValue()].getPosition();
            yv0 yv0Var = yv0.this;
            zd0 zd0Var = yv0Var.f34115H[num.intValue()];
            yv0 yv0Var2 = yv0.this;
            float f = yv0Var2.f34140g0;
            float f2 = f + (f - position.f7696a);
            float f3 = yv0Var2.f34141h0;
            yv0Var.m3197k0(zd0Var, f2, f3 + (f3 - position.f7697b), position.f7698c, -yv0Var2.f34115H[num.intValue()].mo2470g(), fArr);
            return Boolean.TRUE;
        }
    }

    public yv0() {
        super(2, 0.5f, 0.5f);
        this.f34114G = 0;
        this.f34115H = new zd0[0];
        this.f34116I = 0.0f;
        this.f34117J = null;
        this.f34118K = 0.03f;
        this.f34119L = null;
        this.f34120M = -1;
        this.f34121N = 1.0f;
        this.f34122O = 1.0f;
        this.f34123P = xn0.m4972a();
        this.f34124Q = xn0.m4972a();
        this.f34125R = false;
        this.f34126S = false;
        this.f34127T = null;
        this.f34128U = 0.0f;
        this.f34129V = 90.0f;
        this.f34130W = null;
        this.f34131X = new ds1(0.0f, 0.0f, 0.0f);
        this.f34132Y = new ds1(0.0f, 0.0f, 0.0f);
        this.f34133Z = new bs1(0.0f, 0.0f);
        this.f34134a0 = new bs1(0.0f, 0.0f);
        this.f34135b0 = new bs1(0.0f, 0.0f);
        this.f34136c0 = new bs1(0.0f, 0.0f);
        this.f34137d0 = new bs1(0.0f, 0.0f);
        this.f34138e0 = new float[4];
        this.f34139f0 = new float[4];
        this.f34142i0 = 6.2831855f;
        this.f34144k0 = new pr1();
        this.f34145l0 = 40.0f;
        this.f34146m0 = new C3749b();
        this.f34147n0 = new C3751d();
        this.f34148o0 = new C3752e();
        this.f34149p0 = new C3753f();
        this.f34150q0 = new C3754g();
        this.f34143j0 = new C3376vv(new C3748a(), null, null, null);
        String[] strArr = f34112r0;
        m3195m0(strArr[0]);
        m3209Y(new C1525hb());
        m8807J(2);
        m8800R(0.5f, 0.5f);
        m3190r0(1500);
        m3188t0(0.02f);
        m3196l0(new C3398w5().m6527r(1.0f));
        m8807J(2);
        m3194n0(new xn0("Beat", 1.5f));
        m3189s0(2.0f);
        m3195m0(strArr[1]);
        m3187u0(900.0f);
        m3186v0(150.0f);
        C1525hb m3198j0 = m3198j0();
        m3198j0.m20864y(0.5f);
        m3198j0.m20863z(0.25f);
        m3198j0.m20871r(-1);
        m3198j0.m20870s(-2139062144);
        m3198j0.m20865x(8.0f);
        m3198j0.m20867v(0.1f);
        m3198j0.m20874A(0.0f);
        m3198j0.m20866w(4.0f);
        m3198j0.m20869t(4.0f);
        m3198j0.m20868u(10.0f);
        m3198j0.m27787c(100.0f);
        m3198j0.m27786j(60.0f);
        m3198j0.m27785q(0.0f);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: B */
    public void mo2460B(y31 y31Var, e40 e40Var) {
        InterfaceC1348g0<y31, sr1, w31> interfaceC1348g0;
        float f;
        float f2;
        float f3;
        float mo27516b;
        bs1 bs1Var;
        bs1 bs1Var2;
        bs1 bs1Var3;
        RectF rectF;
        InterfaceC1348g0<y31, sr1, w31> interfaceC1348g02;
        super.mo2460B(y31Var, e40Var);
        this.f34143j0.m6746u(y31Var, e40Var);
        if (this.f34115H.length != this.f34114G) {
            return;
        }
        RectF m8787n = m8787n(y31Var.f33263u.f33286b);
        bs1 bs1Var4 = new bs1(0.0f, 0.0f);
        bs1 bs1Var5 = new bs1(0.0f, 0.0f);
        float f4 = this.f34128U;
        if (f4 > 1.0f) {
            InterfaceC1348g0<y31, sr1, w31> interfaceC1348g03 = this.f34146m0;
            y31Var.m4198s(this.f34144k0, bs1Var4, e40Var, this.f34129V, 0.01f, f4 - (-20.0f), -0.5f, -0.5f, -10.0f);
            f2 = m8787n.width() / bs1Var4.f5090a;
            f3 = m8787n.height() / bs1Var4.f5091b;
            interfaceC1348g0 = interfaceC1348g03;
            f = -f4;
        } else {
            interfaceC1348g0 = null;
            f = 0.0f;
            f2 = 1.0f;
            f3 = 1.0f;
        }
        this.f34116I += y31Var.m4225E();
        if (this.f34119L == null || this.f34117J == null) {
            return;
        }
        float max = Math.max(0.01f, this.f34118K);
        this.f34118K = max;
        float f5 = this.f34116I;
        this.f34116I = Math.min(max * f5 * 100.0f, f5);
        while (true) {
            float f6 = this.f34116I;
            float f7 = this.f34118K;
            if (f6 <= f7) {
                break;
            }
            this.f34116I = f6 - f7;
            int m3201g0 = m3201g0();
            if (m3201g0 < 0 || m3201g0 >= this.f34115H.length) {
                bs1Var2 = bs1Var5;
                bs1Var3 = bs1Var4;
                rectF = m8787n;
                interfaceC1348g02 = interfaceC1348g0;
            } else {
                this.f34117J.mo5526l(m8787n, this.f34131X, this.f34132Y, this.f34128U > 1.0f);
                if (this.f34128U > 1.0f) {
                    bs1Var2 = bs1Var5;
                    interfaceC1348g02 = interfaceC1348g0;
                    bs1Var3 = bs1Var4;
                    rectF = m8787n;
                    y31Var.m4197t(bs1Var5, f, e40Var, bs1Var4.f5090a / bs1Var4.f5091b, this.f34129V);
                    float width = (bs1Var2.f5090a * 2.0f) / rectF.width();
                    float height = (bs1Var2.f5091b * 2.0f) / rectF.height();
                    ds1 ds1Var = this.f34131X;
                    ds1Var.f7696a = ((ds1Var.f7696a - rectF.centerX()) * width * f2) + rectF.centerX();
                    ds1 ds1Var2 = this.f34131X;
                    ds1Var2.f7697b = ((ds1Var2.f7697b - rectF.centerY()) * height * f3) + rectF.centerY();
                } else {
                    bs1Var2 = bs1Var5;
                    bs1Var3 = bs1Var4;
                    rectF = m8787n;
                    interfaceC1348g02 = interfaceC1348g0;
                    this.f34132Y.f7698c = 0.0f;
                }
                ae0 ae0Var = this.f34119L;
                zd0 zd0Var = this.f34115H[m3201g0];
                ds1 ds1Var3 = this.f34131X;
                ae0Var.mo20873g(y31Var, zd0Var, new ds1(ds1Var3.f7696a, ds1Var3.f7697b, f), this.f34132Y);
            }
            bs1Var5 = bs1Var2;
            interfaceC1348g0 = interfaceC1348g02;
            m8787n = rectF;
            bs1Var4 = bs1Var3;
        }
        bs1 bs1Var6 = bs1Var4;
        RectF rectF2 = m8787n;
        InterfaceC1348g0<y31, sr1, w31> interfaceC1348g04 = interfaceC1348g0;
        qc0 m6754m = this.f34143j0.m6754m(y31Var);
        if (m6754m == null) {
            m6754m = y31Var.f33263u.mo4183c();
        }
        w31 w31Var = new w31(m8792f(), m6754m, y31Var.f33263u.m4166t(), interfaceC1348g04);
        if (this.f34128U > 1.0f) {
            mo27516b = this.f34119L.mo27516b();
            bs1Var = new bs1(bs1Var6.f5090a * 0.5f, bs1Var6.f5091b * 0.5f);
        } else {
            mo27516b = this.f34119L.mo27516b();
            bs1Var = null;
        }
        m3185w0(y31Var, e40Var, rectF2, mo27516b, w31Var, bs1Var);
    }

    /* renamed from: Y */
    public void m3209Y(ae0 ae0Var) {
        this.f34119L = ae0Var;
        mo2451l();
    }

    /* renamed from: g0 */
    public int m3201g0() {
        int i = 0;
        while (true) {
            zd0[] zd0VarArr = this.f34115H;
            if (i >= zd0VarArr.length || !zd0VarArr[i].mo2472e()) {
                break;
            }
            i++;
        }
        if (i < this.f34115H.length) {
            return i;
        }
        return -1;
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: h */
    public String mo2456h() {
        return "Particles";
    }

    /* renamed from: h0 */
    public float m3200h0() {
        return this.f34145l0;
    }

    /* renamed from: i0 */
    public int m3199i0() {
        return this.f34114G;
    }

    /* renamed from: j0 */
    public C1525hb m3198j0() {
        return (C1525hb) this.f34119L;
    }

    /* renamed from: k0 */
    public void m3197k0(zd0 zd0Var, float f, float f2, float f3, float f4, float[] fArr) {
        this.f34136c0.f5090a = -zd0Var.mo2475b();
        this.f34136c0.f5091b = -zd0Var.mo2474c();
        this.f34136c0.m25845r(f4);
        this.f34137d0.f5090a = zd0Var.mo2475b();
        this.f34137d0.f5091b = -zd0Var.mo2474c();
        this.f34137d0.m25845r(f4);
        bs1 bs1Var = this.f34136c0;
        float f5 = bs1Var.f5090a;
        fArr[0] = f + f5;
        float f6 = bs1Var.f5091b;
        fArr[1] = f2 + f6;
        bs1 bs1Var2 = this.f34137d0;
        float f7 = bs1Var2.f5090a;
        fArr[2] = f + f7;
        float f8 = bs1Var2.f5091b;
        fArr[3] = f2 + f8;
        fArr[4] = f - f7;
        fArr[5] = f2 - f8;
        fArr[6] = f - f5;
        fArr[7] = f2 - f6;
        fArr[8] = f3;
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: l */
    public void mo2451l() {
        super.mo2451l();
        C3376vv c3376vv = this.f34143j0;
        if (c3376vv != null) {
            c3376vv.m6751p();
        }
    }

    /* renamed from: l0 */
    public void m3196l0(pc0 pc0Var) {
        this.f34117J = pc0Var;
    }

    /* renamed from: m0 */
    public void m3195m0(String str) {
        this.f34143j0.m6768C(str);
    }

    /* renamed from: n0 */
    public void m3194n0(xn0 xn0Var) {
        this.f34124Q = xn0Var;
    }

    /* renamed from: o0 */
    public void m3193o0(boolean z) {
        this.f34126S = z;
    }

    /* renamed from: p0 */
    public void m3192p0(boolean z) {
        this.f34125R = z;
    }

    /* renamed from: q0 */
    public void m3191q0(float f) {
        this.f34145l0 = f;
    }

    /* renamed from: r0 */
    public void m3190r0(int i) {
        if (this.f34114G == i) {
            return;
        }
        this.f34114G = i;
        mo2451l();
    }

    /* renamed from: s0 */
    public void m3189s0(float f) {
        this.f34121N = f;
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: t */
    public void mo2442t(C3239un c3239un) {
        super.mo2442t(c3239un);
        m3195m0(c3239un.m7940w("customImage", f34112r0[0]));
        this.f34120M = c3239un.m7947r("color", -1);
        m3190r0(c3239un.m7947r("CountLimit", 1500));
        this.f34121N = c3239un.m7953o("particleScale", 2.0f);
        this.f34118K = c3239un.m7953o("spawnTime", 0.02f);
        m3193o0(c3239un.m7955n("mirrorX", false));
        m3192p0(c3239un.m7955n("mirrorY", false));
        m3187u0(c3239un.m7953o("perspectiveDepth", 900.0f));
        m3186v0(c3239un.m7953o("perspectiveFov", 150.0f));
        C3239un m7967h = c3239un.m7967h("SpawnArea");
        m3196l0(C2913s5.m10710a(m7967h.m8002C("Rectangle"), this.f34117J));
        pc0 pc0Var = this.f34117J;
        if (pc0Var != null) {
            pc0Var.mo2493a(m7967h);
        }
        this.f34124Q.m4960m(c3239un.m7967h("MeasureOverallSpeed"), "Beat", 1.5f);
        ae0 ae0Var = this.f34119L;
        if (ae0Var != null) {
            ae0Var.mo2493a(c3239un);
        }
        C3239un m7967h2 = c3239un.m7967h("ForceField");
        qd0 m23780a = e30.m23780a(m7967h2.m8002C("None"), this.f34127T);
        this.f34127T = m23780a;
        if (m23780a != null) {
            m23780a.mo2493a(m7967h2);
        }
        m3191q0(c3239un.m7953o("nearCameraFadeOutDistance", m3200h0()));
    }

    /* renamed from: t0 */
    public void m3188t0(float f) {
        this.f34118K = f;
    }

    /* renamed from: u0 */
    public void m3187u0(float f) {
        this.f34128U = f;
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: v */
    public boolean mo2439v(y31 y31Var) {
        super.mo2439v(y31Var);
        int length = this.f34115H.length;
        int i = this.f34114G;
        if (length != i) {
            if (this.f34119L != null) {
                this.f34115H = new zd0[i];
                int i2 = 0;
                while (true) {
                    zd0[] zd0VarArr = this.f34115H;
                    if (i2 >= zd0VarArr.length) {
                        break;
                    }
                    zd0VarArr[i2] = this.f34119L.mo20872h();
                    i2++;
                }
            } else {
                this.f34115H = new zd0[0];
            }
        }
        this.f34143j0.m6750q(y31Var, new RectF(0.0f, 0.0f, 256.0f, 256.0f), 0);
        return true;
    }

    /* renamed from: v0 */
    public void m3186v0(float f) {
        this.f34129V = f;
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: w */
    public void mo2437w(y31 y31Var, int i) {
        super.mo2437w(y31Var, i);
        this.f34143j0.m6749r(y31Var, i);
    }

    /* renamed from: w0 */
    public final void m3185w0(y31 y31Var, e40 e40Var, RectF rectF, float f, w31 w31Var, bs1 bs1Var) {
        float m4964i = this.f34121N + this.f34123P.m4964i(y31Var.f33263u.f33286b);
        float m4964i2 = this.f34122O + (this.f34124Q.m4964i(y31Var.f33263u.f33286b) * 5.0f);
        float m27220e = y31Var.mo2889b().mo4185a().m27220e(m4964i) * 0.001f;
        float m27220e2 = y31Var.mo2889b().mo4185a().m27220e(f) * 0.0013888889f;
        float m27220e3 = y31Var.mo2889b().mo4185a().m27220e(0.0013888889f);
        rectF.centerX();
        rectF.centerY();
        this.f34140g0 = rectF.centerX();
        this.f34141h0 = rectF.centerY();
        f80.m22860n(this.f34139f0, this.f34120M);
        float max = Math.max(1.0E-6f, this.f34145l0);
        AbstractC3044tc m4171o = y31Var.f33263u.m4171o();
        C3750c c3750c = new C3750c(rectF, y31Var, m27220e3, m27220e, m4964i2, m27220e2, bs1Var, max);
        boolean z = this.f34126S;
        t40<Integer, float[], int[], Boolean> t40Var = z ? this.f34148o0 : null;
        boolean z2 = this.f34125R;
        m4171o.m9359j(y31Var, c3750c, t40Var, z2 ? this.f34149p0 : null, (z && z2) ? this.f34150q0 : null, this.f34114G, 0.0f, new bs1(0.0f, 1.0f), new bs1(1.0f, 0.0f), w31Var);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: x */
    public void mo2436x(y31 y31Var) {
        super.mo2436x(y31Var);
        C3376vv c3376vv = this.f34143j0;
        if (c3376vv != null) {
            c3376vv.m6748s(y31Var);
        }
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: y */
    public void mo2435y(de0 de0Var, e40 e40Var, vc0 vc0Var) {
        super.mo2435y(de0Var, e40Var, vc0Var);
        this.f34143j0.m6747t(de0Var, e40Var, vc0Var);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: z */
    public void mo2434z(C3239un c3239un, od0 od0Var) {
        super.mo2434z(c3239un, od0Var);
        c3239un.m7950p0(m8790j(R.string.title_particles));
        od0Var.mo14380a(this.f34143j0.m6757j());
        c3239un.m7968g0("customImage", this.f34143j0.m6757j(), "appearance", c60.f5521m ? f34113s0 : f34112r0);
        c3239un.m7985T("color", this.f34120M, "1_overall");
        c3239un.m7982W("CountLimit", m3199i0(), "1_overall", 1, 5000);
        c3239un.m7990O("particleScale", this.f34121N, "appearance", 0.25f, 8.0f);
        c3239un.m7990O("spawnTime", this.f34118K, "behaviour", 0.005f, 0.05f);
        c3239un.m7993L("mirrorX", this.f34126S, "1_overall");
        c3239un.m7993L("mirrorY", this.f34125R, "1_overall");
        c3239un.m7990O("perspectiveDepth", this.f34128U, "1_overall", 0.0f, 1000.0f);
        c3239un.m7990O("perspectiveFov", this.f34129V, "1_overall", 30.0f, 180.0f);
        C3239un m7999F = c3239un.m7999F("SpawnArea", C2913s5.m10709b(this.f34117J), "1_overall", C2913s5.f25863a);
        pc0 pc0Var = this.f34117J;
        if (pc0Var != null) {
            pc0Var.mo2492o(m7999F);
        }
        C3239un m7999F2 = c3239un.m7999F("MeasureOverallSpeed", "", "behaviour", new String[0]);
        xn0 xn0Var = this.f34124Q;
        if (xn0Var != null) {
            xn0Var.m4955r(m7999F2);
        }
        ae0 ae0Var = this.f34119L;
        if (ae0Var != null) {
            ae0Var.mo2492o(c3239un);
        }
        C3239un m7999F3 = c3239un.m7999F("ForceField", e30.m23779b(this.f34127T), "1_overall", e30.f8073a);
        qd0 qd0Var = this.f34127T;
        if (qd0Var != null) {
            qd0Var.mo2492o(m7999F3);
        }
        c3239un.m7990O("nearCameraFadeOutDistance", m3200h0(), "appearance", 0.0f, 500.0f);
    }
}
