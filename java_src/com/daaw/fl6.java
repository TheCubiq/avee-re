package com.daaw;

import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class fl6 {

    /* renamed from: a */
    public final long f9674a;

    /* renamed from: c */
    public long f9676c;

    /* renamed from: b */
    public final el6 f9675b = new el6();

    /* renamed from: d */
    public int f9677d = 0;

    /* renamed from: e */
    public int f9678e = 0;

    /* renamed from: f */
    public int f9679f = 0;

    public fl6() {
        long mo15860a = zzt.zzB().mo15860a();
        this.f9674a = mo15860a;
        this.f9676c = mo15860a;
    }

    /* renamed from: a */
    public final int m22501a() {
        return this.f9677d;
    }

    /* renamed from: b */
    public final long m22500b() {
        return this.f9674a;
    }

    /* renamed from: c */
    public final long m22499c() {
        return this.f9676c;
    }

    /* renamed from: d */
    public final el6 m22498d() {
        el6 clone = this.f9675b.clone();
        el6 el6Var = this.f9675b;
        el6Var.f8566p = false;
        el6Var.f8567q = 0;
        return clone;
    }

    /* renamed from: e */
    public final String m22497e() {
        return "Created: " + this.f9674a + " Last accessed: " + this.f9676c + " Accesses: " + this.f9677d + "\nEntries retrieved: Valid: " + this.f9678e + " Stale: " + this.f9679f;
    }

    /* renamed from: f */
    public final void m22496f() {
        this.f9676c = zzt.zzB().mo15860a();
        this.f9677d++;
    }

    /* renamed from: g */
    public final void m22495g() {
        this.f9679f++;
        this.f9675b.f8567q++;
    }

    /* renamed from: h */
    public final void m22494h() {
        this.f9678e++;
        this.f9675b.f8566p = true;
    }
}
