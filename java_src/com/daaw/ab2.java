package com.daaw;
/* loaded from: classes.dex */
public final class ab2 {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final ik5 g = new ik5(255);

    public final void a() {
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    public final boolean b(k09 k09Var, boolean z) {
        a();
        this.g.c(27);
        if (n09.c(k09Var, this.g.h(), 0, 27, z) && this.g.A() == 1332176723) {
            if (this.g.s() != 0) {
                if (z) {
                    return false;
                }
                throw dl3.c("unsupported bit stream revision");
            }
            this.a = this.g.s();
            this.b = this.g.x();
            this.g.y();
            this.g.y();
            this.g.y();
            int s = this.g.s();
            this.c = s;
            this.d = s + 27;
            this.g.c(s);
            if (n09.c(k09Var, this.g.h(), 0, this.c, z)) {
                for (int i = 0; i < this.c; i++) {
                    this.f[i] = this.g.s();
                    this.e += this.f[i];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean c(k09 k09Var, long j) {
        uo4.d(k09Var.zzf() == k09Var.zze());
        this.g.c(4);
        while (true) {
            if ((j == -1 || k09Var.zzf() + 4 < j) && n09.c(k09Var, this.g.h(), 0, 4, true)) {
                this.g.f(0);
                if (this.g.A() == 1332176723) {
                    k09Var.zzj();
                    return true;
                }
                ((rz8) k09Var).l(1, false);
            }
        }
        do {
            if (j != -1 && k09Var.zzf() >= j) {
                break;
            }
        } while (k09Var.b(1) != -1);
        return false;
    }
}
