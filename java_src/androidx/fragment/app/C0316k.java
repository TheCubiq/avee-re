package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0314j;
import com.daaw.C1370g6;
import com.daaw.C3423wd;
import com.daaw.a40;
import com.daaw.b40;
import com.daaw.nu0;
import com.daaw.r30;
import com.daaw.xs1;
import com.daaw.z30;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* renamed from: androidx.fragment.app.k */
/* loaded from: classes.dex */
public class C0316k {

    /* renamed from: a */
    public static final int[] f1638a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    public static final a40 f1639b;

    /* renamed from: c */
    public static final a40 f1640c;

    /* renamed from: androidx.fragment.app.k$a */
    /* loaded from: classes.dex */
    public class RunnableC0317a implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ InterfaceC0323g f1641p;

        /* renamed from: q */
        public final /* synthetic */ Fragment f1642q;

        /* renamed from: r */
        public final /* synthetic */ C3423wd f1643r;

        public RunnableC0317a(InterfaceC0323g interfaceC0323g, Fragment fragment, C3423wd c3423wd) {
            this.f1641p = interfaceC0323g;
            this.f1642q = fragment;
            this.f1643r = c3423wd;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1641p.mo29108b(this.f1642q, this.f1643r);
        }
    }

    /* renamed from: androidx.fragment.app.k$b */
    /* loaded from: classes.dex */
    public class RunnableC0318b implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ ArrayList f1644p;

        public RunnableC0318b(ArrayList arrayList) {
            this.f1644p = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0316k.m29137A(this.f1644p, 4);
        }
    }

    /* renamed from: androidx.fragment.app.k$c */
    /* loaded from: classes.dex */
    public class RunnableC0319c implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ InterfaceC0323g f1645p;

        /* renamed from: q */
        public final /* synthetic */ Fragment f1646q;

        /* renamed from: r */
        public final /* synthetic */ C3423wd f1647r;

        public RunnableC0319c(InterfaceC0323g interfaceC0323g, Fragment fragment, C3423wd c3423wd) {
            this.f1645p = interfaceC0323g;
            this.f1646q = fragment;
            this.f1647r = c3423wd;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1645p.mo29108b(this.f1646q, this.f1647r);
        }
    }

    /* renamed from: androidx.fragment.app.k$d */
    /* loaded from: classes.dex */
    public class RunnableC0320d implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ Object f1648p;

        /* renamed from: q */
        public final /* synthetic */ a40 f1649q;

        /* renamed from: r */
        public final /* synthetic */ View f1650r;

        /* renamed from: s */
        public final /* synthetic */ Fragment f1651s;

        /* renamed from: t */
        public final /* synthetic */ ArrayList f1652t;

        /* renamed from: u */
        public final /* synthetic */ ArrayList f1653u;

        /* renamed from: v */
        public final /* synthetic */ ArrayList f1654v;

        /* renamed from: w */
        public final /* synthetic */ Object f1655w;

        public RunnableC0320d(Object obj, a40 a40Var, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f1648p = obj;
            this.f1649q = a40Var;
            this.f1650r = view;
            this.f1651s = fragment;
            this.f1652t = arrayList;
            this.f1653u = arrayList2;
            this.f1654v = arrayList3;
            this.f1655w = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f1648p;
            if (obj != null) {
                this.f1649q.mo2898p(obj, this.f1650r);
                this.f1653u.addAll(C0316k.m29125k(this.f1649q, this.f1648p, this.f1651s, this.f1652t, this.f1650r));
            }
            if (this.f1654v != null) {
                if (this.f1655w != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f1650r);
                    this.f1649q.mo2897q(this.f1655w, this.f1654v, arrayList);
                }
                this.f1654v.clear();
                this.f1654v.add(this.f1650r);
            }
        }
    }

    /* renamed from: androidx.fragment.app.k$e */
    /* loaded from: classes.dex */
    public class RunnableC0321e implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ Fragment f1656p;

        /* renamed from: q */
        public final /* synthetic */ Fragment f1657q;

        /* renamed from: r */
        public final /* synthetic */ boolean f1658r;

        /* renamed from: s */
        public final /* synthetic */ C1370g6 f1659s;

        /* renamed from: t */
        public final /* synthetic */ View f1660t;

        /* renamed from: u */
        public final /* synthetic */ a40 f1661u;

        /* renamed from: v */
        public final /* synthetic */ Rect f1662v;

        public RunnableC0321e(Fragment fragment, Fragment fragment2, boolean z, C1370g6 c1370g6, View view, a40 a40Var, Rect rect) {
            this.f1656p = fragment;
            this.f1657q = fragment2;
            this.f1658r = z;
            this.f1659s = c1370g6;
            this.f1660t = view;
            this.f1661u = a40Var;
            this.f1662v = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0316k.m29130f(this.f1656p, this.f1657q, this.f1658r, this.f1659s, false);
            View view = this.f1660t;
            if (view != null) {
                this.f1661u.m27617k(view, this.f1662v);
            }
        }
    }

    /* renamed from: androidx.fragment.app.k$f */
    /* loaded from: classes.dex */
    public class RunnableC0322f implements Runnable {

        /* renamed from: A */
        public final /* synthetic */ Rect f1663A;

        /* renamed from: p */
        public final /* synthetic */ a40 f1664p;

        /* renamed from: q */
        public final /* synthetic */ C1370g6 f1665q;

        /* renamed from: r */
        public final /* synthetic */ Object f1666r;

        /* renamed from: s */
        public final /* synthetic */ C0324h f1667s;

        /* renamed from: t */
        public final /* synthetic */ ArrayList f1668t;

        /* renamed from: u */
        public final /* synthetic */ View f1669u;

        /* renamed from: v */
        public final /* synthetic */ Fragment f1670v;

        /* renamed from: w */
        public final /* synthetic */ Fragment f1671w;

        /* renamed from: x */
        public final /* synthetic */ boolean f1672x;

        /* renamed from: y */
        public final /* synthetic */ ArrayList f1673y;

        /* renamed from: z */
        public final /* synthetic */ Object f1674z;

        public RunnableC0322f(a40 a40Var, C1370g6 c1370g6, Object obj, C0324h c0324h, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f1664p = a40Var;
            this.f1665q = c1370g6;
            this.f1666r = obj;
            this.f1667s = c0324h;
            this.f1668t = arrayList;
            this.f1669u = view;
            this.f1670v = fragment;
            this.f1671w = fragment2;
            this.f1672x = z;
            this.f1673y = arrayList2;
            this.f1674z = obj2;
            this.f1663A = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1370g6<String, View> m29128h = C0316k.m29128h(this.f1664p, this.f1665q, this.f1666r, this.f1667s);
            if (m29128h != null) {
                this.f1668t.addAll(m29128h.values());
                this.f1668t.add(this.f1669u);
            }
            C0316k.m29130f(this.f1670v, this.f1671w, this.f1672x, m29128h, false);
            Object obj = this.f1666r;
            if (obj != null) {
                this.f1664p.mo2908A(obj, this.f1673y, this.f1668t);
                View m29117s = C0316k.m29117s(m29128h, this.f1667s, this.f1674z, this.f1672x);
                if (m29117s != null) {
                    this.f1664p.m27617k(m29117s, this.f1663A);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.k$g */
    /* loaded from: classes.dex */
    public interface InterfaceC0323g {
        /* renamed from: a */
        void mo29109a(Fragment fragment, C3423wd c3423wd);

        /* renamed from: b */
        void mo29108b(Fragment fragment, C3423wd c3423wd);
    }

    /* renamed from: androidx.fragment.app.k$h */
    /* loaded from: classes.dex */
    public static class C0324h {

        /* renamed from: a */
        public Fragment f1675a;

        /* renamed from: b */
        public boolean f1676b;

        /* renamed from: c */
        public C0281a f1677c;

        /* renamed from: d */
        public Fragment f1678d;

        /* renamed from: e */
        public boolean f1679e;

        /* renamed from: f */
        public C0281a f1680f;
    }

    static {
        f1639b = Build.VERSION.SDK_INT >= 21 ? new z30() : null;
        f1640c = m29113w();
    }

    /* renamed from: A */
    public static void m29137A(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    /* renamed from: B */
    public static void m29136B(Context context, r30 r30Var, ArrayList<C0281a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, InterfaceC0323g interfaceC0323g) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            C0281a c0281a = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue()) {
                m29131e(c0281a, sparseArray, z);
            } else {
                m29133c(c0281a, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int keyAt = sparseArray.keyAt(i4);
                C1370g6<String, String> m29132d = m29132d(keyAt, arrayList, arrayList2, i, i2);
                C0324h c0324h = (C0324h) sparseArray.valueAt(i4);
                if (r30Var.mo11809h() && (viewGroup = (ViewGroup) r30Var.mo11810f(keyAt)) != null) {
                    if (z) {
                        m29121o(viewGroup, c0324h, view, m29132d, interfaceC0323g);
                    } else {
                        m29122n(viewGroup, c0324h, view, m29132d, interfaceC0323g);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m29135a(ArrayList<View> arrayList, C1370g6<String, View> c1370g6, Collection<String> collection) {
        for (int size = c1370g6.size() - 1; size >= 0; size--) {
            View m25432m = c1370g6.m25432m(size);
            if (collection.contains(xs1.m4750N(m25432m))) {
                arrayList.add(m25432m);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0039, code lost:
        if (r0.f1354A != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x006e, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0088, code lost:
        if (r0.f1368O == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x008a, code lost:
        r9 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m29134b(C0281a c0281a, AbstractC0314j.C0315a c0315a, SparseArray<C0324h> sparseArray, boolean z, boolean z2) {
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        C0324h c0324h;
        Fragment fragment = c0315a.f1631b;
        if (fragment == null || (i = fragment.f1366M) == 0) {
            return;
        }
        int i2 = z ? f1638a[c0315a.f1630a] : c0315a.f1630a;
        boolean z6 = false;
        boolean z7 = true;
        if (i2 != 1) {
            if (i2 != 3) {
                if (i2 == 4) {
                    boolean z8 = !z2 ? false : false;
                    z5 = z8;
                    z4 = true;
                    z7 = false;
                    c0324h = sparseArray.get(i);
                    if (z6) {
                    }
                    if (!z2) {
                    }
                    if (z5) {
                    }
                    if (z2) {
                    }
                } else if (i2 != 5) {
                    if (i2 != 6) {
                        if (i2 != 7) {
                            z4 = false;
                            z7 = false;
                            z5 = false;
                            c0324h = sparseArray.get(i);
                            if (z6) {
                                c0324h = m29120p(c0324h, sparseArray, i);
                                c0324h.f1675a = fragment;
                                c0324h.f1676b = z;
                                c0324h.f1677c = c0281a;
                            }
                            if (!z2 && z7) {
                                if (c0324h != null && c0324h.f1678d == fragment) {
                                    c0324h.f1678d = null;
                                }
                                if (!c0281a.f1628r) {
                                    FragmentManager fragmentManager = c0281a.f1525t;
                                    fragmentManager.m29292q0().m29160p(fragmentManager.m29283v(fragment));
                                    fragmentManager.m29361O0(fragment);
                                }
                            }
                            if (z5 && (c0324h == null || c0324h.f1678d == null)) {
                                c0324h = m29120p(c0324h, sparseArray, i);
                                c0324h.f1678d = fragment;
                                c0324h.f1679e = z;
                                c0324h.f1680f = c0281a;
                            }
                            if (z2 || !z4 || c0324h == null || c0324h.f1675a != fragment) {
                                return;
                            }
                            c0324h.f1675a = null;
                            return;
                        }
                    }
                } else if (z2) {
                    if (fragment.f1382c0) {
                        if (!fragment.f1368O) {
                        }
                    }
                    z3 = false;
                    z6 = z3;
                    z4 = false;
                    z5 = false;
                    c0324h = sparseArray.get(i);
                    if (z6) {
                    }
                    if (!z2) {
                        if (c0324h != null) {
                            c0324h.f1678d = null;
                        }
                        if (!c0281a.f1628r) {
                        }
                    }
                    if (z5) {
                        c0324h = m29120p(c0324h, sparseArray, i);
                        c0324h.f1678d = fragment;
                        c0324h.f1679e = z;
                        c0324h.f1680f = c0281a;
                    }
                    if (z2) {
                        return;
                    }
                    return;
                } else {
                    z3 = fragment.f1368O;
                    z6 = z3;
                    z4 = false;
                    z5 = false;
                    c0324h = sparseArray.get(i);
                    if (z6) {
                    }
                    if (!z2) {
                    }
                    if (z5) {
                    }
                    if (z2) {
                    }
                }
            }
            boolean z9 = fragment.f1354A;
            if (!z2) {
            }
            z5 = z8;
            z4 = true;
            z7 = false;
            c0324h = sparseArray.get(i);
            if (z6) {
            }
            if (!z2) {
            }
            if (z5) {
            }
            if (z2) {
            }
        }
        if (z2) {
            z3 = fragment.f1381b0;
            z6 = z3;
            z4 = false;
            z5 = false;
            c0324h = sparseArray.get(i);
            if (z6) {
            }
            if (!z2) {
            }
            if (z5) {
            }
            if (z2) {
            }
        } else {
            if (!fragment.f1354A) {
            }
            z3 = false;
            z6 = z3;
            z4 = false;
            z5 = false;
            c0324h = sparseArray.get(i);
            if (z6) {
            }
            if (!z2) {
            }
            if (z5) {
            }
            if (z2) {
            }
        }
    }

    /* renamed from: c */
    public static void m29133c(C0281a c0281a, SparseArray<C0324h> sparseArray, boolean z) {
        int size = c0281a.f1613c.size();
        for (int i = 0; i < size; i++) {
            m29134b(c0281a, c0281a.f1613c.get(i), sparseArray, false, z);
        }
    }

    /* renamed from: d */
    public static C1370g6<String, String> m29132d(int i, ArrayList<C0281a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C1370g6<String, String> c1370g6 = new C1370g6<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0281a c0281a = arrayList.get(i4);
            if (c0281a.m29243x(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = c0281a.f1626p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = c0281a.f1626p;
                        arrayList4 = c0281a.f1627q;
                    } else {
                        ArrayList<String> arrayList6 = c0281a.f1626p;
                        arrayList3 = c0281a.f1627q;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = c1370g6.remove(str2);
                        if (remove != null) {
                            c1370g6.put(str, remove);
                        } else {
                            c1370g6.put(str, str2);
                        }
                    }
                }
            }
        }
        return c1370g6;
    }

    /* renamed from: e */
    public static void m29131e(C0281a c0281a, SparseArray<C0324h> sparseArray, boolean z) {
        if (c0281a.f1525t.m29298n0().mo11809h()) {
            for (int size = c0281a.f1613c.size() - 1; size >= 0; size--) {
                m29134b(c0281a, c0281a.f1613c.get(size), sparseArray, true, z);
            }
        }
    }

    /* renamed from: f */
    public static void m29130f(Fragment fragment, Fragment fragment2, boolean z, C1370g6<String, View> c1370g6, boolean z2) {
        if (z) {
            fragment2.m29399x();
        } else {
            fragment.m29399x();
        }
    }

    /* renamed from: g */
    public static boolean m29129g(a40 a40Var, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!a40Var.mo2902e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static C1370g6<String, View> m29128h(a40 a40Var, C1370g6<String, String> c1370g6, Object obj, C0324h c0324h) {
        ArrayList<String> arrayList;
        Fragment fragment = c0324h.f1675a;
        View m29459V = fragment.m29459V();
        if (c1370g6.isEmpty() || obj == null || m29459V == null) {
            c1370g6.clear();
            return null;
        }
        C1370g6<String, View> c1370g62 = new C1370g6<>();
        a40Var.m27618j(c1370g62, m29459V);
        C0281a c0281a = c0324h.f1677c;
        if (c0324h.f1676b) {
            fragment.m29501A();
            arrayList = c0281a.f1626p;
        } else {
            fragment.m29399x();
            arrayList = c0281a.f1627q;
        }
        if (arrayList != null) {
            c1370g62.m21905o(arrayList);
            c1370g62.m21905o(c1370g6.values());
        }
        m29112x(c1370g6, c1370g62);
        return c1370g62;
    }

    /* renamed from: i */
    public static C1370g6<String, View> m29127i(a40 a40Var, C1370g6<String, String> c1370g6, Object obj, C0324h c0324h) {
        ArrayList<String> arrayList;
        if (c1370g6.isEmpty() || obj == null) {
            c1370g6.clear();
            return null;
        }
        Fragment fragment = c0324h.f1678d;
        C1370g6<String, View> c1370g62 = new C1370g6<>();
        a40Var.m27618j(c1370g62, fragment.m29417p1());
        C0281a c0281a = c0324h.f1680f;
        if (c0324h.f1679e) {
            fragment.m29399x();
            arrayList = c0281a.f1627q;
        } else {
            fragment.m29501A();
            arrayList = c0281a.f1626p;
        }
        if (arrayList != null) {
            c1370g62.m21905o(arrayList);
        }
        c1370g6.m21905o(c1370g62.keySet());
        return c1370g62;
    }

    /* renamed from: j */
    public static a40 m29126j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object m29394z = fragment.m29394z();
            if (m29394z != null) {
                arrayList.add(m29394z);
            }
            Object m29472O = fragment.m29472O();
            if (m29472O != null) {
                arrayList.add(m29472O);
            }
            Object m29469Q = fragment.m29469Q();
            if (m29469Q != null) {
                arrayList.add(m29469Q);
            }
        }
        if (fragment2 != null) {
            Object m29401w = fragment2.m29401w();
            if (m29401w != null) {
                arrayList.add(m29401w);
            }
            Object m29474M = fragment2.m29474M();
            if (m29474M != null) {
                arrayList.add(m29474M);
            }
            Object m29471P = fragment2.m29471P();
            if (m29471P != null) {
                arrayList.add(m29471P);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        a40 a40Var = f1639b;
        if (a40Var == null || !m29129g(a40Var, arrayList)) {
            a40 a40Var2 = f1640c;
            if (a40Var2 == null || !m29129g(a40Var2, arrayList)) {
                if (a40Var == null && a40Var2 == null) {
                    return null;
                }
                throw new IllegalArgumentException("Invalid Transition types");
            }
            return a40Var2;
        }
        return a40Var;
    }

    /* renamed from: k */
    public static ArrayList<View> m29125k(a40 a40Var, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj != null) {
            ArrayList<View> arrayList2 = new ArrayList<>();
            View m29459V = fragment.m29459V();
            if (m29459V != null) {
                a40Var.m27621f(arrayList2, m29459V);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (arrayList2.isEmpty()) {
                return arrayList2;
            }
            arrayList2.add(view);
            a40Var.mo2904b(obj, arrayList2);
            return arrayList2;
        }
        return null;
    }

    /* renamed from: l */
    public static Object m29124l(a40 a40Var, ViewGroup viewGroup, View view, C1370g6<String, String> c1370g6, C0324h c0324h, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object m29116t;
        C1370g6<String, String> c1370g62;
        Object obj3;
        Rect rect;
        Fragment fragment = c0324h.f1675a;
        Fragment fragment2 = c0324h.f1678d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = c0324h.f1676b;
        if (c1370g6.isEmpty()) {
            c1370g62 = c1370g6;
            m29116t = null;
        } else {
            m29116t = m29116t(a40Var, fragment, fragment2, z);
            c1370g62 = c1370g6;
        }
        C1370g6<String, View> m29127i = m29127i(a40Var, c1370g62, m29116t, c0324h);
        if (c1370g6.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(m29127i.values());
            obj3 = m29116t;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m29130f(fragment, fragment2, z, m29127i, true);
        if (obj3 != null) {
            rect = new Rect();
            a40Var.mo2891z(obj3, view, arrayList);
            m29110z(a40Var, obj3, obj2, m29127i, c0324h.f1679e, c0324h.f1680f);
            if (obj != null) {
                a40Var.mo2894u(obj, rect);
            }
        } else {
            rect = null;
        }
        nu0.m14792a(viewGroup, new RunnableC0322f(a40Var, c1370g6, obj3, c0324h, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect));
        return obj3;
    }

    /* renamed from: m */
    public static Object m29123m(a40 a40Var, ViewGroup viewGroup, View view, C1370g6<String, String> c1370g6, C0324h c0324h, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = c0324h.f1675a;
        Fragment fragment2 = c0324h.f1678d;
        if (fragment != null) {
            fragment.m29417p1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = c0324h.f1676b;
        Object m29116t = c1370g6.isEmpty() ? null : m29116t(a40Var, fragment, fragment2, z);
        C1370g6<String, View> m29127i = m29127i(a40Var, c1370g6, m29116t, c0324h);
        C1370g6<String, View> m29128h = m29128h(a40Var, c1370g6, m29116t, c0324h);
        if (c1370g6.isEmpty()) {
            if (m29127i != null) {
                m29127i.clear();
            }
            if (m29128h != null) {
                m29128h.clear();
            }
            obj3 = null;
        } else {
            m29135a(arrayList, m29127i, c1370g6.keySet());
            m29135a(arrayList2, m29128h, c1370g6.values());
            obj3 = m29116t;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m29130f(fragment, fragment2, z, m29127i, true);
        if (obj3 != null) {
            arrayList2.add(view);
            a40Var.mo2891z(obj3, view, arrayList);
            m29110z(a40Var, obj3, obj2, m29127i, c0324h.f1679e, c0324h.f1680f);
            Rect rect2 = new Rect();
            View m29117s = m29117s(m29128h, c0324h, obj, z);
            if (m29117s != null) {
                a40Var.mo2894u(obj, rect2);
            }
            rect = rect2;
            view2 = m29117s;
        } else {
            view2 = null;
            rect = null;
        }
        nu0.m14792a(viewGroup, new RunnableC0321e(fragment, fragment2, z, m29128h, view2, a40Var, rect));
        return obj3;
    }

    /* renamed from: n */
    public static void m29122n(ViewGroup viewGroup, C0324h c0324h, View view, C1370g6<String, String> c1370g6, InterfaceC0323g interfaceC0323g) {
        Object obj;
        Fragment fragment = c0324h.f1675a;
        Fragment fragment2 = c0324h.f1678d;
        a40 m29126j = m29126j(fragment2, fragment);
        if (m29126j == null) {
            return;
        }
        boolean z = c0324h.f1676b;
        boolean z2 = c0324h.f1679e;
        Object m29119q = m29119q(m29126j, fragment, z);
        Object m29118r = m29118r(m29126j, fragment2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object m29124l = m29124l(m29126j, viewGroup, view, c1370g6, c0324h, arrayList, arrayList2, m29119q, m29118r);
        if (m29119q == null && m29124l == null) {
            obj = m29118r;
            if (obj == null) {
                return;
            }
        } else {
            obj = m29118r;
        }
        ArrayList<View> m29125k = m29125k(m29126j, obj, fragment2, arrayList, view);
        Object obj2 = (m29125k == null || m29125k.isEmpty()) ? null : null;
        m29126j.mo2905a(m29119q, view);
        Object m29115u = m29115u(m29126j, m29119q, obj2, m29124l, fragment, c0324h.f1676b);
        if (fragment2 != null && m29125k != null && (m29125k.size() > 0 || arrayList.size() > 0)) {
            C3423wd c3423wd = new C3423wd();
            interfaceC0323g.mo29109a(fragment2, c3423wd);
            m29126j.mo2892w(fragment2, m29115u, c3423wd, new RunnableC0319c(interfaceC0323g, fragment2, c3423wd));
        }
        if (m29115u != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            m29126j.mo2895t(m29115u, m29119q, arrayList3, obj2, m29125k, m29124l, arrayList2);
            m29111y(m29126j, viewGroup, fragment, view, arrayList2, m29119q, arrayList3, obj2, m29125k);
            m29126j.m27613x(viewGroup, arrayList2, c1370g6);
            m29126j.mo2903c(viewGroup, m29115u);
            m29126j.m27614s(viewGroup, arrayList2, c1370g6);
        }
    }

    /* renamed from: o */
    public static void m29121o(ViewGroup viewGroup, C0324h c0324h, View view, C1370g6<String, String> c1370g6, InterfaceC0323g interfaceC0323g) {
        Object obj;
        Fragment fragment = c0324h.f1675a;
        Fragment fragment2 = c0324h.f1678d;
        a40 m29126j = m29126j(fragment2, fragment);
        if (m29126j == null) {
            return;
        }
        boolean z = c0324h.f1676b;
        boolean z2 = c0324h.f1679e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object m29119q = m29119q(m29126j, fragment, z);
        Object m29118r = m29118r(m29126j, fragment2, z2);
        Object m29123m = m29123m(m29126j, viewGroup, view, c1370g6, c0324h, arrayList2, arrayList, m29119q, m29118r);
        if (m29119q == null && m29123m == null) {
            obj = m29118r;
            if (obj == null) {
                return;
            }
        } else {
            obj = m29118r;
        }
        ArrayList<View> m29125k = m29125k(m29126j, obj, fragment2, arrayList2, view);
        ArrayList<View> m29125k2 = m29125k(m29126j, m29119q, fragment, arrayList, view);
        m29137A(m29125k2, 4);
        Object m29115u = m29115u(m29126j, m29119q, obj, m29123m, fragment, z);
        if (fragment2 != null && m29125k != null && (m29125k.size() > 0 || arrayList2.size() > 0)) {
            C3423wd c3423wd = new C3423wd();
            interfaceC0323g.mo29109a(fragment2, c3423wd);
            m29126j.mo2892w(fragment2, m29115u, c3423wd, new RunnableC0317a(interfaceC0323g, fragment2, c3423wd));
        }
        if (m29115u != null) {
            m29114v(m29126j, obj, fragment2, m29125k);
            ArrayList<String> m27615o = m29126j.m27615o(arrayList);
            m29126j.mo2895t(m29115u, m29119q, m29125k2, obj, m29125k, m29123m, arrayList);
            m29126j.mo2903c(viewGroup, m29115u);
            m29126j.m27612y(viewGroup, arrayList2, arrayList, m27615o, c1370g6);
            m29137A(m29125k2, 0);
            m29126j.mo2908A(m29123m, arrayList2, arrayList);
        }
    }

    /* renamed from: p */
    public static C0324h m29120p(C0324h c0324h, SparseArray<C0324h> sparseArray, int i) {
        if (c0324h == null) {
            C0324h c0324h2 = new C0324h();
            sparseArray.put(i, c0324h2);
            return c0324h2;
        }
        return c0324h;
    }

    /* renamed from: q */
    public static Object m29119q(a40 a40Var, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return a40Var.mo2901g(z ? fragment.m29474M() : fragment.m29401w());
    }

    /* renamed from: r */
    public static Object m29118r(a40 a40Var, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return a40Var.mo2901g(z ? fragment.m29472O() : fragment.m29394z());
    }

    /* renamed from: s */
    public static View m29117s(C1370g6<String, View> c1370g6, C0324h c0324h, Object obj, boolean z) {
        ArrayList<String> arrayList;
        C0281a c0281a = c0324h.f1677c;
        if (obj == null || c1370g6 == null || (arrayList = c0281a.f1626p) == null || arrayList.isEmpty()) {
            return null;
        }
        return c1370g6.get((z ? c0281a.f1626p : c0281a.f1627q).get(0));
    }

    /* renamed from: t */
    public static Object m29116t(a40 a40Var, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return a40Var.mo2907B(a40Var.mo2901g(z ? fragment2.m29469Q() : fragment.m29471P()));
    }

    /* renamed from: u */
    public static Object m29115u(a40 a40Var, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.m29419p() : fragment.m29421o() ? a40Var.mo2899n(obj2, obj, obj3) : a40Var.mo2900m(obj2, obj, obj3);
    }

    /* renamed from: v */
    public static void m29114v(a40 a40Var, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f1354A && fragment.f1368O && fragment.f1382c0) {
            fragment.m29395y1(true);
            a40Var.mo2896r(obj, fragment.m29459V(), arrayList);
            nu0.m14792a(fragment.f1375V, new RunnableC0318b(arrayList));
        }
    }

    /* renamed from: w */
    public static a40 m29113w() {
        try {
            return (a40) b40.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: x */
    public static void m29112x(C1370g6<String, String> c1370g6, C1370g6<String, View> c1370g62) {
        for (int size = c1370g6.size() - 1; size >= 0; size--) {
            if (!c1370g62.containsKey(c1370g6.m25432m(size))) {
                c1370g6.m25434k(size);
            }
        }
    }

    /* renamed from: y */
    public static void m29111y(a40 a40Var, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        nu0.m14792a(viewGroup, new RunnableC0320d(obj, a40Var, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    /* renamed from: z */
    public static void m29110z(a40 a40Var, Object obj, Object obj2, C1370g6<String, View> c1370g6, boolean z, C0281a c0281a) {
        ArrayList<String> arrayList = c0281a.f1626p;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = c1370g6.get((z ? c0281a.f1627q : c0281a.f1626p).get(0));
        a40Var.mo2893v(obj, view);
        if (obj2 != null) {
            a40Var.mo2893v(obj2, view);
        }
    }
}
