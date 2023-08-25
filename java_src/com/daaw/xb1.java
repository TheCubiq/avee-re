package com.daaw;

import org.json.JSONObject;
/* loaded from: classes2.dex */
public class xb1 {

    /* renamed from: a */
    public final InterfaceC2196mn f32323a;

    public xb1(InterfaceC2196mn interfaceC2196mn) {
        this.f32323a = interfaceC2196mn;
    }

    /* renamed from: a */
    public static yb1 m5313a(int i) {
        if (i != 3) {
            ml0 m15976f = ml0.m15976f();
            m15976f.m15978d("Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.");
            return new C3463wr();
        }
        return new cc1();
    }

    /* renamed from: b */
    public tb1 m5312b(JSONObject jSONObject) {
        return m5313a(jSONObject.getInt("settings_version")).mo3943a(this.f32323a, jSONObject);
    }
}
