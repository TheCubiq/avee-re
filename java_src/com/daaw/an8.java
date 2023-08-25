package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class an8 extends kk8 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m = it5.f;
    public int n;
    public long o;

    @Override // com.daaw.hi8
    public final void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.l);
        this.o += min / this.b.d;
        this.l -= min;
        byteBuffer.position(position + min);
        if (this.l > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer d = d(length);
        int P = it5.P(length, 0, this.n);
        d.put(this.m, 0, P);
        int P2 = it5.P(length - P, 0, i2);
        byteBuffer.limit(byteBuffer.position() + P2);
        d.put(byteBuffer);
        byteBuffer.limit(limit);
        int i3 = i2 - P2;
        int i4 = this.n - P;
        this.n = i4;
        byte[] bArr = this.m;
        System.arraycopy(bArr, P, bArr, 0, i4);
        byteBuffer.get(this.m, this.n, i3);
        this.n += i3;
        d.flip();
    }

    @Override // com.daaw.kk8
    public final di8 c(di8 di8Var) {
        if (di8Var.c == 2) {
            this.k = true;
            return (this.i == 0 && this.j == 0) ? di8.e : di8Var;
        }
        throw new fi8(di8Var);
    }

    @Override // com.daaw.kk8
    public final void e() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // com.daaw.kk8
    public final void f() {
        int i;
        if (this.k) {
            if (this.n > 0) {
                this.o += i / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // com.daaw.kk8
    public final void g() {
        this.m = it5.f;
    }

    public final long i() {
        return this.o;
    }

    public final void j() {
        this.o = 0L;
    }

    public final void k(int i, int i2) {
        this.i = i;
        this.j = i2;
    }

    @Override // com.daaw.kk8, com.daaw.hi8
    public final ByteBuffer zzb() {
        int i;
        if (super.zzh() && (i = this.n) > 0) {
            d(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.zzb();
    }

    @Override // com.daaw.kk8, com.daaw.hi8
    public final boolean zzh() {
        return super.zzh() && this.n == 0;
    }
}
