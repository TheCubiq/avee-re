package com.daaw;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.daaw.i0;
import com.daaw.n0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class mx1 extends i0 implements ActionBarOverlayLayout.d {
    public static final Interpolator E = new AccelerateInterpolator();
    public static final Interpolator F = new DecelerateInterpolator();
    public boolean A;
    public Context a;
    public Context b;
    public Activity c;
    public ActionBarOverlayLayout d;
    public ActionBarContainer e;
    public iq f;
    public ActionBarContextView g;
    public View h;
    public androidx.appcompat.widget.c i;
    public boolean l;
    public d m;
    public n0 n;
    public n0.a o;
    public boolean p;
    public boolean r;
    public boolean u;
    public boolean v;
    public boolean w;
    public vt1 y;
    public boolean z;
    public ArrayList<Object> j = new ArrayList<>();
    public int k = -1;
    public ArrayList<i0.b> q = new ArrayList<>();
    public int s = 0;
    public boolean t = true;
    public boolean x = true;
    public final wt1 B = new a();
    public final wt1 C = new b();
    public final yt1 D = new c();

    /* loaded from: classes.dex */
    public class a extends xt1 {
        public a() {
        }

        @Override // com.daaw.wt1
        public void b(View view) {
            View view2;
            mx1 mx1Var = mx1.this;
            if (mx1Var.t && (view2 = mx1Var.h) != null) {
                view2.setTranslationY(0.0f);
                mx1.this.e.setTranslationY(0.0f);
            }
            mx1.this.e.setVisibility(8);
            mx1.this.e.setTransitioning(false);
            mx1 mx1Var2 = mx1.this;
            mx1Var2.y = null;
            mx1Var2.C();
            ActionBarOverlayLayout actionBarOverlayLayout = mx1.this.d;
            if (actionBarOverlayLayout != null) {
                xs1.o0(actionBarOverlayLayout);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends xt1 {
        public b() {
        }

        @Override // com.daaw.wt1
        public void b(View view) {
            mx1 mx1Var = mx1.this;
            mx1Var.y = null;
            mx1Var.e.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class c implements yt1 {
        public c() {
        }

        @Override // com.daaw.yt1
        public void a(View view) {
            ((View) mx1.this.e.getParent()).invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class d extends n0 implements e.a {
        public final Context r;
        public final androidx.appcompat.view.menu.e s;
        public n0.a t;
        public WeakReference<View> u;

        public d(Context context, n0.a aVar) {
            this.r = context;
            this.t = aVar;
            androidx.appcompat.view.menu.e W = new androidx.appcompat.view.menu.e(context).W(1);
            this.s = W;
            W.V(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            n0.a aVar = this.t;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.t == null) {
                return;
            }
            k();
            mx1.this.g.l();
        }

        @Override // com.daaw.n0
        public void c() {
            mx1 mx1Var = mx1.this;
            if (mx1Var.m != this) {
                return;
            }
            if (mx1.B(mx1Var.u, mx1Var.v, false)) {
                this.t.c(this);
            } else {
                mx1 mx1Var2 = mx1.this;
                mx1Var2.n = this;
                mx1Var2.o = this.t;
            }
            this.t = null;
            mx1.this.A(false);
            mx1.this.g.g();
            mx1 mx1Var3 = mx1.this;
            mx1Var3.d.setHideOnContentScrollEnabled(mx1Var3.A);
            mx1.this.m = null;
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
            return this.s;
        }

        @Override // com.daaw.n0
        public MenuInflater f() {
            return new gi1(this.r);
        }

        @Override // com.daaw.n0
        public CharSequence g() {
            return mx1.this.g.getSubtitle();
        }

        @Override // com.daaw.n0
        public CharSequence i() {
            return mx1.this.g.getTitle();
        }

        @Override // com.daaw.n0
        public void k() {
            if (mx1.this.m != this) {
                return;
            }
            this.s.h0();
            try {
                this.t.a(this, this.s);
            } finally {
                this.s.g0();
            }
        }

        @Override // com.daaw.n0
        public boolean l() {
            return mx1.this.g.j();
        }

        @Override // com.daaw.n0
        public void m(View view) {
            mx1.this.g.setCustomView(view);
            this.u = new WeakReference<>(view);
        }

        @Override // com.daaw.n0
        public void n(int i) {
            o(mx1.this.a.getResources().getString(i));
        }

        @Override // com.daaw.n0
        public void o(CharSequence charSequence) {
            mx1.this.g.setSubtitle(charSequence);
        }

        @Override // com.daaw.n0
        public void q(int i) {
            r(mx1.this.a.getResources().getString(i));
        }

        @Override // com.daaw.n0
        public void r(CharSequence charSequence) {
            mx1.this.g.setTitle(charSequence);
        }

        @Override // com.daaw.n0
        public void s(boolean z) {
            super.s(z);
            mx1.this.g.setTitleOptional(z);
        }

        public boolean t() {
            this.s.h0();
            try {
                return this.t.b(this, this.s);
            } finally {
                this.s.g0();
            }
        }
    }

    public mx1(Activity activity, boolean z) {
        this.c = activity;
        View decorView = activity.getWindow().getDecorView();
        K(decorView);
        if (z) {
            return;
        }
        this.h = decorView.findViewById(16908290);
    }

    public mx1(Dialog dialog) {
        K(dialog.getWindow().getDecorView());
    }

    public static boolean B(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    public void A(boolean z) {
        ut1 q;
        ut1 f;
        if (z) {
            R();
        } else {
            J();
        }
        if (!Q()) {
            if (z) {
                this.f.s(4);
                this.g.setVisibility(0);
                return;
            }
            this.f.s(0);
            this.g.setVisibility(8);
            return;
        }
        if (z) {
            f = this.f.q(4, 100L);
            q = this.g.f(0, 200L);
        } else {
            q = this.f.q(0, 200L);
            f = this.g.f(8, 100L);
        }
        vt1 vt1Var = new vt1();
        vt1Var.d(f, q);
        vt1Var.h();
    }

    public void C() {
        n0.a aVar = this.o;
        if (aVar != null) {
            aVar.c(this.n);
            this.n = null;
            this.o = null;
        }
    }

    public void D(boolean z) {
        View view;
        int[] iArr;
        vt1 vt1Var = this.y;
        if (vt1Var != null) {
            vt1Var.a();
        }
        if (this.s != 0 || (!this.z && !z)) {
            this.B.b(null);
            return;
        }
        this.e.setAlpha(1.0f);
        this.e.setTransitioning(true);
        vt1 vt1Var2 = new vt1();
        float f = -this.e.getHeight();
        if (z) {
            this.e.getLocationInWindow(new int[]{0, 0});
            f -= iArr[1];
        }
        ut1 m = xs1.e(this.e).m(f);
        m.k(this.D);
        vt1Var2.c(m);
        if (this.t && (view = this.h) != null) {
            vt1Var2.c(xs1.e(view).m(f));
        }
        vt1Var2.f(E);
        vt1Var2.e(250L);
        vt1Var2.g(this.B);
        this.y = vt1Var2;
        vt1Var2.h();
    }

    public void E(boolean z) {
        View view;
        View view2;
        int[] iArr;
        vt1 vt1Var = this.y;
        if (vt1Var != null) {
            vt1Var.a();
        }
        this.e.setVisibility(0);
        if (this.s == 0 && (this.z || z)) {
            this.e.setTranslationY(0.0f);
            float f = -this.e.getHeight();
            if (z) {
                this.e.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            this.e.setTranslationY(f);
            vt1 vt1Var2 = new vt1();
            ut1 m = xs1.e(this.e).m(0.0f);
            m.k(this.D);
            vt1Var2.c(m);
            if (this.t && (view2 = this.h) != null) {
                view2.setTranslationY(f);
                vt1Var2.c(xs1.e(this.h).m(0.0f));
            }
            vt1Var2.f(F);
            vt1Var2.e(250L);
            vt1Var2.g(this.C);
            this.y = vt1Var2;
            vt1Var2.h();
        } else {
            this.e.setAlpha(1.0f);
            this.e.setTranslationY(0.0f);
            if (this.t && (view = this.h) != null) {
                view.setTranslationY(0.0f);
            }
            this.C.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.d;
        if (actionBarOverlayLayout != null) {
            xs1.o0(actionBarOverlayLayout);
        }
    }

    public final iq F(View view) {
        if (view instanceof iq) {
            return (iq) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    public int G() {
        return this.e.getHeight();
    }

    public int H() {
        return this.d.getActionBarHideOffset();
    }

    public int I() {
        return this.f.p();
    }

    public final void J() {
        if (this.w) {
            this.w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            S(false);
        }
    }

    public final void K(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(o11.decor_content_parent);
        this.d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f = F(view.findViewById(o11.action_bar));
        this.g = (ActionBarContextView) view.findViewById(o11.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(o11.action_bar_container);
        this.e = actionBarContainer;
        iq iqVar = this.f;
        if (iqVar == null || this.g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.a = iqVar.getContext();
        boolean z = (this.f.v() & 4) != 0;
        if (z) {
            this.l = true;
        }
        k0 b2 = k0.b(this.a);
        P(b2.a() || z);
        N(b2.g());
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, x21.a, x01.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(x21.k, false)) {
            O(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(x21.i, 0);
        if (dimensionPixelSize != 0) {
            M(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public void L(int i, int i2) {
        int v = this.f.v();
        if ((i2 & 4) != 0) {
            this.l = true;
        }
        this.f.l((i & i2) | ((i2 ^ (-1)) & v));
    }

    public void M(float f) {
        xs1.z0(this.e, f);
    }

    public final void N(boolean z) {
        this.r = z;
        if (z) {
            this.e.setTabContainer(null);
            this.f.i(this.i);
        } else {
            this.f.i(null);
            this.e.setTabContainer(this.i);
        }
        boolean z2 = true;
        boolean z3 = I() == 2;
        androidx.appcompat.widget.c cVar = this.i;
        if (cVar != null) {
            if (z3) {
                cVar.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.d;
                if (actionBarOverlayLayout != null) {
                    xs1.o0(actionBarOverlayLayout);
                }
            } else {
                cVar.setVisibility(8);
            }
        }
        this.f.y(!this.r && z3);
        this.d.setHasNonEmbeddedTabs((this.r || !z3) ? false : false);
    }

    public void O(boolean z) {
        if (z && !this.d.w()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.A = z;
        this.d.setHideOnContentScrollEnabled(z);
    }

    public void P(boolean z) {
        this.f.u(z);
    }

    public final boolean Q() {
        return xs1.V(this.e);
    }

    public final void R() {
        if (this.w) {
            return;
        }
        this.w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        S(false);
    }

    public final void S(boolean z) {
        if (B(this.u, this.v, this.w)) {
            if (this.x) {
                return;
            }
            this.x = true;
            E(z);
        } else if (this.x) {
            this.x = false;
            D(z);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.v) {
            this.v = false;
            S(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z) {
        this.t = z;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.v) {
            return;
        }
        this.v = true;
        S(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        vt1 vt1Var = this.y;
        if (vt1Var != null) {
            vt1Var.a();
            this.y = null;
        }
    }

    @Override // com.daaw.i0
    public boolean g() {
        iq iqVar = this.f;
        if (iqVar == null || !iqVar.k()) {
            return false;
        }
        this.f.collapseActionView();
        return true;
    }

    @Override // com.daaw.i0
    public void h(boolean z) {
        if (z == this.p) {
            return;
        }
        this.p = z;
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            this.q.get(i).a(z);
        }
    }

    @Override // com.daaw.i0
    public int i() {
        return this.f.v();
    }

    @Override // com.daaw.i0
    public Context j() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(x01.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    @Override // com.daaw.i0
    public boolean l() {
        int G = G();
        return this.x && (G == 0 || H() < G);
    }

    @Override // com.daaw.i0
    public void m(Configuration configuration) {
        N(k0.b(this.a).g());
    }

    @Override // com.daaw.i0
    public boolean o(int i, KeyEvent keyEvent) {
        Menu e;
        d dVar = this.m;
        if (dVar == null || (e = dVar.e()) == null) {
            return false;
        }
        e.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return e.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i) {
        this.s = i;
    }

    @Override // com.daaw.i0
    public void r(boolean z) {
        if (this.l) {
            return;
        }
        s(z);
    }

    @Override // com.daaw.i0
    public void s(boolean z) {
        L(z ? 4 : 0, 4);
    }

    @Override // com.daaw.i0
    public void t(boolean z) {
        L(z ? 2 : 0, 2);
    }

    @Override // com.daaw.i0
    public void u(boolean z) {
        L(z ? 8 : 0, 8);
    }

    @Override // com.daaw.i0
    public void v(boolean z) {
        vt1 vt1Var;
        this.z = z;
        if (z || (vt1Var = this.y) == null) {
            return;
        }
        vt1Var.a();
    }

    @Override // com.daaw.i0
    public void w(CharSequence charSequence) {
        this.f.m(charSequence);
    }

    @Override // com.daaw.i0
    public void x(CharSequence charSequence) {
        this.f.setTitle(charSequence);
    }

    @Override // com.daaw.i0
    public void y(CharSequence charSequence) {
        this.f.setWindowTitle(charSequence);
    }

    @Override // com.daaw.i0
    public n0 z(n0.a aVar) {
        d dVar = this.m;
        if (dVar != null) {
            dVar.c();
        }
        this.d.setHideOnContentScrollEnabled(false);
        this.g.k();
        d dVar2 = new d(this.g.getContext(), aVar);
        if (dVar2.t()) {
            this.m = dVar2;
            dVar2.k();
            this.g.h(dVar2);
            A(true);
            return dVar2;
        }
        return null;
    }
}
