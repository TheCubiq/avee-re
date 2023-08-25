package com.daaw;
/* loaded from: classes2.dex */
public final class ys {
    public final i01<?> a;
    public final int b;
    public final int c;

    public ys(i01<?> i01Var, int i, int i2) {
        this.a = (i01) sy0.c(i01Var, "Null dependency anInterface.");
        this.b = i;
        this.c = i2;
    }

    public ys(Class<?> cls, int i, int i2) {
        this(i01.b(cls), i, i2);
    }

    public static ys a(Class<?> cls) {
        return new ys(cls, 0, 2);
    }

    public static String b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return "deferred";
                }
                throw new AssertionError("Unsupported injection: " + i);
            }
            return "provider";
        }
        return "direct";
    }

    public static ys h(Class<?> cls) {
        return new ys(cls, 0, 1);
    }

    public static ys i(i01<?> i01Var) {
        return new ys(i01Var, 1, 0);
    }

    public static ys j(Class<?> cls) {
        return new ys(cls, 1, 0);
    }

    public static ys k(Class<?> cls) {
        return new ys(cls, 1, 1);
    }

    public static ys l(Class<?> cls) {
        return new ys(cls, 2, 0);
    }

    public i01<?> c() {
        return this.a;
    }

    public boolean d() {
        return this.c == 2;
    }

    public boolean e() {
        return this.c == 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ys) {
            ys ysVar = (ys) obj;
            return this.a.equals(ysVar.a) && this.b == ysVar.b && this.c == ysVar.c;
        }
        return false;
    }

    public boolean f() {
        return this.b == 1;
    }

    public boolean g() {
        return this.b == 2;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(b(this.c));
        sb.append("}");
        return sb.toString();
    }
}
