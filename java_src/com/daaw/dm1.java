package com.daaw;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.Toolbar;
import com.daaw.a4;
import com.daaw.i0;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class dm1 extends i0 {
    public final iq a;
    public final Window.Callback b;
    public final a4.h c;
    public boolean d;
    public boolean e;
    public boolean f;
    public ArrayList<i0.b> g = new ArrayList<>();
    public final Runnable h = new a();
    public final Toolbar.f i;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            dm1.this.B();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Toolbar.f {
        public b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return dm1.this.b.onMenuItemSelected(0, menuItem);
        }
    }

    /* loaded from: classes.dex */
    public final class c implements i.a {
        public boolean p;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
            if (this.p) {
                return;
            }
            this.p = true;
            dm1.this.a.h();
            dm1.this.b.onPanelClosed(p21.Z0, eVar);
            this.p = false;
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            dm1.this.b.onMenuOpened(p21.Z0, eVar);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public final class d implements e.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (dm1.this.a.b()) {
                dm1.this.b.onPanelClosed(p21.Z0, eVar);
            } else if (dm1.this.b.onPreparePanel(0, null, eVar)) {
                dm1.this.b.onMenuOpened(p21.Z0, eVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements a4.h {
        public e() {
        }

        @Override // com.daaw.a4.h
        public boolean a(int i) {
            if (i == 0) {
                dm1 dm1Var = dm1.this;
                if (dm1Var.d) {
                    return false;
                }
                dm1Var.a.c();
                dm1.this.d = true;
                return false;
            }
            return false;
        }

        @Override // com.daaw.a4.h
        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(dm1.this.a.getContext());
            }
            return null;
        }
    }

    public dm1(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.i = bVar;
        ty0.f(toolbar);
        androidx.appcompat.widget.d dVar = new androidx.appcompat.widget.d(toolbar, false);
        this.a = dVar;
        this.b = (Window.Callback) ty0.f(callback);
        dVar.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        dVar.setWindowTitle(charSequence);
        this.c = new e();
    }

    public final Menu A() {
        if (!this.e) {
            this.a.r(new c(), new d());
            this.e = true;
        }
        return this.a.n();
    }

    public void B() {
        Menu A = A();
        androidx.appcompat.view.menu.e eVar = A instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) A : null;
        if (eVar != null) {
            eVar.h0();
        }
        try {
            A.clear();
            if (!this.b.onCreatePanelMenu(0, A) || !this.b.onPreparePanel(0, null, A)) {
                A.clear();
            }
        } finally {
            if (eVar != null) {
                eVar.g0();
            }
        }
    }

    public void C(int i, int i2) {
        this.a.l((i & i2) | ((i2 ^ (-1)) & this.a.v()));
    }

    @Override // com.daaw.i0
    public boolean f() {
        return this.a.f();
    }

    @Override // com.daaw.i0
    public boolean g() {
        if (this.a.k()) {
            this.a.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // com.daaw.i0
    public void h(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            this.g.get(i).a(z);
        }
    }

    @Override // com.daaw.i0
    public int i() {
        return this.a.v();
    }

    @Override // com.daaw.i0
    public Context j() {
        return this.a.getContext();
    }

    @Override // com.daaw.i0
    public boolean k() {
        this.a.t().removeCallbacks(this.h);
        xs1.j0(this.a.t(), this.h);
        return true;
    }

    @Override // com.daaw.i0
    public boolean l() {
        return this.a.j() == 0;
    }

    @Override // com.daaw.i0
    public void m(Configuration configuration) {
        super.m(configuration);
    }

    @Override // com.daaw.i0
    public void n() {
        this.a.t().removeCallbacks(this.h);
    }

    @Override // com.daaw.i0
    public boolean o(int i, KeyEvent keyEvent) {
        Menu A = A();
        if (A != null) {
            A.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            return A.performShortcut(i, keyEvent, 0);
        }
        return false;
    }

    @Override // com.daaw.i0
    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    @Override // com.daaw.i0
    public boolean q() {
        return this.a.g();
    }

    @Override // com.daaw.i0
    public void r(boolean z) {
    }

    @Override // com.daaw.i0
    public void s(boolean z) {
        C(z ? 4 : 0, 4);
    }

    @Override // com.daaw.i0
    public void t(boolean z) {
        C(z ? 2 : 0, 2);
    }

    @Override // com.daaw.i0
    public void u(boolean z) {
        C(z ? 8 : 0, 8);
    }

    @Override // com.daaw.i0
    public void v(boolean z) {
    }

    @Override // com.daaw.i0
    public void w(CharSequence charSequence) {
        this.a.m(charSequence);
    }

    @Override // com.daaw.i0
    public void x(CharSequence charSequence) {
        this.a.setTitle(charSequence);
    }

    @Override // com.daaw.i0
    public void y(CharSequence charSequence) {
        this.a.setWindowTitle(charSequence);
    }
}
