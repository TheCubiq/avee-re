package com.daaw;
/* loaded from: classes.dex */
public final class ox8 {

    /* renamed from: c */
    public boolean f22093c;

    /* renamed from: e */
    public int f22095e;

    /* renamed from: a */
    public nx8 f22091a = new nx8();

    /* renamed from: b */
    public nx8 f22092b = new nx8();

    /* renamed from: d */
    public long f22094d = -9223372036854775807L;

    /* renamed from: a */
    public final float m13882a() {
        if (this.f22091a.m14738f()) {
            double m14743a = this.f22091a.m14743a();
            Double.isNaN(m14743a);
            return (float) (1.0E9d / m14743a);
        }
        return -1.0f;
    }

    /* renamed from: b */
    public final int m13881b() {
        return this.f22095e;
    }

    /* renamed from: c */
    public final long m13880c() {
        if (this.f22091a.m14738f()) {
            return this.f22091a.m14743a();
        }
        return -9223372036854775807L;
    }

    /* renamed from: d */
    public final long m13879d() {
        if (this.f22091a.m14738f()) {
            return this.f22091a.m14742b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: e */
    public final void m13878e(long j) {
        this.f22091a.m14741c(j);
        if (this.f22091a.m14738f()) {
            this.f22093c = false;
        } else if (this.f22094d != -9223372036854775807L) {
            if (!this.f22093c || this.f22092b.m14739e()) {
                this.f22092b.m14740d();
                this.f22092b.m14741c(this.f22094d);
            }
            this.f22093c = true;
            this.f22092b.m14741c(j);
        }
        if (this.f22093c && this.f22092b.m14738f()) {
            nx8 nx8Var = this.f22091a;
            this.f22091a = this.f22092b;
            this.f22092b = nx8Var;
            this.f22093c = false;
        }
        this.f22094d = j;
        this.f22095e = this.f22091a.m14738f() ? 0 : this.f22095e + 1;
    }

    /* renamed from: f */
    public final void m13877f() {
        this.f22091a.m14740d();
        this.f22092b.m14740d();
        this.f22093c = false;
        this.f22094d = -9223372036854775807L;
        this.f22095e = 0;
    }

    /* renamed from: g */
    public final boolean m13876g() {
        return this.f22091a.m14738f();
    }
}
