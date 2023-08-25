package com.daaw;

import android.os.Bundle;
import javax.annotation.Nullable;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b36 implements h76 {
    @Nullable

    /* renamed from: a */
    public final JSONObject f4264a;
    @Nullable

    /* renamed from: b */
    public final JSONObject f4265b;

    public b36(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        this.f4264a = jSONObject;
        this.f4265b = jSONObject2;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        Bundle bundle = (Bundle) obj;
        JSONObject jSONObject = this.f4264a;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.f4265b;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
