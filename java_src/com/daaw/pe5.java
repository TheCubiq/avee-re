package com.daaw;

import java.util.Arrays;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class pe5 {
    public final String a;
    public final String b;

    public /* synthetic */ pe5(JSONObject jSONObject, il4 il4Var) {
        this.a = jSONObject.optString("productId");
        this.b = jSONObject.optString("productType");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pe5) {
            pe5 pe5Var = (pe5) obj;
            return this.a.equals(pe5Var.a) && this.b.equals(pe5Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return String.format("{id: %s, type: %s}", this.a, this.b);
    }
}
