package com.daaw;
/* loaded from: classes.dex */
public final class w92 {
    public final m42 a;
    public ka2 d;
    public s92 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean l;
    public final ja2 b = new ja2();
    public final ik5 c = new ik5();
    public final ik5 j = new ik5(1);
    public final ik5 k = new ik5();

    public w92(m42 m42Var, ka2 ka2Var, s92 s92Var) {
        this.a = m42Var;
        this.d = ka2Var;
        this.e = s92Var;
        h(ka2Var, s92Var);
    }

    public final int a() {
        int i = !this.l ? this.d.g[this.f] : this.b.j[this.f] ? 1 : 0;
        return f() != null ? i | 1073741824 : i;
    }

    public final int b() {
        return !this.l ? this.d.d[this.f] : this.b.h[this.f];
    }

    public final int c(int i, int i2) {
        ik5 ik5Var;
        ia2 f = f();
        if (f == null) {
            return 0;
        }
        int i3 = f.d;
        if (i3 != 0) {
            ik5Var = this.b.n;
        } else {
            byte[] bArr = (byte[]) it5.h(f.e);
            ik5 ik5Var2 = this.k;
            int length = bArr.length;
            ik5Var2.d(bArr, length);
            ik5Var = this.k;
            i3 = length;
        }
        boolean b = this.b.b(this.f);
        boolean z = b || i2 != 0;
        ik5 ik5Var3 = this.j;
        ik5Var3.h()[0] = (byte) ((true != z ? 0 : 128) | i3);
        ik5Var3.f(0);
        this.a.a(this.j, 1, 1);
        this.a.a(ik5Var, i3, 1);
        if (z) {
            if (!b) {
                this.c.c(8);
                ik5 ik5Var4 = this.c;
                byte[] h = ik5Var4.h();
                h[0] = 0;
                h[1] = 1;
                h[2] = 0;
                h[3] = (byte) i2;
                h[4] = (byte) ((i >> 24) & 255);
                h[5] = (byte) ((i >> 16) & 255);
                h[6] = (byte) ((i >> 8) & 255);
                h[7] = (byte) (i & 255);
                this.a.a(ik5Var4, 8, 1);
                return i3 + 9;
            }
            ik5 ik5Var5 = this.b.n;
            int w = ik5Var5.w();
            ik5Var5.g(-2);
            int i4 = (w * 6) + 2;
            if (i2 != 0) {
                this.c.c(i4);
                byte[] h2 = this.c.h();
                ik5Var5.b(h2, 0, i4);
                int i5 = (((h2[2] & 255) << 8) | (h2[3] & 255)) + i2;
                h2[2] = (byte) ((i5 >> 8) & 255);
                h2[3] = (byte) (i5 & 255);
                ik5Var5 = this.c;
            }
            this.a.a(ik5Var5, i4, 1);
            return i3 + 1 + i4;
        }
        return i3 + 1;
    }

    public final long d() {
        return !this.l ? this.d.c[this.f] : this.b.f[this.h];
    }

    public final long e() {
        if (this.l) {
            ja2 ja2Var = this.b;
            return ja2Var.i[this.f];
        }
        return this.d.f[this.f];
    }

    public final ia2 f() {
        if (this.l) {
            ja2 ja2Var = this.b;
            s92 s92Var = ja2Var.a;
            int i = it5.a;
            int i2 = s92Var.a;
            ia2 ia2Var = ja2Var.m;
            if (ia2Var == null) {
                ia2Var = this.d.a.a(i2);
            }
            if (ia2Var == null || !ia2Var.a) {
                return null;
            }
            return ia2Var;
        }
        return null;
    }

    public final void h(ka2 ka2Var, s92 s92Var) {
        this.d = ka2Var;
        this.e = s92Var;
        this.a.f(ka2Var.a.f);
        i();
    }

    public final void i() {
        ja2 ja2Var = this.b;
        ja2Var.d = 0;
        ja2Var.p = 0L;
        ja2Var.q = false;
        ja2Var.k = false;
        ja2Var.o = false;
        ja2Var.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.l = false;
    }

    public final boolean k() {
        this.f++;
        if (this.l) {
            int i = this.g + 1;
            this.g = i;
            int[] iArr = this.b.g;
            int i2 = this.h;
            if (i == iArr[i2]) {
                this.h = i2 + 1;
                this.g = 0;
                return false;
            }
            return true;
        }
        return false;
    }
}
