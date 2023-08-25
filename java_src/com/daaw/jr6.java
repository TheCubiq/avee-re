package com.daaw;

import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class jr6 {

    /* renamed from: a */
    public JSONObject f15352a;

    /* renamed from: b */
    public final sr6 f15353b;

    public jr6(sr6 sr6Var) {
        this.f15353b = sr6Var;
    }

    /* renamed from: a */
    public final JSONObject m18312a() {
        return this.f15352a;
    }

    /* renamed from: b */
    public final void m18311b() {
        this.f15353b.m9936b(new tr6(this, null));
    }

    /* renamed from: c */
    public final void m18310c(JSONObject jSONObject, HashSet hashSet, long j) {
        this.f15353b.m9936b(new ur6(this, hashSet, jSONObject, j, null));
    }

    /* renamed from: d */
    public final void m18309d(JSONObject jSONObject, HashSet hashSet, long j) {
        this.f15353b.m9936b(new vr6(this, hashSet, jSONObject, j, null));
    }

    /* renamed from: e */
    public final void m18308e(JSONObject jSONObject) {
        this.f15352a = jSONObject;
    }
}
