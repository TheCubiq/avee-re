package com.daaw;

import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ha6 implements h76 {
    public final String a;
    public final String b;

    public ha6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        try {
            JSONObject zzf = zzbu.zzf((JSONObject) obj, "pii");
            zzf.put("doritos", this.a);
            zzf.put("doritos_v2", this.b);
        } catch (JSONException unused) {
            zze.zza("Failed putting doritos string.");
        }
    }
}
