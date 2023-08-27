package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* loaded from: classes2.dex */
public final class zzaun<P> {
    private final P zzdhm;
    private final byte[] zzdhn;
    private final zzaxl zzdho;
    private final zzayd zzdhp;

    public zzaun(P p, byte[] bArr, zzaxl zzaxlVar, zzayd zzaydVar) {
        this.zzdhm = p;
        this.zzdhn = Arrays.copyOf(bArr, bArr.length);
        this.zzdho = zzaxlVar;
        this.zzdhp = zzaydVar;
    }

    public final P zzwi() {
        return this.zzdhm;
    }

    public final byte[] zzwj() {
        byte[] bArr = this.zzdhn;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
