package com.daaw;
/* loaded from: classes.dex */
public final class kc2 {
    public final m42 a;
    public long b;
    public boolean c;
    public int d;
    public long e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public boolean m;

    public kc2(m42 m42Var) {
        this.a = m42Var;
    }

    public final void a(long j, int i, boolean z) {
        if (this.j && this.g) {
            this.m = this.c;
            this.j = false;
        } else if (this.h || this.g) {
            if (z && this.i) {
                e(i + ((int) (j - this.b)));
            }
            this.k = this.b;
            this.l = this.e;
            this.m = this.c;
            this.i = true;
        }
    }

    public final void b(byte[] bArr, int i, int i2) {
        if (this.f) {
            int i3 = this.d;
            int i4 = (i + 2) - i3;
            if (i4 >= i2) {
                this.d = i3 + (i2 - i);
                return;
            }
            this.g = (bArr[i4] & 128) != 0;
            this.f = false;
        }
    }

    public final void c() {
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
    }

    public final void d(long j, int i, int i2, long j2, boolean z) {
        boolean z2 = false;
        this.g = false;
        this.h = false;
        this.e = j2;
        this.d = 0;
        this.b = j;
        if (i2 >= 32 && i2 != 40) {
            if (this.i && !this.j) {
                if (z) {
                    e(i);
                }
                this.i = false;
            }
            if (i2 <= 35 || i2 == 39) {
                this.h = !this.j;
                this.j = true;
            }
        }
        boolean z3 = i2 >= 16 && i2 <= 21;
        this.c = z3;
        this.f = (z3 || i2 <= 9) ? true : true;
    }

    public final void e(int i) {
        long j = this.l;
        if (j == -9223372036854775807L) {
            return;
        }
        boolean z = this.m;
        long j2 = this.b;
        long j3 = this.k;
        this.a.b(j, z ? 1 : 0, (int) (j2 - j3), i, null);
    }
}
