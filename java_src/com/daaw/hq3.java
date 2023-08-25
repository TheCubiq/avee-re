package com.daaw;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class hq3 {

    /* renamed from: a */
    public final a74 f12848a;

    /* renamed from: b */
    public final String f12849b;

    public hq3(a74 a74Var, String str) {
        this.f12848a = a74Var;
        this.f12849b = str;
    }

    /* renamed from: b */
    public final void m20489b(int i, int i2, int i3, int i4) {
        try {
            this.f12848a.mo6048l("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            k04.zzh("Error occurred while dispatching default position.", e);
        }
    }

    /* renamed from: c */
    public final void m20488c(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.f12849b);
            a74 a74Var = this.f12848a;
            if (a74Var != null) {
                a74Var.mo6048l("onError", put);
            }
        } catch (JSONException e) {
            k04.zzh("Error occurred while dispatching error event.", e);
        }
    }

    /* renamed from: d */
    public final void m20487d(String str) {
        try {
            this.f12848a.mo6048l("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            k04.zzh("Error occurred while dispatching ready Event.", e);
        }
    }

    /* renamed from: e */
    public final void m20486e(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.f12848a.mo6048l("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put("rotation", i5));
        } catch (JSONException e) {
            k04.zzh("Error occurred while obtaining screen information.", e);
        }
    }

    /* renamed from: f */
    public final void m20485f(int i, int i2, int i3, int i4) {
        try {
            this.f12848a.mo6048l("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            k04.zzh("Error occurred while dispatching size change.", e);
        }
    }

    /* renamed from: g */
    public final void m20484g(String str) {
        try {
            this.f12848a.mo6048l("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            k04.zzh("Error occurred while dispatching state change.", e);
        }
    }
}
