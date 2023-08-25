package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.C0416a;
import androidx.recyclerview.widget.C0419b;
import androidx.recyclerview.widget.C0451k;
import androidx.recyclerview.widget.C0457o;
import androidx.recyclerview.widget.C0460p;
import androidx.recyclerview.widget.RunnableC0438e;
import com.daaw.C2759qv;
import com.daaw.C3388w;
import com.daaw.C3487x;
import com.daaw.C3654y;
import com.daaw.d11;
import com.daaw.es0;
import com.daaw.fs0;
import com.daaw.lm1;
import com.daaw.qq0;
import com.daaw.t21;
import com.daaw.ty0;
import com.daaw.v01;
import com.daaw.xs1;
import com.daaw.zs1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements es0 {

    /* renamed from: N0 */
    public static final int[] f1854N0 = {16843830};

    /* renamed from: O0 */
    public static final boolean f1855O0;

    /* renamed from: P0 */
    public static final boolean f1856P0;

    /* renamed from: Q0 */
    public static final boolean f1857Q0;

    /* renamed from: R0 */
    public static final boolean f1858R0;

    /* renamed from: S0 */
    public static final boolean f1859S0;

    /* renamed from: T0 */
    public static final boolean f1860T0;

    /* renamed from: U0 */
    public static final Class<?>[] f1861U0;

    /* renamed from: V0 */
    public static final Interpolator f1862V0;

    /* renamed from: A */
    public AbstractC0380g f1863A;

    /* renamed from: A0 */
    public boolean f1864A0;

    /* renamed from: B */
    public AbstractC0391o f1865B;

    /* renamed from: B0 */
    public AbstractC0385l.InterfaceC0387b f1866B0;

    /* renamed from: C */
    public InterfaceC0404w f1867C;

    /* renamed from: C0 */
    public boolean f1868C0;

    /* renamed from: D */
    public final ArrayList<AbstractC0390n> f1869D;

    /* renamed from: D0 */
    public C0451k f1870D0;

    /* renamed from: E */
    public final ArrayList<InterfaceC0399s> f1871E;

    /* renamed from: E0 */
    public InterfaceC0383j f1872E0;

    /* renamed from: F */
    public InterfaceC0399s f1873F;

    /* renamed from: F0 */
    public final int[] f1874F0;

    /* renamed from: G */
    public boolean f1875G;

    /* renamed from: G0 */
    public fs0 f1876G0;

    /* renamed from: H */
    public boolean f1877H;

    /* renamed from: H0 */
    public final int[] f1878H0;

    /* renamed from: I */
    public boolean f1879I;

    /* renamed from: I0 */
    public final int[] f1880I0;

    /* renamed from: J */
    public boolean f1881J;

    /* renamed from: J0 */
    public final int[] f1882J0;

    /* renamed from: K */
    public int f1883K;

    /* renamed from: K0 */
    public final List<AbstractC0376c0> f1884K0;

    /* renamed from: L */
    public boolean f1885L;

    /* renamed from: L0 */
    public Runnable f1886L0;

    /* renamed from: M */
    public boolean f1887M;

    /* renamed from: M0 */
    public final C0460p.InterfaceC0462b f1888M0;

    /* renamed from: N */
    public boolean f1889N;

    /* renamed from: O */
    public int f1890O;

    /* renamed from: P */
    public boolean f1891P;

    /* renamed from: Q */
    public final AccessibilityManager f1892Q;

    /* renamed from: R */
    public List<InterfaceC0397q> f1893R;

    /* renamed from: S */
    public boolean f1894S;

    /* renamed from: T */
    public boolean f1895T;

    /* renamed from: U */
    public int f1896U;

    /* renamed from: V */
    public int f1897V;

    /* renamed from: W */
    public C0384k f1898W;

    /* renamed from: a0 */
    public EdgeEffect f1899a0;

    /* renamed from: b0 */
    public EdgeEffect f1900b0;

    /* renamed from: c0 */
    public EdgeEffect f1901c0;

    /* renamed from: d0 */
    public EdgeEffect f1902d0;

    /* renamed from: e0 */
    public AbstractC0385l f1903e0;

    /* renamed from: f0 */
    public int f1904f0;

    /* renamed from: g0 */
    public int f1905g0;

    /* renamed from: h0 */
    public VelocityTracker f1906h0;

    /* renamed from: i0 */
    public int f1907i0;

    /* renamed from: j0 */
    public int f1908j0;

    /* renamed from: k0 */
    public int f1909k0;

    /* renamed from: l0 */
    public int f1910l0;

    /* renamed from: m0 */
    public int f1911m0;

    /* renamed from: n0 */
    public AbstractC0398r f1912n0;

    /* renamed from: o0 */
    public final int f1913o0;

    /* renamed from: p */
    public final C0405x f1914p;

    /* renamed from: p0 */
    public final int f1915p0;

    /* renamed from: q */
    public final C0403v f1916q;

    /* renamed from: q0 */
    public float f1917q0;

    /* renamed from: r */
    public SavedState f1918r;

    /* renamed from: r0 */
    public float f1919r0;

    /* renamed from: s */
    public C0416a f1920s;

    /* renamed from: s0 */
    public boolean f1921s0;

    /* renamed from: t */
    public C0419b f1922t;

    /* renamed from: t0 */
    public final RunnableC0374b0 f1923t0;

    /* renamed from: u */
    public final C0460p f1924u;

    /* renamed from: u0 */
    public RunnableC0438e f1925u0;

    /* renamed from: v */
    public boolean f1926v;

    /* renamed from: v0 */
    public RunnableC0438e.C0440b f1927v0;

    /* renamed from: w */
    public final Runnable f1928w;

    /* renamed from: w0 */
    public final C0409z f1929w0;

    /* renamed from: x */
    public final Rect f1930x;

    /* renamed from: x0 */
    public AbstractC0400t f1931x0;

    /* renamed from: y */
    public final Rect f1932y;

    /* renamed from: y0 */
    public List<AbstractC0400t> f1933y0;

    /* renamed from: z */
    public final RectF f1934z;

    /* renamed from: z0 */
    public boolean f1935z0;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0370a();

        /* renamed from: r */
        public Parcelable f1936r;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$a */
        /* loaded from: classes.dex */
        public static class C0370a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f1936r = parcel.readParcelable(classLoader == null ? AbstractC0391o.class.getClassLoader() : classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        public void m28768b(SavedState savedState) {
            this.f1936r = savedState.f1936r;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f1936r, 0);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    /* loaded from: classes.dex */
    public class RunnableC0371a implements Runnable {
        public RunnableC0371a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f1881J || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f1875G) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f1887M) {
                recyclerView2.f1885L = true;
            } else {
                recyclerView2.m28785u();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0372a0 {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    /* loaded from: classes.dex */
    public class RunnableC0373b implements Runnable {
        public RunnableC0373b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0385l abstractC0385l = RecyclerView.this.f1903e0;
            if (abstractC0385l != null) {
                abstractC0385l.mo28259u();
            }
            RecyclerView.this.f1868C0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    /* loaded from: classes.dex */
    public class RunnableC0374b0 implements Runnable {

        /* renamed from: p */
        public int f1939p;

        /* renamed from: q */
        public int f1940q;

        /* renamed from: r */
        public OverScroller f1941r;

        /* renamed from: s */
        public Interpolator f1942s;

        /* renamed from: t */
        public boolean f1943t;

        /* renamed from: u */
        public boolean f1944u;

        public RunnableC0374b0() {
            Interpolator interpolator = RecyclerView.f1862V0;
            this.f1942s = interpolator;
            this.f1943t = false;
            this.f1944u = false;
            this.f1941r = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        public final int m28764a(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((i3 * i3) + (i4 * i4));
            int sqrt2 = (int) Math.sqrt((i * i) + (i2 * i2));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f = width;
            float f2 = i6;
            float m28763b = f2 + (m28763b(Math.min(1.0f, (sqrt2 * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(m28763b / sqrt) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((abs / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        /* renamed from: b */
        public final float m28763b(float f) {
            return (float) Math.sin((f - 0.5f) * 0.47123894f);
        }

        /* renamed from: c */
        public void m28762c(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f1940q = 0;
            this.f1939p = 0;
            Interpolator interpolator = this.f1942s;
            Interpolator interpolator2 = RecyclerView.f1862V0;
            if (interpolator != interpolator2) {
                this.f1942s = interpolator2;
                this.f1941r = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f1941r.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            m28760e();
        }

        /* renamed from: d */
        public final void m28761d() {
            RecyclerView.this.removeCallbacks(this);
            xs1.m4718j0(RecyclerView.this, this);
        }

        /* renamed from: e */
        public void m28760e() {
            if (this.f1943t) {
                this.f1944u = true;
            } else {
                m28761d();
            }
        }

        /* renamed from: f */
        public void m28759f(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = m28764a(i, i2, 0, 0);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.f1862V0;
            }
            if (this.f1942s != interpolator) {
                this.f1942s = interpolator;
                this.f1941r = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f1940q = 0;
            this.f1939p = 0;
            RecyclerView.this.setScrollState(2);
            this.f1941r.startScroll(0, 0, i, i2, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.f1941r.computeScrollOffset();
            }
            m28760e();
        }

        /* renamed from: g */
        public void m28758g() {
            RecyclerView.this.removeCallbacks(this);
            this.f1941r.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f1865B == null) {
                m28758g();
                return;
            }
            this.f1944u = false;
            this.f1943t = true;
            recyclerView.m28785u();
            OverScroller overScroller = this.f1941r;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f1939p;
                int i4 = currY - this.f1940q;
                this.f1939p = currX;
                this.f1940q = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f1882J0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.m28886F(i3, i4, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f1882J0;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.m28788t(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f1863A != null) {
                    int[] iArr3 = recyclerView3.f1882J0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.m28819i1(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f1882J0;
                    i2 = iArr4[0];
                    i = iArr4[1];
                    i3 -= i2;
                    i4 -= i;
                    AbstractC0406y abstractC0406y = recyclerView4.f1865B.f1987g;
                    if (abstractC0406y != null && !abstractC0406y.m28509g() && abstractC0406y.m28508h()) {
                        int m28495b = RecyclerView.this.f1929w0.m28495b();
                        if (m28495b == 0) {
                            abstractC0406y.m28502r();
                        } else {
                            if (abstractC0406y.m28510f() >= m28495b) {
                                abstractC0406y.m28504p(m28495b - 1);
                            }
                            abstractC0406y.m28506j(i2, i);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.f1869D.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f1882J0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.m28884G(i2, i, i3, i4, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f1882J0;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (i2 != 0 || i != 0) {
                    recyclerView6.m28880I(i2, i);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                AbstractC0406y abstractC0406y2 = RecyclerView.this.f1865B.f1987g;
                if ((abstractC0406y2 != null && abstractC0406y2.m28509g()) || !z) {
                    m28760e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    RunnableC0438e runnableC0438e = recyclerView7.f1925u0;
                    if (runnableC0438e != null) {
                        runnableC0438e.m28233f(recyclerView7, i2, i);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.m28844a(i7, currVelocity);
                    }
                    if (RecyclerView.f1858R0) {
                        RecyclerView.this.f1927v0.m28226b();
                    }
                }
            }
            AbstractC0406y abstractC0406y3 = RecyclerView.this.f1865B.f1987g;
            if (abstractC0406y3 != null && abstractC0406y3.m28509g()) {
                abstractC0406y3.m28506j(0, 0);
            }
            this.f1943t = false;
            if (this.f1944u) {
                m28761d();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.m28780v1(1);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c  reason: invalid class name */
    /* loaded from: classes.dex */
    public static class animationInterpolatorC0375c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0376c0 {

        /* renamed from: s */
        public static final List<Object> f1946s = Collections.emptyList();

        /* renamed from: a */
        public final View f1947a;

        /* renamed from: b */
        public WeakReference<RecyclerView> f1948b;

        /* renamed from: j */
        public int f1956j;

        /* renamed from: r */
        public RecyclerView f1964r;

        /* renamed from: c */
        public int f1949c = -1;

        /* renamed from: d */
        public int f1950d = -1;

        /* renamed from: e */
        public long f1951e = -1;

        /* renamed from: f */
        public int f1952f = -1;

        /* renamed from: g */
        public int f1953g = -1;

        /* renamed from: h */
        public AbstractC0376c0 f1954h = null;

        /* renamed from: i */
        public AbstractC0376c0 f1955i = null;

        /* renamed from: k */
        public List<Object> f1957k = null;

        /* renamed from: l */
        public List<Object> f1958l = null;

        /* renamed from: m */
        public int f1959m = 0;

        /* renamed from: n */
        public C0403v f1960n = null;

        /* renamed from: o */
        public boolean f1961o = false;

        /* renamed from: p */
        public int f1962p = 0;

        /* renamed from: q */
        public int f1963q = -1;

        public AbstractC0376c0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f1947a = view;
        }

        /* renamed from: A */
        public boolean m28757A() {
            return (this.f1956j & 2) != 0;
        }

        /* renamed from: B */
        public boolean m28756B() {
            return (this.f1956j & 2) != 0;
        }

        /* renamed from: C */
        public void m28755C(int i, boolean z) {
            if (this.f1950d == -1) {
                this.f1950d = this.f1949c;
            }
            if (this.f1953g == -1) {
                this.f1953g = this.f1949c;
            }
            if (z) {
                this.f1953g += i;
            }
            this.f1949c += i;
            if (this.f1947a.getLayoutParams() != null) {
                ((C0396p) this.f1947a.getLayoutParams()).f2007c = true;
            }
        }

        /* renamed from: D */
        public void m28754D(RecyclerView recyclerView) {
            int i = this.f1963q;
            if (i == -1) {
                i = xs1.m4772C(this.f1947a);
            }
            this.f1962p = i;
            recyclerView.m28810l1(this, 4);
        }

        /* renamed from: E */
        public void m28753E(RecyclerView recyclerView) {
            recyclerView.m28810l1(this, this.f1962p);
            this.f1962p = 0;
        }

        /* renamed from: F */
        public void m28752F() {
            this.f1956j = 0;
            this.f1949c = -1;
            this.f1950d = -1;
            this.f1951e = -1L;
            this.f1953g = -1;
            this.f1959m = 0;
            this.f1954h = null;
            this.f1955i = null;
            m28740f();
            this.f1962p = 0;
            this.f1963q = -1;
            RecyclerView.m28794r(this);
        }

        /* renamed from: G */
        public void m28751G() {
            if (this.f1950d == -1) {
                this.f1950d = this.f1949c;
            }
        }

        /* renamed from: H */
        public void m28750H(int i, int i2) {
            this.f1956j = (i & i2) | (this.f1956j & (i2 ^ (-1)));
        }

        /* renamed from: I */
        public final void m28749I(boolean z) {
            int i;
            int i2 = this.f1959m;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.f1959m = i3;
            if (i3 < 0) {
                this.f1959m = 0;
                StringBuilder sb = new StringBuilder();
                sb.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                sb.append(this);
                return;
            }
            if (!z && i3 == 1) {
                i = this.f1956j | 16;
            } else if (!z || i3 != 0) {
                return;
            } else {
                i = this.f1956j & (-17);
            }
            this.f1956j = i;
        }

        /* renamed from: J */
        public void m28748J(C0403v c0403v, boolean z) {
            this.f1960n = c0403v;
            this.f1961o = z;
        }

        /* renamed from: K */
        public boolean m28747K() {
            return (this.f1956j & 16) != 0;
        }

        /* renamed from: L */
        public boolean m28746L() {
            return (this.f1956j & 128) != 0;
        }

        /* renamed from: M */
        public void m28745M() {
            this.f1960n.m28548J(this);
        }

        /* renamed from: N */
        public boolean m28744N() {
            return (this.f1956j & 32) != 0;
        }

        /* renamed from: c */
        public void m28743c(Object obj) {
            if (obj == null) {
                m28742d(NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV);
            } else if ((1024 & this.f1956j) == 0) {
                m28737i();
                this.f1957k.add(obj);
            }
        }

        /* renamed from: d */
        public void m28742d(int i) {
            this.f1956j = i | this.f1956j;
        }

        /* renamed from: e */
        public void m28741e() {
            this.f1950d = -1;
            this.f1953g = -1;
        }

        /* renamed from: f */
        public void m28740f() {
            List<Object> list = this.f1957k;
            if (list != null) {
                list.clear();
            }
            this.f1956j &= -1025;
        }

        /* renamed from: g */
        public void m28739g() {
            this.f1956j &= -33;
        }

        /* renamed from: h */
        public void m28738h() {
            this.f1956j &= -257;
        }

        /* renamed from: i */
        public final void m28737i() {
            if (this.f1957k == null) {
                ArrayList arrayList = new ArrayList();
                this.f1957k = arrayList;
                this.f1958l = Collections.unmodifiableList(arrayList);
            }
        }

        /* renamed from: j */
        public boolean m28736j() {
            return (this.f1956j & 16) == 0 && xs1.m4745S(this.f1947a);
        }

        /* renamed from: k */
        public void m28735k(int i, int i2, boolean z) {
            m28742d(8);
            m28755C(i2, z);
            this.f1949c = i;
        }

        /* renamed from: l */
        public final int m28734l() {
            RecyclerView recyclerView = this.f1964r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.m28841b0(this);
        }

        /* renamed from: m */
        public final long m28733m() {
            return this.f1951e;
        }

        /* renamed from: n */
        public final int m28732n() {
            return this.f1952f;
        }

        /* renamed from: o */
        public final int m28731o() {
            int i = this.f1953g;
            return i == -1 ? this.f1949c : i;
        }

        /* renamed from: p */
        public final int m28730p() {
            return this.f1950d;
        }

        /* renamed from: q */
        public List<Object> m28729q() {
            if ((this.f1956j & NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV) == 0) {
                List<Object> list = this.f1957k;
                return (list == null || list.size() == 0) ? f1946s : this.f1958l;
            }
            return f1946s;
        }

        /* renamed from: r */
        public boolean m28728r(int i) {
            return (i & this.f1956j) != 0;
        }

        /* renamed from: s */
        public boolean m28727s() {
            return (this.f1956j & 512) != 0 || m28724v();
        }

        /* renamed from: t */
        public boolean m28726t() {
            return (this.f1947a.getParent() == null || this.f1947a.getParent() == this.f1964r) ? false : true;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f1949c + " id=" + this.f1951e + ", oldPos=" + this.f1950d + ", pLpos:" + this.f1953g);
            if (m28721y()) {
                sb.append(" scrap ");
                sb.append(this.f1961o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (m28724v()) {
                sb.append(" invalid");
            }
            if (!m28725u()) {
                sb.append(" unbound");
            }
            if (m28756B()) {
                sb.append(" update");
            }
            if (m28722x()) {
                sb.append(" removed");
            }
            if (m28746L()) {
                sb.append(" ignored");
            }
            if (m28720z()) {
                sb.append(" tmpDetached");
            }
            if (!m28723w()) {
                sb.append(" not recyclable(" + this.f1959m + ")");
            }
            if (m28727s()) {
                sb.append(" undefined adapter position");
            }
            if (this.f1947a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* renamed from: u */
        public boolean m28725u() {
            return (this.f1956j & 1) != 0;
        }

        /* renamed from: v */
        public boolean m28724v() {
            return (this.f1956j & 4) != 0;
        }

        /* renamed from: w */
        public final boolean m28723w() {
            return (this.f1956j & 16) == 0 && !xs1.m4745S(this.f1947a);
        }

        /* renamed from: x */
        public boolean m28722x() {
            return (this.f1956j & 8) != 0;
        }

        /* renamed from: y */
        public boolean m28721y() {
            return this.f1960n != null;
        }

        /* renamed from: z */
        public boolean m28720z() {
            return (this.f1956j & 256) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    /* loaded from: classes.dex */
    public class C0377d implements C0460p.InterfaceC0462b {
        public C0377d() {
        }

        @Override // androidx.recyclerview.widget.C0460p.InterfaceC0462b
        /* renamed from: a */
        public void mo28096a(AbstractC0376c0 abstractC0376c0) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f1865B.m28604m1(abstractC0376c0.f1947a, recyclerView.f1916q);
        }

        @Override // androidx.recyclerview.widget.C0460p.InterfaceC0462b
        /* renamed from: b */
        public void mo28095b(AbstractC0376c0 abstractC0376c0, AbstractC0385l.C0388c c0388c, AbstractC0385l.C0388c c0388c2) {
            RecyclerView.this.m28812l(abstractC0376c0, c0388c, c0388c2);
        }

        @Override // androidx.recyclerview.widget.C0460p.InterfaceC0462b
        /* renamed from: c */
        public void mo28094c(AbstractC0376c0 abstractC0376c0, AbstractC0385l.C0388c c0388c, AbstractC0385l.C0388c c0388c2) {
            RecyclerView.this.f1916q.m28548J(abstractC0376c0);
            RecyclerView.this.m28806n(abstractC0376c0, c0388c, c0388c2);
        }

        @Override // androidx.recyclerview.widget.C0460p.InterfaceC0462b
        /* renamed from: d */
        public void mo28093d(AbstractC0376c0 abstractC0376c0, AbstractC0385l.C0388c c0388c, AbstractC0385l.C0388c c0388c2) {
            abstractC0376c0.m28749I(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z = recyclerView.f1894S;
            AbstractC0385l abstractC0385l = recyclerView.f1903e0;
            if (z) {
                if (!abstractC0385l.mo28147b(abstractC0376c0, abstractC0376c0, c0388c, c0388c2)) {
                    return;
                }
            } else if (!abstractC0385l.mo28145d(abstractC0376c0, c0388c, c0388c2)) {
                return;
            }
            RecyclerView.this.m28867O0();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    /* loaded from: classes.dex */
    public class C0378e implements C0419b.InterfaceC0421b {
        public C0378e() {
        }

        @Override // androidx.recyclerview.widget.C0419b.InterfaceC0421b
        /* renamed from: a */
        public View mo28284a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        @Override // androidx.recyclerview.widget.C0419b.InterfaceC0421b
        /* renamed from: b */
        public void mo28283b(View view) {
            AbstractC0376c0 m28823h0 = RecyclerView.m28823h0(view);
            if (m28823h0 != null) {
                m28823h0.m28754D(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C0419b.InterfaceC0421b
        /* renamed from: c */
        public int mo28282c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.C0419b.InterfaceC0421b
        /* renamed from: d */
        public void mo28281d() {
            int mo28282c = mo28282c();
            for (int i = 0; i < mo28282c; i++) {
                View mo28284a = mo28284a(i);
                RecyclerView.this.m28770z(mo28284a);
                mo28284a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.C0419b.InterfaceC0421b
        /* renamed from: e */
        public int mo28280e(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.C0419b.InterfaceC0421b
        /* renamed from: f */
        public AbstractC0376c0 mo28279f(View view) {
            return RecyclerView.m28823h0(view);
        }

        @Override // androidx.recyclerview.widget.C0419b.InterfaceC0421b
        /* renamed from: g */
        public void mo28278g(int i) {
            AbstractC0376c0 m28823h0;
            View mo28284a = mo28284a(i);
            if (mo28284a != null && (m28823h0 = RecyclerView.m28823h0(mo28284a)) != null) {
                if (m28823h0.m28720z() && !m28823h0.m28746L()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + m28823h0 + RecyclerView.this.m28866P());
                }
                m28823h0.m28742d(256);
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        @Override // androidx.recyclerview.widget.C0419b.InterfaceC0421b
        /* renamed from: h */
        public void mo28277h(View view) {
            AbstractC0376c0 m28823h0 = RecyclerView.m28823h0(view);
            if (m28823h0 != null) {
                m28823h0.m28753E(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C0419b.InterfaceC0421b
        /* renamed from: i */
        public void mo28276i(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.m28773y(view);
        }

        @Override // androidx.recyclerview.widget.C0419b.InterfaceC0421b
        /* renamed from: j */
        public void mo28275j(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.m28770z(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        @Override // androidx.recyclerview.widget.C0419b.InterfaceC0421b
        /* renamed from: k */
        public void mo28274k(View view, int i, ViewGroup.LayoutParams layoutParams) {
            AbstractC0376c0 m28823h0 = RecyclerView.m28823h0(view);
            if (m28823h0 != null) {
                if (!m28823h0.m28720z() && !m28823h0.m28746L()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + m28823h0 + RecyclerView.this.m28866P());
                }
                m28823h0.m28738h();
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    /* loaded from: classes.dex */
    public class C0379f implements C0416a.InterfaceC0417a {
        public C0379f() {
        }

        @Override // androidx.recyclerview.widget.C0416a.InterfaceC0417a
        /* renamed from: a */
        public void mo28321a(int i, int i2) {
            RecyclerView.this.m28887E0(i, i2);
            RecyclerView.this.f1935z0 = true;
        }

        @Override // androidx.recyclerview.widget.C0416a.InterfaceC0417a
        /* renamed from: b */
        public void mo28320b(C0416a.C0418b c0418b) {
            m28719i(c0418b);
        }

        @Override // androidx.recyclerview.widget.C0416a.InterfaceC0417a
        /* renamed from: c */
        public void mo28319c(int i, int i2, Object obj) {
            RecyclerView.this.m28771y1(i, i2, obj);
            RecyclerView.this.f1864A0 = true;
        }

        @Override // androidx.recyclerview.widget.C0416a.InterfaceC0417a
        /* renamed from: d */
        public void mo28318d(C0416a.C0418b c0418b) {
            m28719i(c0418b);
        }

        @Override // androidx.recyclerview.widget.C0416a.InterfaceC0417a
        /* renamed from: e */
        public AbstractC0376c0 mo28317e(int i) {
            AbstractC0376c0 m28846Z = RecyclerView.this.m28846Z(i, true);
            if (m28846Z == null || RecyclerView.this.f1922t.m28299n(m28846Z.f1947a)) {
                return null;
            }
            return m28846Z;
        }

        @Override // androidx.recyclerview.widget.C0416a.InterfaceC0417a
        /* renamed from: f */
        public void mo28316f(int i, int i2) {
            RecyclerView.this.m28885F0(i, i2, false);
            RecyclerView.this.f1935z0 = true;
        }

        @Override // androidx.recyclerview.widget.C0416a.InterfaceC0417a
        /* renamed from: g */
        public void mo28315g(int i, int i2) {
            RecyclerView.this.m28889D0(i, i2);
            RecyclerView.this.f1935z0 = true;
        }

        @Override // androidx.recyclerview.widget.C0416a.InterfaceC0417a
        /* renamed from: h */
        public void mo28314h(int i, int i2) {
            RecyclerView.this.m28885F0(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f1935z0 = true;
            recyclerView.f1929w0.f2042d += i2;
        }

        /* renamed from: i */
        public void m28719i(C0416a.C0418b c0418b) {
            int i = c0418b.f2120a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f1865B.mo28455R0(recyclerView, c0418b.f2121b, c0418b.f2123d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f1865B.mo28448U0(recyclerView2, c0418b.f2121b, c0418b.f2123d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f1865B.mo28445W0(recyclerView3, c0418b.f2121b, c0418b.f2123d, c0418b.f2122c);
            } else if (i != 8) {
            } else {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f1865B.mo28450T0(recyclerView4, c0418b.f2121b, c0418b.f2123d, 1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0380g<VH extends AbstractC0376c0> {

        /* renamed from: a */
        public final C0381h f1968a = new C0381h();

        /* renamed from: b */
        public boolean f1969b = false;

        /* renamed from: b */
        public final void m28718b(VH vh, int i) {
            vh.f1949c = i;
            if (m28715h()) {
                vh.f1951e = mo504e(i);
            }
            vh.m28750H(1, 519);
            lm1.m16730a("RV OnBindView");
            m28710n(vh, i, vh.m28729q());
            vh.m28740f();
            ViewGroup.LayoutParams layoutParams = vh.f1947a.getLayoutParams();
            if (layoutParams instanceof C0396p) {
                ((C0396p) layoutParams).f2007c = true;
            }
            lm1.m16729b();
        }

        /* renamed from: c */
        public final VH m28717c(ViewGroup viewGroup, int i) {
            try {
                lm1.m16730a("RV CreateView");
                VH mo495o = mo495o(viewGroup, i);
                if (mo495o.f1947a.getParent() == null) {
                    mo495o.f1952f = i;
                    return mo495o;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                lm1.m16729b();
            }
        }

        /* renamed from: d */
        public abstract int mo497d();

        /* renamed from: e */
        public long mo504e(int i) {
            return -1L;
        }

        /* renamed from: f */
        public int mo4978f(int i) {
            return 0;
        }

        /* renamed from: g */
        public final boolean m28716g() {
            return this.f1968a.m28702a();
        }

        /* renamed from: h */
        public final boolean m28715h() {
            return this.f1969b;
        }

        /* renamed from: i */
        public final void m28714i() {
            this.f1968a.m28701b();
        }

        /* renamed from: j */
        public final void m28713j(int i) {
            this.f1968a.m28700c(i, 1);
        }

        /* renamed from: k */
        public final void m28712k(int i, int i2) {
            this.f1968a.m28700c(i, i2);
        }

        /* renamed from: l */
        public void m28711l(RecyclerView recyclerView) {
        }

        /* renamed from: m */
        public abstract void mo496m(VH vh, int i);

        /* renamed from: n */
        public void m28710n(VH vh, int i, List<Object> list) {
            mo496m(vh, i);
        }

        /* renamed from: o */
        public abstract VH mo495o(ViewGroup viewGroup, int i);

        /* renamed from: p */
        public void m28709p(RecyclerView recyclerView) {
        }

        /* renamed from: q */
        public boolean m28708q(VH vh) {
            return false;
        }

        /* renamed from: r */
        public void m28707r(VH vh) {
        }

        /* renamed from: s */
        public void m28706s(VH vh) {
        }

        /* renamed from: t */
        public void mo24995t(VH vh) {
        }

        /* renamed from: u */
        public void m28705u(AbstractC0382i abstractC0382i) {
            this.f1968a.registerObserver(abstractC0382i);
        }

        /* renamed from: v */
        public void m28704v(boolean z) {
            if (m28716g()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f1969b = z;
        }

        /* renamed from: w */
        public void m28703w(AbstractC0382i abstractC0382i) {
            this.f1968a.unregisterObserver(abstractC0382i);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    /* loaded from: classes.dex */
    public static class C0381h extends Observable<AbstractC0382i> {
        /* renamed from: a */
        public boolean m28702a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* renamed from: b */
        public void m28701b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0382i) ((Observable) this).mObservers.get(size)).mo4974a();
            }
        }

        /* renamed from: c */
        public void m28700c(int i, int i2) {
            m28699d(i, i2, null);
        }

        /* renamed from: d */
        public void m28699d(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0382i) ((Observable) this).mObservers.get(size)).mo28517c(i, i2, obj);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0382i {
        /* renamed from: a */
        public void mo4974a() {
        }

        /* renamed from: b */
        public void mo4973b(int i, int i2) {
        }

        /* renamed from: c */
        public void mo28517c(int i, int i2, Object obj) {
            mo4973b(i, i2);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    /* loaded from: classes.dex */
    public interface InterfaceC0383j {
        /* renamed from: a */
        int m28698a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    /* loaded from: classes.dex */
    public static class C0384k {
        /* renamed from: a */
        public EdgeEffect m28697a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0385l {

        /* renamed from: a */
        public InterfaceC0387b f1970a = null;

        /* renamed from: b */
        public ArrayList<InterfaceC0386a> f1971b = new ArrayList<>();

        /* renamed from: c */
        public long f1972c = 120;

        /* renamed from: d */
        public long f1973d = 120;

        /* renamed from: e */
        public long f1974e = 250;

        /* renamed from: f */
        public long f1975f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$a */
        /* loaded from: classes.dex */
        public interface InterfaceC0386a {
            /* renamed from: a */
            void m28684a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$b */
        /* loaded from: classes.dex */
        public interface InterfaceC0387b {
            /* renamed from: a */
            void mo28681a(AbstractC0376c0 abstractC0376c0);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$c */
        /* loaded from: classes.dex */
        public static class C0388c {

            /* renamed from: a */
            public int f1976a;

            /* renamed from: b */
            public int f1977b;

            /* renamed from: c */
            public int f1978c;

            /* renamed from: d */
            public int f1979d;

            /* renamed from: a */
            public C0388c m28683a(AbstractC0376c0 abstractC0376c0) {
                return m28682b(abstractC0376c0, 0);
            }

            /* renamed from: b */
            public C0388c m28682b(AbstractC0376c0 abstractC0376c0, int i) {
                View view = abstractC0376c0.f1947a;
                this.f1976a = view.getLeft();
                this.f1977b = view.getTop();
                this.f1978c = view.getRight();
                this.f1979d = view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        public static int m28696e(AbstractC0376c0 abstractC0376c0) {
            int i = abstractC0376c0.f1956j & 14;
            if (abstractC0376c0.m28724v()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int m28730p = abstractC0376c0.m28730p();
                int m28734l = abstractC0376c0.m28734l();
                return (m28730p == -1 || m28734l == -1 || m28730p == m28734l) ? i : i | 2048;
            }
            return i;
        }

        /* renamed from: a */
        public abstract boolean mo28148a(AbstractC0376c0 abstractC0376c0, C0388c c0388c, C0388c c0388c2);

        /* renamed from: b */
        public abstract boolean mo28147b(AbstractC0376c0 abstractC0376c0, AbstractC0376c0 abstractC0376c02, C0388c c0388c, C0388c c0388c2);

        /* renamed from: c */
        public abstract boolean mo28146c(AbstractC0376c0 abstractC0376c0, C0388c c0388c, C0388c c0388c2);

        /* renamed from: d */
        public abstract boolean mo28145d(AbstractC0376c0 abstractC0376c0, C0388c c0388c, C0388c c0388c2);

        /* renamed from: f */
        public abstract boolean mo28144f(AbstractC0376c0 abstractC0376c0);

        /* renamed from: g */
        public boolean mo28263g(AbstractC0376c0 abstractC0376c0, List<Object> list) {
            return mo28144f(abstractC0376c0);
        }

        /* renamed from: h */
        public final void m28695h(AbstractC0376c0 abstractC0376c0) {
            m28688r(abstractC0376c0);
            InterfaceC0387b interfaceC0387b = this.f1970a;
            if (interfaceC0387b != null) {
                interfaceC0387b.mo28681a(abstractC0376c0);
            }
        }

        /* renamed from: i */
        public final void m28694i() {
            int size = this.f1971b.size();
            for (int i = 0; i < size; i++) {
                this.f1971b.get(i).m28684a();
            }
            this.f1971b.clear();
        }

        /* renamed from: j */
        public abstract void mo28262j(AbstractC0376c0 abstractC0376c0);

        /* renamed from: k */
        public abstract void mo28261k();

        /* renamed from: l */
        public long m28693l() {
            return this.f1972c;
        }

        /* renamed from: m */
        public long m28692m() {
            return this.f1975f;
        }

        /* renamed from: n */
        public long m28691n() {
            return this.f1974e;
        }

        /* renamed from: o */
        public long m28690o() {
            return this.f1973d;
        }

        /* renamed from: p */
        public abstract boolean mo28260p();

        /* renamed from: q */
        public C0388c m28689q() {
            return new C0388c();
        }

        /* renamed from: r */
        public void m28688r(AbstractC0376c0 abstractC0376c0) {
        }

        /* renamed from: s */
        public C0388c m28687s(C0409z c0409z, AbstractC0376c0 abstractC0376c0) {
            return m28689q().m28683a(abstractC0376c0);
        }

        /* renamed from: t */
        public C0388c m28686t(C0409z c0409z, AbstractC0376c0 abstractC0376c0, int i, List<Object> list) {
            return m28689q().m28683a(abstractC0376c0);
        }

        /* renamed from: u */
        public abstract void mo28259u();

        /* renamed from: v */
        public void m28685v(InterfaceC0387b interfaceC0387b) {
            this.f1970a = interfaceC0387b;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    /* loaded from: classes.dex */
    public class C0389m implements AbstractC0385l.InterfaceC0387b {
        public C0389m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0385l.InterfaceC0387b
        /* renamed from: a */
        public void mo28681a(AbstractC0376c0 abstractC0376c0) {
            abstractC0376c0.m28749I(true);
            if (abstractC0376c0.f1954h != null && abstractC0376c0.f1955i == null) {
                abstractC0376c0.f1954h = null;
            }
            abstractC0376c0.f1955i = null;
            if (abstractC0376c0.m28747K() || RecyclerView.this.m28849X0(abstractC0376c0.f1947a) || !abstractC0376c0.m28720z()) {
                return;
            }
            RecyclerView.this.removeDetachedView(abstractC0376c0.f1947a, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0390n {
        @Deprecated
        /* renamed from: d */
        public void m28680d(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: e */
        public void mo16521e(Rect rect, View view, RecyclerView recyclerView, C0409z c0409z) {
            m28680d(rect, ((C0396p) view.getLayoutParams()).m28575a(), recyclerView);
        }

        @Deprecated
        /* renamed from: f */
        public void m28679f(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: g */
        public void mo553g(Canvas canvas, RecyclerView recyclerView, C0409z c0409z) {
            m28679f(canvas, recyclerView);
        }

        @Deprecated
        /* renamed from: h */
        public void m28678h(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: i */
        public void mo16520i(Canvas canvas, RecyclerView recyclerView, C0409z c0409z) {
            m28678h(canvas, recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0391o {

        /* renamed from: a */
        public C0419b f1981a;

        /* renamed from: b */
        public RecyclerView f1982b;

        /* renamed from: c */
        public final C0457o.InterfaceC0459b f1983c;

        /* renamed from: d */
        public final C0457o.InterfaceC0459b f1984d;

        /* renamed from: e */
        public C0457o f1985e;

        /* renamed from: f */
        public C0457o f1986f;

        /* renamed from: g */
        public AbstractC0406y f1987g;

        /* renamed from: h */
        public boolean f1988h;

        /* renamed from: i */
        public boolean f1989i;

        /* renamed from: j */
        public boolean f1990j;

        /* renamed from: k */
        public boolean f1991k;

        /* renamed from: l */
        public boolean f1992l;

        /* renamed from: m */
        public int f1993m;

        /* renamed from: n */
        public boolean f1994n;

        /* renamed from: o */
        public int f1995o;

        /* renamed from: p */
        public int f1996p;

        /* renamed from: q */
        public int f1997q;

        /* renamed from: r */
        public int f1998r;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$a */
        /* loaded from: classes.dex */
        public class C0392a implements C0457o.InterfaceC0459b {
            public C0392a() {
            }

            @Override // androidx.recyclerview.widget.C0457o.InterfaceC0459b
            /* renamed from: a */
            public View mo28121a(int i) {
                return AbstractC0391o.this.m28659I(i);
            }

            @Override // androidx.recyclerview.widget.C0457o.InterfaceC0459b
            /* renamed from: b */
            public int mo28120b(View view) {
                return AbstractC0391o.this.m28646Q(view) - ((ViewGroup.MarginLayoutParams) ((C0396p) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.C0457o.InterfaceC0459b
            /* renamed from: c */
            public int mo28119c() {
                return AbstractC0391o.this.m28623e0();
            }

            @Override // androidx.recyclerview.widget.C0457o.InterfaceC0459b
            /* renamed from: d */
            public int mo28118d() {
                return AbstractC0391o.this.m28600o0() - AbstractC0391o.this.m28621f0();
            }

            @Override // androidx.recyclerview.widget.C0457o.InterfaceC0459b
            /* renamed from: e */
            public int mo28117e(View view) {
                return AbstractC0391o.this.m28642T(view) + ((ViewGroup.MarginLayoutParams) ((C0396p) view.getLayoutParams())).rightMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$b */
        /* loaded from: classes.dex */
        public class C0393b implements C0457o.InterfaceC0459b {
            public C0393b() {
            }

            @Override // androidx.recyclerview.widget.C0457o.InterfaceC0459b
            /* renamed from: a */
            public View mo28121a(int i) {
                return AbstractC0391o.this.m28659I(i);
            }

            @Override // androidx.recyclerview.widget.C0457o.InterfaceC0459b
            /* renamed from: b */
            public int mo28120b(View view) {
                return AbstractC0391o.this.m28641U(view) - ((ViewGroup.MarginLayoutParams) ((C0396p) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.C0457o.InterfaceC0459b
            /* renamed from: c */
            public int mo28119c() {
                return AbstractC0391o.this.m28619g0();
            }

            @Override // androidx.recyclerview.widget.C0457o.InterfaceC0459b
            /* renamed from: d */
            public int mo28118d() {
                return AbstractC0391o.this.m28638W() - AbstractC0391o.this.m28625d0();
            }

            @Override // androidx.recyclerview.widget.C0457o.InterfaceC0459b
            /* renamed from: e */
            public int mo28117e(View view) {
                return AbstractC0391o.this.m28649O(view) + ((ViewGroup.MarginLayoutParams) ((C0396p) view.getLayoutParams())).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$c */
        /* loaded from: classes.dex */
        public interface InterfaceC0394c {
            /* renamed from: a */
            void mo28227a(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$d */
        /* loaded from: classes.dex */
        public static class C0395d {

            /* renamed from: a */
            public int f2001a;

            /* renamed from: b */
            public int f2002b;

            /* renamed from: c */
            public boolean f2003c;

            /* renamed from: d */
            public boolean f2004d;
        }

        public AbstractC0391o() {
            C0392a c0392a = new C0392a();
            this.f1983c = c0392a;
            C0393b c0393b = new C0393b();
            this.f1984d = c0393b;
            this.f1985e = new C0457o(c0392a);
            this.f1986f = new C0457o(c0393b);
            this.f1988h = false;
            this.f1989i = false;
            this.f1990j = false;
            this.f1991k = true;
            this.f1992l = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (r5 == 1073741824) goto L8;
         */
        /* renamed from: K */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int m28656K(int i, int i2, int i3, int i4, boolean z) {
            int max = Math.max(0, i - i3);
            if (z) {
                if (i4 < 0) {
                    if (i4 == -1) {
                        if (i2 != Integer.MIN_VALUE) {
                            if (i2 != 0) {
                            }
                        }
                        i4 = max;
                    }
                    i2 = 0;
                    i4 = 0;
                }
                i2 = 1073741824;
            } else {
                if (i4 < 0) {
                    if (i4 != -1) {
                        if (i4 == -2) {
                            i2 = (i2 == Integer.MIN_VALUE || i2 == 1073741824) ? Integer.MIN_VALUE : 0;
                        }
                        i2 = 0;
                        i4 = 0;
                    }
                    i4 = max;
                }
                i2 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        /* renamed from: i0 */
        public static C0395d m28613i0(Context context, AttributeSet attributeSet, int i, int i2) {
            C0395d c0395d = new C0395d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t21.f26928f, i, i2);
            c0395d.f2001a = obtainStyledAttributes.getInt(t21.f26929g, 1);
            c0395d.f2002b = obtainStyledAttributes.getInt(t21.f26939q, 1);
            c0395d.f2003c = obtainStyledAttributes.getBoolean(t21.f26938p, false);
            c0395d.f2004d = obtainStyledAttributes.getBoolean(t21.f26940r, false);
            obtainStyledAttributes.recycle();
            return c0395d;
        }

        /* renamed from: n */
        public static int m28603n(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        /* renamed from: w0 */
        public static boolean m28583w0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 <= 0 || i == i3) {
                if (mode == Integer.MIN_VALUE) {
                    return size >= i;
                } else if (mode != 0) {
                    return mode == 1073741824 && size == i;
                } else {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: A */
        public void m28677A(RecyclerView recyclerView, C0403v c0403v) {
            this.f1989i = false;
            mo28475I0(recyclerView, c0403v);
        }

        /* renamed from: A0 */
        public void m28676A0(View view, int i, int i2) {
            C0396p c0396p = (C0396p) view.getLayoutParams();
            Rect m28811l0 = this.f1982b.m28811l0(view);
            int i3 = i + m28811l0.left + m28811l0.right;
            int i4 = i2 + m28811l0.top + m28811l0.bottom;
            int m28656K = m28656K(m28600o0(), m28597p0(), m28623e0() + m28621f0() + ((ViewGroup.MarginLayoutParams) c0396p).leftMargin + ((ViewGroup.MarginLayoutParams) c0396p).rightMargin + i3, ((ViewGroup.MarginLayoutParams) c0396p).width, mo28423k());
            int m28656K2 = m28656K(m28638W(), m28637X(), m28619g0() + m28625d0() + ((ViewGroup.MarginLayoutParams) c0396p).topMargin + ((ViewGroup.MarginLayoutParams) c0396p).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) c0396p).height, mo28420l());
            if (m28666F1(view, m28656K, m28656K2, c0396p)) {
                view.measure(m28656K, m28656K2);
            }
        }

        /* renamed from: A1 */
        public void m28675A1(int i, int i2) {
            this.f1997q = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f1995o = mode;
            if (mode == 0 && !RecyclerView.f1856P0) {
                this.f1997q = 0;
            }
            this.f1998r = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f1996p = mode2;
            if (mode2 != 0 || RecyclerView.f1856P0) {
                return;
            }
            this.f1998r = 0;
        }

        /* renamed from: B */
        public View m28674B(View view) {
            View m28862R;
            RecyclerView recyclerView = this.f1982b;
            if (recyclerView == null || (m28862R = recyclerView.m28862R(view)) == null || this.f1981a.m28299n(m28862R)) {
                return null;
            }
            return m28862R;
        }

        /* renamed from: B0 */
        public void m28673B0(int i, int i2) {
            View m28659I = m28659I(i);
            if (m28659I != null) {
                m28582x(i);
                m28617h(m28659I, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f1982b.toString());
        }

        /* renamed from: B1 */
        public void m28672B1(int i, int i2) {
            this.f1982b.setMeasuredDimension(i, i2);
        }

        /* renamed from: C */
        public View mo28671C(int i) {
            int m28658J = m28658J();
            for (int i2 = 0; i2 < m28658J; i2++) {
                View m28659I = m28659I(i2);
                AbstractC0376c0 m28823h0 = RecyclerView.m28823h0(m28659I);
                if (m28823h0 != null && m28823h0.m28731o() == i && !m28823h0.m28746L() && (this.f1982b.f1929w0.m28492e() || !m28823h0.m28722x())) {
                    return m28659I;
                }
            }
            return null;
        }

        /* renamed from: C0 */
        public void mo28487C0(int i) {
            RecyclerView recyclerView = this.f1982b;
            if (recyclerView != null) {
                recyclerView.m28893B0(i);
            }
        }

        /* renamed from: C1 */
        public void mo28486C1(Rect rect, int i, int i2) {
            m28672B1(m28603n(i, rect.width() + m28623e0() + m28621f0(), m28627c0()), m28603n(i2, rect.height() + m28619g0() + m28625d0(), m28630b0()));
        }

        /* renamed from: D */
        public abstract C0396p mo28484D();

        /* renamed from: D0 */
        public void mo28483D0(int i) {
            RecyclerView recyclerView = this.f1982b;
            if (recyclerView != null) {
                recyclerView.m28891C0(i);
            }
        }

        /* renamed from: D1 */
        public void m28670D1(int i, int i2) {
            int m28658J = m28658J();
            if (m28658J == 0) {
                this.f1982b.m28779w(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < m28658J; i7++) {
                View m28659I = m28659I(i7);
                Rect rect = this.f1982b.f1930x;
                m28647P(m28659I, rect);
                int i8 = rect.left;
                if (i8 < i5) {
                    i5 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i6) {
                    i6 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i4) {
                    i4 = i11;
                }
            }
            this.f1982b.f1930x.set(i5, i6, i3, i4);
            mo28486C1(this.f1982b.f1930x, i, i2);
        }

        /* renamed from: E */
        public C0396p mo28481E(Context context, AttributeSet attributeSet) {
            return new C0396p(context, attributeSet);
        }

        /* renamed from: E0 */
        public void m28669E0(AbstractC0380g abstractC0380g, AbstractC0380g abstractC0380g2) {
        }

        /* renamed from: E1 */
        public void m28668E1(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.f1982b = null;
                this.f1981a = null;
                height = 0;
                this.f1997q = 0;
            } else {
                this.f1982b = recyclerView;
                this.f1981a = recyclerView.f1922t;
                this.f1997q = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.f1998r = height;
            this.f1995o = 1073741824;
            this.f1996p = 1073741824;
        }

        /* renamed from: F */
        public C0396p mo28479F(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof C0396p ? new C0396p((C0396p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0396p((ViewGroup.MarginLayoutParams) layoutParams) : new C0396p(layoutParams);
        }

        /* renamed from: F0 */
        public boolean m28667F0(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* renamed from: F1 */
        public boolean m28666F1(View view, int i, int i2, C0396p c0396p) {
            return (!view.isLayoutRequested() && this.f1991k && m28583w0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c0396p).width) && m28583w0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c0396p).height)) ? false : true;
        }

        /* renamed from: G */
        public int m28665G() {
            return -1;
        }

        /* renamed from: G0 */
        public void m28664G0(RecyclerView recyclerView) {
        }

        /* renamed from: G1 */
        public boolean mo28663G1() {
            return false;
        }

        /* renamed from: H */
        public int m28662H(View view) {
            return ((C0396p) view.getLayoutParams()).f2006b.bottom;
        }

        @Deprecated
        /* renamed from: H0 */
        public void m28661H0(RecyclerView recyclerView) {
        }

        /* renamed from: H1 */
        public boolean m28660H1(View view, int i, int i2, C0396p c0396p) {
            return (this.f1991k && m28583w0(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c0396p).width) && m28583w0(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c0396p).height)) ? false : true;
        }

        /* renamed from: I */
        public View m28659I(int i) {
            C0419b c0419b = this.f1981a;
            if (c0419b != null) {
                return c0419b.m28307f(i);
            }
            return null;
        }

        /* renamed from: I0 */
        public void mo28475I0(RecyclerView recyclerView, C0403v c0403v) {
            m28661H0(recyclerView);
        }

        /* renamed from: I1 */
        public void mo2469I1(RecyclerView recyclerView, C0409z c0409z, int i) {
        }

        /* renamed from: J */
        public int m28658J() {
            C0419b c0419b = this.f1981a;
            if (c0419b != null) {
                return c0419b.m28306g();
            }
            return 0;
        }

        /* renamed from: J0 */
        public View mo28473J0(View view, int i, C0403v c0403v, C0409z c0409z) {
            return null;
        }

        /* renamed from: J1 */
        public void m28657J1(AbstractC0406y abstractC0406y) {
            AbstractC0406y abstractC0406y2 = this.f1987g;
            if (abstractC0406y2 != null && abstractC0406y != abstractC0406y2 && abstractC0406y2.m28508h()) {
                this.f1987g.m28502r();
            }
            this.f1987g = abstractC0406y;
            abstractC0406y.m28503q(this.f1982b, this);
        }

        /* renamed from: K0 */
        public void mo28471K0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1982b;
            m28653L0(recyclerView.f1916q, recyclerView.f1929w0, accessibilityEvent);
        }

        /* renamed from: K1 */
        public void m28655K1() {
            AbstractC0406y abstractC0406y = this.f1987g;
            if (abstractC0406y != null) {
                abstractC0406y.m28502r();
            }
        }

        /* renamed from: L */
        public final int[] m28654L(View view, Rect rect) {
            int[] iArr = new int[2];
            int m28623e0 = m28623e0();
            int m28619g0 = m28619g0();
            int m28600o0 = m28600o0() - m28621f0();
            int m28638W = m28638W() - m28625d0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - m28623e0;
            int min = Math.min(0, i);
            int i2 = top - m28619g0;
            int min2 = Math.min(0, i2);
            int i3 = width - m28600o0;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - m28638W);
            if (m28635Z() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: L0 */
        public void m28653L0(C0403v c0403v, C0409z c0409z, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1982b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.f1982b.canScrollVertically(-1) && !this.f1982b.canScrollHorizontally(-1) && !this.f1982b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            AbstractC0380g abstractC0380g = this.f1982b.f1863A;
            if (abstractC0380g != null) {
                accessibilityEvent.setItemCount(abstractC0380g.mo497d());
            }
        }

        /* renamed from: L1 */
        public boolean mo28469L1() {
            return false;
        }

        /* renamed from: M */
        public boolean m28652M() {
            RecyclerView recyclerView = this.f1982b;
            return recyclerView != null && recyclerView.f1926v;
        }

        /* renamed from: M0 */
        public void m28651M0(C0403v c0403v, C0409z c0409z, C3654y c3654y) {
            if (this.f1982b.canScrollVertically(-1) || this.f1982b.canScrollHorizontally(-1)) {
                c3654y.m4338a(8192);
                c3654y.m4299t0(true);
            }
            if (this.f1982b.canScrollVertically(1) || this.f1982b.canScrollHorizontally(1)) {
                c3654y.m4338a(4096);
                c3654y.m4299t0(true);
            }
            c3654y.m4331d0(C3654y.C3656b.m4281b(mo28422k0(c0403v, c0409z), mo28465N(c0403v, c0409z), m28586v0(c0403v, c0409z), m28607l0(c0403v, c0409z)));
        }

        /* renamed from: N */
        public int mo28465N(C0403v c0403v, C0409z c0409z) {
            RecyclerView recyclerView = this.f1982b;
            if (recyclerView == null || recyclerView.f1863A == null || !mo28423k()) {
                return 1;
            }
            return this.f1982b.f1863A.mo497d();
        }

        /* renamed from: N0 */
        public void m28650N0(C3654y c3654y) {
            RecyclerView recyclerView = this.f1982b;
            m28651M0(recyclerView.f1916q, recyclerView.f1929w0, c3654y);
        }

        /* renamed from: O */
        public int m28649O(View view) {
            return view.getBottom() + m28662H(view);
        }

        /* renamed from: O0 */
        public void m28648O0(View view, C3654y c3654y) {
            AbstractC0376c0 m28823h0 = RecyclerView.m28823h0(view);
            if (m28823h0 == null || m28823h0.m28722x() || this.f1981a.m28299n(m28823h0.f1947a)) {
                return;
            }
            RecyclerView recyclerView = this.f1982b;
            mo28460P0(recyclerView.f1916q, recyclerView.f1929w0, view, c3654y);
        }

        /* renamed from: P */
        public void m28647P(View view, Rect rect) {
            RecyclerView.m28820i0(view, rect);
        }

        /* renamed from: P0 */
        public void mo28460P0(C0403v c0403v, C0409z c0409z, View view, C3654y c3654y) {
            c3654y.m4329e0(C3654y.C3657c.m4280a(mo28420l() ? m28616h0(view) : 0, 1, mo28423k() ? m28616h0(view) : 0, 1, false, false));
        }

        /* renamed from: Q */
        public int m28646Q(View view) {
            return view.getLeft() - m28633a0(view);
        }

        /* renamed from: Q0 */
        public View m28645Q0(View view, int i) {
            return null;
        }

        /* renamed from: R */
        public int m28644R(View view) {
            Rect rect = ((C0396p) view.getLayoutParams()).f2006b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: R0 */
        public void mo28455R0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: S */
        public int m28643S(View view) {
            Rect rect = ((C0396p) view.getLayoutParams()).f2006b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: S0 */
        public void mo28452S0(RecyclerView recyclerView) {
        }

        /* renamed from: T */
        public int m28642T(View view) {
            return view.getRight() + m28610j0(view);
        }

        /* renamed from: T0 */
        public void mo28450T0(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: U */
        public int m28641U(View view) {
            return view.getTop() - m28605m0(view);
        }

        /* renamed from: U0 */
        public void mo28448U0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: V */
        public View m28640V() {
            View focusedChild;
            RecyclerView recyclerView = this.f1982b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f1981a.m28299n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: V0 */
        public void m28639V0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: W */
        public int m28638W() {
            return this.f1998r;
        }

        /* renamed from: W0 */
        public void mo28445W0(RecyclerView recyclerView, int i, int i2, Object obj) {
            m28639V0(recyclerView, i, i2);
        }

        /* renamed from: X */
        public int m28637X() {
            return this.f1996p;
        }

        /* renamed from: X0 */
        public void mo28443X0(C0403v c0403v, C0409z c0409z) {
        }

        /* renamed from: Y */
        public int m28636Y() {
            RecyclerView recyclerView = this.f1982b;
            AbstractC0380g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.mo497d();
            }
            return 0;
        }

        /* renamed from: Y0 */
        public void mo28441Y0(C0409z c0409z) {
        }

        /* renamed from: Z */
        public int m28635Z() {
            return xs1.m4768E(this.f1982b);
        }

        /* renamed from: Z0 */
        public void m28634Z0(C0403v c0403v, C0409z c0409z, int i, int i2) {
            this.f1982b.m28779w(i, i2);
        }

        /* renamed from: a0 */
        public int m28633a0(View view) {
            return ((C0396p) view.getLayoutParams()).f2006b.left;
        }

        @Deprecated
        /* renamed from: a1 */
        public boolean m28632a1(RecyclerView recyclerView, View view, View view2) {
            return m28581x0() || recyclerView.m28778w0();
        }

        /* renamed from: b */
        public void m28631b(View view) {
            m28628c(view, -1);
        }

        /* renamed from: b0 */
        public int m28630b0() {
            return xs1.m4766F(this.f1982b);
        }

        /* renamed from: b1 */
        public boolean m28629b1(RecyclerView recyclerView, C0409z c0409z, View view, View view2) {
            return m28632a1(recyclerView, view, view2);
        }

        /* renamed from: c */
        public void m28628c(View view, int i) {
            m28622f(view, i, true);
        }

        /* renamed from: c0 */
        public int m28627c0() {
            return xs1.m4764G(this.f1982b);
        }

        /* renamed from: c1 */
        public void mo28435c1(Parcelable parcelable) {
        }

        /* renamed from: d */
        public void m28626d(View view) {
            m28624e(view, -1);
        }

        /* renamed from: d0 */
        public int m28625d0() {
            RecyclerView recyclerView = this.f1982b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: d1 */
        public Parcelable mo28433d1() {
            return null;
        }

        /* renamed from: e */
        public void m28624e(View view, int i) {
            m28622f(view, i, false);
        }

        /* renamed from: e0 */
        public int m28623e0() {
            RecyclerView recyclerView = this.f1982b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: e1 */
        public void mo28431e1(int i) {
        }

        /* renamed from: f */
        public final void m28622f(View view, int i, boolean z) {
            AbstractC0376c0 m28823h0 = RecyclerView.m28823h0(view);
            if (z || m28823h0.m28722x()) {
                this.f1982b.f1924u.m28115b(m28823h0);
            } else {
                this.f1982b.f1924u.m28101p(m28823h0);
            }
            C0396p c0396p = (C0396p) view.getLayoutParams();
            if (m28823h0.m28744N() || m28823h0.m28721y()) {
                if (m28823h0.m28721y()) {
                    m28823h0.m28745M();
                } else {
                    m28823h0.m28739g();
                }
                this.f1981a.m28310c(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f1982b) {
                int m28300m = this.f1981a.m28300m(view);
                if (i == -1) {
                    i = this.f1981a.m28306g();
                }
                if (m28300m == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f1982b.indexOfChild(view) + this.f1982b.m28866P());
                } else if (m28300m != i) {
                    this.f1982b.f1865B.m28673B0(m28300m, i);
                }
            } else {
                this.f1981a.m28312a(view, i, false);
                c0396p.f2007c = true;
                AbstractC0406y abstractC0406y = this.f1987g;
                if (abstractC0406y != null && abstractC0406y.m28508h()) {
                    this.f1987g.m28505k(view);
                }
            }
            if (c0396p.f2008d) {
                m28823h0.f1947a.invalidate();
                c0396p.f2008d = false;
            }
        }

        /* renamed from: f0 */
        public int m28621f0() {
            RecyclerView recyclerView = this.f1982b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: f1 */
        public void m28620f1(AbstractC0406y abstractC0406y) {
            if (this.f1987g == abstractC0406y) {
                this.f1987g = null;
            }
        }

        /* renamed from: g */
        public void mo28428g(String str) {
            RecyclerView recyclerView = this.f1982b;
            if (recyclerView != null) {
                recyclerView.m28803o(str);
            }
        }

        /* renamed from: g0 */
        public int m28619g0() {
            RecyclerView recyclerView = this.f1982b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: g1 */
        public boolean m28618g1(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f1982b;
            return m28615h1(recyclerView.f1916q, recyclerView.f1929w0, i, bundle);
        }

        /* renamed from: h */
        public void m28617h(View view, int i) {
            m28614i(view, i, (C0396p) view.getLayoutParams());
        }

        /* renamed from: h0 */
        public int m28616h0(View view) {
            return ((C0396p) view.getLayoutParams()).m28575a();
        }

        /* renamed from: h1 */
        public boolean m28615h1(C0403v c0403v, C0409z c0409z, int i, Bundle bundle) {
            int m28638W;
            int m28600o0;
            int i2;
            int i3;
            RecyclerView recyclerView = this.f1982b;
            if (recyclerView == null) {
                return false;
            }
            if (i == 4096) {
                m28638W = recyclerView.canScrollVertically(1) ? (m28638W() - m28619g0()) - m28625d0() : 0;
                if (this.f1982b.canScrollHorizontally(1)) {
                    m28600o0 = (m28600o0() - m28623e0()) - m28621f0();
                    i2 = m28638W;
                    i3 = m28600o0;
                }
                i2 = m28638W;
                i3 = 0;
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                m28638W = recyclerView.canScrollVertically(-1) ? -((m28638W() - m28619g0()) - m28625d0()) : 0;
                if (this.f1982b.canScrollHorizontally(-1)) {
                    m28600o0 = -((m28600o0() - m28623e0()) - m28621f0());
                    i2 = m28638W;
                    i3 = m28600o0;
                }
                i2 = m28638W;
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.f1982b.m28795q1(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        }

        /* renamed from: i */
        public void m28614i(View view, int i, C0396p c0396p) {
            AbstractC0376c0 m28823h0 = RecyclerView.m28823h0(view);
            if (m28823h0.m28722x()) {
                this.f1982b.f1924u.m28115b(m28823h0);
            } else {
                this.f1982b.f1924u.m28101p(m28823h0);
            }
            this.f1981a.m28310c(view, i, c0396p, m28823h0.m28722x());
        }

        /* renamed from: i1 */
        public boolean m28612i1(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f1982b;
            return m28609j1(recyclerView.f1916q, recyclerView.f1929w0, view, i, bundle);
        }

        /* renamed from: j */
        public void m28611j(View view, Rect rect) {
            RecyclerView recyclerView = this.f1982b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.m28811l0(view));
            }
        }

        /* renamed from: j0 */
        public int m28610j0(View view) {
            return ((C0396p) view.getLayoutParams()).f2006b.right;
        }

        /* renamed from: j1 */
        public boolean m28609j1(C0403v c0403v, C0409z c0409z, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: k */
        public boolean mo28423k() {
            return false;
        }

        /* renamed from: k0 */
        public int mo28422k0(C0403v c0403v, C0409z c0409z) {
            RecyclerView recyclerView = this.f1982b;
            if (recyclerView == null || recyclerView.f1863A == null || !mo28420l()) {
                return 1;
            }
            return this.f1982b.f1863A.mo497d();
        }

        /* renamed from: k1 */
        public void m28608k1(C0403v c0403v) {
            for (int m28658J = m28658J() - 1; m28658J >= 0; m28658J--) {
                if (!RecyclerView.m28823h0(m28659I(m28658J)).m28746L()) {
                    m28601n1(m28658J, c0403v);
                }
            }
        }

        /* renamed from: l */
        public boolean mo28420l() {
            return false;
        }

        /* renamed from: l0 */
        public int m28607l0(C0403v c0403v, C0409z c0409z) {
            return 0;
        }

        /* renamed from: l1 */
        public void m28606l1(C0403v c0403v) {
            int m28535j = c0403v.m28535j();
            for (int i = m28535j - 1; i >= 0; i--) {
                View m28531n = c0403v.m28531n(i);
                AbstractC0376c0 m28823h0 = RecyclerView.m28823h0(m28531n);
                if (!m28823h0.m28746L()) {
                    m28823h0.m28749I(false);
                    if (m28823h0.m28720z()) {
                        this.f1982b.removeDetachedView(m28531n, false);
                    }
                    AbstractC0385l abstractC0385l = this.f1982b.f1903e0;
                    if (abstractC0385l != null) {
                        abstractC0385l.mo28262j(m28823h0);
                    }
                    m28823h0.m28749I(true);
                    c0403v.m28520y(m28531n);
                }
            }
            c0403v.m28540e();
            if (m28535j > 0) {
                this.f1982b.invalidate();
            }
        }

        /* renamed from: m */
        public boolean mo28418m(C0396p c0396p) {
            return c0396p != null;
        }

        /* renamed from: m0 */
        public int m28605m0(View view) {
            return ((C0396p) view.getLayoutParams()).f2006b.top;
        }

        /* renamed from: m1 */
        public void m28604m1(View view, C0403v c0403v) {
            m28596p1(view);
            c0403v.m28556B(view);
        }

        /* renamed from: n0 */
        public void m28602n0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C0396p) view.getLayoutParams()).f2006b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f1982b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f1982b.f1934z;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: n1 */
        public void m28601n1(int i, C0403v c0403v) {
            View m28659I = m28659I(i);
            m28594q1(i);
            c0403v.m28556B(m28659I);
        }

        /* renamed from: o */
        public void mo28415o(int i, int i2, C0409z c0409z, InterfaceC0394c interfaceC0394c) {
        }

        /* renamed from: o0 */
        public int m28600o0() {
            return this.f1997q;
        }

        /* renamed from: o1 */
        public boolean m28599o1(Runnable runnable) {
            RecyclerView recyclerView = this.f1982b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: p */
        public void mo28598p(int i, InterfaceC0394c interfaceC0394c) {
        }

        /* renamed from: p0 */
        public int m28597p0() {
            return this.f1995o;
        }

        /* renamed from: p1 */
        public void m28596p1(View view) {
            this.f1981a.m28297p(view);
        }

        /* renamed from: q */
        public int mo28412q(C0409z c0409z) {
            return 0;
        }

        /* renamed from: q0 */
        public boolean m28595q0() {
            int m28658J = m28658J();
            for (int i = 0; i < m28658J; i++) {
                ViewGroup.LayoutParams layoutParams = m28659I(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: q1 */
        public void m28594q1(int i) {
            if (m28659I(i) != null) {
                this.f1981a.m28296q(i);
            }
        }

        /* renamed from: r */
        public int mo28410r(C0409z c0409z) {
            return 0;
        }

        /* renamed from: r0 */
        public boolean m28593r0() {
            return this.f1989i;
        }

        /* renamed from: r1 */
        public boolean m28592r1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return m28591s1(recyclerView, view, rect, z, false);
        }

        /* renamed from: s */
        public int mo28408s(C0409z c0409z) {
            return 0;
        }

        /* renamed from: s0 */
        public boolean mo28407s0() {
            return this.f1990j;
        }

        /* renamed from: s1 */
        public boolean m28591s1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] m28654L = m28654L(view, rect);
            int i = m28654L[0];
            int i2 = m28654L[1];
            if ((!z2 || m28590t0(recyclerView, i, i2)) && !(i == 0 && i2 == 0)) {
                if (z) {
                    recyclerView.scrollBy(i, i2);
                } else {
                    recyclerView.m28804n1(i, i2);
                }
                return true;
            }
            return false;
        }

        /* renamed from: t */
        public int mo28405t(C0409z c0409z) {
            return 0;
        }

        /* renamed from: t0 */
        public final boolean m28590t0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int m28623e0 = m28623e0();
            int m28619g0 = m28619g0();
            int m28600o0 = m28600o0() - m28621f0();
            int m28638W = m28638W() - m28625d0();
            Rect rect = this.f1982b.f1930x;
            m28647P(focusedChild, rect);
            return rect.left - i < m28600o0 && rect.right - i > m28623e0 && rect.top - i2 < m28638W && rect.bottom - i2 > m28619g0;
        }

        /* renamed from: t1 */
        public void m28589t1() {
            RecyclerView recyclerView = this.f1982b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: u */
        public int mo28403u(C0409z c0409z) {
            return 0;
        }

        /* renamed from: u0 */
        public final boolean m28588u0() {
            return this.f1992l;
        }

        /* renamed from: u1 */
        public void m28587u1() {
            this.f1988h = true;
        }

        /* renamed from: v */
        public int mo28401v(C0409z c0409z) {
            return 0;
        }

        /* renamed from: v0 */
        public boolean m28586v0(C0403v c0403v, C0409z c0409z) {
            return false;
        }

        /* renamed from: v1 */
        public final void m28585v1(C0403v c0403v, int i, View view) {
            AbstractC0376c0 m28823h0 = RecyclerView.m28823h0(view);
            if (m28823h0.m28746L()) {
                return;
            }
            if (m28823h0.m28724v() && !m28823h0.m28722x() && !this.f1982b.f1863A.m28715h()) {
                m28594q1(i);
                c0403v.m28555C(m28823h0);
                return;
            }
            m28582x(i);
            c0403v.m28554D(view);
            this.f1982b.f1924u.m28106k(m28823h0);
        }

        /* renamed from: w */
        public void m28584w(C0403v c0403v) {
            for (int m28658J = m28658J() - 1; m28658J >= 0; m28658J--) {
                m28585v1(c0403v, m28658J, m28659I(m28658J));
            }
        }

        /* renamed from: w1 */
        public int mo28399w1(int i, C0403v c0403v, C0409z c0409z) {
            return 0;
        }

        /* renamed from: x */
        public void m28582x(int i) {
            m28580y(i, m28659I(i));
        }

        /* renamed from: x0 */
        public boolean m28581x0() {
            AbstractC0406y abstractC0406y = this.f1987g;
            return abstractC0406y != null && abstractC0406y.m28508h();
        }

        /* renamed from: x1 */
        public void mo28397x1(int i) {
        }

        /* renamed from: y */
        public final void m28580y(int i, View view) {
            this.f1981a.m28309d(i);
        }

        /* renamed from: y0 */
        public boolean m28579y0(View view, boolean z, boolean z2) {
            boolean z3 = this.f1985e.m28127b(view, 24579) && this.f1986f.m28127b(view, 24579);
            return z ? z3 : !z3;
        }

        /* renamed from: y1 */
        public int mo28395y1(int i, C0403v c0403v, C0409z c0409z) {
            return 0;
        }

        /* renamed from: z */
        public void m28578z(RecyclerView recyclerView) {
            this.f1989i = true;
            m28664G0(recyclerView);
        }

        /* renamed from: z0 */
        public void m28577z0(View view, int i, int i2, int i3, int i4) {
            C0396p c0396p = (C0396p) view.getLayoutParams();
            Rect rect = c0396p.f2006b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c0396p).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c0396p).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c0396p).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0396p).bottomMargin);
        }

        /* renamed from: z1 */
        public void m28576z1(RecyclerView recyclerView) {
            m28675A1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    /* loaded from: classes.dex */
    public static class C0396p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public AbstractC0376c0 f2005a;

        /* renamed from: b */
        public final Rect f2006b;

        /* renamed from: c */
        public boolean f2007c;

        /* renamed from: d */
        public boolean f2008d;

        public C0396p(int i, int i2) {
            super(i, i2);
            this.f2006b = new Rect();
            this.f2007c = true;
            this.f2008d = false;
        }

        public C0396p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2006b = new Rect();
            this.f2007c = true;
            this.f2008d = false;
        }

        public C0396p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2006b = new Rect();
            this.f2007c = true;
            this.f2008d = false;
        }

        public C0396p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2006b = new Rect();
            this.f2007c = true;
            this.f2008d = false;
        }

        public C0396p(C0396p c0396p) {
            super((ViewGroup.LayoutParams) c0396p);
            this.f2006b = new Rect();
            this.f2007c = true;
            this.f2008d = false;
        }

        /* renamed from: a */
        public int m28575a() {
            return this.f2005a.m28731o();
        }

        /* renamed from: b */
        public boolean m28574b() {
            return this.f2005a.m28757A();
        }

        /* renamed from: c */
        public boolean m28573c() {
            return this.f2005a.m28722x();
        }

        /* renamed from: d */
        public boolean m28572d() {
            return this.f2005a.m28724v();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    /* loaded from: classes.dex */
    public interface InterfaceC0397q {
        /* renamed from: a */
        void m28571a(View view);

        /* renamed from: b */
        void m28570b(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0398r {
        /* renamed from: a */
        public abstract boolean mo28139a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    /* loaded from: classes.dex */
    public interface InterfaceC0399s {
        /* renamed from: a */
        void mo16524a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: b */
        boolean mo16523b(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: c */
        void mo16522c(boolean z);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0400t {
        /* renamed from: a */
        public void mo552a(RecyclerView recyclerView, int i) {
        }

        /* renamed from: b */
        public void mo551b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    /* loaded from: classes.dex */
    public static class C0401u {

        /* renamed from: a */
        public SparseArray<C0402a> f2009a = new SparseArray<>();

        /* renamed from: b */
        public int f2010b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$u$a */
        /* loaded from: classes.dex */
        public static class C0402a {

            /* renamed from: a */
            public final ArrayList<AbstractC0376c0> f2011a = new ArrayList<>();

            /* renamed from: b */
            public int f2012b = 5;

            /* renamed from: c */
            public long f2013c = 0;

            /* renamed from: d */
            public long f2014d = 0;
        }

        /* renamed from: a */
        public void m28569a() {
            this.f2010b++;
        }

        /* renamed from: b */
        public void m28568b() {
            for (int i = 0; i < this.f2009a.size(); i++) {
                this.f2009a.valueAt(i).f2011a.clear();
            }
        }

        /* renamed from: c */
        public void m28567c() {
            this.f2010b--;
        }

        /* renamed from: d */
        public void m28566d(int i, long j) {
            C0402a m28563g = m28563g(i);
            m28563g.f2014d = m28560j(m28563g.f2014d, j);
        }

        /* renamed from: e */
        public void m28565e(int i, long j) {
            C0402a m28563g = m28563g(i);
            m28563g.f2013c = m28560j(m28563g.f2013c, j);
        }

        /* renamed from: f */
        public AbstractC0376c0 m28564f(int i) {
            C0402a c0402a = this.f2009a.get(i);
            if (c0402a == null || c0402a.f2011a.isEmpty()) {
                return null;
            }
            ArrayList<AbstractC0376c0> arrayList = c0402a.f2011a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).m28726t()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* renamed from: g */
        public final C0402a m28563g(int i) {
            C0402a c0402a = this.f2009a.get(i);
            if (c0402a == null) {
                C0402a c0402a2 = new C0402a();
                this.f2009a.put(i, c0402a2);
                return c0402a2;
            }
            return c0402a;
        }

        /* renamed from: h */
        public void m28562h(AbstractC0380g abstractC0380g, AbstractC0380g abstractC0380g2, boolean z) {
            if (abstractC0380g != null) {
                m28567c();
            }
            if (!z && this.f2010b == 0) {
                m28568b();
            }
            if (abstractC0380g2 != null) {
                m28569a();
            }
        }

        /* renamed from: i */
        public void m28561i(AbstractC0376c0 abstractC0376c0) {
            int m28732n = abstractC0376c0.m28732n();
            ArrayList<AbstractC0376c0> arrayList = m28563g(m28732n).f2011a;
            if (this.f2009a.get(m28732n).f2012b <= arrayList.size()) {
                return;
            }
            abstractC0376c0.m28752F();
            arrayList.add(abstractC0376c0);
        }

        /* renamed from: j */
        public long m28560j(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* renamed from: k */
        public boolean m28559k(int i, long j, long j2) {
            long j3 = m28563g(i).f2014d;
            return j3 == 0 || j + j3 < j2;
        }

        /* renamed from: l */
        public boolean m28558l(int i, long j, long j2) {
            long j3 = m28563g(i).f2013c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    /* loaded from: classes.dex */
    public final class C0403v {

        /* renamed from: a */
        public final ArrayList<AbstractC0376c0> f2015a;

        /* renamed from: b */
        public ArrayList<AbstractC0376c0> f2016b;

        /* renamed from: c */
        public final ArrayList<AbstractC0376c0> f2017c;

        /* renamed from: d */
        public final List<AbstractC0376c0> f2018d;

        /* renamed from: e */
        public int f2019e;

        /* renamed from: f */
        public int f2020f;

        /* renamed from: g */
        public C0401u f2021g;

        public C0403v() {
            ArrayList<AbstractC0376c0> arrayList = new ArrayList<>();
            this.f2015a = arrayList;
            this.f2016b = null;
            this.f2017c = new ArrayList<>();
            this.f2018d = Collections.unmodifiableList(arrayList);
            this.f2019e = 2;
            this.f2020f = 2;
        }

        /* renamed from: A */
        public void m28557A(int i) {
            m28544a(this.f2017c.get(i), true);
            this.f2017c.remove(i);
        }

        /* renamed from: B */
        public void m28556B(View view) {
            AbstractC0376c0 m28823h0 = RecyclerView.m28823h0(view);
            if (m28823h0.m28720z()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (m28823h0.m28721y()) {
                m28823h0.m28745M();
            } else if (m28823h0.m28744N()) {
                m28823h0.m28739g();
            }
            m28555C(m28823h0);
            if (RecyclerView.this.f1903e0 == null || m28823h0.m28723w()) {
                return;
            }
            RecyclerView.this.f1903e0.mo28262j(m28823h0);
        }

        /* renamed from: C */
        public void m28555C(AbstractC0376c0 abstractC0376c0) {
            boolean z;
            boolean z2 = true;
            if (abstractC0376c0.m28721y() || abstractC0376c0.f1947a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(abstractC0376c0.m28721y());
                sb.append(" isAttached:");
                sb.append(abstractC0376c0.f1947a.getParent() != null);
                sb.append(RecyclerView.this.m28866P());
                throw new IllegalArgumentException(sb.toString());
            } else if (abstractC0376c0.m28720z()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC0376c0 + RecyclerView.this.m28866P());
            } else if (abstractC0376c0.m28746L()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.m28866P());
            } else {
                boolean m28736j = abstractC0376c0.m28736j();
                AbstractC0380g abstractC0380g = RecyclerView.this.f1863A;
                if ((abstractC0380g != null && m28736j && abstractC0380g.m28708q(abstractC0376c0)) || abstractC0376c0.m28723w()) {
                    if (this.f2020f <= 0 || abstractC0376c0.m28728r(526)) {
                        z = false;
                    } else {
                        int size = this.f2017c.size();
                        if (size >= this.f2020f && size > 0) {
                            m28557A(0);
                            size--;
                        }
                        if (RecyclerView.f1858R0 && size > 0 && !RecyclerView.this.f1927v0.m28224d(abstractC0376c0.f1949c)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.f1927v0.m28224d(this.f2017c.get(i).f1949c)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f2017c.add(size, abstractC0376c0);
                        z = true;
                    }
                    if (!z) {
                        m28544a(abstractC0376c0, true);
                        r1 = z;
                        RecyclerView.this.f1924u.m28100q(abstractC0376c0);
                        if (r1 && !z2 && m28736j) {
                            abstractC0376c0.f1964r = null;
                            return;
                        }
                        return;
                    }
                    r1 = z;
                }
                z2 = false;
                RecyclerView.this.f1924u.m28100q(abstractC0376c0);
                if (r1) {
                }
            }
        }

        /* renamed from: D */
        public void m28554D(View view) {
            ArrayList<AbstractC0376c0> arrayList;
            AbstractC0376c0 m28823h0 = RecyclerView.m28823h0(view);
            if (!m28823h0.m28728r(12) && m28823h0.m28757A() && !RecyclerView.this.m28800p(m28823h0)) {
                if (this.f2016b == null) {
                    this.f2016b = new ArrayList<>();
                }
                m28823h0.m28748J(this, true);
                arrayList = this.f2016b;
            } else if (m28823h0.m28724v() && !m28823h0.m28722x() && !RecyclerView.this.f1863A.m28715h()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.m28866P());
            } else {
                m28823h0.m28748J(this, false);
                arrayList = this.f2015a;
            }
            arrayList.add(m28823h0);
        }

        /* renamed from: E */
        public void m28553E(C0401u c0401u) {
            C0401u c0401u2 = this.f2021g;
            if (c0401u2 != null) {
                c0401u2.m28567c();
            }
            this.f2021g = c0401u;
            if (c0401u == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f2021g.m28569a();
        }

        /* renamed from: F */
        public void m28552F(AbstractC0372a0 abstractC0372a0) {
        }

        /* renamed from: G */
        public void m28551G(int i) {
            this.f2019e = i;
            m28547K();
        }

        /* renamed from: H */
        public final boolean m28550H(AbstractC0376c0 abstractC0376c0, int i, int i2, long j) {
            abstractC0376c0.f1964r = RecyclerView.this;
            int m28732n = abstractC0376c0.m28732n();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j == Long.MAX_VALUE || this.f2021g.m28559k(m28732n, nanoTime, j)) {
                RecyclerView.this.f1863A.m28718b(abstractC0376c0, i);
                this.f2021g.m28566d(abstractC0376c0.m28732n(), RecyclerView.this.getNanoTime() - nanoTime);
                m28543b(abstractC0376c0);
                if (RecyclerView.this.f1929w0.m28492e()) {
                    abstractC0376c0.f1953g = i2;
                    return true;
                }
                return true;
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0170  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01a9  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x01cc A[ADDED_TO_REGION] */
        /* renamed from: I */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public AbstractC0376c0 m28549I(int i, boolean z, long j) {
            AbstractC0376c0 abstractC0376c0;
            boolean z2;
            AbstractC0376c0 abstractC0376c02;
            boolean z3;
            boolean m28550H;
            ViewGroup.LayoutParams layoutParams;
            C0396p c0396p;
            ViewGroup.LayoutParams generateLayoutParams;
            RecyclerView m28854V;
            if (i < 0 || i >= RecyclerView.this.f1929w0.m28495b()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + RecyclerView.this.f1929w0.m28495b() + RecyclerView.this.m28866P());
            }
            boolean z4 = true;
            if (RecyclerView.this.f1929w0.m28492e()) {
                abstractC0376c0 = m28537h(i);
                if (abstractC0376c0 != null) {
                    z2 = true;
                    if (abstractC0376c0 == null && (abstractC0376c0 = m28532m(i, z)) != null) {
                        if (m28546L(abstractC0376c0)) {
                            if (!z) {
                                abstractC0376c0.m28742d(4);
                                if (abstractC0376c0.m28721y()) {
                                    RecyclerView.this.removeDetachedView(abstractC0376c0.f1947a, false);
                                    abstractC0376c0.m28745M();
                                } else if (abstractC0376c0.m28744N()) {
                                    abstractC0376c0.m28739g();
                                }
                                m28555C(abstractC0376c0);
                            }
                            abstractC0376c0 = null;
                        } else {
                            z2 = true;
                        }
                    }
                    if (abstractC0376c0 == null) {
                        int m28332m = RecyclerView.this.f1920s.m28332m(i);
                        if (m28332m < 0 || m28332m >= RecyclerView.this.f1863A.mo497d()) {
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + m28332m + ").state:" + RecyclerView.this.f1929w0.m28495b() + RecyclerView.this.m28866P());
                        }
                        int mo4978f = RecyclerView.this.f1863A.mo4978f(m28332m);
                        if (RecyclerView.this.f1863A.m28715h() && (abstractC0376c0 = m28533l(RecyclerView.this.f1863A.mo504e(m28332m), mo4978f, z)) != null) {
                            abstractC0376c0.f1949c = m28332m;
                            z2 = true;
                        }
                        if (abstractC0376c0 == null) {
                            AbstractC0376c0 m28564f = m28536i().m28564f(mo4978f);
                            if (m28564f != null) {
                                m28564f.m28752F();
                                if (RecyclerView.f1855O0) {
                                    m28527r(m28564f);
                                }
                            }
                            abstractC0376c0 = m28564f;
                        }
                        if (abstractC0376c0 == null) {
                            long nanoTime = RecyclerView.this.getNanoTime();
                            if (j == Long.MAX_VALUE || this.f2021g.m28558l(mo4978f, nanoTime, j)) {
                                RecyclerView recyclerView = RecyclerView.this;
                                AbstractC0376c0 m28717c = recyclerView.f1863A.m28717c(recyclerView, mo4978f);
                                if (RecyclerView.f1858R0 && (m28854V = RecyclerView.m28854V(m28717c.f1947a)) != null) {
                                    m28717c.f1948b = new WeakReference<>(m28854V);
                                }
                                this.f2021g.m28565e(mo4978f, RecyclerView.this.getNanoTime() - nanoTime);
                                abstractC0376c02 = m28717c;
                                z3 = z2;
                                if (z3 && !RecyclerView.this.f1929w0.m28492e() && abstractC0376c02.m28728r(8192)) {
                                    abstractC0376c02.m28750H(0, 8192);
                                    if (RecyclerView.this.f1929w0.f2049k) {
                                        RecyclerView recyclerView2 = RecyclerView.this;
                                        RecyclerView.this.m28857T0(abstractC0376c02, recyclerView2.f1903e0.m28686t(recyclerView2.f1929w0, abstractC0376c02, AbstractC0385l.m28696e(abstractC0376c02) | 4096, abstractC0376c02.m28729q()));
                                    }
                                }
                                if (!RecyclerView.this.f1929w0.m28492e() && abstractC0376c02.m28725u()) {
                                    abstractC0376c02.f1953g = i;
                                } else if (abstractC0376c02.m28725u() || abstractC0376c02.m28756B() || abstractC0376c02.m28724v()) {
                                    m28550H = m28550H(abstractC0376c02, RecyclerView.this.f1920s.m28332m(i), i, j);
                                    layoutParams = abstractC0376c02.f1947a.getLayoutParams();
                                    if (layoutParams != null) {
                                        generateLayoutParams = RecyclerView.this.generateDefaultLayoutParams();
                                    } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                                        c0396p = (C0396p) layoutParams;
                                        c0396p.f2005a = abstractC0376c02;
                                        c0396p.f2008d = (z3 || !m28550H) ? false : false;
                                        return abstractC0376c02;
                                    } else {
                                        generateLayoutParams = RecyclerView.this.generateLayoutParams(layoutParams);
                                    }
                                    c0396p = (C0396p) generateLayoutParams;
                                    abstractC0376c02.f1947a.setLayoutParams(c0396p);
                                    c0396p.f2005a = abstractC0376c02;
                                    c0396p.f2008d = (z3 || !m28550H) ? false : false;
                                    return abstractC0376c02;
                                }
                                m28550H = false;
                                layoutParams = abstractC0376c02.f1947a.getLayoutParams();
                                if (layoutParams != null) {
                                }
                                c0396p = (C0396p) generateLayoutParams;
                                abstractC0376c02.f1947a.setLayoutParams(c0396p);
                                c0396p.f2005a = abstractC0376c02;
                                c0396p.f2008d = (z3 || !m28550H) ? false : false;
                                return abstractC0376c02;
                            }
                            return null;
                        }
                    }
                    abstractC0376c02 = abstractC0376c0;
                    z3 = z2;
                    if (z3) {
                        abstractC0376c02.m28750H(0, 8192);
                        if (RecyclerView.this.f1929w0.f2049k) {
                        }
                    }
                    if (!RecyclerView.this.f1929w0.m28492e()) {
                    }
                    if (abstractC0376c02.m28725u()) {
                    }
                    m28550H = m28550H(abstractC0376c02, RecyclerView.this.f1920s.m28332m(i), i, j);
                    layoutParams = abstractC0376c02.f1947a.getLayoutParams();
                    if (layoutParams != null) {
                    }
                    c0396p = (C0396p) generateLayoutParams;
                    abstractC0376c02.f1947a.setLayoutParams(c0396p);
                    c0396p.f2005a = abstractC0376c02;
                    c0396p.f2008d = (z3 || !m28550H) ? false : false;
                    return abstractC0376c02;
                }
            } else {
                abstractC0376c0 = null;
            }
            z2 = false;
            if (abstractC0376c0 == null) {
                if (m28546L(abstractC0376c0)) {
                }
            }
            if (abstractC0376c0 == null) {
            }
            abstractC0376c02 = abstractC0376c0;
            z3 = z2;
            if (z3) {
            }
            if (!RecyclerView.this.f1929w0.m28492e()) {
            }
            if (abstractC0376c02.m28725u()) {
            }
            m28550H = m28550H(abstractC0376c02, RecyclerView.this.f1920s.m28332m(i), i, j);
            layoutParams = abstractC0376c02.f1947a.getLayoutParams();
            if (layoutParams != null) {
            }
            c0396p = (C0396p) generateLayoutParams;
            abstractC0376c02.f1947a.setLayoutParams(c0396p);
            c0396p.f2005a = abstractC0376c02;
            c0396p.f2008d = (z3 || !m28550H) ? false : false;
            return abstractC0376c02;
        }

        /* renamed from: J */
        public void m28548J(AbstractC0376c0 abstractC0376c0) {
            (abstractC0376c0.f1961o ? this.f2016b : this.f2015a).remove(abstractC0376c0);
            abstractC0376c0.f1960n = null;
            abstractC0376c0.f1961o = false;
            abstractC0376c0.m28739g();
        }

        /* renamed from: K */
        public void m28547K() {
            AbstractC0391o abstractC0391o = RecyclerView.this.f1865B;
            this.f2020f = this.f2019e + (abstractC0391o != null ? abstractC0391o.f1993m : 0);
            for (int size = this.f2017c.size() - 1; size >= 0 && this.f2017c.size() > this.f2020f; size--) {
                m28557A(size);
            }
        }

        /* renamed from: L */
        public boolean m28546L(AbstractC0376c0 abstractC0376c0) {
            if (abstractC0376c0.m28722x()) {
                return RecyclerView.this.f1929w0.m28492e();
            }
            int i = abstractC0376c0.f1949c;
            if (i >= 0 && i < RecyclerView.this.f1863A.mo497d()) {
                if (RecyclerView.this.f1929w0.m28492e() || RecyclerView.this.f1863A.mo4978f(abstractC0376c0.f1949c) == abstractC0376c0.m28732n()) {
                    return !RecyclerView.this.f1863A.m28715h() || abstractC0376c0.m28733m() == RecyclerView.this.f1863A.mo504e(abstractC0376c0.f1949c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC0376c0 + RecyclerView.this.m28866P());
        }

        /* renamed from: M */
        public void m28545M(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f2017c.size() - 1; size >= 0; size--) {
                AbstractC0376c0 abstractC0376c0 = this.f2017c.get(size);
                if (abstractC0376c0 != null && (i3 = abstractC0376c0.f1949c) >= i && i3 < i4) {
                    abstractC0376c0.m28742d(2);
                    m28557A(size);
                }
            }
        }

        /* renamed from: a */
        public void m28544a(AbstractC0376c0 abstractC0376c0, boolean z) {
            RecyclerView.m28794r(abstractC0376c0);
            View view = abstractC0376c0.f1947a;
            C0451k c0451k = RecyclerView.this.f1870D0;
            if (c0451k != null) {
                C3388w m28171n = c0451k.m28171n();
                xs1.m4702r0(view, m28171n instanceof C0451k.C0452a ? ((C0451k.C0452a) m28171n).m28169n(view) : null);
            }
            if (z) {
                m28538g(abstractC0376c0);
            }
            abstractC0376c0.f1964r = null;
            m28536i().m28561i(abstractC0376c0);
        }

        /* renamed from: b */
        public final void m28543b(AbstractC0376c0 abstractC0376c0) {
            if (RecyclerView.this.m28781v0()) {
                View view = abstractC0376c0.f1947a;
                if (xs1.m4772C(view) == 0) {
                    xs1.m4773B0(view, 1);
                }
                C0451k c0451k = RecyclerView.this.f1870D0;
                if (c0451k == null) {
                    return;
                }
                C3388w m28171n = c0451k.m28171n();
                if (m28171n instanceof C0451k.C0452a) {
                    ((C0451k.C0452a) m28171n).m28168o(view);
                }
                xs1.m4702r0(view, m28171n);
            }
        }

        /* renamed from: c */
        public void m28542c() {
            this.f2015a.clear();
            m28519z();
        }

        /* renamed from: d */
        public void m28541d() {
            int size = this.f2017c.size();
            for (int i = 0; i < size; i++) {
                this.f2017c.get(i).m28741e();
            }
            int size2 = this.f2015a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f2015a.get(i2).m28741e();
            }
            ArrayList<AbstractC0376c0> arrayList = this.f2016b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f2016b.get(i3).m28741e();
                }
            }
        }

        /* renamed from: e */
        public void m28540e() {
            this.f2015a.clear();
            ArrayList<AbstractC0376c0> arrayList = this.f2016b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: f */
        public int m28539f(int i) {
            if (i >= 0 && i < RecyclerView.this.f1929w0.m28495b()) {
                return !RecyclerView.this.f1929w0.m28492e() ? i : RecyclerView.this.f1920s.m28332m(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.f1929w0.m28495b() + RecyclerView.this.m28866P());
        }

        /* renamed from: g */
        public void m28538g(AbstractC0376c0 abstractC0376c0) {
            InterfaceC0404w interfaceC0404w = RecyclerView.this.f1867C;
            if (interfaceC0404w != null) {
                interfaceC0404w.m28518a(abstractC0376c0);
            }
            AbstractC0380g abstractC0380g = RecyclerView.this.f1863A;
            if (abstractC0380g != null) {
                abstractC0380g.mo24995t(abstractC0376c0);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f1929w0 != null) {
                recyclerView.f1924u.m28100q(abstractC0376c0);
            }
        }

        /* renamed from: h */
        public AbstractC0376c0 m28537h(int i) {
            int size;
            int m28332m;
            ArrayList<AbstractC0376c0> arrayList = this.f2016b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    AbstractC0376c0 abstractC0376c0 = this.f2016b.get(i2);
                    if (!abstractC0376c0.m28744N() && abstractC0376c0.m28731o() == i) {
                        abstractC0376c0.m28742d(32);
                        return abstractC0376c0;
                    }
                }
                if (RecyclerView.this.f1863A.m28715h() && (m28332m = RecyclerView.this.f1920s.m28332m(i)) > 0 && m28332m < RecyclerView.this.f1863A.mo497d()) {
                    long mo504e = RecyclerView.this.f1863A.mo504e(m28332m);
                    for (int i3 = 0; i3 < size; i3++) {
                        AbstractC0376c0 abstractC0376c02 = this.f2016b.get(i3);
                        if (!abstractC0376c02.m28744N() && abstractC0376c02.m28733m() == mo504e) {
                            abstractC0376c02.m28742d(32);
                            return abstractC0376c02;
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: i */
        public C0401u m28536i() {
            if (this.f2021g == null) {
                this.f2021g = new C0401u();
            }
            return this.f2021g;
        }

        /* renamed from: j */
        public int m28535j() {
            return this.f2015a.size();
        }

        /* renamed from: k */
        public List<AbstractC0376c0> m28534k() {
            return this.f2018d;
        }

        /* renamed from: l */
        public AbstractC0376c0 m28533l(long j, int i, boolean z) {
            for (int size = this.f2015a.size() - 1; size >= 0; size--) {
                AbstractC0376c0 abstractC0376c0 = this.f2015a.get(size);
                if (abstractC0376c0.m28733m() == j && !abstractC0376c0.m28744N()) {
                    if (i == abstractC0376c0.m28732n()) {
                        abstractC0376c0.m28742d(32);
                        if (abstractC0376c0.m28722x() && !RecyclerView.this.f1929w0.m28492e()) {
                            abstractC0376c0.m28750H(2, 14);
                        }
                        return abstractC0376c0;
                    } else if (!z) {
                        this.f2015a.remove(size);
                        RecyclerView.this.removeDetachedView(abstractC0376c0.f1947a, false);
                        m28520y(abstractC0376c0.f1947a);
                    }
                }
            }
            int size2 = this.f2017c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                AbstractC0376c0 abstractC0376c02 = this.f2017c.get(size2);
                if (abstractC0376c02.m28733m() == j && !abstractC0376c02.m28726t()) {
                    if (i == abstractC0376c02.m28732n()) {
                        if (!z) {
                            this.f2017c.remove(size2);
                        }
                        return abstractC0376c02;
                    } else if (!z) {
                        m28557A(size2);
                        return null;
                    }
                }
            }
        }

        /* renamed from: m */
        public AbstractC0376c0 m28532m(int i, boolean z) {
            View m28308e;
            int size = this.f2015a.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC0376c0 abstractC0376c0 = this.f2015a.get(i2);
                if (!abstractC0376c0.m28744N() && abstractC0376c0.m28731o() == i && !abstractC0376c0.m28724v() && (RecyclerView.this.f1929w0.f2046h || !abstractC0376c0.m28722x())) {
                    abstractC0376c0.m28742d(32);
                    return abstractC0376c0;
                }
            }
            if (z || (m28308e = RecyclerView.this.f1922t.m28308e(i)) == null) {
                int size2 = this.f2017c.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    AbstractC0376c0 abstractC0376c02 = this.f2017c.get(i3);
                    if (!abstractC0376c02.m28724v() && abstractC0376c02.m28731o() == i && !abstractC0376c02.m28726t()) {
                        if (!z) {
                            this.f2017c.remove(i3);
                        }
                        return abstractC0376c02;
                    }
                }
                return null;
            }
            AbstractC0376c0 m28823h0 = RecyclerView.m28823h0(m28308e);
            RecyclerView.this.f1922t.m28294s(m28308e);
            int m28300m = RecyclerView.this.f1922t.m28300m(m28308e);
            if (m28300m != -1) {
                RecyclerView.this.f1922t.m28309d(m28300m);
                m28554D(m28308e);
                m28823h0.m28742d(8224);
                return m28823h0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + m28823h0 + RecyclerView.this.m28866P());
        }

        /* renamed from: n */
        public View m28531n(int i) {
            return this.f2015a.get(i).f1947a;
        }

        /* renamed from: o */
        public View m28530o(int i) {
            return m28529p(i, false);
        }

        /* renamed from: p */
        public View m28529p(int i, boolean z) {
            return m28549I(i, z, Long.MAX_VALUE).f1947a;
        }

        /* renamed from: q */
        public final void m28528q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m28528q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: r */
        public final void m28527r(AbstractC0376c0 abstractC0376c0) {
            View view = abstractC0376c0.f1947a;
            if (view instanceof ViewGroup) {
                m28528q((ViewGroup) view, false);
            }
        }

        /* renamed from: s */
        public void m28526s() {
            int size = this.f2017c.size();
            for (int i = 0; i < size; i++) {
                C0396p c0396p = (C0396p) this.f2017c.get(i).f1947a.getLayoutParams();
                if (c0396p != null) {
                    c0396p.f2007c = true;
                }
            }
        }

        /* renamed from: t */
        public void m28525t() {
            int size = this.f2017c.size();
            for (int i = 0; i < size; i++) {
                AbstractC0376c0 abstractC0376c0 = this.f2017c.get(i);
                if (abstractC0376c0 != null) {
                    abstractC0376c0.m28742d(6);
                    abstractC0376c0.m28743c(null);
                }
            }
            AbstractC0380g abstractC0380g = RecyclerView.this.f1863A;
            if (abstractC0380g == null || !abstractC0380g.m28715h()) {
                m28519z();
            }
        }

        /* renamed from: u */
        public void m28524u(int i, int i2) {
            int size = this.f2017c.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC0376c0 abstractC0376c0 = this.f2017c.get(i3);
                if (abstractC0376c0 != null && abstractC0376c0.f1949c >= i) {
                    abstractC0376c0.m28755C(i2, true);
                }
            }
        }

        /* renamed from: v */
        public void m28523v(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i3 = -1;
                i5 = i;
                i4 = i2;
            } else {
                i3 = 1;
                i4 = i;
                i5 = i2;
            }
            int size = this.f2017c.size();
            for (int i7 = 0; i7 < size; i7++) {
                AbstractC0376c0 abstractC0376c0 = this.f2017c.get(i7);
                if (abstractC0376c0 != null && (i6 = abstractC0376c0.f1949c) >= i5 && i6 <= i4) {
                    if (i6 == i) {
                        abstractC0376c0.m28755C(i2 - i, false);
                    } else {
                        abstractC0376c0.m28755C(i3, false);
                    }
                }
            }
        }

        /* renamed from: w */
        public void m28522w(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f2017c.size() - 1; size >= 0; size--) {
                AbstractC0376c0 abstractC0376c0 = this.f2017c.get(size);
                if (abstractC0376c0 != null) {
                    int i4 = abstractC0376c0.f1949c;
                    if (i4 >= i3) {
                        abstractC0376c0.m28755C(-i2, z);
                    } else if (i4 >= i) {
                        abstractC0376c0.m28742d(8);
                        m28557A(size);
                    }
                }
            }
        }

        /* renamed from: x */
        public void m28521x(AbstractC0380g abstractC0380g, AbstractC0380g abstractC0380g2, boolean z) {
            m28542c();
            m28536i().m28562h(abstractC0380g, abstractC0380g2, z);
        }

        /* renamed from: y */
        public void m28520y(View view) {
            AbstractC0376c0 m28823h0 = RecyclerView.m28823h0(view);
            m28823h0.f1960n = null;
            m28823h0.f1961o = false;
            m28823h0.m28739g();
            m28555C(m28823h0);
        }

        /* renamed from: z */
        public void m28519z() {
            for (int size = this.f2017c.size() - 1; size >= 0; size--) {
                m28557A(size);
            }
            this.f2017c.clear();
            if (RecyclerView.f1858R0) {
                RecyclerView.this.f1927v0.m28226b();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    /* loaded from: classes.dex */
    public interface InterfaceC0404w {
        /* renamed from: a */
        void m28518a(AbstractC0376c0 abstractC0376c0);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    /* loaded from: classes.dex */
    public class C0405x extends AbstractC0382i {
        public C0405x() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0382i
        /* renamed from: a */
        public void mo4974a() {
            RecyclerView.this.m28803o(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f1929w0.f2045g = true;
            recyclerView.m28861R0(true);
            if (RecyclerView.this.f1920s.m28329p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0382i
        /* renamed from: c */
        public void mo28517c(int i, int i2, Object obj) {
            RecyclerView.this.m28803o(null);
            if (RecyclerView.this.f1920s.m28327r(i, i2, obj)) {
                m28516d();
            }
        }

        /* renamed from: d */
        public void m28516d() {
            if (RecyclerView.f1857Q0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f1877H && recyclerView.f1875G) {
                    xs1.m4718j0(recyclerView, recyclerView.f1928w);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f1891P = true;
            recyclerView2.requestLayout();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0406y {

        /* renamed from: b */
        public RecyclerView f2025b;

        /* renamed from: c */
        public AbstractC0391o f2026c;

        /* renamed from: d */
        public boolean f2027d;

        /* renamed from: e */
        public boolean f2028e;

        /* renamed from: f */
        public View f2029f;

        /* renamed from: h */
        public boolean f2031h;

        /* renamed from: a */
        public int f2024a = -1;

        /* renamed from: g */
        public final C0407a f2030g = new C0407a(0, 0);

        /* renamed from: androidx.recyclerview.widget.RecyclerView$y$a */
        /* loaded from: classes.dex */
        public static class C0407a {

            /* renamed from: a */
            public int f2032a;

            /* renamed from: b */
            public int f2033b;

            /* renamed from: c */
            public int f2034c;

            /* renamed from: d */
            public int f2035d;

            /* renamed from: e */
            public Interpolator f2036e;

            /* renamed from: f */
            public boolean f2037f;

            /* renamed from: g */
            public int f2038g;

            public C0407a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            public C0407a(int i, int i2, int i3, Interpolator interpolator) {
                this.f2035d = -1;
                this.f2037f = false;
                this.f2038g = 0;
                this.f2032a = i;
                this.f2033b = i2;
                this.f2034c = i3;
                this.f2036e = interpolator;
            }

            /* renamed from: a */
            public boolean m28501a() {
                return this.f2035d >= 0;
            }

            /* renamed from: b */
            public void m28500b(int i) {
                this.f2035d = i;
            }

            /* renamed from: c */
            public void m28499c(RecyclerView recyclerView) {
                int i = this.f2035d;
                if (i >= 0) {
                    this.f2035d = -1;
                    recyclerView.m28772y0(i);
                    this.f2037f = false;
                } else if (!this.f2037f) {
                    this.f2038g = 0;
                } else {
                    m28497e();
                    recyclerView.f1923t0.m28759f(this.f2032a, this.f2033b, this.f2034c, this.f2036e);
                    this.f2038g++;
                    this.f2037f = false;
                }
            }

            /* renamed from: d */
            public void m28498d(int i, int i2, int i3, Interpolator interpolator) {
                this.f2032a = i;
                this.f2033b = i2;
                this.f2034c = i3;
                this.f2036e = interpolator;
                this.f2037f = true;
            }

            /* renamed from: e */
            public final void m28497e() {
                if (this.f2036e != null && this.f2034c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f2034c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$y$b */
        /* loaded from: classes.dex */
        public interface InterfaceC0408b {
            /* renamed from: a */
            PointF mo28438a(int i);
        }

        /* renamed from: a */
        public PointF m28515a(int i) {
            AbstractC0391o m28511e = m28511e();
            if (m28511e instanceof InterfaceC0408b) {
                return ((InterfaceC0408b) m28511e).mo28438a(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            sb.append(InterfaceC0408b.class.getCanonicalName());
            return null;
        }

        /* renamed from: b */
        public View m28514b(int i) {
            return this.f2025b.f1865B.mo28671C(i);
        }

        /* renamed from: c */
        public int m28513c() {
            return this.f2025b.f1865B.m28658J();
        }

        /* renamed from: d */
        public int m28512d(View view) {
            return this.f2025b.m28832e0(view);
        }

        /* renamed from: e */
        public AbstractC0391o m28511e() {
            return this.f2026c;
        }

        /* renamed from: f */
        public int m28510f() {
            return this.f2024a;
        }

        /* renamed from: g */
        public boolean m28509g() {
            return this.f2027d;
        }

        /* renamed from: h */
        public boolean m28508h() {
            return this.f2028e;
        }

        /* renamed from: i */
        public void m28507i(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* renamed from: j */
        public void m28506j(int i, int i2) {
            PointF m28515a;
            RecyclerView recyclerView = this.f2025b;
            if (this.f2024a == -1 || recyclerView == null) {
                m28502r();
            }
            if (this.f2027d && this.f2029f == null && this.f2026c != null && (m28515a = m28515a(this.f2024a)) != null) {
                float f = m28515a.x;
                if (f != 0.0f || m28515a.y != 0.0f) {
                    recyclerView.m28819i1((int) Math.signum(f), (int) Math.signum(m28515a.y), null);
                }
            }
            this.f2027d = false;
            View view = this.f2029f;
            if (view != null) {
                if (m28512d(view) == this.f2024a) {
                    mo28173o(this.f2029f, recyclerView.f1929w0, this.f2030g);
                    this.f2030g.m28499c(recyclerView);
                    m28502r();
                } else {
                    this.f2029f = null;
                }
            }
            if (this.f2028e) {
                mo28216l(i, i2, recyclerView.f1929w0, this.f2030g);
                boolean m28501a = this.f2030g.m28501a();
                this.f2030g.m28499c(recyclerView);
                if (m28501a && this.f2028e) {
                    this.f2027d = true;
                    recyclerView.f1923t0.m28760e();
                }
            }
        }

        /* renamed from: k */
        public void m28505k(View view) {
            if (m28512d(view) == m28510f()) {
                this.f2029f = view;
            }
        }

        /* renamed from: l */
        public abstract void mo28216l(int i, int i2, C0409z c0409z, C0407a c0407a);

        /* renamed from: m */
        public abstract void mo28215m();

        /* renamed from: n */
        public abstract void mo28214n();

        /* renamed from: o */
        public abstract void mo28173o(View view, C0409z c0409z, C0407a c0407a);

        /* renamed from: p */
        public void m28504p(int i) {
            this.f2024a = i;
        }

        /* renamed from: q */
        public void m28503q(RecyclerView recyclerView, AbstractC0391o abstractC0391o) {
            recyclerView.f1923t0.m28758g();
            if (this.f2031h) {
                StringBuilder sb = new StringBuilder();
                sb.append("An instance of ");
                sb.append(getClass().getSimpleName());
                sb.append(" was started more than once. Each instance of");
                sb.append(getClass().getSimpleName());
                sb.append(" is intended to only be used once. You should create a new instance for each use.");
            }
            this.f2025b = recyclerView;
            this.f2026c = abstractC0391o;
            int i = this.f2024a;
            if (i == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f1929w0.f2039a = i;
            this.f2028e = true;
            this.f2027d = true;
            this.f2029f = m28514b(m28510f());
            mo28215m();
            this.f2025b.f1923t0.m28760e();
            this.f2031h = true;
        }

        /* renamed from: r */
        public final void m28502r() {
            if (this.f2028e) {
                this.f2028e = false;
                mo28214n();
                this.f2025b.f1929w0.f2039a = -1;
                this.f2029f = null;
                this.f2024a = -1;
                this.f2027d = false;
                this.f2026c.m28620f1(this);
                this.f2026c = null;
                this.f2025b = null;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    /* loaded from: classes.dex */
    public static class C0409z {

        /* renamed from: b */
        public SparseArray<Object> f2040b;

        /* renamed from: m */
        public int f2051m;

        /* renamed from: n */
        public long f2052n;

        /* renamed from: o */
        public int f2053o;

        /* renamed from: p */
        public int f2054p;

        /* renamed from: q */
        public int f2055q;

        /* renamed from: a */
        public int f2039a = -1;

        /* renamed from: c */
        public int f2041c = 0;

        /* renamed from: d */
        public int f2042d = 0;

        /* renamed from: e */
        public int f2043e = 1;

        /* renamed from: f */
        public int f2044f = 0;

        /* renamed from: g */
        public boolean f2045g = false;

        /* renamed from: h */
        public boolean f2046h = false;

        /* renamed from: i */
        public boolean f2047i = false;

        /* renamed from: j */
        public boolean f2048j = false;

        /* renamed from: k */
        public boolean f2049k = false;

        /* renamed from: l */
        public boolean f2050l = false;

        /* renamed from: a */
        public void m28496a(int i) {
            if ((this.f2043e & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f2043e));
        }

        /* renamed from: b */
        public int m28495b() {
            return this.f2046h ? this.f2041c - this.f2042d : this.f2044f;
        }

        /* renamed from: c */
        public int m28494c() {
            return this.f2039a;
        }

        /* renamed from: d */
        public boolean m28493d() {
            return this.f2039a != -1;
        }

        /* renamed from: e */
        public boolean m28492e() {
            return this.f2046h;
        }

        /* renamed from: f */
        public void m28491f(AbstractC0380g abstractC0380g) {
            this.f2043e = 1;
            this.f2044f = abstractC0380g.mo497d();
            this.f2046h = false;
            this.f2047i = false;
            this.f2048j = false;
        }

        /* renamed from: g */
        public boolean m28490g() {
            return this.f2050l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f2039a + ", mData=" + this.f2040b + ", mItemCount=" + this.f2044f + ", mIsMeasuring=" + this.f2048j + ", mPreviousLayoutItemCount=" + this.f2041c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2042d + ", mStructureChanged=" + this.f2045g + ", mInPreLayout=" + this.f2046h + ", mRunSimpleAnimations=" + this.f2049k + ", mRunPredictiveAnimations=" + this.f2050l + '}';
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f1855O0 = i == 19 || i == 20;
        f1856P0 = i >= 23;
        f1857Q0 = true;
        f1858R0 = i >= 21;
        f1859S0 = false;
        f1860T0 = false;
        Class<?> cls = Integer.TYPE;
        f1861U0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f1862V0 = new animationInterpolatorC0375c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, v01.recyclerViewStyle);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1914p = new C0405x();
        this.f1916q = new C0403v();
        this.f1924u = new C0460p();
        this.f1928w = new RunnableC0371a();
        this.f1930x = new Rect();
        this.f1932y = new Rect();
        this.f1934z = new RectF();
        this.f1869D = new ArrayList<>();
        this.f1871E = new ArrayList<>();
        this.f1883K = 0;
        this.f1894S = false;
        this.f1895T = false;
        this.f1896U = 0;
        this.f1897V = 0;
        this.f1898W = new C0384k();
        this.f1903e0 = new C0422c();
        this.f1904f0 = 0;
        this.f1905g0 = -1;
        this.f1917q0 = Float.MIN_VALUE;
        this.f1919r0 = Float.MIN_VALUE;
        boolean z = true;
        this.f1921s0 = true;
        this.f1923t0 = new RunnableC0374b0();
        this.f1927v0 = f1858R0 ? new RunnableC0438e.C0440b() : null;
        this.f1929w0 = new C0409z();
        this.f1935z0 = false;
        this.f1864A0 = false;
        this.f1866B0 = new C0389m();
        this.f1868C0 = false;
        this.f1874F0 = new int[2];
        this.f1878H0 = new int[2];
        this.f1880I0 = new int[2];
        this.f1882J0 = new int[2];
        this.f1884K0 = new ArrayList();
        this.f1886L0 = new RunnableC0373b();
        this.f1888M0 = new C0377d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1911m0 = viewConfiguration.getScaledTouchSlop();
        this.f1917q0 = zs1.m1952b(viewConfiguration, context);
        this.f1919r0 = zs1.m1950d(viewConfiguration, context);
        this.f1913o0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1915p0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f1903e0.m28685v(this.f1866B0);
        m28799p0();
        m28793r0();
        m28796q0();
        if (xs1.m4772C(this) == 0) {
            xs1.m4773B0(this, 1);
        }
        this.f1892Q = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0451k(this));
        int[] iArr = t21.f26928f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        }
        String string = obtainStyledAttributes.getString(t21.f26937o);
        if (obtainStyledAttributes.getInt(t21.f26931i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f1926v = obtainStyledAttributes.getBoolean(t21.f26930h, true);
        boolean z2 = obtainStyledAttributes.getBoolean(t21.f26932j, false);
        this.f1879I = z2;
        if (z2) {
            m28790s0((StateListDrawable) obtainStyledAttributes.getDrawable(t21.f26935m), obtainStyledAttributes.getDrawable(t21.f26936n), (StateListDrawable) obtainStyledAttributes.getDrawable(t21.f26933k), obtainStyledAttributes.getDrawable(t21.f26934l));
        }
        obtainStyledAttributes.recycle();
        m28782v(context, string, attributeSet, i, 0);
        if (i2 >= 21) {
            int[] iArr2 = f1854N0;
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
            if (i2 >= 29) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
            }
            z = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z);
    }

    /* renamed from: V */
    public static RecyclerView m28854V(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView m28854V = m28854V(viewGroup.getChildAt(i));
                if (m28854V != null) {
                    return m28854V;
                }
            }
            return null;
        }
        return null;
    }

    private fs0 getScrollingChildHelper() {
        if (this.f1876G0 == null) {
            this.f1876G0 = new fs0(this);
        }
        return this.f1876G0;
    }

    /* renamed from: h0 */
    public static AbstractC0376c0 m28823h0(View view) {
        if (view == null) {
            return null;
        }
        return ((C0396p) view.getLayoutParams()).f2005a;
    }

    /* renamed from: i0 */
    public static void m28820i0(View view, Rect rect) {
        C0396p c0396p = (C0396p) view.getLayoutParams();
        Rect rect2 = c0396p.f2006b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0396p).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0396p).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0396p).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0396p).bottomMargin);
    }

    /* renamed from: r */
    public static void m28794r(AbstractC0376c0 abstractC0376c0) {
        WeakReference<RecyclerView> weakReference = abstractC0376c0.f1948b;
        if (weakReference != null) {
            ViewParent viewParent = weakReference.get();
            while (true) {
                for (View view = (View) viewParent; view != null; view = null) {
                    if (view == abstractC0376c0.f1947a) {
                        return;
                    }
                    viewParent = view.getParent();
                    if (viewParent instanceof View) {
                        break;
                    }
                }
                abstractC0376c0.f1948b = null;
                return;
            }
        }
    }

    /* renamed from: A */
    public final void m28896A() {
        int i = this.f1890O;
        this.f1890O = 0;
        if (i == 0 || !m28781v0()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        C3487x.m5675b(obtain, i);
        sendAccessibilityEventUnchecked(obtain);
    }

    /* renamed from: A0 */
    public void m28895A0() {
        int m28303j = this.f1922t.m28303j();
        for (int i = 0; i < m28303j; i++) {
            AbstractC0376c0 m28823h0 = m28823h0(this.f1922t.m28304i(i));
            if (m28823h0 != null && !m28823h0.m28746L()) {
                m28823h0.m28742d(6);
            }
        }
        m28769z0();
        this.f1916q.m28525t();
    }

    /* renamed from: B */
    public void m28894B() {
        if (this.f1863A == null || this.f1865B == null) {
            return;
        }
        C0409z c0409z = this.f1929w0;
        c0409z.f2048j = false;
        if (c0409z.f2043e == 1) {
            m28892C();
        } else if (!this.f1920s.m28328q() && this.f1865B.m28600o0() == getWidth() && this.f1865B.m28638W() == getHeight()) {
            this.f1865B.m28576z1(this);
            m28888E();
        }
        this.f1865B.m28576z1(this);
        m28890D();
        m28888E();
    }

    /* renamed from: B0 */
    public void m28893B0(int i) {
        int m28306g = this.f1922t.m28306g();
        for (int i2 = 0; i2 < m28306g; i2++) {
            this.f1922t.m28307f(i2).offsetLeftAndRight(i);
        }
    }

    /* renamed from: C */
    public final void m28892C() {
        boolean z = true;
        this.f1929w0.m28496a(1);
        m28864Q(this.f1929w0);
        this.f1929w0.f2048j = false;
        m28789s1();
        this.f1924u.m28111f();
        m28879I0();
        m28863Q0();
        m28828f1();
        C0409z c0409z = this.f1929w0;
        c0409z.f2047i = (c0409z.f2049k && this.f1864A0) ? false : false;
        this.f1864A0 = false;
        this.f1935z0 = false;
        c0409z.f2046h = c0409z.f2050l;
        c0409z.f2044f = this.f1863A.mo497d();
        m28856U(this.f1874F0);
        if (this.f1929w0.f2049k) {
            int m28306g = this.f1922t.m28306g();
            for (int i = 0; i < m28306g; i++) {
                AbstractC0376c0 m28823h0 = m28823h0(this.f1922t.m28307f(i));
                if (!m28823h0.m28746L() && (!m28823h0.m28724v() || this.f1863A.m28715h())) {
                    this.f1924u.m28112e(m28823h0, this.f1903e0.m28686t(this.f1929w0, m28823h0, AbstractC0385l.m28696e(m28823h0), m28823h0.m28729q()));
                    if (this.f1929w0.f2047i && m28823h0.m28757A() && !m28823h0.m28722x() && !m28823h0.m28746L() && !m28823h0.m28724v()) {
                        this.f1924u.m28114c(m28838c0(m28823h0), m28823h0);
                    }
                }
            }
        }
        if (this.f1929w0.f2050l) {
            m28825g1();
            C0409z c0409z2 = this.f1929w0;
            boolean z2 = c0409z2.f2045g;
            c0409z2.f2045g = false;
            this.f1865B.mo28443X0(this.f1916q, c0409z2);
            this.f1929w0.f2045g = z2;
            for (int i2 = 0; i2 < this.f1922t.m28306g(); i2++) {
                AbstractC0376c0 m28823h02 = m28823h0(this.f1922t.m28307f(i2));
                if (!m28823h02.m28746L() && !this.f1924u.m28108i(m28823h02)) {
                    int m28696e = AbstractC0385l.m28696e(m28823h02);
                    boolean m28728r = m28823h02.m28728r(8192);
                    if (!m28728r) {
                        m28696e |= 4096;
                    }
                    AbstractC0385l.C0388c m28686t = this.f1903e0.m28686t(this.f1929w0, m28823h02, m28696e, m28823h02.m28729q());
                    if (m28728r) {
                        m28857T0(m28823h02, m28686t);
                    } else {
                        this.f1924u.m28116a(m28823h02, m28686t);
                    }
                }
            }
        }
        m28791s();
        m28877J0();
        m28783u1(false);
        this.f1929w0.f2043e = 2;
    }

    /* renamed from: C0 */
    public void m28891C0(int i) {
        int m28306g = this.f1922t.m28306g();
        for (int i2 = 0; i2 < m28306g; i2++) {
            this.f1922t.m28307f(i2).offsetTopAndBottom(i);
        }
    }

    /* renamed from: D */
    public final void m28890D() {
        m28789s1();
        m28879I0();
        this.f1929w0.m28496a(6);
        this.f1920s.m28335j();
        this.f1929w0.f2044f = this.f1863A.mo497d();
        C0409z c0409z = this.f1929w0;
        c0409z.f2042d = 0;
        c0409z.f2046h = false;
        this.f1865B.mo28443X0(this.f1916q, c0409z);
        C0409z c0409z2 = this.f1929w0;
        c0409z2.f2045g = false;
        this.f1918r = null;
        c0409z2.f2049k = c0409z2.f2049k && this.f1903e0 != null;
        c0409z2.f2043e = 4;
        m28877J0();
        m28783u1(false);
    }

    /* renamed from: D0 */
    public void m28889D0(int i, int i2) {
        int m28303j = this.f1922t.m28303j();
        for (int i3 = 0; i3 < m28303j; i3++) {
            AbstractC0376c0 m28823h0 = m28823h0(this.f1922t.m28304i(i3));
            if (m28823h0 != null && !m28823h0.m28746L() && m28823h0.f1949c >= i) {
                m28823h0.m28755C(i2, false);
                this.f1929w0.f2045g = true;
            }
        }
        this.f1916q.m28524u(i, i2);
        requestLayout();
    }

    /* renamed from: E */
    public final void m28888E() {
        this.f1929w0.m28496a(4);
        m28789s1();
        m28879I0();
        C0409z c0409z = this.f1929w0;
        c0409z.f2043e = 1;
        if (c0409z.f2049k) {
            for (int m28306g = this.f1922t.m28306g() - 1; m28306g >= 0; m28306g--) {
                AbstractC0376c0 m28823h0 = m28823h0(this.f1922t.m28307f(m28306g));
                if (!m28823h0.m28746L()) {
                    long m28838c0 = m28838c0(m28823h0);
                    AbstractC0385l.C0388c m28687s = this.f1903e0.m28687s(this.f1929w0, m28823h0);
                    AbstractC0376c0 m28110g = this.f1924u.m28110g(m28838c0);
                    if (m28110g != null && !m28110g.m28746L()) {
                        boolean m28109h = this.f1924u.m28109h(m28110g);
                        boolean m28109h2 = this.f1924u.m28109h(m28823h0);
                        if (!m28109h || m28110g != m28823h0) {
                            AbstractC0385l.C0388c m28103n = this.f1924u.m28103n(m28110g);
                            this.f1924u.m28113d(m28823h0, m28687s);
                            AbstractC0385l.C0388c m28104m = this.f1924u.m28104m(m28823h0);
                            if (m28103n == null) {
                                m28808m0(m28838c0, m28823h0, m28110g);
                            } else {
                                m28809m(m28110g, m28823h0, m28103n, m28104m, m28109h, m28109h2);
                            }
                        }
                    }
                    this.f1924u.m28113d(m28823h0, m28687s);
                }
            }
            this.f1924u.m28102o(this.f1888M0);
        }
        this.f1865B.m28606l1(this.f1916q);
        C0409z c0409z2 = this.f1929w0;
        c0409z2.f2041c = c0409z2.f2044f;
        this.f1894S = false;
        this.f1895T = false;
        c0409z2.f2049k = false;
        c0409z2.f2050l = false;
        this.f1865B.f1988h = false;
        ArrayList<AbstractC0376c0> arrayList = this.f1916q.f2016b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC0391o abstractC0391o = this.f1865B;
        if (abstractC0391o.f1994n) {
            abstractC0391o.f1993m = 0;
            abstractC0391o.f1994n = false;
            this.f1916q.m28547K();
        }
        this.f1865B.mo28441Y0(this.f1929w0);
        m28877J0();
        m28783u1(false);
        this.f1924u.m28111f();
        int[] iArr = this.f1874F0;
        if (m28776x(iArr[0], iArr[1])) {
            m28880I(0, 0);
        }
        m28855U0();
        m28834d1();
    }

    /* renamed from: E0 */
    public void m28887E0(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int m28303j = this.f1922t.m28303j();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i7 = 0; i7 < m28303j; i7++) {
            AbstractC0376c0 m28823h0 = m28823h0(this.f1922t.m28304i(i7));
            if (m28823h0 != null && (i6 = m28823h0.f1949c) >= i4 && i6 <= i3) {
                if (i6 == i) {
                    m28823h0.m28755C(i2 - i, false);
                } else {
                    m28823h0.m28755C(i5, false);
                }
                this.f1929w0.f2045g = true;
            }
        }
        this.f1916q.m28523v(i, i2);
        requestLayout();
    }

    /* renamed from: F */
    public boolean m28886F(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().m22351d(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: F0 */
    public void m28885F0(int i, int i2, boolean z) {
        int i3 = i + i2;
        int m28303j = this.f1922t.m28303j();
        for (int i4 = 0; i4 < m28303j; i4++) {
            AbstractC0376c0 m28823h0 = m28823h0(this.f1922t.m28304i(i4));
            if (m28823h0 != null && !m28823h0.m28746L()) {
                int i5 = m28823h0.f1949c;
                if (i5 >= i3) {
                    m28823h0.m28755C(-i2, z);
                } else if (i5 >= i) {
                    m28823h0.m28735k(i - 1, -i2, z);
                }
                this.f1929w0.f2045g = true;
            }
        }
        this.f1916q.m28522w(i, i2, z);
        requestLayout();
    }

    /* renamed from: G */
    public final void m28884G(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m22350e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: G0 */
    public void m28883G0(View view) {
    }

    /* renamed from: H */
    public void m28882H(int i) {
        AbstractC0391o abstractC0391o = this.f1865B;
        if (abstractC0391o != null) {
            abstractC0391o.mo28431e1(i);
        }
        m28871M0(i);
        AbstractC0400t abstractC0400t = this.f1931x0;
        if (abstractC0400t != null) {
            abstractC0400t.mo552a(this, i);
        }
        List<AbstractC0400t> list = this.f1933y0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f1933y0.get(size).mo552a(this, i);
            }
        }
    }

    /* renamed from: H0 */
    public void m28881H0(View view) {
    }

    /* renamed from: I */
    public void m28880I(int i, int i2) {
        this.f1897V++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        m28869N0(i, i2);
        AbstractC0400t abstractC0400t = this.f1931x0;
        if (abstractC0400t != null) {
            abstractC0400t.mo551b(this, i, i2);
        }
        List<AbstractC0400t> list = this.f1933y0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f1933y0.get(size).mo551b(this, i, i2);
            }
        }
        this.f1897V--;
    }

    /* renamed from: I0 */
    public void m28879I0() {
        this.f1896U++;
    }

    /* renamed from: J */
    public void m28878J() {
        int i;
        for (int size = this.f1884K0.size() - 1; size >= 0; size--) {
            AbstractC0376c0 abstractC0376c0 = this.f1884K0.get(size);
            if (abstractC0376c0.f1947a.getParent() == this && !abstractC0376c0.m28746L() && (i = abstractC0376c0.f1963q) != -1) {
                xs1.m4773B0(abstractC0376c0.f1947a, i);
                abstractC0376c0.f1963q = -1;
            }
        }
        this.f1884K0.clear();
    }

    /* renamed from: J0 */
    public void m28877J0() {
        m28875K0(true);
    }

    /* renamed from: K */
    public final boolean m28876K(MotionEvent motionEvent) {
        InterfaceC0399s interfaceC0399s = this.f1873F;
        if (interfaceC0399s == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return m28858T(motionEvent);
        }
        interfaceC0399s.mo16524a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f1873F = null;
        }
        return true;
    }

    /* renamed from: K0 */
    public void m28875K0(boolean z) {
        int i = this.f1896U - 1;
        this.f1896U = i;
        if (i < 1) {
            this.f1896U = 0;
            if (z) {
                m28896A();
                m28878J();
            }
        }
    }

    /* renamed from: L */
    public void m28874L() {
        int measuredWidth;
        int measuredHeight;
        if (this.f1902d0 != null) {
            return;
        }
        EdgeEffect m28697a = this.f1898W.m28697a(this, 3);
        this.f1902d0 = m28697a;
        if (this.f1926v) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        m28697a.setSize(measuredWidth, measuredHeight);
    }

    /* renamed from: L0 */
    public final void m28873L0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1905g0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1905g0 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f1909k0 = x;
            this.f1907i0 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f1910l0 = y;
            this.f1908j0 = y;
        }
    }

    /* renamed from: M */
    public void m28872M() {
        int measuredHeight;
        int measuredWidth;
        if (this.f1899a0 != null) {
            return;
        }
        EdgeEffect m28697a = this.f1898W.m28697a(this, 0);
        this.f1899a0 = m28697a;
        if (this.f1926v) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        m28697a.setSize(measuredHeight, measuredWidth);
    }

    /* renamed from: M0 */
    public void m28871M0(int i) {
    }

    /* renamed from: N */
    public void m28870N() {
        int measuredHeight;
        int measuredWidth;
        if (this.f1901c0 != null) {
            return;
        }
        EdgeEffect m28697a = this.f1898W.m28697a(this, 2);
        this.f1901c0 = m28697a;
        if (this.f1926v) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        m28697a.setSize(measuredHeight, measuredWidth);
    }

    /* renamed from: N0 */
    public void m28869N0(int i, int i2) {
    }

    /* renamed from: O */
    public void m28868O() {
        int measuredWidth;
        int measuredHeight;
        if (this.f1900b0 != null) {
            return;
        }
        EdgeEffect m28697a = this.f1898W.m28697a(this, 1);
        this.f1900b0 = m28697a;
        if (this.f1926v) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        m28697a.setSize(measuredWidth, measuredHeight);
    }

    /* renamed from: O0 */
    public void m28867O0() {
        if (this.f1868C0 || !this.f1875G) {
            return;
        }
        xs1.m4718j0(this, this.f1886L0);
        this.f1868C0 = true;
    }

    /* renamed from: P */
    public String m28866P() {
        return " " + super.toString() + ", adapter:" + this.f1863A + ", layout:" + this.f1865B + ", context:" + getContext();
    }

    /* renamed from: P0 */
    public final boolean m28865P0() {
        return this.f1903e0 != null && this.f1865B.mo28469L1();
    }

    /* renamed from: Q */
    public final void m28864Q(C0409z c0409z) {
        if (getScrollState() != 2) {
            c0409z.f2054p = 0;
            c0409z.f2055q = 0;
            return;
        }
        OverScroller overScroller = this.f1923t0.f1941r;
        c0409z.f2054p = overScroller.getFinalX() - overScroller.getCurrX();
        c0409z.f2055q = overScroller.getFinalY() - overScroller.getCurrY();
    }

    /* renamed from: Q0 */
    public final void m28863Q0() {
        boolean z;
        if (this.f1894S) {
            this.f1920s.m28323v();
            if (this.f1895T) {
                this.f1865B.mo28452S0(this);
            }
        }
        if (m28865P0()) {
            this.f1920s.m28325t();
        } else {
            this.f1920s.m28335j();
        }
        boolean z2 = false;
        boolean z3 = this.f1935z0 || this.f1864A0;
        this.f1929w0.f2049k = this.f1881J && this.f1903e0 != null && ((z = this.f1894S) || z3 || this.f1865B.f1988h) && (!z || this.f1863A.m28715h());
        C0409z c0409z = this.f1929w0;
        if (c0409z.f2049k && z3 && !this.f1894S && m28865P0()) {
            z2 = true;
        }
        c0409z.f2050l = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View m28862R(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == null || parent == this || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return null;
    }

    /* renamed from: R0 */
    public void m28861R0(boolean z) {
        this.f1895T = z | this.f1895T;
        this.f1894S = true;
        m28895A0();
    }

    /* renamed from: S */
    public AbstractC0376c0 m28860S(View view) {
        View m28862R = m28862R(view);
        if (m28862R == null) {
            return null;
        }
        return m28826g0(m28862R);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* renamed from: S0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m28859S0(float f, float f2, float f3, float f4) {
        boolean z;
        EdgeEffect edgeEffect;
        float width;
        float height;
        boolean z2 = true;
        if (f2 < 0.0f) {
            m28872M();
            edgeEffect = this.f1899a0;
            width = (-f2) / getWidth();
            height = 1.0f - (f3 / getHeight());
        } else if (f2 <= 0.0f) {
            z = false;
            if (f4 >= 0.0f) {
                m28868O();
                C2759qv.m12138c(this.f1900b0, (-f4) / getHeight(), f / getWidth());
            } else if (f4 > 0.0f) {
                m28874L();
                C2759qv.m12138c(this.f1902d0, f4 / getHeight(), 1.0f - (f / getWidth()));
            } else {
                z2 = z;
            }
            if (z2 && f2 == 0.0f && f4 == 0.0f) {
                return;
            }
            xs1.m4720i0(this);
        } else {
            m28870N();
            edgeEffect = this.f1901c0;
            width = f2 / getWidth();
            height = f3 / getHeight();
        }
        C2759qv.m12138c(edgeEffect, width, height);
        z = true;
        if (f4 >= 0.0f) {
        }
        if (z2) {
        }
        xs1.m4720i0(this);
    }

    /* renamed from: T */
    public final boolean m28858T(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f1871E.size();
        for (int i = 0; i < size; i++) {
            InterfaceC0399s interfaceC0399s = this.f1871E.get(i);
            if (interfaceC0399s.mo16523b(this, motionEvent) && action != 3) {
                this.f1873F = interfaceC0399s;
                return true;
            }
        }
        return false;
    }

    /* renamed from: T0 */
    public void m28857T0(AbstractC0376c0 abstractC0376c0, AbstractC0385l.C0388c c0388c) {
        abstractC0376c0.m28750H(0, 8192);
        if (this.f1929w0.f2047i && abstractC0376c0.m28757A() && !abstractC0376c0.m28722x() && !abstractC0376c0.m28746L()) {
            this.f1924u.m28114c(m28838c0(abstractC0376c0), abstractC0376c0);
        }
        this.f1924u.m28112e(abstractC0376c0, c0388c);
    }

    /* renamed from: U */
    public final void m28856U(int[] iArr) {
        int m28306g = this.f1922t.m28306g();
        if (m28306g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < m28306g; i3++) {
            AbstractC0376c0 m28823h0 = m28823h0(this.f1922t.m28307f(i3));
            if (!m28823h0.m28746L()) {
                int m28731o = m28823h0.m28731o();
                if (m28731o < i) {
                    i = m28731o;
                }
                if (m28731o > i2) {
                    i2 = m28731o;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: U0 */
    public final void m28855U0() {
        View findViewById;
        if (!this.f1921s0 || this.f1863A == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!f1860T0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f1922t.m28299n(focusedChild)) {
                    return;
                }
            } else if (this.f1922t.m28306g() == 0) {
                requestFocus();
                return;
            }
        }
        View view = null;
        AbstractC0376c0 m28848Y = (this.f1929w0.f2052n == -1 || !this.f1863A.m28715h()) ? null : m28848Y(this.f1929w0.f2052n);
        if (m28848Y != null && !this.f1922t.m28299n(m28848Y.f1947a) && m28848Y.f1947a.hasFocusable()) {
            view = m28848Y.f1947a;
        } else if (this.f1922t.m28306g() > 0) {
            view = m28852W();
        }
        if (view != null) {
            int i = this.f1929w0.f2053o;
            if (i != -1 && (findViewById = view.findViewById(i)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    /* renamed from: V0 */
    public final void m28853V0() {
        boolean z;
        EdgeEffect edgeEffect = this.f1899a0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f1899a0.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f1900b0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f1900b0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1901c0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f1901c0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1902d0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f1902d0.isFinished();
        }
        if (z) {
            xs1.m4720i0(this);
        }
    }

    /* renamed from: W */
    public final View m28852W() {
        AbstractC0376c0 m28850X;
        C0409z c0409z = this.f1929w0;
        int i = c0409z.f2051m;
        if (i == -1) {
            i = 0;
        }
        int m28495b = c0409z.m28495b();
        for (int i2 = i; i2 < m28495b; i2++) {
            AbstractC0376c0 m28850X2 = m28850X(i2);
            if (m28850X2 == null) {
                break;
            } else if (m28850X2.f1947a.hasFocusable()) {
                return m28850X2.f1947a;
            }
        }
        int min = Math.min(m28495b, i);
        while (true) {
            min--;
            if (min < 0 || (m28850X = m28850X(min)) == null) {
                return null;
            }
            if (m28850X.f1947a.hasFocusable()) {
                return m28850X.f1947a;
            }
        }
    }

    /* renamed from: W0 */
    public void m28851W0() {
        AbstractC0385l abstractC0385l = this.f1903e0;
        if (abstractC0385l != null) {
            abstractC0385l.mo28261k();
        }
        AbstractC0391o abstractC0391o = this.f1865B;
        if (abstractC0391o != null) {
            abstractC0391o.m28608k1(this.f1916q);
            this.f1865B.m28606l1(this.f1916q);
        }
        this.f1916q.m28542c();
    }

    /* renamed from: X */
    public AbstractC0376c0 m28850X(int i) {
        AbstractC0376c0 abstractC0376c0 = null;
        if (this.f1894S) {
            return null;
        }
        int m28303j = this.f1922t.m28303j();
        for (int i2 = 0; i2 < m28303j; i2++) {
            AbstractC0376c0 m28823h0 = m28823h0(this.f1922t.m28304i(i2));
            if (m28823h0 != null && !m28823h0.m28722x() && m28841b0(m28823h0) == i) {
                if (!this.f1922t.m28299n(m28823h0.f1947a)) {
                    return m28823h0;
                }
                abstractC0376c0 = m28823h0;
            }
        }
        return abstractC0376c0;
    }

    /* renamed from: X0 */
    public boolean m28849X0(View view) {
        m28789s1();
        boolean m28295r = this.f1922t.m28295r(view);
        if (m28295r) {
            AbstractC0376c0 m28823h0 = m28823h0(view);
            this.f1916q.m28548J(m28823h0);
            this.f1916q.m28555C(m28823h0);
        }
        m28783u1(!m28295r);
        return m28295r;
    }

    /* renamed from: Y */
    public AbstractC0376c0 m28848Y(long j) {
        AbstractC0380g abstractC0380g = this.f1863A;
        AbstractC0376c0 abstractC0376c0 = null;
        if (abstractC0380g != null && abstractC0380g.m28715h()) {
            int m28303j = this.f1922t.m28303j();
            for (int i = 0; i < m28303j; i++) {
                AbstractC0376c0 m28823h0 = m28823h0(this.f1922t.m28304i(i));
                if (m28823h0 != null && !m28823h0.m28722x() && m28823h0.m28733m() == j) {
                    if (!this.f1922t.m28299n(m28823h0.f1947a)) {
                        return m28823h0;
                    }
                    abstractC0376c0 = m28823h0;
                }
            }
        }
        return abstractC0376c0;
    }

    /* renamed from: Y0 */
    public void m28847Y0(AbstractC0390n abstractC0390n) {
        AbstractC0391o abstractC0391o = this.f1865B;
        if (abstractC0391o != null) {
            abstractC0391o.mo28428g("Cannot remove item decoration during a scroll  or layout");
        }
        this.f1869D.remove(abstractC0390n);
        if (this.f1869D.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        m28769z0();
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036 A[SYNTHETIC] */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC0376c0 m28846Z(int i, boolean z) {
        int m28303j = this.f1922t.m28303j();
        AbstractC0376c0 abstractC0376c0 = null;
        for (int i2 = 0; i2 < m28303j; i2++) {
            AbstractC0376c0 m28823h0 = m28823h0(this.f1922t.m28304i(i2));
            if (m28823h0 != null && !m28823h0.m28722x()) {
                if (z) {
                    if (m28823h0.f1949c != i) {
                        continue;
                    }
                    if (this.f1922t.m28299n(m28823h0.f1947a)) {
                        return m28823h0;
                    }
                    abstractC0376c0 = m28823h0;
                } else {
                    if (m28823h0.m28731o() != i) {
                        continue;
                    }
                    if (this.f1922t.m28299n(m28823h0.f1947a)) {
                    }
                }
            }
        }
        return abstractC0376c0;
    }

    /* renamed from: Z0 */
    public void m28845Z0(InterfaceC0399s interfaceC0399s) {
        this.f1871E.remove(interfaceC0399s);
        if (this.f1873F == interfaceC0399s) {
            this.f1873F = null;
        }
    }

    /* renamed from: a */
    public void m28844a(int i, int i2) {
        if (i < 0) {
            m28872M();
            if (this.f1899a0.isFinished()) {
                this.f1899a0.onAbsorb(-i);
            }
        } else if (i > 0) {
            m28870N();
            if (this.f1901c0.isFinished()) {
                this.f1901c0.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            m28868O();
            if (this.f1900b0.isFinished()) {
                this.f1900b0.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            m28874L();
            if (this.f1902d0.isFinished()) {
                this.f1902d0.onAbsorb(i2);
            }
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        xs1.m4720i0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: a0 */
    public boolean m28843a0(int i, int i2) {
        AbstractC0391o abstractC0391o = this.f1865B;
        if (abstractC0391o == null || this.f1887M) {
            return false;
        }
        int mo28423k = abstractC0391o.mo28423k();
        boolean mo28420l = this.f1865B.mo28420l();
        i = (mo28423k == 0 || Math.abs(i) < this.f1913o0) ? 0 : 0;
        i2 = (!mo28420l || Math.abs(i2) < this.f1913o0) ? 0 : 0;
        if (i == 0 && i2 == 0) {
            return false;
        }
        float f = i;
        float f2 = i2;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = mo28423k != 0 || mo28420l;
            dispatchNestedFling(f, f2, z);
            AbstractC0398r abstractC0398r = this.f1912n0;
            if (abstractC0398r != null && abstractC0398r.mo28139a(i, i2)) {
                return true;
            }
            if (z) {
                if (mo28420l) {
                    mo28423k = (mo28423k == true ? 1 : 0) | 2;
                }
                m28786t1(mo28423k, 1);
                int i3 = this.f1915p0;
                int max = Math.max(-i3, Math.min(i, i3));
                int i4 = this.f1915p0;
                this.f1923t0.m28762c(max, Math.max(-i4, Math.min(i2, i4)));
                return true;
            }
        }
        return false;
    }

    /* renamed from: a1 */
    public void m28842a1(AbstractC0400t abstractC0400t) {
        List<AbstractC0400t> list = this.f1933y0;
        if (list != null) {
            list.remove(abstractC0400t);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        AbstractC0391o abstractC0391o = this.f1865B;
        if (abstractC0391o == null || !abstractC0391o.m28667F0(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* renamed from: b0 */
    public int m28841b0(AbstractC0376c0 abstractC0376c0) {
        if (abstractC0376c0.m28728r(524) || !abstractC0376c0.m28725u()) {
            return -1;
        }
        return this.f1920s.m28340e(abstractC0376c0.f1949c);
    }

    /* renamed from: b1 */
    public void m28840b1() {
        AbstractC0376c0 abstractC0376c0;
        int m28306g = this.f1922t.m28306g();
        for (int i = 0; i < m28306g; i++) {
            View m28307f = this.f1922t.m28307f(i);
            AbstractC0376c0 m28826g0 = m28826g0(m28307f);
            if (m28826g0 != null && (abstractC0376c0 = m28826g0.f1955i) != null) {
                View view = abstractC0376c0.f1947a;
                int left = m28307f.getLeft();
                int top = m28307f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* renamed from: c0 */
    public long m28838c0(AbstractC0376c0 abstractC0376c0) {
        return this.f1863A.m28715h() ? abstractC0376c0.m28733m() : abstractC0376c0.f1949c;
    }

    /* renamed from: c1 */
    public final void m28837c1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f1930x.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0396p) {
            C0396p c0396p = (C0396p) layoutParams;
            if (!c0396p.f2007c) {
                Rect rect = c0396p.f2006b;
                Rect rect2 = this.f1930x;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f1930x);
            offsetRectIntoDescendantCoords(view, this.f1930x);
        }
        this.f1865B.m28591s1(this, view, this.f1930x, !this.f1881J, view2 == null);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0396p) && this.f1865B.mo28418m((C0396p) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        AbstractC0391o abstractC0391o = this.f1865B;
        if (abstractC0391o != null && abstractC0391o.mo28423k()) {
            return this.f1865B.mo28412q(this.f1929w0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        AbstractC0391o abstractC0391o = this.f1865B;
        if (abstractC0391o != null && abstractC0391o.mo28423k()) {
            return this.f1865B.mo28410r(this.f1929w0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        AbstractC0391o abstractC0391o = this.f1865B;
        if (abstractC0391o != null && abstractC0391o.mo28423k()) {
            return this.f1865B.mo28408s(this.f1929w0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        AbstractC0391o abstractC0391o = this.f1865B;
        if (abstractC0391o != null && abstractC0391o.mo28420l()) {
            return this.f1865B.mo28405t(this.f1929w0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        AbstractC0391o abstractC0391o = this.f1865B;
        if (abstractC0391o != null && abstractC0391o.mo28420l()) {
            return this.f1865B.mo28403u(this.f1929w0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        AbstractC0391o abstractC0391o = this.f1865B;
        if (abstractC0391o != null && abstractC0391o.mo28420l()) {
            return this.f1865B.mo28401v(this.f1929w0);
        }
        return 0;
    }

    /* renamed from: d0 */
    public int m28835d0(View view) {
        AbstractC0376c0 m28823h0 = m28823h0(view);
        if (m28823h0 != null) {
            return m28823h0.m28734l();
        }
        return -1;
    }

    /* renamed from: d1 */
    public final void m28834d1() {
        C0409z c0409z = this.f1929w0;
        c0409z.f2052n = -1L;
        c0409z.f2051m = -1;
        c0409z.f2053o = -1;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m22354a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m22353b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m22352c(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m22349f(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        float f;
        int i;
        super.draw(canvas);
        int size = this.f1869D.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.f1869D.get(i2).mo16520i(canvas, this, this.f1929w0);
        }
        EdgeEffect edgeEffect = this.f1899a0;
        boolean z3 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f1926v ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f1899a0;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f1900b0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f1926v) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1900b0;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f1901c0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1926v ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f1901c0;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f1902d0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1926v) {
                f = (-getWidth()) + getPaddingRight();
                i = (-getHeight()) + getPaddingBottom();
            } else {
                f = -getWidth();
                i = -getHeight();
            }
            canvas.translate(f, i);
            EdgeEffect edgeEffect8 = this.f1902d0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || this.f1903e0 == null || this.f1869D.size() <= 0 || !this.f1903e0.mo28260p()) {
            z3 = z;
        }
        if (z3) {
            xs1.m4720i0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: e0 */
    public int m28832e0(View view) {
        AbstractC0376c0 m28823h0 = m28823h0(view);
        if (m28823h0 != null) {
            return m28823h0.m28731o();
        }
        return -1;
    }

    /* renamed from: e1 */
    public final void m28831e1() {
        VelocityTracker velocityTracker = this.f1906h0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        m28780v1(0);
        m28853V0();
    }

    @Deprecated
    /* renamed from: f0 */
    public int m28829f0(View view) {
        return m28835d0(view);
    }

    /* renamed from: f1 */
    public final void m28828f1() {
        View focusedChild = (this.f1921s0 && hasFocus() && this.f1863A != null) ? getFocusedChild() : null;
        AbstractC0376c0 m28860S = focusedChild != null ? m28860S(focusedChild) : null;
        if (m28860S == null) {
            m28834d1();
            return;
        }
        this.f1929w0.f2052n = this.f1863A.m28715h() ? m28860S.m28733m() : -1L;
        this.f1929w0.f2051m = this.f1894S ? -1 : m28860S.m28722x() ? m28860S.f1950d : m28860S.m28734l();
        this.f1929w0.f2053o = m28817j0(m28860S.f1947a);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View m28645Q0 = this.f1865B.m28645Q0(view, i);
        if (m28645Q0 != null) {
            return m28645Q0;
        }
        boolean z2 = (this.f1863A == null || this.f1865B == null || m28778w0() || this.f1887M) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z2 && (i == 2 || i == 1)) {
            if (this.f1865B.mo28420l()) {
                int i2 = i == 2 ? 130 : 33;
                z = focusFinder.findNextFocus(this, view, i2) == null;
                if (f1859S0) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.f1865B.mo28423k()) {
                int i3 = (this.f1865B.m28635Z() == 1) ^ (i == 2) ? 66 : 17;
                boolean z3 = focusFinder.findNextFocus(this, view, i3) == null;
                if (f1859S0) {
                    i = i3;
                }
                z = z3;
            }
            if (z) {
                m28785u();
                if (m28862R(view) == null) {
                    return null;
                }
                m28789s1();
                this.f1865B.mo28473J0(view, i, this.f1916q, this.f1929w0);
                m28783u1(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i);
            if (findNextFocus == null && z2) {
                m28785u();
                if (m28862R(view) == null) {
                    return null;
                }
                m28789s1();
                view2 = this.f1865B.mo28473J0(view, i, this.f1916q, this.f1929w0);
                m28783u1(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return m28775x0(view, view2, i) ? view2 : super.focusSearch(view, i);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        } else {
            m28837c1(view2, null);
            return view;
        }
    }

    /* renamed from: g */
    public final void m28827g(AbstractC0376c0 abstractC0376c0) {
        View view = abstractC0376c0.f1947a;
        boolean z = view.getParent() == this;
        this.f1916q.m28548J(m28826g0(view));
        if (abstractC0376c0.m28720z()) {
            this.f1922t.m28310c(view, -1, view.getLayoutParams(), true);
            return;
        }
        C0419b c0419b = this.f1922t;
        if (z) {
            c0419b.m28302k(view);
        } else {
            c0419b.m28311b(view, true);
        }
    }

    /* renamed from: g0 */
    public AbstractC0376c0 m28826g0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m28823h0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: g1 */
    public void m28825g1() {
        int m28303j = this.f1922t.m28303j();
        for (int i = 0; i < m28303j; i++) {
            AbstractC0376c0 m28823h0 = m28823h0(this.f1922t.m28304i(i));
            if (!m28823h0.m28746L()) {
                m28823h0.m28751G();
            }
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0391o abstractC0391o = this.f1865B;
        if (abstractC0391o != null) {
            return abstractC0391o.mo28484D();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m28866P());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0391o abstractC0391o = this.f1865B;
        if (abstractC0391o != null) {
            return abstractC0391o.mo28481E(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m28866P());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0391o abstractC0391o = this.f1865B;
        if (abstractC0391o != null) {
            return abstractC0391o.mo28479F(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m28866P());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0380g getAdapter() {
        return this.f1863A;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0391o abstractC0391o = this.f1865B;
        return abstractC0391o != null ? abstractC0391o.m28665G() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        InterfaceC0383j interfaceC0383j = this.f1872E0;
        return interfaceC0383j == null ? super.getChildDrawingOrder(i, i2) : interfaceC0383j.m28698a(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1926v;
    }

    public C0451k getCompatAccessibilityDelegate() {
        return this.f1870D0;
    }

    public C0384k getEdgeEffectFactory() {
        return this.f1898W;
    }

    public AbstractC0385l getItemAnimator() {
        return this.f1903e0;
    }

    public int getItemDecorationCount() {
        return this.f1869D.size();
    }

    public AbstractC0391o getLayoutManager() {
        return this.f1865B;
    }

    public int getMaxFlingVelocity() {
        return this.f1915p0;
    }

    public int getMinFlingVelocity() {
        return this.f1913o0;
    }

    public long getNanoTime() {
        if (f1858R0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC0398r getOnFlingListener() {
        return this.f1912n0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1921s0;
    }

    public C0401u getRecycledViewPool() {
        return this.f1916q.m28536i();
    }

    public int getScrollState() {
        return this.f1904f0;
    }

    /* renamed from: h */
    public void m28824h(AbstractC0390n abstractC0390n) {
        m28821i(abstractC0390n, -1);
    }

    /* renamed from: h1 */
    public boolean m28822h1(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        m28785u();
        if (this.f1863A != null) {
            int[] iArr = this.f1882J0;
            iArr[0] = 0;
            iArr[1] = 0;
            m28819i1(i, i2, iArr);
            int[] iArr2 = this.f1882J0;
            int i7 = iArr2[0];
            int i8 = iArr2[1];
            i3 = i8;
            i4 = i7;
            i5 = i - i7;
            i6 = i2 - i8;
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (!this.f1869D.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f1882J0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        m28884G(i4, i3, i5, i6, this.f1878H0, 0, iArr3);
        int[] iArr4 = this.f1882J0;
        int i9 = i5 - iArr4[0];
        int i10 = i6 - iArr4[1];
        boolean z = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i11 = this.f1909k0;
        int[] iArr5 = this.f1878H0;
        this.f1909k0 = i11 - iArr5[0];
        this.f1910l0 -= iArr5[1];
        int[] iArr6 = this.f1880I0;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !qq0.m12285a(motionEvent, 8194)) {
                m28859S0(motionEvent.getX(), i9, motionEvent.getY(), i10);
            }
            m28788t(i, i2);
        }
        if (i4 != 0 || i3 != 0) {
            m28880I(i4, i3);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i4 == 0 && i3 == 0) ? false : true;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m22345j();
    }

    /* renamed from: i */
    public void m28821i(AbstractC0390n abstractC0390n, int i) {
        AbstractC0391o abstractC0391o = this.f1865B;
        if (abstractC0391o != null) {
            abstractC0391o.mo28428g("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f1869D.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.f1869D.add(abstractC0390n);
        } else {
            this.f1869D.add(i, abstractC0390n);
        }
        m28769z0();
        requestLayout();
    }

    /* renamed from: i1 */
    public void m28819i1(int i, int i2, int[] iArr) {
        m28789s1();
        m28879I0();
        lm1.m16730a("RV Scroll");
        m28864Q(this.f1929w0);
        int mo28399w1 = i != 0 ? this.f1865B.mo28399w1(i, this.f1916q, this.f1929w0) : 0;
        int mo28395y1 = i2 != 0 ? this.f1865B.mo28395y1(i2, this.f1916q, this.f1929w0) : 0;
        lm1.m16729b();
        m28840b1();
        m28877J0();
        m28783u1(false);
        if (iArr != null) {
            iArr[0] = mo28399w1;
            iArr[1] = mo28395y1;
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f1875G;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f1887M;
    }

    @Override // android.view.View, com.daaw.es0
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m22343l();
    }

    /* renamed from: j */
    public void m28818j(InterfaceC0399s interfaceC0399s) {
        this.f1871E.add(interfaceC0399s);
    }

    /* renamed from: j0 */
    public final int m28817j0(View view) {
        int id;
        loop0: while (true) {
            id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    break;
                }
            }
        }
        return id;
    }

    /* renamed from: j1 */
    public void m28816j1(int i) {
        if (this.f1887M) {
            return;
        }
        m28777w1();
        AbstractC0391o abstractC0391o = this.f1865B;
        if (abstractC0391o == null) {
            return;
        }
        abstractC0391o.mo28397x1(i);
        awakenScrollBars();
    }

    /* renamed from: k */
    public void m28815k(AbstractC0400t abstractC0400t) {
        if (this.f1933y0 == null) {
            this.f1933y0 = new ArrayList();
        }
        this.f1933y0.add(abstractC0400t);
    }

    /* renamed from: k0 */
    public final String m28814k0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    /* renamed from: k1 */
    public final void m28813k1(AbstractC0380g abstractC0380g, boolean z, boolean z2) {
        AbstractC0380g abstractC0380g2 = this.f1863A;
        if (abstractC0380g2 != null) {
            abstractC0380g2.m28703w(this.f1914p);
            this.f1863A.m28709p(this);
        }
        if (!z || z2) {
            m28851W0();
        }
        this.f1920s.m28323v();
        AbstractC0380g abstractC0380g3 = this.f1863A;
        this.f1863A = abstractC0380g;
        if (abstractC0380g != null) {
            abstractC0380g.m28705u(this.f1914p);
            abstractC0380g.m28711l(this);
        }
        AbstractC0391o abstractC0391o = this.f1865B;
        if (abstractC0391o != null) {
            abstractC0391o.m28669E0(abstractC0380g3, this.f1863A);
        }
        this.f1916q.m28521x(abstractC0380g3, this.f1863A, z);
        this.f1929w0.f2045g = true;
    }

    /* renamed from: l */
    public void m28812l(AbstractC0376c0 abstractC0376c0, AbstractC0385l.C0388c c0388c, AbstractC0385l.C0388c c0388c2) {
        abstractC0376c0.m28749I(false);
        if (this.f1903e0.mo28148a(abstractC0376c0, c0388c, c0388c2)) {
            m28867O0();
        }
    }

    /* renamed from: l0 */
    public Rect m28811l0(View view) {
        C0396p c0396p = (C0396p) view.getLayoutParams();
        if (c0396p.f2007c) {
            if (this.f1929w0.m28492e() && (c0396p.m28574b() || c0396p.m28572d())) {
                return c0396p.f2006b;
            }
            Rect rect = c0396p.f2006b;
            rect.set(0, 0, 0, 0);
            int size = this.f1869D.size();
            for (int i = 0; i < size; i++) {
                this.f1930x.set(0, 0, 0, 0);
                this.f1869D.get(i).mo16521e(this.f1930x, view, this, this.f1929w0);
                int i2 = rect.left;
                Rect rect2 = this.f1930x;
                rect.left = i2 + rect2.left;
                rect.top += rect2.top;
                rect.right += rect2.right;
                rect.bottom += rect2.bottom;
            }
            c0396p.f2007c = false;
            return rect;
        }
        return c0396p.f2006b;
    }

    /* renamed from: l1 */
    public boolean m28810l1(AbstractC0376c0 abstractC0376c0, int i) {
        if (!m28778w0()) {
            xs1.m4773B0(abstractC0376c0.f1947a, i);
            return true;
        }
        abstractC0376c0.f1963q = i;
        this.f1884K0.add(abstractC0376c0);
        return false;
    }

    /* renamed from: m */
    public final void m28809m(AbstractC0376c0 abstractC0376c0, AbstractC0376c0 abstractC0376c02, AbstractC0385l.C0388c c0388c, AbstractC0385l.C0388c c0388c2, boolean z, boolean z2) {
        abstractC0376c0.m28749I(false);
        if (z) {
            m28827g(abstractC0376c0);
        }
        if (abstractC0376c0 != abstractC0376c02) {
            if (z2) {
                m28827g(abstractC0376c02);
            }
            abstractC0376c0.f1954h = abstractC0376c02;
            m28827g(abstractC0376c0);
            this.f1916q.m28548J(abstractC0376c0);
            abstractC0376c02.m28749I(false);
            abstractC0376c02.f1955i = abstractC0376c0;
        }
        if (this.f1903e0.mo28147b(abstractC0376c0, abstractC0376c02, c0388c, c0388c2)) {
            m28867O0();
        }
    }

    /* renamed from: m0 */
    public final void m28808m0(long j, AbstractC0376c0 abstractC0376c0, AbstractC0376c0 abstractC0376c02) {
        int m28306g = this.f1922t.m28306g();
        for (int i = 0; i < m28306g; i++) {
            AbstractC0376c0 m28823h0 = m28823h0(this.f1922t.m28307f(i));
            if (m28823h0 != abstractC0376c0 && m28838c0(m28823h0) == j) {
                AbstractC0380g abstractC0380g = this.f1863A;
                if (abstractC0380g == null || !abstractC0380g.m28715h()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + m28823h0 + " \n View Holder 2:" + abstractC0376c0 + m28866P());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + m28823h0 + " \n View Holder 2:" + abstractC0376c0 + m28866P());
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
        sb.append(abstractC0376c02);
        sb.append(" cannot be found but it is necessary for ");
        sb.append(abstractC0376c0);
        sb.append(m28866P());
    }

    /* renamed from: m1 */
    public boolean m28807m1(AccessibilityEvent accessibilityEvent) {
        if (m28778w0()) {
            int m5676a = accessibilityEvent != null ? C3487x.m5676a(accessibilityEvent) : 0;
            this.f1890O |= m5676a != 0 ? m5676a : 0;
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public void m28806n(AbstractC0376c0 abstractC0376c0, AbstractC0385l.C0388c c0388c, AbstractC0385l.C0388c c0388c2) {
        m28827g(abstractC0376c0);
        abstractC0376c0.m28749I(false);
        if (this.f1903e0.mo28146c(abstractC0376c0, c0388c, c0388c2)) {
            m28867O0();
        }
    }

    /* renamed from: n0 */
    public boolean m28805n0() {
        return !this.f1881J || this.f1894S || this.f1920s.m28329p();
    }

    /* renamed from: n1 */
    public void m28804n1(int i, int i2) {
        m28801o1(i, i2, null);
    }

    /* renamed from: o */
    public void m28803o(String str) {
        if (m28778w0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m28866P());
        } else if (this.f1897V > 0) {
            new IllegalStateException("" + m28866P());
        }
    }

    /* renamed from: o0 */
    public final boolean m28802o0() {
        int m28306g = this.f1922t.m28306g();
        for (int i = 0; i < m28306g; i++) {
            AbstractC0376c0 m28823h0 = m28823h0(this.f1922t.m28307f(i));
            if (m28823h0 != null && !m28823h0.m28746L() && m28823h0.m28757A()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o1 */
    public void m28801o1(int i, int i2, Interpolator interpolator) {
        m28798p1(i, i2, interpolator, Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1896U = 0;
        boolean z = true;
        this.f1875G = true;
        this.f1881J = (!this.f1881J || isLayoutRequested()) ? false : false;
        AbstractC0391o abstractC0391o = this.f1865B;
        if (abstractC0391o != null) {
            abstractC0391o.m28578z(this);
        }
        this.f1868C0 = false;
        if (f1858R0) {
            ThreadLocal<RunnableC0438e> threadLocal = RunnableC0438e.f2216t;
            RunnableC0438e runnableC0438e = threadLocal.get();
            this.f1925u0 = runnableC0438e;
            if (runnableC0438e == null) {
                this.f1925u0 = new RunnableC0438e();
                Display m4691x = xs1.m4691x(this);
                float f = 60.0f;
                if (!isInEditMode() && m4691x != null) {
                    float refreshRate = m4691x.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                RunnableC0438e runnableC0438e2 = this.f1925u0;
                runnableC0438e2.f2220r = 1.0E9f / f;
                threadLocal.set(runnableC0438e2);
            }
            this.f1925u0.m28238a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RunnableC0438e runnableC0438e;
        super.onDetachedFromWindow();
        AbstractC0385l abstractC0385l = this.f1903e0;
        if (abstractC0385l != null) {
            abstractC0385l.mo28261k();
        }
        m28777w1();
        this.f1875G = false;
        AbstractC0391o abstractC0391o = this.f1865B;
        if (abstractC0391o != null) {
            abstractC0391o.m28677A(this, this.f1916q);
        }
        this.f1884K0.clear();
        removeCallbacks(this.f1886L0);
        this.f1924u.m28107j();
        if (!f1858R0 || (runnableC0438e = this.f1925u0) == null) {
            return;
        }
        runnableC0438e.m28229j(this);
        this.f1925u0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f1869D.size();
        for (int i = 0; i < size; i++) {
            this.f1869D.get(i).mo553g(canvas, this, this.f1929w0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.f1865B != null && !this.f1887M && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.f1865B.mo28420l() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f1865B.mo28423k()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (f == 0.0f || f2 != 0.0f) {
                        m28822h1((int) (f2 * this.f1917q0), (int) (f * this.f1919r0), motionEvent);
                    }
                }
                f2 = 0.0f;
                if (f == 0.0f) {
                }
                m28822h1((int) (f2 * this.f1917q0), (int) (f * this.f1919r0), motionEvent);
            } else {
                if ((motionEvent.getSource() & NativeConstants.SSL_OP_CIPHER_SERVER_PREFERENCE) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f1865B.mo28420l()) {
                        f = -axisValue;
                        f2 = 0.0f;
                        if (f == 0.0f) {
                        }
                        m28822h1((int) (f2 * this.f1917q0), (int) (f * this.f1919r0), motionEvent);
                    } else if (this.f1865B.mo28423k()) {
                        f2 = axisValue;
                        f = 0.0f;
                        if (f == 0.0f) {
                        }
                        m28822h1((int) (f2 * this.f1917q0), (int) (f * this.f1919r0), motionEvent);
                    }
                }
                f = 0.0f;
                f2 = 0.0f;
                if (f == 0.0f) {
                }
                m28822h1((int) (f2 * this.f1917q0), (int) (f * this.f1919r0), motionEvent);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f1887M) {
            return false;
        }
        this.f1873F = null;
        if (m28858T(motionEvent)) {
            m28797q();
            return true;
        }
        AbstractC0391o abstractC0391o = this.f1865B;
        if (abstractC0391o == null) {
            return false;
        }
        boolean mo28423k = abstractC0391o.mo28423k();
        boolean mo28420l = this.f1865B.mo28420l();
        if (this.f1906h0 == null) {
            this.f1906h0 = VelocityTracker.obtain();
        }
        this.f1906h0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f1889N) {
                this.f1889N = false;
            }
            this.f1905g0 = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f1909k0 = x;
            this.f1907i0 = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f1910l0 = y;
            this.f1908j0 = y;
            if (this.f1904f0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                m28780v1(1);
            }
            int[] iArr = this.f1880I0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = mo28423k;
            if (mo28420l) {
                i = (mo28423k ? 1 : 0) | 2;
            }
            m28786t1(i, 0);
        } else if (actionMasked == 1) {
            this.f1906h0.clear();
            m28780v1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f1905g0);
            if (findPointerIndex < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error processing scroll; pointer index for id ");
                sb.append(this.f1905g0);
                sb.append(" not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f1904f0 != 1) {
                int i2 = x2 - this.f1907i0;
                int i3 = y2 - this.f1908j0;
                if (!mo28423k || Math.abs(i2) <= this.f1911m0) {
                    z = false;
                } else {
                    this.f1909k0 = x2;
                    z = true;
                }
                if (mo28420l && Math.abs(i3) > this.f1911m0) {
                    this.f1910l0 = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m28797q();
        } else if (actionMasked == 5) {
            this.f1905g0 = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f1909k0 = x3;
            this.f1907i0 = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f1910l0 = y3;
            this.f1908j0 = y3;
        } else if (actionMasked == 6) {
            m28873L0(motionEvent);
        }
        return this.f1904f0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        lm1.m16730a("RV OnLayout");
        m28894B();
        lm1.m16729b();
        this.f1881J = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        AbstractC0391o abstractC0391o = this.f1865B;
        if (abstractC0391o == null) {
            m28779w(i, i2);
            return;
        }
        boolean z = false;
        if (abstractC0391o.mo28407s0()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f1865B.m28634Z0(this.f1916q, this.f1929w0, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (z || this.f1863A == null) {
                return;
            }
            if (this.f1929w0.f2043e == 1) {
                m28892C();
            }
            this.f1865B.m28675A1(i, i2);
            this.f1929w0.f2048j = true;
            m28890D();
            this.f1865B.m28670D1(i, i2);
            if (this.f1865B.mo28663G1()) {
                this.f1865B.m28675A1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f1929w0.f2048j = true;
                m28890D();
                this.f1865B.m28670D1(i, i2);
            }
        } else if (this.f1877H) {
            this.f1865B.m28634Z0(this.f1916q, this.f1929w0, i, i2);
        } else {
            if (this.f1891P) {
                m28789s1();
                m28879I0();
                m28863Q0();
                m28877J0();
                C0409z c0409z = this.f1929w0;
                if (c0409z.f2050l) {
                    c0409z.f2046h = true;
                } else {
                    this.f1920s.m28335j();
                    this.f1929w0.f2046h = false;
                }
                this.f1891P = false;
                m28783u1(false);
            } else if (this.f1929w0.f2050l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC0380g abstractC0380g = this.f1863A;
            if (abstractC0380g != null) {
                this.f1929w0.f2044f = abstractC0380g.mo497d();
            } else {
                this.f1929w0.f2044f = 0;
            }
            m28789s1();
            this.f1865B.m28634Z0(this.f1916q, this.f1929w0, i, i2);
            m28783u1(false);
            this.f1929w0.f2046h = false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m28778w0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f1918r = savedState;
        super.onRestoreInstanceState(savedState.m29657a());
        AbstractC0391o abstractC0391o = this.f1865B;
        if (abstractC0391o == null || (parcelable2 = this.f1918r.f1936r) == null) {
            return;
        }
        abstractC0391o.mo28435c1(parcelable2);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f1918r;
        if (savedState2 != null) {
            savedState.m28768b(savedState2);
        } else {
            AbstractC0391o abstractC0391o = this.f1865B;
            savedState.f1936r = abstractC0391o != null ? abstractC0391o.mo28433d1() : null;
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        m28787t0();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2 = false;
        if (this.f1887M || this.f1889N) {
            return false;
        }
        if (m28876K(motionEvent)) {
            m28797q();
            return true;
        }
        AbstractC0391o abstractC0391o = this.f1865B;
        if (abstractC0391o == null) {
            return false;
        }
        boolean mo28423k = abstractC0391o.mo28423k();
        boolean mo28420l = this.f1865B.mo28420l();
        if (this.f1906h0 == null) {
            this.f1906h0 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.f1880I0;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.f1880I0;
        obtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked == 0) {
            this.f1905g0 = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f1909k0 = x;
            this.f1907i0 = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f1910l0 = y;
            this.f1908j0 = y;
            int i = mo28423k;
            if (mo28420l) {
                i = (mo28423k ? 1 : 0) | 2;
            }
            m28786t1(i, 0);
        } else if (actionMasked == 1) {
            this.f1906h0.addMovement(obtain);
            this.f1906h0.computeCurrentVelocity(1000, this.f1915p0);
            float f = mo28423k ? -this.f1906h0.getXVelocity(this.f1905g0) : 0.0f;
            float f2 = mo28420l ? -this.f1906h0.getYVelocity(this.f1905g0) : 0.0f;
            if ((f == 0.0f && f2 == 0.0f) || !m28843a0((int) f, (int) f2)) {
                setScrollState(0);
            }
            m28831e1();
            z2 = true;
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f1905g0);
            if (findPointerIndex < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error processing scroll; pointer index for id ");
                sb.append(this.f1905g0);
                sb.append(" not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            int i2 = this.f1909k0 - x2;
            int i3 = this.f1910l0 - y2;
            if (this.f1904f0 != 1) {
                if (mo28423k) {
                    int i4 = this.f1911m0;
                    i2 = i2 > 0 ? Math.max(0, i2 - i4) : Math.min(0, i2 + i4);
                    if (i2 != 0) {
                        z = true;
                        if (mo28420l) {
                            int i5 = this.f1911m0;
                            i3 = i3 > 0 ? Math.max(0, i3 - i5) : Math.min(0, i3 + i5);
                            if (i3 != 0) {
                                z = true;
                            }
                        }
                        if (z) {
                            setScrollState(1);
                        }
                    }
                }
                z = false;
                if (mo28420l) {
                }
                if (z) {
                }
            }
            int i6 = i2;
            int i7 = i3;
            if (this.f1904f0 == 1) {
                int[] iArr3 = this.f1882J0;
                iArr3[0] = 0;
                iArr3[1] = 0;
                if (m28886F(mo28423k ? i6 : 0, mo28420l ? i7 : 0, iArr3, this.f1878H0, 0)) {
                    int[] iArr4 = this.f1882J0;
                    i6 -= iArr4[0];
                    i7 -= iArr4[1];
                    int[] iArr5 = this.f1880I0;
                    int i8 = iArr5[0];
                    int[] iArr6 = this.f1878H0;
                    iArr5[0] = i8 + iArr6[0];
                    iArr5[1] = iArr5[1] + iArr6[1];
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                int i9 = i7;
                int[] iArr7 = this.f1878H0;
                this.f1909k0 = x2 - iArr7[0];
                this.f1910l0 = y2 - iArr7[1];
                if (m28822h1(mo28423k ? i6 : 0, mo28420l ? i9 : 0, motionEvent)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                RunnableC0438e runnableC0438e = this.f1925u0;
                if (runnableC0438e != null && (i6 != 0 || i9 != 0)) {
                    runnableC0438e.m28233f(this, i6, i9);
                }
            }
        } else if (actionMasked == 3) {
            m28797q();
        } else if (actionMasked == 5) {
            this.f1905g0 = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f1909k0 = x3;
            this.f1907i0 = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f1910l0 = y3;
            this.f1908j0 = y3;
        } else if (actionMasked == 6) {
            m28873L0(motionEvent);
        }
        if (!z2) {
            this.f1906h0.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* renamed from: p */
    public boolean m28800p(AbstractC0376c0 abstractC0376c0) {
        AbstractC0385l abstractC0385l = this.f1903e0;
        return abstractC0385l == null || abstractC0385l.mo28263g(abstractC0376c0, abstractC0376c0.m28729q());
    }

    /* renamed from: p0 */
    public void m28799p0() {
        this.f1920s = new C0416a(new C0379f());
    }

    /* renamed from: p1 */
    public void m28798p1(int i, int i2, Interpolator interpolator, int i3) {
        m28795q1(i, i2, interpolator, i3, false);
    }

    /* renamed from: q */
    public final void m28797q() {
        m28831e1();
        setScrollState(0);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: q0 */
    public final void m28796q0() {
        if (xs1.m4770D(this) == 0) {
            xs1.m4771C0(this, 8);
        }
    }

    /* renamed from: q1 */
    public void m28795q1(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        AbstractC0391o abstractC0391o = this.f1865B;
        if (abstractC0391o == null || this.f1887M) {
            return;
        }
        if (!abstractC0391o.mo28423k()) {
            i = 0;
        }
        if (!this.f1865B.mo28420l()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (!(i3 == Integer.MIN_VALUE || i3 > 0)) {
            scrollBy(i, i2);
            return;
        }
        if (z) {
            int i4 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i4 |= 2;
            }
            m28786t1(i4, 1);
        }
        this.f1923t0.m28759f(i, i2, i3, interpolator);
    }

    /* renamed from: r0 */
    public final void m28793r0() {
        this.f1922t = new C0419b(new C0378e());
    }

    /* renamed from: r1 */
    public void m28792r1(int i) {
        AbstractC0391o abstractC0391o;
        if (this.f1887M || (abstractC0391o = this.f1865B) == null) {
            return;
        }
        abstractC0391o.mo2469I1(this, this.f1929w0, i);
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        AbstractC0376c0 m28823h0 = m28823h0(view);
        if (m28823h0 != null) {
            if (m28823h0.m28720z()) {
                m28823h0.m28738h();
            } else if (!m28823h0.m28746L()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + m28823h0 + m28866P());
            }
        }
        view.clearAnimation();
        m28770z(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f1865B.m28629b1(this, this.f1929w0, view, view2) && view2 != null) {
            m28837c1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f1865B.m28592r1(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f1871E.size();
        for (int i = 0; i < size; i++) {
            this.f1871E.get(i).mo16522c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f1883K != 0 || this.f1887M) {
            this.f1885L = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public void m28791s() {
        int m28303j = this.f1922t.m28303j();
        for (int i = 0; i < m28303j; i++) {
            AbstractC0376c0 m28823h0 = m28823h0(this.f1922t.m28304i(i));
            if (!m28823h0.m28746L()) {
                m28823h0.m28741e();
            }
        }
        this.f1916q.m28541d();
    }

    /* renamed from: s0 */
    public void m28790s0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new C0433d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(d11.fastscroll_default_thickness), resources.getDimensionPixelSize(d11.fastscroll_minimum_range), resources.getDimensionPixelOffset(d11.fastscroll_margin));
            return;
        }
        throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m28866P());
    }

    /* renamed from: s1 */
    public void m28789s1() {
        int i = this.f1883K + 1;
        this.f1883K = i;
        if (i != 1 || this.f1887M) {
            return;
        }
        this.f1885L = false;
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        AbstractC0391o abstractC0391o = this.f1865B;
        if (abstractC0391o == null || this.f1887M) {
            return;
        }
        boolean mo28423k = abstractC0391o.mo28423k();
        boolean mo28420l = this.f1865B.mo28420l();
        if (mo28423k || mo28420l) {
            if (!mo28423k) {
                i = 0;
            }
            if (!mo28420l) {
                i2 = 0;
            }
            m28822h1(i, i2, null);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (m28807m1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C0451k c0451k) {
        this.f1870D0 = c0451k;
        xs1.m4702r0(this, c0451k);
    }

    public void setAdapter(AbstractC0380g abstractC0380g) {
        setLayoutFrozen(false);
        m28813k1(abstractC0380g, false, true);
        m28861R0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0383j interfaceC0383j) {
        if (interfaceC0383j == this.f1872E0) {
            return;
        }
        this.f1872E0 = interfaceC0383j;
        setChildrenDrawingOrderEnabled(interfaceC0383j != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f1926v) {
            m28787t0();
        }
        this.f1926v = z;
        super.setClipToPadding(z);
        if (this.f1881J) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0384k c0384k) {
        ty0.m8699f(c0384k);
        this.f1898W = c0384k;
        m28787t0();
    }

    public void setHasFixedSize(boolean z) {
        this.f1877H = z;
    }

    public void setItemAnimator(AbstractC0385l abstractC0385l) {
        AbstractC0385l abstractC0385l2 = this.f1903e0;
        if (abstractC0385l2 != null) {
            abstractC0385l2.mo28261k();
            this.f1903e0.m28685v(null);
        }
        this.f1903e0 = abstractC0385l;
        if (abstractC0385l != null) {
            abstractC0385l.m28685v(this.f1866B0);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.f1916q.m28551G(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(AbstractC0391o abstractC0391o) {
        if (abstractC0391o == this.f1865B) {
            return;
        }
        m28777w1();
        if (this.f1865B != null) {
            AbstractC0385l abstractC0385l = this.f1903e0;
            if (abstractC0385l != null) {
                abstractC0385l.mo28261k();
            }
            this.f1865B.m28608k1(this.f1916q);
            this.f1865B.m28606l1(this.f1916q);
            this.f1916q.m28542c();
            if (this.f1875G) {
                this.f1865B.m28677A(this, this.f1916q);
            }
            this.f1865B.m28668E1(null);
            this.f1865B = null;
        } else {
            this.f1916q.m28542c();
        }
        this.f1922t.m28298o();
        this.f1865B = abstractC0391o;
        if (abstractC0391o != null) {
            if (abstractC0391o.f1982b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC0391o + " is already attached to a RecyclerView:" + abstractC0391o.f1982b.m28866P());
            }
            abstractC0391o.m28668E1(this);
            if (this.f1875G) {
                this.f1865B.m28578z(this);
            }
        }
        this.f1916q.m28547K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().m22342m(z);
    }

    public void setOnFlingListener(AbstractC0398r abstractC0398r) {
        this.f1912n0 = abstractC0398r;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0400t abstractC0400t) {
        this.f1931x0 = abstractC0400t;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f1921s0 = z;
    }

    public void setRecycledViewPool(C0401u c0401u) {
        this.f1916q.m28553E(c0401u);
    }

    public void setRecyclerListener(InterfaceC0404w interfaceC0404w) {
        this.f1867C = interfaceC0404w;
    }

    void setScrollState(int i) {
        if (i == this.f1904f0) {
            return;
        }
        this.f1904f0 = i;
        if (i != 2) {
            m28774x1();
        }
        m28882H(i);
    }

    public void setScrollingTouchSlop(int i) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                this.f1911m0 = scaledTouchSlop;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("setScrollingTouchSlop(): bad argument constant ");
            sb.append(i);
            sb.append("; using default value");
        }
        scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.f1911m0 = scaledTouchSlop;
    }

    public void setViewCacheExtension(AbstractC0372a0 abstractC0372a0) {
        this.f1916q.m28552F(abstractC0372a0);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m22340o(i);
    }

    @Override // android.view.View, com.daaw.es0
    public void stopNestedScroll() {
        getScrollingChildHelper().m22338q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.f1887M) {
            m28803o("Do not suppressLayout in layout or scroll");
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f1887M = true;
                this.f1889N = true;
                m28777w1();
                return;
            }
            this.f1887M = false;
            if (this.f1885L && this.f1865B != null && this.f1863A != null) {
                requestLayout();
            }
            this.f1885L = false;
        }
    }

    /* renamed from: t */
    public void m28788t(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f1899a0;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f1899a0.onRelease();
            z = this.f1899a0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1901c0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f1901c0.onRelease();
            z |= this.f1901c0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1900b0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f1900b0.onRelease();
            z |= this.f1900b0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1902d0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f1902d0.onRelease();
            z |= this.f1902d0.isFinished();
        }
        if (z) {
            xs1.m4720i0(this);
        }
    }

    /* renamed from: t0 */
    public void m28787t0() {
        this.f1902d0 = null;
        this.f1900b0 = null;
        this.f1901c0 = null;
        this.f1899a0 = null;
    }

    /* renamed from: t1 */
    public boolean m28786t1(int i, int i2) {
        return getScrollingChildHelper().m22339p(i, i2);
    }

    /* renamed from: u */
    public void m28785u() {
        if (!this.f1881J || this.f1894S) {
            lm1.m16730a("RV FullInvalidate");
            m28894B();
            lm1.m16729b();
        } else if (this.f1920s.m28329p()) {
            if (this.f1920s.m28330o(4) && !this.f1920s.m28330o(11)) {
                lm1.m16730a("RV PartialInvalidate");
                m28789s1();
                m28879I0();
                this.f1920s.m28325t();
                if (!this.f1885L) {
                    if (m28802o0()) {
                        m28894B();
                    } else {
                        this.f1920s.m28336i();
                    }
                }
                m28783u1(true);
                m28877J0();
            } else if (!this.f1920s.m28329p()) {
                return;
            } else {
                lm1.m16730a("RV FullInvalidate");
                m28894B();
            }
            lm1.m16729b();
        }
    }

    /* renamed from: u0 */
    public void m28784u0() {
        if (this.f1869D.size() == 0) {
            return;
        }
        AbstractC0391o abstractC0391o = this.f1865B;
        if (abstractC0391o != null) {
            abstractC0391o.mo28428g("Cannot invalidate item decorations during a scroll or layout");
        }
        m28769z0();
        requestLayout();
    }

    /* renamed from: u1 */
    public void m28783u1(boolean z) {
        if (this.f1883K < 1) {
            this.f1883K = 1;
        }
        if (!z && !this.f1887M) {
            this.f1885L = false;
        }
        if (this.f1883K == 1) {
            if (z && this.f1885L && !this.f1887M && this.f1865B != null && this.f1863A != null) {
                m28894B();
            }
            if (!this.f1887M) {
                this.f1885L = false;
            }
        }
        this.f1883K--;
    }

    /* renamed from: v */
    public final void m28782v(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String m28814k0 = m28814k0(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(m28814k0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC0391o.class);
                Object[] objArr = null;
                try {
                    constructor = asSubclass.getConstructor(f1861U0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                } catch (NoSuchMethodException e) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + m28814k0, e2);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((AbstractC0391o) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + m28814k0, e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + m28814k0, e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + m28814k0, e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + m28814k0, e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + m28814k0, e7);
            }
        }
    }

    /* renamed from: v0 */
    public boolean m28781v0() {
        AccessibilityManager accessibilityManager = this.f1892Q;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* renamed from: v1 */
    public void m28780v1(int i) {
        getScrollingChildHelper().m22337r(i);
    }

    /* renamed from: w */
    public void m28779w(int i, int i2) {
        setMeasuredDimension(AbstractC0391o.m28603n(i, getPaddingLeft() + getPaddingRight(), xs1.m4764G(this)), AbstractC0391o.m28603n(i2, getPaddingTop() + getPaddingBottom(), xs1.m4766F(this)));
    }

    /* renamed from: w0 */
    public boolean m28778w0() {
        return this.f1896U > 0;
    }

    /* renamed from: w1 */
    public void m28777w1() {
        setScrollState(0);
        m28774x1();
    }

    /* renamed from: x */
    public final boolean m28776x(int i, int i2) {
        m28856U(this.f1874F0);
        int[] iArr = this.f1874F0;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    /* renamed from: x0 */
    public final boolean m28775x0(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || m28862R(view2) == null) {
            return false;
        }
        if (view == null || m28862R(view) == null) {
            return true;
        }
        this.f1930x.set(0, 0, view.getWidth(), view.getHeight());
        this.f1932y.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f1930x);
        offsetDescendantRectToMyCoords(view2, this.f1932y);
        char c = 65535;
        int i3 = this.f1865B.m28635Z() == 1 ? -1 : 1;
        Rect rect = this.f1930x;
        int i4 = rect.left;
        Rect rect2 = this.f1932y;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i2 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            c = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                c = 0;
            }
        }
        if (i == 1) {
            return c < 0 || (c == 0 && i2 * i3 <= 0);
        } else if (i == 2) {
            return c > 0 || (c == 0 && i2 * i3 >= 0);
        } else if (i == 17) {
            return i2 < 0;
        } else if (i == 33) {
            return c < 0;
        } else if (i == 66) {
            return i2 > 0;
        } else if (i == 130) {
            return c > 0;
        } else {
            throw new IllegalArgumentException("Invalid direction: " + i + m28866P());
        }
    }

    /* renamed from: x1 */
    public final void m28774x1() {
        this.f1923t0.m28758g();
        AbstractC0391o abstractC0391o = this.f1865B;
        if (abstractC0391o != null) {
            abstractC0391o.m28655K1();
        }
    }

    /* renamed from: y */
    public void m28773y(View view) {
        AbstractC0376c0 m28823h0 = m28823h0(view);
        m28883G0(view);
        AbstractC0380g abstractC0380g = this.f1863A;
        if (abstractC0380g != null && m28823h0 != null) {
            abstractC0380g.m28707r(m28823h0);
        }
        List<InterfaceC0397q> list = this.f1893R;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f1893R.get(size).m28570b(view);
            }
        }
    }

    /* renamed from: y0 */
    public void m28772y0(int i) {
        if (this.f1865B == null) {
            return;
        }
        setScrollState(2);
        this.f1865B.mo28397x1(i);
        awakenScrollBars();
    }

    /* renamed from: y1 */
    public void m28771y1(int i, int i2, Object obj) {
        int i3;
        int m28303j = this.f1922t.m28303j();
        int i4 = i + i2;
        for (int i5 = 0; i5 < m28303j; i5++) {
            View m28304i = this.f1922t.m28304i(i5);
            AbstractC0376c0 m28823h0 = m28823h0(m28304i);
            if (m28823h0 != null && !m28823h0.m28746L() && (i3 = m28823h0.f1949c) >= i && i3 < i4) {
                m28823h0.m28742d(2);
                m28823h0.m28743c(obj);
                ((C0396p) m28304i.getLayoutParams()).f2007c = true;
            }
        }
        this.f1916q.m28545M(i, i2);
    }

    /* renamed from: z */
    public void m28770z(View view) {
        AbstractC0376c0 m28823h0 = m28823h0(view);
        m28881H0(view);
        AbstractC0380g abstractC0380g = this.f1863A;
        if (abstractC0380g != null && m28823h0 != null) {
            abstractC0380g.m28706s(m28823h0);
        }
        List<InterfaceC0397q> list = this.f1893R;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f1893R.get(size).m28571a(view);
            }
        }
    }

    /* renamed from: z0 */
    public void m28769z0() {
        int m28303j = this.f1922t.m28303j();
        for (int i = 0; i < m28303j; i++) {
            ((C0396p) this.f1922t.m28304i(i).getLayoutParams()).f2007c = true;
        }
        this.f1916q.m28526s();
    }
}
