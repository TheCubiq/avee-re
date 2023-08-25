package com.daaw;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class c23 extends u13 {
    public MessageDigest c;

    @Override // com.daaw.u13
    public final byte[] b(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int length = split.length;
        int i = 4;
        if (length == 1) {
            int a = b23.a(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(a);
            bArr2 = allocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int a2 = b23.a(split[i2]);
                    int i3 = (a2 >> 16) ^ ((char) a2);
                    byte[] bArr3 = {(byte) i3, (byte) (i3 >> 8)};
                    int i4 = i2 + i2;
                    bArr[i4] = bArr3[0];
                    bArr[i4 + 1] = bArr3[1];
                }
            } else {
                bArr = new byte[length];
                for (int i5 = 0; i5 < split.length; i5++) {
                    int a3 = b23.a(split[i5]);
                    bArr[i5] = (byte) ((a3 >> 24) ^ (((a3 & 255) ^ ((a3 >> 8) & 255)) ^ ((a3 >> 16) & 255)));
                }
            }
            bArr2 = bArr;
        }
        this.c = a();
        synchronized (this.a) {
            MessageDigest messageDigest = this.c;
            if (messageDigest == null) {
                return new byte[0];
            }
            messageDigest.reset();
            this.c.update(bArr2);
            byte[] digest = this.c.digest();
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
