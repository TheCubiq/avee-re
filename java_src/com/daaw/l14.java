package com.daaw;

import java.util.concurrent.atomic.AtomicInteger;
@Deprecated
/* loaded from: classes.dex */
public class l14 {

    /* renamed from: a */
    public final e14 f16958a;

    /* renamed from: b */
    public final AtomicInteger f16959b;

    public l14() {
        e14 e14Var = new e14();
        this.f16958a = e14Var;
        this.f16959b = new AtomicInteger(0);
        s67.m10625r(e14Var, new j14(this), z04.f34310f);
    }

    @Deprecated
    /* renamed from: a */
    public final int m17210a() {
        return this.f16959b.get();
    }

    @Deprecated
    /* renamed from: c */
    public final void m17208c() {
        this.f16958a.m23796c(new Exception());
    }

    @Deprecated
    /* renamed from: d */
    public final void m17207d(Object obj) {
        this.f16958a.m23797b(obj);
    }

    @Deprecated
    /* renamed from: e */
    public final void m17206e(i14 i14Var, g14 g14Var) {
        s67.m10625r(this.f16958a, new k14(this, i14Var, g14Var), z04.f34310f);
    }
}
