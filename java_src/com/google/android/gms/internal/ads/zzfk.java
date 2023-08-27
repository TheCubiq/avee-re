package com.google.android.gms.internal.ads;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfk implements com.google.android.gms.ads.internal.gmsg.zzv<zzwb> {
    private final /* synthetic */ zzff zzaga;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfk(zzff zzffVar) {
        this.zzaga = zzffVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final /* synthetic */ void zza(zzwb zzwbVar, Map map) {
        zzet zzetVar;
        zzet zzetVar2;
        zzetVar = this.zzaga.zzafq;
        if (zzetVar.zzc(map)) {
            zzetVar2 = this.zzaga.zzafq;
            zzetVar2.zzd(map);
        }
    }
}
