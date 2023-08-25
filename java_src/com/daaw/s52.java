package com.daaw;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzacj;
import com.google.android.gms.internal.ads.zzbq;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class s52 implements j09 {

    /* renamed from: n */
    public static final q09 f25865n = new q09() { // from class: com.daaw.r52
        @Override // com.daaw.q09
        /* renamed from: a */
        public final /* synthetic */ j09[] mo2588a(Uri uri, Map map) {
            return p09.m13771a(this, uri, map);
        }

        @Override // com.daaw.q09
        public final j09[] zza() {
            q09 q09Var = s52.f25865n;
            return new j09[]{new s52(0)};
        }
    };

    /* renamed from: d */
    public m09 f25869d;

    /* renamed from: e */
    public m42 f25870e;

    /* renamed from: g */
    public zzbq f25872g;

    /* renamed from: h */
    public w09 f25873h;

    /* renamed from: i */
    public int f25874i;

    /* renamed from: j */
    public int f25875j;

    /* renamed from: k */
    public q52 f25876k;

    /* renamed from: l */
    public int f25877l;

    /* renamed from: m */
    public long f25878m;

    /* renamed from: a */
    public final byte[] f25866a = new byte[42];

    /* renamed from: b */
    public final ik5 f25867b = new ik5(new byte[32768], 0);

    /* renamed from: c */
    public final r09 f25868c = new r09();

    /* renamed from: f */
    public int f25871f = 0;

    public s52(int i) {
    }

    @Override // com.daaw.j09
    /* renamed from: a */
    public final boolean mo3957a(k09 k09Var) {
        t09.m9666a(k09Var, false);
        ik5 ik5Var = new ik5(4);
        ((rz8) k09Var).mo5661h(ik5Var.m19714h(), 0, 4, false);
        return ik5Var.m19729A() == 1716281667;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
        r5.m19716f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        return r4.f25868c.f24713a;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m10707b(ik5 ik5Var, boolean z) {
        boolean z2;
        Objects.requireNonNull(this.f25873h);
        int m19711k = ik5Var.m19711k();
        while (true) {
            if (m19711k > ik5Var.m19710l() - 16) {
                if (!z) {
                    ik5Var.m19716f(m19711k);
                    return -1L;
                }
                while (m19711k <= ik5Var.m19710l() - this.f25874i) {
                    ik5Var.m19716f(m19711k);
                    try {
                        z2 = s09.m10797c(ik5Var, this.f25873h, this.f25875j, this.f25868c);
                    } catch (IndexOutOfBoundsException unused) {
                        z2 = false;
                    }
                    if (ik5Var.m19711k() > ik5Var.m19710l() || !z2) {
                        m19711k++;
                    }
                }
                ik5Var.m19716f(ik5Var.m19710l());
                return -1L;
            }
            ik5Var.m19716f(m19711k);
            if (s09.m10797c(ik5Var, this.f25873h, this.f25875j, this.f25868c)) {
                break;
            }
            m19711k++;
        }
    }

    @Override // com.daaw.j09
    /* renamed from: c */
    public final void mo3955c(m09 m09Var) {
        this.f25869d = m09Var;
        this.f25870e = m09Var.mo3292n(0, 1);
        m09Var.zzC();
    }

    @Override // com.daaw.j09
    /* renamed from: d */
    public final int mo3954d(k09 k09Var, f42 f42Var) {
        boolean m25320l;
        i42 h42Var;
        boolean z;
        int i = this.f25871f;
        if (i == 0) {
            k09Var.zzj();
            long zze = k09Var.zze();
            zzbq m9666a = t09.m9666a(k09Var, true);
            ((rz8) k09Var).m10811l((int) (k09Var.zze() - zze), false);
            this.f25872g = m9666a;
            this.f25871f = 1;
            return 0;
        } else if (i == 1) {
            ((rz8) k09Var).mo5661h(this.f25866a, 0, 42, false);
            k09Var.zzj();
            this.f25871f = 2;
            return 0;
        } else if (i == 2) {
            ik5 ik5Var = new ik5(4);
            ((rz8) k09Var).mo5663e(ik5Var.m19714h(), 0, 4, false);
            if (ik5Var.m19729A() == 1716281667) {
                this.f25871f = 3;
                return 0;
            }
            throw dl3.m24267a("Failed to read FLAC stream marker.", null);
        } else if (i == 3) {
            w09 w09Var = this.f25873h;
            do {
                k09Var.zzj();
                cj5 cj5Var = new cj5(new byte[4], 4);
                rz8 rz8Var = (rz8) k09Var;
                rz8Var.mo5661h(cj5Var.f5841a, 0, 4, false);
                m25320l = cj5Var.m25320l();
                int m25329c = cj5Var.m25329c(7);
                int m25329c2 = cj5Var.m25329c(24) + 4;
                if (m25329c == 0) {
                    byte[] bArr = new byte[38];
                    rz8Var.mo5663e(bArr, 0, 38, false);
                    w09Var = new w09(bArr, 4);
                } else if (w09Var == null) {
                    throw new IllegalArgumentException();
                } else {
                    if (m25329c == 3) {
                        ik5 ik5Var2 = new ik5(m25329c2);
                        rz8Var.mo5663e(ik5Var2.m19714h(), 0, m25329c2, false);
                        w09Var = w09Var.m6596f(t09.m9665b(ik5Var2));
                    } else if (m25329c == 4) {
                        ik5 ik5Var3 = new ik5(m25329c2);
                        rz8Var.mo5663e(ik5Var3.m19714h(), 0, m25329c2, false);
                        ik5Var3.m19715g(4);
                        w09Var = w09Var.m6595g(Arrays.asList(s42.m10717c(ik5Var3, false, false).f22586b));
                    } else if (m25329c == 6) {
                        ik5 ik5Var4 = new ik5(m25329c2);
                        rz8Var.mo5663e(ik5Var4.m19714h(), 0, m25329c2, false);
                        ik5Var4.m19715g(4);
                        w09Var = w09Var.m6597e(y17.m4259v(zzacj.m1134a(ik5Var4)));
                    } else {
                        rz8Var.m10811l(m25329c2, false);
                    }
                }
                int i2 = it5.f13991a;
                this.f25873h = w09Var;
            } while (!m25320l);
            Objects.requireNonNull(w09Var);
            this.f25874i = Math.max(w09Var.f30774c, 6);
            this.f25870e.mo16218f(this.f25873h.m6599c(this.f25866a, this.f25872g));
            this.f25871f = 4;
            return 0;
        } else if (i == 4) {
            k09Var.zzj();
            ik5 ik5Var5 = new ik5(2);
            ((rz8) k09Var).mo5661h(ik5Var5.m19714h(), 0, 2, false);
            int m19699w = ik5Var5.m19699w();
            int i3 = m19699w >> 2;
            k09Var.zzj();
            if (i3 == 16382) {
                this.f25875j = m19699w;
                m09 m09Var = this.f25869d;
                int i4 = it5.f13991a;
                long zzf = k09Var.zzf();
                long zzd = k09Var.zzd();
                w09 w09Var2 = this.f25873h;
                Objects.requireNonNull(w09Var2);
                if (w09Var2.f30782k != null) {
                    h42Var = new u09(w09Var2, zzf);
                } else if (zzd == -1 || w09Var2.f30781j <= 0) {
                    h42Var = new h42(w09Var2.m6601a(), 0L);
                } else {
                    q52 q52Var = new q52(w09Var2, this.f25875j, zzf, zzd);
                    this.f25876k = q52Var;
                    h42Var = q52Var.m14702b();
                }
                m09Var.mo3297i(h42Var);
                this.f25871f = 5;
                return 0;
            }
            throw dl3.m24267a("First frame does not start with sync code.", null);
        } else {
            Objects.requireNonNull(this.f25870e);
            w09 w09Var3 = this.f25873h;
            Objects.requireNonNull(w09Var3);
            q52 q52Var2 = this.f25876k;
            if (q52Var2 == null || !q52Var2.m14699e()) {
                if (this.f25878m == -1) {
                    this.f25878m = s09.m10798b(k09Var, w09Var3);
                    return 0;
                }
                ik5 ik5Var6 = this.f25867b;
                int m19710l = ik5Var6.m19710l();
                if (m19710l < 32768) {
                    int mo1980a = k09Var.mo1980a(ik5Var6.m19714h(), m19710l, 32768 - m19710l);
                    z = mo1980a == -1;
                    if (!z) {
                        this.f25867b.m19717e(m19710l + mo1980a);
                    } else if (this.f25867b.m19713i() == 0) {
                        m10706e();
                        return -1;
                    }
                } else {
                    z = false;
                }
                ik5 ik5Var7 = this.f25867b;
                int m19711k = ik5Var7.m19711k();
                int i5 = this.f25877l;
                int i6 = this.f25874i;
                if (i5 < i6) {
                    ik5Var7.m19715g(Math.min(i6 - i5, ik5Var7.m19713i()));
                }
                long m10707b = m10707b(this.f25867b, z);
                ik5 ik5Var8 = this.f25867b;
                int m19711k2 = ik5Var8.m19711k() - m19711k;
                ik5Var8.m19716f(m19711k);
                k42.m18050b(this.f25870e, this.f25867b, m19711k2);
                this.f25877l += m19711k2;
                if (m10707b != -1) {
                    m10706e();
                    this.f25877l = 0;
                    this.f25878m = m10707b;
                }
                ik5 ik5Var9 = this.f25867b;
                if (ik5Var9.m19713i() >= 16) {
                    return 0;
                }
                int m19713i = ik5Var9.m19713i();
                System.arraycopy(ik5Var9.m19714h(), ik5Var9.m19711k(), ik5Var9.m19714h(), 0, m19713i);
                this.f25867b.m19716f(0);
                this.f25867b.m19717e(m19713i);
                return 0;
            }
            return q52Var2.m14703a(k09Var, f42Var);
        }
    }

    /* renamed from: e */
    public final void m10706e() {
        long j = this.f25878m;
        w09 w09Var = this.f25873h;
        int i = it5.f13991a;
        this.f25870e.mo16222b((j * 1000000) / w09Var.f30776e, 1, this.f25877l, 0, null);
    }

    @Override // com.daaw.j09
    /* renamed from: f */
    public final void mo3953f(long j, long j2) {
        if (j == 0) {
            this.f25871f = 0;
        } else {
            q52 q52Var = this.f25876k;
            if (q52Var != null) {
                q52Var.m14700d(j2);
            }
        }
        this.f25878m = j2 != 0 ? -1L : 0L;
        this.f25877l = 0;
        this.f25867b.m19719c(0);
    }
}
