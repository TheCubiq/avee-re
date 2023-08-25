package com.daaw;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* loaded from: classes.dex */
public class ph1 extends np0 implements SubMenu {

    /* renamed from: e */
    public final oi1 f22934e;

    public ph1(Context context, oi1 oi1Var) {
        super(context, oi1Var);
        this.f22934e = oi1Var;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f22934e.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m7309c(this.f22934e.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        this.f22934e.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f22934e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        this.f22934e.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f22934e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f22934e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f22934e.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f22934e.setIcon(drawable);
        return this;
    }
}
