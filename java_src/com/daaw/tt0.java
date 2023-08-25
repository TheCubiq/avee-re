package com.daaw;

import java.io.EOFException;
/* loaded from: classes.dex */
public final class tt0 {
    public static final int l = sq1.v("OggS");
    public int a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public final int[] j = new int[255];
    public final rv0 k = new rv0(255);

    public boolean a(a00 a00Var, boolean z) {
        this.k.F();
        b();
        if (!(a00Var.h() == -1 || a00Var.h() - a00Var.e() >= 27) || !a00Var.d(this.k.a, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        } else if (this.k.z() != l) {
            if (z) {
                return false;
            }
            throw new tv0("expected OggS capture pattern at begin of page");
        } else {
            int x = this.k.x();
            this.a = x;
            if (x != 0) {
                if (z) {
                    return false;
                }
                throw new tv0("unsupported bit stream revision");
            }
            this.b = this.k.x();
            this.c = this.k.m();
            this.d = this.k.n();
            this.e = this.k.n();
            this.f = this.k.n();
            int x2 = this.k.x();
            this.g = x2;
            this.h = x2 + 27;
            this.k.F();
            a00Var.k(this.k.a, 0, this.g);
            for (int i = 0; i < this.g; i++) {
                this.j[i] = this.k.x();
                this.i += this.j[i];
            }
            return true;
        }
    }

    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.g = 0;
        this.h = 0;
        this.i = 0;
    }
}
