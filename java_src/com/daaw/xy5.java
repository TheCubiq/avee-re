package com.daaw;

import android.content.SharedPreferences;
/* loaded from: classes2.dex */
public final class xy5 {
    public final String a;
    public final long b;
    public boolean c;
    public long d;
    public final /* synthetic */ l36 e;

    public xy5(l36 l36Var, String str, long j) {
        this.e = l36Var;
        ry0.f(str);
        this.a = str;
        this.b = j;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.n().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void b(long j) {
        SharedPreferences.Editor edit = this.e.n().edit();
        edit.putLong(this.a, j);
        edit.apply();
        this.d = j;
    }
}
