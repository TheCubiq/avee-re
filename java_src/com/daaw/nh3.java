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
    public final Object a = new Object();
    @GuardedBy("lock")
    public final Map b = new HashMap();

    @Override // com.daaw.zg3
    public final void a(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String concat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.a) {
            mh3 mh3Var = (mh3) this.b.remove(str);
            if (mh3Var == null) {
                k04.zzj("Received result for unexpected method invocation: " + str);
            } else if (!TextUtils.isEmpty(str2)) {
                mh3Var.zza(str3 + concat);
            } else if (str5 == null) {
                mh3Var.a(null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (zze.zzc()) {
                        String jSONObject2 = jSONObject.toString(2);
                        zze.zza("Result GMSG: " + jSONObject2);
                    }
                    mh3Var.a(jSONObject);
                } catch (JSONException e) {
                    mh3Var.zza(e.getMessage());
                }
            }
        }
    }

    public final f77 b(kk3 kk3Var, String str, JSONObject jSONObject) {
        e14 e14Var = new e14();
        zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        c(uuid, new lh3(this, e14Var));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", uuid);
            jSONObject2.put("args", jSONObject);
            kk3Var.C0(str, jSONObject2);
        } catch (Exception e) {
            e14Var.c(e);
        }
        return e14Var;
    }

    public final void c(String str, mh3 mh3Var) {
        synchronized (this.a) {
            this.b.put(str, mh3Var);
        }
    }
}
