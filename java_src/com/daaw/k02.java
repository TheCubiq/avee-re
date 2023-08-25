package com.daaw;

import com.google.android.gms.common.Feature;
/* loaded from: classes.dex */
public final class k02 {
    public final o3<?> a;
    public final Feature b;

    public /* synthetic */ k02(o3 o3Var, Feature feature, j02 j02Var) {
        this.a = o3Var;
        this.b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof k02)) {
            k02 k02Var = (k02) obj;
            if (ot0.a(this.a, k02Var.a) && ot0.a(this.b, k02Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ot0.b(this.a, this.b);
    }

    public final String toString() {
        return ot0.c(this).a("key", this.a).a("feature", this.b).toString();
    }
}
