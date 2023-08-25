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
import com.daaw.C2366nu;
import com.daaw.C3388w;
import com.daaw.C3654y;
import com.daaw.C3866zk;
import com.daaw.at1;
import com.daaw.g80;
import com.daaw.xs1;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {

    /* renamed from: d0 */
    public static final int[] f1210d0 = {16843828};

    /* renamed from: e0 */
    public static final int[] f1211e0 = {16842931};

    /* renamed from: f0 */
    public static final boolean f1212f0;

    /* renamed from: g0 */
    public static final boolean f1213g0;

    /* renamed from: A */
    public boolean f1214A;

    /* renamed from: B */
    public boolean f1215B;

    /* renamed from: C */
    public int f1216C;

    /* renamed from: D */
    public int f1217D;

    /* renamed from: E */
    public int f1218E;

    /* renamed from: F */
    public int f1219F;

    /* renamed from: G */
    public boolean f1220G;

    /* renamed from: H */
    public boolean f1221H;

    /* renamed from: I */
    public InterfaceC0218d f1222I;

    /* renamed from: J */
    public List<InterfaceC0218d> f1223J;

    /* renamed from: K */
    public float f1224K;

    /* renamed from: L */
    public float f1225L;

    /* renamed from: M */
    public Drawable f1226M;

    /* renamed from: N */
    public Drawable f1227N;

    /* renamed from: O */
    public Drawable f1228O;

    /* renamed from: P */
    public CharSequence f1229P;

    /* renamed from: Q */
    public CharSequence f1230Q;

    /* renamed from: R */
    public Object f1231R;

    /* renamed from: S */
    public boolean f1232S;

    /* renamed from: T */
    public Drawable f1233T;

    /* renamed from: U */
    public Drawable f1234U;

    /* renamed from: V */
    public Drawable f1235V;

    /* renamed from: W */
    public Drawable f1236W;

    /* renamed from: a0 */
    public final ArrayList<View> f1237a0;

    /* renamed from: b0 */
    public Rect f1238b0;

    /* renamed from: c0 */
    public Matrix f1239c0;

    /* renamed from: p */
    public final C0217c f1240p;

    /* renamed from: q */
    public float f1241q;

    /* renamed from: r */
    public int f1242r;

    /* renamed from: s */
    public int f1243s;

    /* renamed from: t */
    public float f1244t;

    /* renamed from: u */
    public Paint f1245u;

    /* renamed from: v */
    public final at1 f1246v;

    /* renamed from: w */
    public final at1 f1247w;

    /* renamed from: x */
    public final C0220f f1248x;

    /* renamed from: y */
    public final C0220f f1249y;

    /* renamed from: z */
    public int f1250z;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0214a();

        /* renamed from: r */
        public int f1251r;

        /* renamed from: s */
        public int f1252s;

        /* renamed from: t */
        public int f1253t;

        /* renamed from: u */
        public int f1254u;

        /* renamed from: v */
        public int f1255v;

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$SavedState$a */
        /* loaded from: classes.dex */
        public static class C0214a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f1251r = 0;
            this.f1251r = parcel.readInt();
            this.f1252s = parcel.readInt();
            this.f1253t = parcel.readInt();
            this.f1254u = parcel.readInt();
            this.f1255v = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f1251r = 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1251r);
            parcel.writeInt(this.f1252s);
            parcel.writeInt(this.f1253t);
            parcel.writeInt(this.f1254u);
            parcel.writeInt(this.f1255v);
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$a */
    /* loaded from: classes.dex */
    public class View$OnApplyWindowInsetsListenerC0215a implements View.OnApplyWindowInsetsListener {
        public View$OnApplyWindowInsetsListenerC0215a() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).m29638P(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$b */
    /* loaded from: classes.dex */
    public class C0216b extends C3388w {

        /* renamed from: d */
        public final Rect f1257d = new Rect();

        public C0216b() {
        }

        @Override // com.daaw.C3388w
        /* renamed from: a */
        public boolean mo6634a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                List<CharSequence> text = accessibilityEvent.getText();
                View m29620n = DrawerLayout.this.m29620n();
                if (m29620n != null) {
                    CharSequence m29617q = DrawerLayout.this.m29617q(DrawerLayout.this.m29616r(m29620n));
                    if (m29617q != null) {
                        text.add(m29617q);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return super.mo6634a(view, accessibilityEvent);
        }

        @Override // com.daaw.C3388w
        /* renamed from: f */
        public void mo354f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo354f(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        @Override // com.daaw.C3388w
        /* renamed from: g */
        public void mo161g(View view, C3654y c3654y) {
            if (DrawerLayout.f1212f0) {
                super.mo161g(view, c3654y);
            } else {
                C3654y m4348Q = C3654y.m4348Q(c3654y);
                super.mo161g(view, m4348Q);
                c3654y.m4293w0(view);
                ViewParent m4756K = xs1.m4756K(view);
                if (m4756K instanceof View) {
                    c3654y.m4305q0((View) m4756K);
                }
                m29603o(c3654y, m4348Q);
                m4348Q.m4346S();
                m29604n(c3654y, (ViewGroup) view);
            }
            c3654y.m4335b0(DrawerLayout.class.getName());
            c3654y.m4321i0(false);
            c3654y.m4319j0(false);
            c3654y.m4345T(C3654y.C3655a.f33169e);
            c3654y.m4345T(C3654y.C3655a.f33170f);
        }

        @Override // com.daaw.C3388w
        /* renamed from: i */
        public boolean mo6630i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f1212f0 || DrawerLayout.m29609y(view)) {
                return super.mo6630i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        /* renamed from: n */
        public final void m29604n(C3654y c3654y, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.m29609y(childAt)) {
                    c3654y.m4334c(childAt);
                }
            }
        }

        /* renamed from: o */
        public final void m29603o(C3654y c3654y, C3654y c3654y2) {
            Rect rect = this.f1257d;
            c3654y2.m4314m(rect);
            c3654y.m4341X(rect);
            c3654y2.m4312n(rect);
            c3654y.m4340Y(rect);
            c3654y.m4365B0(c3654y2.m4351N());
            c3654y.m4309o0(c3654y2.m4298u());
            c3654y.m4335b0(c3654y2.m4308p());
            c3654y.m4327f0(c3654y2.m4304r());
            c3654y.m4325g0(c3654y2.m4359F());
            c3654y.m4333c0(c3654y2.m4360E());
            c3654y.m4321i0(c3654y2.m4358G());
            c3654y.m4319j0(c3654y2.m4357H());
            c3654y.m4343V(c3654y2.m4366B());
            c3654y.m4297u0(c3654y2.m4353L());
            c3654y.m4313m0(c3654y2.m4356I());
            c3654y.m4338a(c3654y2.m4318k());
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$c */
    /* loaded from: classes.dex */
    public static final class C0217c extends C3388w {
        @Override // com.daaw.C3388w
        /* renamed from: g */
        public void mo161g(View view, C3654y c3654y) {
            super.mo161g(view, c3654y);
            if (DrawerLayout.m29609y(view)) {
                return;
            }
            c3654y.m4305q0(null);
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$d */
    /* loaded from: classes.dex */
    public interface InterfaceC0218d {
        /* renamed from: a */
        void m29602a(View view);

        /* renamed from: b */
        void m29601b(View view);

        /* renamed from: c */
        void m29600c(int i);

        /* renamed from: d */
        void m29599d(View view, float f);
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e */
    /* loaded from: classes.dex */
    public static class C0219e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f1259a;

        /* renamed from: b */
        public float f1260b;

        /* renamed from: c */
        public boolean f1261c;

        /* renamed from: d */
        public int f1262d;

        public C0219e(int i, int i2) {
            super(i, i2);
            this.f1259a = 0;
        }

        public C0219e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1259a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f1211e0);
            this.f1259a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0219e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1259a = 0;
        }

        public C0219e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1259a = 0;
        }

        public C0219e(C0219e c0219e) {
            super((ViewGroup.MarginLayoutParams) c0219e);
            this.f1259a = 0;
            this.f1259a = c0219e.f1259a;
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$f */
    /* loaded from: classes.dex */
    public class C0220f extends at1.AbstractC0673c {

        /* renamed from: a */
        public final int f1263a;

        /* renamed from: b */
        public at1 f1264b;

        /* renamed from: c */
        public final Runnable f1265c = new RunnableC0221a();

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$f$a */
        /* loaded from: classes.dex */
        public class RunnableC0221a implements Runnable {
            public RunnableC0221a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0220f.this.m29597o();
            }
        }

        public C0220f(int i) {
            this.f1263a = i;
        }

        @Override // com.daaw.at1.AbstractC0673c
        /* renamed from: a */
        public int mo872a(View view, int i, int i2) {
            int width;
            int width2;
            if (DrawerLayout.this.m29631c(view, 3)) {
                width2 = -view.getWidth();
                width = 0;
            } else {
                width = DrawerLayout.this.getWidth();
                width2 = width - view.getWidth();
            }
            return Math.max(width2, Math.min(i, width));
        }

        @Override // com.daaw.at1.AbstractC0673c
        /* renamed from: b */
        public int mo871b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // com.daaw.at1.AbstractC0673c
        /* renamed from: d */
        public int mo981d(View view) {
            if (DrawerLayout.this.m29651C(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // com.daaw.at1.AbstractC0673c
        /* renamed from: f */
        public void mo27045f(int i, int i2) {
            DrawerLayout drawerLayout;
            int i3;
            if ((i & 1) == 1) {
                drawerLayout = DrawerLayout.this;
                i3 = 3;
            } else {
                drawerLayout = DrawerLayout.this;
                i3 = 5;
            }
            View m29622l = drawerLayout.m29622l(i3);
            if (m29622l == null || DrawerLayout.this.m29618p(m29622l) != 0) {
                return;
            }
            this.f1264b.m27071b(m29622l, i2);
        }

        @Override // com.daaw.at1.AbstractC0673c
        /* renamed from: g */
        public boolean mo27044g(int i) {
            return false;
        }

        @Override // com.daaw.at1.AbstractC0673c
        /* renamed from: h */
        public void mo27043h(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f1265c, 160L);
        }

        @Override // com.daaw.at1.AbstractC0673c
        /* renamed from: i */
        public void mo980i(View view, int i) {
            ((C0219e) view.getLayoutParams()).f1261c = false;
            m29598n();
        }

        @Override // com.daaw.at1.AbstractC0673c
        /* renamed from: j */
        public void mo869j(int i) {
            DrawerLayout.this.m29634T(this.f1263a, i, this.f1264b.m27051v());
        }

        @Override // com.daaw.at1.AbstractC0673c
        /* renamed from: k */
        public void mo868k(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.m29631c(view, 3) ? i + width : DrawerLayout.this.getWidth() - i) / width;
            DrawerLayout.this.m29636R(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // com.daaw.at1.AbstractC0673c
        /* renamed from: l */
        public void mo867l(View view, float f, float f2) {
            int i;
            float m29615s = DrawerLayout.this.m29615s(view);
            int width = view.getWidth();
            if (DrawerLayout.this.m29631c(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && m29615s > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && m29615s > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f1264b.m27076M(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // com.daaw.at1.AbstractC0673c
        /* renamed from: m */
        public boolean mo866m(View view, int i) {
            return DrawerLayout.this.m29651C(view) && DrawerLayout.this.m29631c(view, this.f1263a) && DrawerLayout.this.m29618p(view) == 0;
        }

        /* renamed from: n */
        public final void m29598n() {
            View m29622l = DrawerLayout.this.m29622l(this.f1263a == 3 ? 5 : 3);
            if (m29622l != null) {
                DrawerLayout.this.m29630d(m29622l);
            }
        }

        /* renamed from: o */
        public void m29597o() {
            View m29622l;
            int width;
            int m27050w = this.f1264b.m27050w();
            boolean z = this.f1263a == 3;
            if (z) {
                m29622l = DrawerLayout.this.m29622l(3);
                width = (m29622l != null ? -m29622l.getWidth() : 0) + m27050w;
            } else {
                m29622l = DrawerLayout.this.m29622l(5);
                width = DrawerLayout.this.getWidth() - m27050w;
            }
            if (m29622l != null) {
                if (((!z || m29622l.getLeft() >= width) && (z || m29622l.getLeft() <= width)) || DrawerLayout.this.m29618p(m29622l) != 0) {
                    return;
                }
                this.f1264b.m27074O(m29622l, width, m29622l.getTop());
                ((C0219e) m29622l.getLayoutParams()).f1261c = true;
                DrawerLayout.this.invalidate();
                m29598n();
                DrawerLayout.this.m29632b();
            }
        }

        /* renamed from: p */
        public void m29596p() {
            DrawerLayout.this.removeCallbacks(this.f1265c);
        }

        /* renamed from: q */
        public void m29595q(at1 at1Var) {
            this.f1264b = at1Var;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f1212f0 = true;
        f1213g0 = i >= 21;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1240p = new C0217c();
        this.f1243s = -1728053248;
        this.f1245u = new Paint();
        this.f1215B = true;
        this.f1216C = 3;
        this.f1217D = 3;
        this.f1218E = 3;
        this.f1219F = 3;
        this.f1233T = null;
        this.f1234U = null;
        this.f1235V = null;
        this.f1236W = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f1242r = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        C0220f c0220f = new C0220f(3);
        this.f1248x = c0220f;
        C0220f c0220f2 = new C0220f(5);
        this.f1249y = c0220f2;
        at1 m27059n = at1.m27059n(this, 1.0f, c0220f);
        this.f1246v = m27059n;
        m27059n.m27078K(1);
        m27059n.m27077L(f2);
        c0220f.m29595q(m27059n);
        at1 m27059n2 = at1.m27059n(this, 1.0f, c0220f2);
        this.f1247w = m27059n2;
        m27059n2.m27078K(2);
        m27059n2.m27077L(f2);
        c0220f2.m29595q(m27059n2);
        setFocusableInTouchMode(true);
        xs1.m4773B0(this, 1);
        xs1.m4702r0(this, new C0216b());
        setMotionEventSplittingEnabled(false);
        if (xs1.m4774B(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC0215a());
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f1210d0);
                try {
                    this.f1226M = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.f1226M = null;
            }
        }
        this.f1241q = f * 10.0f;
        this.f1237a0 = new ArrayList<>();
    }

    /* renamed from: u */
    public static String m29613u(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    /* renamed from: v */
    public static boolean m29612v(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    /* renamed from: y */
    public static boolean m29609y(View view) {
        return (xs1.m4772C(view) == 4 || xs1.m4772C(view) == 2) ? false : true;
    }

    /* renamed from: A */
    public boolean m29653A(int i) {
        View m29622l = m29622l(i);
        if (m29622l != null) {
            return m29652B(m29622l);
        }
        return false;
    }

    /* renamed from: B */
    public boolean m29652B(View view) {
        if (m29651C(view)) {
            return (((C0219e) view.getLayoutParams()).f1262d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: C */
    public boolean m29651C(View view) {
        int m21894b = g80.m21894b(((C0219e) view.getLayoutParams()).f1259a, xs1.m4768E(view));
        return ((m21894b & 3) == 0 && (m21894b & 5) == 0) ? false : true;
    }

    /* renamed from: D */
    public boolean m29650D(View view) {
        if (m29651C(view)) {
            return ((C0219e) view.getLayoutParams()).f1260b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: E */
    public final boolean m29649E(float f, float f2, View view) {
        if (this.f1238b0 == null) {
            this.f1238b0 = new Rect();
        }
        view.getHitRect(this.f1238b0);
        return this.f1238b0.contains((int) f, (int) f2);
    }

    /* renamed from: F */
    public final boolean m29648F(Drawable drawable, int i) {
        if (drawable == null || !C2366nu.m14819h(drawable)) {
            return false;
        }
        C2366nu.m14814m(drawable, i);
        return true;
    }

    /* renamed from: G */
    public void m29647G(View view, float f) {
        float m29615s = m29615s(view);
        float width = view.getWidth();
        int i = ((int) (width * f)) - ((int) (m29615s * width));
        if (!m29631c(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        m29636R(view, f);
    }

    /* renamed from: H */
    public void m29646H(int i) {
        m29645I(i, true);
    }

    /* renamed from: I */
    public void m29645I(int i, boolean z) {
        View m29622l = m29622l(i);
        if (m29622l != null) {
            m29643K(m29622l, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m29613u(i));
    }

    /* renamed from: J */
    public void m29644J(View view) {
        m29643K(view, true);
    }

    /* renamed from: K */
    public void m29643K(View view, boolean z) {
        if (!m29651C(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C0219e c0219e = (C0219e) view.getLayoutParams();
        if (this.f1215B) {
            c0219e.f1260b = 1.0f;
            c0219e.f1262d = 1;
            m29635S(view, true);
        } else if (z) {
            c0219e.f1262d |= 2;
            if (m29631c(view, 3)) {
                this.f1246v.m27074O(view, 0, view.getTop());
            } else {
                this.f1247w.m27074O(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            m29647G(view, 1.0f);
            m29634T(c0219e.f1259a, 0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    /* renamed from: L */
    public void m29642L(InterfaceC0218d interfaceC0218d) {
        List<InterfaceC0218d> list;
        if (interfaceC0218d == null || (list = this.f1223J) == null) {
            return;
        }
        list.remove(interfaceC0218d);
    }

    /* renamed from: M */
    public final Drawable m29641M() {
        int m4768E = xs1.m4768E(this);
        if (m4768E == 0) {
            Drawable drawable = this.f1233T;
            if (drawable != null) {
                m29648F(drawable, m4768E);
                return this.f1233T;
            }
        } else {
            Drawable drawable2 = this.f1234U;
            if (drawable2 != null) {
                m29648F(drawable2, m4768E);
                return this.f1234U;
            }
        }
        return this.f1235V;
    }

    /* renamed from: N */
    public final Drawable m29640N() {
        int m4768E = xs1.m4768E(this);
        if (m4768E == 0) {
            Drawable drawable = this.f1234U;
            if (drawable != null) {
                m29648F(drawable, m4768E);
                return this.f1234U;
            }
        } else {
            Drawable drawable2 = this.f1233T;
            if (drawable2 != null) {
                m29648F(drawable2, m4768E);
                return this.f1233T;
            }
        }
        return this.f1236W;
    }

    /* renamed from: O */
    public final void m29639O() {
        if (f1213g0) {
            return;
        }
        this.f1227N = m29641M();
        this.f1228O = m29640N();
    }

    /* renamed from: P */
    public void m29638P(Object obj, boolean z) {
        this.f1231R = obj;
        this.f1232S = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    /* renamed from: Q */
    public void m29637Q(int i, int i2) {
        View m29622l;
        int m21894b = g80.m21894b(i2, xs1.m4768E(this));
        if (i2 == 3) {
            this.f1216C = i;
        } else if (i2 == 5) {
            this.f1217D = i;
        } else if (i2 == 8388611) {
            this.f1218E = i;
        } else if (i2 == 8388613) {
            this.f1219F = i;
        }
        if (i != 0) {
            (m21894b == 3 ? this.f1246v : this.f1247w).m27072a();
        }
        if (i != 1) {
            if (i == 2 && (m29622l = m29622l(m21894b)) != null) {
                m29644J(m29622l);
                return;
            }
            return;
        }
        View m29622l2 = m29622l(m21894b);
        if (m29622l2 != null) {
            m29630d(m29622l2);
        }
    }

    /* renamed from: R */
    public void m29636R(View view, float f) {
        C0219e c0219e = (C0219e) view.getLayoutParams();
        if (f == c0219e.f1260b) {
            return;
        }
        c0219e.f1260b = f;
        m29624j(view, f);
    }

    /* renamed from: S */
    public final void m29635S(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            xs1.m4773B0(childAt, ((z || m29651C(childAt)) && !(z && childAt == view)) ? 4 : 1);
        }
    }

    /* renamed from: T */
    public void m29634T(int i, int i2, View view) {
        int m27047z = this.f1246v.m27047z();
        int m27047z2 = this.f1247w.m27047z();
        int i3 = 2;
        if (m27047z == 1 || m27047z2 == 1) {
            i3 = 1;
        } else if (m27047z != 2 && m27047z2 != 2) {
            i3 = 0;
        }
        if (view != null && i2 == 0) {
            float f = ((C0219e) view.getLayoutParams()).f1260b;
            if (f == 0.0f) {
                m29626h(view);
            } else if (f == 1.0f) {
                m29625i(view);
            }
        }
        if (i3 != this.f1250z) {
            this.f1250z = i3;
            List<InterfaceC0218d> list = this.f1223J;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f1223J.get(size).m29600c(i3);
                }
            }
        }
    }

    /* renamed from: a */
    public void m29633a(InterfaceC0218d interfaceC0218d) {
        if (interfaceC0218d == null) {
            return;
        }
        if (this.f1223J == null) {
            this.f1223J = new ArrayList();
        }
        this.f1223J.add(interfaceC0218d);
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
            if (!m29651C(childAt)) {
                this.f1237a0.add(childAt);
            } else if (m29652B(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
        }
        if (!z) {
            int size = this.f1237a0.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = this.f1237a0.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.f1237a0.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        xs1.m4773B0(view, (m29621m() != null || m29651C(view)) ? 4 : 1);
        if (f1212f0) {
            return;
        }
        xs1.m4702r0(view, this.f1240p);
    }

    /* renamed from: b */
    public void m29632b() {
        if (this.f1221H) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchTouchEvent(obtain);
        }
        obtain.recycle();
        this.f1221H = true;
    }

    /* renamed from: c */
    public boolean m29631c(View view, int i) {
        return (m29616r(view) & i) == i;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0219e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((C0219e) getChildAt(i).getLayoutParams()).f1260b);
        }
        this.f1244t = f;
        boolean m27060m = this.f1246v.m27060m(true);
        boolean m27060m2 = this.f1247w.m27060m(true);
        if (m27060m || m27060m2) {
            xs1.m4720i0(this);
        }
    }

    /* renamed from: d */
    public void m29630d(View view) {
        m29629e(view, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f1244t <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount != 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            for (int i = childCount - 1; i >= 0; i--) {
                View childAt = getChildAt(i);
                if (m29649E(x, y, childAt) && !m29608z(childAt) && m29623k(motionEvent, childAt)) {
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
        boolean m29608z = m29608z(view);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (m29608z) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && m29612v(childAt) && m29651C(childAt) && childAt.getHeight() >= height) {
                    if (m29631c(childAt, 3)) {
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
        float f = this.f1244t;
        if (f <= 0.0f || !m29608z) {
            if (this.f1227N != null && m29631c(view, 3)) {
                int intrinsicWidth = this.f1227N.getIntrinsicWidth();
                int right2 = view.getRight();
                float max = Math.max(0.0f, Math.min(right2 / this.f1246v.m27050w(), 1.0f));
                this.f1227N.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
                this.f1227N.setAlpha((int) (max * 255.0f));
                drawable = this.f1227N;
            } else if (this.f1228O != null && m29631c(view, 5)) {
                int intrinsicWidth2 = this.f1228O.getIntrinsicWidth();
                int left2 = view.getLeft();
                float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f1247w.m27050w(), 1.0f));
                this.f1228O.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
                this.f1228O.setAlpha((int) (max2 * 255.0f));
                drawable = this.f1228O;
            }
            drawable.draw(canvas);
        } else {
            int i4 = this.f1243s;
            this.f1245u.setColor((i4 & 16777215) | (((int) ((((-16777216) & i4) >>> 24) * f)) << 24));
            canvas.drawRect(i, 0.0f, width, getHeight(), this.f1245u);
        }
        return drawChild;
    }

    /* renamed from: e */
    public void m29629e(View view, boolean z) {
        at1 at1Var;
        int width;
        if (!m29651C(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C0219e c0219e = (C0219e) view.getLayoutParams();
        if (this.f1215B) {
            c0219e.f1260b = 0.0f;
            c0219e.f1262d = 0;
        } else if (z) {
            c0219e.f1262d |= 4;
            if (m29631c(view, 3)) {
                at1Var = this.f1246v;
                width = -view.getWidth();
            } else {
                at1Var = this.f1247w;
                width = getWidth();
            }
            at1Var.m27074O(view, width, view.getTop());
        } else {
            m29647G(view, 0.0f);
            m29634T(c0219e.f1259a, 0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    /* renamed from: f */
    public void m29628f() {
        m29627g(false);
    }

    /* renamed from: g */
    public void m29627g(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0219e c0219e = (C0219e) childAt.getLayoutParams();
            if (m29651C(childAt) && (!z || c0219e.f1261c)) {
                z2 |= m29631c(childAt, 3) ? this.f1246v.m27074O(childAt, -childAt.getWidth(), childAt.getTop()) : this.f1247w.m27074O(childAt, getWidth(), childAt.getTop());
                c0219e.f1261c = false;
            }
        }
        this.f1248x.m29596p();
        this.f1249y.m29596p();
        if (z2) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0219e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0219e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0219e ? new C0219e((C0219e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0219e((ViewGroup.MarginLayoutParams) layoutParams) : new C0219e(layoutParams);
    }

    public float getDrawerElevation() {
        if (f1213g0) {
            return this.f1241q;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f1226M;
    }

    /* renamed from: h */
    public void m29626h(View view) {
        View rootView;
        C0219e c0219e = (C0219e) view.getLayoutParams();
        if ((c0219e.f1262d & 1) == 1) {
            c0219e.f1262d = 0;
            List<InterfaceC0218d> list = this.f1223J;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f1223J.get(size).m29601b(view);
                }
            }
            m29635S(view, false);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    /* renamed from: i */
    public void m29625i(View view) {
        C0219e c0219e = (C0219e) view.getLayoutParams();
        if ((c0219e.f1262d & 1) == 0) {
            c0219e.f1262d = 1;
            List<InterfaceC0218d> list = this.f1223J;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f1223J.get(size).m29602a(view);
                }
            }
            m29635S(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* renamed from: j */
    public void m29624j(View view, float f) {
        List<InterfaceC0218d> list = this.f1223J;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f1223J.get(size).m29599d(view, f);
            }
        }
    }

    /* renamed from: k */
    public final boolean m29623k(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent m29614t = m29614t(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(m29614t);
            m29614t.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    /* renamed from: l */
    public View m29622l(int i) {
        int m21894b = g80.m21894b(i, xs1.m4768E(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((m29616r(childAt) & 7) == m21894b) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: m */
    public View m29621m() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((C0219e) childAt.getLayoutParams()).f1262d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: n */
    public View m29620n() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m29651C(childAt) && m29650D(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: o */
    public int m29619o(int i) {
        int m4768E = xs1.m4768E(this);
        if (i == 3) {
            int i2 = this.f1216C;
            if (i2 != 3) {
                return i2;
            }
            int i3 = m4768E == 0 ? this.f1218E : this.f1219F;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        } else if (i == 5) {
            int i4 = this.f1217D;
            if (i4 != 3) {
                return i4;
            }
            int i5 = m4768E == 0 ? this.f1219F : this.f1218E;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        } else if (i == 8388611) {
            int i6 = this.f1218E;
            if (i6 != 3) {
                return i6;
            }
            int i7 = m4768E == 0 ? this.f1216C : this.f1217D;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        } else if (i != 8388613) {
            return 0;
        } else {
            int i8 = this.f1219F;
            if (i8 != 3) {
                return i8;
            }
            int i9 = m4768E == 0 ? this.f1217D : this.f1216C;
            if (i9 != 3) {
                return i9;
            }
            return 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1215B = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1215B = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object obj;
        super.onDraw(canvas);
        if (!this.f1232S || this.f1226M == null) {
            return;
        }
        int systemWindowInsetTop = (Build.VERSION.SDK_INT < 21 || (obj = this.f1231R) == null) ? 0 : ((WindowInsets) obj).getSystemWindowInsetTop();
        if (systemWindowInsetTop > 0) {
            this.f1226M.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f1226M.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r0 != 3) goto L7;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View m27053t;
        int actionMasked = motionEvent.getActionMasked();
        boolean m27075N = this.f1246v.m27075N(motionEvent) | this.f1247w.m27075N(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f1246v.m27069d(3)) {
                        this.f1248x.m29596p();
                        this.f1249y.m29596p();
                    }
                }
                z = false;
            }
            m29627g(true);
            this.f1220G = false;
            this.f1221H = false;
            z = false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f1224K = x;
            this.f1225L = y;
            z = this.f1244t > 0.0f && (m27053t = this.f1246v.m27053t((int) x, (int) y)) != null && m29608z(m27053t);
            this.f1220G = false;
            this.f1221H = false;
        }
        return m27075N || z || m29611w() || this.f1221H;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && m29610x()) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View m29620n = m29620n();
            if (m29620n != null && m29618p(m29620n) == 0) {
                m29628f();
            }
            return m29620n != null;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f;
        int i6;
        int measuredHeight;
        int i7;
        int i8;
        this.f1214A = true;
        int i9 = i3 - i;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0219e c0219e = (C0219e) childAt.getLayoutParams();
                if (m29608z(childAt)) {
                    int i11 = ((ViewGroup.MarginLayoutParams) c0219e).leftMargin;
                    childAt.layout(i11, ((ViewGroup.MarginLayoutParams) c0219e).topMargin, childAt.getMeasuredWidth() + i11, ((ViewGroup.MarginLayoutParams) c0219e).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (m29631c(childAt, 3)) {
                        float f2 = measuredWidth;
                        i6 = (-measuredWidth) + ((int) (c0219e.f1260b * f2));
                        f = (measuredWidth + i6) / f2;
                    } else {
                        float f3 = measuredWidth;
                        f = (i9 - i5) / f3;
                        i6 = i9 - ((int) (c0219e.f1260b * f3));
                    }
                    boolean z2 = f != c0219e.f1260b;
                    int i12 = c0219e.f1259a & 112;
                    if (i12 != 16) {
                        if (i12 != 80) {
                            measuredHeight = ((ViewGroup.MarginLayoutParams) c0219e).topMargin;
                            i7 = measuredWidth + i6;
                            i8 = measuredHeight2 + measuredHeight;
                        } else {
                            int i13 = i4 - i2;
                            measuredHeight = (i13 - ((ViewGroup.MarginLayoutParams) c0219e).bottomMargin) - childAt.getMeasuredHeight();
                            i7 = measuredWidth + i6;
                            i8 = i13 - ((ViewGroup.MarginLayoutParams) c0219e).bottomMargin;
                        }
                        childAt.layout(i6, measuredHeight, i7, i8);
                    } else {
                        int i14 = i4 - i2;
                        int i15 = (i14 - measuredHeight2) / 2;
                        int i16 = ((ViewGroup.MarginLayoutParams) c0219e).topMargin;
                        if (i15 < i16) {
                            i15 = i16;
                        } else {
                            int i17 = i15 + measuredHeight2;
                            int i18 = ((ViewGroup.MarginLayoutParams) c0219e).bottomMargin;
                            if (i17 > i14 - i18) {
                                i15 = (i14 - i18) - measuredHeight2;
                            }
                        }
                        childAt.layout(i6, i15, measuredWidth + i6, measuredHeight2 + i15);
                    }
                    if (z2) {
                        m29636R(childAt, f);
                    }
                    int i19 = c0219e.f1260b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i19) {
                        childAt.setVisibility(i19);
                    }
                }
            }
        }
        this.f1214A = false;
        this.f1215B = false;
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
        boolean z = this.f1231R != null && xs1.m4774B(this);
        int m4768E = xs1.m4768E(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0219e c0219e = (C0219e) childAt.getLayoutParams();
                if (z) {
                    int m21894b = g80.m21894b(c0219e.f1259a, m4768E);
                    boolean m4774B = xs1.m4774B(childAt);
                    int i5 = Build.VERSION.SDK_INT;
                    if (m4774B) {
                        if (i5 >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.f1231R;
                            if (m21894b == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (m21894b == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (i5 >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.f1231R;
                        if (m21894b == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (m21894b == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) c0219e).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) c0219e).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) c0219e).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) c0219e).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (m29608z(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) c0219e).leftMargin) - ((ViewGroup.MarginLayoutParams) c0219e).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) c0219e).topMargin) - ((ViewGroup.MarginLayoutParams) c0219e).bottomMargin, 1073741824));
                } else if (!m29651C(childAt)) {
                    throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                } else {
                    if (f1213g0) {
                        float m4689y = xs1.m4689y(childAt);
                        float f = this.f1241q;
                        if (m4689y != f) {
                            xs1.m4686z0(childAt, f);
                        }
                    }
                    int m29616r = m29616r(childAt) & 7;
                    boolean z4 = m29616r == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + m29613u(m29616r) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f1242r + ((ViewGroup.MarginLayoutParams) c0219e).leftMargin + ((ViewGroup.MarginLayoutParams) c0219e).rightMargin, ((ViewGroup.MarginLayoutParams) c0219e).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) c0219e).topMargin + ((ViewGroup.MarginLayoutParams) c0219e).bottomMargin, ((ViewGroup.MarginLayoutParams) c0219e).height));
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
        View m29622l;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m29657a());
        int i = savedState.f1251r;
        if (i != 0 && (m29622l = m29622l(i)) != null) {
            m29644J(m29622l);
        }
        int i2 = savedState.f1252s;
        if (i2 != 3) {
            m29637Q(i2, 3);
        }
        int i3 = savedState.f1253t;
        if (i3 != 3) {
            m29637Q(i3, 5);
        }
        int i4 = savedState.f1254u;
        if (i4 != 3) {
            m29637Q(i4, 8388611);
        }
        int i5 = savedState.f1255v;
        if (i5 != 3) {
            m29637Q(i5, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        m29639O();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0219e c0219e = (C0219e) getChildAt(i).getLayoutParams();
            int i2 = c0219e.f1262d;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                savedState.f1251r = c0219e.f1259a;
                break;
            }
        }
        savedState.f1252s = this.f1216C;
        savedState.f1253t = this.f1217D;
        savedState.f1254u = this.f1218E;
        savedState.f1255v = this.f1219F;
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View m29621m;
        this.f1246v.m27084E(motionEvent);
        this.f1247w.m27084E(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                View m27053t = this.f1246v.m27053t((int) x, (int) y);
                if (m27053t != null && m29608z(m27053t)) {
                    float f = x - this.f1224K;
                    float f2 = y - this.f1225L;
                    int m27048y = this.f1246v.m27048y();
                    if ((f * f) + (f2 * f2) < m27048y * m27048y && (m29621m = m29621m()) != null && m29618p(m29621m) != 2) {
                        z = false;
                        m29627g(z);
                        this.f1220G = false;
                    }
                }
                z = true;
                m29627g(z);
                this.f1220G = false;
            } else if (action == 3) {
                m29627g(true);
            }
            return true;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        this.f1224K = x2;
        this.f1225L = y2;
        this.f1220G = false;
        this.f1221H = false;
        return true;
    }

    /* renamed from: p */
    public int m29618p(View view) {
        if (m29651C(view)) {
            return m29619o(((C0219e) view.getLayoutParams()).f1259a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: q */
    public CharSequence m29617q(int i) {
        int m21894b = g80.m21894b(i, xs1.m4768E(this));
        if (m21894b == 3) {
            return this.f1229P;
        }
        if (m21894b == 5) {
            return this.f1230Q;
        }
        return null;
    }

    /* renamed from: r */
    public int m29616r(View view) {
        return g80.m21894b(((C0219e) view.getLayoutParams()).f1259a, xs1.m4768E(this));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f1220G = z;
        if (z) {
            m29627g(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f1214A) {
            return;
        }
        super.requestLayout();
    }

    /* renamed from: s */
    public float m29615s(View view) {
        return ((C0219e) view.getLayoutParams()).f1260b;
    }

    public void setDrawerElevation(float f) {
        this.f1241q = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (m29651C(childAt)) {
                xs1.m4686z0(childAt, this.f1241q);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(InterfaceC0218d interfaceC0218d) {
        InterfaceC0218d interfaceC0218d2 = this.f1222I;
        if (interfaceC0218d2 != null) {
            m29642L(interfaceC0218d2);
        }
        if (interfaceC0218d != null) {
            m29633a(interfaceC0218d);
        }
        this.f1222I = interfaceC0218d;
    }

    public void setDrawerLockMode(int i) {
        m29637Q(i, 3);
        m29637Q(i, 5);
    }

    public void setScrimColor(int i) {
        this.f1243s = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.f1226M = i != 0 ? C3866zk.m2178e(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f1226M = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f1226M = new ColorDrawable(i);
        invalidate();
    }

    /* renamed from: t */
    public final MotionEvent m29614t(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(getScrollX() - view.getLeft(), getScrollY() - view.getTop());
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f1239c0 == null) {
                this.f1239c0 = new Matrix();
            }
            matrix.invert(this.f1239c0);
            obtain.transform(this.f1239c0);
        }
        return obtain;
    }

    /* renamed from: w */
    public final boolean m29611w() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C0219e) getChildAt(i).getLayoutParams()).f1261c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    public final boolean m29610x() {
        return m29620n() != null;
    }

    /* renamed from: z */
    public boolean m29608z(View view) {
        return ((C0219e) view.getLayoutParams()).f1259a == 0;
    }
}
