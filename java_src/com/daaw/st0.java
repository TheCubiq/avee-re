package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class st0 {
    public final tt0 a = new tt0();
    public final rv0 b = new rv0(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            tt0 tt0Var = this.a;
            if (i5 >= tt0Var.g) {
                break;
            }
            int[] iArr = tt0Var.j;
            this.d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public tt0 b() {
        return this.a;
    }

    public rv0 c() {
        return this.b;
    }

    public boolean d(a00 a00Var) {
        int i;
        s6.f(a00Var != null);
        if (this.e) {
            this.e = false;
            this.b.F();
        }
        while (!this.e) {
            if (this.c < 0) {
                if (!this.a.a(a00Var, true)) {
                    return false;
                }
                tt0 tt0Var = this.a;
                int i2 = tt0Var.h;
                if ((tt0Var.b & 1) == 1 && this.b.d() == 0) {
                    i2 += a(0);
                    i = this.d + 0;
                } else {
                    i = 0;
                }
                a00Var.j(i2);
                this.c = i;
            }
            int a = a(this.c);
            int i3 = this.c + this.d;
            if (a > 0) {
                if (this.b.b() < this.b.d() + a) {
                    rv0 rv0Var = this.b;
                    rv0Var.a = Arrays.copyOf(rv0Var.a, rv0Var.d() + a);
                }
                rv0 rv0Var2 = this.b;
                a00Var.f(rv0Var2.a, rv0Var2.d(), a);
                rv0 rv0Var3 = this.b;
                rv0Var3.I(rv0Var3.d() + a);
                this.e = this.a.j[i3 + (-1)] != 255;
            }
            if (i3 == this.a.g) {
                i3 = -1;
            }
            this.c = i3;
        }
        return true;
    }

    public void e() {
        this.a.b();
        this.b.F();
        this.c = -1;
        this.e = false;
    }

    public void f() {
        rv0 rv0Var = this.b;
        byte[] bArr = rv0Var.a;
        if (bArr.length == 65025) {
            return;
        }
        rv0Var.a = Arrays.copyOf(bArr, Math.max(65025, rv0Var.d()));
    }
}
