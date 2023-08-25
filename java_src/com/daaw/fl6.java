package com.daaw;

import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class fl6 {
    public final long a;
    public long c;
    public final el6 b = new el6();
    public int d = 0;
    public int e = 0;
    public int f = 0;

    public fl6() {
        long a = zzt.zzB().a();
        this.a = a;
        this.c = a;
    }

    public final int a() {
        return this.d;
    }

    public final long b() {
        return this.a;
    }

    public final long c() {
        return this.c;
    }

    public final el6 d() {
        el6 clone = this.b.clone();
        el6 el6Var = this.b;
        el6Var.p = false;
        el6Var.q = 0;
        return clone;
    }

    public final String e() {
        return "Created: " + this.a + " Last accessed: " + this.c + " Accesses: " + this.d + "\nEntries retrieved: Valid: " + this.e + " Stale: " + this.f;
    }

    public final void f() {
        this.c = zzt.zzB().a();
        this.d++;
    }

    public final void g() {
        this.f++;
        this.b.q++;
    }

    public final void h() {
        this.e++;
        this.b.p = true;
    }
}
