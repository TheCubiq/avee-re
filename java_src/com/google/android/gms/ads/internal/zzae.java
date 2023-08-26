package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzanj;
import com.google.android.gms.internal.ads.zzano;
import com.google.android.gms.internal.ads.zzanz;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class zzae implements zzanj {
    static final zzanj zzxn = new zzae();

    private zzae() {
    }

    @Override // com.google.android.gms.internal.ads.zzanj
    public final zzanz zzc(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            zzbv.zzeo().zzqh().zzcs(jSONObject.getString("appSettingsJson"));
        }
        return zzano.zzi(null);
    }
}
