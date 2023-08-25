package com.daaw;
/* loaded from: classes.dex */
public class rt0 implements InterfaceC3919zz {

    /* renamed from: d */
    public static final e00 f25582d = new C2887a();

    /* renamed from: a */
    public d00 f25583a;

    /* renamed from: b */
    public rg1 f25584b;

    /* renamed from: c */
    public boolean f25585c;

    /* renamed from: com.daaw.rt0$a */
    /* loaded from: classes.dex */
    public static class C2887a implements e00 {
        @Override // com.daaw.e00
        /* renamed from: a */
        public InterfaceC3919zz[] mo4824a() {
            return new InterfaceC3919zz[]{new rt0()};
        }
    }

    /* renamed from: b */
    public static rv0 m10961b(rv0 rv0Var) {
        rv0Var.m10921J(0);
        return rv0Var;
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: a */
    public void mo1762a() {
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: c */
    public boolean mo1761c(a00 a00Var) {
        try {
            return m10960e(a00Var);
        } catch (tv0 unused) {
            return false;
        }
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: d */
    public int mo1760d(a00 a00Var, iy0 iy0Var) {
        if (this.f25584b == null) {
            if (!m10960e(a00Var)) {
                throw new tv0("Failed to determine bitstream type");
            }
            a00Var.mo5858i();
        }
        if (!this.f25585c) {
            sm1 mo11478a = this.f25583a.mo11478a(0, 1);
            this.f25583a.mo11470n();
            this.f25584b.m11346c(this.f25583a, mo11478a);
            this.f25585c = true;
        }
        return this.f25584b.m11345f(a00Var, iy0Var);
    }

    /* renamed from: e */
    public final boolean m10960e(a00 a00Var) {
        rg1 xu0Var;
        tt0 tt0Var = new tt0();
        if (tt0Var.m8830a(a00Var, true) && (tt0Var.f28047b & 2) == 2) {
            int min = Math.min(tt0Var.f28054i, 8);
            rv0 rv0Var = new rv0(min);
            a00Var.mo5856k(rv0Var.f25637a, 0, min);
            if (n20.m15572o(m10961b(rv0Var))) {
                xu0Var = new n20();
            } else if (yv1.m3170p(m10961b(rv0Var))) {
                xu0Var = new yv1();
            } else if (xu0.m4503n(m10961b(rv0Var))) {
                xu0Var = new xu0();
            }
            this.f25584b = xu0Var;
            return true;
        }
        return false;
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: f */
    public void mo1759f(long j, long j2) {
        rg1 rg1Var = this.f25584b;
        if (rg1Var != null) {
            rg1Var.m11342k(j, j2);
        }
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: i */
    public void mo1758i(d00 d00Var) {
        this.f25583a = d00Var;
    }
}
