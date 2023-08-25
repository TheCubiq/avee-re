package com.daaw;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
/* loaded from: classes2.dex */
public class fu1 {

    /* loaded from: classes2.dex */
    public static class a implements vt0 {
        public final /* synthetic */ c a;
        public final /* synthetic */ d b;

        public a(c cVar, d dVar) {
            this.a = cVar;
            this.b = dVar;
        }

        @Override // com.daaw.vt0
        public px1 a(View view, px1 px1Var) {
            return this.a.a(view, px1Var, new d(this.b));
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            xs1.o0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        px1 a(View view, px1 px1Var, d dVar);
    }

    /* loaded from: classes2.dex */
    public static class d {
        public int a;
        public int b;
        public int c;
        public int d;

        public d(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public d(d dVar) {
            this.a = dVar.a;
            this.b = dVar.b;
            this.c = dVar.c;
            this.d = dVar.d;
        }
    }

    public static void a(View view, c cVar) {
        xs1.D0(view, new a(cVar, new d(xs1.J(view), view.getPaddingTop(), xs1.I(view), view.getPaddingBottom())));
        f(view);
    }

    public static float b(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static float c(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += xs1.y((View) parent);
        }
        return f;
    }

    public static boolean d(View view) {
        return xs1.E(view) == 1;
    }

    public static PorterDuff.Mode e(int i, PorterDuff.Mode mode) {
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

    public static void f(View view) {
        if (xs1.U(view)) {
            xs1.o0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }
}
