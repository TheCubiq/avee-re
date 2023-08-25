package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class c65 {

    /* renamed from: a */
    public final g77 f5551a;

    /* renamed from: b */
    public final s65 f5552b;

    /* renamed from: c */
    public final x65 f5553c;

    public c65(g77 g77Var, s65 s65Var, x65 x65Var) {
        this.f5551a = g77Var;
        this.f5552b = s65Var;
        this.f5553c = x65Var;
    }

    /* renamed from: a */
    public final f77 m25567a(final fi6 fi6Var, final th6 th6Var, final JSONObject jSONObject) {
        JSONObject optJSONObject;
        f77 m10629n;
        final f77 mo20112M = this.f5551a.mo20112M(new Callable() { // from class: com.daaw.a65
            @Override // java.util.concurrent.Callable
            public final Object call() {
                fi6 fi6Var2 = fi6Var;
                th6 th6Var2 = th6Var;
                JSONObject jSONObject2 = jSONObject;
                j35 j35Var = new j35();
                j35Var.m19100v(jSONObject2.optInt("template_id", -1));
                j35Var.m19113i(jSONObject2.optString("custom_template_id"));
                JSONObject optJSONObject2 = jSONObject2.optJSONObject("omid_settings");
                j35Var.m19103s(optJSONObject2 != null ? optJSONObject2.optString("omid_partner_name") : null);
                ri6 ri6Var = fi6Var2.f9623a.f5824a;
                if (!ri6Var.f25347g.contains(Integer.toString(j35Var.m19145K()))) {
                    throw new yu5(1, "Invalid template ID: " + j35Var.m19145K());
                }
                if (j35Var.m19145K() == 3) {
                    if (j35Var.m19116g0() == null) {
                        throw new yu5(1, "No custom template id for custom template ad response.");
                    }
                    if (!ri6Var.f25348h.contains(j35Var.m19116g0())) {
                        throw new yu5(1, "Unexpected custom template id in the response.");
                    }
                }
                j35Var.m19102t(jSONObject2.optDouble("rating", -1.0d));
                String optString = jSONObject2.optString("headline", null);
                if (th6Var2.f27667N) {
                    zzt.zzp();
                    optString = zzs.zzv() + " : " + optString;
                }
                j35Var.m19101u("headline", optString);
                j35Var.m19101u("body", jSONObject2.optString("body", null));
                j35Var.m19101u("call_to_action", jSONObject2.optString("call_to_action", null));
                j35Var.m19101u("store", jSONObject2.optString("store", null));
                j35Var.m19101u("price", jSONObject2.optString("price", null));
                j35Var.m19101u("advertiser", jSONObject2.optString("advertiser", null));
                return j35Var;
            }
        });
        final f77 m10655f = this.f5552b.m10655f(jSONObject, "images");
        final f77 m10654g = this.f5552b.m10654g(jSONObject, "images", th6Var, fi6Var.f9624b.f8508b);
        final f77 m10656e = this.f5552b.m10656e(jSONObject, "secondary_image");
        final f77 m10656e2 = this.f5552b.m10656e(jSONObject, "app_icon");
        final f77 m10657d = this.f5552b.m10657d(jSONObject, "attribution");
        final f77 m10653h = this.f5552b.m10653h(jSONObject, th6Var, fi6Var.f9624b.f8508b);
        final s65 s65Var = this.f5552b;
        if (jSONObject.optBoolean("enable_omid") && (optJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
            final String optString = optJSONObject.optString("omid_html");
            if (!TextUtils.isEmpty(optString)) {
                m10629n = s67.m10629n(s67.m10634i(null), new w57() { // from class: com.daaw.e65
                    @Override // com.daaw.w57
                    public final f77 zza(Object obj) {
                        return s65.this.m10658c(optString, obj);
                    }
                }, z04.f34309e);
                final f77 f77Var = m10629n;
                final f77 m5499a = this.f5553c.m5499a(jSONObject, "custom_assets");
                return s67.m10641b(mo20112M, m10655f, m10654g, m10656e, m10656e2, m10657d, m10653h, f77Var, m5499a).m11710a(new Callable() { // from class: com.daaw.b65
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        f77 f77Var2 = mo20112M;
                        f77 f77Var3 = m10655f;
                        f77 f77Var4 = m10656e2;
                        f77 f77Var5 = m10656e;
                        f77 f77Var6 = m10657d;
                        JSONObject jSONObject2 = jSONObject;
                        f77 f77Var7 = m10653h;
                        f77 f77Var8 = m10654g;
                        f77 f77Var9 = f77Var;
                        f77 f77Var10 = m5499a;
                        j35 j35Var = (j35) f77Var2.get();
                        j35Var.m19108n((List) f77Var3.get());
                        j35Var.m19111k((vc3) f77Var4.get());
                        j35Var.m19107o((vc3) f77Var5.get());
                        j35Var.m19115h((nc3) f77Var6.get());
                        j35Var.m19105q(s65.m10651j(jSONObject2));
                        j35Var.m19112j(s65.m10652i(jSONObject2));
                        a74 a74Var = (a74) f77Var7.get();
                        if (a74Var != null) {
                            j35Var.m19097y(a74Var);
                            j35Var.m19098x(a74Var.mo6418g());
                            j35Var.m19099w(a74Var.zzs());
                        }
                        a74 a74Var2 = (a74) f77Var8.get();
                        if (a74Var2 != null) {
                            j35Var.m19109m(a74Var2);
                            j35Var.m19096z(a74Var2.mo6418g());
                        }
                        a74 a74Var3 = (a74) f77Var9.get();
                        if (a74Var3 != null) {
                            j35Var.m19104r(a74Var3);
                        }
                        for (w65 w65Var : (List) f77Var10.get()) {
                            if (w65Var.f30923a != 1) {
                                j35Var.m19110l(w65Var.f30924b, w65Var.f30926d);
                            } else {
                                j35Var.m19101u(w65Var.f30924b, w65Var.f30925c);
                            }
                        }
                        return j35Var;
                    }
                }, this.f5551a);
            }
        }
        m10629n = s67.m10634i(null);
        final f77 f77Var2 = m10629n;
        final f77 m5499a2 = this.f5553c.m5499a(jSONObject, "custom_assets");
        return s67.m10641b(mo20112M, m10655f, m10654g, m10656e, m10656e2, m10657d, m10653h, f77Var2, m5499a2).m11710a(new Callable() { // from class: com.daaw.b65
            @Override // java.util.concurrent.Callable
            public final Object call() {
                f77 f77Var22 = mo20112M;
                f77 f77Var3 = m10655f;
                f77 f77Var4 = m10656e2;
                f77 f77Var5 = m10656e;
                f77 f77Var6 = m10657d;
                JSONObject jSONObject2 = jSONObject;
                f77 f77Var7 = m10653h;
                f77 f77Var8 = m10654g;
                f77 f77Var9 = f77Var2;
                f77 f77Var10 = m5499a2;
                j35 j35Var = (j35) f77Var22.get();
                j35Var.m19108n((List) f77Var3.get());
                j35Var.m19111k((vc3) f77Var4.get());
                j35Var.m19107o((vc3) f77Var5.get());
                j35Var.m19115h((nc3) f77Var6.get());
                j35Var.m19105q(s65.m10651j(jSONObject2));
                j35Var.m19112j(s65.m10652i(jSONObject2));
                a74 a74Var = (a74) f77Var7.get();
                if (a74Var != null) {
                    j35Var.m19097y(a74Var);
                    j35Var.m19098x(a74Var.mo6418g());
                    j35Var.m19099w(a74Var.zzs());
                }
                a74 a74Var2 = (a74) f77Var8.get();
                if (a74Var2 != null) {
                    j35Var.m19109m(a74Var2);
                    j35Var.m19096z(a74Var2.mo6418g());
                }
                a74 a74Var3 = (a74) f77Var9.get();
                if (a74Var3 != null) {
                    j35Var.m19104r(a74Var3);
                }
                for (w65 w65Var : (List) f77Var10.get()) {
                    if (w65Var.f30923a != 1) {
                        j35Var.m19110l(w65Var.f30924b, w65Var.f30926d);
                    } else {
                        j35Var.m19101u(w65Var.f30924b, w65Var.f30925c);
                    }
                }
                return j35Var;
            }
        }, this.f5551a);
    }
}
