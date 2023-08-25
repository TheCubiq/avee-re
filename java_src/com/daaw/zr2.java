package com.daaw;

import android.annotation.TargetApi;
import android.media.MediaCodec;
/* loaded from: classes.dex */
public final class zr2 {
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public final MediaCodec.CryptoInfo g;
    public final yr2 h;

    public zr2() {
        int i = pz2.a;
        MediaCodec.CryptoInfo cryptoInfo = i >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.g = cryptoInfo;
        this.h = i >= 24 ? new yr2(cryptoInfo, null) : null;
    }

    @TargetApi(16)
    public final MediaCodec.CryptoInfo a() {
        return this.g;
    }

    public final void b(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2) {
        this.f = i;
        this.d = iArr;
        this.e = iArr2;
        this.b = bArr;
        this.a = bArr2;
        this.c = 1;
        int i3 = pz2.a;
        if (i3 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.g;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = 1;
            if (i3 >= 24) {
                yr2.a(this.h, 0, 0);
            }
        }
    }
}
