package com.daaw;

import android.content.Context;
import android.os.Build;
/* loaded from: classes.dex */
public class ms0 extends mj<os0> {
    public static final String e = ll0.f("NetworkMeteredCtrlr");

    public ms0(Context context, wj1 wj1Var) {
        super(ym1.c(context, wj1Var).d());
    }

    @Override // com.daaw.mj
    public boolean b(qy1 qy1Var) {
        return qy1Var.j.b() == qs0.METERED;
    }

    @Override // com.daaw.mj
    /* renamed from: i */
    public boolean c(os0 os0Var) {
        if (Build.VERSION.SDK_INT >= 26) {
            return (os0Var.a() && os0Var.b()) ? false : true;
        }
        ll0.c().a(e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !os0Var.a();
    }
}
