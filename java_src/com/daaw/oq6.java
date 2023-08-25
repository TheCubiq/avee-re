package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
/* loaded from: classes.dex */
public final class oq6 {
    @SuppressLint({"StaticFieldLeak"})
    public static final oq6 b = new oq6();
    public Context a;

    public static oq6 b() {
        return b;
    }

    public final Context a() {
        return this.a;
    }

    public final void c(Context context) {
        this.a = context != null ? context.getApplicationContext() : null;
    }
}
