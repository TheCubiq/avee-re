package com.daaw;

import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes.dex */
public final class jc2 implements ac2 {

    /* renamed from: a */
    public final id2 f14865a;

    /* renamed from: e */
    public long f14869e;

    /* renamed from: g */
    public String f14871g;

    /* renamed from: h */
    public m42 f14872h;

    /* renamed from: i */
    public ic2 f14873i;

    /* renamed from: j */
    public boolean f14874j;

    /* renamed from: l */
    public boolean f14876l;

    /* renamed from: f */
    public final boolean[] f14870f = new boolean[3];

    /* renamed from: b */
    public final pc2 f14866b = new pc2(7, 128);

    /* renamed from: c */
    public final pc2 f14867c = new pc2(8, 128);

    /* renamed from: d */
    public final pc2 f14868d = new pc2(6, 128);

    /* renamed from: k */
    public long f14875k = -9223372036854775807L;

    /* renamed from: m */
    public final ik5 f14877m = new ik5();

    public jc2(id2 id2Var, boolean z, boolean z2) {
        this.f14865a = id2Var;
    }

    @Override // com.daaw.ac2
    /* renamed from: a */
    public final void mo2553a(ik5 ik5Var) {
        pc2 pc2Var;
        uo4.m7876b(this.f14872h);
        int i = it5.f13991a;
        int m19711k = ik5Var.m19711k();
        int m19710l = ik5Var.m19710l();
        byte[] m19714h = ik5Var.m19714h();
        this.f14869e += ik5Var.m19713i();
        this.f14872h.mo16221c(ik5Var, ik5Var.m19713i());
        while (true) {
            int m25632a = c42.m25632a(m19714h, m19711k, m19710l, this.f14870f);
            if (m25632a == m19710l) {
                m18606d(m19714h, m19711k, m19710l);
                return;
            }
            int i2 = m25632a + 3;
            int i3 = m19714h[i2] & 31;
            int i4 = m25632a - m19711k;
            if (i4 > 0) {
                m18606d(m19714h, m19711k, m25632a);
            }
            int i5 = m19710l - m25632a;
            long j = this.f14869e - i5;
            int i6 = i4 < 0 ? -i4 : 0;
            long j2 = this.f14875k;
            if (!this.f14874j) {
                this.f14866b.m13453d(i6);
                this.f14867c.m13453d(i6);
                if (this.f14874j) {
                    pc2 pc2Var2 = this.f14866b;
                    if (pc2Var2.m13452e()) {
                        this.f14873i.m19931b(c42.m25629d(pc2Var2.f22829d, 4, pc2Var2.f22830e));
                        pc2Var = this.f14866b;
                    } else {
                        pc2 pc2Var3 = this.f14867c;
                        if (pc2Var3.m13452e()) {
                            this.f14873i.m19932a(c42.m25630c(pc2Var3.f22829d, 4, pc2Var3.f22830e));
                            pc2Var = this.f14867c;
                        }
                    }
                } else if (this.f14866b.m13452e() && this.f14867c.m13452e()) {
                    ArrayList arrayList = new ArrayList();
                    pc2 pc2Var4 = this.f14866b;
                    arrayList.add(Arrays.copyOf(pc2Var4.f22829d, pc2Var4.f22830e));
                    pc2 pc2Var5 = this.f14867c;
                    arrayList.add(Arrays.copyOf(pc2Var5.f22829d, pc2Var5.f22830e));
                    pc2 pc2Var6 = this.f14866b;
                    b42 m25629d = c42.m25629d(pc2Var6.f22829d, 4, pc2Var6.f22830e);
                    pc2 pc2Var7 = this.f14867c;
                    a42 m25630c = c42.m25630c(pc2Var7.f22829d, 4, pc2Var7.f22830e);
                    String m27132a = ar4.m27132a(m25629d.f4282a, m25629d.f4283b, m25629d.f4284c);
                    m42 m42Var = this.f14872h;
                    b72 b72Var = new b72();
                    b72Var.m26384h(this.f14871g);
                    b72Var.m26372s("video/avc");
                    b72Var.m26387f0(m27132a);
                    b72Var.m26367x(m25629d.f4286e);
                    b72Var.m26388f(m25629d.f4287f);
                    b72Var.m26375p(m25629d.f4288g);
                    b72Var.m26382i(arrayList);
                    m42Var.mo16218f(b72Var.m26366y());
                    this.f14874j = true;
                    this.f14873i.m19931b(m25629d);
                    this.f14873i.m19932a(m25630c);
                    this.f14866b.m13455b();
                    pc2Var = this.f14867c;
                }
                pc2Var.m13455b();
            }
            if (this.f14868d.m13453d(i6)) {
                pc2 pc2Var8 = this.f14868d;
                this.f14877m.m19718d(this.f14868d.f22829d, c42.m25631b(pc2Var8.f22829d, pc2Var8.f22830e));
                this.f14877m.m19716f(4);
                this.f14865a.m19915a(j2, this.f14877m);
            }
            if (this.f14873i.m19928e(j, i5, this.f14874j, this.f14876l)) {
                this.f14876l = false;
            }
            long j3 = this.f14875k;
            if (!this.f14874j) {
                this.f14866b.m13454c(i3);
                this.f14867c.m13454c(i3);
            }
            this.f14868d.m13454c(i3);
            this.f14873i.m19929d(j, i3, j3);
            m19711k = i2;
        }
    }

    @Override // com.daaw.ac2
    /* renamed from: b */
    public final void mo2552b(m09 m09Var, td2 td2Var) {
        td2Var.m9282c();
        this.f14871g = td2Var.m9283b();
        m42 mo3292n = m09Var.mo3292n(td2Var.m9284a(), 2);
        this.f14872h = mo3292n;
        this.f14873i = new ic2(mo3292n, false, false);
        this.f14865a.m19914b(m09Var, td2Var);
    }

    @Override // com.daaw.ac2
    /* renamed from: c */
    public final void mo2551c(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f14875k = j;
        }
        this.f14876l |= (i & 2) != 0;
    }

    @RequiresNonNull({"sampleReader"})
    /* renamed from: d */
    public final void m18606d(byte[] bArr, int i, int i2) {
        if (!this.f14874j) {
            this.f14866b.m13456a(bArr, i, i2);
            this.f14867c.m13456a(bArr, i, i2);
        }
        this.f14868d.m13456a(bArr, i, i2);
    }

    @Override // com.daaw.ac2
    public final void zzc() {
    }

    @Override // com.daaw.ac2
    public final void zze() {
        this.f14869e = 0L;
        this.f14876l = false;
        this.f14875k = -9223372036854775807L;
        c42.m25628e(this.f14870f);
        this.f14866b.m13455b();
        this.f14867c.m13455b();
        this.f14868d.m13455b();
        ic2 ic2Var = this.f14873i;
        if (ic2Var != null) {
            ic2Var.m19930c();
        }
    }
}
