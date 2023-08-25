package com.daaw;

import android.util.SparseArray;
import com.daaw.eo1;
import com.daaw.sr0;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class n80 implements InterfaceC3467wv {

    /* renamed from: a */
    public final cb1 f19591a;

    /* renamed from: b */
    public final boolean f19592b;

    /* renamed from: c */
    public final boolean f19593c;

    /* renamed from: g */
    public long f19597g;

    /* renamed from: i */
    public String f19599i;

    /* renamed from: j */
    public sm1 f19600j;

    /* renamed from: k */
    public C2263b f19601k;

    /* renamed from: l */
    public boolean f19602l;

    /* renamed from: m */
    public long f19603m;

    /* renamed from: h */
    public final boolean[] f19598h = new boolean[3];

    /* renamed from: d */
    public final rr0 f19594d = new rr0(7, 128);

    /* renamed from: e */
    public final rr0 f19595e = new rr0(8, 128);

    /* renamed from: f */
    public final rr0 f19596f = new rr0(6, 128);

    /* renamed from: n */
    public final rv0 f19604n = new rv0();

    /* renamed from: com.daaw.n80$b */
    /* loaded from: classes.dex */
    public static final class C2263b {

        /* renamed from: a */
        public final sm1 f19605a;

        /* renamed from: b */
        public final boolean f19606b;

        /* renamed from: c */
        public final boolean f19607c;

        /* renamed from: f */
        public final sv0 f19610f;

        /* renamed from: g */
        public byte[] f19611g;

        /* renamed from: h */
        public int f19612h;

        /* renamed from: i */
        public int f19613i;

        /* renamed from: j */
        public long f19614j;

        /* renamed from: k */
        public boolean f19615k;

        /* renamed from: l */
        public long f19616l;

        /* renamed from: o */
        public boolean f19619o;

        /* renamed from: p */
        public long f19620p;

        /* renamed from: q */
        public long f19621q;

        /* renamed from: r */
        public boolean f19622r;

        /* renamed from: d */
        public final SparseArray<sr0.C2969b> f19608d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<sr0.C2968a> f19609e = new SparseArray<>();

        /* renamed from: m */
        public C2264a f19617m = new C2264a();

        /* renamed from: n */
        public C2264a f19618n = new C2264a();

        /* renamed from: com.daaw.n80$b$a */
        /* loaded from: classes.dex */
        public static final class C2264a {

            /* renamed from: a */
            public boolean f19623a;

            /* renamed from: b */
            public boolean f19624b;

            /* renamed from: c */
            public sr0.C2969b f19625c;

            /* renamed from: d */
            public int f19626d;

            /* renamed from: e */
            public int f19627e;

            /* renamed from: f */
            public int f19628f;

            /* renamed from: g */
            public int f19629g;

            /* renamed from: h */
            public boolean f19630h;

            /* renamed from: i */
            public boolean f19631i;

            /* renamed from: j */
            public boolean f19632j;

            /* renamed from: k */
            public boolean f19633k;

            /* renamed from: l */
            public int f19634l;

            /* renamed from: m */
            public int f19635m;

            /* renamed from: n */
            public int f19636n;

            /* renamed from: o */
            public int f19637o;

            /* renamed from: p */
            public int f19638p;

            public C2264a() {
            }

            /* renamed from: b */
            public void m15446b() {
                this.f19624b = false;
                this.f19623a = false;
            }

            /* renamed from: c */
            public final boolean m15445c(C2264a c2264a) {
                boolean z;
                boolean z2;
                if (this.f19623a) {
                    if (!c2264a.f19623a || this.f19628f != c2264a.f19628f || this.f19629g != c2264a.f19629g || this.f19630h != c2264a.f19630h) {
                        return true;
                    }
                    if (this.f19631i && c2264a.f19631i && this.f19632j != c2264a.f19632j) {
                        return true;
                    }
                    int i = this.f19626d;
                    int i2 = c2264a.f19626d;
                    if (i != i2 && (i == 0 || i2 == 0)) {
                        return true;
                    }
                    int i3 = this.f19625c.f26559h;
                    if (i3 == 0 && c2264a.f19625c.f26559h == 0 && (this.f19635m != c2264a.f19635m || this.f19636n != c2264a.f19636n)) {
                        return true;
                    }
                    if ((i3 == 1 && c2264a.f19625c.f26559h == 1 && (this.f19637o != c2264a.f19637o || this.f19638p != c2264a.f19638p)) || (z = this.f19633k) != (z2 = c2264a.f19633k)) {
                        return true;
                    }
                    if (z && z2 && this.f19634l != c2264a.f19634l) {
                        return true;
                    }
                }
                return false;
            }

            /* renamed from: d */
            public boolean m15444d() {
                int i;
                return this.f19624b && ((i = this.f19627e) == 7 || i == 2);
            }

            /* renamed from: e */
            public void m15443e(sr0.C2969b c2969b, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.f19625c = c2969b;
                this.f19626d = i;
                this.f19627e = i2;
                this.f19628f = i3;
                this.f19629g = i4;
                this.f19630h = z;
                this.f19631i = z2;
                this.f19632j = z3;
                this.f19633k = z4;
                this.f19634l = i5;
                this.f19635m = i6;
                this.f19636n = i7;
                this.f19637o = i8;
                this.f19638p = i9;
                this.f19623a = true;
                this.f19624b = true;
            }

            /* renamed from: f */
            public void m15442f(int i) {
                this.f19627e = i;
                this.f19624b = true;
            }
        }

        public C2263b(sm1 sm1Var, boolean z, boolean z2) {
            this.f19605a = sm1Var;
            this.f19606b = z;
            this.f19607c = z2;
            byte[] bArr = new byte[128];
            this.f19611g = bArr;
            this.f19610f = new sv0(bArr, 0, 0);
            m15449g();
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x014e  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void m15455a(byte[] bArr, int i, int i2) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int m9830g;
            if (this.f19615k) {
                int i8 = i2 - i;
                byte[] bArr2 = this.f19611g;
                int length = bArr2.length;
                int i9 = this.f19612h;
                if (length < i9 + i8) {
                    this.f19611g = Arrays.copyOf(bArr2, (i9 + i8) * 2);
                }
                System.arraycopy(bArr, i, this.f19611g, this.f19612h, i8);
                int i10 = this.f19612h + i8;
                this.f19612h = i10;
                this.f19610f.m9828i(this.f19611g, 0, i10);
                if (this.f19610f.m9835b(8)) {
                    this.f19610f.m9826k();
                    int m9832e = this.f19610f.m9832e(2);
                    this.f19610f.m9825l(5);
                    if (this.f19610f.m9834c()) {
                        this.f19610f.m9829h();
                        if (this.f19610f.m9834c()) {
                            int m9829h = this.f19610f.m9829h();
                            if (!this.f19607c) {
                                this.f19615k = false;
                                this.f19618n.m15442f(m9829h);
                            } else if (this.f19610f.m9834c()) {
                                int m9829h2 = this.f19610f.m9829h();
                                if (this.f19609e.indexOfKey(m9829h2) < 0) {
                                    this.f19615k = false;
                                    return;
                                }
                                sr0.C2968a c2968a = this.f19609e.get(m9829h2);
                                sr0.C2969b c2969b = this.f19608d.get(c2968a.f26550b);
                                if (c2969b.f26556e) {
                                    if (!this.f19610f.m9835b(2)) {
                                        return;
                                    }
                                    this.f19610f.m9825l(2);
                                }
                                if (this.f19610f.m9835b(c2969b.f26558g)) {
                                    int m9832e2 = this.f19610f.m9832e(c2969b.f26558g);
                                    if (c2969b.f26557f) {
                                        z = false;
                                    } else if (!this.f19610f.m9835b(1)) {
                                        return;
                                    } else {
                                        boolean m9833d = this.f19610f.m9833d();
                                        if (m9833d) {
                                            if (this.f19610f.m9835b(1)) {
                                                z = m9833d;
                                                z3 = this.f19610f.m9833d();
                                                z2 = true;
                                                z4 = this.f19613i != 5;
                                                if (z4) {
                                                    i3 = 0;
                                                } else if (!this.f19610f.m9834c()) {
                                                    return;
                                                } else {
                                                    i3 = this.f19610f.m9829h();
                                                }
                                                i4 = c2969b.f26559h;
                                                if (i4 != 0) {
                                                    if (!this.f19610f.m9835b(c2969b.f26560i)) {
                                                        return;
                                                    }
                                                    int m9832e3 = this.f19610f.m9832e(c2969b.f26560i);
                                                    if (c2968a.f26551c && !z) {
                                                        if (this.f19610f.m9834c()) {
                                                            i7 = this.f19610f.m9830g();
                                                            i5 = m9832e3;
                                                            i6 = 0;
                                                            m9830g = 0;
                                                            this.f19618n.m15443e(c2969b, m9832e, m9829h, m9832e2, m9829h2, z, z2, z3, z4, i3, i5, i7, i6, m9830g);
                                                            this.f19615k = false;
                                                        }
                                                        return;
                                                    }
                                                    i5 = m9832e3;
                                                } else if (i4 == 1 && !c2969b.f26561j) {
                                                    if (this.f19610f.m9834c()) {
                                                        int m9830g2 = this.f19610f.m9830g();
                                                        if (!c2968a.f26551c || z) {
                                                            i6 = m9830g2;
                                                            i5 = 0;
                                                            i7 = 0;
                                                            m9830g = 0;
                                                            this.f19618n.m15443e(c2969b, m9832e, m9829h, m9832e2, m9829h2, z, z2, z3, z4, i3, i5, i7, i6, m9830g);
                                                            this.f19615k = false;
                                                        } else if (this.f19610f.m9834c()) {
                                                            m9830g = this.f19610f.m9830g();
                                                            i6 = m9830g2;
                                                            i5 = 0;
                                                            i7 = 0;
                                                            this.f19618n.m15443e(c2969b, m9832e, m9829h, m9832e2, m9829h2, z, z2, z3, z4, i3, i5, i7, i6, m9830g);
                                                            this.f19615k = false;
                                                        } else {
                                                            return;
                                                        }
                                                    }
                                                    return;
                                                } else {
                                                    i5 = 0;
                                                }
                                                i7 = 0;
                                                i6 = 0;
                                                m9830g = 0;
                                                this.f19618n.m15443e(c2969b, m9832e, m9829h, m9832e2, m9829h2, z, z2, z3, z4, i3, i5, i7, i6, m9830g);
                                                this.f19615k = false;
                                            }
                                            return;
                                        }
                                        z = m9833d;
                                    }
                                    z2 = false;
                                    z3 = false;
                                    if (this.f19613i != 5) {
                                    }
                                    if (z4) {
                                    }
                                    i4 = c2969b.f26559h;
                                    if (i4 != 0) {
                                    }
                                    i7 = 0;
                                    i6 = 0;
                                    m9830g = 0;
                                    this.f19618n.m15443e(c2969b, m9832e, m9829h, m9832e2, m9829h2, z, z2, z3, z4, i3, i5, i7, i6, m9830g);
                                    this.f19615k = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        public void m15454b(long j, int i) {
            boolean z = false;
            if (this.f19613i == 9 || (this.f19607c && this.f19618n.m15445c(this.f19617m))) {
                if (this.f19619o) {
                    m15452d(i + ((int) (j - this.f19614j)));
                }
                this.f19620p = this.f19614j;
                this.f19621q = this.f19616l;
                this.f19622r = false;
                this.f19619o = true;
            }
            boolean z2 = this.f19622r;
            int i2 = this.f19613i;
            if (i2 == 5 || (this.f19606b && i2 == 1 && this.f19618n.m15444d())) {
                z = true;
            }
            this.f19622r = z2 | z;
        }

        /* renamed from: c */
        public boolean m15453c() {
            return this.f19607c;
        }

        /* renamed from: d */
        public final void m15452d(int i) {
            boolean z = this.f19622r;
            this.f19605a.mo10159a(this.f19621q, z ? 1 : 0, (int) (this.f19614j - this.f19620p), i, null);
        }

        /* renamed from: e */
        public void m15451e(sr0.C2968a c2968a) {
            this.f19609e.append(c2968a.f26549a, c2968a);
        }

        /* renamed from: f */
        public void m15450f(sr0.C2969b c2969b) {
            this.f19608d.append(c2969b.f26552a, c2969b);
        }

        /* renamed from: g */
        public void m15449g() {
            this.f19615k = false;
            this.f19619o = false;
            this.f19618n.m15446b();
        }

        /* renamed from: h */
        public void m15448h(long j, int i, long j2) {
            this.f19613i = i;
            this.f19616l = j2;
            this.f19614j = j;
            if (!this.f19606b || i != 1) {
                if (!this.f19607c) {
                    return;
                }
                if (i != 5 && i != 1 && i != 2) {
                    return;
                }
            }
            C2264a c2264a = this.f19617m;
            this.f19617m = this.f19618n;
            this.f19618n = c2264a;
            c2264a.m15446b();
            this.f19612h = 0;
            this.f19615k = true;
        }
    }

    public n80(cb1 cb1Var, boolean z, boolean z2) {
        this.f19591a = cb1Var;
        this.f19592b = z;
        this.f19593c = z2;
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: a */
    public void mo1995a(rv0 rv0Var) {
        int m10917c = rv0Var.m10917c();
        int m10916d = rv0Var.m10916d();
        byte[] bArr = rv0Var.f25637a;
        this.f19597g += rv0Var.m10919a();
        this.f19600j.mo10157c(rv0Var, rv0Var.m10919a());
        while (true) {
            int m9976c = sr0.m9976c(bArr, m10917c, m10916d, this.f19598h);
            if (m9976c == m10916d) {
                m15457g(bArr, m10917c, m10916d);
                return;
            }
            int m9973f = sr0.m9973f(bArr, m9976c);
            int i = m9976c - m10917c;
            if (i > 0) {
                m15457g(bArr, m10917c, m9976c);
            }
            int i2 = m10916d - m9976c;
            long j = this.f19597g - i2;
            m15458f(j, i2, i < 0 ? -i : 0, this.f19603m);
            m15456h(j, m9973f, this.f19603m);
            m10917c = m9976c + 3;
        }
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: b */
    public void mo1994b() {
        sr0.m9978a(this.f19598h);
        this.f19594d.m11052d();
        this.f19595e.m11052d();
        this.f19596f.m11052d();
        this.f19601k.m15449g();
        this.f19597g = 0L;
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: c */
    public void mo1993c() {
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: d */
    public void mo1992d(d00 d00Var, eo1.C1208d c1208d) {
        c1208d.m23336a();
        this.f19599i = c1208d.m23335b();
        sm1 mo11478a = d00Var.mo11478a(c1208d.m23334c(), 2);
        this.f19600j = mo11478a;
        this.f19601k = new C2263b(mo11478a, this.f19592b, this.f19593c);
        this.f19591a.m25455b(d00Var, c1208d);
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: e */
    public void mo1991e(long j, boolean z) {
        this.f19603m = j;
    }

    /* renamed from: f */
    public final void m15458f(long j, int i, int i2, long j2) {
        rr0 rr0Var;
        if (!this.f19602l || this.f19601k.m15453c()) {
            this.f19594d.m11054b(i2);
            this.f19595e.m11054b(i2);
            if (this.f19602l) {
                if (this.f19594d.m11053c()) {
                    rr0 rr0Var2 = this.f19594d;
                    this.f19601k.m15450f(sr0.m9970i(rr0Var2.f25534d, 3, rr0Var2.f25535e));
                    rr0Var = this.f19594d;
                } else if (this.f19595e.m11053c()) {
                    rr0 rr0Var3 = this.f19595e;
                    this.f19601k.m15451e(sr0.m9971h(rr0Var3.f25534d, 3, rr0Var3.f25535e));
                    rr0Var = this.f19595e;
                }
            } else if (this.f19594d.m11053c() && this.f19595e.m11053c()) {
                ArrayList arrayList = new ArrayList();
                rr0 rr0Var4 = this.f19594d;
                arrayList.add(Arrays.copyOf(rr0Var4.f25534d, rr0Var4.f25535e));
                rr0 rr0Var5 = this.f19595e;
                arrayList.add(Arrays.copyOf(rr0Var5.f25534d, rr0Var5.f25535e));
                rr0 rr0Var6 = this.f19594d;
                sr0.C2969b m9970i = sr0.m9970i(rr0Var6.f25534d, 3, rr0Var6.f25535e);
                rr0 rr0Var7 = this.f19595e;
                sr0.C2968a m9971h = sr0.m9971h(rr0Var7.f25534d, 3, rr0Var7.f25535e);
                this.f19600j.mo10156d(Format.m1738H(this.f19599i, "video/avc", null, -1, -1, m9970i.f26553b, m9970i.f26554c, -1.0f, arrayList, -1, m9970i.f26555d, null));
                this.f19602l = true;
                this.f19601k.m15450f(m9970i);
                this.f19601k.m15451e(m9971h);
                this.f19594d.m11052d();
                rr0Var = this.f19595e;
            }
            rr0Var.m11052d();
        }
        if (this.f19596f.m11054b(i2)) {
            rr0 rr0Var8 = this.f19596f;
            this.f19604n.m10923H(this.f19596f.f25534d, sr0.m9968k(rr0Var8.f25534d, rr0Var8.f25535e));
            this.f19604n.m10921J(4);
            this.f19591a.m25456a(j2, this.f19604n);
        }
        this.f19601k.m15454b(j, i);
    }

    /* renamed from: g */
    public final void m15457g(byte[] bArr, int i, int i2) {
        if (!this.f19602l || this.f19601k.m15453c()) {
            this.f19594d.m11055a(bArr, i, i2);
            this.f19595e.m11055a(bArr, i, i2);
        }
        this.f19596f.m11055a(bArr, i, i2);
        this.f19601k.m15455a(bArr, i, i2);
    }

    /* renamed from: h */
    public final void m15456h(long j, int i, long j2) {
        if (!this.f19602l || this.f19601k.m15453c()) {
            this.f19594d.m11051e(i);
            this.f19595e.m11051e(i);
        }
        this.f19596f.m11051e(i);
        this.f19601k.m15448h(j, i, j2);
    }
}
