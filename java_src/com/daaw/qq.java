package com.daaw;

import android.os.SystemClock;
import com.daaw.ex0;
import com.daaw.mp;
import com.daaw.tb0;
import com.daaw.vo;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class qq implements vo {
    public final lk0 a;
    public final int[] b;
    public final com.google.android.exoplayer2.trackselection.c c;
    public final int d;
    public final mp e;
    public final long f;
    public final int g;
    public final ex0.c h;
    public final b[] i;
    public wo j;
    public int k;
    public IOException l;
    public boolean m;
    public long n;

    /* loaded from: classes.dex */
    public static final class a implements vo.a {
        public final mp.a a;
        public final int b;

        public a(mp.a aVar) {
            this(aVar, 1);
        }

        public a(mp.a aVar, int i) {
            this.a = aVar;
            this.b = i;
        }

        @Override // com.daaw.vo.a
        public vo a(lk0 lk0Var, wo woVar, int i, int[] iArr, com.google.android.exoplayer2.trackselection.c cVar, int i2, long j, boolean z, boolean z2, ex0.c cVar2) {
            return new qq(lk0Var, woVar, i, iArr, cVar, i2, this.a.a(), j, this.b, z, z2, cVar2);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final ff a;
        public j41 b;
        public bp c;
        public long d;
        public long e;

        public b(long j, int i, j41 j41Var, boolean z, boolean z2, sm1 sm1Var) {
            zz d40Var;
            this.d = j;
            this.b = j41Var;
            String str = j41Var.c.t;
            if (g(str)) {
                this.a = null;
            } else {
                if ("application/x-rawcc".equals(str)) {
                    d40Var = new h31(j41Var.c);
                } else if (h(str)) {
                    d40Var = new un0(1);
                } else {
                    d40Var = new d40(z ? 4 : 0, null, null, null, z2 ? Collections.singletonList(Format.B(null, "application/cea-608", 0, null)) : Collections.emptyList(), sm1Var);
                }
                this.a = new ff(d40Var, i, j41Var.c);
            }
            this.c = j41Var.i();
        }

        public static boolean g(String str) {
            return hq0.l(str) || "application/ttml+xml".equals(str);
        }

        public static boolean h(String str) {
            return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm");
        }

        public long a() {
            return this.c.g() + this.e;
        }

        public int b() {
            return this.c.h(this.d);
        }

        public long c(long j) {
            return e(j) + this.c.c(j - this.e, this.d);
        }

        public long d(long j) {
            return this.c.e(j, this.d) + this.e;
        }

        public long e(long j) {
            return this.c.b(j - this.e);
        }

        public d31 f(long j) {
            return this.c.d(j - this.e);
        }

        public void i(long j, j41 j41Var) {
            int h;
            bp i = this.b.i();
            bp i2 = j41Var.i();
            this.d = j;
            this.b = j41Var;
            if (i == null) {
                return;
            }
            this.c = i2;
            if (i.f() && (h = i.h(this.d)) != 0) {
                long g = (i.g() + h) - 1;
                long b = i.b(g) + i.c(g, this.d);
                long g2 = i2.g();
                long b2 = i2.b(g2);
                if (b == b2) {
                    this.e += (g + 1) - g2;
                } else if (b < b2) {
                    throw new ob();
                } else {
                    this.e += i.e(b2, this.d) - g2;
                }
            }
        }
    }

    public qq(lk0 lk0Var, wo woVar, int i, int[] iArr, com.google.android.exoplayer2.trackselection.c cVar, int i2, mp mpVar, long j, int i3, boolean z, boolean z2, ex0.c cVar2) {
        this.a = lk0Var;
        this.j = woVar;
        this.b = iArr;
        this.c = cVar;
        this.d = i2;
        this.e = mpVar;
        this.k = i;
        this.f = j;
        this.g = i3;
        this.h = cVar2;
        long g = woVar.g(i);
        this.n = -9223372036854775807L;
        ArrayList<j41> j2 = j();
        this.i = new b[cVar.length()];
        for (int i4 = 0; i4 < this.i.length; i4++) {
            this.i[i4] = new b(g, i2, j2.get(cVar.f(i4)), z, z2, cVar2);
        }
    }

    public static ef k(b bVar, mp mpVar, Format format, int i, Object obj, d31 d31Var, d31 d31Var2) {
        String str = bVar.b.d;
        if (d31Var == null || (d31Var2 = d31Var.a(d31Var2, str)) != null) {
            d31Var = d31Var2;
        }
        return new uf0(mpVar, new pp(d31Var.b(str), d31Var.a, d31Var.b, bVar.b.a()), format, i, obj, bVar.a);
    }

    public static ef l(b bVar, mp mpVar, int i, Format format, int i2, Object obj, long j, int i3, long j2) {
        j41 j41Var = bVar.b;
        long e = bVar.e(j);
        d31 f = bVar.f(j);
        String str = j41Var.d;
        if (bVar.a == null) {
            return new pd1(mpVar, new pp(f.b(str), f.a, f.b, j41Var.a()), format, i2, obj, e, bVar.c(j), j, i, format);
        }
        int i4 = 1;
        int i5 = 1;
        while (i4 < i3) {
            d31 a2 = f.a(bVar.f(i4 + j), str);
            if (a2 == null) {
                break;
            }
            i5++;
            i4++;
            f = a2;
        }
        return new fk(mpVar, new pp(f.b(str), f.a, f.b, j41Var.a()), format, i2, obj, e, bVar.c((i5 + j) - 1), j2, j, i5, -j41Var.e, bVar.a);
    }

    @Override // com.daaw.jf
    public void a() {
        IOException iOException = this.l;
        if (iOException != null) {
            throw iOException;
        }
        this.a.a();
    }

    @Override // com.daaw.vo
    public void c(wo woVar, int i) {
        try {
            this.j = woVar;
            this.k = i;
            long g = woVar.g(i);
            ArrayList<j41> j = j();
            for (int i2 = 0; i2 < this.i.length; i2++) {
                this.i[i2].i(g, j.get(this.c.f(i2)));
            }
        } catch (ob e) {
            this.l = e;
        }
    }

    public final long d() {
        return (this.f != 0 ? SystemClock.elapsedRealtime() + this.f : System.currentTimeMillis()) * 1000;
    }

    @Override // com.daaw.jf
    public long e(long j, ea1 ea1Var) {
        b[] bVarArr;
        for (b bVar : this.i) {
            if (bVar.c != null) {
                long d = bVar.d(j);
                long e = bVar.e(d);
                return sq1.S(j, ea1Var, e, (e >= j || d >= ((long) (bVar.b() + (-1)))) ? e : bVar.e(d + 1));
            }
        }
        return j;
    }

    @Override // com.daaw.jf
    public void f(ef efVar) {
        da1 c;
        if (efVar instanceof uf0) {
            b bVar = this.i[this.c.i(((uf0) efVar).c)];
            if (bVar.c == null && (c = bVar.a.c()) != null) {
                bVar.c = new cp((hf) c, bVar.b.e);
            }
        }
        ex0.c cVar = this.h;
        if (cVar != null) {
            cVar.h(efVar);
        }
    }

    @Override // com.daaw.jf
    public boolean g(ef efVar, boolean z, Exception exc) {
        b bVar;
        int b2;
        if (z) {
            ex0.c cVar = this.h;
            if (cVar == null || !cVar.g(efVar)) {
                if (!this.j.d && (efVar instanceof zn0) && (exc instanceof tb0.e) && ((tb0.e) exc).r == 404 && (b2 = (bVar = this.i[this.c.i(efVar.c)]).b()) != -1 && b2 != 0) {
                    if (((zn0) efVar).e() > (bVar.a() + b2) - 1) {
                        this.m = true;
                        return true;
                    }
                }
                com.google.android.exoplayer2.trackselection.c cVar2 = this.c;
                return kf.a(cVar2, cVar2.i(efVar.c), exc);
            }
            return true;
        }
        return false;
    }

    @Override // com.daaw.jf
    public int h(long j, List<? extends zn0> list) {
        return (this.l != null || this.c.length() < 2) ? list.size() : this.c.h(j, list);
    }

    @Override // com.daaw.jf
    public void i(zn0 zn0Var, long j, long j2, gf gfVar) {
        long j3;
        long e;
        boolean z;
        if (this.l != null) {
            return;
        }
        long j4 = j2 - j;
        long m = m(j);
        long a2 = dd.a(this.j.a) + dd.a(this.j.d(this.k).b) + j2;
        ex0.c cVar = this.h;
        if (cVar == null || !cVar.f(a2)) {
            this.c.n(j, j4, m);
            b bVar = this.i[this.c.b()];
            ff ffVar = bVar.a;
            if (ffVar != null) {
                j41 j41Var = bVar.b;
                d31 k = ffVar.b() == null ? j41Var.k() : null;
                d31 j5 = bVar.c == null ? j41Var.j() : null;
                if (k != null || j5 != null) {
                    gfVar.a = k(bVar, this.e, this.c.k(), this.c.l(), this.c.o(), k, j5);
                    return;
                }
            }
            int b2 = bVar.b();
            if (b2 == 0) {
                wo woVar = this.j;
                gfVar.b = !woVar.d || this.k < woVar.e() - 1;
                return;
            }
            long a3 = bVar.a();
            if (b2 == -1) {
                long d = (d() - dd.a(this.j.a)) - dd.a(this.j.d(this.k).b);
                long j6 = this.j.f;
                if (j6 != -9223372036854775807L) {
                    a3 = Math.max(a3, bVar.d(d - dd.a(j6)));
                }
                j3 = bVar.d(d);
            } else {
                j3 = b2 + a3;
            }
            long j7 = j3 - 1;
            long j8 = a3;
            n(bVar, j7);
            if (zn0Var == null) {
                e = sq1.m(bVar.d(j2), j8, j7);
            } else {
                e = zn0Var.e();
                if (e < j8) {
                    this.l = new ob();
                    return;
                }
            }
            long j9 = e;
            if (j9 <= j7 && (!this.m || j9 < j7)) {
                gfVar.a = l(bVar, this.e, this.d, this.c.k(), this.c.l(), this.c.o(), j9, (int) Math.min(this.g, (j7 - j9) + 1), zn0Var == null ? j2 : -9223372036854775807L);
                return;
            }
            wo woVar2 = this.j;
            if (woVar2.d && this.k >= woVar2.e() - 1) {
                z = false;
                gfVar.b = z;
            }
            z = true;
            gfVar.b = z;
        }
    }

    public final ArrayList<j41> j() {
        List<e1> list = this.j.d(this.k).c;
        ArrayList<j41> arrayList = new ArrayList<>();
        for (int i : this.b) {
            arrayList.addAll(list.get(i).c);
        }
        return arrayList;
    }

    public final long m(long j) {
        if (this.j.d && this.n != -9223372036854775807L) {
            return this.n - j;
        }
        return -9223372036854775807L;
    }

    public final void n(b bVar, long j) {
        this.n = this.j.d ? bVar.c(j) : -9223372036854775807L;
    }
}
