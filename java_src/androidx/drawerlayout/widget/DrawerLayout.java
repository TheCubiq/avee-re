package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.customview.view.AbsSavedState;
import com.daaw.at1;
import com.daaw.g80;
import com.daaw.nu;
import com.daaw.w;
import com.daaw.xs1;
import com.daaw.y;
import com.daaw.zk;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    public static final int[] d0 = {16843828};
    public static final int[] e0 = {16842931};
    public static final boolean f0;
    public static final boolean g0;
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public d I;
    public List<d> J;
    public float K;
    public float L;
    public Drawable M;
    public Drawable N;
    public Drawable O;
    public CharSequence P;
    public CharSequence Q;
    public Object R;
    public boolean S;
    public Drawable T;
    public Drawable U;
    public Drawable V;
    public Drawable W;
    public final ArrayList<View> a0;
    public Rect b0;
    public Matrix c0;
    public final c p;
    public float q;
    public int r;
    public int s;
    public float t;
    public Paint u;
    public final at1 v;
    public final at1 w;
    public final f x;
    public final f y;
    public int z;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;

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
            this.r = 0;
            this.r = parcel.readInt();
            this.s = parcel.readInt();
            this.t = parcel.readInt();
            this.u = parcel.readInt();
            this.v = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.r = 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.r);
            parcel.writeInt(this.s);
            parcel.writeInt(this.t);
            parcel.writeInt(this.u);
            parcel.writeInt(this.v);
        }
    }

    /* loaded from: classes.dex */
    public class a implements View.OnApplyWindowInsetsListener {
        public a() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).P(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* loaded from: classes.dex */
    public class b extends w {
        public final Rect d = new Rect();

        public b() {
        }

        @Override // com.daaw.w
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                List<CharSequence> text = accessibilityEvent.getText();
                View n = DrawerLayout.this.n();
                if (n != null) {
                    CharSequence q = DrawerLayout.this.q(DrawerLayout.this.r(n));
                    if (q != null) {
                        text.add(q);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return super.a(view, accessibilityEvent);
        }

        @Override // com.daaw.w
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        @Override // com.daaw.w
        public void g(View view, y yVar) {
            if (DrawerLayout.f0) {
                super.g(view, yVar);
            } else {
                y Q = y.Q(yVar);
                super.g(view, Q);
                yVar.w0(view);
                ViewParent K = xs1.K(view);
                if (K instanceof View) {
                    yVar.q0((View) K);
                }
                o(yVar, Q);
                Q.S();
                n(yVar, (ViewGroup) view);
            }
            yVar.b0(DrawerLayout.class.getName());
            yVar.i0(false);
            yVar.j0(false);
            yVar.T(y.a.e);
            yVar.T(y.a.f);
        }

        @Override // com.daaw.w
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f0 || DrawerLayout.y(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        public final void n(y yVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.y(childAt)) {
                    yVar.c(childAt);
                }
            }
        }

        public final void o(y yVar, y yVar2) {
            Rect rect = this.d;
            yVar2.m(rect);
            yVar.X(rect);
            yVar2.n(rect);
            yVar.Y(rect);
            yVar.B0(yVar2.N());
            yVar.o0(yVar2.u());
            yVar.b0(yVar2.p());
            yVar.f0(yVar2.r());
            yVar.g0(yVar2.F());
            yVar.c0(yVar2.E());
            yVar.i0(yVar2.G());
            yVar.j0(yVar2.H());
            yVar.V(yVar2.B());
            yVar.u0(yVar2.L());
            yVar.m0(yVar2.I());
            yVar.a(yVar2.k());
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends w {
        @Override // com.daaw.w
        public void g(View view, y yVar) {
            super.g(view, yVar);
            if (DrawerLayout.y(view)) {
                return;
            }
            yVar.q0(null);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(View view);

        void b(View view);

        void c(int i);

        void d(View view, float f);
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public int a;
        public float b;
        public boolean c;
        public int d;

        public e(int i, int i2) {
            super(i, i2);
            this.a = 0;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.e0);
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 0;
        }

        public e(e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.a = 0;
            this.a = eVar.a;
        }
    }

    /* loaded from: classes.dex */
    public class f extends at1.c {
        public final int a;
        public at1 b;
        public final Runnable c = new a();

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.o();
            }
        }

        public f(int i) {
            this.a = i;
        }

        @Override // com.daaw.at1.c
        public int a(View view, int i, int i2) {
            int width;
            int width2;
            if (DrawerLayout.this.c(view, 3)) {
                width2 = -view.getWidth();
                width = 0;
            } else {
                width = DrawerLayout.this.getWidth();
                width2 = width - view.getWidth();
            }
            return Math.max(width2, Math.min(i, width));
        }

        @Override // com.daaw.at1.c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // com.daaw.at1.c
        public int d(View view) {
            if (DrawerLayout.this.C(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // com.daaw.at1.c
        public void f(int i, int i2) {
            DrawerLayout drawerLayout;
            int i3;
            if ((i & 1) == 1) {
                drawerLayout = DrawerLayout.this;
                i3 = 3;
            } else {
                drawerLayout = DrawerLayout.this;
                i3 = 5;
            }
            View l = drawerLayout.l(i3);
            if (l == null || DrawerLayout.this.p(l) != 0) {
                return;
            }
            this.b.b(l, i2);
        }

        @Override // com.daaw.at1.c
        public boolean g(int i) {
            return false;
        }

        @Override // com.daaw.at1.c
        public void h(int i, int i2) {
            DrawerLayout.this.postDelayed(this.c, 160L);
        }

        @Override // com.daaw.at1.c
        public void i(View view, int i) {
            ((e) view.getLayoutParams()).c = false;
            n();
        }

        @Override // com.daaw.at1.c
        public void j(int i) {
            DrawerLayout.this.T(this.a, i, this.b.v());
        }

        @Override // com.daaw.at1.c
        public void k(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.c(view, 3) ? i + width : DrawerLayout.this.getWidth() - i) / width;
            DrawerLayout.this.R(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // com.daaw.at1.c
        public void l(View view, float f, float f2) {
            int i;
            float s = DrawerLayout.this.s(view);
            int width = view.getWidth();
            if (DrawerLayout.this.c(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && s > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && s > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.b.M(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // com.daaw.at1.c
        public boolean m(View view, int i) {
            return DrawerLayout.this.C(view) && DrawerLayout.this.c(view, this.a) && DrawerLayout.this.p(view) == 0;
        }

        public final void n() {
            View l = DrawerLayout.this.l(this.a == 3 ? 5 : 3);
            if (l != null) {
                DrawerLayout.this.d(l);
            }
        }

        public void o() {
            View l;
            int width;
            int w = this.b.w();
            boolean z = this.a == 3;
            if (z) {
                l = DrawerLayout.this.l(3);
                width = (l != null ? -l.getWidth() : 0) + w;
            } else {
                l = DrawerLayout.this.l(5);
                width = DrawerLayout.this.getWidth() - w;
            }
            if (l != null) {
                if (((!z || l.getLeft() >= width) && (z || l.getLeft() <= width)) || DrawerLayout.this.p(l) != 0) {
                    return;
                }
                this.b.O(l, width, l.getTop());
                ((e) l.getLayoutParams()).c = true;
                DrawerLayout.this.invalidate();
                n();
                DrawerLayout.this.b();
            }
        }

        public void p() {
            DrawerLayout.this.removeCallbacks(this.c);
        }

        public void q(at1 at1Var) {
            this.b = at1Var;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f0 = true;
        g0 = i >= 21;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.p = new c();
        this.s = -1728053248;
        this.u = new Paint();
        this.B = true;
        this.C = 3;
        this.D = 3;
        this.E = 3;
        this.F = 3;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.r = (int) ((64.0f * f2) + 0.5f);
        float f3 = 400.0f * f2;
        f fVar = new f(3);
        this.x = fVar;
        f fVar2 = new f(5);
        this.y = fVar2;
        at1 n = at1.n(this, 1.0f, fVar);
        this.v = n;
        n.K(1);
        n.L(f3);
        fVar.q(n);
        at1 n2 = at1.n(this, 1.0f, fVar2);
        this.w = n2;
        n2.K(2);
        n2.L(f3);
        fVar2.q(n2);
        setFocusableInTouchMode(true);
        xs1.B0(this, 1);
        xs1.r0(this, new b());
        setMotionEventSplittingEnabled(false);
        if (xs1.B(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new a());
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(d0);
                try {
                    this.M = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.M = null;
            }
        }
        this.q = f2 * 10.0f;
        this.a0 = new ArrayList<>();
    }

    public static String u(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    public static boolean v(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    public static boolean y(View view) {
        return (xs1.C(view) == 4 || xs1.C(view) == 2) ? false : true;
    }

    public boolean A(int i) {
        View l = l(i);
        if (l != null) {
            return B(l);
        }
        return false;
    }

    public boolean B(View view) {
        if (C(view)) {
            return (((e) view.getLayoutParams()).d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean C(View view) {
        int b2 = g80.b(((e) view.getLayoutParams()).a, xs1.E(view));
        return ((b2 & 3) == 0 && (b2 & 5) == 0) ? false : true;
    }

    public boolean D(View view) {
        if (C(view)) {
            return ((e) view.getLayoutParams()).b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final boolean E(float f2, float f3, View view) {
        if (this.b0 == null) {
            this.b0 = new Rect();
        }
        view.getHitRect(this.b0);
        return this.b0.contains((int) f2, (int) f3);
    }

    public final boolean F(Drawable drawable, int i) {
        if (drawable == null || !nu.h(drawable)) {
            return false;
        }
        nu.m(drawable, i);
        return true;
    }

    public void G(View view, float f2) {
        float s = s(view);
        float width = view.getWidth();
        int i = ((int) (width * f2)) - ((int) (s * width));
        if (!c(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        R(view, f2);
    }

    public void H(int i) {
        I(i, true);
    }

    public void I(int i, boolean z) {
        View l = l(i);
        if (l != null) {
            K(l, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + u(i));
    }

    public void J(View view) {
        K(view, true);
    }

    public void K(View view, boolean z) {
        if (!C(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        e eVar = (e) view.getLayoutParams();
        if (this.B) {
            eVar.b = 1.0f;
            eVar.d = 1;
            S(view, true);
        } else if (z) {
            eVar.d |= 2;
            if (c(view, 3)) {
                this.v.O(view, 0, view.getTop());
            } else {
                this.w.O(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            G(view, 1.0f);
            T(eVar.a, 0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void L(d dVar) {
        List<d> list;
        if (dVar == null || (list = this.J) == null) {
            return;
        }
        list.remove(dVar);
    }

    public final Drawable M() {
        int E = xs1.E(this);
        if (E == 0) {
            Drawable drawable = this.T;
            if (drawable != null) {
                F(drawable, E);
                return this.T;
            }
        } else {
            Drawable drawable2 = this.U;
            if (drawable2 != null) {
                F(drawable2, E);
                return this.U;
            }
        }
        return this.V;
    }

    public final Drawable N() {
        int E = xs1.E(this);
        if (E == 0) {
            Drawable drawable = this.U;
            if (drawable != null) {
                F(drawable, E);
                return this.U;
            }
        } else {
            Drawable drawable2 = this.T;
            if (drawable2 != null) {
                F(drawable2, E);
                return this.T;
            }
        }
        return this.W;
    }

    public final void O() {
        if (g0) {
            return;
        }
        this.N = M();
        this.O = N();
    }

    public void P(Object obj, boolean z) {
        this.R = obj;
        this.S = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void Q(int i, int i2) {
        View l;
        int b2 = g80.b(i2, xs1.E(this));
        if (i2 == 3) {
            this.C = i;
        } else if (i2 == 5) {
            this.D = i;
        } else if (i2 == 8388611) {
            this.E = i;
        } else if (i2 == 8388613) {
            this.F = i;
        }
        if (i != 0) {
            (b2 == 3 ? this.v : this.w).a();
        }
        if (i != 1) {
            if (i == 2 && (l = l(b2)) != null) {
                J(l);
                return;
            }
            return;
        }
        View l2 = l(b2);
        if (l2 != null) {
            d(l2);
        }
    }

    public void R(View view, float f2) {
        e eVar = (e) view.getLayoutParams();
        if (f2 == eVar.b) {
            return;
        }
        eVar.b = f2;
        j(view, f2);
    }

    public final void S(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            xs1.B0(childAt, ((z || C(childAt)) && !(z && childAt == view)) ? 4 : 1);
        }
    }

    public void T(int i, int i2, View view) {
        int z = this.v.z();
        int z2 = this.w.z();
        int i3 = 2;
        if (z == 1 || z2 == 1) {
            i3 = 1;
        } else if (z != 2 && z2 != 2) {
            i3 = 0;
        }
        if (view != null && i2 == 0) {
            float f2 = ((e) view.getLayoutParams()).b;
            if (f2 == 0.0f) {
                h(view);
            } else if (f2 == 1.0f) {
                i(view);
            }
        }
        if (i3 != this.z) {
            this.z = i3;
            List<d> list = this.J;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.J.get(size).c(i3);
                }
            }
        }
    }

    public void a(d dVar) {
        if (dVar == null) {
            return;
        }
        if (this.J == null) {
            this.J = new ArrayList();
        }
        this.J.add(dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!C(childAt)) {
                this.a0.add(childAt);
            } else if (B(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
        }
        if (!z) {
            int size = this.a0.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = this.a0.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.a0.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        xs1.B0(view, (m() != null || C(view)) ? 4 : 1);
        if (f0) {
            return;
        }
        xs1.r0(view, this.p);
    }

    public void b() {
        if (this.H) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchTouchEvent(obtain);
        }
        obtain.recycle();
        this.H = true;
    }

    public boolean c(View view, int i) {
        return (r(view) & i) == i;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f2 = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f2 = Math.max(f2, ((e) getChildAt(i).getLayoutParams()).b);
        }
        this.t = f2;
        boolean m = this.v.m(true);
        boolean m2 = this.w.m(true);
        if (m || m2) {
            xs1.i0(this);
        }
    }

    public void d(View view) {
        e(view, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.t <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount != 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            for (int i = childCount - 1; i >= 0; i--) {
                View childAt = getChildAt(i);
                if (E(x, y, childAt) && !z(childAt) && k(motionEvent, childAt)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        Drawable drawable;
        int height = getHeight();
        boolean z = z(view);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (z) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && v(childAt) && C(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f2 = this.t;
        if (f2 <= 0.0f || !z) {
            if (this.N != null && c(view, 3)) {
                int intrinsicWidth = this.N.getIntrinsicWidth();
                int right2 = view.getRight();
                float max = Math.max(0.0f, Math.min(right2 / this.v.w(), 1.0f));
                this.N.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
                this.N.setAlpha((int) (max * 255.0f));
                drawable = this.N;
            } else if (this.O != null && c(view, 5)) {
                int intrinsicWidth2 = this.O.getIntrinsicWidth();
                int left2 = view.getLeft();
                float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.w.w(), 1.0f));
                this.O.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
                this.O.setAlpha((int) (max2 * 255.0f));
                drawable = this.O;
            }
            drawable.draw(canvas);
        } else {
            int i4 = this.s;
            this.u.setColor((i4 & 16777215) | (((int) ((((-16777216) & i4) >>> 24) * f2)) << 24));
            canvas.drawRect(i, 0.0f, width, getHeight(), this.u);
        }
        return drawChild;
    }

    public void e(View view, boolean z) {
        at1 at1Var;
        int width;
        if (!C(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        e eVar = (e) view.getLayoutParams();
        if (this.B) {
            eVar.b = 0.0f;
            eVar.d = 0;
        } else if (z) {
            eVar.d |= 4;
            if (c(view, 3)) {
                at1Var = this.v;
                width = -view.getWidth();
            } else {
                at1Var = this.w;
                width = getWidth();
            }
            at1Var.O(view, width, view.getTop());
        } else {
            G(view, 0.0f);
            T(eVar.a, 0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    public void f() {
        g(false);
    }

    public void g(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            e eVar = (e) childAt.getLayoutParams();
            if (C(childAt) && (!z || eVar.c)) {
                z2 |= c(childAt, 3) ? this.v.O(childAt, -childAt.getWidth(), childAt.getTop()) : this.w.O(childAt, getWidth(), childAt.getTop());
                eVar.c = false;
            }
        }
        this.x.p();
        this.y.p();
        if (z2) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public float getDrawerElevation() {
        if (g0) {
            return this.q;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.M;
    }

    public void h(View view) {
        View rootView;
        e eVar = (e) view.getLayoutParams();
        if ((eVar.d & 1) == 1) {
            eVar.d = 0;
            List<d> list = this.J;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.J.get(size).b(view);
                }
            }
            S(view, false);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    public void i(View view) {
        e eVar = (e) view.getLayoutParams();
        if ((eVar.d & 1) == 0) {
            eVar.d = 1;
            List<d> list = this.J;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.J.get(size).a(view);
                }
            }
            S(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    public void j(View view, float f2) {
        List<d> list = this.J;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.J.get(size).d(view, f2);
            }
        }
    }

    public final boolean k(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent t = t(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(t);
            t.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    public View l(int i) {
        int b2 = g80.b(i, xs1.E(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((r(childAt) & 7) == b2) {
                return childAt;
            }
        }
        return null;
    }

    public View m() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((e) childAt.getLayoutParams()).d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public View n() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C(childAt) && D(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int o(int i) {
        int E = xs1.E(this);
        if (i == 3) {
            int i2 = this.C;
            if (i2 != 3) {
                return i2;
            }
            int i3 = E == 0 ? this.E : this.F;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        } else if (i == 5) {
            int i4 = this.D;
            if (i4 != 3) {
                return i4;
            }
            int i5 = E == 0 ? this.F : this.E;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        } else if (i == 8388611) {
            int i6 = this.E;
            if (i6 != 3) {
                return i6;
            }
            int i7 = E == 0 ? this.C : this.D;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        } else if (i != 8388613) {
            return 0;
        } else {
            int i8 = this.F;
            if (i8 != 3) {
                return i8;
            }
            int i9 = E == 0 ? this.D : this.C;
            if (i9 != 3) {
                return i9;
            }
            return 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object obj;
        super.onDraw(canvas);
        if (!this.S || this.M == null) {
            return;
        }
        int systemWindowInsetTop = (Build.VERSION.SDK_INT < 21 || (obj = this.R) == null) ? 0 : ((WindowInsets) obj).getSystemWindowInsetTop();
        if (systemWindowInsetTop > 0) {
            this.M.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.M.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r0 != 3) goto L7;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            com.daaw.at1 r1 = r6.v
            boolean r1 = r1.N(r7)
            com.daaw.at1 r2 = r6.w
            boolean r2 = r2.N(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L38
        L1e:
            com.daaw.at1 r7 = r6.v
            boolean r7 = r7.d(r4)
            if (r7 == 0) goto L38
            androidx.drawerlayout.widget.DrawerLayout$f r7 = r6.x
            r7.p()
            androidx.drawerlayout.widget.DrawerLayout$f r7 = r6.y
            r7.p()
            goto L38
        L31:
            r6.g(r2)
            r6.G = r3
            r6.H = r3
        L38:
            r7 = 0
            goto L64
        L3a:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.K = r0
            r6.L = r7
            float r4 = r6.t
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5f
            com.daaw.at1 r4 = r6.v
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.t(r0, r7)
            if (r7 == 0) goto L5f
            boolean r7 = r6.z(r7)
            if (r7 == 0) goto L5f
            r7 = 1
            goto L60
        L5f:
            r7 = 0
        L60:
            r6.G = r3
            r6.H = r3
        L64:
            if (r1 != 0) goto L74
            if (r7 != 0) goto L74
            boolean r7 = r6.w()
            if (r7 != 0) goto L74
            boolean r7 = r6.H
            if (r7 == 0) goto L73
            goto L74
        L73:
            r2 = 0
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && x()) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View n = n();
            if (n != null && p(n) == 0) {
                f();
            }
            return n != null;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f2;
        int i6;
        int measuredHeight;
        int i7;
        int i8;
        this.A = true;
        int i9 = i3 - i;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (z(childAt)) {
                    int i11 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                    childAt.layout(i11, ((ViewGroup.MarginLayoutParams) eVar).topMargin, childAt.getMeasuredWidth() + i11, ((ViewGroup.MarginLayoutParams) eVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f3 = measuredWidth;
                        i6 = (-measuredWidth) + ((int) (eVar.b * f3));
                        f2 = (measuredWidth + i6) / f3;
                    } else {
                        float f4 = measuredWidth;
                        f2 = (i9 - i5) / f4;
                        i6 = i9 - ((int) (eVar.b * f4));
                    }
                    boolean z2 = f2 != eVar.b;
                    int i12 = eVar.a & 112;
                    if (i12 != 16) {
                        if (i12 != 80) {
                            measuredHeight = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                            i7 = measuredWidth + i6;
                            i8 = measuredHeight2 + measuredHeight;
                        } else {
                            int i13 = i4 - i2;
                            measuredHeight = (i13 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - childAt.getMeasuredHeight();
                            i7 = measuredWidth + i6;
                            i8 = i13 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                        }
                        childAt.layout(i6, measuredHeight, i7, i8);
                    } else {
                        int i14 = i4 - i2;
                        int i15 = (i14 - measuredHeight2) / 2;
                        int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        if (i15 < i16) {
                            i15 = i16;
                        } else {
                            int i17 = i15 + measuredHeight2;
                            int i18 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                            if (i17 > i14 - i18) {
                                i15 = (i14 - i18) - measuredHeight2;
                            }
                        }
                        childAt.layout(i6, i15, measuredWidth + i6, measuredHeight2 + i15);
                    }
                    if (z2) {
                        R(childAt, f2);
                    }
                    int i19 = eVar.b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i19) {
                        childAt.setVisibility(i19);
                    }
                }
            }
        }
        this.A = false;
        this.B = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
            if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z = this.R != null && xs1.B(this);
        int E = xs1.E(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (z) {
                    int b2 = g80.b(eVar.a, E);
                    boolean B = xs1.B(childAt);
                    int i5 = Build.VERSION.SDK_INT;
                    if (B) {
                        if (i5 >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.R;
                            if (b2 == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (b2 == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (i5 >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.R;
                        if (b2 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (b2 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) eVar).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (z(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) eVar).leftMargin) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) eVar).topMargin) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, 1073741824));
                } else if (!C(childAt)) {
                    throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                } else {
                    if (g0) {
                        float y = xs1.y(childAt);
                        float f2 = this.q;
                        if (y != f2) {
                            xs1.z0(childAt, f2);
                        }
                    }
                    int r = r(childAt) & 7;
                    boolean z4 = r == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + u(r) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.r + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin, ((ViewGroup.MarginLayoutParams) eVar).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, ((ViewGroup.MarginLayoutParams) eVar).height));
                    i4++;
                    i3 = 0;
                }
            }
            i4++;
            i3 = 0;
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View l;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        int i = savedState.r;
        if (i != 0 && (l = l(i)) != null) {
            J(l);
        }
        int i2 = savedState.s;
        if (i2 != 3) {
            Q(i2, 3);
        }
        int i3 = savedState.t;
        if (i3 != 3) {
            Q(i3, 5);
        }
        int i4 = savedState.u;
        if (i4 != 3) {
            Q(i4, 8388611);
        }
        int i5 = savedState.v;
        if (i5 != 3) {
            Q(i5, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        O();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            e eVar = (e) getChildAt(i).getLayoutParams();
            int i2 = eVar.d;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                savedState.r = eVar.a;
                break;
            }
        }
        savedState.s = this.C;
        savedState.t = this.D;
        savedState.u = this.E;
        savedState.v = this.F;
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View m;
        this.v.E(motionEvent);
        this.w.E(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                View t = this.v.t((int) x, (int) y);
                if (t != null && z(t)) {
                    float f2 = x - this.K;
                    float f3 = y - this.L;
                    int y2 = this.v.y();
                    if ((f2 * f2) + (f3 * f3) < y2 * y2 && (m = m()) != null && p(m) != 2) {
                        z = false;
                        g(z);
                        this.G = false;
                    }
                }
                z = true;
                g(z);
                this.G = false;
            } else if (action == 3) {
                g(true);
            }
            return true;
        }
        float x2 = motionEvent.getX();
        float y3 = motionEvent.getY();
        this.K = x2;
        this.L = y3;
        this.G = false;
        this.H = false;
        return true;
    }

    public int p(View view) {
        if (C(view)) {
            return o(((e) view.getLayoutParams()).a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public CharSequence q(int i) {
        int b2 = g80.b(i, xs1.E(this));
        if (b2 == 3) {
            return this.P;
        }
        if (b2 == 5) {
            return this.Q;
        }
        return null;
    }

    public int r(View view) {
        return g80.b(((e) view.getLayoutParams()).a, xs1.E(this));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.G = z;
        if (z) {
            g(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.A) {
            return;
        }
        super.requestLayout();
    }

    public float s(View view) {
        return ((e) view.getLayoutParams()).b;
    }

    public void setDrawerElevation(float f2) {
        this.q = f2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (C(childAt)) {
                xs1.z0(childAt, this.q);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(d dVar) {
        d dVar2 = this.I;
        if (dVar2 != null) {
            L(dVar2);
        }
        if (dVar != null) {
            a(dVar);
        }
        this.I = dVar;
    }

    public void setDrawerLockMode(int i) {
        Q(i, 3);
        Q(i, 5);
    }

    public void setScrimColor(int i) {
        this.s = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.M = i != 0 ? zk.e(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.M = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.M = new ColorDrawable(i);
        invalidate();
    }

    public final MotionEvent t(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(getScrollX() - view.getLeft(), getScrollY() - view.getTop());
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.c0 == null) {
                this.c0 = new Matrix();
            }
            matrix.invert(this.c0);
            obtain.transform(this.c0);
        }
        return obtain;
    }

    public final boolean w() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((e) getChildAt(i).getLayoutParams()).c) {
                return true;
            }
        }
        return false;
    }

    public final boolean x() {
        return n() != null;
    }

    public boolean z(View view) {
        return ((e) view.getLayoutParams()).a == 0;
    }
}
