package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.i;
import com.daaw.g11;
import com.daaw.g80;
import com.daaw.kp0;
import com.daaw.xs1;
/* loaded from: classes.dex */
public class h {
    public final Context a;
    public final e b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public int g;
    public boolean h;
    public i.a i;
    public kp0 j;
    public PopupWindow.OnDismissListener k;
    public final PopupWindow.OnDismissListener l;

    /* loaded from: classes.dex */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            h.this.e();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public h(Context context, e eVar, View view, boolean z, int i) {
        this(context, eVar, view, z, i, 0);
    }

    public h(Context context, e eVar, View view, boolean z, int i, int i2) {
        this.g = 8388611;
        this.l = new a();
        this.a = context;
        this.b = eVar;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public final kp0 a() {
        Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        b.a(defaultDisplay, point);
        kp0 bVar = Math.min(point.x, point.y) >= this.a.getResources().getDimensionPixelSize(g11.abc_cascading_menus_min_smallest_width) ? new androidx.appcompat.view.menu.b(this.a, this.f, this.d, this.e, this.c) : new k(this.a, this.b, this.f, this.d, this.e, this.c);
        bVar.n(this.b);
        bVar.w(this.l);
        bVar.r(this.f);
        bVar.g(this.i);
        bVar.t(this.h);
        bVar.u(this.g);
        return bVar;
    }

    public void b() {
        if (d()) {
            this.j.dismiss();
        }
    }

    public kp0 c() {
        if (this.j == null) {
            this.j = a();
        }
        return this.j;
    }

    public boolean d() {
        kp0 kp0Var = this.j;
        return kp0Var != null && kp0Var.a();
    }

    public void e() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f = view;
    }

    public void g(boolean z) {
        this.h = z;
        kp0 kp0Var = this.j;
        if (kp0Var != null) {
            kp0Var.t(z);
        }
    }

    public void h(int i) {
        this.g = i;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    public void j(i.a aVar) {
        this.i = aVar;
        kp0 kp0Var = this.j;
        if (kp0Var != null) {
            kp0Var.g(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void l(int i, int i2, boolean z, boolean z2) {
        kp0 c = c();
        c.x(z2);
        if (z) {
            if ((g80.b(this.g, xs1.E(this.f)) & 7) == 5) {
                i -= this.f.getWidth();
            }
            c.v(i);
            c.y(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c.s(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        c.h();
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i, int i2) {
        if (d()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        l(i, i2, true, true);
        return true;
    }
}
