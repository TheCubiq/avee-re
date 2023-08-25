package com.daaw;

import android.os.Build;
/* loaded from: classes2.dex */
public class of {
    public static final int a;

    static {
        a = Build.VERSION.SDK_INT >= 21 ? 2 : 1;
    }
}
