package com.daaw;
/* loaded from: classes.dex */
public final class ab2 {

    /* renamed from: a */
    public int f3040a;

    /* renamed from: b */
    public long f3041b;

    /* renamed from: c */
    public int f3042c;

    /* renamed from: d */
    public int f3043d;

    /* renamed from: e */
    public int f3044e;

    /* renamed from: f */
    public final int[] f3045f = new int[255];

    /* renamed from: g */
    public final ik5 f3046g = new ik5(255);

    /* renamed from: a */
    public final void m27540a() {
        this.f3040a = 0;
        this.f3041b = 0L;
        this.f3042c = 0;
        this.f3043d = 0;
        this.f3044e = 0;
    }

    /* renamed from: b */
    public final boolean m27539b(k09 k09Var, boolean z) {
        m27540a();
        this.f3046g.m19719c(27);
        if (n09.m15608c(k09Var, this.f3046g.m19714h(), 0, 27, z) && this.f3046g.m19729A() == 1332176723) {
            if (this.f3046g.m19703s() != 0) {
                if (z) {
                    return false;
                }
                throw dl3.m24265c("unsupported bit stream revision");
            }
            this.f3040a = this.f3046g.m19703s();
            this.f3041b = this.f3046g.m19698x();
            this.f3046g.m19697y();
            this.f3046g.m19697y();
            this.f3046g.m19697y();
            int m19703s = this.f3046g.m19703s();
            this.f3042c = m19703s;
            this.f3043d = m19703s + 27;
            this.f3046g.m19719c(m19703s);
            if (n09.m15608c(k09Var, this.f3046g.m19714h(), 0, this.f3042c, z)) {
                for (int i = 0; i < this.f3042c; i++) {
                    this.f3045f[i] = this.f3046g.m19703s();
                    this.f3044e += this.f3045f[i];
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m27538c(k09 k09Var, long j) {
        uo4.m7874d(k09Var.zzf() == k09Var.zze());
        this.f3046g.m19719c(4);
        while (true) {
            if ((j == -1 || k09Var.zzf() + 4 < j) && n09.m15608c(k09Var, this.f3046g.m19714h(), 0, 4, true)) {
                this.f3046g.m19716f(0);
                if (this.f3046g.m19729A() == 1332176723) {
                    k09Var.zzj();
                    return true;
                }
                ((rz8) k09Var).m10811l(1, false);
            }
        }
        do {
            if (j != -1 && k09Var.zzf() >= j) {
                break;
            }
        } while (k09Var.mo5665b(1) != -1);
        return false;
    }
}
