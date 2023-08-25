package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zt5 implements tt5 {

    /* renamed from: a */
    public final q15 f35515a;

    /* renamed from: b */
    public final g77 f35516b;

    /* renamed from: c */
    public final c65 f35517c;

    /* renamed from: d */
    public final pj6 f35518d;

    /* renamed from: e */
    public final a95 f35519e;

    public zt5(q15 q15Var, g77 g77Var, c65 c65Var, pj6 pj6Var, a95 a95Var) {
        this.f35515a = q15Var;
        this.f35516b = g77Var;
        this.f35517c = c65Var;
        this.f35518d = pj6Var;
        this.f35519e = a95Var;
    }

    @Override // com.daaw.qq5
    /* renamed from: a */
    public final boolean mo1905a(fi6 fi6Var, th6 th6Var) {
        yh6 yh6Var = th6Var.f27715t;
        return (yh6Var == null || yh6Var.f33683c == null) ? false : true;
    }

    @Override // com.daaw.qq5
    /* renamed from: b */
    public final f77 mo1904b(final fi6 fi6Var, final th6 th6Var) {
        return s67.m10629n(s67.m10629n(this.f35518d.m13329a(), new w57() { // from class: com.daaw.wt5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return zt5.this.m1901e(th6Var, (u85) obj);
            }
        }, this.f35516b), new w57() { // from class: com.daaw.xt5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return zt5.this.m1900f(fi6Var, th6Var, (JSONArray) obj);
            }
        }, this.f35516b);
    }

    /* renamed from: c */
    public final /* synthetic */ e35 m1903c(f77 f77Var, f77 f77Var2, fi6 fi6Var, th6 th6Var, JSONObject jSONObject) {
        j35 j35Var = (j35) f77Var.get();
        u85 u85Var = (u85) f77Var2.get();
        k35 mo12807c = this.f35515a.mo12807c(new rm4(fi6Var, th6Var, null), new v35(j35Var), new h25(jSONObject, u85Var));
        mo12807c.mo18062j().m24600b();
        mo12807c.mo18061k().m12708a(u85Var);
        mo12807c.mo18063i().m18762a(j35Var.m19130Z());
        mo12807c.mo18060l().m2622a(this.f35519e);
        return mo12807c.mo8312h();
    }

    /* renamed from: d */
    public final /* synthetic */ f77 m1902d(u85 u85Var, JSONObject jSONObject) {
        this.f35518d.m13328b(s67.m10634i(u85Var));
        if (jSONObject.optBoolean("success")) {
            return s67.m10634i(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new ml3("process json failed");
    }

    /* renamed from: e */
    public final /* synthetic */ f77 m1901e(th6 th6Var, final u85 u85Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) zzba.zzc().m23658b(g93.f10439H7)).booleanValue() && vw0.m6694k()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", th6Var.f27715t.f33683c);
        jSONObject2.put("sdk_params", jSONObject);
        return s67.m10629n(u85Var.m8430d("google.afma.nativeAds.preProcessJson", jSONObject2), new w57() { // from class: com.daaw.vt5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return zt5.this.m1902d(u85Var, (JSONObject) obj);
            }
        }, this.f35516b);
    }

    /* renamed from: f */
    public final /* synthetic */ f77 m1900f(fi6 fi6Var, th6 th6Var, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return s67.m10635h(new gi5(3));
        }
        int i = 0;
        if (fi6Var.f9623a.f5824a.f25351k > 1) {
            int length = jSONArray.length();
            this.f35518d.m13327c(Math.min(length, fi6Var.f9623a.f5824a.f25351k));
            ArrayList arrayList = new ArrayList(fi6Var.f9623a.f5824a.f25351k);
            while (i < fi6Var.f9623a.f5824a.f25351k) {
                arrayList.add(i < length ? m1899g(fi6Var, th6Var, jSONArray.getJSONObject(i)) : s67.m10635h(new gi5(3)));
                i++;
            }
            return s67.m10634i(arrayList);
        }
        return s67.m10630m(m1899g(fi6Var, th6Var, jSONArray.getJSONObject(0)), new ey6() { // from class: com.daaw.yt5
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                return Collections.singletonList(s67.m10634i((e35) obj));
            }
        }, this.f35516b);
    }

    /* renamed from: g */
    public final f77 m1899g(final fi6 fi6Var, final th6 th6Var, final JSONObject jSONObject) {
        final f77 m13329a = this.f35518d.m13329a();
        final f77 m25567a = this.f35517c.m25567a(fi6Var, th6Var, jSONObject);
        return s67.m10639d(m13329a, m25567a).m11710a(new Callable() { // from class: com.daaw.ut5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zt5.this.m1903c(m25567a, m13329a, fi6Var, th6Var, jSONObject);
            }
        }, this.f35516b);
    }
}
