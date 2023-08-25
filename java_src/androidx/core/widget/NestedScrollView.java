package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.daaw.a0;
import com.daaw.es0;
import com.daaw.fs0;
import com.daaw.hs0;
import com.daaw.js0;
import com.daaw.qv;
import com.daaw.u01;
import com.daaw.w;
import com.daaw.xs1;
import com.daaw.y;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements hs0, es0 {
    public static final a P = new a();
    public static final int[] Q = {16843130};
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public int F;
    public final int[] G;
    public final int[] H;
    public int I;
    public int J;
    public SavedState K;
    public final js0 L;
    public final fs0 M;
    public float N;
    public c O;
    public long p;
    public final Rect q;
    public OverScroller r;
    public EdgeEffect s;
    public EdgeEffect t;
    public int u;
    public boolean v;
    public boolean w;
    public View x;
    public boolean y;
    public VelocityTracker z;

    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int p;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.p = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.p + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.p);
        }
    }

    /* loaded from: classes.dex */
    public static class a extends w {
        @Override // com.daaw.w
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            a0.a(accessibilityEvent, nestedScrollView.getScrollX());
            a0.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // com.daaw.w
        public void g(View view, y yVar) {
            int scrollRange;
            super.g(view, yVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            yVar.b0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            yVar.t0(true);
            if (nestedScrollView.getScrollY() > 0) {
                yVar.b(y.a.r);
                yVar.b(y.a.C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                yVar.b(y.a.q);
                yVar.b(y.a.E);
            }
        }

        @Override // com.daaw.w
        public boolean j(View view, int i, Bundle bundle) {
            if (super.j(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (nestedScrollView.isEnabled()) {
                int height = nestedScrollView.getHeight();
                Rect rect = new Rect();
                if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                    height = rect.height();
                }
                if (i != 4096) {
                    if (i == 8192 || i == 16908344) {
                        int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (max != nestedScrollView.getScrollY()) {
                            nestedScrollView.Q(0, max, true);
                            return true;
                        }
                        return false;
                    } else if (i != 16908346) {
                        return false;
                    }
                }
                int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min != nestedScrollView.getScrollY()) {
                    nestedScrollView.Q(0, min, true);
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u01.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.q = new Rect();
        this.v = true;
        this.w = false;
        this.x = null;
        this.y = false;
        this.B = true;
        this.F = -1;
        this.G = new int[2];
        this.H = new int[2];
        this.s = qv.a(context, attributeSet);
        this.t = qv.a(context, attributeSet);
        y();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.L = new js0(this);
        this.M = new fs0(this);
        setNestedScrollingEnabled(true);
        xs1.r0(this, P);
    }

    public static boolean B(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && B((View) parent, view2);
    }

    public static int e(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.N == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.N = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.N;
    }

    public final boolean A(View view) {
        return !C(view, 0, getHeight());
    }

    public final boolean C(View view, int i, int i2) {
        view.getDrawingRect(this.q);
        offsetDescendantRectToMyCoords(view, this.q);
        return this.q.bottom + i >= getScrollY() && this.q.top - i <= getScrollY() + i2;
    }

    public final void D(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.M.e(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    public final void E(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.F) {
            int i = actionIndex == 0 ? 1 : 0;
            this.u = (int) motionEvent.getY(i);
            this.F = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.z;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean F(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r1 == 0) goto L2a
            if (r1 != r5) goto L28
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            if (r1 == 0) goto L34
            if (r1 != r5) goto L32
            if (r3 == 0) goto L32
            goto L34
        L32:
            r1 = 0
            goto L35
        L34:
            r1 = 1
        L35:
            int r3 = r15 + r13
            if (r2 != 0) goto L3b
            r2 = 0
            goto L3d
        L3b:
            r2 = r19
        L3d:
            int r6 = r16 + r14
            if (r1 != 0) goto L43
            r1 = 0
            goto L45
        L43:
            r1 = r20
        L45:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L50
            r3 = r2
        L4e:
            r2 = 1
            goto L55
        L50:
            if (r3 >= r7) goto L54
            r3 = r7
            goto L4e
        L54:
            r2 = 0
        L55:
            if (r6 <= r1) goto L5a
            r6 = r1
        L58:
            r1 = 1
            goto L5f
        L5a:
            if (r6 >= r8) goto L5e
            r6 = r8
            goto L58
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L7e
            boolean r7 = r12.v(r5)
            if (r7 != 0) goto L7e
            android.widget.OverScroller r7 = r0.r
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L7e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L85
            if (r1 == 0) goto L86
        L85:
            r4 = 1
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.F(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    public boolean G(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.q.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.q;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.q.top = getScrollY() - height;
            Rect rect2 = this.q;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.q;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return K(i, i2, i3);
    }

    public final void H() {
        VelocityTracker velocityTracker = this.z;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.z = null;
        }
    }

    public final int I(int i, float f) {
        float d;
        EdgeEffect edgeEffect;
        float width = f / getWidth();
        float height = i / getHeight();
        float f2 = 0.0f;
        if (qv.b(this.s) != 0.0f) {
            d = -qv.d(this.s, -height, width);
            if (qv.b(this.s) == 0.0f) {
                edgeEffect = this.s;
                edgeEffect.onRelease();
            }
            f2 = d;
        } else if (qv.b(this.t) != 0.0f) {
            d = qv.d(this.t, height, 1.0f - width);
            if (qv.b(this.t) == 0.0f) {
                edgeEffect = this.t;
                edgeEffect.onRelease();
            }
            f2 = d;
        }
        int round = Math.round(f2 * getHeight());
        if (round != 0) {
            invalidate();
        }
        return round;
    }

    public final void J(boolean z) {
        if (z) {
            R(2, 1);
        } else {
            T(1);
        }
        this.J = getScrollY();
        xs1.i0(this);
    }

    public final boolean K(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View s = s(z2, i2, i3);
        if (s == null) {
            s = this;
        }
        if (i2 < scrollY || i3 > i4) {
            i(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (s != findFocus()) {
            s.requestFocus(i);
        }
        return z;
    }

    public final void L(View view) {
        view.getDrawingRect(this.q);
        offsetDescendantRectToMyCoords(view, this.q);
        int f = f(this.q);
        if (f != 0) {
            scrollBy(0, f);
        }
    }

    public final boolean M(Rect rect, boolean z) {
        int f = f(rect);
        boolean z2 = f != 0;
        if (z2) {
            if (z) {
                scrollBy(0, f);
            } else {
                N(0, f);
            }
        }
        return z2;
    }

    public final void N(int i, int i2) {
        O(i, i2, 250, false);
    }

    public final void O(int i, int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.p > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int scrollY = getScrollY();
            OverScroller overScroller = this.r;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
            J(z);
        } else {
            if (!this.r.isFinished()) {
                a();
            }
            scrollBy(i, i2);
        }
        this.p = AnimationUtils.currentAnimationTimeMillis();
    }

    public void P(int i, int i2, int i3, boolean z) {
        O(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    public void Q(int i, int i2, boolean z) {
        P(i, i2, 250, z);
    }

    public boolean R(int i, int i2) {
        return this.M.p(i, i2);
    }

    public final boolean S(MotionEvent motionEvent) {
        boolean z;
        if (qv.b(this.s) != 0.0f) {
            qv.d(this.s, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (qv.b(this.t) != 0.0f) {
            qv.d(this.t, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z;
    }

    public void T(int i) {
        this.M.r(i);
    }

    public final void a() {
        this.r.abortAnimation();
        T(1);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public boolean b(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !C(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            i(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.q);
            offsetDescendantRectToMyCoords(findNextFocus, this.q);
            i(f(this.q));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && A(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
            return true;
        }
        return true;
    }

    public final boolean c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.r.isFinished()) {
            return;
        }
        this.r.computeScrollOffset();
        int currY = this.r.getCurrY();
        int i = currY - this.J;
        this.J = currY;
        int[] iArr = this.H;
        boolean z = false;
        iArr[1] = 0;
        g(0, i, iArr, null, 1);
        int i2 = i - this.H[1];
        int scrollRange = getScrollRange();
        if (i2 != 0) {
            int scrollY = getScrollY();
            F(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i3 = i2 - scrollY2;
            int[] iArr2 = this.H;
            iArr2[1] = 0;
            h(0, scrollY2, 0, i3, this.G, 1, iArr2);
            i2 = i3 - this.H[1];
        }
        if (i2 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z = true;
            }
            if (z) {
                if (i2 < 0) {
                    if (this.s.isFinished()) {
                        edgeEffect = this.s;
                        edgeEffect.onAbsorb((int) this.r.getCurrVelocity());
                    }
                } else if (this.t.isFinished()) {
                    edgeEffect = this.t;
                    edgeEffect.onAbsorb((int) this.r.getCurrVelocity());
                }
            }
            a();
        }
        if (this.r.isFinished()) {
            T(1);
        } else {
            xs1.i0(this);
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public final boolean d() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || r(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.M.a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.M.b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return g(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.M.f(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i = 0;
        if (!this.s.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 21 || b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft() + 0;
            } else {
                paddingLeft = 0;
            }
            if (i2 >= 21 && b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(paddingLeft, min);
            this.s.setSize(width, height);
            if (this.s.draw(canvas)) {
                xs1.i0(this);
            }
            canvas.restoreToCount(save);
        }
        if (this.t.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 21 || b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i = 0 + getPaddingLeft();
        }
        if (i3 >= 21 && b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.t.setSize(width2, height2);
        if (this.t.draw(canvas)) {
            xs1.i0(this);
        }
        canvas.restoreToCount(save2);
    }

    public int f(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        } else if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    public boolean g(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.M.d(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.L.a();
    }

    public int getScrollRange() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public void h(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.M.e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return v(0);
    }

    public final void i(int i) {
        if (i != 0) {
            if (this.B) {
                N(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    @Override // android.view.View, com.daaw.es0
    public boolean isNestedScrollingEnabled() {
        return this.M.l();
    }

    @Override // com.daaw.hs0
    public void j(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        D(i4, i5, iArr);
    }

    @Override // com.daaw.gs0
    public void k(View view, int i, int i2, int i3, int i4, int i5) {
        D(i4, i5, null);
    }

    @Override // com.daaw.gs0
    public boolean l(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // com.daaw.gs0
    public void m(View view, View view2, int i, int i2) {
        this.L.c(view, view2, i, i2);
        R(2, i2);
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i, int i2) {
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // com.daaw.gs0
    public void n(View view, int i) {
        this.L.d(view, i);
        T(i);
    }

    @Override // com.daaw.gs0
    public void o(View view, int i, int i2, int[] iArr, int i3) {
        g(i, i2, iArr, null, i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 0
            r2 = 8
            if (r0 != r2) goto La5
            boolean r0 = r8.y
            if (r0 != 0) goto La5
            r0 = 2
            boolean r0 = com.daaw.qq0.a(r9, r0)
            r2 = 0
            if (r0 == 0) goto L1c
            r0 = 9
        L17:
            float r0 = r9.getAxisValue(r0)
            goto L28
        L1c:
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = com.daaw.qq0.a(r9, r0)
            if (r0 == 0) goto L27
            r0 = 26
            goto L17
        L27:
            r0 = 0
        L28:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto La5
            float r2 = r8.getVerticalScrollFactorCompat()
            float r0 = r0 * r2
            int r0 = (int) r0
            int r2 = r8.getScrollRange()
            int r3 = r8.getScrollY()
            int r0 = r3 - r0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 8194(0x2002, float:1.1482E-41)
            r6 = 1
            if (r0 >= 0) goto L6c
            boolean r2 = r8.c()
            if (r2 == 0) goto L52
            boolean r9 = com.daaw.qq0.a(r9, r5)
            if (r9 != 0) goto L52
            r9 = 1
            goto L53
        L52:
            r9 = 0
        L53:
            if (r9 == 0) goto L99
            android.widget.EdgeEffect r9 = r8.s
            float r0 = (float) r0
            float r0 = -r0
            int r2 = r8.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            com.daaw.qv.d(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.s
            r9.onRelease()
            r8.invalidate()
            r9 = 1
            goto L9a
        L6c:
            if (r0 <= r2) goto L98
            boolean r7 = r8.c()
            if (r7 == 0) goto L7c
            boolean r9 = com.daaw.qq0.a(r9, r5)
            if (r9 != 0) goto L7c
            r9 = 1
            goto L7d
        L7c:
            r9 = 0
        L7d:
            if (r9 == 0) goto L95
            android.widget.EdgeEffect r9 = r8.t
            int r0 = r0 - r2
            float r0 = (float) r0
            int r1 = r8.getHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            com.daaw.qv.d(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.t
            r9.onRelease()
            r8.invalidate()
            r1 = 1
        L95:
            r9 = r1
            r1 = r2
            goto L9a
        L98:
            r1 = r0
        L99:
            r9 = 0
        L9a:
            if (r1 == r3) goto La4
            int r9 = r8.getScrollX()
            super.scrollTo(r9, r1)
            return r6
        La4:
            return r9
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.y) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.F;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid pointerId=");
                            sb.append(i2);
                            sb.append(" in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.u) > this.C && (2 & getNestedScrollAxes()) == 0) {
                                this.y = true;
                                this.u = y;
                                z();
                                this.z.addMovement(motionEvent);
                                this.I = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        E(motionEvent);
                    }
                }
            }
            this.y = false;
            this.F = -1;
            H();
            if (this.r.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                xs1.i0(this);
            }
            T(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (w((int) motionEvent.getX(), y2)) {
                this.u = y2;
                this.F = motionEvent.getPointerId(0);
                x();
                this.z.addMovement(motionEvent);
                this.r.computeScrollOffset();
                if (!S(motionEvent) && this.r.isFinished()) {
                    z = false;
                }
                this.y = z;
                R(2, 0);
            } else {
                if (!S(motionEvent) && this.r.isFinished()) {
                    z = false;
                }
                this.y = z;
                H();
            }
        }
        return this.y;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.v = false;
        View view = this.x;
        if (view != null && B(view, this)) {
            L(this.x);
        }
        this.x = null;
        if (!this.w) {
            if (this.K != null) {
                scrollTo(getScrollX(), this.K.p);
                this.K = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int e = e(scrollY, paddingTop, i5);
            if (e != scrollY) {
                scrollTo(getScrollX(), e);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.w = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        t((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        o(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        D(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public void onNestedScrollAccepted(View view, View view2, int i) {
        m(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View findNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i) : focusFinder.findNextFocusFromRect(this, rect, i);
        if (findNextFocus == null || A(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.K = savedState;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.p = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        c cVar = this.O;
        if (cVar != null) {
            cVar.a(this, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !C(findFocus, 0, i4)) {
            return;
        }
        findFocus.getDrawingRect(this.q);
        offsetDescendantRectToMyCoords(findFocus, this.q);
        i(f(this.q));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return l(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public void onStopNestedScroll(View view) {
        n(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
        if (r23.r.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
        com.daaw.xs1.i0(r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0219, code lost:
        if (r23.r.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01cb  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(int i) {
        EdgeEffect edgeEffect;
        if (qv.b(this.s) != 0.0f) {
            edgeEffect = this.s;
        } else if (qv.b(this.t) == 0.0f) {
            return false;
        } else {
            edgeEffect = this.t;
            i = -i;
        }
        edgeEffect.onAbsorb(i);
        return true;
    }

    public final void q() {
        this.y = false;
        H();
        T(0);
        this.s.onRelease();
        this.t.onRelease();
    }

    public boolean r(KeyEvent keyEvent) {
        this.q.setEmpty();
        if (!d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        } else if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return !keyEvent.isAltPressed() ? b(33) : u(33);
            } else if (keyCode == 20) {
                return !keyEvent.isAltPressed() ? b(130) : u(130);
            } else if (keyCode != 62) {
                return false;
            } else {
                G(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
        } else {
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.v) {
            this.x = view2;
        } else {
            L(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return M(rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            H();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.v = true;
        super.requestLayout();
    }

    public final View s(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                            view = view2;
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else {
                        if (!z4) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int e = e(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int e2 = e(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (e == getScrollX() && e2 == getScrollY()) {
                return;
            }
            super.scrollTo(e, e2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.A) {
            this.A = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.M.m(z);
    }

    public void setOnScrollChangeListener(c cVar) {
        this.O = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.B = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return R(i, 0);
    }

    @Override // android.view.View, com.daaw.es0
    public void stopNestedScroll() {
        T(0);
    }

    public void t(int i) {
        if (getChildCount() > 0) {
            this.r.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            J(true);
        }
    }

    public boolean u(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.q;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.q.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.q;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.q;
        return K(i, rect3.top, rect3.bottom);
    }

    public boolean v(int i) {
        return this.M.k(i);
    }

    public final boolean w(int i, int i2) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
        }
        return false;
    }

    public final void x() {
        VelocityTracker velocityTracker = this.z;
        if (velocityTracker == null) {
            this.z = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public final void y() {
        this.r = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.C = viewConfiguration.getScaledTouchSlop();
        this.D = viewConfiguration.getScaledMinimumFlingVelocity();
        this.E = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public final void z() {
        if (this.z == null) {
            this.z = VelocityTracker.obtain();
        }
    }
}
