package com.daaw;

import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ha6 implements h76 {

    /* renamed from: a */
    public final String f12315a;

    /* renamed from: b */
    public final String f12316b;

    public ha6(String str, String str2) {
        this.f12315a = str;
        this.f12316b = str2;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        try {
            JSONObject zzf = zzbu.zzf((JSONObject) obj, "pii");
            zzf.put("doritos", this.f12315a);
            zzf.put("doritos_v2", this.f12316b);
        } catch (JSONException unused) {
            zze.zza("Failed putting doritos string.");
        }
    }
}
