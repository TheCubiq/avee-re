package com.daaw;

import android.app.AppOpsManager;
/* loaded from: classes.dex */
public final class fn2 implements AppOpsManager.OnOpActiveChangedListener {
    public final /* synthetic */ gn2 a;

    public fn2(gn2 gn2Var) {
        this.a = gn2Var;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        long j;
        gn2 gn2Var;
        boolean z2;
        long j2;
        long j3;
        if (z) {
            this.a.a = System.currentTimeMillis();
            gn2Var = this.a;
            z2 = true;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            gn2 gn2Var2 = this.a;
            j = gn2Var2.b;
            if (j > 0) {
                j2 = gn2Var2.b;
                if (currentTimeMillis >= j2) {
                    j3 = gn2Var2.b;
                    gn2Var2.c = currentTimeMillis - j3;
                }
            }
            gn2Var = this.a;
            z2 = false;
        }
        gn2Var.d = z2;
    }
}
