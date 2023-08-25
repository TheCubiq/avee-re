package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class jf7 {

    /* renamed from: a */
    public final Class f15076a;

    /* renamed from: b */
    public final dq7 f15077b;

    public /* synthetic */ jf7(Class cls, dq7 dq7Var, if7 if7Var) {
        this.f15076a = cls;
        this.f15077b = dq7Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jf7) {
            jf7 jf7Var = (jf7) obj;
            return jf7Var.f15076a.equals(this.f15076a) && jf7Var.f15077b.equals(this.f15077b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15076a, this.f15077b});
    }

    public final String toString() {
        String simpleName = this.f15076a.getSimpleName();
        String valueOf = String.valueOf(this.f15077b);
        return simpleName + ", object identifier: " + valueOf;
    }
}
