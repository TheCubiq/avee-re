package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class pc2 {

    /* renamed from: a */
    public final int f22826a;

    /* renamed from: b */
    public boolean f22827b;

    /* renamed from: c */
    public boolean f22828c;

    /* renamed from: d */
    public byte[] f22829d;

    /* renamed from: e */
    public int f22830e;

    public pc2(int i, int i2) {
        this.f22826a = i;
        byte[] bArr = new byte[131];
        this.f22829d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public final void m13456a(byte[] bArr, int i, int i2) {
        if (this.f22827b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f22829d;
            int length = bArr2.length;
            int i4 = this.f22830e + i3;
            if (length < i4) {
                this.f22829d = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f22829d, this.f22830e, i3);
            this.f22830e += i3;
        }
    }

    /* renamed from: b */
    public final void m13455b() {
        this.f22827b = false;
        this.f22828c = false;
    }

    /* renamed from: c */
    public final void m13454c(int i) {
        uo4.m7872f(!this.f22827b);
        boolean z = i == this.f22826a;
        this.f22827b = z;
        if (z) {
            this.f22830e = 3;
            this.f22828c = false;
        }
    }

    /* renamed from: d */
    public final boolean m13453d(int i) {
        if (this.f22827b) {
            this.f22830e -= i;
            this.f22827b = false;
            this.f22828c = true;
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m13452e() {
        return this.f22828c;
    }
}
