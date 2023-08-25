package com.google.android.gms.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.daaw.k04;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzu;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ResponseInfo {
    public final zzdn a;
    public final List b = new ArrayList();
    public AdapterResponseInfo c;

    public ResponseInfo(zzdn zzdnVar) {
        this.a = zzdnVar;
        if (zzdnVar != null) {
            try {
                List<zzu> zzj = zzdnVar.zzj();
                if (zzj != null) {
                    for (zzu zzuVar : zzj) {
                        AdapterResponseInfo zza = AdapterResponseInfo.zza(zzuVar);
                        if (zza != null) {
                            this.b.add(zza);
                        }
                    }
                }
            } catch (RemoteException e) {
                k04.zzh("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
            }
        }
        zzdn zzdnVar2 = this.a;
        if (zzdnVar2 == null) {
            return;
        }
        try {
            zzu zzf = zzdnVar2.zzf();
            if (zzf != null) {
                this.c = AdapterResponseInfo.zza(zzf);
            }
        } catch (RemoteException e2) {
            k04.zzh("Could not forward getLoadedAdapterResponse to ResponseInfo.", e2);
        }
    }

    public static ResponseInfo zza(zzdn zzdnVar) {
        if (zzdnVar != null) {
            return new ResponseInfo(zzdnVar);
        }
        return null;
    }

    public static ResponseInfo zzb(zzdn zzdnVar) {
        return new ResponseInfo(zzdnVar);
    }

    public List<AdapterResponseInfo> getAdapterResponses() {
        return this.b;
    }

    public AdapterResponseInfo getLoadedAdapterResponseInfo() {
        return this.c;
    }

    public String getMediationAdapterClassName() {
        try {
            zzdn zzdnVar = this.a;
            if (zzdnVar != null) {
                return zzdnVar.zzg();
            }
            return null;
        } catch (RemoteException e) {
            k04.zzh("Could not forward getMediationAdapterClassName to ResponseInfo.", e);
            return null;
        }
    }

    public Bundle getResponseExtras() {
        try {
            zzdn zzdnVar = this.a;
            if (zzdnVar != null) {
                return zzdnVar.zze();
            }
        } catch (RemoteException e) {
            k04.zzh("Could not forward getResponseExtras to ResponseInfo.", e);
        }
        return new Bundle();
    }

    public String getResponseId() {
        try {
            zzdn zzdnVar = this.a;
            if (zzdnVar != null) {
                return zzdnVar.zzi();
            }
            return null;
        } catch (RemoteException e) {
            k04.zzh("Could not forward getResponseId to ResponseInfo.", e);
            return null;
        }
    }

    public String toString() {
        try {
            return zzd().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final zzdn zzc() {
        return this.a;
    }

    public final JSONObject zzd() {
        JSONObject jSONObject = new JSONObject();
        String responseId = getResponseId();
        if (responseId == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", responseId);
        }
        String mediationAdapterClassName = getMediationAdapterClassName();
        if (mediationAdapterClassName == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", mediationAdapterClassName);
        }
        JSONArray jSONArray = new JSONArray();
        for (AdapterResponseInfo adapterResponseInfo : this.b) {
            jSONArray.put(adapterResponseInfo.zzb());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        AdapterResponseInfo adapterResponseInfo2 = this.c;
        if (adapterResponseInfo2 != null) {
            jSONObject.put("Loaded Adapter Response", adapterResponseInfo2.zzb());
        }
        Bundle responseExtras = getResponseExtras();
        if (responseExtras != null) {
            jSONObject.put("Response Extras", zzay.zzb().n(responseExtras));
        }
        return jSONObject;
    }
}
