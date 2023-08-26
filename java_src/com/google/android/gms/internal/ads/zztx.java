package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
@zzadh
/* loaded from: classes2.dex */
public final class zztx {
    private final Object[] mParams;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zztx(zzjj zzjjVar, String str, int i) {
        this.mParams = com.google.android.gms.ads.internal.zzp.zza((String) zzkb.zzik().zzd(zznk.zzaza), zzjjVar, str, i, null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zztx) {
            return Arrays.equals(this.mParams, ((zztx) obj).mParams);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.mParams);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.mParams);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 24);
        sb.append("[InterstitialAdPoolKey ");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
