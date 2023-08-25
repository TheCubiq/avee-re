package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
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
import com.daaw.C3388w;
import com.daaw.C3654y;
import com.daaw.C3866zk;
import com.daaw.kv0;
import com.daaw.px1;
import com.daaw.vt0;
import com.daaw.xs1;
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

    /* renamed from: w0 */
    public static final int[] f2335w0 = {16842931};

    /* renamed from: x0 */
    public static final Comparator<C0493f> f2336x0 = new C0488a();

    /* renamed from: y0 */
    public static final Interpolator f2337y0 = new animationInterpolatorC0489b();

    /* renamed from: z0 */
    public static final C0500m f2338z0 = new C0500m();

    /* renamed from: A */
    public C0499l f2339A;

    /* renamed from: B */
    public int f2340B;

    /* renamed from: C */
    public Drawable f2341C;

    /* renamed from: D */
    public int f2342D;

    /* renamed from: E */
    public int f2343E;

    /* renamed from: F */
    public float f2344F;

    /* renamed from: G */
    public float f2345G;

    /* renamed from: H */
    public int f2346H;

    /* renamed from: I */
    public int f2347I;

    /* renamed from: J */
    public boolean f2348J;

    /* renamed from: K */
    public boolean f2349K;

    /* renamed from: L */
    public boolean f2350L;

    /* renamed from: M */
    public int f2351M;

    /* renamed from: N */
    public boolean f2352N;

    /* renamed from: O */
    public boolean f2353O;

    /* renamed from: P */
    public int f2354P;

    /* renamed from: Q */
    public int f2355Q;

    /* renamed from: R */
    public int f2356R;

    /* renamed from: S */
    public float f2357S;

    /* renamed from: T */
    public float f2358T;

    /* renamed from: U */
    public float f2359U;

    /* renamed from: V */
    public float f2360V;

    /* renamed from: W */
    public int f2361W;

    /* renamed from: a0 */
    public VelocityTracker f2362a0;

    /* renamed from: b0 */
    public int f2363b0;

    /* renamed from: c0 */
    public int f2364c0;

    /* renamed from: d0 */
    public int f2365d0;

    /* renamed from: e0 */
    public int f2366e0;

    /* renamed from: f0 */
    public boolean f2367f0;

    /* renamed from: g0 */
    public EdgeEffect f2368g0;

    /* renamed from: h0 */
    public EdgeEffect f2369h0;

    /* renamed from: i0 */
    public boolean f2370i0;

    /* renamed from: j0 */
    public boolean f2371j0;

    /* renamed from: k0 */
    public boolean f2372k0;

    /* renamed from: l0 */
    public int f2373l0;

    /* renamed from: m0 */
    public List<InterfaceC0497j> f2374m0;

    /* renamed from: n0 */
    public InterfaceC0497j f2375n0;

    /* renamed from: o0 */
    public InterfaceC0497j f2376o0;

    /* renamed from: p */
    public int f2377p;

    /* renamed from: p0 */
    public List<InterfaceC0496i> f2378p0;

    /* renamed from: q */
    public final ArrayList<C0493f> f2379q;

    /* renamed from: q0 */
    public InterfaceC0498k f2380q0;

    /* renamed from: r */
    public final C0493f f2381r;

    /* renamed from: r0 */
    public int f2382r0;

    /* renamed from: s */
    public final Rect f2383s;

    /* renamed from: s0 */
    public int f2384s0;

    /* renamed from: t */
    public kv0 f2385t;

    /* renamed from: t0 */
    public ArrayList<View> f2386t0;

    /* renamed from: u */
    public int f2387u;

    /* renamed from: u0 */
    public final Runnable f2388u0;

    /* renamed from: v */
    public int f2389v;

    /* renamed from: v0 */
    public int f2390v0;

    /* renamed from: w */
    public Parcelable f2391w;

    /* renamed from: x */
    public ClassLoader f2392x;

    /* renamed from: y */
    public Scroller f2393y;

    /* renamed from: z */
    public boolean f2394z;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0487a();

        /* renamed from: r */
        public int f2395r;

        /* renamed from: s */
        public Parcelable f2396s;

        /* renamed from: t */
        public ClassLoader f2397t;

        /* renamed from: androidx.viewpager.widget.ViewPager$SavedState$a */
        /* loaded from: classes.dex */
        public static class C0487a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f2395r = parcel.readInt();
            this.f2396s = parcel.readParcelable(classLoader);
            this.f2397t = classLoader;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f2395r + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2395r);
            parcel.writeParcelable(this.f2396s, i);
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$a */
    /* loaded from: classes.dex */
    public static class C0488a implements Comparator<C0493f> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C0493f c0493f, C0493f c0493f2) {
            return c0493f.f2402b - c0493f2.f2402b;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$b  reason: invalid class name */
    /* loaded from: classes.dex */
    public static class animationInterpolatorC0489b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$c */
    /* loaded from: classes.dex */
    public class RunnableC0490c implements Runnable {
        public RunnableC0490c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.m28056D();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$d */
    /* loaded from: classes.dex */
    public class C0491d implements vt0 {

        /* renamed from: a */
        public final Rect f2399a = new Rect();

        public C0491d() {
        }

        @Override // com.daaw.vt0
        /* renamed from: a */
        public px1 mo6806a(View view, px1 px1Var) {
            px1 m4730d0 = xs1.m4730d0(view, px1Var);
            if (m4730d0.m12945p()) {
                return m4730d0;
            }
            Rect rect = this.f2399a;
            rect.left = m4730d0.m12951j();
            rect.top = m4730d0.m12949l();
            rect.right = m4730d0.m12950k();
            rect.bottom = m4730d0.m12952i();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                px1 m4721i = xs1.m4721i(ViewPager.this.getChildAt(i), m4730d0);
                rect.left = Math.min(m4721i.m12951j(), rect.left);
                rect.top = Math.min(m4721i.m12949l(), rect.top);
                rect.right = Math.min(m4721i.m12950k(), rect.right);
                rect.bottom = Math.min(m4721i.m12952i(), rect.bottom);
            }
            return m4730d0.m12944q(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.viewpager.widget.ViewPager$e */
    /* loaded from: classes.dex */
    public @interface InterfaceC0492e {
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$f */
    /* loaded from: classes.dex */
    public static class C0493f {

        /* renamed from: a */
        public Object f2401a;

        /* renamed from: b */
        public int f2402b;

        /* renamed from: c */
        public boolean f2403c;

        /* renamed from: d */
        public float f2404d;

        /* renamed from: e */
        public float f2405e;
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$g */
    /* loaded from: classes.dex */
    public static class C0494g extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f2406a;

        /* renamed from: b */
        public int f2407b;

        /* renamed from: c */
        public float f2408c;

        /* renamed from: d */
        public boolean f2409d;

        /* renamed from: e */
        public int f2410e;

        /* renamed from: f */
        public int f2411f;

        public C0494g() {
            super(-1, -1);
            this.f2408c = 0.0f;
        }

        public C0494g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2408c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f2335w0);
            this.f2407b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$h */
    /* loaded from: classes.dex */
    public class C0495h extends C3388w {
        public C0495h() {
        }

        @Override // com.daaw.C3388w
        /* renamed from: f */
        public void mo354f(View view, AccessibilityEvent accessibilityEvent) {
            kv0 kv0Var;
            super.mo354f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m28014n());
            if (accessibilityEvent.getEventType() != 4096 || (kv0Var = ViewPager.this.f2385t) == null) {
                return;
            }
            accessibilityEvent.setItemCount(kv0Var.mo17418c());
            accessibilityEvent.setFromIndex(ViewPager.this.f2387u);
            accessibilityEvent.setToIndex(ViewPager.this.f2387u);
        }

        @Override // com.daaw.C3388w
        /* renamed from: g */
        public void mo161g(View view, C3654y c3654y) {
            super.mo161g(view, c3654y);
            c3654y.m4335b0(ViewPager.class.getName());
            c3654y.m4299t0(m28014n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                c3654y.m4338a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                c3654y.m4338a(8192);
            }
        }

        @Override // com.daaw.C3388w
        /* renamed from: j */
        public boolean mo6629j(View view, int i, Bundle bundle) {
            ViewPager viewPager;
            int i2;
            if (super.mo6629j(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i2 = viewPager.f2387u - 1;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                viewPager = ViewPager.this;
                i2 = viewPager.f2387u + 1;
            }
            viewPager.setCurrentItem(i2);
            return true;
        }

        /* renamed from: n */
        public final boolean m28014n() {
            kv0 kv0Var = ViewPager.this.f2385t;
            return kv0Var != null && kv0Var.mo17418c() > 1;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$i */
    /* loaded from: classes.dex */
    public interface InterfaceC0496i {
        /* renamed from: a */
        void m28013a(ViewPager viewPager, kv0 kv0Var, kv0 kv0Var2);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$j */
    /* loaded from: classes.dex */
    public interface InterfaceC0497j {
        /* renamed from: a */
        void mo26891a(int i, float f, int i2);

        /* renamed from: b */
        void mo26890b(int i);

        /* renamed from: c */
        void mo26889c(int i);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$k */
    /* loaded from: classes.dex */
    public interface InterfaceC0498k {
        /* renamed from: a */
        void m28012a(View view, float f);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$l */
    /* loaded from: classes.dex */
    public class C0499l extends DataSetObserver {
        public C0499l() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.m28038g();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.m28038g();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$m */
    /* loaded from: classes.dex */
    public static class C0500m implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            C0494g c0494g = (C0494g) view.getLayoutParams();
            C0494g c0494g2 = (C0494g) view2.getLayoutParams();
            boolean z = c0494g.f2406a;
            return z != c0494g2.f2406a ? z ? 1 : -1 : c0494g.f2410e - c0494g2.f2410e;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2379q = new ArrayList<>();
        this.f2381r = new C0493f();
        this.f2383s = new Rect();
        this.f2389v = -1;
        this.f2391w = null;
        this.f2392x = null;
        this.f2344F = -3.4028235E38f;
        this.f2345G = Float.MAX_VALUE;
        this.f2351M = 1;
        this.f2361W = -1;
        this.f2370i0 = true;
        this.f2371j0 = false;
        this.f2388u0 = new RunnableC0490c();
        this.f2390v0 = 0;
        m28024u();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f2349K != z) {
            this.f2349K = z;
        }
    }

    /* renamed from: v */
    public static boolean m28023v(View view) {
        return view.getClass().getAnnotation(InterfaceC0492e.class) != null;
    }

    /* renamed from: A */
    public boolean m28059A() {
        kv0 kv0Var = this.f2385t;
        if (kv0Var == null || this.f2387u >= kv0Var.mo17418c() - 1) {
            return false;
        }
        m28049K(this.f2387u + 1, true);
        return true;
    }

    /* renamed from: B */
    public final boolean m28058B(int i) {
        if (this.f2379q.size() == 0) {
            if (this.f2370i0) {
                return false;
            }
            this.f2372k0 = false;
            m28021x(0, 0.0f, 0);
            if (this.f2372k0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C0493f m28026s = m28026s();
        int clientWidth = getClientWidth();
        int i2 = this.f2340B;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = m28026s.f2402b;
        float f2 = ((i / f) - m28026s.f2405e) / (m28026s.f2404d + (i2 / f));
        this.f2372k0 = false;
        m28021x(i4, f2, (int) (i3 * f2));
        if (this.f2372k0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* renamed from: C */
    public final boolean m28057C(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f2357S - f;
        this.f2357S = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.f2344F * clientWidth;
        float f4 = this.f2345G * clientWidth;
        boolean z3 = false;
        C0493f c0493f = this.f2379q.get(0);
        ArrayList<C0493f> arrayList = this.f2379q;
        C0493f c0493f2 = arrayList.get(arrayList.size() - 1);
        if (c0493f.f2402b != 0) {
            f3 = c0493f.f2405e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (c0493f2.f2402b != this.f2385t.mo17418c() - 1) {
            f4 = c0493f2.f2405e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f2368g0.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f2369h0.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f2357S += scrollX - i;
        scrollTo(i, getScrollY());
        m28058B(i);
        return z3;
    }

    /* renamed from: D */
    public void m28056D() {
        m28055E(this.f2387u);
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
        r5 = r17.f2379q.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e7, code lost:
        r5 = null;
     */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m28055E(int i) {
        C0493f c0493f;
        String hexString;
        C0493f c0493f2;
        C0493f m28027r;
        C0493f c0493f3;
        int i2 = this.f2387u;
        if (i2 != i) {
            c0493f = m28025t(i2);
            this.f2387u = i;
        } else {
            c0493f = null;
        }
        if (this.f2385t == null) {
            m28045O();
        } else if (this.f2350L) {
            m28045O();
        } else if (getWindowToken() != null) {
            this.f2385t.mo5595n(this);
            int i3 = this.f2351M;
            int max = Math.max(0, this.f2387u - i3);
            int mo17418c = this.f2385t.mo17418c();
            int min = Math.min(mo17418c - 1, this.f2387u + i3);
            if (mo17418c != this.f2377p) {
                try {
                    hexString = getResources().getResourceName(getId());
                } catch (Resources.NotFoundException unused) {
                    hexString = Integer.toHexString(getId());
                }
                throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f2377p + ", found: " + mo17418c + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.f2385t.getClass());
            }
            int i4 = 0;
            while (true) {
                if (i4 >= this.f2379q.size()) {
                    break;
                }
                c0493f2 = this.f2379q.get(i4);
                int i5 = c0493f2.f2402b;
                int i6 = this.f2387u;
                if (i5 < i6) {
                    i4++;
                }
            }
            if (c0493f2 == null && mo17418c > 0) {
                c0493f2 = m28044a(this.f2387u, i4);
            }
            if (c0493f2 != null) {
                int i7 = i4 - 1;
                C0493f c0493f4 = i7 >= 0 ? this.f2379q.get(i7) : null;
                int clientWidth = getClientWidth();
                float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - c0493f2.f2404d) + (getPaddingLeft() / clientWidth);
                float f = 0.0f;
                for (int i8 = this.f2387u - 1; i8 >= 0; i8--) {
                    if (f < paddingLeft || i8 >= max) {
                        if (c0493f4 == null || i8 != c0493f4.f2402b) {
                            f += m28044a(i8, i7 + 1).f2404d;
                            i4++;
                        } else {
                            f += c0493f4.f2404d;
                            i7--;
                        }
                    } else if (c0493f4 == null) {
                        break;
                    } else {
                        if (i8 == c0493f4.f2402b && !c0493f4.f2403c) {
                            this.f2379q.remove(i7);
                            this.f2385t.mo5602a(this, i8, c0493f4.f2401a);
                            i7--;
                            i4--;
                        }
                    }
                    c0493f4 = c0493f3;
                }
                float f2 = c0493f2.f2404d;
                int i9 = i4 + 1;
                if (f2 < 2.0f) {
                    C0493f c0493f5 = i9 < this.f2379q.size() ? this.f2379q.get(i9) : null;
                    float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                    int i10 = this.f2387u;
                    while (true) {
                        i10++;
                        if (i10 >= mo17418c) {
                            break;
                        } else if (f2 < paddingRight || i10 <= min) {
                            if (c0493f5 == null || i10 != c0493f5.f2402b) {
                                C0493f m28044a = m28044a(i10, i9);
                                i9++;
                                f2 += m28044a.f2404d;
                                c0493f5 = i9 < this.f2379q.size() ? this.f2379q.get(i9) : null;
                            } else {
                                f2 += c0493f5.f2404d;
                                i9++;
                                if (i9 < this.f2379q.size()) {
                                }
                            }
                        } else if (c0493f5 == null) {
                            break;
                        } else if (i10 == c0493f5.f2402b && !c0493f5.f2403c) {
                            this.f2379q.remove(i9);
                            this.f2385t.mo5602a(this, i10, c0493f5.f2401a);
                            if (i9 < this.f2379q.size()) {
                            }
                        }
                    }
                }
                m28041d(c0493f2, i4, c0493f);
                this.f2385t.mo5596l(this, this.f2387u, c0493f2.f2401a);
            }
            this.f2385t.mo5601b(this);
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                C0494g c0494g = (C0494g) childAt.getLayoutParams();
                c0494g.f2411f = i11;
                if (!c0494g.f2406a && c0494g.f2408c == 0.0f && (m28027r = m28027r(childAt)) != null) {
                    c0494g.f2408c = m28027r.f2404d;
                    c0494g.f2410e = m28027r.f2402b;
                }
            }
            m28045O();
            if (hasFocus()) {
                View findFocus = findFocus();
                C0493f m28028q = findFocus != null ? m28028q(findFocus) : null;
                if (m28028q == null || m28028q.f2402b != this.f2387u) {
                    for (int i12 = 0; i12 < getChildCount(); i12++) {
                        View childAt2 = getChildAt(i12);
                        C0493f m28027r2 = m28027r(childAt2);
                        if (m28027r2 != null && m28027r2.f2402b == this.f2387u && childAt2.requestFocus(2)) {
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: F */
    public final void m28054F(int i, int i2, int i3, int i4) {
        int min;
        if (i2 <= 0 || this.f2379q.isEmpty()) {
            C0493f m28025t = m28025t(this.f2387u);
            min = (int) ((m28025t != null ? Math.min(m28025t.f2405e, this.f2345G) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
            if (min == getScrollX()) {
                return;
            }
            m28039f(false);
        } else if (!this.f2393y.isFinished()) {
            this.f2393y.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            min = (int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3));
        }
        scrollTo(min, getScrollY());
    }

    /* renamed from: G */
    public final void m28053G() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((C0494g) getChildAt(i).getLayoutParams()).f2406a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* renamed from: H */
    public final void m28052H(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: I */
    public final boolean m28051I() {
        this.f2361W = -1;
        m28031n();
        this.f2368g0.onRelease();
        this.f2369h0.onRelease();
        return this.f2368g0.isFinished() || this.f2369h0.isFinished();
    }

    /* renamed from: J */
    public final void m28050J(int i, boolean z, int i2, boolean z2) {
        C0493f m28025t = m28025t(i);
        int clientWidth = m28025t != null ? (int) (getClientWidth() * Math.max(this.f2344F, Math.min(m28025t.f2405e, this.f2345G))) : 0;
        if (z) {
            m28046N(clientWidth, 0, i2);
            if (z2) {
                m28035j(i);
                return;
            }
            return;
        }
        if (z2) {
            m28035j(i);
        }
        m28039f(false);
        scrollTo(clientWidth, 0);
        m28058B(clientWidth);
    }

    /* renamed from: K */
    public void m28049K(int i, boolean z) {
        this.f2350L = false;
        m28048L(i, z, false);
    }

    /* renamed from: L */
    public void m28048L(int i, boolean z, boolean z2) {
        m28047M(i, z, z2, 0);
    }

    /* renamed from: M */
    public void m28047M(int i, boolean z, boolean z2, int i2) {
        kv0 kv0Var = this.f2385t;
        if (kv0Var == null || kv0Var.mo17418c() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f2387u != i || this.f2379q.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f2385t.mo17418c()) {
                i = this.f2385t.mo17418c() - 1;
            }
            int i3 = this.f2351M;
            int i4 = this.f2387u;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f2379q.size(); i5++) {
                    this.f2379q.get(i5).f2403c = true;
                }
            }
            boolean z3 = this.f2387u != i;
            if (!this.f2370i0) {
                m28055E(i);
                m28050J(i, z, i2, z3);
                return;
            }
            this.f2387u = i;
            if (z3) {
                m28035j(i);
            }
            requestLayout();
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* renamed from: N */
    public void m28046N(int i, int i2, int i3) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f2393y;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.f2394z ? this.f2393y.getCurrX() : this.f2393y.getStartX();
            this.f2393y.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i4 = scrollX;
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            m28039f(false);
            m28056D();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i7 = clientWidth / 2;
        float f = clientWidth;
        float f2 = i7;
        float m28033l = f2 + (m28033l(Math.min(1.0f, (Math.abs(i5) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(m28033l / abs) * 1000.0f) * 4 : (int) (((Math.abs(i5) / ((f * this.f2385t.m17415f(this.f2387u)) + this.f2340B)) + 1.0f) * 100.0f), 600);
        this.f2394z = false;
        this.f2393y.startScroll(i4, scrollY, i5, i6, min);
        xs1.m4720i0(this);
    }

    /* renamed from: O */
    public final void m28045O() {
        if (this.f2384s0 != 0) {
            ArrayList<View> arrayList = this.f2386t0;
            if (arrayList == null) {
                this.f2386t0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f2386t0.add(getChildAt(i));
            }
            Collections.sort(this.f2386t0, f2338z0);
        }
    }

    /* renamed from: a */
    public C0493f m28044a(int i, int i2) {
        C0493f c0493f = new C0493f();
        c0493f.f2402b = i;
        c0493f.f2401a = this.f2385t.mo5600g(this, i);
        c0493f.f2404d = this.f2385t.m17415f(i);
        if (i2 < 0 || i2 >= this.f2379q.size()) {
            this.f2379q.add(c0493f);
        } else {
            this.f2379q.add(i2, c0493f);
        }
        return c0493f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0493f m28027r;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (m28027r = m28027r(childAt)) != null && m28027r.f2402b == this.f2387u) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        C0493f m28027r;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (m28027r = m28027r(childAt)) != null && m28027r.f2402b == this.f2387u) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0494g c0494g = (C0494g) layoutParams;
        boolean m28023v = c0494g.f2406a | m28023v(view);
        c0494g.f2406a = m28023v;
        if (!this.f2348J) {
            super.addView(view, i, layoutParams);
        } else if (m28023v) {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        } else {
            c0494g.f2409d = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    /* renamed from: b */
    public void m28043b(InterfaceC0497j interfaceC0497j) {
        if (this.f2374m0 == null) {
            this.f2374m0 = new ArrayList();
        }
        this.f2374m0.add(interfaceC0497j);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m28042c(int i) {
        boolean z;
        View findNextFocus;
        boolean m28059A;
        View findFocus = findFocus();
        boolean z2 = false;
        if (findFocus != this) {
            if (findFocus != null) {
                ViewParent parent = findFocus.getParent();
                while (true) {
                    if (!(parent instanceof ViewGroup)) {
                        z = false;
                        break;
                    } else if (parent == this) {
                        z = true;
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("arrowScroll tried to find focus based on non-child current focused view ");
                    sb2.append(sb.toString());
                }
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
            if (findNextFocus != null || findNextFocus == findFocus) {
                if (i != 17 || i == 1) {
                    z2 = m28019z();
                } else if (i == 66 || i == 2) {
                    z2 = m28059A();
                }
            } else if (i == 17) {
                int i2 = m28029p(this.f2383s, findNextFocus).left;
                int i3 = m28029p(this.f2383s, findFocus).left;
                if (findFocus != null && i2 >= i3) {
                    m28059A = m28019z();
                    z2 = m28059A;
                }
                m28059A = findNextFocus.requestFocus();
                z2 = m28059A;
            } else if (i == 66) {
                int i4 = m28029p(this.f2383s, findNextFocus).left;
                int i5 = m28029p(this.f2383s, findFocus).left;
                if (findFocus != null && i4 <= i5) {
                    m28059A = m28059A();
                    z2 = m28059A;
                }
                m28059A = findNextFocus.requestFocus();
                z2 = m28059A;
            }
            if (z2) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
            }
            return z2;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        if (findNextFocus != null) {
        }
        if (i != 17) {
        }
        z2 = m28019z();
        if (z2) {
        }
        return z2;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.f2385t == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.f2344F)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.f2345G));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0494g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f2394z = true;
        if (this.f2393y.isFinished() || !this.f2393y.computeScrollOffset()) {
            m28039f(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f2393y.getCurrX();
        int currY = this.f2393y.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!m28058B(currX)) {
                this.f2393y.abortAnimation();
                scrollTo(0, currY);
            }
        }
        xs1.m4720i0(this);
    }

    /* renamed from: d */
    public final void m28041d(C0493f c0493f, int i, C0493f c0493f2) {
        int i2;
        int i3;
        C0493f c0493f3;
        C0493f c0493f4;
        int mo17418c = this.f2385t.mo17418c();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? this.f2340B / clientWidth : 0.0f;
        if (c0493f2 != null) {
            int i4 = c0493f2.f2402b;
            int i5 = c0493f.f2402b;
            if (i4 < i5) {
                float f2 = c0493f2.f2405e + c0493f2.f2404d + f;
                int i6 = i4 + 1;
                int i7 = 0;
                while (i6 <= c0493f.f2402b && i7 < this.f2379q.size()) {
                    while (true) {
                        c0493f4 = this.f2379q.get(i7);
                        if (i6 <= c0493f4.f2402b || i7 >= this.f2379q.size() - 1) {
                            break;
                        }
                        i7++;
                    }
                    while (i6 < c0493f4.f2402b) {
                        f2 += this.f2385t.m17415f(i6) + f;
                        i6++;
                    }
                    c0493f4.f2405e = f2;
                    f2 += c0493f4.f2404d + f;
                    i6++;
                }
            } else if (i4 > i5) {
                int size = this.f2379q.size() - 1;
                float f3 = c0493f2.f2405e;
                while (true) {
                    i4--;
                    if (i4 < c0493f.f2402b || size < 0) {
                        break;
                    }
                    while (true) {
                        c0493f3 = this.f2379q.get(size);
                        if (i4 >= c0493f3.f2402b || size <= 0) {
                            break;
                        }
                        size--;
                    }
                    while (i4 > c0493f3.f2402b) {
                        f3 -= this.f2385t.m17415f(i4) + f;
                        i4--;
                    }
                    f3 -= c0493f3.f2404d + f;
                    c0493f3.f2405e = f3;
                }
            }
        }
        int size2 = this.f2379q.size();
        float f4 = c0493f.f2405e;
        int i8 = c0493f.f2402b;
        int i9 = i8 - 1;
        this.f2344F = i8 == 0 ? f4 : -3.4028235E38f;
        int i10 = mo17418c - 1;
        this.f2345G = i8 == i10 ? (c0493f.f2404d + f4) - 1.0f : Float.MAX_VALUE;
        int i11 = i - 1;
        while (i11 >= 0) {
            C0493f c0493f5 = this.f2379q.get(i11);
            while (true) {
                i3 = c0493f5.f2402b;
                if (i9 <= i3) {
                    break;
                }
                f4 -= this.f2385t.m17415f(i9) + f;
                i9--;
            }
            f4 -= c0493f5.f2404d + f;
            c0493f5.f2405e = f4;
            if (i3 == 0) {
                this.f2344F = f4;
            }
            i11--;
            i9--;
        }
        float f5 = c0493f.f2405e + c0493f.f2404d + f;
        int i12 = c0493f.f2402b + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            C0493f c0493f6 = this.f2379q.get(i13);
            while (true) {
                i2 = c0493f6.f2402b;
                if (i12 >= i2) {
                    break;
                }
                f5 += this.f2385t.m17415f(i12) + f;
                i12++;
            }
            if (i2 == i10) {
                this.f2345G = (c0493f6.f2404d + f5) - 1.0f;
            }
            c0493f6.f2405e = f5;
            f5 += c0493f6.f2404d + f;
            i13++;
            i12++;
        }
        this.f2371j0 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m28030o(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C0493f m28027r;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (m28027r = m28027r(childAt)) != null && m28027r.f2402b == this.f2387u && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
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
        if (overScrollMode == 0 || (overScrollMode == 1 && (kv0Var = this.f2385t) != null && kv0Var.mo17418c() > 1)) {
            if (!this.f2368g0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f2344F * width);
                this.f2368g0.setSize(height, width);
                z = false | this.f2368g0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f2369h0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f2345G + 1.0f)) * width2);
                this.f2369h0.setSize(height2, width2);
                z |= this.f2369h0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f2368g0.finish();
            this.f2369h0.finish();
        }
        if (z) {
            xs1.m4720i0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2341C;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    /* renamed from: e */
    public boolean m28040e(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && m28040e(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    /* renamed from: f */
    public final void m28039f(boolean z) {
        boolean z2 = this.f2390v0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f2393y.isFinished()) {
                this.f2393y.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f2393y.getCurrX();
                int currY = this.f2393y.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m28058B(currX);
                    }
                }
            }
        }
        this.f2350L = false;
        for (int i = 0; i < this.f2379q.size(); i++) {
            C0493f c0493f = this.f2379q.get(i);
            if (c0493f.f2403c) {
                c0493f.f2403c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                xs1.m4718j0(this, this.f2388u0);
            } else {
                this.f2388u0.run();
            }
        }
    }

    /* renamed from: g */
    public void m28038g() {
        int mo17418c = this.f2385t.mo17418c();
        this.f2377p = mo17418c;
        boolean z = this.f2379q.size() < (this.f2351M * 2) + 1 && this.f2379q.size() < mo17418c;
        int i = this.f2387u;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f2379q.size()) {
            C0493f c0493f = this.f2379q.get(i2);
            int m17417d = this.f2385t.m17417d(c0493f.f2401a);
            if (m17417d != -1) {
                if (m17417d == -2) {
                    this.f2379q.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f2385t.mo5595n(this);
                        z2 = true;
                    }
                    this.f2385t.mo5602a(this, c0493f.f2402b, c0493f.f2401a);
                    int i3 = this.f2387u;
                    if (i3 == c0493f.f2402b) {
                        i = Math.max(0, Math.min(i3, mo17418c - 1));
                    }
                } else {
                    int i4 = c0493f.f2402b;
                    if (i4 != m17417d) {
                        if (i4 == this.f2387u) {
                            i = m17417d;
                        }
                        c0493f.f2402b = m17417d;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f2385t.mo5601b(this);
        }
        Collections.sort(this.f2379q, f2336x0);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                C0494g c0494g = (C0494g) getChildAt(i5).getLayoutParams();
                if (!c0494g.f2406a) {
                    c0494g.f2408c = 0.0f;
                }
            }
            m28048L(i, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0494g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0494g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public kv0 getAdapter() {
        return this.f2385t;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f2384s0 == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C0494g) this.f2386t0.get(i2).getLayoutParams()).f2411f;
    }

    public int getCurrentItem() {
        return this.f2387u;
    }

    public int getOffscreenPageLimit() {
        return this.f2351M;
    }

    public int getPageMargin() {
        return this.f2340B;
    }

    /* renamed from: h */
    public final int m28037h(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.f2365d0 || Math.abs(i2) <= this.f2363b0) {
            i += (int) (f + (i >= this.f2387u ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f2379q.size() > 0) {
            ArrayList<C0493f> arrayList = this.f2379q;
            return Math.max(this.f2379q.get(0).f2402b, Math.min(i, arrayList.get(arrayList.size() - 1).f2402b));
        }
        return i;
    }

    /* renamed from: i */
    public final void m28036i(int i, float f, int i2) {
        InterfaceC0497j interfaceC0497j = this.f2375n0;
        if (interfaceC0497j != null) {
            interfaceC0497j.mo26891a(i, f, i2);
        }
        List<InterfaceC0497j> list = this.f2374m0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC0497j interfaceC0497j2 = this.f2374m0.get(i3);
                if (interfaceC0497j2 != null) {
                    interfaceC0497j2.mo26891a(i, f, i2);
                }
            }
        }
        InterfaceC0497j interfaceC0497j3 = this.f2376o0;
        if (interfaceC0497j3 != null) {
            interfaceC0497j3.mo26891a(i, f, i2);
        }
    }

    /* renamed from: j */
    public final void m28035j(int i) {
        InterfaceC0497j interfaceC0497j = this.f2375n0;
        if (interfaceC0497j != null) {
            interfaceC0497j.mo26889c(i);
        }
        List<InterfaceC0497j> list = this.f2374m0;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC0497j interfaceC0497j2 = this.f2374m0.get(i2);
                if (interfaceC0497j2 != null) {
                    interfaceC0497j2.mo26889c(i);
                }
            }
        }
        InterfaceC0497j interfaceC0497j3 = this.f2376o0;
        if (interfaceC0497j3 != null) {
            interfaceC0497j3.mo26889c(i);
        }
    }

    /* renamed from: k */
    public final void m28034k(int i) {
        InterfaceC0497j interfaceC0497j = this.f2375n0;
        if (interfaceC0497j != null) {
            interfaceC0497j.mo26890b(i);
        }
        List<InterfaceC0497j> list = this.f2374m0;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC0497j interfaceC0497j2 = this.f2374m0.get(i2);
                if (interfaceC0497j2 != null) {
                    interfaceC0497j2.mo26890b(i);
                }
            }
        }
        InterfaceC0497j interfaceC0497j3 = this.f2376o0;
        if (interfaceC0497j3 != null) {
            interfaceC0497j3.mo26890b(i);
        }
    }

    /* renamed from: l */
    public float m28033l(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    /* renamed from: m */
    public final void m28032m(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.f2382r0 : 0, null);
        }
    }

    /* renamed from: n */
    public final void m28031n() {
        this.f2352N = false;
        this.f2353O = false;
        VelocityTracker velocityTracker = this.f2362a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2362a0 = null;
        }
    }

    /* renamed from: o */
    public boolean m28030o(KeyEvent keyEvent) {
        int i;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return m28042c(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return m28042c(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return m28059A();
                } else {
                    i = 66;
                }
            } else if (keyEvent.hasModifiers(2)) {
                return m28019z();
            } else {
                i = 17;
            }
            return m28042c(i);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2370i0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f2388u0);
        Scroller scroller = this.f2393y;
        if (scroller != null && !scroller.isFinished()) {
            this.f2393y.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        int i;
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.f2340B <= 0 || this.f2341C == null || this.f2379q.size() <= 0 || this.f2385t == null) {
            return;
        }
        int scrollX = getScrollX();
        float width2 = getWidth();
        float f3 = this.f2340B / width2;
        int i2 = 0;
        C0493f c0493f = this.f2379q.get(0);
        float f4 = c0493f.f2405e;
        int size = this.f2379q.size();
        int i3 = c0493f.f2402b;
        int i4 = this.f2379q.get(size - 1).f2402b;
        while (i3 < i4) {
            while (true) {
                i = c0493f.f2402b;
                if (i3 <= i || i2 >= size) {
                    break;
                }
                i2++;
                c0493f = this.f2379q.get(i2);
            }
            if (i3 == i) {
                float f5 = c0493f.f2405e;
                float f6 = c0493f.f2404d;
                f = (f5 + f6) * width2;
                f4 = f5 + f6 + f3;
            } else {
                float m17415f = this.f2385t.m17415f(i3);
                f = (f4 + m17415f) * width2;
                f4 += m17415f + f3;
            }
            if (this.f2340B + f > scrollX) {
                f2 = f3;
                this.f2341C.setBounds(Math.round(f), this.f2342D, Math.round(this.f2340B + f), this.f2343E);
                this.f2341C.draw(canvas);
            } else {
                f2 = f3;
            }
            if (f > scrollX + width) {
                return;
            }
            i3++;
            f3 = f2;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m28051I();
            return false;
        }
        if (action != 0) {
            if (this.f2352N) {
                return true;
            }
            if (this.f2353O) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f2359U = x;
            this.f2357S = x;
            float y = motionEvent.getY();
            this.f2360V = y;
            this.f2358T = y;
            this.f2361W = motionEvent.getPointerId(0);
            this.f2353O = false;
            this.f2394z = true;
            this.f2393y.computeScrollOffset();
            if (this.f2390v0 != 2 || Math.abs(this.f2393y.getFinalX() - this.f2393y.getCurrX()) <= this.f2366e0) {
                m28039f(false);
                this.f2352N = false;
            } else {
                this.f2393y.abortAnimation();
                this.f2350L = false;
                m28056D();
                this.f2352N = true;
                m28052H(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f2361W;
            if (i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(findPointerIndex);
                float f = x2 - this.f2357S;
                float abs = Math.abs(f);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f2360V);
                if (f != 0.0f && !m28022w(this.f2357S, f) && m28040e(this, false, (int) f, (int) x2, (int) y2)) {
                    this.f2357S = x2;
                    this.f2358T = y2;
                    this.f2353O = true;
                    return false;
                }
                int i2 = this.f2356R;
                if (abs > i2 && abs * 0.5f > abs2) {
                    this.f2352N = true;
                    m28052H(true);
                    setScrollState(1);
                    this.f2357S = f > 0.0f ? this.f2359U + this.f2356R : this.f2359U - this.f2356R;
                    this.f2358T = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > i2) {
                    this.f2353O = true;
                }
                if (this.f2352N && m28057C(x2)) {
                    xs1.m4720i0(this);
                }
            }
        } else if (action == 6) {
            m28020y(motionEvent);
        }
        if (this.f2362a0 == null) {
            this.f2362a0 = VelocityTracker.obtain();
        }
        this.f2362a0.addMovement(motionEvent);
        return this.f2352N;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        C0493f m28027r;
        int max;
        int i5;
        int max2;
        int i6;
        int childCount = getChildCount();
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0494g c0494g = (C0494g) childAt.getLayoutParams();
                if (c0494g.f2406a) {
                    int i11 = c0494g.f2407b;
                    int i12 = i11 & 7;
                    int i13 = i11 & 112;
                    if (i12 != 1) {
                        if (i12 == 3) {
                            i5 = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i12 != 5) {
                            i5 = paddingLeft;
                        } else {
                            max = (i7 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i13 == 16) {
                            if (i13 == 48) {
                                i6 = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i13 != 80) {
                                i6 = paddingTop;
                            } else {
                                max2 = (i8 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i14 = paddingLeft + scrollX;
                            childAt.layout(i14, paddingTop, childAt.getMeasuredWidth() + i14, paddingTop + childAt.getMeasuredHeight());
                            i9++;
                            paddingTop = i6;
                            paddingLeft = i5;
                        } else {
                            max2 = Math.max((i8 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i15 = max2;
                        i6 = paddingTop;
                        paddingTop = i15;
                        int i142 = paddingLeft + scrollX;
                        childAt.layout(i142, paddingTop, childAt.getMeasuredWidth() + i142, paddingTop + childAt.getMeasuredHeight());
                        i9++;
                        paddingTop = i6;
                        paddingLeft = i5;
                    } else {
                        max = Math.max((i7 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i16 = max;
                    i5 = paddingLeft;
                    paddingLeft = i16;
                    if (i13 == 16) {
                    }
                    int i152 = max2;
                    i6 = paddingTop;
                    paddingTop = i152;
                    int i1422 = paddingLeft + scrollX;
                    childAt.layout(i1422, paddingTop, childAt.getMeasuredWidth() + i1422, paddingTop + childAt.getMeasuredHeight());
                    i9++;
                    paddingTop = i6;
                    paddingLeft = i5;
                }
            }
        }
        int i17 = (i7 - paddingLeft) - paddingRight;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                C0494g c0494g2 = (C0494g) childAt2.getLayoutParams();
                if (!c0494g2.f2406a && (m28027r = m28027r(childAt2)) != null) {
                    float f = i17;
                    int i19 = ((int) (m28027r.f2405e * f)) + paddingLeft;
                    if (c0494g2.f2409d) {
                        c0494g2.f2409d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * c0494g2.f2408c), 1073741824), View.MeasureSpec.makeMeasureSpec((i8 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i19, paddingTop, childAt2.getMeasuredWidth() + i19, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f2342D = paddingTop;
        this.f2343E = i8 - paddingBottom;
        this.f2373l0 = i9;
        if (this.f2370i0) {
            z2 = false;
            m28050J(this.f2387u, false, 0, false);
        } else {
            z2 = false;
        }
        this.f2370i0 = z2;
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
    */
    public void onMeasure(int i, int i2) {
        C0494g c0494g;
        C0494g c0494g2;
        int i3;
        int i4;
        int i5;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i), ViewGroup.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f2355Q = Math.min(measuredWidth / 10, this.f2354P);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            boolean z = true;
            int i7 = 1073741824;
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8 && (c0494g2 = (C0494g) childAt.getLayoutParams()) != null && c0494g2.f2406a) {
                int i8 = c0494g2.f2407b;
                int i9 = i8 & 7;
                int i10 = i8 & 112;
                boolean z2 = i10 == 48 || i10 == 80;
                if (i9 != 3 && i9 != 5) {
                    z = false;
                }
                int i11 = Integer.MIN_VALUE;
                if (z2) {
                    i11 = 1073741824;
                } else if (z) {
                    i3 = 1073741824;
                    i4 = ((ViewGroup.LayoutParams) c0494g2).width;
                    if (i4 == -2) {
                        if (i4 == -1) {
                            i4 = paddingLeft;
                        }
                        i11 = 1073741824;
                    } else {
                        i4 = paddingLeft;
                    }
                    i5 = ((ViewGroup.LayoutParams) c0494g2).height;
                    if (i5 != -2) {
                        i5 = measuredHeight;
                        i7 = i3;
                    } else if (i5 == -1) {
                        i5 = measuredHeight;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i11), View.MeasureSpec.makeMeasureSpec(i5, i7));
                    if (!z2) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (z) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
                i3 = Integer.MIN_VALUE;
                i4 = ((ViewGroup.LayoutParams) c0494g2).width;
                if (i4 == -2) {
                }
                i5 = ((ViewGroup.LayoutParams) c0494g2).height;
                if (i5 != -2) {
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i11), View.MeasureSpec.makeMeasureSpec(i5, i7));
                if (!z2) {
                }
            }
            i6++;
        }
        this.f2346H = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f2347I = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f2348J = true;
        m28056D();
        this.f2348J = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((c0494g = (C0494g) childAt2.getLayoutParams()) == null || !c0494g.f2406a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c0494g.f2408c), 1073741824), this.f2347I);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C0493f m28027r;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
        }
        while (i2 != i4) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (m28027r = m28027r(childAt)) != null && m28027r.f2402b == this.f2387u && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
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
        super.onRestoreInstanceState(savedState.m29657a());
        kv0 kv0Var = this.f2385t;
        if (kv0Var != null) {
            kv0Var.mo5598j(savedState.f2396s, savedState.f2397t);
            m28048L(savedState.f2395r, false, true);
            return;
        }
        this.f2389v = savedState.f2395r;
        this.f2391w = savedState.f2396s;
        this.f2392x = savedState.f2397t;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2395r = this.f2387u;
        kv0 kv0Var = this.f2385t;
        if (kv0Var != null) {
            savedState.f2396s = kv0Var.mo5597k();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f2340B;
            m28054F(i, i3, i5, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        kv0 kv0Var;
        int pointerId;
        if (this.f2367f0) {
            return true;
        }
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (kv0Var = this.f2385t) == null || kv0Var.mo17418c() == 0) {
            return false;
        }
        if (this.f2362a0 == null) {
            this.f2362a0 = VelocityTracker.obtain();
        }
        this.f2362a0.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (!this.f2352N) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f2361W);
                        if (findPointerIndex != -1) {
                            float x = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x - this.f2357S);
                            float y = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y - this.f2358T);
                            if (abs > this.f2356R && abs > abs2) {
                                this.f2352N = true;
                                m28052H(true);
                                float f = this.f2359U;
                                this.f2357S = x - f > 0.0f ? f + this.f2356R : f - this.f2356R;
                                this.f2358T = y;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                        z = m28051I();
                    }
                    if (this.f2352N) {
                        z = false | m28057C(motionEvent.getX(motionEvent.findPointerIndex(this.f2361W)));
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f2357S = motionEvent.getX(actionIndex);
                        pointerId = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        m28020y(motionEvent);
                        this.f2357S = motionEvent.getX(motionEvent.findPointerIndex(this.f2361W));
                    }
                } else if (this.f2352N) {
                    m28050J(this.f2387u, true, 0, false);
                    z = m28051I();
                }
            } else if (this.f2352N) {
                VelocityTracker velocityTracker = this.f2362a0;
                velocityTracker.computeCurrentVelocity(1000, this.f2364c0);
                int xVelocity = (int) velocityTracker.getXVelocity(this.f2361W);
                this.f2350L = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C0493f m28026s = m28026s();
                float f2 = clientWidth;
                m28047M(m28037h(m28026s.f2402b, ((scrollX / f2) - m28026s.f2405e) / (m28026s.f2404d + (this.f2340B / f2)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.f2361W)) - this.f2359U)), true, true, xVelocity);
                z = m28051I();
            }
            if (z) {
                xs1.m4720i0(this);
            }
            return true;
        }
        this.f2393y.abortAnimation();
        this.f2350L = false;
        m28056D();
        float x2 = motionEvent.getX();
        this.f2359U = x2;
        this.f2357S = x2;
        float y2 = motionEvent.getY();
        this.f2360V = y2;
        this.f2358T = y2;
        pointerId = motionEvent.getPointerId(0);
        this.f2361W = pointerId;
        if (z) {
        }
        return true;
    }

    /* renamed from: p */
    public final Rect m28029p(Rect rect, View view) {
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

    /* renamed from: q */
    public C0493f m28028q(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return m28027r(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* renamed from: r */
    public C0493f m28027r(View view) {
        for (int i = 0; i < this.f2379q.size(); i++) {
            C0493f c0493f = this.f2379q.get(i);
            if (this.f2385t.mo5599h(view, c0493f.f2401a)) {
                return c0493f;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f2348J) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* renamed from: s */
    public final C0493f m28026s() {
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.f2340B / clientWidth : 0.0f;
        C0493f c0493f = null;
        float f3 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.f2379q.size()) {
            C0493f c0493f2 = this.f2379q.get(i3);
            if (!z && c0493f2.f2402b != (i = i2 + 1)) {
                c0493f2 = this.f2381r;
                c0493f2.f2405e = f + f3 + f2;
                c0493f2.f2402b = i;
                c0493f2.f2404d = this.f2385t.m17415f(i);
                i3--;
            }
            f = c0493f2.f2405e;
            float f4 = c0493f2.f2404d + f + f2;
            if (!z && scrollX < f) {
                return c0493f;
            }
            if (scrollX < f4 || i3 == this.f2379q.size() - 1) {
                return c0493f2;
            }
            i2 = c0493f2.f2402b;
            f3 = c0493f2.f2404d;
            i3++;
            c0493f = c0493f2;
            z = false;
        }
        return c0493f;
    }

    public void setAdapter(kv0 kv0Var) {
        kv0 kv0Var2 = this.f2385t;
        if (kv0Var2 != null) {
            kv0Var2.m17413m(null);
            this.f2385t.mo5595n(this);
            for (int i = 0; i < this.f2379q.size(); i++) {
                C0493f c0493f = this.f2379q.get(i);
                this.f2385t.mo5602a(this, c0493f.f2402b, c0493f.f2401a);
            }
            this.f2385t.mo5601b(this);
            this.f2379q.clear();
            m28053G();
            this.f2387u = 0;
            scrollTo(0, 0);
        }
        kv0 kv0Var3 = this.f2385t;
        this.f2385t = kv0Var;
        this.f2377p = 0;
        if (kv0Var != null) {
            if (this.f2339A == null) {
                this.f2339A = new C0499l();
            }
            this.f2385t.m17413m(this.f2339A);
            this.f2350L = false;
            boolean z = this.f2370i0;
            this.f2370i0 = true;
            this.f2377p = this.f2385t.mo17418c();
            if (this.f2389v >= 0) {
                this.f2385t.mo5598j(this.f2391w, this.f2392x);
                m28048L(this.f2389v, false, true);
                this.f2389v = -1;
                this.f2391w = null;
                this.f2392x = null;
            } else if (z) {
                requestLayout();
            } else {
                m28056D();
            }
        }
        List<InterfaceC0496i> list = this.f2378p0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f2378p0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f2378p0.get(i2).m28013a(this, kv0Var3, kv0Var);
        }
    }

    public void setCurrentItem(int i) {
        this.f2350L = false;
        m28048L(i, !this.f2370i0, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested offscreen page limit ");
            sb.append(i);
            sb.append(" too small; defaulting to ");
            sb.append(1);
            i = 1;
        }
        if (i != this.f2351M) {
            this.f2351M = i;
            m28056D();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC0497j interfaceC0497j) {
        this.f2375n0 = interfaceC0497j;
    }

    public void setPageMargin(int i) {
        int i2 = this.f2340B;
        this.f2340B = i;
        int width = getWidth();
        m28054F(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C3866zk.m2178e(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f2341C = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.f2390v0 == i) {
            return;
        }
        this.f2390v0 = i;
        if (this.f2380q0 != null) {
            m28032m(i != 0);
        }
        m28034k(i);
    }

    /* renamed from: t */
    public C0493f m28025t(int i) {
        for (int i2 = 0; i2 < this.f2379q.size(); i2++) {
            C0493f c0493f = this.f2379q.get(i2);
            if (c0493f.f2402b == i) {
                return c0493f;
            }
        }
        return null;
    }

    /* renamed from: u */
    public void m28024u() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f2393y = new Scroller(context, f2337y0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f2356R = viewConfiguration.getScaledPagingTouchSlop();
        this.f2363b0 = (int) (400.0f * f);
        this.f2364c0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2368g0 = new EdgeEffect(context);
        this.f2369h0 = new EdgeEffect(context);
        this.f2365d0 = (int) (25.0f * f);
        this.f2366e0 = (int) (2.0f * f);
        this.f2354P = (int) (f * 16.0f);
        xs1.m4702r0(this, new C0495h());
        if (xs1.m4772C(this) == 0) {
            xs1.m4773B0(this, 1);
        }
        xs1.m4769D0(this, new C0491d());
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2341C;
    }

    /* renamed from: w */
    public final boolean m28022w(float f, float f2) {
        return (f < ((float) this.f2355Q) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f2355Q)) && f2 < 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m28021x(int i, float f, int i2) {
        int max;
        int i3;
        int left;
        if (this.f2373l0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                C0494g c0494g = (C0494g) childAt.getLayoutParams();
                if (c0494g.f2406a) {
                    int i5 = c0494g.f2407b & 7;
                    if (i5 != 1) {
                        if (i5 == 3) {
                            i3 = childAt.getWidth() + paddingLeft;
                        } else if (i5 != 5) {
                            i3 = paddingLeft;
                        } else {
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i3;
                    } else {
                        max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i6 = max;
                    i3 = paddingLeft;
                    paddingLeft = i6;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i3;
                }
            }
        }
        m28036i(i, f, i2);
        if (this.f2380q0 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i7 = 0; i7 < childCount2; i7++) {
                View childAt2 = getChildAt(i7);
                if (!((C0494g) childAt2.getLayoutParams()).f2406a) {
                    this.f2380q0.m28012a(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.f2372k0 = true;
    }

    /* renamed from: y */
    public final void m28020y(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2361W) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f2357S = motionEvent.getX(i);
            this.f2361W = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f2362a0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: z */
    public boolean m28019z() {
        int i = this.f2387u;
        if (i > 0) {
            m28049K(i - 1, true);
            return true;
        }
        return false;
    }
}
