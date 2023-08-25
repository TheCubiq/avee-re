package com.daaw;
/* loaded from: classes.dex */
public final class mc2 implements ac2 {

    /* renamed from: b */
    public m42 f18784b;

    /* renamed from: c */
    public boolean f18785c;

    /* renamed from: e */
    public int f18787e;

    /* renamed from: f */
    public int f18788f;

    /* renamed from: a */
    public final ik5 f18783a = new ik5(10);

    /* renamed from: d */
    public long f18786d = -9223372036854775807L;

    @Override // com.daaw.ac2
    /* renamed from: a */
    public final void mo2553a(ik5 ik5Var) {
        uo4.m7876b(this.f18784b);
        if (this.f18785c) {
            int m19713i = ik5Var.m19713i();
            int i = this.f18788f;
            if (i < 10) {
                int min = Math.min(m19713i, 10 - i);
                System.arraycopy(ik5Var.m19714h(), ik5Var.m19711k(), this.f18783a.m19714h(), this.f18788f, min);
                if (this.f18788f + min == 10) {
                    this.f18783a.m19716f(0);
                    if (this.f18783a.m19703s() != 73 || this.f18783a.m19703s() != 68 || this.f18783a.m19703s() != 51) {
                        s95.m10493e("Id3Reader", "Discarding invalid ID3 tag");
                        this.f18785c = false;
                        return;
                    }
                    this.f18783a.m19715g(3);
                    this.f18787e = this.f18783a.m19704r() + 10;
                }
            }
            int min2 = Math.min(m19713i, this.f18787e - this.f18788f);
            this.f18784b.mo16221c(ik5Var, min2);
            this.f18788f += min2;
        }
    }

    @Override // com.daaw.ac2
    /* renamed from: b */
    public final void mo2552b(m09 m09Var, td2 td2Var) {
        td2Var.m9282c();
        m42 mo3292n = m09Var.mo3292n(td2Var.m9284a(), 5);
        this.f18784b = mo3292n;
        b72 b72Var = new b72();
        b72Var.m26384h(td2Var.m9283b());
        b72Var.m26372s("application/id3");
        mo3292n.mo16218f(b72Var.m26366y());
    }

    @Override // com.daaw.ac2
    /* renamed from: c */
    public final void mo2551c(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f18785c = true;
        if (j != -9223372036854775807L) {
            this.f18786d = j;
        }
        this.f18787e = 0;
        this.f18788f = 0;
    }

    @Override // com.daaw.ac2
    public final void zzc() {
        int i;
        uo4.m7876b(this.f18784b);
        if (this.f18785c && (i = this.f18787e) != 0 && this.f18788f == i) {
            long j = this.f18786d;
            if (j != -9223372036854775807L) {
                this.f18784b.mo16222b(j, 1, i, 0, null);
            }
            this.f18785c = false;
        }
    }

    @Override // com.daaw.ac2
    public final void zze() {
        this.f18785c = false;
        this.f18786d = -9223372036854775807L;
    }
}
