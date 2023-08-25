package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.c;
import com.daaw.bu1;
import com.daaw.c40;
import com.daaw.ci1;
import com.daaw.du1;
import com.daaw.eu1;
import com.daaw.hn;
import com.daaw.jt1;
import com.daaw.k81;
import com.daaw.kc1;
import com.daaw.kr0;
import com.daaw.l81;
import com.daaw.m81;
import com.daaw.mk0;
import com.daaw.mt1;
import com.daaw.nt1;
import com.daaw.p30;
import com.daaw.r30;
import com.daaw.sj0;
import com.daaw.u30;
import com.daaw.v80;
import com.daaw.vi0;
import com.daaw.w80;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, sj0, nt1, w80, m81 {
    public static final Object p0 = new Object();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public FragmentManager H;
    public androidx.fragment.app.e<?> I;
    public Fragment K;
    public int L;
    public int M;
    public String N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean U;
    public ViewGroup V;
    public View W;
    public boolean X;
    public e Z;
    public boolean b0;
    public boolean c0;
    public float d0;
    public LayoutInflater e0;
    public boolean f0;
    public androidx.lifecycle.e h0;
    public c40 i0;
    public jt1.b k0;
    public l81 l0;
    public int m0;
    public Bundle q;
    public SparseArray<Parcelable> r;
    public Bundle s;
    public Boolean t;
    public Bundle v;
    public Fragment w;
    public int y;
    public int p = -1;
    public String u = UUID.randomUUID().toString();
    public String x = null;
    public Boolean z = null;
    public FragmentManager J = new u30();
    public boolean T = true;
    public boolean Y = true;
    public Runnable a0 = new a();
    public c.EnumC0020c g0 = c.EnumC0020c.RESUMED;
    public kr0<sj0> j0 = new kr0<>();
    public final AtomicInteger n0 = new AtomicInteger();
    public final ArrayList<g> o0 = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.F1();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.h(false);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final /* synthetic */ l p;

        public c(l lVar) {
            this.p = lVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.p.g();
        }
    }

    /* loaded from: classes.dex */
    public class d extends r30 {
        public d() {
        }

        @Override // com.daaw.r30
        public View f(int i) {
            View view = Fragment.this.W;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // com.daaw.r30
        public boolean h() {
            return Fragment.this.W != null;
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public View a;
        public Animator b;
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public ArrayList<String> i;
        public ArrayList<String> j;
        public Object k = null;
        public Object l;
        public Object m;
        public Object n;
        public Object o;
        public Object p;
        public Boolean q;
        public Boolean r;
        public float s;
        public View t;
        public boolean u;
        public h v;
        public boolean w;

        public e() {
            Object obj = Fragment.p0;
            this.l = obj;
            this.m = null;
            this.n = obj;
            this.o = null;
            this.p = obj;
            this.s = 1.0f;
            this.t = null;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends RuntimeException {
        public f(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g {
        public abstract void a();
    }

    /* loaded from: classes.dex */
    public interface h {
        void a();

        void b();
    }

    public Fragment() {
        X();
    }

    @Deprecated
    public static Fragment Z(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = androidx.fragment.app.d.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.w1(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e2) {
            throw new f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new f("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new f("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    public kc1 A() {
        e eVar = this.Z;
        if (eVar == null) {
            return null;
        }
        Objects.requireNonNull(eVar);
        return null;
    }

    public void A0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.U = true;
        androidx.fragment.app.e<?> eVar = this.I;
        Activity j = eVar == null ? null : eVar.j();
        if (j != null) {
            this.U = false;
            z0(j, attributeSet, bundle);
        }
    }

    public void A1(h hVar) {
        l();
        e eVar = this.Z;
        h hVar2 = eVar.v;
        if (hVar == hVar2) {
            return;
        }
        if (hVar != null && hVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (eVar.u) {
            eVar.v = hVar;
        }
        if (hVar != null) {
            hVar.a();
        }
    }

    public View B() {
        e eVar = this.Z;
        if (eVar == null) {
            return null;
        }
        return eVar.t;
    }

    public void B0(boolean z) {
    }

    public void B1(boolean z) {
        if (this.Z == null) {
            return;
        }
        l().c = z;
    }

    public final Object C() {
        androidx.fragment.app.e<?> eVar = this.I;
        if (eVar == null) {
            return null;
        }
        return eVar.m();
    }

    public boolean C0(MenuItem menuItem) {
        return false;
    }

    public void C1(float f2) {
        l().s = f2;
    }

    @Deprecated
    public LayoutInflater D(Bundle bundle) {
        androidx.fragment.app.e<?> eVar = this.I;
        if (eVar != null) {
            LayoutInflater n = eVar.n();
            vi0.b(n, this.J.t0());
            return n;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void D0(Menu menu) {
    }

    public void D1(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        l();
        e eVar = this.Z;
        eVar.i = arrayList;
        eVar.j = arrayList2;
    }

    public final int E() {
        c.EnumC0020c enumC0020c = this.g0;
        return (enumC0020c == c.EnumC0020c.INITIALIZED || this.K == null) ? enumC0020c.ordinal() : Math.min(enumC0020c.ordinal(), this.K.E());
    }

    public void E0() {
        this.U = true;
    }

    @Deprecated
    public void E1(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (this.I != null) {
            H().K0(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public int F() {
        e eVar = this.Z;
        if (eVar == null) {
            return 0;
        }
        return eVar.h;
    }

    public void F0(boolean z) {
    }

    public void F1() {
        if (this.Z == null || !l().u) {
            return;
        }
        if (this.I == null) {
            l().u = false;
        } else if (Looper.myLooper() != this.I.l().getLooper()) {
            this.I.l().postAtFrontOfQueue(new b());
        } else {
            h(true);
        }
    }

    public final Fragment G() {
        return this.K;
    }

    public void G0(Menu menu) {
    }

    public final FragmentManager H() {
        FragmentManager fragmentManager = this.H;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void H0(boolean z) {
    }

    public boolean I() {
        e eVar = this.Z;
        if (eVar == null) {
            return false;
        }
        return eVar.c;
    }

    @Deprecated
    public void I0(int i, String[] strArr, int[] iArr) {
    }

    public int J() {
        e eVar = this.Z;
        if (eVar == null) {
            return 0;
        }
        return eVar.f;
    }

    public void J0() {
        this.U = true;
    }

    public int K() {
        e eVar = this.Z;
        if (eVar == null) {
            return 0;
        }
        return eVar.g;
    }

    public void K0(Bundle bundle) {
    }

    public float L() {
        e eVar = this.Z;
        if (eVar == null) {
            return 1.0f;
        }
        return eVar.s;
    }

    public void L0() {
        this.U = true;
    }

    public Object M() {
        e eVar = this.Z;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.n;
        return obj == p0 ? z() : obj;
    }

    public void M0() {
        this.U = true;
    }

    public final Resources N() {
        return o1().getResources();
    }

    public void N0(View view, Bundle bundle) {
    }

    public Object O() {
        e eVar = this.Z;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.l;
        return obj == p0 ? w() : obj;
    }

    public void O0(Bundle bundle) {
        this.U = true;
    }

    public Object P() {
        e eVar = this.Z;
        if (eVar == null) {
            return null;
        }
        return eVar.o;
    }

    public void P0(Bundle bundle) {
        this.J.Q0();
        this.p = 3;
        this.U = false;
        i0(bundle);
        if (this.U) {
            r1();
            this.J.y();
            return;
        }
        throw new ci1("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public Object Q() {
        e eVar = this.Z;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.p;
        return obj == p0 ? P() : obj;
    }

    public void Q0() {
        Iterator<g> it = this.o0.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.o0.clear();
        this.J.j(this.I, j(), this);
        this.p = 0;
        this.U = false;
        l0(this.I.k());
        if (this.U) {
            this.H.I(this);
            this.J.z();
            return;
        }
        throw new ci1("Fragment " + this + " did not call through to super.onAttach()");
    }

    public ArrayList<String> R() {
        ArrayList<String> arrayList;
        e eVar = this.Z;
        return (eVar == null || (arrayList = eVar.i) == null) ? new ArrayList<>() : arrayList;
    }

    public void R0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.J.A(configuration);
    }

    public ArrayList<String> S() {
        ArrayList<String> arrayList;
        e eVar = this.Z;
        return (eVar == null || (arrayList = eVar.j) == null) ? new ArrayList<>() : arrayList;
    }

    public boolean S0(MenuItem menuItem) {
        if (this.O) {
            return false;
        }
        if (n0(menuItem)) {
            return true;
        }
        return this.J.B(menuItem);
    }

    public final String T(int i) {
        return N().getString(i);
    }

    public void T0(Bundle bundle) {
        this.J.Q0();
        this.p = 1;
        this.U = false;
        this.h0.a(new androidx.lifecycle.d() { // from class: androidx.fragment.app.Fragment.5
            @Override // androidx.lifecycle.d
            public void a(sj0 sj0Var, c.b bVar) {
                View view;
                if (bVar != c.b.ON_STOP || (view = Fragment.this.W) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        this.l0.d(bundle);
        o0(bundle);
        this.f0 = true;
        if (this.U) {
            this.h0.h(c.b.ON_CREATE);
            return;
        }
        throw new ci1("Fragment " + this + " did not call through to super.onCreate()");
    }

    @Deprecated
    public final Fragment U() {
        String str;
        Fragment fragment = this.w;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.H;
        if (fragmentManager == null || (str = this.x) == null) {
            return null;
        }
        return fragmentManager.f0(str);
    }

    public boolean U0(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.O) {
            return false;
        }
        if (this.S && this.T) {
            z = true;
            r0(menu, menuInflater);
        }
        return z | this.J.D(menu, menuInflater);
    }

    public View V() {
        return this.W;
    }

    public void V0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.J.Q0();
        this.F = true;
        this.i0 = new c40(this, g());
        View s0 = s0(layoutInflater, viewGroup, bundle);
        this.W = s0;
        if (s0 == null) {
            if (this.i0.f()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.i0 = null;
            return;
        }
        this.i0.e();
        bu1.a(this.W, this.i0);
        eu1.a(this.W, this.i0);
        du1.a(this.W, this.i0);
        this.j0.j(this.i0);
    }

    public LiveData<sj0> W() {
        return this.j0;
    }

    public void W0() {
        this.J.E();
        this.h0.h(c.b.ON_DESTROY);
        this.p = 0;
        this.U = false;
        this.f0 = false;
        t0();
        if (this.U) {
            return;
        }
        throw new ci1("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public final void X() {
        this.h0 = new androidx.lifecycle.e(this);
        this.l0 = l81.a(this);
        this.k0 = null;
    }

    public void X0() {
        this.J.F();
        if (this.W != null && this.i0.a().b().a(c.EnumC0020c.CREATED)) {
            this.i0.b(c.b.ON_DESTROY);
        }
        this.p = 1;
        this.U = false;
        v0();
        if (this.U) {
            mk0.b(this).c();
            this.F = false;
            return;
        }
        throw new ci1("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public void Y() {
        X();
        this.u = UUID.randomUUID().toString();
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.G = 0;
        this.H = null;
        this.J = new u30();
        this.I = null;
        this.L = 0;
        this.M = 0;
        this.N = null;
        this.O = false;
        this.P = false;
    }

    public void Y0() {
        this.p = -1;
        this.U = false;
        w0();
        this.e0 = null;
        if (this.U) {
            if (this.J.D0()) {
                return;
            }
            this.J.E();
            this.J = new u30();
            return;
        }
        throw new ci1("Fragment " + this + " did not call through to super.onDetach()");
    }

    public LayoutInflater Z0(Bundle bundle) {
        LayoutInflater x0 = x0(bundle);
        this.e0 = x0;
        return x0;
    }

    @Override // com.daaw.sj0
    public androidx.lifecycle.c a() {
        return this.h0;
    }

    public boolean a0() {
        e eVar = this.Z;
        if (eVar == null) {
            return false;
        }
        return eVar.w;
    }

    public void a1() {
        onLowMemory();
        this.J.G();
    }

    public final boolean b0() {
        return this.G > 0;
    }

    public void b1(boolean z) {
        B0(z);
        this.J.H(z);
    }

    public final boolean c0() {
        FragmentManager fragmentManager;
        return this.T && ((fragmentManager = this.H) == null || fragmentManager.G0(this.K));
    }

    public boolean c1(MenuItem menuItem) {
        if (this.O) {
            return false;
        }
        if (this.S && this.T && C0(menuItem)) {
            return true;
        }
        return this.J.J(menuItem);
    }

    @Override // com.daaw.w80
    public /* synthetic */ hn d() {
        return v80.a(this);
    }

    public boolean d0() {
        e eVar = this.Z;
        if (eVar == null) {
            return false;
        }
        return eVar.u;
    }

    public void d1(Menu menu) {
        if (this.O) {
            return;
        }
        if (this.S && this.T) {
            D0(menu);
        }
        this.J.K(menu);
    }

    public final boolean e0() {
        return this.B;
    }

    public void e1() {
        this.J.M();
        if (this.W != null) {
            this.i0.b(c.b.ON_PAUSE);
        }
        this.h0.h(c.b.ON_PAUSE);
        this.p = 6;
        this.U = false;
        E0();
        if (this.U) {
            return;
        }
        throw new ci1("Fragment " + this + " did not call through to super.onPause()");
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final boolean f0() {
        Fragment G = G();
        return G != null && (G.e0() || G.f0());
    }

    public void f1(boolean z) {
        F0(z);
        this.J.N(z);
    }

    @Override // com.daaw.nt1
    public mt1 g() {
        if (this.H != null) {
            if (E() != c.EnumC0020c.INITIALIZED.ordinal()) {
                return this.H.z0(this);
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final boolean g0() {
        FragmentManager fragmentManager = this.H;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.J0();
    }

    public boolean g1(Menu menu) {
        boolean z = false;
        if (this.O) {
            return false;
        }
        if (this.S && this.T) {
            z = true;
            G0(menu);
        }
        return z | this.J.O(menu);
    }

    public void h(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        e eVar = this.Z;
        h hVar = null;
        if (eVar != null) {
            eVar.u = false;
            h hVar2 = eVar.v;
            eVar.v = null;
            hVar = hVar2;
        }
        if (hVar != null) {
            hVar.b();
        } else if (!FragmentManager.P || this.W == null || (viewGroup = this.V) == null || (fragmentManager = this.H) == null) {
        } else {
            l n = l.n(viewGroup, fragmentManager);
            n.p();
            if (z) {
                this.I.l().post(new c(n));
            } else {
                n.g();
            }
        }
    }

    public void h0() {
        this.J.Q0();
    }

    public void h1() {
        boolean H0 = this.H.H0(this);
        Boolean bool = this.z;
        if (bool == null || bool.booleanValue() != H0) {
            this.z = Boolean.valueOf(H0);
            H0(H0);
            this.J.P();
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    @Override // com.daaw.m81
    public final k81 i() {
        return this.l0.b();
    }

    @Deprecated
    public void i0(Bundle bundle) {
        this.U = true;
    }

    public void i1() {
        this.J.Q0();
        this.J.a0(true);
        this.p = 7;
        this.U = false;
        J0();
        if (!this.U) {
            throw new ci1("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.e eVar = this.h0;
        c.b bVar = c.b.ON_RESUME;
        eVar.h(bVar);
        if (this.W != null) {
            this.i0.b(bVar);
        }
        this.J.Q();
    }

    public r30 j() {
        return new d();
    }

    @Deprecated
    public void j0(int i, int i2, Intent intent) {
        if (FragmentManager.E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" received the following in onActivityResult(): requestCode: ");
            sb.append(i);
            sb.append(" resultCode: ");
            sb.append(i2);
            sb.append(" data: ");
            sb.append(intent);
        }
    }

    public void j1(Bundle bundle) {
        K0(bundle);
        this.l0.e(bundle);
        Parcelable e1 = this.J.e1();
        if (e1 != null) {
            bundle.putParcelable("android:support:fragments", e1);
        }
    }

    public void k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.L));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.M));
        printWriter.print(" mTag=");
        printWriter.println(this.N);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.p);
        printWriter.print(" mWho=");
        printWriter.print(this.u);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.G);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.A);
        printWriter.print(" mRemoving=");
        printWriter.print(this.B);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.C);
        printWriter.print(" mInLayout=");
        printWriter.println(this.D);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.O);
        printWriter.print(" mDetached=");
        printWriter.print(this.P);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.T);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.S);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.Q);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.Y);
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.H);
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.I);
        }
        if (this.K != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.K);
        }
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.v);
        }
        if (this.q != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.q);
        }
        if (this.r != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.r);
        }
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.s);
        }
        Fragment U = U();
        if (U != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(U);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.y);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(I());
        if (v() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(v());
        }
        if (y() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(y());
        }
        if (J() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(J());
        }
        if (K() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(K());
        }
        if (this.V != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.V);
        }
        if (this.W != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.W);
        }
        if (q() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(q());
        }
        if (u() != null) {
            mk0.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.J + ":");
        FragmentManager fragmentManager = this.J;
        fragmentManager.W(str + "  ", fileDescriptor, printWriter, strArr);
    }

    @Deprecated
    public void k0(Activity activity) {
        this.U = true;
    }

    public void k1() {
        this.J.Q0();
        this.J.a0(true);
        this.p = 5;
        this.U = false;
        L0();
        if (!this.U) {
            throw new ci1("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.e eVar = this.h0;
        c.b bVar = c.b.ON_START;
        eVar.h(bVar);
        if (this.W != null) {
            this.i0.b(bVar);
        }
        this.J.R();
    }

    public final e l() {
        if (this.Z == null) {
            this.Z = new e();
        }
        return this.Z;
    }

    public void l0(Context context) {
        this.U = true;
        androidx.fragment.app.e<?> eVar = this.I;
        Activity j = eVar == null ? null : eVar.j();
        if (j != null) {
            this.U = false;
            k0(j);
        }
    }

    public void l1() {
        this.J.T();
        if (this.W != null) {
            this.i0.b(c.b.ON_STOP);
        }
        this.h0.h(c.b.ON_STOP);
        this.p = 4;
        this.U = false;
        M0();
        if (this.U) {
            return;
        }
        throw new ci1("Fragment " + this + " did not call through to super.onStop()");
    }

    public Fragment m(String str) {
        return str.equals(this.u) ? this : this.J.i0(str);
    }

    @Deprecated
    public void m0(Fragment fragment) {
    }

    public void m1() {
        N0(this.W, this.q);
        this.J.U();
    }

    public final p30 n() {
        androidx.fragment.app.e<?> eVar = this.I;
        if (eVar == null) {
            return null;
        }
        return (p30) eVar.j();
    }

    public boolean n0(MenuItem menuItem) {
        return false;
    }

    public final p30 n1() {
        p30 n = n();
        if (n != null) {
            return n;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public boolean o() {
        Boolean bool;
        e eVar = this.Z;
        if (eVar == null || (bool = eVar.r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void o0(Bundle bundle) {
        this.U = true;
        q1(bundle);
        if (this.J.I0(1)) {
            return;
        }
        this.J.C();
    }

    public final Context o1() {
        Context u = u();
        if (u != null) {
            return u;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.U = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        n1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.U = true;
    }

    public boolean p() {
        Boolean bool;
        e eVar = this.Z;
        if (eVar == null || (bool = eVar.q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public Animation p0(int i, boolean z, int i2) {
        return null;
    }

    public final View p1() {
        View V = V();
        if (V != null) {
            return V;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public View q() {
        e eVar = this.Z;
        if (eVar == null) {
            return null;
        }
        return eVar.a;
    }

    public Animator q0(int i, boolean z, int i2) {
        return null;
    }

    public void q1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.J.c1(parcelable);
        this.J.C();
    }

    public Animator r() {
        e eVar = this.Z;
        if (eVar == null) {
            return null;
        }
        return eVar.b;
    }

    public void r0(Menu menu, MenuInflater menuInflater) {
    }

    public final void r1() {
        if (FragmentManager.E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto RESTORE_VIEW_STATE: ");
            sb.append(this);
        }
        if (this.W != null) {
            s1(this.q);
        }
        this.q = null;
    }

    public final Bundle s() {
        return this.v;
    }

    public View s0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.m0;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public final void s1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.r;
        if (sparseArray != null) {
            this.W.restoreHierarchyState(sparseArray);
            this.r = null;
        }
        if (this.W != null) {
            this.i0.h(this.s);
            this.s = null;
        }
        this.U = false;
        O0(bundle);
        if (this.U) {
            if (this.W != null) {
                this.i0.b(c.b.ON_CREATE);
                return;
            }
            return;
        }
        throw new ci1("Fragment " + this + " did not call through to super.onViewStateRestored()");
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        E1(intent, i, null);
    }

    public final FragmentManager t() {
        if (this.I != null) {
            return this.J;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void t0() {
        this.U = true;
    }

    public void t1(View view) {
        l().a = view;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.u);
        if (this.L != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.L));
        }
        if (this.N != null) {
            sb.append(" tag=");
            sb.append(this.N);
        }
        sb.append(")");
        return sb.toString();
    }

    public Context u() {
        androidx.fragment.app.e<?> eVar = this.I;
        if (eVar == null) {
            return null;
        }
        return eVar.k();
    }

    public void u0() {
    }

    public void u1(int i, int i2, int i3, int i4) {
        if (this.Z == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        l().d = i;
        l().e = i2;
        l().f = i3;
        l().g = i4;
    }

    public int v() {
        e eVar = this.Z;
        if (eVar == null) {
            return 0;
        }
        return eVar.d;
    }

    public void v0() {
        this.U = true;
    }

    public void v1(Animator animator) {
        l().b = animator;
    }

    public Object w() {
        e eVar = this.Z;
        if (eVar == null) {
            return null;
        }
        return eVar.k;
    }

    public void w0() {
        this.U = true;
    }

    public void w1(Bundle bundle) {
        if (this.H != null && g0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.v = bundle;
    }

    public kc1 x() {
        e eVar = this.Z;
        if (eVar == null) {
            return null;
        }
        Objects.requireNonNull(eVar);
        return null;
    }

    public LayoutInflater x0(Bundle bundle) {
        return D(bundle);
    }

    public void x1(View view) {
        l().t = view;
    }

    public int y() {
        e eVar = this.Z;
        if (eVar == null) {
            return 0;
        }
        return eVar.e;
    }

    public void y0(boolean z) {
    }

    public void y1(boolean z) {
        l().w = z;
    }

    public Object z() {
        e eVar = this.Z;
        if (eVar == null) {
            return null;
        }
        return eVar.m;
    }

    @Deprecated
    public void z0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.U = true;
    }

    public void z1(int i) {
        if (this.Z == null && i == 0) {
            return;
        }
        l();
        this.Z.h = i;
    }
}
