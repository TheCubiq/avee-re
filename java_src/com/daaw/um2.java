package com.daaw;

import android.content.Context;
import android.content.pm.PackageInfo;
/* loaded from: classes.dex */
public final class um2 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ int f29187p;

    /* renamed from: q */
    public final /* synthetic */ wm2 f29188q;

    public um2(wm2 wm2Var, int i, boolean z) {
        this.f29188q = wm2Var;
        this.f29187p = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fj2 fj2Var;
        wm2 wm2Var = this.f29188q;
        int i = this.f29187p;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = wm2Var.f31324a.getPackageManager().getPackageInfo(wm2Var.f31324a.getPackageName(), 0);
            Context context = wm2Var.f31324a;
            fj2Var = ps6.m13162a(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            fj2Var = null;
        }
        this.f29188q.f31333j = fj2Var;
        if (this.f29187p < 4) {
            if (fj2Var != null && fj2Var.m22538v0() && !fj2Var.m22593J0().equals("0000000000000000000000000000000000000000000000000000000000000000") && fj2Var.m22537w0() && fj2Var.m22595H0().m14251O() && fj2Var.m22595H0().m14254L() != -2) {
                return;
            }
            this.f29188q.m5991o(this.f29187p + 1, true);
        }
    }
}
