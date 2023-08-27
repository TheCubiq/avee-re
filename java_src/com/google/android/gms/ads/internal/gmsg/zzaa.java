package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzaoj;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;
@zzadh
/* loaded from: classes.dex */
public final class zzaa implements zzv<Object> {
    private final HashMap<String, zzaoj<JSONObject>> zzbmv = new HashMap<>();

    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("request_id");
        String str2 = map.get("fetched_ad");
        zzakb.zzck("Received ad from the cache.");
        zzaoj<JSONObject> zzaojVar = this.zzbmv.get(str);
        try {
            if (zzaojVar == null) {
                zzakb.e("Could not find the ad request for the corresponding ad response.");
            } else {
                zzaojVar.set(new JSONObject(str2));
            }
        } catch (JSONException e) {
            zzakb.zzb("Failed constructing JSON object from value passed from javascript", e);
            zzaojVar.set(null);
        } finally {
            this.zzbmv.remove(str);
        }
    }

    public final Future<JSONObject> zzas(String str) {
        zzaoj<JSONObject> zzaojVar = new zzaoj<>();
        this.zzbmv.put(str, zzaojVar);
        return zzaojVar;
    }

    public final void zzat(String str) {
        zzaoj<JSONObject> zzaojVar = this.zzbmv.get(str);
        if (zzaojVar == null) {
            zzakb.e("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!zzaojVar.isDone()) {
            zzaojVar.cancel(true);
        }
        this.zzbmv.remove(str);
    }
}
