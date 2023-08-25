package com.daaw;

import com.daaw.nj1;
import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public final class ss1 extends nj1 {
    public final rv0 b;
    public final rv0 c;
    public int d;
    public boolean e;
    public int f;

    public ss1(sm1 sm1Var) {
        super(sm1Var);
        this.b = new rv0(sr0.a);
        this.c = new rv0(4);
    }

    @Override // com.daaw.nj1
    public boolean b(rv0 rv0Var) {
        int x = rv0Var.x();
        int i = (x >> 4) & 15;
        int i2 = x & 15;
        if (i2 == 7) {
            this.f = i;
            return i != 5;
        }
        throw new nj1.a("Video format not supported: " + i2);
    }

    @Override // com.daaw.nj1
    public void c(rv0 rv0Var, long j) {
        int x = rv0Var.x();
        long j2 = j + (rv0Var.j() * 1000);
        if (x == 0 && !this.e) {
            rv0 rv0Var2 = new rv0(new byte[rv0Var.a()]);
            rv0Var.g(rv0Var2.a, 0, rv0Var.a());
            y9 b = y9.b(rv0Var2);
            this.d = b.b;
            this.a.d(Format.H(null, "video/avc", null, -1, -1, b.c, b.d, -1.0f, b.a, -1, b.e, null));
            this.e = true;
        } else if (x == 1 && this.e) {
            byte[] bArr = this.c.a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i = 4 - this.d;
            int i2 = 0;
            while (rv0Var.a() > 0) {
                rv0Var.g(this.c.a, i, this.d);
                this.c.J(0);
                int B = this.c.B();
                this.b.J(0);
                this.a.c(this.b, 4);
                this.a.c(rv0Var, B);
                i2 = i2 + 4 + B;
            }
            this.a.a(j2, this.f == 1 ? 1 : 0, i2, 0, null);
        }
    }
}
