package com.daaw;

import android.net.Uri;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzadr;
import com.google.android.gms.internal.ads.zzadu;
import com.google.android.gms.internal.ads.zzbp;
import com.google.android.gms.internal.ads.zzbq;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class ca2 implements j09, i42 {

    /* renamed from: x */
    public static final q09 f5655x = new q09() { // from class: com.daaw.z92
        @Override // com.daaw.q09
        /* renamed from: a */
        public final /* synthetic */ j09[] mo2588a(Uri uri, Map map) {
            return p09.m13771a(this, uri, map);
        }

        @Override // com.daaw.q09
        public final j09[] zza() {
            q09 q09Var = ca2.f5655x;
            return new j09[]{new ca2(0)};
        }
    };

    /* renamed from: i */
    public int f5664i;

    /* renamed from: j */
    public long f5665j;

    /* renamed from: k */
    public int f5666k;

    /* renamed from: l */
    public ik5 f5667l;

    /* renamed from: n */
    public int f5669n;

    /* renamed from: o */
    public int f5670o;

    /* renamed from: p */
    public int f5671p;

    /* renamed from: s */
    public long[][] f5674s;

    /* renamed from: t */
    public int f5675t;

    /* renamed from: u */
    public long f5676u;

    /* renamed from: v */
    public int f5677v;

    /* renamed from: w */
    public zzadu f5678w;

    /* renamed from: h */
    public int f5663h = 0;

    /* renamed from: f */
    public final fa2 f5661f = new fa2();

    /* renamed from: g */
    public final List f5662g = new ArrayList();

    /* renamed from: d */
    public final ik5 f5659d = new ik5(16);

    /* renamed from: e */
    public final ArrayDeque f5660e = new ArrayDeque();

    /* renamed from: a */
    public final ik5 f5656a = new ik5(c42.f5462a);

    /* renamed from: b */
    public final ik5 f5657b = new ik5(4);

    /* renamed from: c */
    public final ik5 f5658c = new ik5();

    /* renamed from: m */
    public int f5668m = -1;

    /* renamed from: q */
    public m09 f5672q = m09.f17985o;

    /* renamed from: r */
    public ba2[] f5673r = new ba2[0];

    public ca2(int i) {
    }

    /* renamed from: g */
    public static int m25469g(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    /* renamed from: h */
    public static int m25468h(ka2 ka2Var, long j) {
        int m17922a = ka2Var.m17922a(j);
        return m17922a == -1 ? ka2Var.m17921b(j) : m17922a;
    }

    /* renamed from: i */
    public static long m25467i(ka2 ka2Var, long j, long j2) {
        int m25468h = m25468h(ka2Var, j);
        return m25468h == -1 ? j2 : Math.min(ka2Var.f15846c[m25468h], j2);
    }

    @Override // com.daaw.j09
    /* renamed from: a */
    public final boolean mo3957a(k09 k09Var) {
        return ga2.m21849b(k09Var, false);
    }

    @Override // com.daaw.i42
    /* renamed from: b */
    public final g42 mo2631b(long j) {
        long j2;
        long j3;
        int m17921b;
        ba2[] ba2VarArr = this.f5673r;
        if (ba2VarArr.length == 0) {
            j42 j42Var = j42.f14255c;
            return new g42(j42Var, j42Var);
        }
        int i = this.f5675t;
        long j4 = -1;
        if (i != -1) {
            ka2 ka2Var = ba2VarArr[i].f4578b;
            int m25468h = m25468h(ka2Var, j);
            if (m25468h == -1) {
                j42 j42Var2 = j42.f14255c;
                return new g42(j42Var2, j42Var2);
            }
            long j5 = ka2Var.f15849f[m25468h];
            j2 = ka2Var.f15846c[m25468h];
            if (j5 >= j || m25468h >= ka2Var.f15845b - 1 || (m17921b = ka2Var.m17921b(j)) == -1 || m17921b == m25468h) {
                j3 = -9223372036854775807L;
            } else {
                j3 = ka2Var.f15849f[m17921b];
                j4 = ka2Var.f15846c[m17921b];
            }
            j = j5;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            ba2[] ba2VarArr2 = this.f5673r;
            if (i2 >= ba2VarArr2.length) {
                break;
            }
            if (i2 != this.f5675t) {
                ka2 ka2Var2 = ba2VarArr2[i2].f4578b;
                long m25467i = m25467i(ka2Var2, j, j2);
                if (j3 != -9223372036854775807L) {
                    j4 = m25467i(ka2Var2, j3, j4);
                }
                j2 = m25467i;
            }
            i2++;
        }
        j42 j42Var3 = new j42(j, j2);
        return j3 == -9223372036854775807L ? new g42(j42Var3, j42Var3) : new g42(j42Var3, new j42(j3, j4));
    }

    @Override // com.daaw.j09
    /* renamed from: c */
    public final void mo3955c(m09 m09Var) {
        this.f5672q = m09Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    @Override // com.daaw.j09
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo3954d(k09 k09Var, f42 f42Var) {
        boolean z;
        boolean z2;
        long zzf;
        long j;
        int i;
        ik5 ik5Var;
        while (true) {
            int i2 = this.f5663h;
            if (i2 == 0) {
                if (this.f5666k == 0) {
                    if (!k09Var.mo5663e(this.f5659d.m19714h(), 0, 8, true)) {
                        return -1;
                    }
                    this.f5666k = 8;
                    this.f5659d.m19716f(0);
                    this.f5665j = this.f5659d.m19729A();
                    this.f5664i = this.f5659d.m19709m();
                }
                long j2 = this.f5665j;
                if (j2 == 1) {
                    k09Var.mo5660i(this.f5659d.m19714h(), 8, 8);
                    this.f5666k += 8;
                    zzf = this.f5659d.m19728B();
                } else {
                    if (j2 == 0) {
                        long zzd = k09Var.zzd();
                        if (zzd == -1) {
                            a92 a92Var = (a92) this.f5660e.peek();
                            zzd = a92Var != null ? a92Var.f3004b : -1L;
                        }
                        if (zzd != -1) {
                            zzf = (zzd - k09Var.zzf()) + this.f5666k;
                        }
                    }
                    j = this.f5665j;
                    i = this.f5666k;
                    if (j >= i) {
                        throw dl3.m24265c("Atom size less than header length (unsupported).");
                    }
                    int i3 = this.f5664i;
                    if (i3 == 1836019574 || i3 == 1953653099 || i3 == 1835297121 || i3 == 1835626086 || i3 == 1937007212 || i3 == 1701082227 || i3 == 1835365473) {
                        long zzf2 = k09Var.zzf();
                        long j3 = this.f5665j;
                        long j4 = this.f5666k;
                        long j5 = (zzf2 + j3) - j4;
                        if (j3 != j4 && this.f5664i == 1835365473) {
                            this.f5658c.m19719c(8);
                            k09Var.mo5659j(this.f5658c.m19714h(), 0, 8);
                            r92.m11562d(this.f5658c);
                            k09Var.mo5658u(this.f5658c.m19711k());
                            k09Var.zzj();
                        }
                        this.f5660e.push(new a92(this.f5664i, j5));
                        if (this.f5665j == this.f5666k) {
                            m25465k(j5);
                        } else {
                            m25466j();
                        }
                    } else {
                        if (i3 == 1835296868 || i3 == 1836476516 || i3 == 1751411826 || i3 == 1937011556 || i3 == 1937011827 || i3 == 1937011571 || i3 == 1668576371 || i3 == 1701606260 || i3 == 1937011555 || i3 == 1937011578 || i3 == 1937013298 || i3 == 1937007471 || i3 == 1668232756 || i3 == 1953196132 || i3 == 1718909296 || i3 == 1969517665 || i3 == 1801812339 || i3 == 1768715124) {
                            uo4.m7872f(i == 8);
                            uo4.m7872f(this.f5665j <= 2147483647L);
                            ik5Var = new ik5((int) this.f5665j);
                            System.arraycopy(this.f5659d.m19714h(), 0, ik5Var.m19714h(), 0, 8);
                        } else {
                            long zzf3 = k09Var.zzf();
                            long j6 = this.f5666k;
                            long j7 = zzf3 - j6;
                            if (this.f5664i == 1836086884) {
                                this.f5678w = new zzadu(0L, j7, -9223372036854775807L, j7 + j6, this.f5665j - j6);
                            }
                            ik5Var = null;
                        }
                        this.f5667l = ik5Var;
                        this.f5663h = 1;
                    }
                }
                this.f5665j = zzf;
                j = this.f5665j;
                i = this.f5666k;
                if (j >= i) {
                }
            } else if (i2 != 1) {
                long zzf4 = k09Var.zzf();
                int i4 = this.f5668m;
                if (i4 == -1) {
                    long j8 = Long.MAX_VALUE;
                    long j9 = Long.MAX_VALUE;
                    long j10 = Long.MAX_VALUE;
                    int i5 = 0;
                    int i6 = -1;
                    boolean z3 = true;
                    boolean z4 = true;
                    int i7 = -1;
                    while (true) {
                        ba2[] ba2VarArr = this.f5673r;
                        if (i5 >= ba2VarArr.length) {
                            break;
                        }
                        ba2 ba2Var = ba2VarArr[i5];
                        int i8 = ba2Var.f4581e;
                        ka2 ka2Var = ba2Var.f4578b;
                        if (i8 != ka2Var.f15845b) {
                            long j11 = ka2Var.f15846c[i8];
                            long j12 = ((long[][]) it5.m19391h(this.f5674s))[i5][i8];
                            long j13 = j11 - zzf4;
                            boolean z5 = j13 < 0 || j13 >= 262144;
                            if (z5) {
                                z = z4;
                            } else {
                                if (!z4) {
                                    z = false;
                                }
                                z4 = z5;
                                i6 = i5;
                                j9 = j13;
                                j10 = j12;
                                if (j12 < j8) {
                                    z3 = z5;
                                    i7 = i5;
                                    j8 = j12;
                                }
                            }
                            if (z5 != z || j13 >= j9) {
                                z4 = z;
                                if (j12 < j8) {
                                }
                            }
                            z4 = z5;
                            i6 = i5;
                            j9 = j13;
                            j10 = j12;
                            if (j12 < j8) {
                            }
                        }
                        i5++;
                    }
                    i4 = (j8 == Long.MAX_VALUE || !z3 || j10 < j8 + 10485760) ? i6 : i7;
                    this.f5668m = i4;
                    if (i4 == -1) {
                        return -1;
                    }
                }
                ba2 ba2Var2 = this.f5673r[i4];
                m42 m42Var = ba2Var2.f4579c;
                int i9 = ba2Var2.f4581e;
                ka2 ka2Var2 = ba2Var2.f4578b;
                long j14 = ka2Var2.f15846c[i9];
                int i10 = ka2Var2.f15847d[i9];
                n42 n42Var = ba2Var2.f4580d;
                long j15 = (j14 - zzf4) + this.f5669n;
                if (j15 < 0 || j15 >= 262144) {
                    f42Var.f9093a = j14;
                    return 1;
                }
                if (ba2Var2.f4577a.f12293g == 1) {
                    j15 += 8;
                    i10 -= 8;
                }
                k09Var.mo5658u((int) j15);
                ha2 ha2Var = ba2Var2.f4577a;
                int i11 = ha2Var.f12296j;
                if (i11 == 0) {
                    if ("audio/ac4".equals(ha2Var.f12292f.f9275l)) {
                        if (this.f5670o == 0) {
                            fz8.m22116b(i10, this.f5658c);
                            m42Var.mo16221c(this.f5658c, 7);
                            this.f5670o += 7;
                        }
                        i10 += 7;
                    } else if (n42Var != null) {
                        n42Var.m15529d(k09Var);
                    }
                    while (true) {
                        int i12 = this.f5670o;
                        if (i12 >= i10) {
                            break;
                        }
                        int mo16219e = m42Var.mo16219e(k09Var, i10 - i12, false);
                        this.f5669n += mo16219e;
                        this.f5670o += mo16219e;
                        this.f5671p -= mo16219e;
                    }
                } else {
                    byte[] m19714h = this.f5657b.m19714h();
                    m19714h[0] = 0;
                    m19714h[1] = 0;
                    m19714h[2] = 0;
                    int i13 = 4 - i11;
                    while (this.f5670o < i10) {
                        int i14 = this.f5671p;
                        if (i14 == 0) {
                            k09Var.mo5660i(m19714h, i13, i11);
                            this.f5669n += i11;
                            this.f5657b.m19716f(0);
                            int m19709m = this.f5657b.m19709m();
                            if (m19709m < 0) {
                                throw dl3.m24267a("Invalid NAL length", null);
                            }
                            this.f5671p = m19709m;
                            this.f5656a.m19716f(0);
                            m42Var.mo16221c(this.f5656a, 4);
                            this.f5670o += 4;
                            i10 += i13;
                        } else {
                            int mo16219e2 = m42Var.mo16219e(k09Var, i14, false);
                            this.f5669n += mo16219e2;
                            this.f5670o += mo16219e2;
                            this.f5671p -= mo16219e2;
                        }
                    }
                }
                ka2 ka2Var3 = ba2Var2.f4578b;
                long j16 = ka2Var3.f15849f[i9];
                int i15 = ka2Var3.f15850g[i9];
                if (n42Var != null) {
                    n42Var.m15530c(m42Var, j16, i15, i10, 0, null);
                    if (i9 + 1 == ba2Var2.f4578b.f15845b) {
                        n42Var.m15532a(m42Var, null);
                    }
                } else {
                    m42Var.mo16222b(j16, i15, i10, 0, null);
                }
                ba2Var2.f4581e++;
                this.f5668m = -1;
                this.f5669n = 0;
                this.f5670o = 0;
                this.f5671p = 0;
                return 0;
            } else {
                long j17 = this.f5665j - this.f5666k;
                long zzf5 = k09Var.zzf() + j17;
                ik5 ik5Var2 = this.f5667l;
                if (ik5Var2 != null) {
                    k09Var.mo5660i(ik5Var2.m19714h(), this.f5666k, (int) j17);
                    if (this.f5664i == 1718909296) {
                        ik5Var2.m19716f(8);
                        int m25469g = m25469g(ik5Var2.m19709m());
                        if (m25469g == 0) {
                            ik5Var2.m19715g(4);
                            while (true) {
                                if (ik5Var2.m19713i() <= 0) {
                                    m25469g = 0;
                                    break;
                                }
                                m25469g = m25469g(ik5Var2.m19709m());
                                if (m25469g != 0) {
                                    break;
                                }
                            }
                        }
                        this.f5677v = m25469g;
                    } else if (!this.f5660e.isEmpty()) {
                        ((a92) this.f5660e.peek()).m27554f(new b92(this.f5664i, ik5Var2));
                    }
                } else if (j17 < 262144) {
                    k09Var.mo5658u((int) j17);
                } else {
                    f42Var.f9093a = k09Var.zzf() + j17;
                    z2 = true;
                    m25465k(zzf5);
                    if (z2 && this.f5663h != 2) {
                        return 1;
                    }
                }
                z2 = false;
                m25465k(zzf5);
                if (z2) {
                    return 1;
                }
                continue;
            }
        }
    }

    @Override // com.daaw.j09
    /* renamed from: f */
    public final void mo3953f(long j, long j2) {
        ba2[] ba2VarArr;
        this.f5660e.clear();
        this.f5666k = 0;
        this.f5668m = -1;
        this.f5669n = 0;
        this.f5670o = 0;
        this.f5671p = 0;
        if (j == 0) {
            m25466j();
            return;
        }
        for (ba2 ba2Var : this.f5673r) {
            ka2 ka2Var = ba2Var.f4578b;
            int m17922a = ka2Var.m17922a(j2);
            if (m17922a == -1) {
                m17922a = ka2Var.m17921b(j2);
            }
            ba2Var.f4581e = m17922a;
            n42 n42Var = ba2Var.f4580d;
            if (n42Var != null) {
                n42Var.m15531b();
            }
        }
    }

    /* renamed from: j */
    public final void m25466j() {
        this.f5663h = 0;
        this.f5666k = 0;
    }

    /* renamed from: k */
    public final void m25465k(long j) {
        ca2 ca2Var;
        zzbq zzbqVar;
        zzbq zzbqVar2;
        long j2;
        List list;
        int i;
        long j3;
        ArrayList arrayList;
        int i2;
        ca2 ca2Var2 = this;
        while (!ca2Var2.f5660e.isEmpty() && ((a92) ca2Var2.f5660e.peek()).f3004b == j) {
            a92 a92Var = (a92) ca2Var2.f5660e.pop();
            if (a92Var.f5641a == 1836019574) {
                ArrayList arrayList2 = new ArrayList();
                boolean z = ca2Var2.f5677v == 1;
                y09 y09Var = new y09();
                b92 m27556d = a92Var.m27556d(1969517665);
                if (m27556d != null) {
                    Pair m11565a = r92.m11565a(m27556d);
                    zzbq zzbqVar3 = (zzbq) m11565a.first;
                    zzbq zzbqVar4 = (zzbq) m11565a.second;
                    if (zzbqVar3 != null) {
                        y09Var.m4274b(zzbqVar3);
                    }
                    zzbqVar = zzbqVar4;
                    zzbqVar2 = zzbqVar3;
                } else {
                    zzbqVar = null;
                    zzbqVar2 = null;
                }
                a92 m27557c = a92Var.m27557c(1835365473);
                zzbq m11564b = m27557c != null ? r92.m11564b(m27557c) : null;
                List m11563c = r92.m11563c(a92Var, y09Var, -9223372036854775807L, null, false, z, new ey6() { // from class: com.daaw.aa2
                    @Override // com.daaw.ey6
                    public final Object apply(Object obj) {
                        ha2 ha2Var = (ha2) obj;
                        q09 q09Var = ca2.f5655x;
                        return ha2Var;
                    }
                });
                int size = m11563c.size();
                long j4 = -9223372036854775807L;
                long j5 = -9223372036854775807L;
                int i3 = 0;
                int i4 = -1;
                while (true) {
                    j2 = 0;
                    if (i3 >= size) {
                        break;
                    }
                    ka2 ka2Var = (ka2) m11563c.get(i3);
                    if (ka2Var.f15845b == 0) {
                        list = m11563c;
                        i = size;
                        arrayList = arrayList2;
                        j3 = j4;
                    } else {
                        ha2 ha2Var = ka2Var.f15844a;
                        list = m11563c;
                        long j6 = ha2Var.f12291e;
                        if (j6 == j4) {
                            j6 = ka2Var.f15851h;
                        }
                        long max = Math.max(j5, j6);
                        i = size;
                        ba2 ba2Var = new ba2(ha2Var, ka2Var, ca2Var2.f5672q.mo3292n(i3, ha2Var.f12288b));
                        int i5 = "audio/true-hd".equals(ha2Var.f12292f.f9275l) ? ka2Var.f15848e * 16 : ka2Var.f15848e + 30;
                        b72 m22830b = ha2Var.f12292f.m22830b();
                        m22830b.m26379l(i5);
                        if (ha2Var.f12288b == 2 && j6 > 0 && (i2 = ka2Var.f15845b) > 1) {
                            m22830b.m26390e(i2 / (((float) j6) / 1000000.0f));
                        }
                        int i6 = ha2Var.f12288b;
                        int i7 = y92.f33437b;
                        if (i6 == 1 && y09Var.m4275a()) {
                            m22830b.m26394c(y09Var.f33208a);
                            m22830b.m26392d(y09Var.f33209b);
                        }
                        int i8 = ha2Var.f12288b;
                        zzbq[] zzbqVarArr = new zzbq[2];
                        zzbqVarArr[0] = zzbqVar;
                        zzbqVarArr[1] = ca2Var2.f5662g.isEmpty() ? null : new zzbq(ca2Var2.f5662g);
                        ArrayList arrayList3 = arrayList2;
                        zzbq zzbqVar5 = new zzbq(-9223372036854775807L, new zzbp[0]);
                        if (i8 == 1) {
                            if (zzbqVar2 != null) {
                                zzbqVar5 = zzbqVar2;
                            }
                        } else if (i8 == 2 && m11564b != null) {
                            for (int i9 = 0; i9 < m11564b.m1103a(); i9++) {
                                zzbp m1102b = m11564b.m1102b(i9);
                                if (m1102b instanceof zzadr) {
                                    zzadr zzadrVar = (zzadr) m1102b;
                                    if ("com.android.capture.fps".equals(zzadrVar.f36762p)) {
                                        zzbqVar5 = new zzbq(-9223372036854775807L, zzadrVar);
                                        j3 = -9223372036854775807L;
                                        break;
                                    }
                                }
                            }
                        }
                        j3 = -9223372036854775807L;
                        for (int i10 = 0; i10 < 2; i10++) {
                            zzbqVar5 = zzbqVar5.m1100g(zzbqVarArr[i10]);
                        }
                        if (zzbqVar5.m1103a() > 0) {
                            m22830b.m26378m(zzbqVar5);
                        }
                        ba2Var.f4579c.mo16218f(m22830b.m26366y());
                        if (ha2Var.f12288b == 2 && i4 == -1) {
                            i4 = arrayList3.size();
                        }
                        arrayList = arrayList3;
                        arrayList.add(ba2Var);
                        j5 = max;
                    }
                    i3++;
                    ca2Var2 = this;
                    j4 = j3;
                    arrayList2 = arrayList;
                    m11563c = list;
                    size = i;
                }
                ca2Var = ca2Var2;
                ca2Var.f5675t = i4;
                ca2Var.f5676u = j5;
                ba2[] ba2VarArr = (ba2[]) arrayList2.toArray(new ba2[0]);
                ca2Var.f5673r = ba2VarArr;
                int length = ba2VarArr.length;
                long[][] jArr = new long[length];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i11 = 0; i11 < ba2VarArr.length; i11++) {
                    jArr[i11] = new long[ba2VarArr[i11].f4578b.f15845b];
                    jArr2[i11] = ba2VarArr[i11].f4578b.f15849f[0];
                }
                int i12 = 0;
                while (i12 < ba2VarArr.length) {
                    long j7 = Long.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < ba2VarArr.length; i14++) {
                        if (!zArr[i14]) {
                            long j8 = jArr2[i14];
                            if (j8 <= j7) {
                                i13 = i14;
                                j7 = j8;
                            }
                        }
                    }
                    int i15 = iArr[i13];
                    long[] jArr3 = jArr[i13];
                    jArr3[i15] = j2;
                    ka2 ka2Var2 = ba2VarArr[i13].f4578b;
                    j2 += ka2Var2.f15847d[i15];
                    int i16 = i15 + 1;
                    iArr[i13] = i16;
                    if (i16 < jArr3.length) {
                        jArr2[i13] = ka2Var2.f15849f[i16];
                    } else {
                        zArr[i13] = true;
                        i12++;
                    }
                }
                ca2Var.f5674s = jArr;
                ca2Var.f5672q.zzC();
                ca2Var.f5672q.mo3297i(ca2Var);
                ca2Var.f5660e.clear();
                ca2Var.f5663h = 2;
            } else {
                ca2Var = ca2Var2;
                if (!ca2Var.f5660e.isEmpty()) {
                    ((a92) ca2Var.f5660e.peek()).m27555e(a92Var);
                }
            }
            ca2Var2 = ca2Var;
        }
        if (ca2Var2.f5663h != 2) {
            m25466j();
        }
    }

    @Override // com.daaw.i42
    public final long zze() {
        return this.f5676u;
    }

    @Override // com.daaw.i42
    public final boolean zzh() {
        return true;
    }
}
