package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0091i;
import com.daaw.c21;
import com.daaw.g11;
import com.daaw.kp0;
import com.daaw.lp0;
import com.daaw.xs1;
/* renamed from: androidx.appcompat.view.menu.k */
/* loaded from: classes.dex */
public final class View$OnKeyListenerC0095k extends kp0 implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: K */
    public static final int f440K = c21.abc_popup_menu_item_layout;

    /* renamed from: A */
    public PopupWindow.OnDismissListener f441A;

    /* renamed from: B */
    public View f442B;

    /* renamed from: C */
    public View f443C;

    /* renamed from: D */
    public InterfaceC0091i.InterfaceC0092a f444D;

    /* renamed from: E */
    public ViewTreeObserver f445E;

    /* renamed from: F */
    public boolean f446F;

    /* renamed from: G */
    public boolean f447G;

    /* renamed from: H */
    public int f448H;

    /* renamed from: J */
    public boolean f450J;

    /* renamed from: q */
    public final Context f451q;

    /* renamed from: r */
    public final C0082e f452r;

    /* renamed from: s */
    public final C0081d f453s;

    /* renamed from: t */
    public final boolean f454t;

    /* renamed from: u */
    public final int f455u;

    /* renamed from: v */
    public final int f456v;

    /* renamed from: w */
    public final int f457w;

    /* renamed from: x */
    public final lp0 f458x;

    /* renamed from: y */
    public final ViewTreeObserver.OnGlobalLayoutListener f459y = new ViewTreeObserver$OnGlobalLayoutListenerC0096a();

    /* renamed from: z */
    public final View.OnAttachStateChangeListener f460z = new View$OnAttachStateChangeListenerC0097b();

    /* renamed from: I */
    public int f449I = 0;

    /* renamed from: androidx.appcompat.view.menu.k$a */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC0096a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC0096a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!View$OnKeyListenerC0095k.this.mo7286a() || View$OnKeyListenerC0095k.this.f458x.m25293B()) {
                return;
            }
            View view = View$OnKeyListenerC0095k.this.f443C;
            if (view == null || !view.isShown()) {
                View$OnKeyListenerC0095k.this.dismiss();
            } else {
                View$OnKeyListenerC0095k.this.f458x.mo7285h();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.k$b */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC0097b implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC0097b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = View$OnKeyListenerC0095k.this.f445E;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    View$OnKeyListenerC0095k.this.f445E = view.getViewTreeObserver();
                }
                View$OnKeyListenerC0095k view$OnKeyListenerC0095k = View$OnKeyListenerC0095k.this;
                view$OnKeyListenerC0095k.f445E.removeGlobalOnLayoutListener(view$OnKeyListenerC0095k.f459y);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public View$OnKeyListenerC0095k(Context context, C0082e c0082e, View view, int i, int i2, boolean z) {
        this.f451q = context;
        this.f452r = c0082e;
        this.f454t = z;
        this.f453s = new C0081d(c0082e, LayoutInflater.from(context), z, f440K);
        this.f456v = i;
        this.f457w = i2;
        Resources resources = context.getResources();
        this.f455u = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(g11.abc_config_prefDialogWidth));
        this.f442B = view;
        this.f458x = new lp0(context, null, i, i2);
        c0082e.m30243c(this, context);
    }

    /* renamed from: B */
    public final boolean m30175B() {
        View view;
        if (mo7286a()) {
            return true;
        }
        if (this.f446F || (view = this.f442B) == null) {
            return false;
        }
        this.f443C = view;
        this.f458x.m25284K(this);
        this.f458x.m25283L(this);
        this.f458x.m25285J(true);
        View view2 = this.f443C;
        boolean z = this.f445E == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f445E = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f459y);
        }
        view2.addOnAttachStateChangeListener(this.f460z);
        this.f458x.m25291D(view2);
        this.f458x.m25288G(this.f449I);
        if (!this.f447G) {
            this.f448H = kp0.m17558q(this.f453s, null, this.f451q, this.f455u);
            this.f447G = true;
        }
        this.f458x.m25289F(this.f448H);
        this.f458x.m25286I(2);
        this.f458x.m25287H(m17559p());
        this.f458x.mo7285h();
        ListView mo7284k = this.f458x.mo7284k();
        mo7284k.setOnKeyListener(this);
        if (this.f450J && this.f452r.m30218z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f451q).inflate(c21.abc_popup_menu_header_item_layout, (ViewGroup) mo7284k, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f452r.m30218z());
            }
            frameLayout.setEnabled(false);
            mo7284k.addHeaderView(frameLayout, null, false);
        }
        this.f458x.mo25271p(this.f453s);
        this.f458x.mo7285h();
        return true;
    }

    @Override // com.daaw.vc1
    /* renamed from: a */
    public boolean mo7286a() {
        return !this.f446F && this.f458x.mo7286a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: b */
    public void mo25025b(C0082e c0082e, boolean z) {
        if (c0082e != this.f452r) {
            return;
        }
        dismiss();
        InterfaceC0091i.InterfaceC0092a interfaceC0092a = this.f444D;
        if (interfaceC0092a != null) {
            interfaceC0092a.mo24218b(c0082e, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: c */
    public void mo25024c(boolean z) {
        this.f447G = false;
        C0081d c0081d = this.f453s;
        if (c0081d != null) {
            c0081d.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: d */
    public boolean mo25023d() {
        return false;
    }

    @Override // com.daaw.vc1
    public void dismiss() {
        if (mo7286a()) {
            this.f458x.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: g */
    public void mo30174g(InterfaceC0091i.InterfaceC0092a interfaceC0092a) {
        this.f444D = interfaceC0092a;
    }

    @Override // com.daaw.vc1
    /* renamed from: h */
    public void mo7285h() {
        if (!m30175B()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: j */
    public void mo25021j(Parcelable parcelable) {
    }

    @Override // com.daaw.vc1
    /* renamed from: k */
    public ListView mo7284k() {
        return this.f458x.mo7284k();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: l */
    public boolean mo25019l(SubMenuC0098l subMenuC0098l) {
        if (subMenuC0098l.hasVisibleItems()) {
            C0088h c0088h = new C0088h(this.f451q, subMenuC0098l, this.f443C, this.f454t, this.f456v, this.f457w);
            c0088h.m30181j(this.f444D);
            c0088h.m30184g(kp0.m17549z(subMenuC0098l));
            c0088h.m30182i(this.f441A);
            this.f441A = null;
            this.f452r.m30239e(false);
            int m25276c = this.f458x.m25276c();
            int m25272o = this.f458x.m25272o();
            if ((Gravity.getAbsoluteGravity(this.f449I, xs1.m4768E(this.f442B)) & 7) == 5) {
                m25276c += this.f442B.getWidth();
            }
            if (c0088h.m30177n(m25276c, m25272o)) {
                InterfaceC0091i.InterfaceC0092a interfaceC0092a = this.f444D;
                if (interfaceC0092a != null) {
                    interfaceC0092a.mo24217c(subMenuC0098l);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: m */
    public Parcelable mo25018m() {
        return null;
    }

    @Override // com.daaw.kp0
    /* renamed from: n */
    public void mo17561n(C0082e c0082e) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f446F = true;
        this.f452r.close();
        ViewTreeObserver viewTreeObserver = this.f445E;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f445E = this.f443C.getViewTreeObserver();
            }
            this.f445E.removeGlobalOnLayoutListener(this.f459y);
            this.f445E = null;
        }
        this.f443C.removeOnAttachStateChangeListener(this.f460z);
        PopupWindow.OnDismissListener onDismissListener = this.f441A;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // com.daaw.kp0
    /* renamed from: r */
    public void mo17557r(View view) {
        this.f442B = view;
    }

    @Override // com.daaw.kp0
    /* renamed from: t */
    public void mo17555t(boolean z) {
        this.f453s.m30268d(z);
    }

    @Override // com.daaw.kp0
    /* renamed from: u */
    public void mo17554u(int i) {
        this.f449I = i;
    }

    @Override // com.daaw.kp0
    /* renamed from: v */
    public void mo17553v(int i) {
        this.f458x.m25275e(i);
    }

    @Override // com.daaw.kp0
    /* renamed from: w */
    public void mo17552w(PopupWindow.OnDismissListener onDismissListener) {
        this.f441A = onDismissListener;
    }

    @Override // com.daaw.kp0
    /* renamed from: x */
    public void mo17551x(boolean z) {
        this.f450J = z;
    }

    @Override // com.daaw.kp0
    /* renamed from: y */
    public void mo17550y(int i) {
        this.f458x.m25273l(i);
    }
}
