package com.daaw;

import com.google.android.gms.common.Feature;
/* loaded from: classes.dex */
public final class k02 {

    /* renamed from: a */
    public final C2396o3<?> f15573a;

    /* renamed from: b */
    public final Feature f15574b;

    public /* synthetic */ k02(C2396o3 c2396o3, Feature feature, j02 j02Var) {
        this.f15573a = c2396o3;
        this.f15574b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof k02)) {
            k02 k02Var = (k02) obj;
            if (ot0.m13981a(this.f15573a, k02Var.f15573a) && ot0.m13981a(this.f15574b, k02Var.f15574b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ot0.m13980b(this.f15573a, this.f15574b);
    }

    public final String toString() {
        return ot0.m13979c(this).m13978a("key", this.f15573a).m13978a("feature", this.f15574b).toString();
    }
}
