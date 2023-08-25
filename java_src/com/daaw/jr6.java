package com.daaw;

import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class jr6 {
    public JSONObject a;
    public final sr6 b;

    public jr6(sr6 sr6Var) {
        this.b = sr6Var;
    }

    public final JSONObject a() {
        return this.a;
    }

    public final void b() {
        this.b.b(new tr6(this, null));
    }

    public final void c(JSONObject jSONObject, HashSet hashSet, long j) {
        this.b.b(new ur6(this, hashSet, jSONObject, j, null));
    }

    public final void d(JSONObject jSONObject, HashSet hashSet, long j) {
        this.b.b(new vr6(this, hashSet, jSONObject, j, null));
    }

    public final void e(JSONObject jSONObject) {
        this.a = jSONObject;
    }
}
