package com.daaw;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class q83 extends y83 {
    public q83(int i, String str, Long l) {
        super(1, str, l, null);
    }

    @Override // com.daaw.y83
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(n(), ((Long) m()).longValue()));
    }

    @Override // com.daaw.y83
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(n())) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(n()))) : (Long) m();
    }

    @Override // com.daaw.y83
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(n(), ((Long) m()).longValue()));
    }

    @Override // com.daaw.y83
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(n(), ((Long) obj).longValue());
    }
}
