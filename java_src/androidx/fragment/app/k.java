package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.daaw.a40;
import com.daaw.b40;
import com.daaw.g6;
import com.daaw.nu0;
import com.daaw.r30;
import com.daaw.wd;
import com.daaw.xs1;
import com.daaw.z30;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public class k {
    public static final int[] a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};
    public static final a40 b;
    public static final a40 c;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ g p;
        public final /* synthetic */ Fragment q;
        public final /* synthetic */ wd r;

        public a(g gVar, Fragment fragment, wd wdVar) {
            this.p = gVar;
            this.q = fragment;
            this.r = wdVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.p.b(this.q, this.r);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ ArrayList p;

        public b(ArrayList arrayList) {
            this.p = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.A(this.p, 4);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final /* synthetic */ g p;
        public final /* synthetic */ Fragment q;
        public final /* synthetic */ wd r;

        public c(g gVar, Fragment fragment, wd wdVar) {
            this.p = gVar;
            this.q = fragment;
            this.r = wdVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.p.b(this.q, this.r);
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {
        public final /* synthetic */ Object p;
        public final /* synthetic */ a40 q;
        public final /* synthetic */ View r;
        public final /* synthetic */ Fragment s;
        public final /* synthetic */ ArrayList t;
        public final /* synthetic */ ArrayList u;
        public final /* synthetic */ ArrayList v;
        public final /* synthetic */ Object w;

        public d(Object obj, a40 a40Var, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.p = obj;
            this.q = a40Var;
            this.r = view;
            this.s = fragment;
            this.t = arrayList;
            this.u = arrayList2;
            this.v = arrayList3;
            this.w = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.p;
            if (obj != null) {
                this.q.p(obj, this.r);
                this.u.addAll(k.k(this.q, this.p, this.s, this.t, this.r));
            }
            if (this.v != null) {
                if (this.w != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.r);
                    this.q.q(this.w, this.v, arrayList);
                }
                this.v.clear();
                this.v.add(this.r);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {
        public final /* synthetic */ Fragment p;
        public final /* synthetic */ Fragment q;
        public final /* synthetic */ boolean r;
        public final /* synthetic */ g6 s;
        public final /* synthetic */ View t;
        public final /* synthetic */ a40 u;
        public final /* synthetic */ Rect v;

        public e(Fragment fragment, Fragment fragment2, boolean z, g6 g6Var, View view, a40 a40Var, Rect rect) {
            this.p = fragment;
            this.q = fragment2;
            this.r = z;
            this.s = g6Var;
            this.t = view;
            this.u = a40Var;
            this.v = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.f(this.p, this.q, this.r, this.s, false);
            View view = this.t;
            if (view != null) {
                this.u.k(view, this.v);
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {
        public final /* synthetic */ Rect A;
        public final /* synthetic */ a40 p;
        public final /* synthetic */ g6 q;
        public final /* synthetic */ Object r;
        public final /* synthetic */ h s;
        public final /* synthetic */ ArrayList t;
        public final /* synthetic */ View u;
        public final /* synthetic */ Fragment v;
        public final /* synthetic */ Fragment w;
        public final /* synthetic */ boolean x;
        public final /* synthetic */ ArrayList y;
        public final /* synthetic */ Object z;

        public f(a40 a40Var, g6 g6Var, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.p = a40Var;
            this.q = g6Var;
            this.r = obj;
            this.s = hVar;
            this.t = arrayList;
            this.u = view;
            this.v = fragment;
            this.w = fragment2;
            this.x = z;
            this.y = arrayList2;
            this.z = obj2;
            this.A = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            g6<String, View> h = k.h(this.p, this.q, this.r, this.s);
            if (h != null) {
                this.t.addAll(h.values());
                this.t.add(this.u);
            }
            k.f(this.v, this.w, this.x, h, false);
            Object obj = this.r;
            if (obj != null) {
                this.p.A(obj, this.y, this.t);
                View s = k.s(h, this.s, this.z, this.x);
                if (s != null) {
                    this.p.k(s, this.A);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(Fragment fragment, wd wdVar);

        void b(Fragment fragment, wd wdVar);
    }

    /* loaded from: classes.dex */
    public static class h {
        public Fragment a;
        public boolean b;
        public androidx.fragment.app.a c;
        public Fragment d;
        public boolean e;
        public androidx.fragment.app.a f;
    }

    static {
        b = Build.VERSION.SDK_INT >= 21 ? new z30() : null;
        c = w();
    }

    public static void A(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    public static void B(Context context, r30 r30Var, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, g gVar) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            androidx.fragment.app.a aVar = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue()) {
                e(aVar, sparseArray, z);
            } else {
                c(aVar, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int keyAt = sparseArray.keyAt(i4);
                g6<String, String> d2 = d(keyAt, arrayList, arrayList2, i, i2);
                h hVar = (h) sparseArray.valueAt(i4);
                if (r30Var.h() && (viewGroup = (ViewGroup) r30Var.f(keyAt)) != null) {
                    if (z) {
                        o(viewGroup, hVar, view, d2, gVar);
                    } else {
                        n(viewGroup, hVar, view, d2, gVar);
                    }
                }
            }
        }
    }

    public static void a(ArrayList<View> arrayList, g6<String, View> g6Var, Collection<String> collection) {
        for (int size = g6Var.size() - 1; size >= 0; size--) {
            View m = g6Var.m(size);
            if (collection.contains(xs1.N(m))) {
                arrayList.add(m);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0039, code lost:
        if (r0.A != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x006e, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0088, code lost:
        if (r0.O == false) goto L60;
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(androidx.fragment.app.a r8, androidx.fragment.app.j.a r9, android.util.SparseArray<androidx.fragment.app.k.h> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.k.b(androidx.fragment.app.a, androidx.fragment.app.j$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(androidx.fragment.app.a aVar, SparseArray<h> sparseArray, boolean z) {
        int size = aVar.c.size();
        for (int i = 0; i < size; i++) {
            b(aVar, aVar.c.get(i), sparseArray, false, z);
        }
    }

    public static g6<String, String> d(int i, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        g6<String, String> g6Var = new g6<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            androidx.fragment.app.a aVar = arrayList.get(i4);
            if (aVar.x(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = aVar.p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar.p;
                        arrayList4 = aVar.q;
                    } else {
                        ArrayList<String> arrayList6 = aVar.p;
                        arrayList3 = aVar.q;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = g6Var.remove(str2);
                        if (remove != null) {
                            g6Var.put(str, remove);
                        } else {
                            g6Var.put(str, str2);
                        }
                    }
                }
            }
        }
        return g6Var;
    }

    public static void e(androidx.fragment.app.a aVar, SparseArray<h> sparseArray, boolean z) {
        if (aVar.t.n0().h()) {
            for (int size = aVar.c.size() - 1; size >= 0; size--) {
                b(aVar, aVar.c.get(size), sparseArray, true, z);
            }
        }
    }

    public static void f(Fragment fragment, Fragment fragment2, boolean z, g6<String, View> g6Var, boolean z2) {
        if (z) {
            fragment2.x();
        } else {
            fragment.x();
        }
    }

    public static boolean g(a40 a40Var, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!a40Var.e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static g6<String, View> h(a40 a40Var, g6<String, String> g6Var, Object obj, h hVar) {
        ArrayList<String> arrayList;
        Fragment fragment = hVar.a;
        View V = fragment.V();
        if (g6Var.isEmpty() || obj == null || V == null) {
            g6Var.clear();
            return null;
        }
        g6<String, View> g6Var2 = new g6<>();
        a40Var.j(g6Var2, V);
        androidx.fragment.app.a aVar = hVar.c;
        if (hVar.b) {
            fragment.A();
            arrayList = aVar.p;
        } else {
            fragment.x();
            arrayList = aVar.q;
        }
        if (arrayList != null) {
            g6Var2.o(arrayList);
            g6Var2.o(g6Var.values());
        }
        x(g6Var, g6Var2);
        return g6Var2;
    }

    public static g6<String, View> i(a40 a40Var, g6<String, String> g6Var, Object obj, h hVar) {
        ArrayList<String> arrayList;
        if (g6Var.isEmpty() || obj == null) {
            g6Var.clear();
            return null;
        }
        Fragment fragment = hVar.d;
        g6<String, View> g6Var2 = new g6<>();
        a40Var.j(g6Var2, fragment.p1());
        androidx.fragment.app.a aVar = hVar.f;
        if (hVar.e) {
            fragment.x();
            arrayList = aVar.q;
        } else {
            fragment.A();
            arrayList = aVar.p;
        }
        if (arrayList != null) {
            g6Var2.o(arrayList);
        }
        g6Var.o(g6Var2.keySet());
        return g6Var2;
    }

    public static a40 j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object z = fragment.z();
            if (z != null) {
                arrayList.add(z);
            }
            Object O = fragment.O();
            if (O != null) {
                arrayList.add(O);
            }
            Object Q = fragment.Q();
            if (Q != null) {
                arrayList.add(Q);
            }
        }
        if (fragment2 != null) {
            Object w = fragment2.w();
            if (w != null) {
                arrayList.add(w);
            }
            Object M = fragment2.M();
            if (M != null) {
                arrayList.add(M);
            }
            Object P = fragment2.P();
            if (P != null) {
                arrayList.add(P);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        a40 a40Var = b;
        if (a40Var == null || !g(a40Var, arrayList)) {
            a40 a40Var2 = c;
            if (a40Var2 == null || !g(a40Var2, arrayList)) {
                if (a40Var == null && a40Var2 == null) {
                    return null;
                }
                throw new IllegalArgumentException("Invalid Transition types");
            }
            return a40Var2;
        }
        return a40Var;
    }

    public static ArrayList<View> k(a40 a40Var, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj != null) {
            ArrayList<View> arrayList2 = new ArrayList<>();
            View V = fragment.V();
            if (V != null) {
                a40Var.f(arrayList2, V);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (arrayList2.isEmpty()) {
                return arrayList2;
            }
            arrayList2.add(view);
            a40Var.b(obj, arrayList2);
            return arrayList2;
        }
        return null;
    }

    public static Object l(a40 a40Var, ViewGroup viewGroup, View view, g6<String, String> g6Var, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object t;
        g6<String, String> g6Var2;
        Object obj3;
        Rect rect;
        Fragment fragment = hVar.a;
        Fragment fragment2 = hVar.d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar.b;
        if (g6Var.isEmpty()) {
            g6Var2 = g6Var;
            t = null;
        } else {
            t = t(a40Var, fragment, fragment2, z);
            g6Var2 = g6Var;
        }
        g6<String, View> i = i(a40Var, g6Var2, t, hVar);
        if (g6Var.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(i.values());
            obj3 = t;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z, i, true);
        if (obj3 != null) {
            rect = new Rect();
            a40Var.z(obj3, view, arrayList);
            z(a40Var, obj3, obj2, i, hVar.e, hVar.f);
            if (obj != null) {
                a40Var.u(obj, rect);
            }
        } else {
            rect = null;
        }
        nu0.a(viewGroup, new f(a40Var, g6Var, obj3, hVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect));
        return obj3;
    }

    public static Object m(a40 a40Var, ViewGroup viewGroup, View view, g6<String, String> g6Var, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = hVar.a;
        Fragment fragment2 = hVar.d;
        if (fragment != null) {
            fragment.p1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar.b;
        Object t = g6Var.isEmpty() ? null : t(a40Var, fragment, fragment2, z);
        g6<String, View> i = i(a40Var, g6Var, t, hVar);
        g6<String, View> h2 = h(a40Var, g6Var, t, hVar);
        if (g6Var.isEmpty()) {
            if (i != null) {
                i.clear();
            }
            if (h2 != null) {
                h2.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, i, g6Var.keySet());
            a(arrayList2, h2, g6Var.values());
            obj3 = t;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z, i, true);
        if (obj3 != null) {
            arrayList2.add(view);
            a40Var.z(obj3, view, arrayList);
            z(a40Var, obj3, obj2, i, hVar.e, hVar.f);
            Rect rect2 = new Rect();
            View s = s(h2, hVar, obj, z);
            if (s != null) {
                a40Var.u(obj, rect2);
            }
            rect = rect2;
            view2 = s;
        } else {
            view2 = null;
            rect = null;
        }
        nu0.a(viewGroup, new e(fragment, fragment2, z, h2, view2, a40Var, rect));
        return obj3;
    }

    public static void n(ViewGroup viewGroup, h hVar, View view, g6<String, String> g6Var, g gVar) {
        Object obj;
        Fragment fragment = hVar.a;
        Fragment fragment2 = hVar.d;
        a40 j = j(fragment2, fragment);
        if (j == null) {
            return;
        }
        boolean z = hVar.b;
        boolean z2 = hVar.e;
        Object q = q(j, fragment, z);
        Object r = r(j, fragment2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object l = l(j, viewGroup, view, g6Var, hVar, arrayList, arrayList2, q, r);
        if (q == null && l == null) {
            obj = r;
            if (obj == null) {
                return;
            }
        } else {
            obj = r;
        }
        ArrayList<View> k = k(j, obj, fragment2, arrayList, view);
        Object obj2 = (k == null || k.isEmpty()) ? null : null;
        j.a(q, view);
        Object u = u(j, q, obj2, l, fragment, hVar.b);
        if (fragment2 != null && k != null && (k.size() > 0 || arrayList.size() > 0)) {
            wd wdVar = new wd();
            gVar.a(fragment2, wdVar);
            j.w(fragment2, u, wdVar, new c(gVar, fragment2, wdVar));
        }
        if (u != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            j.t(u, q, arrayList3, obj2, k, l, arrayList2);
            y(j, viewGroup, fragment, view, arrayList2, q, arrayList3, obj2, k);
            j.x(viewGroup, arrayList2, g6Var);
            j.c(viewGroup, u);
            j.s(viewGroup, arrayList2, g6Var);
        }
    }

    public static void o(ViewGroup viewGroup, h hVar, View view, g6<String, String> g6Var, g gVar) {
        Object obj;
        Fragment fragment = hVar.a;
        Fragment fragment2 = hVar.d;
        a40 j = j(fragment2, fragment);
        if (j == null) {
            return;
        }
        boolean z = hVar.b;
        boolean z2 = hVar.e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object q = q(j, fragment, z);
        Object r = r(j, fragment2, z2);
        Object m = m(j, viewGroup, view, g6Var, hVar, arrayList2, arrayList, q, r);
        if (q == null && m == null) {
            obj = r;
            if (obj == null) {
                return;
            }
        } else {
            obj = r;
        }
        ArrayList<View> k = k(j, obj, fragment2, arrayList2, view);
        ArrayList<View> k2 = k(j, q, fragment, arrayList, view);
        A(k2, 4);
        Object u = u(j, q, obj, m, fragment, z);
        if (fragment2 != null && k != null && (k.size() > 0 || arrayList2.size() > 0)) {
            wd wdVar = new wd();
            gVar.a(fragment2, wdVar);
            j.w(fragment2, u, wdVar, new a(gVar, fragment2, wdVar));
        }
        if (u != null) {
            v(j, obj, fragment2, k);
            ArrayList<String> o = j.o(arrayList);
            j.t(u, q, k2, obj, k, m, arrayList);
            j.c(viewGroup, u);
            j.y(viewGroup, arrayList2, arrayList, o, g6Var);
            A(k2, 0);
            j.A(m, arrayList2, arrayList);
        }
    }

    public static h p(h hVar, SparseArray<h> sparseArray, int i) {
        if (hVar == null) {
            h hVar2 = new h();
            sparseArray.put(i, hVar2);
            return hVar2;
        }
        return hVar;
    }

    public static Object q(a40 a40Var, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return a40Var.g(z ? fragment.M() : fragment.w());
    }

    public static Object r(a40 a40Var, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return a40Var.g(z ? fragment.O() : fragment.z());
    }

    public static View s(g6<String, View> g6Var, h hVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        androidx.fragment.app.a aVar = hVar.c;
        if (obj == null || g6Var == null || (arrayList = aVar.p) == null || arrayList.isEmpty()) {
            return null;
        }
        return g6Var.get((z ? aVar.p : aVar.q).get(0));
    }

    public static Object t(a40 a40Var, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return a40Var.B(a40Var.g(z ? fragment2.Q() : fragment.P()));
    }

    public static Object u(a40 a40Var, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.p() : fragment.o() ? a40Var.n(obj2, obj, obj3) : a40Var.m(obj2, obj, obj3);
    }

    public static void v(a40 a40Var, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.A && fragment.O && fragment.c0) {
            fragment.y1(true);
            a40Var.r(obj, fragment.V(), arrayList);
            nu0.a(fragment.V, new b(arrayList));
        }
    }

    public static a40 w() {
        try {
            return (a40) b40.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void x(g6<String, String> g6Var, g6<String, View> g6Var2) {
        for (int size = g6Var.size() - 1; size >= 0; size--) {
            if (!g6Var2.containsKey(g6Var.m(size))) {
                g6Var.k(size);
            }
        }
    }

    public static void y(a40 a40Var, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        nu0.a(viewGroup, new d(obj, a40Var, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    public static void z(a40 a40Var, Object obj, Object obj2, g6<String, View> g6Var, boolean z, androidx.fragment.app.a aVar) {
        ArrayList<String> arrayList = aVar.p;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = g6Var.get((z ? aVar.q : aVar.p).get(0));
        a40Var.v(obj, view);
        if (obj2 != null) {
            a40Var.v(obj2, view);
        }
    }
}
