package com.daaw;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.daaw.AbstractC2228n0;
/* renamed from: com.daaw.i0 */
/* loaded from: classes.dex */
public abstract class AbstractC1643i0 {

    /* renamed from: com.daaw.i0$a */
    /* loaded from: classes.dex */
    public static class C1644a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f13119a;

        public C1644a(int i, int i2) {
            super(i, i2);
            this.f13119a = 8388627;
        }

        public C1644a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f13119a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x21.f31977t);
            this.f13119a = obtainStyledAttributes.getInt(x21.f31982u, 0);
            obtainStyledAttributes.recycle();
        }

        public C1644a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f13119a = 0;
        }

        public C1644a(C1644a c1644a) {
            super((ViewGroup.MarginLayoutParams) c1644a);
            this.f13119a = 0;
            this.f13119a = c1644a.f13119a;
        }
    }

    /* renamed from: com.daaw.i0$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1645b {
        /* renamed from: a */
        void m20279a(boolean z);
    }

    @Deprecated
    /* renamed from: com.daaw.i0$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1646c {
        /* renamed from: a */
        public abstract CharSequence m20278a();

        /* renamed from: b */
        public abstract View m20277b();

        /* renamed from: c */
        public abstract Drawable m20276c();

        /* renamed from: d */
        public abstract CharSequence m20275d();

        /* renamed from: e */
        public abstract void m20274e();
    }

    /* renamed from: f */
    public boolean mo20284f() {
        return false;
    }

    /* renamed from: g */
    public abstract boolean mo15698g();

    /* renamed from: h */
    public abstract void mo15697h(boolean z);

    /* renamed from: i */
    public abstract int mo15696i();

    /* renamed from: j */
    public abstract Context mo15695j();

    /* renamed from: k */
    public boolean mo20283k() {
        return false;
    }

    /* renamed from: l */
    public abstract boolean mo15694l();

    /* renamed from: m */
    public void mo15693m(Configuration configuration) {
    }

    /* renamed from: n */
    public void mo20282n() {
    }

    /* renamed from: o */
    public abstract boolean mo15692o(int i, KeyEvent keyEvent);

    /* renamed from: p */
    public boolean mo20281p(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: q */
    public boolean mo20280q() {
        return false;
    }

    /* renamed from: r */
    public abstract void mo15691r(boolean z);

    /* renamed from: s */
    public abstract void mo15690s(boolean z);

    /* renamed from: t */
    public abstract void mo15689t(boolean z);

    /* renamed from: u */
    public abstract void mo15688u(boolean z);

    /* renamed from: v */
    public abstract void mo15687v(boolean z);

    /* renamed from: w */
    public abstract void mo15686w(CharSequence charSequence);

    /* renamed from: x */
    public abstract void mo15685x(CharSequence charSequence);

    /* renamed from: y */
    public abstract void mo15684y(CharSequence charSequence);

    /* renamed from: z */
    public AbstractC2228n0 mo15683z(AbstractC2228n0.InterfaceC2229a interfaceC2229a) {
        return null;
    }
}
