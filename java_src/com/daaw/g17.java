package com.daaw;

import java.util.Map;
/* loaded from: classes.dex */
public final class g17 extends h07 {

    /* renamed from: p */
    public final Object f10153p;

    /* renamed from: q */
    public int f10154q;

    /* renamed from: r */
    public final /* synthetic */ i17 f10155r;

    public g17(i17 i17Var, int i) {
        this.f10155r = i17Var;
        this.f10153p = i17.m20190i(i17Var, i);
        this.f10154q = i;
    }

    /* renamed from: a */
    public final void m22092a() {
        int m20175x;
        int i = this.f10154q;
        if (i == -1 || i >= this.f10155r.size() || !ky6.m17316a(this.f10153p, i17.m20190i(this.f10155r, this.f10154q))) {
            m20175x = this.f10155r.m20175x(this.f10153p);
            this.f10154q = m20175x;
        }
    }

    @Override // com.daaw.h07, java.util.Map.Entry
    public final Object getKey() {
        return this.f10153p;
    }

    @Override // com.daaw.h07, java.util.Map.Entry
    public final Object getValue() {
        Map m20185n = this.f10155r.m20185n();
        if (m20185n != null) {
            return m20185n.get(this.f10153p);
        }
        m22092a();
        int i = this.f10154q;
        if (i == -1) {
            return null;
        }
        return i17.m20187l(this.f10155r, i);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map m20185n = this.f10155r.m20185n();
        if (m20185n != null) {
            return m20185n.put(this.f10153p, obj);
        }
        m22092a();
        int i = this.f10154q;
        if (i == -1) {
            this.f10155r.put(this.f10153p, obj);
            return null;
        }
        Object m20187l = i17.m20187l(this.f10155r, i);
        i17.m20184o(this.f10155r, this.f10154q, obj);
        return m20187l;
    }
}
