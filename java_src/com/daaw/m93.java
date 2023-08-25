package com.daaw;

import android.text.TextUtils;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes.dex */
public final class m93 {
    /* renamed from: a */
    public static final void m16147a(l93 l93Var, j93 j93Var) {
        if (j93Var.m18713a() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(j93Var.m18712b())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        l93Var.m17083d(j93Var.m18713a(), j93Var.m18712b(), j93Var.m18711c(), j93Var.m18710d());
    }
}
