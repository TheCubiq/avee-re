package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class pc2 {
    public final int a;
    public boolean b;
    public boolean c;
    public byte[] d;
    public int e;

    public pc2(int i, int i2) {
        this.a = i;
        byte[] bArr = new byte[131];
        this.d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.d;
            int length = bArr2.length;
            int i4 = this.e + i3;
            if (length < i4) {
                this.d = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.d, this.e, i3);
            this.e += i3;
        }
    }

    public final void b() {
        this.b = false;
        this.c = false;
    }

    public final void c(int i) {
        uo4.f(!this.b);
        boolean z = i == this.a;
        this.b = z;
        if (z) {
            this.e = 3;
            this.c = false;
        }
    }

    public final boolean d(int i) {
        if (this.b) {
            this.e -= i;
            this.b = false;
            this.c = true;
            return true;
        }
        return false;
    }

    public final boolean e() {
        return this.c;
    }
}
