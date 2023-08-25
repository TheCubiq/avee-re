package com.daaw;

import com.daaw.InterfaceC1826jf;
import com.daaw.cp0;
import com.daaw.gb1;
import com.daaw.jk0;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.daaw.if */
/* loaded from: classes.dex */
public class C1697if<T extends InterfaceC1826jf> implements d81, gb1, jk0.InterfaceC1834a<AbstractC1180ef>, jk0.InterfaceC1837d {

    /* renamed from: A */
    public final List<AbstractC2928sa> f13586A;

    /* renamed from: B */
    public final b81 f13587B;

    /* renamed from: C */
    public final b81[] f13588C;

    /* renamed from: D */
    public final C3029ta f13589D;

    /* renamed from: E */
    public Format f13590E;

    /* renamed from: F */
    public InterfaceC1699b<T> f13591F;

    /* renamed from: G */
    public long f13592G;

    /* renamed from: H */
    public long f13593H;

    /* renamed from: I */
    public long f13594I;

    /* renamed from: J */
    public boolean f13595J;

    /* renamed from: p */
    public final int f13596p;

    /* renamed from: q */
    public final int[] f13597q;

    /* renamed from: r */
    public final Format[] f13598r;

    /* renamed from: s */
    public final boolean[] f13599s;

    /* renamed from: t */
    public final T f13600t;

    /* renamed from: u */
    public final gb1.InterfaceC1390a<C1697if<T>> f13601u;

    /* renamed from: v */
    public final cp0.C0975a f13602v;

    /* renamed from: w */
    public final int f13603w;

    /* renamed from: x */
    public final jk0 f13604x = new jk0("Loader:ChunkSampleStream");

    /* renamed from: y */
    public final C1397gf f13605y = new C1397gf();

    /* renamed from: z */
    public final ArrayList<AbstractC2928sa> f13606z;

    /* renamed from: com.daaw.if$a */
    /* loaded from: classes.dex */
    public final class C1698a implements d81 {

        /* renamed from: p */
        public final C1697if<T> f13607p;

        /* renamed from: q */
        public final b81 f13608q;

        /* renamed from: r */
        public final int f13609r;

        /* renamed from: s */
        public boolean f13610s;

        public C1698a(C1697if<T> c1697if, b81 b81Var, int i) {
            this.f13607p = c1697if;
            this.f13608q = b81Var;
            this.f13609r = i;
        }

        @Override // com.daaw.d81
        /* renamed from: a */
        public void mo3789a() {
        }

        /* renamed from: b */
        public final void m19854b() {
            if (this.f13610s) {
                return;
            }
            C1697if.this.f13602v.m25165c(C1697if.this.f13597q[this.f13609r], C1697if.this.f13598r[this.f13609r], 0, null, C1697if.this.f13593H);
            this.f13610s = true;
        }

        /* renamed from: c */
        public void m19853c() {
            C2914s6.m10685f(C1697if.this.f13599s[this.f13609r]);
            C1697if.this.f13599s[this.f13609r] = false;
        }

        @Override // com.daaw.d81
        /* renamed from: d */
        public boolean mo3787d() {
            C1697if c1697if = C1697if.this;
            return c1697if.f13595J || (!c1697if.m19873F() && this.f13608q.m26337u());
        }

        @Override // com.daaw.d81
        /* renamed from: j */
        public int mo3786j(k30 k30Var, C1454gq c1454gq, boolean z) {
            if (C1697if.this.m19873F()) {
                return -3;
            }
            b81 b81Var = this.f13608q;
            C1697if c1697if = C1697if.this;
            int m26333y = b81Var.m26333y(k30Var, c1454gq, z, c1697if.f13595J, c1697if.f13594I);
            if (m26333y == -4) {
                m19854b();
            }
            return m26333y;
        }

        @Override // com.daaw.d81
        /* renamed from: n */
        public int mo3785n(long j) {
            int m26352f;
            if (!C1697if.this.f13595J || j <= this.f13608q.m26341q()) {
                m26352f = this.f13608q.m26352f(j, true, true);
                if (m26352f == -1) {
                    m26352f = 0;
                }
            } else {
                m26352f = this.f13608q.m26351g();
            }
            if (m26352f > 0) {
                m19854b();
            }
            return m26352f;
        }
    }

    /* renamed from: com.daaw.if$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1699b<T extends InterfaceC1826jf> {
        /* renamed from: d */
        void mo2085d(C1697if<T> c1697if);
    }

    public C1697if(int i, int[] iArr, Format[] formatArr, T t, gb1.InterfaceC1390a<C1697if<T>> interfaceC1390a, InterfaceC2006l2 interfaceC2006l2, long j, int i2, cp0.C0975a c0975a) {
        this.f13596p = i;
        this.f13597q = iArr;
        this.f13598r = formatArr;
        this.f13600t = t;
        this.f13601u = interfaceC1390a;
        this.f13602v = c0975a;
        this.f13603w = i2;
        ArrayList<AbstractC2928sa> arrayList = new ArrayList<>();
        this.f13606z = arrayList;
        this.f13586A = Collections.unmodifiableList(arrayList);
        int i3 = 0;
        int length = iArr == null ? 0 : iArr.length;
        this.f13588C = new b81[length];
        this.f13599s = new boolean[length];
        int i4 = length + 1;
        int[] iArr2 = new int[i4];
        b81[] b81VarArr = new b81[i4];
        b81 b81Var = new b81(interfaceC2006l2);
        this.f13587B = b81Var;
        iArr2[0] = i;
        b81VarArr[0] = b81Var;
        while (i3 < length) {
            b81 b81Var2 = new b81(interfaceC2006l2);
            this.f13588C[i3] = b81Var2;
            int i5 = i3 + 1;
            b81VarArr[i5] = b81Var2;
            iArr2[i5] = iArr[i3];
            i3 = i5;
        }
        this.f13589D = new C3029ta(iArr2, b81VarArr);
        this.f13592G = j;
        this.f13593H = j;
    }

    /* renamed from: A */
    public final AbstractC2928sa m19878A(int i) {
        AbstractC2928sa abstractC2928sa = this.f13606z.get(i);
        ArrayList<AbstractC2928sa> arrayList = this.f13606z;
        sq1.m10027R(arrayList, i, arrayList.size());
        b81 b81Var = this.f13587B;
        int i2 = 0;
        while (true) {
            b81Var.m26345m(abstractC2928sa.m10484g(i2));
            b81[] b81VarArr = this.f13588C;
            if (i2 >= b81VarArr.length) {
                return abstractC2928sa;
            }
            b81Var = b81VarArr[i2];
            i2++;
        }
    }

    /* renamed from: B */
    public T m19877B() {
        return this.f13600t;
    }

    /* renamed from: C */
    public final AbstractC2928sa m19876C() {
        ArrayList<AbstractC2928sa> arrayList = this.f13606z;
        return arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: D */
    public final boolean m19875D(int i) {
        int m26340r;
        AbstractC2928sa abstractC2928sa = this.f13606z.get(i);
        if (this.f13587B.m26340r() > abstractC2928sa.m10484g(0)) {
            return true;
        }
        int i2 = 0;
        do {
            b81[] b81VarArr = this.f13588C;
            if (i2 >= b81VarArr.length) {
                return false;
            }
            m26340r = b81VarArr[i2].m26340r();
            i2++;
        } while (m26340r <= abstractC2928sa.m10484g(i2));
        return true;
    }

    /* renamed from: E */
    public final boolean m19874E(AbstractC1180ef abstractC1180ef) {
        return abstractC1180ef instanceof AbstractC2928sa;
    }

    /* renamed from: F */
    public boolean m19873F() {
        return this.f13592G != -9223372036854775807L;
    }

    /* renamed from: G */
    public final void m19872G(int i) {
        AbstractC2928sa abstractC2928sa = this.f13606z.get(i);
        Format format = abstractC2928sa.f8430c;
        if (!format.equals(this.f13590E)) {
            this.f13602v.m25165c(this.f13596p, format, abstractC2928sa.f8431d, abstractC2928sa.f8432e, abstractC2928sa.f8433f);
        }
        this.f13590E = format;
    }

    /* renamed from: H */
    public final void m19871H(int i, int i2) {
        int m19867L = m19867L(i - i2, 0);
        int m19867L2 = i2 == 1 ? m19867L : m19867L(i - 1, m19867L);
        while (m19867L <= m19867L2) {
            m19872G(m19867L);
            m19867L++;
        }
    }

    @Override // com.daaw.jk0.InterfaceC1834a
    /* renamed from: I */
    public void mo11472k(AbstractC1180ef abstractC1180ef, long j, long j2, boolean z) {
        this.f13602v.m25163e(abstractC1180ef.f8428a, abstractC1180ef.f8429b, this.f13596p, abstractC1180ef.f8430c, abstractC1180ef.f8431d, abstractC1180ef.f8432e, abstractC1180ef.f8433f, abstractC1180ef.f8434g, j, j2, abstractC1180ef.mo8279c());
        if (z) {
            return;
        }
        this.f13587B.m26361C();
        for (b81 b81Var : this.f13588C) {
            b81Var.m26361C();
        }
        this.f13601u.mo2077n(this);
    }

    @Override // com.daaw.jk0.InterfaceC1834a
    /* renamed from: J */
    public void mo11469o(AbstractC1180ef abstractC1180ef, long j, long j2) {
        this.f13600t.mo3394f(abstractC1180ef);
        this.f13602v.m25160h(abstractC1180ef.f8428a, abstractC1180ef.f8429b, this.f13596p, abstractC1180ef.f8430c, abstractC1180ef.f8431d, abstractC1180ef.f8432e, abstractC1180ef.f8433f, abstractC1180ef.f8434g, j, j2, abstractC1180ef.mo8279c());
        this.f13601u.mo2077n(this);
    }

    @Override // com.daaw.jk0.InterfaceC1834a
    /* renamed from: K */
    public int mo11468r(AbstractC1180ef abstractC1180ef, long j, long j2, IOException iOException) {
        boolean z;
        long mo8279c = abstractC1180ef.mo8279c();
        boolean m19874E = m19874E(abstractC1180ef);
        int size = this.f13606z.size() - 1;
        boolean z2 = (mo8279c != 0 && m19874E && m19875D(size)) ? false : true;
        if (this.f13600t.mo3393g(abstractC1180ef, z2, iOException) && z2) {
            if (m19874E) {
                C2914s6.m10685f(m19878A(size) == abstractC1180ef);
                if (this.f13606z.isEmpty()) {
                    this.f13592G = this.f13593H;
                }
            }
            z = true;
        } else {
            z = false;
        }
        this.f13602v.m25157k(abstractC1180ef.f8428a, abstractC1180ef.f8429b, this.f13596p, abstractC1180ef.f8430c, abstractC1180ef.f8431d, abstractC1180ef.f8432e, abstractC1180ef.f8433f, abstractC1180ef.f8434g, j, j2, mo8279c, iOException, z);
        if (z) {
            this.f13601u.mo2077n(this);
            return 2;
        }
        return 0;
    }

    /* renamed from: L */
    public final int m19867L(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.f13606z.size()) {
                return this.f13606z.size() - 1;
            }
        } while (this.f13606z.get(i2).m10484g(0) <= i);
        return i2 - 1;
    }

    /* renamed from: M */
    public void m19866M() {
        m19865N(null);
    }

    /* renamed from: N */
    public void m19865N(InterfaceC1699b<T> interfaceC1699b) {
        this.f13591F = interfaceC1699b;
        this.f13587B.m26347k();
        for (b81 b81Var : this.f13588C) {
            b81Var.m26347k();
        }
        this.f13604x.m18462j(this);
    }

    /* renamed from: O */
    public void m19864O(long j) {
        boolean z;
        long j2;
        b81[] b81VarArr;
        this.f13593H = j;
        this.f13587B.m26359E();
        if (m19873F()) {
            z = false;
        } else {
            AbstractC2928sa abstractC2928sa = null;
            int i = 0;
            while (true) {
                if (i >= this.f13606z.size()) {
                    break;
                }
                AbstractC2928sa abstractC2928sa2 = this.f13606z.get(i);
                long j3 = abstractC2928sa2.f8433f;
                if (j3 == j && abstractC2928sa2.f26039j == -9223372036854775807L) {
                    abstractC2928sa = abstractC2928sa2;
                    break;
                } else if (j3 > j) {
                    break;
                } else {
                    i++;
                }
            }
            if (abstractC2928sa != null) {
                z = this.f13587B.m26358F(abstractC2928sa.m10484g(0));
                j2 = Long.MIN_VALUE;
            } else {
                z = this.f13587B.m26352f(j, true, (j > mo2087b() ? 1 : (j == mo2087b() ? 0 : -1)) < 0) != -1;
                j2 = this.f13593H;
            }
            this.f13594I = j2;
        }
        if (z) {
            for (b81 b81Var : this.f13588C) {
                b81Var.m26359E();
                b81Var.m26352f(j, true, false);
            }
            return;
        }
        this.f13592G = j;
        this.f13595J = false;
        this.f13606z.clear();
        if (this.f13604x.m18465g()) {
            this.f13604x.m18466f();
            return;
        }
        this.f13587B.m26361C();
        for (b81 b81Var2 : this.f13588C) {
            b81Var2.m26361C();
        }
    }

    /* renamed from: P */
    public C1697if<T>.C1698a m19863P(long j, int i) {
        for (int i2 = 0; i2 < this.f13588C.length; i2++) {
            if (this.f13597q[i2] == i) {
                C2914s6.m10685f(!this.f13599s[i2]);
                this.f13599s[i2] = true;
                this.f13588C[i2].m26359E();
                this.f13588C[i2].m26352f(j, true, true);
                return new C1698a(this, this.f13588C[i2], i2);
            }
        }
        throw new IllegalStateException();
    }

    @Override // com.daaw.d81
    /* renamed from: a */
    public void mo3789a() {
        this.f13604x.mo16893a();
        if (this.f13604x.m18465g()) {
            return;
        }
        this.f13600t.mo3398a();
    }

    @Override // com.daaw.gb1
    /* renamed from: b */
    public long mo2087b() {
        if (m19873F()) {
            return this.f13592G;
        }
        if (this.f13595J) {
            return Long.MIN_VALUE;
        }
        return m19876C().f8434g;
    }

    @Override // com.daaw.gb1
    /* renamed from: c */
    public boolean mo2086c(long j) {
        AbstractC2928sa m19876C;
        long j2;
        if (this.f13595J || this.f13604x.m18465g()) {
            return false;
        }
        boolean m19873F = m19873F();
        if (m19873F) {
            m19876C = null;
            j2 = this.f13592G;
        } else {
            m19876C = m19876C();
            j2 = m19876C.f8434g;
        }
        this.f13600t.mo3391i(m19876C, j, j2, this.f13605y);
        C1397gf c1397gf = this.f13605y;
        boolean z = c1397gf.f11132b;
        AbstractC1180ef abstractC1180ef = c1397gf.f11131a;
        c1397gf.m21730a();
        if (z) {
            this.f13592G = -9223372036854775807L;
            this.f13595J = true;
            return true;
        } else if (abstractC1180ef == null) {
            return false;
        } else {
            if (m19874E(abstractC1180ef)) {
                AbstractC2928sa abstractC2928sa = (AbstractC2928sa) abstractC1180ef;
                if (m19873F) {
                    long j3 = abstractC2928sa.f8433f;
                    long j4 = this.f13592G;
                    if (j3 == j4) {
                        j4 = Long.MIN_VALUE;
                    }
                    this.f13594I = j4;
                    this.f13592G = -9223372036854775807L;
                }
                abstractC2928sa.m10482i(this.f13589D);
                this.f13606z.add(abstractC2928sa);
            }
            this.f13602v.m25154n(abstractC1180ef.f8428a, abstractC1180ef.f8429b, this.f13596p, abstractC1180ef.f8430c, abstractC1180ef.f8431d, abstractC1180ef.f8432e, abstractC1180ef.f8433f, abstractC1180ef.f8434g, this.f13604x.m18461k(abstractC1180ef, this, this.f13603w));
            return true;
        }
    }

    @Override // com.daaw.d81
    /* renamed from: d */
    public boolean mo3787d() {
        return this.f13595J || (!m19873F() && this.f13587B.m26337u());
    }

    /* renamed from: e */
    public long m19862e(long j, ea1 ea1Var) {
        return this.f13600t.mo3395e(j, ea1Var);
    }

    @Override // com.daaw.gb1
    /* renamed from: f */
    public long mo2083f() {
        if (this.f13595J) {
            return Long.MIN_VALUE;
        }
        if (m19873F()) {
            return this.f13592G;
        }
        long j = this.f13593H;
        AbstractC2928sa m19876C = m19876C();
        if (!m19876C.mo2103f()) {
            if (this.f13606z.size() > 1) {
                ArrayList<AbstractC2928sa> arrayList = this.f13606z;
                m19876C = arrayList.get(arrayList.size() - 2);
            } else {
                m19876C = null;
            }
        }
        if (m19876C != null) {
            j = Math.max(j, m19876C.f8434g);
        }
        return Math.max(j, this.f13587B.m26341q());
    }

    @Override // com.daaw.gb1
    /* renamed from: g */
    public void mo2082g(long j) {
        int size;
        int mo3392h;
        if (this.f13604x.m18465g() || m19873F() || (size = this.f13606z.size()) <= (mo3392h = this.f13600t.mo3392h(j, this.f13586A))) {
            return;
        }
        while (true) {
            if (mo3392h >= size) {
                mo3392h = size;
                break;
            } else if (!m19875D(mo3392h)) {
                break;
            } else {
                mo3392h++;
            }
        }
        if (mo3392h == size) {
            return;
        }
        long j2 = m19876C().f8434g;
        AbstractC2928sa m19878A = m19878A(mo3392h);
        if (this.f13606z.isEmpty()) {
            this.f13592G = this.f13593H;
        }
        this.f13595J = false;
        this.f13602v.m25146v(this.f13596p, m19878A.f8433f, j2);
    }

    @Override // com.daaw.jk0.InterfaceC1837d
    /* renamed from: h */
    public void mo11474h() {
        this.f13587B.m26361C();
        for (b81 b81Var : this.f13588C) {
            b81Var.m26361C();
        }
        InterfaceC1699b<T> interfaceC1699b = this.f13591F;
        if (interfaceC1699b != null) {
            interfaceC1699b.mo2085d(this);
        }
    }

    @Override // com.daaw.d81
    /* renamed from: j */
    public int mo3786j(k30 k30Var, C1454gq c1454gq, boolean z) {
        if (m19873F()) {
            return -3;
        }
        int m26333y = this.f13587B.m26333y(k30Var, c1454gq, z, this.f13595J, this.f13594I);
        if (m26333y == -4) {
            m19871H(this.f13587B.m26340r(), 1);
        }
        return m26333y;
    }

    @Override // com.daaw.d81
    /* renamed from: n */
    public int mo3785n(long j) {
        int i = 0;
        if (m19873F()) {
            return 0;
        }
        if (!this.f13595J || j <= this.f13587B.m26341q()) {
            int m26352f = this.f13587B.m26352f(j, true, true);
            if (m26352f != -1) {
                i = m26352f;
            }
        } else {
            i = this.f13587B.m26351g();
        }
        if (i > 0) {
            m19871H(this.f13587B.m26340r(), i);
        }
        return i;
    }

    /* renamed from: t */
    public void m19861t(long j, boolean z) {
        int m26343o = this.f13587B.m26343o();
        this.f13587B.m26348j(j, z, true);
        int m26343o2 = this.f13587B.m26343o();
        if (m26343o2 <= m26343o) {
            return;
        }
        long m26342p = this.f13587B.m26342p();
        int i = 0;
        while (true) {
            b81[] b81VarArr = this.f13588C;
            if (i >= b81VarArr.length) {
                m19855z(m26343o2);
                return;
            } else {
                b81VarArr[i].m26348j(m26342p, z, this.f13599s[i]);
                i++;
            }
        }
    }

    /* renamed from: z */
    public final void m19855z(int i) {
        int m19867L = m19867L(i, 0);
        if (m19867L > 0) {
            sq1.m10027R(this.f13606z, 0, m19867L);
        }
    }
}
