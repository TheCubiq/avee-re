package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.daaw.InterfaceC3653xz;
import com.daaw.xs1;
import java.util.List;
@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.AbstractC0194c<View> {

    /* renamed from: a */
    public int f37873a;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    /* loaded from: classes2.dex */
    public class ViewTreeObserver$OnPreDrawListenerC4171a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: p */
        public final /* synthetic */ View f37874p;

        /* renamed from: q */
        public final /* synthetic */ int f37875q;

        /* renamed from: r */
        public final /* synthetic */ InterfaceC3653xz f37876r;

        public ViewTreeObserver$OnPreDrawListenerC4171a(View view, int i, InterfaceC3653xz interfaceC3653xz) {
            this.f37874p = view;
            this.f37875q = i;
            this.f37876r = interfaceC3653xz;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f37874p.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f37873a == this.f37875q) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                InterfaceC3653xz interfaceC3653xz = this.f37876r;
                expandableBehavior.mo98H((View) interfaceC3653xz, this.f37874p, interfaceC3653xz.mo465a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f37873a = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37873a = 0;
    }

    /* renamed from: F */
    public final boolean m129F(boolean z) {
        if (!z) {
            return this.f37873a == 1;
        }
        int i = this.f37873a;
        return i == 0 || i == 2;
    }

    /* renamed from: G */
    public InterfaceC3653xz m128G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> m29789r = coordinatorLayout.m29789r(view);
        int size = m29789r.size();
        for (int i = 0; i < size; i++) {
            View view2 = m29789r.get(i);
            if (mo99e(coordinatorLayout, view, view2)) {
                return (InterfaceC3653xz) view2;
            }
        }
        return null;
    }

    /* renamed from: H */
    public abstract boolean mo98H(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: e */
    public abstract boolean mo99e(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: h */
    public boolean mo127h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        InterfaceC3653xz interfaceC3653xz = (InterfaceC3653xz) view2;
        if (m129F(interfaceC3653xz.mo465a())) {
            this.f37873a = interfaceC3653xz.mo465a() ? 1 : 2;
            return mo98H((View) interfaceC3653xz, view, interfaceC3653xz.mo465a(), true);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: l */
    public boolean mo126l(CoordinatorLayout coordinatorLayout, View view, int i) {
        InterfaceC3653xz m128G;
        if (xs1.m4742V(view) || (m128G = m128G(coordinatorLayout, view)) == null || !m129F(m128G.mo465a())) {
            return false;
        }
        int i2 = m128G.mo465a() ? 1 : 2;
        this.f37873a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC4171a(view, i2, m128G));
        return false;
    }
}
