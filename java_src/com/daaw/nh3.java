package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class nh3 implements zg3 {

    /* renamed from: a */
    public final Object f20120a = new Object();
    @GuardedBy("lock")

    /* renamed from: b */
    public final Map f20121b = new HashMap();

    @Override // com.daaw.zg3
    /* renamed from: a */
    public final void mo2341a(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String concat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.f20120a) {
            mh3 mh3Var = (mh3) this.f20121b.remove(str);
            if (mh3Var == null) {
                k04.zzj("Received result for unexpected method invocation: " + str);
            } else if (!TextUtils.isEmpty(str2)) {
                mh3Var.zza(str3 + concat);
            } else if (str5 == null) {
                mh3Var.mo16027a(null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (zze.zzc()) {
                        String jSONObject2 = jSONObject.toString(2);
                        zze.zza("Result GMSG: " + jSONObject2);
                    }
                    mh3Var.mo16027a(jSONObject);
                } catch (JSONException e) {
                    mh3Var.zza(e.getMessage());
                }
            }
        }
    }

    /* renamed from: b */
    public final f77 m15176b(kk3 kk3Var, String str, JSONObject jSONObject) {
        e14 e14Var = new e14();
        zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        m15175c(uuid, new lh3(this, e14Var));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", uuid);
            jSONObject2.put("args", jSONObject);
            kk3Var.mo6461C0(str, jSONObject2);
        } catch (Exception e) {
            e14Var.m23796c(e);
        }
        return e14Var;
    }

    /* renamed from: c */
    public final void m15175c(String str, mh3 mh3Var) {
        synchronized (this.f20120a) {
            this.f20121b.put(str, mh3Var);
        }
    }
}
