package com.daaw;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.daaw.bk1;
import com.daaw.k81;
import com.daaw.n0;
/* loaded from: classes.dex */
public class p3 extends p30 implements t3, bk1.a {
    public z3 K;
    public Resources L;

    /* loaded from: classes.dex */
    public class a implements k81.c {
        public a() {
        }

        @Override // com.daaw.k81.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            p3.this.F().H(bundle);
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    public class b implements eu0 {
        public b() {
        }

        @Override // com.daaw.eu0
        public void a(Context context) {
            z3 F = p3.this.F();
            F.x();
            F.D(p3.this.i().b("androidx:appcompat"));
        }
    }

    public p3() {
        H();
    }

    private void r() {
        bu1.a(getWindow().getDecorView(), this);
        eu1.a(getWindow().getDecorView(), this);
        du1.a(getWindow().getDecorView(), this);
    }

    @Override // com.daaw.p30
    public void E() {
        F().y();
    }

    public z3 F() {
        if (this.K == null) {
            this.K = z3.l(this, this);
        }
        return this.K;
    }

    public i0 G() {
        return F().w();
    }

    public final void H() {
        i().h("androidx:appcompat", new a());
        p(new b());
    }

    public void I(bk1 bk1Var) {
        bk1Var.e(this);
    }

    public void J(rk0 rk0Var) {
    }

    public void K(int i) {
    }

    public void L(bk1 bk1Var) {
    }

    @Deprecated
    public void M() {
    }

    public boolean N() {
        Intent f = f();
        if (f != null) {
            if (!S(f)) {
                R(f);
                return true;
            }
            bk1 h = bk1.h(this);
            I(h);
            L(h);
            h.j();
            try {
                q0.l(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    public final boolean O(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    public void P(Toolbar toolbar) {
        F().S(toolbar);
    }

    public n0 Q(n0.a aVar) {
        return F().V(aVar);
    }

    public void R(Intent intent) {
        as0.f(this, intent);
    }

    public boolean S(Intent intent) {
        return as0.g(this, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r();
        F().f(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(F().k(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        i0 G = G();
        if (getWindow().hasFeature(0)) {
            if (G == null || !G.f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // com.daaw.zh, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        i0 G = G();
        if (keyCode == 82 && G != null && G.p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.daaw.bk1.a
    public Intent f() {
        return as0.a(this);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) F().n(i);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return F().t();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.L == null && hs1.c()) {
            this.L = new hs1(this, super.getResources());
        }
        Resources resources = this.L;
        return resources == null ? super.getResources() : resources;
    }

    @Override // com.daaw.t3
    public void h(n0 n0Var) {
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        F().y();
    }

    @Override // com.daaw.t3
    public void j(n0 n0Var) {
    }

    @Override // com.daaw.t3
    public n0 l(n0.a aVar) {
        return null;
    }

    @Override // com.daaw.p30, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.L != null) {
            this.L.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        F().C(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        M();
    }

    @Override // com.daaw.p30, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        F().E();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (O(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.daaw.p30, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        i0 G = G();
        if (menuItem.getItemId() != 16908332 || G == null || (G.i() & 4) == 0) {
            return false;
        }
        return N();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // com.daaw.p30, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        F().F(bundle);
    }

    @Override // com.daaw.p30, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        F().G();
    }

    @Override // com.daaw.p30, android.app.Activity
    public void onStart() {
        super.onStart();
        F().I();
    }

    @Override // com.daaw.p30, android.app.Activity
    public void onStop() {
        super.onStop();
        F().J();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        F().U(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        i0 G = G();
        if (getWindow().hasFeature(0)) {
            if (G == null || !G.q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        r();
        F().P(i);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        r();
        F().Q(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r();
        F().R(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        F().T(i);
    }
}
