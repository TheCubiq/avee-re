package com.daaw;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class up6 {

    /* renamed from: a */
    public final eq6 f29419a;

    /* renamed from: b */
    public final eq6 f29420b;

    /* renamed from: c */
    public final yp6 f29421c;

    /* renamed from: d */
    public final dq6 f29422d;

    public up6(yp6 yp6Var, dq6 dq6Var, eq6 eq6Var, eq6 eq6Var2, boolean z) {
        this.f29421c = yp6Var;
        this.f29422d = dq6Var;
        this.f29419a = eq6Var;
        if (eq6Var2 == null) {
            this.f29420b = eq6.NONE;
        } else {
            this.f29420b = eq6Var2;
        }
    }

    /* renamed from: a */
    public static up6 m7838a(yp6 yp6Var, dq6 dq6Var, eq6 eq6Var, eq6 eq6Var2, boolean z) {
        fr6.m22358b(dq6Var, "ImpressionType is null");
        fr6.m22358b(eq6Var, "Impression owner is null");
        if (eq6Var != eq6.NONE) {
            if (yp6Var == yp6.DEFINED_BY_JAVASCRIPT && eq6Var == eq6.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            if (dq6Var == dq6.DEFINED_BY_JAVASCRIPT && eq6Var == eq6.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            return new up6(yp6Var, dq6Var, eq6Var, eq6Var2, true);
        }
        throw new IllegalArgumentException("Impression owner is none");
    }

    /* renamed from: b */
    public final JSONObject m7837b() {
        JSONObject jSONObject = new JSONObject();
        br6.m25875h(jSONObject, "impressionOwner", this.f29419a);
        br6.m25875h(jSONObject, "mediaEventsOwner", this.f29420b);
        br6.m25875h(jSONObject, "creativeType", this.f29421c);
        br6.m25875h(jSONObject, "impressionType", this.f29422d);
        br6.m25875h(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }
}
