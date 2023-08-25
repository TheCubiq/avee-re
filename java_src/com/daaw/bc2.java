package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class bc2 {
    public static final byte[] e = {0, 0, 1};
    public boolean a;
    public int b;
    public int c;
    public byte[] d = new byte[128];

    public bc2(int i) {
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.a) {
            int i3 = i2 - i;
            byte[] bArr2 = this.d;
            int length = bArr2.length;
            int i4 = this.b + i3;
            if (length < i4) {
                this.d = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.d, this.b, i3);
            this.b += i3;
        }
    }

    public final void b() {
        this.a = false;
        this.b = 0;
        this.c = 0;
    }

    public final boolean c(int i, int i2) {
        if (this.a) {
            int i3 = this.b - i2;
            this.b = i3;
            if (this.c != 0 || i != 181) {
                this.a = false;
                return true;
            }
            this.c = i3;
        } else if (i == 179) {
            this.a = true;
        }
        a(e, 0, 3);
        return false;
    }
}
