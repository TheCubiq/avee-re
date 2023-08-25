package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class q96 implements h76 {

    /* renamed from: a */
    public final String f23787a;

    /* renamed from: b */
    public final int f23788b;

    public q96(String str, int i) {
        this.f23787a = str;
        this.f23788b = i;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (TextUtils.isEmpty(this.f23787a) || this.f23788b == -1) {
            return;
        }
        try {
            JSONObject zzf = zzbu.zzf(jSONObject, "pii");
            zzf.put("pvid", this.f23787a);
            zzf.put("pvid_s", this.f23788b);
        } catch (JSONException e) {
            zze.zzb("Failed putting gms core app set ID info.", e);
        }
    }
}
