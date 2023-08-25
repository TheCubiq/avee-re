package com.daaw;
/* loaded from: classes.dex */
public class wr2 {

    /* renamed from: a */
    public int f31468a;

    /* renamed from: a */
    public final void m5838a(int i) {
        this.f31468a |= Integer.MIN_VALUE;
    }

    /* renamed from: b */
    public void mo5837b() {
        this.f31468a = 0;
    }

    /* renamed from: c */
    public final void m5836c(int i) {
        this.f31468a = i;
    }

    /* renamed from: d */
    public final boolean m5835d(int i) {
        return (this.f31468a & i) == i;
    }

    /* renamed from: e */
    public final boolean m5834e() {
        return m5835d(Integer.MIN_VALUE);
    }

    /* renamed from: f */
    public final boolean m5833f() {
        return m5835d(4);
    }

    /* renamed from: g */
    public final boolean m5832g() {
        return m5835d(1);
    }
}
