package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public class ez1 {
    public static ez1 b = new ez1();
    public iv0 a = null;

    public static iv0 a(Context context) {
        return b.b(context);
    }

    public final synchronized iv0 b(Context context) {
        if (this.a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.a = new iv0(context);
        }
        return this.a;
    }
}
