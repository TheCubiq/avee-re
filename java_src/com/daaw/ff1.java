package com.daaw;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import com.daaw.n0;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class ff1 extends n0 implements e.a {
    public Context r;
    public ActionBarContextView s;
    public n0.a t;
    public WeakReference<View> u;
    public boolean v;
    public boolean w;
    public androidx.appcompat.view.menu.e x;

    public ff1(Context context, ActionBarContextView actionBarContextView, n0.a aVar, boolean z) {
        this.r = context;
        this.s = actionBarContextView;
        this.t = aVar;
        androidx.appcompat.view.menu.e W = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).W(1);
        this.x = W;
        W.V(this);
        this.w = z;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.t.d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.s.l();
    }

    @Override // com.daaw.n0
    public void c() {
        if (this.v) {
            return;
        }
        this.v = true;
        this.t.c(this);
    }

    @Override // com.daaw.n0
    public View d() {
        WeakReference<View> weakReference = this.u;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.daaw.n0
    public Menu e() {
        return this.x;
    }

    @Override // com.daaw.n0
    public MenuInflater f() {
        return new gi1(this.s.getContext());
    }

    @Override // com.daaw.n0
    public CharSequence g() {
        return this.s.getSubtitle();
    }

    @Override // com.daaw.n0
    public CharSequence i() {
        return this.s.getTitle();
    }

    @Override // com.daaw.n0
    public void k() {
        this.t.a(this, this.x);
    }

    @Override // com.daaw.n0
    public boolean l() {
        return this.s.j();
    }

    @Override // com.daaw.n0
    public void m(View view) {
        this.s.setCustomView(view);
        this.u = view != null ? new WeakReference<>(view) : null;
    }

    @Override // com.daaw.n0
    public void n(int i) {
        o(this.r.getString(i));
    }

    @Override // com.daaw.n0
    public void o(CharSequence charSequence) {
        this.s.setSubtitle(charSequence);
    }

    @Override // com.daaw.n0
    public void q(int i) {
        r(this.r.getString(i));
    }

    @Override // com.daaw.n0
    public void r(CharSequence charSequence) {
        this.s.setTitle(charSequence);
    }

    @Override // com.daaw.n0
    public void s(boolean z) {
        super.s(z);
        this.s.setTitleOptional(z);
    }
}
