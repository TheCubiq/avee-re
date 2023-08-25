package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public final class g08 {
    public final List a;
    public final List b;

    public /* synthetic */ g08(int i, int i2, f08 f08Var) {
        this.a = tz7.c(i);
        this.b = tz7.c(i2);
    }

    public final g08 a(m08 m08Var) {
        this.b.add(m08Var);
        return this;
    }

    public final g08 b(m08 m08Var) {
        this.a.add(m08Var);
        return this;
    }

    public final k08 c() {
        return new k08(this.a, this.b, null);
    }
}
