package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public class fn {
    public final Context a;
    public final cg b;
    public final cg c;

    public fn(Context context, cg cgVar, cg cgVar2) {
        this.a = context;
        this.b = cgVar;
        this.c = cgVar2;
    }

    public en a(String str) {
        return en.a(this.a, this.b, this.c, str);
    }
}
