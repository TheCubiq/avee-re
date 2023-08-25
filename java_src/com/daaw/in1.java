package com.daaw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public abstract class in1 implements Cloneable {
    public static final int[] V = {2, 1, 3, 4};
    public static final aw0 W = new a();
    public static ThreadLocal<g6<Animator, d>> X = new ThreadLocal<>();
    public ArrayList<on1> I;
    public ArrayList<on1> J;
    public e S;
    public g6<String, String> T;
    public String p = getClass().getName();
    public long q = -1;
    public long r = -1;
    public TimeInterpolator s = null;
    public ArrayList<Integer> t = new ArrayList<>();
    public ArrayList<View> u = new ArrayList<>();
    public ArrayList<String> v = null;
    public ArrayList<Class<?>> w = null;
    public ArrayList<Integer> x = null;
    public ArrayList<View> y = null;
    public ArrayList<Class<?>> z = null;
    public ArrayList<String> A = null;
    public ArrayList<Integer> B = null;
    public ArrayList<View> C = null;
    public ArrayList<Class<?>> D = null;
    public pn1 E = new pn1();
    public pn1 F = new pn1();
    public mn1 G = null;
    public int[] H = V;
    public ViewGroup K = null;
    public boolean L = false;
    public ArrayList<Animator> M = new ArrayList<>();
    public int N = 0;
    public boolean O = false;
    public boolean P = false;
    public ArrayList<f> Q = null;
    public ArrayList<Animator> R = new ArrayList<>();
    public aw0 U = W;

    /* loaded from: classes.dex */
    public static class a extends aw0 {
        @Override // com.daaw.aw0
        public Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {
        public final /* synthetic */ g6 a;

        public b(g6 g6Var) {
            this.a = g6Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.remove(animator);
            in1.this.M.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            in1.this.M.add(animator);
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            in1.this.t();
            animator.removeListener(this);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public View a;
        public String b;
        public on1 c;
        public ox1 d;
        public in1 e;

        public d(View view, String str, in1 in1Var, ox1 ox1Var, on1 on1Var) {
            this.a = view;
            this.b = str;
            this.c = on1Var;
            this.d = ox1Var;
            this.e = in1Var;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(in1 in1Var);

        void b(in1 in1Var);

        void c(in1 in1Var);

        void d(in1 in1Var);

        void e(in1 in1Var);
    }

    public static g6<Animator, d> B() {
        g6<Animator, d> g6Var = X.get();
        if (g6Var == null) {
            g6<Animator, d> g6Var2 = new g6<>();
            X.set(g6Var2);
            return g6Var2;
        }
        return g6Var;
    }

    public static boolean L(on1 on1Var, on1 on1Var2, String str) {
        Object obj = on1Var.a.get(str);
        Object obj2 = on1Var2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    public static void d(pn1 pn1Var, View view, on1 on1Var) {
        pn1Var.a.put(view, on1Var);
        int id = view.getId();
        if (id >= 0) {
            if (pn1Var.b.indexOfKey(id) >= 0) {
                pn1Var.b.put(id, null);
            } else {
                pn1Var.b.put(id, view);
            }
        }
        String N = xs1.N(view);
        if (N != null) {
            if (pn1Var.d.containsKey(N)) {
                pn1Var.d.put(N, null);
            } else {
                pn1Var.d.put(N, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (pn1Var.c.i(itemIdAtPosition) < 0) {
                    xs1.A0(view, true);
                    pn1Var.c.k(itemIdAtPosition, view);
                    return;
                }
                View e2 = pn1Var.c.e(itemIdAtPosition);
                if (e2 != null) {
                    xs1.A0(e2, false);
                    pn1Var.c.k(itemIdAtPosition, null);
                }
            }
        }
    }

    public ln1 A() {
        return null;
    }

    public long C() {
        return this.q;
    }

    public List<Integer> D() {
        return this.t;
    }

    public List<String> E() {
        return this.v;
    }

    public List<Class<?>> F() {
        return this.w;
    }

    public List<View> G() {
        return this.u;
    }

    public String[] H() {
        return null;
    }

    public on1 I(View view, boolean z) {
        mn1 mn1Var = this.G;
        if (mn1Var != null) {
            return mn1Var.I(view, z);
        }
        return (z ? this.E : this.F).a.get(view);
    }

    public boolean J(on1 on1Var, on1 on1Var2) {
        if (on1Var == null || on1Var2 == null) {
            return false;
        }
        String[] H = H();
        if (H == null) {
            for (String str : on1Var.a.keySet()) {
                if (L(on1Var, on1Var2, str)) {
                }
            }
            return false;
        }
        for (String str2 : H) {
            if (!L(on1Var, on1Var2, str2)) {
            }
        }
        return false;
        return true;
    }

    public boolean K(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.x;
        if (arrayList3 == null || !arrayList3.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList4 = this.y;
            if (arrayList4 == null || !arrayList4.contains(view)) {
                ArrayList<Class<?>> arrayList5 = this.z;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    for (int i = 0; i < size; i++) {
                        if (this.z.get(i).isInstance(view)) {
                            return false;
                        }
                    }
                }
                if (this.A == null || xs1.N(view) == null || !this.A.contains(xs1.N(view))) {
                    if ((this.t.size() == 0 && this.u.size() == 0 && (((arrayList = this.w) == null || arrayList.isEmpty()) && ((arrayList2 = this.v) == null || arrayList2.isEmpty()))) || this.t.contains(Integer.valueOf(id)) || this.u.contains(view)) {
                        return true;
                    }
                    ArrayList<String> arrayList6 = this.v;
                    if (arrayList6 == null || !arrayList6.contains(xs1.N(view))) {
                        if (this.w != null) {
                            for (int i2 = 0; i2 < this.w.size(); i2++) {
                                if (this.w.get(i2).isInstance(view)) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void M(g6<View, on1> g6Var, g6<View, on1> g6Var2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && K(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && K(view)) {
                on1 on1Var = g6Var.get(valueAt);
                on1 on1Var2 = g6Var2.get(view);
                if (on1Var != null && on1Var2 != null) {
                    this.I.add(on1Var);
                    this.J.add(on1Var2);
                    g6Var.remove(valueAt);
                    g6Var2.remove(view);
                }
            }
        }
    }

    public final void N(g6<View, on1> g6Var, g6<View, on1> g6Var2) {
        on1 remove;
        for (int size = g6Var.size() - 1; size >= 0; size--) {
            View i = g6Var.i(size);
            if (i != null && K(i) && (remove = g6Var2.remove(i)) != null && K(remove.b)) {
                this.I.add(g6Var.k(size));
                this.J.add(remove);
            }
        }
    }

    public final void O(g6<View, on1> g6Var, g6<View, on1> g6Var2, sl0<View> sl0Var, sl0<View> sl0Var2) {
        View e2;
        int o = sl0Var.o();
        for (int i = 0; i < o; i++) {
            View p = sl0Var.p(i);
            if (p != null && K(p) && (e2 = sl0Var2.e(sl0Var.j(i))) != null && K(e2)) {
                on1 on1Var = g6Var.get(p);
                on1 on1Var2 = g6Var2.get(e2);
                if (on1Var != null && on1Var2 != null) {
                    this.I.add(on1Var);
                    this.J.add(on1Var2);
                    g6Var.remove(p);
                    g6Var2.remove(e2);
                }
            }
        }
    }

    public final void P(g6<View, on1> g6Var, g6<View, on1> g6Var2, g6<String, View> g6Var3, g6<String, View> g6Var4) {
        View view;
        int size = g6Var3.size();
        for (int i = 0; i < size; i++) {
            View m = g6Var3.m(i);
            if (m != null && K(m) && (view = g6Var4.get(g6Var3.i(i))) != null && K(view)) {
                on1 on1Var = g6Var.get(m);
                on1 on1Var2 = g6Var2.get(view);
                if (on1Var != null && on1Var2 != null) {
                    this.I.add(on1Var);
                    this.J.add(on1Var2);
                    g6Var.remove(m);
                    g6Var2.remove(view);
                }
            }
        }
    }

    public final void Q(pn1 pn1Var, pn1 pn1Var2) {
        g6<View, on1> g6Var = new g6<>(pn1Var.a);
        g6<View, on1> g6Var2 = new g6<>(pn1Var2.a);
        int i = 0;
        while (true) {
            int[] iArr = this.H;
            if (i >= iArr.length) {
                c(g6Var, g6Var2);
                return;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                N(g6Var, g6Var2);
            } else if (i2 == 2) {
                P(g6Var, g6Var2, pn1Var.d, pn1Var2.d);
            } else if (i2 == 3) {
                M(g6Var, g6Var2, pn1Var.b, pn1Var2.b);
            } else if (i2 == 4) {
                O(g6Var, g6Var2, pn1Var.c, pn1Var2.c);
            }
            i++;
        }
    }

    public void R(View view) {
        if (this.P) {
            return;
        }
        g6<Animator, d> B = B();
        int size = B.size();
        ox1 d2 = gu1.d(view);
        for (int i = size - 1; i >= 0; i--) {
            d m = B.m(i);
            if (m.a != null && d2.equals(m.d)) {
                j3.b(B.i(i));
            }
        }
        ArrayList<f> arrayList = this.Q;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.Q.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((f) arrayList2.get(i2)).b(this);
            }
        }
        this.O = true;
    }

    public void S(ViewGroup viewGroup) {
        d dVar;
        this.I = new ArrayList<>();
        this.J = new ArrayList<>();
        Q(this.E, this.F);
        g6<Animator, d> B = B();
        int size = B.size();
        ox1 d2 = gu1.d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator i2 = B.i(i);
            if (i2 != null && (dVar = B.get(i2)) != null && dVar.a != null && d2.equals(dVar.d)) {
                on1 on1Var = dVar.c;
                View view = dVar.a;
                on1 I = I(view, true);
                on1 x = x(view, true);
                if (I == null && x == null) {
                    x = this.F.a.get(view);
                }
                if (!(I == null && x == null) && dVar.e.J(on1Var, x)) {
                    if (i2.isRunning() || i2.isStarted()) {
                        i2.cancel();
                    } else {
                        B.remove(i2);
                    }
                }
            }
        }
        s(viewGroup, this.E, this.F, this.I, this.J);
        X();
    }

    public in1 T(f fVar) {
        ArrayList<f> arrayList = this.Q;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.Q.size() == 0) {
            this.Q = null;
        }
        return this;
    }

    public in1 U(View view) {
        this.u.remove(view);
        return this;
    }

    public void V(View view) {
        if (this.O) {
            if (!this.P) {
                g6<Animator, d> B = B();
                int size = B.size();
                ox1 d2 = gu1.d(view);
                for (int i = size - 1; i >= 0; i--) {
                    d m = B.m(i);
                    if (m.a != null && d2.equals(m.d)) {
                        j3.c(B.i(i));
                    }
                }
                ArrayList<f> arrayList = this.Q;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.Q.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((f) arrayList2.get(i2)).e(this);
                    }
                }
            }
            this.O = false;
        }
    }

    public final void W(Animator animator, g6<Animator, d> g6Var) {
        if (animator != null) {
            animator.addListener(new b(g6Var));
            e(animator);
        }
    }

    public void X() {
        e0();
        g6<Animator, d> B = B();
        Iterator<Animator> it = this.R.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (B.containsKey(next)) {
                e0();
                W(next, B);
            }
        }
        this.R.clear();
        t();
    }

    public in1 Y(long j) {
        this.r = j;
        return this;
    }

    public void Z(e eVar) {
        this.S = eVar;
    }

    public in1 a(f fVar) {
        if (this.Q == null) {
            this.Q = new ArrayList<>();
        }
        this.Q.add(fVar);
        return this;
    }

    public in1 a0(TimeInterpolator timeInterpolator) {
        this.s = timeInterpolator;
        return this;
    }

    public in1 b(View view) {
        this.u.add(view);
        return this;
    }

    public void b0(aw0 aw0Var) {
        if (aw0Var == null) {
            aw0Var = W;
        }
        this.U = aw0Var;
    }

    public final void c(g6<View, on1> g6Var, g6<View, on1> g6Var2) {
        for (int i = 0; i < g6Var.size(); i++) {
            on1 m = g6Var.m(i);
            if (K(m.b)) {
                this.I.add(m);
                this.J.add(null);
            }
        }
        for (int i2 = 0; i2 < g6Var2.size(); i2++) {
            on1 m2 = g6Var2.m(i2);
            if (K(m2.b)) {
                this.J.add(m2);
                this.I.add(null);
            }
        }
    }

    public void c0(ln1 ln1Var) {
    }

    public in1 d0(long j) {
        this.q = j;
        return this;
    }

    public void e(Animator animator) {
        if (animator == null) {
            t();
            return;
        }
        if (u() >= 0) {
            animator.setDuration(u());
        }
        if (C() >= 0) {
            animator.setStartDelay(C() + animator.getStartDelay());
        }
        if (w() != null) {
            animator.setInterpolator(w());
        }
        animator.addListener(new c());
        animator.start();
    }

    public void e0() {
        if (this.N == 0) {
            ArrayList<f> arrayList = this.Q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.Q.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((f) arrayList2.get(i)).d(this);
                }
            }
            this.P = false;
        }
        this.N++;
    }

    public void f() {
        for (int size = this.M.size() - 1; size >= 0; size--) {
            this.M.get(size).cancel();
        }
        ArrayList<f> arrayList = this.Q;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.Q.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((f) arrayList2.get(i)).c(this);
        }
    }

    public String f0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.r != -1) {
            str2 = str2 + "dur(" + this.r + ") ";
        }
        if (this.q != -1) {
            str2 = str2 + "dly(" + this.q + ") ";
        }
        if (this.s != null) {
            str2 = str2 + "interp(" + this.s + ") ";
        }
        if (this.t.size() > 0 || this.u.size() > 0) {
            String str3 = str2 + "tgts(";
            if (this.t.size() > 0) {
                for (int i = 0; i < this.t.size(); i++) {
                    if (i > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.t.get(i);
                }
            }
            if (this.u.size() > 0) {
                for (int i2 = 0; i2 < this.u.size(); i2++) {
                    if (i2 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.u.get(i2);
                }
            }
            return str3 + ")";
        }
        return str2;
    }

    public abstract void i(on1 on1Var);

    public final void j(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.x;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.y;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.z;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (this.z.get(i).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    on1 on1Var = new on1(view);
                    if (z) {
                        m(on1Var);
                    } else {
                        i(on1Var);
                    }
                    on1Var.c.add(this);
                    k(on1Var);
                    d(z ? this.E : this.F, view, on1Var);
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.B;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.C;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.D;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (this.D.get(i2).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                j(viewGroup.getChildAt(i3), z);
                            }
                        }
                    }
                }
            }
        }
    }

    public void k(on1 on1Var) {
    }

    public abstract void m(on1 on1Var);

    public void n(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        g6<String, String> g6Var;
        o(z);
        if ((this.t.size() > 0 || this.u.size() > 0) && (((arrayList = this.v) == null || arrayList.isEmpty()) && ((arrayList2 = this.w) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.t.size(); i++) {
                View findViewById = viewGroup.findViewById(this.t.get(i).intValue());
                if (findViewById != null) {
                    on1 on1Var = new on1(findViewById);
                    if (z) {
                        m(on1Var);
                    } else {
                        i(on1Var);
                    }
                    on1Var.c.add(this);
                    k(on1Var);
                    d(z ? this.E : this.F, findViewById, on1Var);
                }
            }
            for (int i2 = 0; i2 < this.u.size(); i2++) {
                View view = this.u.get(i2);
                on1 on1Var2 = new on1(view);
                if (z) {
                    m(on1Var2);
                } else {
                    i(on1Var2);
                }
                on1Var2.c.add(this);
                k(on1Var2);
                d(z ? this.E : this.F, view, on1Var2);
            }
        } else {
            j(viewGroup, z);
        }
        if (z || (g6Var = this.T) == null) {
            return;
        }
        int size = g6Var.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add(this.E.d.remove(this.T.i(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.E.d.put(this.T.m(i4), view2);
            }
        }
    }

    public void o(boolean z) {
        pn1 pn1Var;
        if (z) {
            this.E.a.clear();
            this.E.b.clear();
            pn1Var = this.E;
        } else {
            this.F.a.clear();
            this.F.b.clear();
            pn1Var = this.F;
        }
        pn1Var.c.b();
    }

    @Override // 
    /* renamed from: p */
    public in1 clone() {
        try {
            in1 in1Var = (in1) super.clone();
            in1Var.R = new ArrayList<>();
            in1Var.E = new pn1();
            in1Var.F = new pn1();
            in1Var.I = null;
            in1Var.J = null;
            return in1Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator r(ViewGroup viewGroup, on1 on1Var, on1 on1Var2) {
        return null;
    }

    public void s(ViewGroup viewGroup, pn1 pn1Var, pn1 pn1Var2, ArrayList<on1> arrayList, ArrayList<on1> arrayList2) {
        int i;
        View view;
        Animator animator;
        on1 on1Var;
        Animator animator2;
        on1 on1Var2;
        g6<Animator, d> B = B();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            on1 on1Var3 = arrayList.get(i2);
            on1 on1Var4 = arrayList2.get(i2);
            if (on1Var3 != null && !on1Var3.c.contains(this)) {
                on1Var3 = null;
            }
            if (on1Var4 != null && !on1Var4.c.contains(this)) {
                on1Var4 = null;
            }
            if (on1Var3 != null || on1Var4 != null) {
                if (on1Var3 == null || on1Var4 == null || J(on1Var3, on1Var4)) {
                    Animator r = r(viewGroup, on1Var3, on1Var4);
                    if (r != null) {
                        if (on1Var4 != null) {
                            View view2 = on1Var4.b;
                            String[] H = H();
                            if (H != null && H.length > 0) {
                                on1Var2 = new on1(view2);
                                on1 on1Var5 = pn1Var2.a.get(view2);
                                if (on1Var5 != null) {
                                    int i3 = 0;
                                    while (i3 < H.length) {
                                        on1Var2.a.put(H[i3], on1Var5.a.get(H[i3]));
                                        i3++;
                                        r = r;
                                        size = size;
                                        on1Var5 = on1Var5;
                                    }
                                }
                                Animator animator3 = r;
                                i = size;
                                int size2 = B.size();
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= size2) {
                                        animator2 = animator3;
                                        break;
                                    }
                                    d dVar = B.get(B.i(i4));
                                    if (dVar.c != null && dVar.a == view2 && dVar.b.equals(y()) && dVar.c.equals(on1Var2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i4++;
                                }
                            } else {
                                i = size;
                                animator2 = r;
                                on1Var2 = null;
                            }
                            view = view2;
                            animator = animator2;
                            on1Var = on1Var2;
                        } else {
                            i = size;
                            view = on1Var3.b;
                            animator = r;
                            on1Var = null;
                        }
                        if (animator != null) {
                            B.put(animator, new d(view, y(), this, gu1.d(viewGroup), on1Var));
                            this.R.add(animator);
                        }
                        i2++;
                        size = i;
                    }
                    i = size;
                    i2++;
                    size = i;
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator4 = this.R.get(sparseIntArray.keyAt(i5));
                animator4.setStartDelay((sparseIntArray.valueAt(i5) - Long.MAX_VALUE) + animator4.getStartDelay());
            }
        }
    }

    public void t() {
        int i = this.N - 1;
        this.N = i;
        if (i == 0) {
            ArrayList<f> arrayList = this.Q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.Q.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((f) arrayList2.get(i2)).a(this);
                }
            }
            for (int i3 = 0; i3 < this.E.c.o(); i3++) {
                View p = this.E.c.p(i3);
                if (p != null) {
                    xs1.A0(p, false);
                }
            }
            for (int i4 = 0; i4 < this.F.c.o(); i4++) {
                View p2 = this.F.c.p(i4);
                if (p2 != null) {
                    xs1.A0(p2, false);
                }
            }
            this.P = true;
        }
    }

    public String toString() {
        return f0("");
    }

    public long u() {
        return this.r;
    }

    public e v() {
        return this.S;
    }

    public TimeInterpolator w() {
        return this.s;
    }

    public on1 x(View view, boolean z) {
        mn1 mn1Var = this.G;
        if (mn1Var != null) {
            return mn1Var.x(view, z);
        }
        ArrayList<on1> arrayList = z ? this.I : this.J;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            on1 on1Var = arrayList.get(i2);
            if (on1Var == null) {
                return null;
            }
            if (on1Var.b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i >= 0) {
            return (z ? this.J : this.I).get(i);
        }
        return null;
    }

    public String y() {
        return this.p;
    }

    public aw0 z() {
        return this.U;
    }
}
