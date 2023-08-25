package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.daaw.C1247f3;
import com.daaw.C2366nu;
import com.daaw.C2818r4;
import com.daaw.C3654y;
import com.daaw.InterfaceC0785b0;
import com.daaw.es0;
import com.daaw.f11;
import com.daaw.k21;
import com.daaw.m21;
import com.daaw.nn0;
import com.daaw.on0;
import com.daaw.ou1;
import com.daaw.px1;
import com.daaw.sn0;
import com.daaw.w01;
import com.daaw.x90;
import com.daaw.xs1;
import com.daaw.y11;
import com.daaw.z80;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.InterfaceC0193b {

    /* renamed from: G */
    public static final int f37113G = k21.Widget_Design_AppBarLayout;

    /* renamed from: A */
    public boolean f37114A;

    /* renamed from: B */
    public int f37115B;

    /* renamed from: C */
    public WeakReference<View> f37116C;

    /* renamed from: D */
    public ValueAnimator f37117D;

    /* renamed from: E */
    public int[] f37118E;

    /* renamed from: F */
    public Drawable f37119F;

    /* renamed from: p */
    public int f37120p;

    /* renamed from: q */
    public int f37121q;

    /* renamed from: r */
    public int f37122r;

    /* renamed from: s */
    public int f37123s;

    /* renamed from: t */
    public boolean f37124t;

    /* renamed from: u */
    public int f37125u;

    /* renamed from: v */
    public px1 f37126v;

    /* renamed from: w */
    public List<InterfaceC4010b> f37127w;

    /* renamed from: x */
    public boolean f37128x;

    /* renamed from: y */
    public boolean f37129y;

    /* renamed from: z */
    public boolean f37130z;

    /* loaded from: classes2.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends z80<T> {

        /* renamed from: k */
        public int f37131k;

        /* renamed from: l */
        public int f37132l;

        /* renamed from: m */
        public ValueAnimator f37133m;

        /* renamed from: n */
        public int f37134n;

        /* renamed from: o */
        public boolean f37135o;

        /* renamed from: p */
        public float f37136p;

        /* renamed from: q */
        public WeakReference<View> f37137q;

        /* loaded from: classes2.dex */
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new C4005a();

            /* renamed from: r */
            public int f37138r;

            /* renamed from: s */
            public float f37139s;

            /* renamed from: t */
            public boolean f37140t;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$a */
            /* loaded from: classes2.dex */
            public static class C4005a implements Parcelable.ClassLoaderCreator<SavedState> {
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
                this.f37138r = parcel.readInt();
                this.f37139s = parcel.readFloat();
                this.f37140t = parcel.readByte() != 0;
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f37138r);
                parcel.writeFloat(this.f37139s);
                parcel.writeByte(this.f37140t ? (byte) 1 : (byte) 0);
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        /* loaded from: classes2.dex */
        public class C4006a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            public final /* synthetic */ CoordinatorLayout f37141a;

            /* renamed from: b */
            public final /* synthetic */ AppBarLayout f37142b;

            public C4006a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f37141a = coordinatorLayout;
                this.f37142b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.m2636P(this.f37141a, this.f37142b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        /* loaded from: classes2.dex */
        public class C4007b implements InterfaceC0785b0 {

            /* renamed from: a */
            public final /* synthetic */ CoordinatorLayout f37144a;

            /* renamed from: b */
            public final /* synthetic */ AppBarLayout f37145b;

            /* renamed from: c */
            public final /* synthetic */ View f37146c;

            /* renamed from: d */
            public final /* synthetic */ int f37147d;

            public C4007b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
                this.f37144a = coordinatorLayout;
                this.f37145b = appBarLayout;
                this.f37146c = view;
                this.f37147d = i;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.daaw.InterfaceC0785b0
            /* renamed from: a */
            public boolean mo864a(View view, InterfaceC0785b0.AbstractC0786a abstractC0786a) {
                BaseBehavior.this.mo886q(this.f37144a, this.f37145b, this.f37146c, 0, this.f37147d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        /* loaded from: classes2.dex */
        public class C4008c implements InterfaceC0785b0 {

            /* renamed from: a */
            public final /* synthetic */ AppBarLayout f37149a;

            /* renamed from: b */
            public final /* synthetic */ boolean f37150b;

            public C4008c(AppBarLayout appBarLayout, boolean z) {
                this.f37149a = appBarLayout;
                this.f37150b = z;
            }

            @Override // com.daaw.InterfaceC0785b0
            /* renamed from: a */
            public boolean mo864a(View view, InterfaceC0785b0.AbstractC0786a abstractC0786a) {
                this.f37149a.setExpanded(this.f37150b);
                return true;
            }
        }

        public BaseBehavior() {
            this.f37134n = -1;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f37134n = -1;
        }

        /* renamed from: Y */
        public static boolean m1036Y(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: a0 */
        public static View m1034a0(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // com.daaw.z80
        /* renamed from: M */
        public int mo1046M() {
            return mo1020E() + this.f37131k;
        }

        /* renamed from: S */
        public final void m1042S(CoordinatorLayout coordinatorLayout, T t, View view) {
            if (mo1046M() != (-t.getTotalScrollRange()) && view.canScrollVertically(1)) {
                m1041T(coordinatorLayout, t, C3654y.C3655a.f33181q, false);
            }
            if (mo1046M() != 0) {
                if (!view.canScrollVertically(-1)) {
                    m1041T(coordinatorLayout, t, C3654y.C3655a.f33182r, true);
                    return;
                }
                int i = -t.getDownNestedPreScrollRange();
                if (i != 0) {
                    xs1.m4710n0(coordinatorLayout, C3654y.C3655a.f33182r, null, new C4007b(coordinatorLayout, t, view, i));
                }
            }
        }

        /* renamed from: T */
        public final void m1041T(CoordinatorLayout coordinatorLayout, T t, C3654y.C3655a c3655a, boolean z) {
            xs1.m4710n0(coordinatorLayout, c3655a, null, new C4008c(t, z));
        }

        /* renamed from: U */
        public final void m1040U(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int abs = Math.abs(mo1046M() - i);
            float abs2 = Math.abs(f);
            m1039V(coordinatorLayout, t, i, abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / t.getHeight()) + 1.0f) * 150.0f));
        }

        /* renamed from: V */
        public final void m1039V(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int mo1046M = mo1046M();
            if (mo1046M == i) {
                ValueAnimator valueAnimator = this.f37133m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f37133m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f37133m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f37133m = valueAnimator3;
                valueAnimator3.setInterpolator(C1247f3.f9055e);
                this.f37133m.addUpdateListener(new C4006a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f37133m.setDuration(Math.min(i2, 600));
            this.f37133m.setIntValues(mo1046M, i);
            this.f37133m.start();
        }

        @Override // com.daaw.z80
        /* renamed from: W */
        public boolean mo1049H(T t) {
            WeakReference<View> weakReference = this.f37137q;
            if (weakReference != null) {
                View view = weakReference.get();
                return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
            }
            return true;
        }

        /* renamed from: X */
        public final boolean m1037X(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.m1063h() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        /* renamed from: Z */
        public final View m1035Z(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof es0) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: b0 */
        public final int m1033b0(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C4011c c4011c = (C4011c) childAt.getLayoutParams();
                if (m1036Y(c4011c.m999a(), 32)) {
                    top -= ((LinearLayout.LayoutParams) c4011c).topMargin;
                    bottom += ((LinearLayout.LayoutParams) c4011c).bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        @Override // com.daaw.z80
        /* renamed from: c0 */
        public int mo1048K(T t) {
            return -t.getDownNestedScrollRange();
        }

        @Override // com.daaw.z80
        /* renamed from: d0 */
        public int mo1047L(T t) {
            return t.getTotalScrollRange();
        }

        /* renamed from: e0 */
        public final int m1030e0(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                C4011c c4011c = (C4011c) childAt.getLayoutParams();
                Interpolator m998b = c4011c.m998b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (m998b != null) {
                    int m999a = c4011c.m999a();
                    if ((m999a & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) c4011c).topMargin + ((LinearLayout.LayoutParams) c4011c).bottomMargin;
                        if ((m999a & 2) != 0) {
                            i2 -= xs1.m4766F(childAt);
                        }
                    }
                    if (xs1.m4774B(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * m998b.getInterpolation((abs - childAt.getTop()) / f)));
                    }
                }
            }
            return i;
        }

        @Override // com.daaw.z80
        /* renamed from: f0 */
        public void mo1045N(CoordinatorLayout coordinatorLayout, T t) {
            m1026q0(coordinatorLayout, t);
            if (t.m1061j()) {
                t.m1055p(t.m1053r(m1035Z(coordinatorLayout)));
            }
        }

        @Override // com.daaw.ot1, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
        /* renamed from: g0 */
        public boolean mo126l(CoordinatorLayout coordinatorLayout, T t, int i) {
            boolean mo126l = super.mo126l(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            int i2 = this.f37134n;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i2);
                m2636P(coordinatorLayout, t, (-childAt.getBottom()) + (this.f37135o ? xs1.m4766F(childAt) + t.getTopInset() : Math.round(childAt.getHeight() * this.f37136p)));
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i3 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        m1040U(coordinatorLayout, t, i3, 0.0f);
                    } else {
                        m2636P(coordinatorLayout, t, i3);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m1040U(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        m2636P(coordinatorLayout, t, 0);
                    }
                }
            }
            t.m1059l();
            this.f37134n = -1;
            mo1019G(sn0.m10152b(mo1020E(), -t.getTotalScrollRange(), 0));
            m1024s0(coordinatorLayout, t, mo1020E(), 0, true);
            t.m1060k(mo1020E());
            m1025r0(coordinatorLayout, t);
            return mo126l;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
        /* renamed from: h0 */
        public boolean mo1002m(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0197f) t.getLayoutParams())).height == -2) {
                coordinatorLayout.m29815J(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
                return true;
            }
            return super.mo1002m(coordinatorLayout, t, i, i2, i3, i4);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
        /* renamed from: i0 */
        public void mo886q(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i4 = i6;
                    i5 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i4 = -t.getUpNestedPreScrollRange();
                    i5 = 0;
                }
                if (i4 != i5) {
                    iArr[1] = m2637O(coordinatorLayout, t, i2, i4, i5);
                }
            }
            if (t.m1061j()) {
                t.m1055p(t.m1053r(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
        /* renamed from: j0 */
        public void mo882t(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = m2637O(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                m1025r0(coordinatorLayout, t);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
        /* renamed from: k0 */
        public void mo878x(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (!(parcelable instanceof SavedState)) {
                super.mo878x(coordinatorLayout, t, parcelable);
                this.f37134n = -1;
                return;
            }
            SavedState savedState = (SavedState) parcelable;
            super.mo878x(coordinatorLayout, t, savedState.m29657a());
            this.f37134n = savedState.f37138r;
            this.f37136p = savedState.f37139s;
            this.f37135o = savedState.f37140t;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
        /* renamed from: l0 */
        public Parcelable mo877y(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable mo877y = super.mo877y(coordinatorLayout, t);
            int mo1020E = mo1020E();
            int childCount = t.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + mo1020E;
                if (childAt.getTop() + mo1020E <= 0 && bottom >= 0) {
                    SavedState savedState = new SavedState(mo877y);
                    savedState.f37138r = i;
                    savedState.f37140t = bottom == xs1.m4766F(childAt) + t.getTopInset();
                    savedState.f37139s = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return mo877y;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
        /* renamed from: m0 */
        public boolean mo928A(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.m1061j() || m1037X(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.f37133m) != null) {
                valueAnimator.cancel();
            }
            this.f37137q = null;
            this.f37132l = i2;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
        /* renamed from: n0 */
        public void mo927C(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.f37132l == 0 || i == 1) {
                m1026q0(coordinatorLayout, t);
                if (t.m1061j()) {
                    t.m1055p(t.m1053r(view));
                }
            }
            this.f37137q = new WeakReference<>(view);
        }

        @Override // com.daaw.z80
        /* renamed from: o0 */
        public int mo1044Q(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int mo1046M = mo1046M();
            int i4 = 0;
            if (i2 == 0 || mo1046M < i2 || mo1046M > i3) {
                this.f37131k = 0;
            } else {
                int m10152b = sn0.m10152b(i, i2, i3);
                if (mo1046M != m10152b) {
                    int m1030e0 = t.m1065f() ? m1030e0(t, m10152b) : m10152b;
                    boolean mo1019G = mo1019G(m1030e0);
                    i4 = mo1046M - m10152b;
                    this.f37131k = m10152b - m1030e0;
                    if (!mo1019G && t.m1065f()) {
                        coordinatorLayout.m29795f(t);
                    }
                    t.m1060k(mo1020E());
                    m1024s0(coordinatorLayout, t, m10152b, m10152b < mo1046M ? -1 : 1, false);
                }
            }
            m1025r0(coordinatorLayout, t);
            return i4;
        }

        /* renamed from: p0 */
        public final boolean m1027p0(CoordinatorLayout coordinatorLayout, T t) {
            List<View> m29788s = coordinatorLayout.m29788s(t);
            int size = m29788s.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.AbstractC0194c m29760f = ((CoordinatorLayout.C0197f) m29788s.get(i).getLayoutParams()).m29760f();
                if (m29760f instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) m29760f).m5425K() != 0;
                }
            }
            return false;
        }

        /* renamed from: q0 */
        public final void m1026q0(CoordinatorLayout coordinatorLayout, T t) {
            int mo1046M = mo1046M();
            int m1033b0 = m1033b0(t, mo1046M);
            if (m1033b0 >= 0) {
                View childAt = t.getChildAt(m1033b0);
                C4011c c4011c = (C4011c) childAt.getLayoutParams();
                int m999a = c4011c.m999a();
                if ((m999a & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (m1033b0 == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (m1036Y(m999a, 2)) {
                        i2 += xs1.m4766F(childAt);
                    } else if (m1036Y(m999a, 5)) {
                        int m4766F = xs1.m4766F(childAt) + i2;
                        if (mo1046M < m4766F) {
                            i = m4766F;
                        } else {
                            i2 = m4766F;
                        }
                    }
                    if (m1036Y(m999a, 32)) {
                        i += ((LinearLayout.LayoutParams) c4011c).topMargin;
                        i2 -= ((LinearLayout.LayoutParams) c4011c).bottomMargin;
                    }
                    if (mo1046M < (i2 + i) / 2) {
                        i = i2;
                    }
                    m1040U(coordinatorLayout, t, sn0.m10152b(i, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: r0 */
        public final void m1025r0(CoordinatorLayout coordinatorLayout, T t) {
            xs1.m4714l0(coordinatorLayout, C3654y.C3655a.f33181q.m4285b());
            xs1.m4714l0(coordinatorLayout, C3654y.C3655a.f33182r.m4285b());
            View m1035Z = m1035Z(coordinatorLayout);
            if (m1035Z == null || t.getTotalScrollRange() == 0 || !(((CoordinatorLayout.C0197f) m1035Z.getLayoutParams()).m29760f() instanceof ScrollingViewBehavior)) {
                return;
            }
            m1042S(coordinatorLayout, t, m1035Z);
        }

        /* renamed from: s0 */
        public final void m1024s0(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View m1034a0 = m1034a0(t, i);
            if (m1034a0 != null) {
                int m999a = ((C4011c) m1034a0.getLayoutParams()).m999a();
                boolean z2 = false;
                if ((m999a & 1) != 0) {
                    int m4766F = xs1.m4766F(m1034a0);
                    if (i2 <= 0 || (m999a & 12) == 0 ? !((m999a & 2) == 0 || (-i) < (m1034a0.getBottom() - m4766F) - t.getTopInset()) : (-i) >= (m1034a0.getBottom() - m4766F) - t.getTopInset()) {
                        z2 = true;
                    }
                }
                if (t.m1061j()) {
                    z2 = t.m1053r(m1035Z(coordinatorLayout));
                }
                boolean m1055p = t.m1055p(z2);
                if (z || (m1055p && m1027p0(coordinatorLayout, t))) {
                    t.jumpDrawablesToCurrentState();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.daaw.ot1
        /* renamed from: E */
        public /* bridge */ /* synthetic */ int mo1020E() {
            return super.mo1020E();
        }

        @Override // com.daaw.ot1
        /* renamed from: G */
        public /* bridge */ /* synthetic */ boolean mo1019G(int i) {
            return super.mo1019G(i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: g0 */
        public /* bridge */ /* synthetic */ boolean mo1018g0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.mo126l(coordinatorLayout, appBarLayout, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: h0 */
        public /* bridge */ /* synthetic */ boolean mo1017h0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.mo1002m(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: i0 */
        public /* bridge */ /* synthetic */ void mo1016i0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.mo886q(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: j0 */
        public /* bridge */ /* synthetic */ void mo1015j0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.mo882t(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: k0 */
        public /* bridge */ /* synthetic */ void mo1014k0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.mo878x(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: l0 */
        public /* bridge */ /* synthetic */ Parcelable mo1013l0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.mo877y(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: m0 */
        public /* bridge */ /* synthetic */ boolean mo1012m0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.mo928A(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: n0 */
        public /* bridge */ /* synthetic */ void mo1011n0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.mo927C(coordinatorLayout, appBarLayout, view, i);
        }
    }

    /* loaded from: classes2.dex */
    public static class ScrollingViewBehavior extends x90 {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m21.f18130R3);
            m5422O(obtainStyledAttributes.getDimensionPixelSize(m21.f18137S3, 0));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: R */
        public static int m1006R(AppBarLayout appBarLayout) {
            CoordinatorLayout.AbstractC0194c m29760f = ((CoordinatorLayout.C0197f) appBarLayout.getLayoutParams()).m29760f();
            if (m29760f instanceof BaseBehavior) {
                return ((BaseBehavior) m29760f).mo1046M();
            }
            return 0;
        }

        @Override // com.daaw.x90
        /* renamed from: J */
        public float mo1009J(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int m1006R = m1006R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + m1006R > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (m1006R / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.daaw.x90
        /* renamed from: L */
        public int mo1008L(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.mo1008L(view);
        }

        @Override // com.daaw.x90
        /* renamed from: Q */
        public AppBarLayout mo1010H(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* renamed from: S */
        public final void m1005S(View view, View view2) {
            CoordinatorLayout.AbstractC0194c m29760f = ((CoordinatorLayout.C0197f) view2.getLayoutParams()).m29760f();
            if (m29760f instanceof BaseBehavior) {
                xs1.m4732c0(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) m29760f).f37131k) + m5424M()) - m5426I(view2));
            }
        }

        /* renamed from: T */
        public final void m1004T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.m1061j()) {
                    appBarLayout.m1055p(appBarLayout.m1053r(view));
                }
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
        /* renamed from: e */
        public boolean mo99e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
        /* renamed from: h */
        public boolean mo127h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m1005S(view, view2);
            m1004T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
        /* renamed from: i */
        public void mo1003i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                xs1.m4714l0(coordinatorLayout, C3654y.C3655a.f33181q.m4285b());
                xs1.m4714l0(coordinatorLayout, C3654y.C3655a.f33182r.m4285b());
            }
        }

        @Override // com.daaw.ot1, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
        /* renamed from: l */
        public /* bridge */ /* synthetic */ boolean mo126l(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.mo126l(coordinatorLayout, view, i);
        }

        @Override // com.daaw.x90, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
        /* renamed from: m */
        public /* bridge */ /* synthetic */ boolean mo1002m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.mo1002m(coordinatorLayout, view, i, i2, i3, i4);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
        /* renamed from: w */
        public boolean mo1001w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout mo1010H = mo1010H(coordinatorLayout.m29789r(view));
            if (mo1010H != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f32189d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    mo1010H.m1058m(false, !z);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    /* loaded from: classes2.dex */
    public class C4009a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ nn0 f37152a;

        public C4009a(nn0 nn0Var) {
            this.f37152a = nn0Var;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f37152a.m14998V(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC4010b<T extends AppBarLayout> {
        /* renamed from: a */
        void m1000a(T t, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    /* loaded from: classes2.dex */
    public static class C4011c extends LinearLayout.LayoutParams {

        /* renamed from: a */
        public int f37154a;

        /* renamed from: b */
        public Interpolator f37155b;

        public C4011c(int i, int i2) {
            super(i, i2);
            this.f37154a = 1;
        }

        public C4011c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f37154a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m21.f18285m);
            this.f37154a = obtainStyledAttributes.getInt(m21.f18293n, 0);
            int i = m21.f18300o;
            if (obtainStyledAttributes.hasValue(i)) {
                this.f37155b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public C4011c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f37154a = 1;
        }

        public C4011c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f37154a = 1;
        }

        public C4011c(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f37154a = 1;
        }

        /* renamed from: a */
        public int m999a() {
            return this.f37154a;
        }

        /* renamed from: b */
        public Interpolator m998b() {
            return this.f37155b;
        }

        /* renamed from: c */
        public boolean m997c() {
            int i = this.f37154a;
            return (i & 1) == 1 && (i & 10) != 0;
        }
    }

    /* renamed from: a */
    public final void m1070a() {
        WeakReference<View> weakReference = this.f37116C;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f37116C = null;
    }

    /* renamed from: b */
    public final View m1069b(View view) {
        int i;
        if (this.f37116C == null && (i = this.f37115B) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f37115B);
            }
            if (findViewById != null) {
                this.f37116C = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f37116C;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: c */
    public C4011c generateDefaultLayoutParams() {
        return new C4011c(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C4011c;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: d */
    public C4011c generateLayoutParams(AttributeSet attributeSet) {
        return new C4011c(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m1054q()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f37120p);
            this.f37119F.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f37119F;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: e */
    public C4011c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new C4011c((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C4011c((ViewGroup.MarginLayoutParams) layoutParams) : new C4011c(layoutParams);
    }

    /* renamed from: f */
    public boolean m1065f() {
        return this.f37124t;
    }

    /* renamed from: g */
    public final boolean m1064g() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C4011c) getChildAt(i).getLayoutParams()).m997c()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0193b
    public CoordinatorLayout.AbstractC0194c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    public int getDownNestedPreScrollRange() {
        int i;
        int m4766F;
        int i2 = this.f37122r;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C4011c c4011c = (C4011c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = c4011c.f37154a;
            if ((i4 & 5) == 5) {
                int i5 = ((LinearLayout.LayoutParams) c4011c).topMargin + ((LinearLayout.LayoutParams) c4011c).bottomMargin;
                if ((i4 & 8) != 0) {
                    m4766F = xs1.m4766F(childAt);
                } else if ((i4 & 2) != 0) {
                    m4766F = measuredHeight - xs1.m4766F(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && xs1.m4774B(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = i5 + m4766F;
                if (childCount == 0) {
                    i = Math.min(i, measuredHeight - getTopInset());
                }
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f37122r = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.f37123s;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C4011c c4011c = (C4011c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) c4011c).topMargin + ((LinearLayout.LayoutParams) c4011c).bottomMargin;
            int i4 = c4011c.f37154a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= xs1.m4766F(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f37123s = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f37115B;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int m4766F = xs1.m4766F(this);
        if (m4766F == 0) {
            int childCount = getChildCount();
            m4766F = childCount >= 1 ? xs1.m4766F(getChildAt(childCount - 1)) : 0;
            if (m4766F == 0) {
                return getHeight() / 3;
            }
        }
        return (m4766F * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f37125u;
    }

    public Drawable getStatusBarForeground() {
        return this.f37119F;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        px1 px1Var = this.f37126v;
        if (px1Var != null) {
            return px1Var.m12949l();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f37121q;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C4011c c4011c = (C4011c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = c4011c.f37154a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + ((LinearLayout.LayoutParams) c4011c).topMargin + ((LinearLayout.LayoutParams) c4011c).bottomMargin;
            if (i2 == 0 && xs1.m4774B(childAt)) {
                i3 -= getTopInset();
            }
            if ((i4 & 2) != 0) {
                i3 -= xs1.m4766F(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f37121q = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* renamed from: h */
    public boolean m1063h() {
        return getTotalScrollRange() != 0;
    }

    /* renamed from: i */
    public final void m1062i() {
        this.f37121q = -1;
        this.f37122r = -1;
        this.f37123s = -1;
    }

    /* renamed from: j */
    public boolean m1061j() {
        return this.f37114A;
    }

    /* renamed from: k */
    public void m1060k(int i) {
        this.f37120p = i;
        if (!willNotDraw()) {
            xs1.m4720i0(this);
        }
        List<InterfaceC4010b> list = this.f37127w;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC4010b interfaceC4010b = this.f37127w.get(i2);
                if (interfaceC4010b != null) {
                    interfaceC4010b.m1000a(this, i);
                }
            }
        }
    }

    /* renamed from: l */
    public void m1059l() {
        this.f37125u = 0;
    }

    /* renamed from: m */
    public void m1058m(boolean z, boolean z2) {
        m1057n(z, z2, true);
    }

    /* renamed from: n */
    public final void m1057n(boolean z, boolean z2, boolean z3) {
        this.f37125u = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    /* renamed from: o */
    public final boolean m1056o(boolean z) {
        if (this.f37129y != z) {
            this.f37129y = z;
            refreshDrawableState();
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        on0.m14141e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.f37118E == null) {
            this.f37118E = new int[4];
        }
        int[] iArr = this.f37118E;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f37129y;
        int i2 = w01.state_liftable;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (z && this.f37130z) ? w01.state_lifted : -w01.state_lifted;
        int i3 = w01.state_collapsible;
        if (!z) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (z && this.f37130z) ? w01.state_collapsed : -w01.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1070a();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (xs1.m4774B(this) && m1052s()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                xs1.m4732c0(getChildAt(childCount), topInset);
            }
        }
        m1062i();
        this.f37124t = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((C4011c) getChildAt(i5).getLayoutParams()).m998b() != null) {
                this.f37124t = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f37119F;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f37128x) {
            return;
        }
        if (!this.f37114A && !m1064g()) {
            z2 = false;
        }
        m1056o(z2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && xs1.m4774B(this) && m1052s()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = sn0.m10152b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m1062i();
    }

    /* renamed from: p */
    public boolean m1055p(boolean z) {
        if (this.f37130z != z) {
            this.f37130z = z;
            refreshDrawableState();
            if (this.f37114A && (getBackground() instanceof nn0)) {
                m1051t((nn0) getBackground(), z);
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final boolean m1054q() {
        return this.f37119F != null && getTopInset() > 0;
    }

    /* renamed from: r */
    public boolean m1053r(View view) {
        View m1069b = m1069b(view);
        if (m1069b != null) {
            view = m1069b;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    /* renamed from: s */
    public final boolean m1052s() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            return (childAt.getVisibility() == 8 || xs1.m4774B(childAt)) ? false : true;
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        on0.m14142d(this, f);
    }

    public void setExpanded(boolean z) {
        m1058m(z, xs1.m4742V(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f37114A = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f37115B = i;
        m1070a();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f37119F;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f37119F = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f37119F.setState(getDrawableState());
                }
                C2366nu.m14814m(this.f37119F, xs1.m4768E(this));
                this.f37119F.setVisible(getVisibility() == 0, false);
                this.f37119F.setCallback(this);
            }
            m1050u();
            xs1.m4720i0(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C2818r4.m11783b(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            ou1.m13929a(this, f);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f37119F;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* renamed from: t */
    public final void m1051t(nn0 nn0Var, boolean z) {
        float dimension = getResources().getDimension(f11.design_appbar_elevation);
        float f = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f37117D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, dimension);
        this.f37117D = ofFloat;
        ofFloat.setDuration(getResources().getInteger(y11.app_bar_elevation_anim_duration));
        this.f37117D.setInterpolator(C1247f3.f9051a);
        this.f37117D.addUpdateListener(new C4009a(nn0Var));
        this.f37117D.start();
    }

    /* renamed from: u */
    public final void m1050u() {
        setWillNotDraw(!m1054q());
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f37119F;
    }
}
