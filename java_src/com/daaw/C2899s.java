package com.daaw;

import com.daaw.da1;
import com.daaw.eo1;
/* renamed from: com.daaw.s */
/* loaded from: classes.dex */
public final class C2899s implements InterfaceC3919zz {

    /* renamed from: e */
    public static final e00 f25741e = new C2900a();

    /* renamed from: f */
    public static final int f25742f = sq1.m9994v("ID3");

    /* renamed from: a */
    public final long f25743a;

    /* renamed from: b */
    public final C3000t f25744b;

    /* renamed from: c */
    public final rv0 f25745c;

    /* renamed from: d */
    public boolean f25746d;

    /* renamed from: com.daaw.s$a */
    /* loaded from: classes.dex */
    public static class C2900a implements e00 {
        @Override // com.daaw.e00
        /* renamed from: a */
        public InterfaceC3919zz[] mo4824a() {
            return new InterfaceC3919zz[]{new C2899s()};
        }
    }

    public C2899s() {
        this(0L);
    }

    public C2899s(long j) {
        this.f25743a = j;
        this.f25744b = new C3000t();
        this.f25745c = new rv0(2786);
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: a */
    public void mo1762a() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
        if ((r4 - r3) < 8192) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
        r8.mo5858i();
        r4 = r4 + 1;
     */
    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo1761c(a00 a00Var) {
        rv0 rv0Var = new rv0(10);
        int i = 0;
        while (true) {
            a00Var.mo5856k(rv0Var.f25637a, 0, 10);
            rv0Var.m10921J(0);
            if (rv0Var.m10930A() != f25742f) {
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
            while (true) {
                a00Var.mo5856k(rv0Var.f25637a, 0, 5);
                rv0Var.m10921J(0);
                if (rv0Var.m10927D() != 2935) {
                    break;
                }
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                int m8651f = C3150u.m8651f(rv0Var.f25637a);
                if (m8651f == -1) {
                    return false;
                }
                a00Var.mo5860g(m8651f - 5);
            }
            a00Var.mo5860g(i2);
        }
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: d */
    public int mo1760d(a00 a00Var, iy0 iy0Var) {
        int mo5865b = a00Var.mo5865b(this.f25745c.f25637a, 0, 2786);
        if (mo5865b == -1) {
            return -1;
        }
        this.f25745c.m10921J(0);
        this.f25745c.m10922I(mo5865b);
        if (!this.f25746d) {
            this.f25744b.mo1991e(this.f25743a, true);
            this.f25746d = true;
        }
        this.f25744b.mo1995a(this.f25745c);
        return 0;
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: f */
    public void mo1759f(long j, long j2) {
        this.f25746d = false;
        this.f25744b.mo1994b();
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: i */
    public void mo1758i(d00 d00Var) {
        this.f25744b.mo1992d(d00Var, new eo1.C1208d(0, 1));
        d00Var.mo11470n();
        d00Var.mo11475d(new da1.C1069b(-9223372036854775807L));
    }
}
