package com.daaw;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0082e;
import androidx.appcompat.view.menu.C0088h;
/* loaded from: classes.dex */
public class gy0 {

    /* renamed from: a */
    public final Context f11842a;

    /* renamed from: b */
    public final C0082e f11843b;

    /* renamed from: c */
    public final View f11844c;

    /* renamed from: d */
    public final C0088h f11845d;

    /* renamed from: e */
    public InterfaceC1488d f11846e;

    /* renamed from: f */
    public InterfaceC1487c f11847f;

    /* renamed from: com.daaw.gy0$a */
    /* loaded from: classes.dex */
    public class C1485a implements C0082e.InterfaceC0083a {
        public C1485a() {
        }

        @Override // androidx.appcompat.view.menu.C0082e.InterfaceC0083a
        /* renamed from: a */
        public boolean mo330a(C0082e c0082e, MenuItem menuItem) {
            InterfaceC1488d interfaceC1488d = gy0.this.f11846e;
            if (interfaceC1488d != null) {
                return interfaceC1488d.onMenuItemClick(menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0082e.InterfaceC0083a
        /* renamed from: b */
        public void mo329b(C0082e c0082e) {
        }
    }

    /* renamed from: com.daaw.gy0$b */
    /* loaded from: classes.dex */
    public class C1486b implements PopupWindow.OnDismissListener {
        public C1486b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            gy0 gy0Var = gy0.this;
            InterfaceC1487c interfaceC1487c = gy0Var.f11847f;
            if (interfaceC1487c != null) {
                interfaceC1487c.m21136a(gy0Var);
            }
        }
    }

    /* renamed from: com.daaw.gy0$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1487c {
        /* renamed from: a */
        void m21136a(gy0 gy0Var);
    }

    /* renamed from: com.daaw.gy0$d */
    /* loaded from: classes.dex */
    public interface InterfaceC1488d {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public gy0(Context context, View view) {
        this(context, view, 0);
    }

    public gy0(Context context, View view, int i) {
        this(context, view, i, x01.popupMenuStyle, 0);
    }

    public gy0(Context context, View view, int i, int i2, int i3) {
        this.f11842a = context;
        this.f11844c = view;
        C0082e c0082e = new C0082e(context);
        this.f11843b = c0082e;
        c0082e.mo30169V(new C1485a());
        C0088h c0088h = new C0088h(context, c0082e, view, false, i2, i3);
        this.f11845d = c0088h;
        c0088h.m30183h(i);
        c0088h.m30182i(new C1486b());
    }

    /* renamed from: a */
    public Menu m21139a() {
        return this.f11843b;
    }

    /* renamed from: b */
    public void m21138b(InterfaceC1488d interfaceC1488d) {
        this.f11846e = interfaceC1488d;
    }

    /* renamed from: c */
    public void m21137c() {
        this.f11845d.m30180k();
    }
}
