package com.daaw;

import android.content.SharedPreferences;
import android.util.Pair;
/* loaded from: classes2.dex */
public final class e16 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final /* synthetic */ l36 e;

    public /* synthetic */ e16(l36 l36Var, String str, long j, b06 b06Var) {
        this.e = l36Var;
        ry0.f("health_monitor");
        ry0.a(j > 0);
        this.a = "health_monitor:start";
        this.b = "health_monitor:count";
        this.c = "health_monitor:value";
        this.d = j;
    }

    public final Pair a() {
        long abs;
        this.e.f();
        this.e.f();
        long c = c();
        if (c == 0) {
            d();
            abs = 0;
        } else {
            abs = Math.abs(c - this.e.a.b().a());
        }
        long j = this.d;
        if (abs < j) {
            return null;
        }
        if (abs > j + j) {
            d();
            return null;
        }
        String string = this.e.n().getString(this.c, null);
        long j2 = this.e.n().getLong(this.b, 0L);
        d();
        return (string == null || j2 <= 0) ? l36.y : new Pair(string, Long.valueOf(j2));
    }

    public final void b(String str, long j) {
        this.e.f();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.e.n().getLong(this.b, 0L);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.e.n().edit();
            edit.putString(this.c, str);
            edit.putLong(this.b, 1L);
            edit.apply();
            return;
        }
        long nextLong = this.e.a.N().u().nextLong();
        long j3 = j2 + 1;
        SharedPreferences.Editor edit2 = this.e.n().edit();
        if ((nextLong & Long.MAX_VALUE) < Long.MAX_VALUE / j3) {
            edit2.putString(this.c, str);
        }
        edit2.putLong(this.b, j3);
        edit2.apply();
    }

    public final long c() {
        return this.e.n().getLong(this.a, 0L);
    }

    public final void d() {
        this.e.f();
        long a = this.e.a.b().a();
        SharedPreferences.Editor edit = this.e.n().edit();
        edit.remove(this.b);
        edit.remove(this.c);
        edit.putLong(this.a, a);
        edit.apply();
    }
}
