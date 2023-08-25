package com.daaw;

import android.content.Context;
import android.os.Build;
/* loaded from: classes.dex */
public class ms0 extends AbstractC2179mj<os0> {

    /* renamed from: e */
    public static final String f19118e = ll0.m16883f("NetworkMeteredCtrlr");

    public ms0(Context context, wj1 wj1Var) {
        super(ym1.m3513c(context, wj1Var).m3512d());
    }

    @Override // com.daaw.AbstractC2179mj
    /* renamed from: b */
    public boolean mo10995b(qy1 qy1Var) {
        return qy1Var.f24633j.m10322b() == qs0.METERED;
    }

    @Override // com.daaw.AbstractC2179mj
    /* renamed from: i */
    public boolean mo10994c(os0 os0Var) {
        if (Build.VERSION.SDK_INT >= 26) {
            return (os0Var.m14021a() && os0Var.m14020b()) ? false : true;
        }
        ll0.m16885c().mo16882a(f19118e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !os0Var.m14021a();
    }
}
