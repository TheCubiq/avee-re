package com.daaw;
/* loaded from: classes.dex */
public final class sv8 {
    public final r84 a;
    public final int[] b;

    public sv8(r84 r84Var, int[] iArr, int i) {
        if (iArr.length == 0) {
            s95.c("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = r84Var;
        this.b = iArr;
    }
}
