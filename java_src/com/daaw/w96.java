package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class w96 implements h76 {
    public final String a;

    public w96(String str) {
        this.a = str;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        try {
            JSONObject zzf = zzbu.zzf((JSONObject) obj, "pii");
            if (TextUtils.isEmpty(this.a)) {
                return;
            }
            zzf.put("attok", this.a);
        } catch (JSONException e) {
            zze.zzb("Failed putting attestation token.", e);
        }
    }
}
