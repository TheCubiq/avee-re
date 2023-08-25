package com.daaw;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
/* loaded from: classes2.dex */
public class fu1 {

    /* renamed from: com.daaw.fu1$a */
    /* loaded from: classes2.dex */
    public static class C1328a implements vt0 {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC1330c f9959a;

        /* renamed from: b */
        public final /* synthetic */ C1331d f9960b;

        public C1328a(InterfaceC1330c interfaceC1330c, C1331d c1331d) {
            this.f9959a = interfaceC1330c;
            this.f9960b = c1331d;
        }

        @Override // com.daaw.vt0
        /* renamed from: a */
        public px1 mo6806a(View view, px1 px1Var) {
            return this.f9959a.mo873a(view, px1Var, new C1331d(this.f9960b));
        }
    }

    /* renamed from: com.daaw.fu1$b */
    /* loaded from: classes2.dex */
    public static class View$OnAttachStateChangeListenerC1329b implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            xs1.m4708o0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.daaw.fu1$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC1330c {
        /* renamed from: a */
        px1 mo873a(View view, px1 px1Var, C1331d c1331d);
    }

    /* renamed from: com.daaw.fu1$d */
    /* loaded from: classes2.dex */
    public static class C1331d {

        /* renamed from: a */
        public int f9961a;

        /* renamed from: b */
        public int f9962b;

        /* renamed from: c */
        public int f9963c;

        /* renamed from: d */
        public int f9964d;

        public C1331d(int i, int i2, int i3, int i4) {
            this.f9961a = i;
            this.f9962b = i2;
            this.f9963c = i3;
            this.f9964d = i4;
        }

        public C1331d(C1331d c1331d) {
            this.f9961a = c1331d.f9961a;
            this.f9962b = c1331d.f9962b;
            this.f9963c = c1331d.f9963c;
            this.f9964d = c1331d.f9964d;
        }
    }

    /* renamed from: a */
    public static void m22262a(View view, InterfaceC1330c interfaceC1330c) {
        xs1.m4769D0(view, new C1328a(interfaceC1330c, new C1331d(xs1.m4758J(view), view.getPaddingTop(), xs1.m4760I(view), view.getPaddingBottom())));
        m22257f(view);
    }

    /* renamed from: b */
    public static float m22261b(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: c */
    public static float m22260c(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += xs1.m4689y((View) parent);
        }
        return f;
    }

    /* renamed from: d */
    public static boolean m22259d(View view) {
        return xs1.m4768E(view) == 1;
    }

    /* renamed from: e */
    public static PorterDuff.Mode m22258e(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    /* renamed from: f */
    public static void m22257f(View view) {
        if (xs1.m4743U(view)) {
            xs1.m4708o0(view);
        } else {
            view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC1329b());
        }
    }
}
