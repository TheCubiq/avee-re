package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.zzakb;
import org.json.JSONObject;
/* loaded from: classes.dex */
final class zzx implements Runnable {
    private final /* synthetic */ JSONObject zzbmk;
    private final /* synthetic */ zzw zzbml;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzx(zzw zzwVar, JSONObject jSONObject) {
        this.zzbml = zzwVar;
        this.zzbmk = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzbml.zzbmi.zza("fetchHttpRequestCompleted", this.zzbmk);
        zzakb.zzck("Dispatched http response.");
    }
}
