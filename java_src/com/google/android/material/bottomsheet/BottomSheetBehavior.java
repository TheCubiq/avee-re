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
import com.daaw.C3654y;
import com.daaw.InterfaceC0785b0;
import com.daaw.at1;
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
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0194c<V> {

    /* renamed from: R */
    public static final int f37221R = k21.Widget_Design_BottomSheet_Modal;

    /* renamed from: A */
    public at1 f37222A;

    /* renamed from: B */
    public boolean f37223B;

    /* renamed from: C */
    public int f37224C;

    /* renamed from: D */
    public boolean f37225D;

    /* renamed from: E */
    public int f37226E;

    /* renamed from: F */
    public int f37227F;

    /* renamed from: G */
    public int f37228G;

    /* renamed from: H */
    public WeakReference<V> f37229H;

    /* renamed from: I */
    public WeakReference<View> f37230I;

    /* renamed from: J */
    public final ArrayList<AbstractC4033f> f37231J;

    /* renamed from: K */
    public VelocityTracker f37232K;

    /* renamed from: L */
    public int f37233L;

    /* renamed from: M */
    public int f37234M;

    /* renamed from: N */
    public boolean f37235N;

    /* renamed from: O */
    public Map<View, Integer> f37236O;

    /* renamed from: P */
    public int f37237P;

    /* renamed from: Q */
    public final at1.AbstractC0673c f37238Q;

    /* renamed from: a */
    public int f37239a;

    /* renamed from: b */
    public boolean f37240b;

    /* renamed from: c */
    public boolean f37241c;

    /* renamed from: d */
    public float f37242d;

    /* renamed from: e */
    public int f37243e;

    /* renamed from: f */
    public boolean f37244f;

    /* renamed from: g */
    public int f37245g;

    /* renamed from: h */
    public int f37246h;

    /* renamed from: i */
    public boolean f37247i;

    /* renamed from: j */
    public nn0 f37248j;

    /* renamed from: k */
    public int f37249k;

    /* renamed from: l */
    public boolean f37250l;

    /* renamed from: m */
    public gc1 f37251m;

    /* renamed from: n */
    public boolean f37252n;

    /* renamed from: o */
    public BottomSheetBehavior<V>.RunnableC4034g f37253o;

    /* renamed from: p */
    public ValueAnimator f37254p;

    /* renamed from: q */
    public int f37255q;

    /* renamed from: r */
    public int f37256r;

    /* renamed from: s */
    public int f37257s;

    /* renamed from: t */
    public float f37258t;

    /* renamed from: u */
    public int f37259u;

    /* renamed from: v */
    public float f37260v;

    /* renamed from: w */
    public boolean f37261w;

    /* renamed from: x */
    public boolean f37262x;

    /* renamed from: y */
    public boolean f37263y;

    /* renamed from: z */
    public int f37264z;

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4027a();

        /* renamed from: r */
        public final int f37265r;

        /* renamed from: s */
        public int f37266s;

        /* renamed from: t */
        public boolean f37267t;

        /* renamed from: u */
        public boolean f37268u;

        /* renamed from: v */
        public boolean f37269v;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$a */
        /* loaded from: classes2.dex */
        public static class C4027a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f37265r = parcel.readInt();
            this.f37266s = parcel.readInt();
            this.f37267t = parcel.readInt() == 1;
            this.f37268u = parcel.readInt() == 1;
            this.f37269v = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f37265r = bottomSheetBehavior.f37264z;
            this.f37266s = bottomSheetBehavior.f37243e;
            this.f37267t = bottomSheetBehavior.f37240b;
            this.f37268u = bottomSheetBehavior.f37261w;
            this.f37269v = bottomSheetBehavior.f37262x;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f37265r);
            parcel.writeInt(this.f37266s);
            parcel.writeInt(this.f37267t ? 1 : 0);
            parcel.writeInt(this.f37268u ? 1 : 0);
            parcel.writeInt(this.f37269v ? 1 : 0);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    /* loaded from: classes2.dex */
    public class RunnableC4028a implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ View f37270p;

        /* renamed from: q */
        public final /* synthetic */ int f37271q;

        public RunnableC4028a(View view, int i) {
            this.f37270p = view;
            this.f37271q = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.m888o0(this.f37270p, this.f37271q);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    /* loaded from: classes2.dex */
    public class C4029b implements ValueAnimator.AnimatorUpdateListener {
        public C4029b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f37248j != null) {
                BottomSheetBehavior.this.f37248j.m14996X(floatValue);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    /* loaded from: classes2.dex */
    public class C4030c implements fu1.InterfaceC1330c {
        public C4030c() {
        }

        @Override // com.daaw.fu1.InterfaceC1330c
        /* renamed from: a */
        public px1 mo873a(View view, px1 px1Var, fu1.C1331d c1331d) {
            BottomSheetBehavior.this.f37249k = px1Var.m12954g().f11218d;
            BottomSheetBehavior.this.m879v0(false);
            return px1Var;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    /* loaded from: classes2.dex */
    public class C4031d extends at1.AbstractC0673c {
        public C4031d() {
        }

        @Override // com.daaw.at1.AbstractC0673c
        /* renamed from: a */
        public int mo872a(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // com.daaw.at1.AbstractC0673c
        /* renamed from: b */
        public int mo871b(View view, int i, int i2) {
            int m909V = BottomSheetBehavior.this.m909V();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return sn0.m10152b(i, m909V, bottomSheetBehavior.f37261w ? bottomSheetBehavior.f37228G : bottomSheetBehavior.f37259u);
        }

        @Override // com.daaw.at1.AbstractC0673c
        /* renamed from: e */
        public int mo870e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f37261w ? bottomSheetBehavior.f37228G : bottomSheetBehavior.f37259u;
        }

        @Override // com.daaw.at1.AbstractC0673c
        /* renamed from: j */
        public void mo869j(int i) {
            if (i == 1 && BottomSheetBehavior.this.f37263y) {
                BottomSheetBehavior.this.m891m0(1);
            }
        }

        @Override // com.daaw.at1.AbstractC0673c
        /* renamed from: k */
        public void mo868k(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.m911T(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
            if (java.lang.Math.abs(r7.getTop() - r6.f37275a.f37255q) < java.lang.Math.abs(r7.getTop() - r6.f37275a.f37257s)) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
            r8 = r6.f37275a.f37255q;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00b1, code lost:
            if (java.lang.Math.abs(r8 - r6.f37275a.f37257s) < java.lang.Math.abs(r8 - r6.f37275a.f37259u)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
            if (java.lang.Math.abs(r8 - r6.f37275a.f37256r) < java.lang.Math.abs(r8 - r6.f37275a.f37259u)) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00ea, code lost:
            if (r8 < java.lang.Math.abs(r8 - r9.f37259u)) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00fc, code lost:
            if (java.lang.Math.abs(r8 - r0) < java.lang.Math.abs(r8 - r6.f37275a.f37259u)) goto L31;
         */
        @Override // com.daaw.at1.AbstractC0673c
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo867l(View view, float f, float f2) {
            int i;
            int i2 = 4;
            if (f2 < 0.0f) {
                if (!BottomSheetBehavior.this.f37240b) {
                    int top = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    int i3 = bottomSheetBehavior.f37257s;
                    if (top > i3) {
                        i = i3;
                        i2 = 6;
                    } else {
                        i = bottomSheetBehavior.f37255q;
                        i2 = 3;
                    }
                }
                i = BottomSheetBehavior.this.f37256r;
                i2 = 3;
            } else {
                BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                if (bottomSheetBehavior2.f37261w && bottomSheetBehavior2.m885q0(view, f2)) {
                    if ((Math.abs(f) >= Math.abs(f2) || f2 <= 500.0f) && !m865n(view)) {
                        if (!BottomSheetBehavior.this.f37240b) {
                        }
                        i = BottomSheetBehavior.this.f37256r;
                        i2 = 3;
                    } else {
                        i = BottomSheetBehavior.this.f37228G;
                        i2 = 5;
                    }
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top2 = view.getTop();
                    if (!BottomSheetBehavior.this.f37240b) {
                        BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                        int i4 = bottomSheetBehavior3.f37257s;
                        if (top2 < i4) {
                        }
                        i = BottomSheetBehavior.this.f37257s;
                        i2 = 6;
                    }
                    i = BottomSheetBehavior.this.f37259u;
                } else {
                    if (!BottomSheetBehavior.this.f37240b) {
                        int top3 = view.getTop();
                    }
                    i = BottomSheetBehavior.this.f37259u;
                }
            }
            BottomSheetBehavior.this.m884r0(view, i2, i, true);
        }

        @Override // com.daaw.at1.AbstractC0673c
        /* renamed from: m */
        public boolean mo866m(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f37264z;
            if (i2 == 1 || bottomSheetBehavior.f37235N) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f37233L == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f37230I;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f37229H;
            return weakReference2 != null && weakReference2.get() == view;
        }

        /* renamed from: n */
        public final boolean m865n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f37228G + bottomSheetBehavior.m909V()) / 2;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    /* loaded from: classes2.dex */
    public class C4032e implements InterfaceC0785b0 {

        /* renamed from: a */
        public final /* synthetic */ int f37276a;

        public C4032e(int i) {
            this.f37276a = i;
        }

        @Override // com.daaw.InterfaceC0785b0
        /* renamed from: a */
        public boolean mo864a(View view, InterfaceC0785b0.AbstractC0786a abstractC0786a) {
            BottomSheetBehavior.this.m892l0(this.f37276a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC4033f {
        /* renamed from: a */
        public abstract void m863a(View view, float f);

        /* renamed from: b */
        public abstract void m862b(View view, int i);
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    /* loaded from: classes2.dex */
    public class RunnableC4034g implements Runnable {

        /* renamed from: p */
        public final View f37278p;

        /* renamed from: q */
        public boolean f37279q;

        /* renamed from: r */
        public int f37280r;

        public RunnableC4034g(View view, int i) {
            this.f37278p = view;
            this.f37280r = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            at1 at1Var = BottomSheetBehavior.this.f37222A;
            if (at1Var == null || !at1Var.m27060m(true)) {
                BottomSheetBehavior.this.m891m0(this.f37280r);
            } else {
                xs1.m4718j0(this.f37278p, this);
            }
            this.f37279q = false;
        }
    }

    public BottomSheetBehavior() {
        this.f37239a = 0;
        this.f37240b = true;
        this.f37241c = false;
        this.f37253o = null;
        this.f37258t = 0.5f;
        this.f37260v = -1.0f;
        this.f37263y = true;
        this.f37264z = 4;
        this.f37231J = new ArrayList<>();
        this.f37237P = -1;
        this.f37238Q = new C4031d();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.f37239a = 0;
        this.f37240b = true;
        this.f37241c = false;
        this.f37253o = null;
        this.f37258t = 0.5f;
        this.f37260v = -1.0f;
        this.f37263y = true;
        this.f37264z = 4;
        this.f37231J = new ArrayList<>();
        this.f37237P = -1;
        this.f37238Q = new C4031d();
        this.f37246h = context.getResources().getDimensionPixelSize(f11.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m21.f18370y);
        this.f37247i = obtainStyledAttributes.hasValue(m21.f18077K);
        int i2 = m21.f18007A;
        boolean hasValue = obtainStyledAttributes.hasValue(i2);
        if (hasValue) {
            m913R(context, attributeSet, hasValue, mn0.m15930a(context, obtainStyledAttributes, i2));
        } else {
            m914Q(context, attributeSet, hasValue);
        }
        m912S();
        if (Build.VERSION.SDK_INT >= 21) {
            this.f37260v = obtainStyledAttributes.getDimension(m21.f18377z, -1.0f);
        }
        int i3 = m21.f18049G;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i3);
        if (peekValue == null || (i = peekValue.data) != -1) {
            m897h0(obtainStyledAttributes.getDimensionPixelSize(i3, -1));
        } else {
            m897h0(i);
        }
        m898g0(obtainStyledAttributes.getBoolean(m21.f18042F, false));
        m900e0(obtainStyledAttributes.getBoolean(m21.f18070J, false));
        m901d0(obtainStyledAttributes.getBoolean(m21.f18028D, true));
        m893k0(obtainStyledAttributes.getBoolean(m21.f18063I, false));
        m903b0(obtainStyledAttributes.getBoolean(m21.f18014B, true));
        m894j0(obtainStyledAttributes.getInt(m21.f18056H, 0));
        m899f0(obtainStyledAttributes.getFloat(m21.f18035E, 0.5f));
        int i4 = m21.f18021C;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i4);
        m902c0((peekValue2 == null || peekValue2.type != 16) ? obtainStyledAttributes.getDimensionPixelOffset(i4, 0) : peekValue2.data);
        obtainStyledAttributes.recycle();
        this.f37242d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: A */
    public boolean mo928A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f37224C = 0;
        this.f37225D = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
        if (java.lang.Math.abs(r3 - r2.f37256r) < java.lang.Math.abs(r3 - r2.f37259u)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0078, code lost:
        if (r3 < java.lang.Math.abs(r3 - r2.f37259u)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0088, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.f37259u)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a6, code lost:
        if (java.lang.Math.abs(r3 - r2.f37257s) < java.lang.Math.abs(r3 - r2.f37259u)) goto L40;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo927C(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        int i3 = 3;
        if (v.getTop() == m909V()) {
            m891m0(3);
            return;
        }
        WeakReference<View> weakReference = this.f37230I;
        if (weakReference != null && view == weakReference.get() && this.f37225D) {
            if (this.f37224C > 0) {
                if (!this.f37240b) {
                    int top = v.getTop();
                    int i4 = this.f37257s;
                    if (top > i4) {
                        i2 = i4;
                        i3 = 6;
                    }
                    i2 = this.f37255q;
                }
                i2 = this.f37256r;
            } else if (this.f37261w && m885q0(v, m908W())) {
                i2 = this.f37228G;
                i3 = 5;
            } else if (this.f37224C == 0) {
                int top2 = v.getTop();
                if (!this.f37240b) {
                    int i5 = this.f37257s;
                    if (top2 < i5) {
                    }
                    i2 = this.f37257s;
                    i3 = 6;
                }
                i2 = this.f37259u;
                i3 = 4;
            } else {
                if (!this.f37240b) {
                    int top3 = v.getTop();
                }
                i2 = this.f37259u;
                i3 = 4;
            }
            m884r0(v, i3, i2, false);
            this.f37225D = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: D */
    public boolean mo102D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (v.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (this.f37264z == 1 && actionMasked == 0) {
                return true;
            }
            at1 at1Var = this.f37222A;
            if (at1Var != null) {
                at1Var.m27084E(motionEvent);
            }
            if (actionMasked == 0) {
                m905Z();
            }
            if (this.f37232K == null) {
                this.f37232K = VelocityTracker.obtain();
            }
            this.f37232K.addMovement(motionEvent);
            if (this.f37222A != null && actionMasked == 2 && !this.f37223B && Math.abs(this.f37234M - motionEvent.getY()) > this.f37222A.m27048y()) {
                this.f37222A.m27071b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            return !this.f37223B;
        }
        return false;
    }

    /* renamed from: L */
    public final int m919L(V v, int i, int i2) {
        return xs1.m4733c(v, v.getResources().getString(i), m915P(i2));
    }

    /* renamed from: M */
    public final void m918M() {
        int m916O = m916O();
        if (this.f37240b) {
            this.f37259u = Math.max(this.f37228G - m916O, this.f37256r);
        } else {
            this.f37259u = this.f37228G - m916O;
        }
    }

    /* renamed from: N */
    public final void m917N() {
        this.f37257s = (int) (this.f37228G * (1.0f - this.f37258t));
    }

    /* renamed from: O */
    public final int m916O() {
        int i;
        return this.f37244f ? Math.min(Math.max(this.f37245g, this.f37228G - ((this.f37227F * 9) / 16)), this.f37226E) : (this.f37250l || (i = this.f37249k) <= 0) ? this.f37243e : Math.max(this.f37243e, i + this.f37246h);
    }

    /* renamed from: P */
    public final InterfaceC0785b0 m915P(int i) {
        return new C4032e(i);
    }

    /* renamed from: Q */
    public final void m914Q(Context context, AttributeSet attributeSet, boolean z) {
        m913R(context, attributeSet, z, null);
    }

    /* renamed from: R */
    public final void m913R(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f37247i) {
            this.f37251m = gc1.m21808e(context, attributeSet, w01.bottomSheetStyle, f37221R).m21769m();
            nn0 nn0Var = new nn0(this.f37251m);
            this.f37248j = nn0Var;
            nn0Var.m15007M(context);
            if (z && colorStateList != null) {
                this.f37248j.m14997W(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.f37248j.setTint(typedValue.data);
        }
    }

    /* renamed from: S */
    public final void m912S() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f37254p = ofFloat;
        ofFloat.setDuration(500L);
        this.f37254p.addUpdateListener(new C4029b());
    }

    /* renamed from: T */
    public void m911T(int i) {
        float f;
        float f2;
        V v = this.f37229H.get();
        if (v == null || this.f37231J.isEmpty()) {
            return;
        }
        int i2 = this.f37259u;
        if (i > i2 || i2 == m909V()) {
            int i3 = this.f37259u;
            f = i3 - i;
            f2 = this.f37228G - i3;
        } else {
            int i4 = this.f37259u;
            f = i4 - i;
            f2 = i4 - m909V();
        }
        float f3 = f / f2;
        for (int i5 = 0; i5 < this.f37231J.size(); i5++) {
            this.f37231J.get(i5).m863a(v, f3);
        }
    }

    /* renamed from: U */
    public View m910U(View view) {
        if (xs1.m4741W(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View m910U = m910U(viewGroup.getChildAt(i));
                if (m910U != null) {
                    return m910U;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: V */
    public int m909V() {
        return this.f37240b ? this.f37256r : this.f37255q;
    }

    /* renamed from: W */
    public final float m908W() {
        VelocityTracker velocityTracker = this.f37232K;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f37242d);
        return this.f37232K.getYVelocity(this.f37233L);
    }

    /* renamed from: X */
    public boolean m907X() {
        return this.f37250l;
    }

    /* renamed from: Y */
    public final void m906Y(V v, C3654y.C3655a c3655a, int i) {
        xs1.m4710n0(v, c3655a, null, m915P(i));
    }

    /* renamed from: Z */
    public final void m905Z() {
        this.f37233L = -1;
        VelocityTracker velocityTracker = this.f37232K;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f37232K = null;
        }
    }

    /* renamed from: a0 */
    public final void m904a0(SavedState savedState) {
        int i = this.f37239a;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.f37243e = savedState.f37266s;
        }
        if (i == -1 || (i & 2) == 2) {
            this.f37240b = savedState.f37267t;
        }
        if (i == -1 || (i & 4) == 4) {
            this.f37261w = savedState.f37268u;
        }
        if (i == -1 || (i & 8) == 8) {
            this.f37262x = savedState.f37269v;
        }
    }

    /* renamed from: b0 */
    public void m903b0(boolean z) {
        this.f37263y = z;
    }

    /* renamed from: c0 */
    public void m902c0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f37255q = i;
    }

    /* renamed from: d0 */
    public void m901d0(boolean z) {
        if (this.f37240b == z) {
            return;
        }
        this.f37240b = z;
        if (this.f37229H != null) {
            m918M();
        }
        m891m0((this.f37240b && this.f37264z == 6) ? 3 : this.f37264z);
        m883s0();
    }

    /* renamed from: e0 */
    public void m900e0(boolean z) {
        this.f37250l = z;
    }

    /* renamed from: f0 */
    public void m899f0(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f37258t = f;
        if (this.f37229H != null) {
            m917N();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: g */
    public void mo103g(CoordinatorLayout.C0197f c0197f) {
        super.mo103g(c0197f);
        this.f37229H = null;
        this.f37222A = null;
    }

    /* renamed from: g0 */
    public void m898g0(boolean z) {
        if (this.f37261w != z) {
            this.f37261w = z;
            if (!z && this.f37264z == 5) {
                m892l0(4);
            }
            m883s0();
        }
    }

    /* renamed from: h0 */
    public void m897h0(int i) {
        m896i0(i, false);
    }

    /* renamed from: i0 */
    public final void m896i0(int i, boolean z) {
        boolean z2 = true;
        if (i == -1) {
            if (!this.f37244f) {
                this.f37244f = true;
            }
            z2 = false;
        } else {
            if (this.f37244f || this.f37243e != i) {
                this.f37244f = false;
                this.f37243e = Math.max(0, i);
            }
            z2 = false;
        }
        if (z2) {
            m879v0(z);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: j */
    public void mo895j() {
        super.mo895j();
        this.f37229H = null;
        this.f37222A = null;
    }

    /* renamed from: j0 */
    public void m894j0(int i) {
        this.f37239a = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: k */
    public boolean mo326k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        at1 at1Var;
        if (!v.isShown() || !this.f37263y) {
            this.f37223B = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m905Z();
        }
        if (this.f37232K == null) {
            this.f37232K = VelocityTracker.obtain();
        }
        this.f37232K.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f37234M = (int) motionEvent.getY();
            if (this.f37264z != 2) {
                WeakReference<View> weakReference = this.f37230I;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.m29823B(view, x, this.f37234M)) {
                    this.f37233L = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f37235N = true;
                }
            }
            this.f37223B = this.f37233L == -1 && !coordinatorLayout.m29823B(v, x, this.f37234M);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f37235N = false;
            this.f37233L = -1;
            if (this.f37223B) {
                this.f37223B = false;
                return false;
            }
        }
        if (this.f37223B || (at1Var = this.f37222A) == null || !at1Var.m27075N(motionEvent)) {
            WeakReference<View> weakReference2 = this.f37230I;
            View view2 = weakReference2 != null ? weakReference2.get() : null;
            return (actionMasked != 2 || view2 == null || this.f37223B || this.f37264z == 1 || coordinatorLayout.m29823B(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f37222A == null || Math.abs(((float) this.f37234M) - motionEvent.getY()) <= ((float) this.f37222A.m27048y())) ? false : true;
        }
        return true;
    }

    /* renamed from: k0 */
    public void m893k0(boolean z) {
        this.f37262x = z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: l */
    public boolean mo126l(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2;
        nn0 nn0Var;
        if (xs1.m4774B(coordinatorLayout) && !xs1.m4774B(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f37229H == null) {
            this.f37245g = coordinatorLayout.getResources().getDimensionPixelSize(f11.design_bottom_sheet_peek_height_min);
            m890n0(v);
            this.f37229H = new WeakReference<>(v);
            if (this.f37247i && (nn0Var = this.f37248j) != null) {
                xs1.m4694v0(v, nn0Var);
            }
            nn0 nn0Var2 = this.f37248j;
            if (nn0Var2 != null) {
                float f = this.f37260v;
                if (f == -1.0f) {
                    f = xs1.m4689y(v);
                }
                nn0Var2.m14998V(f);
                boolean z = this.f37264z == 3;
                this.f37252n = z;
                this.f37248j.m14996X(z ? 0.0f : 1.0f);
            }
            m883s0();
            if (xs1.m4772C(v) == 0) {
                xs1.m4773B0(v, 1);
            }
        }
        if (this.f37222A == null) {
            this.f37222A = at1.m27058o(coordinatorLayout, this.f37238Q);
        }
        int top = v.getTop();
        coordinatorLayout.m29816I(v, i);
        this.f37227F = coordinatorLayout.getWidth();
        this.f37228G = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.f37226E = height;
        this.f37256r = Math.max(0, this.f37228G - height);
        m917N();
        m918M();
        int i3 = this.f37264z;
        if (i3 == 3) {
            i2 = m909V();
        } else if (i3 == 6) {
            i2 = this.f37257s;
        } else if (this.f37261w && i3 == 5) {
            i2 = this.f37228G;
        } else if (i3 != 4) {
            if (i3 == 1 || i3 == 2) {
                xs1.m4732c0(v, top - v.getTop());
            }
            this.f37230I = new WeakReference<>(m910U(v));
            return true;
        } else {
            i2 = this.f37259u;
        }
        xs1.m4732c0(v, i2);
        this.f37230I = new WeakReference<>(m910U(v));
        return true;
    }

    /* renamed from: l0 */
    public void m892l0(int i) {
        if (i == this.f37264z) {
            return;
        }
        if (this.f37229H != null) {
            m887p0(i);
        } else if (i == 4 || i == 3 || i == 6 || (this.f37261w && i == 5)) {
            this.f37264z = i;
        }
    }

    /* renamed from: m0 */
    public void m891m0(int i) {
        V v;
        if (this.f37264z == i) {
            return;
        }
        this.f37264z = i;
        WeakReference<V> weakReference = this.f37229H;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            m880u0(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m880u0(false);
        }
        m881t0(i);
        for (int i2 = 0; i2 < this.f37231J.size(); i2++) {
            this.f37231J.get(i2).m862b(v, i);
        }
        m883s0();
    }

    /* renamed from: n0 */
    public final void m890n0(View view) {
        if (Build.VERSION.SDK_INT < 29 || m907X() || this.f37244f) {
            return;
        }
        fu1.m22262a(view, new C4030c());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: o */
    public boolean mo889o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.f37230I;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.f37264z != 3 || super.mo889o(coordinatorLayout, v, view, f, f2);
    }

    /* renamed from: o0 */
    public void m888o0(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.f37259u;
        } else if (i == 6) {
            int i4 = this.f37257s;
            if (!this.f37240b || i4 > (i3 = this.f37256r)) {
                i2 = i4;
            } else {
                i2 = i3;
                i = 3;
            }
        } else if (i == 3) {
            i2 = m909V();
        } else if (!this.f37261w || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        } else {
            i2 = this.f37228G;
        }
        m884r0(view, i, i2, false);
    }

    /* renamed from: p0 */
    public final void m887p0(int i) {
        V v = this.f37229H.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && xs1.m4743U(v)) {
            v.post(new RunnableC4028a(v, i));
        } else {
            m888o0(v, i);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: q */
    public void mo886q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f37230I;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i5 = top - i2;
        if (i2 > 0) {
            if (i5 < m909V()) {
                iArr[1] = top - m909V();
                xs1.m4732c0(v, -iArr[1]);
                i4 = 3;
                m891m0(i4);
            } else if (!this.f37263y) {
                return;
            } else {
                iArr[1] = i2;
                xs1.m4732c0(v, -i2);
                m891m0(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i6 = this.f37259u;
            if (i5 > i6 && !this.f37261w) {
                iArr[1] = top - i6;
                xs1.m4732c0(v, -iArr[1]);
                i4 = 4;
                m891m0(i4);
            } else if (!this.f37263y) {
                return;
            } else {
                iArr[1] = i2;
                xs1.m4732c0(v, -i2);
                m891m0(1);
            }
        }
        m911T(v.getTop());
        this.f37224C = i2;
        this.f37225D = true;
    }

    /* renamed from: q0 */
    public boolean m885q0(View view, float f) {
        if (this.f37262x) {
            return true;
        }
        if (view.getTop() < this.f37259u) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f37259u)) / ((float) m916O()) > 0.5f;
    }

    /* renamed from: r0 */
    public void m884r0(View view, int i, int i2, boolean z) {
        at1 at1Var = this.f37222A;
        if (!(at1Var != null && (!z ? !at1Var.m27074O(view, view.getLeft(), i2) : !at1Var.m27076M(view.getLeft(), i2)))) {
            m891m0(i);
            return;
        }
        m891m0(2);
        m881t0(i);
        if (this.f37253o == null) {
            this.f37253o = new RunnableC4034g(view, i);
        }
        if (this.f37253o.f37279q) {
            this.f37253o.f37280r = i;
            return;
        }
        BottomSheetBehavior<V>.RunnableC4034g runnableC4034g = this.f37253o;
        runnableC4034g.f37280r = i;
        xs1.m4718j0(view, runnableC4034g);
        this.f37253o.f37279q = true;
    }

    /* renamed from: s0 */
    public final void m883s0() {
        V v;
        int i;
        C3654y.C3655a c3655a;
        WeakReference<V> weakReference = this.f37229H;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        xs1.m4714l0(v, 524288);
        xs1.m4714l0(v, 262144);
        xs1.m4714l0(v, 1048576);
        int i2 = this.f37237P;
        if (i2 != -1) {
            xs1.m4714l0(v, i2);
        }
        if (this.f37264z != 6) {
            this.f37237P = m919L(v, h21.bottomsheet_action_expand_halfway, 6);
        }
        if (this.f37261w && this.f37264z != 5) {
            m906Y(v, C3654y.C3655a.f33189y, 5);
        }
        int i3 = this.f37264z;
        if (i3 == 3) {
            i = this.f37240b ? 4 : 6;
            c3655a = C3654y.C3655a.f33188x;
        } else if (i3 != 4) {
            if (i3 != 6) {
                return;
            }
            m906Y(v, C3654y.C3655a.f33188x, 4);
            m906Y(v, C3654y.C3655a.f33187w, 3);
            return;
        } else {
            i = this.f37240b ? 3 : 6;
            c3655a = C3654y.C3655a.f33187w;
        }
        m906Y(v, c3655a, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: t */
    public void mo882t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    /* renamed from: t0 */
    public final void m881t0(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.f37252n != z) {
            this.f37252n = z;
            if (this.f37248j == null || (valueAnimator = this.f37254p) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f37254p.reverse();
                return;
            }
            float f = z ? 0.0f : 1.0f;
            this.f37254p.setFloatValues(1.0f - f, f);
            this.f37254p.start();
        }
    }

    /* renamed from: u0 */
    public final void m880u0(boolean z) {
        Map<View, Integer> map;
        int intValue;
        WeakReference<V> weakReference = this.f37229H;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f37236O != null) {
                    return;
                }
                this.f37236O = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f37229H.get()) {
                    if (z) {
                        this.f37236O.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f37241c) {
                            intValue = 4;
                            xs1.m4773B0(childAt, intValue);
                        }
                    } else if (this.f37241c && (map = this.f37236O) != null && map.containsKey(childAt)) {
                        intValue = this.f37236O.get(childAt).intValue();
                        xs1.m4773B0(childAt, intValue);
                    }
                }
            }
            if (!z) {
                this.f37236O = null;
            } else if (this.f37241c) {
                this.f37229H.get().sendAccessibilityEvent(8);
            }
        }
    }

    /* renamed from: v0 */
    public final void m879v0(boolean z) {
        V v;
        if (this.f37229H != null) {
            m918M();
            if (this.f37264z != 4 || (v = this.f37229H.get()) == null) {
                return;
            }
            if (z) {
                m887p0(this.f37264z);
            } else {
                v.requestLayout();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: x */
    public void mo878x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo878x(coordinatorLayout, v, savedState.m29657a());
        m904a0(savedState);
        int i = savedState.f37265r;
        this.f37264z = (i == 1 || i == 2) ? 4 : 4;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: y */
    public Parcelable mo877y(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo877y(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }
}
