package com.daaw;

import android.content.Context;
import com.daaw.AbstractC2179mj;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class sx1 implements AbstractC2179mj.InterfaceC2180a {

    /* renamed from: d */
    public static final String f26735d = ll0.m16883f("WorkConstraintsTracker");

    /* renamed from: a */
    public final rx1 f26736a;

    /* renamed from: b */
    public final AbstractC2179mj<?>[] f26737b;

    /* renamed from: c */
    public final Object f26738c;

    public sx1(Context context, wj1 wj1Var, rx1 rx1Var) {
        Context applicationContext = context.getApplicationContext();
        this.f26736a = rx1Var;
        this.f26737b = new AbstractC2179mj[]{new C1817jb(applicationContext, wj1Var), new C2024lb(applicationContext, wj1Var), new ag1(applicationContext, wj1Var), new ks0(applicationContext, wj1Var), new rs0(applicationContext, wj1Var), new ns0(applicationContext, wj1Var), new ms0(applicationContext, wj1Var)};
        this.f26738c = new Object();
    }

    @Override // com.daaw.AbstractC2179mj.InterfaceC2180a
    /* renamed from: a */
    public void mo9792a(List<String> list) {
        synchronized (this.f26738c) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (m9790c(str)) {
                    ll0.m16885c().mo16882a(f26735d, String.format("Constraints met for %s", str), new Throwable[0]);
                    arrayList.add(str);
                }
            }
            rx1 rx1Var = this.f26736a;
            if (rx1Var != null) {
                rx1Var.mo10848f(arrayList);
            }
        }
    }

    @Override // com.daaw.AbstractC2179mj.InterfaceC2180a
    /* renamed from: b */
    public void mo9791b(List<String> list) {
        synchronized (this.f26738c) {
            rx1 rx1Var = this.f26736a;
            if (rx1Var != null) {
                rx1Var.mo10849b(list);
            }
        }
    }

    /* renamed from: c */
    public boolean m9790c(String str) {
        AbstractC2179mj<?>[] abstractC2179mjArr;
        synchronized (this.f26738c) {
            for (AbstractC2179mj<?> abstractC2179mj : this.f26737b) {
                if (abstractC2179mj.m16019d(str)) {
                    ll0.m16885c().mo16882a(f26735d, String.format("Work %s constrained by %s", str, abstractC2179mj.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: d */
    public void m9789d(Iterable<qy1> iterable) {
        synchronized (this.f26738c) {
            for (AbstractC2179mj<?> abstractC2179mj : this.f26737b) {
                abstractC2179mj.m16016g(null);
            }
            for (AbstractC2179mj<?> abstractC2179mj2 : this.f26737b) {
                abstractC2179mj2.m16018e(iterable);
            }
            for (AbstractC2179mj<?> abstractC2179mj3 : this.f26737b) {
                abstractC2179mj3.m16016g(this);
            }
        }
    }

    /* renamed from: e */
    public void m9788e() {
        synchronized (this.f26738c) {
            for (AbstractC2179mj<?> abstractC2179mj : this.f26737b) {
                abstractC2179mj.m16017f();
            }
        }
    }
}
