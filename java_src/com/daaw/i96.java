package com.daaw;

import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class i96 implements h76 {
    public final JSONObject a;

    public i96(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        try {
            JSONObject zzf = zzbu.zzf((JSONObject) obj, "content_info");
            JSONObject jSONObject = this.a;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                zzf.put(next, jSONObject.get(next));
            }
        } catch (JSONException unused) {
            zze.zza("Failed putting app indexing json.");
        }
    }
}
