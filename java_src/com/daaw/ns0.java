package com.daaw;

import android.content.Context;
import android.os.Build;
/* loaded from: classes.dex */
public class ns0 extends AbstractC2179mj<os0> {

    /* renamed from: e */
    public static final String f20611e = ll0.m16883f("NetworkNotRoamingCtrlr");

    public ns0(Context context, wj1 wj1Var) {
        super(ym1.m3513c(context, wj1Var).m3512d());
    }

    @Override // com.daaw.AbstractC2179mj
    /* renamed from: b */
    public boolean mo10995b(qy1 qy1Var) {
        return qy1Var.f24633j.m10322b() == qs0.NOT_ROAMING;
    }

    @Override // com.daaw.AbstractC2179mj
    /* renamed from: i */
    public boolean mo10994c(os0 os0Var) {
        if (Build.VERSION.SDK_INT >= 24) {
            return (os0Var.m14021a() && os0Var.m14019c()) ? false : true;
        }
        ll0.m16885c().mo16882a(f20611e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
        return !os0Var.m14021a();
    }
}
