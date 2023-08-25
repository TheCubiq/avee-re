package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import com.daaw.kv0;
import com.daaw.px1;
import com.daaw.vt0;
import com.daaw.w;
import com.daaw.xs1;
import com.daaw.y;
import com.daaw.zk;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public static final int[] w0 = {16842931};
    public static final Comparator<f> x0 = new a();
    public static final Interpolator y0 = new b();
    public static final m z0 = new m();
    public l A;
    public int B;
    public Drawable C;
    public int D;
    public int E;
    public float F;
    public float G;
    public int H;
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public float S;
    public float T;
    public float U;
    public float V;
    public int W;
    public VelocityTracker a0;
    public int b0;
    public int c0;
    public int d0;
    public int e0;
    public boolean f0;
    public EdgeEffect g0;
    public EdgeEffect h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public int l0;
    public List<j> m0;
    public j n0;
    public j o0;
    public int p;
    public List<i> p0;
    public final ArrayList<f> q;
    public k q0;
    public final f r;
    public int r0;
    public final Rect s;
    public int s0;
    public kv0 t;
    public ArrayList<View> t0;
    public int u;
    public final Runnable u0;
    public int v;
    public int v0;
    public Parcelable w;
    public ClassLoader x;
    public Scroller y;
    public boolean z;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int r;
        public Parcelable s;
        public ClassLoader t;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.r = parcel.readInt();
            this.s = parcel.readParcelable(classLoader);
            this.t = classLoader;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.r + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.r);
            parcel.writeParcelable(this.s, i);
        }
    }

    /* loaded from: classes.dex */
    public static class a implements Comparator<f> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(f fVar, f fVar2) {
            return fVar.b - fVar2.b;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.D();
        }
    }

    /* loaded from: classes.dex */
    public class d implements vt0 {
        public final Rect a = new Rect();

        public d() {
        }

        @Override // com.daaw.vt0
        public px1 a(View view, px1 px1Var) {
            px1 d0 = xs1.d0(view, px1Var);
            if (d0.p()) {
                return d0;
            }
            Rect rect = this.a;
            rect.left = d0.j();
            rect.top = d0.l();
            rect.right = d0.k();
            rect.bottom = d0.i();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                px1 i2 = xs1.i(ViewPager.this.getChildAt(i), d0);
                rect.left = Math.min(i2.j(), rect.left);
                rect.top = Math.min(i2.l(), rect.top);
                rect.right = Math.min(i2.k(), rect.right);
                rect.bottom = Math.min(i2.i(), rect.bottom);
            }
            return d0.q(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface e {
    }

    /* loaded from: classes.dex */
    public static class f {
        public Object a;
        public int b;
        public boolean c;
        public float d;
        public float e;
    }

    /* loaded from: classes.dex */
    public static class g extends ViewGroup.LayoutParams {
        public boolean a;
        public int b;
        public float c;
        public boolean d;
        public int e;
        public int f;

        public g() {
            super(-1, -1);
            this.c = 0.0f;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.w0);
            this.b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public class h extends w {
        public h() {
        }

        @Override // com.daaw.w
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            kv0 kv0Var;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(n());
            if (accessibilityEvent.getEventType() != 4096 || (kv0Var = ViewPager.this.t) == null) {
                return;
            }
            accessibilityEvent.setItemCount(kv0Var.c());
            accessibilityEvent.setFromIndex(ViewPager.this.u);
            accessibilityEvent.setToIndex(ViewPager.this.u);
        }

        @Override // com.daaw.w
        public void g(View view, y yVar) {
            super.g(view, yVar);
            yVar.b0(ViewPager.class.getName());
            yVar.t0(n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                yVar.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                yVar.a(8192);
            }
        }

        @Override // com.daaw.w
        public boolean j(View view, int i, Bundle bundle) {
            ViewPager viewPager;
            int i2;
            if (super.j(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i2 = viewPager.u - 1;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                viewPager = ViewPager.this;
                i2 = viewPager.u + 1;
            }
            viewPager.setCurrentItem(i2);
            return true;
        }

        public final boolean n() {
            kv0 kv0Var = ViewPager.this.t;
            return kv0Var != null && kv0Var.c() > 1;
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        void a(ViewPager viewPager, kv0 kv0Var, kv0 kv0Var2);
    }

    /* loaded from: classes.dex */
    public interface j {
        void a(int i, float f, int i2);

        void b(int i);

        void c(int i);
    }

    /* loaded from: classes.dex */
    public interface k {
        void a(View view, float f);
    }

    /* loaded from: classes.dex */
    public class l extends DataSetObserver {
        public l() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.g();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.g();
        }
    }

    /* loaded from: classes.dex */
    public static class m implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z = gVar.a;
            return z != gVar2.a ? z ? 1 : -1 : gVar.e - gVar2.e;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = new ArrayList<>();
        this.r = new f();
        this.s = new Rect();
        this.v = -1;
        this.w = null;
        this.x = null;
        this.F = -3.4028235E38f;
        this.G = Float.MAX_VALUE;
        this.M = 1;
        this.W = -1;
        this.i0 = true;
        this.j0 = false;
        this.u0 = new c();
        this.v0 = 0;
        u();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.K != z) {
            this.K = z;
        }
    }

    public static boolean v(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    public boolean A() {
        kv0 kv0Var = this.t;
        if (kv0Var == null || this.u >= kv0Var.c() - 1) {
            return false;
        }
        K(this.u + 1, true);
        return true;
    }

    public final boolean B(int i2) {
        if (this.q.size() == 0) {
            if (this.i0) {
                return false;
            }
            this.k0 = false;
            x(0, 0.0f, 0);
            if (this.k0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f s = s();
        int clientWidth = getClientWidth();
        int i3 = this.B;
        int i4 = clientWidth + i3;
        float f2 = clientWidth;
        int i5 = s.b;
        float f3 = ((i2 / f2) - s.e) / (s.d + (i3 / f2));
        this.k0 = false;
        x(i5, f3, (int) (i4 * f3));
        if (this.k0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean C(float f2) {
        boolean z;
        boolean z2;
        float f3 = this.S - f2;
        this.S = f2;
        float scrollX = getScrollX() + f3;
        float clientWidth = getClientWidth();
        float f4 = this.F * clientWidth;
        float f5 = this.G * clientWidth;
        boolean z3 = false;
        f fVar = this.q.get(0);
        ArrayList<f> arrayList = this.q;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.b != 0) {
            f4 = fVar.e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (fVar2.b != this.t.c() - 1) {
            f5 = fVar2.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f4) {
            if (z) {
                this.g0.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z2) {
                this.h0.onPull(Math.abs(scrollX - f5) / clientWidth);
                z3 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.S += scrollX - i2;
        scrollTo(i2, getScrollY());
        B(i2);
        return z3;
    }

    public void D() {
        E(this.u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (r9 == r10) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
        if (r10 >= 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ce, code lost:
        if (r10 >= 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00dc, code lost:
        if (r10 >= 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00de, code lost:
        r5 = r17.q.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e7, code lost:
        r5 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E(int r18) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.E(int):void");
    }

    public final void F(int i2, int i3, int i4, int i5) {
        int min;
        if (i3 <= 0 || this.q.isEmpty()) {
            f t = t(this.u);
            min = (int) ((t != null ? Math.min(t.e, this.G) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
            if (min == getScrollX()) {
                return;
            }
            f(false);
        } else if (!this.y.isFinished()) {
            this.y.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            min = (int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)) * (((i2 - getPaddingLeft()) - getPaddingRight()) + i4));
        }
        scrollTo(min, getScrollY());
    }

    public final void G() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((g) getChildAt(i2).getLayoutParams()).a) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    public final void H(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public final boolean I() {
        this.W = -1;
        n();
        this.g0.onRelease();
        this.h0.onRelease();
        return this.g0.isFinished() || this.h0.isFinished();
    }

    public final void J(int i2, boolean z, int i3, boolean z2) {
        f t = t(i2);
        int clientWidth = t != null ? (int) (getClientWidth() * Math.max(this.F, Math.min(t.e, this.G))) : 0;
        if (z) {
            N(clientWidth, 0, i3);
            if (z2) {
                j(i2);
                return;
            }
            return;
        }
        if (z2) {
            j(i2);
        }
        f(false);
        scrollTo(clientWidth, 0);
        B(clientWidth);
    }

    public void K(int i2, boolean z) {
        this.L = false;
        L(i2, z, false);
    }

    public void L(int i2, boolean z, boolean z2) {
        M(i2, z, z2, 0);
    }

    public void M(int i2, boolean z, boolean z2, int i3) {
        kv0 kv0Var = this.t;
        if (kv0Var == null || kv0Var.c() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.u != i2 || this.q.size() == 0) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 >= this.t.c()) {
                i2 = this.t.c() - 1;
            }
            int i4 = this.M;
            int i5 = this.u;
            if (i2 > i5 + i4 || i2 < i5 - i4) {
                for (int i6 = 0; i6 < this.q.size(); i6++) {
                    this.q.get(i6).c = true;
                }
            }
            boolean z3 = this.u != i2;
            if (!this.i0) {
                E(i2);
                J(i2, z, i3, z3);
                return;
            }
            this.u = i2;
            if (z3) {
                j(i2);
            }
            requestLayout();
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public void N(int i2, int i3, int i4) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.y;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.z ? this.y.getCurrX() : this.y.getStartX();
            this.y.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i5 = scrollX;
        int scrollY = getScrollY();
        int i6 = i2 - i5;
        int i7 = i3 - scrollY;
        if (i6 == 0 && i7 == 0) {
            f(false);
            D();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f2 = clientWidth;
        float f3 = i8;
        float l2 = f3 + (l(Math.min(1.0f, (Math.abs(i6) * 1.0f) / f2)) * f3);
        int abs = Math.abs(i4);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(l2 / abs) * 1000.0f) * 4 : (int) (((Math.abs(i6) / ((f2 * this.t.f(this.u)) + this.B)) + 1.0f) * 100.0f), 600);
        this.z = false;
        this.y.startScroll(i5, scrollY, i6, i7, min);
        xs1.i0(this);
    }

    public final void O() {
        if (this.s0 != 0) {
            ArrayList<View> arrayList = this.t0;
            if (arrayList == null) {
                this.t0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.t0.add(getChildAt(i2));
            }
            Collections.sort(this.t0, z0);
        }
    }

    public f a(int i2, int i3) {
        f fVar = new f();
        fVar.b = i2;
        fVar.a = this.t.g(this, i2);
        fVar.d = this.t.f(i2);
        if (i3 < 0 || i3 >= this.q.size()) {
            this.q.add(fVar);
        } else {
            this.q.add(i3, fVar);
        }
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        f r;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (r = r(childAt)) != null && r.b == this.u) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f r;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (r = r(childAt)) != null && r.b == this.u) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean v = gVar.a | v(view);
        gVar.a = v;
        if (!this.J) {
            super.addView(view, i2, layoutParams);
        } else if (v) {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        } else {
            gVar.d = true;
            addViewInLayout(view, i2, layoutParams);
        }
    }

    public void b(j jVar) {
        if (this.m0 == null) {
            this.m0 = new ArrayList();
        }
        this.m0.add(jVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto Lb
        L9:
            r0 = r3
            goto L60
        Lb:
            if (r0 == 0) goto L60
            android.view.ViewParent r4 = r0.getParent()
        L11:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L1e
            if (r4 != r6) goto L19
            r4 = 1
            goto L1f
        L19:
            android.view.ViewParent r4 = r4.getParent()
            goto L11
        L1e:
            r4 = 0
        L1f:
            if (r4 != 0) goto L60
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L35:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L4e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L35
        L4e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            goto L9
        L60:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto Lac
            if (r3 == r0) goto Lac
            if (r7 != r5) goto L91
            android.graphics.Rect r1 = r6.s
            android.graphics.Rect r1 = r6.p(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.s
            android.graphics.Rect r2 = r6.p(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L8b
            if (r1 < r2) goto L8b
            boolean r0 = r6.z()
            goto L8f
        L8b:
            boolean r0 = r3.requestFocus()
        L8f:
            r2 = r0
            goto Lbf
        L91:
            if (r7 != r4) goto Lbf
            android.graphics.Rect r1 = r6.s
            android.graphics.Rect r1 = r6.p(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.s
            android.graphics.Rect r2 = r6.p(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L8b
            if (r1 > r2) goto L8b
            boolean r0 = r6.A()
            goto L8f
        Lac:
            if (r7 == r5) goto Lbb
            if (r7 != r1) goto Lb1
            goto Lbb
        Lb1:
            if (r7 == r4) goto Lb6
            r0 = 2
            if (r7 != r0) goto Lbf
        Lb6:
            boolean r2 = r6.A()
            goto Lbf
        Lbb:
            boolean r2 = r6.z()
        Lbf:
            if (r2 == 0) goto Lc8
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        Lc8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.c(int):boolean");
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        if (this.t == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) clientWidth) * this.F)) : i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.G));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.z = true;
        if (this.y.isFinished() || !this.y.computeScrollOffset()) {
            f(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.y.getCurrX();
        int currY = this.y.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!B(currX)) {
                this.y.abortAnimation();
                scrollTo(0, currY);
            }
        }
        xs1.i0(this);
    }

    public final void d(f fVar, int i2, f fVar2) {
        int i3;
        int i4;
        f fVar3;
        f fVar4;
        int c2 = this.t.c();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? this.B / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i5 = fVar2.b;
            int i6 = fVar.b;
            if (i5 < i6) {
                float f3 = fVar2.e + fVar2.d + f2;
                int i7 = i5 + 1;
                int i8 = 0;
                while (i7 <= fVar.b && i8 < this.q.size()) {
                    while (true) {
                        fVar4 = this.q.get(i8);
                        if (i7 <= fVar4.b || i8 >= this.q.size() - 1) {
                            break;
                        }
                        i8++;
                    }
                    while (i7 < fVar4.b) {
                        f3 += this.t.f(i7) + f2;
                        i7++;
                    }
                    fVar4.e = f3;
                    f3 += fVar4.d + f2;
                    i7++;
                }
            } else if (i5 > i6) {
                int size = this.q.size() - 1;
                float f4 = fVar2.e;
                while (true) {
                    i5--;
                    if (i5 < fVar.b || size < 0) {
                        break;
                    }
                    while (true) {
                        fVar3 = this.q.get(size);
                        if (i5 >= fVar3.b || size <= 0) {
                            break;
                        }
                        size--;
                    }
                    while (i5 > fVar3.b) {
                        f4 -= this.t.f(i5) + f2;
                        i5--;
                    }
                    f4 -= fVar3.d + f2;
                    fVar3.e = f4;
                }
            }
        }
        int size2 = this.q.size();
        float f5 = fVar.e;
        int i9 = fVar.b;
        int i10 = i9 - 1;
        this.F = i9 == 0 ? f5 : -3.4028235E38f;
        int i11 = c2 - 1;
        this.G = i9 == i11 ? (fVar.d + f5) - 1.0f : Float.MAX_VALUE;
        int i12 = i2 - 1;
        while (i12 >= 0) {
            f fVar5 = this.q.get(i12);
            while (true) {
                i4 = fVar5.b;
                if (i10 <= i4) {
                    break;
                }
                f5 -= this.t.f(i10) + f2;
                i10--;
            }
            f5 -= fVar5.d + f2;
            fVar5.e = f5;
            if (i4 == 0) {
                this.F = f5;
            }
            i12--;
            i10--;
        }
        float f6 = fVar.e + fVar.d + f2;
        int i13 = fVar.b + 1;
        int i14 = i2 + 1;
        while (i14 < size2) {
            f fVar6 = this.q.get(i14);
            while (true) {
                i3 = fVar6.b;
                if (i13 >= i3) {
                    break;
                }
                f6 += this.t.f(i13) + f2;
                i13++;
            }
            if (i3 == i11) {
                this.G = (fVar6.d + f6) - 1.0f;
            }
            fVar6.e = f6;
            f6 += fVar6.d + f2;
            i14++;
            i13++;
        }
        this.j0 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || o(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f r;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (r = r(childAt)) != null && r.b == this.u && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        kv0 kv0Var;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (kv0Var = this.t) != null && kv0Var.c() > 1)) {
            if (!this.g0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.F * width);
                this.g0.setSize(height, width);
                z = false | this.g0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.h0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.G + 1.0f)) * width2);
                this.h0.setSize(height2, width2);
                z |= this.h0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.g0.finish();
            this.h0.finish();
        }
        if (z) {
            xs1.i0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.C;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public boolean e(View view, boolean z, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && e(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i2);
    }

    public final void f(boolean z) {
        boolean z2 = this.v0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.y.isFinished()) {
                this.y.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.y.getCurrX();
                int currY = this.y.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        B(currX);
                    }
                }
            }
        }
        this.L = false;
        for (int i2 = 0; i2 < this.q.size(); i2++) {
            f fVar = this.q.get(i2);
            if (fVar.c) {
                fVar.c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                xs1.j0(this, this.u0);
            } else {
                this.u0.run();
            }
        }
    }

    public void g() {
        int c2 = this.t.c();
        this.p = c2;
        boolean z = this.q.size() < (this.M * 2) + 1 && this.q.size() < c2;
        int i2 = this.u;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < this.q.size()) {
            f fVar = this.q.get(i3);
            int d2 = this.t.d(fVar.a);
            if (d2 != -1) {
                if (d2 == -2) {
                    this.q.remove(i3);
                    i3--;
                    if (!z2) {
                        this.t.n(this);
                        z2 = true;
                    }
                    this.t.a(this, fVar.b, fVar.a);
                    int i4 = this.u;
                    if (i4 == fVar.b) {
                        i2 = Math.max(0, Math.min(i4, c2 - 1));
                    }
                } else {
                    int i5 = fVar.b;
                    if (i5 != d2) {
                        if (i5 == this.u) {
                            i2 = d2;
                        }
                        fVar.b = d2;
                    }
                }
                z = true;
            }
            i3++;
        }
        if (z2) {
            this.t.b(this);
        }
        Collections.sort(this.q, x0);
        if (z) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                g gVar = (g) getChildAt(i6).getLayoutParams();
                if (!gVar.a) {
                    gVar.c = 0.0f;
                }
            }
            L(i2, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public kv0 getAdapter() {
        return this.t;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        if (this.s0 == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((g) this.t0.get(i3).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.u;
    }

    public int getOffscreenPageLimit() {
        return this.M;
    }

    public int getPageMargin() {
        return this.B;
    }

    public final int h(int i2, float f2, int i3, int i4) {
        if (Math.abs(i4) <= this.d0 || Math.abs(i3) <= this.b0) {
            i2 += (int) (f2 + (i2 >= this.u ? 0.4f : 0.6f));
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.q.size() > 0) {
            ArrayList<f> arrayList = this.q;
            return Math.max(this.q.get(0).b, Math.min(i2, arrayList.get(arrayList.size() - 1).b));
        }
        return i2;
    }

    public final void i(int i2, float f2, int i3) {
        j jVar = this.n0;
        if (jVar != null) {
            jVar.a(i2, f2, i3);
        }
        List<j> list = this.m0;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                j jVar2 = this.m0.get(i4);
                if (jVar2 != null) {
                    jVar2.a(i2, f2, i3);
                }
            }
        }
        j jVar3 = this.o0;
        if (jVar3 != null) {
            jVar3.a(i2, f2, i3);
        }
    }

    public final void j(int i2) {
        j jVar = this.n0;
        if (jVar != null) {
            jVar.c(i2);
        }
        List<j> list = this.m0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar2 = this.m0.get(i3);
                if (jVar2 != null) {
                    jVar2.c(i2);
                }
            }
        }
        j jVar3 = this.o0;
        if (jVar3 != null) {
            jVar3.c(i2);
        }
    }

    public final void k(int i2) {
        j jVar = this.n0;
        if (jVar != null) {
            jVar.b(i2);
        }
        List<j> list = this.m0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar2 = this.m0.get(i3);
                if (jVar2 != null) {
                    jVar2.b(i2);
                }
            }
        }
        j jVar3 = this.o0;
        if (jVar3 != null) {
            jVar3.b(i2);
        }
    }

    public float l(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    public final void m(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).setLayerType(z ? this.r0 : 0, null);
        }
    }

    public final void n() {
        this.N = false;
        this.O = false;
        VelocityTracker velocityTracker = this.a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.a0 = null;
        }
    }

    public boolean o(KeyEvent keyEvent) {
        int i2;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return c(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return c(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return A();
                } else {
                    i2 = 66;
                }
            } else if (keyEvent.hasModifiers(2)) {
                return z();
            } else {
                i2 = 17;
            }
            return c(i2);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.u0);
        Scroller scroller = this.y;
        if (scroller != null && !scroller.isFinished()) {
            this.y.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        int i2;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.B <= 0 || this.C == null || this.q.size() <= 0 || this.t == null) {
            return;
        }
        int scrollX = getScrollX();
        float width2 = getWidth();
        float f4 = this.B / width2;
        int i3 = 0;
        f fVar = this.q.get(0);
        float f5 = fVar.e;
        int size = this.q.size();
        int i4 = fVar.b;
        int i5 = this.q.get(size - 1).b;
        while (i4 < i5) {
            while (true) {
                i2 = fVar.b;
                if (i4 <= i2 || i3 >= size) {
                    break;
                }
                i3++;
                fVar = this.q.get(i3);
            }
            if (i4 == i2) {
                float f6 = fVar.e;
                float f7 = fVar.d;
                f2 = (f6 + f7) * width2;
                f5 = f6 + f7 + f4;
            } else {
                float f8 = this.t.f(i4);
                f2 = (f5 + f8) * width2;
                f5 += f8 + f4;
            }
            if (this.B + f2 > scrollX) {
                f3 = f4;
                this.C.setBounds(Math.round(f2), this.D, Math.round(this.B + f2), this.E);
                this.C.draw(canvas);
            } else {
                f3 = f4;
            }
            if (f2 > scrollX + width) {
                return;
            }
            i4++;
            f4 = f3;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            I();
            return false;
        }
        if (action != 0) {
            if (this.N) {
                return true;
            }
            if (this.O) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.U = x;
            this.S = x;
            float y = motionEvent.getY();
            this.V = y;
            this.T = y;
            this.W = motionEvent.getPointerId(0);
            this.O = false;
            this.z = true;
            this.y.computeScrollOffset();
            if (this.v0 != 2 || Math.abs(this.y.getFinalX() - this.y.getCurrX()) <= this.e0) {
                f(false);
                this.N = false;
            } else {
                this.y.abortAnimation();
                this.L = false;
                D();
                this.N = true;
                H(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.W;
            if (i2 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i2);
                float x2 = motionEvent.getX(findPointerIndex);
                float f2 = x2 - this.S;
                float abs = Math.abs(f2);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.V);
                if (f2 != 0.0f && !w(this.S, f2) && e(this, false, (int) f2, (int) x2, (int) y2)) {
                    this.S = x2;
                    this.T = y2;
                    this.O = true;
                    return false;
                }
                int i3 = this.R;
                if (abs > i3 && abs * 0.5f > abs2) {
                    this.N = true;
                    H(true);
                    setScrollState(1);
                    this.S = f2 > 0.0f ? this.U + this.R : this.U - this.R;
                    this.T = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > i3) {
                    this.O = true;
                }
                if (this.N && C(x2)) {
                    xs1.i0(this);
                }
            }
        } else if (action == 6) {
            y(motionEvent);
        }
        if (this.a0 == null) {
            this.a0 = VelocityTracker.obtain();
        }
        this.a0.addMovement(motionEvent);
        return this.N;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        f r;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
        }
        while (i3 != i5) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (r = r(childAt)) != null && r.b == this.u && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        kv0 kv0Var = this.t;
        if (kv0Var != null) {
            kv0Var.j(savedState.s, savedState.t);
            L(savedState.r, false, true);
            return;
        }
        this.v = savedState.r;
        this.w = savedState.s;
        this.x = savedState.t;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.r = this.u;
        kv0 kv0Var = this.t;
        if (kv0Var != null) {
            savedState.s = kv0Var.k();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.B;
            F(i2, i4, i6, i6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final Rect p(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public f q(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return r(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public f r(View view) {
        for (int i2 = 0; i2 < this.q.size(); i2++) {
            f fVar = this.q.get(i2);
            if (this.t.h(view, fVar.a)) {
                return fVar;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.J) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final f s() {
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f3 = clientWidth > 0 ? this.B / clientWidth : 0.0f;
        f fVar = null;
        float f4 = 0.0f;
        int i3 = -1;
        int i4 = 0;
        boolean z = true;
        while (i4 < this.q.size()) {
            f fVar2 = this.q.get(i4);
            if (!z && fVar2.b != (i2 = i3 + 1)) {
                fVar2 = this.r;
                fVar2.e = f2 + f4 + f3;
                fVar2.b = i2;
                fVar2.d = this.t.f(i2);
                i4--;
            }
            f2 = fVar2.e;
            float f5 = fVar2.d + f2 + f3;
            if (!z && scrollX < f2) {
                return fVar;
            }
            if (scrollX < f5 || i4 == this.q.size() - 1) {
                return fVar2;
            }
            i3 = fVar2.b;
            f4 = fVar2.d;
            i4++;
            fVar = fVar2;
            z = false;
        }
        return fVar;
    }

    public void setAdapter(kv0 kv0Var) {
        kv0 kv0Var2 = this.t;
        if (kv0Var2 != null) {
            kv0Var2.m(null);
            this.t.n(this);
            for (int i2 = 0; i2 < this.q.size(); i2++) {
                f fVar = this.q.get(i2);
                this.t.a(this, fVar.b, fVar.a);
            }
            this.t.b(this);
            this.q.clear();
            G();
            this.u = 0;
            scrollTo(0, 0);
        }
        kv0 kv0Var3 = this.t;
        this.t = kv0Var;
        this.p = 0;
        if (kv0Var != null) {
            if (this.A == null) {
                this.A = new l();
            }
            this.t.m(this.A);
            this.L = false;
            boolean z = this.i0;
            this.i0 = true;
            this.p = this.t.c();
            if (this.v >= 0) {
                this.t.j(this.w, this.x);
                L(this.v, false, true);
                this.v = -1;
                this.w = null;
                this.x = null;
            } else if (z) {
                requestLayout();
            } else {
                D();
            }
        }
        List<i> list = this.p0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.p0.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.p0.get(i3).a(this, kv0Var3, kv0Var);
        }
    }

    public void setCurrentItem(int i2) {
        this.L = false;
        L(i2, !this.i0, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested offscreen page limit ");
            sb.append(i2);
            sb.append(" too small; defaulting to ");
            sb.append(1);
            i2 = 1;
        }
        if (i2 != this.M) {
            this.M = i2;
            D();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.n0 = jVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.B;
        this.B = i2;
        int width = getWidth();
        F(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(zk.e(getContext(), i2));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.C = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i2) {
        if (this.v0 == i2) {
            return;
        }
        this.v0 = i2;
        if (this.q0 != null) {
            m(i2 != 0);
        }
        k(i2);
    }

    public f t(int i2) {
        for (int i3 = 0; i3 < this.q.size(); i3++) {
            f fVar = this.q.get(i3);
            if (fVar.b == i2) {
                return fVar;
            }
        }
        return null;
    }

    public void u() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.y = new Scroller(context, y0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.R = viewConfiguration.getScaledPagingTouchSlop();
        this.b0 = (int) (400.0f * f2);
        this.c0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.g0 = new EdgeEffect(context);
        this.h0 = new EdgeEffect(context);
        this.d0 = (int) (25.0f * f2);
        this.e0 = (int) (2.0f * f2);
        this.P = (int) (f2 * 16.0f);
        xs1.r0(this, new h());
        if (xs1.C(this) == 0) {
            xs1.B0(this, 1);
        }
        xs1.D0(this, new d());
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.C;
    }

    public final boolean w(float f2, float f3) {
        return (f2 < ((float) this.Q) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.Q)) && f3 < 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.l0
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r9 = (androidx.viewpager.widget.ViewPager.g) r9
            boolean r10 = r9.a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            r12.i(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$k r13 = r12.q0
            if (r13 == 0) goto L9f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r0 = (androidx.viewpager.widget.ViewPager.g) r0
            boolean r0 = r0.a
            if (r0 == 0) goto L8b
            goto L9c
        L8b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$k r3 = r12.q0
            r3.a(r15, r0)
        L9c:
            int r1 = r1 + 1
            goto L7a
        L9f:
            r12.k0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.x(int, float, int):void");
    }

    public final void y(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.W) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.S = motionEvent.getX(i2);
            this.W = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.a0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean z() {
        int i2 = this.u;
        if (i2 > 0) {
            K(i2 - 1, true);
            return true;
        }
        return false;
    }
}
