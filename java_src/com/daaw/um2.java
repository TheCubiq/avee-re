package com.daaw;

import android.content.Context;
import android.content.pm.PackageInfo;
/* loaded from: classes.dex */
public final class um2 implements Runnable {
    public final /* synthetic */ int p;
    public final /* synthetic */ wm2 q;

    public um2(wm2 wm2Var, int i, boolean z) {
        this.q = wm2Var;
        this.p = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fj2 fj2Var;
        wm2 wm2Var = this.q;
        int i = this.p;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = wm2Var.a.getPackageManager().getPackageInfo(wm2Var.a.getPackageName(), 0);
            Context context = wm2Var.a;
            fj2Var = ps6.a(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            fj2Var = null;
        }
        this.q.j = fj2Var;
        if (this.p < 4) {
            if (fj2Var != null && fj2Var.v0() && !fj2Var.J0().equals("0000000000000000000000000000000000000000000000000000000000000000") && fj2Var.w0() && fj2Var.H0().O() && fj2Var.H0().L() != -2) {
                return;
            }
            this.q.o(this.p + 1, true);
        }
    }
}
