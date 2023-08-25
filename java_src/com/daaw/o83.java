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
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(n(), ((Boolean) m()).booleanValue()));
    }

    @Override // com.daaw.y83
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(n())) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(n()))) : (Boolean) m();
    }

    @Override // com.daaw.y83
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(n(), ((Boolean) m()).booleanValue()));
    }

    @Override // com.daaw.y83
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(n(), ((Boolean) obj).booleanValue());
    }
}
