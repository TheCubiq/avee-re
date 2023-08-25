package com.daaw;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzacj;
import com.google.android.gms.internal.ads.zzbq;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class s52 implements j09 {
    public static final q09 n = new q09() { // from class: com.daaw.r52
        @Override // com.daaw.q09
        public final /* synthetic */ j09[] a(Uri uri, Map map) {
            return p09.a(this, uri, map);
        }

        @Override // com.daaw.q09
        public final j09[] zza() {
            q09 q09Var = s52.n;
            return new j09[]{new s52(0)};
        }
    };
    public m09 d;
    public m42 e;
    public zzbq g;
    public w09 h;
    public int i;
    public int j;
    public q52 k;
    public int l;
    public long m;
    public final byte[] a = new byte[42];
    public final ik5 b = new ik5(new byte[32768], 0);
    public final r09 c = new r09();
    public int f = 0;

    public s52(int i) {
    }

    @Override // com.daaw.j09
    public final boolean a(k09 k09Var) {
        t09.a(k09Var, false);
        ik5 ik5Var = new ik5(4);
        ((rz8) k09Var).h(ik5Var.h(), 0, 4, false);
        return ik5Var.A() == 1716281667;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
        r5.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        return r4.c.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(com.daaw.ik5 r5, boolean r6) {
        /*
            r4 = this;
            com.daaw.w09 r0 = r4.h
            java.util.Objects.requireNonNull(r0)
            int r0 = r5.k()
        L9:
            int r1 = r5.l()
            int r1 = r1 + (-16)
            if (r0 > r1) goto L2b
            r5.f(r0)
            com.daaw.w09 r1 = r4.h
            int r2 = r4.j
            com.daaw.r09 r3 = r4.c
            boolean r1 = com.daaw.s09.c(r5, r1, r2, r3)
            if (r1 == 0) goto L28
        L20:
            r5.f(r0)
            com.daaw.r09 r5 = r4.c
            long r5 = r5.a
            return r5
        L28:
            int r0 = r0 + 1
            goto L9
        L2b:
            if (r6 == 0) goto L5e
        L2d:
            int r6 = r5.l()
            int r1 = r4.i
            int r6 = r6 - r1
            if (r0 > r6) goto L56
            r5.f(r0)
            com.daaw.w09 r6 = r4.h     // Catch: java.lang.IndexOutOfBoundsException -> L44
            int r1 = r4.j     // Catch: java.lang.IndexOutOfBoundsException -> L44
            com.daaw.r09 r2 = r4.c     // Catch: java.lang.IndexOutOfBoundsException -> L44
            boolean r6 = com.daaw.s09.c(r5, r6, r1, r2)     // Catch: java.lang.IndexOutOfBoundsException -> L44
            goto L45
        L44:
            r6 = 0
        L45:
            int r1 = r5.k()
            int r2 = r5.l()
            if (r1 <= r2) goto L50
            goto L53
        L50:
            if (r6 == 0) goto L53
            goto L20
        L53:
            int r0 = r0 + 1
            goto L2d
        L56:
            int r6 = r5.l()
            r5.f(r6)
            goto L61
        L5e:
            r5.f(r0)
        L61:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.s52.b(com.daaw.ik5, boolean):long");
    }

    @Override // com.daaw.j09
    public final void c(m09 m09Var) {
        this.d = m09Var;
        this.e = m09Var.n(0, 1);
        m09Var.zzC();
    }

    @Override // com.daaw.j09
    public final int d(k09 k09Var, f42 f42Var) {
        boolean l;
        i42 h42Var;
        boolean z;
        int i = this.f;
        if (i == 0) {
            k09Var.zzj();
            long zze = k09Var.zze();
            zzbq a = t09.a(k09Var, true);
            ((rz8) k09Var).l((int) (k09Var.zze() - zze), false);
            this.g = a;
            this.f = 1;
            return 0;
        } else if (i == 1) {
            ((rz8) k09Var).h(this.a, 0, 42, false);
            k09Var.zzj();
            this.f = 2;
            return 0;
        } else if (i == 2) {
            ik5 ik5Var = new ik5(4);
            ((rz8) k09Var).e(ik5Var.h(), 0, 4, false);
            if (ik5Var.A() == 1716281667) {
                this.f = 3;
                return 0;
            }
            throw dl3.a("Failed to read FLAC stream marker.", null);
        } else if (i == 3) {
            w09 w09Var = this.h;
            do {
                k09Var.zzj();
                cj5 cj5Var = new cj5(new byte[4], 4);
                rz8 rz8Var = (rz8) k09Var;
                rz8Var.h(cj5Var.a, 0, 4, false);
                l = cj5Var.l();
                int c = cj5Var.c(7);
                int c2 = cj5Var.c(24) + 4;
                if (c == 0) {
                    byte[] bArr = new byte[38];
                    rz8Var.e(bArr, 0, 38, false);
                    w09Var = new w09(bArr, 4);
                } else if (w09Var == null) {
                    throw new IllegalArgumentException();
                } else {
                    if (c == 3) {
                        ik5 ik5Var2 = new ik5(c2);
                        rz8Var.e(ik5Var2.h(), 0, c2, false);
                        w09Var = w09Var.f(t09.b(ik5Var2));
                    } else if (c == 4) {
                        ik5 ik5Var3 = new ik5(c2);
                        rz8Var.e(ik5Var3.h(), 0, c2, false);
                        ik5Var3.g(4);
                        w09Var = w09Var.g(Arrays.asList(s42.c(ik5Var3, false, false).b));
                    } else if (c == 6) {
                        ik5 ik5Var4 = new ik5(c2);
                        rz8Var.e(ik5Var4.h(), 0, c2, false);
                        ik5Var4.g(4);
                        w09Var = w09Var.e(y17.v(zzacj.a(ik5Var4)));
                    } else {
                        rz8Var.l(c2, false);
                    }
                }
                int i2 = it5.a;
                this.h = w09Var;
            } while (!l);
            Objects.requireNonNull(w09Var);
            this.i = Math.max(w09Var.c, 6);
            this.e.f(this.h.c(this.a, this.g));
            this.f = 4;
            return 0;
        } else if (i == 4) {
            k09Var.zzj();
            ik5 ik5Var5 = new ik5(2);
            ((rz8) k09Var).h(ik5Var5.h(), 0, 2, false);
            int w = ik5Var5.w();
            int i3 = w >> 2;
            k09Var.zzj();
            if (i3 == 16382) {
                this.j = w;
                m09 m09Var = this.d;
                int i4 = it5.a;
                long zzf = k09Var.zzf();
                long zzd = k09Var.zzd();
                w09 w09Var2 = this.h;
                Objects.requireNonNull(w09Var2);
                if (w09Var2.k != null) {
                    h42Var = new u09(w09Var2, zzf);
                } else if (zzd == -1 || w09Var2.j <= 0) {
                    h42Var = new h42(w09Var2.a(), 0L);
                } else {
                    q52 q52Var = new q52(w09Var2, this.j, zzf, zzd);
                    this.k = q52Var;
                    h42Var = q52Var.b();
                }
                m09Var.i(h42Var);
                this.f = 5;
                return 0;
            }
            throw dl3.a("First frame does not start with sync code.", null);
        } else {
            Objects.requireNonNull(this.e);
            w09 w09Var3 = this.h;
            Objects.requireNonNull(w09Var3);
            q52 q52Var2 = this.k;
            if (q52Var2 == null || !q52Var2.e()) {
                if (this.m == -1) {
                    this.m = s09.b(k09Var, w09Var3);
                    return 0;
                }
                ik5 ik5Var6 = this.b;
                int l2 = ik5Var6.l();
                if (l2 < 32768) {
                    int a2 = k09Var.a(ik5Var6.h(), l2, 32768 - l2);
                    z = a2 == -1;
                    if (!z) {
                        this.b.e(l2 + a2);
                    } else if (this.b.i() == 0) {
                        e();
                        return -1;
                    }
                } else {
                    z = false;
                }
                ik5 ik5Var7 = this.b;
                int k = ik5Var7.k();
                int i5 = this.l;
                int i6 = this.i;
                if (i5 < i6) {
                    ik5Var7.g(Math.min(i6 - i5, ik5Var7.i()));
                }
                long b = b(this.b, z);
                ik5 ik5Var8 = this.b;
                int k2 = ik5Var8.k() - k;
                ik5Var8.f(k);
                k42.b(this.e, this.b, k2);
                this.l += k2;
                if (b != -1) {
                    e();
                    this.l = 0;
                    this.m = b;
                }
                ik5 ik5Var9 = this.b;
                if (ik5Var9.i() >= 16) {
                    return 0;
                }
                int i7 = ik5Var9.i();
                System.arraycopy(ik5Var9.h(), ik5Var9.k(), ik5Var9.h(), 0, i7);
                this.b.f(0);
                this.b.e(i7);
                return 0;
            }
            return q52Var2.a(k09Var, f42Var);
        }
    }

    public final void e() {
        long j = this.m;
        w09 w09Var = this.h;
        int i = it5.a;
        this.e.b((j * 1000000) / w09Var.e, 1, this.l, 0, null);
    }

    @Override // com.daaw.j09
    public final void f(long j, long j2) {
        if (j == 0) {
            this.f = 0;
        } else {
            q52 q52Var = this.k;
            if (q52Var != null) {
                q52Var.d(j2);
            }
        }
        this.m = j2 != 0 ? -1L : 0L;
        this.l = 0;
        this.b.c(0);
    }
}
