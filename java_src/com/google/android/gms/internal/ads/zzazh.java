package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
public final class zzazh {
    private final byte[] data;

    private zzazh(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.data = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    public static zzazh zzm(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new zzazh(bArr, 0, bArr.length);
    }

    public final byte[] getBytes() {
        byte[] bArr = this.data;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
