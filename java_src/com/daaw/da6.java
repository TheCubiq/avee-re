package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class da6 implements i76 {
    public final JSONObject a;

    public da6(Context context) {
        this.a = wu3.c(context);
    }

    public final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.a);
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
        return s67.i(new h76() { // from class: com.daaw.ca6
            @Override // com.daaw.h76
            public final void b(Object obj) {
                da6.this.a((JSONObject) obj);
            }
        });
    }
}
