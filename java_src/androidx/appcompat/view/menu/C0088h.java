package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.InterfaceC0091i;
import com.daaw.g11;
import com.daaw.g80;
import com.daaw.kp0;
import com.daaw.xs1;
/* renamed from: androidx.appcompat.view.menu.h */
/* loaded from: classes.dex */
public class C0088h {

    /* renamed from: a */
    public final Context f427a;

    /* renamed from: b */
    public final C0082e f428b;

    /* renamed from: c */
    public final boolean f429c;

    /* renamed from: d */
    public final int f430d;

    /* renamed from: e */
    public final int f431e;

    /* renamed from: f */
    public View f432f;

    /* renamed from: g */
    public int f433g;

    /* renamed from: h */
    public boolean f434h;

    /* renamed from: i */
    public InterfaceC0091i.InterfaceC0092a f435i;

    /* renamed from: j */
    public kp0 f436j;

    /* renamed from: k */
    public PopupWindow.OnDismissListener f437k;

    /* renamed from: l */
    public final PopupWindow.OnDismissListener f438l;

    /* renamed from: androidx.appcompat.view.menu.h$a */
    /* loaded from: classes.dex */
    public class C0089a implements PopupWindow.OnDismissListener {
        public C0089a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C0088h.this.mo30113e();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.h$b */
    /* loaded from: classes.dex */
    public static class C0090b {
        /* renamed from: a */
        public static void m30176a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public C0088h(Context context, C0082e c0082e, View view, boolean z, int i) {
        this(context, c0082e, view, z, i, 0);
    }

    public C0088h(Context context, C0082e c0082e, View view, boolean z, int i, int i2) {
        this.f433g = 8388611;
        this.f438l = new C0089a();
        this.f427a = context;
        this.f428b = c0082e;
        this.f432f = view;
        this.f429c = z;
        this.f430d = i;
        this.f431e = i2;
    }

    /* renamed from: a */
    public final kp0 m30189a() {
        Display defaultDisplay = ((WindowManager) this.f427a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        C0090b.m30176a(defaultDisplay, point);
        kp0 view$OnKeyListenerC0073b = Math.min(point.x, point.y) >= this.f427a.getResources().getDimensionPixelSize(g11.abc_cascading_menus_min_smallest_width) ? new View$OnKeyListenerC0073b(this.f427a, this.f432f, this.f430d, this.f431e, this.f429c) : new View$OnKeyListenerC0095k(this.f427a, this.f428b, this.f432f, this.f430d, this.f431e, this.f429c);
        view$OnKeyListenerC0073b.mo17561n(this.f428b);
        view$OnKeyListenerC0073b.mo17552w(this.f438l);
        view$OnKeyListenerC0073b.mo17557r(this.f432f);
        view$OnKeyListenerC0073b.mo30174g(this.f435i);
        view$OnKeyListenerC0073b.mo17555t(this.f434h);
        view$OnKeyListenerC0073b.mo17554u(this.f433g);
        return view$OnKeyListenerC0073b;
    }

    /* renamed from: b */
    public void m30188b() {
        if (m30186d()) {
            this.f436j.dismiss();
        }
    }

    /* renamed from: c */
    public kp0 m30187c() {
        if (this.f436j == null) {
            this.f436j = m30189a();
        }
        return this.f436j;
    }

    /* renamed from: d */
    public boolean m30186d() {
        kp0 kp0Var = this.f436j;
        return kp0Var != null && kp0Var.mo7286a();
    }

    /* renamed from: e */
    public void mo30113e() {
        this.f436j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f437k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public void m30185f(View view) {
        this.f432f = view;
    }

    /* renamed from: g */
    public void m30184g(boolean z) {
        this.f434h = z;
        kp0 kp0Var = this.f436j;
        if (kp0Var != null) {
            kp0Var.mo17555t(z);
        }
    }

    /* renamed from: h */
    public void m30183h(int i) {
        this.f433g = i;
    }

    /* renamed from: i */
    public void m30182i(PopupWindow.OnDismissListener onDismissListener) {
        this.f437k = onDismissListener;
    }

    /* renamed from: j */
    public void m30181j(InterfaceC0091i.InterfaceC0092a interfaceC0092a) {
        this.f435i = interfaceC0092a;
        kp0 kp0Var = this.f436j;
        if (kp0Var != null) {
            kp0Var.mo30174g(interfaceC0092a);
        }
    }

    /* renamed from: k */
    public void m30180k() {
        if (!m30178m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: l */
    public final void m30179l(int i, int i2, boolean z, boolean z2) {
        kp0 m30187c = m30187c();
        m30187c.mo17551x(z2);
        if (z) {
            if ((g80.m21894b(this.f433g, xs1.m4768E(this.f432f)) & 7) == 5) {
                i -= this.f432f.getWidth();
            }
            m30187c.mo17553v(i);
            m30187c.mo17550y(i2);
            int i3 = (int) ((this.f427a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            m30187c.m17556s(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        m30187c.mo7285h();
    }

    /* renamed from: m */
    public boolean m30178m() {
        if (m30186d()) {
            return true;
        }
        if (this.f432f == null) {
            return false;
        }
        m30179l(0, 0, false, false);
        return true;
    }

    /* renamed from: n */
    public boolean m30177n(int i, int i2) {
        if (m30186d()) {
            return true;
        }
        if (this.f432f == null) {
            return false;
        }
        m30179l(i, i2, true, true);
        return true;
    }
}
