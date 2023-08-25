package com.daaw;

import android.content.Context;
import android.os.Build;
/* loaded from: classes.dex */
public class rs0 extends AbstractC2179mj<os0> {
    public rs0(Context context, wj1 wj1Var) {
        super(ym1.m3513c(context, wj1Var).m3512d());
    }

    @Override // com.daaw.AbstractC2179mj
    /* renamed from: b */
    public boolean mo10995b(qy1 qy1Var) {
        return qy1Var.f24633j.m10322b() == qs0.UNMETERED || (Build.VERSION.SDK_INT >= 30 && qy1Var.f24633j.m10322b() == qs0.TEMPORARILY_UNMETERED);
    }

    @Override // com.daaw.AbstractC2179mj
    /* renamed from: i */
    public boolean mo10994c(os0 os0Var) {
        return !os0Var.m14021a() || os0Var.m14020b();
    }
}
