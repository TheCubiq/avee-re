package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public final class xl {
    public static final String[] a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(Context context, Throwable th) {
        try {
            ry0.j(context);
            ry0.j(th);
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
