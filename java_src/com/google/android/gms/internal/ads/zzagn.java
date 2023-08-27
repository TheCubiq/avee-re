package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;
@zzadh
/* loaded from: classes2.dex */
public final class zzagn implements zzafr {
    private zzwf<JSONObject, JSONObject> zzcko;
    private zzwf<JSONObject, JSONObject> zzckt;

    public zzagn(Context context) {
        this.zzckt = com.google.android.gms.ads.internal.zzbv.zzey().zzb(context, zzang.zzsl()).zza("google.afma.request.getAdDictionary", zzwk.zzbrc, zzwk.zzbrc);
        this.zzcko = com.google.android.gms.ads.internal.zzbv.zzey().zzb(context, zzang.zzsl()).zza("google.afma.sdkConstants.getSdkConstants", zzwk.zzbrc, zzwk.zzbrc);
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final zzwf<JSONObject, JSONObject> zzof() {
        return this.zzckt;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final zzwf<JSONObject, JSONObject> zzog() {
        return this.zzcko;
    }
}
