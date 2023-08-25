package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class q96 implements h76 {
    public final String a;
    public final int b;

    public q96(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (TextUtils.isEmpty(this.a) || this.b == -1) {
            return;
        }
        try {
            JSONObject zzf = zzbu.zzf(jSONObject, "pii");
            zzf.put("pvid", this.a);
            zzf.put("pvid_s", this.b);
        } catch (JSONException e) {
            zze.zzb("Failed putting gms core app set ID info.", e);
        }
    }
}
