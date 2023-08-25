package com.daaw;

import android.net.Uri;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes.dex */
public final class v52 implements j09 {

    /* renamed from: q */
    public static final q09 f29900q = new q09() { // from class: com.daaw.u52
        @Override // com.daaw.q09
        /* renamed from: a */
        public final /* synthetic */ j09[] mo2588a(Uri uri, Map map) {
            return p09.m13771a(this, uri, map);
        }

        @Override // com.daaw.q09
        public final j09[] zza() {
            q09 q09Var = v52.f29900q;
            return new j09[]{new v52()};
        }
    };

    /* renamed from: f */
    public m09 f29906f;

    /* renamed from: h */
    public boolean f29908h;

    /* renamed from: i */
    public long f29909i;

    /* renamed from: j */
    public int f29910j;

    /* renamed from: k */
    public int f29911k;

    /* renamed from: l */
    public int f29912l;

    /* renamed from: m */
    public long f29913m;

    /* renamed from: n */
    public boolean f29914n;

    /* renamed from: o */
    public t52 f29915o;

    /* renamed from: p */
    public z52 f29916p;

    /* renamed from: a */
    public final ik5 f29901a = new ik5(4);

    /* renamed from: b */
    public final ik5 f29902b = new ik5(9);

    /* renamed from: c */
    public final ik5 f29903c = new ik5(11);

    /* renamed from: d */
    public final ik5 f29904d = new ik5();

    /* renamed from: e */
    public final w52 f29905e = new w52();

    /* renamed from: g */
    public int f29907g = 1;

    @Override // com.daaw.j09
    /* renamed from: a */
    public final boolean mo3957a(k09 k09Var) {
        rz8 rz8Var = (rz8) k09Var;
        rz8Var.mo5661h(this.f29901a.m19714h(), 0, 3, false);
        this.f29901a.m19716f(0);
        if (this.f29901a.m19701u() != 4607062) {
            return false;
        }
        rz8Var.mo5661h(this.f29901a.m19714h(), 0, 2, false);
        this.f29901a.m19716f(0);
        if ((this.f29901a.m19699w() & 250) != 0) {
            return false;
        }
        rz8Var.mo5661h(this.f29901a.m19714h(), 0, 4, false);
        this.f29901a.m19716f(0);
        int m19709m = this.f29901a.m19709m();
        k09Var.zzj();
        rz8 rz8Var2 = (rz8) k09Var;
        rz8Var2.m10812k(m19709m, false);
        rz8Var2.mo5661h(this.f29901a.m19714h(), 0, 4, false);
        this.f29901a.m19716f(0);
        return this.f29901a.m19709m() == 0;
    }

    /* renamed from: b */
    public final ik5 m7421b(k09 k09Var) {
        if (this.f29912l > this.f29904d.m19712j()) {
            ik5 ik5Var = this.f29904d;
            int m19712j = ik5Var.m19712j();
            ik5Var.m19718d(new byte[Math.max(m19712j + m19712j, this.f29912l)], 0);
        } else {
            this.f29904d.m19716f(0);
        }
        this.f29904d.m19717e(this.f29912l);
        ((rz8) k09Var).mo5663e(this.f29904d.m19714h(), 0, this.f29912l, false);
        return this.f29904d;
    }

    @Override // com.daaw.j09
    /* renamed from: c */
    public final void mo3955c(m09 m09Var) {
        this.f29906f = m09Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0009 A[SYNTHETIC] */
    @Override // com.daaw.j09
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo3954d(k09 k09Var, f42 f42Var) {
        boolean m4095c;
        boolean z;
        y52 y52Var;
        uo4.m7876b(this.f29906f);
        while (true) {
            int i = this.f29907g;
            int i2 = 8;
            if (i != 1) {
                if (i == 2) {
                    ((rz8) k09Var).m10811l(this.f29910j, false);
                    this.f29910j = 0;
                    this.f29907g = 3;
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    long j = this.f29908h ? this.f29909i + this.f29913m : this.f29905e.m6525d() == -9223372036854775807L ? 0L : this.f29913m;
                    int i3 = this.f29911k;
                    if (i3 != 8) {
                        i2 = i3;
                    } else if (this.f29915o != null) {
                        m7420e();
                        y52Var = this.f29915o;
                        m4095c = y52Var.m4095c(m7421b(k09Var), j);
                        z = true;
                        if (!this.f29908h && m4095c) {
                            this.f29908h = true;
                            this.f29909i = this.f29905e.m6525d() != -9223372036854775807L ? -this.f29913m : 0L;
                        }
                        this.f29910j = 4;
                        this.f29907g = 2;
                        if (!z) {
                            return 0;
                        }
                    }
                    if (i2 == 9) {
                        if (this.f29916p != null) {
                            m7420e();
                            y52Var = this.f29916p;
                            m4095c = y52Var.m4095c(m7421b(k09Var), j);
                            z = true;
                            if (!this.f29908h) {
                                this.f29908h = true;
                                this.f29909i = this.f29905e.m6525d() != -9223372036854775807L ? -this.f29913m : 0L;
                            }
                            this.f29910j = 4;
                            this.f29907g = 2;
                            if (!z) {
                            }
                        }
                    } else if (i2 == 18 && !this.f29914n) {
                        m4095c = this.f29905e.m4095c(m7421b(k09Var), j);
                        w52 w52Var = this.f29905e;
                        long m6525d = w52Var.m6525d();
                        if (m6525d != -9223372036854775807L) {
                            this.f29906f.mo3297i(new x32(w52Var.m6524e(), w52Var.m6523f(), m6525d));
                            this.f29914n = true;
                        }
                        z = true;
                        if (!this.f29908h) {
                        }
                        this.f29910j = 4;
                        this.f29907g = 2;
                        if (!z) {
                        }
                    }
                    ((rz8) k09Var).m10811l(this.f29912l, false);
                    m4095c = false;
                    z = false;
                    if (!this.f29908h) {
                    }
                    this.f29910j = 4;
                    this.f29907g = 2;
                    if (!z) {
                    }
                } else if (!k09Var.mo5663e(this.f29903c.m19714h(), 0, 11, true)) {
                    return -1;
                } else {
                    this.f29903c.m19716f(0);
                    this.f29911k = this.f29903c.m19703s();
                    this.f29912l = this.f29903c.m19701u();
                    this.f29913m = this.f29903c.m19701u();
                    this.f29913m = ((this.f29903c.m19703s() << 24) | this.f29913m) * 1000;
                    this.f29903c.m19715g(3);
                    this.f29907g = 4;
                }
            } else if (!k09Var.mo5663e(this.f29902b.m19714h(), 0, 9, true)) {
                return -1;
            } else {
                this.f29902b.m19716f(0);
                this.f29902b.m19715g(4);
                int m19703s = this.f29902b.m19703s();
                int i4 = m19703s & 1;
                if ((m19703s & 4) != 0 && this.f29915o == null) {
                    this.f29915o = new t52(this.f29906f.mo3292n(8, 1));
                }
                if (i4 != 0 && this.f29916p == null) {
                    this.f29916p = new z52(this.f29906f.mo3292n(9, 2));
                }
                this.f29906f.zzC();
                this.f29910j = this.f29902b.m19709m() - 5;
                this.f29907g = 2;
            }
        }
    }

    @RequiresNonNull({"extractorOutput"})
    /* renamed from: e */
    public final void m7420e() {
        if (this.f29914n) {
            return;
        }
        this.f29906f.mo3297i(new h42(-9223372036854775807L, 0L));
        this.f29914n = true;
    }

    @Override // com.daaw.j09
    /* renamed from: f */
    public final void mo3953f(long j, long j2) {
        if (j == 0) {
            this.f29907g = 1;
            this.f29908h = false;
        } else {
            this.f29907g = 3;
        }
        this.f29910j = 0;
    }
}
