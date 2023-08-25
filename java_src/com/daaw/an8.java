package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class an8 extends kk8 {

    /* renamed from: i */
    public int f3336i;

    /* renamed from: j */
    public int f3337j;

    /* renamed from: k */
    public boolean f3338k;

    /* renamed from: l */
    public int f3339l;

    /* renamed from: m */
    public byte[] f3340m = it5.f13996f;

    /* renamed from: n */
    public int f3341n;

    /* renamed from: o */
    public long f3342o;

    @Override // com.daaw.hi8
    /* renamed from: b */
    public final void mo3498b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.f3339l);
        this.f3342o += min / this.f16433b.f7136d;
        this.f3339l -= min;
        byteBuffer.position(position + min);
        if (this.f3339l > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.f3341n + i2) - this.f3340m.length;
        ByteBuffer m17680d = m17680d(length);
        int m19416P = it5.m19416P(length, 0, this.f3341n);
        m17680d.put(this.f3340m, 0, m19416P);
        int m19416P2 = it5.m19416P(length - m19416P, 0, i2);
        byteBuffer.limit(byteBuffer.position() + m19416P2);
        m17680d.put(byteBuffer);
        byteBuffer.limit(limit);
        int i3 = i2 - m19416P2;
        int i4 = this.f3341n - m19416P;
        this.f3341n = i4;
        byte[] bArr = this.f3340m;
        System.arraycopy(bArr, m19416P, bArr, 0, i4);
        byteBuffer.get(this.f3340m, this.f3341n, i3);
        this.f3341n += i3;
        m17680d.flip();
    }

    @Override // com.daaw.kk8
    /* renamed from: c */
    public final di8 mo3570c(di8 di8Var) {
        if (di8Var.f7135c == 2) {
            this.f3338k = true;
            return (this.f3336i == 0 && this.f3337j == 0) ? di8.f7132e : di8Var;
        }
        throw new fi8(di8Var);
    }

    @Override // com.daaw.kk8
    /* renamed from: e */
    public final void mo8013e() {
        if (this.f3338k) {
            this.f3338k = false;
            int i = this.f3337j;
            int i2 = this.f16433b.f7136d;
            this.f3340m = new byte[i * i2];
            this.f3339l = this.f3336i * i2;
        }
        this.f3341n = 0;
    }

    @Override // com.daaw.kk8
    /* renamed from: f */
    public final void mo8012f() {
        int i;
        if (this.f3338k) {
            if (this.f3341n > 0) {
                this.f3342o += i / this.f16433b.f7136d;
            }
            this.f3341n = 0;
        }
    }

    @Override // com.daaw.kk8
    /* renamed from: g */
    public final void mo8011g() {
        this.f3340m = it5.f13996f;
    }

    /* renamed from: i */
    public final long m27319i() {
        return this.f3342o;
    }

    /* renamed from: j */
    public final void m27318j() {
        this.f3342o = 0L;
    }

    /* renamed from: k */
    public final void m27317k(int i, int i2) {
        this.f3336i = i;
        this.f3337j = i2;
    }

    @Override // com.daaw.kk8, com.daaw.hi8
    public final ByteBuffer zzb() {
        int i;
        if (super.zzh() && (i = this.f3341n) > 0) {
            m17680d(i).put(this.f3340m, 0, this.f3341n).flip();
            this.f3341n = 0;
        }
        return super.zzb();
    }

    @Override // com.daaw.kk8, com.daaw.hi8
    public final boolean zzh() {
        return super.zzh() && this.f3341n == 0;
    }
}
