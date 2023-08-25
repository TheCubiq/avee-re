package com.daaw;

import android.content.Context;
import android.os.Build;
/* loaded from: classes.dex */
public class ns0 extends mj<os0> {
    public static final String e = ll0.f("NetworkNotRoamingCtrlr");

    public ns0(Context context, wj1 wj1Var) {
        super(ym1.c(context, wj1Var).d());
    }

    @Override // com.daaw.mj
    public boolean b(qy1 qy1Var) {
        return qy1Var.j.b() == qs0.NOT_ROAMING;
    }

    @Override // com.daaw.mj
    /* renamed from: i */
    public boolean c(os0 os0Var) {
        if (Build.VERSION.SDK_INT >= 24) {
            return (os0Var.a() && os0Var.c()) ? false : true;
        }
        ll0.c().a(e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
        return !os0Var.a();
    }
}
