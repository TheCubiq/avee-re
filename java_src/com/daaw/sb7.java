package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class sb7 extends mb7 {
    public sb7(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // com.daaw.mb7
    /* renamed from: a */
    public final int mo10469a() {
        return 24;
    }

    @Override // com.daaw.mb7
    /* renamed from: b */
    public final int[] mo10468b(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 6) {
            int[] iArr2 = new int[16];
            ib7.m19984b(r0, this.f18772a);
            int[] iArr3 = {0, 0, 0, 0, iArr3[12], iArr3[13], iArr3[14], iArr3[15], 0, 0, 0, 0, iArr[0], iArr[1], iArr[2], iArr[3]};
            ib7.m19983c(iArr3);
            ib7.m19984b(iArr2, Arrays.copyOf(iArr3, 8));
            iArr2[12] = i;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }
}
