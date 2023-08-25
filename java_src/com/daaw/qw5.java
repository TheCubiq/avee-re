package com.daaw;

import android.content.SharedPreferences;
/* loaded from: classes2.dex */
public final class qw5 {

    /* renamed from: a */
    public final String f24543a;

    /* renamed from: b */
    public final boolean f24544b;

    /* renamed from: c */
    public boolean f24545c;

    /* renamed from: d */
    public boolean f24546d;

    /* renamed from: e */
    public final /* synthetic */ l36 f24547e;

    public qw5(l36 l36Var, String str, boolean z) {
        this.f24547e = l36Var;
        ry0.m10834f(str);
        this.f24543a = str;
        this.f24544b = z;
    }

    /* renamed from: a */
    public final void m12013a(boolean z) {
        SharedPreferences.Editor edit = this.f24547e.m17176n().edit();
        edit.putBoolean(this.f24543a, z);
        edit.apply();
        this.f24546d = z;
    }

    /* renamed from: b */
    public final boolean m12012b() {
        if (!this.f24545c) {
            this.f24545c = true;
            this.f24546d = this.f24547e.m17176n().getBoolean(this.f24543a, this.f24544b);
        }
        return this.f24546d;
    }
}
