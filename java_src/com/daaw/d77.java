package com.daaw;

import android.media.MediaCodec;
import java.util.Objects;
/* loaded from: classes.dex */
public final class d77 {

    /* renamed from: a */
    public byte[] f6587a;

    /* renamed from: b */
    public byte[] f6588b;

    /* renamed from: c */
    public int f6589c;

    /* renamed from: d */
    public int[] f6590d;

    /* renamed from: e */
    public int[] f6591e;

    /* renamed from: f */
    public int f6592f;

    /* renamed from: g */
    public int f6593g;

    /* renamed from: h */
    public int f6594h;

    /* renamed from: i */
    public final MediaCodec.CryptoInfo f6595i;

    /* renamed from: j */
    public final a67 f6596j;

    public d77() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f6595i = cryptoInfo;
        this.f6596j = it5.f13991a >= 24 ? new a67(cryptoInfo, null) : null;
    }

    /* renamed from: a */
    public final MediaCodec.CryptoInfo m24610a() {
        return this.f6595i;
    }

    /* renamed from: b */
    public final void m24609b(int i) {
        if (i == 0) {
            return;
        }
        if (this.f6590d == null) {
            int[] iArr = new int[1];
            this.f6590d = iArr;
            this.f6595i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f6590d;
        iArr2[0] = iArr2[0] + i;
    }

    /* renamed from: c */
    public final void m24608c(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f6592f = i;
        this.f6590d = iArr;
        this.f6591e = iArr2;
        this.f6588b = bArr;
        this.f6587a = bArr2;
        this.f6589c = i2;
        this.f6593g = i3;
        this.f6594h = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.f6595i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (it5.f13991a >= 24) {
            a67 a67Var = this.f6596j;
            Objects.requireNonNull(a67Var);
            a67.m27593a(a67Var, i3, i4);
        }
    }
}
