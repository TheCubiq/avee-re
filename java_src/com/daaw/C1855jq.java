package com.daaw;

import java.util.Arrays;
/* renamed from: com.daaw.jq */
/* loaded from: classes.dex */
public final class C1855jq implements InterfaceC2006l2 {

    /* renamed from: a */
    public final boolean f15323a;

    /* renamed from: b */
    public final int f15324b;

    /* renamed from: c */
    public final byte[] f15325c;

    /* renamed from: d */
    public final C1896k2[] f15326d;

    /* renamed from: e */
    public int f15327e;

    /* renamed from: f */
    public int f15328f;

    /* renamed from: g */
    public int f15329g;

    /* renamed from: h */
    public C1896k2[] f15330h;

    public C1855jq(boolean z, int i) {
        this(z, i, 0);
    }

    public C1855jq(boolean z, int i, int i2) {
        C2914s6.m10690a(i > 0);
        C2914s6.m10690a(i2 >= 0);
        this.f15323a = z;
        this.f15324b = i;
        this.f15329g = i2;
        this.f15330h = new C1896k2[i2 + 100];
        if (i2 > 0) {
            this.f15325c = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f15330h[i3] = new C1896k2(this.f15325c, i3 * i);
            }
        } else {
            this.f15325c = null;
        }
        this.f15326d = new C1896k2[1];
    }

    @Override // com.daaw.InterfaceC2006l2
    /* renamed from: a */
    public synchronized C1896k2 mo17201a() {
        C1896k2 c1896k2;
        this.f15328f++;
        int i = this.f15329g;
        if (i > 0) {
            C1896k2[] c1896k2Arr = this.f15330h;
            int i2 = i - 1;
            this.f15329g = i2;
            c1896k2 = c1896k2Arr[i2];
            c1896k2Arr[i2] = null;
        } else {
            c1896k2 = new C1896k2(new byte[this.f15324b], 0);
        }
        return c1896k2;
    }

    @Override // com.daaw.InterfaceC2006l2
    /* renamed from: b */
    public synchronized void mo17200b() {
        int i = 0;
        int max = Math.max(0, sq1.m10010f(this.f15327e, this.f15324b) - this.f15328f);
        int i2 = this.f15329g;
        if (max >= i2) {
            return;
        }
        if (this.f15325c != null) {
            int i3 = i2 - 1;
            while (i <= i3) {
                C1896k2[] c1896k2Arr = this.f15330h;
                C1896k2 c1896k2 = c1896k2Arr[i];
                byte[] bArr = c1896k2.f15606a;
                byte[] bArr2 = this.f15325c;
                if (bArr == bArr2) {
                    i++;
                } else {
                    C1896k2 c1896k22 = c1896k2Arr[i3];
                    if (c1896k22.f15606a != bArr2) {
                        i3--;
                    } else {
                        c1896k2Arr[i] = c1896k22;
                        c1896k2Arr[i3] = c1896k2;
                        i3--;
                        i++;
                    }
                }
            }
            max = Math.max(max, i);
            if (max >= this.f15329g) {
                return;
            }
        }
        Arrays.fill(this.f15330h, max, this.f15329g, (Object) null);
        this.f15329g = max;
    }

    @Override // com.daaw.InterfaceC2006l2
    /* renamed from: c */
    public synchronized void mo17199c(C1896k2 c1896k2) {
        C1896k2[] c1896k2Arr = this.f15326d;
        c1896k2Arr[0] = c1896k2;
        mo17198d(c1896k2Arr);
    }

    @Override // com.daaw.InterfaceC2006l2
    /* renamed from: d */
    public synchronized void mo17198d(C1896k2[] c1896k2Arr) {
        boolean z;
        int i = this.f15329g;
        int length = c1896k2Arr.length + i;
        C1896k2[] c1896k2Arr2 = this.f15330h;
        if (length >= c1896k2Arr2.length) {
            this.f15330h = (C1896k2[]) Arrays.copyOf(c1896k2Arr2, Math.max(c1896k2Arr2.length * 2, i + c1896k2Arr.length));
        }
        for (C1896k2 c1896k2 : c1896k2Arr) {
            byte[] bArr = c1896k2.f15606a;
            if (bArr != this.f15325c && bArr.length != this.f15324b) {
                z = false;
                C2914s6.m10690a(z);
                C1896k2[] c1896k2Arr3 = this.f15330h;
                int i2 = this.f15329g;
                this.f15329g = i2 + 1;
                c1896k2Arr3[i2] = c1896k2;
            }
            z = true;
            C2914s6.m10690a(z);
            C1896k2[] c1896k2Arr32 = this.f15330h;
            int i22 = this.f15329g;
            this.f15329g = i22 + 1;
            c1896k2Arr32[i22] = c1896k2;
        }
        this.f15328f -= c1896k2Arr.length;
        notifyAll();
    }

    @Override // com.daaw.InterfaceC2006l2
    /* renamed from: e */
    public int mo17197e() {
        return this.f15324b;
    }

    /* renamed from: f */
    public synchronized int m18342f() {
        return this.f15328f * this.f15324b;
    }

    /* renamed from: g */
    public synchronized void m18341g() {
        if (this.f15323a) {
            m18340h(0);
        }
    }

    /* renamed from: h */
    public synchronized void m18340h(int i) {
        boolean z = i < this.f15327e;
        this.f15327e = i;
        if (z) {
            mo17200b();
        }
    }
}
