package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class ib8 {

    /* renamed from: a */
    public final long f13441a;

    /* renamed from: b */
    public final l64 f13442b;

    /* renamed from: c */
    public final int f13443c;

    /* renamed from: d */
    public final pr8 f13444d;

    /* renamed from: e */
    public final long f13445e;

    /* renamed from: f */
    public final l64 f13446f;

    /* renamed from: g */
    public final int f13447g;

    /* renamed from: h */
    public final pr8 f13448h;

    /* renamed from: i */
    public final long f13449i;

    /* renamed from: j */
    public final long f13450j;

    public ib8(long j, l64 l64Var, int i, pr8 pr8Var, long j2, l64 l64Var2, int i2, pr8 pr8Var2, long j3, long j4) {
        this.f13441a = j;
        this.f13442b = l64Var;
        this.f13443c = i;
        this.f13444d = pr8Var;
        this.f13445e = j2;
        this.f13446f = l64Var2;
        this.f13447g = i2;
        this.f13448h = pr8Var2;
        this.f13449i = j3;
        this.f13450j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ib8.class == obj.getClass()) {
            ib8 ib8Var = (ib8) obj;
            if (this.f13441a == ib8Var.f13441a && this.f13443c == ib8Var.f13443c && this.f13445e == ib8Var.f13445e && this.f13447g == ib8Var.f13447g && this.f13449i == ib8Var.f13449i && this.f13450j == ib8Var.f13450j && ky6.m17316a(this.f13442b, ib8Var.f13442b) && ky6.m17316a(this.f13444d, ib8Var.f13444d) && ky6.m17316a(this.f13446f, ib8Var.f13446f) && ky6.m17316a(this.f13448h, ib8Var.f13448h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f13441a), this.f13442b, Integer.valueOf(this.f13443c), this.f13444d, Long.valueOf(this.f13445e), this.f13446f, Integer.valueOf(this.f13447g), this.f13448h, Long.valueOf(this.f13449i), Long.valueOf(this.f13450j)});
    }
}
