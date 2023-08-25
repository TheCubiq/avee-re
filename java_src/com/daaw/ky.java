package com.daaw;

import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public final class ky implements d81 {
    public final Format p;
    public long[] r;
    public boolean s;
    public sy t;
    public boolean u;
    public int v;
    public final jy q = new jy();
    public long w = -9223372036854775807L;

    public ky(sy syVar, Format format, boolean z) {
        this.p = format;
        this.t = syVar;
        this.r = syVar.b;
        e(syVar, z);
    }

    @Override // com.daaw.d81
    public void a() {
    }

    public String b() {
        return this.t.a();
    }

    public void c(long j) {
        boolean z = true;
        int c = sq1.c(this.r, j, true, false);
        this.v = c;
        if (!((this.s && c == this.r.length) ? false : false)) {
            j = -9223372036854775807L;
        }
        this.w = j;
    }

    @Override // com.daaw.d81
    public boolean d() {
        return true;
    }

    public void e(sy syVar, boolean z) {
        int i = this.v;
        long j = i == 0 ? -9223372036854775807L : this.r[i - 1];
        this.s = z;
        this.t = syVar;
        long[] jArr = syVar.b;
        this.r = jArr;
        long j2 = this.w;
        if (j2 != -9223372036854775807L) {
            c(j2);
        } else if (j != -9223372036854775807L) {
            this.v = sq1.c(jArr, j, false, false);
        }
    }

    @Override // com.daaw.d81
    public int j(k30 k30Var, gq gqVar, boolean z) {
        if (z || !this.u) {
            k30Var.a = this.p;
            this.u = true;
            return -5;
        }
        int i = this.v;
        if (i == this.r.length) {
            if (this.s) {
                return -3;
            }
            gqVar.l(4);
            return -4;
        }
        this.v = i + 1;
        jy jyVar = this.q;
        sy syVar = this.t;
        byte[] a = jyVar.a(syVar.a[i], syVar.e);
        if (a != null) {
            gqVar.n(a.length);
            gqVar.l(1);
            gqVar.r.put(a);
            gqVar.s = this.r[i];
            return -4;
        }
        return -3;
    }

    @Override // com.daaw.d81
    public int n(long j) {
        int max = Math.max(this.v, sq1.c(this.r, j, true, false));
        int i = max - this.v;
        this.v = max;
        return i;
    }
}
