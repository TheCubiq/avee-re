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
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(n(), ((Float) m()).floatValue()));
    }

    @Override // com.daaw.y83
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(n())) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(n()))) : (Float) m();
    }

    @Override // com.daaw.y83
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(n(), ((Float) m()).floatValue()));
    }

    @Override // com.daaw.y83
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(n(), ((Float) obj).floatValue());
    }
}
