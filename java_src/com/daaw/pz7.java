package com.daaw;
/* loaded from: classes.dex */
public final class pz7 {

    /* renamed from: j */
    public static final pz7 f23560j = new pz7(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k */
    public static final pz7 f23561k = new pz7(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l */
    public static final pz7 f23562l = new pz7(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m */
    public static final pz7 f23563m = new pz7(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a */
    public final double f23564a;

    /* renamed from: b */
    public final double f23565b;

    /* renamed from: c */
    public final double f23566c;

    /* renamed from: d */
    public final double f23567d;

    /* renamed from: e */
    public final double f23568e;

    /* renamed from: f */
    public final double f23569f;

    /* renamed from: g */
    public final double f23570g;

    /* renamed from: h */
    public final double f23571h;

    /* renamed from: i */
    public final double f23572i;

    public pz7(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f23564a = d5;
        this.f23565b = d6;
        this.f23566c = d7;
        this.f23567d = d;
        this.f23568e = d2;
        this.f23569f = d3;
        this.f23570g = d4;
        this.f23571h = d8;
        this.f23572i = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pz7.class != obj.getClass()) {
            return false;
        }
        pz7 pz7Var = (pz7) obj;
        return Double.compare(pz7Var.f23567d, this.f23567d) == 0 && Double.compare(pz7Var.f23568e, this.f23568e) == 0 && Double.compare(pz7Var.f23569f, this.f23569f) == 0 && Double.compare(pz7Var.f23570g, this.f23570g) == 0 && Double.compare(pz7Var.f23571h, this.f23571h) == 0 && Double.compare(pz7Var.f23572i, this.f23572i) == 0 && Double.compare(pz7Var.f23564a, this.f23564a) == 0 && Double.compare(pz7Var.f23565b, this.f23565b) == 0 && Double.compare(pz7Var.f23566c, this.f23566c) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f23564a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f23565b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f23566c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f23567d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f23568e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f23569f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f23570g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.f23571h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f23572i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3))) * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4))) * 31) + ((int) ((doubleToLongBits5 >>> 32) ^ doubleToLongBits5))) * 31) + ((int) ((doubleToLongBits6 >>> 32) ^ doubleToLongBits6))) * 31) + ((int) ((doubleToLongBits7 >>> 32) ^ doubleToLongBits7))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f23560j)) {
            return "Rotate 0°";
        }
        if (equals(f23561k)) {
            return "Rotate 90°";
        }
        if (equals(f23562l)) {
            return "Rotate 180°";
        }
        if (equals(f23563m)) {
            return "Rotate 270°";
        }
        double d = this.f23564a;
        double d2 = this.f23565b;
        double d3 = this.f23566c;
        double d4 = this.f23567d;
        double d5 = this.f23568e;
        double d6 = this.f23569f;
        double d7 = this.f23570g;
        double d8 = this.f23571h;
        double d9 = this.f23572i;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d);
        sb.append(", v=");
        sb.append(d2);
        sb.append(", w=");
        sb.append(d3);
        sb.append(", a=");
        sb.append(d4);
        sb.append(", b=");
        sb.append(d5);
        sb.append(", c=");
        sb.append(d6);
        sb.append(", d=");
        sb.append(d7);
        sb.append(", tx=");
        sb.append(d8);
        sb.append(", ty=");
        sb.append(d9);
        sb.append("}");
        return sb.toString();
    }
}
