package com.daaw;

import android.content.Context;
import android.os.Handler;
/* loaded from: classes.dex */
public final class rq6 {

    /* renamed from: f */
    public static rq6 f25517f;

    /* renamed from: a */
    public float f25518a = 0.0f;

    /* renamed from: b */
    public final kq6 f25519b;

    /* renamed from: c */
    public final iq6 f25520c;

    /* renamed from: d */
    public jq6 f25521d;

    /* renamed from: e */
    public lq6 f25522e;

    public rq6(kq6 kq6Var, iq6 iq6Var) {
        this.f25519b = kq6Var;
        this.f25520c = iq6Var;
    }

    /* renamed from: b */
    public static rq6 m11060b() {
        if (f25517f == null) {
            f25517f = new rq6(new kq6(), new iq6());
        }
        return f25517f;
    }

    /* renamed from: a */
    public final float m11061a() {
        return this.f25518a;
    }

    /* renamed from: c */
    public final void m11059c(Context context) {
        this.f25521d = new jq6(new Handler(), context, new hq6(), this, null);
    }

    /* renamed from: d */
    public final void m11058d(float f) {
        this.f25518a = f;
        if (this.f25522e == null) {
            this.f25522e = lq6.m16667a();
        }
        for (xp6 xp6Var : this.f25522e.m16666b()) {
            xp6Var.m4831g().m4804h(f);
        }
    }

    /* renamed from: e */
    public final void m11057e() {
        mq6.m15843a().m15840d(this);
        mq6.m15843a().m15842b();
        pr6.m13193d().m13188i();
        this.f25521d.m18338a();
    }

    /* renamed from: f */
    public final void m11056f() {
        pr6.m13193d().m13187j();
        mq6.m15843a().m15841c();
        this.f25521d.m18337b();
    }
}
