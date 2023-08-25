package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class um8 extends kk8 {

    /* renamed from: i */
    public int f29217i;

    /* renamed from: j */
    public boolean f29218j;

    /* renamed from: k */
    public byte[] f29219k;

    /* renamed from: l */
    public byte[] f29220l;

    /* renamed from: m */
    public int f29221m;

    /* renamed from: n */
    public int f29222n;

    /* renamed from: o */
    public int f29223o;

    /* renamed from: p */
    public boolean f29224p;

    /* renamed from: q */
    public long f29225q;

    public um8() {
        byte[] bArr = it5.f13996f;
        this.f29219k = bArr;
        this.f29220l = bArr;
    }

    @Override // com.daaw.hi8
    /* renamed from: b */
    public final void mo3498b(ByteBuffer byteBuffer) {
        int limit;
        int position;
        while (byteBuffer.hasRemaining() && !m17679h()) {
            int i = this.f29221m;
            int i2 = 1;
            if (i == 0) {
                limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f29219k.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else if (Math.abs((int) byteBuffer.getShort(limit2)) > 1024) {
                        int i3 = this.f29217i;
                        position = ((limit2 / i3) * i3) + i3;
                        break;
                    }
                }
                if (position != byteBuffer.position()) {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    m17680d(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f29224p = true;
                    }
                    byteBuffer.limit(limit);
                }
                this.f29221m = i2;
                byteBuffer.limit(limit);
            } else if (i != 1) {
                limit = byteBuffer.limit();
                int m8007l = m8007l(byteBuffer);
                byteBuffer.limit(m8007l);
                this.f29225q += byteBuffer.remaining() / this.f29217i;
                m8005n(byteBuffer, this.f29220l, this.f29223o);
                if (m8007l < limit) {
                    m8006m(this.f29220l, this.f29223o);
                    this.f29221m = 0;
                    byteBuffer.limit(limit);
                }
            } else {
                limit = byteBuffer.limit();
                int m8007l2 = m8007l(byteBuffer);
                int position2 = m8007l2 - byteBuffer.position();
                byte[] bArr = this.f29219k;
                int length = bArr.length;
                int i4 = this.f29222n;
                int i5 = length - i4;
                if (m8007l2 >= limit || position2 >= i5) {
                    int min = Math.min(position2, i5);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f29219k, this.f29222n, min);
                    int i6 = this.f29222n + min;
                    this.f29222n = i6;
                    byte[] bArr2 = this.f29219k;
                    if (i6 == bArr2.length) {
                        if (this.f29224p) {
                            m8006m(bArr2, this.f29223o);
                            long j = this.f29225q;
                            int i7 = this.f29222n;
                            int i8 = this.f29223o;
                            this.f29225q = j + ((i7 - (i8 + i8)) / this.f29217i);
                            i6 = i7;
                        } else {
                            this.f29225q += (i6 - this.f29223o) / this.f29217i;
                        }
                        m8005n(byteBuffer, this.f29219k, i6);
                        this.f29222n = 0;
                        i2 = 2;
                        this.f29221m = i2;
                    }
                    byteBuffer.limit(limit);
                } else {
                    m8006m(bArr, i4);
                    this.f29222n = 0;
                    this.f29221m = 0;
                }
            }
        }
    }

    @Override // com.daaw.kk8
    /* renamed from: c */
    public final di8 mo3570c(di8 di8Var) {
        if (di8Var.f7135c == 2) {
            return this.f29218j ? di8Var : di8.f7132e;
        }
        throw new fi8(di8Var);
    }

    @Override // com.daaw.kk8
    /* renamed from: e */
    public final void mo8013e() {
        if (this.f29218j) {
            this.f29217i = this.f16433b.f7136d;
            int m8008k = m8008k(150000L) * this.f29217i;
            if (this.f29219k.length != m8008k) {
                this.f29219k = new byte[m8008k];
            }
            int m8008k2 = m8008k(20000L) * this.f29217i;
            this.f29223o = m8008k2;
            if (this.f29220l.length != m8008k2) {
                this.f29220l = new byte[m8008k2];
            }
        }
        this.f29221m = 0;
        this.f29225q = 0L;
        this.f29222n = 0;
        this.f29224p = false;
    }

    @Override // com.daaw.kk8
    /* renamed from: f */
    public final void mo8012f() {
        int i = this.f29222n;
        if (i > 0) {
            m8006m(this.f29219k, i);
        }
        if (this.f29224p) {
            return;
        }
        this.f29225q += this.f29223o / this.f29217i;
    }

    @Override // com.daaw.kk8
    /* renamed from: g */
    public final void mo8011g() {
        this.f29218j = false;
        this.f29223o = 0;
        byte[] bArr = it5.f13996f;
        this.f29219k = bArr;
        this.f29220l = bArr;
    }

    /* renamed from: i */
    public final long m8010i() {
        return this.f29225q;
    }

    /* renamed from: j */
    public final void m8009j(boolean z) {
        this.f29218j = z;
    }

    /* renamed from: k */
    public final int m8008k(long j) {
        return (int) ((j * this.f16433b.f7133a) / 1000000);
    }

    /* renamed from: l */
    public final int m8007l(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > 1024) {
                int i = this.f29217i;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: m */
    public final void m8006m(byte[] bArr, int i) {
        m17680d(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f29224p = true;
        }
    }

    /* renamed from: n */
    public final void m8005n(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f29223o);
        int i2 = this.f29223o - min;
        System.arraycopy(bArr, i - i2, this.f29220l, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f29220l, i2, min);
    }

    @Override // com.daaw.kk8, com.daaw.hi8
    public final boolean zzg() {
        return this.f29218j;
    }
}
