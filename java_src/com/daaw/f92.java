package com.daaw;

import com.google.android.gms.internal.ads.zzbq;
import com.google.android.gms.internal.ads.zzx;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class f92 {
    public static final f92 G = new f92(new b72());
    public static final th8 H = new th8() { // from class: com.daaw.y42
    };
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public int F;
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final String i;
    public final zzbq j;
    public final String k;
    public final String l;
    public final int m;
    public final List n;
    public final zzx o;
    public final long p;
    public final int q;
    public final int r;
    public final float s;
    public final int t;
    public final float u;
    public final byte[] v;
    public final int w;
    public final mo8 x;
    public final int y;
    public final int z;

    public f92(b72 b72Var) {
        this.a = b72.D(b72Var);
        this.b = b72.E(b72Var);
        this.c = it5.p(b72.F(b72Var));
        this.d = b72.W(b72Var);
        this.e = 0;
        int L = b72.L(b72Var);
        this.f = L;
        int T = b72.T(b72Var);
        this.g = T;
        this.h = T != -1 ? T : L;
        this.i = b72.B(b72Var);
        this.j = b72.z(b72Var);
        this.k = b72.C(b72Var);
        this.l = b72.G(b72Var);
        this.m = b72.R(b72Var);
        this.n = b72.H(b72Var) == null ? Collections.emptyList() : b72.H(b72Var);
        zzx b0 = b72.b0(b72Var);
        this.o = b0;
        this.p = b72.Z(b72Var);
        this.q = b72.Y(b72Var);
        this.r = b72.Q(b72Var);
        this.s = b72.A(b72Var);
        this.t = b72.U(b72Var) == -1 ? 0 : b72.U(b72Var);
        this.u = b72.J(b72Var) == -1.0f ? 1.0f : b72.J(b72Var);
        this.v = b72.I(b72Var);
        this.w = b72.X(b72Var);
        this.x = b72.a0(b72Var);
        this.y = b72.M(b72Var);
        this.z = b72.V(b72Var);
        this.A = b72.S(b72Var);
        this.B = b72.O(b72Var) == -1 ? 0 : b72.O(b72Var);
        this.C = b72.P(b72Var) != -1 ? b72.P(b72Var) : 0;
        this.D = b72.K(b72Var);
        this.E = (b72.N(b72Var) != 0 || b0 == null) ? b72.N(b72Var) : 1;
    }

    public final int a() {
        int i;
        int i2 = this.q;
        if (i2 == -1 || (i = this.r) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final b72 b() {
        return new b72(this, null);
    }

    public final f92 c(int i) {
        b72 b72Var = new b72(this, null);
        b72Var.a(i);
        return new f92(b72Var);
    }

    public final boolean d(f92 f92Var) {
        if (this.n.size() == f92Var.n.size()) {
            for (int i = 0; i < this.n.size(); i++) {
                if (!Arrays.equals((byte[]) this.n.get(i), (byte[]) f92Var.n.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && f92.class == obj.getClass()) {
            f92 f92Var = (f92) obj;
            int i2 = this.F;
            if ((i2 == 0 || (i = f92Var.F) == 0 || i2 == i) && this.d == f92Var.d && this.f == f92Var.f && this.g == f92Var.g && this.m == f92Var.m && this.p == f92Var.p && this.q == f92Var.q && this.r == f92Var.r && this.t == f92Var.t && this.w == f92Var.w && this.y == f92Var.y && this.z == f92Var.z && this.A == f92Var.A && this.B == f92Var.B && this.C == f92Var.C && this.D == f92Var.D && this.E == f92Var.E && Float.compare(this.s, f92Var.s) == 0 && Float.compare(this.u, f92Var.u) == 0 && it5.t(this.a, f92Var.a) && it5.t(this.b, f92Var.b) && it5.t(this.i, f92Var.i) && it5.t(this.k, f92Var.k) && it5.t(this.l, f92Var.l) && it5.t(this.c, f92Var.c) && Arrays.equals(this.v, f92Var.v) && it5.t(this.j, f92Var.j) && it5.t(this.x, f92Var.x) && it5.t(this.o, f92Var.o) && d(f92Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.F;
        if (i == 0) {
            String str = this.a;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int hashCode3 = (((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.d) * 961) + this.f) * 31) + this.g) * 31;
            String str4 = this.i;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            zzbq zzbqVar = this.j;
            int hashCode5 = (hashCode4 + (zzbqVar == null ? 0 : zzbqVar.hashCode())) * 31;
            String str5 = this.k;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.l;
            int hashCode7 = ((((((((((((((((((((((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.m) * 31) + ((int) this.p)) * 31) + this.q) * 31) + this.r) * 31) + Float.floatToIntBits(this.s)) * 31) + this.t) * 31) + Float.floatToIntBits(this.u)) * 31) + this.w) * 31) + this.y) * 31) + this.z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E;
            this.F = hashCode7;
            return hashCode7;
        }
        return i;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.k;
        String str4 = this.l;
        String str5 = this.i;
        int i = this.h;
        String str6 = this.c;
        int i2 = this.q;
        int i3 = this.r;
        float f = this.s;
        int i4 = this.y;
        int i5 = this.z;
        return "Format(" + str + ", " + str2 + ", " + str3 + ", " + str4 + ", " + str5 + ", " + i + ", " + str6 + ", [" + i2 + ", " + i3 + ", " + f + "], [" + i4 + ", " + i5 + "])";
    }
}
