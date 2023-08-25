package com.daaw;

import com.daaw.eo1;
import com.google.android.exoplayer2.Format;
import java.util.Collections;
/* loaded from: classes.dex */
public final class o80 implements InterfaceC3467wv {

    /* renamed from: a */
    public final cb1 f21127a;

    /* renamed from: b */
    public String f21128b;

    /* renamed from: c */
    public sm1 f21129c;

    /* renamed from: d */
    public C2419a f21130d;

    /* renamed from: e */
    public boolean f21131e;

    /* renamed from: l */
    public long f21138l;

    /* renamed from: m */
    public long f21139m;

    /* renamed from: f */
    public final boolean[] f21132f = new boolean[3];

    /* renamed from: g */
    public final rr0 f21133g = new rr0(32, 128);

    /* renamed from: h */
    public final rr0 f21134h = new rr0(33, 128);

    /* renamed from: i */
    public final rr0 f21135i = new rr0(34, 128);

    /* renamed from: j */
    public final rr0 f21136j = new rr0(39, 128);

    /* renamed from: k */
    public final rr0 f21137k = new rr0(40, 128);

    /* renamed from: n */
    public final rv0 f21140n = new rv0();

    /* renamed from: com.daaw.o80$a */
    /* loaded from: classes.dex */
    public static final class C2419a {

        /* renamed from: a */
        public final sm1 f21141a;

        /* renamed from: b */
        public long f21142b;

        /* renamed from: c */
        public boolean f21143c;

        /* renamed from: d */
        public int f21144d;

        /* renamed from: e */
        public long f21145e;

        /* renamed from: f */
        public boolean f21146f;

        /* renamed from: g */
        public boolean f21147g;

        /* renamed from: h */
        public boolean f21148h;

        /* renamed from: i */
        public boolean f21149i;

        /* renamed from: j */
        public boolean f21150j;

        /* renamed from: k */
        public long f21151k;

        /* renamed from: l */
        public long f21152l;

        /* renamed from: m */
        public boolean f21153m;

        public C2419a(sm1 sm1Var) {
            this.f21141a = sm1Var;
        }

        /* renamed from: a */
        public void m14466a(long j, int i) {
            if (this.f21150j && this.f21147g) {
                this.f21153m = this.f21143c;
                this.f21150j = false;
            } else if (this.f21148h || this.f21147g) {
                if (this.f21149i) {
                    m14465b(i + ((int) (j - this.f21142b)));
                }
                this.f21151k = this.f21142b;
                this.f21152l = this.f21145e;
                this.f21149i = true;
                this.f21153m = this.f21143c;
            }
        }

        /* renamed from: b */
        public final void m14465b(int i) {
            boolean z = this.f21153m;
            this.f21141a.mo10159a(this.f21152l, z ? 1 : 0, (int) (this.f21142b - this.f21151k), i, null);
        }

        /* renamed from: c */
        public void m14464c(byte[] bArr, int i, int i2) {
            if (this.f21146f) {
                int i3 = this.f21144d;
                int i4 = (i + 2) - i3;
                if (i4 >= i2) {
                    this.f21144d = i3 + (i2 - i);
                    return;
                }
                this.f21147g = (bArr[i4] & 128) != 0;
                this.f21146f = false;
            }
        }

        /* renamed from: d */
        public void m14463d() {
            this.f21146f = false;
            this.f21147g = false;
            this.f21148h = false;
            this.f21149i = false;
            this.f21150j = false;
        }

        /* renamed from: e */
        public void m14462e(long j, int i, int i2, long j2) {
            boolean z = false;
            this.f21147g = false;
            this.f21148h = false;
            this.f21145e = j2;
            this.f21144d = 0;
            this.f21142b = j;
            if (i2 >= 32) {
                if (!this.f21150j && this.f21149i) {
                    m14465b(i);
                    this.f21149i = false;
                }
                if (i2 <= 34) {
                    this.f21148h = !this.f21150j;
                    this.f21150j = true;
                }
            }
            boolean z2 = i2 >= 16 && i2 <= 21;
            this.f21143c = z2;
            this.f21146f = (z2 || i2 <= 9) ? true : true;
        }
    }

    public o80(cb1 cb1Var) {
        this.f21127a = cb1Var;
    }

    /* renamed from: h */
    public static Format m14470h(String str, rr0 rr0Var, rr0 rr0Var2, rr0 rr0Var3) {
        float f;
        int i = rr0Var.f25535e;
        byte[] bArr = new byte[rr0Var2.f25535e + i + rr0Var3.f25535e];
        System.arraycopy(rr0Var.f25534d, 0, bArr, 0, i);
        System.arraycopy(rr0Var2.f25534d, 0, bArr, rr0Var.f25535e, rr0Var2.f25535e);
        System.arraycopy(rr0Var3.f25534d, 0, bArr, rr0Var.f25535e + rr0Var2.f25535e, rr0Var3.f25535e);
        sv0 sv0Var = new sv0(rr0Var2.f25534d, 0, rr0Var2.f25535e);
        sv0Var.m9825l(44);
        int m9832e = sv0Var.m9832e(3);
        sv0Var.m9826k();
        sv0Var.m9825l(88);
        sv0Var.m9825l(8);
        int i2 = 0;
        for (int i3 = 0; i3 < m9832e; i3++) {
            if (sv0Var.m9833d()) {
                i2 += 89;
            }
            if (sv0Var.m9833d()) {
                i2 += 8;
            }
        }
        sv0Var.m9825l(i2);
        if (m9832e > 0) {
            sv0Var.m9825l((8 - m9832e) * 2);
        }
        sv0Var.m9829h();
        int m9829h = sv0Var.m9829h();
        if (m9829h == 3) {
            sv0Var.m9826k();
        }
        int m9829h2 = sv0Var.m9829h();
        int m9829h3 = sv0Var.m9829h();
        if (sv0Var.m9833d()) {
            int m9829h4 = sv0Var.m9829h();
            int m9829h5 = sv0Var.m9829h();
            int m9829h6 = sv0Var.m9829h();
            int m9829h7 = sv0Var.m9829h();
            m9829h2 -= ((m9829h == 1 || m9829h == 2) ? 2 : 1) * (m9829h4 + m9829h5);
            m9829h3 -= (m9829h == 1 ? 2 : 1) * (m9829h6 + m9829h7);
        }
        int i4 = m9829h2;
        int i5 = m9829h3;
        sv0Var.m9829h();
        sv0Var.m9829h();
        int m9829h8 = sv0Var.m9829h();
        int i6 = sv0Var.m9833d() ? 0 : m9832e;
        while (true) {
            sv0Var.m9829h();
            sv0Var.m9829h();
            sv0Var.m9829h();
            if (i6 > m9832e) {
                break;
            }
            i6++;
        }
        sv0Var.m9829h();
        sv0Var.m9829h();
        sv0Var.m9829h();
        if (sv0Var.m9833d() && sv0Var.m9833d()) {
            m14469i(sv0Var);
        }
        sv0Var.m9825l(2);
        if (sv0Var.m9833d()) {
            sv0Var.m9825l(8);
            sv0Var.m9829h();
            sv0Var.m9829h();
            sv0Var.m9826k();
        }
        m14468j(sv0Var);
        if (sv0Var.m9833d()) {
            for (int i7 = 0; i7 < sv0Var.m9829h(); i7++) {
                sv0Var.m9825l(m9829h8 + 4 + 1);
            }
        }
        sv0Var.m9825l(2);
        float f2 = 1.0f;
        if (sv0Var.m9833d() && sv0Var.m9833d()) {
            int m9832e2 = sv0Var.m9832e(8);
            if (m9832e2 == 255) {
                int m9832e3 = sv0Var.m9832e(16);
                int m9832e4 = sv0Var.m9832e(16);
                if (m9832e3 != 0 && m9832e4 != 0) {
                    f2 = m9832e3 / m9832e4;
                }
                f = f2;
            } else {
                float[] fArr = sr0.f26546b;
                if (m9832e2 < fArr.length) {
                    f = fArr[m9832e2];
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected aspect_ratio_idc value: ");
                    sb.append(m9832e2);
                }
            }
            return Format.m1738H(str, "video/hevc", null, -1, -1, i4, i5, -1.0f, Collections.singletonList(bArr), -1, f, null);
        }
        f = 1.0f;
        return Format.m1738H(str, "video/hevc", null, -1, -1, i4, i5, -1.0f, Collections.singletonList(bArr), -1, f, null);
    }

    /* renamed from: i */
    public static void m14469i(sv0 sv0Var) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (sv0Var.m9833d()) {
                    int min = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        sv0Var.m9830g();
                    }
                    for (int i4 = 0; i4 < min; i4++) {
                        sv0Var.m9830g();
                    }
                } else {
                    sv0Var.m9829h();
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    /* renamed from: j */
    public static void m14468j(sv0 sv0Var) {
        int m9829h = sv0Var.m9829h();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < m9829h; i2++) {
            if (i2 != 0) {
                z = sv0Var.m9833d();
            }
            if (z) {
                sv0Var.m9826k();
                sv0Var.m9829h();
                for (int i3 = 0; i3 <= i; i3++) {
                    if (sv0Var.m9833d()) {
                        sv0Var.m9826k();
                    }
                }
            } else {
                int m9829h2 = sv0Var.m9829h();
                int m9829h3 = sv0Var.m9829h();
                int i4 = m9829h2 + m9829h3;
                for (int i5 = 0; i5 < m9829h2; i5++) {
                    sv0Var.m9829h();
                    sv0Var.m9826k();
                }
                for (int i6 = 0; i6 < m9829h3; i6++) {
                    sv0Var.m9829h();
                    sv0Var.m9826k();
                }
                i = i4;
            }
        }
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: a */
    public void mo1995a(rv0 rv0Var) {
        while (rv0Var.m10919a() > 0) {
            int m10917c = rv0Var.m10917c();
            int m10916d = rv0Var.m10916d();
            byte[] bArr = rv0Var.f25637a;
            this.f21138l += rv0Var.m10919a();
            this.f21129c.mo10157c(rv0Var, rv0Var.m10919a());
            while (m10917c < m10916d) {
                int m9976c = sr0.m9976c(bArr, m10917c, m10916d, this.f21132f);
                if (m9976c == m10916d) {
                    m14471g(bArr, m10917c, m10916d);
                    return;
                }
                int m9974e = sr0.m9974e(bArr, m9976c);
                int i = m9976c - m10917c;
                if (i > 0) {
                    m14471g(bArr, m10917c, m9976c);
                }
                int i2 = m10916d - m9976c;
                long j = this.f21138l - i2;
                m14472f(j, i2, i < 0 ? -i : 0, this.f21139m);
                m14467k(j, i2, m9974e, this.f21139m);
                m10917c = m9976c + 3;
            }
        }
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: b */
    public void mo1994b() {
        sr0.m9978a(this.f21132f);
        this.f21133g.m11052d();
        this.f21134h.m11052d();
        this.f21135i.m11052d();
        this.f21136j.m11052d();
        this.f21137k.m11052d();
        this.f21130d.m14463d();
        this.f21138l = 0L;
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: c */
    public void mo1993c() {
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: d */
    public void mo1992d(d00 d00Var, eo1.C1208d c1208d) {
        c1208d.m23336a();
        this.f21128b = c1208d.m23335b();
        sm1 mo11478a = d00Var.mo11478a(c1208d.m23334c(), 2);
        this.f21129c = mo11478a;
        this.f21130d = new C2419a(mo11478a);
        this.f21127a.m25455b(d00Var, c1208d);
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: e */
    public void mo1991e(long j, boolean z) {
        this.f21139m = j;
    }

    /* renamed from: f */
    public final void m14472f(long j, int i, int i2, long j2) {
        if (this.f21131e) {
            this.f21130d.m14466a(j, i);
        } else {
            this.f21133g.m11054b(i2);
            this.f21134h.m11054b(i2);
            this.f21135i.m11054b(i2);
            if (this.f21133g.m11053c() && this.f21134h.m11053c() && this.f21135i.m11053c()) {
                this.f21129c.mo10156d(m14470h(this.f21128b, this.f21133g, this.f21134h, this.f21135i));
                this.f21131e = true;
            }
        }
        if (this.f21136j.m11054b(i2)) {
            rr0 rr0Var = this.f21136j;
            this.f21140n.m10923H(this.f21136j.f25534d, sr0.m9968k(rr0Var.f25534d, rr0Var.f25535e));
            this.f21140n.m10920K(5);
            this.f21127a.m25456a(j2, this.f21140n);
        }
        if (this.f21137k.m11054b(i2)) {
            rr0 rr0Var2 = this.f21137k;
            this.f21140n.m10923H(this.f21137k.f25534d, sr0.m9968k(rr0Var2.f25534d, rr0Var2.f25535e));
            this.f21140n.m10920K(5);
            this.f21127a.m25456a(j2, this.f21140n);
        }
    }

    /* renamed from: g */
    public final void m14471g(byte[] bArr, int i, int i2) {
        if (this.f21131e) {
            this.f21130d.m14464c(bArr, i, i2);
        } else {
            this.f21133g.m11055a(bArr, i, i2);
            this.f21134h.m11055a(bArr, i, i2);
            this.f21135i.m11055a(bArr, i, i2);
        }
        this.f21136j.m11055a(bArr, i, i2);
        this.f21137k.m11055a(bArr, i, i2);
    }

    /* renamed from: k */
    public final void m14467k(long j, int i, int i2, long j2) {
        if (this.f21131e) {
            this.f21130d.m14462e(j, i, i2, j2);
        } else {
            this.f21133g.m11051e(i2);
            this.f21134h.m11051e(i2);
            this.f21135i.m11051e(i2);
        }
        this.f21136j.m11051e(i2);
        this.f21137k.m11051e(i2);
    }
}
