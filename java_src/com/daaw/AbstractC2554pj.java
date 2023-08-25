package com.daaw;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* renamed from: com.daaw.pj */
/* loaded from: classes.dex */
public abstract class AbstractC2554pj<T> {

    /* renamed from: f */
    public static final String f22980f = ll0.m16883f("ConstraintTracker");

    /* renamed from: a */
    public final wj1 f22981a;

    /* renamed from: b */
    public final Context f22982b;

    /* renamed from: c */
    public final Object f22983c = new Object();

    /* renamed from: d */
    public final Set<InterfaceC2443oj<T>> f22984d = new LinkedHashSet();

    /* renamed from: e */
    public T f22985e;

    /* renamed from: com.daaw.pj$a */
    /* loaded from: classes.dex */
    public class RunnableC2555a implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ List f22986p;

        public RunnableC2555a(List list) {
            this.f22986p = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (InterfaceC2443oj interfaceC2443oj : this.f22986p) {
                interfaceC2443oj.mo14258a(AbstractC2554pj.this.f22985e);
            }
        }
    }

    public AbstractC2554pj(Context context, wj1 wj1Var) {
        this.f22982b = context.getApplicationContext();
        this.f22981a = wj1Var;
    }

    /* renamed from: a */
    public void m13336a(InterfaceC2443oj<T> interfaceC2443oj) {
        synchronized (this.f22983c) {
            if (this.f22984d.add(interfaceC2443oj)) {
                if (this.f22984d.size() == 1) {
                    this.f22985e = mo13183b();
                    ll0.m16885c().mo16882a(f22980f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f22985e), new Throwable[0]);
                    mo12628e();
                }
                interfaceC2443oj.mo14258a(this.f22985e);
            }
        }
    }

    /* renamed from: b */
    public abstract T mo13183b();

    /* renamed from: c */
    public void m13335c(InterfaceC2443oj<T> interfaceC2443oj) {
        synchronized (this.f22983c) {
            if (this.f22984d.remove(interfaceC2443oj) && this.f22984d.isEmpty()) {
                mo12627f();
            }
        }
    }

    /* renamed from: d */
    public void m13334d(T t) {
        synchronized (this.f22983c) {
            T t2 = this.f22985e;
            if (t2 != t && (t2 == null || !t2.equals(t))) {
                this.f22985e = t;
                this.f22981a.mo6052a().execute(new RunnableC2555a(new ArrayList(this.f22984d)));
            }
        }
    }

    /* renamed from: e */
    public abstract void mo12628e();

    /* renamed from: f */
    public abstract void mo12627f();
}
