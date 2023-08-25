package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.customview.view.AbsSavedState;
import com.daaw.C2366nu;
import com.daaw.C2886rt;
import com.daaw.C3866zk;
import com.daaw.by0;
import com.daaw.ft1;
import com.daaw.fy0;
import com.daaw.g80;
import com.daaw.gs0;
import com.daaw.hs0;
import com.daaw.j21;
import com.daaw.js0;
import com.daaw.pt0;
import com.daaw.px1;
import com.daaw.q21;
import com.daaw.t01;
import com.daaw.vt0;
import com.daaw.xs1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements gs0, hs0 {

    /* renamed from: J */
    public static final String f1108J;

    /* renamed from: K */
    public static final Class<?>[] f1109K;

    /* renamed from: L */
    public static final ThreadLocal<Map<String, Constructor<AbstractC0194c>>> f1110L;

    /* renamed from: M */
    public static final Comparator<View> f1111M;

    /* renamed from: N */
    public static final by0<Rect> f1112N;

    /* renamed from: A */
    public View f1113A;

    /* renamed from: B */
    public ViewTreeObserver$OnPreDrawListenerC0198g f1114B;

    /* renamed from: C */
    public boolean f1115C;

    /* renamed from: D */
    public px1 f1116D;

    /* renamed from: E */
    public boolean f1117E;

    /* renamed from: F */
    public Drawable f1118F;

    /* renamed from: G */
    public ViewGroup.OnHierarchyChangeListener f1119G;

    /* renamed from: H */
    public vt0 f1120H;

    /* renamed from: I */
    public final js0 f1121I;

    /* renamed from: p */
    public final List<View> f1122p;

    /* renamed from: q */
    public final C2886rt<View> f1123q;

    /* renamed from: r */
    public final List<View> f1124r;

    /* renamed from: s */
    public final List<View> f1125s;

    /* renamed from: t */
    public Paint f1126t;

    /* renamed from: u */
    public final int[] f1127u;

    /* renamed from: v */
    public final int[] f1128v;

    /* renamed from: w */
    public boolean f1129w;

    /* renamed from: x */
    public boolean f1130x;

    /* renamed from: y */
    public int[] f1131y;

    /* renamed from: z */
    public View f1132z;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0191a();

        /* renamed from: r */
        public SparseArray<Parcelable> f1133r;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$a */
        /* loaded from: classes.dex */
        public static class C0191a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f1133r = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f1133r.append(iArr[i], readParcelableArray[i]);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f1133r;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f1133r.keyAt(i2);
                parcelableArr[i2] = this.f1133r.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    /* loaded from: classes.dex */
    public class C0192a implements vt0 {
        public C0192a() {
        }

        @Override // com.daaw.vt0
        /* renamed from: a */
        public px1 mo6806a(View view, px1 px1Var) {
            return CoordinatorLayout.this.m29802W(px1Var);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0193b {
        AbstractC0194c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0194c<V extends View> {
        public AbstractC0194c() {
        }

        public AbstractC0194c(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: A */
        public boolean mo928A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return m29766z(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        /* renamed from: B */
        public void m29777B(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: C */
        public void mo927C(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                m29777B(coordinatorLayout, v, view);
            }
        }

        /* renamed from: D */
        public boolean mo102D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean m29776a(CoordinatorLayout coordinatorLayout, V v) {
            return m29774d(coordinatorLayout, v) > 0.0f;
        }

        /* renamed from: b */
        public boolean mo440b(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: c */
        public int m29775c(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        /* renamed from: d */
        public float m29774d(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        /* renamed from: e */
        public boolean mo99e(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: f */
        public px1 m29773f(CoordinatorLayout coordinatorLayout, V v, px1 px1Var) {
            return px1Var;
        }

        /* renamed from: g */
        public void mo103g(C0197f c0197f) {
        }

        /* renamed from: h */
        public boolean mo127h(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: i */
        public void mo1003i(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: j */
        public void mo895j() {
        }

        /* renamed from: k */
        public boolean mo326k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: l */
        public boolean mo126l(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: m */
        public boolean mo1002m(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: n */
        public boolean m29772n(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        /* renamed from: o */
        public boolean mo889o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        /* renamed from: p */
        public void m29771p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* renamed from: q */
        public void mo886q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                m29771p(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        /* renamed from: r */
        public void m29770r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        /* renamed from: s */
        public void m29769s(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                m29770r(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        /* renamed from: t */
        public void mo882t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            m29769s(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        @Deprecated
        /* renamed from: u */
        public void m29768u(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        /* renamed from: v */
        public void m29767v(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                m29768u(coordinatorLayout, v, view, view2, i);
            }
        }

        /* renamed from: w */
        public boolean mo1001w(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: x */
        public void mo878x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: y */
        public Parcelable mo877y(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: z */
        public boolean m29766z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    /* loaded from: classes.dex */
    public @interface InterfaceC0195d {
        Class<? extends AbstractC0194c> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    /* loaded from: classes.dex */
    public class ViewGroup$OnHierarchyChangeListenerC0196e implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroup$OnHierarchyChangeListenerC0196e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1119G;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.m29817H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1119G;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    /* loaded from: classes.dex */
    public static class C0197f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public AbstractC0194c f1136a;

        /* renamed from: b */
        public boolean f1137b;

        /* renamed from: c */
        public int f1138c;

        /* renamed from: d */
        public int f1139d;

        /* renamed from: e */
        public int f1140e;

        /* renamed from: f */
        public int f1141f;

        /* renamed from: g */
        public int f1142g;

        /* renamed from: h */
        public int f1143h;

        /* renamed from: i */
        public int f1144i;

        /* renamed from: j */
        public int f1145j;

        /* renamed from: k */
        public View f1146k;

        /* renamed from: l */
        public View f1147l;

        /* renamed from: m */
        public boolean f1148m;

        /* renamed from: n */
        public boolean f1149n;

        /* renamed from: o */
        public boolean f1150o;

        /* renamed from: p */
        public boolean f1151p;

        /* renamed from: q */
        public final Rect f1152q;

        /* renamed from: r */
        public Object f1153r;

        public C0197f(int i, int i2) {
            super(i, i2);
            this.f1137b = false;
            this.f1138c = 0;
            this.f1139d = 0;
            this.f1140e = -1;
            this.f1141f = -1;
            this.f1142g = 0;
            this.f1143h = 0;
            this.f1152q = new Rect();
        }

        public C0197f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1137b = false;
            this.f1138c = 0;
            this.f1139d = 0;
            this.f1140e = -1;
            this.f1141f = -1;
            this.f1142g = 0;
            this.f1143h = 0;
            this.f1152q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q21.f23623e);
            this.f1138c = obtainStyledAttributes.getInteger(q21.f23624f, 0);
            this.f1141f = obtainStyledAttributes.getResourceId(q21.f23625g, -1);
            this.f1139d = obtainStyledAttributes.getInteger(q21.f23626h, 0);
            this.f1140e = obtainStyledAttributes.getInteger(q21.f23630l, -1);
            this.f1142g = obtainStyledAttributes.getInt(q21.f23629k, 0);
            this.f1143h = obtainStyledAttributes.getInt(q21.f23628j, 0);
            int i = q21.f23627i;
            boolean hasValue = obtainStyledAttributes.hasValue(i);
            this.f1137b = hasValue;
            if (hasValue) {
                this.f1136a = CoordinatorLayout.m29814K(context, attributeSet, obtainStyledAttributes.getString(i));
            }
            obtainStyledAttributes.recycle();
            AbstractC0194c abstractC0194c = this.f1136a;
            if (abstractC0194c != null) {
                abstractC0194c.mo103g(this);
            }
        }

        public C0197f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1137b = false;
            this.f1138c = 0;
            this.f1139d = 0;
            this.f1140e = -1;
            this.f1141f = -1;
            this.f1142g = 0;
            this.f1143h = 0;
            this.f1152q = new Rect();
        }

        public C0197f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1137b = false;
            this.f1138c = 0;
            this.f1139d = 0;
            this.f1140e = -1;
            this.f1141f = -1;
            this.f1142g = 0;
            this.f1143h = 0;
            this.f1152q = new Rect();
        }

        public C0197f(C0197f c0197f) {
            super((ViewGroup.MarginLayoutParams) c0197f);
            this.f1137b = false;
            this.f1138c = 0;
            this.f1139d = 0;
            this.f1140e = -1;
            this.f1141f = -1;
            this.f1142g = 0;
            this.f1143h = 0;
            this.f1152q = new Rect();
        }

        /* renamed from: a */
        public boolean m29765a() {
            return this.f1146k == null && this.f1141f != -1;
        }

        /* renamed from: b */
        public boolean m29764b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            AbstractC0194c abstractC0194c;
            return view2 == this.f1147l || m29747s(view2, xs1.m4768E(coordinatorLayout)) || ((abstractC0194c = this.f1136a) != null && abstractC0194c.mo99e(coordinatorLayout, view, view2));
        }

        /* renamed from: c */
        public boolean m29763c() {
            if (this.f1136a == null) {
                this.f1148m = false;
            }
            return this.f1148m;
        }

        /* renamed from: d */
        public View m29762d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f1141f == -1) {
                this.f1147l = null;
                this.f1146k = null;
                return null;
            }
            if (this.f1146k == null || !m29746t(view, coordinatorLayout)) {
                m29752n(view, coordinatorLayout);
            }
            return this.f1146k;
        }

        /* renamed from: e */
        public int m29761e() {
            return this.f1141f;
        }

        /* renamed from: f */
        public AbstractC0194c m29760f() {
            return this.f1136a;
        }

        /* renamed from: g */
        public boolean m29759g() {
            return this.f1151p;
        }

        /* renamed from: h */
        public Rect m29758h() {
            return this.f1152q;
        }

        /* renamed from: i */
        public boolean m29757i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f1148m;
            if (z) {
                return true;
            }
            AbstractC0194c abstractC0194c = this.f1136a;
            boolean m29776a = (abstractC0194c != null ? abstractC0194c.m29776a(coordinatorLayout, view) : false) | z;
            this.f1148m = m29776a;
            return m29776a;
        }

        /* renamed from: j */
        public boolean m29756j(int i) {
            if (i != 0) {
                if (i != 1) {
                    return false;
                }
                return this.f1150o;
            }
            return this.f1149n;
        }

        /* renamed from: k */
        public void m29755k() {
            this.f1151p = false;
        }

        /* renamed from: l */
        public void m29754l(int i) {
            m29748r(i, false);
        }

        /* renamed from: m */
        public void m29753m() {
            this.f1148m = false;
        }

        /* renamed from: n */
        public final void m29752n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f1141f);
            this.f1146k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                        } else if (!coordinatorLayout.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f1147l = findViewById;
                    return;
                } else if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (!coordinatorLayout.isInEditMode()) {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f1141f) + " to anchor view " + view);
            }
            this.f1147l = null;
            this.f1146k = null;
        }

        /* renamed from: o */
        public void m29751o(AbstractC0194c abstractC0194c) {
            AbstractC0194c abstractC0194c2 = this.f1136a;
            if (abstractC0194c2 != abstractC0194c) {
                if (abstractC0194c2 != null) {
                    abstractC0194c2.mo895j();
                }
                this.f1136a = abstractC0194c;
                this.f1153r = null;
                this.f1137b = true;
                if (abstractC0194c != null) {
                    abstractC0194c.mo103g(this);
                }
            }
        }

        /* renamed from: p */
        public void m29750p(boolean z) {
            this.f1151p = z;
        }

        /* renamed from: q */
        public void m29749q(Rect rect) {
            this.f1152q.set(rect);
        }

        /* renamed from: r */
        public void m29748r(int i, boolean z) {
            if (i == 0) {
                this.f1149n = z;
            } else if (i != 1) {
            } else {
                this.f1150o = z;
            }
        }

        /* renamed from: s */
        public final boolean m29747s(View view, int i) {
            int m21894b = g80.m21894b(((C0197f) view.getLayoutParams()).f1142g, i);
            return m21894b != 0 && (g80.m21894b(this.f1143h, i) & m21894b) == m21894b;
        }

        /* renamed from: t */
        public final boolean m29746t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f1146k.getId() != this.f1141f) {
                return false;
            }
            View view2 = this.f1146k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f1147l = null;
                    this.f1146k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f1147l = view2;
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnPreDrawListenerC0198g implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserver$OnPreDrawListenerC0198g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.m29817H(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    /* loaded from: classes.dex */
    public static class C0199h implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            float m4748P = xs1.m4748P(view);
            float m4748P2 = xs1.m4748P(view2);
            if (m4748P > m4748P2) {
                return -1;
            }
            return m4748P < m4748P2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f1108J = r0 != null ? r0.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            f1111M = new C0199h();
        } else {
            f1111M = null;
        }
        f1109K = new Class[]{Context.class, AttributeSet.class};
        f1110L = new ThreadLocal<>();
        f1112N = new fy0(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, t01.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1122p = new ArrayList();
        this.f1123q = new C2886rt<>();
        this.f1124r = new ArrayList();
        this.f1125s = new ArrayList();
        this.f1127u = new int[2];
        this.f1128v = new int[2];
        this.f1121I = new js0(this);
        int[] iArr = q21.f23620b;
        TypedArray obtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, j21.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            int[] iArr2 = q21.f23620b;
            if (i == 0) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes, 0, j21.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes, i, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(q21.f23621c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f1131y = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f1131y.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr3 = this.f1131y;
                iArr3[i2] = (int) (iArr3[i2] * f);
            }
        }
        this.f1118F = obtainStyledAttributes.getDrawable(q21.f23622d);
        obtainStyledAttributes.recycle();
        m29801X();
        super.setOnHierarchyChangeListener(new ViewGroup$OnHierarchyChangeListenerC0196e());
        if (xs1.m4772C(this) == 0) {
            xs1.m4773B0(this, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: K */
    public static AbstractC0194c m29814K(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f1108J;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<AbstractC0194c>>> threadLocal = f1110L;
            Map<String, Constructor<AbstractC0194c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<AbstractC0194c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f1109K);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* renamed from: O */
    public static void m29810O(Rect rect) {
        rect.setEmpty();
        f1112N.mo22137a(rect);
    }

    /* renamed from: R */
    public static int m29807R(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: S */
    public static int m29806S(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: T */
    public static int m29805T(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: a */
    public static Rect m29800a() {
        Rect mo22136b = f1112N.mo22136b();
        return mo22136b == null ? new Rect() : mo22136b;
    }

    /* renamed from: c */
    public static int m29798c(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: A */
    public final boolean m29824A(View view) {
        return this.f1123q.m10963j(view);
    }

    /* renamed from: B */
    public boolean m29823B(View view, int i, int i2) {
        Rect m29800a = m29800a();
        m29787t(view, m29800a);
        try {
            return m29800a.contains(i, i2);
        } finally {
            m29810O(m29800a);
        }
    }

    /* renamed from: C */
    public final void m29822C(View view, int i) {
        C0197f c0197f = (C0197f) view.getLayoutParams();
        Rect m29800a = m29800a();
        m29800a.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0197f).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0197f).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0197f).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0197f).bottomMargin);
        if (this.f1116D != null && xs1.m4774B(this) && !xs1.m4774B(view)) {
            m29800a.left += this.f1116D.m12951j();
            m29800a.top += this.f1116D.m12949l();
            m29800a.right -= this.f1116D.m12950k();
            m29800a.bottom -= this.f1116D.m12952i();
        }
        Rect m29800a2 = m29800a();
        g80.m21895a(m29806S(c0197f.f1138c), view.getMeasuredWidth(), view.getMeasuredHeight(), m29800a, m29800a2, i);
        view.layout(m29800a2.left, m29800a2.top, m29800a2.right, m29800a2.bottom);
        m29810O(m29800a);
        m29810O(m29800a2);
    }

    /* renamed from: D */
    public final void m29821D(View view, View view2, int i) {
        Rect m29800a = m29800a();
        Rect m29800a2 = m29800a();
        try {
            m29787t(view2, m29800a);
            m29786u(view, i, m29800a, m29800a2);
            view.layout(m29800a2.left, m29800a2.top, m29800a2.right, m29800a2.bottom);
        } finally {
            m29810O(m29800a);
            m29810O(m29800a2);
        }
    }

    /* renamed from: E */
    public final void m29820E(View view, int i, int i2) {
        C0197f c0197f = (C0197f) view.getLayoutParams();
        int m21894b = g80.m21894b(m29805T(c0197f.f1138c), i2);
        int i3 = m21894b & 7;
        int i4 = m21894b & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int m29784w = m29784w(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            m29784w += measuredWidth / 2;
        } else if (i3 == 5) {
            m29784w += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0197f).leftMargin, Math.min(m29784w, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) c0197f).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0197f).topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0197f).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: F */
    public final void m29819F(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (xs1.m4742V(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C0197f c0197f = (C0197f) view.getLayoutParams();
            AbstractC0194c m29760f = c0197f.m29760f();
            Rect m29800a = m29800a();
            Rect m29800a2 = m29800a();
            m29800a2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (m29760f == null || !m29760f.mo440b(this, view, m29800a)) {
                m29800a.set(m29800a2);
            } else if (!m29800a2.contains(m29800a)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + m29800a.toShortString() + " | Bounds:" + m29800a2.toShortString());
            }
            m29810O(m29800a2);
            if (m29800a.isEmpty()) {
                m29810O(m29800a);
                return;
            }
            int m21894b = g80.m21894b(c0197f.f1143h, i);
            boolean z3 = true;
            if ((m21894b & 48) != 48 || (i6 = (m29800a.top - ((ViewGroup.MarginLayoutParams) c0197f).topMargin) - c0197f.f1145j) >= (i7 = rect.top)) {
                z = false;
            } else {
                m29803V(view, i7 - i6);
                z = true;
            }
            if ((m21894b & 80) == 80 && (height = ((getHeight() - m29800a.bottom) - ((ViewGroup.MarginLayoutParams) c0197f).bottomMargin) + c0197f.f1145j) < (i5 = rect.bottom)) {
                m29803V(view, height - i5);
                z = true;
            }
            if (!z) {
                m29803V(view, 0);
            }
            if ((m21894b & 3) != 3 || (i3 = (m29800a.left - ((ViewGroup.MarginLayoutParams) c0197f).leftMargin) - c0197f.f1144i) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                m29804U(view, i4 - i3);
                z2 = true;
            }
            if ((m21894b & 5) != 5 || (width = ((getWidth() - m29800a.right) - ((ViewGroup.MarginLayoutParams) c0197f).rightMargin) + c0197f.f1144i) >= (i2 = rect.right)) {
                z3 = z2;
            } else {
                m29804U(view, width - i2);
            }
            if (!z3) {
                m29804U(view, 0);
            }
            m29810O(m29800a);
        }
    }

    /* renamed from: G */
    public void m29818G(View view, int i) {
        AbstractC0194c m29760f;
        C0197f c0197f = (C0197f) view.getLayoutParams();
        if (c0197f.f1146k != null) {
            Rect m29800a = m29800a();
            Rect m29800a2 = m29800a();
            Rect m29800a3 = m29800a();
            m29787t(c0197f.f1146k, m29800a);
            boolean z = false;
            m29790q(view, false, m29800a2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            m29785v(view, i, m29800a, m29800a3, c0197f, measuredWidth, measuredHeight);
            z = (m29800a3.left == m29800a2.left && m29800a3.top == m29800a2.top) ? true : true;
            m29797d(c0197f, m29800a3, measuredWidth, measuredHeight);
            int i2 = m29800a3.left - m29800a2.left;
            int i3 = m29800a3.top - m29800a2.top;
            if (i2 != 0) {
                xs1.m4734b0(view, i2);
            }
            if (i3 != 0) {
                xs1.m4732c0(view, i3);
            }
            if (z && (m29760f = c0197f.m29760f()) != null) {
                m29760f.mo127h(this, view, c0197f.f1146k);
            }
            m29810O(m29800a);
            m29810O(m29800a2);
            m29810O(m29800a3);
        }
    }

    /* renamed from: H */
    public final void m29817H(int i) {
        boolean z;
        int m4768E = xs1.m4768E(this);
        int size = this.f1122p.size();
        Rect m29800a = m29800a();
        Rect m29800a2 = m29800a();
        Rect m29800a3 = m29800a();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f1122p.get(i2);
            C0197f c0197f = (C0197f) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (c0197f.f1147l == this.f1122p.get(i3)) {
                        m29818G(view, m4768E);
                    }
                }
                m29790q(view, true, m29800a2);
                if (c0197f.f1142g != 0 && !m29800a2.isEmpty()) {
                    int m21894b = g80.m21894b(c0197f.f1142g, m4768E);
                    int i4 = m21894b & 112;
                    if (i4 == 48) {
                        m29800a.top = Math.max(m29800a.top, m29800a2.bottom);
                    } else if (i4 == 80) {
                        m29800a.bottom = Math.max(m29800a.bottom, getHeight() - m29800a2.top);
                    }
                    int i5 = m21894b & 7;
                    if (i5 == 3) {
                        m29800a.left = Math.max(m29800a.left, m29800a2.right);
                    } else if (i5 == 5) {
                        m29800a.right = Math.max(m29800a.right, getWidth() - m29800a2.left);
                    }
                }
                if (c0197f.f1143h != 0 && view.getVisibility() == 0) {
                    m29819F(view, m29800a, m4768E);
                }
                if (i != 2) {
                    m29783x(view, m29800a3);
                    if (!m29800a3.equals(m29800a2)) {
                        m29811N(view, m29800a2);
                    }
                }
                for (int i6 = i2 + 1; i6 < size; i6++) {
                    View view2 = this.f1122p.get(i6);
                    C0197f c0197f2 = (C0197f) view2.getLayoutParams();
                    AbstractC0194c m29760f = c0197f2.m29760f();
                    if (m29760f != null && m29760f.mo99e(this, view2, view)) {
                        if (i == 0 && c0197f2.m29759g()) {
                            c0197f2.m29755k();
                        } else {
                            if (i != 2) {
                                z = m29760f.mo127h(this, view2, view);
                            } else {
                                m29760f.mo1003i(this, view2, view);
                                z = true;
                            }
                            if (i == 1) {
                                c0197f2.m29750p(z);
                            }
                        }
                    }
                }
            }
        }
        m29810O(m29800a);
        m29810O(m29800a2);
        m29810O(m29800a3);
    }

    /* renamed from: I */
    public void m29816I(View view, int i) {
        C0197f c0197f = (C0197f) view.getLayoutParams();
        if (c0197f.m29765a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = c0197f.f1146k;
        if (view2 != null) {
            m29821D(view, view2, i);
            return;
        }
        int i2 = c0197f.f1140e;
        if (i2 >= 0) {
            m29820E(view, i2, i);
        } else {
            m29822C(view, i);
        }
    }

    /* renamed from: J */
    public void m29815J(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* renamed from: L */
    public final boolean m29813L(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f1124r;
        m29781z(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = list.get(i2);
            C0197f c0197f = (C0197f) view.getLayoutParams();
            AbstractC0194c m29760f = c0197f.m29760f();
            if (!(z || z2) || actionMasked == 0) {
                if (!z && m29760f != null) {
                    if (i == 0) {
                        z = m29760f.mo326k(this, view, motionEvent);
                    } else if (i == 1) {
                        z = m29760f.mo102D(this, view, motionEvent);
                    }
                    if (z) {
                        this.f1132z = view;
                    }
                }
                boolean m29763c = c0197f.m29763c();
                boolean m29757i = c0197f.m29757i(this, view);
                z2 = m29757i && !m29763c;
                if (m29757i && !z2) {
                    break;
                }
            } else if (m29760f != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    m29760f.mo326k(this, view, motionEvent2);
                } else if (i == 1) {
                    m29760f.mo102D(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z;
    }

    /* renamed from: M */
    public final void m29812M() {
        this.f1122p.clear();
        this.f1123q.m10970c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0197f m29782y = m29782y(childAt);
            m29782y.m29762d(this, childAt);
            this.f1123q.m10971b(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (m29782y.m29764b(this, childAt, childAt2)) {
                        if (!this.f1123q.m10969d(childAt2)) {
                            this.f1123q.m10971b(childAt2);
                        }
                        this.f1123q.m10972a(childAt2, childAt);
                    }
                }
            }
        }
        this.f1122p.addAll(this.f1123q.m10964i());
        Collections.reverse(this.f1122p);
    }

    /* renamed from: N */
    public void m29811N(View view, Rect rect) {
        ((C0197f) view.getLayoutParams()).m29749q(rect);
    }

    /* renamed from: P */
    public void m29809P() {
        if (this.f1130x && this.f1114B != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1114B);
        }
        this.f1115C = false;
    }

    /* renamed from: Q */
    public final void m29808Q(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC0194c m29760f = ((C0197f) childAt.getLayoutParams()).m29760f();
            if (m29760f != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    m29760f.mo326k(this, childAt, obtain);
                } else {
                    m29760f.mo102D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0197f) getChildAt(i2).getLayoutParams()).m29753m();
        }
        this.f1132z = null;
        this.f1129w = false;
    }

    /* renamed from: U */
    public final void m29804U(View view, int i) {
        C0197f c0197f = (C0197f) view.getLayoutParams();
        int i2 = c0197f.f1144i;
        if (i2 != i) {
            xs1.m4734b0(view, i - i2);
            c0197f.f1144i = i;
        }
    }

    /* renamed from: V */
    public final void m29803V(View view, int i) {
        C0197f c0197f = (C0197f) view.getLayoutParams();
        int i2 = c0197f.f1145j;
        if (i2 != i) {
            xs1.m4732c0(view, i - i2);
            c0197f.f1145j = i;
        }
    }

    /* renamed from: W */
    public final px1 m29802W(px1 px1Var) {
        if (pt0.m13160a(this.f1116D, px1Var)) {
            return px1Var;
        }
        this.f1116D = px1Var;
        boolean z = true;
        boolean z2 = px1Var != null && px1Var.m12949l() > 0;
        this.f1117E = z2;
        setWillNotDraw((z2 || getBackground() != null) ? false : false);
        px1 m29796e = m29796e(px1Var);
        requestLayout();
        return m29796e;
    }

    /* renamed from: X */
    public final void m29801X() {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (!xs1.m4774B(this)) {
            xs1.m4769D0(this, null);
            return;
        }
        if (this.f1120H == null) {
            this.f1120H = new C0192a();
        }
        xs1.m4769D0(this, this.f1120H);
        setSystemUiVisibility(1280);
    }

    /* renamed from: b */
    public void m29799b() {
        if (this.f1130x) {
            if (this.f1114B == null) {
                this.f1114B = new ViewTreeObserver$OnPreDrawListenerC0198g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1114B);
        }
        this.f1115C = true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0197f) && super.checkLayoutParams(layoutParams);
    }

    /* renamed from: d */
    public final void m29797d(C0197f c0197f, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0197f).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c0197f).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0197f).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c0197f).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        C0197f c0197f = (C0197f) view.getLayoutParams();
        AbstractC0194c abstractC0194c = c0197f.f1136a;
        if (abstractC0194c != null) {
            float m29774d = abstractC0194c.m29774d(this, view);
            if (m29774d > 0.0f) {
                if (this.f1126t == null) {
                    this.f1126t = new Paint();
                }
                this.f1126t.setColor(c0197f.f1136a.m29775c(this, view));
                this.f1126t.setAlpha(m29798c(Math.round(m29774d * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f1126t);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1118F;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final px1 m29796e(px1 px1Var) {
        AbstractC0194c m29760f;
        if (px1Var.m12945p()) {
            return px1Var;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (xs1.m4774B(childAt) && (m29760f = ((C0197f) childAt.getLayoutParams()).m29760f()) != null) {
                px1Var = m29760f.m29773f(this, childAt, px1Var);
                if (px1Var.m12945p()) {
                    break;
                }
            }
        }
        return px1Var;
    }

    /* renamed from: f */
    public void m29795f(View view) {
        List m10966g = this.f1123q.m10966g(view);
        if (m10966g == null || m10966g.isEmpty()) {
            return;
        }
        for (int i = 0; i < m10966g.size(); i++) {
            View view2 = (View) m10966g.get(i);
            AbstractC0194c m29760f = ((C0197f) view2.getLayoutParams()).m29760f();
            if (m29760f != null) {
                m29760f.mo127h(this, view2, view);
            }
        }
    }

    /* renamed from: g */
    public void m29794g() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m29824A(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z != this.f1115C) {
            if (z) {
                m29799b();
            } else {
                m29809P();
            }
        }
    }

    public final List<View> getDependencySortedChildren() {
        m29812M();
        return Collections.unmodifiableList(this.f1122p);
    }

    public final px1 getLastWindowInsets() {
        return this.f1116D;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1121I.m18279a();
    }

    public Drawable getStatusBarBackground() {
        return this.f1118F;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.ViewGroup
    /* renamed from: h */
    public C0197f generateDefaultLayoutParams() {
        return new C0197f(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: i */
    public C0197f generateLayoutParams(AttributeSet attributeSet) {
        return new C0197f(getContext(), attributeSet);
    }

    @Override // com.daaw.hs0
    /* renamed from: j */
    public void mo20442j(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC0194c m29760f;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0197f c0197f = (C0197f) childAt.getLayoutParams();
                if (c0197f.m29756j(i5) && (m29760f = c0197f.m29760f()) != null) {
                    int[] iArr2 = this.f1127u;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    m29760f.mo882t(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f1127u;
                    i6 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);
                    i7 = i4 > 0 ? Math.max(i7, this.f1127u[1]) : Math.min(i7, this.f1127u[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            m29817H(1);
        }
    }

    @Override // com.daaw.gs0
    /* renamed from: k */
    public void mo21299k(View view, int i, int i2, int i3, int i4, int i5) {
        mo20442j(view, i, i2, i3, i4, 0, this.f1128v);
    }

    @Override // com.daaw.gs0
    /* renamed from: l */
    public boolean mo21298l(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0197f c0197f = (C0197f) childAt.getLayoutParams();
                AbstractC0194c m29760f = c0197f.m29760f();
                if (m29760f != null) {
                    boolean mo928A = m29760f.mo928A(this, childAt, view, view2, i, i2);
                    z |= mo928A;
                    c0197f.m29748r(i2, mo928A);
                } else {
                    c0197f.m29748r(i2, false);
                }
            }
        }
        return z;
    }

    @Override // com.daaw.gs0
    /* renamed from: m */
    public void mo21297m(View view, View view2, int i, int i2) {
        AbstractC0194c m29760f;
        this.f1121I.m18277c(view, view2, i, i2);
        this.f1113A = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0197f c0197f = (C0197f) childAt.getLayoutParams();
            if (c0197f.m29756j(i2) && (m29760f = c0197f.m29760f()) != null) {
                m29760f.m29767v(this, childAt, view, view2, i, i2);
            }
        }
    }

    @Override // com.daaw.gs0
    /* renamed from: n */
    public void mo21296n(View view, int i) {
        this.f1121I.m18276d(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0197f c0197f = (C0197f) childAt.getLayoutParams();
            if (c0197f.m29756j(i)) {
                AbstractC0194c m29760f = c0197f.m29760f();
                if (m29760f != null) {
                    m29760f.mo927C(this, childAt, view, i);
                }
                c0197f.m29754l(i);
                c0197f.m29755k();
            }
        }
        this.f1113A = null;
    }

    @Override // com.daaw.gs0
    /* renamed from: o */
    public void mo21295o(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC0194c m29760f;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0197f c0197f = (C0197f) childAt.getLayoutParams();
                if (c0197f.m29756j(i3) && (m29760f = c0197f.m29760f()) != null) {
                    int[] iArr2 = this.f1127u;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    m29760f.mo886q(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f1127u;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.f1127u;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            m29817H(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m29808Q(false);
        if (this.f1115C) {
            if (this.f1114B == null) {
                this.f1114B = new ViewTreeObserver$OnPreDrawListenerC0198g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1114B);
        }
        if (this.f1116D == null && xs1.m4774B(this)) {
            xs1.m4708o0(this);
        }
        this.f1130x = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m29808Q(false);
        if (this.f1115C && this.f1114B != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1114B);
        }
        View view = this.f1113A;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1130x = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f1117E || this.f1118F == null) {
            return;
        }
        px1 px1Var = this.f1116D;
        int m12949l = px1Var != null ? px1Var.m12949l() : 0;
        if (m12949l > 0) {
            this.f1118F.setBounds(0, 0, getWidth(), m12949l);
            this.f1118F.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m29808Q(true);
        }
        boolean m29813L = m29813L(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m29808Q(true);
        }
        return m29813L;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC0194c m29760f;
        int m4768E = xs1.m4768E(this);
        int size = this.f1122p.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f1122p.get(i5);
            if (view.getVisibility() != 8 && ((m29760f = ((C0197f) view.getLayoutParams()).m29760f()) == null || !m29760f.mo126l(this, view, m4768E))) {
                m29816I(view, m4768E);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x011a, code lost:
        if (r0.mo1002m(r30, r20, r11, r21, r23, 0) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        AbstractC0194c m29760f;
        C0197f c0197f;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        m29812M();
        m29794g();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int m4768E = xs1.m4768E(this);
        boolean z = m4768E == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i13 = paddingLeft + paddingRight;
        int i14 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z2 = this.f1116D != null && xs1.m4774B(this);
        int size3 = this.f1122p.size();
        int i15 = suggestedMinimumWidth;
        int i16 = suggestedMinimumHeight;
        int i17 = 0;
        int i18 = 0;
        while (i18 < size3) {
            View view = this.f1122p.get(i18);
            if (view.getVisibility() == 8) {
                i11 = i18;
                i8 = size3;
                i9 = paddingLeft;
            } else {
                C0197f c0197f2 = (C0197f) view.getLayoutParams();
                int i19 = c0197f2.f1140e;
                if (i19 < 0 || mode == 0) {
                    i3 = i17;
                } else {
                    int m29784w = m29784w(i19);
                    int m21894b = g80.m21894b(m29805T(c0197f2.f1138c), m4768E) & 7;
                    i3 = i17;
                    if ((m21894b == 3 && !z) || (m21894b == 5 && z)) {
                        i4 = Math.max(0, (size - paddingRight) - m29784w);
                    } else if ((m21894b == 5 && !z) || (m21894b == 3 && z)) {
                        i4 = Math.max(0, m29784w - paddingLeft);
                    }
                    if (z2 || xs1.m4774B(view)) {
                        i5 = i;
                        i6 = i2;
                    } else {
                        i5 = View.MeasureSpec.makeMeasureSpec(size - (this.f1116D.m12951j() + this.f1116D.m12950k()), mode);
                        i6 = View.MeasureSpec.makeMeasureSpec(size2 - (this.f1116D.m12949l() + this.f1116D.m12952i()), mode2);
                    }
                    m29760f = c0197f2.m29760f();
                    if (m29760f == null) {
                        c0197f = c0197f2;
                        i10 = i3;
                        i11 = i18;
                        i7 = i16;
                        i9 = paddingLeft;
                        i12 = i15;
                        i8 = size3;
                    } else {
                        c0197f = c0197f2;
                        i7 = i16;
                        i8 = size3;
                        i9 = paddingLeft;
                        i10 = i3;
                        i11 = i18;
                        i12 = i15;
                    }
                    m29815J(view, i5, i4, i6, 0);
                    C0197f c0197f3 = c0197f;
                    int max = Math.max(i12, i13 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0197f3).leftMargin + ((ViewGroup.MarginLayoutParams) c0197f3).rightMargin);
                    int max2 = Math.max(i7, i14 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0197f3).topMargin + ((ViewGroup.MarginLayoutParams) c0197f3).bottomMargin);
                    i17 = View.combineMeasuredStates(i10, view.getMeasuredState());
                    i15 = max;
                    i16 = max2;
                }
                i4 = 0;
                if (z2) {
                }
                i5 = i;
                i6 = i2;
                m29760f = c0197f2.m29760f();
                if (m29760f == null) {
                }
                m29815J(view, i5, i4, i6, 0);
                C0197f c0197f32 = c0197f;
                int max3 = Math.max(i12, i13 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0197f32).leftMargin + ((ViewGroup.MarginLayoutParams) c0197f32).rightMargin);
                int max22 = Math.max(i7, i14 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0197f32).topMargin + ((ViewGroup.MarginLayoutParams) c0197f32).bottomMargin);
                i17 = View.combineMeasuredStates(i10, view.getMeasuredState());
                i15 = max3;
                i16 = max22;
            }
            i18 = i11 + 1;
            paddingLeft = i9;
            size3 = i8;
        }
        int i20 = i17;
        setMeasuredDimension(View.resolveSizeAndState(i15, i, (-16777216) & i20), View.resolveSizeAndState(i16, i2, i20 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        AbstractC0194c m29760f;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0197f c0197f = (C0197f) childAt.getLayoutParams();
                if (c0197f.m29756j(0) && (m29760f = c0197f.m29760f()) != null) {
                    z2 |= m29760f.m29772n(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            m29817H(1);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC0194c m29760f;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0197f c0197f = (C0197f) childAt.getLayoutParams();
                if (c0197f.m29756j(0) && (m29760f = c0197f.m29760f()) != null) {
                    z |= m29760f.mo889o(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo21295o(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo21299k(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo21297m(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m29657a());
        SparseArray<Parcelable> sparseArray = savedState.f1133r;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0194c m29760f = m29782y(childAt).m29760f();
            if (id != -1 && m29760f != null && (parcelable2 = sparseArray.get(id)) != null) {
                m29760f.mo878x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable mo877y;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0194c m29760f = ((C0197f) childAt.getLayoutParams()).m29760f();
            if (id != -1 && m29760f != null && (mo877y = m29760f.mo877y(this, childAt)) != null) {
                sparseArray.append(id, mo877y);
            }
        }
        savedState.f1133r = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo21298l(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.daaw.is0
    public void onStopNestedScroll(View view) {
        mo21296n(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean mo102D;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1132z == null) {
            z = m29813L(motionEvent, 1);
        } else {
            z = false;
        }
        AbstractC0194c m29760f = ((C0197f) this.f1132z.getLayoutParams()).m29760f();
        if (m29760f != null) {
            mo102D = m29760f.mo102D(this, this.f1132z, motionEvent);
            motionEvent2 = null;
            if (this.f1132z != null) {
                mo102D |= super.onTouchEvent(motionEvent);
            } else if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                m29808Q(false);
            }
            return mo102D;
        }
        mo102D = false;
        motionEvent2 = null;
        if (this.f1132z != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked != 1) {
        }
        m29808Q(false);
        return mo102D;
    }

    @Override // android.view.ViewGroup
    /* renamed from: p */
    public C0197f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0197f ? new C0197f((C0197f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0197f((ViewGroup.MarginLayoutParams) layoutParams) : new C0197f(layoutParams);
    }

    /* renamed from: q */
    public void m29790q(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m29787t(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: r */
    public List<View> m29789r(View view) {
        List<View> m10965h = this.f1123q.m10965h(view);
        this.f1125s.clear();
        if (m10965h != null) {
            this.f1125s.addAll(m10965h);
        }
        return this.f1125s;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC0194c m29760f = ((C0197f) view.getLayoutParams()).m29760f();
        if (m29760f == null || !m29760f.mo1001w(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f1129w) {
            return;
        }
        m29808Q(false);
        this.f1129w = true;
    }

    /* renamed from: s */
    public List<View> m29788s(View view) {
        List m10966g = this.f1123q.m10966g(view);
        this.f1125s.clear();
        if (m10966g != null) {
            this.f1125s.addAll(m10966g);
        }
        return this.f1125s;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m29801X();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1119G = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f1118F;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f1118F = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f1118F.setState(getDrawableState());
                }
                C2366nu.m14814m(this.f1118F, xs1.m4768E(this));
                this.f1118F.setVisible(getVisibility() == 0, false);
                this.f1118F.setCallback(this);
            }
            xs1.m4720i0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C3866zk.m2178e(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f1118F;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f1118F.setVisible(z, false);
    }

    /* renamed from: t */
    public void m29787t(View view, Rect rect) {
        ft1.m22304a(this, view, rect);
    }

    /* renamed from: u */
    public void m29786u(View view, int i, Rect rect, Rect rect2) {
        C0197f c0197f = (C0197f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m29785v(view, i, rect, rect2, c0197f, measuredWidth, measuredHeight);
        m29797d(c0197f, rect2, measuredWidth, measuredHeight);
    }

    /* renamed from: v */
    public final void m29785v(View view, int i, Rect rect, Rect rect2, C0197f c0197f, int i2, int i3) {
        int m21894b = g80.m21894b(m29807R(c0197f.f1138c), i);
        int m21894b2 = g80.m21894b(m29806S(c0197f.f1139d), i);
        int i4 = m21894b & 7;
        int i5 = m21894b & 112;
        int i6 = m21894b2 & 7;
        int i7 = m21894b2 & 112;
        int width = i6 != 1 ? i6 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i7 != 16 ? i7 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i4 == 1) {
            width -= i2 / 2;
        } else if (i4 != 5) {
            width -= i2;
        }
        if (i5 == 16) {
            height -= i3 / 2;
        } else if (i5 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1118F;
    }

    /* renamed from: w */
    public final int m29784w(int i) {
        int[] iArr = this.f1131y;
        if (iArr == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
            return 0;
        } else if (i < 0 || i >= iArr.length) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Keyline index ");
            sb2.append(i);
            sb2.append(" out of range for ");
            sb2.append(this);
            return 0;
        } else {
            return iArr[i];
        }
    }

    /* renamed from: x */
    public void m29783x(View view, Rect rect) {
        rect.set(((C0197f) view.getLayoutParams()).m29758h());
    }

    /* renamed from: y */
    public C0197f m29782y(View view) {
        C0197f c0197f = (C0197f) view.getLayoutParams();
        if (!c0197f.f1137b) {
            if (view instanceof InterfaceC0193b) {
                c0197f.m29751o(((InterfaceC0193b) view).getBehavior());
            } else {
                InterfaceC0195d interfaceC0195d = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    interfaceC0195d = (InterfaceC0195d) cls.getAnnotation(InterfaceC0195d.class);
                    if (interfaceC0195d != null) {
                        break;
                    }
                }
                if (interfaceC0195d != null) {
                    try {
                        c0197f.m29751o(interfaceC0195d.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Default behavior class ");
                        sb.append(interfaceC0195d.value().getName());
                        sb.append(" could not be instantiated. Did you forget a default constructor?");
                    }
                }
            }
            c0197f.f1137b = true;
        }
        return c0197f;
    }

    /* renamed from: z */
    public final void m29781z(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = f1111M;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }
}
