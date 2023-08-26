package com.google.android.gms.internal.ads;

import java.math.BigInteger;
@zzadh
/* loaded from: classes2.dex */
public final class zzajt {
    private BigInteger zzcqk = BigInteger.ONE;

    public final synchronized String zzql() {
        String bigInteger;
        bigInteger = this.zzcqk.toString();
        this.zzcqk = this.zzcqk.add(BigInteger.ONE);
        return bigInteger;
    }
}
