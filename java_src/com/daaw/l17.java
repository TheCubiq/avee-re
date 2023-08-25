package com.daaw;

import java.util.Comparator;
/* loaded from: classes.dex */
public final class l17 extends n17 {
    public l17() {
        super(null);
    }

    public static final n17 j(int i) {
        n17 n17Var;
        n17 n17Var2;
        n17 n17Var3;
        if (i < 0) {
            n17Var3 = n17.b;
            return n17Var3;
        } else if (i > 0) {
            n17Var2 = n17.c;
            return n17Var2;
        } else {
            n17Var = n17.a;
            return n17Var;
        }
    }

    @Override // com.daaw.n17
    public final int a() {
        return 0;
    }

    @Override // com.daaw.n17
    public final n17 b(int i, int i2) {
        return j(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    @Override // com.daaw.n17
    public final n17 c(Object obj, Object obj2, Comparator comparator) {
        return j(comparator.compare(obj, obj2));
    }

    @Override // com.daaw.n17
    public final n17 d(boolean z, boolean z2) {
        return j(h47.a(z, z2));
    }

    @Override // com.daaw.n17
    public final n17 e(boolean z, boolean z2) {
        return j(h47.a(false, false));
    }
}
