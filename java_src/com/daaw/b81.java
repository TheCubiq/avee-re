package com.daaw;

import com.daaw.a81;
import com.daaw.sm1;
import com.google.android.exoplayer2.Format;
import java.io.EOFException;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class b81 implements sm1 {

    /* renamed from: a */
    public final InterfaceC2006l2 f4518a;

    /* renamed from: b */
    public final int f4519b;

    /* renamed from: c */
    public final a81 f4520c;

    /* renamed from: d */
    public final a81.C0610a f4521d;

    /* renamed from: e */
    public final rv0 f4522e;

    /* renamed from: f */
    public C0825a f4523f;

    /* renamed from: g */
    public C0825a f4524g;

    /* renamed from: h */
    public C0825a f4525h;

    /* renamed from: i */
    public Format f4526i;

    /* renamed from: j */
    public boolean f4527j;

    /* renamed from: k */
    public Format f4528k;

    /* renamed from: l */
    public long f4529l;

    /* renamed from: m */
    public long f4530m;

    /* renamed from: n */
    public boolean f4531n;

    /* renamed from: o */
    public InterfaceC0826b f4532o;

    /* renamed from: com.daaw.b81$a */
    /* loaded from: classes.dex */
    public static final class C0825a {

        /* renamed from: a */
        public final long f4533a;

        /* renamed from: b */
        public final long f4534b;

        /* renamed from: c */
        public boolean f4535c;

        /* renamed from: d */
        public C1896k2 f4536d;

        /* renamed from: e */
        public C0825a f4537e;

        public C0825a(long j, int i) {
            this.f4533a = j;
            this.f4534b = j + i;
        }

        /* renamed from: a */
        public C0825a m26331a() {
            this.f4536d = null;
            C0825a c0825a = this.f4537e;
            this.f4537e = null;
            return c0825a;
        }

        /* renamed from: b */
        public void m26330b(C1896k2 c1896k2, C0825a c0825a) {
            this.f4536d = c1896k2;
            this.f4537e = c0825a;
            this.f4535c = true;
        }

        /* renamed from: c */
        public int m26329c(long j) {
            return ((int) (j - this.f4533a)) + this.f4536d.f15607b;
        }
    }

    /* renamed from: com.daaw.b81$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0826b {
        /* renamed from: j */
        void mo11473j(Format format);
    }

    public b81(InterfaceC2006l2 interfaceC2006l2) {
        this.f4518a = interfaceC2006l2;
        int mo17197e = interfaceC2006l2.mo17197e();
        this.f4519b = mo17197e;
        this.f4520c = new a81();
        this.f4521d = new a81.C0610a();
        this.f4522e = new rv0(32);
        C0825a c0825a = new C0825a(0L, mo17197e);
        this.f4523f = c0825a;
        this.f4524g = c0825a;
        this.f4525h = c0825a;
    }

    /* renamed from: n */
    public static Format m26344n(Format format, long j) {
        if (format == null) {
            return null;
        }
        if (j != 0) {
            long j2 = format.f35711L;
            return j2 != Long.MAX_VALUE ? format.m1726l(j2 + j) : format;
        }
        return format;
    }

    /* renamed from: A */
    public final void m26363A(long j, byte[] bArr, int i) {
        m26353e(j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (this.f4524g.f4534b - j));
            C0825a c0825a = this.f4524g;
            System.arraycopy(c0825a.f4536d.f15606a, c0825a.m26329c(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            C0825a c0825a2 = this.f4524g;
            if (j == c0825a2.f4534b) {
                this.f4524g = c0825a2.f4537e;
            }
        }
    }

    /* renamed from: B */
    public final void m26362B(C1454gq c1454gq, a81.C0610a c0610a) {
        int i;
        long j = c0610a.f2986b;
        this.f4522e.m10924G(1);
        m26363A(j, this.f4522e.f25637a, 1);
        long j2 = j + 1;
        byte b = this.f4522e.f25637a[0];
        boolean z = (b & 128) != 0;
        int i2 = b & Byte.MAX_VALUE;
        C1845jn c1845jn = c1454gq.f11564q;
        if (c1845jn.f15217a == null) {
            c1845jn.f15217a = new byte[16];
        }
        m26363A(j2, c1845jn.f15217a, i2);
        long j3 = j2 + i2;
        if (z) {
            this.f4522e.m10924G(2);
            m26363A(j3, this.f4522e.f25637a, 2);
            j3 += 2;
            i = this.f4522e.m10927D();
        } else {
            i = 1;
        }
        C1845jn c1845jn2 = c1454gq.f11564q;
        int[] iArr = c1845jn2.f15220d;
        if (iArr == null || iArr.length < i) {
            iArr = new int[i];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = c1845jn2.f15221e;
        if (iArr3 == null || iArr3.length < i) {
            iArr3 = new int[i];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i3 = i * 6;
            this.f4522e.m10924G(i3);
            m26363A(j3, this.f4522e.f25637a, i3);
            j3 += i3;
            this.f4522e.m10921J(0);
            for (int i4 = 0; i4 < i; i4++) {
                iArr2[i4] = this.f4522e.m10927D();
                iArr4[i4] = this.f4522e.m10929B();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = c0610a.f2985a - ((int) (j3 - c0610a.f2986b));
        }
        sm1.C2956a c2956a = c0610a.f2987c;
        C1845jn c1845jn3 = c1454gq.f11564q;
        c1845jn3.m18402c(i, iArr2, iArr4, c2956a.f26413b, c1845jn3.f15217a, c2956a.f26412a, c2956a.f26414c, c2956a.f26415d);
        long j4 = c0610a.f2986b;
        int i5 = (int) (j3 - j4);
        c0610a.f2986b = j4 + i5;
        c0610a.f2985a -= i5;
    }

    /* renamed from: C */
    public void m26361C() {
        m26360D(false);
    }

    /* renamed from: D */
    public void m26360D(boolean z) {
        this.f4520c.m27561x(z);
        m26350h(this.f4523f);
        C0825a c0825a = new C0825a(0L, this.f4519b);
        this.f4523f = c0825a;
        this.f4524g = c0825a;
        this.f4525h = c0825a;
        this.f4530m = 0L;
        this.f4518a.mo17200b();
    }

    /* renamed from: E */
    public void m26359E() {
        this.f4520c.m27560y();
        this.f4524g = this.f4523f;
    }

    /* renamed from: F */
    public boolean m26358F(int i) {
        return this.f4520c.m27559z(i);
    }

    /* renamed from: G */
    public void m26357G(long j) {
        if (this.f4529l != j) {
            this.f4529l = j;
            this.f4527j = true;
        }
    }

    /* renamed from: H */
    public void m26356H(InterfaceC0826b interfaceC0826b) {
        this.f4532o = interfaceC0826b;
    }

    /* renamed from: I */
    public void m26355I(int i) {
        this.f4520c.m27585A(i);
    }

    /* renamed from: J */
    public void m26354J() {
        this.f4531n = true;
    }

    @Override // com.daaw.sm1
    /* renamed from: a */
    public void mo10159a(long j, int i, int i2, int i3, sm1.C2956a c2956a) {
        if (this.f4527j) {
            mo10156d(this.f4528k);
        }
        if (this.f4531n) {
            if ((i & 1) == 0 || !this.f4520c.m27582c(j)) {
                return;
            }
            this.f4531n = false;
        }
        this.f4520c.m27581d(j + this.f4529l, i, (this.f4530m - i2) - i3, i2, c2956a);
    }

    @Override // com.daaw.sm1
    /* renamed from: b */
    public int mo10158b(a00 a00Var, int i, boolean z) {
        int m26334x = m26334x(i);
        C0825a c0825a = this.f4525h;
        int mo5865b = a00Var.mo5865b(c0825a.f4536d.f15606a, c0825a.m26329c(this.f4530m), m26334x);
        if (mo5865b != -1) {
            m26335w(mo5865b);
            return mo5865b;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    @Override // com.daaw.sm1
    /* renamed from: c */
    public void mo10157c(rv0 rv0Var, int i) {
        while (i > 0) {
            int m26334x = m26334x(i);
            C0825a c0825a = this.f4525h;
            rv0Var.m10913g(c0825a.f4536d.f15606a, c0825a.m26329c(this.f4530m), m26334x);
            i -= m26334x;
            m26335w(m26334x);
        }
    }

    @Override // com.daaw.sm1
    /* renamed from: d */
    public void mo10156d(Format format) {
        Format m26344n = m26344n(format, this.f4529l);
        boolean m27573l = this.f4520c.m27573l(m26344n);
        this.f4528k = format;
        this.f4527j = false;
        InterfaceC0826b interfaceC0826b = this.f4532o;
        if (interfaceC0826b == null || !m27573l) {
            return;
        }
        interfaceC0826b.mo11473j(m26344n);
    }

    /* renamed from: e */
    public final void m26353e(long j) {
        while (true) {
            C0825a c0825a = this.f4524g;
            if (j < c0825a.f4534b) {
                return;
            }
            this.f4524g = c0825a.f4537e;
        }
    }

    /* renamed from: f */
    public int m26352f(long j, boolean z, boolean z2) {
        return this.f4520c.m27584a(j, z, z2);
    }

    /* renamed from: g */
    public int m26351g() {
        return this.f4520c.m27583b();
    }

    /* renamed from: h */
    public final void m26350h(C0825a c0825a) {
        if (c0825a.f4535c) {
            C0825a c0825a2 = this.f4525h;
            int i = (c0825a2.f4535c ? 1 : 0) + (((int) (c0825a2.f4533a - c0825a.f4533a)) / this.f4519b);
            C1896k2[] c1896k2Arr = new C1896k2[i];
            for (int i2 = 0; i2 < i; i2++) {
                c1896k2Arr[i2] = c0825a.f4536d;
                c0825a = c0825a.m26331a();
            }
            this.f4518a.mo17198d(c1896k2Arr);
        }
    }

    /* renamed from: i */
    public final void m26349i(long j) {
        C0825a c0825a;
        if (j == -1) {
            return;
        }
        while (true) {
            c0825a = this.f4523f;
            if (j < c0825a.f4534b) {
                break;
            }
            this.f4518a.mo17199c(c0825a.f4536d);
            this.f4523f = this.f4523f.m26331a();
        }
        if (this.f4524g.f4533a < c0825a.f4533a) {
            this.f4524g = c0825a;
        }
    }

    /* renamed from: j */
    public void m26348j(long j, boolean z, boolean z2) {
        m26349i(this.f4520c.m27578g(j, z, z2));
    }

    /* renamed from: k */
    public void m26347k() {
        m26349i(this.f4520c.m27577h());
    }

    /* renamed from: l */
    public void m26346l() {
        m26349i(this.f4520c.m27576i());
    }

    /* renamed from: m */
    public void m26345m(int i) {
        long m27575j = this.f4520c.m27575j(i);
        this.f4530m = m27575j;
        if (m27575j != 0) {
            C0825a c0825a = this.f4523f;
            if (m27575j != c0825a.f4533a) {
                while (this.f4530m > c0825a.f4534b) {
                    c0825a = c0825a.f4537e;
                }
                C0825a c0825a2 = c0825a.f4537e;
                m26350h(c0825a2);
                C0825a c0825a3 = new C0825a(c0825a.f4534b, this.f4519b);
                c0825a.f4537e = c0825a3;
                if (this.f4530m == c0825a.f4534b) {
                    c0825a = c0825a3;
                }
                this.f4525h = c0825a;
                if (this.f4524g == c0825a2) {
                    this.f4524g = c0825a3;
                    return;
                }
                return;
            }
        }
        m26350h(this.f4523f);
        C0825a c0825a4 = new C0825a(this.f4530m, this.f4519b);
        this.f4523f = c0825a4;
        this.f4524g = c0825a4;
        this.f4525h = c0825a4;
    }

    /* renamed from: o */
    public int m26343o() {
        return this.f4520c.m27572m();
    }

    /* renamed from: p */
    public long m26342p() {
        return this.f4520c.m27571n();
    }

    /* renamed from: q */
    public long m26341q() {
        return this.f4520c.m27570o();
    }

    /* renamed from: r */
    public int m26340r() {
        return this.f4520c.m27568q();
    }

    /* renamed from: s */
    public Format m26339s() {
        return this.f4520c.m27566s();
    }

    /* renamed from: t */
    public int m26338t() {
        return this.f4520c.m27565t();
    }

    /* renamed from: u */
    public boolean m26337u() {
        return this.f4520c.m27564u();
    }

    /* renamed from: v */
    public int m26336v() {
        return this.f4520c.m27563v();
    }

    /* renamed from: w */
    public final void m26335w(int i) {
        long j = this.f4530m + i;
        this.f4530m = j;
        C0825a c0825a = this.f4525h;
        if (j == c0825a.f4534b) {
            this.f4525h = c0825a.f4537e;
        }
    }

    /* renamed from: x */
    public final int m26334x(int i) {
        C0825a c0825a = this.f4525h;
        if (!c0825a.f4535c) {
            c0825a.m26330b(this.f4518a.mo17201a(), new C0825a(this.f4525h.f4534b, this.f4519b));
        }
        return Math.min(i, (int) (this.f4525h.f4534b - this.f4530m));
    }

    /* renamed from: y */
    public int m26333y(k30 k30Var, C1454gq c1454gq, boolean z, boolean z2, long j) {
        int m27562w = this.f4520c.m27562w(k30Var, c1454gq, z, z2, this.f4526i, this.f4521d);
        if (m27562w == -5) {
            this.f4526i = k30Var.f15633a;
            return -5;
        } else if (m27562w != -4) {
            if (m27562w == -3) {
                return -3;
            }
            throw new IllegalStateException();
        } else {
            if (!c1454gq.m11437j()) {
                if (c1454gq.f11566s < j) {
                    c1454gq.m11441e(Integer.MIN_VALUE);
                }
                if (c1454gq.m21349p()) {
                    m26362B(c1454gq, this.f4521d);
                }
                c1454gq.m21351n(this.f4521d.f2985a);
                a81.C0610a c0610a = this.f4521d;
                m26332z(c0610a.f2986b, c1454gq.f11565r, c0610a.f2985a);
            }
            return -4;
        }
    }

    /* renamed from: z */
    public final void m26332z(long j, ByteBuffer byteBuffer, int i) {
        m26353e(j);
        while (i > 0) {
            int min = Math.min(i, (int) (this.f4524g.f4534b - j));
            C0825a c0825a = this.f4524g;
            byteBuffer.put(c0825a.f4536d.f15606a, c0825a.m26329c(j), min);
            i -= min;
            j += min;
            C0825a c0825a2 = this.f4524g;
            if (j == c0825a2.f4534b) {
                this.f4524g = c0825a2.f4537e;
            }
        }
    }
}
