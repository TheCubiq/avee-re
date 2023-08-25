package com.daaw;
/* loaded from: classes.dex */
public final class m78 {

    /* renamed from: a */
    public final pr8 f18573a;

    /* renamed from: b */
    public final long f18574b;

    /* renamed from: c */
    public final long f18575c;

    /* renamed from: d */
    public final long f18576d;

    /* renamed from: e */
    public final long f18577e;

    /* renamed from: f */
    public final boolean f18578f;

    /* renamed from: g */
    public final boolean f18579g;

    /* renamed from: h */
    public final boolean f18580h;

    /* renamed from: i */
    public final boolean f18581i;

    public m78(pr8 pr8Var, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        uo4.m7874d(!z4 || z2);
        if (z3 && !z2) {
            z5 = false;
        }
        uo4.m7874d(z5);
        this.f18573a = pr8Var;
        this.f18574b = j;
        this.f18575c = j2;
        this.f18576d = j3;
        this.f18577e = j4;
        this.f18578f = false;
        this.f18579g = z2;
        this.f18580h = z3;
        this.f18581i = z4;
    }

    /* renamed from: a */
    public final m78 m16185a(long j) {
        return j == this.f18575c ? this : new m78(this.f18573a, this.f18574b, j, this.f18576d, this.f18577e, false, this.f18579g, this.f18580h, this.f18581i);
    }

    /* renamed from: b */
    public final m78 m16184b(long j) {
        return j == this.f18574b ? this : new m78(this.f18573a, j, this.f18575c, this.f18576d, this.f18577e, false, this.f18579g, this.f18580h, this.f18581i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m78.class == obj.getClass()) {
            m78 m78Var = (m78) obj;
            if (this.f18574b == m78Var.f18574b && this.f18575c == m78Var.f18575c && this.f18576d == m78Var.f18576d && this.f18577e == m78Var.f18577e && this.f18579g == m78Var.f18579g && this.f18580h == m78Var.f18580h && this.f18581i == m78Var.f18581i && it5.m19376t(this.f18573a, m78Var.f18573a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.f18573a.hashCode() + 527) * 31) + ((int) this.f18574b)) * 31) + ((int) this.f18575c)) * 31) + ((int) this.f18576d)) * 31) + ((int) this.f18577e)) * 961) + (this.f18579g ? 1 : 0)) * 31) + (this.f18580h ? 1 : 0)) * 31) + (this.f18581i ? 1 : 0);
    }
}
