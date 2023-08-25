package com.daaw;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
/* loaded from: classes.dex */
public abstract class n0 {
    public Object p;
    public boolean q;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(n0 n0Var, Menu menu);

        boolean b(n0 n0Var, Menu menu);

        void c(n0 n0Var);

        boolean d(n0 n0Var, MenuItem menuItem);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.p;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.q;
    }

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View view);

    public abstract void n(int i);

    public abstract void o(CharSequence charSequence);

    public void p(Object obj) {
        this.p = obj;
    }

    public abstract void q(int i);

    public abstract void r(CharSequence charSequence);

    public void s(boolean z) {
        this.q = z;
    }
}
