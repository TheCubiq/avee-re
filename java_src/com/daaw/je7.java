package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class je7 extends l97 {

    /* renamed from: a */
    public final ff7 f15068a;

    public je7(ff7 ff7Var) {
        this.f15068a = ff7Var;
    }

    /* renamed from: a */
    public final ff7 m18542a() {
        return this.f15068a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof je7) {
            ff7 ff7Var = ((je7) obj).f15068a;
            return this.f15068a.m22690b().m7025O().equals(ff7Var.m22690b().m7025O()) && this.f15068a.m22690b().m7023Q().equals(ff7Var.m22690b().m7023Q()) && this.f15068a.m22690b().m7024P().equals(ff7Var.m22690b().m7024P());
        }
        return false;
    }

    public final int hashCode() {
        ff7 ff7Var = this.f15068a;
        return Arrays.hashCode(new Object[]{ff7Var.m22690b(), ff7Var.zzd()});
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.f15068a.m22690b().m7023Q();
        zn7 m7025O = this.f15068a.m22690b().m7025O();
        zn7 zn7Var = zn7.UNKNOWN_PREFIX;
        int ordinal = m7025O.ordinal();
        objArr[1] = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }
}
