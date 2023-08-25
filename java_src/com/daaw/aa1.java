package com.daaw;

import com.daaw.eo1;
/* loaded from: classes.dex */
public final class aa1 implements eo1 {
    public final z91 a;
    public final rv0 b = new rv0(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public aa1(z91 z91Var) {
        this.a = z91Var;
    }

    @Override // com.daaw.eo1
    public void a(rv0 rv0Var, boolean z) {
        int c = z ? rv0Var.c() + rv0Var.x() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            rv0Var.J(c);
            this.d = 0;
        }
        while (rv0Var.a() > 0) {
            int i = this.d;
            if (i < 3) {
                if (i == 0) {
                    int x = rv0Var.x();
                    rv0Var.J(rv0Var.c() - 1);
                    if (x == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(rv0Var.a(), 3 - this.d);
                rv0Var.g(this.b.a, this.d, min);
                int i2 = this.d + min;
                this.d = i2;
                if (i2 == 3) {
                    this.b.G(3);
                    this.b.K(1);
                    int x2 = this.b.x();
                    int x3 = this.b.x();
                    this.e = (x2 & 128) != 0;
                    this.c = (((x2 & 15) << 8) | x3) + 3;
                    int b = this.b.b();
                    int i3 = this.c;
                    if (b < i3) {
                        rv0 rv0Var2 = this.b;
                        byte[] bArr = rv0Var2.a;
                        rv0Var2.G(Math.min(4098, Math.max(i3, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.b.a, 0, 3);
                    }
                }
            } else {
                int min2 = Math.min(rv0Var.a(), this.c - this.d);
                rv0Var.g(this.b.a, this.d, min2);
                int i4 = this.d + min2;
                this.d = i4;
                int i5 = this.c;
                if (i4 != i5) {
                    continue;
                } else {
                    if (!this.e) {
                        this.b.G(i5);
                    } else if (sq1.n(this.b.a, 0, i5, -1) != 0) {
                        this.f = true;
                        return;
                    } else {
                        this.b.G(this.c - 4);
                    }
                    this.a.a(this.b);
                    this.d = 0;
                }
            }
        }
    }

    @Override // com.daaw.eo1
    public void b() {
        this.f = true;
    }

    @Override // com.daaw.eo1
    public void c(ol1 ol1Var, d00 d00Var, eo1.d dVar) {
        this.a.c(ol1Var, d00Var, dVar);
        this.f = true;
    }
}
