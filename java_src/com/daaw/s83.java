package com.daaw;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class s83 extends y83 {
    public s83(int i, String str, String str2) {
        super(1, str, str2, null);
    }

    @Override // com.daaw.y83
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo4015a(JSONObject jSONObject) {
        return jSONObject.optString(m4002n(), (String) m4003m());
    }

    @Override // com.daaw.y83
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo4014b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(m4002n())) ? bundle.getString("com.google.android.gms.ads.flag.".concat(m4002n())) : (String) m4003m();
    }

    @Override // com.daaw.y83
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo4013c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(m4002n(), (String) m4003m());
    }

    @Override // com.daaw.y83
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo4012d(SharedPreferences.Editor editor, Object obj) {
        editor.putString(m4002n(), (String) obj);
    }
}
