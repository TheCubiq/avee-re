package com.daaw;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class vq7 extends OutputStream {
    public static final byte[] u = new byte[0];
    public int r;
    public int t;
    public final int p = 128;
    public final ArrayList q = new ArrayList();
    public byte[] s = new byte[128];

    public vq7(int i) {
    }

    public final synchronized int d() {
        return this.r + this.t;
    }

    public final synchronized yq7 n() {
        int i = this.t;
        byte[] bArr = this.s;
        if (i >= bArr.length) {
            this.q.add(new uq7(this.s));
            this.s = u;
        } else if (i > 0) {
            this.q.add(new uq7(Arrays.copyOf(bArr, i)));
        }
        this.r += this.t;
        this.t = 0;
        return yq7.E(this.q);
    }

    public final synchronized void q() {
        this.q.clear();
        this.r = 0;
        this.t = 0;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()));
    }

    public final void u(int i) {
        this.q.add(new uq7(this.s));
        int length = this.r + this.s.length;
        this.r = length;
        this.s = new byte[Math.max(this.p, Math.max(i, length >>> 1))];
        this.t = 0;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        if (this.t == this.s.length) {
            u(1);
        }
        byte[] bArr = this.s;
        int i2 = this.t;
        this.t = i2 + 1;
        bArr[i2] = (byte) i;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.s;
        int length = bArr2.length;
        int i3 = this.t;
        int i4 = length - i3;
        if (i2 <= i4) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.t += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i4);
        int i5 = i2 - i4;
        u(i5);
        System.arraycopy(bArr, i + i4, this.s, 0, i5);
        this.t = i5;
    }
}
