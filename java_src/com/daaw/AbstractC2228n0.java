package com.daaw;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
/* renamed from: com.daaw.n0 */
/* loaded from: classes.dex */
public abstract class AbstractC2228n0 {

    /* renamed from: p */
    public Object f19314p;

    /* renamed from: q */
    public boolean f19315q;

    /* renamed from: com.daaw.n0$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2229a {
        /* renamed from: a */
        boolean mo15631a(AbstractC2228n0 abstractC2228n0, Menu menu);

        /* renamed from: b */
        boolean mo15630b(AbstractC2228n0 abstractC2228n0, Menu menu);

        /* renamed from: c */
        void mo15629c(AbstractC2228n0 abstractC2228n0);

        /* renamed from: d */
        boolean mo15628d(AbstractC2228n0 abstractC2228n0, MenuItem menuItem);
    }

    /* renamed from: c */
    public abstract void mo15648c();

    /* renamed from: d */
    public abstract View mo15647d();

    /* renamed from: e */
    public abstract Menu mo15646e();

    /* renamed from: f */
    public abstract MenuInflater mo15645f();

    /* renamed from: g */
    public abstract CharSequence mo15644g();

    /* renamed from: h */
    public Object m15643h() {
        return this.f19314p;
    }

    /* renamed from: i */
    public abstract CharSequence mo15642i();

    /* renamed from: j */
    public boolean m15641j() {
        return this.f19315q;
    }

    /* renamed from: k */
    public abstract void mo15640k();

    /* renamed from: l */
    public abstract boolean mo15639l();

    /* renamed from: m */
    public abstract void mo15638m(View view);

    /* renamed from: n */
    public abstract void mo15637n(int i);

    /* renamed from: o */
    public abstract void mo15636o(CharSequence charSequence);

    /* renamed from: p */
    public void m15635p(Object obj) {
        this.f19314p = obj;
    }

    /* renamed from: q */
    public abstract void mo15634q(int i);

    /* renamed from: r */
    public abstract void mo15633r(CharSequence charSequence);

    /* renamed from: s */
    public void mo15632s(boolean z) {
        this.f19315q = z;
    }
}
