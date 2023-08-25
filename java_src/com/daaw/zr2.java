package com.daaw;

import android.annotation.TargetApi;
import android.media.MediaCodec;
/* loaded from: classes.dex */
public final class zr2 {

    /* renamed from: a */
    public byte[] f35431a;

    /* renamed from: b */
    public byte[] f35432b;

    /* renamed from: c */
    public int f35433c;

    /* renamed from: d */
    public int[] f35434d;

    /* renamed from: e */
    public int[] f35435e;

    /* renamed from: f */
    public int f35436f;

    /* renamed from: g */
    public final MediaCodec.CryptoInfo f35437g;

    /* renamed from: h */
    public final yr2 f35438h;

    public zr2() {
        int i = pz2.f23547a;
        MediaCodec.CryptoInfo cryptoInfo = i >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.f35437g = cryptoInfo;
        this.f35438h = i >= 24 ? new yr2(cryptoInfo, null) : null;
    }

    @TargetApi(16)
    /* renamed from: a */
    public final MediaCodec.CryptoInfo m1964a() {
        return this.f35437g;
    }

    /* renamed from: b */
    public final void m1963b(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2) {
        this.f35436f = i;
        this.f35434d = iArr;
        this.f35435e = iArr2;
        this.f35432b = bArr;
        this.f35431a = bArr2;
        this.f35433c = 1;
        int i3 = pz2.f23547a;
        if (i3 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.f35437g;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = 1;
            if (i3 >= 24) {
                yr2.m3382a(this.f35438h, 0, 0);
            }
        }
    }
}
