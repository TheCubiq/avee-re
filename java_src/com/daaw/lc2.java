package com.daaw;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes.dex */
public final class lc2 implements ac2 {

    /* renamed from: a */
    public final id2 f17239a;

    /* renamed from: b */
    public String f17240b;

    /* renamed from: c */
    public m42 f17241c;

    /* renamed from: d */
    public kc2 f17242d;

    /* renamed from: e */
    public boolean f17243e;

    /* renamed from: l */
    public long f17250l;

    /* renamed from: f */
    public final boolean[] f17244f = new boolean[3];

    /* renamed from: g */
    public final pc2 f17245g = new pc2(32, 128);

    /* renamed from: h */
    public final pc2 f17246h = new pc2(33, 128);

    /* renamed from: i */
    public final pc2 f17247i = new pc2(34, 128);

    /* renamed from: j */
    public final pc2 f17248j = new pc2(39, 128);

    /* renamed from: k */
    public final pc2 f17249k = new pc2(40, 128);

    /* renamed from: m */
    public long f17251m = -9223372036854775807L;

    /* renamed from: n */
    public final ik5 f17252n = new ik5();

    public lc2(id2 id2Var) {
        this.f17239a = id2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03b8  */
    @Override // com.daaw.ac2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2553a(ik5 ik5Var) {
        int i;
        byte[] bArr;
        int i2;
        int i3;
        long j;
        int i4;
        long j2;
        long j3;
        int i5;
        int i6;
        long j4;
        int i7;
        uo4.m7876b(this.f17241c);
        int i8 = it5.f13991a;
        while (ik5Var.m19713i() > 0) {
            int m19711k = ik5Var.m19711k();
            int m19710l = ik5Var.m19710l();
            byte[] m19714h = ik5Var.m19714h();
            this.f17250l += ik5Var.m19713i();
            this.f17241c.mo16221c(ik5Var, ik5Var.m19713i());
            while (m19711k < m19710l) {
                int m25632a = c42.m25632a(m19714h, m19711k, m19710l, this.f17244f);
                if (m25632a == m19710l) {
                    m17051d(m19714h, m19711k, m19710l);
                    return;
                }
                int i9 = m25632a + 3;
                int i10 = (m19714h[i9] & 126) >> 1;
                int i11 = m25632a - m19711k;
                if (i11 > 0) {
                    m17051d(m19714h, m19711k, m25632a);
                }
                int i12 = m19710l - m25632a;
                long j5 = this.f17250l - i12;
                int i13 = i11 < 0 ? -i11 : 0;
                long j6 = this.f17251m;
                this.f17242d.m17808a(j5, i12, this.f17243e);
                if (!this.f17243e) {
                    this.f17245g.m13453d(i13);
                    this.f17246h.m13453d(i13);
                    this.f17247i.m13453d(i13);
                    pc2 pc2Var = this.f17245g;
                    if (pc2Var.m13452e()) {
                        pc2 pc2Var2 = this.f17246h;
                        if (pc2Var2.m13452e()) {
                            pc2 pc2Var3 = this.f17247i;
                            if (pc2Var3.m13452e()) {
                                m42 m42Var = this.f17241c;
                                i2 = i9;
                                String str = this.f17240b;
                                int i14 = pc2Var.f22830e;
                                i = m19710l;
                                bArr = m19714h;
                                byte[] bArr2 = new byte[pc2Var2.f22830e + i14 + pc2Var3.f22830e];
                                i3 = i10;
                                System.arraycopy(pc2Var.f22829d, 0, bArr2, 0, i14);
                                i4 = i12;
                                System.arraycopy(pc2Var2.f22829d, 0, bArr2, pc2Var.f22830e, pc2Var2.f22830e);
                                System.arraycopy(pc2Var3.f22829d, 0, bArr2, pc2Var.f22830e + pc2Var2.f22830e, pc2Var3.f22830e);
                                e42 e42Var = new e42(pc2Var2.f22829d, 0, pc2Var2.f22830e);
                                e42Var.m23723e(44);
                                int m23727a = e42Var.m23727a(3);
                                e42Var.m23724d();
                                int m23727a2 = e42Var.m23727a(2);
                                boolean m23722f = e42Var.m23722f();
                                int m23727a3 = e42Var.m23727a(5);
                                int i15 = 0;
                                for (int i16 = 0; i16 < 32; i16++) {
                                    if (e42Var.m23722f()) {
                                        i15 |= 1 << i16;
                                    }
                                }
                                int[] iArr = new int[6];
                                for (int i17 = 0; i17 < 6; i17++) {
                                    iArr[i17] = e42Var.m23727a(8);
                                }
                                int m23727a4 = e42Var.m23727a(8);
                                int i18 = 0;
                                for (int i19 = 0; i19 < m23727a; i19++) {
                                    if (e42Var.m23722f()) {
                                        i18 += 89;
                                    }
                                    if (e42Var.m23722f()) {
                                        i18 += 8;
                                    }
                                }
                                e42Var.m23723e(i18);
                                if (m23727a > 0) {
                                    int i20 = 8 - m23727a;
                                    e42Var.m23723e(i20 + i20);
                                }
                                e42Var.m23725c();
                                int m23725c = e42Var.m23725c();
                                if (m23725c == 3) {
                                    e42Var.m23724d();
                                    m23725c = 3;
                                }
                                int m23725c2 = e42Var.m23725c();
                                int m23725c3 = e42Var.m23725c();
                                if (e42Var.m23722f()) {
                                    int m23725c4 = e42Var.m23725c();
                                    int m23725c5 = e42Var.m23725c();
                                    int m23725c6 = e42Var.m23725c();
                                    int m23725c7 = e42Var.m23725c();
                                    if (m23725c != 1) {
                                        j = j5;
                                        if (m23725c == 2) {
                                            i7 = 2;
                                            m23725c = 2;
                                        } else {
                                            i7 = 1;
                                        }
                                    } else {
                                        j = j5;
                                        i7 = 2;
                                    }
                                    m23725c2 -= i7 * (m23725c4 + m23725c5);
                                    m23725c3 -= (m23725c == 1 ? 2 : 1) * (m23725c6 + m23725c7);
                                } else {
                                    j = j5;
                                }
                                e42Var.m23725c();
                                e42Var.m23725c();
                                int m23725c8 = e42Var.m23725c();
                                int i21 = true != e42Var.m23722f() ? m23727a : 0;
                                while (true) {
                                    e42Var.m23725c();
                                    e42Var.m23725c();
                                    e42Var.m23725c();
                                    if (i21 > m23727a) {
                                        break;
                                    }
                                    i21++;
                                }
                                e42Var.m23725c();
                                e42Var.m23725c();
                                e42Var.m23725c();
                                if (e42Var.m23722f() && e42Var.m23722f()) {
                                    int i22 = 0;
                                    for (int i23 = 4; i22 < i23; i23 = 4) {
                                        int i24 = 0;
                                        while (i24 < 6) {
                                            if (e42Var.m23722f()) {
                                                j4 = j6;
                                                int min = Math.min(64, 1 << ((i22 + i22) + 4));
                                                if (i22 > 1) {
                                                    e42Var.m23726b();
                                                }
                                                for (int i25 = 0; i25 < min; i25++) {
                                                    e42Var.m23726b();
                                                }
                                            } else {
                                                e42Var.m23725c();
                                                j4 = j6;
                                            }
                                            i24 += i22 == 3 ? 3 : 1;
                                            j6 = j4;
                                        }
                                        i22++;
                                    }
                                }
                                j2 = j6;
                                e42Var.m23723e(2);
                                if (e42Var.m23722f()) {
                                    e42Var.m23723e(8);
                                    e42Var.m23725c();
                                    e42Var.m23725c();
                                    e42Var.m23724d();
                                }
                                int m23725c9 = e42Var.m23725c();
                                int i26 = 0;
                                boolean z = false;
                                int i27 = 0;
                                while (i26 < m23725c9) {
                                    if (i26 != 0) {
                                        z = e42Var.m23722f();
                                    }
                                    if (z) {
                                        e42Var.m23724d();
                                        e42Var.m23725c();
                                        for (int i28 = 0; i28 <= i27; i28++) {
                                            if (e42Var.m23722f()) {
                                                e42Var.m23724d();
                                            }
                                        }
                                        i6 = m23725c9;
                                    } else {
                                        int m23725c10 = e42Var.m23725c();
                                        int m23725c11 = e42Var.m23725c();
                                        int i29 = m23725c10 + m23725c11;
                                        i6 = m23725c9;
                                        for (int i30 = 0; i30 < m23725c10; i30++) {
                                            e42Var.m23725c();
                                            e42Var.m23724d();
                                        }
                                        for (int i31 = 0; i31 < m23725c11; i31++) {
                                            e42Var.m23725c();
                                            e42Var.m23724d();
                                        }
                                        i27 = i29;
                                    }
                                    i26++;
                                    m23725c9 = i6;
                                }
                                if (e42Var.m23722f()) {
                                    for (int i32 = 0; i32 < e42Var.m23725c(); i32++) {
                                        e42Var.m23723e(m23725c8 + 5);
                                    }
                                }
                                e42Var.m23723e(2);
                                float f = 1.0f;
                                if (e42Var.m23722f()) {
                                    if (e42Var.m23722f()) {
                                        int m23727a5 = e42Var.m23727a(8);
                                        if (m23727a5 == 255) {
                                            int m23727a6 = e42Var.m23727a(16);
                                            int m23727a7 = e42Var.m23727a(16);
                                            if (m23727a6 != 0 && m23727a7 != 0) {
                                                f = m23727a6 / m23727a7;
                                            }
                                        } else if (m23727a5 < 17) {
                                            f = c42.f5463b[m23727a5];
                                        } else {
                                            s95.m10493e("H265Reader", "Unexpected aspect_ratio_idc value: " + m23727a5);
                                        }
                                    }
                                    if (e42Var.m23722f()) {
                                        e42Var.m23724d();
                                    }
                                    if (e42Var.m23722f()) {
                                        e42Var.m23723e(4);
                                        if (e42Var.m23722f()) {
                                            e42Var.m23723e(24);
                                        }
                                    }
                                    if (e42Var.m23722f()) {
                                        e42Var.m23725c();
                                        e42Var.m23725c();
                                    }
                                    e42Var.m23724d();
                                    if (e42Var.m23722f()) {
                                        m23725c3 += m23725c3;
                                    }
                                }
                                String m27131b = ar4.m27131b(m23727a2, m23722f, m23727a3, i15, iArr, m23727a4);
                                b72 b72Var = new b72();
                                b72Var.m26384h(str);
                                b72Var.m26372s("video/hevc");
                                b72Var.m26387f0(m27131b);
                                b72Var.m26367x(m23725c2);
                                b72Var.m26388f(m23725c3);
                                b72Var.m26375p(f);
                                b72Var.m26382i(Collections.singletonList(bArr2));
                                m42Var.mo16218f(b72Var.m26366y());
                                this.f17243e = true;
                                if (this.f17248j.m13453d(i13)) {
                                    j3 = j2;
                                } else {
                                    pc2 pc2Var4 = this.f17248j;
                                    this.f17252n.m19718d(this.f17248j.f22829d, c42.m25631b(pc2Var4.f22829d, pc2Var4.f22830e));
                                    this.f17252n.m19715g(5);
                                    j3 = j2;
                                    this.f17239a.m19915a(j3, this.f17252n);
                                }
                                if (this.f17249k.m13453d(i13)) {
                                    pc2 pc2Var5 = this.f17249k;
                                    this.f17252n.m19718d(this.f17249k.f22829d, c42.m25631b(pc2Var5.f22829d, pc2Var5.f22830e));
                                    this.f17252n.m19715g(5);
                                    this.f17239a.m19915a(j3, this.f17252n);
                                }
                                this.f17242d.m17805d(j, i4, i3, this.f17251m, this.f17243e);
                                if (this.f17243e) {
                                    i5 = i3;
                                    this.f17245g.m13454c(i5);
                                    this.f17246h.m13454c(i5);
                                    this.f17247i.m13454c(i5);
                                } else {
                                    i5 = i3;
                                }
                                this.f17248j.m13454c(i5);
                                this.f17249k.m13454c(i5);
                                m19711k = i2;
                                m19710l = i;
                                m19714h = bArr;
                            }
                        }
                    }
                }
                i = m19710l;
                bArr = m19714h;
                i2 = i9;
                i3 = i10;
                j = j5;
                i4 = i12;
                j2 = j6;
                if (this.f17248j.m13453d(i13)) {
                }
                if (this.f17249k.m13453d(i13)) {
                }
                this.f17242d.m17805d(j, i4, i3, this.f17251m, this.f17243e);
                if (this.f17243e) {
                }
                this.f17248j.m13454c(i5);
                this.f17249k.m13454c(i5);
                m19711k = i2;
                m19710l = i;
                m19714h = bArr;
            }
        }
    }

    @Override // com.daaw.ac2
    /* renamed from: b */
    public final void mo2552b(m09 m09Var, td2 td2Var) {
        td2Var.m9282c();
        this.f17240b = td2Var.m9283b();
        m42 mo3292n = m09Var.mo3292n(td2Var.m9284a(), 2);
        this.f17241c = mo3292n;
        this.f17242d = new kc2(mo3292n);
        this.f17239a.m19914b(m09Var, td2Var);
    }

    @Override // com.daaw.ac2
    /* renamed from: c */
    public final void mo2551c(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f17251m = j;
        }
    }

    @RequiresNonNull({"sampleReader"})
    /* renamed from: d */
    public final void m17051d(byte[] bArr, int i, int i2) {
        this.f17242d.m17807b(bArr, i, i2);
        if (!this.f17243e) {
            this.f17245g.m13456a(bArr, i, i2);
            this.f17246h.m13456a(bArr, i, i2);
            this.f17247i.m13456a(bArr, i, i2);
        }
        this.f17248j.m13456a(bArr, i, i2);
        this.f17249k.m13456a(bArr, i, i2);
    }

    @Override // com.daaw.ac2
    public final void zzc() {
    }

    @Override // com.daaw.ac2
    public final void zze() {
        this.f17250l = 0L;
        this.f17251m = -9223372036854775807L;
        c42.m25628e(this.f17244f);
        this.f17245g.m13455b();
        this.f17246h.m13455b();
        this.f17247i.m13455b();
        this.f17248j.m13455b();
        this.f17249k.m13455b();
        kc2 kc2Var = this.f17242d;
        if (kc2Var != null) {
            kc2Var.m17806c();
        }
    }
}
