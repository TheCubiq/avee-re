package com.daaw;

import android.annotation.TargetApi;
import android.media.MediaCodec;
/* renamed from: com.daaw.jn */
/* loaded from: classes.dex */
public final class C1845jn {

    /* renamed from: a */
    public byte[] f15217a;

    /* renamed from: b */
    public byte[] f15218b;

    /* renamed from: c */
    public int f15219c;

    /* renamed from: d */
    public int[] f15220d;

    /* renamed from: e */
    public int[] f15221e;

    /* renamed from: f */
    public int f15222f;

    /* renamed from: g */
    public int f15223g;

    /* renamed from: h */
    public int f15224h;

    /* renamed from: i */
    public final MediaCodec.CryptoInfo f15225i;

    /* renamed from: j */
    public final C1847b f15226j;

    @TargetApi(24)
    /* renamed from: com.daaw.jn$b */
    /* loaded from: classes.dex */
    public static final class C1847b {

        /* renamed from: a */
        public final MediaCodec.CryptoInfo f15227a;

        /* renamed from: b */
        public final MediaCodec.CryptoInfo.Pattern f15228b;

        public C1847b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f15227a = cryptoInfo;
            this.f15228b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* renamed from: b */
        public final void m18399b(int i, int i2) {
            this.f15228b.set(i, i2);
            this.f15227a.setPattern(this.f15228b);
        }
    }

    public C1845jn() {
        int i = sq1.f26525a;
        MediaCodec.CryptoInfo m18403b = i >= 16 ? m18403b() : null;
        this.f15225i = m18403b;
        this.f15226j = i >= 24 ? new C1847b(m18403b) : null;
    }

    @TargetApi(16)
    /* renamed from: a */
    public MediaCodec.CryptoInfo m18404a() {
        return this.f15225i;
    }

    @TargetApi(16)
    /* renamed from: b */
    public final MediaCodec.CryptoInfo m18403b() {
        return new MediaCodec.CryptoInfo();
    }

    /* renamed from: c */
    public void m18402c(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f15222f = i;
        this.f15220d = iArr;
        this.f15221e = iArr2;
        this.f15218b = bArr;
        this.f15217a = bArr2;
        this.f15219c = i2;
        this.f15223g = i3;
        this.f15224h = i4;
        if (sq1.f26525a >= 16) {
            m18401d();
        }
    }

    @TargetApi(16)
    /* renamed from: d */
    public final void m18401d() {
        MediaCodec.CryptoInfo cryptoInfo = this.f15225i;
        cryptoInfo.numSubSamples = this.f15222f;
        cryptoInfo.numBytesOfClearData = this.f15220d;
        cryptoInfo.numBytesOfEncryptedData = this.f15221e;
        cryptoInfo.key = this.f15218b;
        cryptoInfo.iv = this.f15217a;
        cryptoInfo.mode = this.f15219c;
        if (sq1.f26525a >= 24) {
            this.f15226j.m18399b(this.f15223g, this.f15224h);
        }
    }
}
