package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public class ym1 {
    public static ym1 e;
    public kb a;
    public mb b;
    public ps0 c;
    public bg1 d;

    public ym1(Context context, wj1 wj1Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = new kb(applicationContext, wj1Var);
        this.b = new mb(applicationContext, wj1Var);
        this.c = new ps0(applicationContext, wj1Var);
        this.d = new bg1(applicationContext, wj1Var);
    }

    public static synchronized ym1 c(Context context, wj1 wj1Var) {
        ym1 ym1Var;
        synchronized (ym1.class) {
            if (e == null) {
                e = new ym1(context, wj1Var);
            }
            ym1Var = e;
        }
        return ym1Var;
    }

    public kb a() {
        return this.a;
    }

    public mb b() {
        return this.b;
    }

    public ps0 d() {
        return this.c;
    }

    public bg1 e() {
        return this.d;
    }
}
