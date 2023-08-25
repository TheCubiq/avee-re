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
import androidx.appcompat.view.menu.C0082e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0166c;
import androidx.appcompat.widget.Toolbar;
import com.daaw.AbstractC1643i0;
import com.daaw.AbstractC2228n0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class mx1 extends AbstractC1643i0 implements ActionBarOverlayLayout.InterfaceC0104d {

    /* renamed from: E */
    public static final Interpolator f19223E = new AccelerateInterpolator();

    /* renamed from: F */
    public static final Interpolator f19224F = new DecelerateInterpolator();

    /* renamed from: A */
    public boolean f19225A;

    /* renamed from: a */
    public Context f19229a;

    /* renamed from: b */
    public Context f19230b;

    /* renamed from: c */
    public Activity f19231c;

    /* renamed from: d */
    public ActionBarOverlayLayout f19232d;

    /* renamed from: e */
    public ActionBarContainer f19233e;

    /* renamed from: f */
    public InterfaceC1745iq f19234f;

    /* renamed from: g */
    public ActionBarContextView f19235g;

    /* renamed from: h */
    public View f19236h;

    /* renamed from: i */
    public C0166c f19237i;

    /* renamed from: l */
    public boolean f19240l;

    /* renamed from: m */
    public C2222d f19241m;

    /* renamed from: n */
    public AbstractC2228n0 f19242n;

    /* renamed from: o */
    public AbstractC2228n0.InterfaceC2229a f19243o;

    /* renamed from: p */
    public boolean f19244p;

    /* renamed from: r */
    public boolean f19246r;

    /* renamed from: u */
    public boolean f19249u;

    /* renamed from: v */
    public boolean f19250v;

    /* renamed from: w */
    public boolean f19251w;

    /* renamed from: y */
    public vt1 f19253y;

    /* renamed from: z */
    public boolean f19254z;

    /* renamed from: j */
    public ArrayList<Object> f19238j = new ArrayList<>();

    /* renamed from: k */
    public int f19239k = -1;

    /* renamed from: q */
    public ArrayList<AbstractC1643i0.InterfaceC1645b> f19245q = new ArrayList<>();

    /* renamed from: s */
    public int f19247s = 0;

    /* renamed from: t */
    public boolean f19248t = true;

    /* renamed from: x */
    public boolean f19252x = true;

    /* renamed from: B */
    public final wt1 f19226B = new C2219a();

    /* renamed from: C */
    public final wt1 f19227C = new C2220b();

    /* renamed from: D */
    public final yt1 f19228D = new C2221c();

    /* renamed from: com.daaw.mx1$a */
    /* loaded from: classes.dex */
    public class C2219a extends xt1 {
        public C2219a() {
        }

        @Override // com.daaw.wt1
        /* renamed from: b */
        public void mo5810b(View view) {
            View view2;
            mx1 mx1Var = mx1.this;
            if (mx1Var.f19248t && (view2 = mx1Var.f19236h) != null) {
                view2.setTranslationY(0.0f);
                mx1.this.f19233e.setTranslationY(0.0f);
            }
            mx1.this.f19233e.setVisibility(8);
            mx1.this.f19233e.setTransitioning(false);
            mx1 mx1Var2 = mx1.this;
            mx1Var2.f19253y = null;
            mx1Var2.m15720C();
            ActionBarOverlayLayout actionBarOverlayLayout = mx1.this.f19232d;
            if (actionBarOverlayLayout != null) {
                xs1.m4708o0(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: com.daaw.mx1$b */
    /* loaded from: classes.dex */
    public class C2220b extends xt1 {
        public C2220b() {
        }

        @Override // com.daaw.wt1
        /* renamed from: b */
        public void mo5810b(View view) {
            mx1 mx1Var = mx1.this;
            mx1Var.f19253y = null;
            mx1Var.f19233e.requestLayout();
        }
    }

    /* renamed from: com.daaw.mx1$c */
    /* loaded from: classes.dex */
    public class C2221c implements yt1 {
        public C2221c() {
        }

        @Override // com.daaw.yt1
        /* renamed from: a */
        public void mo3232a(View view) {
            ((View) mx1.this.f19233e.getParent()).invalidate();
        }
    }

    /* renamed from: com.daaw.mx1$d */
    /* loaded from: classes.dex */
    public class C2222d extends AbstractC2228n0 implements C0082e.InterfaceC0083a {

        /* renamed from: r */
        public final Context f19258r;

        /* renamed from: s */
        public final C0082e f19259s;

        /* renamed from: t */
        public AbstractC2228n0.InterfaceC2229a f19260t;

        /* renamed from: u */
        public WeakReference<View> f19261u;

        public C2222d(Context context, AbstractC2228n0.InterfaceC2229a interfaceC2229a) {
            this.f19258r = context;
            this.f19260t = interfaceC2229a;
            C0082e m30251W = new C0082e(context).m30251W(1);
            this.f19259s = m30251W;
            m30251W.mo30169V(this);
        }

        @Override // androidx.appcompat.view.menu.C0082e.InterfaceC0083a
        /* renamed from: a */
        public boolean mo330a(C0082e c0082e, MenuItem menuItem) {
            AbstractC2228n0.InterfaceC2229a interfaceC2229a = this.f19260t;
            if (interfaceC2229a != null) {
                return interfaceC2229a.mo15628d(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0082e.InterfaceC0083a
        /* renamed from: b */
        public void mo329b(C0082e c0082e) {
            if (this.f19260t == null) {
                return;
            }
            mo15640k();
            mx1.this.f19235g.m30155l();
        }

        @Override // com.daaw.AbstractC2228n0
        /* renamed from: c */
        public void mo15648c() {
            mx1 mx1Var = mx1.this;
            if (mx1Var.f19241m != this) {
                return;
            }
            if (mx1.m15721B(mx1Var.f19249u, mx1Var.f19250v, false)) {
                this.f19260t.mo15629c(this);
            } else {
                mx1 mx1Var2 = mx1.this;
                mx1Var2.f19242n = this;
                mx1Var2.f19243o = this.f19260t;
            }
            this.f19260t = null;
            mx1.this.m15722A(false);
            mx1.this.f19235g.m30160g();
            mx1 mx1Var3 = mx1.this;
            mx1Var3.f19232d.setHideOnContentScrollEnabled(mx1Var3.f19225A);
            mx1.this.f19241m = null;
        }

        @Override // com.daaw.AbstractC2228n0
        /* renamed from: d */
        public View mo15647d() {
            WeakReference<View> weakReference = this.f19261u;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // com.daaw.AbstractC2228n0
        /* renamed from: e */
        public Menu mo15646e() {
            return this.f19259s;
        }

        @Override // com.daaw.AbstractC2228n0
        /* renamed from: f */
        public MenuInflater mo15645f() {
            return new gi1(this.f19258r);
        }

        @Override // com.daaw.AbstractC2228n0
        /* renamed from: g */
        public CharSequence mo15644g() {
            return mx1.this.f19235g.getSubtitle();
        }

        @Override // com.daaw.AbstractC2228n0
        /* renamed from: i */
        public CharSequence mo15642i() {
            return mx1.this.f19235g.getTitle();
        }

        @Override // com.daaw.AbstractC2228n0
        /* renamed from: k */
        public void mo15640k() {
            if (mx1.this.f19241m != this) {
                return;
            }
            this.f19259s.m30234h0();
            try {
                this.f19260t.mo15631a(this, this.f19259s);
            } finally {
                this.f19259s.m30235g0();
            }
        }

        @Override // com.daaw.AbstractC2228n0
        /* renamed from: l */
        public boolean mo15639l() {
            return mx1.this.f19235g.m30157j();
        }

        @Override // com.daaw.AbstractC2228n0
        /* renamed from: m */
        public void mo15638m(View view) {
            mx1.this.f19235g.setCustomView(view);
            this.f19261u = new WeakReference<>(view);
        }

        @Override // com.daaw.AbstractC2228n0
        /* renamed from: n */
        public void mo15637n(int i) {
            mo15636o(mx1.this.f19229a.getResources().getString(i));
        }

        @Override // com.daaw.AbstractC2228n0
        /* renamed from: o */
        public void mo15636o(CharSequence charSequence) {
            mx1.this.f19235g.setSubtitle(charSequence);
        }

        @Override // com.daaw.AbstractC2228n0
        /* renamed from: q */
        public void mo15634q(int i) {
            mo15633r(mx1.this.f19229a.getResources().getString(i));
        }

        @Override // com.daaw.AbstractC2228n0
        /* renamed from: r */
        public void mo15633r(CharSequence charSequence) {
            mx1.this.f19235g.setTitle(charSequence);
        }

        @Override // com.daaw.AbstractC2228n0
        /* renamed from: s */
        public void mo15632s(boolean z) {
            super.mo15632s(z);
            mx1.this.f19235g.setTitleOptional(z);
        }

        /* renamed from: t */
        public boolean m15682t() {
            this.f19259s.m30234h0();
            try {
                return this.f19260t.mo15630b(this, this.f19259s);
            } finally {
                this.f19259s.m30235g0();
            }
        }
    }

    public mx1(Activity activity, boolean z) {
        this.f19231c = activity;
        View decorView = activity.getWindow().getDecorView();
        m15712K(decorView);
        if (z) {
            return;
        }
        this.f19236h = decorView.findViewById(16908290);
    }

    public mx1(Dialog dialog) {
        m15712K(dialog.getWindow().getDecorView());
    }

    /* renamed from: B */
    public static boolean m15721B(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    /* renamed from: A */
    public void m15722A(boolean z) {
        ut1 mo19512q;
        ut1 mo26566f;
        if (z) {
            m15705R();
        } else {
            m15713J();
        }
        if (!m15706Q()) {
            if (z) {
                this.f19234f.mo19510s(4);
                this.f19235g.setVisibility(0);
                return;
            }
            this.f19234f.mo19510s(0);
            this.f19235g.setVisibility(8);
            return;
        }
        if (z) {
            mo26566f = this.f19234f.mo19512q(4, 100L);
            mo19512q = this.f19235g.mo26566f(0, 200L);
        } else {
            mo19512q = this.f19234f.mo19512q(0, 200L);
            mo26566f = this.f19235g.mo26566f(8, 100L);
        }
        vt1 vt1Var = new vt1();
        vt1Var.m6802d(mo26566f, mo19512q);
        vt1Var.m6798h();
    }

    /* renamed from: C */
    public void m15720C() {
        AbstractC2228n0.InterfaceC2229a interfaceC2229a = this.f19243o;
        if (interfaceC2229a != null) {
            interfaceC2229a.mo15629c(this.f19242n);
            this.f19242n = null;
            this.f19243o = null;
        }
    }

    /* renamed from: D */
    public void m15719D(boolean z) {
        View view;
        int[] iArr;
        vt1 vt1Var = this.f19253y;
        if (vt1Var != null) {
            vt1Var.m6805a();
        }
        if (this.f19247s != 0 || (!this.f19254z && !z)) {
            this.f19226B.mo5810b(null);
            return;
        }
        this.f19233e.setAlpha(1.0f);
        this.f19233e.setTransitioning(true);
        vt1 vt1Var2 = new vt1();
        float f = -this.f19233e.getHeight();
        if (z) {
            this.f19233e.getLocationInWindow(new int[]{0, 0});
            f -= iArr[1];
        }
        ut1 m7723m = xs1.m4729e(this.f19233e).m7723m(f);
        m7723m.m7725k(this.f19228D);
        vt1Var2.m6803c(m7723m);
        if (this.f19248t && (view = this.f19236h) != null) {
            vt1Var2.m6803c(xs1.m4729e(view).m7723m(f));
        }
        vt1Var2.m6800f(f19223E);
        vt1Var2.m6801e(250L);
        vt1Var2.m6799g(this.f19226B);
        this.f19253y = vt1Var2;
        vt1Var2.m6798h();
    }

    /* renamed from: E */
    public void m15718E(boolean z) {
        View view;
        View view2;
        int[] iArr;
        vt1 vt1Var = this.f19253y;
        if (vt1Var != null) {
            vt1Var.m6805a();
        }
        this.f19233e.setVisibility(0);
        if (this.f19247s == 0 && (this.f19254z || z)) {
            this.f19233e.setTranslationY(0.0f);
            float f = -this.f19233e.getHeight();
            if (z) {
                this.f19233e.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            this.f19233e.setTranslationY(f);
            vt1 vt1Var2 = new vt1();
            ut1 m7723m = xs1.m4729e(this.f19233e).m7723m(0.0f);
            m7723m.m7725k(this.f19228D);
            vt1Var2.m6803c(m7723m);
            if (this.f19248t && (view2 = this.f19236h) != null) {
                view2.setTranslationY(f);
                vt1Var2.m6803c(xs1.m4729e(this.f19236h).m7723m(0.0f));
            }
            vt1Var2.m6800f(f19224F);
            vt1Var2.m6801e(250L);
            vt1Var2.m6799g(this.f19227C);
            this.f19253y = vt1Var2;
            vt1Var2.m6798h();
        } else {
            this.f19233e.setAlpha(1.0f);
            this.f19233e.setTranslationY(0.0f);
            if (this.f19248t && (view = this.f19236h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f19227C.mo5810b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f19232d;
        if (actionBarOverlayLayout != null) {
            xs1.m4708o0(actionBarOverlayLayout);
        }
    }

    /* renamed from: F */
    public final InterfaceC1745iq m15717F(View view) {
        if (view instanceof InterfaceC1745iq) {
            return (InterfaceC1745iq) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: G */
    public int m15716G() {
        return this.f19233e.getHeight();
    }

    /* renamed from: H */
    public int m15715H() {
        return this.f19232d.getActionBarHideOffset();
    }

    /* renamed from: I */
    public int m15714I() {
        return this.f19234f.mo19513p();
    }

    /* renamed from: J */
    public final void m15713J() {
        if (this.f19251w) {
            this.f19251w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f19232d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m15704S(false);
        }
    }

    /* renamed from: K */
    public final void m15712K(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(o11.decor_content_parent);
        this.f19232d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f19234f = m15717F(view.findViewById(o11.action_bar));
        this.f19235g = (ActionBarContextView) view.findViewById(o11.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(o11.action_bar_container);
        this.f19233e = actionBarContainer;
        InterfaceC1745iq interfaceC1745iq = this.f19234f;
        if (interfaceC1745iq == null || this.f19235g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f19229a = interfaceC1745iq.getContext();
        boolean z = (this.f19234f.mo19507v() & 4) != 0;
        if (z) {
            this.f19240l = true;
        }
        C1893k0 m18112b = C1893k0.m18112b(this.f19229a);
        m15707P(m18112b.m18113a() || z);
        m15709N(m18112b.m18107g());
        TypedArray obtainStyledAttributes = this.f19229a.obtainStyledAttributes(null, x21.f31882a, x01.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(x21.f31932k, false)) {
            m15708O(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(x21.f31922i, 0);
        if (dimensionPixelSize != 0) {
            m15710M(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: L */
    public void m15711L(int i, int i2) {
        int mo19507v = this.f19234f.mo19507v();
        if ((i2 & 4) != 0) {
            this.f19240l = true;
        }
        this.f19234f.mo19517l((i & i2) | ((i2 ^ (-1)) & mo19507v));
    }

    /* renamed from: M */
    public void m15710M(float f) {
        xs1.m4686z0(this.f19233e, f);
    }

    /* renamed from: N */
    public final void m15709N(boolean z) {
        this.f19246r = z;
        if (z) {
            this.f19233e.setTabContainer(null);
            this.f19234f.mo19520i(this.f19237i);
        } else {
            this.f19234f.mo19520i(null);
            this.f19233e.setTabContainer(this.f19237i);
        }
        boolean z2 = true;
        boolean z3 = m15714I() == 2;
        C0166c c0166c = this.f19237i;
        if (c0166c != null) {
            if (z3) {
                c0166c.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f19232d;
                if (actionBarOverlayLayout != null) {
                    xs1.m4708o0(actionBarOverlayLayout);
                }
            } else {
                c0166c.setVisibility(8);
            }
        }
        this.f19234f.mo19504y(!this.f19246r && z3);
        this.f19232d.setHasNonEmbeddedTabs((this.f19246r || !z3) ? false : false);
    }

    /* renamed from: O */
    public void m15708O(boolean z) {
        if (z && !this.f19232d.m30145w()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f19225A = z;
        this.f19232d.setHideOnContentScrollEnabled(z);
    }

    /* renamed from: P */
    public void m15707P(boolean z) {
        this.f19234f.mo19508u(z);
    }

    /* renamed from: Q */
    public final boolean m15706Q() {
        return xs1.m4742V(this.f19233e);
    }

    /* renamed from: R */
    public final void m15705R() {
        if (this.f19251w) {
            return;
        }
        this.f19251w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f19232d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        m15704S(false);
    }

    /* renamed from: S */
    public final void m15704S(boolean z) {
        if (m15721B(this.f19249u, this.f19250v, this.f19251w)) {
            if (this.f19252x) {
                return;
            }
            this.f19252x = true;
            m15718E(z);
        } else if (this.f19252x) {
            this.f19252x = false;
            m15719D(z);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0104d
    /* renamed from: a */
    public void mo15703a() {
        if (this.f19250v) {
            this.f19250v = false;
            m15704S(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0104d
    /* renamed from: b */
    public void mo15702b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0104d
    /* renamed from: c */
    public void mo15701c(boolean z) {
        this.f19248t = z;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0104d
    /* renamed from: d */
    public void mo15700d() {
        if (this.f19250v) {
            return;
        }
        this.f19250v = true;
        m15704S(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0104d
    /* renamed from: e */
    public void mo15699e() {
        vt1 vt1Var = this.f19253y;
        if (vt1Var != null) {
            vt1Var.m6805a();
            this.f19253y = null;
        }
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: g */
    public boolean mo15698g() {
        InterfaceC1745iq interfaceC1745iq = this.f19234f;
        if (interfaceC1745iq == null || !interfaceC1745iq.mo19518k()) {
            return false;
        }
        this.f19234f.collapseActionView();
        return true;
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: h */
    public void mo15697h(boolean z) {
        if (z == this.f19244p) {
            return;
        }
        this.f19244p = z;
        int size = this.f19245q.size();
        for (int i = 0; i < size; i++) {
            this.f19245q.get(i).m20279a(z);
        }
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: i */
    public int mo15696i() {
        return this.f19234f.mo19507v();
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: j */
    public Context mo15695j() {
        if (this.f19230b == null) {
            TypedValue typedValue = new TypedValue();
            this.f19229a.getTheme().resolveAttribute(x01.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f19230b = new ContextThemeWrapper(this.f19229a, i);
            } else {
                this.f19230b = this.f19229a;
            }
        }
        return this.f19230b;
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: l */
    public boolean mo15694l() {
        int m15716G = m15716G();
        return this.f19252x && (m15716G == 0 || m15715H() < m15716G);
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: m */
    public void mo15693m(Configuration configuration) {
        m15709N(C1893k0.m18112b(this.f19229a).m18107g());
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: o */
    public boolean mo15692o(int i, KeyEvent keyEvent) {
        Menu mo15646e;
        C2222d c2222d = this.f19241m;
        if (c2222d == null || (mo15646e = c2222d.mo15646e()) == null) {
            return false;
        }
        mo15646e.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return mo15646e.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0104d
    public void onWindowVisibilityChanged(int i) {
        this.f19247s = i;
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: r */
    public void mo15691r(boolean z) {
        if (this.f19240l) {
            return;
        }
        mo15690s(z);
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: s */
    public void mo15690s(boolean z) {
        m15711L(z ? 4 : 0, 4);
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: t */
    public void mo15689t(boolean z) {
        m15711L(z ? 2 : 0, 2);
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: u */
    public void mo15688u(boolean z) {
        m15711L(z ? 8 : 0, 8);
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: v */
    public void mo15687v(boolean z) {
        vt1 vt1Var;
        this.f19254z = z;
        if (z || (vt1Var = this.f19253y) == null) {
            return;
        }
        vt1Var.m6805a();
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: w */
    public void mo15686w(CharSequence charSequence) {
        this.f19234f.mo19516m(charSequence);
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: x */
    public void mo15685x(CharSequence charSequence) {
        this.f19234f.setTitle(charSequence);
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: y */
    public void mo15684y(CharSequence charSequence) {
        this.f19234f.setWindowTitle(charSequence);
    }

    @Override // com.daaw.AbstractC1643i0
    /* renamed from: z */
    public AbstractC2228n0 mo15683z(AbstractC2228n0.InterfaceC2229a interfaceC2229a) {
        C2222d c2222d = this.f19241m;
        if (c2222d != null) {
            c2222d.mo15648c();
        }
        this.f19232d.setHideOnContentScrollEnabled(false);
        this.f19235g.m30156k();
        C2222d c2222d2 = new C2222d(this.f19235g.getContext(), interfaceC2229a);
        if (c2222d2.m15682t()) {
            this.f19241m = c2222d2;
            c2222d2.mo15640k();
            this.f19235g.m30159h(c2222d2);
            m15722A(true);
            return c2222d2;
        }
        return null;
    }
}
