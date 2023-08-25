package com.daaw;

import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public class fk extends sa {
    public final int m;
    public final long n;
    public final ff o;
    public volatile int p;
    public volatile boolean q;
    public volatile boolean r;

    public fk(mp mpVar, pp ppVar, Format format, int i, Object obj, long j, long j2, long j3, long j4, int i2, long j5, ff ffVar) {
        super(mpVar, ppVar, format, i, obj, j, j2, j3, j4);
        this.m = i2;
        this.n = j5;
        this.o = ffVar;
    }

    @Override // com.daaw.jk0.c
    public final void a() {
        pp b = this.a.b(this.p);
        try {
            mp mpVar = this.h;
            wq wqVar = new wq(mpVar, b.c, mpVar.c(b));
            if (this.p == 0) {
                ta h = h();
                h.c(this.n);
                ff ffVar = this.o;
                long j = this.j;
                ffVar.e(h, j == -9223372036854775807L ? 0L : j - this.n);
            }
            zz zzVar = this.o.p;
            int i = 0;
            while (i == 0 && !this.q) {
                i = zzVar.d(wqVar, null);
            }
            s6.f(i != 1);
            this.p = (int) (wqVar.getPosition() - this.a.c);
            sq1.h(this.h);
            this.r = true;
        } catch (Throwable th) {
            sq1.h(this.h);
            throw th;
        }
    }

    @Override // com.daaw.jk0.c
    public final void b() {
        this.q = true;
    }

    @Override // com.daaw.ef
    public final long c() {
        return this.p;
    }

    @Override // com.daaw.zn0
    public long e() {
        return this.i + this.m;
    }

    @Override // com.daaw.zn0
    public boolean f() {
        return this.r;
    }
}
