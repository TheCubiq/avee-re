package com.daaw;
/* loaded from: classes.dex */
public final class mc2 implements ac2 {
    public m42 b;
    public boolean c;
    public int e;
    public int f;
    public final ik5 a = new ik5(10);
    public long d = -9223372036854775807L;

    @Override // com.daaw.ac2
    public final void a(ik5 ik5Var) {
        uo4.b(this.b);
        if (this.c) {
            int i = ik5Var.i();
            int i2 = this.f;
            if (i2 < 10) {
                int min = Math.min(i, 10 - i2);
                System.arraycopy(ik5Var.h(), ik5Var.k(), this.a.h(), this.f, min);
                if (this.f + min == 10) {
                    this.a.f(0);
                    if (this.a.s() != 73 || this.a.s() != 68 || this.a.s() != 51) {
                        s95.e("Id3Reader", "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    }
                    this.a.g(3);
                    this.e = this.a.r() + 10;
                }
            }
            int min2 = Math.min(i, this.e - this.f);
            this.b.c(ik5Var, min2);
            this.f += min2;
        }
    }

    @Override // com.daaw.ac2
    public final void b(m09 m09Var, td2 td2Var) {
        td2Var.c();
        m42 n = m09Var.n(td2Var.a(), 5);
        this.b = n;
        b72 b72Var = new b72();
        b72Var.h(td2Var.b());
        b72Var.s("application/id3");
        n.f(b72Var.y());
    }

    @Override // com.daaw.ac2
    public final void c(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        if (j != -9223372036854775807L) {
            this.d = j;
        }
        this.e = 0;
        this.f = 0;
    }

    @Override // com.daaw.ac2
    public final void zzc() {
        int i;
        uo4.b(this.b);
        if (this.c && (i = this.e) != 0 && this.f == i) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                this.b.b(j, 1, i, 0, null);
            }
            this.c = false;
        }
    }

    @Override // com.daaw.ac2
    public final void zze() {
        this.c = false;
        this.d = -9223372036854775807L;
    }
}
