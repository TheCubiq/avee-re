package com.daaw;

import android.content.Context;
import android.os.Looper;
/* loaded from: classes.dex */
public final class ss6 {
    public final Context a;
    public final Looper b;

    public ss6(Context context, Looper looper) {
        this.a = context;
        this.b = looper;
    }

    public final void a(String str) {
        gt6 L = lt6.L();
        L.s(this.a.getPackageName());
        L.u(2);
        dt6 L2 = et6.L();
        L2.s(str);
        L2.t(2);
        L.t(L2);
        new ts6(this.a, this.b, (lt6) L.n()).a();
    }
}
