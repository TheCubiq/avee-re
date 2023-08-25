package com.google.android.gms.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class AdError {
    public static final String UNDEFINED_DOMAIN = "undefined";
    public final int a;
    public final String b;
    public final String c;
    public final AdError d;

    public AdError(int i, String str, String str2) {
        this(i, str, str2, null);
    }

    public AdError(int i, String str, String str2, AdError adError) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = adError;
    }

    public AdError getCause() {
        return this.d;
    }

    public int getCode() {
        return this.a;
    }

    public String getDomain() {
        return this.c;
    }

    public String getMessage() {
        return this.b;
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
        if (this.d == null) {
            zzeVar = null;
        } else {
            AdError adError = this.d;
            zzeVar = new com.google.android.gms.ads.internal.client.zze(adError.a, adError.b, adError.c, null, null);
        }
        return new com.google.android.gms.ads.internal.client.zze(this.a, this.b, this.c, zzeVar, null);
    }

    public JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.a);
        jSONObject.put("Message", this.b);
        jSONObject.put("Domain", this.c);
        AdError adError = this.d;
        jSONObject.put("Cause", adError == null ? "null" : adError.zzb());
        return jSONObject;
    }
}
