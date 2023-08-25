package com.daaw;

import java.util.Arrays;
/* loaded from: classes2.dex */
public class id0 {
    public String a;
    public int b = 0;
    public byte[] c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;

    public id0(byte[] bArr, int i) {
        g(bArr, i);
    }

    public byte[] a() {
        return this.c;
    }

    public String b() {
        return this.a;
    }

    public int c() {
        return this.b + 10;
    }

    public void d() {
        for (int i = 0; i < this.a.length(); i++) {
            if ((this.a.charAt(i) < 'A' || this.a.charAt(i) > 'Z') && (this.a.charAt(i) < '0' || this.a.charAt(i) > '9')) {
                throw new xg0("Not a valid frame - invalid tag " + this.a);
            }
        }
    }

    public void e(byte[] bArr, int i) {
        int i2 = i + 4;
        this.b = wc.l(bArr[i2], bArr[i2 + 1], bArr[i2 + 2], bArr[i2 + 3]);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            id0 id0Var = (id0) obj;
            if (this.h == id0Var.h && Arrays.equals(this.c, id0Var.c) && this.b == id0Var.b && this.k == id0Var.k && this.i == id0Var.i && this.g == id0Var.g) {
                String str = this.a;
                if (str == null) {
                    if (id0Var.a != null) {
                        return false;
                    }
                } else if (!str.equals(id0Var.a)) {
                    return false;
                }
                return this.e == id0Var.e && this.d == id0Var.d && this.f == id0Var.f && this.j == id0Var.j;
            }
            return false;
        }
        return false;
    }

    public final void f(byte[] bArr, int i) {
        int i2 = i + 8;
        this.d = wc.d(bArr[i2], 6);
        this.e = wc.d(bArr[i2], 5);
        this.f = wc.d(bArr[i2], 4);
        int i3 = i + 9;
        this.g = wc.d(bArr[i3], 6);
        this.h = wc.d(bArr[i3], 3);
        this.i = wc.d(bArr[i3], 2);
        this.j = wc.d(bArr[i3], 1);
        this.k = wc.d(bArr[i3], 0);
    }

    public final void g(byte[] bArr, int i) {
        int h = h(bArr, i);
        d();
        this.c = wc.e(bArr, h, this.b);
    }

    public int h(byte[] bArr, int i) {
        this.a = wc.c(bArr, i + 0, 4);
        e(bArr, i);
        f(bArr, i);
        return i + 10;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.h ? 1231 : 1237) + 31) * 31) + Arrays.hashCode(this.c)) * 31) + this.b) * 31) + (this.k ? 1231 : 1237)) * 31) + (this.i ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31;
        String str = this.a;
        return ((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.j ? 1231 : 1237);
    }
}
