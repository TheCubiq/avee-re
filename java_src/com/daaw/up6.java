package com.daaw;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class up6 {
    public final eq6 a;
    public final eq6 b;
    public final yp6 c;
    public final dq6 d;

    public up6(yp6 yp6Var, dq6 dq6Var, eq6 eq6Var, eq6 eq6Var2, boolean z) {
        this.c = yp6Var;
        this.d = dq6Var;
        this.a = eq6Var;
        if (eq6Var2 == null) {
            this.b = eq6.NONE;
        } else {
            this.b = eq6Var2;
        }
    }

    public static up6 a(yp6 yp6Var, dq6 dq6Var, eq6 eq6Var, eq6 eq6Var2, boolean z) {
        fr6.b(dq6Var, "ImpressionType is null");
        fr6.b(eq6Var, "Impression owner is null");
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

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        br6.h(jSONObject, "impressionOwner", this.a);
        br6.h(jSONObject, "mediaEventsOwner", this.b);
        br6.h(jSONObject, "creativeType", this.c);
        br6.h(jSONObject, "impressionType", this.d);
        br6.h(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }
}
