package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public final class rr7 {

    /* renamed from: a */
    public final qr7 f25543a;

    public rr7(qr7 qr7Var) {
        vs7.m6815f(qr7Var, "output");
        this.f25543a = qr7Var;
        qr7Var.f24292a = this;
    }

    /* renamed from: l */
    public static rr7 m11023l(qr7 qr7Var) {
        rr7 rr7Var = qr7Var.f24292a;
        return rr7Var != null ? rr7Var : new rr7(qr7Var);
    }

    /* renamed from: A */
    public final void m11045A(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f25543a.mo12244r(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        this.f25543a.mo12236z(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).floatValue();
            i3 += 4;
        }
        this.f25543a.mo12268B(i3);
        while (i2 < list.size()) {
            this.f25543a.mo12243s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* renamed from: B */
    public final void m11044B(int i, Object obj, cv7 cv7Var) {
        qr7 qr7Var = this.f25543a;
        qr7Var.mo12236z(i, 3);
        cv7Var.mo24956f((xt7) obj, qr7Var.f24292a);
        qr7Var.mo12236z(i, 4);
    }

    /* renamed from: C */
    public final void m11043C(int i, int i2) {
        this.f25543a.mo12240v(i, i2);
    }

    /* renamed from: D */
    public final void m11042D(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f25543a.mo12240v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f25543a.mo12236z(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += qr7.m12263G(((Integer) list.get(i4)).intValue());
        }
        this.f25543a.mo12268B(i3);
        while (i2 < list.size()) {
            this.f25543a.mo12239w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: E */
    public final void m11041E(int i, long j) {
        this.f25543a.mo12267C(i, j);
    }

    /* renamed from: F */
    public final void m11040F(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f25543a.mo12267C(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.f25543a.mo12236z(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += qr7.m12255g(((Long) list.get(i4)).longValue());
        }
        this.f25543a.mo12268B(i3);
        while (i2 < list.size()) {
            this.f25543a.mo12266D(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: G */
    public final void m11039G(int i, Object obj, cv7 cv7Var) {
        this.f25543a.mo12238x(i, (xt7) obj, cv7Var);
    }

    /* renamed from: H */
    public final void m11038H(int i, int i2) {
        this.f25543a.mo12244r(i, i2);
    }

    /* renamed from: I */
    public final void m11037I(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f25543a.mo12244r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f25543a.mo12236z(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        this.f25543a.mo12268B(i3);
        while (i2 < list.size()) {
            this.f25543a.mo12243s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: J */
    public final void m11036J(int i, long j) {
        this.f25543a.mo12242t(i, j);
    }

    /* renamed from: K */
    public final void m11035K(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f25543a.mo12242t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.f25543a.mo12236z(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        this.f25543a.mo12268B(i3);
        while (i2 < list.size()) {
            this.f25543a.mo12241u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void m11034a(int i, int i2) {
        this.f25543a.mo12269A(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: b */
    public final void m11033b(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                qr7 qr7Var = this.f25543a;
                int intValue = ((Integer) list.get(i2)).intValue();
                qr7Var.mo12269A(i, (intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
            return;
        }
        this.f25543a.mo12236z(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += qr7.m12256f((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.f25543a.mo12268B(i3);
        while (i2 < list.size()) {
            qr7 qr7Var2 = this.f25543a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            qr7Var2.mo12268B((intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: c */
    public final void m11032c(int i, long j) {
        this.f25543a.mo12267C(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: d */
    public final void m11031d(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                qr7 qr7Var = this.f25543a;
                long longValue = ((Long) list.get(i2)).longValue();
                qr7Var.mo12267C(i, (longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
            return;
        }
        this.f25543a.mo12236z(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += qr7.m12255g((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.f25543a.mo12268B(i3);
        while (i2 < list.size()) {
            qr7 qr7Var2 = this.f25543a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            qr7Var2.mo12266D((longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Deprecated
    /* renamed from: e */
    public final void m11030e(int i) {
        this.f25543a.mo12236z(i, 3);
    }

    /* renamed from: f */
    public final void m11029f(int i, String str) {
        this.f25543a.mo12237y(i, str);
    }

    /* renamed from: g */
    public final void m11028g(int i, List list) {
        int i2 = 0;
        if (!(list instanceof ct7)) {
            while (i2 < list.size()) {
                this.f25543a.mo12237y(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        ct7 ct7Var = (ct7) list;
        while (i2 < list.size()) {
            Object zzf = ct7Var.zzf(i2);
            if (zzf instanceof String) {
                this.f25543a.mo12237y(i, (String) zzf);
            } else {
                this.f25543a.mo12246p(i, (yq7) zzf);
            }
            i2++;
        }
    }

    /* renamed from: h */
    public final void m11027h(int i, int i2) {
        this.f25543a.mo12269A(i, i2);
    }

    /* renamed from: i */
    public final void m11026i(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f25543a.mo12269A(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f25543a.mo12236z(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += qr7.m12256f(((Integer) list.get(i4)).intValue());
        }
        this.f25543a.mo12268B(i3);
        while (i2 < list.size()) {
            this.f25543a.mo12268B(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void m11025j(int i, long j) {
        this.f25543a.mo12267C(i, j);
    }

    /* renamed from: k */
    public final void m11024k(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f25543a.mo12267C(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.f25543a.mo12236z(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += qr7.m12255g(((Long) list.get(i4)).longValue());
        }
        this.f25543a.mo12268B(i3);
        while (i2 < list.size()) {
            this.f25543a.mo12266D(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void m11022m(int i, boolean z) {
        this.f25543a.mo12247o(i, z);
    }

    /* renamed from: n */
    public final void m11021n(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f25543a.mo12247o(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.f25543a.mo12236z(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).booleanValue();
            i3++;
        }
        this.f25543a.mo12268B(i3);
        while (i2 < list.size()) {
            this.f25543a.mo12248n(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* renamed from: o */
    public final void m11020o(int i, yq7 yq7Var) {
        this.f25543a.mo12246p(i, yq7Var);
    }

    /* renamed from: p */
    public final void m11019p(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f25543a.mo12246p(i, (yq7) list.get(i2));
        }
    }

    /* renamed from: q */
    public final void m11018q(int i, double d) {
        this.f25543a.mo12242t(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: r */
    public final void m11017r(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f25543a.mo12242t(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        this.f25543a.mo12236z(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).doubleValue();
            i3 += 8;
        }
        this.f25543a.mo12268B(i3);
        while (i2 < list.size()) {
            this.f25543a.mo12241u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Deprecated
    /* renamed from: s */
    public final void m11016s(int i) {
        this.f25543a.mo12236z(i, 4);
    }

    /* renamed from: t */
    public final void m11015t(int i, int i2) {
        this.f25543a.mo12240v(i, i2);
    }

    /* renamed from: u */
    public final void m11014u(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f25543a.mo12240v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f25543a.mo12236z(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += qr7.m12263G(((Integer) list.get(i4)).intValue());
        }
        this.f25543a.mo12268B(i3);
        while (i2 < list.size()) {
            this.f25543a.mo12239w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: v */
    public final void m11013v(int i, int i2) {
        this.f25543a.mo12244r(i, i2);
    }

    /* renamed from: w */
    public final void m11012w(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f25543a.mo12244r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f25543a.mo12236z(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        this.f25543a.mo12268B(i3);
        while (i2 < list.size()) {
            this.f25543a.mo12243s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: x */
    public final void m11011x(int i, long j) {
        this.f25543a.mo12242t(i, j);
    }

    /* renamed from: y */
    public final void m11010y(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f25543a.mo12242t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.f25543a.mo12236z(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        this.f25543a.mo12268B(i3);
        while (i2 < list.size()) {
            this.f25543a.mo12241u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: z */
    public final void m11009z(int i, float f) {
        this.f25543a.mo12244r(i, Float.floatToRawIntBits(f));
    }
}
