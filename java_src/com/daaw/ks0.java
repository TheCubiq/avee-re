package com.daaw;

import android.content.Context;
import android.os.Build;
/* loaded from: classes.dex */
public class ks0 extends mj<os0> {
    public ks0(Context context, wj1 wj1Var) {
        super(ym1.c(context, wj1Var).d());
    }

    @Override // com.daaw.mj
    public boolean b(qy1 qy1Var) {
        return qy1Var.j.b() == qs0.CONNECTED;
    }

    @Override // com.daaw.mj
    /* renamed from: i */
    public boolean c(os0 os0Var) {
        return Build.VERSION.SDK_INT >= 26 ? (os0Var.a() && os0Var.d()) ? false : true : !os0Var.a();
    }
}
