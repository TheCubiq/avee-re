package com.daaw;

import android.view.View;
/* loaded from: classes.dex */
public abstract class tp6 {
    /* renamed from: a */
    public static tp6 m8889a(up6 up6Var, vp6 vp6Var) {
        if (rp6.m11081b()) {
            return new xp6(up6Var, vp6Var);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    /* renamed from: b */
    public abstract void mo4836b(View view, zp6 zp6Var, String str);

    /* renamed from: c */
    public abstract void mo4835c();

    /* renamed from: d */
    public abstract void mo4834d(View view);

    /* renamed from: e */
    public abstract void mo4833e();
}
