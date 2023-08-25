package com.daaw;
/* loaded from: classes.dex */
public final class ik6 {

    /* renamed from: a */
    public final hk6 f13721a = new hk6();

    /* renamed from: b */
    public int f13722b;

    /* renamed from: c */
    public int f13723c;

    /* renamed from: d */
    public int f13724d;

    /* renamed from: e */
    public int f13725e;

    /* renamed from: f */
    public int f13726f;

    /* renamed from: a */
    public final hk6 m19695a() {
        hk6 clone = this.f13721a.clone();
        hk6 hk6Var = this.f13721a;
        hk6Var.f12634p = false;
        hk6Var.f12635q = false;
        return clone;
    }

    /* renamed from: b */
    public final String m19694b() {
        return "\n\tPool does not exist: " + this.f13724d + "\n\tNew pools created: " + this.f13722b + "\n\tPools removed: " + this.f13723c + "\n\tEntries added: " + this.f13726f + "\n\tNo entries retrieved: " + this.f13725e + "\n";
    }

    /* renamed from: c */
    public final void m19693c() {
        this.f13726f++;
    }

    /* renamed from: d */
    public final void m19692d() {
        this.f13722b++;
        this.f13721a.f12634p = true;
    }

    /* renamed from: e */
    public final void m19691e() {
        this.f13725e++;
    }

    /* renamed from: f */
    public final void m19690f() {
        this.f13724d++;
    }

    /* renamed from: g */
    public final void m19689g() {
        this.f13723c++;
        this.f13721a.f12635q = true;
    }
}
