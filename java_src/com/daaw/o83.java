package com.daaw;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class o83 extends y83 {
    public o83(int i, String str, Boolean bool) {
        super(i, str, bool, null);
    }

    @Override // com.daaw.y83
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo4015a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(m4002n(), ((Boolean) m4003m()).booleanValue()));
    }

    @Override // com.daaw.y83
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo4014b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(m4002n())) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(m4002n()))) : (Boolean) m4003m();
    }

    @Override // com.daaw.y83
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo4013c(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(m4002n(), ((Boolean) m4003m()).booleanValue()));
    }

    @Override // com.daaw.y83
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo4012d(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(m4002n(), ((Boolean) obj).booleanValue());
    }
}
