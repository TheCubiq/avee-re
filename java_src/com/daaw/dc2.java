package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class dc2 {

    /* renamed from: f */
    public static final byte[] f6916f = {0, 0, 1};

    /* renamed from: a */
    public boolean f6917a;

    /* renamed from: b */
    public int f6918b;

    /* renamed from: c */
    public int f6919c;

    /* renamed from: d */
    public int f6920d;

    /* renamed from: e */
    public byte[] f6921e = new byte[128];

    public dc2(int i) {
    }

    /* renamed from: a */
    public final void m24531a(byte[] bArr, int i, int i2) {
        if (this.f6917a) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f6921e;
            int length = bArr2.length;
            int i4 = this.f6919c + i3;
            if (length < i4) {
                this.f6921e = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f6921e, this.f6919c, i3);
            this.f6919c += i3;
        }
    }

    /* renamed from: b */
    public final void m24530b() {
        this.f6917a = false;
        this.f6919c = 0;
        this.f6918b = 0;
    }

    /* renamed from: c */
    public final boolean m24529c(int i, int i2) {
        int i3 = this.f6918b;
        if (i3 != 0) {
            if (i3 == 1) {
                if (i == 181) {
                    this.f6918b = 2;
                }
                s95.m10493e("H263Reader", "Unexpected start code value");
                m24530b();
            } else if (i3 == 2) {
                if (i <= 31) {
                    this.f6918b = 3;
                }
                s95.m10493e("H263Reader", "Unexpected start code value");
                m24530b();
            } else if (i3 == 3) {
                if ((i & 240) == 32) {
                    this.f6920d = this.f6919c;
                    this.f6918b = 4;
                }
                s95.m10493e("H263Reader", "Unexpected start code value");
                m24530b();
            } else if (i == 179 || i == 181) {
                this.f6919c -= i2;
                this.f6917a = false;
                return true;
            }
        } else if (i == 176) {
            this.f6918b = 1;
            this.f6917a = true;
        }
        m24531a(f6916f, 0, 3);
        return false;
    }
}
