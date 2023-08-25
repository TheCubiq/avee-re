package com.daaw;
/* loaded from: classes.dex */
public final class he7 extends l97 {

    /* renamed from: a */
    public final String f12480a;

    /* renamed from: b */
    public final zn7 f12481b;

    public /* synthetic */ he7(String str, zn7 zn7Var, ge7 ge7Var) {
        this.f12480a = str;
        this.f12481b = zn7Var;
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.f12480a;
        zn7 zn7Var = this.f12481b;
        mm7 mm7Var = mm7.UNKNOWN_KEYMATERIAL;
        zn7 zn7Var2 = zn7.UNKNOWN_PREFIX;
        int ordinal = zn7Var.ordinal();
        objArr[1] = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }
}
