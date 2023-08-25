package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class rr0 {

    /* renamed from: a */
    public final int f25531a;

    /* renamed from: b */
    public boolean f25532b;

    /* renamed from: c */
    public boolean f25533c;

    /* renamed from: d */
    public byte[] f25534d;

    /* renamed from: e */
    public int f25535e;

    public rr0(int i, int i2) {
        this.f25531a = i;
        byte[] bArr = new byte[i2 + 3];
        this.f25534d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public void m11055a(byte[] bArr, int i, int i2) {
        if (this.f25532b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f25534d;
            int length = bArr2.length;
            int i4 = this.f25535e;
            if (length < i4 + i3) {
                this.f25534d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f25534d, this.f25535e, i3);
            this.f25535e += i3;
        }
    }

    /* renamed from: b */
    public boolean m11054b(int i) {
        if (this.f25532b) {
            this.f25535e -= i;
            this.f25532b = false;
            this.f25533c = true;
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean m11053c() {
        return this.f25533c;
    }

    /* renamed from: d */
    public void m11052d() {
        this.f25532b = false;
        this.f25533c = false;
    }

    /* renamed from: e */
    public void m11051e(int i) {
        C2914s6.m10685f(!this.f25532b);
        boolean z = i == this.f25531a;
        this.f25532b = z;
        if (z) {
            this.f25535e = 3;
            this.f25533c = false;
        }
    }
}
