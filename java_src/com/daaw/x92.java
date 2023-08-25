package com.daaw;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzw;
import com.google.android.gms.internal.ads.zzx;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public final class x92 implements j09 {
    public static final q09 E = new q09() { // from class: com.daaw.t92
        @Override // com.daaw.q09
        public final /* synthetic */ j09[] a(Uri uri, Map map) {
            return p09.a(this, uri, map);
        }

        @Override // com.daaw.q09
        public final j09[] zza() {
            q09 q09Var = x92.E;
            return new j09[]{new x92(0, null)};
        }
    };
    public static final byte[] F = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final f92 G;
    public boolean D;
    public final byte[] f;
    public final ik5 g;
    public int l;
    public int m;
    public long n;
    public int o;
    public ik5 p;
    public long q;
    public int r;
    public w92 v;
    public int w;
    public int x;
    public int y;
    public boolean z;
    public final List a = Collections.unmodifiableList(Collections.emptyList());
    public final q62 h = new q62();
    public final ik5 i = new ik5(16);
    public final ik5 c = new ik5(c42.a);
    public final ik5 d = new ik5(5);
    public final ik5 e = new ik5();
    public final ArrayDeque j = new ArrayDeque();
    public final ArrayDeque k = new ArrayDeque();
    public final SparseArray b = new SparseArray();
    public long t = -9223372036854775807L;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public m09 A = m09.o;
    public m42[] B = new m42[0];
    public m42[] C = new m42[0];

    static {
        b72 b72Var = new b72();
        b72Var.s("application/x-emsg");
        G = b72Var.y();
    }

    public x92(int i, cr5 cr5Var) {
        byte[] bArr = new byte[16];
        this.f = bArr;
        this.g = new ik5(bArr);
    }

    public static int b(int i) {
        if (i >= 0) {
            return i;
        }
        throw dl3.a("Unexpected negative value: " + i, null);
    }

    public static zzx e(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            b92 b92Var = (b92) list.get(i);
            if (b92Var.a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] h = b92Var.b.h();
                UUID a = ea2.a(h);
                if (a == null) {
                    s95.e("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new zzw(a, null, "video/mp4", h));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzx(arrayList);
    }

    public static void h(ik5 ik5Var, int i, ja2 ja2Var) {
        ik5Var.f(i + 8);
        int m = ik5Var.m() & 16777215;
        if ((m & 1) != 0) {
            throw dl3.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (m & 2) != 0;
        int v = ik5Var.v();
        if (v == 0) {
            Arrays.fill(ja2Var.l, 0, ja2Var.e, false);
            return;
        }
        int i2 = ja2Var.e;
        if (v != i2) {
            throw dl3.a("Senc sample count " + v + " is different from fragment sample count" + i2, null);
        }
        Arrays.fill(ja2Var.l, 0, v, z);
        ja2Var.a(ik5Var.i());
        ik5 ik5Var2 = ja2Var.n;
        ik5Var.b(ik5Var2.h(), 0, ik5Var2.l());
        ja2Var.n.f(0);
        ja2Var.o = false;
    }

    public static final s92 j(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (s92) sparseArray.valueAt(0);
        }
        s92 s92Var = (s92) sparseArray.get(i);
        Objects.requireNonNull(s92Var);
        return s92Var;
    }

    @Override // com.daaw.j09
    public final boolean a(k09 k09Var) {
        return ga2.a(k09Var);
    }

    @Override // com.daaw.j09
    public final void c(m09 m09Var) {
        this.A = m09Var;
        g();
        m42[] m42VarArr = new m42[2];
        this.B = m42VarArr;
        int i = 0;
        m42[] m42VarArr2 = (m42[]) it5.F(m42VarArr, 0);
        this.B = m42VarArr2;
        for (m42 m42Var : m42VarArr2) {
            m42Var.f(G);
        }
        this.C = new m42[this.a.size()];
        int i2 = 100;
        while (i < this.C.length) {
            int i3 = i2 + 1;
            m42 n = this.A.n(i2, 3);
            n.f((f92) this.a.get(i));
            this.C[i] = n;
            i++;
            i2 = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x023f, code lost:
        r23 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0244, code lost:
        r23 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0246, code lost:
        r5.b(r10, r20, r33.w, 0, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0259, code lost:
        if (r33.k.isEmpty() != false) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x025b, code lost:
        r1 = (com.daaw.v92) r33.k.removeFirst();
        r33.r -= r1.c;
        r3 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x026e, code lost:
        if (r1.b == false) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0270, code lost:
        r3 = r3 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0271, code lost:
        r5 = r33.B;
        r6 = r5.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0275, code lost:
        if (r8 >= r6) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0277, code lost:
        r5[r8].b(r3, 1, r1.c, r33.r, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x028f, code lost:
        if (r2.k() != false) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0291, code lost:
        r33.v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0293, code lost:
        r33.l = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
        if (r33.l != 3) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
        r3 = r2.b();
        r33.w = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
        if (r2.f >= r2.i) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00aa, code lost:
        ((com.daaw.rz8) r1).l(r3, false);
        r1 = r2.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
        if (r1 != null) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b6, code lost:
        r3 = r2.b.n;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bc, code lost:
        if (r1 == 0) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00be, code lost:
        r3.g(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c9, code lost:
        if (r2.b.b(r2.f) == false) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cb, code lost:
        r3.g(r3.w() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d8, code lost:
        if (r2.k() != false) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00da, code lost:
        r33.v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dc, code lost:
        r33.l = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00de, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e7, code lost:
        if (r2.d.a.g != 1) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e9, code lost:
        r33.w = r3 - 8;
        ((com.daaw.rz8) r1).l(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0103, code lost:
        if ("audio/ac4".equals(r2.d.a.f.l) == false) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0105, code lost:
        r33.x = r2.c(r33.w, 7);
        com.daaw.fz8.b(r33.w, r33.g);
        r2.a.c(r33.g, 7);
        r3 = r33.x + 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0120, code lost:
        r3 = r2.c(r33.w, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0126, code lost:
        r33.x = r3;
        r33.w += r3;
        r33.l = 4;
        r33.y = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0132, code lost:
        r3 = r2.d.a;
        r5 = r2.a;
        r10 = r2.e();
        r6 = r3.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013e, code lost:
        if (r6 != 0) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0140, code lost:
        r3 = r33.x;
        r4 = r33.w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0144, code lost:
        if (r3 >= r4) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0146, code lost:
        r33.x += r5.e(r1, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0151, code lost:
        r13 = r33.d.h();
        r13[0] = 0;
        r13[1] = 0;
        r13[2] = 0;
        r14 = r6 + 1;
        r6 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0167, code lost:
        if (r33.x >= r33.w) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0169, code lost:
        r12 = r33.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016d, code lost:
        if (r12 != 0) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016f, code lost:
        ((com.daaw.rz8) r1).e(r13, r6, r14, r9);
        r33.d.f(r9);
        r12 = r33.d.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0180, code lost:
        if (r12 <= 0) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0182, code lost:
        r33.y = r12 - 1;
        r33.c.f(r9);
        r5.c(r33.c, 4);
        r5.c(r33.d, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0199, code lost:
        if (r33.C.length <= 0) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019b, code lost:
        r12 = r3.f.l;
        r17 = r13[4];
        r9 = com.daaw.c42.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a9, code lost:
        if ("video/avc".equals(r12) == false) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ad, code lost:
        if ((r17 & 31) == r4) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b0, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b6, code lost:
        if ("video/hevc".equals(r12) == false) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01bd, code lost:
        if (((r17 & 126) >> r8) != 39) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c0, code lost:
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c1, code lost:
        r33.z = r9;
        r33.x += 5;
        r33.w += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d5, code lost:
        throw com.daaw.dl3.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d8, code lost:
        if (r33.z == false) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01da, code lost:
        r33.e.c(r12);
        ((com.daaw.rz8) r1).e(r33.e.h(), 0, r33.y, false);
        r5.c(r33.e, r33.y);
        r4 = r33.y;
        r8 = r33.e;
        r8 = com.daaw.c42.b(r8.h(), r8.l());
        r33.e.f("video/hevc".equals(r3.f.l) ? 1 : 0);
        r33.e.e(r8);
        com.daaw.oz8.a(r10, r33.e, r33.C);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x021f, code lost:
        r4 = r5.e(r1, r12, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0225, code lost:
        r33.x += r4;
        r33.y -= r4;
        r4 = 6;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0231, code lost:
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0235, code lost:
        r20 = r2.a();
        r1 = r2.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x023d, code lost:
        if (r1 == null) goto L330;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0729 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v10 */
    @Override // com.daaw.j09
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(com.daaw.k09 r34, com.daaw.f42 r35) {
        /*
            Method dump skipped, instructions count: 1842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.x92.d(com.daaw.k09, com.daaw.f42):int");
    }

    @Override // com.daaw.j09
    public final void f(long j, long j2) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ((w92) this.b.valueAt(i)).i();
        }
        this.k.clear();
        this.r = 0;
        this.s = j2;
        this.j.clear();
        g();
    }

    public final void g() {
        this.l = 0;
        this.o = 0;
    }

    public final void i(long j) {
        x92 x92Var;
        SparseArray sparseArray;
        a92 a92Var;
        int i;
        int i2;
        byte[] bArr;
        int i3;
        byte[] bArr2;
        byte[] bArr3;
        int i4;
        boolean z;
        int i5;
        a92 a92Var2;
        byte[] bArr4;
        ja2 ja2Var;
        List list;
        int i6;
        int i7;
        int i8;
        a92 a92Var3;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        s92 s92Var;
        long j2;
        final x92 x92Var2 = this;
        while (!x92Var2.j.isEmpty() && ((a92) x92Var2.j.peek()).b == j) {
            a92 a92Var4 = (a92) x92Var2.j.pop();
            int i18 = a92Var4.a;
            int i19 = 12;
            int i20 = 8;
            if (i18 == 1836019574) {
                zzx e = e(a92Var4.c);
                a92 c = a92Var4.c(1836475768);
                Objects.requireNonNull(c);
                SparseArray sparseArray2 = new SparseArray();
                int size = c.c.size();
                long j3 = -9223372036854775807L;
                int i21 = 0;
                while (i21 < size) {
                    b92 b92Var = (b92) c.c.get(i21);
                    int i22 = b92Var.a;
                    if (i22 == 1953654136) {
                        ik5 ik5Var = b92Var.b;
                        ik5Var.f(i19);
                        Pair create = Pair.create(Integer.valueOf(ik5Var.m()), new s92(ik5Var.m() - 1, ik5Var.m(), ik5Var.m(), ik5Var.m()));
                        sparseArray2.put(((Integer) create.first).intValue(), (s92) create.second);
                    } else if (i22 == 1835362404) {
                        ik5 ik5Var2 = b92Var.b;
                        ik5Var2.f(8);
                        j3 = c92.a(ik5Var2.m()) == 0 ? ik5Var2.A() : ik5Var2.B();
                    }
                    i21++;
                    i19 = 12;
                }
                List c2 = r92.c(a92Var4, new y09(), j3, e, false, false, new ey6() { // from class: com.daaw.u92
                    @Override // com.daaw.ey6
                    public final Object apply(Object obj) {
                        return (ha2) obj;
                    }
                });
                int size2 = c2.size();
                if (x92Var2.b.size() == 0) {
                    for (int i23 = 0; i23 < size2; i23++) {
                        ka2 ka2Var = (ka2) c2.get(i23);
                        ha2 ha2Var = ka2Var.a;
                        x92Var2.b.put(ha2Var.a, new w92(x92Var2.A.n(i23, ha2Var.b), ka2Var, j(sparseArray2, ha2Var.a)));
                        x92Var2.t = Math.max(x92Var2.t, ha2Var.e);
                    }
                    x92Var2.A.zzC();
                } else {
                    uo4.f(x92Var2.b.size() == size2);
                    for (int i24 = 0; i24 < size2; i24++) {
                        ka2 ka2Var2 = (ka2) c2.get(i24);
                        ha2 ha2Var2 = ka2Var2.a;
                        ((w92) x92Var2.b.get(ha2Var2.a)).h(ka2Var2, j(sparseArray2, ha2Var2.a));
                    }
                }
            } else {
                if (i18 == 1836019558) {
                    SparseArray sparseArray3 = x92Var2.b;
                    byte[] bArr5 = x92Var2.f;
                    int size3 = a92Var4.d.size();
                    int i25 = 0;
                    while (i25 < size3) {
                        a92 a92Var5 = (a92) a92Var4.d.get(i25);
                        if (a92Var5.a == 1953653094) {
                            b92 d = a92Var5.d(1952868452);
                            Objects.requireNonNull(d);
                            ik5 ik5Var3 = d.b;
                            ik5Var3.f(i20);
                            int m = ik5Var3.m() & 16777215;
                            w92 w92Var = (w92) sparseArray3.get(ik5Var3.m());
                            if (w92Var == null) {
                                w92Var = null;
                            } else {
                                if ((m & 1) != 0) {
                                    long B = ik5Var3.B();
                                    ja2 ja2Var2 = w92Var.b;
                                    ja2Var2.b = B;
                                    ja2Var2.c = B;
                                }
                                s92 s92Var2 = w92Var.e;
                                w92Var.b.a = new s92((m & 2) != 0 ? ik5Var3.m() - 1 : s92Var2.a, (m & 8) != 0 ? ik5Var3.m() : s92Var2.b, (m & 16) != 0 ? ik5Var3.m() : s92Var2.c, (m & 32) != 0 ? ik5Var3.m() : s92Var2.d);
                            }
                            if (w92Var != null) {
                                ja2 ja2Var3 = w92Var.b;
                                long j4 = ja2Var3.p;
                                boolean z3 = ja2Var3.q;
                                w92Var.i();
                                w92Var.l = true;
                                b92 d2 = a92Var5.d(1952867444);
                                if (d2 != null) {
                                    ik5 ik5Var4 = d2.b;
                                    ik5Var4.f(i20);
                                    ja2Var3.p = c92.a(ik5Var4.m()) == 1 ? ik5Var4.B() : ik5Var4.A();
                                    ja2Var3.q = true;
                                } else {
                                    ja2Var3.p = j4;
                                    ja2Var3.q = z3;
                                }
                                List list2 = a92Var5.c;
                                int size4 = list2.size();
                                int i26 = 0;
                                int i27 = 0;
                                int i28 = 0;
                                while (true) {
                                    i3 = 1953658222;
                                    if (i26 >= size4) {
                                        break;
                                    }
                                    b92 b92Var2 = (b92) list2.get(i26);
                                    SparseArray sparseArray4 = sparseArray3;
                                    if (b92Var2.a == 1953658222) {
                                        ik5 ik5Var5 = b92Var2.b;
                                        ik5Var5.f(12);
                                        int v = ik5Var5.v();
                                        if (v > 0) {
                                            i28 += v;
                                            i27++;
                                        }
                                    }
                                    i26++;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                w92Var.h = 0;
                                w92Var.g = 0;
                                w92Var.f = 0;
                                ja2 ja2Var4 = w92Var.b;
                                ja2Var4.d = i27;
                                ja2Var4.e = i28;
                                if (ja2Var4.g.length < i27) {
                                    ja2Var4.f = new long[i27];
                                    ja2Var4.g = new int[i27];
                                }
                                if (ja2Var4.h.length < i28) {
                                    int i29 = (i28 * x21.L0) / 100;
                                    ja2Var4.h = new int[i29];
                                    ja2Var4.i = new long[i29];
                                    ja2Var4.j = new boolean[i29];
                                    ja2Var4.l = new boolean[i29];
                                }
                                int i30 = 0;
                                int i31 = 0;
                                int i32 = 0;
                                while (true) {
                                    long j5 = 0;
                                    if (i30 >= size4) {
                                        break;
                                    }
                                    b92 b92Var3 = (b92) list2.get(i30);
                                    if (b92Var3.a == i3) {
                                        int i33 = i32 + 1;
                                        ik5 ik5Var6 = b92Var3.b;
                                        ik5Var6.f(8);
                                        int m2 = ik5Var6.m() & 16777215;
                                        list = list2;
                                        ha2 ha2Var3 = w92Var.d.a;
                                        i6 = size3;
                                        ja2 ja2Var5 = w92Var.b;
                                        i8 = size4;
                                        s92 s92Var3 = ja2Var5.a;
                                        int i34 = it5.a;
                                        ja2Var5.g[i32] = ik5Var6.v();
                                        long[] jArr = ja2Var5.f;
                                        a92Var2 = a92Var4;
                                        bArr4 = bArr5;
                                        long j6 = ja2Var5.b;
                                        jArr[i32] = j6;
                                        if ((m2 & 1) != 0) {
                                            i5 = i30;
                                            jArr[i32] = j6 + ik5Var6.m();
                                        } else {
                                            i5 = i30;
                                        }
                                        boolean z4 = (m2 & 4) != 0;
                                        int i35 = s92Var3.d;
                                        if (z4) {
                                            i35 = ik5Var6.m();
                                        }
                                        int i36 = m2 & 256;
                                        int i37 = m2 & 512;
                                        int i38 = m2 & NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;
                                        int i39 = m2 & 2048;
                                        int i40 = i35;
                                        long[] jArr2 = ha2Var3.h;
                                        i7 = i25;
                                        if (jArr2 != null) {
                                            a92Var3 = a92Var5;
                                            if (jArr2.length == 1 && jArr2[0] == 0) {
                                                j5 = ((long[]) it5.h(ha2Var3.i))[0];
                                            }
                                        } else {
                                            a92Var3 = a92Var5;
                                        }
                                        int[] iArr = ja2Var5.h;
                                        long[] jArr3 = ja2Var5.i;
                                        boolean[] zArr = ja2Var5.j;
                                        ja2Var = ja2Var3;
                                        int i41 = ja2Var5.g[i32] + i31;
                                        long j7 = ha2Var3.c;
                                        int i42 = i31;
                                        long j8 = ja2Var5.p;
                                        while (i42 < i41) {
                                            if (i36 != 0) {
                                                i9 = i36;
                                                i10 = ik5Var6.m();
                                            } else {
                                                i9 = i36;
                                                i10 = s92Var3.b;
                                            }
                                            b(i10);
                                            if (i37 != 0) {
                                                i11 = i37;
                                                i12 = ik5Var6.m();
                                            } else {
                                                i11 = i37;
                                                i12 = s92Var3.c;
                                            }
                                            b(i12);
                                            if (i38 != 0) {
                                                z2 = z4;
                                                i13 = ik5Var6.m();
                                            } else {
                                                z2 = z4;
                                                if (i42 == 0) {
                                                    if (z4) {
                                                        i13 = i40;
                                                        i42 = 0;
                                                    } else {
                                                        i42 = 0;
                                                    }
                                                }
                                                i13 = s92Var3.d;
                                            }
                                            if (i39 != 0) {
                                                i14 = i41;
                                                i15 = i38;
                                                i16 = i39;
                                                i17 = ik5Var6.m();
                                            } else {
                                                i14 = i41;
                                                i15 = i38;
                                                i16 = i39;
                                                i17 = 0;
                                            }
                                            long g0 = it5.g0((i17 + j8) - j5, 1000000L, j7);
                                            jArr3[i42] = g0;
                                            if (ja2Var5.q) {
                                                s92Var = s92Var3;
                                                j2 = j7;
                                            } else {
                                                s92Var = s92Var3;
                                                j2 = j7;
                                                jArr3[i42] = g0 + w92Var.d.h;
                                            }
                                            iArr[i42] = i12;
                                            zArr[i42] = 1 == (((i13 >> 16) & 1) ^ 1);
                                            j8 += i10;
                                            i42++;
                                            s92Var3 = s92Var;
                                            j7 = j2;
                                            i36 = i9;
                                            i37 = i11;
                                            z4 = z2;
                                            i41 = i14;
                                            i38 = i15;
                                            i39 = i16;
                                        }
                                        ja2Var5.p = j8;
                                        i32 = i33;
                                        i31 = i41;
                                    } else {
                                        i5 = i30;
                                        a92Var2 = a92Var4;
                                        bArr4 = bArr5;
                                        ja2Var = ja2Var3;
                                        list = list2;
                                        i6 = size3;
                                        i7 = i25;
                                        i8 = size4;
                                        a92Var3 = a92Var5;
                                    }
                                    i30 = i5 + 1;
                                    list2 = list;
                                    size3 = i6;
                                    size4 = i8;
                                    a92Var4 = a92Var2;
                                    bArr5 = bArr4;
                                    i25 = i7;
                                    a92Var5 = a92Var3;
                                    ja2Var3 = ja2Var;
                                    i3 = 1953658222;
                                }
                                a92Var = a92Var4;
                                byte[] bArr6 = bArr5;
                                ja2 ja2Var6 = ja2Var3;
                                i = size3;
                                i2 = i25;
                                a92 a92Var6 = a92Var5;
                                ha2 ha2Var4 = w92Var.d.a;
                                s92 s92Var4 = ja2Var6.a;
                                Objects.requireNonNull(s92Var4);
                                ia2 a = ha2Var4.a(s92Var4.a);
                                b92 d3 = a92Var6.d(1935763834);
                                if (d3 != null) {
                                    Objects.requireNonNull(a);
                                    ik5 ik5Var7 = d3.b;
                                    int i43 = a.d;
                                    ik5Var7.f(8);
                                    if ((ik5Var7.m() & 1) == 1) {
                                        ik5Var7.g(8);
                                    }
                                    int s = ik5Var7.s();
                                    int v2 = ik5Var7.v();
                                    int i44 = ja2Var6.e;
                                    if (v2 > i44) {
                                        throw dl3.a("Saiz sample count " + v2 + " is greater than fragment sample count" + i44, null);
                                    }
                                    if (s == 0) {
                                        boolean[] zArr2 = ja2Var6.l;
                                        i4 = 0;
                                        for (int i45 = 0; i45 < v2; i45++) {
                                            int s2 = ik5Var7.s();
                                            i4 += s2;
                                            zArr2[i45] = s2 > i43;
                                        }
                                        z = false;
                                    } else {
                                        boolean z5 = s > i43;
                                        i4 = s * v2;
                                        z = false;
                                        Arrays.fill(ja2Var6.l, 0, v2, z5);
                                    }
                                    Arrays.fill(ja2Var6.l, v2, ja2Var6.e, z);
                                    if (i4 > 0) {
                                        ja2Var6.a(i4);
                                    }
                                }
                                b92 d4 = a92Var6.d(1935763823);
                                if (d4 != null) {
                                    ik5 ik5Var8 = d4.b;
                                    ik5Var8.f(8);
                                    int m3 = ik5Var8.m();
                                    if ((m3 & 1) == 1) {
                                        ik5Var8.g(8);
                                    }
                                    int v3 = ik5Var8.v();
                                    if (v3 != 1) {
                                        throw dl3.a("Unexpected saio entry count: " + v3, null);
                                    }
                                    ja2Var6.c += c92.a(m3) == 0 ? ik5Var8.A() : ik5Var8.B();
                                }
                                b92 d5 = a92Var6.d(1936027235);
                                if (d5 != null) {
                                    h(d5.b, 0, ja2Var6);
                                }
                                String str = a != null ? a.b : null;
                                ik5 ik5Var9 = null;
                                ik5 ik5Var10 = null;
                                for (int i46 = 0; i46 < a92Var6.c.size(); i46++) {
                                    b92 b92Var4 = (b92) a92Var6.c.get(i46);
                                    ik5 ik5Var11 = b92Var4.b;
                                    int i47 = b92Var4.a;
                                    if (i47 == 1935828848) {
                                        ik5Var11.f(12);
                                        if (ik5Var11.m() == 1936025959) {
                                            ik5Var9 = ik5Var11;
                                        }
                                    } else if (i47 == 1936158820) {
                                        ik5Var11.f(12);
                                        if (ik5Var11.m() == 1936025959) {
                                            ik5Var10 = ik5Var11;
                                        }
                                    }
                                }
                                if (ik5Var9 != null && ik5Var10 != null) {
                                    ik5Var9.f(8);
                                    int m4 = ik5Var9.m();
                                    ik5Var9.g(4);
                                    if (c92.a(m4) == 1) {
                                        ik5Var9.g(4);
                                    }
                                    if (ik5Var9.m() != 1) {
                                        throw dl3.c("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    ik5Var10.f(8);
                                    int a2 = c92.a(ik5Var10.m());
                                    ik5Var10.g(4);
                                    if (a2 == 1) {
                                        if (ik5Var10.A() == 0) {
                                            throw dl3.c("Variable length description in sgpd found (unsupported)");
                                        }
                                    } else if (a2 >= 2) {
                                        ik5Var10.g(4);
                                    }
                                    if (ik5Var10.A() != 1) {
                                        throw dl3.c("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    ik5Var10.g(1);
                                    int s3 = ik5Var10.s();
                                    int i48 = (s3 & 240) >> 4;
                                    int i49 = s3 & 15;
                                    if (ik5Var10.s() == 1) {
                                        int s4 = ik5Var10.s();
                                        byte[] bArr7 = new byte[16];
                                        ik5Var10.b(bArr7, 0, 16);
                                        if (s4 == 0) {
                                            int s5 = ik5Var10.s();
                                            byte[] bArr8 = new byte[s5];
                                            ik5Var10.b(bArr8, 0, s5);
                                            bArr3 = bArr8;
                                        } else {
                                            bArr3 = null;
                                        }
                                        ja2Var6.k = true;
                                        ja2Var6.m = new ia2(true, str, s4, bArr7, i48, i49, bArr3);
                                    }
                                }
                                int size5 = a92Var6.c.size();
                                int i50 = 0;
                                while (i50 < size5) {
                                    b92 b92Var5 = (b92) a92Var6.c.get(i50);
                                    if (b92Var5.a == 1970628964) {
                                        ik5 ik5Var12 = b92Var5.b;
                                        ik5Var12.f(8);
                                        bArr2 = bArr6;
                                        ik5Var12.b(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, F)) {
                                            h(ik5Var12, 16, ja2Var6);
                                        }
                                    } else {
                                        bArr2 = bArr6;
                                    }
                                    i50++;
                                    bArr6 = bArr2;
                                }
                                bArr = bArr6;
                                bArr5 = bArr;
                                size3 = i;
                                a92Var4 = a92Var;
                                i20 = 8;
                                i25 = i2 + 1;
                                sparseArray3 = sparseArray;
                            }
                        }
                        sparseArray = sparseArray3;
                        a92Var = a92Var4;
                        i = size3;
                        i2 = i25;
                        bArr = bArr5;
                        bArr5 = bArr;
                        size3 = i;
                        a92Var4 = a92Var;
                        i20 = 8;
                        i25 = i2 + 1;
                        sparseArray3 = sparseArray;
                    }
                    zzx e2 = e(a92Var4.c);
                    x92Var = this;
                    if (e2 != null) {
                        int size6 = x92Var.b.size();
                        for (int i51 = 0; i51 < size6; i51++) {
                            w92 w92Var2 = (w92) x92Var.b.valueAt(i51);
                            ha2 ha2Var5 = w92Var2.d.a;
                            s92 s92Var5 = w92Var2.b.a;
                            int i52 = it5.a;
                            ia2 a3 = ha2Var5.a(s92Var5.a);
                            zzx b = e2.b(a3 != null ? a3.b : null);
                            b72 b2 = w92Var2.d.a.f.b();
                            b2.b(b);
                            w92Var2.a.f(b2.y());
                        }
                    }
                    if (x92Var.s != -9223372036854775807L) {
                        int size7 = x92Var.b.size();
                        for (int i53 = 0; i53 < size7; i53++) {
                            w92 w92Var3 = (w92) x92Var.b.valueAt(i53);
                            long j9 = x92Var.s;
                            int i54 = w92Var3.f;
                            while (true) {
                                ja2 ja2Var7 = w92Var3.b;
                                if (i54 < ja2Var7.e && ja2Var7.i[i54] < j9) {
                                    if (ja2Var7.j[i54]) {
                                        w92Var3.i = i54;
                                    }
                                    i54++;
                                }
                            }
                        }
                        x92Var.s = -9223372036854775807L;
                    }
                } else {
                    x92Var = x92Var2;
                    if (!x92Var.j.isEmpty()) {
                        ((a92) x92Var.j.peek()).e(a92Var4);
                    }
                }
                x92Var2 = x92Var;
            }
        }
        g();
    }
}
