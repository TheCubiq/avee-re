package com.daaw;

import com.daaw.eo1;
/* loaded from: classes.dex */
public final class aa1 implements eo1 {

    /* renamed from: a */
    public final z91 f3014a;

    /* renamed from: b */
    public final rv0 f3015b = new rv0(32);

    /* renamed from: c */
    public int f3016c;

    /* renamed from: d */
    public int f3017d;

    /* renamed from: e */
    public boolean f3018e;

    /* renamed from: f */
    public boolean f3019f;

    public aa1(z91 z91Var) {
        this.f3014a = z91Var;
    }

    @Override // com.daaw.eo1
    /* renamed from: a */
    public void mo15752a(rv0 rv0Var, boolean z) {
        int m10917c = z ? rv0Var.m10917c() + rv0Var.m10896x() : -1;
        if (this.f3019f) {
            if (!z) {
                return;
            }
            this.f3019f = false;
            rv0Var.m10921J(m10917c);
            this.f3017d = 0;
        }
        while (rv0Var.m10919a() > 0) {
            int i = this.f3017d;
            if (i < 3) {
                if (i == 0) {
                    int m10896x = rv0Var.m10896x();
                    rv0Var.m10921J(rv0Var.m10917c() - 1);
                    if (m10896x == 255) {
                        this.f3019f = true;
                        return;
                    }
                }
                int min = Math.min(rv0Var.m10919a(), 3 - this.f3017d);
                rv0Var.m10913g(this.f3015b.f25637a, this.f3017d, min);
                int i2 = this.f3017d + min;
                this.f3017d = i2;
                if (i2 == 3) {
                    this.f3015b.m10924G(3);
                    this.f3015b.m10920K(1);
                    int m10896x2 = this.f3015b.m10896x();
                    int m10896x3 = this.f3015b.m10896x();
                    this.f3018e = (m10896x2 & 128) != 0;
                    this.f3016c = (((m10896x2 & 15) << 8) | m10896x3) + 3;
                    int m10918b = this.f3015b.m10918b();
                    int i3 = this.f3016c;
                    if (m10918b < i3) {
                        rv0 rv0Var2 = this.f3015b;
                        byte[] bArr = rv0Var2.f25637a;
                        rv0Var2.m10924G(Math.min(4098, Math.max(i3, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.f3015b.f25637a, 0, 3);
                    }
                }
            } else {
                int min2 = Math.min(rv0Var.m10919a(), this.f3016c - this.f3017d);
                rv0Var.m10913g(this.f3015b.f25637a, this.f3017d, min2);
                int i4 = this.f3017d + min2;
                this.f3017d = i4;
                int i5 = this.f3016c;
                if (i4 != i5) {
                    continue;
                } else {
                    if (!this.f3018e) {
                        this.f3015b.m10924G(i5);
                    } else if (sq1.m10002n(this.f3015b.f25637a, 0, i5, -1) != 0) {
                        this.f3019f = true;
                        return;
                    } else {
                        this.f3015b.m10924G(this.f3016c - 4);
                    }
                    this.f3014a.mo2590a(this.f3015b);
                    this.f3017d = 0;
                }
            }
        }
    }

    @Override // com.daaw.eo1
    /* renamed from: b */
    public void mo15751b() {
        this.f3019f = true;
    }

    @Override // com.daaw.eo1
    /* renamed from: c */
    public void mo15750c(ol1 ol1Var, d00 d00Var, eo1.C1208d c1208d) {
        this.f3014a.mo2589c(ol1Var, d00Var, c1208d);
        this.f3019f = true;
    }
}
