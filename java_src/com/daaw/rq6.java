package com.daaw;

import android.content.Context;
import android.os.Handler;
/* loaded from: classes.dex */
public final class rq6 {
    public static rq6 f;
    public float a = 0.0f;
    public final kq6 b;
    public final iq6 c;
    public jq6 d;
    public lq6 e;

    public rq6(kq6 kq6Var, iq6 iq6Var) {
        this.b = kq6Var;
        this.c = iq6Var;
    }

    public static rq6 b() {
        if (f == null) {
            f = new rq6(new kq6(), new iq6());
        }
        return f;
    }

    public final float a() {
        return this.a;
    }

    public final void c(Context context) {
        this.d = new jq6(new Handler(), context, new hq6(), this, null);
    }

    public final void d(float f2) {
        this.a = f2;
        if (this.e == null) {
            this.e = lq6.a();
        }
        for (xp6 xp6Var : this.e.b()) {
            xp6Var.g().h(f2);
        }
    }

    public final void e() {
        mq6.a().d(this);
        mq6.a().b();
        pr6.d().i();
        this.d.a();
    }

    public final void f() {
        pr6.d().j();
        mq6.a().c();
        this.d.b();
    }
}
