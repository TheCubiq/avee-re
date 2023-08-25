package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzchu;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class wu3 extends xu3 {
    public final Object a = new Object();
    public final Context b;
    public SharedPreferences c;
    public final nl3 d;

    public wu3(Context context, nl3 nl3Var) {
        this.b = context.getApplicationContext();
        this.d = nl3Var;
    }

    public static JSONObject c(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzchu.h().p);
            jSONObject.put("mf", ab3.a.e());
            jSONObject.put("cl", "496518605");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", c80.a);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.c(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", c80.a);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.daaw.xu3
    public final f77 a() {
        synchronized (this.a) {
            if (this.c == null) {
                this.c = this.b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (zzt.zzB().a() - this.c.getLong("js_last_update", 0L) < ((Long) ab3.b.e()).longValue()) {
            return s67.i(null);
        }
        return s67.m(this.d.a(c(this.b)), new ey6() { // from class: com.daaw.vu3
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                wu3.this.b((JSONObject) obj);
                return null;
            }
        }, z04.f);
    }

    public final /* synthetic */ Void b(JSONObject jSONObject) {
        g93.d(this.b, 1, jSONObject);
        this.c.edit().putLong("js_last_update", zzt.zzB().a()).apply();
        return null;
    }
}
