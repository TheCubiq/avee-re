package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class la6 implements h76 {

    /* renamed from: a */
    public final List f17179a;

    public la6(List list) {
        this.f17179a = list;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.f17179a));
        } catch (JSONException unused) {
            zze.zza("Failed putting experiment ids.");
        }
    }
}
