package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
/* loaded from: classes.dex */
public final class lq6 {

    /* renamed from: c */
    public static final lq6 f17641c = new lq6();

    /* renamed from: a */
    public final ArrayList f17642a = new ArrayList();

    /* renamed from: b */
    public final ArrayList f17643b = new ArrayList();

    /* renamed from: a */
    public static lq6 m16667a() {
        return f17641c;
    }

    /* renamed from: b */
    public final Collection m16666b() {
        return Collections.unmodifiableCollection(this.f17643b);
    }

    /* renamed from: c */
    public final Collection m16665c() {
        return Collections.unmodifiableCollection(this.f17642a);
    }

    /* renamed from: d */
    public final void m16664d(xp6 xp6Var) {
        this.f17642a.add(xp6Var);
    }

    /* renamed from: e */
    public final void m16663e(xp6 xp6Var) {
        boolean m16661g = m16661g();
        this.f17642a.remove(xp6Var);
        this.f17643b.remove(xp6Var);
        if (!m16661g || m16661g()) {
            return;
        }
        rq6.m11060b().m11056f();
    }

    /* renamed from: f */
    public final void m16662f(xp6 xp6Var) {
        boolean m16661g = m16661g();
        this.f17643b.add(xp6Var);
        if (m16661g) {
            return;
        }
        rq6.m11060b().m11057e();
    }

    /* renamed from: g */
    public final boolean m16661g() {
        return this.f17643b.size() > 0;
    }
}
