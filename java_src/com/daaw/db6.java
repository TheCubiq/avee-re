package com.daaw;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final /* synthetic */ class db6 implements i76 {

    /* renamed from: a */
    public static final /* synthetic */ db6 f6900a = new db6();

    @Override // com.daaw.i76
    public final /* synthetic */ int zza() {
        return 0;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return s67.m10634i(new h76() { // from class: com.daaw.eb6
            @Override // com.daaw.h76
            /* renamed from: b */
            public final void mo2851b(Object obj) {
                try {
                    ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", c80.f5613a);
                } catch (JSONException unused) {
                }
            }
        });
    }
}
