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
import androidx.lifecycle.AbstractC0344c;
import androidx.lifecycle.C0349e;
import androidx.lifecycle.InterfaceC0348d;
import androidx.lifecycle.LiveData;
import com.daaw.AbstractC1589hn;
import com.daaw.bu1;
import com.daaw.c40;
import com.daaw.ci1;
import com.daaw.du1;
import com.daaw.eu1;
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

    /* renamed from: p0 */
    public static final Object f1353p0 = new Object();

    /* renamed from: A */
    public boolean f1354A;

    /* renamed from: B */
    public boolean f1355B;

    /* renamed from: C */
    public boolean f1356C;

    /* renamed from: D */
    public boolean f1357D;

    /* renamed from: E */
    public boolean f1358E;

    /* renamed from: F */
    public boolean f1359F;

    /* renamed from: G */
    public int f1360G;

    /* renamed from: H */
    public FragmentManager f1361H;

    /* renamed from: I */
    public AbstractC0305e<?> f1362I;

    /* renamed from: K */
    public Fragment f1364K;

    /* renamed from: L */
    public int f1365L;

    /* renamed from: M */
    public int f1366M;

    /* renamed from: N */
    public String f1367N;

    /* renamed from: O */
    public boolean f1368O;

    /* renamed from: P */
    public boolean f1369P;

    /* renamed from: Q */
    public boolean f1370Q;

    /* renamed from: R */
    public boolean f1371R;

    /* renamed from: S */
    public boolean f1372S;

    /* renamed from: U */
    public boolean f1374U;

    /* renamed from: V */
    public ViewGroup f1375V;

    /* renamed from: W */
    public View f1376W;

    /* renamed from: X */
    public boolean f1377X;

    /* renamed from: Z */
    public C0258e f1379Z;

    /* renamed from: b0 */
    public boolean f1381b0;

    /* renamed from: c0 */
    public boolean f1382c0;

    /* renamed from: d0 */
    public float f1383d0;

    /* renamed from: e0 */
    public LayoutInflater f1384e0;

    /* renamed from: f0 */
    public boolean f1385f0;

    /* renamed from: h0 */
    public C0349e f1387h0;

    /* renamed from: i0 */
    public c40 f1388i0;

    /* renamed from: k0 */
    public jt1.InterfaceC1864b f1390k0;

    /* renamed from: l0 */
    public l81 f1391l0;

    /* renamed from: m0 */
    public int f1392m0;

    /* renamed from: q */
    public Bundle f1396q;

    /* renamed from: r */
    public SparseArray<Parcelable> f1397r;

    /* renamed from: s */
    public Bundle f1398s;

    /* renamed from: t */
    public Boolean f1399t;

    /* renamed from: v */
    public Bundle f1401v;

    /* renamed from: w */
    public Fragment f1402w;

    /* renamed from: y */
    public int f1404y;

    /* renamed from: p */
    public int f1395p = -1;

    /* renamed from: u */
    public String f1400u = UUID.randomUUID().toString();

    /* renamed from: x */
    public String f1403x = null;

    /* renamed from: z */
    public Boolean f1405z = null;

    /* renamed from: J */
    public FragmentManager f1363J = new u30();

    /* renamed from: T */
    public boolean f1373T = true;

    /* renamed from: Y */
    public boolean f1378Y = true;

    /* renamed from: a0 */
    public Runnable f1380a0 = new RunnableC0254a();

    /* renamed from: g0 */
    public AbstractC0344c.EnumC0347c f1386g0 = AbstractC0344c.EnumC0347c.RESUMED;

    /* renamed from: j0 */
    public kr0<sj0> f1389j0 = new kr0<>();

    /* renamed from: n0 */
    public final AtomicInteger f1393n0 = new AtomicInteger();

    /* renamed from: o0 */
    public final ArrayList<AbstractC0260g> f1394o0 = new ArrayList<>();

    /* renamed from: androidx.fragment.app.Fragment$a */
    /* loaded from: classes.dex */
    public class RunnableC0254a implements Runnable {
        public RunnableC0254a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.m29484F1();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    /* loaded from: classes.dex */
    public class RunnableC0255b implements Runnable {
        public RunnableC0255b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.m29436h(false);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    /* loaded from: classes.dex */
    public class RunnableC0256c implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ AbstractC0325l f1409p;

        public RunnableC0256c(AbstractC0325l abstractC0325l) {
            this.f1409p = abstractC0325l;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1409p.m29101g();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    /* loaded from: classes.dex */
    public class C0257d extends r30 {
        public C0257d() {
        }

        @Override // com.daaw.r30
        /* renamed from: f */
        public View mo11810f(int i) {
            View view = Fragment.this.f1376W;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // com.daaw.r30
        /* renamed from: h */
        public boolean mo11809h() {
            return Fragment.this.f1376W != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    /* loaded from: classes.dex */
    public static class C0258e {

        /* renamed from: a */
        public View f1412a;

        /* renamed from: b */
        public Animator f1413b;

        /* renamed from: c */
        public boolean f1414c;

        /* renamed from: d */
        public int f1415d;

        /* renamed from: e */
        public int f1416e;

        /* renamed from: f */
        public int f1417f;

        /* renamed from: g */
        public int f1418g;

        /* renamed from: h */
        public int f1419h;

        /* renamed from: i */
        public ArrayList<String> f1420i;

        /* renamed from: j */
        public ArrayList<String> f1421j;

        /* renamed from: k */
        public Object f1422k = null;

        /* renamed from: l */
        public Object f1423l;

        /* renamed from: m */
        public Object f1424m;

        /* renamed from: n */
        public Object f1425n;

        /* renamed from: o */
        public Object f1426o;

        /* renamed from: p */
        public Object f1427p;

        /* renamed from: q */
        public Boolean f1428q;

        /* renamed from: r */
        public Boolean f1429r;

        /* renamed from: s */
        public float f1430s;

        /* renamed from: t */
        public View f1431t;

        /* renamed from: u */
        public boolean f1432u;

        /* renamed from: v */
        public InterfaceC0261h f1433v;

        /* renamed from: w */
        public boolean f1434w;

        public C0258e() {
            Object obj = Fragment.f1353p0;
            this.f1423l = obj;
            this.f1424m = null;
            this.f1425n = obj;
            this.f1426o = null;
            this.f1427p = obj;
            this.f1430s = 1.0f;
            this.f1431t = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$f */
    /* loaded from: classes.dex */
    public static class C0259f extends RuntimeException {
        public C0259f(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$g */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0260g {
        /* renamed from: a */
        public abstract void m29391a();
    }

    /* renamed from: androidx.fragment.app.Fragment$h */
    /* loaded from: classes.dex */
    public interface InterfaceC0261h {
        /* renamed from: a */
        void mo29265a();

        /* renamed from: b */
        void mo29264b();
    }

    public Fragment() {
        m29456X();
    }

    @Deprecated
    /* renamed from: Z */
    public static Fragment m29452Z(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = C0304d.m29216d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.m29400w1(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e) {
            throw new C0259f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (InstantiationException e2) {
            throw new C0259f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new C0259f("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new C0259f("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    /* renamed from: A */
    public kc1 m29501A() {
        C0258e c0258e = this.f1379Z;
        if (c0258e == null) {
            return null;
        }
        Objects.requireNonNull(c0258e);
        return null;
    }

    /* renamed from: A0 */
    public void m29500A0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f1374U = true;
        AbstractC0305e<?> abstractC0305e = this.f1362I;
        Activity m29215j = abstractC0305e == null ? null : abstractC0305e.m29215j();
        if (m29215j != null) {
            this.f1374U = false;
            m29393z0(m29215j, attributeSet, bundle);
        }
    }

    /* renamed from: A1 */
    public void m29499A1(InterfaceC0261h interfaceC0261h) {
        m29429l();
        C0258e c0258e = this.f1379Z;
        InterfaceC0261h interfaceC0261h2 = c0258e.f1433v;
        if (interfaceC0261h == interfaceC0261h2) {
            return;
        }
        if (interfaceC0261h != null && interfaceC0261h2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (c0258e.f1432u) {
            c0258e.f1433v = interfaceC0261h;
        }
        if (interfaceC0261h != null) {
            interfaceC0261h.mo29265a();
        }
    }

    /* renamed from: B */
    public View m29498B() {
        C0258e c0258e = this.f1379Z;
        if (c0258e == null) {
            return null;
        }
        return c0258e.f1431t;
    }

    /* renamed from: B0 */
    public void m29497B0(boolean z) {
    }

    /* renamed from: B1 */
    public void m29496B1(boolean z) {
        if (this.f1379Z == null) {
            return;
        }
        m29429l().f1414c = z;
    }

    /* renamed from: C */
    public final Object m29495C() {
        AbstractC0305e<?> abstractC0305e = this.f1362I;
        if (abstractC0305e == null) {
            return null;
        }
        return abstractC0305e.mo13651m();
    }

    /* renamed from: C0 */
    public boolean m29494C0(MenuItem menuItem) {
        return false;
    }

    /* renamed from: C1 */
    public void m29493C1(float f) {
        m29429l().f1430s = f;
    }

    @Deprecated
    /* renamed from: D */
    public LayoutInflater m29492D(Bundle bundle) {
        AbstractC0305e<?> abstractC0305e = this.f1362I;
        if (abstractC0305e != null) {
            LayoutInflater mo13650n = abstractC0305e.mo13650n();
            vi0.m7139b(mo13650n, this.f1363J.m29286t0());
            return mo13650n;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: D0 */
    public void m29491D0(Menu menu) {
    }

    /* renamed from: D1 */
    public void m29490D1(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        m29429l();
        C0258e c0258e = this.f1379Z;
        c0258e.f1420i = arrayList;
        c0258e.f1421j = arrayList2;
    }

    /* renamed from: E */
    public final int m29489E() {
        AbstractC0344c.EnumC0347c enumC0347c = this.f1386g0;
        return (enumC0347c == AbstractC0344c.EnumC0347c.INITIALIZED || this.f1364K == null) ? enumC0347c.ordinal() : Math.min(enumC0347c.ordinal(), this.f1364K.m29489E());
    }

    /* renamed from: E0 */
    public void m29488E0() {
        this.f1374U = true;
    }

    @Deprecated
    /* renamed from: E1 */
    public void m29487E1(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (this.f1362I != null) {
            m29481H().m29369K0(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* renamed from: F */
    public int m29486F() {
        C0258e c0258e = this.f1379Z;
        if (c0258e == null) {
            return 0;
        }
        return c0258e.f1419h;
    }

    /* renamed from: F0 */
    public void m29485F0(boolean z) {
    }

    /* renamed from: F1 */
    public void m29484F1() {
        if (this.f1379Z == null || !m29429l().f1432u) {
            return;
        }
        if (this.f1362I == null) {
            m29429l().f1432u = false;
        } else if (Looper.myLooper() != this.f1362I.m29213l().getLooper()) {
            this.f1362I.m29213l().postAtFrontOfQueue(new RunnableC0255b());
        } else {
            m29436h(true);
        }
    }

    /* renamed from: G */
    public final Fragment m29483G() {
        return this.f1364K;
    }

    /* renamed from: G0 */
    public void m29482G0(Menu menu) {
    }

    /* renamed from: H */
    public final FragmentManager m29481H() {
        FragmentManager fragmentManager = this.f1361H;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* renamed from: H0 */
    public void m29480H0(boolean z) {
    }

    /* renamed from: I */
    public boolean m29479I() {
        C0258e c0258e = this.f1379Z;
        if (c0258e == null) {
            return false;
        }
        return c0258e.f1414c;
    }

    @Deprecated
    /* renamed from: I0 */
    public void m29478I0(int i, String[] strArr, int[] iArr) {
    }

    /* renamed from: J */
    public int m29477J() {
        C0258e c0258e = this.f1379Z;
        if (c0258e == null) {
            return 0;
        }
        return c0258e.f1417f;
    }

    /* renamed from: J0 */
    public void mo25245J0() {
        this.f1374U = true;
    }

    /* renamed from: K */
    public int m29476K() {
        C0258e c0258e = this.f1379Z;
        if (c0258e == null) {
            return 0;
        }
        return c0258e.f1418g;
    }

    /* renamed from: K0 */
    public void mo549K0(Bundle bundle) {
    }

    /* renamed from: L */
    public float m29475L() {
        C0258e c0258e = this.f1379Z;
        if (c0258e == null) {
            return 1.0f;
        }
        return c0258e.f1430s;
    }

    /* renamed from: L0 */
    public void mo548L0() {
        this.f1374U = true;
    }

    /* renamed from: M */
    public Object m29474M() {
        C0258e c0258e = this.f1379Z;
        if (c0258e == null) {
            return null;
        }
        Object obj = c0258e.f1425n;
        return obj == f1353p0 ? m29394z() : obj;
    }

    /* renamed from: M0 */
    public void mo547M0() {
        this.f1374U = true;
    }

    /* renamed from: N */
    public final Resources m29473N() {
        return m29420o1().getResources();
    }

    /* renamed from: N0 */
    public void mo26875N0(View view, Bundle bundle) {
    }

    /* renamed from: O */
    public Object m29472O() {
        C0258e c0258e = this.f1379Z;
        if (c0258e == null) {
            return null;
        }
        Object obj = c0258e.f1423l;
        return obj == f1353p0 ? m29401w() : obj;
    }

    /* renamed from: O0 */
    public void mo13996O0(Bundle bundle) {
        this.f1374U = true;
    }

    /* renamed from: P */
    public Object m29471P() {
        C0258e c0258e = this.f1379Z;
        if (c0258e == null) {
            return null;
        }
        return c0258e.f1426o;
    }

    /* renamed from: P0 */
    public void m29470P0(Bundle bundle) {
        this.f1363J.m29357Q0();
        this.f1395p = 3;
        this.f1374U = false;
        m29433i0(bundle);
        if (this.f1374U) {
            m29411r1();
            this.f1363J.m29277y();
            return;
        }
        throw new ci1("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* renamed from: Q */
    public Object m29469Q() {
        C0258e c0258e = this.f1379Z;
        if (c0258e == null) {
            return null;
        }
        Object obj = c0258e.f1427p;
        return obj == f1353p0 ? m29471P() : obj;
    }

    /* renamed from: Q0 */
    public void m29468Q0() {
        Iterator<AbstractC0260g> it = this.f1394o0.iterator();
        while (it.hasNext()) {
            it.next().m29391a();
        }
        this.f1394o0.clear();
        this.f1363J.m29311j(this.f1362I, mo13987j(), this);
        this.f1395p = 0;
        this.f1374U = false;
        mo13986l0(this.f1362I.m29214k());
        if (this.f1374U) {
            this.f1361H.m29374I(this);
            this.f1363J.m29275z();
            return;
        }
        throw new ci1("Fragment " + this + " did not call through to super.onAttach()");
    }

    /* renamed from: R */
    public ArrayList<String> m29467R() {
        ArrayList<String> arrayList;
        C0258e c0258e = this.f1379Z;
        return (c0258e == null || (arrayList = c0258e.f1420i) == null) ? new ArrayList<>() : arrayList;
    }

    /* renamed from: R0 */
    public void m29466R0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f1363J.m29390A(configuration);
    }

    /* renamed from: S */
    public ArrayList<String> m29465S() {
        ArrayList<String> arrayList;
        C0258e c0258e = this.f1379Z;
        return (c0258e == null || (arrayList = c0258e.f1421j) == null) ? new ArrayList<>() : arrayList;
    }

    /* renamed from: S0 */
    public boolean m29464S0(MenuItem menuItem) {
        if (this.f1368O) {
            return false;
        }
        if (m29423n0(menuItem)) {
            return true;
        }
        return this.f1363J.m29388B(menuItem);
    }

    /* renamed from: T */
    public final String m29463T(int i) {
        return m29473N().getString(i);
    }

    /* renamed from: T0 */
    public void m29462T0(Bundle bundle) {
        this.f1363J.m29357Q0();
        this.f1395p = 1;
        this.f1374U = false;
        this.f1387h0.mo29048a(new InterfaceC0348d() { // from class: androidx.fragment.app.Fragment.5
            @Override // androidx.lifecycle.InterfaceC0348d
            /* renamed from: a */
            public void mo18735a(sj0 sj0Var, AbstractC0344c.EnumC0346b enumC0346b) {
                View view;
                if (enumC0346b != AbstractC0344c.EnumC0346b.ON_STOP || (view = Fragment.this.f1376W) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        this.f1391l0.m17104d(bundle);
        mo526o0(bundle);
        this.f1385f0 = true;
        if (this.f1374U) {
            this.f1387h0.m29041h(AbstractC0344c.EnumC0346b.ON_CREATE);
            return;
        }
        throw new ci1("Fragment " + this + " did not call through to super.onCreate()");
    }

    @Deprecated
    /* renamed from: U */
    public final Fragment m29461U() {
        String str;
        Fragment fragment = this.f1402w;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.f1361H;
        if (fragmentManager == null || (str = this.f1403x) == null) {
            return null;
        }
        return fragmentManager.m29322f0(str);
    }

    /* renamed from: U0 */
    public boolean m29460U0(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f1368O) {
            return false;
        }
        if (this.f1372S && this.f1373T) {
            z = true;
            m29412r0(menu, menuInflater);
        }
        return z | this.f1363J.m29384D(menu, menuInflater);
    }

    /* renamed from: V */
    public View m29459V() {
        return this.f1376W;
    }

    /* renamed from: V0 */
    public void mo13988V0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1363J.m29357Q0();
        this.f1359F = true;
        this.f1388i0 = new c40(this, mo13652g());
        View mo523s0 = mo523s0(layoutInflater, viewGroup, bundle);
        this.f1376W = mo523s0;
        if (mo523s0 == null) {
            if (this.f1388i0.m25636f()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1388i0 = null;
            return;
        }
        this.f1388i0.m25637e();
        bu1.m25826a(this.f1376W, this.f1388i0);
        eu1.m23179a(this.f1376W, this.f1388i0);
        du1.m23947a(this.f1376W, this.f1388i0);
        this.f1389j0.mo15133j(this.f1388i0);
    }

    /* renamed from: W */
    public LiveData<sj0> m29458W() {
        return this.f1389j0;
    }

    /* renamed from: W0 */
    public void m29457W0() {
        this.f1363J.m29382E();
        this.f1387h0.m29041h(AbstractC0344c.EnumC0346b.ON_DESTROY);
        this.f1395p = 0;
        this.f1374U = false;
        this.f1385f0 = false;
        mo19773t0();
        if (this.f1374U) {
            return;
        }
        throw new ci1("Fragment " + this + " did not call through to super.onDestroy()");
    }

    /* renamed from: X */
    public final void m29456X() {
        this.f1387h0 = new C0349e(this);
        this.f1391l0 = l81.m17107a(this);
        this.f1390k0 = null;
    }

    /* renamed from: X0 */
    public void m29455X0() {
        this.f1363J.m29380F();
        if (this.f1376W != null && this.f1388i0.mo2327a().mo29047b().m29049a(AbstractC0344c.EnumC0347c.CREATED)) {
            this.f1388i0.m25638b(AbstractC0344c.EnumC0346b.ON_DESTROY);
        }
        this.f1395p = 1;
        this.f1374U = false;
        mo13985v0();
        if (this.f1374U) {
            mk0.m15994b(this).mo15137c();
            this.f1359F = false;
            return;
        }
        throw new ci1("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* renamed from: Y */
    public void m29454Y() {
        m29456X();
        this.f1400u = UUID.randomUUID().toString();
        this.f1354A = false;
        this.f1355B = false;
        this.f1356C = false;
        this.f1357D = false;
        this.f1358E = false;
        this.f1360G = 0;
        this.f1361H = null;
        this.f1363J = new u30();
        this.f1362I = null;
        this.f1365L = 0;
        this.f1366M = 0;
        this.f1367N = null;
        this.f1368O = false;
        this.f1369P = false;
    }

    /* renamed from: Y0 */
    public void m29453Y0() {
        this.f1395p = -1;
        this.f1374U = false;
        mo13984w0();
        this.f1384e0 = null;
        if (this.f1374U) {
            if (this.f1363J.m29383D0()) {
                return;
            }
            this.f1363J.m29382E();
            this.f1363J = new u30();
            return;
        }
        throw new ci1("Fragment " + this + " did not call through to super.onDetach()");
    }

    /* renamed from: Z0 */
    public LayoutInflater m29451Z0(Bundle bundle) {
        LayoutInflater mo13983x0 = mo13983x0(bundle);
        this.f1384e0 = mo13983x0;
        return mo13983x0;
    }

    @Override // com.daaw.sj0
    /* renamed from: a */
    public AbstractC0344c mo2327a() {
        return this.f1387h0;
    }

    /* renamed from: a0 */
    public boolean m29450a0() {
        C0258e c0258e = this.f1379Z;
        if (c0258e == null) {
            return false;
        }
        return c0258e.f1434w;
    }

    /* renamed from: a1 */
    public void m29449a1() {
        onLowMemory();
        this.f1363J.m29378G();
    }

    /* renamed from: b0 */
    public final boolean m29448b0() {
        return this.f1360G > 0;
    }

    /* renamed from: b1 */
    public void m29447b1(boolean z) {
        m29497B0(z);
        this.f1363J.m29376H(z);
    }

    /* renamed from: c0 */
    public final boolean m29446c0() {
        FragmentManager fragmentManager;
        return this.f1373T && ((fragmentManager = this.f1361H) == null || fragmentManager.m29377G0(this.f1364K));
    }

    /* renamed from: c1 */
    public boolean m29445c1(MenuItem menuItem) {
        if (this.f1368O) {
            return false;
        }
        if (this.f1372S && this.f1373T && m29494C0(menuItem)) {
            return true;
        }
        return this.f1363J.m29372J(menuItem);
    }

    @Override // com.daaw.w80
    /* renamed from: d */
    public /* synthetic */ AbstractC1589hn mo6345d() {
        return v80.m7348a(this);
    }

    /* renamed from: d0 */
    public boolean m29444d0() {
        C0258e c0258e = this.f1379Z;
        if (c0258e == null) {
            return false;
        }
        return c0258e.f1432u;
    }

    /* renamed from: d1 */
    public void m29443d1(Menu menu) {
        if (this.f1368O) {
            return;
        }
        if (this.f1372S && this.f1373T) {
            m29491D0(menu);
        }
        this.f1363J.m29370K(menu);
    }

    /* renamed from: e0 */
    public final boolean m29442e0() {
        return this.f1355B;
    }

    /* renamed from: e1 */
    public void m29441e1() {
        this.f1363J.m29366M();
        if (this.f1376W != null) {
            this.f1388i0.m25638b(AbstractC0344c.EnumC0346b.ON_PAUSE);
        }
        this.f1387h0.m29041h(AbstractC0344c.EnumC0346b.ON_PAUSE);
        this.f1395p = 6;
        this.f1374U = false;
        m29488E0();
        if (this.f1374U) {
            return;
        }
        throw new ci1("Fragment " + this + " did not call through to super.onPause()");
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f0 */
    public final boolean m29440f0() {
        Fragment m29483G = m29483G();
        return m29483G != null && (m29483G.m29442e0() || m29483G.m29440f0());
    }

    /* renamed from: f1 */
    public void m29439f1(boolean z) {
        m29485F0(z);
        this.f1363J.m29364N(z);
    }

    @Override // com.daaw.nt1
    /* renamed from: g */
    public mt1 mo13652g() {
        if (this.f1361H != null) {
            if (m29489E() != AbstractC0344c.EnumC0347c.INITIALIZED.ordinal()) {
                return this.f1361H.m29274z0(this);
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* renamed from: g0 */
    public final boolean m29438g0() {
        FragmentManager fragmentManager = this.f1361H;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.m29371J0();
    }

    /* renamed from: g1 */
    public boolean m29437g1(Menu menu) {
        boolean z = false;
        if (this.f1368O) {
            return false;
        }
        if (this.f1372S && this.f1373T) {
            z = true;
            m29482G0(menu);
        }
        return z | this.f1363J.m29362O(menu);
    }

    /* renamed from: h */
    public void m29436h(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        C0258e c0258e = this.f1379Z;
        InterfaceC0261h interfaceC0261h = null;
        if (c0258e != null) {
            c0258e.f1432u = false;
            InterfaceC0261h interfaceC0261h2 = c0258e.f1433v;
            c0258e.f1433v = null;
            interfaceC0261h = interfaceC0261h2;
        }
        if (interfaceC0261h != null) {
            interfaceC0261h.mo29264b();
        } else if (!FragmentManager.f1436P || this.f1376W == null || (viewGroup = this.f1375V) == null || (fragmentManager = this.f1361H) == null) {
        } else {
            AbstractC0325l m29094n = AbstractC0325l.m29094n(viewGroup, fragmentManager);
            m29094n.m29092p();
            if (z) {
                this.f1362I.m29213l().post(new RunnableC0256c(m29094n));
            } else {
                m29094n.m29101g();
            }
        }
    }

    /* renamed from: h0 */
    public void m29435h0() {
        this.f1363J.m29357Q0();
    }

    /* renamed from: h1 */
    public void m29434h1() {
        boolean m29375H0 = this.f1361H.m29375H0(this);
        Boolean bool = this.f1405z;
        if (bool == null || bool.booleanValue() != m29375H0) {
            this.f1405z = Boolean.valueOf(m29375H0);
            m29480H0(m29375H0);
            this.f1363J.m29360P();
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    @Override // com.daaw.m81
    /* renamed from: i */
    public final k81 mo16178i() {
        return this.f1391l0.m17106b();
    }

    @Deprecated
    /* renamed from: i0 */
    public void m29433i0(Bundle bundle) {
        this.f1374U = true;
    }

    /* renamed from: i1 */
    public void m29432i1() {
        this.f1363J.m29357Q0();
        this.f1363J.m29337a0(true);
        this.f1395p = 7;
        this.f1374U = false;
        mo25245J0();
        if (!this.f1374U) {
            throw new ci1("Fragment " + this + " did not call through to super.onResume()");
        }
        C0349e c0349e = this.f1387h0;
        AbstractC0344c.EnumC0346b enumC0346b = AbstractC0344c.EnumC0346b.ON_RESUME;
        c0349e.m29041h(enumC0346b);
        if (this.f1376W != null) {
            this.f1388i0.m25638b(enumC0346b);
        }
        this.f1363J.m29358Q();
    }

    /* renamed from: j */
    public r30 mo13987j() {
        return new C0257d();
    }

    @Deprecated
    /* renamed from: j0 */
    public void mo25244j0(int i, int i2, Intent intent) {
        if (FragmentManager.m29381E0(2)) {
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

    /* renamed from: j1 */
    public void m29431j1(Bundle bundle) {
        mo549K0(bundle);
        this.f1391l0.m17103e(bundle);
        Parcelable m29324e1 = this.f1363J.m29324e1();
        if (m29324e1 != null) {
            bundle.putParcelable("android:support:fragments", m29324e1);
        }
    }

    /* renamed from: k */
    public void mo25243k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f1365L));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f1366M));
        printWriter.print(" mTag=");
        printWriter.println(this.f1367N);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f1395p);
        printWriter.print(" mWho=");
        printWriter.print(this.f1400u);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f1360G);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f1354A);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f1355B);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f1356C);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f1357D);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f1368O);
        printWriter.print(" mDetached=");
        printWriter.print(this.f1369P);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f1373T);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f1372S);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f1370Q);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f1378Y);
        if (this.f1361H != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f1361H);
        }
        if (this.f1362I != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f1362I);
        }
        if (this.f1364K != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f1364K);
        }
        if (this.f1401v != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f1401v);
        }
        if (this.f1396q != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f1396q);
        }
        if (this.f1397r != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f1397r);
        }
        if (this.f1398s != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f1398s);
        }
        Fragment m29461U = m29461U();
        if (m29461U != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(m29461U);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f1404y);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(m29479I());
        if (m29403v() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(m29403v());
        }
        if (m29397y() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(m29397y());
        }
        if (m29477J() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(m29477J());
        }
        if (m29476K() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(m29476K());
        }
        if (this.f1375V != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f1375V);
        }
        if (this.f1376W != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f1376W);
        }
        if (m29416q() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(m29416q());
        }
        if (m29406u() != null) {
            mk0.m15994b(this).mo15138a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f1363J + ":");
        FragmentManager fragmentManager = this.f1363J;
        fragmentManager.m29346W(str + "  ", fileDescriptor, printWriter, strArr);
    }

    @Deprecated
    /* renamed from: k0 */
    public void mo19774k0(Activity activity) {
        this.f1374U = true;
    }

    /* renamed from: k1 */
    public void m29430k1() {
        this.f1363J.m29357Q0();
        this.f1363J.m29337a0(true);
        this.f1395p = 5;
        this.f1374U = false;
        mo548L0();
        if (!this.f1374U) {
            throw new ci1("Fragment " + this + " did not call through to super.onStart()");
        }
        C0349e c0349e = this.f1387h0;
        AbstractC0344c.EnumC0346b enumC0346b = AbstractC0344c.EnumC0346b.ON_START;
        c0349e.m29041h(enumC0346b);
        if (this.f1376W != null) {
            this.f1388i0.m25638b(enumC0346b);
        }
        this.f1363J.m29356R();
    }

    /* renamed from: l */
    public final C0258e m29429l() {
        if (this.f1379Z == null) {
            this.f1379Z = new C0258e();
        }
        return this.f1379Z;
    }

    /* renamed from: l0 */
    public void mo13986l0(Context context) {
        this.f1374U = true;
        AbstractC0305e<?> abstractC0305e = this.f1362I;
        Activity m29215j = abstractC0305e == null ? null : abstractC0305e.m29215j();
        if (m29215j != null) {
            this.f1374U = false;
            mo19774k0(m29215j);
        }
    }

    /* renamed from: l1 */
    public void m29428l1() {
        this.f1363J.m29352T();
        if (this.f1376W != null) {
            this.f1388i0.m25638b(AbstractC0344c.EnumC0346b.ON_STOP);
        }
        this.f1387h0.m29041h(AbstractC0344c.EnumC0346b.ON_STOP);
        this.f1395p = 4;
        this.f1374U = false;
        mo547M0();
        if (this.f1374U) {
            return;
        }
        throw new ci1("Fragment " + this + " did not call through to super.onStop()");
    }

    /* renamed from: m */
    public Fragment m29427m(String str) {
        return str.equals(this.f1400u) ? this : this.f1363J.m29313i0(str);
    }

    @Deprecated
    /* renamed from: m0 */
    public void m29426m0(Fragment fragment) {
    }

    /* renamed from: m1 */
    public void m29425m1() {
        mo26875N0(this.f1376W, this.f1396q);
        this.f1363J.m29350U();
    }

    /* renamed from: n */
    public final p30 m29424n() {
        AbstractC0305e<?> abstractC0305e = this.f1362I;
        if (abstractC0305e == null) {
            return null;
        }
        return (p30) abstractC0305e.m29215j();
    }

    /* renamed from: n0 */
    public boolean m29423n0(MenuItem menuItem) {
        return false;
    }

    /* renamed from: n1 */
    public final p30 m29422n1() {
        p30 m29424n = m29424n();
        if (m29424n != null) {
            return m29424n;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* renamed from: o */
    public boolean m29421o() {
        Boolean bool;
        C0258e c0258e = this.f1379Z;
        if (c0258e == null || (bool = c0258e.f1429r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: o0 */
    public void mo526o0(Bundle bundle) {
        this.f1374U = true;
        m29414q1(bundle);
        if (this.f1363J.m29373I0(1)) {
            return;
        }
        this.f1363J.m29386C();
    }

    /* renamed from: o1 */
    public final Context m29420o1() {
        Context m29406u = m29406u();
        if (m29406u != null) {
            return m29406u;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f1374U = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m29422n1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f1374U = true;
    }

    /* renamed from: p */
    public boolean m29419p() {
        Boolean bool;
        C0258e c0258e = this.f1379Z;
        if (c0258e == null || (bool = c0258e.f1428q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: p0 */
    public Animation m29418p0(int i, boolean z, int i2) {
        return null;
    }

    /* renamed from: p1 */
    public final View m29417p1() {
        View m29459V = m29459V();
        if (m29459V != null) {
            return m29459V;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* renamed from: q */
    public View m29416q() {
        C0258e c0258e = this.f1379Z;
        if (c0258e == null) {
            return null;
        }
        return c0258e.f1412a;
    }

    /* renamed from: q0 */
    public Animator m29415q0(int i, boolean z, int i2) {
        return null;
    }

    /* renamed from: q1 */
    public void m29414q1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.f1363J.m29330c1(parcelable);
        this.f1363J.m29386C();
    }

    /* renamed from: r */
    public Animator m29413r() {
        C0258e c0258e = this.f1379Z;
        if (c0258e == null) {
            return null;
        }
        return c0258e.f1413b;
    }

    /* renamed from: r0 */
    public void m29412r0(Menu menu, MenuInflater menuInflater) {
    }

    /* renamed from: r1 */
    public final void m29411r1() {
        if (FragmentManager.m29381E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto RESTORE_VIEW_STATE: ");
            sb.append(this);
        }
        if (this.f1376W != null) {
            m29409s1(this.f1396q);
        }
        this.f1396q = null;
    }

    /* renamed from: s */
    public final Bundle m29410s() {
        return this.f1401v;
    }

    /* renamed from: s0 */
    public View mo523s0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.f1392m0;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    /* renamed from: s1 */
    public final void m29409s1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f1397r;
        if (sparseArray != null) {
            this.f1376W.restoreHierarchyState(sparseArray);
            this.f1397r = null;
        }
        if (this.f1376W != null) {
            this.f1388i0.m25635h(this.f1398s);
            this.f1398s = null;
        }
        this.f1374U = false;
        mo13996O0(bundle);
        if (this.f1374U) {
            if (this.f1376W != null) {
                this.f1388i0.m25638b(AbstractC0344c.EnumC0346b.ON_CREATE);
                return;
            }
            return;
        }
        throw new ci1("Fragment " + this + " did not call through to super.onViewStateRestored()");
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        m29487E1(intent, i, null);
    }

    /* renamed from: t */
    public final FragmentManager m29408t() {
        if (this.f1362I != null) {
            return this.f1363J;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* renamed from: t0 */
    public void mo19773t0() {
        this.f1374U = true;
    }

    /* renamed from: t1 */
    public void m29407t1(View view) {
        m29429l().f1412a = view;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f1400u);
        if (this.f1365L != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1365L));
        }
        if (this.f1367N != null) {
            sb.append(" tag=");
            sb.append(this.f1367N);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public Context m29406u() {
        AbstractC0305e<?> abstractC0305e = this.f1362I;
        if (abstractC0305e == null) {
            return null;
        }
        return abstractC0305e.m29214k();
    }

    /* renamed from: u0 */
    public void m29405u0() {
    }

    /* renamed from: u1 */
    public void m29404u1(int i, int i2, int i3, int i4) {
        if (this.f1379Z == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        m29429l().f1415d = i;
        m29429l().f1416e = i2;
        m29429l().f1417f = i3;
        m29429l().f1418g = i4;
    }

    /* renamed from: v */
    public int m29403v() {
        C0258e c0258e = this.f1379Z;
        if (c0258e == null) {
            return 0;
        }
        return c0258e.f1415d;
    }

    /* renamed from: v0 */
    public void mo13985v0() {
        this.f1374U = true;
    }

    /* renamed from: v1 */
    public void m29402v1(Animator animator) {
        m29429l().f1413b = animator;
    }

    /* renamed from: w */
    public Object m29401w() {
        C0258e c0258e = this.f1379Z;
        if (c0258e == null) {
            return null;
        }
        return c0258e.f1422k;
    }

    /* renamed from: w0 */
    public void mo13984w0() {
        this.f1374U = true;
    }

    /* renamed from: w1 */
    public void m29400w1(Bundle bundle) {
        if (this.f1361H != null && m29438g0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f1401v = bundle;
    }

    /* renamed from: x */
    public kc1 m29399x() {
        C0258e c0258e = this.f1379Z;
        if (c0258e == null) {
            return null;
        }
        Objects.requireNonNull(c0258e);
        return null;
    }

    /* renamed from: x0 */
    public LayoutInflater mo13983x0(Bundle bundle) {
        return m29492D(bundle);
    }

    /* renamed from: x1 */
    public void m29398x1(View view) {
        m29429l().f1431t = view;
    }

    /* renamed from: y */
    public int m29397y() {
        C0258e c0258e = this.f1379Z;
        if (c0258e == null) {
            return 0;
        }
        return c0258e.f1416e;
    }

    /* renamed from: y0 */
    public void m29396y0(boolean z) {
    }

    /* renamed from: y1 */
    public void m29395y1(boolean z) {
        m29429l().f1434w = z;
    }

    /* renamed from: z */
    public Object m29394z() {
        C0258e c0258e = this.f1379Z;
        if (c0258e == null) {
            return null;
        }
        return c0258e.f1424m;
    }

    @Deprecated
    /* renamed from: z0 */
    public void m29393z0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f1374U = true;
    }

    /* renamed from: z1 */
    public void m29392z1(int i) {
        if (this.f1379Z == null && i == 0) {
            return;
        }
        m29429l();
        this.f1379Z.f1419h = i;
    }
}
