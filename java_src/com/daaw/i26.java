package com.daaw;

import android.content.SharedPreferences;
/* loaded from: classes2.dex */
public final class i26 {
    public final String a;
    public boolean b;
    public String c;
    public final /* synthetic */ l36 d;

    public i26(l36 l36Var, String str, String str2) {
        this.d = l36Var;
        ry0.f(str);
        this.a = str;
    }

    public final String a() {
        if (!this.b) {
            this.b = true;
            this.c = this.d.n().getString(this.a, null);
        }
        return this.c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.d.n().edit();
        edit.putString(this.a, str);
        edit.apply();
        this.c = str;
    }
}
