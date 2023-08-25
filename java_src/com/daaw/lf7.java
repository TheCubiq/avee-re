package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class lf7 {

    /* renamed from: a */
    public final Class f17375a;

    /* renamed from: b */
    public final Class f17376b;

    public /* synthetic */ lf7(Class cls, Class cls2, kf7 kf7Var) {
        this.f17375a = cls;
        this.f17376b = cls2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lf7) {
            lf7 lf7Var = (lf7) obj;
            return lf7Var.f17375a.equals(this.f17375a) && lf7Var.f17376b.equals(this.f17376b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17375a, this.f17376b});
    }

    public final String toString() {
        String simpleName = this.f17375a.getSimpleName();
        String simpleName2 = this.f17376b.getSimpleName();
        return simpleName + " with serialization type: " + simpleName2;
    }
}
