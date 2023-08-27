package com.google.android.gms.common.util;
/* loaded from: classes.dex */
public class MurmurHash3 {
    public static int murmurhash3_x86_32(byte[] bArr, int i, int i2, int i3) {
        int i4 = (i2 & (-4)) + i;
        while (i < i4) {
            int i5 = ((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | (bArr[i + 3] << 24)) * (-862048943);
            int i6 = i3 ^ (((i5 << 15) | (i5 >>> 17)) * 461845907);
            i3 = (((i6 >>> 19) | (i6 << 13)) * 5) - 430675100;
            i += 4;
        }
        int i7 = i2 & 3;
        if (i7 != 1) {
            if (i7 != 2) {
                r6 = i7 == 3 ? (bArr[i4 + 2] & 255) << 16 : 0;
                int i8 = i3 ^ i2;
                int i9 = (i8 ^ (i8 >>> 16)) * (-2048144789);
                int i10 = (i9 ^ (i9 >>> 13)) * (-1028477387);
                return i10 ^ (i10 >>> 16);
            }
            r6 |= (bArr[i4 + 1] & 255) << 8;
        }
        int i11 = ((bArr[i4] & 255) | r6) * (-862048943);
        i3 ^= ((i11 >>> 17) | (i11 << 15)) * 461845907;
        int i82 = i3 ^ i2;
        int i92 = (i82 ^ (i82 >>> 16)) * (-2048144789);
        int i102 = (i92 ^ (i92 >>> 13)) * (-1028477387);
        return i102 ^ (i102 >>> 16);
    }

    private MurmurHash3() {
    }
}
