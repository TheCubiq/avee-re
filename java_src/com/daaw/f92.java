package com.daaw;

import com.google.android.gms.internal.ads.zzbq;
import com.google.android.gms.internal.ads.zzx;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class f92 {

    /* renamed from: G */
    public static final f92 f9256G = new f92(new b72());

    /* renamed from: H */
    public static final th8 f9257H = new th8() { // from class: com.daaw.y42
    };

    /* renamed from: A */
    public final int f9258A;

    /* renamed from: B */
    public final int f9259B;

    /* renamed from: C */
    public final int f9260C;

    /* renamed from: D */
    public final int f9261D;

    /* renamed from: E */
    public final int f9262E;

    /* renamed from: F */
    public int f9263F;

    /* renamed from: a */
    public final String f9264a;

    /* renamed from: b */
    public final String f9265b;

    /* renamed from: c */
    public final String f9266c;

    /* renamed from: d */
    public final int f9267d;

    /* renamed from: e */
    public final int f9268e;

    /* renamed from: f */
    public final int f9269f;

    /* renamed from: g */
    public final int f9270g;

    /* renamed from: h */
    public final int f9271h;

    /* renamed from: i */
    public final String f9272i;

    /* renamed from: j */
    public final zzbq f9273j;

    /* renamed from: k */
    public final String f9274k;

    /* renamed from: l */
    public final String f9275l;

    /* renamed from: m */
    public final int f9276m;

    /* renamed from: n */
    public final List f9277n;

    /* renamed from: o */
    public final zzx f9278o;

    /* renamed from: p */
    public final long f9279p;

    /* renamed from: q */
    public final int f9280q;

    /* renamed from: r */
    public final int f9281r;

    /* renamed from: s */
    public final float f9282s;

    /* renamed from: t */
    public final int f9283t;

    /* renamed from: u */
    public final float f9284u;

    /* renamed from: v */
    public final byte[] f9285v;

    /* renamed from: w */
    public final int f9286w;

    /* renamed from: x */
    public final mo8 f9287x;

    /* renamed from: y */
    public final int f9288y;

    /* renamed from: z */
    public final int f9289z;

    public f92(b72 b72Var) {
        this.f9264a = b72.m26421D(b72Var);
        this.f9265b = b72.m26420E(b72Var);
        this.f9266c = it5.m19380p(b72.m26419F(b72Var));
        this.f9267d = b72.m26402W(b72Var);
        this.f9268e = 0;
        int m26413L = b72.m26413L(b72Var);
        this.f9269f = m26413L;
        int m26405T = b72.m26405T(b72Var);
        this.f9270g = m26405T;
        this.f9271h = m26405T != -1 ? m26405T : m26413L;
        this.f9272i = b72.m26423B(b72Var);
        this.f9273j = b72.m26365z(b72Var);
        this.f9274k = b72.m26422C(b72Var);
        this.f9275l = b72.m26418G(b72Var);
        this.f9276m = b72.m26407R(b72Var);
        this.f9277n = b72.m26417H(b72Var) == null ? Collections.emptyList() : b72.m26417H(b72Var);
        zzx m26395b0 = b72.m26395b0(b72Var);
        this.f9278o = m26395b0;
        this.f9279p = b72.m26399Z(b72Var);
        this.f9280q = b72.m26400Y(b72Var);
        this.f9281r = b72.m26408Q(b72Var);
        this.f9282s = b72.m26424A(b72Var);
        this.f9283t = b72.m26404U(b72Var) == -1 ? 0 : b72.m26404U(b72Var);
        this.f9284u = b72.m26415J(b72Var) == -1.0f ? 1.0f : b72.m26415J(b72Var);
        this.f9285v = b72.m26416I(b72Var);
        this.f9286w = b72.m26401X(b72Var);
        this.f9287x = b72.m26397a0(b72Var);
        this.f9288y = b72.m26412M(b72Var);
        this.f9289z = b72.m26403V(b72Var);
        this.f9258A = b72.m26406S(b72Var);
        this.f9259B = b72.m26410O(b72Var) == -1 ? 0 : b72.m26410O(b72Var);
        this.f9260C = b72.m26409P(b72Var) != -1 ? b72.m26409P(b72Var) : 0;
        this.f9261D = b72.m26414K(b72Var);
        this.f9262E = (b72.m26411N(b72Var) != 0 || m26395b0 == null) ? b72.m26411N(b72Var) : 1;
    }

    /* renamed from: a */
    public final int m22831a() {
        int i;
        int i2 = this.f9280q;
        if (i2 == -1 || (i = this.f9281r) == -1) {
            return -1;
        }
        return i2 * i;
    }

    /* renamed from: b */
    public final b72 m22830b() {
        return new b72(this, null);
    }

    /* renamed from: c */
    public final f92 m22829c(int i) {
        b72 b72Var = new b72(this, null);
        b72Var.m26398a(i);
        return new f92(b72Var);
    }

    /* renamed from: d */
    public final boolean m22828d(f92 f92Var) {
        if (this.f9277n.size() == f92Var.f9277n.size()) {
            for (int i = 0; i < this.f9277n.size(); i++) {
                if (!Arrays.equals((byte[]) this.f9277n.get(i), (byte[]) f92Var.f9277n.get(i))) {
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
            int i2 = this.f9263F;
            if ((i2 == 0 || (i = f92Var.f9263F) == 0 || i2 == i) && this.f9267d == f92Var.f9267d && this.f9269f == f92Var.f9269f && this.f9270g == f92Var.f9270g && this.f9276m == f92Var.f9276m && this.f9279p == f92Var.f9279p && this.f9280q == f92Var.f9280q && this.f9281r == f92Var.f9281r && this.f9283t == f92Var.f9283t && this.f9286w == f92Var.f9286w && this.f9288y == f92Var.f9288y && this.f9289z == f92Var.f9289z && this.f9258A == f92Var.f9258A && this.f9259B == f92Var.f9259B && this.f9260C == f92Var.f9260C && this.f9261D == f92Var.f9261D && this.f9262E == f92Var.f9262E && Float.compare(this.f9282s, f92Var.f9282s) == 0 && Float.compare(this.f9284u, f92Var.f9284u) == 0 && it5.m19376t(this.f9264a, f92Var.f9264a) && it5.m19376t(this.f9265b, f92Var.f9265b) && it5.m19376t(this.f9272i, f92Var.f9272i) && it5.m19376t(this.f9274k, f92Var.f9274k) && it5.m19376t(this.f9275l, f92Var.f9275l) && it5.m19376t(this.f9266c, f92Var.f9266c) && Arrays.equals(this.f9285v, f92Var.f9285v) && it5.m19376t(this.f9273j, f92Var.f9273j) && it5.m19376t(this.f9287x, f92Var.f9287x) && it5.m19376t(this.f9278o, f92Var.f9278o) && m22828d(f92Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f9263F;
        if (i == 0) {
            String str = this.f9264a;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.f9265b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f9266c;
            int hashCode3 = (((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f9267d) * 961) + this.f9269f) * 31) + this.f9270g) * 31;
            String str4 = this.f9272i;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            zzbq zzbqVar = this.f9273j;
            int hashCode5 = (hashCode4 + (zzbqVar == null ? 0 : zzbqVar.hashCode())) * 31;
            String str5 = this.f9274k;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f9275l;
            int hashCode7 = ((((((((((((((((((((((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f9276m) * 31) + ((int) this.f9279p)) * 31) + this.f9280q) * 31) + this.f9281r) * 31) + Float.floatToIntBits(this.f9282s)) * 31) + this.f9283t) * 31) + Float.floatToIntBits(this.f9284u)) * 31) + this.f9286w) * 31) + this.f9288y) * 31) + this.f9289z) * 31) + this.f9258A) * 31) + this.f9259B) * 31) + this.f9260C) * 31) + this.f9261D) * 31) + this.f9262E;
            this.f9263F = hashCode7;
            return hashCode7;
        }
        return i;
    }

    public final String toString() {
        String str = this.f9264a;
        String str2 = this.f9265b;
        String str3 = this.f9274k;
        String str4 = this.f9275l;
        String str5 = this.f9272i;
        int i = this.f9271h;
        String str6 = this.f9266c;
        int i2 = this.f9280q;
        int i3 = this.f9281r;
        float f = this.f9282s;
        int i4 = this.f9288y;
        int i5 = this.f9289z;
        return "Format(" + str + ", " + str2 + ", " + str3 + ", " + str4 + ", " + str5 + ", " + i + ", " + str6 + ", [" + i2 + ", " + i3 + ", " + f + "], [" + i4 + ", " + i5 + "])";
    }
}
