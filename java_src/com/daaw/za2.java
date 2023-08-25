package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class za2 {

    /* renamed from: a */
    public final ab2 f34676a = new ab2();

    /* renamed from: b */
    public final ik5 f34677b = new ik5(new byte[65025], 0);

    /* renamed from: c */
    public int f34678c = -1;

    /* renamed from: d */
    public int f34679d;

    /* renamed from: e */
    public boolean f34680e;

    /* renamed from: a */
    public final ik5 m2569a() {
        return this.f34677b;
    }

    /* renamed from: b */
    public final ab2 m2568b() {
        return this.f34676a;
    }

    /* renamed from: c */
    public final void m2567c() {
        this.f34676a.m27540a();
        this.f34677b.m19719c(0);
        this.f34678c = -1;
        this.f34680e = false;
    }

    /* renamed from: d */
    public final void m2566d() {
        ik5 ik5Var = this.f34677b;
        if (ik5Var.m19714h().length == 65025) {
            return;
        }
        ik5Var.m19718d(Arrays.copyOf(ik5Var.m19714h(), Math.max(65025, ik5Var.m19710l())), this.f34677b.m19710l());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
        return false;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2565e(k09 k09Var) {
        if (this.f34680e) {
            this.f34680e = false;
            this.f34677b.m19719c(0);
        }
        while (true) {
            if (this.f34680e) {
                return true;
            }
            int i = this.f34678c;
            if (i < 0) {
                if (!this.f34676a.m27538c(k09Var, -1L) || !this.f34676a.m27539b(k09Var, true)) {
                    break;
                }
                ab2 ab2Var = this.f34676a;
                int i2 = ab2Var.f3043d;
                if ((ab2Var.f3040a & 1) == 1 && this.f34677b.m19710l() == 0) {
                    i2 += m2564f(0);
                    i = this.f34679d;
                } else {
                    i = 0;
                }
                if (!n09.m15606e(k09Var, i2)) {
                    return false;
                }
                this.f34678c = i;
            }
            int m2564f = m2564f(i);
            int i3 = this.f34678c + this.f34679d;
            if (m2564f > 0) {
                ik5 ik5Var = this.f34677b;
                ik5Var.m19722H(ik5Var.m19710l() + m2564f);
                ik5 ik5Var2 = this.f34677b;
                if (!n09.m15607d(k09Var, ik5Var2.m19714h(), ik5Var2.m19710l(), m2564f)) {
                    return false;
                }
                ik5 ik5Var3 = this.f34677b;
                ik5Var3.m19717e(ik5Var3.m19710l() + m2564f);
                this.f34680e = this.f34676a.f3045f[i3 + (-1)] != 255;
            }
            if (i3 == this.f34676a.f3042c) {
                i3 = -1;
            }
            this.f34678c = i3;
        }
    }

    /* renamed from: f */
    public final int m2564f(int i) {
        int i2;
        int i3 = 0;
        this.f34679d = 0;
        do {
            int i4 = this.f34679d;
            int i5 = i + i4;
            ab2 ab2Var = this.f34676a;
            if (i5 >= ab2Var.f3042c) {
                break;
            }
            int[] iArr = ab2Var.f3045f;
            this.f34679d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }
}
