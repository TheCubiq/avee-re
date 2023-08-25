package com.daaw;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* renamed from: com.daaw.o0 */
/* loaded from: classes.dex */
public abstract class AbstractC2388o0 {

    /* renamed from: a */
    public final Context f20902a;

    /* renamed from: b */
    public InterfaceC2389a f20903b;

    /* renamed from: c */
    public InterfaceC2390b f20904c;

    /* renamed from: com.daaw.o0$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2389a {
    }

    /* renamed from: com.daaw.o0$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2390b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public AbstractC2388o0(Context context) {
        this.f20902a = context;
    }

    /* renamed from: a */
    public boolean mo14671a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo14670b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo14669c();

    /* renamed from: d */
    public View mo14668d(MenuItem menuItem) {
        return mo14669c();
    }

    /* renamed from: e */
    public boolean mo14667e() {
        return false;
    }

    /* renamed from: f */
    public void mo14666f(SubMenu subMenu) {
    }

    /* renamed from: g */
    public boolean mo14665g() {
        return false;
    }

    /* renamed from: h */
    public void m14664h() {
        this.f20904c = null;
        this.f20903b = null;
    }

    /* renamed from: i */
    public void m14663i(InterfaceC2389a interfaceC2389a) {
        this.f20903b = interfaceC2389a;
    }

    /* renamed from: j */
    public void mo14662j(InterfaceC2390b interfaceC2390b) {
        if (this.f20904c != null && interfaceC2390b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            sb.append(getClass().getSimpleName());
            sb.append(" instance while it is still in use somewhere else?");
        }
        this.f20904c = interfaceC2390b;
    }
}
