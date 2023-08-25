package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.daaw.xs1;
import com.daaw.xz;
import java.util.List;
@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {
    public int a;

    /* loaded from: classes2.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ View p;
        public final /* synthetic */ int q;
        public final /* synthetic */ xz r;

        public a(View view, int i, xz xzVar) {
            this.p = view;
            this.q = i;
            this.r = xzVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.p.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.a == this.q) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                xz xzVar = this.r;
                expandableBehavior.H((View) xzVar, this.p, xzVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.a = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
    }

    public final boolean F(boolean z) {
        if (!z) {
            return this.a == 1;
        }
        int i = this.a;
        return i == 0 || i == 2;
    }

    public xz G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> r = coordinatorLayout.r(view);
        int size = r.size();
        for (int i = 0; i < size; i++) {
            View view2 = r.get(i);
            if (e(coordinatorLayout, view, view2)) {
                return (xz) view2;
            }
        }
        return null;
    }

    public abstract boolean H(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean e(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        xz xzVar = (xz) view2;
        if (F(xzVar.a())) {
            this.a = xzVar.a() ? 1 : 2;
            return H((View) xzVar, view, xzVar.a(), true);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        xz G;
        if (xs1.V(view) || (G = G(coordinatorLayout, view)) == null || !F(G.a())) {
            return false;
        }
        int i2 = G.a() ? 1 : 2;
        this.a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i2, G));
        return false;
    }
}
