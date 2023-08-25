package com.daaw;
/* loaded from: classes.dex */
public final class hd2 implements ud2 {
    public final gd2 a;
    public final ik5 b = new ik5(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public hd2(gd2 gd2Var) {
        this.a = gd2Var;
    }

    @Override // com.daaw.ud2
    public final void a(ik5 ik5Var, int i) {
        int i2 = i & 1;
        int k = i2 != 0 ? ik5Var.k() + ik5Var.s() : -1;
        if (this.f) {
            if (i2 == 0) {
                return;
            }
            this.f = false;
            ik5Var.f(k);
            this.d = 0;
        }
        while (ik5Var.i() > 0) {
            int i3 = this.d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int s = ik5Var.s();
                    ik5Var.f(ik5Var.k() - 1);
                    if (s == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(ik5Var.i(), 3 - this.d);
                ik5Var.b(this.b.h(), this.d, min);
                int i4 = this.d + min;
                this.d = i4;
                if (i4 == 3) {
                    this.b.f(0);
                    this.b.e(3);
                    this.b.g(1);
                    int s2 = this.b.s();
                    int s3 = this.b.s();
                    this.e = (s2 & 128) != 0;
                    this.c = (((s2 & 15) << 8) | s3) + 3;
                    int j = this.b.j();
                    int i5 = this.c;
                    if (j < i5) {
                        int j2 = this.b.j();
                        this.b.H(Math.min(4098, Math.max(i5, j2 + j2)));
                    }
                }
            } else {
                int min2 = Math.min(ik5Var.i(), this.c - i3);
                ik5Var.b(this.b.h(), this.d, min2);
                int i6 = this.d + min2;
                this.d = i6;
                int i7 = this.c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.e) {
                        this.b.e(i7);
                    } else if (it5.Q(this.b.h(), 0, i7, -1) != 0) {
                        this.f = true;
                        return;
                    } else {
                        this.b.e(this.c - 4);
                    }
                    this.b.f(0);
                    this.a.a(this.b);
                    this.d = 0;
                }
            }
        }
    }

    @Override // com.daaw.ud2
    public final void b(cr5 cr5Var, m09 m09Var, td2 td2Var) {
        this.a.b(cr5Var, m09Var, td2Var);
        this.f = true;
    }

    @Override // com.daaw.ud2
    public final void zzc() {
        this.f = true;
    }
}
