package com.daaw;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
/* loaded from: classes.dex */
public final class l32 implements Runnable {
    public final /* synthetic */ LifecycleCallback p;
    public final /* synthetic */ String q;
    public final /* synthetic */ ky2 r;

    public l32(ky2 ky2Var, LifecycleCallback lifecycleCallback, String str) {
        this.r = ky2Var;
        this.p = lifecycleCallback;
        this.q = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        ky2 ky2Var = this.r;
        i = ky2Var.q;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.p;
            bundle = ky2Var.r;
            if (bundle != null) {
                bundle3 = ky2Var.r;
                bundle2 = bundle3.getBundle(this.q);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.f(bundle2);
        }
        i2 = this.r.q;
        if (i2 >= 2) {
            this.p.j();
        }
        i3 = this.r.q;
        if (i3 >= 3) {
            this.p.h();
        }
        i4 = this.r.q;
        if (i4 >= 4) {
            this.p.k();
        }
        i5 = this.r.q;
        if (i5 >= 5) {
            this.p.g();
        }
    }
}
