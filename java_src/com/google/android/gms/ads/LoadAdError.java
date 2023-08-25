package com.google.android.gms.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class LoadAdError extends AdError {
    public final ResponseInfo e;

    public LoadAdError(int i, String str, String str2, AdError adError, ResponseInfo responseInfo) {
        super(i, str, str2, adError);
        this.e = responseInfo;
    }

    public ResponseInfo getResponseInfo() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.AdError
    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    @Override // com.google.android.gms.ads.AdError
    public final JSONObject zzb() {
        JSONObject zzb = super.zzb();
        ResponseInfo responseInfo = getResponseInfo();
        zzb.put("Response Info", responseInfo == null ? "null" : responseInfo.zzd());
        return zzb;
    }
}
