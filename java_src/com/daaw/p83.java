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
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo4015a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(m4002n(), ((Integer) m4003m()).intValue()));
    }

    @Override // com.daaw.y83
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo4014b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(m4002n())) ? Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(m4002n()))) : (Integer) m4003m();
    }

    @Override // com.daaw.y83
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo4013c(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(m4002n(), ((Integer) m4003m()).intValue()));
    }

    @Override // com.daaw.y83
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo4012d(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(m4002n(), ((Integer) obj).intValue());
    }
}
