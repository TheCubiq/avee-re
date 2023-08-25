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
import com.daaw.AbstractC2228n0;
import com.daaw.bk1;
import com.daaw.k81;
/* renamed from: com.daaw.p3 */
/* loaded from: classes.dex */
public class ActivityC2508p3 extends p30 implements InterfaceC3010t3, bk1.InterfaceC0854a {

    /* renamed from: K */
    public AbstractC3800z3 f22558K;

    /* renamed from: L */
    public Resources f22559L;

    /* renamed from: com.daaw.p3$a */
    /* loaded from: classes.dex */
    public class C2509a implements k81.InterfaceC1922c {
        public C2509a() {
        }

        @Override // com.daaw.k81.InterfaceC1922c
        /* renamed from: a */
        public Bundle mo5117a() {
            Bundle bundle = new Bundle();
            ActivityC2508p3.this.m13677F().mo2951H(bundle);
            return bundle;
        }
    }

    /* renamed from: com.daaw.p3$b */
    /* loaded from: classes.dex */
    public class C2510b implements eu0 {
        public C2510b() {
        }

        @Override // com.daaw.eu0
        /* renamed from: a */
        public void mo6068a(Context context) {
            AbstractC3800z3 m13677F = ActivityC2508p3.this.m13677F();
            m13677F.mo2914x();
            m13677F.mo2955D(ActivityC2508p3.this.mo16178i().m17972b("androidx:appcompat"));
        }
    }

    public ActivityC2508p3() {
        m13675H();
    }

    /* renamed from: r */
    private void m13662r() {
        bu1.m25826a(getWindow().getDecorView(), this);
        eu1.m23179a(getWindow().getDecorView(), this);
        du1.m23947a(getWindow().getDecorView(), this);
    }

    @Override // com.daaw.p30
    /* renamed from: E */
    public void mo13657E() {
        m13677F().mo2913y();
    }

    /* renamed from: F */
    public AbstractC3800z3 m13677F() {
        if (this.f22558K == null) {
            this.f22558K = AbstractC3800z3.m2926l(this, this);
        }
        return this.f22558K;
    }

    /* renamed from: G */
    public AbstractC1643i0 m13676G() {
        return m13677F().mo2915w();
    }

    /* renamed from: H */
    public final void m13675H() {
        mo16178i().m17966h("androidx:appcompat", new C2509a());
        m30383p(new C2510b());
    }

    /* renamed from: I */
    public void m13674I(bk1 bk1Var) {
        bk1Var.m26092e(this);
    }

    /* renamed from: J */
    public void m13673J(rk0 rk0Var) {
    }

    /* renamed from: K */
    public void m13672K(int i) {
    }

    /* renamed from: L */
    public void m13671L(bk1 bk1Var) {
    }

    @Deprecated
    /* renamed from: M */
    public void m13670M() {
    }

    /* renamed from: N */
    public boolean m13669N() {
        Intent mo13663f = mo13663f();
        if (mo13663f != null) {
            if (!m13664S(mo13663f)) {
                m13665R(mo13663f);
                return true;
            }
            bk1 m26090h = bk1.m26090h(this);
            m13674I(m26090h);
            m13671L(m26090h);
            m26090h.m26089j();
            try {
                C2670q0.m12830l(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    /* renamed from: O */
    public final boolean m13668O(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    /* renamed from: P */
    public void m13667P(Toolbar toolbar) {
        m13677F().mo2940S(toolbar);
    }

    /* renamed from: Q */
    public AbstractC2228n0 m13666Q(AbstractC2228n0.InterfaceC2229a interfaceC2229a) {
        return m13677F().mo2937V(interfaceC2229a);
    }

    /* renamed from: R */
    public void m13665R(Intent intent) {
        as0.m27106f(this, intent);
    }

    /* renamed from: S */
    public boolean m13664S(Intent intent) {
        return as0.m27105g(this, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m13662r();
        m13677F().mo2932f(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(m13677F().mo2927k(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC1643i0 m13676G = m13676G();
        if (getWindow().hasFeature(0)) {
            if (m13676G == null || !m13676G.mo20284f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // com.daaw.ActivityC3839zh, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC1643i0 m13676G = m13676G();
        if (keyCode == 82 && m13676G != null && m13676G.mo20281p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.daaw.bk1.InterfaceC0854a
    /* renamed from: f */
    public Intent mo13663f() {
        return as0.m27111a(this);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) m13677F().mo2924n(i);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return m13677F().mo2918t();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f22559L == null && hs1.m20440c()) {
            this.f22559L = new hs1(this, super.getResources());
        }
        Resources resources = this.f22559L;
        return resources == null ? super.getResources() : resources;
    }

    @Override // com.daaw.InterfaceC3010t3
    /* renamed from: h */
    public void mo9641h(AbstractC2228n0 abstractC2228n0) {
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m13677F().mo2913y();
    }

    @Override // com.daaw.InterfaceC3010t3
    /* renamed from: j */
    public void mo9640j(AbstractC2228n0 abstractC2228n0) {
    }

    @Override // com.daaw.InterfaceC3010t3
    /* renamed from: l */
    public AbstractC2228n0 mo9639l(AbstractC2228n0.InterfaceC2229a interfaceC2229a) {
        return null;
    }

    @Override // com.daaw.p30, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f22559L != null) {
            this.f22559L.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        m13677F().mo2956C(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        m13670M();
    }

    @Override // com.daaw.p30, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m13677F().mo2954E();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m13668O(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.daaw.p30, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC1643i0 m13676G = m13676G();
        if (menuItem.getItemId() != 16908332 || m13676G == null || (m13676G.mo15696i() & 4) == 0) {
            return false;
        }
        return m13669N();
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
        m13677F().mo2953F(bundle);
    }

    @Override // com.daaw.p30, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m13677F().mo2952G();
    }

    @Override // com.daaw.p30, android.app.Activity
    public void onStart() {
        super.onStart();
        m13677F().mo2950I();
    }

    @Override // com.daaw.p30, android.app.Activity
    public void onStop() {
        super.onStop();
        m13677F().mo2949J();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m13677F().mo2938U(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC1643i0 m13676G = m13676G();
        if (getWindow().hasFeature(0)) {
            if (m13676G == null || !m13676G.mo20280q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        m13662r();
        m13677F().mo2943P(i);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        m13662r();
        m13677F().mo2942Q(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m13662r();
        m13677F().mo2941R(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        m13677F().mo2939T(i);
    }
}
