package com.daaw;
/* loaded from: classes.dex */
public final class o68 {

    /* renamed from: a */
    public boolean f21091a;

    /* renamed from: b */
    public q88 f21092b;

    /* renamed from: c */
    public int f21093c;

    /* renamed from: d */
    public boolean f21094d;

    /* renamed from: e */
    public int f21095e;

    /* renamed from: f */
    public boolean f21096f;

    /* renamed from: g */
    public int f21097g;

    public o68(q88 q88Var) {
        this.f21092b = q88Var;
    }

    /* renamed from: a */
    public final void m14520a(int i) {
        this.f21091a = 1 == ((this.f21091a ? 1 : 0) | i);
        this.f21093c += i;
    }

    /* renamed from: b */
    public final void m14519b(int i) {
        this.f21091a = true;
        this.f21096f = true;
        this.f21097g = i;
    }

    /* renamed from: c */
    public final void m14518c(q88 q88Var) {
        this.f21091a |= this.f21092b != q88Var;
        this.f21092b = q88Var;
    }

    /* renamed from: d */
    public final void m14517d(int i) {
        if (this.f21094d && this.f21095e != 5) {
            uo4.m7874d(i == 5);
            return;
        }
        this.f21091a = true;
        this.f21094d = true;
        this.f21095e = i;
    }
}
