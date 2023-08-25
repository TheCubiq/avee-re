package com.daaw;

import android.os.Handler;
import android.os.Looper;
/* renamed from: com.daaw.md */
/* loaded from: classes.dex */
public class C2167md {
    /* renamed from: a */
    public static Handler m16088a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
