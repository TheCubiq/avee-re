package com.daaw;
/* loaded from: classes.dex */
public final class lb2 implements ac2 {

    /* renamed from: a */
    public final cj5 f17209a;

    /* renamed from: b */
    public final ik5 f17210b;

    /* renamed from: c */
    public final String f17211c;

    /* renamed from: d */
    public String f17212d;

    /* renamed from: e */
    public m42 f17213e;

    /* renamed from: f */
    public int f17214f;

    /* renamed from: g */
    public int f17215g;

    /* renamed from: h */
    public boolean f17216h;

    /* renamed from: i */
    public long f17217i;

    /* renamed from: j */
    public f92 f17218j;

    /* renamed from: k */
    public int f17219k;

    /* renamed from: l */
    public long f17220l;

    public lb2(String str) {
        cj5 cj5Var = new cj5(new byte[128], 128);
        this.f17209a = cj5Var;
        this.f17210b = new ik5(cj5Var.f5841a);
        this.f17214f = 0;
        this.f17220l = -9223372036854775807L;
        this.f17211c = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ee, code lost:
        if (r12.m19703s() == 11) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f0, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f2, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0114, code lost:
        if (r0 == 11) goto L13;
     */
    @Override // com.daaw.ac2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2553a(ik5 ik5Var) {
        boolean z;
        uo4.m7876b(this.f17213e);
        while (ik5Var.m19713i() > 0) {
            int i = this.f17214f;
            if (i == 0) {
                while (true) {
                    if (ik5Var.m19713i() <= 0) {
                        break;
                    }
                    if (this.f17216h) {
                        int m19703s = ik5Var.m19703s();
                        if (m19703s == 119) {
                            this.f17216h = false;
                            this.f17214f = 1;
                            ik5 ik5Var2 = this.f17210b;
                            ik5Var2.m19714h()[0] = 11;
                            ik5Var2.m19714h()[1] = 119;
                            this.f17215g = 2;
                            break;
                        }
                    }
                    this.f17216h = z;
                }
            } else if (i != 1) {
                int min = Math.min(ik5Var.m19713i(), this.f17219k - this.f17215g);
                this.f17213e.mo16221c(ik5Var, min);
                int i2 = this.f17215g + min;
                this.f17215g = i2;
                int i3 = this.f17219k;
                if (i2 == i3) {
                    long j = this.f17220l;
                    if (j != -9223372036854775807L) {
                        this.f17213e.mo16222b(j, 1, i3, 0, null);
                        this.f17220l += this.f17217i;
                    }
                    this.f17214f = 0;
                }
            } else {
                byte[] m19714h = this.f17210b.m19714h();
                int min2 = Math.min(ik5Var.m19713i(), 128 - this.f17215g);
                ik5Var.m19720b(m19714h, this.f17215g, min2);
                int i4 = this.f17215g + min2;
                this.f17215g = i4;
                if (i4 == 128) {
                    this.f17209a.m25324h(0);
                    bz8 m24850e = cz8.m24850e(this.f17209a);
                    f92 f92Var = this.f17218j;
                    if (f92Var == null || m24850e.f5303c != f92Var.f9288y || m24850e.f5302b != f92Var.f9289z || !it5.m19376t(m24850e.f5301a, f92Var.f9275l)) {
                        b72 b72Var = new b72();
                        b72Var.m26384h(this.f17212d);
                        b72Var.m26372s(m24850e.f5301a);
                        b72Var.m26389e0(m24850e.f5303c);
                        b72Var.m26371t(m24850e.f5302b);
                        b72Var.m26380k(this.f17211c);
                        f92 m26366y = b72Var.m26366y();
                        this.f17218j = m26366y;
                        this.f17213e.mo16218f(m26366y);
                    }
                    this.f17219k = m24850e.f5304d;
                    this.f17217i = (m24850e.f5305e * 1000000) / this.f17218j.f9289z;
                    this.f17210b.m19716f(0);
                    this.f17213e.mo16221c(this.f17210b, 128);
                    this.f17214f = 2;
                }
            }
        }
    }

    @Override // com.daaw.ac2
    /* renamed from: b */
    public final void mo2552b(m09 m09Var, td2 td2Var) {
        td2Var.m9282c();
        this.f17212d = td2Var.m9283b();
        this.f17213e = m09Var.mo3292n(td2Var.m9284a(), 1);
    }

    @Override // com.daaw.ac2
    /* renamed from: c */
    public final void mo2551c(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f17220l = j;
        }
    }

    @Override // com.daaw.ac2
    public final void zzc() {
    }

    @Override // com.daaw.ac2
    public final void zze() {
        this.f17214f = 0;
        this.f17215g = 0;
        this.f17216h = false;
        this.f17220l = -9223372036854775807L;
    }
}
