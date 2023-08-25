package com.daaw;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class p83 extends y83 {
    public p83(int i, String str, Integer num) {
        super(1, str, num, null);
    }

    @Override // com.daaw.y83
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(n(), ((Integer) m()).intValue()));
    }

    @Override // com.daaw.y83
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(n())) ? Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(n()))) : (Integer) m();
    }

    @Override // com.daaw.y83
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(n(), ((Integer) m()).intValue()));
    }

    @Override // com.daaw.y83
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(n(), ((Integer) obj).intValue());
    }
}
