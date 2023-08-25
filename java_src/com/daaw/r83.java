package com.daaw;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class r83 extends y83 {
    public r83(int i, String str, Float f) {
        super(1, str, f, null);
    }

    @Override // com.daaw.y83
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo4015a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(m4002n(), ((Float) m4003m()).floatValue()));
    }

    @Override // com.daaw.y83
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo4014b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(m4002n())) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(m4002n()))) : (Float) m4003m();
    }

    @Override // com.daaw.y83
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo4013c(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(m4002n(), ((Float) m4003m()).floatValue()));
    }

    @Override // com.daaw.y83
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo4012d(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(m4002n(), ((Float) obj).floatValue());
    }
}
