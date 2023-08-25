package com.daaw;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.C0507a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public class h80 implements r81, rx1, InterfaceC3778yy {

    /* renamed from: x */
    public static final String f12168x = ll0.m16883f("GreedyScheduler");

    /* renamed from: p */
    public final Context f12169p;

    /* renamed from: q */
    public final ey1 f12170q;

    /* renamed from: r */
    public final sx1 f12171r;

    /* renamed from: t */
    public C1608hs f12173t;

    /* renamed from: u */
    public boolean f12174u;

    /* renamed from: w */
    public Boolean f12176w;

    /* renamed from: s */
    public final Set<qy1> f12172s = new HashSet();

    /* renamed from: v */
    public final Object f12175v = new Object();

    public h80(Context context, C0507a c0507a, wj1 wj1Var, ey1 ey1Var) {
        this.f12169p = context;
        this.f12170q = ey1Var;
        this.f12171r = new sx1(context, wj1Var, this);
        this.f12173t = new C1608hs(this, c0507a.m27977k());
    }

    @Override // com.daaw.r81
    /* renamed from: a */
    public boolean mo9090a() {
        return false;
    }

    @Override // com.daaw.rx1
    /* renamed from: b */
    public void mo10849b(List<String> list) {
        for (String str : list) {
            ll0.m16885c().mo16882a(f12168x, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f12170q.m22991x(str);
        }
    }

    @Override // com.daaw.InterfaceC3778yy
    /* renamed from: c */
    public void mo3085c(String str, boolean z) {
        m20949i(str);
    }

    @Override // com.daaw.r81
    /* renamed from: d */
    public void mo9088d(String str) {
        if (this.f12176w == null) {
            m20951g();
        }
        if (!this.f12176w.booleanValue()) {
            ll0.m16885c().mo16880d(f12168x, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        m20950h();
        ll0.m16885c().mo16882a(f12168x, String.format("Cancelling work ID %s", str), new Throwable[0]);
        C1608hs c1608hs = this.f12173t;
        if (c1608hs != null) {
            c1608hs.m20443b(str);
        }
        this.f12170q.m22991x(str);
    }

    @Override // com.daaw.r81
    /* renamed from: e */
    public void mo9087e(qy1... qy1VarArr) {
        if (this.f12176w == null) {
            m20951g();
        }
        if (!this.f12176w.booleanValue()) {
            ll0.m16885c().mo16880d(f12168x, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        m20950h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (qy1 qy1Var : qy1VarArr) {
            long m11938a = qy1Var.m11938a();
            long currentTimeMillis = System.currentTimeMillis();
            if (qy1Var.f24625b == yx1.ENQUEUED) {
                if (currentTimeMillis < m11938a) {
                    C1608hs c1608hs = this.f12173t;
                    if (c1608hs != null) {
                        c1608hs.m20444a(qy1Var);
                    }
                } else if (qy1Var.m11937b()) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 23 && qy1Var.f24633j.m10316h()) {
                        ll0.m16885c().mo16882a(f12168x, String.format("Ignoring WorkSpec %s, Requires device idle.", qy1Var), new Throwable[0]);
                    } else if (i < 24 || !qy1Var.f24633j.m10319e()) {
                        hashSet.add(qy1Var);
                        hashSet2.add(qy1Var.f24624a);
                    } else {
                        ll0.m16885c().mo16882a(f12168x, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", qy1Var), new Throwable[0]);
                    }
                } else {
                    ll0.m16885c().mo16882a(f12168x, String.format("Starting work for %s", qy1Var.f24624a), new Throwable[0]);
                    this.f12170q.m22994u(qy1Var.f24624a);
                }
            }
        }
        synchronized (this.f12175v) {
            if (!hashSet.isEmpty()) {
                ll0.m16885c().mo16882a(f12168x, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.f12172s.addAll(hashSet);
                this.f12171r.m9789d(this.f12172s);
            }
        }
    }

    @Override // com.daaw.rx1
    /* renamed from: f */
    public void mo10848f(List<String> list) {
        for (String str : list) {
            ll0.m16885c().mo16882a(f12168x, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f12170q.m22994u(str);
        }
    }

    /* renamed from: g */
    public final void m20951g() {
        this.f12176w = Boolean.valueOf(iz0.m19252b(this.f12169p, this.f12170q.m23006i()));
    }

    /* renamed from: h */
    public final void m20950h() {
        if (this.f12174u) {
            return;
        }
        this.f12170q.m23002m().m18158d(this);
        this.f12174u = true;
    }

    /* renamed from: i */
    public final void m20949i(String str) {
        synchronized (this.f12175v) {
            Iterator<qy1> it = this.f12172s.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                qy1 next = it.next();
                if (next.f24624a.equals(str)) {
                    ll0.m16885c().mo16882a(f12168x, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f12172s.remove(next);
                    this.f12171r.m9789d(this.f12172s);
                    break;
                }
            }
        }
    }
}
