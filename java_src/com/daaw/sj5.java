package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class sj5 {
    public final b94 a;
    public final Context b;
    public final zzchu c;
    public final ri6 d;
    public final Executor e;
    public final String f;
    public final to6 g;
    public final dj6 h;
    public final fd5 i;

    public sj5(b94 b94Var, Context context, zzchu zzchuVar, ri6 ri6Var, Executor executor, String str, to6 to6Var, fd5 fd5Var) {
        this.a = b94Var;
        this.b = context;
        this.c = zzchuVar;
        this.d = ri6Var;
        this.e = executor;
        this.f = str;
        this.g = to6Var;
        this.h = b94Var.A();
        this.i = fd5Var;
    }

    public static final String e(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.daaw.f77 a() {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.sj5.a():com.daaw.f77");
    }

    public final /* synthetic */ f77 b(JSONObject jSONObject) {
        return s67.i(new fi6(new ci6(this.d), ei6.a(new StringReader(jSONObject.toString()))));
    }

    public final f77 c(final String str, final String str2) {
        io6 a = ho6.a(this.b, 11);
        a.zzh();
        xl3 a2 = zzt.zzf().a(this.b, this.c, this.a.D());
        rl3 rl3Var = ul3.b;
        final nl3 a3 = a2.a("google.afma.response.normalize", rl3Var, rl3Var);
        f77 n = s67.n(s67.n(s67.n(s67.i(""), new w57() { // from class: com.daaw.pj5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                String str3 = str;
                String str4 = str2;
                String str5 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return s67.i(jSONObject);
                } catch (JSONException e) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e.getCause())));
                }
            }
        }, this.e), new w57() { // from class: com.daaw.qj5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return nl3.this.a((JSONObject) obj);
            }
        }, this.e), new w57() { // from class: com.daaw.rj5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return sj5.this.b((JSONObject) obj);
            }
        }, this.e);
        so6.a(n, this.g, a);
        return n;
    }

    public final String d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            k04.zzj("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }
}
