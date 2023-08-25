package com.daaw;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public abstract class mc1 {

    /* renamed from: a */
    public final AtomicBoolean f18780a = new AtomicBoolean(false);

    /* renamed from: b */
    public final b61 f18781b;

    /* renamed from: c */
    public volatile ni1 f18782c;

    public mc1(b61 b61Var) {
        this.f18781b = b61Var;
    }

    /* renamed from: a */
    public ni1 m16094a() {
        m16093b();
        return m16091e(this.f18780a.compareAndSet(false, true));
    }

    /* renamed from: b */
    public void m16093b() {
        this.f18781b.m26483a();
    }

    /* renamed from: c */
    public final ni1 m16092c() {
        return this.f18781b.m26480d(mo3082d());
    }

    /* renamed from: d */
    public abstract String mo3082d();

    /* renamed from: e */
    public final ni1 m16091e(boolean z) {
        if (z) {
            if (this.f18782c == null) {
                this.f18782c = m16092c();
            }
            return this.f18782c;
        }
        return m16092c();
    }

    /* renamed from: f */
    public void m16090f(ni1 ni1Var) {
        if (ni1Var == this.f18782c) {
            this.f18780a.set(false);
        }
    }
}
