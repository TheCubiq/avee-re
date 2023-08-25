package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class nx2 {

    /* renamed from: b */
    public int f20819b;

    /* renamed from: c */
    public int f20820c;

    /* renamed from: d */
    public int f20821d = 0;

    /* renamed from: e */
    public hx2[] f20822e = new hx2[100];

    /* renamed from: a */
    public final hx2[] f20818a = new hx2[1];

    public nx2(boolean z, int i) {
    }

    /* renamed from: a */
    public final synchronized int m14751a() {
        return this.f20820c * 65536;
    }

    /* renamed from: b */
    public final synchronized hx2 m14750b() {
        hx2 hx2Var;
        this.f20820c++;
        int i = this.f20821d;
        if (i > 0) {
            hx2[] hx2VarArr = this.f20822e;
            int i2 = i - 1;
            this.f20821d = i2;
            hx2Var = hx2VarArr[i2];
            hx2VarArr[i2] = null;
        } else {
            hx2Var = new hx2(new byte[65536], 0);
        }
        return hx2Var;
    }

    /* renamed from: c */
    public final synchronized void m14749c(hx2 hx2Var) {
        hx2[] hx2VarArr = this.f20818a;
        hx2VarArr[0] = hx2Var;
        m14748d(hx2VarArr);
    }

    /* renamed from: d */
    public final synchronized void m14748d(hx2[] hx2VarArr) {
        int length = this.f20821d + hx2VarArr.length;
        hx2[] hx2VarArr2 = this.f20822e;
        int length2 = hx2VarArr2.length;
        if (length >= length2) {
            this.f20822e = (hx2[]) Arrays.copyOf(hx2VarArr2, Math.max(length2 + length2, length));
        }
        for (hx2 hx2Var : hx2VarArr) {
            byte[] bArr = hx2Var.f13046a;
            hx2[] hx2VarArr3 = this.f20822e;
            int i = this.f20821d;
            this.f20821d = i + 1;
            hx2VarArr3[i] = hx2Var;
        }
        this.f20820c -= hx2VarArr.length;
        notifyAll();
    }

    /* renamed from: e */
    public final synchronized void m14747e() {
        m14746f(0);
    }

    /* renamed from: f */
    public final synchronized void m14746f(int i) {
        int i2 = this.f20819b;
        this.f20819b = i;
        if (i < i2) {
            m14745g();
        }
    }

    /* renamed from: g */
    public final synchronized void m14745g() {
        int max = Math.max(0, pz2.m12846d(this.f20819b, 65536) - this.f20820c);
        int i = this.f20821d;
        if (max >= i) {
            return;
        }
        Arrays.fill(this.f20822e, max, i, (Object) null);
        this.f20821d = max;
    }
}
