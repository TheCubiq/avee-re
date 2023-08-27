package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@zzadh
/* loaded from: classes2.dex */
public final class zzacp implements zzacd<zzos> {
    private final boolean zzcbk;

    public zzacp(boolean z) {
        this.zzcbk = z;
    }

    @Override // com.google.android.gms.internal.ads.zzacd
    public final /* synthetic */ zzos zza(zzabv zzabvVar, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException {
        SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
        SimpleArrayMap simpleArrayMap2 = new SimpleArrayMap();
        zzanz<zzoj> zzg = zzabvVar.zzg(jSONObject);
        zzanz<zzaqw> zzc = zzabvVar.zzc(jSONObject, MimeTypes.BASE_TYPE_VIDEO);
        JSONArray jSONArray = jSONObject.getJSONArray("custom_assets");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("type");
            if ("string".equals(string)) {
                simpleArrayMap2.put(jSONObject2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), jSONObject2.getString("string_value"));
            } else if ("image".equals(string)) {
                simpleArrayMap.put(jSONObject2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), zzabvVar.zza(jSONObject2, "image_value", this.zzcbk));
            } else {
                String valueOf = String.valueOf(string);
                zzakb.zzdk(valueOf.length() != 0 ? "Unknown custom asset type: ".concat(valueOf) : new String("Unknown custom asset type: "));
            }
        }
        zzaqw zzc2 = zzabv.zzc(zzc);
        String string2 = jSONObject.getString("custom_template_id");
        SimpleArrayMap simpleArrayMap3 = new SimpleArrayMap();
        for (int i2 = 0; i2 < simpleArrayMap.size(); i2++) {
            simpleArrayMap3.put(simpleArrayMap.keyAt(i2), ((Future) simpleArrayMap.valueAt(i2)).get());
        }
        return new zzos(string2, simpleArrayMap3, simpleArrayMap2, zzg.get(), zzc2 != null ? zzc2.zztm() : null, zzc2 != null ? zzc2.getView() : null);
    }
}
