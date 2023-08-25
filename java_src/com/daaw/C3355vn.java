package com.daaw;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.daaw.vn */
/* loaded from: classes.dex */
public class C3355vn implements ad0<C2872rn> {

    /* renamed from: a */
    public JSONObject f30338a;

    /* renamed from: b */
    public JSONArray f30339b;

    public C3355vn(JSONObject jSONObject) {
        if (jSONObject == null) {
            this.f30338a = new JSONObject();
            m7006n();
            return;
        }
        try {
            this.f30338a = jSONObject;
            this.f30339b = jSONObject.getJSONArray("compositions");
        } catch (JSONException e) {
            lz1.m16363c("Failed to create from saved string: " + e.getMessage());
            this.f30338a = new JSONObject();
            m7006n();
        }
    }

    /* renamed from: d */
    public static C3355vn m7016d() {
        return new C3355vn(null);
    }

    /* renamed from: e */
    public static C3355vn m7015e(String str) {
        JSONObject jSONObject;
        if (str == null) {
            return null;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        return new C3355vn(jSONObject);
    }

    /* renamed from: g */
    public static C3355vn m7013g(String str) {
        return m7015e(str);
    }

    @Override // com.daaw.ad0
    /* renamed from: c */
    public int mo7017c() {
        return this.f30339b.length();
    }

    @Override // com.daaw.ad0
    /* renamed from: f */
    public C2872rn mo7018b() {
        return C2872rn.m11167t0(this.f30339b.length(), m7009k());
    }

    /* renamed from: h */
    public int m7012h() {
        JSONObject jSONObject = this.f30338a;
        if (jSONObject == null) {
            return -1;
        }
        try {
            return jSONObject.getInt("template");
        } catch (JSONException unused) {
            return -1;
        }
    }

    /* renamed from: i */
    public C3239un m7011i(List<String> list) {
        if (list == null) {
            return null;
        }
        int m25885x = list.size() > 0 ? br1.m25885x(list.get(0), -1) : -1;
        if (m25885x < 0) {
            return null;
        }
        C2872rn mo7019a = mo7019a(m25885x);
        if (mo7019a == null) {
            lz1.m16363c("entry is null");
            return null;
        } else if (list.size() > 1) {
            if (br1.m25885x(list.get(1), -1) < 0) {
                return null;
            }
            return mo7019a.m11161z0(list, 1);
        } else {
            return mo7019a;
        }
    }

    @Override // com.daaw.ad0
    /* renamed from: j */
    public C2872rn mo7019a(int i) {
        if (i >= 0 && i < this.f30339b.length()) {
            try {
                return C2872rn.m11165v0(i, this.f30339b.getJSONObject(i));
            } catch (JSONException e) {
                lz1.m16363c(e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: k */
    public final JSONObject m7009k() {
        JSONObject jSONObject = new JSONObject();
        this.f30339b.put(jSONObject);
        return jSONObject;
    }

    /* renamed from: l */
    public String m7008l() {
        JSONObject jSONObject = this.f30338a;
        if (jSONObject == null) {
            return "";
        }
        try {
            return jSONObject.getString("ver");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: m */
    public void m7007m() {
        m7006n();
    }

    /* renamed from: n */
    public final void m7006n() {
        try {
            JSONArray jSONArray = new JSONArray();
            this.f30339b = jSONArray;
            this.f30338a.put("compositions", jSONArray);
        } catch (JSONException e) {
            lz1.m16363c(e.getMessage());
            this.f30339b = null;
        }
    }

    /* renamed from: o */
    public String m7005o() {
        JSONObject jSONObject = this.f30338a;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    /* renamed from: p */
    public String m7004p() {
        JSONObject jSONObject = this.f30338a;
        if (jSONObject == null) {
            return "";
        }
        try {
            return jSONObject.toString(2);
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: q */
    public void m7003q(int i) {
        JSONObject jSONObject = this.f30338a;
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("template", i);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: r */
    public void m7002r(int i, C2872rn c2872rn) {
        try {
            this.f30339b.put(i, c2872rn.f29228c);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: s */
    public void m7001s(String str) {
        try {
            this.f30338a.put("objType", str);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: t */
    public void m7000t(String str) {
        JSONObject jSONObject = this.f30338a;
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("ver", str);
        } catch (JSONException unused) {
        }
    }
}
