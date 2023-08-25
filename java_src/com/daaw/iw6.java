package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
/* loaded from: classes.dex */
public final class iw6 {
    @SuppressLint({"RestrictedApi"})
    public static ew6 a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new jw6(new pw6(context));
    }
}
