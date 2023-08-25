package com.daaw;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class rn extends un implements ad0<un> {
    public JSONArray e;
    public int f;

    public rn(int i, JSONObject jSONObject, boolean z) {
        super(i, jSONObject, (un) null);
        this.f = i;
        if (!z) {
            try {
                this.e = this.c.getJSONArray("elements");
                return;
            } catch (JSONException e) {
                lz1.c("Failed to create from saved string: " + e.getMessage());
            }
        }
        E0();
    }

    public static rn t0(int i, JSONObject jSONObject) {
        return new rn(i, jSONObject, true);
    }

    public static rn v0(int i, JSONObject jSONObject) {
        return new rn(i, jSONObject, false);
    }

    @Override // com.daaw.ad0
    /* renamed from: A0 */
    public un a(int i) {
        return y0(i);
    }

    public final JSONObject B0() {
        return C0(null);
    }

    public final JSONObject C0(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject != null) {
            try {
                jSONObject2 = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
                lz1.c("json obj cloning failed");
                jSONObject2 = new JSONObject();
            }
        } else {
            jSONObject2 = new JSONObject();
        }
        this.e.put(jSONObject2);
        return jSONObject2;
    }

    public void D0() {
        E0();
    }

    public final void E0() {
        try {
            JSONArray jSONArray = new JSONArray();
            this.e = jSONArray;
            this.c.put("elements", jSONArray);
        } catch (JSONException e) {
            lz1.c(e.getMessage());
            this.e = null;
        }
    }

    public void F0(int i, un unVar) {
        try {
            this.e.put(i, unVar.c);
        } catch (JSONException unused) {
        }
    }

    @Override // com.daaw.ad0
    public int c() {
        return this.e.length();
    }

    public int u0() {
        return this.f;
    }

    @Override // com.daaw.ad0
    /* renamed from: w0 */
    public un b() {
        return new un(-1, B0(), this);
    }

    public un x0(un unVar) {
        return new un(-1, C0(unVar.c), this);
    }

    public un y0(int i) {
        if (i >= 0 && i < this.e.length()) {
            try {
                return new un(i, this.e.getJSONObject(i), this);
            } catch (JSONException e) {
                lz1.c(e.getMessage());
            }
        }
        return null;
    }

    public un z0(List<String> list, int i) {
        int x = list.size() > i ? br1.x(list.get(i), -1) : -1;
        if (x < 0) {
            return null;
        }
        un y0 = y0(x);
        if (y0 == null) {
            lz1.c("entry is null");
            return null;
        }
        while (true) {
            i++;
            if (i >= list.size()) {
                return y0;
            }
            y0 = y0.h(list.get(i));
        }
    }
}
