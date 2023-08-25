package com.google.android.gms.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzu;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AdapterResponseInfo {
    public final zzu a;
    public final AdError b;

    public AdapterResponseInfo(zzu zzuVar) {
        this.a = zzuVar;
        com.google.android.gms.ads.internal.client.zze zzeVar = zzuVar.zzc;
        this.b = zzeVar == null ? null : zzeVar.zza();
    }

    public static AdapterResponseInfo zza(zzu zzuVar) {
        if (zzuVar != null) {
            return new AdapterResponseInfo(zzuVar);
        }
        return null;
    }

    public AdError getAdError() {
        return this.b;
    }

    public String getAdSourceId() {
        return this.a.zzf;
    }

    public String getAdSourceInstanceId() {
        return this.a.zzh;
    }

    public String getAdSourceInstanceName() {
        return this.a.zzg;
    }

    public String getAdSourceName() {
        return this.a.zze;
    }

    public String getAdapterClassName() {
        return this.a.zza;
    }

    public Bundle getCredentials() {
        return this.a.zzd;
    }

    public long getLatencyMillis() {
        return this.a.zzb;
    }

    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.a.zza);
        jSONObject.put("Latency", this.a.zzb);
        String adSourceName = getAdSourceName();
        if (adSourceName == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", adSourceName);
        }
        String adSourceId = getAdSourceId();
        if (adSourceId == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", adSourceId);
        }
        String adSourceInstanceName = getAdSourceInstanceName();
        if (adSourceInstanceName == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", adSourceInstanceName);
        }
        String adSourceInstanceId = getAdSourceInstanceId();
        if (adSourceInstanceId == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", adSourceInstanceId);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.a.zzd.keySet()) {
            jSONObject2.put(str, this.a.zzd.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        AdError adError = this.b;
        if (adError == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", adError.zzb());
        }
        return jSONObject;
    }
}
