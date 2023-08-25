package com.daaw;

import android.app.AppOpsManager;
/* loaded from: classes.dex */
public final class fn2 implements AppOpsManager.OnOpActiveChangedListener {

    /* renamed from: a */
    public final /* synthetic */ gn2 f9708a;

    public fn2(gn2 gn2Var) {
        this.f9708a = gn2Var;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        long j;
        gn2 gn2Var;
        boolean z2;
        long j2;
        long j3;
        if (z) {
            this.f9708a.f11471a = System.currentTimeMillis();
            gn2Var = this.f9708a;
            z2 = true;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            gn2 gn2Var2 = this.f9708a;
            j = gn2Var2.f11472b;
            if (j > 0) {
                j2 = gn2Var2.f11472b;
                if (currentTimeMillis >= j2) {
                    j3 = gn2Var2.f11472b;
                    gn2Var2.f11473c = currentTimeMillis - j3;
                }
            }
            gn2Var = this.f9708a;
            z2 = false;
        }
        gn2Var.f11474d = z2;
    }
}
