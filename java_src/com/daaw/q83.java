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
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo4015a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(m4002n(), ((Long) m4003m()).longValue()));
    }

    @Override // com.daaw.y83
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo4014b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(m4002n())) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(m4002n()))) : (Long) m4003m();
    }

    @Override // com.daaw.y83
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo4013c(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(m4002n(), ((Long) m4003m()).longValue()));
    }

    @Override // com.daaw.y83
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo4012d(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(m4002n(), ((Long) obj).longValue());
    }
}
