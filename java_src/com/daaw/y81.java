package com.daaw;

import android.content.Context;
import android.os.Build;
/* loaded from: classes.dex */
public abstract class y81 {
    public static py1 a(Context context, ly lyVar, s81 s81Var, cg cgVar) {
        return Build.VERSION.SDK_INT >= 21 ? new ph0(context, lyVar, s81Var) : new v1(context, lyVar, cgVar, s81Var);
    }
}
