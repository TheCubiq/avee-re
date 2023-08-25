package com.daaw;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
/* loaded from: classes.dex */
public final class ds3 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ LifecycleCallback f7703p;

    /* renamed from: q */
    public final /* synthetic */ String f7704q;

    /* renamed from: r */
    public final /* synthetic */ cl4 f7705r;

    public ds3(cl4 cl4Var, LifecycleCallback lifecycleCallback, String str) {
        this.f7705r = cl4Var;
        this.f7703p = lifecycleCallback;
        this.f7704q = str;
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
        cl4 cl4Var = this.f7705r;
        i = cl4Var.f5942r0;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.f7703p;
            bundle = cl4Var.f5943s0;
            if (bundle != null) {
                bundle3 = cl4Var.f5943s0;
                bundle2 = bundle3.getBundle(this.f7704q);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo1178f(bundle2);
        }
        i2 = this.f7705r.f5942r0;
        if (i2 >= 2) {
            this.f7703p.mo1174j();
        }
        i3 = this.f7705r.f5942r0;
        if (i3 >= 3) {
            this.f7703p.mo1176h();
        }
        i4 = this.f7705r.f5942r0;
        if (i4 >= 4) {
            this.f7703p.mo1173k();
        }
        i5 = this.f7705r.f5942r0;
        if (i5 >= 5) {
            this.f7703p.m1177g();
        }
    }
}
