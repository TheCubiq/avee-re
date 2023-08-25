package com.daaw;
/* loaded from: classes.dex */
public final class ox8 {
    public boolean c;
    public int e;
    public nx8 a = new nx8();
    public nx8 b = new nx8();
    public long d = -9223372036854775807L;

    public final float a() {
        if (this.a.f()) {
            double a = this.a.a();
            Double.isNaN(a);
            return (float) (1.0E9d / a);
        }
        return -1.0f;
    }

    public final int b() {
        return this.e;
    }

    public final long c() {
        if (this.a.f()) {
            return this.a.a();
        }
        return -9223372036854775807L;
    }

    public final long d() {
        if (this.a.f()) {
            return this.a.b();
        }
        return -9223372036854775807L;
    }

    public final void e(long j) {
        this.a.c(j);
        if (this.a.f()) {
            this.c = false;
        } else if (this.d != -9223372036854775807L) {
            if (!this.c || this.b.e()) {
                this.b.d();
                this.b.c(this.d);
            }
            this.c = true;
            this.b.c(j);
        }
        if (this.c && this.b.f()) {
            nx8 nx8Var = this.a;
            this.a = this.b;
            this.b = nx8Var;
            this.c = false;
        }
        this.d = j;
        this.e = this.a.f() ? 0 : this.e + 1;
    }

    public final void f() {
        this.a.d();
        this.b.d();
        this.c = false;
        this.d = -9223372036854775807L;
        this.e = 0;
    }

    public final boolean g() {
        return this.a.f();
    }
}
