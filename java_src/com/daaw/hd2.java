package com.daaw;
/* loaded from: classes.dex */
public final class hd2 implements ud2 {

    /* renamed from: a */
    public final gd2 f12424a;

    /* renamed from: b */
    public final ik5 f12425b = new ik5(32);

    /* renamed from: c */
    public int f12426c;

    /* renamed from: d */
    public int f12427d;

    /* renamed from: e */
    public boolean f12428e;

    /* renamed from: f */
    public boolean f12429f;

    public hd2(gd2 gd2Var) {
        this.f12424a = gd2Var;
    }

    @Override // com.daaw.ud2
    /* renamed from: a */
    public final void mo8317a(ik5 ik5Var, int i) {
        int i2 = i & 1;
        int m19711k = i2 != 0 ? ik5Var.m19711k() + ik5Var.m19703s() : -1;
        if (this.f12429f) {
            if (i2 == 0) {
                return;
            }
            this.f12429f = false;
            ik5Var.m19716f(m19711k);
            this.f12427d = 0;
        }
        while (ik5Var.m19713i() > 0) {
            int i3 = this.f12427d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int m19703s = ik5Var.m19703s();
                    ik5Var.m19716f(ik5Var.m19711k() - 1);
                    if (m19703s == 255) {
                        this.f12429f = true;
                        return;
                    }
                }
                int min = Math.min(ik5Var.m19713i(), 3 - this.f12427d);
                ik5Var.m19720b(this.f12425b.m19714h(), this.f12427d, min);
                int i4 = this.f12427d + min;
                this.f12427d = i4;
                if (i4 == 3) {
                    this.f12425b.m19716f(0);
                    this.f12425b.m19717e(3);
                    this.f12425b.m19715g(1);
                    int m19703s2 = this.f12425b.m19703s();
                    int m19703s3 = this.f12425b.m19703s();
                    this.f12428e = (m19703s2 & 128) != 0;
                    this.f12426c = (((m19703s2 & 15) << 8) | m19703s3) + 3;
                    int m19712j = this.f12425b.m19712j();
                    int i5 = this.f12426c;
                    if (m19712j < i5) {
                        int m19712j2 = this.f12425b.m19712j();
                        this.f12425b.m19722H(Math.min(4098, Math.max(i5, m19712j2 + m19712j2)));
                    }
                }
            } else {
                int min2 = Math.min(ik5Var.m19713i(), this.f12426c - i3);
                ik5Var.m19720b(this.f12425b.m19714h(), this.f12427d, min2);
                int i6 = this.f12427d + min2;
                this.f12427d = i6;
                int i7 = this.f12426c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.f12428e) {
                        this.f12425b.m19717e(i7);
                    } else if (it5.m19415Q(this.f12425b.m19714h(), 0, i7, -1) != 0) {
                        this.f12429f = true;
                        return;
                    } else {
                        this.f12425b.m19717e(this.f12426c - 4);
                    }
                    this.f12425b.m19716f(0);
                    this.f12424a.mo12624a(this.f12425b);
                    this.f12427d = 0;
                }
            }
        }
    }

    @Override // com.daaw.ud2
    /* renamed from: b */
    public final void mo8316b(cr5 cr5Var, m09 m09Var, td2 td2Var) {
        this.f12424a.mo12623b(cr5Var, m09Var, td2Var);
        this.f12429f = true;
    }

    @Override // com.daaw.ud2
    public final void zzc() {
        this.f12429f = true;
    }
}
