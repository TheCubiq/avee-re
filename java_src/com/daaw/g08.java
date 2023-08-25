package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public final class g08 {

    /* renamed from: a */
    public final List f10132a;

    /* renamed from: b */
    public final List f10133b;

    public /* synthetic */ g08(int i, int i2, f08 f08Var) {
        this.f10132a = tz7.m8658c(i);
        this.f10133b = tz7.m8658c(i2);
    }

    /* renamed from: a */
    public final g08 m22105a(m08 m08Var) {
        this.f10133b.add(m08Var);
        return this;
    }

    /* renamed from: b */
    public final g08 m22104b(m08 m08Var) {
        this.f10132a.add(m08Var);
        return this;
    }

    /* renamed from: c */
    public final k08 m22103c() {
        return new k08(this.f10132a, this.f10133b, null);
    }
}
