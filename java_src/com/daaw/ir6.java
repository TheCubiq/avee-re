package com.daaw;

import android.view.View;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class ir6 {

    /* renamed from: a */
    public final HashMap f13949a = new HashMap();

    /* renamed from: b */
    public final HashMap f13950b = new HashMap();

    /* renamed from: c */
    public final HashMap f13951c = new HashMap();

    /* renamed from: d */
    public final HashSet f13952d = new HashSet();

    /* renamed from: e */
    public final HashSet f13953e = new HashSet();

    /* renamed from: f */
    public final HashSet f13954f = new HashSet();

    /* renamed from: g */
    public final HashMap f13955g = new HashMap();

    /* renamed from: h */
    public final Map f13956h = new WeakHashMap();

    /* renamed from: i */
    public boolean f13957i;

    /* renamed from: a */
    public final View m19486a(String str) {
        return (View) this.f13951c.get(str);
    }

    /* renamed from: b */
    public final hr6 m19485b(View view) {
        hr6 hr6Var = (hr6) this.f13950b.get(view);
        if (hr6Var != null) {
            this.f13950b.remove(view);
        }
        return hr6Var;
    }

    /* renamed from: c */
    public final String m19484c(String str) {
        return (String) this.f13955g.get(str);
    }

    /* renamed from: d */
    public final String m19483d(View view) {
        if (this.f13949a.size() == 0) {
            return null;
        }
        String str = (String) this.f13949a.get(view);
        if (str != null) {
            this.f13949a.remove(view);
        }
        return str;
    }

    /* renamed from: e */
    public final HashSet m19482e() {
        return this.f13954f;
    }

    /* renamed from: f */
    public final HashSet m19481f() {
        return this.f13953e;
    }

    /* renamed from: g */
    public final void m19480g() {
        this.f13949a.clear();
        this.f13950b.clear();
        this.f13951c.clear();
        this.f13952d.clear();
        this.f13953e.clear();
        this.f13954f.clear();
        this.f13955g.clear();
        this.f13957i = false;
    }

    /* renamed from: h */
    public final void m19479h() {
        this.f13957i = true;
    }

    /* renamed from: i */
    public final void m19478i() {
        Boolean bool;
        lq6 m16667a = lq6.m16667a();
        if (m16667a != null) {
            for (xp6 xp6Var : m16667a.m16666b()) {
                View m4832f = xp6Var.m4832f();
                if (xp6Var.m4828j()) {
                    String m4830h = xp6Var.m4830h();
                    if (m4832f != null) {
                        String str = null;
                        if (m4832f.isAttachedToWindow()) {
                            if (m4832f.hasWindowFocus()) {
                                this.f13956h.remove(m4832f);
                                bool = Boolean.FALSE;
                            } else if (this.f13956h.containsKey(m4832f)) {
                                bool = (Boolean) this.f13956h.get(m4832f);
                            } else {
                                Map map = this.f13956h;
                                Boolean bool2 = Boolean.FALSE;
                                map.put(m4832f, bool2);
                                bool = bool2;
                            }
                            if (bool.booleanValue()) {
                                str = "noWindowFocus";
                            } else {
                                HashSet hashSet = new HashSet();
                                View view = m4832f;
                                while (true) {
                                    if (view == null) {
                                        this.f13952d.addAll(hashSet);
                                        break;
                                    }
                                    String m21305b = gr6.m21305b(view);
                                    if (m21305b != null) {
                                        str = m21305b;
                                        break;
                                    }
                                    hashSet.add(view);
                                    ViewParent parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                }
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.f13953e.add(m4830h);
                            this.f13949a.put(m4832f, m4830h);
                            for (nq6 nq6Var : xp6Var.m4829i()) {
                                View view2 = (View) nq6Var.m14874b().get();
                                if (view2 != null) {
                                    hr6 hr6Var = (hr6) this.f13950b.get(view2);
                                    if (hr6Var != null) {
                                        hr6Var.m20458c(xp6Var.m4830h());
                                    } else {
                                        this.f13950b.put(view2, new hr6(nq6Var, xp6Var.m4830h()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f13954f.add(m4830h);
                            this.f13951c.put(m4830h, m4832f);
                            this.f13955g.put(m4830h, str);
                        }
                    } else {
                        this.f13954f.add(m4830h);
                        this.f13955g.put(m4830h, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public final boolean m19477j(View view) {
        if (this.f13956h.containsKey(view)) {
            this.f13956h.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final int m19476k(View view) {
        if (this.f13952d.contains(view)) {
            return 1;
        }
        return this.f13957i ? 2 : 3;
    }
}
