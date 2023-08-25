package com.daaw;
/* loaded from: classes.dex */
public class i37 {
    public int a;

    public final void a(int i) {
        this.a |= Integer.MIN_VALUE;
    }

    public void b() {
        this.a = 0;
    }

    public final void c(int i) {
        this.a = i;
    }

    public final boolean d(int i) {
        return (this.a & i) == i;
    }

    public final boolean e() {
        return d(268435456);
    }

    public final boolean f() {
        return d(Integer.MIN_VALUE);
    }

    public final boolean g() {
        return d(4);
    }

    public final boolean h() {
        return d(1);
    }
}
