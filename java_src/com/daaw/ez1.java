package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public class ez1 {

    /* renamed from: b */
    public static ez1 f8970b = new ez1();

    /* renamed from: a */
    public iv0 f8971a = null;

    /* renamed from: a */
    public static iv0 m22979a(Context context) {
        return f8970b.m22978b(context);
    }

    /* renamed from: b */
    public final synchronized iv0 m22978b(Context context) {
        if (this.f8971a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f8971a = new iv0(context);
        }
        return this.f8971a;
    }
}
