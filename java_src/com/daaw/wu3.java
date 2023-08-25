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

    /* renamed from: a */
    public final Object f31519a = new Object();

    /* renamed from: b */
    public final Context f31520b;

    /* renamed from: c */
    public SharedPreferences f31521c;

    /* renamed from: d */
    public final nl3 f31522d;

    public wu3(Context context, nl3 nl3Var) {
        this.f31520b = context.getApplicationContext();
        this.f31522d = nl3Var;
    }

    /* renamed from: c */
    public static JSONObject m5782c(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzchu.m1093h().f36993p);
            jSONObject.put("mf", ab3.f3047a.m16137e());
            jSONObject.put("cl", "496518605");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", c80.f5613a);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.m1147c(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", c80.f5613a);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.daaw.xu3
    /* renamed from: a */
    public final f77 mo4502a() {
        synchronized (this.f31519a) {
            if (this.f31521c == null) {
                this.f31521c = this.f31520b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (zzt.zzB().mo15860a() - this.f31521c.getLong("js_last_update", 0L) < ((Long) ab3.f3048b.m16137e()).longValue()) {
            return s67.m10634i(null);
        }
        return s67.m10630m(this.f31522d.mo15045a(m5782c(this.f31520b)), new ey6() { // from class: com.daaw.vu3
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                wu3.this.m5783b((JSONObject) obj);
                return null;
            }
        }, z04.f34310f);
    }

    /* renamed from: b */
    public final /* synthetic */ Void m5783b(JSONObject jSONObject) {
        g93.m21878d(this.f31520b, 1, jSONObject);
        this.f31521c.edit().putLong("js_last_update", zzt.zzB().mo15860a()).apply();
        return null;
    }
}
