package com.daaw;

import java.util.Arrays;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class pe5 {

    /* renamed from: a */
    public final String f22871a;

    /* renamed from: b */
    public final String f22872b;

    public /* synthetic */ pe5(JSONObject jSONObject, il4 il4Var) {
        this.f22871a = jSONObject.optString("productId");
        this.f22872b = jSONObject.optString("productType");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pe5) {
            pe5 pe5Var = (pe5) obj;
            return this.f22871a.equals(pe5Var.f22871a) && this.f22872b.equals(pe5Var.f22872b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22871a, this.f22872b});
    }

    public final String toString() {
        return String.format("{id: %s, type: %s}", this.f22871a, this.f22872b);
    }
}
