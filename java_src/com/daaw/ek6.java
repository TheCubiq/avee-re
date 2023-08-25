package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.LinkedList;
/* loaded from: classes.dex */
public final class ek6 {
    public final int b;
    public final int c;
    public final LinkedList a = new LinkedList();
    public final fl6 d = new fl6();

    public ek6(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        return this.d.a();
    }

    public final int b() {
        i();
        return this.a.size();
    }

    public final long c() {
        return this.d.b();
    }

    public final long d() {
        return this.d.c();
    }

    public final qk6 e() {
        this.d.f();
        i();
        if (this.a.isEmpty()) {
            return null;
        }
        qk6 qk6Var = (qk6) this.a.remove();
        if (qk6Var != null) {
            this.d.h();
        }
        return qk6Var;
    }

    public final el6 f() {
        return this.d.d();
    }

    public final String g() {
        return this.d.e();
    }

    public final boolean h(qk6 qk6Var) {
        this.d.f();
        i();
        if (this.a.size() == this.b) {
            return false;
        }
        this.a.add(qk6Var);
        return true;
    }

    public final void i() {
        while (!this.a.isEmpty() && zzt.zzB().a() - ((qk6) this.a.getFirst()).d >= this.c) {
            this.d.g();
            this.a.remove();
        }
    }
}
