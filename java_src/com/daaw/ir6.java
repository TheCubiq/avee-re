package com.daaw;

import android.view.View;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class ir6 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashSet d = new HashSet();
    public final HashSet e = new HashSet();
    public final HashSet f = new HashSet();
    public final HashMap g = new HashMap();
    public final Map h = new WeakHashMap();
    public boolean i;

    public final View a(String str) {
        return (View) this.c.get(str);
    }

    public final hr6 b(View view) {
        hr6 hr6Var = (hr6) this.b.get(view);
        if (hr6Var != null) {
            this.b.remove(view);
        }
        return hr6Var;
    }

    public final String c(String str) {
        return (String) this.g.get(str);
    }

    public final String d(View view) {
        if (this.a.size() == 0) {
            return null;
        }
        String str = (String) this.a.get(view);
        if (str != null) {
            this.a.remove(view);
        }
        return str;
    }

    public final HashSet e() {
        return this.f;
    }

    public final HashSet f() {
        return this.e;
    }

    public final void g() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.i = false;
    }

    public final void h() {
        this.i = true;
    }

    public final void i() {
        Boolean bool;
        lq6 a = lq6.a();
        if (a != null) {
            for (xp6 xp6Var : a.b()) {
                View f = xp6Var.f();
                if (xp6Var.j()) {
                    String h = xp6Var.h();
                    if (f != null) {
                        String str = null;
                        if (f.isAttachedToWindow()) {
                            if (f.hasWindowFocus()) {
                                this.h.remove(f);
                                bool = Boolean.FALSE;
                            } else if (this.h.containsKey(f)) {
                                bool = (Boolean) this.h.get(f);
                            } else {
                                Map map = this.h;
                                Boolean bool2 = Boolean.FALSE;
                                map.put(f, bool2);
                                bool = bool2;
                            }
                            if (bool.booleanValue()) {
                                str = "noWindowFocus";
                            } else {
                                HashSet hashSet = new HashSet();
                                View view = f;
                                while (true) {
                                    if (view == null) {
                                        this.d.addAll(hashSet);
                                        break;
                                    }
                                    String b = gr6.b(view);
                                    if (b != null) {
                                        str = b;
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
                            this.e.add(h);
                            this.a.put(f, h);
                            for (nq6 nq6Var : xp6Var.i()) {
                                View view2 = (View) nq6Var.b().get();
                                if (view2 != null) {
                                    hr6 hr6Var = (hr6) this.b.get(view2);
                                    if (hr6Var != null) {
                                        hr6Var.c(xp6Var.h());
                                    } else {
                                        this.b.put(view2, new hr6(nq6Var, xp6Var.h()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f.add(h);
                            this.c.put(h, f);
                            this.g.put(h, str);
                        }
                    } else {
                        this.f.add(h);
                        this.g.put(h, "noAdView");
                    }
                }
            }
        }
    }

    public final boolean j(View view) {
        if (this.h.containsKey(view)) {
            this.h.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    public final int k(View view) {
        if (this.d.contains(view)) {
            return 1;
        }
        return this.i ? 2 : 3;
    }
}
