package com.daaw;

import android.content.Context;
import android.os.Build;
/* loaded from: classes.dex */
public class rs0 extends mj<os0> {
    public rs0(Context context, wj1 wj1Var) {
        super(ym1.c(context, wj1Var).d());
    }

    @Override // com.daaw.mj
    public boolean b(qy1 qy1Var) {
        return qy1Var.j.b() == qs0.UNMETERED || (Build.VERSION.SDK_INT >= 30 && qy1Var.j.b() == qs0.TEMPORARILY_UNMETERED);
    }

    @Override // com.daaw.mj
    /* renamed from: i */
    public boolean c(os0 os0Var) {
        return !os0Var.a() || os0Var.b();
    }
}
