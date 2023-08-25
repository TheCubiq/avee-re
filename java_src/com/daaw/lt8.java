package com.daaw;

import com.google.android.gms.internal.ads.zzx;
import java.util.Objects;
/* loaded from: classes.dex */
public final class lt8 implements m42 {

    /* renamed from: A */
    public boolean f17747A;

    /* renamed from: B */
    public boolean f17748B;

    /* renamed from: C */
    public xn8 f17749C;

    /* renamed from: a */
    public final ft8 f17750a;

    /* renamed from: d */
    public final vn8 f17753d;

    /* renamed from: e */
    public final jn8 f17754e;

    /* renamed from: f */
    public kt8 f17755f;

    /* renamed from: g */
    public f92 f17756g;

    /* renamed from: o */
    public int f17764o;

    /* renamed from: p */
    public int f17765p;

    /* renamed from: q */
    public int f17766q;

    /* renamed from: r */
    public int f17767r;

    /* renamed from: v */
    public boolean f17771v;

    /* renamed from: y */
    public f92 f17774y;

    /* renamed from: z */
    public f92 f17775z;

    /* renamed from: b */
    public final ht8 f17751b = new ht8();

    /* renamed from: h */
    public int f17757h = 1000;

    /* renamed from: i */
    public int[] f17758i = new int[1000];

    /* renamed from: j */
    public long[] f17759j = new long[1000];

    /* renamed from: m */
    public long[] f17762m = new long[1000];

    /* renamed from: l */
    public int[] f17761l = new int[1000];

    /* renamed from: k */
    public int[] f17760k = new int[1000];

    /* renamed from: n */
    public l42[] f17763n = new l42[1000];

    /* renamed from: c */
    public final yt8 f17752c = new yt8(new gt4() { // from class: com.daaw.gt8
    });

    /* renamed from: s */
    public long f17768s = Long.MIN_VALUE;

    /* renamed from: t */
    public long f17769t = Long.MIN_VALUE;

    /* renamed from: u */
    public long f17770u = Long.MIN_VALUE;

    /* renamed from: x */
    public boolean f17773x = true;

    /* renamed from: w */
    public boolean f17772w = true;

    public lt8(nw8 nw8Var, vn8 vn8Var, jn8 jn8Var, byte[] bArr) {
        this.f17753d = vn8Var;
        this.f17754e = jn8Var;
        this.f17750a = new ft8(nw8Var, null);
    }

    /* renamed from: A */
    public static /* synthetic */ void m16556A(jt8 jt8Var) {
        tn8 tn8Var = jt8Var.f15409b;
        int i = rn8.f25430a;
    }

    /* renamed from: B */
    public final void m16555B() {
        xn8 xn8Var = this.f17749C;
        if (xn8Var != null) {
            throw xn8Var.m4938a();
        }
    }

    /* renamed from: C */
    public final void m16554C() {
        m16525z();
        m16537n();
    }

    /* renamed from: D */
    public final void m16553D() {
        m16552E(true);
        m16537n();
    }

    /* renamed from: E */
    public final void m16552E(boolean z) {
        this.f17750a.m22279f();
        this.f17764o = 0;
        this.f17765p = 0;
        this.f17766q = 0;
        this.f17767r = 0;
        this.f17772w = true;
        this.f17768s = Long.MIN_VALUE;
        this.f17769t = Long.MIN_VALUE;
        this.f17770u = Long.MIN_VALUE;
        this.f17771v = false;
        this.f17752c.m3225d();
        if (z) {
            this.f17774y = null;
            this.f17775z = null;
            this.f17773x = true;
        }
    }

    /* renamed from: F */
    public final void m16551F(long j) {
        this.f17768s = j;
    }

    /* renamed from: G */
    public final void m16550G(kt8 kt8Var) {
        this.f17755f = kt8Var;
    }

    /* renamed from: H */
    public final synchronized void m16549H(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.f17767r + i <= this.f17764o) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        uo4.m7874d(z);
        this.f17767r += i;
    }

    /* renamed from: I */
    public final synchronized boolean m16548I() {
        return this.f17771v;
    }

    /* renamed from: J */
    public final synchronized boolean m16547J(boolean z) {
        boolean z2 = true;
        if (m16535p()) {
            if (((jt8) this.f17752c.m3228a(this.f17765p + this.f17767r)).f15408a != this.f17756g) {
                return true;
            }
            return m16534q(m16544g(this.f17767r));
        }
        if (!z && !this.f17771v) {
            f92 f92Var = this.f17775z;
            if (f92Var == null) {
                z2 = false;
            } else if (f92Var == this.f17756g) {
                return false;
            }
        }
        return z2;
    }

    /* renamed from: K */
    public final synchronized boolean m16546K(long j, boolean z) {
        m16536o();
        int i = this.f17767r;
        int m16544g = m16544g(i);
        if (!m16535p() || j < this.f17762m[m16544g] || (j > this.f17770u && !z)) {
            return false;
        }
        int m16545L = m16545L(m16544g, this.f17764o - i, j, true);
        if (m16545L == -1) {
            return false;
        }
        this.f17768s = j;
        this.f17767r += m16545L;
        return true;
    }

    /* renamed from: L */
    public final int m16545L(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.f17762m[i];
            if (j2 > j) {
                return i3;
            }
            if (!z || (this.f17761l[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f17757h) {
                i = 0;
            }
        }
        return i3;
    }

    @Override // com.daaw.m42
    /* renamed from: a */
    public final void mo16223a(ik5 ik5Var, int i, int i2) {
        this.f17750a.m22277h(ik5Var, i);
    }

    @Override // com.daaw.m42
    /* renamed from: b */
    public final void mo16222b(long j, int i, int i2, int i3, l42 l42Var) {
        int i4 = i & 1;
        if (this.f17772w) {
            if (i4 == 0) {
                return;
            }
            this.f17772w = false;
        }
        if (this.f17747A) {
            if (j < this.f17768s) {
                return;
            }
            if (i4 == 0) {
                if (!this.f17748B) {
                    s95.m10493e("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.f17775z)));
                    this.f17748B = true;
                }
                i |= 1;
            }
        }
        m16539l(j, i, (this.f17750a.m22283b() - i2) - i3, i2, l42Var);
    }

    @Override // com.daaw.m42
    /* renamed from: c */
    public final /* synthetic */ void mo16221c(ik5 ik5Var, int i) {
        k42.m18050b(this, ik5Var, i);
    }

    @Override // com.daaw.m42
    /* renamed from: d */
    public final int mo16220d(xp8 xp8Var, int i, boolean z, int i2) {
        return this.f17750a.m22284a(xp8Var, i, z);
    }

    @Override // com.daaw.m42
    /* renamed from: e */
    public final /* synthetic */ int mo16219e(xp8 xp8Var, int i, boolean z) {
        return k42.m18051a(this, xp8Var, i, z);
    }

    @Override // com.daaw.m42
    /* renamed from: f */
    public final void mo16218f(f92 f92Var) {
        this.f17774y = f92Var;
        boolean m16533r = m16533r(f92Var);
        kt8 kt8Var = this.f17755f;
        if (kt8Var == null || !m16533r) {
            return;
        }
        kt8Var.mo3294l(f92Var);
    }

    /* renamed from: g */
    public final int m16544g(int i) {
        int i2 = this.f17766q + i;
        int i3 = this.f17757h;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* renamed from: h */
    public final synchronized int m16543h(a78 a78Var, ma7 ma7Var, boolean z, boolean z2, ht8 ht8Var) {
        ma7Var.f18729d = false;
        if (!m16535p()) {
            if (!z2 && !this.f17771v) {
                f92 f92Var = this.f17775z;
                if (f92Var == null || (!z && f92Var == this.f17756g)) {
                    return -3;
                }
                m16538m(f92Var, a78Var);
                return -5;
            }
            ma7Var.m20163c(4);
            return -4;
        }
        f92 f92Var2 = ((jt8) this.f17752c.m3228a(this.f17765p + this.f17767r)).f15408a;
        if (!z && f92Var2 == this.f17756g) {
            int m16544g = m16544g(this.f17767r);
            if (!m16534q(m16544g)) {
                ma7Var.f18729d = true;
                return -3;
            }
            ma7Var.m20163c(this.f17761l[m16544g]);
            long j = this.f17762m[m16544g];
            ma7Var.f18730e = j;
            if (j < this.f17768s) {
                ma7Var.m20164a(Integer.MIN_VALUE);
            }
            ht8Var.f12925a = this.f17760k[m16544g];
            ht8Var.f12926b = this.f17759j[m16544g];
            ht8Var.f12927c = this.f17763n[m16544g];
            return -4;
        }
        m16538m(f92Var2, a78Var);
        return -5;
    }

    /* renamed from: i */
    public final synchronized long m16542i(long j, boolean z, boolean z2) {
        int i;
        int i2 = this.f17764o;
        if (i2 != 0) {
            long[] jArr = this.f17762m;
            int i3 = this.f17766q;
            if (j >= jArr[i3]) {
                if (z2 && (i = this.f17767r) != i2) {
                    i2 = i + 1;
                }
                int m16545L = m16545L(i3, i2, j, false);
                if (m16545L == -1) {
                    return -1L;
                }
                return m16540k(m16545L);
            }
        }
        return -1L;
    }

    /* renamed from: j */
    public final synchronized long m16541j() {
        int i = this.f17764o;
        if (i == 0) {
            return -1L;
        }
        return m16540k(i);
    }

    /* renamed from: k */
    public final long m16540k(int i) {
        int i2;
        long j = this.f17769t;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int m16544g = m16544g(i - 1);
            for (int i3 = 0; i3 < i; i3++) {
                j2 = Math.max(j2, this.f17762m[m16544g]);
                if ((this.f17761l[m16544g] & 1) != 0) {
                    break;
                }
                m16544g--;
                if (m16544g == -1) {
                    m16544g = this.f17757h - 1;
                }
            }
        }
        this.f17769t = Math.max(j, j2);
        this.f17764o -= i;
        int i4 = this.f17765p + i;
        this.f17765p = i4;
        int i5 = this.f17766q + i;
        this.f17766q = i5;
        int i6 = this.f17757h;
        if (i5 >= i6) {
            this.f17766q = i5 - i6;
        }
        int i7 = this.f17767r - i;
        this.f17767r = i7;
        if (i7 < 0) {
            this.f17767r = 0;
        }
        this.f17752c.m3224e(i4);
        if (this.f17764o == 0) {
            int i8 = this.f17766q;
            if (i8 == 0) {
                i8 = this.f17757h;
            }
            return this.f17759j[i8 - 1] + this.f17760k[i2];
        }
        return this.f17759j[this.f17766q];
    }

    /* renamed from: l */
    public final synchronized void m16539l(long j, int i, long j2, int i2, l42 l42Var) {
        int i3 = this.f17764o;
        if (i3 > 0) {
            int m16544g = m16544g(i3 - 1);
            uo4.m7874d(this.f17759j[m16544g] + ((long) this.f17760k[m16544g]) <= j2);
        }
        this.f17771v = (536870912 & i) != 0;
        this.f17770u = Math.max(this.f17770u, j);
        int m16544g2 = m16544g(this.f17764o);
        this.f17762m[m16544g2] = j;
        this.f17759j[m16544g2] = j2;
        this.f17760k[m16544g2] = i2;
        this.f17761l[m16544g2] = i;
        this.f17763n[m16544g2] = l42Var;
        this.f17758i[m16544g2] = 0;
        if (this.f17752c.m3223f() || !((jt8) this.f17752c.m3227b()).f15408a.equals(this.f17775z)) {
            tn8 tn8Var = tn8.f27900a;
            yt8 yt8Var = this.f17752c;
            int i4 = this.f17765p + this.f17764o;
            f92 f92Var = this.f17775z;
            Objects.requireNonNull(f92Var);
            yt8Var.m3226c(i4, new jt8(f92Var, tn8Var, null));
        }
        int i5 = this.f17764o + 1;
        this.f17764o = i5;
        int i6 = this.f17757h;
        if (i5 == i6) {
            int i7 = i6 + 1000;
            int[] iArr = new int[i7];
            long[] jArr = new long[i7];
            long[] jArr2 = new long[i7];
            int[] iArr2 = new int[i7];
            int[] iArr3 = new int[i7];
            l42[] l42VarArr = new l42[i7];
            int i8 = this.f17766q;
            int i9 = i6 - i8;
            System.arraycopy(this.f17759j, i8, jArr, 0, i9);
            System.arraycopy(this.f17762m, this.f17766q, jArr2, 0, i9);
            System.arraycopy(this.f17761l, this.f17766q, iArr2, 0, i9);
            System.arraycopy(this.f17760k, this.f17766q, iArr3, 0, i9);
            System.arraycopy(this.f17763n, this.f17766q, l42VarArr, 0, i9);
            System.arraycopy(this.f17758i, this.f17766q, iArr, 0, i9);
            int i10 = this.f17766q;
            System.arraycopy(this.f17759j, 0, jArr, i9, i10);
            System.arraycopy(this.f17762m, 0, jArr2, i9, i10);
            System.arraycopy(this.f17761l, 0, iArr2, i9, i10);
            System.arraycopy(this.f17760k, 0, iArr3, i9, i10);
            System.arraycopy(this.f17763n, 0, l42VarArr, i9, i10);
            System.arraycopy(this.f17758i, 0, iArr, i9, i10);
            this.f17759j = jArr;
            this.f17762m = jArr2;
            this.f17761l = iArr2;
            this.f17760k = iArr3;
            this.f17763n = l42VarArr;
            this.f17758i = iArr;
            this.f17766q = 0;
            this.f17757h = i7;
        }
    }

    /* renamed from: m */
    public final void m16538m(f92 f92Var, a78 a78Var) {
        f92 f92Var2 = this.f17756g;
        boolean z = f92Var2 == null;
        zzx zzxVar = z ? null : f92Var2.f9278o;
        this.f17756g = f92Var;
        zzx zzxVar2 = f92Var.f9278o;
        a78Var.f2960a = f92Var.m22829c(this.f17753d.mo6977a(f92Var));
        a78Var.f2961b = this.f17749C;
        if (z || !it5.m19376t(zzxVar, zzxVar2)) {
            xn8 xn8Var = f92Var.f9278o != null ? new xn8(new fn8(new bo8(1), 6001)) : null;
            this.f17749C = xn8Var;
            a78Var.f2961b = xn8Var;
        }
    }

    /* renamed from: n */
    public final void m16537n() {
        if (this.f17749C != null) {
            this.f17749C = null;
            this.f17756g = null;
        }
    }

    /* renamed from: o */
    public final synchronized void m16536o() {
        this.f17767r = 0;
        this.f17750a.m22278g();
    }

    /* renamed from: p */
    public final boolean m16535p() {
        return this.f17767r != this.f17764o;
    }

    /* renamed from: q */
    public final boolean m16534q(int i) {
        if (this.f17749C != null) {
            return (this.f17761l[i] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    /* renamed from: r */
    public final synchronized boolean m16533r(f92 f92Var) {
        this.f17773x = false;
        if (it5.m19376t(f92Var, this.f17775z)) {
            return false;
        }
        if (!this.f17752c.m3223f() && ((jt8) this.f17752c.m3227b()).f15408a.equals(f92Var)) {
            f92Var = ((jt8) this.f17752c.m3227b()).f15408a;
        }
        this.f17775z = f92Var;
        f92 f92Var2 = this.f17775z;
        this.f17747A = ak3.m27384f(f92Var2.f9275l, f92Var2.f9272i);
        this.f17748B = false;
        return true;
    }

    /* renamed from: s */
    public final int m16532s() {
        return this.f17765p + this.f17767r;
    }

    /* renamed from: t */
    public final synchronized int m16531t(long j, boolean z) {
        int i = this.f17767r;
        int m16544g = m16544g(i);
        if (m16535p() && j >= this.f17762m[m16544g]) {
            if (j > this.f17770u && z) {
                return this.f17764o - i;
            }
            int m16545L = m16545L(m16544g, this.f17764o - i, j, true);
            if (m16545L == -1) {
                return 0;
            }
            return m16545L;
        }
        return 0;
    }

    /* renamed from: u */
    public final int m16530u() {
        return this.f17765p + this.f17764o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r9 != 0) goto L17;
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m16529v(a78 a78Var, ma7 ma7Var, int i, boolean z) {
        int m16543h = m16543h(a78Var, ma7Var, (i & 2) != 0, z, this.f17751b);
        if (m16543h == -4) {
            if (!ma7Var.m20159g()) {
                int i2 = i & 1;
                if ((i & 4) == 0) {
                    if (i2 == 0) {
                        this.f17750a.m22280e(ma7Var, this.f17751b);
                        this.f17767r++;
                        return -4;
                    }
                    this.f17750a.m22281d(ma7Var, this.f17751b);
                }
            }
            return -4;
        }
        return m16543h;
    }

    /* renamed from: w */
    public final synchronized long m16528w() {
        return this.f17770u;
    }

    /* renamed from: x */
    public final synchronized f92 m16527x() {
        if (this.f17773x) {
            return null;
        }
        return this.f17775z;
    }

    /* renamed from: y */
    public final void m16526y(long j, boolean z, boolean z2) {
        this.f17750a.m22282c(m16542i(j, false, z2));
    }

    /* renamed from: z */
    public final void m16525z() {
        this.f17750a.m22282c(m16541j());
    }
}
