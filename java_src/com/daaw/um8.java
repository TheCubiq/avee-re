package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class um8 extends kk8 {
    public int i;
    public boolean j;
    public byte[] k;
    public byte[] l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;

    public um8() {
        byte[] bArr = it5.f;
        this.k = bArr;
        this.l = bArr;
    }

    @Override // com.daaw.hi8
    public final void b(ByteBuffer byteBuffer) {
        int limit;
        int position;
        while (byteBuffer.hasRemaining() && !h()) {
            int i = this.m;
            int i2 = 1;
            if (i == 0) {
                limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.k.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else if (Math.abs((int) byteBuffer.getShort(limit2)) > 1024) {
                        int i3 = this.i;
                        position = ((limit2 / i3) * i3) + i3;
                        break;
                    }
                }
                if (position != byteBuffer.position()) {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    d(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.p = true;
                    }
                    byteBuffer.limit(limit);
                }
                this.m = i2;
                byteBuffer.limit(limit);
            } else if (i != 1) {
                limit = byteBuffer.limit();
                int l = l(byteBuffer);
                byteBuffer.limit(l);
                this.q += byteBuffer.remaining() / this.i;
                n(byteBuffer, this.l, this.o);
                if (l < limit) {
                    m(this.l, this.o);
                    this.m = 0;
                    byteBuffer.limit(limit);
                }
            } else {
                limit = byteBuffer.limit();
                int l2 = l(byteBuffer);
                int position2 = l2 - byteBuffer.position();
                byte[] bArr = this.k;
                int length = bArr.length;
                int i4 = this.n;
                int i5 = length - i4;
                if (l2 >= limit || position2 >= i5) {
                    int min = Math.min(position2, i5);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.k, this.n, min);
                    int i6 = this.n + min;
                    this.n = i6;
                    byte[] bArr2 = this.k;
                    if (i6 == bArr2.length) {
                        if (this.p) {
                            m(bArr2, this.o);
                            long j = this.q;
                            int i7 = this.n;
                            int i8 = this.o;
                            this.q = j + ((i7 - (i8 + i8)) / this.i);
                            i6 = i7;
                        } else {
                            this.q += (i6 - this.o) / this.i;
                        }
                        n(byteBuffer, this.k, i6);
                        this.n = 0;
                        i2 = 2;
                        this.m = i2;
                    }
                    byteBuffer.limit(limit);
                } else {
                    m(bArr, i4);
                    this.n = 0;
                    this.m = 0;
                }
            }
        }
    }

    @Override // com.daaw.kk8
    public final di8 c(di8 di8Var) {
        if (di8Var.c == 2) {
            return this.j ? di8Var : di8.e;
        }
        throw new fi8(di8Var);
    }

    @Override // com.daaw.kk8
    public final void e() {
        if (this.j) {
            this.i = this.b.d;
            int k = k(150000L) * this.i;
            if (this.k.length != k) {
                this.k = new byte[k];
            }
            int k2 = k(20000L) * this.i;
            this.o = k2;
            if (this.l.length != k2) {
                this.l = new byte[k2];
            }
        }
        this.m = 0;
        this.q = 0L;
        this.n = 0;
        this.p = false;
    }

    @Override // com.daaw.kk8
    public final void f() {
        int i = this.n;
        if (i > 0) {
            m(this.k, i);
        }
        if (this.p) {
            return;
        }
        this.q += this.o / this.i;
    }

    @Override // com.daaw.kk8
    public final void g() {
        this.j = false;
        this.o = 0;
        byte[] bArr = it5.f;
        this.k = bArr;
        this.l = bArr;
    }

    public final long i() {
        return this.q;
    }

    public final void j(boolean z) {
        this.j = z;
    }

    public final int k(long j) {
        return (int) ((j * this.b.a) / 1000000);
    }

    public final int l(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > 1024) {
                int i = this.i;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    public final void m(byte[] bArr, int i) {
        d(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.p = true;
        }
    }

    public final void n(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.o);
        int i2 = this.o - min;
        System.arraycopy(bArr, i - i2, this.l, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.l, i2, min);
    }

    @Override // com.daaw.kk8, com.daaw.hi8
    public final boolean zzg() {
        return this.j;
    }
}
