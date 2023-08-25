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
import com.daaw.C0560a0;
import com.daaw.C2759qv;
import com.daaw.C3388w;
import com.daaw.C3654y;
import com.daaw.es0;
import com.daaw.fs0;
import com.daaw.hs0;
import com.daaw.js0;
import com.daaw.qq0;
import com.daaw.u01;
import com.daaw.xs1;
import java.util.ArrayList;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements hs0, es0 {

    /* renamed from: P */
    public static final C0209a f1179P = new C0209a();

    /* renamed from: Q */
    public static final int[] f1180Q = {16843130};

    /* renamed from: A */
    public boolean f1181A;

    /* renamed from: B */
    public boolean f1182B;

    /* renamed from: C */
    public int f1183C;

    /* renamed from: D */
    public int f1184D;

    /* renamed from: E */
    public int f1185E;

    /* renamed from: F */
    public int f1186F;

    /* renamed from: G */
    public final int[] f1187G;

    /* renamed from: H */
    public final int[] f1188H;

    /* renamed from: I */
    public int f1189I;

    /* renamed from: J */
    public int f1190J;

    /* renamed from: K */
    public SavedState f1191K;

    /* renamed from: L */
    public final js0 f1192L;

    /* renamed from: M */
    public final fs0 f1193M;

    /* renamed from: N */
    public float f1194N;

    /* renamed from: O */
    public InterfaceC0211c f1195O;

    /* renamed from: p */
    public long f1196p;

    /* renamed from: q */
    public final Rect f1197q;

    /* renamed from: r */
    public OverScroller f1198r;

    /* renamed from: s */
    public EdgeEffect f1199s;

    /* renamed from: t */
    public EdgeEffect f1200t;

    /* renamed from: u */
    public int f1201u;

    /* renamed from: v */
    public boolean f1202v;

    /* renamed from: w */
    public boolean f1203w;

    /* renamed from: x */
    public View f1204x;

    /* renamed from: y */
    public boolean f1205y;

    /* renamed from: z */
    public VelocityTracker f1206z;

    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0208a();

        /* renamed from: p */
        public int f1207p;

        /* renamed from: androidx.core.widget.NestedScrollView$SavedState$a */
        /* loaded from: classes.dex */
        public class C0208a implements Parcelable.Creator<SavedState> {
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
            this.f1207p = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f1207p + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1207p);
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    /* loaded from: classes.dex */
    public static class C0209a extends C3388w {
        @Override // com.daaw.C3388w
        /* renamed from: f */
        public void mo354f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo354f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0560a0.m27784a(accessibilityEvent, nestedScrollView.getScrollX());
            C0560a0.m27783b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // com.daaw.C3388w
        /* renamed from: g */
        public void mo161g(View view, C3654y c3654y) {
            int scrollRange;
            super.mo161g(view, c3654y);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c3654y.m4335b0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c3654y.m4299t0(true);
            if (nestedScrollView.getScrollY() > 0) {
                c3654y.m4336b(C3654y.C3655a.f33182r);
                c3654y.m4336b(C3654y.C3655a.f33151C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c3654y.m4336b(C3654y.C3655a.f33181q);
                c3654y.m4336b(C3654y.C3655a.f33153E);
            }
        }

        @Override // com.daaw.C3388w
        /* renamed from: j */
        public boolean mo6629j(View view, int i, Bundle bundle) {
            if (super.mo6629j(view, i, bundle)) {
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
                            nestedScrollView.m29685Q(0, max, true);
                            return true;
                        }
                        return false;
                    } else if (i != 16908346) {
                        return false;
                    }
                }
                int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min != nestedScrollView.getScrollY()) {
                    nestedScrollView.m29685Q(0, min, true);
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    /* loaded from: classes.dex */
    public static class C0210b {
        /* renamed from: a */
        public static boolean m29659a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    /* loaded from: classes.dex */
    public interface InterfaceC0211c {
        /* renamed from: a */
        void mo29658a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u01.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1197q = new Rect();
        this.f1202v = true;
        this.f1203w = false;
        this.f1204x = null;
        this.f1205y = false;
        this.f1182B = true;
        this.f1186F = -1;
        this.f1187G = new int[2];
        this.f1188H = new int[2];
        this.f1199s = C2759qv.m12140a(context, attributeSet);
        this.f1200t = C2759qv.m12140a(context, attributeSet);
        m29663y();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1180Q, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1192L = new js0(this);
        this.f1193M = new fs0(this);
        setNestedScrollingEnabled(true);
        xs1.m4702r0(this, f1179P);
    }

    /* renamed from: B */
    public static boolean m29700B(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m29700B((View) parent, view2);
    }

    /* renamed from: e */
    public static int m29677e(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f1194N == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f1194N = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1194N;
    }

    /* renamed from: A */
    public final boolean m29701A(View view) {
        return !m29699C(view, 0, getHeight());
    }

    /* renamed from: C */
    public final boolean m29699C(View view, int i, int i2) {
        view.getDrawingRect(this.f1197q);
        offsetDescendantRectToMyCoords(view, this.f1197q);
        return this.f1197q.bottom + i >= getScrollY() && this.f1197q.top - i <= getScrollY() + i2;
    }

    /* renamed from: D */
    public final void m29698D(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1193M.m22350e(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* renamed from: E */
    public final void m29697E(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1186F) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1201u = (int) motionEvent.getY(i);
            this.f1186F = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1206z;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083 A[ADDED_TO_REGION] */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m29696F(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        int overScrollMode = getOverScrollMode();
        boolean z4 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z5 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        boolean z7 = overScrollMode == 0 || (overScrollMode == 1 && z5);
        int i9 = i3 + i;
        int i10 = !z6 ? 0 : i7;
        int i11 = i4 + i2;
        int i12 = !z7 ? 0 : i8;
        int i13 = -i10;
        int i14 = i10 + i5;
        int i15 = -i12;
        int i16 = i12 + i6;
        if (i9 > i14) {
            i9 = i14;
        } else if (i9 >= i13) {
            z2 = false;
            if (i11 <= i16) {
                i11 = i16;
            } else if (i11 >= i15) {
                z3 = false;
                if (z3 && !m29666v(1)) {
                    this.f1198r.springBack(i9, i11, 0, 0, 0, getScrollRange());
                }
                onOverScrolled(i9, i11, z2, z3);
                return !z2 || z3;
            } else {
                i11 = i15;
            }
            z3 = true;
            if (z3) {
                this.f1198r.springBack(i9, i11, 0, 0, 0, getScrollRange());
            }
            onOverScrolled(i9, i11, z2, z3);
            if (z2) {
            }
        } else {
            i9 = i13;
        }
        z2 = true;
        if (i11 <= i16) {
        }
        z3 = true;
        if (z3) {
        }
        onOverScrolled(i9, i11, z2, z3);
        if (z2) {
        }
    }

    /* renamed from: G */
    public boolean m29695G(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f1197q.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f1197q;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f1197q.top = getScrollY() - height;
            Rect rect2 = this.f1197q;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f1197q;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return m29691K(i, i2, i3);
    }

    /* renamed from: H */
    public final void m29694H() {
        VelocityTracker velocityTracker = this.f1206z;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1206z = null;
        }
    }

    /* renamed from: I */
    public final int m29693I(int i, float f) {
        float m12137d;
        EdgeEffect edgeEffect;
        float width = f / getWidth();
        float height = i / getHeight();
        float f2 = 0.0f;
        if (C2759qv.m12139b(this.f1199s) != 0.0f) {
            m12137d = -C2759qv.m12137d(this.f1199s, -height, width);
            if (C2759qv.m12139b(this.f1199s) == 0.0f) {
                edgeEffect = this.f1199s;
                edgeEffect.onRelease();
            }
            f2 = m12137d;
        } else if (C2759qv.m12139b(this.f1200t) != 0.0f) {
            m12137d = C2759qv.m12137d(this.f1200t, height, 1.0f - width);
            if (C2759qv.m12139b(this.f1200t) == 0.0f) {
                edgeEffect = this.f1200t;
                edgeEffect.onRelease();
            }
            f2 = m12137d;
        }
        int round = Math.round(f2 * getHeight());
        if (round != 0) {
            invalidate();
        }
        return round;
    }

    /* renamed from: J */
    public final void m29692J(boolean z) {
        if (z) {
            m29684R(2, 1);
        } else {
            m29682T(1);
        }
        this.f1190J = getScrollY();
        xs1.m4720i0(this);
    }

    /* renamed from: K */
    public final boolean m29691K(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View m29669s = m29669s(z2, i2, i3);
        if (m29669s == null) {
            m29669s = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m29673i(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (m29669s != findFocus()) {
            m29669s.requestFocus(i);
        }
        return z;
    }

    /* renamed from: L */
    public final void m29690L(View view) {
        view.getDrawingRect(this.f1197q);
        offsetDescendantRectToMyCoords(view, this.f1197q);
        int m29676f = m29676f(this.f1197q);
        if (m29676f != 0) {
            scrollBy(0, m29676f);
        }
    }

    /* renamed from: M */
    public final boolean m29689M(Rect rect, boolean z) {
        int m29676f = m29676f(rect);
        boolean z2 = m29676f != 0;
        if (z2) {
            if (z) {
                scrollBy(0, m29676f);
            } else {
                m29688N(0, m29676f);
            }
        }
        return z2;
    }

    /* renamed from: N */
    public final void m29688N(int i, int i2) {
        m29687O(i, i2, 250, false);
    }

    /* renamed from: O */
    public final void m29687O(int i, int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1196p > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int scrollY = getScrollY();
            OverScroller overScroller = this.f1198r;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
            m29692J(z);
        } else {
            if (!this.f1198r.isFinished()) {
                m29681a();
            }
            scrollBy(i, i2);
        }
        this.f1196p = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: P */
    public void m29686P(int i, int i2, int i3, boolean z) {
        m29687O(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    /* renamed from: Q */
    public void m29685Q(int i, int i2, boolean z) {
        m29686P(i, i2, 250, z);
    }

    /* renamed from: R */
    public boolean m29684R(int i, int i2) {
        return this.f1193M.m22339p(i, i2);
    }

    /* renamed from: S */
    public final boolean m29683S(MotionEvent motionEvent) {
        boolean z;
        if (C2759qv.m12139b(this.f1199s) != 0.0f) {
            C2759qv.m12137d(this.f1199s, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (C2759qv.m12139b(this.f1200t) != 0.0f) {
            C2759qv.m12137d(this.f1200t, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z;
    }

    /* renamed from: T */
    public void m29682T(int i) {
        this.f1193M.m22337r(i);
    }

    /* renamed from: a */
    public final void m29681a() {
        this.f1198r.abortAnimation();
        m29682T(1);
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

    /* renamed from: b */
    public boolean m29680b(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m29699C(findNextFocus, maxScrollAmount, getHeight())) {
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
            m29673i(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f1197q);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1197q);
            m29673i(m29676f(this.f1197q));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && m29701A(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
            return true;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m29679c() {
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
        if (this.f1198r.isFinished()) {
            return;
        }
        this.f1198r.computeScrollOffset();
        int currY = this.f1198r.getCurrY();
        int i = currY - this.f1190J;
        this.f1190J = currY;
        int[] iArr = this.f1188H;
        boolean z = false;
        iArr[1] = 0;
        m29675g(0, i, iArr, null, 1);
        int i2 = i - this.f1188H[1];
        int scrollRange = getScrollRange();
        if (i2 != 0) {
            int scrollY = getScrollY();
            m29696F(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i3 = i2 - scrollY2;
            int[] iArr2 = this.f1188H;
            iArr2[1] = 0;
            m29674h(0, scrollY2, 0, i3, this.f1187G, 1, iArr2);
            i2 = i3 - this.f1188H[1];
        }
        if (i2 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z = true;
            }
            if (z) {
                if (i2 < 0) {
                    if (this.f1199s.isFinished()) {
                        edgeEffect = this.f1199s;
                        edgeEffect.onAbsorb((int) this.f1198r.getCurrVelocity());
                    }
                } else if (this.f1200t.isFinished()) {
                    edgeEffect = this.f1200t;
                    edgeEffect.onAbsorb((int) this.f1198r.getCurrVelocity());
                }
            }
            m29681a();
        }
        if (this.f1198r.isFinished()) {
            m29682T(1);
        } else {
            xs1.m4720i0(this);
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

    /* renamed from: d */
    public final boolean m29678d() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m29670r(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1193M.m22354a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1193M.m22353b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m29675g(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1193M.m22349f(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i = 0;
        if (!this.f1199s.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 21 || C0210b.m29659a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft() + 0;
            } else {
                paddingLeft = 0;
            }
            if (i2 >= 21 && C0210b.m29659a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(paddingLeft, min);
            this.f1199s.setSize(width, height);
            if (this.f1199s.draw(canvas)) {
                xs1.m4720i0(this);
            }
            canvas.restoreToCount(save);
        }
        if (this.f1200t.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 21 || C0210b.m29659a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i = 0 + getPaddingLeft();
        }
        if (i3 >= 21 && C0210b.m29659a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f1200t.setSize(width2, height2);
        if (this.f1200t.draw(canvas)) {
            xs1.m4720i0(this);
        }
        canvas.restoreToCount(save2);
    }

    /* renamed from: f */
    public int m29676f(Rect rect) {
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

    /* renamed from: g */
    public boolean m29675g(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f1193M.m22351d(i, i2, iArr, iArr2, i3);
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
        return this.f1192L.m18279a();
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

    /* renamed from: h */
    public void m29674h(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.f1193M.m22350e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m29666v(0);
    }

    /* renamed from: i */
    public final void m29673i(int i) {
        if (i != 0) {
            if (this.f1182B) {
                m29688N(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    @Override // android.view.View, com.daaw.es0
    public boolean isNestedScrollingEnabled() {
        return this.f1193M.m22343l();
    }

    @Override // com.daaw.hs0
    /* renamed from: j */
    public void mo20442j(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m29698D(i4, i5, iArr);
    }

    @Override // com.daaw.gs0
    /* renamed from: k */
    public void mo21299k(View view, int i, int i2, int i3, int i4, int i5) {
        m29698D(i4, i5, null);
    }

    @Override // com.daaw.gs0
    /* renamed from: l */
    public boolean mo21298l(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // com.daaw.gs0
    /* renamed from: m */
    public void mo21297m(View view, View view2, int i, int i2) {
        this.f1192L.m18277c(view, view2, i, i2);
        m29684R(2, i2);
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
    /* renamed from: n */
    public void mo21296n(View view, int i) {
        this.f1192L.m18276d(view, i);
        m29682T(i);
    }

    @Override // com.daaw.gs0
    /* renamed from: o */
    public void mo21295o(View view, int i, int i2, int[] iArr, int i3) {
        m29675g(i, i2, iArr, null, i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1203w = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        int i;
        boolean z;
        int i2 = 0;
        if (motionEvent.getAction() == 8 && !this.f1205y) {
            if (qq0.m12285a(motionEvent, 2)) {
                i = 9;
            } else if (qq0.m12285a(motionEvent, NativeConstants.SSL_OP_CIPHER_SERVER_PREFERENCE)) {
                i = 26;
            } else {
                f = 0.0f;
                if (f != 0.0f) {
                    int scrollRange = getScrollRange();
                    int scrollY = getScrollY();
                    int verticalScrollFactorCompat = scrollY - ((int) (f * getVerticalScrollFactorCompat()));
                    if (verticalScrollFactorCompat < 0) {
                        if (m29679c() && !qq0.m12285a(motionEvent, 8194)) {
                            C2759qv.m12137d(this.f1199s, (-verticalScrollFactorCompat) / getHeight(), 0.5f);
                            this.f1199s.onRelease();
                            invalidate();
                            z = 1;
                        }
                        z = 0;
                    } else if (verticalScrollFactorCompat > scrollRange) {
                        if (m29679c() && !qq0.m12285a(motionEvent, 8194)) {
                            C2759qv.m12137d(this.f1200t, (verticalScrollFactorCompat - scrollRange) / getHeight(), 0.5f);
                            this.f1200t.onRelease();
                            invalidate();
                            i2 = 1;
                        }
                        z = i2;
                        i2 = scrollRange;
                    } else {
                        i2 = verticalScrollFactorCompat;
                        z = 0;
                    }
                    if (i2 != scrollY) {
                        super.scrollTo(getScrollX(), i2);
                        return true;
                    }
                    return z;
                }
            }
            f = motionEvent.getAxisValue(i);
            if (f != 0.0f) {
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.f1205y) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f1186F;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid pointerId=");
                            sb.append(i2);
                            sb.append(" in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f1201u) > this.f1183C && (2 & getNestedScrollAxes()) == 0) {
                                this.f1205y = true;
                                this.f1201u = y;
                                m29662z();
                                this.f1206z.addMovement(motionEvent);
                                this.f1189I = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m29697E(motionEvent);
                    }
                }
            }
            this.f1205y = false;
            this.f1186F = -1;
            m29694H();
            if (this.f1198r.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                xs1.m4720i0(this);
            }
            m29682T(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (m29665w((int) motionEvent.getX(), y2)) {
                this.f1201u = y2;
                this.f1186F = motionEvent.getPointerId(0);
                m29664x();
                this.f1206z.addMovement(motionEvent);
                this.f1198r.computeScrollOffset();
                if (!m29683S(motionEvent) && this.f1198r.isFinished()) {
                    z = false;
                }
                this.f1205y = z;
                m29684R(2, 0);
            } else {
                if (!m29683S(motionEvent) && this.f1198r.isFinished()) {
                    z = false;
                }
                this.f1205y = z;
                m29694H();
            }
        }
        return this.f1205y;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f1202v = false;
        View view = this.f1204x;
        if (view != null && m29700B(view, this)) {
            m29690L(this.f1204x);
        }
        this.f1204x = null;
        if (!this.f1203w) {
            if (this.f1191K != null) {
                scrollTo(getScrollX(), this.f1191K.f1207p);
                this.f1191K = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int m29677e = m29677e(scrollY, paddingTop, i5);
            if (m29677e != scrollY) {
                scrollTo(getScrollX(), m29677e);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1203w = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1181A && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
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
        m29668t((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo21295o(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m29698D(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo21297m(view, view2, i, 0);
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
        if (findNextFocus == null || m29701A(findNextFocus)) {
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
        this.f1191K = savedState;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1207p = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC0211c interfaceC0211c = this.f1195O;
        if (interfaceC0211c != null) {
            interfaceC0211c.mo29658a(this, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m29699C(findFocus, 0, i4)) {
            return;
        }
        findFocus.getDrawingRect(this.f1197q);
        offsetDescendantRectToMyCoords(findFocus, this.f1197q);
        m29673i(m29676f(this.f1197q));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo21298l(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public void onStopNestedScroll(View view) {
        mo21296n(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
        if (r23.f1198r.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
        com.daaw.xs1.m4720i0(r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0219, code lost:
        if (r23.f1198r.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01cb  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        EdgeEffect edgeEffect;
        m29662z();
        int actionMasked = motionEvent.getActionMasked();
        boolean z = false;
        if (actionMasked == 0) {
            this.f1189I = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, this.f1189I);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f1206z;
                velocityTracker.computeCurrentVelocity(1000, this.f1185E);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1186F);
                if (Math.abs(yVelocity) >= this.f1184D) {
                    if (!m29672p(yVelocity)) {
                        int i = -yVelocity;
                        float f = i;
                        if (!dispatchNestedPreFling(0.0f, f)) {
                            dispatchNestedFling(0.0f, f, true);
                            m29668t(i);
                        }
                    }
                }
                this.f1186F = -1;
                m29671q();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f1186F);
                if (findPointerIndex == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid pointerId=");
                    sb.append(this.f1186F);
                    sb.append(" in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i2 = this.f1201u - y;
                    int m29693I = i2 - m29693I(i2, motionEvent.getX(findPointerIndex));
                    if (!this.f1205y && Math.abs(m29693I) > this.f1183C) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f1205y = true;
                        int i3 = this.f1183C;
                        m29693I = m29693I > 0 ? m29693I - i3 : m29693I + i3;
                    }
                    int i4 = m29693I;
                    if (this.f1205y) {
                        if (m29675g(0, i4, this.f1188H, this.f1187G, 0)) {
                            i4 -= this.f1188H[1];
                            this.f1189I += this.f1187G[1];
                        }
                        int i5 = i4;
                        this.f1201u = y - this.f1187G[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z2 = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        boolean z3 = m29696F(0, i5, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !m29666v(0);
                        int scrollY2 = getScrollY() - scrollY;
                        int[] iArr = this.f1188H;
                        iArr[1] = 0;
                        m29674h(0, scrollY2, 0, i5 - scrollY2, this.f1187G, 0, iArr);
                        int i6 = this.f1201u;
                        int[] iArr2 = this.f1187G;
                        this.f1201u = i6 - iArr2[1];
                        this.f1189I += iArr2[1];
                        if (z2) {
                            int i7 = i5 - this.f1188H[1];
                            int i8 = scrollY + i7;
                            if (i8 < 0) {
                                C2759qv.m12137d(this.f1199s, (-i7) / getHeight(), motionEvent.getX(findPointerIndex) / getWidth());
                                if (!this.f1200t.isFinished()) {
                                    edgeEffect = this.f1200t;
                                    edgeEffect.onRelease();
                                }
                                if (this.f1199s.isFinished() || !this.f1200t.isFinished()) {
                                    xs1.m4720i0(this);
                                    if (z) {
                                        this.f1206z.clear();
                                    }
                                }
                            } else {
                                if (i8 > scrollRange) {
                                    C2759qv.m12137d(this.f1200t, i7 / getHeight(), 1.0f - (motionEvent.getX(findPointerIndex) / getWidth()));
                                    if (!this.f1199s.isFinished()) {
                                        edgeEffect = this.f1199s;
                                        edgeEffect.onRelease();
                                    }
                                }
                                if (this.f1199s.isFinished()) {
                                }
                                xs1.m4720i0(this);
                                if (z) {
                                }
                            }
                        }
                        z = z3;
                        if (z) {
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f1205y) {
                    if (getChildCount() > 0) {
                    }
                }
                this.f1186F = -1;
                m29671q();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f1201u = (int) motionEvent.getY(actionIndex);
                this.f1186F = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m29697E(motionEvent);
                this.f1201u = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f1186F));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            if (this.f1205y && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f1198r.isFinished()) {
                m29681a();
            }
            this.f1201u = (int) motionEvent.getY();
            this.f1186F = motionEvent.getPointerId(0);
            m29684R(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f1206z;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* renamed from: p */
    public final boolean m29672p(int i) {
        EdgeEffect edgeEffect;
        if (C2759qv.m12139b(this.f1199s) != 0.0f) {
            edgeEffect = this.f1199s;
        } else if (C2759qv.m12139b(this.f1200t) == 0.0f) {
            return false;
        } else {
            edgeEffect = this.f1200t;
            i = -i;
        }
        edgeEffect.onAbsorb(i);
        return true;
    }

    /* renamed from: q */
    public final void m29671q() {
        this.f1205y = false;
        m29694H();
        m29682T(0);
        this.f1199s.onRelease();
        this.f1200t.onRelease();
    }

    /* renamed from: r */
    public boolean m29670r(KeyEvent keyEvent) {
        this.f1197q.setEmpty();
        if (!m29678d()) {
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
                return !keyEvent.isAltPressed() ? m29680b(33) : m29667u(33);
            } else if (keyCode == 20) {
                return !keyEvent.isAltPressed() ? m29680b(130) : m29667u(130);
            } else if (keyCode != 62) {
                return false;
            } else {
                m29695G(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
        } else {
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f1202v) {
            this.f1204x = view2;
        } else {
            m29690L(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m29689M(rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m29694H();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f1202v = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public final View m29669s(boolean z, int i, int i2) {
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
            int m29677e = m29677e(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int m29677e2 = m29677e(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (m29677e == getScrollX() && m29677e2 == getScrollY()) {
                return;
            }
            super.scrollTo(m29677e, m29677e2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f1181A) {
            this.f1181A = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f1193M.m22342m(z);
    }

    public void setOnScrollChangeListener(InterfaceC0211c interfaceC0211c) {
        this.f1195O = interfaceC0211c;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f1182B = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return m29684R(i, 0);
    }

    @Override // android.view.View, com.daaw.es0
    public void stopNestedScroll() {
        m29682T(0);
    }

    /* renamed from: t */
    public void m29668t(int i) {
        if (getChildCount() > 0) {
            this.f1198r.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m29692J(true);
        }
    }

    /* renamed from: u */
    public boolean m29667u(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f1197q;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f1197q.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f1197q;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f1197q;
        return m29691K(i, rect3.top, rect3.bottom);
    }

    /* renamed from: v */
    public boolean m29666v(int i) {
        return this.f1193M.m22344k(i);
    }

    /* renamed from: w */
    public final boolean m29665w(int i, int i2) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
        }
        return false;
    }

    /* renamed from: x */
    public final void m29664x() {
        VelocityTracker velocityTracker = this.f1206z;
        if (velocityTracker == null) {
            this.f1206z = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: y */
    public final void m29663y() {
        this.f1198r = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1183C = viewConfiguration.getScaledTouchSlop();
        this.f1184D = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1185E = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: z */
    public final void m29662z() {
        if (this.f1206z == null) {
            this.f1206z = VelocityTracker.obtain();
        }
    }
}
