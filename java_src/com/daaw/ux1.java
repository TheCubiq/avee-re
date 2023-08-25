package com.daaw;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public class ux1 extends tx1 {

    /* renamed from: j */
    public static final String f29592j = ll0.m16883f("WorkContinuationImpl");

    /* renamed from: a */
    public final ey1 f29593a;

    /* renamed from: b */
    public final String f29594b;

    /* renamed from: c */
    public final EnumC2138lz f29595c;

    /* renamed from: d */
    public final List<? extends oy1> f29596d;

    /* renamed from: e */
    public final List<String> f29597e;

    /* renamed from: f */
    public final List<String> f29598f;

    /* renamed from: g */
    public final List<ux1> f29599g;

    /* renamed from: h */
    public boolean f29600h;

    /* renamed from: i */
    public qu0 f29601i;

    public ux1(ey1 ey1Var, String str, EnumC2138lz enumC2138lz, List<? extends oy1> list, List<ux1> list2) {
        this.f29593a = ey1Var;
        this.f29594b = str;
        this.f29595c = enumC2138lz;
        this.f29596d = list;
        this.f29599g = list2;
        this.f29597e = new ArrayList(list.size());
        this.f29598f = new ArrayList();
        if (list2 != null) {
            for (ux1 ux1Var : list2) {
                this.f29598f.addAll(ux1Var.f29598f);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String m13870a = list.get(i).m13870a();
            this.f29597e.add(m13870a);
            this.f29598f.add(m13870a);
        }
    }

    public ux1(ey1 ey1Var, List<? extends oy1> list) {
        this(ey1Var, null, EnumC2138lz.KEEP, list, null);
    }

    /* renamed from: i */
    public static boolean m7656i(ux1 ux1Var, Set<String> set) {
        set.addAll(ux1Var.m7662c());
        Set<String> m7653l = m7653l(ux1Var);
        for (String str : set) {
            if (m7653l.contains(str)) {
                return true;
            }
        }
        List<ux1> m7660e = ux1Var.m7660e();
        if (m7660e != null && !m7660e.isEmpty()) {
            for (ux1 ux1Var2 : m7660e) {
                if (m7656i(ux1Var2, set)) {
                    return true;
                }
            }
        }
        set.removeAll(ux1Var.m7662c());
        return false;
    }

    /* renamed from: l */
    public static Set<String> m7653l(ux1 ux1Var) {
        HashSet hashSet = new HashSet();
        List<ux1> m7660e = ux1Var.m7660e();
        if (m7660e != null && !m7660e.isEmpty()) {
            for (ux1 ux1Var2 : m7660e) {
                hashSet.addAll(ux1Var2.m7662c());
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public qu0 m7664a() {
        if (this.f29600h) {
            ll0.m16885c().mo16878h(f29592j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f29597e)), new Throwable[0]);
        } else {
            RunnableC2217mx runnableC2217mx = new RunnableC2217mx(this);
            this.f29593a.m22999p().mo6051b(runnableC2217mx);
            this.f29601i = runnableC2217mx.m15735d();
        }
        return this.f29601i;
    }

    /* renamed from: b */
    public EnumC2138lz m7663b() {
        return this.f29595c;
    }

    /* renamed from: c */
    public List<String> m7662c() {
        return this.f29597e;
    }

    /* renamed from: d */
    public String m7661d() {
        return this.f29594b;
    }

    /* renamed from: e */
    public List<ux1> m7660e() {
        return this.f29599g;
    }

    /* renamed from: f */
    public List<? extends oy1> m7659f() {
        return this.f29596d;
    }

    /* renamed from: g */
    public ey1 m7658g() {
        return this.f29593a;
    }

    /* renamed from: h */
    public boolean m7657h() {
        return m7656i(this, new HashSet());
    }

    /* renamed from: j */
    public boolean m7655j() {
        return this.f29600h;
    }

    /* renamed from: k */
    public void m7654k() {
        this.f29600h = true;
    }
}
