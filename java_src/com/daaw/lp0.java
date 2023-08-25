package com.daaw;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0081d;
import androidx.appcompat.view.menu.C0082e;
import androidx.appcompat.view.menu.C0086g;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class lp0 extends ck0 implements ip0 {

    /* renamed from: Z */
    public static Method f17587Z;

    /* renamed from: Y */
    public ip0 f17588Y;

    /* renamed from: com.daaw.lp0$a */
    /* loaded from: classes.dex */
    public static class C2102a {
        /* renamed from: a */
        public static void m16689a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        /* renamed from: b */
        public static void m16688b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* renamed from: com.daaw.lp0$b */
    /* loaded from: classes.dex */
    public static class C2103b {
        /* renamed from: a */
        public static void m16687a(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    /* renamed from: com.daaw.lp0$c */
    /* loaded from: classes.dex */
    public static class C2104c extends C3899zu {

        /* renamed from: C */
        public final int f17589C;

        /* renamed from: D */
        public final int f17590D;

        /* renamed from: E */
        public ip0 f17591E;

        /* renamed from: F */
        public MenuItem f17592F;

        /* renamed from: com.daaw.lp0$c$a */
        /* loaded from: classes.dex */
        public static class C2105a {
            /* renamed from: a */
            public static int m16686a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public C2104c(Context context, boolean z) {
            super(context, z);
            if (1 == C2105a.m16686a(context.getResources().getConfiguration())) {
                this.f17589C = 21;
                this.f17590D = 22;
                return;
            }
            this.f17589C = 22;
            this.f17590D = 21;
        }

        @Override // com.daaw.C3899zu
        /* renamed from: d */
        public /* bridge */ /* synthetic */ int mo1891d(int i, int i2, int i3, int i4, int i5) {
            return super.mo1891d(i, i2, i3, i4, i5);
        }

        @Override // com.daaw.C3899zu
        /* renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo1890e(MotionEvent motionEvent, int i) {
            return super.mo1890e(motionEvent, i);
        }

        @Override // com.daaw.C3899zu, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // com.daaw.C3899zu, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // com.daaw.C3899zu, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // com.daaw.C3899zu, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // com.daaw.C3899zu, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            int pointToPosition;
            int i2;
            if (this.f17591E != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                }
                C0081d c0081d = (C0081d) adapter;
                C0086g c0086g = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < c0081d.getCount()) {
                    c0086g = c0081d.getItem(i2);
                }
                MenuItem menuItem = this.f17592F;
                if (menuItem != c0086g) {
                    C0082e m30270b = c0081d.m30270b();
                    if (menuItem != null) {
                        this.f17591E.mo16691g(m30270b, menuItem);
                    }
                    this.f17592F = c0086g;
                    if (c0086g != null) {
                        this.f17591E.mo16692d(m30270b, c0086g);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f17589C) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f17590D) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                }
                ((C0081d) adapter).m30270b().m30239e(false);
                return true;
            }
        }

        @Override // com.daaw.C3899zu, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(ip0 ip0Var) {
            this.f17591E = ip0Var;
        }

        @Override // com.daaw.C3899zu, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f17587Z = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public lp0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: R */
    public void m16696R(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            C2102a.m16689a(this.f5910U, (Transition) obj);
        }
    }

    /* renamed from: S */
    public void m16695S(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            C2102a.m16688b(this.f5910U, (Transition) obj);
        }
    }

    /* renamed from: T */
    public void m16694T(ip0 ip0Var) {
        this.f17588Y = ip0Var;
    }

    /* renamed from: U */
    public void m16693U(boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            C2103b.m16687a(this.f5910U, z);
            return;
        }
        Method method = f17587Z;
        if (method != null) {
            try {
                method.invoke(this.f5910U, Boolean.valueOf(z));
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.daaw.ip0
    /* renamed from: d */
    public void mo16692d(C0082e c0082e, MenuItem menuItem) {
        ip0 ip0Var = this.f17588Y;
        if (ip0Var != null) {
            ip0Var.mo16692d(c0082e, menuItem);
        }
    }

    @Override // com.daaw.ip0
    /* renamed from: g */
    public void mo16691g(C0082e c0082e, MenuItem menuItem) {
        ip0 ip0Var = this.f17588Y;
        if (ip0Var != null) {
            ip0Var.mo16691g(c0082e, menuItem);
        }
    }

    @Override // com.daaw.ck0
    /* renamed from: s */
    public C3899zu mo16690s(Context context, boolean z) {
        C2104c c2104c = new C2104c(context, z);
        c2104c.setHoverListener(this);
        return c2104c;
    }
}
