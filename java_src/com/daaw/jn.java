package com.daaw;

import android.annotation.TargetApi;
import android.media.MediaCodec;
/* loaded from: classes.dex */
public final class jn {
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final b j;

    @TargetApi(24)
    /* loaded from: classes.dex */
    public static final class b {
        public final MediaCodec.CryptoInfo a;
        public final MediaCodec.CryptoInfo.Pattern b;

        public b(MediaCodec.CryptoInfo cryptoInfo) {
            this.a = cryptoInfo;
            this.b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        public final void b(int i, int i2) {
            this.b.set(i, i2);
            this.a.setPattern(this.b);
        }
    }

    public jn() {
        int i = sq1.a;
        MediaCodec.CryptoInfo b2 = i >= 16 ? b() : null;
        this.i = b2;
        this.j = i >= 24 ? new b(b2) : null;
    }

    @TargetApi(16)
    public MediaCodec.CryptoInfo a() {
        return this.i;
    }

    @TargetApi(16)
    public final MediaCodec.CryptoInfo b() {
        return new MediaCodec.CryptoInfo();
    }

    public void c(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f = i;
        this.d = iArr;
        this.e = iArr2;
        this.b = bArr;
        this.a = bArr2;
        this.c = i2;
        this.g = i3;
        this.h = i4;
        if (sq1.a >= 16) {
            d();
        }
    }

    @TargetApi(16)
    public final void d() {
        MediaCodec.CryptoInfo cryptoInfo = this.i;
        cryptoInfo.numSubSamples = this.f;
        cryptoInfo.numBytesOfClearData = this.d;
        cryptoInfo.numBytesOfEncryptedData = this.e;
        cryptoInfo.key = this.b;
        cryptoInfo.iv = this.a;
        cryptoInfo.mode = this.c;
        if (sq1.a >= 24) {
            this.j.b(this.g, this.h);
        }
    }
}
