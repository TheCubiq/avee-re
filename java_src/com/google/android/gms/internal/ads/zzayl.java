package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;
/* loaded from: classes2.dex */
final class zzayl extends zzazn {
    private static final byte[] zzdnb = new byte[16];

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzayl(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    private static void zza(int[] iArr, int i, int i2, int i3, int i4) {
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = rotateLeft(iArr[i4] ^ iArr[i], 16);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = rotateLeft(iArr[i2] ^ iArr[i3], 12);
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = rotateLeft(iArr[i] ^ iArr[i4], 8);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = rotateLeft(iArr[i2] ^ iArr[i3], 7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzazn
    public final int zzaao() {
        return 12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzazn
    public final ByteBuffer zzb(byte[] bArr, int i) {
        int[] iArr = new int[16];
        System.arraycopy(zzazn.zzdoo, 0, iArr, 0, zzdoo.length);
        int[] zza = zza(ByteBuffer.wrap(this.zzdop.getBytes()));
        int i2 = 4;
        System.arraycopy(zza, 0, iArr, 4, zza.length);
        iArr[12] = i;
        System.arraycopy(zza(ByteBuffer.wrap(bArr)), 0, iArr, 13, 3);
        int[] iArr2 = (int[]) iArr.clone();
        int i3 = 0;
        while (i3 < 10) {
            zza(iArr2, 0, i2, 8, 12);
            zza(iArr2, 1, 5, 9, 13);
            zza(iArr2, 2, 6, 10, 14);
            zza(iArr2, 3, 7, 11, 15);
            zza(iArr2, 0, 5, 10, 15);
            zza(iArr2, 1, 6, 11, 12);
            zza(iArr2, 2, 7, 8, 13);
            zza(iArr2, 3, 4, 9, 14);
            i3++;
            i2 = 4;
        }
        for (int i4 = 0; i4 < 16; i4++) {
            iArr[i4] = iArr[i4] + iArr2[i4];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(iArr, 0, 16);
        return order;
    }
}
