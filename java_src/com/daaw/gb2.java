package com.daaw;

import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* loaded from: classes.dex */
public abstract class gb2 {

    /* renamed from: b */
    public m42 f10998b;

    /* renamed from: c */
    public m09 f10999c;

    /* renamed from: d */
    public bb2 f11000d;

    /* renamed from: e */
    public long f11001e;

    /* renamed from: f */
    public long f11002f;

    /* renamed from: g */
    public long f11003g;

    /* renamed from: h */
    public int f11004h;

    /* renamed from: i */
    public int f11005i;

    /* renamed from: k */
    public long f11007k;

    /* renamed from: l */
    public boolean f11008l;

    /* renamed from: m */
    public boolean f11009m;

    /* renamed from: a */
    public final za2 f10997a = new za2();

    /* renamed from: j */
    public db2 f11006j = new db2();

    /* renamed from: a */
    public abstract long mo6277a(ik5 ik5Var);

    /* renamed from: b */
    public void mo6276b(boolean z) {
        int i;
        if (z) {
            this.f11006j = new db2();
            this.f11002f = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.f11004h = i;
        this.f11001e = -1L;
        this.f11003g = 0L;
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: c */
    public abstract boolean mo6275c(ik5 ik5Var, long j, db2 db2Var);

    /* renamed from: d */
    public final int m21826d(k09 k09Var, f42 f42Var) {
        uo4.m7876b(this.f10998b);
        int i = it5.f13991a;
        int i2 = this.f11004h;
        if (i2 == 0) {
            while (this.f10997a.m2565e(k09Var)) {
                long zzf = k09Var.zzf();
                long j = this.f11002f;
                this.f11007k = zzf - j;
                if (!mo6275c(this.f10997a.m2569a(), j, this.f11006j)) {
                    f92 f92Var = this.f11006j.f6733a;
                    this.f11005i = f92Var.f9289z;
                    if (!this.f11009m) {
                        this.f10998b.mo16218f(f92Var);
                        this.f11009m = true;
                    }
                    bb2 bb2Var = this.f11006j.f6734b;
                    if (bb2Var != null) {
                        this.f11000d = bb2Var;
                    } else if (k09Var.zzd() == -1) {
                        this.f11000d = new fb2(null);
                    } else {
                        ab2 m2568b = this.f10997a.m2568b();
                        this.f11000d = new ua2(this, this.f11002f, k09Var.zzd(), m2568b.f3043d + m2568b.f3044e, m2568b.f3041b, (m2568b.f3040a & 4) != 0);
                    }
                    this.f11004h = 2;
                    this.f10997a.m2566d();
                    return 0;
                }
                this.f11002f = k09Var.zzf();
            }
            this.f11004h = 3;
            return -1;
        } else if (i2 == 1) {
            ((rz8) k09Var).m10811l((int) this.f11002f, false);
            this.f11004h = 2;
            return 0;
        } else if (i2 != 2) {
            return -1;
        } else {
            long mo7303a = this.f11000d.mo7303a(k09Var);
            if (mo7303a >= 0) {
                f42Var.f9093a = mo7303a;
                return 1;
            }
            if (mo7303a < -1) {
                mo19986h(-(mo7303a + 2));
            }
            if (!this.f11008l) {
                i42 zze = this.f11000d.zze();
                uo4.m7876b(zze);
                this.f10999c.mo3297i(zze);
                this.f11008l = true;
            }
            if (this.f11007k <= 0 && !this.f10997a.m2565e(k09Var)) {
                this.f11004h = 3;
                return -1;
            }
            this.f11007k = 0L;
            ik5 m2569a = this.f10997a.m2569a();
            long mo6277a = mo6277a(m2569a);
            if (mo6277a >= 0) {
                long j2 = this.f11003g;
                if (j2 + mo6277a >= this.f11001e) {
                    long m21825e = m21825e(j2);
                    k42.m18050b(this.f10998b, m2569a, m2569a.m19710l());
                    this.f10998b.mo16222b(m21825e, 1, m2569a.m19710l(), 0, null);
                    this.f11001e = -1L;
                }
            }
            this.f11003g += mo6277a;
            return 0;
        }
    }

    /* renamed from: e */
    public final long m21825e(long j) {
        return (j * 1000000) / this.f11005i;
    }

    /* renamed from: f */
    public final long m21824f(long j) {
        return (this.f11005i * j) / 1000000;
    }

    /* renamed from: g */
    public final void m21823g(m09 m09Var, m42 m42Var) {
        this.f10999c = m09Var;
        this.f10998b = m42Var;
        mo6276b(true);
    }

    /* renamed from: h */
    public void mo19986h(long j) {
        this.f11003g = j;
    }

    /* renamed from: i */
    public final void m21822i(long j, long j2) {
        this.f10997a.m2567c();
        if (j == 0) {
            mo6276b(!this.f11008l);
        } else if (this.f11004h != 0) {
            long m21824f = m21824f(j2);
            this.f11001e = m21824f;
            bb2 bb2Var = this.f11000d;
            int i = it5.f13991a;
            bb2Var.mo7302b(m21824f);
            this.f11004h = 2;
        }
    }
}
