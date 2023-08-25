package com.daaw;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class c23 extends u13 {

    /* renamed from: c */
    public MessageDigest f5380c;

    @Override // com.daaw.u13
    /* renamed from: b */
    public final byte[] mo8635b(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int length = split.length;
        int i = 4;
        if (length == 1) {
            int m26522a = b23.m26522a(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(m26522a);
            bArr2 = allocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int m26522a2 = b23.m26522a(split[i2]);
                    int i3 = (m26522a2 >> 16) ^ ((char) m26522a2);
                    byte[] bArr3 = {(byte) i3, (byte) (i3 >> 8)};
                    int i4 = i2 + i2;
                    bArr[i4] = bArr3[0];
                    bArr[i4 + 1] = bArr3[1];
                }
            } else {
                bArr = new byte[length];
                for (int i5 = 0; i5 < split.length; i5++) {
                    int m26522a3 = b23.m26522a(split[i5]);
                    bArr[i5] = (byte) ((m26522a3 >> 24) ^ (((m26522a3 & 255) ^ ((m26522a3 >> 8) & 255)) ^ ((m26522a3 >> 16) & 255)));
                }
            }
            bArr2 = bArr;
        }
        this.f5380c = m8636a();
        synchronized (this.f28320a) {
            MessageDigest messageDigest = this.f5380c;
            if (messageDigest == null) {
                return new byte[0];
            }
            messageDigest.reset();
            this.f5380c.update(bArr2);
            byte[] digest = this.f5380c.digest();
            int length2 = digest.length;
            if (length2 <= 4) {
                i = length2;
            }
            byte[] bArr4 = new byte[i];
            System.arraycopy(digest, 0, bArr4, 0, i);
            return bArr4;
        }
    }
}
