package com.daaw;

import org.json.JSONObject;
/* loaded from: classes2.dex */
public class xb1 {
    public final mn a;

    public xb1(mn mnVar) {
        this.a = mnVar;
    }

    public static yb1 a(int i) {
        if (i != 3) {
            ml0 f = ml0.f();
            f.d("Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.");
            return new wr();
        }
        return new cc1();
    }

    public tb1 b(JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.a, jSONObject);
    }
}
