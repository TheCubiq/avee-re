package com.daaw;

import android.app.Activity;
/* loaded from: classes.dex */
public class nj0 {
    public final Object a;

    public nj0(Activity activity) {
        ry0.k(activity, "Activity must not be null");
        this.a = activity;
    }

    public final Activity a() {
        return (Activity) this.a;
    }

    public final p30 b() {
        return (p30) this.a;
    }

    public final boolean c() {
        return this.a instanceof Activity;
    }

    public final boolean d() {
        return this.a instanceof p30;
    }
}
