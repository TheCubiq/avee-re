package com.daaw;

import android.util.SparseArray;
import com.daaw.sm1;
import com.google.android.exoplayer2.Format;
/* renamed from: com.daaw.ff */
/* loaded from: classes.dex */
public final class C1275ff implements d00 {

    /* renamed from: p */
    public final InterfaceC3919zz f9519p;

    /* renamed from: q */
    public final int f9520q;

    /* renamed from: r */
    public final Format f9521r;

    /* renamed from: s */
    public final SparseArray<C1276a> f9522s = new SparseArray<>();

    /* renamed from: t */
    public boolean f9523t;

    /* renamed from: u */
    public InterfaceC1277b f9524u;

    /* renamed from: v */
    public da1 f9525v;

    /* renamed from: w */
    public Format[] f9526w;

    /* renamed from: com.daaw.ff$a */
    /* loaded from: classes.dex */
    public static final class C1276a implements sm1 {

        /* renamed from: a */
        public final int f9527a;

        /* renamed from: b */
        public final int f9528b;

        /* renamed from: c */
        public final Format f9529c;

        /* renamed from: d */
        public Format f9530d;

        /* renamed from: e */
        public sm1 f9531e;

        public C1276a(int i, int i2, Format format) {
            this.f9527a = i;
            this.f9528b = i2;
            this.f9529c = format;
        }

        @Override // com.daaw.sm1
        /* renamed from: a */
        public void mo10159a(long j, int i, int i2, int i3, sm1.C2956a c2956a) {
            this.f9531e.mo10159a(j, i, i2, i3, c2956a);
        }

        @Override // com.daaw.sm1
        /* renamed from: b */
        public int mo10158b(a00 a00Var, int i, boolean z) {
            return this.f9531e.mo10158b(a00Var, i, z);
        }

        @Override // com.daaw.sm1
        /* renamed from: c */
        public void mo10157c(rv0 rv0Var, int i) {
            this.f9531e.mo10157c(rv0Var, i);
        }

        @Override // com.daaw.sm1
        /* renamed from: d */
        public void mo10156d(Format format) {
            Format format2 = this.f9529c;
            if (format2 != null) {
                format = format.m1729g(format2);
            }
            this.f9530d = format;
            this.f9531e.mo10156d(format);
        }

        /* renamed from: e */
        public void m22696e(InterfaceC1277b interfaceC1277b) {
            if (interfaceC1277b == null) {
                this.f9531e = new C1220ev();
                return;
            }
            sm1 mo9419a = interfaceC1277b.mo9419a(this.f9527a, this.f9528b);
            this.f9531e = mo9419a;
            Format format = this.f9530d;
            if (format != null) {
                mo9419a.mo10156d(format);
            }
        }
    }

    /* renamed from: com.daaw.ff$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1277b {
        /* renamed from: a */
        sm1 mo9419a(int i, int i2);
    }

    public C1275ff(InterfaceC3919zz interfaceC3919zz, int i, Format format) {
        this.f9519p = interfaceC3919zz;
        this.f9520q = i;
        this.f9521r = format;
    }

    @Override // com.daaw.d00
    /* renamed from: a */
    public sm1 mo11478a(int i, int i2) {
        C1276a c1276a = this.f9522s.get(i);
        if (c1276a == null) {
            C2914s6.m10685f(this.f9526w == null);
            c1276a = new C1276a(i, i2, i2 == this.f9520q ? this.f9521r : null);
            c1276a.m22696e(this.f9524u);
            this.f9522s.put(i, c1276a);
        }
        return c1276a;
    }

    /* renamed from: b */
    public Format[] m22699b() {
        return this.f9526w;
    }

    /* renamed from: c */
    public da1 m22698c() {
        return this.f9525v;
    }

    @Override // com.daaw.d00
    /* renamed from: d */
    public void mo11475d(da1 da1Var) {
        this.f9525v = da1Var;
    }

    /* renamed from: e */
    public void m22697e(InterfaceC1277b interfaceC1277b, long j) {
        this.f9524u = interfaceC1277b;
        if (!this.f9523t) {
            this.f9519p.mo1758i(this);
            if (j != -9223372036854775807L) {
                this.f9519p.mo1759f(0L, j);
            }
            this.f9523t = true;
            return;
        }
        InterfaceC3919zz interfaceC3919zz = this.f9519p;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        interfaceC3919zz.mo1759f(0L, j);
        for (int i = 0; i < this.f9522s.size(); i++) {
            this.f9522s.valueAt(i).m22696e(interfaceC1277b);
        }
    }

    @Override // com.daaw.d00
    /* renamed from: n */
    public void mo11470n() {
        Format[] formatArr = new Format[this.f9522s.size()];
        for (int i = 0; i < this.f9522s.size(); i++) {
            formatArr[i] = this.f9522s.valueAt(i).f9530d;
        }
        this.f9526w = formatArr;
    }
}
