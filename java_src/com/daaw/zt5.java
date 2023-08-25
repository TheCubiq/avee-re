package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zt5 implements tt5 {
    public final q15 a;
    public final g77 b;
    public final c65 c;
    public final pj6 d;
    public final a95 e;

    public zt5(q15 q15Var, g77 g77Var, c65 c65Var, pj6 pj6Var, a95 a95Var) {
        this.a = q15Var;
        this.b = g77Var;
        this.c = c65Var;
        this.d = pj6Var;
        this.e = a95Var;
    }

    @Override // com.daaw.qq5
    public final boolean a(fi6 fi6Var, th6 th6Var) {
        yh6 yh6Var = th6Var.t;
        return (yh6Var == null || yh6Var.c == null) ? false : true;
    }

    @Override // com.daaw.qq5
    public final f77 b(final fi6 fi6Var, final th6 th6Var) {
        return s67.n(s67.n(this.d.a(), new w57() { // from class: com.daaw.wt5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return zt5.this.e(th6Var, (u85) obj);
            }
        }, this.b), new w57() { // from class: com.daaw.xt5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return zt5.this.f(fi6Var, th6Var, (JSONArray) obj);
            }
        }, this.b);
    }

    public final /* synthetic */ e35 c(f77 f77Var, f77 f77Var2, fi6 fi6Var, th6 th6Var, JSONObject jSONObject) {
        j35 j35Var = (j35) f77Var.get();
        u85 u85Var = (u85) f77Var2.get();
        k35 c = this.a.c(new rm4(fi6Var, th6Var, null), new v35(j35Var), new h25(jSONObject, u85Var));
        c.j().b();
        c.k().a(u85Var);
        c.i().a(j35Var.Z());
        c.l().a(this.e);
        return c.h();
    }

    public final /* synthetic */ f77 d(u85 u85Var, JSONObject jSONObject) {
        this.d.b(s67.i(u85Var));
        if (jSONObject.optBoolean("success")) {
            return s67.i(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new ml3("process json failed");
    }

    public final /* synthetic */ f77 e(th6 th6Var, final u85 u85Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) zzba.zzc().b(g93.H7)).booleanValue() && vw0.k()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", th6Var.t.c);
        jSONObject2.put("sdk_params", jSONObject);
        return s67.n(u85Var.d("google.afma.nativeAds.preProcessJson", jSONObject2), new w57() { // from class: com.daaw.vt5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return zt5.this.d(u85Var, (JSONObject) obj);
            }
        }, this.b);
    }

    public final /* synthetic */ f77 f(fi6 fi6Var, th6 th6Var, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return s67.h(new gi5(3));
        }
        int i = 0;
        if (fi6Var.a.a.k > 1) {
            int length = jSONArray.length();
            this.d.c(Math.min(length, fi6Var.a.a.k));
            ArrayList arrayList = new ArrayList(fi6Var.a.a.k);
            while (i < fi6Var.a.a.k) {
                arrayList.add(i < length ? g(fi6Var, th6Var, jSONArray.getJSONObject(i)) : s67.h(new gi5(3)));
                i++;
            }
            return s67.i(arrayList);
        }
        return s67.m(g(fi6Var, th6Var, jSONArray.getJSONObject(0)), new ey6() { // from class: com.daaw.yt5
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                return Collections.singletonList(s67.i((e35) obj));
            }
        }, this.b);
    }

    public final f77 g(final fi6 fi6Var, final th6 th6Var, final JSONObject jSONObject) {
        final f77 a = this.d.a();
        final f77 a2 = this.c.a(fi6Var, th6Var, jSONObject);
        return s67.d(a, a2).a(new Callable() { // from class: com.daaw.ut5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zt5.this.c(a2, a, fi6Var, th6Var, jSONObject);
            }
        }, this.b);
    }
}
