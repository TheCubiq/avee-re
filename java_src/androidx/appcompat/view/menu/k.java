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
import androidx.appcompat.view.menu.i;
import com.daaw.c21;
import com.daaw.g11;
import com.daaw.kp0;
import com.daaw.lp0;
import com.daaw.xs1;
/* loaded from: classes.dex */
public final class k extends kp0 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public static final int K = c21.abc_popup_menu_item_layout;
    public PopupWindow.OnDismissListener A;
    public View B;
    public View C;
    public i.a D;
    public ViewTreeObserver E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean J;
    public final Context q;
    public final e r;
    public final d s;
    public final boolean t;
    public final int u;
    public final int v;
    public final int w;
    public final lp0 x;
    public final ViewTreeObserver.OnGlobalLayoutListener y = new a();
    public final View.OnAttachStateChangeListener z = new b();
    public int I = 0;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!k.this.a() || k.this.x.B()) {
                return;
            }
            View view = k.this.C;
            if (view == null || !view.isShown()) {
                k.this.dismiss();
            } else {
                k.this.x.h();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = k.this.E;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    k.this.E = view.getViewTreeObserver();
                }
                k kVar = k.this;
                kVar.E.removeGlobalOnLayoutListener(kVar.y);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public k(Context context, e eVar, View view, int i, int i2, boolean z) {
        this.q = context;
        this.r = eVar;
        this.t = z;
        this.s = new d(eVar, LayoutInflater.from(context), z, K);
        this.v = i;
        this.w = i2;
        Resources resources = context.getResources();
        this.u = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(g11.abc_config_prefDialogWidth));
        this.B = view;
        this.x = new lp0(context, null, i, i2);
        eVar.c(this, context);
    }

    public final boolean B() {
        View view;
        if (a()) {
            return true;
        }
        if (this.F || (view = this.B) == null) {
            return false;
        }
        this.C = view;
        this.x.K(this);
        this.x.L(this);
        this.x.J(true);
        View view2 = this.C;
        boolean z = this.E == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.E = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.y);
        }
        view2.addOnAttachStateChangeListener(this.z);
        this.x.D(view2);
        this.x.G(this.I);
        if (!this.G) {
            this.H = kp0.q(this.s, null, this.q, this.u);
            this.G = true;
        }
        this.x.F(this.H);
        this.x.I(2);
        this.x.H(p());
        this.x.h();
        ListView k = this.x.k();
        k.setOnKeyListener(this);
        if (this.J && this.r.z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.q).inflate(c21.abc_popup_menu_header_item_layout, (ViewGroup) k, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.r.z());
            }
            frameLayout.setEnabled(false);
            k.addHeaderView(frameLayout, null, false);
        }
        this.x.p(this.s);
        this.x.h();
        return true;
    }

    @Override // com.daaw.vc1
    public boolean a() {
        return !this.F && this.x.a();
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z) {
        if (eVar != this.r) {
            return;
        }
        dismiss();
        i.a aVar = this.D;
        if (aVar != null) {
            aVar.b(eVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void c(boolean z) {
        this.G = false;
        d dVar = this.s;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean d() {
        return false;
    }

    @Override // com.daaw.vc1
    public void dismiss() {
        if (a()) {
            this.x.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void g(i.a aVar) {
        this.D = aVar;
    }

    @Override // com.daaw.vc1
    public void h() {
        if (!B()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void j(Parcelable parcelable) {
    }

    @Override // com.daaw.vc1
    public ListView k() {
        return this.x.k();
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean l(l lVar) {
        if (lVar.hasVisibleItems()) {
            h hVar = new h(this.q, lVar, this.C, this.t, this.v, this.w);
            hVar.j(this.D);
            hVar.g(kp0.z(lVar));
            hVar.i(this.A);
            this.A = null;
            this.r.e(false);
            int c = this.x.c();
            int o = this.x.o();
            if ((Gravity.getAbsoluteGravity(this.I, xs1.E(this.B)) & 7) == 5) {
                c += this.B.getWidth();
            }
            if (hVar.n(c, o)) {
                i.a aVar = this.D;
                if (aVar != null) {
                    aVar.c(lVar);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable m() {
        return null;
    }

    @Override // com.daaw.kp0
    public void n(e eVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.F = true;
        this.r.close();
        ViewTreeObserver viewTreeObserver = this.E;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.E = this.C.getViewTreeObserver();
            }
            this.E.removeGlobalOnLayoutListener(this.y);
            this.E = null;
        }
        this.C.removeOnAttachStateChangeListener(this.z);
        PopupWindow.OnDismissListener onDismissListener = this.A;
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
    public void r(View view) {
        this.B = view;
    }

    @Override // com.daaw.kp0
    public void t(boolean z) {
        this.s.d(z);
    }

    @Override // com.daaw.kp0
    public void u(int i) {
        this.I = i;
    }

    @Override // com.daaw.kp0
    public void v(int i) {
        this.x.e(i);
    }

    @Override // com.daaw.kp0
    public void w(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // com.daaw.kp0
    public void x(boolean z) {
        this.J = z;
    }

    @Override // com.daaw.kp0
    public void y(int i) {
        this.x.l(i);
    }
}
