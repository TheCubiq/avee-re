package com.google.android.gms.internal.ads;

import org.json.JSONObject;
/* loaded from: classes2.dex */
final class zzacz implements zzanl<zzaqw> {
    private final /* synthetic */ String val$message;
    private final /* synthetic */ JSONObject zzcbv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzacz(zzacq zzacqVar, String str, JSONObject jSONObject) {
        this.val$message = str;
        this.zzcbv = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzanl
    public final void zzb(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzanl
    public final /* synthetic */ void zzh(zzaqw zzaqwVar) {
        zzaqwVar.zza(this.val$message, this.zzcbv);
    }
}
