package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.Toolbar;
import com.daaw.i21;
import com.daaw.iq;
import com.daaw.l11;
import com.daaw.m0;
import com.daaw.o11;
import com.daaw.r4;
import com.daaw.ul1;
import com.daaw.ut1;
import com.daaw.x01;
import com.daaw.x21;
import com.daaw.xs1;
import com.daaw.xt1;
/* loaded from: classes.dex */
public class d implements iq {
    public Toolbar a;
    public int b;
    public View c;
    public View d;
    public Drawable e;
    public Drawable f;
    public Drawable g;
    public boolean h;
    public CharSequence i;
    public CharSequence j;
    public CharSequence k;
    public Window.Callback l;
    public boolean m;
    public ActionMenuPresenter n;
    public int o;
    public int p;
    public Drawable q;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public final m0 p;

        public a() {
            this.p = new m0(d.this.a.getContext(), 0, 16908332, 0, 0, d.this.i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = d.this;
            Window.Callback callback = dVar.l;
            if (callback == null || !dVar.m) {
                return;
            }
            callback.onMenuItemSelected(0, this.p);
        }
    }

    /* loaded from: classes.dex */
    public class b extends xt1 {
        public boolean a = false;
        public final /* synthetic */ int b;

        public b(int i) {
            this.b = i;
        }

        @Override // com.daaw.xt1, com.daaw.wt1
        public void a(View view) {
            this.a = true;
        }

        @Override // com.daaw.wt1
        public void b(View view) {
            if (this.a) {
                return;
            }
            d.this.a.setVisibility(this.b);
        }

        @Override // com.daaw.xt1, com.daaw.wt1
        public void c(View view) {
            d.this.a.setVisibility(0);
        }
    }

    public d(Toolbar toolbar, boolean z) {
        this(toolbar, z, i21.abc_action_bar_up_description, l11.abc_ic_ab_back_material);
    }

    public d(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.o = 0;
        this.p = 0;
        this.a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.h = this.i != null;
        this.g = toolbar.getNavigationIcon();
        ul1 v = ul1.v(toolbar.getContext(), null, x21.a, x01.actionBarStyle, 0);
        this.q = v.g(x21.l);
        if (z) {
            CharSequence p = v.p(x21.r);
            if (!TextUtils.isEmpty(p)) {
                setTitle(p);
            }
            CharSequence p2 = v.p(x21.p);
            if (!TextUtils.isEmpty(p2)) {
                m(p2);
            }
            Drawable g = v.g(x21.n);
            if (g != null) {
                C(g);
            }
            Drawable g2 = v.g(x21.m);
            if (g2 != null) {
                setIcon(g2);
            }
            if (this.g == null && (drawable = this.q) != null) {
                F(drawable);
            }
            l(v.k(x21.h, 0));
            int n = v.n(x21.g, 0);
            if (n != 0) {
                A(LayoutInflater.from(this.a.getContext()).inflate(n, (ViewGroup) this.a, false));
                l(this.b | 16);
            }
            int m = v.m(x21.j, 0);
            if (m > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = m;
                this.a.setLayoutParams(layoutParams);
            }
            int e = v.e(x21.f, -1);
            int e2 = v.e(x21.e, -1);
            if (e >= 0 || e2 >= 0) {
                this.a.J(Math.max(e, 0), Math.max(e2, 0));
            }
            int n2 = v.n(x21.s, 0);
            if (n2 != 0) {
                Toolbar toolbar2 = this.a;
                toolbar2.N(toolbar2.getContext(), n2);
            }
            int n3 = v.n(x21.q, 0);
            if (n3 != 0) {
                Toolbar toolbar3 = this.a;
                toolbar3.M(toolbar3.getContext(), n3);
            }
            int n4 = v.n(x21.o, 0);
            if (n4 != 0) {
                this.a.setPopupTheme(n4);
            }
        } else {
            this.b = z();
        }
        v.w();
        B(i);
        this.k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new a());
    }

    public void A(View view) {
        View view2 = this.d;
        if (view2 != null && (this.b & 16) != 0) {
            this.a.removeView(view2);
        }
        this.d = view;
        if (view == null || (this.b & 16) == 0) {
            return;
        }
        this.a.addView(view);
    }

    public void B(int i) {
        if (i == this.p) {
            return;
        }
        this.p = i;
        if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
            D(this.p);
        }
    }

    public void C(Drawable drawable) {
        this.f = drawable;
        J();
    }

    public void D(int i) {
        E(i == 0 ? null : getContext().getString(i));
    }

    public void E(CharSequence charSequence) {
        this.k = charSequence;
        H();
    }

    public void F(Drawable drawable) {
        this.g = drawable;
        I();
    }

    public final void G(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setTitle(charSequence);
            if (this.h) {
                xs1.u0(this.a.getRootView(), charSequence);
            }
        }
    }

    public final void H() {
        if ((this.b & 4) != 0) {
            if (TextUtils.isEmpty(this.k)) {
                this.a.setNavigationContentDescription(this.p);
            } else {
                this.a.setNavigationContentDescription(this.k);
            }
        }
    }

    public final void I() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.b & 4) != 0) {
            toolbar = this.a;
            drawable = this.g;
            if (drawable == null) {
                drawable = this.q;
            }
        } else {
            toolbar = this.a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void J() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f) == null) {
            drawable = this.e;
        }
        this.a.setLogo(drawable);
    }

    @Override // com.daaw.iq
    public void a(Menu menu, i.a aVar) {
        if (this.n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.a.getContext());
            this.n = actionMenuPresenter;
            actionMenuPresenter.r(o11.action_menu_presenter);
        }
        this.n.g(aVar);
        this.a.K((e) menu, this.n);
    }

    @Override // com.daaw.iq
    public boolean b() {
        return this.a.B();
    }

    @Override // com.daaw.iq
    public void c() {
        this.m = true;
    }

    @Override // com.daaw.iq
    public void collapseActionView() {
        this.a.e();
    }

    @Override // com.daaw.iq
    public boolean d() {
        return this.a.d();
    }

    @Override // com.daaw.iq
    public boolean e() {
        return this.a.A();
    }

    @Override // com.daaw.iq
    public boolean f() {
        return this.a.w();
    }

    @Override // com.daaw.iq
    public boolean g() {
        return this.a.Q();
    }

    @Override // com.daaw.iq
    public Context getContext() {
        return this.a.getContext();
    }

    @Override // com.daaw.iq
    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // com.daaw.iq
    public void h() {
        this.a.f();
    }

    @Override // com.daaw.iq
    public void i(c cVar) {
        View view = this.c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.a;
            if (parent == toolbar) {
                toolbar.removeView(this.c);
            }
        }
        this.c = cVar;
        if (cVar == null || this.o != 2) {
            return;
        }
        this.a.addView(cVar, 0);
        Toolbar.e eVar = (Toolbar.e) this.c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.a = 8388691;
        cVar.setAllowCollapse(true);
    }

    @Override // com.daaw.iq
    public int j() {
        return this.a.getVisibility();
    }

    @Override // com.daaw.iq
    public boolean k() {
        return this.a.v();
    }

    @Override // com.daaw.iq
    public void l(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    H();
                }
                I();
            }
            if ((i2 & 3) != 0) {
                J();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.a.setTitle(this.i);
                    toolbar = this.a;
                    charSequence = this.j;
                } else {
                    charSequence = null;
                    this.a.setTitle((CharSequence) null);
                    toolbar = this.a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) == 0 || (view = this.d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.a.addView(view);
            } else {
                this.a.removeView(view);
            }
        }
    }

    @Override // com.daaw.iq
    public void m(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setSubtitle(charSequence);
        }
    }

    @Override // com.daaw.iq
    public Menu n() {
        return this.a.getMenu();
    }

    @Override // com.daaw.iq
    public void o(int i) {
        C(i != 0 ? r4.b(getContext(), i) : null);
    }

    @Override // com.daaw.iq
    public int p() {
        return this.o;
    }

    @Override // com.daaw.iq
    public ut1 q(int i, long j) {
        return xs1.e(this.a).b(i == 0 ? 1.0f : 0.0f).f(j).h(new b(i));
    }

    @Override // com.daaw.iq
    public void r(i.a aVar, e.a aVar2) {
        this.a.L(aVar, aVar2);
    }

    @Override // com.daaw.iq
    public void s(int i) {
        this.a.setVisibility(i);
    }

    @Override // com.daaw.iq
    public void setIcon(int i) {
        setIcon(i != 0 ? r4.b(getContext(), i) : null);
    }

    @Override // com.daaw.iq
    public void setIcon(Drawable drawable) {
        this.e = drawable;
        J();
    }

    @Override // com.daaw.iq
    public void setTitle(CharSequence charSequence) {
        this.h = true;
        G(charSequence);
    }

    @Override // com.daaw.iq
    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    @Override // com.daaw.iq
    public void setWindowTitle(CharSequence charSequence) {
        if (this.h) {
            return;
        }
        G(charSequence);
    }

    @Override // com.daaw.iq
    public ViewGroup t() {
        return this.a;
    }

    @Override // com.daaw.iq
    public void u(boolean z) {
    }

    @Override // com.daaw.iq
    public int v() {
        return this.b;
    }

    @Override // com.daaw.iq
    public void w() {
    }

    @Override // com.daaw.iq
    public void x() {
    }

    @Override // com.daaw.iq
    public void y(boolean z) {
        this.a.setCollapsible(z);
    }

    public final int z() {
        if (this.a.getNavigationIcon() != null) {
            this.q = this.a.getNavigationIcon();
            return 15;
        }
        return 11;
    }
}
