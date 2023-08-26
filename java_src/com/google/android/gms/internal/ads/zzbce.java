package com.google.android.gms.internal.ads;

import java.util.List;
/* loaded from: classes2.dex */
abstract class zzbce {
    private static final zzbce zzdvq = new zzbcg();
    private static final zzbce zzdvr = new zzbch();

    private zzbce() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbce zzady() {
        return zzdvq;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbce zzadz() {
        return zzdvr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> zza(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void zza(Object obj, Object obj2, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(Object obj, long j);
}
