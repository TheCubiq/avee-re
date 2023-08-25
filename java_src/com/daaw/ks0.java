package com.daaw;

import android.content.Context;
import android.os.Build;
/* loaded from: classes.dex */
public class ks0 extends AbstractC2179mj<os0> {
    public ks0(Context context, wj1 wj1Var) {
        super(ym1.m3513c(context, wj1Var).m3512d());
    }

    @Override // com.daaw.AbstractC2179mj
    /* renamed from: b */
    public boolean mo10995b(qy1 qy1Var) {
        return qy1Var.f24633j.m10322b() == qs0.CONNECTED;
    }

    @Override // com.daaw.AbstractC2179mj
    /* renamed from: i */
    public boolean mo10994c(os0 os0Var) {
        return Build.VERSION.SDK_INT >= 26 ? (os0Var.m14021a() && os0Var.m14018d()) ? false : true : !os0Var.m14021a();
    }
}
