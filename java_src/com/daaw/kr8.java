package com.daaw;

import android.util.Pair;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes.dex */
public final class kr8 extends cu8 {

    /* renamed from: l */
    public final boolean f16719l;

    /* renamed from: m */
    public final i54 f16720m;

    /* renamed from: n */
    public final d34 f16721n;

    /* renamed from: o */
    public ir8 f16722o;

    /* renamed from: p */
    public br8 f16723p;

    /* renamed from: q */
    public boolean f16724q;

    /* renamed from: r */
    public boolean f16725r;

    /* renamed from: s */
    public boolean f16726s;

    public kr8(rr8 rr8Var, boolean z) {
        super(rr8Var);
        boolean z2;
        if (z) {
            rr8Var.mo11007b();
            z2 = true;
        } else {
            z2 = false;
        }
        this.f16719l = z2;
        this.f16720m = new i54();
        this.f16721n = new d34();
        rr8Var.mo10996p();
        this.f16722o = ir8.m19474q(rr8Var.mo11003h());
    }

    @Override // com.daaw.cu8
    /* renamed from: F */
    public final pr8 mo17451F(pr8 pr8Var) {
        Object obj;
        Object obj2;
        Object obj3 = pr8Var.f18805a;
        obj = this.f16722o.f13960e;
        if (obj != null) {
            obj2 = this.f16722o.f13960e;
            if (obj2.equals(obj3)) {
                obj3 = ir8.f13958f;
            }
        }
        return pr8Var.m13184c(obj3);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    @Override // com.daaw.cu8
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo17450G(l64 l64Var) {
        long j;
        br8 br8Var;
        pr8 pr8Var = null;
        if (this.f16725r) {
            this.f16722o = this.f16722o.m19475p(l64Var);
            br8 br8Var2 = this.f16723p;
            if (br8Var2 != null) {
                m17445L(br8Var2.m25871f());
            }
        } else if (l64Var.m17121o()) {
            this.f16722o = this.f16726s ? this.f16722o.m19475p(l64Var) : ir8.m19473r(l64Var, i54.f13263o, ir8.f13958f);
        } else {
            l64Var.mo1923e(0, this.f16720m, 0L);
            Object obj = this.f16720m.f13267a;
            br8 br8Var3 = this.f16723p;
            if (br8Var3 != null) {
                long m25870i = br8Var3.m25870i();
                this.f16722o.mo13467n(br8Var3.f5081p.f18805a, this.f16721n);
                this.f16722o.mo1923e(0, this.f16720m, 0L);
                if (m25870i != 0) {
                    j = m25870i;
                    Pair m17123l = l64Var.m17123l(this.f16720m, this.f16721n, 0, j);
                    Object obj2 = m17123l.first;
                    long longValue = ((Long) m17123l.second).longValue();
                    this.f16722o = !this.f16726s ? this.f16722o.m19475p(l64Var) : ir8.m19473r(l64Var, obj, obj2);
                    br8Var = this.f16723p;
                    if (br8Var != null) {
                        m17445L(longValue);
                        pr8 pr8Var2 = br8Var.f5081p;
                        pr8Var = pr8Var2.m13184c(m17446K(pr8Var2.f18805a));
                    }
                }
            }
            j = 0;
            Pair m17123l2 = l64Var.m17123l(this.f16720m, this.f16721n, 0, j);
            Object obj22 = m17123l2.first;
            long longValue2 = ((Long) m17123l2.second).longValue();
            this.f16722o = !this.f16726s ? this.f16722o.m19475p(l64Var) : ir8.m19473r(l64Var, obj, obj22);
            br8Var = this.f16723p;
            if (br8Var != null) {
            }
        }
        this.f16726s = true;
        this.f16725r = true;
        m16639x(this.f16722o);
        if (pr8Var != null) {
            br8 br8Var4 = this.f16723p;
            Objects.requireNonNull(br8Var4);
            br8Var4.m25869l(pr8Var);
        }
    }

    @Override // com.daaw.cu8
    /* renamed from: H */
    public final void mo17449H() {
        if (this.f16719l) {
            return;
        }
        this.f16724q = true;
        m9988A(null, this.f6194k);
    }

    /* renamed from: I */
    public final l64 m17448I() {
        return this.f16722o;
    }

    @Override // com.daaw.rr8
    /* renamed from: J */
    public final br8 mo11000k(pr8 pr8Var, nw8 nw8Var, long j) {
        br8 br8Var = new br8(pr8Var, nw8Var, j, null);
        br8Var.m25866o(this.f6194k);
        if (this.f16725r) {
            br8Var.m25869l(pr8Var.m13184c(m17446K(pr8Var.f18805a)));
        } else {
            this.f16723p = br8Var;
            if (!this.f16724q) {
                this.f16724q = true;
                m9988A(null, this.f6194k);
            }
        }
        return br8Var;
    }

    /* renamed from: K */
    public final Object m17446K(Object obj) {
        Object obj2;
        Object obj3;
        obj2 = this.f16722o.f13960e;
        if (obj2 == null || !obj.equals(ir8.f13958f)) {
            return obj;
        }
        obj3 = this.f16722o.f13960e;
        return obj3;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    /* renamed from: L */
    public final void m17445L(long j) {
        br8 br8Var = this.f16723p;
        int mo4511a = this.f16722o.mo4511a(br8Var.f5081p.f18805a);
        if (mo4511a == -1) {
            return;
        }
        ir8 ir8Var = this.f16722o;
        d34 d34Var = this.f16721n;
        ir8Var.mo1924d(mo4511a, d34Var, false);
        long j2 = d34Var.f6451d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        br8Var.m25868m(j);
    }

    @Override // com.daaw.sq8, com.daaw.rr8
    /* renamed from: e */
    public final void mo9983e() {
    }

    @Override // com.daaw.cu8, com.daaw.rr8
    /* renamed from: l */
    public final void mo10999l(nr8 nr8Var) {
        ((br8) nr8Var).m25867n();
        if (nr8Var == this.f16723p) {
            this.f16723p = null;
        }
    }

    @Override // com.daaw.sq8, com.daaw.lq8
    /* renamed from: y */
    public final void mo9979y() {
        this.f16725r = false;
        this.f16724q = false;
        super.mo9979y();
    }
}
