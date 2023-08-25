package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ua6 implements h76 {
    public final Bundle a;

    public ua6(Bundle bundle) {
        this.a = bundle;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.a != null) {
            try {
                zzbu.zzf(zzbu.zzf(jSONObject, "device"), "play_store").put("parental_controls", zzay.zzb().n(this.a));
            } catch (JSONException unused) {
                zze.zza("Failed putting parental controls bundle.");
            }
        }
    }
}
