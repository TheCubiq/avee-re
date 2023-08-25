package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class dc2 {
    public static final byte[] f = {0, 0, 1};
    public boolean a;
    public int b;
    public int c;
    public int d;
    public byte[] e = new byte[128];

    public dc2(int i) {
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.a) {
            int i3 = i2 - i;
            byte[] bArr2 = this.e;
            int length = bArr2.length;
            int i4 = this.c + i3;
            if (length < i4) {
                this.e = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.e, this.c, i3);
            this.c += i3;
        }
    }

    public final void b() {
        this.a = false;
        this.c = 0;
        this.b = 0;
    }

    public final boolean c(int i, int i2) {
        int i3 = this.b;
        if (i3 != 0) {
            if (i3 == 1) {
                if (i == 181) {
                    this.b = 2;
                }
                s95.e("H263Reader", "Unexpected start code value");
                b();
            } else if (i3 == 2) {
                if (i <= 31) {
                    this.b = 3;
                }
                s95.e("H263Reader", "Unexpected start code value");
                b();
            } else if (i3 == 3) {
                if ((i & 240) == 32) {
                    this.d = this.c;
                    this.b = 4;
                }
                s95.e("H263Reader", "Unexpected start code value");
                b();
            } else if (i == 179 || i == 181) {
                this.c -= i2;
                this.a = false;
                return true;
            }
        } else if (i == 176) {
            this.b = 1;
            this.a = true;
        }
        a(f, 0, 3);
        return false;
    }
}
