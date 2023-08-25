package com.daaw;
/* loaded from: classes.dex */
public final class ed2 {
    public final ac2 a;
    public final cr5 b;
    public final cj5 c = new cj5(new byte[64], 64);
    public boolean d;
    public boolean e;
    public boolean f;

    public ed2(ac2 ac2Var, cr5 cr5Var) {
        this.a = ac2Var;
        this.b = cr5Var;
    }

    public final void a(ik5 ik5Var) {
        long j;
        ik5Var.b(this.c.a, 0, 3);
        this.c.h(0);
        this.c.j(8);
        this.d = this.c.l();
        this.e = this.c.l();
        this.c.j(6);
        ik5Var.b(this.c.a, 0, this.c.c(8));
        this.c.h(0);
        if (this.d) {
            this.c.j(4);
            int c = this.c.c(3);
            this.c.j(1);
            int c2 = this.c.c(15);
            this.c.j(1);
            long c3 = (c << 30) | (c2 << 15) | this.c.c(15);
            this.c.j(1);
            if (!this.f && this.e) {
                this.c.j(4);
                int c4 = this.c.c(3);
                this.c.j(1);
                int c5 = this.c.c(15);
                this.c.j(1);
                int c6 = this.c.c(15);
                this.c.j(1);
                this.b.b((c5 << 15) | (c4 << 30) | c6);
                this.f = true;
            }
            j = this.b.b(c3);
        } else {
            j = 0;
        }
        this.a.c(j, 4);
        this.a.a(ik5Var);
        this.a.zzc();
    }

    public final void b() {
        this.f = false;
        this.a.zze();
    }
}
