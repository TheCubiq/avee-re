package com.daaw;

import com.google.android.gms.internal.ads.zzatd;
import com.google.android.gms.internal.ads.zzaxo;
import java.util.ArrayList;
import java.util.Stack;
/* loaded from: classes.dex */
public final class du2 implements ns2, us2 {

    /* renamed from: p */
    public static final ps2 f7805p = new bu2();

    /* renamed from: q */
    public static final int f7806q = pz2.m12843g("qt  ");

    /* renamed from: e */
    public int f7811e;

    /* renamed from: f */
    public int f7812f;

    /* renamed from: g */
    public long f7813g;

    /* renamed from: h */
    public int f7814h;

    /* renamed from: i */
    public iz2 f7815i;

    /* renamed from: j */
    public int f7816j;

    /* renamed from: k */
    public int f7817k;

    /* renamed from: l */
    public os2 f7818l;

    /* renamed from: m */
    public cu2[] f7819m;

    /* renamed from: n */
    public long f7820n;

    /* renamed from: o */
    public boolean f7821o;

    /* renamed from: c */
    public final iz2 f7809c = new iz2(16);

    /* renamed from: d */
    public final Stack f7810d = new Stack();

    /* renamed from: a */
    public final iz2 f7807a = new iz2(gz2.f11863a);

    /* renamed from: b */
    public final iz2 f7808b = new iz2(4);

    @Override // com.daaw.us2
    /* renamed from: a */
    public final long mo7742a(long j) {
        long j2 = Long.MAX_VALUE;
        for (cu2 cu2Var : this.f7819m) {
            iu2 iu2Var = cu2Var.f6184b;
            int m19348a = iu2Var.m19348a(j);
            if (m19348a == -1) {
                m19348a = iu2Var.m19347b(j);
            }
            long j3 = iu2Var.f14009b[m19348a];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    @Override // com.daaw.ns2
    /* renamed from: b */
    public final boolean mo1914b(ms2 ms2Var) {
        return eu2.m23177b(ms2Var);
    }

    @Override // com.daaw.ns2
    /* renamed from: c */
    public final void mo1913c(os2 os2Var) {
        this.f7818l = os2Var;
    }

    @Override // com.daaw.ns2
    /* renamed from: d */
    public final void mo1912d(long j, long j2) {
        this.f7810d.clear();
        this.f7814h = 0;
        this.f7816j = 0;
        this.f7817k = 0;
        if (j == 0) {
            m23946f();
            return;
        }
        cu2[] cu2VarArr = this.f7819m;
        if (cu2VarArr != null) {
            for (cu2 cu2Var : cu2VarArr) {
                iu2 iu2Var = cu2Var.f6184b;
                int m19348a = iu2Var.m19348a(j2);
                if (m19348a == -1) {
                    m19348a = iu2Var.m19347b(j2);
                }
                cu2Var.f6186d = m19348a;
            }
        }
    }

    @Override // com.daaw.ns2
    /* renamed from: e */
    public final int mo1911e(ms2 ms2Var, ss2 ss2Var) {
        cu2[] cu2VarArr;
        boolean z;
        boolean z2;
        while (true) {
            int i = this.f7811e;
            if (i == 0) {
                if (this.f7814h == 0) {
                    if (!ms2Var.m15797h(this.f7809c.f14125a, 0, 8, true)) {
                        return -1;
                    }
                    this.f7814h = 8;
                    this.f7809c.m19225v(0);
                    this.f7813g = this.f7809c.m19234m();
                    this.f7812f = this.f7809c.m19242e();
                }
                if (this.f7813g == 1) {
                    ms2Var.m15797h(this.f7809c.f14125a, 8, 8, false);
                    this.f7814h += 8;
                    this.f7813g = this.f7809c.m19233n();
                }
                int i2 = this.f7812f;
                if (i2 == nt2.f20635C || i2 == nt2.f20639E || i2 == nt2.f20641F || i2 == nt2.f20643G || i2 == nt2.f20645H || i2 == nt2.f20662Q) {
                    long m15801d = (ms2Var.m15801d() + this.f7813g) - this.f7814h;
                    this.f7810d.add(new lt2(this.f7812f, m15801d));
                    if (this.f7813g == this.f7814h) {
                        m23945g(m15801d);
                    } else {
                        m23946f();
                    }
                } else {
                    if (i2 == nt2.f20664S || i2 == nt2.f20637D || i2 == nt2.f20665T || i2 == nt2.f20666U || i2 == nt2.f20696m0 || i2 == nt2.f20698n0 || i2 == nt2.f20700o0 || i2 == nt2.f20663R || i2 == nt2.f20702p0 || i2 == nt2.f20704q0 || i2 == nt2.f20706r0 || i2 == nt2.f20708s0 || i2 == nt2.f20710t0 || i2 == nt2.f20661P || i2 == nt2.f20673b || i2 == nt2.f20632A0) {
                        az2.m26583e(this.f7814h == 8);
                        az2.m26583e(this.f7813g <= 2147483647L);
                        iz2 iz2Var = new iz2((int) this.f7813g);
                        this.f7815i = iz2Var;
                        System.arraycopy(this.f7809c.f14125a, 0, iz2Var.f14125a, 0, 8);
                    } else {
                        this.f7815i = null;
                    }
                    this.f7811e = 1;
                }
            } else if (i != 1) {
                long j = Long.MAX_VALUE;
                int i3 = 0;
                int i4 = -1;
                while (true) {
                    cu2VarArr = this.f7819m;
                    if (i3 >= cu2VarArr.length) {
                        break;
                    }
                    cu2 cu2Var = cu2VarArr[i3];
                    int i5 = cu2Var.f6186d;
                    iu2 iu2Var = cu2Var.f6184b;
                    if (i5 != iu2Var.f14008a) {
                        long j2 = iu2Var.f14009b[i5];
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
                ws2 ws2Var = cu2Var2.f6185c;
                int i6 = cu2Var2.f6186d;
                iu2 iu2Var2 = cu2Var2.f6184b;
                long j3 = iu2Var2.f14009b[i6];
                int i7 = iu2Var2.f14010c[i6];
                if (cu2Var2.f6183a.f9971g == 1) {
                    j3 += 8;
                    i7 -= 8;
                }
                long m15801d2 = (j3 - ms2Var.m15801d()) + this.f7816j;
                if (m15801d2 < 0 || m15801d2 >= 262144) {
                    ss2Var.f26600a = j3;
                    return 1;
                }
                int i8 = (int) m15801d2;
                boolean z3 = false;
                ms2Var.m15796i(i8, false);
                int i9 = cu2Var2.f6183a.f9975k;
                if (i9 == 0) {
                    while (true) {
                        int i10 = this.f7816j;
                        if (i10 >= i7) {
                            break;
                        }
                        int mo5827b = ws2Var.mo5827b(ms2Var, i7 - i10, false);
                        this.f7816j += mo5827b;
                        this.f7817k -= mo5827b;
                    }
                } else {
                    byte[] bArr = this.f7808b.f14125a;
                    bArr[0] = 0;
                    bArr[1] = 0;
                    bArr[2] = 0;
                    int i11 = 4 - i9;
                    while (this.f7816j < i7) {
                        int i12 = this.f7817k;
                        if (i12 == 0) {
                            ms2Var.m15797h(this.f7808b.f14125a, i11, i9, z3);
                            this.f7808b.m19225v(z3 ? 1 : 0);
                            this.f7817k = this.f7808b.m19238i();
                            this.f7807a.m19225v(z3 ? 1 : 0);
                            ws2Var.mo5826c(this.f7807a, 4);
                            this.f7816j += 4;
                            i7 += i11;
                        } else {
                            int mo5827b2 = ws2Var.mo5827b(ms2Var, i12, z3);
                            this.f7816j += mo5827b2;
                            this.f7817k -= mo5827b2;
                            z3 = false;
                        }
                    }
                }
                int i13 = i7;
                iu2 iu2Var3 = cu2Var2.f6184b;
                ws2Var.mo5825d(iu2Var3.f14012e[i6], iu2Var3.f14013f[i6], i13, 0, null);
                cu2Var2.f6186d++;
                this.f7816j = 0;
                this.f7817k = 0;
                return 0;
            } else {
                long j4 = this.f7813g;
                int i14 = this.f7814h;
                long j5 = j4 - i14;
                long m15801d3 = ms2Var.m15801d() + j5;
                iz2 iz2Var2 = this.f7815i;
                if (iz2Var2 != null) {
                    ms2Var.m15797h(iz2Var2.f14125a, i14, (int) j5, false);
                    if (this.f7812f == nt2.f20673b) {
                        iz2 iz2Var3 = this.f7815i;
                        iz2Var3.m19225v(8);
                        if (iz2Var3.m19242e() == f7806q) {
                            z2 = true;
                            break;
                        }
                        iz2Var3.m19224w(4);
                        while (iz2Var3.m19246a() > 0) {
                            if (iz2Var3.m19242e() == f7806q) {
                                z2 = true;
                                break;
                            }
                        }
                        z2 = false;
                        this.f7821o = z2;
                    } else if (!this.f7810d.isEmpty()) {
                        ((lt2) this.f7810d.peek()).m16567g(new mt2(this.f7812f, this.f7815i));
                    }
                } else if (j5 < 262144) {
                    ms2Var.m15796i((int) j5, false);
                } else {
                    ss2Var.f26600a = ms2Var.m15801d() + j5;
                    z = true;
                    m23945g(m15801d3);
                    if (z && this.f7811e != 2) {
                        return 1;
                    }
                }
                z = false;
                m23945g(m15801d3);
                if (z) {
                    return 1;
                }
                continue;
            }
        }
    }

    /* renamed from: f */
    public final void m23946f() {
        this.f7811e = 0;
        this.f7814h = 0;
    }

    /* renamed from: g */
    public final void m23945g(long j) {
        zzaxo zzaxoVar;
        rs2 rs2Var;
        zzaxo zzaxoVar2;
        fu2 m7721a;
        while (!this.f7810d.isEmpty() && ((lt2) this.f7810d.peek()).f17739P0 == j) {
            lt2 lt2Var = (lt2) this.f7810d.pop();
            if (lt2Var.f20723a == nt2.f20635C) {
                ArrayList arrayList = new ArrayList();
                rs2 rs2Var2 = new rs2();
                mt2 m16569e = lt2Var.m16569e(nt2.f20632A0);
                if (m16569e != null) {
                    zzaxoVar = ut2.m7719c(m16569e, this.f7821o);
                    if (zzaxoVar != null) {
                        rs2Var2.m10976b(zzaxoVar);
                    }
                } else {
                    zzaxoVar = null;
                }
                long j2 = -9223372036854775807L;
                long j3 = Long.MAX_VALUE;
                int i = 0;
                while (i < lt2Var.f17741R0.size()) {
                    lt2 lt2Var2 = (lt2) lt2Var.f17741R0.get(i);
                    if (lt2Var2.f20723a == nt2.f20639E && (m7721a = ut2.m7721a(lt2Var2, lt2Var.m16569e(nt2.f20637D), -9223372036854775807L, null, this.f7821o)) != null) {
                        iu2 m7720b = ut2.m7720b(m7721a, lt2Var2.m16570d(nt2.f20641F).m16570d(nt2.f20643G).m16570d(nt2.f20645H), rs2Var2);
                        if (m7720b.f14008a != 0) {
                            cu2 cu2Var = new cu2(m7721a, m7720b, this.f7818l.mo9817h(i, m7721a.f9966b));
                            zzatd m1128h = m7721a.f9970f.m1128h(m7720b.f14011d + 30);
                            if (m7721a.f9966b == 1) {
                                if (rs2Var2.m10977a()) {
                                    m1128h = m1128h.m1129g(rs2Var2.f25570a, rs2Var2.f25571b);
                                }
                                if (zzaxoVar != null) {
                                    m1128h = m1128h.m1127i(zzaxoVar);
                                }
                            }
                            cu2Var.f6185c.mo5828a(m1128h);
                            rs2Var = rs2Var2;
                            zzaxoVar2 = zzaxoVar;
                            long max = Math.max(j2, m7721a.f9969e);
                            arrayList.add(cu2Var);
                            long j4 = m7720b.f14009b[0];
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
                this.f7820n = j2;
                this.f7819m = (cu2[]) arrayList.toArray(new cu2[arrayList.size()]);
                this.f7818l.zzb();
                this.f7818l.mo9819b(this);
                this.f7810d.clear();
                this.f7811e = 2;
            } else if (!this.f7810d.isEmpty()) {
                ((lt2) this.f7810d.peek()).m16568f(lt2Var);
            }
        }
        if (this.f7811e != 2) {
            m23946f();
        }
    }

    @Override // com.daaw.us2
    public final long zza() {
        return this.f7820n;
    }

    @Override // com.daaw.us2
    public final boolean zzc() {
        return true;
    }
}
