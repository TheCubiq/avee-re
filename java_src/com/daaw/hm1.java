package com.daaw;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
/* loaded from: classes.dex */
public class hm1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: A */
    public static hm1 f12661A;

    /* renamed from: z */
    public static hm1 f12662z;

    /* renamed from: p */
    public final View f12663p;

    /* renamed from: q */
    public final CharSequence f12664q;

    /* renamed from: r */
    public final int f12665r;

    /* renamed from: s */
    public final Runnable f12666s = new Runnable() { // from class: com.daaw.gm1
        @Override // java.lang.Runnable
        public final void run() {
            hm1.this.m20630e();
        }
    };

    /* renamed from: t */
    public final Runnable f12667t = new Runnable() { // from class: com.daaw.fm1
        @Override // java.lang.Runnable
        public final void run() {
            hm1.this.m20631d();
        }
    };

    /* renamed from: u */
    public int f12668u;

    /* renamed from: v */
    public int f12669v;

    /* renamed from: w */
    public im1 f12670w;

    /* renamed from: x */
    public boolean f12671x;

    /* renamed from: y */
    public boolean f12672y;

    public hm1(View view, CharSequence charSequence) {
        this.f12663p = view;
        this.f12664q = charSequence;
        this.f12665r = zs1.m1951c(ViewConfiguration.get(view.getContext()));
        m20632c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m20630e() {
        m20626i(false);
    }

    /* renamed from: g */
    public static void m20628g(hm1 hm1Var) {
        hm1 hm1Var2 = f12662z;
        if (hm1Var2 != null) {
            hm1Var2.m20633b();
        }
        f12662z = hm1Var;
        if (hm1Var != null) {
            hm1Var.m20629f();
        }
    }

    /* renamed from: h */
    public static void m20627h(View view, CharSequence charSequence) {
        hm1 hm1Var = f12662z;
        if (hm1Var != null && hm1Var.f12663p == view) {
            m20628g(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new hm1(view, charSequence);
            return;
        }
        hm1 hm1Var2 = f12661A;
        if (hm1Var2 != null && hm1Var2.f12663p == view) {
            hm1Var2.m20631d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* renamed from: b */
    public final void m20633b() {
        this.f12663p.removeCallbacks(this.f12666s);
    }

    /* renamed from: c */
    public final void m20632c() {
        this.f12672y = true;
    }

    /* renamed from: d */
    public void m20631d() {
        if (f12661A == this) {
            f12661A = null;
            im1 im1Var = this.f12670w;
            if (im1Var != null) {
                im1Var.m19645c();
                this.f12670w = null;
                m20632c();
                this.f12663p.removeOnAttachStateChangeListener(this);
            }
        }
        if (f12662z == this) {
            m20628g(null);
        }
        this.f12663p.removeCallbacks(this.f12667t);
    }

    /* renamed from: f */
    public final void m20629f() {
        this.f12663p.postDelayed(this.f12666s, ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: i */
    public void m20626i(boolean z) {
        long longPressTimeout;
        if (xs1.m4743U(this.f12663p)) {
            m20628g(null);
            hm1 hm1Var = f12661A;
            if (hm1Var != null) {
                hm1Var.m20631d();
            }
            f12661A = this;
            this.f12671x = z;
            im1 im1Var = new im1(this.f12663p.getContext());
            this.f12670w = im1Var;
            im1Var.m19643e(this.f12663p, this.f12668u, this.f12669v, this.f12671x, this.f12664q);
            this.f12663p.addOnAttachStateChangeListener(this);
            if (this.f12671x) {
                longPressTimeout = 2500;
            } else {
                longPressTimeout = ((xs1.m4749O(this.f12663p) & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
            }
            this.f12663p.removeCallbacks(this.f12667t);
            this.f12663p.postDelayed(this.f12667t, longPressTimeout);
        }
    }

    /* renamed from: j */
    public final boolean m20625j(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (this.f12672y || Math.abs(x - this.f12668u) > this.f12665r || Math.abs(y - this.f12669v) > this.f12665r) {
            this.f12668u = x;
            this.f12669v = y;
            this.f12672y = false;
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f12670w == null || !this.f12671x) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.f12663p.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    m20632c();
                    m20631d();
                }
            } else if (this.f12663p.isEnabled() && this.f12670w == null && m20625j(motionEvent)) {
                m20628g(this);
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f12668u = view.getWidth() / 2;
        this.f12669v = view.getHeight() / 2;
        m20626i(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m20631d();
    }
}
