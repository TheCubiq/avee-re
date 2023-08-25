package com.daaw;

import java.util.Comparator;
/* loaded from: classes.dex */
public final class l17 extends n17 {
    public l17() {
        super(null);
    }

    /* renamed from: j */
    public static final n17 m17202j(int i) {
        n17 n17Var;
        n17 n17Var2;
        n17 n17Var3;
        if (i < 0) {
            n17Var3 = n17.f19345b;
            return n17Var3;
        } else if (i > 0) {
            n17Var2 = n17.f19346c;
            return n17Var2;
        } else {
            n17Var = n17.f19344a;
            return n17Var;
        }
    }

    @Override // com.daaw.n17
    /* renamed from: a */
    public final int mo15594a() {
        return 0;
    }

    @Override // com.daaw.n17
    /* renamed from: b */
    public final n17 mo15593b(int i, int i2) {
        return m17202j(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    @Override // com.daaw.n17
    /* renamed from: c */
    public final n17 mo15592c(Object obj, Object obj2, Comparator comparator) {
        return m17202j(comparator.compare(obj, obj2));
    }

    @Override // com.daaw.n17
    /* renamed from: d */
    public final n17 mo15591d(boolean z, boolean z2) {
        return m17202j(h47.m21033a(z, z2));
    }

    @Override // com.daaw.n17
    /* renamed from: e */
    public final n17 mo15590e(boolean z, boolean z2) {
        return m17202j(h47.m21033a(false, false));
    }
}
