package com.daaw;

import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public final class ew1 implements InterfaceC3919zz {

    /* renamed from: f */
    public static final e00 f8863f = new C1228a();

    /* renamed from: a */
    public d00 f8864a;

    /* renamed from: b */
    public sm1 f8865b;

    /* renamed from: c */
    public fw1 f8866c;

    /* renamed from: d */
    public int f8867d;

    /* renamed from: e */
    public int f8868e;

    /* renamed from: com.daaw.ew1$a */
    /* loaded from: classes.dex */
    public static class C1228a implements e00 {
        @Override // com.daaw.e00
        /* renamed from: a */
        public InterfaceC3919zz[] mo4824a() {
            return new InterfaceC3919zz[]{new ew1()};
        }
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: a */
    public void mo1762a() {
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: c */
    public boolean mo1761c(a00 a00Var) {
        return gw1.m21196a(a00Var) != null;
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: d */
    public int mo1760d(a00 a00Var, iy0 iy0Var) {
        if (this.f8866c == null) {
            fw1 m21196a = gw1.m21196a(a00Var);
            this.f8866c = m21196a;
            if (m21196a == null) {
                throw new tv0("Unsupported or unrecognized wav header.");
            }
            this.f8865b.mo10156d(Format.m1723t(null, "audio/raw", null, m21196a.m22221a(), 32768, this.f8866c.m22217f(), this.f8866c.m22216i(), this.f8866c.m22218d(), null, null, 0, null));
            this.f8867d = this.f8866c.m22219c();
        }
        if (!this.f8866c.m22215j()) {
            gw1.m21195b(a00Var, this.f8866c);
            this.f8864a.mo11475d(this.f8866c);
        }
        int mo10158b = this.f8865b.mo10158b(a00Var, 32768 - this.f8868e, true);
        if (mo10158b != -1) {
            this.f8868e += mo10158b;
        }
        int i = this.f8868e / this.f8867d;
        if (i > 0) {
            long m22220b = this.f8866c.m22220b(a00Var.getPosition() - this.f8868e);
            int i2 = i * this.f8867d;
            int i3 = this.f8868e - i2;
            this.f8868e = i3;
            this.f8865b.mo10159a(m22220b, 1, i2, i3, null);
        }
        return mo10158b == -1 ? -1 : 0;
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: f */
    public void mo1759f(long j, long j2) {
        this.f8868e = 0;
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: i */
    public void mo1758i(d00 d00Var) {
        this.f8864a = d00Var;
        this.f8865b = d00Var.mo11478a(0, 1);
        this.f8866c = null;
        d00Var.mo11470n();
    }
}
