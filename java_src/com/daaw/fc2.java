package com.daaw;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
/* loaded from: classes.dex */
public final class fc2 implements ac2 {

    /* renamed from: l */
    public static final float[] f9422l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a */
    public final wd2 f9423a;

    /* renamed from: f */
    public ec2 f9428f;

    /* renamed from: g */
    public long f9429g;

    /* renamed from: h */
    public String f9430h;

    /* renamed from: i */
    public m42 f9431i;

    /* renamed from: j */
    public boolean f9432j;

    /* renamed from: c */
    public final boolean[] f9425c = new boolean[4];

    /* renamed from: d */
    public final dc2 f9426d = new dc2(128);

    /* renamed from: k */
    public long f9433k = -9223372036854775807L;

    /* renamed from: e */
    public final pc2 f9427e = new pc2(178, 128);

    /* renamed from: b */
    public final ik5 f9424b = new ik5();

    public fc2(wd2 wd2Var) {
        this.f9423a = wd2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01cb A[SYNTHETIC] */
    @Override // com.daaw.ac2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2553a(ik5 ik5Var) {
        int i;
        int i2;
        float f;
        float f2;
        uo4.m7876b(this.f9428f);
        uo4.m7876b(this.f9431i);
        int m19711k = ik5Var.m19711k();
        int m19710l = ik5Var.m19710l();
        byte[] m19714h = ik5Var.m19714h();
        this.f9429g += ik5Var.m19713i();
        this.f9431i.mo16221c(ik5Var, ik5Var.m19713i());
        while (true) {
            int m25632a = c42.m25632a(m19714h, m19711k, m19710l, this.f9425c);
            if (m25632a == m19710l) {
                break;
            }
            int i3 = m25632a + 3;
            int i4 = ik5Var.m19714h()[i3] & 255;
            int i5 = m25632a - m19711k;
            if (!this.f9432j) {
                if (i5 > 0) {
                    this.f9426d.m24531a(m19714h, m19711k, m25632a);
                }
                if (this.f9426d.m24529c(i4, i5 < 0 ? -i5 : 0)) {
                    m42 m42Var = this.f9431i;
                    dc2 dc2Var = this.f9426d;
                    int i6 = dc2Var.f6920d;
                    String str = this.f9430h;
                    Objects.requireNonNull(str);
                    byte[] copyOf = Arrays.copyOf(dc2Var.f6921e, dc2Var.f6919c);
                    cj5 cj5Var = new cj5(copyOf, copyOf.length);
                    cj5Var.m25321k(i6);
                    cj5Var.m25321k(4);
                    cj5Var.m25323i();
                    cj5Var.m25322j(8);
                    if (cj5Var.m25320l()) {
                        cj5Var.m25322j(4);
                        cj5Var.m25322j(3);
                    }
                    int m25329c = cj5Var.m25329c(4);
                    i = i3;
                    if (m25329c == 15) {
                        int m25329c2 = cj5Var.m25329c(8);
                        int m25329c3 = cj5Var.m25329c(8);
                        if (m25329c3 != 0) {
                            f = m25329c2 / m25329c3;
                            f2 = f;
                        }
                        s95.m10493e("H263Reader", "Invalid aspect ratio");
                        f2 = 1.0f;
                    } else {
                        if (m25329c < 7) {
                            f = f9422l[m25329c];
                            f2 = f;
                        }
                        s95.m10493e("H263Reader", "Invalid aspect ratio");
                        f2 = 1.0f;
                    }
                    if (cj5Var.m25320l()) {
                        cj5Var.m25322j(2);
                        cj5Var.m25322j(1);
                        if (cj5Var.m25320l()) {
                            cj5Var.m25322j(15);
                            cj5Var.m25323i();
                            cj5Var.m25322j(15);
                            cj5Var.m25323i();
                            cj5Var.m25322j(15);
                            cj5Var.m25323i();
                            cj5Var.m25322j(3);
                            cj5Var.m25322j(11);
                            cj5Var.m25323i();
                            cj5Var.m25322j(15);
                            cj5Var.m25323i();
                        }
                    }
                    if (cj5Var.m25329c(2) != 0) {
                        s95.m10493e("H263Reader", "Unhandled video object layer shape");
                    }
                    cj5Var.m25323i();
                    int m25329c4 = cj5Var.m25329c(16);
                    cj5Var.m25323i();
                    if (cj5Var.m25320l()) {
                        if (m25329c4 == 0) {
                            s95.m10493e("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i7 = 0;
                            for (int i8 = m25329c4 - 1; i8 > 0; i8 >>= 1) {
                                i7++;
                            }
                            cj5Var.m25322j(i7);
                        }
                    }
                    cj5Var.m25323i();
                    int m25329c5 = cj5Var.m25329c(13);
                    cj5Var.m25323i();
                    int m25329c6 = cj5Var.m25329c(13);
                    cj5Var.m25323i();
                    cj5Var.m25323i();
                    b72 b72Var = new b72();
                    b72Var.m26384h(str);
                    b72Var.m26372s("video/mp4v-es");
                    b72Var.m26367x(m25329c5);
                    b72Var.m26388f(m25329c6);
                    b72Var.m26375p(f2);
                    b72Var.m26382i(Collections.singletonList(copyOf));
                    m42Var.mo16218f(b72Var.m26366y());
                    this.f9432j = true;
                    this.f9428f.m23608a(m19714h, m19711k, m25632a);
                    pc2 pc2Var = this.f9427e;
                    if (i5 <= 0) {
                        pc2Var.m13456a(m19714h, m19711k, m25632a);
                        i2 = 0;
                    } else {
                        i2 = -i5;
                    }
                    if (this.f9427e.m13453d(i2)) {
                        pc2 pc2Var2 = this.f9427e;
                        int m25631b = c42.m25631b(pc2Var2.f22829d, pc2Var2.f22830e);
                        ik5 ik5Var2 = this.f9424b;
                        int i9 = it5.f13991a;
                        ik5Var2.m19718d(this.f9427e.f22829d, m25631b);
                        this.f9423a.m6156a(this.f9433k, this.f9424b);
                    }
                    if (i4 == 178) {
                        if (ik5Var.m19714h()[m25632a + 2] == 1) {
                            this.f9427e.m13454c(178);
                        }
                        i4 = 178;
                    }
                    int i10 = m19710l - m25632a;
                    this.f9428f.m23607b(this.f9429g - i10, i10, this.f9432j);
                    this.f9428f.m23606c(i4, this.f9433k);
                    m19711k = i;
                }
            }
            i = i3;
            this.f9428f.m23608a(m19714h, m19711k, m25632a);
            pc2 pc2Var3 = this.f9427e;
            if (i5 <= 0) {
            }
            if (this.f9427e.m13453d(i2)) {
            }
            if (i4 == 178) {
            }
            int i102 = m19710l - m25632a;
            this.f9428f.m23607b(this.f9429g - i102, i102, this.f9432j);
            this.f9428f.m23606c(i4, this.f9433k);
            m19711k = i;
        }
        if (!this.f9432j) {
            this.f9426d.m24531a(m19714h, m19711k, m19710l);
        }
        this.f9428f.m23608a(m19714h, m19711k, m19710l);
        this.f9427e.m13456a(m19714h, m19711k, m19710l);
    }

    @Override // com.daaw.ac2
    /* renamed from: b */
    public final void mo2552b(m09 m09Var, td2 td2Var) {
        td2Var.m9282c();
        this.f9430h = td2Var.m9283b();
        m42 mo3292n = m09Var.mo3292n(td2Var.m9284a(), 2);
        this.f9431i = mo3292n;
        this.f9428f = new ec2(mo3292n);
        this.f9423a.m6155b(m09Var, td2Var);
    }

    @Override // com.daaw.ac2
    /* renamed from: c */
    public final void mo2551c(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f9433k = j;
        }
    }

    @Override // com.daaw.ac2
    public final void zzc() {
    }

    @Override // com.daaw.ac2
    public final void zze() {
        c42.m25628e(this.f9425c);
        this.f9426d.m24530b();
        ec2 ec2Var = this.f9428f;
        if (ec2Var != null) {
            ec2Var.m23605d();
        }
        this.f9427e.m13455b();
        this.f9429g = 0L;
        this.f9433k = -9223372036854775807L;
    }
}
