package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
@zzadh
/* loaded from: classes2.dex */
public final class zzgv extends zzgq {
    private MessageDigest zzaje;

    @Override // com.google.android.gms.internal.ads.zzgq
    public final byte[] zzx(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int i = 4;
        if (split.length == 1) {
            int zzz = zzgu.zzz(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(zzz);
            bArr2 = allocate.array();
        } else {
            if (split.length < 5) {
                bArr = new byte[split.length << 1];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int zzz2 = zzgu.zzz(split[i2]);
                    int i3 = (zzz2 >> 16) ^ (65535 & zzz2);
                    byte[] bArr3 = {(byte) i3, (byte) (i3 >> 8)};
                    int i4 = i2 << 1;
                    bArr[i4] = bArr3[0];
                    bArr[i4 + 1] = bArr3[1];
                }
            } else {
                bArr = new byte[split.length];
                for (int i5 = 0; i5 < split.length; i5++) {
                    int zzz3 = zzgu.zzz(split[i5]);
                    bArr[i5] = (byte) ((zzz3 >> 24) ^ (((zzz3 & 255) ^ ((zzz3 >> 8) & 255)) ^ ((zzz3 >> 16) & 255)));
                }
            }
            bArr2 = bArr;
        }
        this.zzaje = zzhg();
        synchronized (this.mLock) {
            if (this.zzaje == null) {
                return new byte[0];
            }
            this.zzaje.reset();
            this.zzaje.update(bArr2);
            byte[] digest = this.zzaje.digest();
            if (digest.length <= 4) {
                i = digest.length;
            }
            byte[] bArr4 = new byte[i];
            System.arraycopy(digest, 0, bArr4, 0, i);
            return bArr4;
        }
    }
}
