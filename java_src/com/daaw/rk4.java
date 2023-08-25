package com.daaw;

import android.os.Build;
/* loaded from: classes2.dex */
public final class rk4 {
    public static final int a;

    static {
        a = Build.VERSION.SDK_INT >= 23 ? 67108864 : 0;
    }
}
