package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public final class rr7 {
    public final qr7 a;

    public rr7(qr7 qr7Var) {
        vs7.f(qr7Var, "output");
        this.a = qr7Var;
        qr7Var.a = this;
    }

    public static rr7 l(qr7 qr7Var) {
        rr7 rr7Var = qr7Var.a;
        return rr7Var != null ? rr7Var : new rr7(qr7Var);
    }

    public final void A(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.r(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        this.a.z(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).floatValue();
            i3 += 4;
        }
        this.a.B(i3);
        while (i2 < list.size()) {
            this.a.s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public final void B(int i, Object obj, cv7 cv7Var) {
        qr7 qr7Var = this.a;
        qr7Var.z(i, 3);
        cv7Var.f((xt7) obj, qr7Var.a);
        qr7Var.z(i, 4);
    }

    public final void C(int i, int i2) {
        this.a.v(i, i2);
    }

    public final void D(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.z(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += qr7.G(((Integer) list.get(i4)).intValue());
        }
        this.a.B(i3);
        while (i2 < list.size()) {
            this.a.w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void E(int i, long j) {
        this.a.C(i, j);
    }

    public final void F(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.C(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.z(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += qr7.g(((Long) list.get(i4)).longValue());
        }
        this.a.B(i3);
        while (i2 < list.size()) {
            this.a.D(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void G(int i, Object obj, cv7 cv7Var) {
        this.a.x(i, (xt7) obj, cv7Var);
    }

    public final void H(int i, int i2) {
        this.a.r(i, i2);
    }

    public final void I(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.z(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        this.a.B(i3);
        while (i2 < list.size()) {
            this.a.s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void J(int i, long j) {
        this.a.t(i, j);
    }

    public final void K(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.z(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        this.a.B(i3);
        while (i2 < list.size()) {
            this.a.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void a(int i, int i2) {
        this.a.A(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void b(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                qr7 qr7Var = this.a;
                int intValue = ((Integer) list.get(i2)).intValue();
                qr7Var.A(i, (intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
            return;
        }
        this.a.z(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += qr7.f((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.a.B(i3);
        while (i2 < list.size()) {
            qr7 qr7Var2 = this.a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            qr7Var2.B((intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    public final void c(int i, long j) {
        this.a.C(i, (j >> 63) ^ (j + j));
    }

    public final void d(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                qr7 qr7Var = this.a;
                long longValue = ((Long) list.get(i2)).longValue();
                qr7Var.C(i, (longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
            return;
        }
        this.a.z(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += qr7.g((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.a.B(i3);
        while (i2 < list.size()) {
            qr7 qr7Var2 = this.a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            qr7Var2.D((longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Deprecated
    public final void e(int i) {
        this.a.z(i, 3);
    }

    public final void f(int i, String str) {
        this.a.y(i, str);
    }

    public final void g(int i, List list) {
        int i2 = 0;
        if (!(list instanceof ct7)) {
            while (i2 < list.size()) {
                this.a.y(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        ct7 ct7Var = (ct7) list;
        while (i2 < list.size()) {
            Object zzf = ct7Var.zzf(i2);
            if (zzf instanceof String) {
                this.a.y(i, (String) zzf);
            } else {
                this.a.p(i, (yq7) zzf);
            }
            i2++;
        }
    }

    public final void h(int i, int i2) {
        this.a.A(i, i2);
    }

    public final void i(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.A(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.z(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += qr7.f(((Integer) list.get(i4)).intValue());
        }
        this.a.B(i3);
        while (i2 < list.size()) {
            this.a.B(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void j(int i, long j) {
        this.a.C(i, j);
    }

    public final void k(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.C(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.z(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += qr7.g(((Long) list.get(i4)).longValue());
        }
        this.a.B(i3);
        while (i2 < list.size()) {
            this.a.D(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void m(int i, boolean z) {
        this.a.o(i, z);
    }

    public final void n(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.o(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.a.z(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).booleanValue();
            i3++;
        }
        this.a.B(i3);
        while (i2 < list.size()) {
            this.a.n(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public final void o(int i, yq7 yq7Var) {
        this.a.p(i, yq7Var);
    }

    public final void p(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.p(i, (yq7) list.get(i2));
        }
    }

    public final void q(int i, double d) {
        this.a.t(i, Double.doubleToRawLongBits(d));
    }

    public final void r(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.t(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        this.a.z(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).doubleValue();
            i3 += 8;
        }
        this.a.B(i3);
        while (i2 < list.size()) {
            this.a.u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Deprecated
    public final void s(int i) {
        this.a.z(i, 4);
    }

    public final void t(int i, int i2) {
        this.a.v(i, i2);
    }

    public final void u(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.z(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += qr7.G(((Integer) list.get(i4)).intValue());
        }
        this.a.B(i3);
        while (i2 < list.size()) {
            this.a.w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void v(int i, int i2) {
        this.a.r(i, i2);
    }

    public final void w(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.z(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        this.a.B(i3);
        while (i2 < list.size()) {
            this.a.s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void x(int i, long j) {
        this.a.t(i, j);
    }

    public final void y(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.z(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        this.a.B(i3);
        while (i2 < list.size()) {
            this.a.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void z(int i, float f) {
        this.a.r(i, Float.floatToRawIntBits(f));
    }
}
