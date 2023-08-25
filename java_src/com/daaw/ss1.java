package com.daaw;

import com.daaw.nj1;
import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public final class ss1 extends nj1 {

    /* renamed from: b */
    public final rv0 f26595b;

    /* renamed from: c */
    public final rv0 f26596c;

    /* renamed from: d */
    public int f26597d;

    /* renamed from: e */
    public boolean f26598e;

    /* renamed from: f */
    public int f26599f;

    public ss1(sm1 sm1Var) {
        super(sm1Var);
        this.f26595b = new rv0(sr0.f26545a);
        this.f26596c = new rv0(4);
    }

    @Override // com.daaw.nj1
    /* renamed from: b */
    public boolean mo9922b(rv0 rv0Var) {
        int m10896x = rv0Var.m10896x();
        int i = (m10896x >> 4) & 15;
        int i2 = m10896x & 15;
        if (i2 == 7) {
            this.f26599f = i;
            return i != 5;
        }
        throw new nj1.C2297a("Video format not supported: " + i2);
    }

    @Override // com.daaw.nj1
    /* renamed from: c */
    public void mo9921c(rv0 rv0Var, long j) {
        int m10896x = rv0Var.m10896x();
        long m10910j = j + (rv0Var.m10910j() * 1000);
        if (m10896x == 0 && !this.f26598e) {
            rv0 rv0Var2 = new rv0(new byte[rv0Var.m10919a()]);
            rv0Var.m10913g(rv0Var2.f25637a, 0, rv0Var.m10919a());
            C3681y9 m3998b = C3681y9.m3998b(rv0Var2);
            this.f26597d = m3998b.f33430b;
            this.f20158a.mo10156d(Format.m1738H(null, "video/avc", null, -1, -1, m3998b.f33431c, m3998b.f33432d, -1.0f, m3998b.f33429a, -1, m3998b.f33433e, null));
            this.f26598e = true;
        } else if (m10896x == 1 && this.f26598e) {
            byte[] bArr = this.f26596c.f25637a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i = 4 - this.f26597d;
            int i2 = 0;
            while (rv0Var.m10919a() > 0) {
                rv0Var.m10913g(this.f26596c.f25637a, i, this.f26597d);
                this.f26596c.m10921J(0);
                int m10929B = this.f26596c.m10929B();
                this.f26595b.m10921J(0);
                this.f20158a.mo10157c(this.f26595b, 4);
                this.f20158a.mo10157c(rv0Var, m10929B);
                i2 = i2 + 4 + m10929B;
            }
            this.f20158a.mo10159a(m10910j, this.f26599f == 1 ? 1 : 0, i2, 0, null);
        }
    }
}
