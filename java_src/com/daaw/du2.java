package com.daaw;

import com.google.android.gms.internal.ads.zzatd;
import com.google.android.gms.internal.ads.zzaxo;
import java.util.ArrayList;
import java.util.Stack;
/* loaded from: classes.dex */
public final class du2 implements ns2, us2 {
    public static final ps2 p = new bu2();
    public static final int q = pz2.g("qt  ");
    public int e;
    public int f;
    public long g;
    public int h;
    public iz2 i;
    public int j;
    public int k;
    public os2 l;
    public cu2[] m;
    public long n;
    public boolean o;
    public final iz2 c = new iz2(16);
    public final Stack d = new Stack();
    public final iz2 a = new iz2(gz2.a);
    public final iz2 b = new iz2(4);

    @Override // com.daaw.us2
    public final long a(long j) {
        long j2 = Long.MAX_VALUE;
        for (cu2 cu2Var : this.m) {
            iu2 iu2Var = cu2Var.b;
            int a = iu2Var.a(j);
            if (a == -1) {
                a = iu2Var.b(j);
            }
            long j3 = iu2Var.b[a];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    @Override // com.daaw.ns2
    public final boolean b(ms2 ms2Var) {
        return eu2.b(ms2Var);
    }

    @Override // com.daaw.ns2
    public final void c(os2 os2Var) {
        this.l = os2Var;
    }

    @Override // com.daaw.ns2
    public final void d(long j, long j2) {
        this.d.clear();
        this.h = 0;
        this.j = 0;
        this.k = 0;
        if (j == 0) {
            f();
            return;
        }
        cu2[] cu2VarArr = this.m;
        if (cu2VarArr != null) {
            for (cu2 cu2Var : cu2VarArr) {
                iu2 iu2Var = cu2Var.b;
                int a = iu2Var.a(j2);
                if (a == -1) {
                    a = iu2Var.b(j2);
                }
                cu2Var.d = a;
            }
        }
    }

    @Override // com.daaw.ns2
    public final int e(ms2 ms2Var, ss2 ss2Var) {
        cu2[] cu2VarArr;
        boolean z;
        boolean z2;
        while (true) {
            int i = this.e;
            if (i == 0) {
                if (this.h == 0) {
                    if (!ms2Var.h(this.c.a, 0, 8, true)) {
                        return -1;
                    }
                    this.h = 8;
                    this.c.v(0);
                    this.g = this.c.m();
                    this.f = this.c.e();
                }
                if (this.g == 1) {
                    ms2Var.h(this.c.a, 8, 8, false);
                    this.h += 8;
                    this.g = this.c.n();
                }
                int i2 = this.f;
                if (i2 == nt2.C || i2 == nt2.E || i2 == nt2.F || i2 == nt2.G || i2 == nt2.H || i2 == nt2.Q) {
                    long d = (ms2Var.d() + this.g) - this.h;
                    this.d.add(new lt2(this.f, d));
                    if (this.g == this.h) {
                        g(d);
                    } else {
                        f();
                    }
                } else {
                    if (i2 == nt2.S || i2 == nt2.D || i2 == nt2.T || i2 == nt2.U || i2 == nt2.m0 || i2 == nt2.n0 || i2 == nt2.o0 || i2 == nt2.R || i2 == nt2.p0 || i2 == nt2.q0 || i2 == nt2.r0 || i2 == nt2.s0 || i2 == nt2.t0 || i2 == nt2.P || i2 == nt2.b || i2 == nt2.A0) {
                        az2.e(this.h == 8);
                        az2.e(this.g <= 2147483647L);
                        iz2 iz2Var = new iz2((int) this.g);
                        this.i = iz2Var;
                        System.arraycopy(this.c.a, 0, iz2Var.a, 0, 8);
                    } else {
                        this.i = null;
                    }
                    this.e = 1;
                }
            } else if (i != 1) {
                long j = Long.MAX_VALUE;
                int i3 = 0;
                int i4 = -1;
                while (true) {
                    cu2VarArr = this.m;
                    if (i3 >= cu2VarArr.length) {
                        break;
                    }
                    cu2 cu2Var = cu2VarArr[i3];
                    int i5 = cu2Var.d;
                    iu2 iu2Var = cu2Var.b;
                    if (i5 != iu2Var.a) {
                        long j2 = iu2Var.b[i5];
                        if (j2 < j) {
                            i4 = i3;
                            j = j2;
                        }
                    }
                    i3++;
                }
                if (i4 == -1) {
                    return -1;
                }
                cu2 cu2Var2 = cu2VarArr[i4];
                ws2 ws2Var = cu2Var2.c;
                int i6 = cu2Var2.d;
                iu2 iu2Var2 = cu2Var2.b;
                long j3 = iu2Var2.b[i6];
                int i7 = iu2Var2.c[i6];
                if (cu2Var2.a.g == 1) {
                    j3 += 8;
                    i7 -= 8;
                }
                long d2 = (j3 - ms2Var.d()) + this.j;
                if (d2 < 0 || d2 >= 262144) {
                    ss2Var.a = j3;
                    return 1;
                }
                int i8 = (int) d2;
                boolean z3 = false;
                ms2Var.i(i8, false);
                int i9 = cu2Var2.a.k;
                if (i9 == 0) {
                    while (true) {
                        int i10 = this.j;
                        if (i10 >= i7) {
                            break;
                        }
                        int b = ws2Var.b(ms2Var, i7 - i10, false);
                        this.j += b;
                        this.k -= b;
                    }
                } else {
                    byte[] bArr = this.b.a;
                    bArr[0] = 0;
                    bArr[1] = 0;
                    bArr[2] = 0;
                    int i11 = 4 - i9;
                    while (this.j < i7) {
                        int i12 = this.k;
                        if (i12 == 0) {
                            ms2Var.h(this.b.a, i11, i9, z3);
                            this.b.v(z3 ? 1 : 0);
                            this.k = this.b.i();
                            this.a.v(z3 ? 1 : 0);
                            ws2Var.c(this.a, 4);
                            this.j += 4;
                            i7 += i11;
                        } else {
                            int b2 = ws2Var.b(ms2Var, i12, z3);
                            this.j += b2;
                            this.k -= b2;
                            z3 = false;
                        }
                    }
                }
                int i13 = i7;
                iu2 iu2Var3 = cu2Var2.b;
                ws2Var.d(iu2Var3.e[i6], iu2Var3.f[i6], i13, 0, null);
                cu2Var2.d++;
                this.j = 0;
                this.k = 0;
                return 0;
            } else {
                long j4 = this.g;
                int i14 = this.h;
                long j5 = j4 - i14;
                long d3 = ms2Var.d() + j5;
                iz2 iz2Var2 = this.i;
                if (iz2Var2 != null) {
                    ms2Var.h(iz2Var2.a, i14, (int) j5, false);
                    if (this.f == nt2.b) {
                        iz2 iz2Var3 = this.i;
                        iz2Var3.v(8);
                        if (iz2Var3.e() == q) {
                            z2 = true;
                            break;
                        }
                        iz2Var3.w(4);
                        while (iz2Var3.a() > 0) {
                            if (iz2Var3.e() == q) {
                                z2 = true;
                                break;
                            }
                        }
                        z2 = false;
                        this.o = z2;
                    } else if (!this.d.isEmpty()) {
                        ((lt2) this.d.peek()).g(new mt2(this.f, this.i));
                    }
                } else if (j5 < 262144) {
                    ms2Var.i((int) j5, false);
                } else {
                    ss2Var.a = ms2Var.d() + j5;
                    z = true;
                    g(d3);
                    if (z && this.e != 2) {
                        return 1;
                    }
                }
                z = false;
                g(d3);
                if (z) {
                    return 1;
                }
                continue;
            }
        }
    }

    public final void f() {
        this.e = 0;
        this.h = 0;
    }

    public final void g(long j) {
        zzaxo zzaxoVar;
        rs2 rs2Var;
        zzaxo zzaxoVar2;
        fu2 a;
        while (!this.d.isEmpty() && ((lt2) this.d.peek()).P0 == j) {
            lt2 lt2Var = (lt2) this.d.pop();
            if (lt2Var.a == nt2.C) {
                ArrayList arrayList = new ArrayList();
                rs2 rs2Var2 = new rs2();
                mt2 e = lt2Var.e(nt2.A0);
                if (e != null) {
                    zzaxoVar = ut2.c(e, this.o);
                    if (zzaxoVar != null) {
                        rs2Var2.b(zzaxoVar);
                    }
                } else {
                    zzaxoVar = null;
                }
                long j2 = -9223372036854775807L;
                long j3 = Long.MAX_VALUE;
                int i = 0;
                while (i < lt2Var.R0.size()) {
                    lt2 lt2Var2 = (lt2) lt2Var.R0.get(i);
                    if (lt2Var2.a == nt2.E && (a = ut2.a(lt2Var2, lt2Var.e(nt2.D), -9223372036854775807L, null, this.o)) != null) {
                        iu2 b = ut2.b(a, lt2Var2.d(nt2.F).d(nt2.G).d(nt2.H), rs2Var2);
                        if (b.a != 0) {
                            cu2 cu2Var = new cu2(a, b, this.l.h(i, a.b));
                            zzatd h = a.f.h(b.d + 30);
                            if (a.b == 1) {
                                if (rs2Var2.a()) {
                                    h = h.g(rs2Var2.a, rs2Var2.b);
                                }
                                if (zzaxoVar != null) {
                                    h = h.i(zzaxoVar);
                                }
                            }
                            cu2Var.c.a(h);
                            rs2Var = rs2Var2;
                            zzaxoVar2 = zzaxoVar;
                            long max = Math.max(j2, a.e);
                            arrayList.add(cu2Var);
                            long j4 = b.b[0];
                            if (j4 < j3) {
                                j2 = max;
                                j3 = j4;
                            } else {
                                j2 = max;
                            }
                            i++;
                            rs2Var2 = rs2Var;
                            zzaxoVar = zzaxoVar2;
                        }
                    }
                    rs2Var = rs2Var2;
                    zzaxoVar2 = zzaxoVar;
                    i++;
                    rs2Var2 = rs2Var;
                    zzaxoVar = zzaxoVar2;
                }
                this.n = j2;
                this.m = (cu2[]) arrayList.toArray(new cu2[arrayList.size()]);
                this.l.zzb();
                this.l.b(this);
                this.d.clear();
                this.e = 2;
            } else if (!this.d.isEmpty()) {
                ((lt2) this.d.peek()).f(lt2Var);
            }
        }
        if (this.e != 2) {
            f();
        }
    }

    @Override // com.daaw.us2
    public final long zza() {
        return this.n;
    }

    @Override // com.daaw.us2
    public final boolean zzc() {
        return true;
    }
}
