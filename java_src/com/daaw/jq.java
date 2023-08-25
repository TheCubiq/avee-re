package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class jq implements l2 {
    public final boolean a;
    public final int b;
    public final byte[] c;
    public final k2[] d;
    public int e;
    public int f;
    public int g;
    public k2[] h;

    public jq(boolean z, int i) {
        this(z, i, 0);
    }

    public jq(boolean z, int i, int i2) {
        s6.a(i > 0);
        s6.a(i2 >= 0);
        this.a = z;
        this.b = i;
        this.g = i2;
        this.h = new k2[i2 + 100];
        if (i2 > 0) {
            this.c = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.h[i3] = new k2(this.c, i3 * i);
            }
        } else {
            this.c = null;
        }
        this.d = new k2[1];
    }

    @Override // com.daaw.l2
    public synchronized k2 a() {
        k2 k2Var;
        this.f++;
        int i = this.g;
        if (i > 0) {
            k2[] k2VarArr = this.h;
            int i2 = i - 1;
            this.g = i2;
            k2Var = k2VarArr[i2];
            k2VarArr[i2] = null;
        } else {
            k2Var = new k2(new byte[this.b], 0);
        }
        return k2Var;
    }

    @Override // com.daaw.l2
    public synchronized void b() {
        int i = 0;
        int max = Math.max(0, sq1.f(this.e, this.b) - this.f);
        int i2 = this.g;
        if (max >= i2) {
            return;
        }
        if (this.c != null) {
            int i3 = i2 - 1;
            while (i <= i3) {
                k2[] k2VarArr = this.h;
                k2 k2Var = k2VarArr[i];
                byte[] bArr = k2Var.a;
                byte[] bArr2 = this.c;
                if (bArr == bArr2) {
                    i++;
                } else {
                    k2 k2Var2 = k2VarArr[i3];
                    if (k2Var2.a != bArr2) {
                        i3--;
                    } else {
                        k2VarArr[i] = k2Var2;
                        k2VarArr[i3] = k2Var;
                        i3--;
                        i++;
                    }
                }
            }
            max = Math.max(max, i);
            if (max >= this.g) {
                return;
            }
        }
        Arrays.fill(this.h, max, this.g, (Object) null);
        this.g = max;
    }

    @Override // com.daaw.l2
    public synchronized void c(k2 k2Var) {
        k2[] k2VarArr = this.d;
        k2VarArr[0] = k2Var;
        d(k2VarArr);
    }

    @Override // com.daaw.l2
    public synchronized void d(k2[] k2VarArr) {
        boolean z;
        int i = this.g;
        int length = k2VarArr.length + i;
        k2[] k2VarArr2 = this.h;
        if (length >= k2VarArr2.length) {
            this.h = (k2[]) Arrays.copyOf(k2VarArr2, Math.max(k2VarArr2.length * 2, i + k2VarArr.length));
        }
        for (k2 k2Var : k2VarArr) {
            byte[] bArr = k2Var.a;
            if (bArr != this.c && bArr.length != this.b) {
                z = false;
                s6.a(z);
                k2[] k2VarArr3 = this.h;
                int i2 = this.g;
                this.g = i2 + 1;
                k2VarArr3[i2] = k2Var;
            }
            z = true;
            s6.a(z);
            k2[] k2VarArr32 = this.h;
            int i22 = this.g;
            this.g = i22 + 1;
            k2VarArr32[i22] = k2Var;
        }
        this.f -= k2VarArr.length;
        notifyAll();
    }

    @Override // com.daaw.l2
    public int e() {
        return this.b;
    }

    public synchronized int f() {
        return this.f * this.b;
    }

    public synchronized void g() {
        if (this.a) {
            h(0);
        }
    }

    public synchronized void h(int i) {
        boolean z = i < this.e;
        this.e = i;
        if (z) {
            b();
        }
    }
}
