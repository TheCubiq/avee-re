package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class m98 extends l68 {
    public final byte[] q;

    public m98(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.q = bArr;
    }

    @Override // com.daaw.l68
    public final byte[] g3() {
        return this.q;
    }
}
