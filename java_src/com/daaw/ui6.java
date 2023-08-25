package com.daaw;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ui6 {
    public final JSONObject a;

    public ui6(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public final String a() {
        if (b() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    public final int b() {
        int optInt = this.a.optInt("media_type", -1);
        if (optInt != 0) {
            return optInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
