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
import androidx.appcompat.view.menu.i;
import com.daaw.c21;
import com.daaw.g11;
import com.daaw.g80;
import com.daaw.ip0;
import com.daaw.kp0;
import com.daaw.lp0;
import com.daaw.xs1;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class b extends kp0 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int Q = c21.abc_cascading_menu_item_layout;
    public View D;
    public View E;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public boolean L;
    public i.a M;
    public ViewTreeObserver N;
    public PopupWindow.OnDismissListener O;
    public boolean P;
    public final Context q;
    public final int r;
    public final int s;
    public final int t;
    public final boolean u;
    public final Handler v;
    public final List<e> w = new ArrayList();
    public final List<d> x = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener y = new a();
    public final View.OnAttachStateChangeListener z = new View$OnAttachStateChangeListenerC0008b();
    public final ip0 A = new c();
    public int B = 0;
    public int C = 0;
    public boolean K = false;
    public int F = F();

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.a() || b.this.x.size() <= 0 || b.this.x.get(0).a.B()) {
                return;
            }
            View view = b.this.E;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            for (d dVar : b.this.x) {
                dVar.a.h();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC0008b implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC0008b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.N;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.N = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.N.removeGlobalOnLayoutListener(bVar.y);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* loaded from: classes.dex */
    public class c implements ip0 {

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ d p;
            public final /* synthetic */ MenuItem q;
            public final /* synthetic */ e r;

            public a(d dVar, MenuItem menuItem, e eVar) {
                this.p = dVar;
                this.q = menuItem;
                this.r = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.p;
                if (dVar != null) {
                    b.this.P = true;
                    dVar.b.e(false);
                    b.this.P = false;
                }
                if (this.q.isEnabled() && this.q.hasSubMenu()) {
                    this.r.N(this.q, 4);
                }
            }
        }

        public c() {
        }

        @Override // com.daaw.ip0
        public void d(e eVar, MenuItem menuItem) {
            b.this.v.removeCallbacksAndMessages(null);
            int size = b.this.x.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (eVar == b.this.x.get(i).b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            b.this.v.postAtTime(new a(i2 < b.this.x.size() ? b.this.x.get(i2) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // com.daaw.ip0
        public void g(e eVar, MenuItem menuItem) {
            b.this.v.removeCallbacksAndMessages(eVar);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public final lp0 a;
        public final e b;
        public final int c;

        public d(lp0 lp0Var, e eVar, int i) {
            this.a = lp0Var;
            this.b = eVar;
            this.c = i;
        }

        public ListView a() {
            return this.a.k();
        }
    }

    public b(Context context, View view, int i, int i2, boolean z) {
        this.q = context;
        this.D = view;
        this.s = i;
        this.t = i2;
        this.u = z;
        Resources resources = context.getResources();
        this.r = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(g11.abc_config_prefDialogWidth));
        this.v = new Handler();
    }

    public final lp0 B() {
        lp0 lp0Var = new lp0(this.q, null, this.s, this.t);
        lp0Var.T(this.A);
        lp0Var.L(this);
        lp0Var.K(this);
        lp0Var.D(this.D);
        lp0Var.G(this.C);
        lp0Var.J(true);
        lp0Var.I(2);
        return lp0Var;
    }

    public final int C(e eVar) {
        int size = this.x.size();
        for (int i = 0; i < size; i++) {
            if (eVar == this.x.get(i).b) {
                return i;
            }
        }
        return -1;
    }

    public final MenuItem D(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = eVar.getItem(i);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    public final View E(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int i;
        int firstVisiblePosition;
        MenuItem D = D(dVar.b, eVar);
        if (D == null) {
            return null;
        }
        ListView a2 = dVar.a();
        ListAdapter adapter = a2.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            i = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (D == dVar2.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a2.getChildCount()) {
            return a2.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    public final int F() {
        return xs1.E(this.D) == 1 ? 0 : 1;
    }

    public final int G(int i) {
        List<d> list = this.x;
        ListView a2 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a2.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.E.getWindowVisibleDisplayFrame(rect);
        return this.F == 1 ? (iArr[0] + a2.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    public final void H(e eVar) {
        d dVar;
        View view;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.q);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, from, this.u, Q);
        if (!a() && this.K) {
            dVar2.d(true);
        } else if (a()) {
            dVar2.d(kp0.z(eVar));
        }
        int q = kp0.q(dVar2, null, this.q, this.r);
        lp0 B = B();
        B.p(dVar2);
        B.F(q);
        B.G(this.C);
        if (this.x.size() > 0) {
            List<d> list = this.x;
            dVar = list.get(list.size() - 1);
            view = E(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            B.U(false);
            B.R(null);
            int G = G(q);
            boolean z = G == 1;
            this.F = G;
            if (Build.VERSION.SDK_INT >= 26) {
                B.D(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.D.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.C & 7) == 5) {
                    iArr[0] = iArr[0] + this.D.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.C & 5) == 5) {
                if (!z) {
                    q = view.getWidth();
                    i3 = i - q;
                }
                i3 = i + q;
            } else {
                if (z) {
                    q = view.getWidth();
                    i3 = i + q;
                }
                i3 = i - q;
            }
            B.e(i3);
            B.M(true);
            B.l(i2);
        } else {
            if (this.G) {
                B.e(this.I);
            }
            if (this.H) {
                B.l(this.J);
            }
            B.H(p());
        }
        this.x.add(new d(B, eVar, this.F));
        B.h();
        ListView k = B.k();
        k.setOnKeyListener(this);
        if (dVar == null && this.L && eVar.z() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(c21.abc_popup_menu_header_item_layout, (ViewGroup) k, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(eVar.z());
            k.addHeaderView(frameLayout, null, false);
            B.h();
        }
    }

    @Override // com.daaw.vc1
    public boolean a() {
        return this.x.size() > 0 && this.x.get(0).a.a();
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z) {
        int C = C(eVar);
        if (C < 0) {
            return;
        }
        int i = C + 1;
        if (i < this.x.size()) {
            this.x.get(i).b.e(false);
        }
        d remove = this.x.remove(C);
        remove.b.Q(this);
        if (this.P) {
            remove.a.S(null);
            remove.a.E(0);
        }
        remove.a.dismiss();
        int size = this.x.size();
        this.F = size > 0 ? this.x.get(size - 1).c : F();
        if (size != 0) {
            if (z) {
                this.x.get(0).b.e(false);
                return;
            }
            return;
        }
        dismiss();
        i.a aVar = this.M;
        if (aVar != null) {
            aVar.b(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.N;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.N.removeGlobalOnLayoutListener(this.y);
            }
            this.N = null;
        }
        this.E.removeOnAttachStateChangeListener(this.z);
        this.O.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.i
    public void c(boolean z) {
        for (d dVar : this.x) {
            kp0.A(dVar.a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean d() {
        return false;
    }

    @Override // com.daaw.vc1
    public void dismiss() {
        int size = this.x.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.x.toArray(new d[size]);
            for (int i = size - 1; i >= 0; i--) {
                d dVar = dVarArr[i];
                if (dVar.a.a()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void g(i.a aVar) {
        this.M = aVar;
    }

    @Override // com.daaw.vc1
    public void h() {
        if (a()) {
            return;
        }
        for (e eVar : this.w) {
            H(eVar);
        }
        this.w.clear();
        View view = this.D;
        this.E = view;
        if (view != null) {
            boolean z = this.N == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.N = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.y);
            }
            this.E.addOnAttachStateChangeListener(this.z);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void j(Parcelable parcelable) {
    }

    @Override // com.daaw.vc1
    public ListView k() {
        if (this.x.isEmpty()) {
            return null;
        }
        List<d> list = this.x;
        return list.get(list.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean l(l lVar) {
        for (d dVar : this.x) {
            if (lVar == dVar.b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (lVar.hasVisibleItems()) {
            n(lVar);
            i.a aVar = this.M;
            if (aVar != null) {
                aVar.c(lVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable m() {
        return null;
    }

    @Override // com.daaw.kp0
    public void n(e eVar) {
        eVar.c(this, this.q);
        if (a()) {
            H(eVar);
        } else {
            this.w.add(eVar);
        }
    }

    @Override // com.daaw.kp0
    public boolean o() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.x.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.x.get(i);
            if (!dVar.a.a()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.b.e(false);
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
        if (this.D != view) {
            this.D = view;
            this.C = g80.b(this.B, xs1.E(view));
        }
    }

    @Override // com.daaw.kp0
    public void t(boolean z) {
        this.K = z;
    }

    @Override // com.daaw.kp0
    public void u(int i) {
        if (this.B != i) {
            this.B = i;
            this.C = g80.b(i, xs1.E(this.D));
        }
    }

    @Override // com.daaw.kp0
    public void v(int i) {
        this.G = true;
        this.I = i;
    }

    @Override // com.daaw.kp0
    public void w(PopupWindow.OnDismissListener onDismissListener) {
        this.O = onDismissListener;
    }

    @Override // com.daaw.kp0
    public void x(boolean z) {
        this.L = z;
    }

    @Override // com.daaw.kp0
    public void y(int i) {
        this.H = true;
        this.J = i;
    }
}
