package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class c65 {
    public final g77 a;
    public final s65 b;
    public final x65 c;

    public c65(g77 g77Var, s65 s65Var, x65 x65Var) {
        this.a = g77Var;
        this.b = s65Var;
        this.c = x65Var;
    }

    public final f77 a(final fi6 fi6Var, final th6 th6Var, final JSONObject jSONObject) {
        JSONObject optJSONObject;
        f77 n;
        final f77 M = this.a.M(new Callable() { // from class: com.daaw.a65
            @Override // java.util.concurrent.Callable
            public final Object call() {
                fi6 fi6Var2 = fi6Var;
                th6 th6Var2 = th6Var;
                JSONObject jSONObject2 = jSONObject;
                j35 j35Var = new j35();
                j35Var.v(jSONObject2.optInt("template_id", -1));
                j35Var.i(jSONObject2.optString("custom_template_id"));
                JSONObject optJSONObject2 = jSONObject2.optJSONObject("omid_settings");
                j35Var.s(optJSONObject2 != null ? optJSONObject2.optString("omid_partner_name") : null);
                ri6 ri6Var = fi6Var2.a.a;
                if (!ri6Var.g.contains(Integer.toString(j35Var.K()))) {
                    throw new yu5(1, "Invalid template ID: " + j35Var.K());
                }
                if (j35Var.K() == 3) {
                    if (j35Var.g0() == null) {
                        throw new yu5(1, "No custom template id for custom template ad response.");
                    }
                    if (!ri6Var.h.contains(j35Var.g0())) {
                        throw new yu5(1, "Unexpected custom template id in the response.");
                    }
                }
                j35Var.t(jSONObject2.optDouble("rating", -1.0d));
                String optString = jSONObject2.optString("headline", null);
                if (th6Var2.N) {
                    zzt.zzp();
                    optString = zzs.zzv() + " : " + optString;
                }
                j35Var.u("headline", optString);
                j35Var.u("body", jSONObject2.optString("body", null));
                j35Var.u("call_to_action", jSONObject2.optString("call_to_action", null));
                j35Var.u("store", jSONObject2.optString("store", null));
                j35Var.u("price", jSONObject2.optString("price", null));
                j35Var.u("advertiser", jSONObject2.optString("advertiser", null));
                return j35Var;
            }
        });
        final f77 f = this.b.f(jSONObject, "images");
        final f77 g = this.b.g(jSONObject, "images", th6Var, fi6Var.b.b);
        final f77 e = this.b.e(jSONObject, "secondary_image");
        final f77 e2 = this.b.e(jSONObject, "app_icon");
        final f77 d = this.b.d(jSONObject, "attribution");
        final f77 h = this.b.h(jSONObject, th6Var, fi6Var.b.b);
        final s65 s65Var = this.b;
        if (jSONObject.optBoolean("enable_omid") && (optJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
            final String optString = optJSONObject.optString("omid_html");
            if (!TextUtils.isEmpty(optString)) {
                n = s67.n(s67.i(null), new w57() { // from class: com.daaw.e65
                    @Override // com.daaw.w57
                    public final f77 zza(Object obj) {
                        return s65.this.c(optString, obj);
                    }
                }, z04.e);
                final f77 f77Var = n;
                final f77 a = this.c.a(jSONObject, "custom_assets");
                return s67.b(M, f, g, e, e2, d, h, f77Var, a).a(new Callable() { // from class: com.daaw.b65
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        f77 f77Var2 = M;
                        f77 f77Var3 = f;
                        f77 f77Var4 = e2;
                        f77 f77Var5 = e;
                        f77 f77Var6 = d;
                        JSONObject jSONObject2 = jSONObject;
                        f77 f77Var7 = h;
                        f77 f77Var8 = g;
                        f77 f77Var9 = f77Var;
                        f77 f77Var10 = a;
                        j35 j35Var = (j35) f77Var2.get();
                        j35Var.n((List) f77Var3.get());
                        j35Var.k((vc3) f77Var4.get());
                        j35Var.o((vc3) f77Var5.get());
                        j35Var.h((nc3) f77Var6.get());
                        j35Var.q(s65.j(jSONObject2));
                        j35Var.j(s65.i(jSONObject2));
                        a74 a74Var = (a74) f77Var7.get();
                        if (a74Var != null) {
                            j35Var.y(a74Var);
                            j35Var.x(a74Var.g());
                            j35Var.w(a74Var.zzs());
                        }
                        a74 a74Var2 = (a74) f77Var8.get();
                        if (a74Var2 != null) {
                            j35Var.m(a74Var2);
                            j35Var.z(a74Var2.g());
                        }
                        a74 a74Var3 = (a74) f77Var9.get();
                        if (a74Var3 != null) {
                            j35Var.r(a74Var3);
                        }
                        for (w65 w65Var : (List) f77Var10.get()) {
                            if (w65Var.a != 1) {
                                j35Var.l(w65Var.b, w65Var.d);
                            } else {
                                j35Var.u(w65Var.b, w65Var.c);
                            }
                        }
                        return j35Var;
                    }
                }, this.a);
            }
        }
        n = s67.i(null);
        final f77 f77Var2 = n;
        final f77 a2 = this.c.a(jSONObject, "custom_assets");
        return s67.b(M, f, g, e, e2, d, h, f77Var2, a2).a(new Callable() { // from class: com.daaw.b65
            @Override // java.util.concurrent.Callable
            public final Object call() {
                f77 f77Var22 = M;
                f77 f77Var3 = f;
                f77 f77Var4 = e2;
                f77 f77Var5 = e;
                f77 f77Var6 = d;
                JSONObject jSONObject2 = jSONObject;
                f77 f77Var7 = h;
                f77 f77Var8 = g;
                f77 f77Var9 = f77Var2;
                f77 f77Var10 = a2;
                j35 j35Var = (j35) f77Var22.get();
                j35Var.n((List) f77Var3.get());
                j35Var.k((vc3) f77Var4.get());
                j35Var.o((vc3) f77Var5.get());
                j35Var.h((nc3) f77Var6.get());
                j35Var.q(s65.j(jSONObject2));
                j35Var.j(s65.i(jSONObject2));
                a74 a74Var = (a74) f77Var7.get();
                if (a74Var != null) {
                    j35Var.y(a74Var);
                    j35Var.x(a74Var.g());
                    j35Var.w(a74Var.zzs());
                }
                a74 a74Var2 = (a74) f77Var8.get();
                if (a74Var2 != null) {
                    j35Var.m(a74Var2);
                    j35Var.z(a74Var2.g());
                }
                a74 a74Var3 = (a74) f77Var9.get();
                if (a74Var3 != null) {
                    j35Var.r(a74Var3);
                }
                for (w65 w65Var : (List) f77Var10.get()) {
                    if (w65Var.a != 1) {
                        j35Var.l(w65Var.b, w65Var.d);
                    } else {
                        j35Var.u(w65Var.b, w65Var.c);
                    }
                }
                return j35Var;
            }
        }, this.a);
    }
}
