package com.daaw;

import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public final class pd1 extends sa {
    public final int m;
    public final Format n;
    public volatile int o;
    public volatile boolean p;

    public pd1(mp mpVar, pp ppVar, Format format, int i, Object obj, long j, long j2, long j3, int i2, Format format2) {
        super(mpVar, ppVar, format, i, obj, j, j2, -9223372036854775807L, j3);
        this.m = i2;
        this.n = format2;
    }

    @Override // com.daaw.jk0.c
    public void a() {
        try {
            long c = this.h.c(this.a.b(this.o));
            if (c != -1) {
                c += this.o;
            }
            wq wqVar = new wq(this.h, this.o, c);
            ta h = h();
            h.c(0L);
            sm1 a = h.a(0, this.m);
            a.d(this.n);
            for (int i = 0; i != -1; i = a.b(wqVar, Integer.MAX_VALUE, true)) {
                this.o += i;
            }
            a.a(this.f, 1, this.o, 0, null);
            sq1.h(this.h);
            this.p = true;
        } catch (Throwable th) {
            sq1.h(this.h);
            throw th;
        }
    }

    @Override // com.daaw.jk0.c
    public void b() {
    }

    @Override // com.daaw.ef
    public long c() {
        return this.o;
    }

    @Override // com.daaw.zn0
    public boolean f() {
        return this.p;
    }
}
