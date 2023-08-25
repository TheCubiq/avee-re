package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ug5 {

    /* renamed from: a */
    public final String f29043a;

    /* renamed from: b */
    public final String f29044b;

    /* renamed from: c */
    public final String f29045c;

    /* renamed from: d */
    public final int f29046d;

    /* renamed from: e */
    public final String f29047e;

    /* renamed from: f */
    public final int f29048f;

    /* renamed from: g */
    public final boolean f29049g;

    public ug5(String str, String str2, String str3, int i, String str4, int i2, boolean z) {
        this.f29043a = str;
        this.f29044b = str2;
        this.f29045c = str3;
        this.f29046d = i;
        this.f29047e = str4;
        this.f29048f = i2;
        this.f29049g = z;
    }

    /* renamed from: a */
    public final JSONObject m8253a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f29043a);
        jSONObject.put("version", this.f29045c);
        if (((Boolean) zzba.zzc().m23658b(g93.f10817r8)).booleanValue()) {
            jSONObject.put("sdkVersion", this.f29044b);
        }
        jSONObject.put("status", this.f29046d);
        jSONObject.put("description", this.f29047e);
        jSONObject.put("initializationLatencyMillis", this.f29048f);
        if (((Boolean) zzba.zzc().m23658b(g93.f10828s8)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.f29049g);
        }
        return jSONObject;
    }
}
