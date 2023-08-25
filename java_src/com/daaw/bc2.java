package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class bc2 {

    /* renamed from: e */
    public static final byte[] f4689e = {0, 0, 1};

    /* renamed from: a */
    public boolean f4690a;

    /* renamed from: b */
    public int f4691b;

    /* renamed from: c */
    public int f4692c;

    /* renamed from: d */
    public byte[] f4693d = new byte[128];

    public bc2(int i) {
    }

    /* renamed from: a */
    public final void m26229a(byte[] bArr, int i, int i2) {
        if (this.f4690a) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f4693d;
            int length = bArr2.length;
            int i4 = this.f4691b + i3;
            if (length < i4) {
                this.f4693d = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f4693d, this.f4691b, i3);
            this.f4691b += i3;
        }
    }

    /* renamed from: b */
    public final void m26228b() {
        this.f4690a = false;
        this.f4691b = 0;
        this.f4692c = 0;
    }

    /* renamed from: c */
    public final boolean m26227c(int i, int i2) {
        if (this.f4690a) {
            int i3 = this.f4691b - i2;
            this.f4691b = i3;
            if (this.f4692c != 0 || i != 181) {
                this.f4690a = false;
                return true;
            }
            this.f4692c = i3;
        } else if (i == 179) {
            this.f4690a = true;
        }
        m26229a(f4689e, 0, 3);
        return false;
    }
}
