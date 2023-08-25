package com.daaw;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public class ux1 extends tx1 {
    public static final String j = ll0.f("WorkContinuationImpl");
    public final ey1 a;
    public final String b;
    public final lz c;
    public final List<? extends oy1> d;
    public final List<String> e;
    public final List<String> f;
    public final List<ux1> g;
    public boolean h;
    public qu0 i;

    public ux1(ey1 ey1Var, String str, lz lzVar, List<? extends oy1> list, List<ux1> list2) {
        this.a = ey1Var;
        this.b = str;
        this.c = lzVar;
        this.d = list;
        this.g = list2;
        this.e = new ArrayList(list.size());
        this.f = new ArrayList();
        if (list2 != null) {
            for (ux1 ux1Var : list2) {
                this.f.addAll(ux1Var.f);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String a = list.get(i).a();
            this.e.add(a);
            this.f.add(a);
        }
    }

    public ux1(ey1 ey1Var, List<? extends oy1> list) {
        this(ey1Var, null, lz.KEEP, list, null);
    }

    public static boolean i(ux1 ux1Var, Set<String> set) {
        set.addAll(ux1Var.c());
        Set<String> l = l(ux1Var);
        for (String str : set) {
            if (l.contains(str)) {
                return true;
            }
        }
        List<ux1> e = ux1Var.e();
        if (e != null && !e.isEmpty()) {
            for (ux1 ux1Var2 : e) {
                if (i(ux1Var2, set)) {
                    return true;
                }
            }
        }
        set.removeAll(ux1Var.c());
        return false;
    }

    public static Set<String> l(ux1 ux1Var) {
        HashSet hashSet = new HashSet();
        List<ux1> e = ux1Var.e();
        if (e != null && !e.isEmpty()) {
            for (ux1 ux1Var2 : e) {
                hashSet.addAll(ux1Var2.c());
            }
        }
        return hashSet;
    }

    public qu0 a() {
        if (this.h) {
            ll0.c().h(j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.e)), new Throwable[0]);
        } else {
            mx mxVar = new mx(this);
            this.a.p().b(mxVar);
            this.i = mxVar.d();
        }
        return this.i;
    }

    public lz b() {
        return this.c;
    }

    public List<String> c() {
        return this.e;
    }

    public String d() {
        return this.b;
    }

    public List<ux1> e() {
        return this.g;
    }

    public List<? extends oy1> f() {
        return this.d;
    }

    public ey1 g() {
        return this.a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.h;
    }

    public void k() {
        this.h = true;
    }
}
