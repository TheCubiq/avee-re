package com.daaw;

import android.net.Uri;
import com.daaw.mp;
import com.daaw.we1;
import com.daaw.xe1;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.util.List;
/* loaded from: classes.dex */
public class yr implements we1 {
    public final lk0 a;
    public final int b;
    public final com.google.android.exoplayer2.trackselection.c c;
    public final ff[] d;
    public final mp e;
    public xe1 f;
    public int g;
    public IOException h;

    /* loaded from: classes.dex */
    public static final class a implements we1.a {
        public final mp.a a;

        public a(mp.a aVar) {
            this.a = aVar;
        }

        @Override // com.daaw.we1.a
        public we1 a(lk0 lk0Var, xe1 xe1Var, int i, com.google.android.exoplayer2.trackselection.c cVar, pm1[] pm1VarArr) {
            return new yr(lk0Var, xe1Var, i, cVar, this.a.a(), pm1VarArr);
        }
    }

    public yr(lk0 lk0Var, xe1 xe1Var, int i, com.google.android.exoplayer2.trackselection.c cVar, mp mpVar, pm1[] pm1VarArr) {
        this.a = lk0Var;
        this.f = xe1Var;
        this.b = i;
        this.c = cVar;
        this.e = mpVar;
        xe1.b bVar = xe1Var.f[i];
        this.d = new ff[cVar.length()];
        int i2 = 0;
        while (i2 < this.d.length) {
            int f = cVar.f(i2);
            Format format = bVar.j[f];
            int i3 = bVar.a;
            int i4 = i2;
            this.d[i4] = new ff(new d40(3, null, new nm1(f, i3, bVar.c, -9223372036854775807L, xe1Var.g, format, 0, pm1VarArr, i3 == 2 ? 4 : 0, null, null), null), bVar.a, format);
            i2 = i4 + 1;
        }
    }

    public static zn0 d(Format format, mp mpVar, Uri uri, String str, int i, long j, long j2, long j3, int i2, Object obj, ff ffVar) {
        return new fk(mpVar, new pp(uri, 0L, -1L, str), format, i2, obj, j, j2, j3, i, 1, j, ffVar);
    }

    @Override // com.daaw.jf
    public void a() {
        IOException iOException = this.h;
        if (iOException != null) {
            throw iOException;
        }
        this.a.a();
    }

    @Override // com.daaw.we1
    public void b(xe1 xe1Var) {
        xe1.b[] bVarArr = this.f.f;
        int i = this.b;
        xe1.b bVar = bVarArr[i];
        int i2 = bVar.k;
        xe1.b bVar2 = xe1Var.f[i];
        if (i2 != 0 && bVar2.k != 0) {
            int i3 = i2 - 1;
            long e = bVar.e(i3) + bVar.c(i3);
            long e2 = bVar2.e(0);
            if (e > e2) {
                this.g += bVar.d(e2);
                this.f = xe1Var;
            }
        }
        this.g += i2;
        this.f = xe1Var;
    }

    @Override // com.daaw.jf
    public long e(long j, ea1 ea1Var) {
        xe1.b bVar = this.f.f[this.b];
        int d = bVar.d(j);
        long e = bVar.e(d);
        return sq1.S(j, ea1Var, e, (e >= j || d >= bVar.k + (-1)) ? e : bVar.e(d + 1));
    }

    @Override // com.daaw.jf
    public void f(ef efVar) {
    }

    @Override // com.daaw.jf
    public boolean g(ef efVar, boolean z, Exception exc) {
        if (z) {
            com.google.android.exoplayer2.trackselection.c cVar = this.c;
            if (kf.a(cVar, cVar.i(efVar.c), exc)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.jf
    public int h(long j, List<? extends zn0> list) {
        return (this.h != null || this.c.length() < 2) ? list.size() : this.c.h(j, list);
    }

    @Override // com.daaw.jf
    public final void i(zn0 zn0Var, long j, long j2, gf gfVar) {
        int e;
        if (this.h != null) {
            return;
        }
        xe1 xe1Var = this.f;
        xe1.b bVar = xe1Var.f[this.b];
        if (bVar.k == 0) {
            gfVar.b = !xe1Var.d;
            return;
        }
        if (zn0Var == null) {
            e = bVar.d(j2);
        } else {
            e = (int) (zn0Var.e() - this.g);
            if (e < 0) {
                this.h = new ob();
                return;
            }
        }
        int i = e;
        if (i >= bVar.k) {
            gfVar.b = !this.f.d;
            return;
        }
        this.c.n(j, j2 - j, j(j));
        long e2 = bVar.e(i);
        long c = e2 + bVar.c(i);
        long j3 = zn0Var == null ? j2 : -9223372036854775807L;
        int i2 = i + this.g;
        int b = this.c.b();
        gfVar.a = d(this.c.k(), this.e, bVar.a(this.c.f(b), i), null, i2, e2, c, j3, this.c.l(), this.c.o(), this.d[b]);
    }

    public final long j(long j) {
        xe1 xe1Var = this.f;
        if (xe1Var.d) {
            xe1.b bVar = xe1Var.f[this.b];
            int i = bVar.k - 1;
            return (bVar.e(i) + bVar.c(i)) - j;
        }
        return -9223372036854775807L;
    }
}
