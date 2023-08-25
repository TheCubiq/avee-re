package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzbu;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class lf3 implements zg3 {

    /* renamed from: a */
    public final mf3 f17371a;

    public lf3(mf3 mf3Var) {
        this.f17371a = mf3Var;
    }

    @Override // com.daaw.zg3
    /* renamed from: a */
    public final void mo2341a(Object obj, Map map) {
        if (this.f17371a == null) {
            return;
        }
        String str = (String) map.get("name");
        if (str == null) {
            k04.zzi("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundle = null;
        if (map.containsKey("info")) {
            try {
                bundle = zzbu.zza(new JSONObject((String) map.get("info")));
            } catch (JSONException e) {
                k04.zzh("Failed to convert ad metadata to JSON.", e);
            }
        }
        if (bundle == null) {
            k04.zzg("Failed to convert ad metadata to Bundle.");
        } else {
            this.f17371a.mo5430k(str, bundle);
        }
    }
}
