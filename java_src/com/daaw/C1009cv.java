package com.daaw;

import com.daaw.eo1;
import com.google.android.exoplayer2.Format;
/* renamed from: com.daaw.cv */
/* loaded from: classes.dex */
public final class C1009cv implements InterfaceC3467wv {

    /* renamed from: b */
    public final String f6196b;

    /* renamed from: c */
    public String f6197c;

    /* renamed from: d */
    public sm1 f6198d;

    /* renamed from: f */
    public int f6200f;

    /* renamed from: g */
    public int f6201g;

    /* renamed from: h */
    public long f6202h;

    /* renamed from: i */
    public Format f6203i;

    /* renamed from: j */
    public int f6204j;

    /* renamed from: k */
    public long f6205k;

    /* renamed from: a */
    public final rv0 f6195a = new rv0(new byte[18]);

    /* renamed from: e */
    public int f6199e = 0;

    public C1009cv(String str) {
        this.f6196b = str;
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: a */
    public void mo1995a(rv0 rv0Var) {
        while (rv0Var.m10919a() > 0) {
            int i = this.f6199e;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(rv0Var.m10919a(), this.f6204j - this.f6200f);
                        this.f6198d.mo10157c(rv0Var, min);
                        int i2 = this.f6200f + min;
                        this.f6200f = i2;
                        int i3 = this.f6204j;
                        if (i2 == i3) {
                            this.f6198d.mo10159a(this.f6205k, 1, i3, 0, null);
                            this.f6205k += this.f6202h;
                            this.f6199e = 0;
                        }
                    }
                } else if (m24973f(rv0Var, this.f6195a.f25637a, 18)) {
                    m24972g();
                    this.f6195a.m10921J(0);
                    this.f6198d.mo10157c(this.f6195a, 18);
                    this.f6199e = 2;
                }
            } else if (m24971h(rv0Var)) {
                this.f6199e = 1;
            }
        }
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: b */
    public void mo1994b() {
        this.f6199e = 0;
        this.f6200f = 0;
        this.f6201g = 0;
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: c */
    public void mo1993c() {
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: d */
    public void mo1992d(d00 d00Var, eo1.C1208d c1208d) {
        c1208d.m23336a();
        this.f6197c = c1208d.m23335b();
        this.f6198d = d00Var.mo11478a(c1208d.m23334c(), 1);
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: e */
    public void mo1991e(long j, boolean z) {
        this.f6205k = j;
    }

    /* renamed from: f */
    public final boolean m24973f(rv0 rv0Var, byte[] bArr, int i) {
        int min = Math.min(rv0Var.m10919a(), i - this.f6200f);
        rv0Var.m10913g(bArr, this.f6200f, min);
        int i2 = this.f6200f + min;
        this.f6200f = i2;
        return i2 == i;
    }

    /* renamed from: g */
    public final void m24972g() {
        byte[] bArr = this.f6195a.f25637a;
        if (this.f6203i == null) {
            Format m23932g = C1139dv.m23932g(bArr, this.f6197c, this.f6196b, null);
            this.f6203i = m23932g;
            this.f6198d.mo10156d(m23932g);
        }
        this.f6204j = C1139dv.m23938a(bArr);
        this.f6202h = (int) ((C1139dv.m23933f(bArr) * 1000000) / this.f6203i.f35707H);
    }

    /* renamed from: h */
    public final boolean m24971h(rv0 rv0Var) {
        while (rv0Var.m10919a() > 0) {
            int i = this.f6201g << 8;
            this.f6201g = i;
            int m10896x = i | rv0Var.m10896x();
            this.f6201g = m10896x;
            if (C1139dv.m23935d(m10896x)) {
                byte[] bArr = this.f6195a.f25637a;
                int i2 = this.f6201g;
                bArr[0] = (byte) ((i2 >> 24) & 255);
                bArr[1] = (byte) ((i2 >> 16) & 255);
                bArr[2] = (byte) ((i2 >> 8) & 255);
                bArr[3] = (byte) (i2 & 255);
                this.f6200f = 4;
                this.f6201g = 0;
                return true;
            }
        }
        return false;
    }
}
