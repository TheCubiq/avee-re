package com.google.android.gms.internal.ads;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfn implements com.google.android.gms.ads.internal.gmsg.zzv<zzwb> {
    private final /* synthetic */ zzff zzaga;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfn(zzff zzffVar) {
        this.zzaga = zzffVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final /* synthetic */ void zza(zzwb zzwbVar, Map map) {
        zzet zzetVar;
        com.google.android.gms.ads.internal.gmsg.zzab zzabVar;
        zzwb zzwbVar2 = zzwbVar;
        zzetVar = this.zzaga.zzafq;
        if (zzetVar.zzc(map)) {
            zzabVar = this.zzaga.zzafw;
            zzabVar.zza(zzwbVar2, map);
        }
    }
}
