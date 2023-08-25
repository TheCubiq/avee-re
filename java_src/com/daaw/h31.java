package com.daaw;

import com.daaw.da1;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
/* loaded from: classes.dex */
public final class h31 implements zz {
    public static final int i = sq1.v("RCC\u0001");
    public final Format a;
    public sm1 c;
    public int e;
    public long f;
    public int g;
    public int h;
    public final rv0 b = new rv0(9);
    public int d = 0;

    public h31(Format format) {
        this.a = format;
    }

    @Override // com.daaw.zz
    public void a() {
    }

    public final boolean b(a00 a00Var) {
        this.b.F();
        if (a00Var.c(this.b.a, 0, 8, true)) {
            if (this.b.i() == i) {
                this.e = this.b.x();
                return true;
            }
            throw new IOException("Input not RawCC");
        }
        return false;
    }

    @Override // com.daaw.zz
    public boolean c(a00 a00Var) {
        this.b.F();
        a00Var.k(this.b.a, 0, 8);
        return this.b.i() == i;
    }

    @Override // com.daaw.zz
    public int d(a00 a00Var, iy0 iy0Var) {
        while (true) {
            int i2 = this.d;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        e(a00Var);
                        this.d = 1;
                        return 0;
                    }
                    throw new IllegalStateException();
                } else if (!g(a00Var)) {
                    this.d = 0;
                    return -1;
                } else {
                    this.d = 2;
                }
            } else if (!b(a00Var)) {
                return -1;
            } else {
                this.d = 1;
            }
        }
    }

    public final void e(a00 a00Var) {
        while (this.g > 0) {
            this.b.F();
            a00Var.f(this.b.a, 0, 3);
            this.c.c(this.b, 3);
            this.h += 3;
            this.g--;
        }
        int i2 = this.h;
        if (i2 > 0) {
            this.c.a(this.f, 1, i2, 0, null);
        }
    }

    @Override // com.daaw.zz
    public void f(long j, long j2) {
        this.d = 0;
    }

    public final boolean g(a00 a00Var) {
        long q;
        this.b.F();
        int i2 = this.e;
        if (i2 == 0) {
            if (!a00Var.c(this.b.a, 0, 5, true)) {
                return false;
            }
            q = (this.b.z() * 1000) / 45;
        } else if (i2 != 1) {
            throw new tv0("Unsupported version number: " + this.e);
        } else if (!a00Var.c(this.b.a, 0, 9, true)) {
            return false;
        } else {
            q = this.b.q();
        }
        this.f = q;
        this.g = this.b.x();
        this.h = 0;
        return true;
    }

    @Override // com.daaw.zz
    public void i(d00 d00Var) {
        d00Var.d(new da1.b(-9223372036854775807L));
        this.c = d00Var.a(0, 3);
        d00Var.n();
        this.c.d(this.a);
    }
}
