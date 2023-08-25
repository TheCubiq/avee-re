package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class z78 implements ki8 {

    /* renamed from: a */
    public final w78 f34571a;

    public z78(w78 w78Var) {
        gb8.m21815f(w78Var, "output");
        this.f34571a = w78Var;
        w78Var.f31026a = this;
    }

    /* renamed from: J */
    public static z78 m2669J(w78 w78Var) {
        z78 z78Var = w78Var.f31026a;
        return z78Var != null ? z78Var : new z78(w78Var);
    }

    @Override // com.daaw.ki8
    /* renamed from: A */
    public final void mo2678A(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f34571a.mo6363v(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.f34571a.mo6366s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += w78.m6383b(((Long) list.get(i4)).longValue());
        }
        this.f34571a.mo6364u(i3);
        while (i2 < list.size()) {
            this.f34571a.mo6362w(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.daaw.ki8
    /* renamed from: B */
    public final void mo2677B(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f34571a.mo6363v(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.f34571a.mo6366s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += w78.m6383b(((Long) list.get(i4)).longValue());
        }
        this.f34571a.mo6364u(i3);
        while (i2 < list.size()) {
            this.f34571a.mo6362w(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.daaw.ki8
    /* renamed from: C */
    public final void mo2676C(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f34571a.mo6374k(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f34571a.mo6366s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        this.f34571a.mo6364u(i3);
        while (i2 < list.size()) {
            this.f34571a.mo6373l(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.daaw.ki8
    /* renamed from: D */
    public final void mo2675D(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f34571a.mo6372m(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        this.f34571a.mo6366s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).doubleValue();
            i3 += 8;
        }
        this.f34571a.mo6364u(i3);
        while (i2 < list.size()) {
            this.f34571a.mo6371n(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Override // com.daaw.ki8
    /* renamed from: E */
    public final void mo2674E(int i, Object obj, ve8 ve8Var) {
        w78 w78Var = this.f34571a;
        w78Var.mo6366s(i, 3);
        ve8Var.mo7200f((zd8) obj, w78Var.f31026a);
        w78Var.mo6366s(i, 4);
    }

    @Override // com.daaw.ki8
    /* renamed from: F */
    public final void mo2673F(int i, long j) {
        this.f34571a.mo6363v(i, j);
    }

    @Override // com.daaw.ki8
    /* renamed from: G */
    public final void mo2672G(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f34571a.mo6374k(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        this.f34571a.mo6366s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).floatValue();
            i3 += 4;
        }
        this.f34571a.mo6364u(i3);
        while (i2 < list.size()) {
            this.f34571a.mo6373l(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    @Override // com.daaw.ki8
    /* renamed from: H */
    public final void mo2671H(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                w78 w78Var = this.f34571a;
                long longValue = ((Long) list.get(i2)).longValue();
                w78Var.mo6363v(i, (longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
            return;
        }
        this.f34571a.mo6366s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += w78.m6383b((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.f34571a.mo6364u(i3);
        while (i2 < list.size()) {
            w78 w78Var2 = this.f34571a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            w78Var2.mo6362w((longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Override // com.daaw.ki8
    /* renamed from: I */
    public final void mo2670I(int i, long j) {
        this.f34571a.mo6363v(i, (j >> 63) ^ (j + j));
    }

    @Override // com.daaw.ki8
    /* renamed from: a */
    public final void mo2668a(int i, long j) {
        this.f34571a.mo6372m(i, j);
    }

    @Override // com.daaw.ki8
    /* renamed from: b */
    public final void mo2667b(int i, int i2) {
        this.f34571a.mo6365t(i, i2);
    }

    @Override // com.daaw.ki8
    /* renamed from: c */
    public final void mo2666c(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f34571a.mo6372m(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.f34571a.mo6366s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        this.f34571a.mo6364u(i3);
        while (i2 < list.size()) {
            this.f34571a.mo6371n(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.daaw.ki8
    /* renamed from: d */
    public final void mo2665d(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f34571a.mo6375j(i, (y68) list.get(i2));
        }
    }

    @Override // com.daaw.ki8
    /* renamed from: e */
    public final void mo2664e(int i, Object obj, ve8 ve8Var) {
        zd8 zd8Var = (zd8) obj;
        n78 n78Var = (n78) this.f34571a;
        n78Var.mo6364u((i << 3) | 2);
        n78Var.mo6364u(((w48) zd8Var).mo6533e(ve8Var));
        ve8Var.mo7200f(zd8Var, n78Var.f31026a);
    }

    @Override // com.daaw.ki8
    /* renamed from: f */
    public final void mo2663f(int i, int i2) {
        this.f34571a.mo6374k(i, i2);
    }

    @Override // com.daaw.ki8
    /* renamed from: g */
    public final void mo2662g(int i, boolean z) {
        this.f34571a.mo6376i(i, z);
    }

    @Override // com.daaw.ki8
    /* renamed from: h */
    public final void mo2661h(int i, int i2) {
        this.f34571a.mo6365t(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.daaw.ki8
    @Deprecated
    /* renamed from: i */
    public final void mo2660i(int i) {
        this.f34571a.mo6366s(i, 4);
    }

    @Override // com.daaw.ki8
    /* renamed from: j */
    public final void mo2659j(int i, String str) {
        this.f34571a.mo6367r(i, str);
    }

    @Override // com.daaw.ki8
    /* renamed from: k */
    public final void mo2658k(int i, long j) {
        this.f34571a.mo6363v(i, j);
    }

    @Override // com.daaw.ki8
    /* renamed from: l */
    public final void mo2657l(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f34571a.mo6376i(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.f34571a.mo6366s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).booleanValue();
            i3++;
        }
        this.f34571a.mo6364u(i3);
        while (i2 < list.size()) {
            this.f34571a.mo6377h(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.daaw.ki8
    /* renamed from: m */
    public final void mo2656m(int i, long j) {
        this.f34571a.mo6372m(i, j);
    }

    @Override // com.daaw.ki8
    /* renamed from: n */
    public final void mo2655n(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f34571a.mo6365t(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f34571a.mo6366s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += w78.m6384a(((Integer) list.get(i4)).intValue());
        }
        this.f34571a.mo6364u(i3);
        while (i2 < list.size()) {
            this.f34571a.mo6364u(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.daaw.ki8
    /* renamed from: o */
    public final void mo2654o(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f34571a.mo6374k(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f34571a.mo6366s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        this.f34571a.mo6364u(i3);
        while (i2 < list.size()) {
            this.f34571a.mo6373l(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.daaw.ki8
    /* renamed from: p */
    public final void mo2653p(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f34571a.mo6370o(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f34571a.mo6366s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += w78.m6359z(((Integer) list.get(i4)).intValue());
        }
        this.f34571a.mo6364u(i3);
        while (i2 < list.size()) {
            this.f34571a.mo6369p(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.daaw.ki8
    /* renamed from: q */
    public final void mo2652q(int i, int i2) {
        this.f34571a.mo6370o(i, i2);
    }

    @Override // com.daaw.ki8
    /* renamed from: r */
    public final void mo2651r(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f34571a.mo6370o(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.f34571a.mo6366s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += w78.m6359z(((Integer) list.get(i4)).intValue());
        }
        this.f34571a.mo6364u(i3);
        while (i2 < list.size()) {
            this.f34571a.mo6369p(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.daaw.ki8
    /* renamed from: s */
    public final void mo2650s(int i, List list) {
        int i2 = 0;
        if (!(list instanceof ac8)) {
            while (i2 < list.size()) {
                this.f34571a.mo6367r(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        ac8 ac8Var = (ac8) list;
        while (i2 < list.size()) {
            Object zzf = ac8Var.zzf(i2);
            if (zzf instanceof String) {
                this.f34571a.mo6367r(i, (String) zzf);
            } else {
                this.f34571a.mo6375j(i, (y68) zzf);
            }
            i2++;
        }
    }

    @Override // com.daaw.ki8
    /* renamed from: t */
    public final void mo2649t(int i, double d) {
        this.f34571a.mo6372m(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.daaw.ki8
    /* renamed from: u */
    public final void mo2648u(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f34571a.mo6372m(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.f34571a.mo6366s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        this.f34571a.mo6364u(i3);
        while (i2 < list.size()) {
            this.f34571a.mo6371n(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.daaw.ki8
    /* renamed from: v */
    public final void mo2647v(int i, int i2) {
        this.f34571a.mo6370o(i, i2);
    }

    @Override // com.daaw.ki8
    /* renamed from: w */
    public final void mo2646w(int i, int i2) {
        this.f34571a.mo6374k(i, i2);
    }

    @Override // com.daaw.ki8
    /* renamed from: x */
    public final void mo2645x(int i, float f) {
        this.f34571a.mo6374k(i, Float.floatToRawIntBits(f));
    }

    @Override // com.daaw.ki8
    /* renamed from: y */
    public final void mo2644y(int i, y68 y68Var) {
        this.f34571a.mo6375j(i, y68Var);
    }

    @Override // com.daaw.ki8
    /* renamed from: z */
    public final void mo2643z(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                w78 w78Var = this.f34571a;
                int intValue = ((Integer) list.get(i2)).intValue();
                w78Var.mo6365t(i, (intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
            return;
        }
        this.f34571a.mo6366s(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += w78.m6384a((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.f34571a.mo6364u(i3);
        while (i2 < list.size()) {
            w78 w78Var2 = this.f34571a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            w78Var2.mo6364u((intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    @Override // com.daaw.ki8
    @Deprecated
    public final void zzE(int i) {
        this.f34571a.mo6366s(i, 3);
    }
}
