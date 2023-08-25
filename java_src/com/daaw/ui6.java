package com.daaw;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ui6 {

    /* renamed from: a */
    public final JSONObject f29101a;

    public ui6(JSONObject jSONObject) {
        this.f29101a = jSONObject;
    }

    /* renamed from: a */
    public final String m8112a() {
        if (m8111b() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    /* renamed from: b */
    public final int m8111b() {
        int optInt = this.f29101a.optInt("media_type", -1);
        if (optInt != 0) {
            return optInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
