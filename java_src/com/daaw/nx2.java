package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class nx2 {
    public int b;
    public int c;
    public int d = 0;
    public hx2[] e = new hx2[100];
    public final hx2[] a = new hx2[1];

    public nx2(boolean z, int i) {
    }

    public final synchronized int a() {
        return this.c * 65536;
    }

    public final synchronized hx2 b() {
        hx2 hx2Var;
        this.c++;
        int i = this.d;
        if (i > 0) {
            hx2[] hx2VarArr = this.e;
            int i2 = i - 1;
            this.d = i2;
            hx2Var = hx2VarArr[i2];
            hx2VarArr[i2] = null;
        } else {
            hx2Var = new hx2(new byte[65536], 0);
        }
        return hx2Var;
    }

    public final synchronized void c(hx2 hx2Var) {
        hx2[] hx2VarArr = this.a;
        hx2VarArr[0] = hx2Var;
        d(hx2VarArr);
    }

    public final synchronized void d(hx2[] hx2VarArr) {
        int length = this.d + hx2VarArr.length;
        hx2[] hx2VarArr2 = this.e;
        int length2 = hx2VarArr2.length;
        if (length >= length2) {
            this.e = (hx2[]) Arrays.copyOf(hx2VarArr2, Math.max(length2 + length2, length));
        }
        for (hx2 hx2Var : hx2VarArr) {
            byte[] bArr = hx2Var.a;
            hx2[] hx2VarArr3 = this.e;
            int i = this.d;
            this.d = i + 1;
            hx2VarArr3[i] = hx2Var;
        }
        this.c -= hx2VarArr.length;
        notifyAll();
    }

    public final synchronized void e() {
        f(0);
    }

    public final synchronized void f(int i) {
        int i2 = this.b;
        this.b = i;
        if (i < i2) {
            g();
        }
    }

    public final synchronized void g() {
        int max = Math.max(0, pz2.d(this.b, 65536) - this.c);
        int i = this.d;
        if (max >= i) {
            return;
        }
        Arrays.fill(this.e, max, i, (Object) null);
        this.d = max;
    }
}
