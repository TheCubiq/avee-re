package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.daaw.at1;
import com.daaw.b0;
import com.daaw.f11;
import com.daaw.fu1;
import com.daaw.gc1;
import com.daaw.h21;
import com.daaw.k21;
import com.daaw.m21;
import com.daaw.mn0;
import com.daaw.nn0;
import com.daaw.px1;
import com.daaw.sn0;
import com.daaw.w01;
import com.daaw.xs1;
import com.daaw.y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public static final int R = k21.Widget_Design_BottomSheet_Modal;
    public at1 A;
    public boolean B;
    public int C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public WeakReference<V> H;
    public WeakReference<View> I;
    public final ArrayList<f> J;
    public VelocityTracker K;
    public int L;
    public int M;
    public boolean N;
    public Map<View, Integer> O;
    public int P;
    public final at1.c Q;
    public int a;
    public boolean b;
    public boolean c;
    public float d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public boolean i;
    public nn0 j;
    public int k;
    public boolean l;
    public gc1 m;
    public boolean n;
    public BottomSheetBehavior<V>.g o;
    public ValueAnimator p;
    public int q;
    public int r;
    public int s;
    public float t;
    public int u;
    public float v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final int r;
        public int s;
        public boolean t;
        public boolean u;
        public boolean v;

        /* loaded from: classes2.dex */
        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
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
            this.r = parcel.readInt();
            this.s = parcel.readInt();
            this.t = parcel.readInt() == 1;
            this.u = parcel.readInt() == 1;
            this.v = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.r = bottomSheetBehavior.z;
            this.s = bottomSheetBehavior.e;
            this.t = bottomSheetBehavior.b;
            this.u = bottomSheetBehavior.w;
            this.v = bottomSheetBehavior.x;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.r);
            parcel.writeInt(this.s);
            parcel.writeInt(this.t ? 1 : 0);
            parcel.writeInt(this.u ? 1 : 0);
            parcel.writeInt(this.v ? 1 : 0);
        }
    }

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public final /* synthetic */ View p;
        public final /* synthetic */ int q;

        public a(View view, int i) {
            this.p = view;
            this.q = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.o0(this.p, this.q);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.j != null) {
                BottomSheetBehavior.this.j.X(floatValue);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements fu1.c {
        public c() {
        }

        @Override // com.daaw.fu1.c
        public px1 a(View view, px1 px1Var, fu1.d dVar) {
            BottomSheetBehavior.this.k = px1Var.g().d;
            BottomSheetBehavior.this.v0(false);
            return px1Var;
        }
    }

    /* loaded from: classes2.dex */
    public class d extends at1.c {
        public d() {
        }

        @Override // com.daaw.at1.c
        public int a(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // com.daaw.at1.c
        public int b(View view, int i, int i2) {
            int V = BottomSheetBehavior.this.V();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return sn0.b(i, V, bottomSheetBehavior.w ? bottomSheetBehavior.G : bottomSheetBehavior.u);
        }

        @Override // com.daaw.at1.c
        public int e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.w ? bottomSheetBehavior.G : bottomSheetBehavior.u;
        }

        @Override // com.daaw.at1.c
        public void j(int i) {
            if (i == 1 && BottomSheetBehavior.this.y) {
                BottomSheetBehavior.this.m0(1);
            }
        }

        @Override // com.daaw.at1.c
        public void k(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.T(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
            if (java.lang.Math.abs(r7.getTop() - r6.a.q) < java.lang.Math.abs(r7.getTop() - r6.a.s)) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
            r8 = r6.a.q;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00b1, code lost:
            if (java.lang.Math.abs(r8 - r6.a.s) < java.lang.Math.abs(r8 - r6.a.u)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
            if (java.lang.Math.abs(r8 - r6.a.r) < java.lang.Math.abs(r8 - r6.a.u)) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00ea, code lost:
            if (r8 < java.lang.Math.abs(r8 - r9.u)) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00fc, code lost:
            if (java.lang.Math.abs(r8 - r0) < java.lang.Math.abs(r8 - r6.a.u)) goto L31;
         */
        @Override // com.daaw.at1.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void l(android.view.View r7, float r8, float r9) {
            /*
                Method dump skipped, instructions count: 262
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.l(android.view.View, float, float):void");
        }

        @Override // com.daaw.at1.c
        public boolean m(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.z;
            if (i2 == 1 || bottomSheetBehavior.N) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.L == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.I;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.H;
            return weakReference2 != null && weakReference2.get() == view;
        }

        public final boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.G + bottomSheetBehavior.V()) / 2;
        }
    }

    /* loaded from: classes2.dex */
    public class e implements b0 {
        public final /* synthetic */ int a;

        public e(int i) {
            this.a = i;
        }

        @Override // com.daaw.b0
        public boolean a(View view, b0.a aVar) {
            BottomSheetBehavior.this.l0(this.a);
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class f {
        public abstract void a(View view, float f);

        public abstract void b(View view, int i);
    }

    /* loaded from: classes2.dex */
    public class g implements Runnable {
        public final View p;
        public boolean q;
        public int r;

        public g(View view, int i) {
            this.p = view;
            this.r = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            at1 at1Var = BottomSheetBehavior.this.A;
            if (at1Var == null || !at1Var.m(true)) {
                BottomSheetBehavior.this.m0(this.r);
            } else {
                xs1.j0(this.p, this);
            }
            this.q = false;
        }
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.c = false;
        this.o = null;
        this.t = 0.5f;
        this.v = -1.0f;
        this.y = true;
        this.z = 4;
        this.J = new ArrayList<>();
        this.P = -1;
        this.Q = new d();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.a = 0;
        this.b = true;
        this.c = false;
        this.o = null;
        this.t = 0.5f;
        this.v = -1.0f;
        this.y = true;
        this.z = 4;
        this.J = new ArrayList<>();
        this.P = -1;
        this.Q = new d();
        this.h = context.getResources().getDimensionPixelSize(f11.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m21.y);
        this.i = obtainStyledAttributes.hasValue(m21.K);
        int i2 = m21.A;
        boolean hasValue = obtainStyledAttributes.hasValue(i2);
        if (hasValue) {
            R(context, attributeSet, hasValue, mn0.a(context, obtainStyledAttributes, i2));
        } else {
            Q(context, attributeSet, hasValue);
        }
        S();
        if (Build.VERSION.SDK_INT >= 21) {
            this.v = obtainStyledAttributes.getDimension(m21.z, -1.0f);
        }
        int i3 = m21.G;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i3);
        if (peekValue == null || (i = peekValue.data) != -1) {
            h0(obtainStyledAttributes.getDimensionPixelSize(i3, -1));
        } else {
            h0(i);
        }
        g0(obtainStyledAttributes.getBoolean(m21.F, false));
        e0(obtainStyledAttributes.getBoolean(m21.J, false));
        d0(obtainStyledAttributes.getBoolean(m21.D, true));
        k0(obtainStyledAttributes.getBoolean(m21.I, false));
        b0(obtainStyledAttributes.getBoolean(m21.B, true));
        j0(obtainStyledAttributes.getInt(m21.H, 0));
        f0(obtainStyledAttributes.getFloat(m21.E, 0.5f));
        int i4 = m21.C;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i4);
        c0((peekValue2 == null || peekValue2.type != 16) ? obtainStyledAttributes.getDimensionPixelOffset(i4, 0) : peekValue2.data);
        obtainStyledAttributes.recycle();
        this.d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.C = 0;
        this.D = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
        if (java.lang.Math.abs(r3 - r2.r) < java.lang.Math.abs(r3 - r2.u)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0078, code lost:
        if (r3 < java.lang.Math.abs(r3 - r2.u)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0088, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.u)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a6, code lost:
        if (java.lang.Math.abs(r3 - r2.s) < java.lang.Math.abs(r3 - r2.u)) goto L40;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.V()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.m0(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r3 = r2.I
            if (r3 == 0) goto Lb1
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb1
            boolean r3 = r2.D
            if (r3 != 0) goto L1f
            goto Lb1
        L1f:
            int r3 = r2.C
            r5 = 4
            r6 = 6
            if (r3 <= 0) goto L3c
            boolean r3 = r2.b
            if (r3 == 0) goto L2d
        L29:
            int r3 = r2.r
            goto Lab
        L2d:
            int r3 = r4.getTop()
            int r5 = r2.s
            if (r3 <= r5) goto L38
            r3 = r5
            goto Laa
        L38:
            int r3 = r2.q
            goto Lab
        L3c:
            boolean r3 = r2.w
            if (r3 == 0) goto L4e
            float r3 = r2.W()
            boolean r3 = r2.q0(r4, r3)
            if (r3 == 0) goto L4e
            int r3 = r2.G
            r0 = 5
            goto Lab
        L4e:
            int r3 = r2.C
            if (r3 != 0) goto L8b
            int r3 = r4.getTop()
            boolean r1 = r2.b
            if (r1 == 0) goto L6c
            int r6 = r2.r
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            int r1 = r2.u
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r6 >= r3) goto L8f
            goto L29
        L6c:
            int r1 = r2.s
            if (r3 >= r1) goto L7b
            int r5 = r2.u
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            if (r3 >= r5) goto La8
            goto L38
        L7b:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.u
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L8f
            goto La8
        L8b:
            boolean r3 = r2.b
            if (r3 == 0) goto L93
        L8f:
            int r3 = r2.u
            r0 = 4
            goto Lab
        L93:
            int r3 = r4.getTop()
            int r0 = r2.s
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.u
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L8f
        La8:
            int r3 = r2.s
        Laa:
            r0 = 6
        Lab:
            r5 = 0
            r2.r0(r4, r0, r3, r5)
            r2.D = r5
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (v.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (this.z == 1 && actionMasked == 0) {
                return true;
            }
            at1 at1Var = this.A;
            if (at1Var != null) {
                at1Var.E(motionEvent);
            }
            if (actionMasked == 0) {
                Z();
            }
            if (this.K == null) {
                this.K = VelocityTracker.obtain();
            }
            this.K.addMovement(motionEvent);
            if (this.A != null && actionMasked == 2 && !this.B && Math.abs(this.M - motionEvent.getY()) > this.A.y()) {
                this.A.b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            return !this.B;
        }
        return false;
    }

    public final int L(V v, int i, int i2) {
        return xs1.c(v, v.getResources().getString(i), P(i2));
    }

    public final void M() {
        int O = O();
        if (this.b) {
            this.u = Math.max(this.G - O, this.r);
        } else {
            this.u = this.G - O;
        }
    }

    public final void N() {
        this.s = (int) (this.G * (1.0f - this.t));
    }

    public final int O() {
        int i;
        return this.f ? Math.min(Math.max(this.g, this.G - ((this.F * 9) / 16)), this.E) : (this.l || (i = this.k) <= 0) ? this.e : Math.max(this.e, i + this.h);
    }

    public final b0 P(int i) {
        return new e(i);
    }

    public final void Q(Context context, AttributeSet attributeSet, boolean z) {
        R(context, attributeSet, z, null);
    }

    public final void R(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.i) {
            this.m = gc1.e(context, attributeSet, w01.bottomSheetStyle, R).m();
            nn0 nn0Var = new nn0(this.m);
            this.j = nn0Var;
            nn0Var.M(context);
            if (z && colorStateList != null) {
                this.j.W(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.j.setTint(typedValue.data);
        }
    }

    public final void S() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.p = ofFloat;
        ofFloat.setDuration(500L);
        this.p.addUpdateListener(new b());
    }

    public void T(int i) {
        float f2;
        float f3;
        V v = this.H.get();
        if (v == null || this.J.isEmpty()) {
            return;
        }
        int i2 = this.u;
        if (i > i2 || i2 == V()) {
            int i3 = this.u;
            f2 = i3 - i;
            f3 = this.G - i3;
        } else {
            int i4 = this.u;
            f2 = i4 - i;
            f3 = i4 - V();
        }
        float f4 = f2 / f3;
        for (int i5 = 0; i5 < this.J.size(); i5++) {
            this.J.get(i5).a(v, f4);
        }
    }

    public View U(View view) {
        if (xs1.W(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View U = U(viewGroup.getChildAt(i));
                if (U != null) {
                    return U;
                }
            }
            return null;
        }
        return null;
    }

    public int V() {
        return this.b ? this.r : this.q;
    }

    public final float W() {
        VelocityTracker velocityTracker = this.K;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.d);
        return this.K.getYVelocity(this.L);
    }

    public boolean X() {
        return this.l;
    }

    public final void Y(V v, y.a aVar, int i) {
        xs1.n0(v, aVar, null, P(i));
    }

    public final void Z() {
        this.L = -1;
        VelocityTracker velocityTracker = this.K;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.K = null;
        }
    }

    public final void a0(SavedState savedState) {
        int i = this.a;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.e = savedState.s;
        }
        if (i == -1 || (i & 2) == 2) {
            this.b = savedState.t;
        }
        if (i == -1 || (i & 4) == 4) {
            this.w = savedState.u;
        }
        if (i == -1 || (i & 8) == 8) {
            this.x = savedState.v;
        }
    }

    public void b0(boolean z) {
        this.y = z;
    }

    public void c0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.q = i;
    }

    public void d0(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        if (this.H != null) {
            M();
        }
        m0((this.b && this.z == 6) ? 3 : this.z);
        s0();
    }

    public void e0(boolean z) {
        this.l = z;
    }

    public void f0(float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.t = f2;
        if (this.H != null) {
            N();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.H = null;
        this.A = null;
    }

    public void g0(boolean z) {
        if (this.w != z) {
            this.w = z;
            if (!z && this.z == 5) {
                l0(4);
            }
            s0();
        }
    }

    public void h0(int i) {
        i0(i, false);
    }

    public final void i0(int i, boolean z) {
        boolean z2 = true;
        if (i == -1) {
            if (!this.f) {
                this.f = true;
            }
            z2 = false;
        } else {
            if (this.f || this.e != i) {
                this.f = false;
                this.e = Math.max(0, i);
            }
            z2 = false;
        }
        if (z2) {
            v0(z);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.H = null;
        this.A = null;
    }

    public void j0(int i) {
        this.a = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        at1 at1Var;
        if (!v.isShown() || !this.y) {
            this.B = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            Z();
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.M = (int) motionEvent.getY();
            if (this.z != 2) {
                WeakReference<View> weakReference = this.I;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.B(view, x, this.M)) {
                    this.L = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.N = true;
                }
            }
            this.B = this.L == -1 && !coordinatorLayout.B(v, x, this.M);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.N = false;
            this.L = -1;
            if (this.B) {
                this.B = false;
                return false;
            }
        }
        if (this.B || (at1Var = this.A) == null || !at1Var.N(motionEvent)) {
            WeakReference<View> weakReference2 = this.I;
            View view2 = weakReference2 != null ? weakReference2.get() : null;
            return (actionMasked != 2 || view2 == null || this.B || this.z == 1 || coordinatorLayout.B(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.A == null || Math.abs(((float) this.M) - motionEvent.getY()) <= ((float) this.A.y())) ? false : true;
        }
        return true;
    }

    public void k0(boolean z) {
        this.x = z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2;
        nn0 nn0Var;
        if (xs1.B(coordinatorLayout) && !xs1.B(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.H == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(f11.design_bottom_sheet_peek_height_min);
            n0(v);
            this.H = new WeakReference<>(v);
            if (this.i && (nn0Var = this.j) != null) {
                xs1.v0(v, nn0Var);
            }
            nn0 nn0Var2 = this.j;
            if (nn0Var2 != null) {
                float f2 = this.v;
                if (f2 == -1.0f) {
                    f2 = xs1.y(v);
                }
                nn0Var2.V(f2);
                boolean z = this.z == 3;
                this.n = z;
                this.j.X(z ? 0.0f : 1.0f);
            }
            s0();
            if (xs1.C(v) == 0) {
                xs1.B0(v, 1);
            }
        }
        if (this.A == null) {
            this.A = at1.o(coordinatorLayout, this.Q);
        }
        int top = v.getTop();
        coordinatorLayout.I(v, i);
        this.F = coordinatorLayout.getWidth();
        this.G = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.E = height;
        this.r = Math.max(0, this.G - height);
        N();
        M();
        int i3 = this.z;
        if (i3 == 3) {
            i2 = V();
        } else if (i3 == 6) {
            i2 = this.s;
        } else if (this.w && i3 == 5) {
            i2 = this.G;
        } else if (i3 != 4) {
            if (i3 == 1 || i3 == 2) {
                xs1.c0(v, top - v.getTop());
            }
            this.I = new WeakReference<>(U(v));
            return true;
        } else {
            i2 = this.u;
        }
        xs1.c0(v, i2);
        this.I = new WeakReference<>(U(v));
        return true;
    }

    public void l0(int i) {
        if (i == this.z) {
            return;
        }
        if (this.H != null) {
            p0(i);
        } else if (i == 4 || i == 3 || i == 6 || (this.w && i == 5)) {
            this.z = i;
        }
    }

    public void m0(int i) {
        V v;
        if (this.z == i) {
            return;
        }
        this.z = i;
        WeakReference<V> weakReference = this.H;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            u0(true);
        } else if (i == 6 || i == 5 || i == 4) {
            u0(false);
        }
        t0(i);
        for (int i2 = 0; i2 < this.J.size(); i2++) {
            this.J.get(i2).b(v, i);
        }
        s0();
    }

    public final void n0(View view) {
        if (Build.VERSION.SDK_INT < 29 || X() || this.f) {
            return;
        }
        fu1.a(view, new c());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3) {
        WeakReference<View> weakReference = this.I;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.z != 3 || super.o(coordinatorLayout, v, view, f2, f3);
    }

    public void o0(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.u;
        } else if (i == 6) {
            int i4 = this.s;
            if (!this.b || i4 > (i3 = this.r)) {
                i2 = i4;
            } else {
                i2 = i3;
                i = 3;
            }
        } else if (i == 3) {
            i2 = V();
        } else if (!this.w || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        } else {
            i2 = this.G;
        }
        r0(view, i, i2, false);
    }

    public final void p0(int i) {
        V v = this.H.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && xs1.U(v)) {
            v.post(new a(v, i));
        } else {
            o0(v, i);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.I;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i5 = top - i2;
        if (i2 > 0) {
            if (i5 < V()) {
                iArr[1] = top - V();
                xs1.c0(v, -iArr[1]);
                i4 = 3;
                m0(i4);
            } else if (!this.y) {
                return;
            } else {
                iArr[1] = i2;
                xs1.c0(v, -i2);
                m0(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i6 = this.u;
            if (i5 > i6 && !this.w) {
                iArr[1] = top - i6;
                xs1.c0(v, -iArr[1]);
                i4 = 4;
                m0(i4);
            } else if (!this.y) {
                return;
            } else {
                iArr[1] = i2;
                xs1.c0(v, -i2);
                m0(1);
            }
        }
        T(v.getTop());
        this.C = i2;
        this.D = true;
    }

    public boolean q0(View view, float f2) {
        if (this.x) {
            return true;
        }
        if (view.getTop() < this.u) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.u)) / ((float) O()) > 0.5f;
    }

    public void r0(View view, int i, int i2, boolean z) {
        at1 at1Var = this.A;
        if (!(at1Var != null && (!z ? !at1Var.O(view, view.getLeft(), i2) : !at1Var.M(view.getLeft(), i2)))) {
            m0(i);
            return;
        }
        m0(2);
        t0(i);
        if (this.o == null) {
            this.o = new g(view, i);
        }
        if (this.o.q) {
            this.o.r = i;
            return;
        }
        BottomSheetBehavior<V>.g gVar = this.o;
        gVar.r = i;
        xs1.j0(view, gVar);
        this.o.q = true;
    }

    public final void s0() {
        V v;
        int i;
        y.a aVar;
        WeakReference<V> weakReference = this.H;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        xs1.l0(v, 524288);
        xs1.l0(v, 262144);
        xs1.l0(v, 1048576);
        int i2 = this.P;
        if (i2 != -1) {
            xs1.l0(v, i2);
        }
        if (this.z != 6) {
            this.P = L(v, h21.bottomsheet_action_expand_halfway, 6);
        }
        if (this.w && this.z != 5) {
            Y(v, y.a.y, 5);
        }
        int i3 = this.z;
        if (i3 == 3) {
            i = this.b ? 4 : 6;
            aVar = y.a.x;
        } else if (i3 != 4) {
            if (i3 != 6) {
                return;
            }
            Y(v, y.a.x, 4);
            Y(v, y.a.w, 3);
            return;
        } else {
            i = this.b ? 3 : 6;
            aVar = y.a.w;
        }
        Y(v, aVar, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    public final void t0(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.n != z) {
            this.n = z;
            if (this.j == null || (valueAnimator = this.p) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.p.reverse();
                return;
            }
            float f2 = z ? 0.0f : 1.0f;
            this.p.setFloatValues(1.0f - f2, f2);
            this.p.start();
        }
    }

    public final void u0(boolean z) {
        Map<View, Integer> map;
        int intValue;
        WeakReference<V> weakReference = this.H;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.O != null) {
                    return;
                }
                this.O = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.H.get()) {
                    if (z) {
                        this.O.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.c) {
                            intValue = 4;
                            xs1.B0(childAt, intValue);
                        }
                    } else if (this.c && (map = this.O) != null && map.containsKey(childAt)) {
                        intValue = this.O.get(childAt).intValue();
                        xs1.B0(childAt, intValue);
                    }
                }
            }
            if (!z) {
                this.O = null;
            } else if (this.c) {
                this.H.get().sendAccessibilityEvent(8);
            }
        }
    }

    public final void v0(boolean z) {
        V v;
        if (this.H != null) {
            M();
            if (this.z != 4 || (v = this.H.get()) == null) {
                return;
            }
            if (z) {
                p0(this.z);
            } else {
                v.requestLayout();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.x(coordinatorLayout, v, savedState.a());
        a0(savedState);
        int i = savedState.r;
        this.z = (i == 1 || i == 2) ? 4 : 4;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.y(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }
}
