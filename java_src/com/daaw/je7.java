package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class je7 extends l97 {
    public final ff7 a;

    public je7(ff7 ff7Var) {
        this.a = ff7Var;
    }

    public final ff7 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof je7) {
            ff7 ff7Var = ((je7) obj).a;
            return this.a.b().O().equals(ff7Var.b().O()) && this.a.b().Q().equals(ff7Var.b().Q()) && this.a.b().P().equals(ff7Var.b().P());
        }
        return false;
    }

    public final int hashCode() {
        ff7 ff7Var = this.a;
        return Arrays.hashCode(new Object[]{ff7Var.b(), ff7Var.zzd()});
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.a.b().Q();
        zn7 O = this.a.b().O();
        zn7 zn7Var = zn7.UNKNOWN_PREFIX;
        int ordinal = O.ordinal();
        objArr[1] = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }
}
