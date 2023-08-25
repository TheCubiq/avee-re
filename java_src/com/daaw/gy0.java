package com.daaw;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.e;
/* loaded from: classes.dex */
public class gy0 {
    public final Context a;
    public final androidx.appcompat.view.menu.e b;
    public final View c;
    public final androidx.appcompat.view.menu.h d;
    public d e;
    public c f;

    /* loaded from: classes.dex */
    public class a implements e.a {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            d dVar = gy0.this.e;
            if (dVar != null) {
                return dVar.onMenuItemClick(menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements PopupWindow.OnDismissListener {
        public b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            gy0 gy0Var = gy0.this;
            c cVar = gy0Var.f;
            if (cVar != null) {
                cVar.a(gy0Var);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(gy0 gy0Var);
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public gy0(Context context, View view) {
        this(context, view, 0);
    }

    public gy0(Context context, View view, int i) {
        this(context, view, i, x01.popupMenuStyle, 0);
    }

    public gy0(Context context, View view, int i, int i2, int i3) {
        this.a = context;
        this.c = view;
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        this.b = eVar;
        eVar.V(new a());
        androidx.appcompat.view.menu.h hVar = new androidx.appcompat.view.menu.h(context, eVar, view, false, i2, i3);
        this.d = hVar;
        hVar.h(i);
        hVar.i(new b());
    }

    public Menu a() {
        return this.b;
    }

    public void b(d dVar) {
        this.e = dVar;
    }

    public void c() {
        this.d.k();
    }
}
