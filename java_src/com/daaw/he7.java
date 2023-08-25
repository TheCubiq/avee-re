package com.daaw;
/* loaded from: classes.dex */
public final class he7 extends l97 {
    public final String a;
    public final zn7 b;

    public /* synthetic */ he7(String str, zn7 zn7Var, ge7 ge7Var) {
        this.a = str;
        this.b = zn7Var;
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.a;
        zn7 zn7Var = this.b;
        mm7 mm7Var = mm7.UNKNOWN_KEYMATERIAL;
        zn7 zn7Var2 = zn7.UNKNOWN_PREFIX;
        int ordinal = zn7Var.ordinal();
        objArr[1] = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }
}
