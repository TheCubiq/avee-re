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
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.p;
import com.daaw.d11;
import com.daaw.es0;
import com.daaw.fs0;
import com.daaw.lm1;
import com.daaw.qq0;
import com.daaw.t21;
import com.daaw.ty0;
import com.daaw.v01;
import com.daaw.xs1;
import com.daaw.y;
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
    public static final int[] N0 = {16843830};
    public static final boolean O0;
    public static final boolean P0;
    public static final boolean Q0;
    public static final boolean R0;
    public static final boolean S0;
    public static final boolean T0;
    public static final Class<?>[] U0;
    public static final Interpolator V0;
    public g A;
    public boolean A0;
    public o B;
    public l.b B0;
    public w C;
    public boolean C0;
    public final ArrayList<n> D;
    public androidx.recyclerview.widget.k D0;
    public final ArrayList<s> E;
    public j E0;
    public s F;
    public final int[] F0;
    public boolean G;
    public fs0 G0;
    public boolean H;
    public final int[] H0;
    public boolean I;
    public final int[] I0;
    public boolean J;
    public final int[] J0;
    public int K;
    public final List<c0> K0;
    public boolean L;
    public Runnable L0;
    public boolean M;
    public final p.b M0;
    public boolean N;
    public int O;
    public boolean P;
    public final AccessibilityManager Q;
    public List<q> R;
    public boolean S;
    public boolean T;
    public int U;
    public int V;
    public k W;
    public EdgeEffect a0;
    public EdgeEffect b0;
    public EdgeEffect c0;
    public EdgeEffect d0;
    public l e0;
    public int f0;
    public int g0;
    public VelocityTracker h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public r n0;
    public final int o0;
    public final x p;
    public final int p0;
    public final v q;
    public float q0;
    public SavedState r;
    public float r0;
    public androidx.recyclerview.widget.a s;
    public boolean s0;
    public androidx.recyclerview.widget.b t;
    public final b0 t0;
    public final androidx.recyclerview.widget.p u;
    public androidx.recyclerview.widget.e u0;
    public boolean v;
    public e.b v0;
    public final Runnable w;
    public final z w0;
    public final Rect x;
    public t x0;
    public final Rect y;
    public List<t> y0;
    public final RectF z;
    public boolean z0;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public Parcelable r;

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
            this.r = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void b(SavedState savedState) {
            this.r = savedState.r;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.r, 0);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.J || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.G) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.M) {
                recyclerView2.L = true;
            } else {
                recyclerView2.u();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a0 {
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = RecyclerView.this.e0;
            if (lVar != null) {
                lVar.u();
            }
            RecyclerView.this.C0 = false;
        }
    }

    /* loaded from: classes.dex */
    public class b0 implements Runnable {
        public int p;
        public int q;
        public OverScroller r;
        public Interpolator s;
        public boolean t;
        public boolean u;

        public b0() {
            Interpolator interpolator = RecyclerView.V0;
            this.s = interpolator;
            this.t = false;
            this.u = false;
            this.r = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final int a(int i, int i2, int i3, int i4) {
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
            float b = f2 + (b(Math.min(1.0f, (sqrt2 * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(b / sqrt) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((abs / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        public final float b(float f) {
            return (float) Math.sin((f - 0.5f) * 0.47123894f);
        }

        public void c(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.q = 0;
            this.p = 0;
            Interpolator interpolator = this.s;
            Interpolator interpolator2 = RecyclerView.V0;
            if (interpolator != interpolator2) {
                this.s = interpolator2;
                this.r = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.r.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            e();
        }

        public final void d() {
            RecyclerView.this.removeCallbacks(this);
            xs1.j0(RecyclerView.this, this);
        }

        public void e() {
            if (this.t) {
                this.u = true;
            } else {
                d();
            }
        }

        public void f(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = a(i, i2, 0, 0);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.V0;
            }
            if (this.s != interpolator) {
                this.s = interpolator;
                this.r = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.q = 0;
            this.p = 0;
            RecyclerView.this.setScrollState(2);
            this.r.startScroll(0, 0, i, i2, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.r.computeScrollOffset();
            }
            e();
        }

        public void g() {
            RecyclerView.this.removeCallbacks(this);
            this.r.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.B == null) {
                g();
                return;
            }
            this.u = false;
            this.t = true;
            recyclerView.u();
            OverScroller overScroller = this.r;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.p;
                int i4 = currY - this.q;
                this.p = currX;
                this.q = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.J0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.F(i3, i4, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.J0;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.t(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.A != null) {
                    int[] iArr3 = recyclerView3.J0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.i1(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.J0;
                    i2 = iArr4[0];
                    i = iArr4[1];
                    i3 -= i2;
                    i4 -= i;
                    y yVar = recyclerView4.B.g;
                    if (yVar != null && !yVar.g() && yVar.h()) {
                        int b = RecyclerView.this.w0.b();
                        if (b == 0) {
                            yVar.r();
                        } else {
                            if (yVar.f() >= b) {
                                yVar.p(b - 1);
                            }
                            yVar.j(i2, i);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.D.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.J0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.G(i2, i, i3, i4, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.J0;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (i2 != 0 || i != 0) {
                    recyclerView6.I(i2, i);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                y yVar2 = RecyclerView.this.B.g;
                if ((yVar2 != null && yVar2.g()) || !z) {
                    e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.e eVar = recyclerView7.u0;
                    if (eVar != null) {
                        eVar.f(recyclerView7, i2, i);
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
                        RecyclerView.this.a(i7, currVelocity);
                    }
                    if (RecyclerView.R0) {
                        RecyclerView.this.v0.b();
                    }
                }
            }
            y yVar3 = RecyclerView.this.B.g;
            if (yVar3 != null && yVar3.g()) {
                yVar3.j(0, 0);
            }
            this.t = false;
            if (this.u) {
                d();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.v1(1);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c0 {
        public static final List<Object> s = Collections.emptyList();
        public final View a;
        public WeakReference<RecyclerView> b;
        public int j;
        public RecyclerView r;
        public int c = -1;
        public int d = -1;
        public long e = -1;
        public int f = -1;
        public int g = -1;
        public c0 h = null;
        public c0 i = null;
        public List<Object> k = null;
        public List<Object> l = null;
        public int m = 0;
        public v n = null;
        public boolean o = false;
        public int p = 0;
        public int q = -1;

        public c0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.a = view;
        }

        public boolean A() {
            return (this.j & 2) != 0;
        }

        public boolean B() {
            return (this.j & 2) != 0;
        }

        public void C(int i, boolean z) {
            if (this.d == -1) {
                this.d = this.c;
            }
            if (this.g == -1) {
                this.g = this.c;
            }
            if (z) {
                this.g += i;
            }
            this.c += i;
            if (this.a.getLayoutParams() != null) {
                ((p) this.a.getLayoutParams()).c = true;
            }
        }

        public void D(RecyclerView recyclerView) {
            int i = this.q;
            if (i == -1) {
                i = xs1.C(this.a);
            }
            this.p = i;
            recyclerView.l1(this, 4);
        }

        public void E(RecyclerView recyclerView) {
            recyclerView.l1(this, this.p);
            this.p = 0;
        }

        public void F() {
            this.j = 0;
            this.c = -1;
            this.d = -1;
            this.e = -1L;
            this.g = -1;
            this.m = 0;
            this.h = null;
            this.i = null;
            f();
            this.p = 0;
            this.q = -1;
            RecyclerView.r(this);
        }

        public void G() {
            if (this.d == -1) {
                this.d = this.c;
            }
        }

        public void H(int i, int i2) {
            this.j = (i & i2) | (this.j & (i2 ^ (-1)));
        }

        public final void I(boolean z) {
            int i;
            int i2 = this.m;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.m = i3;
            if (i3 < 0) {
                this.m = 0;
                StringBuilder sb = new StringBuilder();
                sb.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                sb.append(this);
                return;
            }
            if (!z && i3 == 1) {
                i = this.j | 16;
            } else if (!z || i3 != 0) {
                return;
            } else {
                i = this.j & (-17);
            }
            this.j = i;
        }

        public void J(v vVar, boolean z) {
            this.n = vVar;
            this.o = z;
        }

        public boolean K() {
            return (this.j & 16) != 0;
        }

        public boolean L() {
            return (this.j & 128) != 0;
        }

        public void M() {
            this.n.J(this);
        }

        public boolean N() {
            return (this.j & 32) != 0;
        }

        public void c(Object obj) {
            if (obj == null) {
                d(NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV);
            } else if ((1024 & this.j) == 0) {
                i();
                this.k.add(obj);
            }
        }

        public void d(int i) {
            this.j = i | this.j;
        }

        public void e() {
            this.d = -1;
            this.g = -1;
        }

        public void f() {
            List<Object> list = this.k;
            if (list != null) {
                list.clear();
            }
            this.j &= -1025;
        }

        public void g() {
            this.j &= -33;
        }

        public void h() {
            this.j &= -257;
        }

        public final void i() {
            if (this.k == null) {
                ArrayList arrayList = new ArrayList();
                this.k = arrayList;
                this.l = Collections.unmodifiableList(arrayList);
            }
        }

        public boolean j() {
            return (this.j & 16) == 0 && xs1.S(this.a);
        }

        public void k(int i, int i2, boolean z) {
            d(8);
            C(i2, z);
            this.c = i;
        }

        public final int l() {
            RecyclerView recyclerView = this.r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.b0(this);
        }

        public final long m() {
            return this.e;
        }

        public final int n() {
            return this.f;
        }

        public final int o() {
            int i = this.g;
            return i == -1 ? this.c : i;
        }

        public final int p() {
            return this.d;
        }

        public List<Object> q() {
            if ((this.j & NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV) == 0) {
                List<Object> list = this.k;
                return (list == null || list.size() == 0) ? s : this.l;
            }
            return s;
        }

        public boolean r(int i) {
            return (i & this.j) != 0;
        }

        public boolean s() {
            return (this.j & 512) != 0 || v();
        }

        public boolean t() {
            return (this.a.getParent() == null || this.a.getParent() == this.r) ? false : true;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
            if (y()) {
                sb.append(" scrap ");
                sb.append(this.o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (v()) {
                sb.append(" invalid");
            }
            if (!u()) {
                sb.append(" unbound");
            }
            if (B()) {
                sb.append(" update");
            }
            if (x()) {
                sb.append(" removed");
            }
            if (L()) {
                sb.append(" ignored");
            }
            if (z()) {
                sb.append(" tmpDetached");
            }
            if (!w()) {
                sb.append(" not recyclable(" + this.m + ")");
            }
            if (s()) {
                sb.append(" undefined adapter position");
            }
            if (this.a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public boolean u() {
            return (this.j & 1) != 0;
        }

        public boolean v() {
            return (this.j & 4) != 0;
        }

        public final boolean w() {
            return (this.j & 16) == 0 && !xs1.S(this.a);
        }

        public boolean x() {
            return (this.j & 8) != 0;
        }

        public boolean y() {
            return this.n != null;
        }

        public boolean z() {
            return (this.j & 256) != 0;
        }
    }

    /* loaded from: classes.dex */
    public class d implements p.b {
        public d() {
        }

        @Override // androidx.recyclerview.widget.p.b
        public void a(c0 c0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.B.m1(c0Var.a, recyclerView.q);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void b(c0 c0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.l(c0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void c(c0 c0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.q.J(c0Var);
            RecyclerView.this.n(c0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void d(c0 c0Var, l.c cVar, l.c cVar2) {
            c0Var.I(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z = recyclerView.S;
            l lVar = recyclerView.e0;
            if (z) {
                if (!lVar.b(c0Var, c0Var, cVar, cVar2)) {
                    return;
                }
            } else if (!lVar.d(c0Var, cVar, cVar2)) {
                return;
            }
            RecyclerView.this.O0();
        }
    }

    /* loaded from: classes.dex */
    public class e implements b.InterfaceC0022b {
        public e() {
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0022b
        public View a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0022b
        public void b(View view) {
            c0 h0 = RecyclerView.h0(view);
            if (h0 != null) {
                h0.D(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0022b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0022b
        public void d() {
            int c = c();
            for (int i = 0; i < c; i++) {
                View a = a(i);
                RecyclerView.this.z(a);
                a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0022b
        public int e(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0022b
        public c0 f(View view) {
            return RecyclerView.h0(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0022b
        public void g(int i) {
            c0 h0;
            View a = a(i);
            if (a != null && (h0 = RecyclerView.h0(a)) != null) {
                if (h0.z() && !h0.L()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + h0 + RecyclerView.this.P());
                }
                h0.d(256);
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0022b
        public void h(View view) {
            c0 h0 = RecyclerView.h0(view);
            if (h0 != null) {
                h0.E(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0022b
        public void i(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.y(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0022b
        public void j(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.z(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0022b
        public void k(View view, int i, ViewGroup.LayoutParams layoutParams) {
            c0 h0 = RecyclerView.h0(view);
            if (h0 != null) {
                if (!h0.z() && !h0.L()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + h0 + RecyclerView.this.P());
                }
                h0.h();
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }
    }

    /* loaded from: classes.dex */
    public class f implements a.InterfaceC0021a {
        public f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0021a
        public void a(int i, int i2) {
            RecyclerView.this.E0(i, i2);
            RecyclerView.this.z0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0021a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0021a
        public void c(int i, int i2, Object obj) {
            RecyclerView.this.y1(i, i2, obj);
            RecyclerView.this.A0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0021a
        public void d(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0021a
        public c0 e(int i) {
            c0 Z = RecyclerView.this.Z(i, true);
            if (Z == null || RecyclerView.this.t.n(Z.a)) {
                return null;
            }
            return Z;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0021a
        public void f(int i, int i2) {
            RecyclerView.this.F0(i, i2, false);
            RecyclerView.this.z0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0021a
        public void g(int i, int i2) {
            RecyclerView.this.D0(i, i2);
            RecyclerView.this.z0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0021a
        public void h(int i, int i2) {
            RecyclerView.this.F0(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.z0 = true;
            recyclerView.w0.d += i2;
        }

        public void i(a.b bVar) {
            int i = bVar.a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.B.R0(recyclerView, bVar.b, bVar.d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.B.U0(recyclerView2, bVar.b, bVar.d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.B.W0(recyclerView3, bVar.b, bVar.d, bVar.c);
            } else if (i != 8) {
            } else {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.B.T0(recyclerView4, bVar.b, bVar.d, 1);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g<VH extends c0> {
        public final h a = new h();
        public boolean b = false;

        public final void b(VH vh, int i) {
            vh.c = i;
            if (h()) {
                vh.e = e(i);
            }
            vh.H(1, 519);
            lm1.a("RV OnBindView");
            n(vh, i, vh.q());
            vh.f();
            ViewGroup.LayoutParams layoutParams = vh.a.getLayoutParams();
            if (layoutParams instanceof p) {
                ((p) layoutParams).c = true;
            }
            lm1.b();
        }

        public final VH c(ViewGroup viewGroup, int i) {
            try {
                lm1.a("RV CreateView");
                VH o = o(viewGroup, i);
                if (o.a.getParent() == null) {
                    o.f = i;
                    return o;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                lm1.b();
            }
        }

        public abstract int d();

        public long e(int i) {
            return -1L;
        }

        public int f(int i) {
            return 0;
        }

        public final boolean g() {
            return this.a.a();
        }

        public final boolean h() {
            return this.b;
        }

        public final void i() {
            this.a.b();
        }

        public final void j(int i) {
            this.a.c(i, 1);
        }

        public final void k(int i, int i2) {
            this.a.c(i, i2);
        }

        public void l(RecyclerView recyclerView) {
        }

        public abstract void m(VH vh, int i);

        public void n(VH vh, int i, List<Object> list) {
            m(vh, i);
        }

        public abstract VH o(ViewGroup viewGroup, int i);

        public void p(RecyclerView recyclerView) {
        }

        public boolean q(VH vh) {
            return false;
        }

        public void r(VH vh) {
        }

        public void s(VH vh) {
        }

        public void t(VH vh) {
        }

        public void u(i iVar) {
            this.a.registerObserver(iVar);
        }

        public void v(boolean z) {
            if (g()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.b = z;
        }

        public void w(i iVar) {
            this.a.unregisterObserver(iVar);
        }
    }

    /* loaded from: classes.dex */
    public static class h extends Observable<i> {
        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i, int i2) {
            d(i, i2, null);
        }

        public void d(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).c(i, i2, obj);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i {
        public void a() {
        }

        public void b(int i, int i2) {
        }

        public void c(int i, int i2, Object obj) {
            b(i, i2);
        }
    }

    /* loaded from: classes.dex */
    public interface j {
        int a(int i, int i2);
    }

    /* loaded from: classes.dex */
    public static class k {
        public EdgeEffect a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class l {
        public b a = null;
        public ArrayList<a> b = new ArrayList<>();
        public long c = 120;
        public long d = 120;
        public long e = 250;
        public long f = 250;

        /* loaded from: classes.dex */
        public interface a {
            void a();
        }

        /* loaded from: classes.dex */
        public interface b {
            void a(c0 c0Var);
        }

        /* loaded from: classes.dex */
        public static class c {
            public int a;
            public int b;
            public int c;
            public int d;

            public c a(c0 c0Var) {
                return b(c0Var, 0);
            }

            public c b(c0 c0Var, int i) {
                View view = c0Var.a;
                this.a = view.getLeft();
                this.b = view.getTop();
                this.c = view.getRight();
                this.d = view.getBottom();
                return this;
            }
        }

        public static int e(c0 c0Var) {
            int i = c0Var.j & 14;
            if (c0Var.v()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int p = c0Var.p();
                int l = c0Var.l();
                return (p == -1 || l == -1 || p == l) ? i : i | 2048;
            }
            return i;
        }

        public abstract boolean a(c0 c0Var, c cVar, c cVar2);

        public abstract boolean b(c0 c0Var, c0 c0Var2, c cVar, c cVar2);

        public abstract boolean c(c0 c0Var, c cVar, c cVar2);

        public abstract boolean d(c0 c0Var, c cVar, c cVar2);

        public abstract boolean f(c0 c0Var);

        public boolean g(c0 c0Var, List<Object> list) {
            return f(c0Var);
        }

        public final void h(c0 c0Var) {
            r(c0Var);
            b bVar = this.a;
            if (bVar != null) {
                bVar.a(c0Var);
            }
        }

        public final void i() {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                this.b.get(i).a();
            }
            this.b.clear();
        }

        public abstract void j(c0 c0Var);

        public abstract void k();

        public long l() {
            return this.c;
        }

        public long m() {
            return this.f;
        }

        public long n() {
            return this.e;
        }

        public long o() {
            return this.d;
        }

        public abstract boolean p();

        public c q() {
            return new c();
        }

        public void r(c0 c0Var) {
        }

        public c s(z zVar, c0 c0Var) {
            return q().a(c0Var);
        }

        public c t(z zVar, c0 c0Var, int i, List<Object> list) {
            return q().a(c0Var);
        }

        public abstract void u();

        public void v(b bVar) {
            this.a = bVar;
        }
    }

    /* loaded from: classes.dex */
    public class m implements l.b {
        public m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l.b
        public void a(c0 c0Var) {
            c0Var.I(true);
            if (c0Var.h != null && c0Var.i == null) {
                c0Var.h = null;
            }
            c0Var.i = null;
            if (c0Var.K() || RecyclerView.this.X0(c0Var.a) || !c0Var.z()) {
                return;
            }
            RecyclerView.this.removeDetachedView(c0Var.a, false);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class n {
        @Deprecated
        public void d(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, z zVar) {
            d(rect, ((p) view.getLayoutParams()).a(), recyclerView);
        }

        @Deprecated
        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, z zVar) {
            f(canvas, recyclerView);
        }

        @Deprecated
        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, z zVar) {
            h(canvas, recyclerView);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o {
        public androidx.recyclerview.widget.b a;
        public RecyclerView b;
        public final o.b c;
        public final o.b d;
        public androidx.recyclerview.widget.o e;
        public androidx.recyclerview.widget.o f;
        public y g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public int m;
        public boolean n;
        public int o;
        public int p;
        public int q;
        public int r;

        /* loaded from: classes.dex */
        public class a implements o.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public View a(int i) {
                return o.this.I(i);
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b(View view) {
                return o.this.Q(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c() {
                return o.this.e0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d() {
                return o.this.o0() - o.this.f0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int e(View view) {
                return o.this.T(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).rightMargin;
            }
        }

        /* loaded from: classes.dex */
        public class b implements o.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public View a(int i) {
                return o.this.I(i);
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b(View view) {
                return o.this.U(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c() {
                return o.this.g0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d() {
                return o.this.W() - o.this.d0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int e(View view) {
                return o.this.O(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).bottomMargin;
            }
        }

        /* loaded from: classes.dex */
        public interface c {
            void a(int i, int i2);
        }

        /* loaded from: classes.dex */
        public static class d {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        public o() {
            a aVar = new a();
            this.c = aVar;
            b bVar = new b();
            this.d = bVar;
            this.e = new androidx.recyclerview.widget.o(aVar);
            this.f = new androidx.recyclerview.widget.o(bVar);
            this.h = false;
            this.i = false;
            this.j = false;
            this.k = true;
            this.l = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (r5 == 1073741824) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int K(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L21
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L21
                goto L2f
            L1a:
                if (r7 < 0) goto L1f
            L1c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L31
            L1f:
                if (r7 != r1) goto L23
            L21:
                r7 = r4
                goto L31
            L23:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L2a
                goto L2c
            L2a:
                r5 = 0
                goto L21
            L2c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L21
            L2f:
                r5 = 0
                r7 = 0
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.K(int, int, int, int, boolean):int");
        }

        public static d i0(Context context, AttributeSet attributeSet, int i, int i2) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t21.f, i, i2);
            dVar.a = obtainStyledAttributes.getInt(t21.g, 1);
            dVar.b = obtainStyledAttributes.getInt(t21.q, 1);
            dVar.c = obtainStyledAttributes.getBoolean(t21.p, false);
            dVar.d = obtainStyledAttributes.getBoolean(t21.r, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int n(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        public static boolean w0(int i, int i2, int i3) {
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

        public void A(RecyclerView recyclerView, v vVar) {
            this.i = false;
            I0(recyclerView, vVar);
        }

        public void A0(View view, int i, int i2) {
            p pVar = (p) view.getLayoutParams();
            Rect l0 = this.b.l0(view);
            int i3 = i + l0.left + l0.right;
            int i4 = i2 + l0.top + l0.bottom;
            int K = K(o0(), p0(), e0() + f0() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i3, ((ViewGroup.MarginLayoutParams) pVar).width, k());
            int K2 = K(W(), X(), g0() + d0() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) pVar).height, l());
            if (F1(view, K, K2, pVar)) {
                view.measure(K, K2);
            }
        }

        public void A1(int i, int i2) {
            this.q = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.o = mode;
            if (mode == 0 && !RecyclerView.P0) {
                this.q = 0;
            }
            this.r = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.p = mode2;
            if (mode2 != 0 || RecyclerView.P0) {
                return;
            }
            this.r = 0;
        }

        public View B(View view) {
            View R;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (R = recyclerView.R(view)) == null || this.a.n(R)) {
                return null;
            }
            return R;
        }

        public void B0(int i, int i2) {
            View I = I(i);
            if (I != null) {
                x(i);
                h(I, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.b.toString());
        }

        public void B1(int i, int i2) {
            this.b.setMeasuredDimension(i, i2);
        }

        public View C(int i) {
            int J = J();
            for (int i2 = 0; i2 < J; i2++) {
                View I = I(i2);
                c0 h0 = RecyclerView.h0(I);
                if (h0 != null && h0.o() == i && !h0.L() && (this.b.w0.e() || !h0.x())) {
                    return I;
                }
            }
            return null;
        }

        public void C0(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.B0(i);
            }
        }

        public void C1(Rect rect, int i, int i2) {
            B1(n(i, rect.width() + e0() + f0(), c0()), n(i2, rect.height() + g0() + d0(), b0()));
        }

        public abstract p D();

        public void D0(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.C0(i);
            }
        }

        public void D1(int i, int i2) {
            int J = J();
            if (J == 0) {
                this.b.w(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < J; i7++) {
                View I = I(i7);
                Rect rect = this.b.x;
                P(I, rect);
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
            this.b.x.set(i5, i6, i3, i4);
            C1(this.b.x, i, i2);
        }

        public p E(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public void E0(g gVar, g gVar2) {
        }

        public void E1(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.b = null;
                this.a = null;
                height = 0;
                this.q = 0;
            } else {
                this.b = recyclerView;
                this.a = recyclerView.t;
                this.q = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.r = height;
            this.o = 1073741824;
            this.p = 1073741824;
        }

        public p F(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof p ? new p((p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new p((ViewGroup.MarginLayoutParams) layoutParams) : new p(layoutParams);
        }

        public boolean F0(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        public boolean F1(View view, int i, int i2, p pVar) {
            return (!view.isLayoutRequested() && this.k && w0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) pVar).width) && w0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public int G() {
            return -1;
        }

        public void G0(RecyclerView recyclerView) {
        }

        public boolean G1() {
            return false;
        }

        public int H(View view) {
            return ((p) view.getLayoutParams()).b.bottom;
        }

        @Deprecated
        public void H0(RecyclerView recyclerView) {
        }

        public boolean H1(View view, int i, int i2, p pVar) {
            return (this.k && w0(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) pVar).width) && w0(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public View I(int i) {
            androidx.recyclerview.widget.b bVar = this.a;
            if (bVar != null) {
                return bVar.f(i);
            }
            return null;
        }

        public void I0(RecyclerView recyclerView, v vVar) {
            H0(recyclerView);
        }

        public void I1(RecyclerView recyclerView, z zVar, int i) {
        }

        public int J() {
            androidx.recyclerview.widget.b bVar = this.a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public View J0(View view, int i, v vVar, z zVar) {
            return null;
        }

        public void J1(y yVar) {
            y yVar2 = this.g;
            if (yVar2 != null && yVar != yVar2 && yVar2.h()) {
                this.g.r();
            }
            this.g = yVar;
            yVar.q(this.b, this);
        }

        public void K0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            L0(recyclerView.q, recyclerView.w0, accessibilityEvent);
        }

        public void K1() {
            y yVar = this.g;
            if (yVar != null) {
                yVar.r();
            }
        }

        public final int[] L(View view, Rect rect) {
            int[] iArr = new int[2];
            int e0 = e0();
            int g0 = g0();
            int o0 = o0() - f0();
            int W = W() - d0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - e0;
            int min = Math.min(0, i);
            int i2 = top - g0;
            int min2 = Math.min(0, i2);
            int i3 = width - o0;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - W);
            if (Z() != 1) {
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

        public void L0(v vVar, z zVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            g gVar = this.b.A;
            if (gVar != null) {
                accessibilityEvent.setItemCount(gVar.d());
            }
        }

        public boolean L1() {
            return false;
        }

        public boolean M() {
            RecyclerView recyclerView = this.b;
            return recyclerView != null && recyclerView.v;
        }

        public void M0(v vVar, z zVar, com.daaw.y yVar) {
            if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
                yVar.a(8192);
                yVar.t0(true);
            }
            if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
                yVar.a(4096);
                yVar.t0(true);
            }
            yVar.d0(y.b.b(k0(vVar, zVar), N(vVar, zVar), v0(vVar, zVar), l0(vVar, zVar)));
        }

        public int N(v vVar, z zVar) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.A == null || !k()) {
                return 1;
            }
            return this.b.A.d();
        }

        public void N0(com.daaw.y yVar) {
            RecyclerView recyclerView = this.b;
            M0(recyclerView.q, recyclerView.w0, yVar);
        }

        public int O(View view) {
            return view.getBottom() + H(view);
        }

        public void O0(View view, com.daaw.y yVar) {
            c0 h0 = RecyclerView.h0(view);
            if (h0 == null || h0.x() || this.a.n(h0.a)) {
                return;
            }
            RecyclerView recyclerView = this.b;
            P0(recyclerView.q, recyclerView.w0, view, yVar);
        }

        public void P(View view, Rect rect) {
            RecyclerView.i0(view, rect);
        }

        public void P0(v vVar, z zVar, View view, com.daaw.y yVar) {
            yVar.e0(y.c.a(l() ? h0(view) : 0, 1, k() ? h0(view) : 0, 1, false, false));
        }

        public int Q(View view) {
            return view.getLeft() - a0(view);
        }

        public View Q0(View view, int i) {
            return null;
        }

        public int R(View view) {
            Rect rect = ((p) view.getLayoutParams()).b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void R0(RecyclerView recyclerView, int i, int i2) {
        }

        public int S(View view) {
            Rect rect = ((p) view.getLayoutParams()).b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void S0(RecyclerView recyclerView) {
        }

        public int T(View view) {
            return view.getRight() + j0(view);
        }

        public void T0(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public int U(View view) {
            return view.getTop() - m0(view);
        }

        public void U0(RecyclerView recyclerView, int i, int i2) {
        }

        public View V() {
            View focusedChild;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void V0(RecyclerView recyclerView, int i, int i2) {
        }

        public int W() {
            return this.r;
        }

        public void W0(RecyclerView recyclerView, int i, int i2, Object obj) {
            V0(recyclerView, i, i2);
        }

        public int X() {
            return this.p;
        }

        public void X0(v vVar, z zVar) {
        }

        public int Y() {
            RecyclerView recyclerView = this.b;
            g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.d();
            }
            return 0;
        }

        public void Y0(z zVar) {
        }

        public int Z() {
            return xs1.E(this.b);
        }

        public void Z0(v vVar, z zVar, int i, int i2) {
            this.b.w(i, i2);
        }

        public int a0(View view) {
            return ((p) view.getLayoutParams()).b.left;
        }

        @Deprecated
        public boolean a1(RecyclerView recyclerView, View view, View view2) {
            return x0() || recyclerView.w0();
        }

        public void b(View view) {
            c(view, -1);
        }

        public int b0() {
            return xs1.F(this.b);
        }

        public boolean b1(RecyclerView recyclerView, z zVar, View view, View view2) {
            return a1(recyclerView, view, view2);
        }

        public void c(View view, int i) {
            f(view, i, true);
        }

        public int c0() {
            return xs1.G(this.b);
        }

        public void c1(Parcelable parcelable) {
        }

        public void d(View view) {
            e(view, -1);
        }

        public int d0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public Parcelable d1() {
            return null;
        }

        public void e(View view, int i) {
            f(view, i, false);
        }

        public int e0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void e1(int i) {
        }

        public final void f(View view, int i, boolean z) {
            c0 h0 = RecyclerView.h0(view);
            if (z || h0.x()) {
                this.b.u.b(h0);
            } else {
                this.b.u.p(h0);
            }
            p pVar = (p) view.getLayoutParams();
            if (h0.N() || h0.y()) {
                if (h0.y()) {
                    h0.M();
                } else {
                    h0.g();
                }
                this.a.c(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.b) {
                int m = this.a.m(view);
                if (i == -1) {
                    i = this.a.g();
                }
                if (m == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.P());
                } else if (m != i) {
                    this.b.B.B0(m, i);
                }
            } else {
                this.a.a(view, i, false);
                pVar.c = true;
                y yVar = this.g;
                if (yVar != null && yVar.h()) {
                    this.g.k(view);
                }
            }
            if (pVar.d) {
                h0.a.invalidate();
                pVar.d = false;
            }
        }

        public int f0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void f1(y yVar) {
            if (this.g == yVar) {
                this.g = null;
            }
        }

        public void g(String str) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.o(str);
            }
        }

        public int g0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public boolean g1(int i, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return h1(recyclerView.q, recyclerView.w0, i, bundle);
        }

        public void h(View view, int i) {
            i(view, i, (p) view.getLayoutParams());
        }

        public int h0(View view) {
            return ((p) view.getLayoutParams()).a();
        }

        public boolean h1(v vVar, z zVar, int i, Bundle bundle) {
            int W;
            int o0;
            int i2;
            int i3;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                return false;
            }
            if (i == 4096) {
                W = recyclerView.canScrollVertically(1) ? (W() - g0()) - d0() : 0;
                if (this.b.canScrollHorizontally(1)) {
                    o0 = (o0() - e0()) - f0();
                    i2 = W;
                    i3 = o0;
                }
                i2 = W;
                i3 = 0;
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                W = recyclerView.canScrollVertically(-1) ? -((W() - g0()) - d0()) : 0;
                if (this.b.canScrollHorizontally(-1)) {
                    o0 = -((o0() - e0()) - f0());
                    i2 = W;
                    i3 = o0;
                }
                i2 = W;
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.b.q1(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        }

        public void i(View view, int i, p pVar) {
            c0 h0 = RecyclerView.h0(view);
            if (h0.x()) {
                this.b.u.b(h0);
            } else {
                this.b.u.p(h0);
            }
            this.a.c(view, i, pVar, h0.x());
        }

        public boolean i1(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return j1(recyclerView.q, recyclerView.w0, view, i, bundle);
        }

        public void j(View view, Rect rect) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.l0(view));
            }
        }

        public int j0(View view) {
            return ((p) view.getLayoutParams()).b.right;
        }

        public boolean j1(v vVar, z zVar, View view, int i, Bundle bundle) {
            return false;
        }

        public boolean k() {
            return false;
        }

        public int k0(v vVar, z zVar) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.A == null || !l()) {
                return 1;
            }
            return this.b.A.d();
        }

        public void k1(v vVar) {
            for (int J = J() - 1; J >= 0; J--) {
                if (!RecyclerView.h0(I(J)).L()) {
                    n1(J, vVar);
                }
            }
        }

        public boolean l() {
            return false;
        }

        public int l0(v vVar, z zVar) {
            return 0;
        }

        public void l1(v vVar) {
            int j = vVar.j();
            for (int i = j - 1; i >= 0; i--) {
                View n = vVar.n(i);
                c0 h0 = RecyclerView.h0(n);
                if (!h0.L()) {
                    h0.I(false);
                    if (h0.z()) {
                        this.b.removeDetachedView(n, false);
                    }
                    l lVar = this.b.e0;
                    if (lVar != null) {
                        lVar.j(h0);
                    }
                    h0.I(true);
                    vVar.y(n);
                }
            }
            vVar.e();
            if (j > 0) {
                this.b.invalidate();
            }
        }

        public boolean m(p pVar) {
            return pVar != null;
        }

        public int m0(View view) {
            return ((p) view.getLayoutParams()).b.top;
        }

        public void m1(View view, v vVar) {
            p1(view);
            vVar.B(view);
        }

        public void n0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((p) view.getLayoutParams()).b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.b.z;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void n1(int i, v vVar) {
            View I = I(i);
            q1(i);
            vVar.B(I);
        }

        public void o(int i, int i2, z zVar, c cVar) {
        }

        public int o0() {
            return this.q;
        }

        public boolean o1(Runnable runnable) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void p(int i, c cVar) {
        }

        public int p0() {
            return this.o;
        }

        public void p1(View view) {
            this.a.p(view);
        }

        public int q(z zVar) {
            return 0;
        }

        public boolean q0() {
            int J = J();
            for (int i = 0; i < J; i++) {
                ViewGroup.LayoutParams layoutParams = I(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void q1(int i) {
            if (I(i) != null) {
                this.a.q(i);
            }
        }

        public int r(z zVar) {
            return 0;
        }

        public boolean r0() {
            return this.i;
        }

        public boolean r1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return s1(recyclerView, view, rect, z, false);
        }

        public int s(z zVar) {
            return 0;
        }

        public boolean s0() {
            return this.j;
        }

        public boolean s1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] L = L(view, rect);
            int i = L[0];
            int i2 = L[1];
            if ((!z2 || t0(recyclerView, i, i2)) && !(i == 0 && i2 == 0)) {
                if (z) {
                    recyclerView.scrollBy(i, i2);
                } else {
                    recyclerView.n1(i, i2);
                }
                return true;
            }
            return false;
        }

        public int t(z zVar) {
            return 0;
        }

        public final boolean t0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int e0 = e0();
            int g0 = g0();
            int o0 = o0() - f0();
            int W = W() - d0();
            Rect rect = this.b.x;
            P(focusedChild, rect);
            return rect.left - i < o0 && rect.right - i > e0 && rect.top - i2 < W && rect.bottom - i2 > g0;
        }

        public void t1() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int u(z zVar) {
            return 0;
        }

        public final boolean u0() {
            return this.l;
        }

        public void u1() {
            this.h = true;
        }

        public int v(z zVar) {
            return 0;
        }

        public boolean v0(v vVar, z zVar) {
            return false;
        }

        public final void v1(v vVar, int i, View view) {
            c0 h0 = RecyclerView.h0(view);
            if (h0.L()) {
                return;
            }
            if (h0.v() && !h0.x() && !this.b.A.h()) {
                q1(i);
                vVar.C(h0);
                return;
            }
            x(i);
            vVar.D(view);
            this.b.u.k(h0);
        }

        public void w(v vVar) {
            for (int J = J() - 1; J >= 0; J--) {
                v1(vVar, J, I(J));
            }
        }

        public int w1(int i, v vVar, z zVar) {
            return 0;
        }

        public void x(int i) {
            y(i, I(i));
        }

        public boolean x0() {
            y yVar = this.g;
            return yVar != null && yVar.h();
        }

        public void x1(int i) {
        }

        public final void y(int i, View view) {
            this.a.d(i);
        }

        public boolean y0(View view, boolean z, boolean z2) {
            boolean z3 = this.e.b(view, 24579) && this.f.b(view, 24579);
            return z ? z3 : !z3;
        }

        public int y1(int i, v vVar, z zVar) {
            return 0;
        }

        public void z(RecyclerView recyclerView) {
            this.i = true;
            G0(recyclerView);
        }

        public void z0(View view, int i, int i2, int i3, int i4) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) pVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        public void z1(RecyclerView recyclerView) {
            A1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }
    }

    /* loaded from: classes.dex */
    public static class p extends ViewGroup.MarginLayoutParams {
        public c0 a;
        public final Rect b;
        public boolean c;
        public boolean d;

        public p(int i, int i2) {
            super(i, i2);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public p(p pVar) {
            super((ViewGroup.LayoutParams) pVar);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public int a() {
            return this.a.o();
        }

        public boolean b() {
            return this.a.A();
        }

        public boolean c() {
            return this.a.x();
        }

        public boolean d() {
            return this.a.v();
        }
    }

    /* loaded from: classes.dex */
    public interface q {
        void a(View view);

        void b(View view);
    }

    /* loaded from: classes.dex */
    public static abstract class r {
        public abstract boolean a(int i, int i2);
    }

    /* loaded from: classes.dex */
    public interface s {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z);
    }

    /* loaded from: classes.dex */
    public static abstract class t {
        public void a(RecyclerView recyclerView, int i) {
        }

        public void b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* loaded from: classes.dex */
    public static class u {
        public SparseArray<a> a = new SparseArray<>();
        public int b = 0;

        /* loaded from: classes.dex */
        public static class a {
            public final ArrayList<c0> a = new ArrayList<>();
            public int b = 5;
            public long c = 0;
            public long d = 0;
        }

        public void a() {
            this.b++;
        }

        public void b() {
            for (int i = 0; i < this.a.size(); i++) {
                this.a.valueAt(i).a.clear();
            }
        }

        public void c() {
            this.b--;
        }

        public void d(int i, long j) {
            a g = g(i);
            g.d = j(g.d, j);
        }

        public void e(int i, long j) {
            a g = g(i);
            g.c = j(g.c, j);
        }

        public c0 f(int i) {
            a aVar = this.a.get(i);
            if (aVar == null || aVar.a.isEmpty()) {
                return null;
            }
            ArrayList<c0> arrayList = aVar.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).t()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        public final a g(int i) {
            a aVar = this.a.get(i);
            if (aVar == null) {
                a aVar2 = new a();
                this.a.put(i, aVar2);
                return aVar2;
            }
            return aVar;
        }

        public void h(g gVar, g gVar2, boolean z) {
            if (gVar != null) {
                c();
            }
            if (!z && this.b == 0) {
                b();
            }
            if (gVar2 != null) {
                a();
            }
        }

        public void i(c0 c0Var) {
            int n = c0Var.n();
            ArrayList<c0> arrayList = g(n).a;
            if (this.a.get(n).b <= arrayList.size()) {
                return;
            }
            c0Var.F();
            arrayList.add(c0Var);
        }

        public long j(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        public boolean k(int i, long j, long j2) {
            long j3 = g(i).d;
            return j3 == 0 || j + j3 < j2;
        }

        public boolean l(int i, long j, long j2) {
            long j3 = g(i).c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* loaded from: classes.dex */
    public final class v {
        public final ArrayList<c0> a;
        public ArrayList<c0> b;
        public final ArrayList<c0> c;
        public final List<c0> d;
        public int e;
        public int f;
        public u g;

        public v() {
            ArrayList<c0> arrayList = new ArrayList<>();
            this.a = arrayList;
            this.b = null;
            this.c = new ArrayList<>();
            this.d = Collections.unmodifiableList(arrayList);
            this.e = 2;
            this.f = 2;
        }

        public void A(int i) {
            a(this.c.get(i), true);
            this.c.remove(i);
        }

        public void B(View view) {
            c0 h0 = RecyclerView.h0(view);
            if (h0.z()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (h0.y()) {
                h0.M();
            } else if (h0.N()) {
                h0.g();
            }
            C(h0);
            if (RecyclerView.this.e0 == null || h0.w()) {
                return;
            }
            RecyclerView.this.e0.j(h0);
        }

        public void C(c0 c0Var) {
            boolean z;
            boolean z2 = true;
            if (c0Var.y() || c0Var.a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(c0Var.y());
                sb.append(" isAttached:");
                sb.append(c0Var.a.getParent() != null);
                sb.append(RecyclerView.this.P());
                throw new IllegalArgumentException(sb.toString());
            } else if (c0Var.z()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + c0Var + RecyclerView.this.P());
            } else if (c0Var.L()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.P());
            } else {
                boolean j = c0Var.j();
                g gVar = RecyclerView.this.A;
                if ((gVar != null && j && gVar.q(c0Var)) || c0Var.w()) {
                    if (this.f <= 0 || c0Var.r(526)) {
                        z = false;
                    } else {
                        int size = this.c.size();
                        if (size >= this.f && size > 0) {
                            A(0);
                            size--;
                        }
                        if (RecyclerView.R0 && size > 0 && !RecyclerView.this.v0.d(c0Var.c)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.v0.d(this.c.get(i).c)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.c.add(size, c0Var);
                        z = true;
                    }
                    if (!z) {
                        a(c0Var, true);
                        r1 = z;
                        RecyclerView.this.u.q(c0Var);
                        if (r1 && !z2 && j) {
                            c0Var.r = null;
                            return;
                        }
                        return;
                    }
                    r1 = z;
                }
                z2 = false;
                RecyclerView.this.u.q(c0Var);
                if (r1) {
                }
            }
        }

        public void D(View view) {
            ArrayList<c0> arrayList;
            c0 h0 = RecyclerView.h0(view);
            if (!h0.r(12) && h0.A() && !RecyclerView.this.p(h0)) {
                if (this.b == null) {
                    this.b = new ArrayList<>();
                }
                h0.J(this, true);
                arrayList = this.b;
            } else if (h0.v() && !h0.x() && !RecyclerView.this.A.h()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.P());
            } else {
                h0.J(this, false);
                arrayList = this.a;
            }
            arrayList.add(h0);
        }

        public void E(u uVar) {
            u uVar2 = this.g;
            if (uVar2 != null) {
                uVar2.c();
            }
            this.g = uVar;
            if (uVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.g.a();
        }

        public void F(a0 a0Var) {
        }

        public void G(int i) {
            this.e = i;
            K();
        }

        public final boolean H(c0 c0Var, int i, int i2, long j) {
            c0Var.r = RecyclerView.this;
            int n = c0Var.n();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j == Long.MAX_VALUE || this.g.k(n, nanoTime, j)) {
                RecyclerView.this.A.b(c0Var, i);
                this.g.d(c0Var.n(), RecyclerView.this.getNanoTime() - nanoTime);
                b(c0Var);
                if (RecyclerView.this.w0.e()) {
                    c0Var.g = i2;
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
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.recyclerview.widget.RecyclerView.c0 I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 525
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$c0");
        }

        public void J(c0 c0Var) {
            (c0Var.o ? this.b : this.a).remove(c0Var);
            c0Var.n = null;
            c0Var.o = false;
            c0Var.g();
        }

        public void K() {
            o oVar = RecyclerView.this.B;
            this.f = this.e + (oVar != null ? oVar.m : 0);
            for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.f; size--) {
                A(size);
            }
        }

        public boolean L(c0 c0Var) {
            if (c0Var.x()) {
                return RecyclerView.this.w0.e();
            }
            int i = c0Var.c;
            if (i >= 0 && i < RecyclerView.this.A.d()) {
                if (RecyclerView.this.w0.e() || RecyclerView.this.A.f(c0Var.c) == c0Var.n()) {
                    return !RecyclerView.this.A.h() || c0Var.m() == RecyclerView.this.A.e(c0Var.c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + c0Var + RecyclerView.this.P());
        }

        public void M(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                c0 c0Var = this.c.get(size);
                if (c0Var != null && (i3 = c0Var.c) >= i && i3 < i4) {
                    c0Var.d(2);
                    A(size);
                }
            }
        }

        public void a(c0 c0Var, boolean z) {
            RecyclerView.r(c0Var);
            View view = c0Var.a;
            androidx.recyclerview.widget.k kVar = RecyclerView.this.D0;
            if (kVar != null) {
                com.daaw.w n = kVar.n();
                xs1.r0(view, n instanceof k.a ? ((k.a) n).n(view) : null);
            }
            if (z) {
                g(c0Var);
            }
            c0Var.r = null;
            i().i(c0Var);
        }

        public final void b(c0 c0Var) {
            if (RecyclerView.this.v0()) {
                View view = c0Var.a;
                if (xs1.C(view) == 0) {
                    xs1.B0(view, 1);
                }
                androidx.recyclerview.widget.k kVar = RecyclerView.this.D0;
                if (kVar == null) {
                    return;
                }
                com.daaw.w n = kVar.n();
                if (n instanceof k.a) {
                    ((k.a) n).o(view);
                }
                xs1.r0(view, n);
            }
        }

        public void c() {
            this.a.clear();
            z();
        }

        public void d() {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                this.c.get(i).e();
            }
            int size2 = this.a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.a.get(i2).e();
            }
            ArrayList<c0> arrayList = this.b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.b.get(i3).e();
                }
            }
        }

        public void e() {
            this.a.clear();
            ArrayList<c0> arrayList = this.b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i) {
            if (i >= 0 && i < RecyclerView.this.w0.b()) {
                return !RecyclerView.this.w0.e() ? i : RecyclerView.this.s.m(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.w0.b() + RecyclerView.this.P());
        }

        public void g(c0 c0Var) {
            w wVar = RecyclerView.this.C;
            if (wVar != null) {
                wVar.a(c0Var);
            }
            g gVar = RecyclerView.this.A;
            if (gVar != null) {
                gVar.t(c0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.w0 != null) {
                recyclerView.u.q(c0Var);
            }
        }

        public c0 h(int i) {
            int size;
            int m;
            ArrayList<c0> arrayList = this.b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    c0 c0Var = this.b.get(i2);
                    if (!c0Var.N() && c0Var.o() == i) {
                        c0Var.d(32);
                        return c0Var;
                    }
                }
                if (RecyclerView.this.A.h() && (m = RecyclerView.this.s.m(i)) > 0 && m < RecyclerView.this.A.d()) {
                    long e = RecyclerView.this.A.e(m);
                    for (int i3 = 0; i3 < size; i3++) {
                        c0 c0Var2 = this.b.get(i3);
                        if (!c0Var2.N() && c0Var2.m() == e) {
                            c0Var2.d(32);
                            return c0Var2;
                        }
                    }
                }
            }
            return null;
        }

        public u i() {
            if (this.g == null) {
                this.g = new u();
            }
            return this.g;
        }

        public int j() {
            return this.a.size();
        }

        public List<c0> k() {
            return this.d;
        }

        public c0 l(long j, int i, boolean z) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                c0 c0Var = this.a.get(size);
                if (c0Var.m() == j && !c0Var.N()) {
                    if (i == c0Var.n()) {
                        c0Var.d(32);
                        if (c0Var.x() && !RecyclerView.this.w0.e()) {
                            c0Var.H(2, 14);
                        }
                        return c0Var;
                    } else if (!z) {
                        this.a.remove(size);
                        RecyclerView.this.removeDetachedView(c0Var.a, false);
                        y(c0Var.a);
                    }
                }
            }
            int size2 = this.c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                c0 c0Var2 = this.c.get(size2);
                if (c0Var2.m() == j && !c0Var2.t()) {
                    if (i == c0Var2.n()) {
                        if (!z) {
                            this.c.remove(size2);
                        }
                        return c0Var2;
                    } else if (!z) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        public c0 m(int i, boolean z) {
            View e;
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                c0 c0Var = this.a.get(i2);
                if (!c0Var.N() && c0Var.o() == i && !c0Var.v() && (RecyclerView.this.w0.h || !c0Var.x())) {
                    c0Var.d(32);
                    return c0Var;
                }
            }
            if (z || (e = RecyclerView.this.t.e(i)) == null) {
                int size2 = this.c.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    c0 c0Var2 = this.c.get(i3);
                    if (!c0Var2.v() && c0Var2.o() == i && !c0Var2.t()) {
                        if (!z) {
                            this.c.remove(i3);
                        }
                        return c0Var2;
                    }
                }
                return null;
            }
            c0 h0 = RecyclerView.h0(e);
            RecyclerView.this.t.s(e);
            int m = RecyclerView.this.t.m(e);
            if (m != -1) {
                RecyclerView.this.t.d(m);
                D(e);
                h0.d(8224);
                return h0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + h0 + RecyclerView.this.P());
        }

        public View n(int i) {
            return this.a.get(i).a;
        }

        public View o(int i) {
            return p(i, false);
        }

        public View p(int i, boolean z) {
            return I(i, z, Long.MAX_VALUE).a;
        }

        public final void q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
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

        public final void r(c0 c0Var) {
            View view = c0Var.a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        public void s() {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                p pVar = (p) this.c.get(i).a.getLayoutParams();
                if (pVar != null) {
                    pVar.c = true;
                }
            }
        }

        public void t() {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                c0 c0Var = this.c.get(i);
                if (c0Var != null) {
                    c0Var.d(6);
                    c0Var.c(null);
                }
            }
            g gVar = RecyclerView.this.A;
            if (gVar == null || !gVar.h()) {
                z();
            }
        }

        public void u(int i, int i2) {
            int size = this.c.size();
            for (int i3 = 0; i3 < size; i3++) {
                c0 c0Var = this.c.get(i3);
                if (c0Var != null && c0Var.c >= i) {
                    c0Var.C(i2, true);
                }
            }
        }

        public void v(int i, int i2) {
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
            int size = this.c.size();
            for (int i7 = 0; i7 < size; i7++) {
                c0 c0Var = this.c.get(i7);
                if (c0Var != null && (i6 = c0Var.c) >= i5 && i6 <= i4) {
                    if (i6 == i) {
                        c0Var.C(i2 - i, false);
                    } else {
                        c0Var.C(i3, false);
                    }
                }
            }
        }

        public void w(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                c0 c0Var = this.c.get(size);
                if (c0Var != null) {
                    int i4 = c0Var.c;
                    if (i4 >= i3) {
                        c0Var.C(-i2, z);
                    } else if (i4 >= i) {
                        c0Var.d(8);
                        A(size);
                    }
                }
            }
        }

        public void x(g gVar, g gVar2, boolean z) {
            c();
            i().h(gVar, gVar2, z);
        }

        public void y(View view) {
            c0 h0 = RecyclerView.h0(view);
            h0.n = null;
            h0.o = false;
            h0.g();
            C(h0);
        }

        public void z() {
            for (int size = this.c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.c.clear();
            if (RecyclerView.R0) {
                RecyclerView.this.v0.b();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface w {
        void a(c0 c0Var);
    }

    /* loaded from: classes.dex */
    public class x extends i {
        public x() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void a() {
            RecyclerView.this.o(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.w0.g = true;
            recyclerView.R0(true);
            if (RecyclerView.this.s.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void c(int i, int i2, Object obj) {
            RecyclerView.this.o(null);
            if (RecyclerView.this.s.r(i, i2, obj)) {
                d();
            }
        }

        public void d() {
            if (RecyclerView.Q0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.H && recyclerView.G) {
                    xs1.j0(recyclerView, recyclerView.w);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.P = true;
            recyclerView2.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class y {
        public RecyclerView b;
        public o c;
        public boolean d;
        public boolean e;
        public View f;
        public boolean h;
        public int a = -1;
        public final a g = new a(0, 0);

        /* loaded from: classes.dex */
        public static class a {
            public int a;
            public int b;
            public int c;
            public int d;
            public Interpolator e;
            public boolean f;
            public int g;

            public a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            public a(int i, int i2, int i3, Interpolator interpolator) {
                this.d = -1;
                this.f = false;
                this.g = 0;
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.e = interpolator;
            }

            public boolean a() {
                return this.d >= 0;
            }

            public void b(int i) {
                this.d = i;
            }

            public void c(RecyclerView recyclerView) {
                int i = this.d;
                if (i >= 0) {
                    this.d = -1;
                    recyclerView.y0(i);
                    this.f = false;
                } else if (!this.f) {
                    this.g = 0;
                } else {
                    e();
                    recyclerView.t0.f(this.a, this.b, this.c, this.e);
                    this.g++;
                    this.f = false;
                }
            }

            public void d(int i, int i2, int i3, Interpolator interpolator) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.e = interpolator;
                this.f = true;
            }

            public final void e() {
                if (this.e != null && this.c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }
        }

        /* loaded from: classes.dex */
        public interface b {
            PointF a(int i);
        }

        public PointF a(int i) {
            o e = e();
            if (e instanceof b) {
                return ((b) e).a(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            sb.append(b.class.getCanonicalName());
            return null;
        }

        public View b(int i) {
            return this.b.B.C(i);
        }

        public int c() {
            return this.b.B.J();
        }

        public int d(View view) {
            return this.b.e0(view);
        }

        public o e() {
            return this.c;
        }

        public int f() {
            return this.a;
        }

        public boolean g() {
            return this.d;
        }

        public boolean h() {
            return this.e;
        }

        public void i(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        public void j(int i, int i2) {
            PointF a2;
            RecyclerView recyclerView = this.b;
            if (this.a == -1 || recyclerView == null) {
                r();
            }
            if (this.d && this.f == null && this.c != null && (a2 = a(this.a)) != null) {
                float f = a2.x;
                if (f != 0.0f || a2.y != 0.0f) {
                    recyclerView.i1((int) Math.signum(f), (int) Math.signum(a2.y), null);
                }
            }
            this.d = false;
            View view = this.f;
            if (view != null) {
                if (d(view) == this.a) {
                    o(this.f, recyclerView.w0, this.g);
                    this.g.c(recyclerView);
                    r();
                } else {
                    this.f = null;
                }
            }
            if (this.e) {
                l(i, i2, recyclerView.w0, this.g);
                boolean a3 = this.g.a();
                this.g.c(recyclerView);
                if (a3 && this.e) {
                    this.d = true;
                    recyclerView.t0.e();
                }
            }
        }

        public void k(View view) {
            if (d(view) == f()) {
                this.f = view;
            }
        }

        public abstract void l(int i, int i2, z zVar, a aVar);

        public abstract void m();

        public abstract void n();

        public abstract void o(View view, z zVar, a aVar);

        public void p(int i) {
            this.a = i;
        }

        public void q(RecyclerView recyclerView, o oVar) {
            recyclerView.t0.g();
            if (this.h) {
                StringBuilder sb = new StringBuilder();
                sb.append("An instance of ");
                sb.append(getClass().getSimpleName());
                sb.append(" was started more than once. Each instance of");
                sb.append(getClass().getSimpleName());
                sb.append(" is intended to only be used once. You should create a new instance for each use.");
            }
            this.b = recyclerView;
            this.c = oVar;
            int i = this.a;
            if (i == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.w0.a = i;
            this.e = true;
            this.d = true;
            this.f = b(f());
            m();
            this.b.t0.e();
            this.h = true;
        }

        public final void r() {
            if (this.e) {
                this.e = false;
                n();
                this.b.w0.a = -1;
                this.f = null;
                this.a = -1;
                this.d = false;
                this.c.f1(this);
                this.c = null;
                this.b = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class z {
        public SparseArray<Object> b;
        public int m;
        public long n;
        public int o;
        public int p;
        public int q;
        public int a = -1;
        public int c = 0;
        public int d = 0;
        public int e = 1;
        public int f = 0;
        public boolean g = false;
        public boolean h = false;
        public boolean i = false;
        public boolean j = false;
        public boolean k = false;
        public boolean l = false;

        public void a(int i) {
            if ((this.e & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.e));
        }

        public int b() {
            return this.h ? this.c - this.d : this.f;
        }

        public int c() {
            return this.a;
        }

        public boolean d() {
            return this.a != -1;
        }

        public boolean e() {
            return this.h;
        }

        public void f(g gVar) {
            this.e = 1;
            this.f = gVar.d();
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public boolean g() {
            return this.l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.a + ", mData=" + this.b + ", mItemCount=" + this.f + ", mIsMeasuring=" + this.j + ", mPreviousLayoutItemCount=" + this.c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.d + ", mStructureChanged=" + this.g + ", mInPreLayout=" + this.h + ", mRunSimpleAnimations=" + this.k + ", mRunPredictiveAnimations=" + this.l + '}';
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        O0 = i2 == 19 || i2 == 20;
        P0 = i2 >= 23;
        Q0 = true;
        R0 = i2 >= 21;
        S0 = false;
        T0 = false;
        Class<?> cls = Integer.TYPE;
        U0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        V0 = new c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, v01.recyclerViewStyle);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.p = new x();
        this.q = new v();
        this.u = new androidx.recyclerview.widget.p();
        this.w = new a();
        this.x = new Rect();
        this.y = new Rect();
        this.z = new RectF();
        this.D = new ArrayList<>();
        this.E = new ArrayList<>();
        this.K = 0;
        this.S = false;
        this.T = false;
        this.U = 0;
        this.V = 0;
        this.W = new k();
        this.e0 = new androidx.recyclerview.widget.c();
        this.f0 = 0;
        this.g0 = -1;
        this.q0 = Float.MIN_VALUE;
        this.r0 = Float.MIN_VALUE;
        boolean z2 = true;
        this.s0 = true;
        this.t0 = new b0();
        this.v0 = R0 ? new e.b() : null;
        this.w0 = new z();
        this.z0 = false;
        this.A0 = false;
        this.B0 = new m();
        this.C0 = false;
        this.F0 = new int[2];
        this.H0 = new int[2];
        this.I0 = new int[2];
        this.J0 = new int[2];
        this.K0 = new ArrayList();
        this.L0 = new b();
        this.M0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.m0 = viewConfiguration.getScaledTouchSlop();
        this.q0 = zs1.b(viewConfiguration, context);
        this.r0 = zs1.d(viewConfiguration, context);
        this.o0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.p0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.e0.v(this.B0);
        p0();
        r0();
        q0();
        if (xs1.C(this) == 0) {
            xs1.B0(this, 1);
        }
        this.Q = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.k(this));
        int[] iArr = t21.f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i2, 0);
        }
        String string = obtainStyledAttributes.getString(t21.o);
        if (obtainStyledAttributes.getInt(t21.i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.v = obtainStyledAttributes.getBoolean(t21.h, true);
        boolean z3 = obtainStyledAttributes.getBoolean(t21.j, false);
        this.I = z3;
        if (z3) {
            s0((StateListDrawable) obtainStyledAttributes.getDrawable(t21.m), obtainStyledAttributes.getDrawable(t21.n), (StateListDrawable) obtainStyledAttributes.getDrawable(t21.k), obtainStyledAttributes.getDrawable(t21.l));
        }
        obtainStyledAttributes.recycle();
        v(context, string, attributeSet, i2, 0);
        if (i3 >= 21) {
            int[] iArr2 = N0;
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
            if (i3 >= 29) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes2, i2, 0);
            }
            z2 = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z2);
    }

    public static RecyclerView V(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                RecyclerView V = V(viewGroup.getChildAt(i2));
                if (V != null) {
                    return V;
                }
            }
            return null;
        }
        return null;
    }

    private fs0 getScrollingChildHelper() {
        if (this.G0 == null) {
            this.G0 = new fs0(this);
        }
        return this.G0;
    }

    public static c0 h0(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).a;
    }

    public static void i0(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
    }

    public static void r(c0 c0Var) {
        WeakReference<RecyclerView> weakReference = c0Var.b;
        if (weakReference != null) {
            ViewParent viewParent = weakReference.get();
            while (true) {
                for (View view = (View) viewParent; view != null; view = null) {
                    if (view == c0Var.a) {
                        return;
                    }
                    viewParent = view.getParent();
                    if (viewParent instanceof View) {
                        break;
                    }
                }
                c0Var.b = null;
                return;
            }
        }
    }

    public final void A() {
        int i2 = this.O;
        this.O = 0;
        if (i2 == 0 || !v0()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        com.daaw.x.b(obtain, i2);
        sendAccessibilityEventUnchecked(obtain);
    }

    public void A0() {
        int j2 = this.t.j();
        for (int i2 = 0; i2 < j2; i2++) {
            c0 h0 = h0(this.t.i(i2));
            if (h0 != null && !h0.L()) {
                h0.d(6);
            }
        }
        z0();
        this.q.t();
    }

    public void B() {
        if (this.A == null || this.B == null) {
            return;
        }
        z zVar = this.w0;
        zVar.j = false;
        if (zVar.e == 1) {
            C();
        } else if (!this.s.q() && this.B.o0() == getWidth() && this.B.W() == getHeight()) {
            this.B.z1(this);
            E();
        }
        this.B.z1(this);
        D();
        E();
    }

    public void B0(int i2) {
        int g2 = this.t.g();
        for (int i3 = 0; i3 < g2; i3++) {
            this.t.f(i3).offsetLeftAndRight(i2);
        }
    }

    public final void C() {
        boolean z2 = true;
        this.w0.a(1);
        Q(this.w0);
        this.w0.j = false;
        s1();
        this.u.f();
        I0();
        Q0();
        f1();
        z zVar = this.w0;
        zVar.i = (zVar.k && this.A0) ? false : false;
        this.A0 = false;
        this.z0 = false;
        zVar.h = zVar.l;
        zVar.f = this.A.d();
        U(this.F0);
        if (this.w0.k) {
            int g2 = this.t.g();
            for (int i2 = 0; i2 < g2; i2++) {
                c0 h0 = h0(this.t.f(i2));
                if (!h0.L() && (!h0.v() || this.A.h())) {
                    this.u.e(h0, this.e0.t(this.w0, h0, l.e(h0), h0.q()));
                    if (this.w0.i && h0.A() && !h0.x() && !h0.L() && !h0.v()) {
                        this.u.c(c0(h0), h0);
                    }
                }
            }
        }
        if (this.w0.l) {
            g1();
            z zVar2 = this.w0;
            boolean z3 = zVar2.g;
            zVar2.g = false;
            this.B.X0(this.q, zVar2);
            this.w0.g = z3;
            for (int i3 = 0; i3 < this.t.g(); i3++) {
                c0 h02 = h0(this.t.f(i3));
                if (!h02.L() && !this.u.i(h02)) {
                    int e2 = l.e(h02);
                    boolean r2 = h02.r(8192);
                    if (!r2) {
                        e2 |= 4096;
                    }
                    l.c t2 = this.e0.t(this.w0, h02, e2, h02.q());
                    if (r2) {
                        T0(h02, t2);
                    } else {
                        this.u.a(h02, t2);
                    }
                }
            }
        }
        s();
        J0();
        u1(false);
        this.w0.e = 2;
    }

    public void C0(int i2) {
        int g2 = this.t.g();
        for (int i3 = 0; i3 < g2; i3++) {
            this.t.f(i3).offsetTopAndBottom(i2);
        }
    }

    public final void D() {
        s1();
        I0();
        this.w0.a(6);
        this.s.j();
        this.w0.f = this.A.d();
        z zVar = this.w0;
        zVar.d = 0;
        zVar.h = false;
        this.B.X0(this.q, zVar);
        z zVar2 = this.w0;
        zVar2.g = false;
        this.r = null;
        zVar2.k = zVar2.k && this.e0 != null;
        zVar2.e = 4;
        J0();
        u1(false);
    }

    public void D0(int i2, int i3) {
        int j2 = this.t.j();
        for (int i4 = 0; i4 < j2; i4++) {
            c0 h0 = h0(this.t.i(i4));
            if (h0 != null && !h0.L() && h0.c >= i2) {
                h0.C(i3, false);
                this.w0.g = true;
            }
        }
        this.q.u(i2, i3);
        requestLayout();
    }

    public final void E() {
        this.w0.a(4);
        s1();
        I0();
        z zVar = this.w0;
        zVar.e = 1;
        if (zVar.k) {
            for (int g2 = this.t.g() - 1; g2 >= 0; g2--) {
                c0 h0 = h0(this.t.f(g2));
                if (!h0.L()) {
                    long c02 = c0(h0);
                    l.c s2 = this.e0.s(this.w0, h0);
                    c0 g3 = this.u.g(c02);
                    if (g3 != null && !g3.L()) {
                        boolean h2 = this.u.h(g3);
                        boolean h3 = this.u.h(h0);
                        if (!h2 || g3 != h0) {
                            l.c n2 = this.u.n(g3);
                            this.u.d(h0, s2);
                            l.c m2 = this.u.m(h0);
                            if (n2 == null) {
                                m0(c02, h0, g3);
                            } else {
                                m(g3, h0, n2, m2, h2, h3);
                            }
                        }
                    }
                    this.u.d(h0, s2);
                }
            }
            this.u.o(this.M0);
        }
        this.B.l1(this.q);
        z zVar2 = this.w0;
        zVar2.c = zVar2.f;
        this.S = false;
        this.T = false;
        zVar2.k = false;
        zVar2.l = false;
        this.B.h = false;
        ArrayList<c0> arrayList = this.q.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.B;
        if (oVar.n) {
            oVar.m = 0;
            oVar.n = false;
            this.q.K();
        }
        this.B.Y0(this.w0);
        J0();
        u1(false);
        this.u.f();
        int[] iArr = this.F0;
        if (x(iArr[0], iArr[1])) {
            I(0, 0);
        }
        U0();
        d1();
    }

    public void E0(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int j2 = this.t.j();
        if (i2 < i3) {
            i6 = -1;
            i5 = i2;
            i4 = i3;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i8 = 0; i8 < j2; i8++) {
            c0 h0 = h0(this.t.i(i8));
            if (h0 != null && (i7 = h0.c) >= i5 && i7 <= i4) {
                if (i7 == i2) {
                    h0.C(i3 - i2, false);
                } else {
                    h0.C(i6, false);
                }
                this.w0.g = true;
            }
        }
        this.q.v(i2, i3);
        requestLayout();
    }

    public boolean F(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().d(i2, i3, iArr, iArr2, i4);
    }

    public void F0(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int j2 = this.t.j();
        for (int i5 = 0; i5 < j2; i5++) {
            c0 h0 = h0(this.t.i(i5));
            if (h0 != null && !h0.L()) {
                int i6 = h0.c;
                if (i6 >= i4) {
                    h0.C(-i3, z2);
                } else if (i6 >= i2) {
                    h0.k(i2 - 1, -i3, z2);
                }
                this.w0.g = true;
            }
        }
        this.q.w(i2, i3, z2);
        requestLayout();
    }

    public final void G(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().e(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void G0(View view) {
    }

    public void H(int i2) {
        o oVar = this.B;
        if (oVar != null) {
            oVar.e1(i2);
        }
        M0(i2);
        t tVar = this.x0;
        if (tVar != null) {
            tVar.a(this, i2);
        }
        List<t> list = this.y0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.y0.get(size).a(this, i2);
            }
        }
    }

    public void H0(View view) {
    }

    public void I(int i2, int i3) {
        this.V++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        N0(i2, i3);
        t tVar = this.x0;
        if (tVar != null) {
            tVar.b(this, i2, i3);
        }
        List<t> list = this.y0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.y0.get(size).b(this, i2, i3);
            }
        }
        this.V--;
    }

    public void I0() {
        this.U++;
    }

    public void J() {
        int i2;
        for (int size = this.K0.size() - 1; size >= 0; size--) {
            c0 c0Var = this.K0.get(size);
            if (c0Var.a.getParent() == this && !c0Var.L() && (i2 = c0Var.q) != -1) {
                xs1.B0(c0Var.a, i2);
                c0Var.q = -1;
            }
        }
        this.K0.clear();
    }

    public void J0() {
        K0(true);
    }

    public final boolean K(MotionEvent motionEvent) {
        s sVar = this.F;
        if (sVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return T(motionEvent);
        }
        sVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.F = null;
        }
        return true;
    }

    public void K0(boolean z2) {
        int i2 = this.U - 1;
        this.U = i2;
        if (i2 < 1) {
            this.U = 0;
            if (z2) {
                A();
                J();
            }
        }
    }

    public void L() {
        int measuredWidth;
        int measuredHeight;
        if (this.d0 != null) {
            return;
        }
        EdgeEffect a2 = this.W.a(this, 3);
        this.d0 = a2;
        if (this.v) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        a2.setSize(measuredWidth, measuredHeight);
    }

    public final void L0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.g0) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.g0 = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.k0 = x2;
            this.i0 = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.l0 = y2;
            this.j0 = y2;
        }
    }

    public void M() {
        int measuredHeight;
        int measuredWidth;
        if (this.a0 != null) {
            return;
        }
        EdgeEffect a2 = this.W.a(this, 0);
        this.a0 = a2;
        if (this.v) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        a2.setSize(measuredHeight, measuredWidth);
    }

    public void M0(int i2) {
    }

    public void N() {
        int measuredHeight;
        int measuredWidth;
        if (this.c0 != null) {
            return;
        }
        EdgeEffect a2 = this.W.a(this, 2);
        this.c0 = a2;
        if (this.v) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        a2.setSize(measuredHeight, measuredWidth);
    }

    public void N0(int i2, int i3) {
    }

    public void O() {
        int measuredWidth;
        int measuredHeight;
        if (this.b0 != null) {
            return;
        }
        EdgeEffect a2 = this.W.a(this, 1);
        this.b0 = a2;
        if (this.v) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        a2.setSize(measuredWidth, measuredHeight);
    }

    public void O0() {
        if (this.C0 || !this.G) {
            return;
        }
        xs1.j0(this, this.L0);
        this.C0 = true;
    }

    public String P() {
        return " " + super.toString() + ", adapter:" + this.A + ", layout:" + this.B + ", context:" + getContext();
    }

    public final boolean P0() {
        return this.e0 != null && this.B.L1();
    }

    public final void Q(z zVar) {
        if (getScrollState() != 2) {
            zVar.p = 0;
            zVar.q = 0;
            return;
        }
        OverScroller overScroller = this.t0.r;
        zVar.p = overScroller.getFinalX() - overScroller.getCurrX();
        zVar.q = overScroller.getFinalY() - overScroller.getCurrY();
    }

    public final void Q0() {
        boolean z2;
        if (this.S) {
            this.s.v();
            if (this.T) {
                this.B.S0(this);
            }
        }
        if (P0()) {
            this.s.t();
        } else {
            this.s.j();
        }
        boolean z3 = false;
        boolean z4 = this.z0 || this.A0;
        this.w0.k = this.J && this.e0 != null && ((z2 = this.S) || z4 || this.B.h) && (!z2 || this.A.h());
        z zVar = this.w0;
        if (zVar.k && z4 && !this.S && P0()) {
            z3 = true;
        }
        zVar.l = z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View R(android.view.View r3) {
        /*
            r2 = this;
        L0:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L10
            if (r0 == r2) goto L10
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L10
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L0
        L10:
            if (r0 != r2) goto L13
            goto L14
        L13:
            r3 = 0
        L14:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.R(android.view.View):android.view.View");
    }

    public void R0(boolean z2) {
        this.T = z2 | this.T;
        this.S = true;
        A0();
    }

    public c0 S(View view) {
        View R = R(view);
        if (R == null) {
            return null;
        }
        return g0(R);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L21
            r6.M()
            android.widget.EdgeEffect r3 = r6.a0
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
        L1c:
            com.daaw.qv.c(r3, r4, r9)
            r9 = 1
            goto L39
        L21:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L38
            r6.N()
            android.widget.EdgeEffect r3 = r6.c0
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L1c
        L38:
            r9 = 0
        L39:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L53
            r6.O()
            android.widget.EdgeEffect r9 = r6.b0
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            com.daaw.qv.c(r9, r0, r7)
            goto L6f
        L53:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L6e
            r6.L()
            android.widget.EdgeEffect r9 = r6.d0
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            com.daaw.qv.c(r9, r3, r0)
            goto L6f
        L6e:
            r1 = r9
        L6f:
            if (r1 != 0) goto L79
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L79
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L7c
        L79:
            com.daaw.xs1.i0(r6)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.S0(float, float, float, float):void");
    }

    public final boolean T(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.E.size();
        for (int i2 = 0; i2 < size; i2++) {
            s sVar = this.E.get(i2);
            if (sVar.b(this, motionEvent) && action != 3) {
                this.F = sVar;
                return true;
            }
        }
        return false;
    }

    public void T0(c0 c0Var, l.c cVar) {
        c0Var.H(0, 8192);
        if (this.w0.i && c0Var.A() && !c0Var.x() && !c0Var.L()) {
            this.u.c(c0(c0Var), c0Var);
        }
        this.u.e(c0Var, cVar);
    }

    public final void U(int[] iArr) {
        int g2 = this.t.g();
        if (g2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < g2; i4++) {
            c0 h0 = h0(this.t.f(i4));
            if (!h0.L()) {
                int o2 = h0.o();
                if (o2 < i2) {
                    i2 = o2;
                }
                if (o2 > i3) {
                    i3 = o2;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public final void U0() {
        View findViewById;
        if (!this.s0 || this.A == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!T0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.t.n(focusedChild)) {
                    return;
                }
            } else if (this.t.g() == 0) {
                requestFocus();
                return;
            }
        }
        View view = null;
        c0 Y = (this.w0.n == -1 || !this.A.h()) ? null : Y(this.w0.n);
        if (Y != null && !this.t.n(Y.a) && Y.a.hasFocusable()) {
            view = Y.a;
        } else if (this.t.g() > 0) {
            view = W();
        }
        if (view != null) {
            int i2 = this.w0.o;
            if (i2 != -1 && (findViewById = view.findViewById(i2)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    public final void V0() {
        boolean z2;
        EdgeEffect edgeEffect = this.a0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.a0.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.b0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.b0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.c0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.c0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.d0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.d0.isFinished();
        }
        if (z2) {
            xs1.i0(this);
        }
    }

    public final View W() {
        c0 X;
        z zVar = this.w0;
        int i2 = zVar.m;
        if (i2 == -1) {
            i2 = 0;
        }
        int b2 = zVar.b();
        for (int i3 = i2; i3 < b2; i3++) {
            c0 X2 = X(i3);
            if (X2 == null) {
                break;
            } else if (X2.a.hasFocusable()) {
                return X2.a;
            }
        }
        int min = Math.min(b2, i2);
        while (true) {
            min--;
            if (min < 0 || (X = X(min)) == null) {
                return null;
            }
            if (X.a.hasFocusable()) {
                return X.a;
            }
        }
    }

    public void W0() {
        l lVar = this.e0;
        if (lVar != null) {
            lVar.k();
        }
        o oVar = this.B;
        if (oVar != null) {
            oVar.k1(this.q);
            this.B.l1(this.q);
        }
        this.q.c();
    }

    public c0 X(int i2) {
        c0 c0Var = null;
        if (this.S) {
            return null;
        }
        int j2 = this.t.j();
        for (int i3 = 0; i3 < j2; i3++) {
            c0 h0 = h0(this.t.i(i3));
            if (h0 != null && !h0.x() && b0(h0) == i2) {
                if (!this.t.n(h0.a)) {
                    return h0;
                }
                c0Var = h0;
            }
        }
        return c0Var;
    }

    public boolean X0(View view) {
        s1();
        boolean r2 = this.t.r(view);
        if (r2) {
            c0 h0 = h0(view);
            this.q.J(h0);
            this.q.C(h0);
        }
        u1(!r2);
        return r2;
    }

    public c0 Y(long j2) {
        g gVar = this.A;
        c0 c0Var = null;
        if (gVar != null && gVar.h()) {
            int j3 = this.t.j();
            for (int i2 = 0; i2 < j3; i2++) {
                c0 h0 = h0(this.t.i(i2));
                if (h0 != null && !h0.x() && h0.m() == j2) {
                    if (!this.t.n(h0.a)) {
                        return h0;
                    }
                    c0Var = h0;
                }
            }
        }
        return c0Var;
    }

    public void Y0(n nVar) {
        o oVar = this.B;
        if (oVar != null) {
            oVar.g("Cannot remove item decoration during a scroll  or layout");
        }
        this.D.remove(nVar);
        if (this.D.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        z0();
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.recyclerview.widget.RecyclerView.c0 Z(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.t
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.t
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$c0 r3 = h0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.x()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.o()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.t
            android.view.View r4 = r3.a
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Z(int, boolean):androidx.recyclerview.widget.RecyclerView$c0");
    }

    public void Z0(s sVar) {
        this.E.remove(sVar);
        if (this.F == sVar) {
            this.F = null;
        }
    }

    public void a(int i2, int i3) {
        if (i2 < 0) {
            M();
            if (this.a0.isFinished()) {
                this.a0.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            N();
            if (this.c0.isFinished()) {
                this.c0.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            O();
            if (this.b0.isFinished()) {
                this.b0.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            L();
            if (this.d0.isFinished()) {
                this.d0.onAbsorb(i3);
            }
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        xs1.i0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean a0(int i2, int i3) {
        o oVar = this.B;
        if (oVar == null || this.M) {
            return false;
        }
        int k2 = oVar.k();
        boolean l2 = this.B.l();
        i2 = (k2 == 0 || Math.abs(i2) < this.o0) ? 0 : 0;
        i3 = (!l2 || Math.abs(i3) < this.o0) ? 0 : 0;
        if (i2 == 0 && i3 == 0) {
            return false;
        }
        float f2 = i2;
        float f3 = i3;
        if (!dispatchNestedPreFling(f2, f3)) {
            boolean z2 = k2 != 0 || l2;
            dispatchNestedFling(f2, f3, z2);
            r rVar = this.n0;
            if (rVar != null && rVar.a(i2, i3)) {
                return true;
            }
            if (z2) {
                if (l2) {
                    k2 = (k2 == true ? 1 : 0) | 2;
                }
                t1(k2, 1);
                int i4 = this.p0;
                int max = Math.max(-i4, Math.min(i2, i4));
                int i5 = this.p0;
                this.t0.c(max, Math.max(-i5, Math.min(i3, i5)));
                return true;
            }
        }
        return false;
    }

    public void a1(t tVar) {
        List<t> list = this.y0;
        if (list != null) {
            list.remove(tVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        o oVar = this.B;
        if (oVar == null || !oVar.F0(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    public int b0(c0 c0Var) {
        if (c0Var.r(524) || !c0Var.u()) {
            return -1;
        }
        return this.s.e(c0Var.c);
    }

    public void b1() {
        c0 c0Var;
        int g2 = this.t.g();
        for (int i2 = 0; i2 < g2; i2++) {
            View f2 = this.t.f(i2);
            c0 g0 = g0(f2);
            if (g0 != null && (c0Var = g0.i) != null) {
                View view = c0Var.a;
                int left = f2.getLeft();
                int top = f2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public long c0(c0 c0Var) {
        return this.A.h() ? c0Var.m() : c0Var.c;
    }

    public final void c1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.x.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.c) {
                Rect rect = pVar.b;
                Rect rect2 = this.x;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.x);
            offsetRectIntoDescendantCoords(view, this.x);
        }
        this.B.s1(this, view, this.x, !this.J, view2 == null);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.B.m((p) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        o oVar = this.B;
        if (oVar != null && oVar.k()) {
            return this.B.q(this.w0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        o oVar = this.B;
        if (oVar != null && oVar.k()) {
            return this.B.r(this.w0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        o oVar = this.B;
        if (oVar != null && oVar.k()) {
            return this.B.s(this.w0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        o oVar = this.B;
        if (oVar != null && oVar.l()) {
            return this.B.t(this.w0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        o oVar = this.B;
        if (oVar != null && oVar.l()) {
            return this.B.u(this.w0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        o oVar = this.B;
        if (oVar != null && oVar.l()) {
            return this.B.v(this.w0);
        }
        return 0;
    }

    public int d0(View view) {
        c0 h0 = h0(view);
        if (h0 != null) {
            return h0.l();
        }
        return -1;
    }

    public final void d1() {
        z zVar = this.w0;
        zVar.n = -1L;
        zVar.m = -1;
        zVar.o = -1;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().f(i2, i3, i4, i5, iArr);
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
        boolean z2;
        float f2;
        int i2;
        super.draw(canvas);
        int size = this.D.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            this.D.get(i3).i(canvas, this, this.w0);
        }
        EdgeEffect edgeEffect = this.a0;
        boolean z4 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.v ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.a0;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.b0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.v) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.b0;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.c0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.v ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.c0;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.d0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.v) {
                f2 = (-getWidth()) + getPaddingRight();
                i2 = (-getHeight()) + getPaddingBottom();
            } else {
                f2 = -getWidth();
                i2 = -getHeight();
            }
            canvas.translate(f2, i2);
            EdgeEffect edgeEffect8 = this.d0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.e0 == null || this.D.size() <= 0 || !this.e0.p()) {
            z4 = z2;
        }
        if (z4) {
            xs1.i0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public int e0(View view) {
        c0 h0 = h0(view);
        if (h0 != null) {
            return h0.o();
        }
        return -1;
    }

    public final void e1() {
        VelocityTracker velocityTracker = this.h0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        v1(0);
        V0();
    }

    @Deprecated
    public int f0(View view) {
        return d0(view);
    }

    public final void f1() {
        View focusedChild = (this.s0 && hasFocus() && this.A != null) ? getFocusedChild() : null;
        c0 S = focusedChild != null ? S(focusedChild) : null;
        if (S == null) {
            d1();
            return;
        }
        this.w0.n = this.A.h() ? S.m() : -1L;
        this.w0.m = this.S ? -1 : S.x() ? S.d : S.l();
        this.w0.o = j0(S.a);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i2) {
        View view2;
        boolean z2;
        View Q02 = this.B.Q0(view, i2);
        if (Q02 != null) {
            return Q02;
        }
        boolean z3 = (this.A == null || this.B == null || w0() || this.M) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z3 && (i2 == 2 || i2 == 1)) {
            if (this.B.l()) {
                int i3 = i2 == 2 ? 130 : 33;
                z2 = focusFinder.findNextFocus(this, view, i3) == null;
                if (S0) {
                    i2 = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.B.k()) {
                int i4 = (this.B.Z() == 1) ^ (i2 == 2) ? 66 : 17;
                boolean z4 = focusFinder.findNextFocus(this, view, i4) == null;
                if (S0) {
                    i2 = i4;
                }
                z2 = z4;
            }
            if (z2) {
                u();
                if (R(view) == null) {
                    return null;
                }
                s1();
                this.B.J0(view, i2, this.q, this.w0);
                u1(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i2);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i2);
            if (findNextFocus == null && z3) {
                u();
                if (R(view) == null) {
                    return null;
                }
                s1();
                view2 = this.B.J0(view, i2, this.q, this.w0);
                u1(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return x0(view, view2, i2) ? view2 : super.focusSearch(view, i2);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        } else {
            c1(view2, null);
            return view;
        }
    }

    public final void g(c0 c0Var) {
        View view = c0Var.a;
        boolean z2 = view.getParent() == this;
        this.q.J(g0(view));
        if (c0Var.z()) {
            this.t.c(view, -1, view.getLayoutParams(), true);
            return;
        }
        androidx.recyclerview.widget.b bVar = this.t;
        if (z2) {
            bVar.k(view);
        } else {
            bVar.b(view, true);
        }
    }

    public c0 g0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return h0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public void g1() {
        int j2 = this.t.j();
        for (int i2 = 0; i2 < j2; i2++) {
            c0 h0 = h0(this.t.i(i2));
            if (!h0.L()) {
                h0.G();
            }
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.B;
        if (oVar != null) {
            return oVar.D();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.B;
        if (oVar != null) {
            return oVar.E(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.B;
        if (oVar != null) {
            return oVar.F(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g getAdapter() {
        return this.A;
    }

    @Override // android.view.View
    public int getBaseline() {
        o oVar = this.B;
        return oVar != null ? oVar.G() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        j jVar = this.E0;
        return jVar == null ? super.getChildDrawingOrder(i2, i3) : jVar.a(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.v;
    }

    public androidx.recyclerview.widget.k getCompatAccessibilityDelegate() {
        return this.D0;
    }

    public k getEdgeEffectFactory() {
        return this.W;
    }

    public l getItemAnimator() {
        return this.e0;
    }

    public int getItemDecorationCount() {
        return this.D.size();
    }

    public o getLayoutManager() {
        return this.B;
    }

    public int getMaxFlingVelocity() {
        return this.p0;
    }

    public int getMinFlingVelocity() {
        return this.o0;
    }

    public long getNanoTime() {
        if (R0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public r getOnFlingListener() {
        return this.n0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.s0;
    }

    public u getRecycledViewPool() {
        return this.q.i();
    }

    public int getScrollState() {
        return this.f0;
    }

    public void h(n nVar) {
        i(nVar, -1);
    }

    public boolean h1(int i2, int i3, MotionEvent motionEvent) {
        int i4;
        int i5;
        int i6;
        int i7;
        u();
        if (this.A != null) {
            int[] iArr = this.J0;
            iArr[0] = 0;
            iArr[1] = 0;
            i1(i2, i3, iArr);
            int[] iArr2 = this.J0;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i4 = i9;
            i5 = i8;
            i6 = i2 - i8;
            i7 = i3 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.D.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.J0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        G(i5, i4, i6, i7, this.H0, 0, iArr3);
        int[] iArr4 = this.J0;
        int i10 = i6 - iArr4[0];
        int i11 = i7 - iArr4[1];
        boolean z2 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i12 = this.k0;
        int[] iArr5 = this.H0;
        this.k0 = i12 - iArr5[0];
        this.l0 -= iArr5[1];
        int[] iArr6 = this.I0;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !qq0.a(motionEvent, 8194)) {
                S0(motionEvent.getX(), i10, motionEvent.getY(), i11);
            }
            t(i2, i3);
        }
        if (i5 != 0 || i4 != 0) {
            I(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i5 == 0 && i4 == 0) ? false : true;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public void i(n nVar, int i2) {
        o oVar = this.B;
        if (oVar != null) {
            oVar.g("Cannot add item decoration during a scroll  or layout");
        }
        if (this.D.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.D.add(nVar);
        } else {
            this.D.add(i2, nVar);
        }
        z0();
        requestLayout();
    }

    public void i1(int i2, int i3, int[] iArr) {
        s1();
        I0();
        lm1.a("RV Scroll");
        Q(this.w0);
        int w1 = i2 != 0 ? this.B.w1(i2, this.q, this.w0) : 0;
        int y1 = i3 != 0 ? this.B.y1(i3, this.q, this.w0) : 0;
        lm1.b();
        b1();
        J0();
        u1(false);
        if (iArr != null) {
            iArr[0] = w1;
            iArr[1] = y1;
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.G;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.M;
    }

    @Override // android.view.View, com.daaw.es0
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(s sVar) {
        this.E.add(sVar);
    }

    public final int j0(View view) {
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

    public void j1(int i2) {
        if (this.M) {
            return;
        }
        w1();
        o oVar = this.B;
        if (oVar == null) {
            return;
        }
        oVar.x1(i2);
        awakenScrollBars();
    }

    public void k(t tVar) {
        if (this.y0 == null) {
            this.y0 = new ArrayList();
        }
        this.y0.add(tVar);
    }

    public final String k0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    public final void k1(g gVar, boolean z2, boolean z3) {
        g gVar2 = this.A;
        if (gVar2 != null) {
            gVar2.w(this.p);
            this.A.p(this);
        }
        if (!z2 || z3) {
            W0();
        }
        this.s.v();
        g gVar3 = this.A;
        this.A = gVar;
        if (gVar != null) {
            gVar.u(this.p);
            gVar.l(this);
        }
        o oVar = this.B;
        if (oVar != null) {
            oVar.E0(gVar3, this.A);
        }
        this.q.x(gVar3, this.A, z2);
        this.w0.g = true;
    }

    public void l(c0 c0Var, l.c cVar, l.c cVar2) {
        c0Var.I(false);
        if (this.e0.a(c0Var, cVar, cVar2)) {
            O0();
        }
    }

    public Rect l0(View view) {
        p pVar = (p) view.getLayoutParams();
        if (pVar.c) {
            if (this.w0.e() && (pVar.b() || pVar.d())) {
                return pVar.b;
            }
            Rect rect = pVar.b;
            rect.set(0, 0, 0, 0);
            int size = this.D.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.x.set(0, 0, 0, 0);
                this.D.get(i2).e(this.x, view, this, this.w0);
                int i3 = rect.left;
                Rect rect2 = this.x;
                rect.left = i3 + rect2.left;
                rect.top += rect2.top;
                rect.right += rect2.right;
                rect.bottom += rect2.bottom;
            }
            pVar.c = false;
            return rect;
        }
        return pVar.b;
    }

    public boolean l1(c0 c0Var, int i2) {
        if (!w0()) {
            xs1.B0(c0Var.a, i2);
            return true;
        }
        c0Var.q = i2;
        this.K0.add(c0Var);
        return false;
    }

    public final void m(c0 c0Var, c0 c0Var2, l.c cVar, l.c cVar2, boolean z2, boolean z3) {
        c0Var.I(false);
        if (z2) {
            g(c0Var);
        }
        if (c0Var != c0Var2) {
            if (z3) {
                g(c0Var2);
            }
            c0Var.h = c0Var2;
            g(c0Var);
            this.q.J(c0Var);
            c0Var2.I(false);
            c0Var2.i = c0Var;
        }
        if (this.e0.b(c0Var, c0Var2, cVar, cVar2)) {
            O0();
        }
    }

    public final void m0(long j2, c0 c0Var, c0 c0Var2) {
        int g2 = this.t.g();
        for (int i2 = 0; i2 < g2; i2++) {
            c0 h0 = h0(this.t.f(i2));
            if (h0 != c0Var && c0(h0) == j2) {
                g gVar = this.A;
                if (gVar == null || !gVar.h()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + h0 + " \n View Holder 2:" + c0Var + P());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + h0 + " \n View Holder 2:" + c0Var + P());
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
        sb.append(c0Var2);
        sb.append(" cannot be found but it is necessary for ");
        sb.append(c0Var);
        sb.append(P());
    }

    public boolean m1(AccessibilityEvent accessibilityEvent) {
        if (w0()) {
            int a2 = accessibilityEvent != null ? com.daaw.x.a(accessibilityEvent) : 0;
            this.O |= a2 != 0 ? a2 : 0;
            return true;
        }
        return false;
    }

    public void n(c0 c0Var, l.c cVar, l.c cVar2) {
        g(c0Var);
        c0Var.I(false);
        if (this.e0.c(c0Var, cVar, cVar2)) {
            O0();
        }
    }

    public boolean n0() {
        return !this.J || this.S || this.s.p();
    }

    public void n1(int i2, int i3) {
        o1(i2, i3, null);
    }

    public void o(String str) {
        if (w0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + P());
        } else if (this.V > 0) {
            new IllegalStateException("" + P());
        }
    }

    public final boolean o0() {
        int g2 = this.t.g();
        for (int i2 = 0; i2 < g2; i2++) {
            c0 h0 = h0(this.t.f(i2));
            if (h0 != null && !h0.L() && h0.A()) {
                return true;
            }
        }
        return false;
    }

    public void o1(int i2, int i3, Interpolator interpolator) {
        p1(i2, i3, interpolator, Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U = 0;
        boolean z2 = true;
        this.G = true;
        this.J = (!this.J || isLayoutRequested()) ? false : false;
        o oVar = this.B;
        if (oVar != null) {
            oVar.z(this);
        }
        this.C0 = false;
        if (R0) {
            ThreadLocal<androidx.recyclerview.widget.e> threadLocal = androidx.recyclerview.widget.e.t;
            androidx.recyclerview.widget.e eVar = threadLocal.get();
            this.u0 = eVar;
            if (eVar == null) {
                this.u0 = new androidx.recyclerview.widget.e();
                Display x2 = xs1.x(this);
                float f2 = 60.0f;
                if (!isInEditMode() && x2 != null) {
                    float refreshRate = x2.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                androidx.recyclerview.widget.e eVar2 = this.u0;
                eVar2.r = 1.0E9f / f2;
                threadLocal.set(eVar2);
            }
            this.u0.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.e eVar;
        super.onDetachedFromWindow();
        l lVar = this.e0;
        if (lVar != null) {
            lVar.k();
        }
        w1();
        this.G = false;
        o oVar = this.B;
        if (oVar != null) {
            oVar.A(this, this.q);
        }
        this.K0.clear();
        removeCallbacks(this.L0);
        this.u.j();
        if (!R0 || (eVar = this.u0) == null) {
            return;
        }
        eVar.j(this);
        this.u0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.D.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.D.get(i2).g(canvas, this, this.w0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.B
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.M
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.B
            boolean r0 = r0.l()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.B
            boolean r3 = r3.k()
            if (r3 == 0) goto L61
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L62
        L3c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L60
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.B
            boolean r3 = r3.l()
            if (r3 == 0) goto L55
            float r0 = -r0
            goto L61
        L55:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.B
            boolean r3 = r3.k()
            if (r3 == 0) goto L60
            r3 = r0
            r0 = 0
            goto L62
        L60:
            r0 = 0
        L61:
            r3 = 0
        L62:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6a
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6a:
            float r2 = r5.q0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.r0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.h1(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.M) {
            return false;
        }
        this.F = null;
        if (T(motionEvent)) {
            q();
            return true;
        }
        o oVar = this.B;
        if (oVar == null) {
            return false;
        }
        boolean k2 = oVar.k();
        boolean l2 = this.B.l();
        if (this.h0 == null) {
            this.h0 = VelocityTracker.obtain();
        }
        this.h0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.N) {
                this.N = false;
            }
            this.g0 = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.k0 = x2;
            this.i0 = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.l0 = y2;
            this.j0 = y2;
            if (this.f0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                v1(1);
            }
            int[] iArr = this.I0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = k2;
            if (l2) {
                i2 = (k2 ? 1 : 0) | 2;
            }
            t1(i2, 0);
        } else if (actionMasked == 1) {
            this.h0.clear();
            v1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.g0);
            if (findPointerIndex < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error processing scroll; pointer index for id ");
                sb.append(this.g0);
                sb.append(" not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f0 != 1) {
                int i3 = x3 - this.i0;
                int i4 = y3 - this.j0;
                if (!k2 || Math.abs(i3) <= this.m0) {
                    z2 = false;
                } else {
                    this.k0 = x3;
                    z2 = true;
                }
                if (l2 && Math.abs(i4) > this.m0) {
                    this.l0 = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            q();
        } else if (actionMasked == 5) {
            this.g0 = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.k0 = x4;
            this.i0 = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.l0 = y4;
            this.j0 = y4;
        } else if (actionMasked == 6) {
            L0(motionEvent);
        }
        return this.f0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        lm1.a("RV OnLayout");
        B();
        lm1.b();
        this.J = true;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        o oVar = this.B;
        if (oVar == null) {
            w(i2, i3);
            return;
        }
        boolean z2 = false;
        if (oVar.s0()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.B.Z0(this.q, this.w0, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            if (z2 || this.A == null) {
                return;
            }
            if (this.w0.e == 1) {
                C();
            }
            this.B.A1(i2, i3);
            this.w0.j = true;
            D();
            this.B.D1(i2, i3);
            if (this.B.G1()) {
                this.B.A1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.w0.j = true;
                D();
                this.B.D1(i2, i3);
            }
        } else if (this.H) {
            this.B.Z0(this.q, this.w0, i2, i3);
        } else {
            if (this.P) {
                s1();
                I0();
                Q0();
                J0();
                z zVar = this.w0;
                if (zVar.l) {
                    zVar.h = true;
                } else {
                    this.s.j();
                    this.w0.h = false;
                }
                this.P = false;
                u1(false);
            } else if (this.w0.l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            g gVar = this.A;
            if (gVar != null) {
                this.w0.f = gVar.d();
            } else {
                this.w0.f = 0;
            }
            s1();
            this.B.Z0(this.q, this.w0, i2, i3);
            u1(false);
            this.w0.h = false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (w0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.r = savedState;
        super.onRestoreInstanceState(savedState.a());
        o oVar = this.B;
        if (oVar == null || (parcelable2 = this.r.r) == null) {
            return;
        }
        oVar.c1(parcelable2);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.r;
        if (savedState2 != null) {
            savedState.b(savedState2);
        } else {
            o oVar = this.B;
            savedState.r = oVar != null ? oVar.d1() : null;
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        t0();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean p(c0 c0Var) {
        l lVar = this.e0;
        return lVar == null || lVar.g(c0Var, c0Var.q());
    }

    public void p0() {
        this.s = new androidx.recyclerview.widget.a(new f());
    }

    public void p1(int i2, int i3, Interpolator interpolator, int i4) {
        q1(i2, i3, interpolator, i4, false);
    }

    public final void q() {
        e1();
        setScrollState(0);
    }

    @SuppressLint({"InlinedApi"})
    public final void q0() {
        if (xs1.D(this) == 0) {
            xs1.C0(this, 8);
        }
    }

    public void q1(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
        o oVar = this.B;
        if (oVar == null || this.M) {
            return;
        }
        if (!oVar.k()) {
            i2 = 0;
        }
        if (!this.B.l()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (!(i4 == Integer.MIN_VALUE || i4 > 0)) {
            scrollBy(i2, i3);
            return;
        }
        if (z2) {
            int i5 = i2 != 0 ? 1 : 0;
            if (i3 != 0) {
                i5 |= 2;
            }
            t1(i5, 1);
        }
        this.t0.f(i2, i3, i4, interpolator);
    }

    public final void r0() {
        this.t = new androidx.recyclerview.widget.b(new e());
    }

    public void r1(int i2) {
        o oVar;
        if (this.M || (oVar = this.B) == null) {
            return;
        }
        oVar.I1(this, this.w0, i2);
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z2) {
        c0 h0 = h0(view);
        if (h0 != null) {
            if (h0.z()) {
                h0.h();
            } else if (!h0.L()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + h0 + P());
            }
        }
        view.clearAnimation();
        z(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.B.b1(this, this.w0, view, view2) && view2 != null) {
            c1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.B.r1(this, view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.E.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.E.get(i2).c(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.K != 0 || this.M) {
            this.L = true;
        } else {
            super.requestLayout();
        }
    }

    public void s() {
        int j2 = this.t.j();
        for (int i2 = 0; i2 < j2; i2++) {
            c0 h0 = h0(this.t.i(i2));
            if (!h0.L()) {
                h0.e();
            }
        }
        this.q.d();
    }

    public void s0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(d11.fastscroll_default_thickness), resources.getDimensionPixelSize(d11.fastscroll_minimum_range), resources.getDimensionPixelOffset(d11.fastscroll_margin));
            return;
        }
        throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + P());
    }

    public void s1() {
        int i2 = this.K + 1;
        this.K = i2;
        if (i2 != 1 || this.M) {
            return;
        }
        this.L = false;
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        o oVar = this.B;
        if (oVar == null || this.M) {
            return;
        }
        boolean k2 = oVar.k();
        boolean l2 = this.B.l();
        if (k2 || l2) {
            if (!k2) {
                i2 = 0;
            }
            if (!l2) {
                i3 = 0;
            }
            h1(i2, i3, null);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (m1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.k kVar) {
        this.D0 = kVar;
        xs1.r0(this, kVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        k1(gVar, false, true);
        R0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar == this.E0) {
            return;
        }
        this.E0 = jVar;
        setChildrenDrawingOrderEnabled(jVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.v) {
            t0();
        }
        this.v = z2;
        super.setClipToPadding(z2);
        if (this.J) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        ty0.f(kVar);
        this.W = kVar;
        t0();
    }

    public void setHasFixedSize(boolean z2) {
        this.H = z2;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.e0;
        if (lVar2 != null) {
            lVar2.k();
            this.e0.v(null);
        }
        this.e0 = lVar;
        if (lVar != null) {
            lVar.v(this.B0);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.q.G(i2);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(o oVar) {
        if (oVar == this.B) {
            return;
        }
        w1();
        if (this.B != null) {
            l lVar = this.e0;
            if (lVar != null) {
                lVar.k();
            }
            this.B.k1(this.q);
            this.B.l1(this.q);
            this.q.c();
            if (this.G) {
                this.B.A(this, this.q);
            }
            this.B.E1(null);
            this.B = null;
        } else {
            this.q.c();
        }
        this.t.o();
        this.B = oVar;
        if (oVar != null) {
            if (oVar.b != null) {
                throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.b.P());
            }
            oVar.E1(this);
            if (this.G) {
                this.B.z(this);
            }
        }
        this.q.K();
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
    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().m(z2);
    }

    public void setOnFlingListener(r rVar) {
        this.n0 = rVar;
    }

    @Deprecated
    public void setOnScrollListener(t tVar) {
        this.x0 = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.s0 = z2;
    }

    public void setRecycledViewPool(u uVar) {
        this.q.E(uVar);
    }

    public void setRecyclerListener(w wVar) {
        this.C = wVar;
    }

    void setScrollState(int i2) {
        if (i2 == this.f0) {
            return;
        }
        this.f0 = i2;
        if (i2 != 2) {
            x1();
        }
        H(i2);
    }

    public void setScrollingTouchSlop(int i2) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                this.m0 = scaledTouchSlop;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("setScrollingTouchSlop(): bad argument constant ");
            sb.append(i2);
            sb.append("; using default value");
        }
        scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.m0 = scaledTouchSlop;
    }

    public void setViewCacheExtension(a0 a0Var) {
        this.q.F(a0Var);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().o(i2);
    }

    @Override // android.view.View, com.daaw.es0
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.M) {
            o("Do not suppressLayout in layout or scroll");
            if (z2) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.M = true;
                this.N = true;
                w1();
                return;
            }
            this.M = false;
            if (this.L && this.B != null && this.A != null) {
                requestLayout();
            }
            this.L = false;
        }
    }

    public void t(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.a0;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.a0.onRelease();
            z2 = this.a0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.c0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.c0.onRelease();
            z2 |= this.c0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.b0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.b0.onRelease();
            z2 |= this.b0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.d0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.d0.onRelease();
            z2 |= this.d0.isFinished();
        }
        if (z2) {
            xs1.i0(this);
        }
    }

    public void t0() {
        this.d0 = null;
        this.b0 = null;
        this.c0 = null;
        this.a0 = null;
    }

    public boolean t1(int i2, int i3) {
        return getScrollingChildHelper().p(i2, i3);
    }

    public void u() {
        if (!this.J || this.S) {
            lm1.a("RV FullInvalidate");
            B();
            lm1.b();
        } else if (this.s.p()) {
            if (this.s.o(4) && !this.s.o(11)) {
                lm1.a("RV PartialInvalidate");
                s1();
                I0();
                this.s.t();
                if (!this.L) {
                    if (o0()) {
                        B();
                    } else {
                        this.s.i();
                    }
                }
                u1(true);
                J0();
            } else if (!this.s.p()) {
                return;
            } else {
                lm1.a("RV FullInvalidate");
                B();
            }
            lm1.b();
        }
    }

    public void u0() {
        if (this.D.size() == 0) {
            return;
        }
        o oVar = this.B;
        if (oVar != null) {
            oVar.g("Cannot invalidate item decorations during a scroll or layout");
        }
        z0();
        requestLayout();
    }

    public void u1(boolean z2) {
        if (this.K < 1) {
            this.K = 1;
        }
        if (!z2 && !this.M) {
            this.L = false;
        }
        if (this.K == 1) {
            if (z2 && this.L && !this.M && this.B != null && this.A != null) {
                B();
            }
            if (!this.M) {
                this.L = false;
            }
        }
        this.K--;
    }

    public final void v(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String k0 = k0(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(k0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(o.class);
                Object[] objArr = null;
                try {
                    constructor = asSubclass.getConstructor(U0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                } catch (NoSuchMethodException e2) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e3) {
                        e3.initCause(e2);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + k0, e3);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((o) constructor.newInstance(objArr));
            } catch (ClassCastException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + k0, e4);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + k0, e5);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + k0, e6);
            } catch (InstantiationException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + k0, e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + k0, e8);
            }
        }
    }

    public boolean v0() {
        AccessibilityManager accessibilityManager = this.Q;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void v1(int i2) {
        getScrollingChildHelper().r(i2);
    }

    public void w(int i2, int i3) {
        setMeasuredDimension(o.n(i2, getPaddingLeft() + getPaddingRight(), xs1.G(this)), o.n(i3, getPaddingTop() + getPaddingBottom(), xs1.F(this)));
    }

    public boolean w0() {
        return this.U > 0;
    }

    public void w1() {
        setScrollState(0);
        x1();
    }

    public final boolean x(int i2, int i3) {
        U(this.F0);
        int[] iArr = this.F0;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    public final boolean x0(View view, View view2, int i2) {
        int i3;
        if (view2 == null || view2 == this || R(view2) == null) {
            return false;
        }
        if (view == null || R(view) == null) {
            return true;
        }
        this.x.set(0, 0, view.getWidth(), view.getHeight());
        this.y.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.x);
        offsetDescendantRectToMyCoords(view2, this.y);
        char c2 = 65535;
        int i4 = this.B.Z() == 1 ? -1 : 1;
        Rect rect = this.x;
        int i5 = rect.left;
        Rect rect2 = this.y;
        int i6 = rect2.left;
        if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
            i3 = 1;
        } else {
            int i7 = rect.right;
            int i8 = rect2.right;
            i3 = ((i7 > i8 || i5 >= i8) && i5 > i6) ? -1 : 0;
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
            c2 = 1;
        } else {
            int i11 = rect.bottom;
            int i12 = rect2.bottom;
            if ((i11 <= i12 && i9 < i12) || i9 <= i10) {
                c2 = 0;
            }
        }
        if (i2 == 1) {
            return c2 < 0 || (c2 == 0 && i3 * i4 <= 0);
        } else if (i2 == 2) {
            return c2 > 0 || (c2 == 0 && i3 * i4 >= 0);
        } else if (i2 == 17) {
            return i3 < 0;
        } else if (i2 == 33) {
            return c2 < 0;
        } else if (i2 == 66) {
            return i3 > 0;
        } else if (i2 == 130) {
            return c2 > 0;
        } else {
            throw new IllegalArgumentException("Invalid direction: " + i2 + P());
        }
    }

    public final void x1() {
        this.t0.g();
        o oVar = this.B;
        if (oVar != null) {
            oVar.K1();
        }
    }

    public void y(View view) {
        c0 h0 = h0(view);
        G0(view);
        g gVar = this.A;
        if (gVar != null && h0 != null) {
            gVar.r(h0);
        }
        List<q> list = this.R;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.R.get(size).b(view);
            }
        }
    }

    public void y0(int i2) {
        if (this.B == null) {
            return;
        }
        setScrollState(2);
        this.B.x1(i2);
        awakenScrollBars();
    }

    public void y1(int i2, int i3, Object obj) {
        int i4;
        int j2 = this.t.j();
        int i5 = i2 + i3;
        for (int i6 = 0; i6 < j2; i6++) {
            View i7 = this.t.i(i6);
            c0 h0 = h0(i7);
            if (h0 != null && !h0.L() && (i4 = h0.c) >= i2 && i4 < i5) {
                h0.d(2);
                h0.c(obj);
                ((p) i7.getLayoutParams()).c = true;
            }
        }
        this.q.M(i2, i3);
    }

    public void z(View view) {
        c0 h0 = h0(view);
        H0(view);
        g gVar = this.A;
        if (gVar != null && h0 != null) {
            gVar.s(h0);
        }
        List<q> list = this.R;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.R.get(size).a(view);
            }
        }
    }

    public void z0() {
        int j2 = this.t.j();
        for (int i2 = 0; i2 < j2; i2++) {
            ((p) this.t.i(i2).getLayoutParams()).c = true;
        }
        this.q.s();
    }
}
