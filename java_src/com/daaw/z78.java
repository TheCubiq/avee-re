package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class z78 implements ki8 {
    public final w78 a;

    public z78(w78 w78Var) {
        gb8.f(w78Var, "output");
        this.a = w78Var;
        w78Var.a = this;
    }

    public static z78 J(w78 w78Var) {
        z78 z78Var = w78Var.a;
        return z78Var != null ? z78Var : new z78(w78Var);
    }

    @Override // com.daaw.ki8
    public final void A(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.v(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += w78.b(((Long) list.get(i4)).longValue());
        }
        this.a.u(i3);
        while (i2 < list.size()) {
            this.a.w(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.daaw.ki8
    public final void B(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.v(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += w78.b(((Long) list.get(i4)).longValue());
        }
        this.a.u(i3);
        while (i2 < list.size()) {
            this.a.w(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.daaw.ki8
    public final void C(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.k(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        this.a.u(i3);
        while (i2 < list.size()) {
            this.a.l(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.daaw.ki8
    public final void D(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.m(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        this.a.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).doubleValue();
            i3 += 8;
        }
        this.a.u(i3);
        while (i2 < list.size()) {
            this.a.n(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Override // com.daaw.ki8
    public final void E(int i, Object obj, ve8 ve8Var) {
        w78 w78Var = this.a;
        w78Var.s(i, 3);
        ve8Var.f((zd8) obj, w78Var.a);
        w78Var.s(i, 4);
    }

    @Override // com.daaw.ki8
    public final void F(int i, long j) {
        this.a.v(i, j);
    }

    @Override // com.daaw.ki8
    public final void G(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.k(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        this.a.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).floatValue();
            i3 += 4;
        }
        this.a.u(i3);
        while (i2 < list.size()) {
            this.a.l(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    @Override // com.daaw.ki8
    public final void H(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                w78 w78Var = this.a;
                long longValue = ((Long) list.get(i2)).longValue();
                w78Var.v(i, (longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
            return;
        }
        this.a.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += w78.b((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.a.u(i3);
        while (i2 < list.size()) {
            w78 w78Var2 = this.a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            w78Var2.w((longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Override // com.daaw.ki8
    public final void I(int i, long j) {
        this.a.v(i, (j >> 63) ^ (j + j));
    }

    @Override // com.daaw.ki8
    public final void a(int i, long j) {
        this.a.m(i, j);
    }

    @Override // com.daaw.ki8
    public final void b(int i, int i2) {
        this.a.t(i, i2);
    }

    @Override // com.daaw.ki8
    public final void c(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.m(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        this.a.u(i3);
        while (i2 < list.size()) {
            this.a.n(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.daaw.ki8
    public final void d(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.j(i, (y68) list.get(i2));
        }
    }

    @Override // com.daaw.ki8
    public final void e(int i, Object obj, ve8 ve8Var) {
        zd8 zd8Var = (zd8) obj;
        n78 n78Var = (n78) this.a;
        n78Var.u((i << 3) | 2);
        n78Var.u(((w48) zd8Var).e(ve8Var));
        ve8Var.f(zd8Var, n78Var.a);
    }

    @Override // com.daaw.ki8
    public final void f(int i, int i2) {
        this.a.k(i, i2);
    }

    @Override // com.daaw.ki8
    public final void g(int i, boolean z) {
        this.a.i(i, z);
    }

    @Override // com.daaw.ki8
    public final void h(int i, int i2) {
        this.a.t(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.daaw.ki8
    @Deprecated
    public final void i(int i) {
        this.a.s(i, 4);
    }

    @Override // com.daaw.ki8
    public final void j(int i, String str) {
        this.a.r(i, str);
    }

    @Override // com.daaw.ki8
    public final void k(int i, long j) {
        this.a.v(i, j);
    }

    @Override // com.daaw.ki8
    public final void l(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.i(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.a.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).booleanValue();
            i3++;
        }
        this.a.u(i3);
        while (i2 < list.size()) {
            this.a.h(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.daaw.ki8
    public final void m(int i, long j) {
        this.a.m(i, j);
    }

    @Override // com.daaw.ki8
    public final void n(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.t(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += w78.a(((Integer) list.get(i4)).intValue());
        }
        this.a.u(i3);
        while (i2 < list.size()) {
            this.a.u(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.daaw.ki8
    public final void o(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.k(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        this.a.u(i3);
        while (i2 < list.size()) {
            this.a.l(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.daaw.ki8
    public final void p(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.o(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += w78.z(((Integer) list.get(i4)).intValue());
        }
        this.a.u(i3);
        while (i2 < list.size()) {
            this.a.p(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.daaw.ki8
    public final void q(int i, int i2) {
        this.a.o(i, i2);
    }

    @Override // com.daaw.ki8
    public final void r(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.o(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += w78.z(((Integer) list.get(i4)).intValue());
        }
        this.a.u(i3);
        while (i2 < list.size()) {
            this.a.p(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.daaw.ki8
    public final void s(int i, List list) {
        int i2 = 0;
        if (!(list instanceof ac8)) {
            while (i2 < list.size()) {
                this.a.r(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        ac8 ac8Var = (ac8) list;
        while (i2 < list.size()) {
            Object zzf = ac8Var.zzf(i2);
            if (zzf instanceof String) {
                this.a.r(i, (String) zzf);
            } else {
                this.a.j(i, (y68) zzf);
            }
            i2++;
        }
    }

    @Override // com.daaw.ki8
    public final void t(int i, double d) {
        this.a.m(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.daaw.ki8
    public final void u(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.m(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        this.a.u(i3);
        while (i2 < list.size()) {
            this.a.n(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.daaw.ki8
    public final void v(int i, int i2) {
        this.a.o(i, i2);
    }

    @Override // com.daaw.ki8
    public final void w(int i, int i2) {
        this.a.k(i, i2);
    }

    @Override // com.daaw.ki8
    public final void x(int i, float f) {
        this.a.k(i, Float.floatToRawIntBits(f));
    }

    @Override // com.daaw.ki8
    public final void y(int i, y68 y68Var) {
        this.a.j(i, y68Var);
    }

    @Override // com.daaw.ki8
    public final void z(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                w78 w78Var = this.a;
                int intValue = ((Integer) list.get(i2)).intValue();
                w78Var.t(i, (intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
            return;
        }
        this.a.s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += w78.a((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.a.u(i3);
        while (i2 < list.size()) {
            w78 w78Var2 = this.a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            w78Var2.u((intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    @Override // com.daaw.ki8
    @Deprecated
    public final void zzE(int i) {
        this.a.s(i, 3);
    }
}
