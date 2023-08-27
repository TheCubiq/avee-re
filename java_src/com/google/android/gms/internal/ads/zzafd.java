package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzafd implements zzaoo<zzwb> {
    private final /* synthetic */ zzafc zzcgm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafd(zzafc zzafcVar) {
        this.zzcgm = zzafcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaoo
    public final /* synthetic */ void zze(zzwb zzwbVar) {
        com.google.android.gms.ads.internal.gmsg.zzaa zzaaVar;
        try {
            zzwbVar.zzb("AFMA_getAdapterLessMediationAd", this.zzcgm.zzcgk);
        } catch (Exception e) {
            zzakb.zzb("Error requesting an ad url", e);
            zzaaVar = zzafa.zzcgg;
            zzaaVar.zzat(this.zzcgm.zzcgl);
        }
    }
}
