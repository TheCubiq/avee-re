package com.daaw;

import android.view.View;
/* loaded from: classes.dex */
public abstract class tp6 {
    public static tp6 a(up6 up6Var, vp6 vp6Var) {
        if (rp6.b()) {
            return new xp6(up6Var, vp6Var);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void b(View view, zp6 zp6Var, String str);

    public abstract void c();

    public abstract void d(View view);

    public abstract void e();
}
