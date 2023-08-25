package com.daaw;

import com.daaw.da1;
import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public abstract class rg1 {

    /* renamed from: a */
    public final st0 f25252a = new st0();

    /* renamed from: b */
    public sm1 f25253b;

    /* renamed from: c */
    public d00 f25254c;

    /* renamed from: d */
    public ut0 f25255d;

    /* renamed from: e */
    public long f25256e;

    /* renamed from: f */
    public long f25257f;

    /* renamed from: g */
    public long f25258g;

    /* renamed from: h */
    public int f25259h;

    /* renamed from: i */
    public int f25260i;

    /* renamed from: j */
    public C2860b f25261j;

    /* renamed from: k */
    public long f25262k;

    /* renamed from: l */
    public boolean f25263l;

    /* renamed from: m */
    public boolean f25264m;

    /* renamed from: com.daaw.rg1$b */
    /* loaded from: classes.dex */
    public static class C2860b {

        /* renamed from: a */
        public Format f25265a;

        /* renamed from: b */
        public ut0 f25266b;
    }

    /* renamed from: com.daaw.rg1$c */
    /* loaded from: classes.dex */
    public static final class C2861c implements ut0 {
        public C2861c() {
        }

        @Override // com.daaw.ut0
        /* renamed from: a */
        public long mo7738a(a00 a00Var) {
            return -1L;
        }

        @Override // com.daaw.ut0
        /* renamed from: c */
        public da1 mo7737c() {
            return new da1.C1069b(-9223372036854775807L);
        }

        @Override // com.daaw.ut0
        /* renamed from: d */
        public long mo7736d(long j) {
            return 0L;
        }
    }

    /* renamed from: a */
    public long m11348a(long j) {
        return (j * 1000000) / this.f25260i;
    }

    /* renamed from: b */
    public long m11347b(long j) {
        return (this.f25260i * j) / 1000000;
    }

    /* renamed from: c */
    public void m11346c(d00 d00Var, sm1 sm1Var) {
        this.f25254c = d00Var;
        this.f25253b = sm1Var;
        mo3175j(true);
    }

    /* renamed from: d */
    public void mo3178d(long j) {
        this.f25258g = j;
    }

    /* renamed from: e */
    public abstract long mo3177e(rv0 rv0Var);

    /* renamed from: f */
    public final int m11345f(a00 a00Var, iy0 iy0Var) {
        int i = this.f25259h;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return m11343i(a00Var, iy0Var);
                }
                throw new IllegalStateException();
            }
            a00Var.mo5857j((int) this.f25257f);
            this.f25259h = 2;
            return 0;
        }
        return m11344g(a00Var);
    }

    /* renamed from: g */
    public final int m11344g(a00 a00Var) {
        boolean z = true;
        while (z) {
            if (!this.f25252a.m9904d(a00Var)) {
                this.f25259h = 3;
                return -1;
            }
            this.f25262k = a00Var.getPosition() - this.f25257f;
            z = mo3176h(this.f25252a.m9905c(), this.f25257f, this.f25261j);
            if (z) {
                this.f25257f = a00Var.getPosition();
            }
        }
        Format format = this.f25261j.f25265a;
        this.f25260i = format.f35707H;
        if (!this.f25264m) {
            this.f25253b.mo10156d(format);
            this.f25264m = true;
        }
        ut0 ut0Var = this.f25261j.f25266b;
        if (ut0Var != null) {
            this.f25255d = ut0Var;
        } else if (a00Var.mo5859h() == -1) {
            this.f25255d = new C2861c();
        } else {
            tt0 m9906b = this.f25252a.m9906b();
            this.f25255d = new C2360nr(this.f25257f, a00Var.mo5859h(), this, m9906b.f28053h + m9906b.f28054i, m9906b.f28048c);
        }
        this.f25261j = null;
        this.f25259h = 2;
        this.f25252a.m9902f();
        return 0;
    }

    /* renamed from: h */
    public abstract boolean mo3176h(rv0 rv0Var, long j, C2860b c2860b);

    /* renamed from: i */
    public final int m11343i(a00 a00Var, iy0 iy0Var) {
        long mo7738a = this.f25255d.mo7738a(a00Var);
        if (mo7738a >= 0) {
            iy0Var.f14112a = mo7738a;
            return 1;
        }
        if (mo7738a < -1) {
            mo3178d(-(mo7738a + 2));
        }
        if (!this.f25263l) {
            this.f25254c.mo11475d(this.f25255d.mo7737c());
            this.f25263l = true;
        }
        if (this.f25262k <= 0 && !this.f25252a.m9904d(a00Var)) {
            this.f25259h = 3;
            return -1;
        }
        this.f25262k = 0L;
        rv0 m9905c = this.f25252a.m9905c();
        long mo3177e = mo3177e(m9905c);
        if (mo3177e >= 0) {
            long j = this.f25258g;
            if (j + mo3177e >= this.f25256e) {
                long m11348a = m11348a(j);
                this.f25253b.mo10157c(m9905c, m9905c.m10916d());
                this.f25253b.mo10159a(m11348a, 1, m9905c.m10916d(), 0, null);
                this.f25256e = -1L;
            }
        }
        this.f25258g += mo3177e;
        return 0;
    }

    /* renamed from: j */
    public void mo3175j(boolean z) {
        int i;
        if (z) {
            this.f25261j = new C2860b();
            this.f25257f = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.f25259h = i;
        this.f25256e = -1L;
        this.f25258g = 0L;
    }

    /* renamed from: k */
    public final void m11342k(long j, long j2) {
        this.f25252a.m9903e();
        if (j == 0) {
            mo3175j(!this.f25263l);
        } else if (this.f25259h != 0) {
            this.f25256e = this.f25255d.mo7736d(j2);
            this.f25259h = 2;
        }
    }
}
