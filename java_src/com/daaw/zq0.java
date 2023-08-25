package com.daaw;

import com.daaw.eo1;
import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public final class zq0 implements InterfaceC3467wv {

    /* renamed from: a */
    public final rv0 f35392a;

    /* renamed from: b */
    public final yq0 f35393b;

    /* renamed from: c */
    public final String f35394c;

    /* renamed from: d */
    public String f35395d;

    /* renamed from: e */
    public sm1 f35396e;

    /* renamed from: f */
    public int f35397f;

    /* renamed from: g */
    public int f35398g;

    /* renamed from: h */
    public boolean f35399h;

    /* renamed from: i */
    public boolean f35400i;

    /* renamed from: j */
    public long f35401j;

    /* renamed from: k */
    public int f35402k;

    /* renamed from: l */
    public long f35403l;

    public zq0() {
        this(null);
    }

    public zq0(String str) {
        this.f35397f = 0;
        rv0 rv0Var = new rv0(4);
        this.f35392a = rv0Var;
        rv0Var.f25637a[0] = -1;
        this.f35393b = new yq0();
        this.f35394c = str;
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: a */
    public void mo1995a(rv0 rv0Var) {
        while (rv0Var.m10919a() > 0) {
            int i = this.f35397f;
            if (i == 0) {
                m1990f(rv0Var);
            } else if (i == 1) {
                m1988h(rv0Var);
            } else if (i == 2) {
                m1989g(rv0Var);
            }
        }
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: b */
    public void mo1994b() {
        this.f35397f = 0;
        this.f35398g = 0;
        this.f35400i = false;
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: c */
    public void mo1993c() {
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: d */
    public void mo1992d(d00 d00Var, eo1.C1208d c1208d) {
        c1208d.m23336a();
        this.f35395d = c1208d.m23335b();
        this.f35396e = d00Var.mo11478a(c1208d.m23334c(), 1);
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: e */
    public void mo1991e(long j, boolean z) {
        this.f35403l = j;
    }

    /* renamed from: f */
    public final void m1990f(rv0 rv0Var) {
        byte[] bArr = rv0Var.f25637a;
        int m10916d = rv0Var.m10916d();
        for (int m10917c = rv0Var.m10917c(); m10917c < m10916d; m10917c++) {
            boolean z = (bArr[m10917c] & 255) == 255;
            boolean z2 = this.f35400i && (bArr[m10917c] & 224) == 224;
            this.f35400i = z;
            if (z2) {
                rv0Var.m10921J(m10917c + 1);
                this.f35400i = false;
                this.f35392a.f25637a[1] = bArr[m10917c];
                this.f35398g = 2;
                this.f35397f = 1;
                return;
            }
        }
        rv0Var.m10921J(m10916d);
    }

    /* renamed from: g */
    public final void m1989g(rv0 rv0Var) {
        int min = Math.min(rv0Var.m10919a(), this.f35402k - this.f35398g);
        this.f35396e.mo10157c(rv0Var, min);
        int i = this.f35398g + min;
        this.f35398g = i;
        int i2 = this.f35402k;
        if (i < i2) {
            return;
        }
        this.f35396e.mo10159a(this.f35403l, 1, i2, 0, null);
        this.f35403l += this.f35401j;
        this.f35398g = 0;
        this.f35397f = 0;
    }

    /* renamed from: h */
    public final void m1988h(rv0 rv0Var) {
        int min = Math.min(rv0Var.m10919a(), 4 - this.f35398g);
        rv0Var.m10913g(this.f35392a.f25637a, this.f35398g, min);
        int i = this.f35398g + min;
        this.f35398g = i;
        if (i < 4) {
            return;
        }
        this.f35392a.m10921J(0);
        if (!yq0.m3449b(this.f35392a.m10911i(), this.f35393b)) {
            this.f35398g = 0;
            this.f35397f = 1;
            return;
        }
        yq0 yq0Var = this.f35393b;
        this.f35402k = yq0Var.f33947c;
        if (!this.f35399h) {
            int i2 = yq0Var.f33948d;
            this.f35401j = (yq0Var.f33951g * 1000000) / i2;
            this.f35396e.mo10156d(Format.m1722u(this.f35395d, yq0Var.f33946b, null, -1, 4096, yq0Var.f33949e, i2, null, null, 0, this.f35394c));
            this.f35399h = true;
        }
        this.f35392a.m10921J(0);
        this.f35396e.mo10157c(this.f35392a, 4);
        this.f35397f = 2;
    }
}
