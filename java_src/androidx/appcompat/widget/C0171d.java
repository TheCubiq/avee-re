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
import androidx.appcompat.view.menu.C0082e;
import androidx.appcompat.view.menu.InterfaceC0091i;
import androidx.appcompat.widget.Toolbar;
import com.daaw.C2140m0;
import com.daaw.C2818r4;
import com.daaw.InterfaceC1745iq;
import com.daaw.i21;
import com.daaw.l11;
import com.daaw.o11;
import com.daaw.ul1;
import com.daaw.ut1;
import com.daaw.x01;
import com.daaw.x21;
import com.daaw.xs1;
import com.daaw.xt1;
/* renamed from: androidx.appcompat.widget.d */
/* loaded from: classes.dex */
public class C0171d implements InterfaceC1745iq {

    /* renamed from: a */
    public Toolbar f839a;

    /* renamed from: b */
    public int f840b;

    /* renamed from: c */
    public View f841c;

    /* renamed from: d */
    public View f842d;

    /* renamed from: e */
    public Drawable f843e;

    /* renamed from: f */
    public Drawable f844f;

    /* renamed from: g */
    public Drawable f845g;

    /* renamed from: h */
    public boolean f846h;

    /* renamed from: i */
    public CharSequence f847i;

    /* renamed from: j */
    public CharSequence f848j;

    /* renamed from: k */
    public CharSequence f849k;

    /* renamed from: l */
    public Window.Callback f850l;

    /* renamed from: m */
    public boolean f851m;

    /* renamed from: n */
    public ActionMenuPresenter f852n;

    /* renamed from: o */
    public int f853o;

    /* renamed from: p */
    public int f854p;

    /* renamed from: q */
    public Drawable f855q;

    /* renamed from: androidx.appcompat.widget.d$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0172a implements View.OnClickListener {

        /* renamed from: p */
        public final C2140m0 f856p;

        public View$OnClickListenerC0172a() {
            this.f856p = new C2140m0(C0171d.this.f839a.getContext(), 0, 16908332, 0, 0, C0171d.this.f847i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0171d c0171d = C0171d.this;
            Window.Callback callback = c0171d.f850l;
            if (callback == null || !c0171d.f851m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f856p);
        }
    }

    /* renamed from: androidx.appcompat.widget.d$b */
    /* loaded from: classes.dex */
    public class C0173b extends xt1 {

        /* renamed from: a */
        public boolean f858a = false;

        /* renamed from: b */
        public final /* synthetic */ int f859b;

        public C0173b(int i) {
            this.f859b = i;
        }

        @Override // com.daaw.xt1, com.daaw.wt1
        /* renamed from: a */
        public void mo4527a(View view) {
            this.f858a = true;
        }

        @Override // com.daaw.wt1
        /* renamed from: b */
        public void mo5810b(View view) {
            if (this.f858a) {
                return;
            }
            C0171d.this.f839a.setVisibility(this.f859b);
        }

        @Override // com.daaw.xt1, com.daaw.wt1
        /* renamed from: c */
        public void mo4526c(View view) {
            C0171d.this.f839a.setVisibility(0);
        }
    }

    public C0171d(Toolbar toolbar, boolean z) {
        this(toolbar, z, i21.abc_action_bar_up_description, l11.abc_ic_ab_back_material);
    }

    public C0171d(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f853o = 0;
        this.f854p = 0;
        this.f839a = toolbar;
        this.f847i = toolbar.getTitle();
        this.f848j = toolbar.getSubtitle();
        this.f846h = this.f847i != null;
        this.f845g = toolbar.getNavigationIcon();
        ul1 m8037v = ul1.m8037v(toolbar.getContext(), null, x21.f31882a, x01.actionBarStyle, 0);
        this.f855q = m8037v.m8052g(x21.f31937l);
        if (z) {
            CharSequence m8043p = m8037v.m8043p(x21.f31967r);
            if (!TextUtils.isEmpty(m8043p)) {
                setTitle(m8043p);
            }
            CharSequence m8043p2 = m8037v.m8043p(x21.f31957p);
            if (!TextUtils.isEmpty(m8043p2)) {
                mo19516m(m8043p2);
            }
            Drawable m8052g = m8037v.m8052g(x21.f31947n);
            if (m8052g != null) {
                m29907C(m8052g);
            }
            Drawable m8052g2 = m8037v.m8052g(x21.f31942m);
            if (m8052g2 != null) {
                setIcon(m8052g2);
            }
            if (this.f845g == null && (drawable = this.f855q) != null) {
                m29904F(drawable);
            }
            mo19517l(m8037v.m8048k(x21.f31917h, 0));
            int m8045n = m8037v.m8045n(x21.f31912g, 0);
            if (m8045n != 0) {
                m29909A(LayoutInflater.from(this.f839a.getContext()).inflate(m8045n, (ViewGroup) this.f839a, false));
                mo19517l(this.f840b | 16);
            }
            int m8046m = m8037v.m8046m(x21.f31927j, 0);
            if (m8046m > 0) {
                ViewGroup.LayoutParams layoutParams = this.f839a.getLayoutParams();
                layoutParams.height = m8046m;
                this.f839a.setLayoutParams(layoutParams);
            }
            int m8054e = m8037v.m8054e(x21.f31907f, -1);
            int m8054e2 = m8037v.m8054e(x21.f31902e, -1);
            if (m8054e >= 0 || m8054e2 >= 0) {
                this.f839a.m29979J(Math.max(m8054e, 0), Math.max(m8054e2, 0));
            }
            int m8045n2 = m8037v.m8045n(x21.f31972s, 0);
            if (m8045n2 != 0) {
                Toolbar toolbar2 = this.f839a;
                toolbar2.m29975N(toolbar2.getContext(), m8045n2);
            }
            int m8045n3 = m8037v.m8045n(x21.f31962q, 0);
            if (m8045n3 != 0) {
                Toolbar toolbar3 = this.f839a;
                toolbar3.m29976M(toolbar3.getContext(), m8045n3);
            }
            int m8045n4 = m8037v.m8045n(x21.f31952o, 0);
            if (m8045n4 != 0) {
                this.f839a.setPopupTheme(m8045n4);
            }
        } else {
            this.f840b = m29899z();
        }
        m8037v.m8036w();
        m29908B(i);
        this.f849k = this.f839a.getNavigationContentDescription();
        this.f839a.setNavigationOnClickListener(new View$OnClickListenerC0172a());
    }

    /* renamed from: A */
    public void m29909A(View view) {
        View view2 = this.f842d;
        if (view2 != null && (this.f840b & 16) != 0) {
            this.f839a.removeView(view2);
        }
        this.f842d = view;
        if (view == null || (this.f840b & 16) == 0) {
            return;
        }
        this.f839a.addView(view);
    }

    /* renamed from: B */
    public void m29908B(int i) {
        if (i == this.f854p) {
            return;
        }
        this.f854p = i;
        if (TextUtils.isEmpty(this.f839a.getNavigationContentDescription())) {
            m29906D(this.f854p);
        }
    }

    /* renamed from: C */
    public void m29907C(Drawable drawable) {
        this.f844f = drawable;
        m29900J();
    }

    /* renamed from: D */
    public void m29906D(int i) {
        m29905E(i == 0 ? null : getContext().getString(i));
    }

    /* renamed from: E */
    public void m29905E(CharSequence charSequence) {
        this.f849k = charSequence;
        m29902H();
    }

    /* renamed from: F */
    public void m29904F(Drawable drawable) {
        this.f845g = drawable;
        m29901I();
    }

    /* renamed from: G */
    public final void m29903G(CharSequence charSequence) {
        this.f847i = charSequence;
        if ((this.f840b & 8) != 0) {
            this.f839a.setTitle(charSequence);
            if (this.f846h) {
                xs1.m4696u0(this.f839a.getRootView(), charSequence);
            }
        }
    }

    /* renamed from: H */
    public final void m29902H() {
        if ((this.f840b & 4) != 0) {
            if (TextUtils.isEmpty(this.f849k)) {
                this.f839a.setNavigationContentDescription(this.f854p);
            } else {
                this.f839a.setNavigationContentDescription(this.f849k);
            }
        }
    }

    /* renamed from: I */
    public final void m29901I() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f840b & 4) != 0) {
            toolbar = this.f839a;
            drawable = this.f845g;
            if (drawable == null) {
                drawable = this.f855q;
            }
        } else {
            toolbar = this.f839a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: J */
    public final void m29900J() {
        Drawable drawable;
        int i = this.f840b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f844f) == null) {
            drawable = this.f843e;
        }
        this.f839a.setLogo(drawable);
    }

    @Override // com.daaw.InterfaceC1745iq
    /* renamed from: a */
    public void mo19528a(Menu menu, InterfaceC0091i.InterfaceC0092a interfaceC0092a) {
        if (this.f852n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f839a.getContext());
            this.f852n = actionMenuPresenter;
            actionMenuPresenter.m30286r(o11.action_menu_presenter);
        }
        this.f852n.mo30174g(interfaceC0092a);
        this.f839a.m29978K((C0082e) menu, this.f852n);
    }

    @Override // com.daaw.InterfaceC1745iq
    /* renamed from: b */
    public boolean mo19527b() {
        return this.f839a.m29987B();
    }

    @Override // com.daaw.InterfaceC1745iq
    /* renamed from: c */
    public void mo19526c() {
        this.f851m = true;
    }

    @Override // com.daaw.InterfaceC1745iq
    public void collapseActionView() {
        this.f839a.m29967e();
    }

    @Override // com.daaw.InterfaceC1745iq
    /* renamed from: d */
    public boolean mo19525d() {
        return this.f839a.m29968d();
    }

    @Override // com.daaw.InterfaceC1745iq
    /* renamed from: e */
    public boolean mo19524e() {
        return this.f839a.m29988A();
    }

    @Override // com.daaw.InterfaceC1745iq
    /* renamed from: f */
    public boolean mo19523f() {
        return this.f839a.m29949w();
    }

    @Override // com.daaw.InterfaceC1745iq
    /* renamed from: g */
    public boolean mo19522g() {
        return this.f839a.m29972Q();
    }

    @Override // com.daaw.InterfaceC1745iq
    public Context getContext() {
        return this.f839a.getContext();
    }

    @Override // com.daaw.InterfaceC1745iq
    public CharSequence getTitle() {
        return this.f839a.getTitle();
    }

    @Override // com.daaw.InterfaceC1745iq
    /* renamed from: h */
    public void mo19521h() {
        this.f839a.m29966f();
    }

    @Override // com.daaw.InterfaceC1745iq
    /* renamed from: i */
    public void mo19520i(C0166c c0166c) {
        View view = this.f841c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f839a;
            if (parent == toolbar) {
                toolbar.removeView(this.f841c);
            }
        }
        this.f841c = c0166c;
        if (c0166c == null || this.f853o != 2) {
            return;
        }
        this.f839a.addView(c0166c, 0);
        Toolbar.C0159e c0159e = (Toolbar.C0159e) this.f841c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0159e).width = -2;
        ((ViewGroup.MarginLayoutParams) c0159e).height = -2;
        c0159e.f13119a = 8388691;
        c0166c.setAllowCollapse(true);
    }

    @Override // com.daaw.InterfaceC1745iq
    /* renamed from: j */
    public int mo19519j() {
        return this.f839a.getVisibility();
    }

    @Override // com.daaw.InterfaceC1745iq
    /* renamed from: k */
    public boolean mo19518k() {
        return this.f839a.m29950v();
    }

    @Override // com.daaw.InterfaceC1745iq
    /* renamed from: l */
    public void mo19517l(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f840b ^ i;
        this.f840b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m29902H();
                }
                m29901I();
            }
            if ((i2 & 3) != 0) {
                m29900J();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f839a.setTitle(this.f847i);
                    toolbar = this.f839a;
                    charSequence = this.f848j;
                } else {
                    charSequence = null;
                    this.f839a.setTitle((CharSequence) null);
                    toolbar = this.f839a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) == 0 || (view = this.f842d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f839a.addView(view);
            } else {
                this.f839a.removeView(view);
            }
        }
    }

    @Override // com.daaw.InterfaceC1745iq
    /* renamed from: m */
    public void mo19516m(CharSequence charSequence) {
        this.f848j = charSequence;
        if ((this.f840b & 8) != 0) {
            this.f839a.setSubtitle(charSequence);
        }
    }

    @Override // com.daaw.InterfaceC1745iq
    /* renamed from: n */
    public Menu mo19515n() {
        return this.f839a.getMenu();
    }

    @Override // com.daaw.InterfaceC1745iq
    /* renamed from: o */
    public void mo19514o(int i) {
        m29907C(i != 0 ? C2818r4.m11783b(getContext(), i) : null);
    }

    @Override // com.daaw.InterfaceC1745iq
    /* renamed from: p */
    public int mo19513p() {
        return this.f853o;
    }

    @Override // com.daaw.InterfaceC1745iq
    /* renamed from: q */
    public ut1 mo19512q(int i, long j) {
        return xs1.m4729e(this.f839a).m7734b(i == 0 ? 1.0f : 0.0f).m7730f(j).m7728h(new C0173b(i));
    }

    @Override // com.daaw.InterfaceC1745iq
    /* renamed from: r */
    public void mo19511r(InterfaceC0091i.InterfaceC0092a interfaceC0092a, C0082e.InterfaceC0083a interfaceC0083a) {
        this.f839a.m29977L(interfaceC0092a, interfaceC0083a);
    }

    @Override // com.daaw.InterfaceC1745iq
    /* renamed from: s */
    public void mo19510s(int i) {
        this.f839a.setVisibility(i);
    }

    @Override // com.daaw.InterfaceC1745iq
    public void setIcon(int i) {
        setIcon(i != 0 ? C2818r4.m11783b(getContext(), i) : null);
    }

    @Override // com.daaw.InterfaceC1745iq
    public void setIcon(Drawable drawable) {
        this.f843e = drawable;
        m29900J();
    }

    @Override // com.daaw.InterfaceC1745iq
    public void setTitle(CharSequence charSequence) {
        this.f846h = true;
        m29903G(charSequence);
    }

    @Override // com.daaw.InterfaceC1745iq
    public void setWindowCallback(Window.Callback callback) {
        this.f850l = callback;
    }

    @Override // com.daaw.InterfaceC1745iq
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f846h) {
            return;
        }
        m29903G(charSequence);
    }

    @Override // com.daaw.InterfaceC1745iq
    /* renamed from: t */
    public ViewGroup mo19509t() {
        return this.f839a;
    }

    @Override // com.daaw.InterfaceC1745iq
    /* renamed from: u */
    public void mo19508u(boolean z) {
    }

    @Override // com.daaw.InterfaceC1745iq
    /* renamed from: v */
    public int mo19507v() {
        return this.f840b;
    }

    @Override // com.daaw.InterfaceC1745iq
    /* renamed from: w */
    public void mo19506w() {
    }

    @Override // com.daaw.InterfaceC1745iq
    /* renamed from: x */
    public void mo19505x() {
    }

    @Override // com.daaw.InterfaceC1745iq
    /* renamed from: y */
    public void mo19504y(boolean z) {
        this.f839a.setCollapsible(z);
    }

    /* renamed from: z */
    public final int m29899z() {
        if (this.f839a.getNavigationIcon() != null) {
            this.f855q = this.f839a.getNavigationIcon();
            return 15;
        }
        return 11;
    }
}
