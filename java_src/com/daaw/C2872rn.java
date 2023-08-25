package com.daaw;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.daaw.rn */
/* loaded from: classes.dex */
public class C2872rn extends C3239un implements ad0<C3239un> {

    /* renamed from: e */
    public JSONArray f25420e;

    /* renamed from: f */
    public int f25421f;

    public C2872rn(int i, JSONObject jSONObject, boolean z) {
        super(i, jSONObject, (C3239un) null);
        this.f25421f = i;
        if (!z) {
            try {
                this.f25420e = this.f29228c.getJSONArray("elements");
                return;
            } catch (JSONException e) {
                lz1.m16363c("Failed to create from saved string: " + e.getMessage());
            }
        }
        m11169E0();
    }

    /* renamed from: t0 */
    public static C2872rn m11167t0(int i, JSONObject jSONObject) {
        return new C2872rn(i, jSONObject, true);
    }

    /* renamed from: v0 */
    public static C2872rn m11165v0(int i, JSONObject jSONObject) {
        return new C2872rn(i, jSONObject, false);
    }

    @Override // com.daaw.ad0
    /* renamed from: A0 */
    public C3239un mo7019a(int i) {
        return m11162y0(i);
    }

    /* renamed from: B0 */
    public final JSONObject m11172B0() {
        return m11171C0(null);
    }

    /* renamed from: C0 */
    public final JSONObject m11171C0(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject != null) {
            try {
                jSONObject2 = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
                lz1.m16363c("json obj cloning failed");
                jSONObject2 = new JSONObject();
            }
        } else {
            jSONObject2 = new JSONObject();
        }
        this.f25420e.put(jSONObject2);
        return jSONObject2;
    }

    /* renamed from: D0 */
    public void m11170D0() {
        m11169E0();
    }

    /* renamed from: E0 */
    public final void m11169E0() {
        try {
            JSONArray jSONArray = new JSONArray();
            this.f25420e = jSONArray;
            this.f29228c.put("elements", jSONArray);
        } catch (JSONException e) {
            lz1.m16363c(e.getMessage());
            this.f25420e = null;
        }
    }

    /* renamed from: F0 */
    public void m11168F0(int i, C3239un c3239un) {
        try {
            this.f25420e.put(i, c3239un.f29228c);
        } catch (JSONException unused) {
        }
    }

    @Override // com.daaw.ad0
    /* renamed from: c */
    public int mo7017c() {
        return this.f25420e.length();
    }

    /* renamed from: u0 */
    public int m11166u0() {
        return this.f25421f;
    }

    @Override // com.daaw.ad0
    /* renamed from: w0 */
    public C3239un mo7018b() {
        return new C3239un(-1, m11172B0(), this);
    }

    /* renamed from: x0 */
    public C3239un m11163x0(C3239un c3239un) {
        return new C3239un(-1, m11171C0(c3239un.f29228c), this);
    }

    /* renamed from: y0 */
    public C3239un m11162y0(int i) {
        if (i >= 0 && i < this.f25420e.length()) {
            try {
                return new C3239un(i, this.f25420e.getJSONObject(i), this);
            } catch (JSONException e) {
                lz1.m16363c(e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: z0 */
    public C3239un m11161z0(List<String> list, int i) {
        int m25885x = list.size() > i ? br1.m25885x(list.get(i), -1) : -1;
        if (m25885x < 0) {
            return null;
        }
        C3239un m11162y0 = m11162y0(m25885x);
        if (m11162y0 == null) {
            lz1.m16363c("entry is null");
            return null;
        }
        while (true) {
            i++;
            if (i >= list.size()) {
                return m11162y0;
            }
            m11162y0 = m11162y0.m7967h(list.get(i));
        }
    }
}
