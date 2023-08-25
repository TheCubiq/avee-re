package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class la6 implements h76 {
    public final List a;

    public la6(List list) {
        this.a = list;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.a));
        } catch (JSONException unused) {
            zze.zza("Failed putting experiment ids.");
        }
    }
}
