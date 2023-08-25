package com.google.android.gms.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class AdError {
    public static final String UNDEFINED_DOMAIN = "undefined";

    /* renamed from: a */
    public final int f35998a;

    /* renamed from: b */
    public final String f35999b;

    /* renamed from: c */
    public final String f36000c;

    /* renamed from: d */
    public final AdError f36001d;

    public AdError(int i, String str, String str2) {
        this(i, str, str2, null);
    }

    public AdError(int i, String str, String str2, AdError adError) {
        this.f35998a = i;
        this.f35999b = str;
        this.f36000c = str2;
        this.f36001d = adError;
    }

    public AdError getCause() {
        return this.f36001d;
    }

    public int getCode() {
        return this.f35998a;
    }

    public String getDomain() {
        return this.f36000c;
    }

    public String getMessage() {
        return this.f35999b;
    }

    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final com.google.android.gms.ads.internal.client.zze zza() {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        if (this.f36001d == null) {
            zzeVar = null;
        } else {
            AdError adError = this.f36001d;
            zzeVar = new com.google.android.gms.ads.internal.client.zze(adError.f35998a, adError.f35999b, adError.f36000c, null, null);
        }
        return new com.google.android.gms.ads.internal.client.zze(this.f35998a, this.f35999b, this.f36000c, zzeVar, null);
    }

    public JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f35998a);
        jSONObject.put("Message", this.f35999b);
        jSONObject.put("Domain", this.f36000c);
        AdError adError = this.f36001d;
        jSONObject.put("Cause", adError == null ? "null" : adError.zzb());
        return jSONObject;
    }
}
