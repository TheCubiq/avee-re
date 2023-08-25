package com.daaw;

import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public final class uf0 extends ef {
    public final ff i;
    public volatile int j;
    public volatile boolean k;

    public uf0(mp mpVar, pp ppVar, Format format, int i, Object obj, ff ffVar) {
        super(mpVar, ppVar, 2, format, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.i = ffVar;
    }

    @Override // com.daaw.jk0.c
    public void a() {
        pp b = this.a.b(this.j);
        try {
            mp mpVar = this.h;
            wq wqVar = new wq(mpVar, b.c, mpVar.c(b));
            if (this.j == 0) {
                this.i.e(null, -9223372036854775807L);
            }
            zz zzVar = this.i.p;
            int i = 0;
            while (i == 0 && !this.k) {
                i = zzVar.d(wqVar, null);
            }
            s6.f(i != 1);
            this.j = (int) (wqVar.getPosition() - this.a.c);
        } finally {
            sq1.h(this.h);
        }
    }

    @Override // com.daaw.jk0.c
    public void b() {
        this.k = true;
    }

    @Override // com.daaw.ef
    public long c() {
        return this.j;
    }
}
