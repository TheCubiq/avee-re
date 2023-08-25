package com.daaw;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
/* loaded from: classes.dex */
public final class l32 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ LifecycleCallback f16996p;

    /* renamed from: q */
    public final /* synthetic */ String f16997q;

    /* renamed from: r */
    public final /* synthetic */ ky2 f16998r;

    public l32(ky2 ky2Var, LifecycleCallback lifecycleCallback, String str) {
        this.f16998r = ky2Var;
        this.f16996p = lifecycleCallback;
        this.f16997q = str;
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
        ky2 ky2Var = this.f16998r;
        i = ky2Var.f16847q;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.f16996p;
            bundle = ky2Var.f16848r;
            if (bundle != null) {
                bundle3 = ky2Var.f16848r;
                bundle2 = bundle3.getBundle(this.f16997q);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo1178f(bundle2);
        }
        i2 = this.f16998r.f16847q;
        if (i2 >= 2) {
            this.f16996p.mo1174j();
        }
        i3 = this.f16998r.f16847q;
        if (i3 >= 3) {
            this.f16996p.mo1176h();
        }
        i4 = this.f16998r.f16847q;
        if (i4 >= 4) {
            this.f16996p.mo1173k();
        }
        i5 = this.f16998r.f16847q;
        if (i5 >= 5) {
            this.f16996p.m1177g();
        }
    }
}
