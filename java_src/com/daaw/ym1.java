package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public class ym1 {

    /* renamed from: e */
    public static ym1 f33812e;

    /* renamed from: a */
    public C1932kb f33813a;

    /* renamed from: b */
    public C2162mb f33814b;

    /* renamed from: c */
    public ps0 f33815c;

    /* renamed from: d */
    public bg1 f33816d;

    public ym1(Context context, wj1 wj1Var) {
        Context applicationContext = context.getApplicationContext();
        this.f33813a = new C1932kb(applicationContext, wj1Var);
        this.f33814b = new C2162mb(applicationContext, wj1Var);
        this.f33815c = new ps0(applicationContext, wj1Var);
        this.f33816d = new bg1(applicationContext, wj1Var);
    }

    /* renamed from: c */
    public static synchronized ym1 m3513c(Context context, wj1 wj1Var) {
        ym1 ym1Var;
        synchronized (ym1.class) {
            if (f33812e == null) {
                f33812e = new ym1(context, wj1Var);
            }
            ym1Var = f33812e;
        }
        return ym1Var;
    }

    /* renamed from: a */
    public C1932kb m3515a() {
        return this.f33813a;
    }

    /* renamed from: b */
    public C2162mb m3514b() {
        return this.f33814b;
    }

    /* renamed from: d */
    public ps0 m3512d() {
        return this.f33815c;
    }

    /* renamed from: e */
    public bg1 m3511e() {
        return this.f33816d;
    }
}
