package com.daaw;

import android.content.SharedPreferences;
/* loaded from: classes2.dex */
public final class qw5 {
    public final String a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ l36 e;

    public qw5(l36 l36Var, String str, boolean z) {
        this.e = l36Var;
        ry0.f(str);
        this.a = str;
        this.b = z;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor edit = this.e.n().edit();
        edit.putBoolean(this.a, z);
        edit.apply();
        this.d = z;
    }

    public final boolean b() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.n().getBoolean(this.a, this.b);
        }
        return this.d;
    }
}
