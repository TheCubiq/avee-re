package com.daaw;
/* loaded from: classes.dex */
public class wv0 implements zd0 {

    /* renamed from: v */
    public static boolean f31530v = true;

    /* renamed from: w */
    public static ds1 f31531w = new ds1(0.0f, 0.0f, 0.0f);

    /* renamed from: x */
    public static ds1 f31532x = new ds1(0.0f, 0.0f, 0.0f);

    /* renamed from: y */
    public static ds1 f31533y = new ds1(0.0f, 0.0f, 0.0f);

    /* renamed from: a */
    public long f31534a;

    /* renamed from: b */
    public float f31535b;

    /* renamed from: c */
    public int f31536c;

    /* renamed from: d */
    public float f31537d;

    /* renamed from: e */
    public float f31538e;

    /* renamed from: f */
    public float f31539f;

    /* renamed from: g */
    public float f31540g;

    /* renamed from: h */
    public boolean f31541h;

    /* renamed from: i */
    public boolean f31542i;

    /* renamed from: j */
    public C3812z6 f31543j;

    /* renamed from: p */
    public float f31549p;

    /* renamed from: u */
    public boolean f31554u;

    /* renamed from: k */
    public xv0[] f31544k = new xv0[0];

    /* renamed from: l */
    public ds1 f31545l = new ds1(0.0f, 0.0f, 0.0f);

    /* renamed from: m */
    public ds1 f31546m = new ds1(0.0f, 0.0f, 0.0f);

    /* renamed from: n */
    public bs1 f31547n = new bs1(0.0f, 0.0f);

    /* renamed from: o */
    public ds1 f31548o = new ds1(0.0f, 0.0f, 0.0f);

    /* renamed from: q */
    public float f31550q = 0.0f;

    /* renamed from: r */
    public boolean f31551r = false;

    /* renamed from: s */
    public boolean f31552s = false;

    /* renamed from: t */
    public xv0 f31553t = new xv0();

    public wv0() {
        this.f31554u = false;
        if (f31530v) {
            this.f31554u = true;
            f31530v = false;
        }
    }

    @Override // com.daaw.zd0
    /* renamed from: a */
    public float[] mo2476a() {
        return this.f31553t.m4493b();
    }

    @Override // com.daaw.zd0
    /* renamed from: b */
    public float mo2475b() {
        return this.f31549p;
    }

    @Override // com.daaw.zd0
    /* renamed from: c */
    public float mo2474c() {
        return this.f31553t.f32974c;
    }

    @Override // com.daaw.zd0
    /* renamed from: d */
    public boolean mo2473d(float f, float f2, bs1 bs1Var, bs1 bs1Var2, float f3, float f4, bs1 bs1Var3, float f5, float f6, bs1 bs1Var4, pr1 pr1Var, float f7) {
        xv0[] xv0VarArr;
        float m24012b;
        float f8;
        ds1 ds1Var;
        if (this.f31551r) {
            float f9 = this.f31538e + f;
            this.f31538e = f9;
            float f10 = f9 / this.f31540g;
            this.f31539f = f10;
            if (f10 > 1.0f || this.f31544k == null) {
                this.f31551r = false;
                return false;
            }
            float f11 = 0.0f;
            if (bs1Var4 != null) {
                this.f31539f = Math.max(this.f31539f, 1.0f - (Math.max((-this.f31548o.f7698c) - f7, 0.0f) / (10.0f * f7)));
            }
            int i = 0;
            while (true) {
                xv0VarArr = this.f31544k;
                if (i >= xv0VarArr.length || xv0VarArr[i].f32972a >= this.f31539f) {
                    break;
                }
                i++;
            }
            int i2 = i - 1;
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= xv0VarArr.length - 1) {
                i2 = xv0VarArr.length - 2;
            }
            int i3 = i2 + 1;
            int i4 = i2 >= 0 ? i2 : 0;
            float f12 = (this.f31539f - xv0VarArr[i4].f32972a) / (xv0VarArr[i3].f32972a - xv0VarArr[i4].f32972a);
            xv0.m4494a(this.f31553t, xv0VarArr[i4], xv0VarArr[i3], f12 <= 1.0f ? f12 : 1.0f);
            xv0 xv0Var = this.f31553t;
            xv0Var.f32973b *= f3;
            xv0Var.f32974c *= f3;
            ds1 ds1Var2 = this.f31545l;
            float f13 = ds1Var2.f7696a;
            ds1Var2.f7696a = f13 + ((f13 - bs1Var3.f5090a) * f5);
            float f14 = ds1Var2.f7697b;
            ds1Var2.f7697b = f14 + ((f14 - bs1Var3.f5091b) * f5);
            ds1Var2.f7698c += 0.0f;
            float f15 = xv0Var.f32978g;
            float sin = (float) Math.sin(f15 + (this.f31538e * f15));
            xv0 xv0Var2 = this.f31553t;
            float f16 = sin * xv0Var2.f32979h;
            float f17 = xv0Var2.f32978g;
            xv0 xv0Var3 = this.f31553t;
            float cos = ((float) Math.cos(f17 + (this.f31538e * f17))) * xv0Var3.f32979h;
            ds1 ds1Var3 = f31532x;
            ds1 ds1Var4 = this.f31545l;
            ds1Var3.f7696a = -ds1Var4.f7697b;
            ds1Var3.f7697b = ds1Var4.f7698c;
            ds1Var3.f7698c = ds1Var4.f7696a;
            ds1 ds1Var5 = f31533y;
            float f18 = -ds1Var4.f7698c;
            ds1Var5.f7696a = f18;
            float f19 = ds1Var4.f7696a;
            ds1Var5.f7697b = f19;
            float f20 = ds1Var4.f7697b;
            ds1Var5.f7698c = f20;
            if (bs1Var4 != null) {
                ds1 ds1Var6 = this.f31546m;
                ds1Var6.f7696a = (f18 * f16) + f19 + (ds1Var3.f7696a * cos);
                ds1Var6.f7697b = (f19 * f16) + f20 + (ds1Var3.f7697b * cos);
                ds1Var6.f7698c = ds1Var4.f7698c + (f20 * f16) + (ds1Var3.f7698c * cos);
            } else {
                ds1 ds1Var7 = this.f31546m;
                ds1Var7.f7696a = f19 + (f20 * f16);
                ds1Var7.f7697b = f20 + ((-ds1Var4.f7696a) * f16);
                ds1Var7.f7698c = ds1Var4.f7698c;
            }
            ds1 ds1Var8 = this.f31548o;
            float f21 = ds1Var8.f7696a;
            ds1 ds1Var9 = this.f31546m;
            ds1Var8.f7696a = f21 + (ds1Var9.f7696a * f * f4 * f2);
            ds1Var8.f7697b += ds1Var9.f7697b * f * f4 * f2;
            ds1Var8.f7698c += ds1Var9.f7698c * f * f4 * f2;
            float f22 = ds1Var4.f7696a;
            bs1 bs1Var5 = this.f31547n;
            ds1Var4.f7696a = f22 + (bs1Var5.f5090a * f * f2);
            ds1Var4.f7697b += bs1Var5.f5091b * f * f2;
            if (xv0Var3.f32976e) {
                if (bs1Var4 != null) {
                    float atan = (float) Math.atan(bs1.m25851l(bs1Var4.f5090a - ds1Var8.f7696a, bs1Var4.f5091b - ds1Var8.f7697b) / this.f31548o.f7698c);
                    float f23 = bs1Var4.f5090a;
                    float f24 = this.f31548o.f7696a;
                    ds1 ds1Var10 = this.f31546m;
                    ds1 ds1Var11 = f31531w;
                    float f25 = bs1Var4.f5090a;
                    ds1 ds1Var12 = this.f31548o;
                    ds1Var11.f7696a = f25 - ds1Var12.f7696a;
                    ds1Var11.f7697b = bs1Var4.f5091b - ds1Var12.f7697b;
                    ds1Var11.f7698c = 0.0f;
                    this.f31550q = ds1Var11.m24013a();
                    m24012b = Math.min(Math.abs(atan - ((float) Math.atan(bs1.m25851l(f23 - (f24 - ds1Var10.f7696a), bs1Var4.f5091b - (ds1Var.f7697b - ds1Var10.f7697b)) / (this.f31548o.f7698c - this.f31546m.f7698c)))), 0.3f);
                    f8 = 100.05f;
                } else {
                    this.f31550q = ds1Var9.m24013a();
                    m24012b = this.f31546m.m24012b();
                    f8 = 0.05f;
                }
                f11 = m24012b * f8;
            } else {
                this.f31550q = xv0Var3.f32975d;
            }
            this.f31549p = this.f31553t.f32973b + (f11 * f4 * f6);
            return true;
        }
        return false;
    }

    @Override // com.daaw.zd0
    /* renamed from: e */
    public boolean mo2472e() {
        return this.f31551r;
    }

    @Override // com.daaw.zd0
    /* renamed from: f */
    public void mo2471f(float f) {
        C3812z6 c3812z6 = this.f31543j;
        int mo2802i = c3812z6 != null ? c3812z6.mo2802i() : 1;
        boolean z = this.f31541h;
        if (!z) {
            this.f31536c = (int) (mo2802i * this.f31539f);
        }
        if (!this.f31542i && this.f31536c >= mo2802i) {
            this.f31536c = mo2802i - 1;
        }
        this.f31536c %= mo2802i;
        if (z) {
            return;
        }
        this.f31537d = this.f31539f * 1.0f;
    }

    @Override // com.daaw.zd0
    /* renamed from: g */
    public float mo2470g() {
        return this.f31550q;
    }

    @Override // com.daaw.zd0
    public ds1 getPosition() {
        return this.f31548o;
    }

    /* renamed from: h */
    public void m5779h(int i) {
        if (this.f31544k.length == i) {
            return;
        }
        this.f31544k = new xv0[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f31544k[i2] = new xv0();
        }
    }

    /* renamed from: i */
    public xv0 m5778i(int i) {
        return this.f31544k[i];
    }

    /* renamed from: j */
    public void m5777j(boolean z) {
        this.f31551r = z;
    }

    @Override // com.daaw.zd0
    public void setVisible(boolean z) {
        this.f31552s = z;
    }
}
