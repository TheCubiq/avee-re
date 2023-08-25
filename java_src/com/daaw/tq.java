package com.daaw;

import java.util.ArrayDeque;
/* loaded from: classes.dex */
public final class tq implements ov {
    public final byte[] a = new byte[8];
    public final ArrayDeque<b> b = new ArrayDeque<>();
    public final zr1 c = new zr1();
    public pv d;
    public int e;
    public int f;
    public long g;

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final long b;

        public b(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    @Override // com.daaw.ov
    public boolean a(a00 a00Var) {
        s6.f(this.d != null);
        while (true) {
            if (!this.b.isEmpty() && a00Var.getPosition() >= this.b.peek().b) {
                this.d.a(this.b.pop().a);
                return true;
            }
            if (this.e == 0) {
                long d = this.c.d(a00Var, true, false, 4);
                if (d == -2) {
                    d = c(a00Var);
                }
                if (d == -1) {
                    return false;
                }
                this.f = (int) d;
                this.e = 1;
            }
            if (this.e == 1) {
                this.g = this.c.d(a00Var, false, true, 8);
                this.e = 2;
            }
            int b2 = this.d.b(this.f);
            if (b2 != 0) {
                if (b2 == 1) {
                    long position = a00Var.getPosition();
                    this.b.push(new b(this.f, this.g + position));
                    this.d.f(this.f, position, this.g);
                    this.e = 0;
                    return true;
                } else if (b2 == 2) {
                    long j = this.g;
                    if (j <= 8) {
                        this.d.h(this.f, f(a00Var, (int) j));
                        this.e = 0;
                        return true;
                    }
                    throw new tv0("Invalid integer size: " + this.g);
                } else if (b2 == 3) {
                    long j2 = this.g;
                    if (j2 <= 2147483647L) {
                        this.d.d(this.f, g(a00Var, (int) j2));
                        this.e = 0;
                        return true;
                    }
                    throw new tv0("String element size: " + this.g);
                } else if (b2 == 4) {
                    this.d.g(this.f, (int) this.g, a00Var);
                    this.e = 0;
                    return true;
                } else if (b2 != 5) {
                    throw new tv0("Invalid element type " + b2);
                } else {
                    long j3 = this.g;
                    if (j3 == 4 || j3 == 8) {
                        this.d.e(this.f, d(a00Var, (int) j3));
                        this.e = 0;
                        return true;
                    }
                    throw new tv0("Invalid float size: " + this.g);
                }
            }
            a00Var.j((int) this.g);
            this.e = 0;
        }
    }

    @Override // com.daaw.ov
    public void b(pv pvVar) {
        this.d = pvVar;
    }

    public final long c(a00 a00Var) {
        a00Var.i();
        while (true) {
            a00Var.k(this.a, 0, 4);
            int c = zr1.c(this.a[0]);
            if (c != -1 && c <= 4) {
                int a2 = (int) zr1.a(this.a, c, false);
                if (this.d.c(a2)) {
                    a00Var.j(c);
                    return a2;
                }
            }
            a00Var.j(1);
        }
    }

    public final double d(a00 a00Var, int i) {
        long f = f(a00Var, i);
        return i == 4 ? Float.intBitsToFloat((int) f) : Double.longBitsToDouble(f);
    }

    @Override // com.daaw.ov
    public void e() {
        this.e = 0;
        this.b.clear();
        this.c.e();
    }

    public final long f(a00 a00Var, int i) {
        a00Var.f(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.a[i2] & 255);
        }
        return j;
    }

    public final String g(a00 a00Var, int i) {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        a00Var.f(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }
}
