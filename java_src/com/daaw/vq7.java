package com.daaw;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class vq7 extends OutputStream {

    /* renamed from: u */
    public static final byte[] f30477u = new byte[0];

    /* renamed from: r */
    public int f30480r;

    /* renamed from: t */
    public int f30482t;

    /* renamed from: p */
    public final int f30478p = 128;

    /* renamed from: q */
    public final ArrayList f30479q = new ArrayList();

    /* renamed from: s */
    public byte[] f30481s = new byte[128];

    public vq7(int i) {
    }

    /* renamed from: d */
    public final synchronized int m6907d() {
        return this.f30480r + this.f30482t;
    }

    /* renamed from: n */
    public final synchronized yq7 m6906n() {
        int i = this.f30482t;
        byte[] bArr = this.f30481s;
        if (i >= bArr.length) {
            this.f30479q.add(new uq7(this.f30481s));
            this.f30481s = f30477u;
        } else if (i > 0) {
            this.f30479q.add(new uq7(Arrays.copyOf(bArr, i)));
        }
        this.f30480r += this.f30482t;
        this.f30482t = 0;
        return yq7.m3425E(this.f30479q);
    }

    /* renamed from: q */
    public final synchronized void m6905q() {
        this.f30479q.clear();
        this.f30480r = 0;
        this.f30482t = 0;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(m6907d()));
    }

    /* renamed from: u */
    public final void m6904u(int i) {
        this.f30479q.add(new uq7(this.f30481s));
        int length = this.f30480r + this.f30481s.length;
        this.f30480r = length;
        this.f30481s = new byte[Math.max(this.f30478p, Math.max(i, length >>> 1))];
        this.f30482t = 0;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        if (this.f30482t == this.f30481s.length) {
            m6904u(1);
        }
        byte[] bArr = this.f30481s;
        int i2 = this.f30482t;
        this.f30482t = i2 + 1;
        bArr[i2] = (byte) i;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.f30481s;
        int length = bArr2.length;
        int i3 = this.f30482t;
        int i4 = length - i3;
        if (i2 <= i4) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f30482t += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i4);
        int i5 = i2 - i4;
        m6904u(i5);
        System.arraycopy(bArr, i + i4, this.f30481s, 0, i5);
        this.f30482t = i5;
    }
}
