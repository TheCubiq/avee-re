package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class da6 implements i76 {

    /* renamed from: a */
    public final JSONObject f6721a;

    public da6(Context context) {
        this.f6721a = wu3.m5782c(context);
    }

    /* renamed from: a */
    public final /* synthetic */ void m24579a(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.f6721a);
        } catch (JSONException unused) {
            zze.zza("Failed putting version constants.");
        }
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 46;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return s67.m10634i(new h76() { // from class: com.daaw.ca6
            @Override // com.daaw.h76
            /* renamed from: b */
            public final void mo2851b(Object obj) {
                da6.this.m24579a((JSONObject) obj);
            }
        });
    }
}
