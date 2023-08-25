package com.daaw;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
/* loaded from: classes.dex */
public final class ds3 implements Runnable {
    public final /* synthetic */ LifecycleCallback p;
    public final /* synthetic */ String q;
    public final /* synthetic */ cl4 r;

    public ds3(cl4 cl4Var, LifecycleCallback lifecycleCallback, String str) {
        this.r = cl4Var;
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
        cl4 cl4Var = this.r;
        i = cl4Var.r0;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.p;
            bundle = cl4Var.s0;
            if (bundle != null) {
                bundle3 = cl4Var.s0;
                bundle2 = bundle3.getBundle(this.q);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.f(bundle2);
        }
        i2 = this.r.r0;
        if (i2 >= 2) {
            this.p.j();
        }
        i3 = this.r.r0;
        if (i3 >= 3) {
            this.p.h();
        }
        i4 = this.r.r0;
        if (i4 >= 4) {
            this.p.k();
        }
        i5 = this.r.r0;
        if (i5 >= 5) {
            this.p.g();
        }
    }
}
