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
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return jSONObject.optString(n(), (String) m());
    }

    @Override // com.daaw.y83
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(n())) ? bundle.getString("com.google.android.gms.ads.flag.".concat(n())) : (String) m();
    }

    @Override // com.daaw.y83
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(n(), (String) m());
    }

    @Override // com.daaw.y83
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putString(n(), (String) obj);
    }
}
