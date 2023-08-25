package com.daaw;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
/* loaded from: classes.dex */
public class hm1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static hm1 A;
    public static hm1 z;
    public final View p;
    public final CharSequence q;
    public final int r;
    public final Runnable s = new Runnable() { // from class: com.daaw.gm1
        @Override // java.lang.Runnable
        public final void run() {
            hm1.this.e();
        }
    };
    public final Runnable t = new Runnable() { // from class: com.daaw.fm1
        @Override // java.lang.Runnable
        public final void run() {
            hm1.this.d();
        }
    };
    public int u;
    public int v;
    public im1 w;
    public boolean x;
    public boolean y;

    public hm1(View view, CharSequence charSequence) {
        this.p = view;
        this.q = charSequence;
        this.r = zs1.c(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        i(false);
    }

    public static void g(hm1 hm1Var) {
        hm1 hm1Var2 = z;
        if (hm1Var2 != null) {
            hm1Var2.b();
        }
        z = hm1Var;
        if (hm1Var != null) {
            hm1Var.f();
        }
    }

    public static void h(View view, CharSequence charSequence) {
        hm1 hm1Var = z;
        if (hm1Var != null && hm1Var.p == view) {
            g(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new hm1(view, charSequence);
            return;
        }
        hm1 hm1Var2 = A;
        if (hm1Var2 != null && hm1Var2.p == view) {
            hm1Var2.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public final void b() {
        this.p.removeCallbacks(this.s);
    }

    public final void c() {
        this.y = true;
    }

    public void d() {
        if (A == this) {
            A = null;
            im1 im1Var = this.w;
            if (im1Var != null) {
                im1Var.c();
                this.w = null;
                c();
                this.p.removeOnAttachStateChangeListener(this);
            }
        }
        if (z == this) {
            g(null);
        }
        this.p.removeCallbacks(this.t);
    }

    public final void f() {
        this.p.postDelayed(this.s, ViewConfiguration.getLongPressTimeout());
    }

    public void i(boolean z2) {
        long longPressTimeout;
        if (xs1.U(this.p)) {
            g(null);
            hm1 hm1Var = A;
            if (hm1Var != null) {
                hm1Var.d();
            }
            A = this;
            this.x = z2;
            im1 im1Var = new im1(this.p.getContext());
            this.w = im1Var;
            im1Var.e(this.p, this.u, this.v, this.x, this.q);
            this.p.addOnAttachStateChangeListener(this);
            if (this.x) {
                longPressTimeout = 2500;
            } else {
                longPressTimeout = ((xs1.O(this.p) & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
            }
            this.p.removeCallbacks(this.t);
            this.p.postDelayed(this.t, longPressTimeout);
        }
    }

    public final boolean j(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (this.y || Math.abs(x - this.u) > this.r || Math.abs(y - this.v) > this.r) {
            this.u = x;
            this.v = y;
            this.y = false;
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.w == null || !this.x) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.p.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    c();
                    d();
                }
            } else if (this.p.isEnabled() && this.w == null && j(motionEvent)) {
                g(this);
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.u = view.getWidth() / 2;
        this.v = view.getHeight() / 2;
        i(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }
}
