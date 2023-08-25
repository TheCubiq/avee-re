package com.daaw;

import android.util.SparseArray;
import com.daaw.da1;
import com.daaw.eo1;
/* loaded from: classes.dex */
public final class c01 implements InterfaceC3919zz {

    /* renamed from: h */
    public static final e00 f5326h = new C0906a();

    /* renamed from: a */
    public final ol1 f5327a;

    /* renamed from: b */
    public final SparseArray<C0907b> f5328b;

    /* renamed from: c */
    public final rv0 f5329c;

    /* renamed from: d */
    public boolean f5330d;

    /* renamed from: e */
    public boolean f5331e;

    /* renamed from: f */
    public boolean f5332f;

    /* renamed from: g */
    public d00 f5333g;

    /* renamed from: com.daaw.c01$a */
    /* loaded from: classes.dex */
    public static class C0906a implements e00 {
        @Override // com.daaw.e00
        /* renamed from: a */
        public InterfaceC3919zz[] mo4824a() {
            return new InterfaceC3919zz[]{new c01()};
        }
    }

    /* renamed from: com.daaw.c01$b */
    /* loaded from: classes.dex */
    public static final class C0907b {

        /* renamed from: a */
        public final InterfaceC3467wv f5334a;

        /* renamed from: b */
        public final ol1 f5335b;

        /* renamed from: c */
        public final qv0 f5336c = new qv0(new byte[64]);

        /* renamed from: d */
        public boolean f5337d;

        /* renamed from: e */
        public boolean f5338e;

        /* renamed from: f */
        public boolean f5339f;

        /* renamed from: g */
        public int f5340g;

        /* renamed from: h */
        public long f5341h;

        public C0907b(InterfaceC3467wv interfaceC3467wv, ol1 ol1Var) {
            this.f5334a = interfaceC3467wv;
            this.f5335b = ol1Var;
        }

        /* renamed from: a */
        public void m25701a(rv0 rv0Var) {
            rv0Var.m10913g(this.f5336c.f24432a, 0, 3);
            this.f5336c.m12120m(0);
            m25700b();
            rv0Var.m10913g(this.f5336c.f24432a, 0, this.f5340g);
            this.f5336c.m12120m(0);
            m25699c();
            this.f5334a.mo1991e(this.f5341h, true);
            this.f5334a.mo1995a(rv0Var);
            this.f5334a.mo1993c();
        }

        /* renamed from: b */
        public final void m25700b() {
            this.f5336c.m12118o(8);
            this.f5337d = this.f5336c.m12126g();
            this.f5338e = this.f5336c.m12126g();
            this.f5336c.m12118o(6);
            this.f5340g = this.f5336c.m12125h(8);
        }

        /* renamed from: c */
        public final void m25699c() {
            this.f5341h = 0L;
            if (this.f5337d) {
                this.f5336c.m12118o(4);
                this.f5336c.m12118o(1);
                this.f5336c.m12118o(1);
                long m12125h = (this.f5336c.m12125h(3) << 30) | (this.f5336c.m12125h(15) << 15) | this.f5336c.m12125h(15);
                this.f5336c.m12118o(1);
                if (!this.f5339f && this.f5338e) {
                    this.f5336c.m12118o(4);
                    this.f5336c.m12118o(1);
                    this.f5336c.m12118o(1);
                    this.f5336c.m12118o(1);
                    this.f5335b.m14187b((this.f5336c.m12125h(3) << 30) | (this.f5336c.m12125h(15) << 15) | this.f5336c.m12125h(15));
                    this.f5339f = true;
                }
                this.f5341h = this.f5335b.m14187b(m12125h);
            }
        }

        /* renamed from: d */
        public void m25698d() {
            this.f5339f = false;
            this.f5334a.mo1994b();
        }
    }

    public c01() {
        this(new ol1(0L));
    }

    public c01(ol1 ol1Var) {
        this.f5327a = ol1Var;
        this.f5329c = new rv0(4096);
        this.f5328b = new SparseArray<>();
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: a */
    public void mo1762a() {
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: c */
    public boolean mo1761c(a00 a00Var) {
        byte[] bArr = new byte[14];
        a00Var.mo5856k(bArr, 0, 14);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            a00Var.mo5860g(bArr[13] & 7);
            a00Var.mo5856k(bArr, 0, 3);
            return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo1760d(a00 a00Var, iy0 iy0Var) {
        int m10927D;
        if (a00Var.mo5863d(this.f5329c.f25637a, 0, 4, true)) {
            this.f5329c.m10921J(0);
            int m10911i = this.f5329c.m10911i();
            if (m10911i == 441) {
                return -1;
            }
            if (m10911i == 442) {
                a00Var.mo5856k(this.f5329c.f25637a, 0, 10);
                this.f5329c.m10921J(9);
                m10927D = (this.f5329c.m10896x() & 7) + 14;
            } else if (m10911i != 443) {
                if (((m10911i & (-256)) >> 8) != 1) {
                    a00Var.mo5857j(1);
                    return 0;
                }
                int i = m10911i & 255;
                C0907b c0907b = this.f5328b.get(i);
                if (!this.f5330d) {
                    if (c0907b == null) {
                        InterfaceC3467wv interfaceC3467wv = null;
                        boolean z = this.f5331e;
                        if (!z && i == 189) {
                            interfaceC3467wv = new C3000t();
                        } else if (z || (i & 224) != 192) {
                            if (!this.f5332f && (i & 240) == 224) {
                                interfaceC3467wv = new m80();
                                this.f5332f = true;
                            }
                            if (interfaceC3467wv != null) {
                                interfaceC3467wv.mo1992d(this.f5333g, new eo1.C1208d(i, 256));
                                c0907b = new C0907b(interfaceC3467wv, this.f5327a);
                                this.f5328b.put(i, c0907b);
                            }
                        } else {
                            interfaceC3467wv = new zq0();
                        }
                        this.f5331e = true;
                        if (interfaceC3467wv != null) {
                        }
                    }
                    if ((this.f5331e && this.f5332f) || a00Var.getPosition() > 1048576) {
                        this.f5330d = true;
                        this.f5333g.mo11470n();
                    }
                }
                a00Var.mo5856k(this.f5329c.f25637a, 0, 2);
                this.f5329c.m10921J(0);
                int m10927D2 = this.f5329c.m10927D() + 6;
                if (c0907b == null) {
                    a00Var.mo5857j(m10927D2);
                } else {
                    this.f5329c.m10924G(m10927D2);
                    a00Var.mo5861f(this.f5329c.f25637a, 0, m10927D2);
                    this.f5329c.m10921J(6);
                    c0907b.m25701a(this.f5329c);
                    rv0 rv0Var = this.f5329c;
                    rv0Var.m10922I(rv0Var.m10918b());
                }
                return 0;
            } else {
                a00Var.mo5856k(this.f5329c.f25637a, 0, 2);
                this.f5329c.m10921J(0);
                m10927D = this.f5329c.m10927D() + 6;
            }
            a00Var.mo5857j(m10927D);
            return 0;
        }
        return -1;
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: f */
    public void mo1759f(long j, long j2) {
        this.f5327a.m14182g();
        for (int i = 0; i < this.f5328b.size(); i++) {
            this.f5328b.valueAt(i).m25698d();
        }
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: i */
    public void mo1758i(d00 d00Var) {
        this.f5333g = d00Var;
        d00Var.mo11475d(new da1.C1069b(-9223372036854775807L));
    }
}
