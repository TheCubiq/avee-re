package com.daaw;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class vn implements ad0<rn> {
    public JSONObject a;
    public JSONArray b;

    public vn(JSONObject jSONObject) {
        if (jSONObject == null) {
            this.a = new JSONObject();
            n();
            return;
        }
        try {
            this.a = jSONObject;
            this.b = jSONObject.getJSONArray("compositions");
        } catch (JSONException e) {
            lz1.c("Failed to create from saved string: " + e.getMessage());
            this.a = new JSONObject();
            n();
        }
    }

    public static vn d() {
        return new vn(null);
    }

    public static vn e(String str) {
        JSONObject jSONObject;
        if (str == null) {
            return null;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        return new vn(jSONObject);
    }

    public static vn g(String str) {
        return e(str);
    }

    @Override // com.daaw.ad0
    public int c() {
        return this.b.length();
    }

    @Override // com.daaw.ad0
    /* renamed from: f */
    public rn b() {
        return rn.t0(this.b.length(), k());
    }

    public int h() {
        JSONObject jSONObject = this.a;
        if (jSONObject == null) {
            return -1;
        }
        try {
            return jSONObject.getInt("template");
        } catch (JSONException unused) {
            return -1;
        }
    }

    public un i(List<String> list) {
        if (list == null) {
            return null;
        }
        int x = list.size() > 0 ? br1.x(list.get(0), -1) : -1;
        if (x < 0) {
            return null;
        }
        rn a = a(x);
        if (a == null) {
            lz1.c("entry is null");
            return null;
        } else if (list.size() > 1) {
            if (br1.x(list.get(1), -1) < 0) {
                return null;
            }
            return a.z0(list, 1);
        } else {
            return a;
        }
    }

    @Override // com.daaw.ad0
    /* renamed from: j */
    public rn a(int i) {
        if (i >= 0 && i < this.b.length()) {
            try {
                return rn.v0(i, this.b.getJSONObject(i));
            } catch (JSONException e) {
                lz1.c(e.getMessage());
            }
        }
        return null;
    }

    public final JSONObject k() {
        JSONObject jSONObject = new JSONObject();
        this.b.put(jSONObject);
        return jSONObject;
    }

    public String l() {
        JSONObject jSONObject = this.a;
        if (jSONObject == null) {
            return "";
        }
        try {
            return jSONObject.getString("ver");
        } catch (JSONException unused) {
            return "";
        }
    }

    public void m() {
        n();
    }

    public final void n() {
        try {
            JSONArray jSONArray = new JSONArray();
            this.b = jSONArray;
            this.a.put("compositions", jSONArray);
        } catch (JSONException e) {
            lz1.c(e.getMessage());
            this.b = null;
        }
    }

    public String o() {
        JSONObject jSONObject = this.a;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    public String p() {
        JSONObject jSONObject = this.a;
        if (jSONObject == null) {
            return "";
        }
        try {
            return jSONObject.toString(2);
        } catch (JSONException unused) {
            return "";
        }
    }

    public void q(int i) {
        JSONObject jSONObject = this.a;
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("template", i);
        } catch (JSONException unused) {
        }
    }

    public void r(int i, rn rnVar) {
        try {
            this.b.put(i, rnVar.c);
        } catch (JSONException unused) {
        }
    }

    public void s(String str) {
        try {
            this.a.put("objType", str);
        } catch (JSONException unused) {
        }
    }

    public void t(String str) {
        JSONObject jSONObject = this.a;
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("ver", str);
        } catch (JSONException unused) {
        }
    }
}
