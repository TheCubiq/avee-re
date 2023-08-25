package com.daaw;

import android.view.View;
/* loaded from: classes.dex */
public final class nq6 {
    public final wr6 a;
    public final String b;
    public final zp6 c;
    public final String d = "Ad overlay";

    public nq6(View view, zp6 zp6Var, String str) {
        this.a = new wr6(view);
        this.b = view.getClass().getCanonicalName();
        this.c = zp6Var;
    }

    public final zp6 a() {
        return this.c;
    }

    public final wr6 b() {
        return this.a;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }
}
