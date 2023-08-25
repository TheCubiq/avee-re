package com.daaw;
/* renamed from: com.daaw.nd */
/* loaded from: classes.dex */
public class C2284nd {

    /* renamed from: a */
    public final float f20050a;

    /* renamed from: b */
    public final float f20051b;

    /* renamed from: c */
    public final float f20052c;

    /* renamed from: d */
    public final float f20053d;

    /* renamed from: e */
    public final float f20054e;

    /* renamed from: f */
    public final float f20055f;

    /* renamed from: g */
    public final float f20056g;

    /* renamed from: h */
    public final float f20057h;

    /* renamed from: i */
    public final float f20058i;

    public C2284nd(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f20050a = f;
        this.f20051b = f2;
        this.f20052c = f3;
        this.f20053d = f4;
        this.f20054e = f5;
        this.f20055f = f6;
        this.f20056g = f7;
        this.f20057h = f8;
        this.f20058i = f9;
    }

    /* renamed from: b */
    public static C2284nd m15238b(float f, float f2, float f3) {
        float f4 = 1000.0f;
        C2284nd c2284nd = null;
        float f5 = 1000.0f;
        float f6 = 100.0f;
        float f7 = 0.0f;
        while (Math.abs(f7 - f6) > 0.01f) {
            float f8 = ((f6 - f7) / 2.0f) + f7;
            int m15224p = m15235e(f8, f2, f).m15224p();
            float m14387b = C2431od.m14387b(m15224p);
            float abs = Math.abs(f3 - m14387b);
            if (abs < 0.2f) {
                C2284nd m15237c = m15237c(m15224p);
                float m15239a = m15237c.m15239a(m15235e(m15237c.m15229k(), m15237c.m15231i(), f));
                if (m15239a <= 1.0f) {
                    c2284nd = m15237c;
                    f4 = abs;
                    f5 = m15239a;
                }
            }
            if (f4 == 0.0f && f5 == 0.0f) {
                break;
            } else if (m14387b < f3) {
                f7 = f8;
            } else {
                f6 = f8;
            }
        }
        return c2284nd;
    }

    /* renamed from: c */
    public static C2284nd m15237c(int i) {
        return m15236d(i, pu1.f23273k);
    }

    /* renamed from: d */
    public static C2284nd m15236d(int i, pu1 pu1Var) {
        float f;
        double d;
        float[] m14383f = C2431od.m14383f(i);
        float[][] fArr = C2431od.f21275a;
        float f2 = (m14383f[0] * fArr[0][0]) + (m14383f[1] * fArr[0][1]) + (m14383f[2] * fArr[0][2]);
        float f3 = (m14383f[0] * fArr[1][0]) + (m14383f[1] * fArr[1][1]) + (m14383f[2] * fArr[1][2]);
        float f4 = (m14383f[0] * fArr[2][0]) + (m14383f[1] * fArr[2][1]) + (m14383f[2] * fArr[2][2]);
        float f5 = pu1Var.m13133i()[0] * f2;
        float f6 = pu1Var.m13133i()[1] * f3;
        float f7 = pu1Var.m13133i()[2] * f4;
        double m13139c = pu1Var.m13139c() * Math.abs(f5);
        Double.isNaN(m13139c);
        float pow = (float) Math.pow(m13139c / 100.0d, 0.42d);
        double m13139c2 = pu1Var.m13139c() * Math.abs(f6);
        Double.isNaN(m13139c2);
        float pow2 = (float) Math.pow(m13139c2 / 100.0d, 0.42d);
        double m13139c3 = pu1Var.m13139c() * Math.abs(f7);
        Double.isNaN(m13139c3);
        float pow3 = (float) Math.pow(m13139c3 / 100.0d, 0.42d);
        float signum = ((Math.signum(f5) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f6) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f7) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d2 = signum;
        Double.isNaN(d2);
        double d3 = signum2;
        Double.isNaN(d3);
        double d4 = (d2 * 11.0d) + (d3 * (-12.0d));
        double d5 = signum3;
        Double.isNaN(d5);
        double d6 = signum + signum2;
        Double.isNaN(d5);
        Double.isNaN(d6);
        float f8 = ((float) (d6 - (d5 * 2.0d))) / 9.0f;
        float f9 = signum2 * 20.0f;
        float f10 = (((signum * 20.0f) + f9) + (21.0f * signum3)) / 20.0f;
        float f11 = (((signum * 40.0f) + f9) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f8, ((float) (d4 + d5)) / 11.0f)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f12 = atan2;
        float f13 = (3.1415927f * f12) / 180.0f;
        float pow4 = ((float) Math.pow((f11 * pu1Var.m13136f()) / pu1Var.m13141a(), pu1Var.m13140b() * pu1Var.m13132j())) * 100.0f;
        float m13138d = pu1Var.m13138d() * (4.0f / pu1Var.m13140b()) * ((float) Math.sqrt(pow4 / 100.0f)) * (pu1Var.m13141a() + 4.0f);
        Double.isNaN(((double) f12) < 20.14d ? 360.0f + f12 : f12);
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, pu1Var.m13137e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((d * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * pu1Var.m13135g()) * pu1Var.m13134h()) * ((float) Math.sqrt((f * f) + (f8 * f8)))) / (f10 + 0.305f), 0.9d));
        double d7 = pow4;
        Double.isNaN(d7);
        float sqrt = pow5 * ((float) Math.sqrt(d7 / 100.0d));
        float m13138d2 = sqrt * pu1Var.m13138d();
        float sqrt2 = ((float) Math.sqrt((pow5 * pu1Var.m13140b()) / (pu1Var.m13141a() + 4.0f))) * 50.0f;
        float f14 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * m13138d2) + 1.0f)) * 43.85965f;
        double d8 = f13;
        return new C2284nd(f12, sqrt, pow4, m13138d, m13138d2, sqrt2, f14, log * ((float) Math.cos(d8)), log * ((float) Math.sin(d8)));
    }

    /* renamed from: e */
    public static C2284nd m15235e(float f, float f2, float f3) {
        return m15234f(f, f2, f3, pu1.f23273k);
    }

    /* renamed from: f */
    public static C2284nd m15234f(float f, float f2, float f3, pu1 pu1Var) {
        double d;
        double d2 = f;
        Double.isNaN(d2);
        float m13140b = (4.0f / pu1Var.m13140b()) * ((float) Math.sqrt(d2 / 100.0d)) * (pu1Var.m13141a() + 4.0f) * pu1Var.m13138d();
        float m13138d = f2 * pu1Var.m13138d();
        float sqrt = ((float) Math.sqrt(((f2 / ((float) Math.sqrt(d))) * pu1Var.m13140b()) / (pu1Var.m13141a() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        double d3 = m13138d;
        Double.isNaN(d3);
        float log = ((float) Math.log((d3 * 0.0228d) + 1.0d)) * 43.85965f;
        double d4 = (3.1415927f * f3) / 180.0f;
        return new C2284nd(f3, f2, f, m13140b, m13138d, sqrt, f4, log * ((float) Math.cos(d4)), log * ((float) Math.sin(d4)));
    }

    /* renamed from: m */
    public static int m15227m(float f, float f2, float f3) {
        return m15226n(f, f2, f3, pu1.f23273k);
    }

    /* renamed from: n */
    public static int m15226n(float f, float f2, float f3, pu1 pu1Var) {
        if (f2 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
            return C2431od.m14388a(f3);
        }
        float min = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        float f4 = f2;
        C2284nd c2284nd = null;
        float f5 = 0.0f;
        boolean z = true;
        while (Math.abs(f5 - f2) >= 0.4f) {
            C2284nd m15238b = m15238b(min, f4, f3);
            if (z) {
                if (m15238b != null) {
                    return m15238b.m15225o(pu1Var);
                }
                z = false;
            } else if (m15238b == null) {
                f2 = f4;
            } else {
                f5 = f4;
                c2284nd = m15238b;
            }
            f4 = ((f2 - f5) / 2.0f) + f5;
        }
        return c2284nd == null ? C2431od.m14388a(f3) : c2284nd.m15225o(pu1Var);
    }

    /* renamed from: a */
    public float m15239a(C2284nd c2284nd) {
        float m15228l = m15228l() - c2284nd.m15228l();
        float m15233g = m15233g() - c2284nd.m15233g();
        float m15232h = m15232h() - c2284nd.m15232h();
        return (float) (Math.pow(Math.sqrt((m15228l * m15228l) + (m15233g * m15233g) + (m15232h * m15232h)), 0.63d) * 1.41d);
    }

    /* renamed from: g */
    public float m15233g() {
        return this.f20057h;
    }

    /* renamed from: h */
    public float m15232h() {
        return this.f20058i;
    }

    /* renamed from: i */
    public float m15231i() {
        return this.f20051b;
    }

    /* renamed from: j */
    public float m15230j() {
        return this.f20050a;
    }

    /* renamed from: k */
    public float m15229k() {
        return this.f20052c;
    }

    /* renamed from: l */
    public float m15228l() {
        return this.f20056g;
    }

    /* renamed from: o */
    public int m15225o(pu1 pu1Var) {
        float f;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        if (m15231i() == 0.0d || m15229k() == 0.0d) {
            f = 0.0f;
        } else {
            float m15231i = m15231i();
            double m15229k = m15229k();
            Double.isNaN(m15229k);
            f = m15231i / ((float) Math.sqrt(m15229k / 100.0d));
        }
        double d7 = f;
        double pow = Math.pow(1.64d - Math.pow(0.29d, pu1Var.m13137e()), 0.73d);
        Double.isNaN(d7);
        float pow2 = (float) Math.pow(d7 / pow, 1.1111111111111112d);
        double m15230j = (m15230j() * 3.1415927f) / 180.0f;
        Double.isNaN(m15230j);
        float m13141a = pu1Var.m13141a();
        double m15229k2 = m15229k();
        Double.isNaN(m15229k2);
        double m13140b = pu1Var.m13140b();
        Double.isNaN(m13140b);
        double d8 = 1.0d / m13140b;
        double m13132j = pu1Var.m13132j();
        Double.isNaN(m13132j);
        float pow3 = m13141a * ((float) Math.pow(m15229k2 / 100.0d, d8 / m13132j));
        float cos = ((float) (Math.cos(2.0d + m15230j) + 3.8d)) * 0.25f * 3846.1538f * pu1Var.m13135g() * pu1Var.m13134h();
        float m13136f = pow3 / pu1Var.m13136f();
        float sin = (float) Math.sin(m15230j);
        float cos2 = (float) Math.cos(m15230j);
        float f2 = (((0.305f + m13136f) * 23.0f) * pow2) / (((cos * 23.0f) + ((11.0f * pow2) * cos2)) + ((pow2 * 108.0f) * sin));
        float f3 = cos2 * f2;
        float f4 = f2 * sin;
        float f5 = m13136f * 460.0f;
        float f6 = (((451.0f * f3) + f5) + (288.0f * f4)) / 1403.0f;
        float f7 = ((f5 - (891.0f * f3)) - (261.0f * f4)) / 1403.0f;
        float f8 = ((f5 - (f3 * 220.0f)) - (f4 * 6300.0f)) / 1403.0f;
        Double.isNaN(Math.abs(f6));
        Double.isNaN(Math.abs(f6));
        float signum = Math.signum(f6) * (100.0f / pu1Var.m13139c()) * ((float) Math.pow((float) Math.max(0.0d, (d * 27.13d) / (400.0d - d2)), 2.380952380952381d));
        Double.isNaN(Math.abs(f7));
        Double.isNaN(Math.abs(f7));
        float signum2 = Math.signum(f7) * (100.0f / pu1Var.m13139c()) * ((float) Math.pow((float) Math.max(0.0d, (d3 * 27.13d) / (400.0d - d4)), 2.380952380952381d));
        Double.isNaN(Math.abs(f8));
        Double.isNaN(Math.abs(f8));
        float signum3 = Math.signum(f8) * (100.0f / pu1Var.m13139c()) * ((float) Math.pow((float) Math.max(0.0d, (d5 * 27.13d) / (400.0d - d6)), 2.380952380952381d));
        float f9 = signum / pu1Var.m13133i()[0];
        float f10 = signum2 / pu1Var.m13133i()[1];
        float f11 = signum3 / pu1Var.m13133i()[2];
        float[][] fArr = C2431od.f21276b;
        return C3838zg.m2351c((fArr[0][0] * f9) + (fArr[0][1] * f10) + (fArr[0][2] * f11), (fArr[1][0] * f9) + (fArr[1][1] * f10) + (fArr[1][2] * f11), (f9 * fArr[2][0]) + (f10 * fArr[2][1]) + (f11 * fArr[2][2]));
    }

    /* renamed from: p */
    public int m15224p() {
        return m15225o(pu1.f23273k);
    }
}
