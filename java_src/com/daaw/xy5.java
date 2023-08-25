package com.daaw;

import android.content.SharedPreferences;
/* loaded from: classes2.dex */
public final class xy5 {

    /* renamed from: a */
    public final String f33117a;

    /* renamed from: b */
    public final long f33118b;

    /* renamed from: c */
    public boolean f33119c;

    /* renamed from: d */
    public long f33120d;

    /* renamed from: e */
    public final /* synthetic */ l36 f33121e;

    public xy5(l36 l36Var, String str, long j) {
        this.f33121e = l36Var;
        ry0.m10834f(str);
        this.f33117a = str;
        this.f33118b = j;
    }

    /* renamed from: a */
    public final long m4400a() {
        if (!this.f33119c) {
            this.f33119c = true;
            this.f33120d = this.f33121e.m17176n().getLong(this.f33117a, this.f33118b);
        }
        return this.f33120d;
    }

    /* renamed from: b */
    public final void m4399b(long j) {
        SharedPreferences.Editor edit = this.f33121e.m17176n().edit();
        edit.putLong(this.f33117a, j);
        edit.apply();
        this.f33120d = j;
    }
}
