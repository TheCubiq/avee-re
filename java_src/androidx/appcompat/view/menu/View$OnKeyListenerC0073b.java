package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0091i;
import com.daaw.c21;
import com.daaw.g11;
import com.daaw.g80;
import com.daaw.ip0;
import com.daaw.kp0;
import com.daaw.lp0;
import com.daaw.xs1;
import java.util.ArrayList;
import java.util.List;
/* renamed from: androidx.appcompat.view.menu.b */
/* loaded from: classes.dex */
public final class View$OnKeyListenerC0073b extends kp0 implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: Q */
    public static final int f309Q = c21.abc_cascading_menu_item_layout;

    /* renamed from: D */
    public View f313D;

    /* renamed from: E */
    public View f314E;

    /* renamed from: G */
    public boolean f316G;

    /* renamed from: H */
    public boolean f317H;

    /* renamed from: I */
    public int f318I;

    /* renamed from: J */
    public int f319J;

    /* renamed from: L */
    public boolean f321L;

    /* renamed from: M */
    public InterfaceC0091i.InterfaceC0092a f322M;

    /* renamed from: N */
    public ViewTreeObserver f323N;

    /* renamed from: O */
    public PopupWindow.OnDismissListener f324O;

    /* renamed from: P */
    public boolean f325P;

    /* renamed from: q */
    public final Context f326q;

    /* renamed from: r */
    public final int f327r;

    /* renamed from: s */
    public final int f328s;

    /* renamed from: t */
    public final int f329t;

    /* renamed from: u */
    public final boolean f330u;

    /* renamed from: v */
    public final Handler f331v;

    /* renamed from: w */
    public final List<C0082e> f332w = new ArrayList();

    /* renamed from: x */
    public final List<C0078d> f333x = new ArrayList();

    /* renamed from: y */
    public final ViewTreeObserver.OnGlobalLayoutListener f334y = new ViewTreeObserver$OnGlobalLayoutListenerC0074a();

    /* renamed from: z */
    public final View.OnAttachStateChangeListener f335z = new View$OnAttachStateChangeListenerC0075b();

    /* renamed from: A */
    public final ip0 f310A = new C0076c();

    /* renamed from: B */
    public int f311B = 0;

    /* renamed from: C */
    public int f312C = 0;

    /* renamed from: K */
    public boolean f320K = false;

    /* renamed from: F */
    public int f315F = m30281F();

    /* renamed from: androidx.appcompat.view.menu.b$a */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC0074a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC0074a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!View$OnKeyListenerC0073b.this.mo7286a() || View$OnKeyListenerC0073b.this.f333x.size() <= 0 || View$OnKeyListenerC0073b.this.f333x.get(0).f343a.m25293B()) {
                return;
            }
            View view = View$OnKeyListenerC0073b.this.f314E;
            if (view == null || !view.isShown()) {
                View$OnKeyListenerC0073b.this.dismiss();
                return;
            }
            for (C0078d c0078d : View$OnKeyListenerC0073b.this.f333x) {
                c0078d.f343a.mo7285h();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC0075b implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC0075b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = View$OnKeyListenerC0073b.this.f323N;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    View$OnKeyListenerC0073b.this.f323N = view.getViewTreeObserver();
                }
                View$OnKeyListenerC0073b view$OnKeyListenerC0073b = View$OnKeyListenerC0073b.this;
                view$OnKeyListenerC0073b.f323N.removeGlobalOnLayoutListener(view$OnKeyListenerC0073b.f334y);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$c */
    /* loaded from: classes.dex */
    public class C0076c implements ip0 {

        /* renamed from: androidx.appcompat.view.menu.b$c$a */
        /* loaded from: classes.dex */
        public class RunnableC0077a implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ C0078d f339p;

            /* renamed from: q */
            public final /* synthetic */ MenuItem f340q;

            /* renamed from: r */
            public final /* synthetic */ C0082e f341r;

            public RunnableC0077a(C0078d c0078d, MenuItem menuItem, C0082e c0082e) {
                this.f339p = c0078d;
                this.f340q = menuItem;
                this.f341r = c0082e;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0078d c0078d = this.f339p;
                if (c0078d != null) {
                    View$OnKeyListenerC0073b.this.f325P = true;
                    c0078d.f344b.m30239e(false);
                    View$OnKeyListenerC0073b.this.f325P = false;
                }
                if (this.f340q.isEnabled() && this.f340q.hasSubMenu()) {
                    this.f341r.m30259N(this.f340q, 4);
                }
            }
        }

        public C0076c() {
        }

        @Override // com.daaw.ip0
        /* renamed from: d */
        public void mo16692d(C0082e c0082e, MenuItem menuItem) {
            View$OnKeyListenerC0073b.this.f331v.removeCallbacksAndMessages(null);
            int size = View$OnKeyListenerC0073b.this.f333x.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (c0082e == View$OnKeyListenerC0073b.this.f333x.get(i).f344b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            View$OnKeyListenerC0073b.this.f331v.postAtTime(new RunnableC0077a(i2 < View$OnKeyListenerC0073b.this.f333x.size() ? View$OnKeyListenerC0073b.this.f333x.get(i2) : null, menuItem, c0082e), c0082e, SystemClock.uptimeMillis() + 200);
        }

        @Override // com.daaw.ip0
        /* renamed from: g */
        public void mo16691g(C0082e c0082e, MenuItem menuItem) {
            View$OnKeyListenerC0073b.this.f331v.removeCallbacksAndMessages(c0082e);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$d */
    /* loaded from: classes.dex */
    public static class C0078d {

        /* renamed from: a */
        public final lp0 f343a;

        /* renamed from: b */
        public final C0082e f344b;

        /* renamed from: c */
        public final int f345c;

        public C0078d(lp0 lp0Var, C0082e c0082e, int i) {
            this.f343a = lp0Var;
            this.f344b = c0082e;
            this.f345c = i;
        }

        /* renamed from: a */
        public ListView m30278a() {
            return this.f343a.mo7284k();
        }
    }

    public View$OnKeyListenerC0073b(Context context, View view, int i, int i2, boolean z) {
        this.f326q = context;
        this.f313D = view;
        this.f328s = i;
        this.f329t = i2;
        this.f330u = z;
        Resources resources = context.getResources();
        this.f327r = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(g11.abc_config_prefDialogWidth));
        this.f331v = new Handler();
    }

    /* renamed from: B */
    public final lp0 m30285B() {
        lp0 lp0Var = new lp0(this.f326q, null, this.f328s, this.f329t);
        lp0Var.m16694T(this.f310A);
        lp0Var.m25283L(this);
        lp0Var.m25284K(this);
        lp0Var.m25291D(this.f313D);
        lp0Var.m25288G(this.f312C);
        lp0Var.m25285J(true);
        lp0Var.m25286I(2);
        return lp0Var;
    }

    /* renamed from: C */
    public final int m30284C(C0082e c0082e) {
        int size = this.f333x.size();
        for (int i = 0; i < size; i++) {
            if (c0082e == this.f333x.get(i).f344b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: D */
    public final MenuItem m30283D(C0082e c0082e, C0082e c0082e2) {
        int size = c0082e.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0082e.getItem(i);
            if (item.hasSubMenu() && c0082e2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: E */
    public final View m30282E(C0078d c0078d, C0082e c0082e) {
        C0081d c0081d;
        int i;
        int firstVisiblePosition;
        MenuItem m30283D = m30283D(c0078d.f344b, c0082e);
        if (m30283D == null) {
            return null;
        }
        ListView m30278a = c0078d.m30278a();
        ListAdapter adapter = m30278a.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            c0081d = (C0081d) headerViewListAdapter.getWrappedAdapter();
        } else {
            c0081d = (C0081d) adapter;
            i = 0;
        }
        int count = c0081d.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (m30283D == c0081d.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - m30278a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < m30278a.getChildCount()) {
            return m30278a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: F */
    public final int m30281F() {
        return xs1.m4768E(this.f313D) == 1 ? 0 : 1;
    }

    /* renamed from: G */
    public final int m30280G(int i) {
        List<C0078d> list = this.f333x;
        ListView m30278a = list.get(list.size() - 1).m30278a();
        int[] iArr = new int[2];
        m30278a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f314E.getWindowVisibleDisplayFrame(rect);
        return this.f315F == 1 ? (iArr[0] + m30278a.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    /* renamed from: H */
    public final void m30279H(C0082e c0082e) {
        C0078d c0078d;
        View view;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f326q);
        C0081d c0081d = new C0081d(c0082e, from, this.f330u, f309Q);
        if (!mo7286a() && this.f320K) {
            c0081d.m30268d(true);
        } else if (mo7286a()) {
            c0081d.m30268d(kp0.m17549z(c0082e));
        }
        int m17558q = kp0.m17558q(c0081d, null, this.f326q, this.f327r);
        lp0 m30285B = m30285B();
        m30285B.mo25271p(c0081d);
        m30285B.m25289F(m17558q);
        m30285B.m25288G(this.f312C);
        if (this.f333x.size() > 0) {
            List<C0078d> list = this.f333x;
            c0078d = list.get(list.size() - 1);
            view = m30282E(c0078d, c0082e);
        } else {
            c0078d = null;
            view = null;
        }
        if (view != null) {
            m30285B.m16693U(false);
            m30285B.m16696R(null);
            int m30280G = m30280G(m17558q);
            boolean z = m30280G == 1;
            this.f315F = m30280G;
            if (Build.VERSION.SDK_INT >= 26) {
                m30285B.m25291D(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f313D.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f312C & 7) == 5) {
                    iArr[0] = iArr[0] + this.f313D.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f312C & 5) == 5) {
                if (!z) {
                    m17558q = view.getWidth();
                    i3 = i - m17558q;
                }
                i3 = i + m17558q;
            } else {
                if (z) {
                    m17558q = view.getWidth();
                    i3 = i + m17558q;
                }
                i3 = i - m17558q;
            }
            m30285B.m25275e(i3);
            m30285B.m25282M(true);
            m30285B.m25273l(i2);
        } else {
            if (this.f316G) {
                m30285B.m25275e(this.f318I);
            }
            if (this.f317H) {
                m30285B.m25273l(this.f319J);
            }
            m30285B.m25287H(m17559p());
        }
        this.f333x.add(new C0078d(m30285B, c0082e, this.f315F));
        m30285B.mo7285h();
        ListView mo7284k = m30285B.mo7284k();
        mo7284k.setOnKeyListener(this);
        if (c0078d == null && this.f321L && c0082e.m30218z() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(c21.abc_popup_menu_header_item_layout, (ViewGroup) mo7284k, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(c0082e.m30218z());
            mo7284k.addHeaderView(frameLayout, null, false);
            m30285B.mo7285h();
        }
    }

    @Override // com.daaw.vc1
    /* renamed from: a */
    public boolean mo7286a() {
        return this.f333x.size() > 0 && this.f333x.get(0).f343a.mo7286a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: b */
    public void mo25025b(C0082e c0082e, boolean z) {
        int m30284C = m30284C(c0082e);
        if (m30284C < 0) {
            return;
        }
        int i = m30284C + 1;
        if (i < this.f333x.size()) {
            this.f333x.get(i).f344b.m30239e(false);
        }
        C0078d remove = this.f333x.remove(m30284C);
        remove.f344b.m30256Q(this);
        if (this.f325P) {
            remove.f343a.m16695S(null);
            remove.f343a.m25290E(0);
        }
        remove.f343a.dismiss();
        int size = this.f333x.size();
        this.f315F = size > 0 ? this.f333x.get(size - 1).f345c : m30281F();
        if (size != 0) {
            if (z) {
                this.f333x.get(0).f344b.m30239e(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0091i.InterfaceC0092a interfaceC0092a = this.f322M;
        if (interfaceC0092a != null) {
            interfaceC0092a.mo24218b(c0082e, true);
        }
        ViewTreeObserver viewTreeObserver = this.f323N;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f323N.removeGlobalOnLayoutListener(this.f334y);
            }
            this.f323N = null;
        }
        this.f314E.removeOnAttachStateChangeListener(this.f335z);
        this.f324O.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: c */
    public void mo25024c(boolean z) {
        for (C0078d c0078d : this.f333x) {
            kp0.m17565A(c0078d.m30278a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: d */
    public boolean mo25023d() {
        return false;
    }

    @Override // com.daaw.vc1
    public void dismiss() {
        int size = this.f333x.size();
        if (size > 0) {
            C0078d[] c0078dArr = (C0078d[]) this.f333x.toArray(new C0078d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0078d c0078d = c0078dArr[i];
                if (c0078d.f343a.mo7286a()) {
                    c0078d.f343a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: g */
    public void mo30174g(InterfaceC0091i.InterfaceC0092a interfaceC0092a) {
        this.f322M = interfaceC0092a;
    }

    @Override // com.daaw.vc1
    /* renamed from: h */
    public void mo7285h() {
        if (mo7286a()) {
            return;
        }
        for (C0082e c0082e : this.f332w) {
            m30279H(c0082e);
        }
        this.f332w.clear();
        View view = this.f313D;
        this.f314E = view;
        if (view != null) {
            boolean z = this.f323N == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f323N = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f334y);
            }
            this.f314E.addOnAttachStateChangeListener(this.f335z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: j */
    public void mo25021j(Parcelable parcelable) {
    }

    @Override // com.daaw.vc1
    /* renamed from: k */
    public ListView mo7284k() {
        if (this.f333x.isEmpty()) {
            return null;
        }
        List<C0078d> list = this.f333x;
        return list.get(list.size() - 1).m30278a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: l */
    public boolean mo25019l(SubMenuC0098l subMenuC0098l) {
        for (C0078d c0078d : this.f333x) {
            if (subMenuC0098l == c0078d.f344b) {
                c0078d.m30278a().requestFocus();
                return true;
            }
        }
        if (subMenuC0098l.hasVisibleItems()) {
            mo17561n(subMenuC0098l);
            InterfaceC0091i.InterfaceC0092a interfaceC0092a = this.f322M;
            if (interfaceC0092a != null) {
                interfaceC0092a.mo24217c(subMenuC0098l);
            }
            return true;
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
        c0082e.m30243c(this, this.f326q);
        if (mo7286a()) {
            m30279H(c0082e);
        } else {
            this.f332w.add(c0082e);
        }
    }

    @Override // com.daaw.kp0
    /* renamed from: o */
    public boolean mo17560o() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0078d c0078d;
        int size = this.f333x.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0078d = null;
                break;
            }
            c0078d = this.f333x.get(i);
            if (!c0078d.f343a.mo7286a()) {
                break;
            }
            i++;
        }
        if (c0078d != null) {
            c0078d.f344b.m30239e(false);
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
        if (this.f313D != view) {
            this.f313D = view;
            this.f312C = g80.m21894b(this.f311B, xs1.m4768E(view));
        }
    }

    @Override // com.daaw.kp0
    /* renamed from: t */
    public void mo17555t(boolean z) {
        this.f320K = z;
    }

    @Override // com.daaw.kp0
    /* renamed from: u */
    public void mo17554u(int i) {
        if (this.f311B != i) {
            this.f311B = i;
            this.f312C = g80.m21894b(i, xs1.m4768E(this.f313D));
        }
    }

    @Override // com.daaw.kp0
    /* renamed from: v */
    public void mo17553v(int i) {
        this.f316G = true;
        this.f318I = i;
    }

    @Override // com.daaw.kp0
    /* renamed from: w */
    public void mo17552w(PopupWindow.OnDismissListener onDismissListener) {
        this.f324O = onDismissListener;
    }

    @Override // com.daaw.kp0
    /* renamed from: x */
    public void mo17551x(boolean z) {
        this.f321L = z;
    }

    @Override // com.daaw.kp0
    /* renamed from: y */
    public void mo17550y(int i) {
        this.f317H = true;
        this.f319J = i;
    }
}
