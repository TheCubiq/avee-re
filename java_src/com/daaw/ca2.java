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
    public static final q09 x = new q09() { // from class: com.daaw.z92
        @Override // com.daaw.q09
        public final /* synthetic */ j09[] a(Uri uri, Map map) {
            return p09.a(this, uri, map);
        }

        @Override // com.daaw.q09
        public final j09[] zza() {
            q09 q09Var = ca2.x;
            return new j09[]{new ca2(0)};
        }
    };
    public int i;
    public long j;
    public int k;
    public ik5 l;
    public int n;
    public int o;
    public int p;
    public long[][] s;
    public int t;
    public long u;
    public int v;
    public zzadu w;
    public int h = 0;
    public final fa2 f = new fa2();
    public final List g = new ArrayList();
    public final ik5 d = new ik5(16);
    public final ArrayDeque e = new ArrayDeque();
    public final ik5 a = new ik5(c42.a);
    public final ik5 b = new ik5(4);
    public final ik5 c = new ik5();
    public int m = -1;
    public m09 q = m09.o;
    public ba2[] r = new ba2[0];

    public ca2(int i) {
    }

    public static int g(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    public static int h(ka2 ka2Var, long j) {
        int a = ka2Var.a(j);
        return a == -1 ? ka2Var.b(j) : a;
    }

    public static long i(ka2 ka2Var, long j, long j2) {
        int h = h(ka2Var, j);
        return h == -1 ? j2 : Math.min(ka2Var.c[h], j2);
    }

    @Override // com.daaw.j09
    public final boolean a(k09 k09Var) {
        return ga2.b(k09Var, false);
    }

    @Override // com.daaw.i42
    public final g42 b(long j) {
        long j2;
        long j3;
        int b;
        ba2[] ba2VarArr = this.r;
        if (ba2VarArr.length == 0) {
            j42 j42Var = j42.c;
            return new g42(j42Var, j42Var);
        }
        int i = this.t;
        long j4 = -1;
        if (i != -1) {
            ka2 ka2Var = ba2VarArr[i].b;
            int h = h(ka2Var, j);
            if (h == -1) {
                j42 j42Var2 = j42.c;
                return new g42(j42Var2, j42Var2);
            }
            long j5 = ka2Var.f[h];
            j2 = ka2Var.c[h];
            if (j5 >= j || h >= ka2Var.b - 1 || (b = ka2Var.b(j)) == -1 || b == h) {
                j3 = -9223372036854775807L;
            } else {
                j3 = ka2Var.f[b];
                j4 = ka2Var.c[b];
            }
            j = j5;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            ba2[] ba2VarArr2 = this.r;
            if (i2 >= ba2VarArr2.length) {
                break;
            }
            if (i2 != this.t) {
                ka2 ka2Var2 = ba2VarArr2[i2].b;
                long i3 = i(ka2Var2, j, j2);
                if (j3 != -9223372036854775807L) {
                    j4 = i(ka2Var2, j3, j4);
                }
                j2 = i3;
            }
            i2++;
        }
        j42 j42Var3 = new j42(j, j2);
        return j3 == -9223372036854775807L ? new g42(j42Var3, j42Var3) : new g42(j42Var3, new j42(j3, j4));
    }

    @Override // com.daaw.j09
    public final void c(m09 m09Var) {
        this.q = m09Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    @Override // com.daaw.j09
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(com.daaw.k09 r33, com.daaw.f42 r34) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ca2.d(com.daaw.k09, com.daaw.f42):int");
    }

    @Override // com.daaw.j09
    public final void f(long j, long j2) {
        ba2[] ba2VarArr;
        this.e.clear();
        this.k = 0;
        this.m = -1;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        if (j == 0) {
            j();
            return;
        }
        for (ba2 ba2Var : this.r) {
            ka2 ka2Var = ba2Var.b;
            int a = ka2Var.a(j2);
            if (a == -1) {
                a = ka2Var.b(j2);
            }
            ba2Var.e = a;
            n42 n42Var = ba2Var.d;
            if (n42Var != null) {
                n42Var.b();
            }
        }
    }

    public final void j() {
        this.h = 0;
        this.k = 0;
    }

    public final void k(long j) {
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
        while (!ca2Var2.e.isEmpty() && ((a92) ca2Var2.e.peek()).b == j) {
            a92 a92Var = (a92) ca2Var2.e.pop();
            if (a92Var.a == 1836019574) {
                ArrayList arrayList2 = new ArrayList();
                boolean z = ca2Var2.v == 1;
                y09 y09Var = new y09();
                b92 d = a92Var.d(1969517665);
                if (d != null) {
                    Pair a = r92.a(d);
                    zzbq zzbqVar3 = (zzbq) a.first;
                    zzbq zzbqVar4 = (zzbq) a.second;
                    if (zzbqVar3 != null) {
                        y09Var.b(zzbqVar3);
                    }
                    zzbqVar = zzbqVar4;
                    zzbqVar2 = zzbqVar3;
                } else {
                    zzbqVar = null;
                    zzbqVar2 = null;
                }
                a92 c = a92Var.c(1835365473);
                zzbq b = c != null ? r92.b(c) : null;
                List c2 = r92.c(a92Var, y09Var, -9223372036854775807L, null, false, z, new ey6() { // from class: com.daaw.aa2
                    @Override // com.daaw.ey6
                    public final Object apply(Object obj) {
                        ha2 ha2Var = (ha2) obj;
                        q09 q09Var = ca2.x;
                        return ha2Var;
                    }
                });
                int size = c2.size();
                long j4 = -9223372036854775807L;
                long j5 = -9223372036854775807L;
                int i3 = 0;
                int i4 = -1;
                while (true) {
                    j2 = 0;
                    if (i3 >= size) {
                        break;
                    }
                    ka2 ka2Var = (ka2) c2.get(i3);
                    if (ka2Var.b == 0) {
                        list = c2;
                        i = size;
                        arrayList = arrayList2;
                        j3 = j4;
                    } else {
                        ha2 ha2Var = ka2Var.a;
                        list = c2;
                        long j6 = ha2Var.e;
                        if (j6 == j4) {
                            j6 = ka2Var.h;
                        }
                        long max = Math.max(j5, j6);
                        i = size;
                        ba2 ba2Var = new ba2(ha2Var, ka2Var, ca2Var2.q.n(i3, ha2Var.b));
                        int i5 = "audio/true-hd".equals(ha2Var.f.l) ? ka2Var.e * 16 : ka2Var.e + 30;
                        b72 b2 = ha2Var.f.b();
                        b2.l(i5);
                        if (ha2Var.b == 2 && j6 > 0 && (i2 = ka2Var.b) > 1) {
                            b2.e(i2 / (((float) j6) / 1000000.0f));
                        }
                        int i6 = ha2Var.b;
                        int i7 = y92.b;
                        if (i6 == 1 && y09Var.a()) {
                            b2.c(y09Var.a);
                            b2.d(y09Var.b);
                        }
                        int i8 = ha2Var.b;
                        zzbq[] zzbqVarArr = new zzbq[2];
                        zzbqVarArr[0] = zzbqVar;
                        zzbqVarArr[1] = ca2Var2.g.isEmpty() ? null : new zzbq(ca2Var2.g);
                        ArrayList arrayList3 = arrayList2;
                        zzbq zzbqVar5 = new zzbq(-9223372036854775807L, new zzbp[0]);
                        if (i8 == 1) {
                            if (zzbqVar2 != null) {
                                zzbqVar5 = zzbqVar2;
                            }
                        } else if (i8 == 2 && b != null) {
                            for (int i9 = 0; i9 < b.a(); i9++) {
                                zzbp b3 = b.b(i9);
                                if (b3 instanceof zzadr) {
                                    zzadr zzadrVar = (zzadr) b3;
                                    if ("com.android.capture.fps".equals(zzadrVar.p)) {
                                        zzbqVar5 = new zzbq(-9223372036854775807L, zzadrVar);
                                        j3 = -9223372036854775807L;
                                        break;
                                    }
                                }
                            }
                        }
                        j3 = -9223372036854775807L;
                        for (int i10 = 0; i10 < 2; i10++) {
                            zzbqVar5 = zzbqVar5.g(zzbqVarArr[i10]);
                        }
                        if (zzbqVar5.a() > 0) {
                            b2.m(zzbqVar5);
                        }
                        ba2Var.c.f(b2.y());
                        if (ha2Var.b == 2 && i4 == -1) {
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
                    c2 = list;
                    size = i;
                }
                ca2Var = ca2Var2;
                ca2Var.t = i4;
                ca2Var.u = j5;
                ba2[] ba2VarArr = (ba2[]) arrayList2.toArray(new ba2[0]);
                ca2Var.r = ba2VarArr;
                int length = ba2VarArr.length;
                long[][] jArr = new long[length];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i11 = 0; i11 < ba2VarArr.length; i11++) {
                    jArr[i11] = new long[ba2VarArr[i11].b.b];
                    jArr2[i11] = ba2VarArr[i11].b.f[0];
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
                    ka2 ka2Var2 = ba2VarArr[i13].b;
                    j2 += ka2Var2.d[i15];
                    int i16 = i15 + 1;
                    iArr[i13] = i16;
                    if (i16 < jArr3.length) {
                        jArr2[i13] = ka2Var2.f[i16];
                    } else {
                        zArr[i13] = true;
                        i12++;
                    }
                }
                ca2Var.s = jArr;
                ca2Var.q.zzC();
                ca2Var.q.i(ca2Var);
                ca2Var.e.clear();
                ca2Var.h = 2;
            } else {
                ca2Var = ca2Var2;
                if (!ca2Var.e.isEmpty()) {
                    ((a92) ca2Var.e.peek()).e(a92Var);
                }
            }
            ca2Var2 = ca2Var;
        }
        if (ca2Var2.h != 2) {
            j();
        }
    }

    @Override // com.daaw.i42
    public final long zze() {
        return this.u;
    }

    @Override // com.daaw.i42
    public final boolean zzh() {
        return true;
    }
}
