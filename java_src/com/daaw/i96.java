package com.daaw;

import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class i96 implements h76 {

    /* renamed from: a */
    public final JSONObject f13382a;

    public i96(JSONObject jSONObject) {
        this.f13382a = jSONObject;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        try {
            JSONObject zzf = zzbu.zzf((JSONObject) obj, "content_info");
            JSONObject jSONObject = this.f13382a;
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
