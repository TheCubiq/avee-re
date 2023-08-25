package com.daaw;

import com.daaw.da1;
import com.daaw.eo1;
/* renamed from: com.daaw.s1 */
/* loaded from: classes.dex */
public final class C2902s1 implements InterfaceC3919zz {

    /* renamed from: e */
    public static final e00 f25756e = new C2903a();

    /* renamed from: f */
    public static final int f25757f = sq1.m9994v("ID3");

    /* renamed from: a */
    public final long f25758a;

    /* renamed from: b */
    public final C3007t1 f25759b;

    /* renamed from: c */
    public final rv0 f25760c;

    /* renamed from: d */
    public boolean f25761d;

    /* renamed from: com.daaw.s1$a */
    /* loaded from: classes.dex */
    public static class C2903a implements e00 {
        @Override // com.daaw.e00
        /* renamed from: a */
        public InterfaceC3919zz[] mo4824a() {
            return new InterfaceC3919zz[]{new C2902s1()};
        }
    }

    public C2902s1() {
        this(0L);
    }

    public C2902s1(long j) {
        this.f25758a = j;
        this.f25759b = new C3007t1(true);
        this.f25760c = new rv0(200);
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: a */
    public void mo1762a() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
        if ((r5 - r4) < 8192) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003f, code lost:
        r11.mo5858i();
        r5 = r5 + 1;
     */
    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo1761c(a00 a00Var) {
        rv0 rv0Var = new rv0(10);
        qv0 qv0Var = new qv0(rv0Var.f25637a);
        int i = 0;
        while (true) {
            a00Var.mo5856k(rv0Var.f25637a, 0, 10);
            rv0Var.m10921J(0);
            if (rv0Var.m10930A() != f25757f) {
                break;
            }
            rv0Var.m10920K(3);
            int m10897w = rv0Var.m10897w();
            i += m10897w + 10;
            a00Var.mo5860g(m10897w);
        }
        a00Var.mo5858i();
        a00Var.mo5860g(i);
        int i2 = i;
        while (true) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                a00Var.mo5856k(rv0Var.f25637a, 0, 2);
                rv0Var.m10921J(0);
                if ((rv0Var.m10927D() & 65526) != 65520) {
                    break;
                }
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                a00Var.mo5856k(rv0Var.f25637a, 0, 4);
                qv0Var.m12120m(14);
                int m12125h = qv0Var.m12125h(13);
                if (m12125h <= 6) {
                    return false;
                }
                a00Var.mo5860g(m12125h - 6);
                i4 += m12125h;
            }
            a00Var.mo5860g(i2);
        }
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: d */
    public int mo1760d(a00 a00Var, iy0 iy0Var) {
        int mo5865b = a00Var.mo5865b(this.f25760c.f25637a, 0, 200);
        if (mo5865b == -1) {
            return -1;
        }
        this.f25760c.m10921J(0);
        this.f25760c.m10922I(mo5865b);
        if (!this.f25761d) {
            this.f25759b.mo1991e(this.f25758a, true);
            this.f25761d = true;
        }
        this.f25759b.mo1995a(this.f25760c);
        return 0;
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: f */
    public void mo1759f(long j, long j2) {
        this.f25761d = false;
        this.f25759b.mo1994b();
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: i */
    public void mo1758i(d00 d00Var) {
        this.f25759b.mo1992d(d00Var, new eo1.C1208d(0, 1));
        d00Var.mo11470n();
        d00Var.mo11475d(new da1.C1069b(-9223372036854775807L));
    }
}
