package com.daaw;

import android.content.Context;
import android.os.Looper;
/* loaded from: classes2.dex */
public final class b52 {
    public b52(Context context) {
    }

    public static final boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
