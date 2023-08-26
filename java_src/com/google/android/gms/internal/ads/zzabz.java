package com.google.android.gms.internal.ads;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzabz implements com.google.android.gms.ads.internal.gmsg.zzv<Object> {
    private final /* synthetic */ zzabv zzcal;
    private final /* synthetic */ zzos zzcam;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzabz(zzabv zzabvVar, zzos zzosVar) {
        this.zzcal = zzabvVar;
        this.zzcam = zzosVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final void zza(Object obj, Map<String, String> map) {
        this.zzcal.zzc(this.zzcam, map.get("asset"));
    }
}
