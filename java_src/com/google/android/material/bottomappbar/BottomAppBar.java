package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.daaw.C2166mc;
import com.daaw.C2366nu;
import com.daaw.dn1;
import com.daaw.f11;
import com.daaw.fu1;
import com.daaw.k21;
import com.daaw.nn0;
import com.daaw.on0;
import com.daaw.xs1;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.InterfaceC0193b {

    /* renamed from: B0 */
    public static final int f37180B0 = k21.Widget_MaterialComponents_BottomAppBar;

    /* renamed from: A0 */
    public dn1<FloatingActionButton> f37181A0;

    /* renamed from: j0 */
    public final int f37182j0;

    /* renamed from: k0 */
    public final nn0 f37183k0;

    /* renamed from: l0 */
    public Animator f37184l0;

    /* renamed from: m0 */
    public Animator f37185m0;

    /* renamed from: n0 */
    public int f37186n0;

    /* renamed from: o0 */
    public int f37187o0;

    /* renamed from: p0 */
    public boolean f37188p0;

    /* renamed from: q0 */
    public int f37189q0;

    /* renamed from: r0 */
    public ArrayList<InterfaceC4026g> f37190r0;

    /* renamed from: s0 */
    public int f37191s0;

    /* renamed from: t0 */
    public boolean f37192t0;

    /* renamed from: u0 */
    public boolean f37193u0;

    /* renamed from: v0 */
    public Behavior f37194v0;

    /* renamed from: w0 */
    public int f37195w0;

    /* renamed from: x0 */
    public int f37196x0;

    /* renamed from: y0 */
    public int f37197y0;

    /* renamed from: z0 */
    public AnimatorListenerAdapter f37198z0;

    /* loaded from: classes2.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e */
        public final Rect f37199e;

        /* renamed from: f */
        public WeakReference<BottomAppBar> f37200f;

        /* renamed from: g */
        public int f37201g;

        /* renamed from: h */
        public final View.OnLayoutChangeListener f37202h;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        /* loaded from: classes2.dex */
        public class View$OnLayoutChangeListenerC4017a implements View.OnLayoutChangeListener {
            public View$OnLayoutChangeListenerC4017a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f37200f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.m457j(Behavior.this.f37199e);
                int height = Behavior.this.f37199e.height();
                bottomAppBar.m976A0(height);
                CoordinatorLayout.C0197f c0197f = (CoordinatorLayout.C0197f) view.getLayoutParams();
                if (Behavior.this.f37201g == 0) {
                    ((ViewGroup.MarginLayoutParams) c0197f).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(f11.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                    ((ViewGroup.MarginLayoutParams) c0197f).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) c0197f).rightMargin = bottomAppBar.getRightInset();
                    if (fu1.m22259d(floatingActionButton)) {
                        ((ViewGroup.MarginLayoutParams) c0197f).leftMargin += bottomAppBar.f37182j0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c0197f).rightMargin += bottomAppBar.f37182j0;
                    }
                }
            }
        }

        public Behavior() {
            this.f37202h = new View$OnLayoutChangeListenerC4017a();
            this.f37199e = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f37202h = new View$OnLayoutChangeListenerC4017a();
            this.f37199e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
        /* renamed from: M */
        public boolean mo126l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f37200f = new WeakReference<>(bottomAppBar);
            View m948q0 = bottomAppBar.m948q0();
            if (m948q0 != null && !xs1.m4742V(m948q0)) {
                CoordinatorLayout.C0197f c0197f = (CoordinatorLayout.C0197f) m948q0.getLayoutParams();
                c0197f.f1139d = 49;
                this.f37201g = ((ViewGroup.MarginLayoutParams) c0197f).bottomMargin;
                if (m948q0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) m948q0;
                    floatingActionButton.addOnLayoutChangeListener(this.f37202h);
                    bottomAppBar.m956i0(floatingActionButton);
                }
                bottomAppBar.m940y0();
            }
            coordinatorLayout.m29816I(bottomAppBar, i);
            return super.mo126l(coordinatorLayout, bottomAppBar, i);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
        /* renamed from: N */
        public boolean mo928A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.mo928A(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4018a();

        /* renamed from: r */
        public int f37204r;

        /* renamed from: s */
        public boolean f37205s;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$SavedState$a */
        /* loaded from: classes2.dex */
        public static class C4018a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f37204r = parcel.readInt();
            this.f37205s = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f37204r);
            parcel.writeInt(this.f37205s ? 1 : 0);
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    /* loaded from: classes2.dex */
    public class C4019a extends AnimatorListenerAdapter {
        public C4019a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m951n0();
            BottomAppBar.this.f37184l0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m950o0();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    /* loaded from: classes2.dex */
    public class C4020b extends FloatingActionButton.AbstractC4091b {

        /* renamed from: a */
        public final /* synthetic */ int f37207a;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b$a */
        /* loaded from: classes2.dex */
        public class C4021a extends FloatingActionButton.AbstractC4091b {
            public C4021a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC4091b
            /* renamed from: b */
            public void mo435b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.m951n0();
            }
        }

        public C4020b(int i) {
            this.f37207a = i;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC4091b
        /* renamed from: a */
        public void mo436a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.m946s0(this.f37207a));
            floatingActionButton.m448s(new C4021a());
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    /* loaded from: classes2.dex */
    public class C4022c extends AnimatorListenerAdapter {
        public C4022c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m951n0();
            BottomAppBar.this.f37192t0 = false;
            BottomAppBar.this.f37185m0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m950o0();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    /* loaded from: classes2.dex */
    public class C4023d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f37211a;

        /* renamed from: b */
        public final /* synthetic */ ActionMenuView f37212b;

        /* renamed from: c */
        public final /* synthetic */ int f37213c;

        /* renamed from: d */
        public final /* synthetic */ boolean f37214d;

        public C4023d(ActionMenuView actionMenuView, int i, boolean z) {
            this.f37212b = actionMenuView;
            this.f37213c = i;
            this.f37214d = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f37211a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f37211a) {
                return;
            }
            boolean z = BottomAppBar.this.f37191s0 != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.m942w0(bottomAppBar.f37191s0);
            BottomAppBar.this.m974C0(this.f37212b, this.f37213c, this.f37214d, z);
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    /* loaded from: classes2.dex */
    public class RunnableC4024e implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ ActionMenuView f37216p;

        /* renamed from: q */
        public final /* synthetic */ int f37217q;

        /* renamed from: r */
        public final /* synthetic */ boolean f37218r;

        public RunnableC4024e(ActionMenuView actionMenuView, int i, boolean z) {
            this.f37216p = actionMenuView;
            this.f37217q = i;
            this.f37218r = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuView actionMenuView = this.f37216p;
            actionMenuView.setTranslationX(BottomAppBar.this.m947r0(actionMenuView, this.f37217q, this.f37218r));
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$f */
    /* loaded from: classes2.dex */
    public class C4025f extends AnimatorListenerAdapter {
        public C4025f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f37198z0.onAnimationStart(animator);
            FloatingActionButton m949p0 = BottomAppBar.this.m949p0();
            if (m949p0 != null) {
                m949p0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g */
    /* loaded from: classes2.dex */
    public interface InterfaceC4026g {
        /* renamed from: a */
        void m930a(BottomAppBar bottomAppBar);

        /* renamed from: b */
        void m929b(BottomAppBar bottomAppBar);
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f37195w0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return m946s0(this.f37186n0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().m16103c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f37197y0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f37196x0;
    }

    private C2166mc getTopEdgeTreatment() {
        return (C2166mc) this.f37183k0.m15017C().m21797p();
    }

    /* renamed from: A0 */
    public boolean m976A0(int i) {
        float f = i;
        if (f != getTopEdgeTreatment().m16100f()) {
            getTopEdgeTreatment().m16096m(f);
            this.f37183k0.invalidateSelf();
            return true;
        }
        return false;
    }

    /* renamed from: B0 */
    public final void m975B0(ActionMenuView actionMenuView, int i, boolean z) {
        m974C0(actionMenuView, i, z, false);
    }

    /* renamed from: C0 */
    public final void m974C0(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        RunnableC4024e runnableC4024e = new RunnableC4024e(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(runnableC4024e);
        } else {
            runnableC4024e.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.f37183k0.m15015E();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0193b
    public Behavior getBehavior() {
        if (this.f37194v0 == null) {
            this.f37194v0 = new Behavior();
        }
        return this.f37194v0;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().m16103c();
    }

    public int getFabAlignmentMode() {
        return this.f37186n0;
    }

    public int getFabAnimationMode() {
        return this.f37187o0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().m16102d();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().m16101e();
    }

    public boolean getHideOnScroll() {
        return this.f37188p0;
    }

    /* renamed from: i0 */
    public final void m956i0(FloatingActionButton floatingActionButton) {
        floatingActionButton.m462e(this.f37198z0);
        floatingActionButton.m461f(new C4025f());
        floatingActionButton.m460g(this.f37181A0);
    }

    /* renamed from: j0 */
    public final void m955j0() {
        Animator animator = this.f37185m0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f37184l0;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* renamed from: k0 */
    public void m954k0(int i, List<Animator> list) {
        FloatingActionButton m949p0 = m949p0();
        if (m949p0 == null || m949p0.m453n()) {
            return;
        }
        m950o0();
        m949p0.m455l(new C4020b(i));
    }

    /* renamed from: l0 */
    public final void m953l0(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m949p0(), "translationX", m946s0(i));
        ofFloat.setDuration(300L);
        list.add(ofFloat);
    }

    /* renamed from: m0 */
    public final void m952m0(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        if (Math.abs(actionMenuView.getTranslationX() - m947r0(actionMenuView, i, z)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
                return;
            }
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
        ofFloat2.addListener(new C4023d(actionMenuView, i, z));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(150L);
        animatorSet.playSequentially(ofFloat2, ofFloat);
        list.add(animatorSet);
    }

    /* renamed from: n0 */
    public final void m951n0() {
        ArrayList<InterfaceC4026g> arrayList;
        int i = this.f37189q0 - 1;
        this.f37189q0 = i;
        if (i != 0 || (arrayList = this.f37190r0) == null) {
            return;
        }
        Iterator<InterfaceC4026g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().m929b(this);
        }
    }

    /* renamed from: o0 */
    public final void m950o0() {
        ArrayList<InterfaceC4026g> arrayList;
        int i = this.f37189q0;
        this.f37189q0 = i + 1;
        if (i != 0 || (arrayList = this.f37190r0) == null) {
            return;
        }
        Iterator<InterfaceC4026g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().m930a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        on0.m14140f(this, this.f37183k0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m955j0();
            m940y0();
        }
        m941x0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m29657a());
        this.f37186n0 = savedState.f37204r;
        this.f37193u0 = savedState.f37205s;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f37204r = this.f37186n0;
        savedState.f37205s = this.f37193u0;
        return savedState;
    }

    /* renamed from: p0 */
    public final FloatingActionButton m949p0() {
        View m948q0 = m948q0();
        if (m948q0 instanceof FloatingActionButton) {
            return (FloatingActionButton) m948q0;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* renamed from: q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View m948q0() {
        if (getParent() instanceof CoordinatorLayout) {
            for (View view : ((CoordinatorLayout) getParent()).m29788s(this)) {
                if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                    return view;
                }
                while (r0.hasNext()) {
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: r0 */
    public int m947r0(ActionMenuView actionMenuView, int i, boolean z) {
        if (i == 1 && z) {
            boolean m22259d = fu1.m22259d(this);
            int measuredWidth = m22259d ? getMeasuredWidth() : 0;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if ((childAt.getLayoutParams() instanceof Toolbar.C0159e) && (((Toolbar.C0159e) childAt.getLayoutParams()).f13119a & 8388615) == 8388611) {
                    measuredWidth = m22259d ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
                }
            }
            return measuredWidth - ((m22259d ? actionMenuView.getRight() : actionMenuView.getLeft()) + (m22259d ? this.f37196x0 : -this.f37197y0));
        }
        return 0;
    }

    /* renamed from: s0 */
    public final float m946s0(int i) {
        boolean m22259d = fu1.m22259d(this);
        if (i == 1) {
            return ((getMeasuredWidth() / 2) - (this.f37182j0 + (m22259d ? this.f37197y0 : this.f37196x0))) * (m22259d ? -1 : 1);
        }
        return 0.0f;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C2366nu.m14812o(this.f37183k0, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().m16099i(f);
            this.f37183k0.invalidateSelf();
            m940y0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        this.f37183k0.m14998V(f);
        getBehavior().m992G(this, this.f37183k0.m15018B() - this.f37183k0.m15019A());
    }

    public void setFabAlignmentMode(int i) {
        m939z0(i, 0);
    }

    public void setFabAnimationMode(int i) {
        this.f37187o0 = i;
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().m16098j(f);
            this.f37183k0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().m16097k(f);
            this.f37183k0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f37188p0 = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    /* renamed from: t0 */
    public final boolean m945t0() {
        FloatingActionButton m949p0 = m949p0();
        return m949p0 != null && m949p0.m452o();
    }

    /* renamed from: u0 */
    public final void m944u0(int i, boolean z) {
        if (!xs1.m4742V(this)) {
            this.f37192t0 = false;
            m942w0(this.f37191s0);
            return;
        }
        Animator animator = this.f37185m0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!m945t0()) {
            i = 0;
            z = false;
        }
        m952m0(i, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f37185m0 = animatorSet;
        animatorSet.addListener(new C4022c());
        this.f37185m0.start();
    }

    /* renamed from: v0 */
    public final void m943v0(int i) {
        if (this.f37186n0 == i || !xs1.m4742V(this)) {
            return;
        }
        Animator animator = this.f37184l0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.f37187o0 == 1) {
            m953l0(i, arrayList);
        } else {
            m954k0(i, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f37184l0 = animatorSet;
        animatorSet.addListener(new C4019a());
        this.f37184l0.start();
    }

    /* renamed from: w0 */
    public void m942w0(int i) {
        if (i != 0) {
            this.f37191s0 = 0;
            getMenu().clear();
            m29948x(i);
        }
    }

    /* renamed from: x0 */
    public final void m941x0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f37185m0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (m945t0()) {
            m975B0(actionMenuView, this.f37186n0, this.f37193u0);
        } else {
            m975B0(actionMenuView, 0, false);
        }
    }

    /* renamed from: y0 */
    public final void m940y0() {
        getTopEdgeTreatment().m16095n(getFabTranslationX());
        View m948q0 = m948q0();
        this.f37183k0.m14996X((this.f37193u0 && m945t0()) ? 1.0f : 0.0f);
        if (m948q0 != null) {
            m948q0.setTranslationY(getFabTranslationY());
            m948q0.setTranslationX(getFabTranslationX());
        }
    }

    /* renamed from: z0 */
    public void m939z0(int i, int i2) {
        this.f37191s0 = i2;
        this.f37192t0 = true;
        m944u0(i, this.f37193u0);
        m943v0(i);
        this.f37186n0 = i;
    }
}
