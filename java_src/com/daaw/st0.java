package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class st0 {

    /* renamed from: a */
    public final tt0 f26628a = new tt0();

    /* renamed from: b */
    public final rv0 f26629b = new rv0(new byte[65025], 0);

    /* renamed from: c */
    public int f26630c = -1;

    /* renamed from: d */
    public int f26631d;

    /* renamed from: e */
    public boolean f26632e;

    /* renamed from: a */
    public final int m9907a(int i) {
        int i2;
        int i3 = 0;
        this.f26631d = 0;
        do {
            int i4 = this.f26631d;
            int i5 = i + i4;
            tt0 tt0Var = this.f26628a;
            if (i5 >= tt0Var.f28052g) {
                break;
            }
            int[] iArr = tt0Var.f28055j;
            this.f26631d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* renamed from: b */
    public tt0 m9906b() {
        return this.f26628a;
    }

    /* renamed from: c */
    public rv0 m9905c() {
        return this.f26629b;
    }

    /* renamed from: d */
    public boolean m9904d(a00 a00Var) {
        int i;
        C2914s6.m10685f(a00Var != null);
        if (this.f26632e) {
            this.f26632e = false;
            this.f26629b.m10925F();
        }
        while (!this.f26632e) {
            if (this.f26630c < 0) {
                if (!this.f26628a.m8830a(a00Var, true)) {
                    return false;
                }
                tt0 tt0Var = this.f26628a;
                int i2 = tt0Var.f28053h;
                if ((tt0Var.f28047b & 1) == 1 && this.f26629b.m10916d() == 0) {
                    i2 += m9907a(0);
                    i = this.f26631d + 0;
                } else {
                    i = 0;
                }
                a00Var.mo5857j(i2);
                this.f26630c = i;
            }
            int m9907a = m9907a(this.f26630c);
            int i3 = this.f26630c + this.f26631d;
            if (m9907a > 0) {
                if (this.f26629b.m10918b() < this.f26629b.m10916d() + m9907a) {
                    rv0 rv0Var = this.f26629b;
                    rv0Var.f25637a = Arrays.copyOf(rv0Var.f25637a, rv0Var.m10916d() + m9907a);
                }
                rv0 rv0Var2 = this.f26629b;
                a00Var.mo5861f(rv0Var2.f25637a, rv0Var2.m10916d(), m9907a);
                rv0 rv0Var3 = this.f26629b;
                rv0Var3.m10922I(rv0Var3.m10916d() + m9907a);
                this.f26632e = this.f26628a.f28055j[i3 + (-1)] != 255;
            }
            if (i3 == this.f26628a.f28052g) {
                i3 = -1;
            }
            this.f26630c = i3;
        }
        return true;
    }

    /* renamed from: e */
    public void m9903e() {
        this.f26628a.m8829b();
        this.f26629b.m10925F();
        this.f26630c = -1;
        this.f26632e = false;
    }

    /* renamed from: f */
    public void m9902f() {
        rv0 rv0Var = this.f26629b;
        byte[] bArr = rv0Var.f25637a;
        if (bArr.length == 65025) {
            return;
        }
        rv0Var.f25637a = Arrays.copyOf(bArr, Math.max(65025, rv0Var.m10916d()));
    }
}
