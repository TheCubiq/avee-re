package com.google.android.gms.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class LoadAdError extends AdError {

    /* renamed from: e */
    public final ResponseInfo f36024e;

    public LoadAdError(int i, String str, String str2, AdError adError, ResponseInfo responseInfo) {
        super(i, str, str2, adError);
        this.f36024e = responseInfo;
    }

    public ResponseInfo getResponseInfo() {
        return this.f36024e;
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
