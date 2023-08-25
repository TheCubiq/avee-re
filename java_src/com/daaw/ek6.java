package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.LinkedList;
/* loaded from: classes.dex */
public final class ek6 {

    /* renamed from: b */
    public final int f8540b;

    /* renamed from: c */
    public final int f8541c;

    /* renamed from: a */
    public final LinkedList f8539a = new LinkedList();

    /* renamed from: d */
    public final fl6 f8542d = new fl6();

    public ek6(int i, int i2) {
        this.f8540b = i;
        this.f8541c = i2;
    }

    /* renamed from: a */
    public final int m23428a() {
        return this.f8542d.m22501a();
    }

    /* renamed from: b */
    public final int m23427b() {
        m23420i();
        return this.f8539a.size();
    }

    /* renamed from: c */
    public final long m23426c() {
        return this.f8542d.m22500b();
    }

    /* renamed from: d */
    public final long m23425d() {
        return this.f8542d.m22499c();
    }

    /* renamed from: e */
    public final qk6 m23424e() {
        this.f8542d.m22496f();
        m23420i();
        if (this.f8539a.isEmpty()) {
            return null;
        }
        qk6 qk6Var = (qk6) this.f8539a.remove();
        if (qk6Var != null) {
            this.f8542d.m22494h();
        }
        return qk6Var;
    }

    /* renamed from: f */
    public final el6 m23423f() {
        return this.f8542d.m22498d();
    }

    /* renamed from: g */
    public final String m23422g() {
        return this.f8542d.m22497e();
    }

    /* renamed from: h */
    public final boolean m23421h(qk6 qk6Var) {
        this.f8542d.m22496f();
        m23420i();
        if (this.f8539a.size() == this.f8540b) {
            return false;
        }
        this.f8539a.add(qk6Var);
        return true;
    }

    /* renamed from: i */
    public final void m23420i() {
        while (!this.f8539a.isEmpty() && zzt.zzB().mo15860a() - ((qk6) this.f8539a.getFirst()).f24126d >= this.f8541c) {
            this.f8542d.m22495g();
            this.f8539a.remove();
        }
    }
}
