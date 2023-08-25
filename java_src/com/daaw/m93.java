package com.daaw;

import android.text.TextUtils;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes.dex */
public final class m93 {
    public static final void a(l93 l93Var, j93 j93Var) {
        if (j93Var.a() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(j93Var.b())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        l93Var.d(j93Var.a(), j93Var.b(), j93Var.c(), j93Var.d());
    }
}
