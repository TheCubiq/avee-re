package com.daaw;
/* loaded from: classes.dex */
public class i37 {

    /* renamed from: a */
    public int f13224a;

    /* renamed from: a */
    public final void m20164a(int i) {
        this.f13224a |= Integer.MIN_VALUE;
    }

    /* renamed from: b */
    public void mo6965b() {
        this.f13224a = 0;
    }

    /* renamed from: c */
    public final void m20163c(int i) {
        this.f13224a = i;
    }

    /* renamed from: d */
    public final boolean m20162d(int i) {
        return (this.f13224a & i) == i;
    }

    /* renamed from: e */
    public final boolean m20161e() {
        return m20162d(268435456);
    }

    /* renamed from: f */
    public final boolean m20160f() {
        return m20162d(Integer.MIN_VALUE);
    }

    /* renamed from: g */
    public final boolean m20159g() {
        return m20162d(4);
    }

    /* renamed from: h */
    public final boolean m20158h() {
        return m20162d(1);
    }
}
