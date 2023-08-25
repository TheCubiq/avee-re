package com.daaw;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0082e;
import androidx.appcompat.widget.ActionBarContextView;
import com.daaw.AbstractC2228n0;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class ff1 extends AbstractC2228n0 implements C0082e.InterfaceC0083a {

    /* renamed from: r */
    public Context f9534r;

    /* renamed from: s */
    public ActionBarContextView f9535s;

    /* renamed from: t */
    public AbstractC2228n0.InterfaceC2229a f9536t;

    /* renamed from: u */
    public WeakReference<View> f9537u;

    /* renamed from: v */
    public boolean f9538v;

    /* renamed from: w */
    public boolean f9539w;

    /* renamed from: x */
    public C0082e f9540x;

    public ff1(Context context, ActionBarContextView actionBarContextView, AbstractC2228n0.InterfaceC2229a interfaceC2229a, boolean z) {
        this.f9534r = context;
        this.f9535s = actionBarContextView;
        this.f9536t = interfaceC2229a;
        C0082e m30251W = new C0082e(actionBarContextView.getContext()).m30251W(1);
        this.f9540x = m30251W;
        m30251W.mo30169V(this);
        this.f9539w = z;
    }

    @Override // androidx.appcompat.view.menu.C0082e.InterfaceC0083a
    /* renamed from: a */
    public boolean mo330a(C0082e c0082e, MenuItem menuItem) {
        return this.f9536t.mo15628d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0082e.InterfaceC0083a
    /* renamed from: b */
    public void mo329b(C0082e c0082e) {
        mo15640k();
        this.f9535s.m30155l();
    }

    @Override // com.daaw.AbstractC2228n0
    /* renamed from: c */
    public void mo15648c() {
        if (this.f9538v) {
            return;
        }
        this.f9538v = true;
        this.f9536t.mo15629c(this);
    }

    @Override // com.daaw.AbstractC2228n0
    /* renamed from: d */
    public View mo15647d() {
        WeakReference<View> weakReference = this.f9537u;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.daaw.AbstractC2228n0
    /* renamed from: e */
    public Menu mo15646e() {
        return this.f9540x;
    }

    @Override // com.daaw.AbstractC2228n0
    /* renamed from: f */
    public MenuInflater mo15645f() {
        return new gi1(this.f9535s.getContext());
    }

    @Override // com.daaw.AbstractC2228n0
    /* renamed from: g */
    public CharSequence mo15644g() {
        return this.f9535s.getSubtitle();
    }

    @Override // com.daaw.AbstractC2228n0
    /* renamed from: i */
    public CharSequence mo15642i() {
        return this.f9535s.getTitle();
    }

    @Override // com.daaw.AbstractC2228n0
    /* renamed from: k */
    public void mo15640k() {
        this.f9536t.mo15631a(this, this.f9540x);
    }

    @Override // com.daaw.AbstractC2228n0
    /* renamed from: l */
    public boolean mo15639l() {
        return this.f9535s.m30157j();
    }

    @Override // com.daaw.AbstractC2228n0
    /* renamed from: m */
    public void mo15638m(View view) {
        this.f9535s.setCustomView(view);
        this.f9537u = view != null ? new WeakReference<>(view) : null;
    }

    @Override // com.daaw.AbstractC2228n0
    /* renamed from: n */
    public void mo15637n(int i) {
        mo15636o(this.f9534r.getString(i));
    }

    @Override // com.daaw.AbstractC2228n0
    /* renamed from: o */
    public void mo15636o(CharSequence charSequence) {
        this.f9535s.setSubtitle(charSequence);
    }

    @Override // com.daaw.AbstractC2228n0
    /* renamed from: q */
    public void mo15634q(int i) {
        mo15633r(this.f9534r.getString(i));
    }

    @Override // com.daaw.AbstractC2228n0
    /* renamed from: r */
    public void mo15633r(CharSequence charSequence) {
        this.f9535s.setTitle(charSequence);
    }

    @Override // com.daaw.AbstractC2228n0
    /* renamed from: s */
    public void mo15632s(boolean z) {
        super.mo15632s(z);
        this.f9535s.setTitleOptional(z);
    }
}
