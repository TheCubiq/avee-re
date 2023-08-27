package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* loaded from: classes2.dex */
abstract class zzazn implements zzazi {
    static final int[] zzdoo = zza(ByteBuffer.wrap(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107}));
    final zzazh zzdop;
    private final int zzdoq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazn(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zzdop = zzazh.zzm(bArr);
        this.zzdoq = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int rotateLeft(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] zza(ByteBuffer byteBuffer) {
        IntBuffer asIntBuffer = byteBuffer.order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (byteBuffer.remaining() - zzaao() < bArr.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        byte[] zzbh = zzazl.zzbh(zzaao());
        byteBuffer.put(zzbh);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int remaining = wrap.remaining();
        int i = (remaining / 64) + 1;
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer zzb = zzb(zzbh, this.zzdoq + i2);
            if (i2 == i - 1) {
                zzayk.zza(byteBuffer, wrap, zzb, remaining % 64);
            } else {
                zzayk.zza(byteBuffer, wrap, zzb, 64);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzaao();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract ByteBuffer zzb(byte[] bArr, int i);

    @Override // com.google.android.gms.internal.ads.zzazi
    public final byte[] zzk(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        zzaao();
        if (length <= 2147483635) {
            ByteBuffer allocate = ByteBuffer.allocate(zzaao() + bArr.length);
            zza(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
