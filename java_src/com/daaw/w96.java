package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class w96 implements h76 {

    /* renamed from: a */
    public final String f31081a;

    public w96(String str) {
        this.f31081a = str;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        try {
            JSONObject zzf = zzbu.zzf((JSONObject) obj, "pii");
            if (TextUtils.isEmpty(this.f31081a)) {
                return;
            }
            zzf.put("attok", this.f31081a);
        } catch (JSONException e) {
            zze.zzb("Failed putting attestation token.", e);
        }
    }
}
