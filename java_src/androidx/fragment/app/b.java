package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.c;
import androidx.fragment.app.l;
import com.daaw.a40;
import com.daaw.bt1;
import com.daaw.g6;
import com.daaw.nu0;
import com.daaw.ty0;
import com.daaw.wd;
import com.daaw.xs1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class b extends androidx.fragment.app.l {

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[l.e.c.values().length];
            a = iArr;
            try {
                iArr[l.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[l.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[l.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[l.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0017b implements Runnable {
        public final /* synthetic */ List p;
        public final /* synthetic */ l.e q;

        public RunnableC0017b(List list, l.e eVar) {
            this.p = list;
            this.q = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.p.contains(this.q)) {
                this.p.remove(this.q);
                b.this.s(this.q);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ View b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ l.e d;
        public final /* synthetic */ k e;

        public c(ViewGroup viewGroup, View view, boolean z, l.e eVar, k kVar) {
            this.a = viewGroup;
            this.b = view;
            this.c = z;
            this.d = eVar;
            this.e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.b);
            if (this.c) {
                this.d.e().a(this.b);
            }
            this.e.a();
        }
    }

    /* loaded from: classes.dex */
    public class d implements wd.b {
        public final /* synthetic */ Animator a;

        public d(Animator animator) {
            this.a = animator;
        }

        @Override // com.daaw.wd.b
        public void a() {
            this.a.end();
        }
    }

    /* loaded from: classes.dex */
    public class e implements Animation.AnimationListener {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ View b;
        public final /* synthetic */ k c;

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.a.endViewTransition(eVar.b);
                e.this.c.a();
            }
        }

        public e(ViewGroup viewGroup, View view, k kVar) {
            this.a = viewGroup;
            this.b = view;
            this.c = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes.dex */
    public class f implements wd.b {
        public final /* synthetic */ View a;
        public final /* synthetic */ ViewGroup b;
        public final /* synthetic */ k c;

        public f(View view, ViewGroup viewGroup, k kVar) {
            this.a = view;
            this.b = viewGroup;
            this.c = kVar;
        }

        @Override // com.daaw.wd.b
        public void a() {
            this.a.clearAnimation();
            this.b.endViewTransition(this.a);
            this.c.a();
        }
    }

    /* loaded from: classes.dex */
    public class g implements Runnable {
        public final /* synthetic */ l.e p;
        public final /* synthetic */ l.e q;
        public final /* synthetic */ boolean r;
        public final /* synthetic */ g6 s;

        public g(l.e eVar, l.e eVar2, boolean z, g6 g6Var) {
            this.p = eVar;
            this.q = eVar2;
            this.r = z;
            this.s = g6Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.fragment.app.k.f(this.p.f(), this.q.f(), this.r, this.s, false);
        }
    }

    /* loaded from: classes.dex */
    public class h implements Runnable {
        public final /* synthetic */ a40 p;
        public final /* synthetic */ View q;
        public final /* synthetic */ Rect r;

        public h(a40 a40Var, View view, Rect rect) {
            this.p = a40Var;
            this.q = view;
            this.r = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.p.k(this.q, this.r);
        }
    }

    /* loaded from: classes.dex */
    public class i implements Runnable {
        public final /* synthetic */ ArrayList p;

        public i(ArrayList arrayList) {
            this.p = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.fragment.app.k.A(this.p, 4);
        }
    }

    /* loaded from: classes.dex */
    public class j implements Runnable {
        public final /* synthetic */ m p;

        public j(m mVar) {
            this.p = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.p.a();
        }
    }

    /* loaded from: classes.dex */
    public static class k extends l {
        public boolean c;
        public boolean d;
        public c.d e;

        public k(l.e eVar, wd wdVar, boolean z) {
            super(eVar, wdVar);
            this.d = false;
            this.c = z;
        }

        public c.d e(Context context) {
            if (this.d) {
                return this.e;
            }
            c.d c = androidx.fragment.app.c.c(context, b().f(), b().e() == l.e.c.VISIBLE, this.c);
            this.e = c;
            this.d = true;
            return c;
        }
    }

    /* loaded from: classes.dex */
    public static class l {
        public final l.e a;
        public final wd b;

        public l(l.e eVar, wd wdVar) {
            this.a = eVar;
            this.b = wdVar;
        }

        public void a() {
            this.a.d(this.b);
        }

        public l.e b() {
            return this.a;
        }

        public wd c() {
            return this.b;
        }

        public boolean d() {
            l.e.c cVar;
            l.e.c c = l.e.c.c(this.a.f().W);
            l.e.c e = this.a.e();
            return c == e || !(c == (cVar = l.e.c.VISIBLE) || e == cVar);
        }
    }

    /* loaded from: classes.dex */
    public static class m extends l {
        public final Object c;
        public final boolean d;
        public final Object e;

        public m(l.e eVar, wd wdVar, boolean z, boolean z2) {
            super(eVar, wdVar);
            boolean z3;
            Object obj;
            if (eVar.e() == l.e.c.VISIBLE) {
                Fragment f = eVar.f();
                this.c = z ? f.M() : f.w();
                Fragment f2 = eVar.f();
                z3 = z ? f2.p() : f2.o();
            } else {
                Fragment f3 = eVar.f();
                this.c = z ? f3.O() : f3.z();
                z3 = true;
            }
            this.d = z3;
            if (z2) {
                Fragment f4 = eVar.f();
                obj = z ? f4.Q() : f4.P();
            } else {
                obj = null;
            }
            this.e = obj;
        }

        public a40 e() {
            a40 f = f(this.c);
            a40 f2 = f(this.e);
            if (f == null || f2 == null || f == f2) {
                return f != null ? f : f2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.c + " which uses a different Transition  type than its shared element transition " + this.e);
        }

        public final a40 f(Object obj) {
            if (obj == null) {
                return null;
            }
            a40 a40Var = androidx.fragment.app.k.b;
            if (a40Var == null || !a40Var.e(obj)) {
                a40 a40Var2 = androidx.fragment.app.k.c;
                if (a40Var2 == null || !a40Var2.e(obj)) {
                    throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
                }
                return a40Var2;
            }
            return a40Var;
        }

        public Object g() {
            return this.e;
        }

        public Object h() {
            return this.c;
        }

        public boolean i() {
            return this.e != null;
        }

        public boolean j() {
            return this.d;
        }
    }

    public b(ViewGroup viewGroup) {
        super(viewGroup);
    }

    @Override // androidx.fragment.app.l
    public void f(List<l.e> list, boolean z) {
        l.e eVar = null;
        l.e eVar2 = null;
        for (l.e eVar3 : list) {
            l.e.c c2 = l.e.c.c(eVar3.f().W);
            int i2 = a.a[eVar3.e().ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                if (c2 == l.e.c.VISIBLE && eVar == null) {
                    eVar = eVar3;
                }
            } else if (i2 == 4 && c2 != l.e.c.VISIBLE) {
                eVar2 = eVar3;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<l.e> arrayList3 = new ArrayList(list);
        for (l.e eVar4 : list) {
            wd wdVar = new wd();
            eVar4.j(wdVar);
            arrayList.add(new k(eVar4, wdVar, z));
            wd wdVar2 = new wd();
            eVar4.j(wdVar2);
            boolean z2 = false;
            if (z) {
                if (eVar4 != eVar) {
                    arrayList2.add(new m(eVar4, wdVar2, z, z2));
                    eVar4.a(new RunnableC0017b(arrayList3, eVar4));
                }
                z2 = true;
                arrayList2.add(new m(eVar4, wdVar2, z, z2));
                eVar4.a(new RunnableC0017b(arrayList3, eVar4));
            } else {
                if (eVar4 != eVar2) {
                    arrayList2.add(new m(eVar4, wdVar2, z, z2));
                    eVar4.a(new RunnableC0017b(arrayList3, eVar4));
                }
                z2 = true;
                arrayList2.add(new m(eVar4, wdVar2, z, z2));
                eVar4.a(new RunnableC0017b(arrayList3, eVar4));
            }
        }
        Map<l.e, Boolean> x = x(arrayList2, arrayList3, z, eVar, eVar2);
        w(arrayList, arrayList3, x.containsValue(Boolean.TRUE), x);
        for (l.e eVar5 : arrayList3) {
            s(eVar5);
        }
        arrayList3.clear();
    }

    public void s(l.e eVar) {
        eVar.e().a(eVar.f().W);
    }

    public void t(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (bt1.a(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                t(arrayList, childAt);
            }
        }
    }

    public void u(Map<String, View> map, View view) {
        String N = xs1.N(view);
        if (N != null) {
            map.put(N, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    public void v(g6<String, View> g6Var, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = g6Var.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(xs1.N(it.next().getValue()))) {
                it.remove();
            }
        }
    }

    public final void w(List<k> list, List<l.e> list2, boolean z, Map<l.e, Boolean> map) {
        StringBuilder sb;
        String str;
        c.d e2;
        ViewGroup m2 = m();
        Context context = m2.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (k kVar : list) {
            if (kVar.d() || (e2 = kVar.e(context)) == null) {
                kVar.a();
            } else {
                Animator animator = e2.b;
                if (animator == null) {
                    arrayList.add(kVar);
                } else {
                    l.e b = kVar.b();
                    Fragment f2 = b.f();
                    if (Boolean.TRUE.equals(map.get(b))) {
                        if (FragmentManager.E0(2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Ignoring Animator set on ");
                            sb2.append(f2);
                            sb2.append(" as this Fragment was involved in a Transition.");
                        }
                        kVar.a();
                    } else {
                        boolean z3 = b.e() == l.e.c.GONE;
                        if (z3) {
                            list2.remove(b);
                        }
                        View view = f2.W;
                        m2.startViewTransition(view);
                        animator.addListener(new c(m2, view, z3, b, kVar));
                        animator.setTarget(view);
                        animator.start();
                        kVar.c().c(new d(animator));
                        z2 = true;
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVar2 = (k) it.next();
            l.e b2 = kVar2.b();
            Fragment f3 = b2.f();
            if (z) {
                if (FragmentManager.E0(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(f3);
                    str = " as Animations cannot run alongside Transitions.";
                    sb.append(str);
                }
                kVar2.a();
            } else if (z2) {
                if (FragmentManager.E0(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(f3);
                    str = " as Animations cannot run alongside Animators.";
                    sb.append(str);
                }
                kVar2.a();
            } else {
                View view2 = f3.W;
                Animation animation = (Animation) ty0.f(((c.d) ty0.f(kVar2.e(context))).a);
                if (b2.e() != l.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar2.a();
                } else {
                    m2.startViewTransition(view2);
                    c.e eVar = new c.e(animation, m2, view2);
                    eVar.setAnimationListener(new e(m2, view2, kVar2));
                    view2.startAnimation(eVar);
                }
                kVar2.c().c(new f(view2, m2, kVar2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<l.e, Boolean> x(List<m> list, List<l.e> list2, boolean z, l.e eVar, l.e eVar2) {
        View view;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        l.e eVar3;
        l.e eVar4;
        View view2;
        Object n;
        g6 g6Var;
        ArrayList<View> arrayList3;
        l.e eVar5;
        ArrayList<View> arrayList4;
        Rect rect;
        View view3;
        a40 a40Var;
        l.e eVar6;
        View view4;
        boolean z2 = z;
        l.e eVar7 = eVar;
        l.e eVar8 = eVar2;
        HashMap hashMap = new HashMap();
        a40 a40Var2 = null;
        for (m mVar : list) {
            if (!mVar.d()) {
                a40 e2 = mVar.e();
                if (a40Var2 == null) {
                    a40Var2 = e2;
                } else if (e2 != null && a40Var2 != e2) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (a40Var2 == null) {
            for (m mVar2 : list) {
                hashMap.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
            return hashMap;
        }
        View view5 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList5 = new ArrayList<>();
        ArrayList<View> arrayList6 = new ArrayList<>();
        g6 g6Var2 = new g6();
        Object obj3 = null;
        View view6 = null;
        boolean z3 = false;
        for (m mVar3 : list) {
            if (!mVar3.i() || eVar7 == null || eVar8 == null) {
                g6Var = g6Var2;
                arrayList3 = arrayList6;
                eVar5 = eVar7;
                arrayList4 = arrayList5;
                rect = rect2;
                view3 = view5;
                a40Var = a40Var2;
                eVar6 = eVar8;
                view6 = view6;
            } else {
                Object B = a40Var2.B(a40Var2.g(mVar3.g()));
                ArrayList<String> R = eVar2.f().R();
                ArrayList<String> R2 = eVar.f().R();
                ArrayList<String> S = eVar.f().S();
                View view7 = view6;
                int i2 = 0;
                while (i2 < S.size()) {
                    int indexOf = R.indexOf(S.get(i2));
                    ArrayList<String> arrayList7 = S;
                    if (indexOf != -1) {
                        R.set(indexOf, R2.get(i2));
                    }
                    i2++;
                    S = arrayList7;
                }
                ArrayList<String> S2 = eVar2.f().S();
                Fragment f2 = eVar.f();
                if (z2) {
                    f2.x();
                    eVar2.f().A();
                } else {
                    f2.A();
                    eVar2.f().x();
                }
                int i3 = 0;
                for (int size = R.size(); i3 < size; size = size) {
                    g6Var2.put(R.get(i3), S2.get(i3));
                    i3++;
                }
                g6<String, View> g6Var3 = new g6<>();
                u(g6Var3, eVar.f().W);
                g6Var3.o(R);
                g6Var2.o(g6Var3.keySet());
                g6<String, View> g6Var4 = new g6<>();
                u(g6Var4, eVar2.f().W);
                g6Var4.o(S2);
                g6Var4.o(g6Var2.values());
                androidx.fragment.app.k.x(g6Var2, g6Var4);
                v(g6Var3, g6Var2.keySet());
                v(g6Var4, g6Var2.values());
                if (g6Var2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    g6Var = g6Var2;
                    arrayList3 = arrayList6;
                    eVar5 = eVar7;
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    a40Var = a40Var2;
                    view6 = view7;
                    obj3 = null;
                    eVar6 = eVar8;
                } else {
                    androidx.fragment.app.k.f(eVar2.f(), eVar.f(), z2, g6Var3, true);
                    g6Var = g6Var2;
                    ArrayList<View> arrayList8 = arrayList6;
                    nu0.a(m(), new g(eVar2, eVar, z, g6Var4));
                    arrayList5.addAll(g6Var3.values());
                    if (R.isEmpty()) {
                        view6 = view7;
                    } else {
                        View view8 = g6Var3.get(R.get(0));
                        a40Var2.v(B, view8);
                        view6 = view8;
                    }
                    arrayList3 = arrayList8;
                    arrayList3.addAll(g6Var4.values());
                    if (!S2.isEmpty() && (view4 = g6Var4.get(S2.get(0))) != null) {
                        nu0.a(m(), new h(a40Var2, view4, rect2));
                        z3 = true;
                    }
                    a40Var2.z(B, view5, arrayList5);
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    a40Var = a40Var2;
                    a40Var2.t(B, null, null, null, null, B, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar5 = eVar;
                    hashMap.put(eVar5, bool);
                    eVar6 = eVar2;
                    hashMap.put(eVar6, bool);
                    obj3 = B;
                }
            }
            eVar7 = eVar5;
            arrayList5 = arrayList4;
            rect2 = rect;
            view5 = view3;
            eVar8 = eVar6;
            g6Var2 = g6Var;
            z2 = z;
            arrayList6 = arrayList3;
            a40Var2 = a40Var;
        }
        View view9 = view6;
        g6 g6Var5 = g6Var2;
        Collection<?> collection = arrayList6;
        l.e eVar9 = eVar7;
        Collection<?> collection2 = arrayList5;
        Rect rect3 = rect2;
        View view10 = view5;
        a40 a40Var3 = a40Var2;
        l.e eVar10 = eVar8;
        ArrayList arrayList9 = new ArrayList();
        Object obj4 = null;
        Object obj5 = null;
        for (m mVar4 : list) {
            if (mVar4.d()) {
                hashMap.put(mVar4.b(), Boolean.FALSE);
                mVar4.a();
            } else {
                Object g2 = a40Var3.g(mVar4.h());
                l.e b = mVar4.b();
                boolean z4 = obj3 != null && (b == eVar9 || b == eVar10);
                if (g2 == null) {
                    if (!z4) {
                        hashMap.put(b, Boolean.FALSE);
                        mVar4.a();
                    }
                    arrayList2 = collection;
                    arrayList = collection2;
                    view = view10;
                    n = obj4;
                    eVar3 = eVar10;
                    view2 = view9;
                } else {
                    ArrayList<View> arrayList10 = new ArrayList<>();
                    Object obj6 = obj4;
                    t(arrayList10, b.f().W);
                    if (z4) {
                        if (b == eVar9) {
                            arrayList10.removeAll(collection2);
                        } else {
                            arrayList10.removeAll(collection);
                        }
                    }
                    if (arrayList10.isEmpty()) {
                        a40Var3.a(g2, view10);
                        arrayList2 = collection;
                        arrayList = collection2;
                        view = view10;
                        eVar4 = b;
                        obj2 = obj5;
                        eVar3 = eVar10;
                        obj = obj6;
                    } else {
                        a40Var3.b(g2, arrayList10);
                        view = view10;
                        obj = obj6;
                        arrayList = collection2;
                        obj2 = obj5;
                        arrayList2 = collection;
                        eVar3 = eVar10;
                        a40Var3.t(g2, g2, arrayList10, null, null, null, null);
                        if (b.e() == l.e.c.GONE) {
                            eVar4 = b;
                            list2.remove(eVar4);
                            ArrayList<View> arrayList11 = new ArrayList<>(arrayList10);
                            arrayList11.remove(eVar4.f().W);
                            a40Var3.r(g2, eVar4.f().W, arrayList11);
                            nu0.a(m(), new i(arrayList10));
                        } else {
                            eVar4 = b;
                        }
                    }
                    if (eVar4.e() == l.e.c.VISIBLE) {
                        arrayList9.addAll(arrayList10);
                        if (z3) {
                            a40Var3.u(g2, rect3);
                        }
                        view2 = view9;
                    } else {
                        view2 = view9;
                        a40Var3.v(g2, view2);
                    }
                    hashMap.put(eVar4, Boolean.TRUE);
                    if (mVar4.j()) {
                        obj5 = a40Var3.n(obj2, g2, null);
                        n = obj;
                    } else {
                        n = a40Var3.n(obj, g2, null);
                        obj5 = obj2;
                    }
                }
                eVar10 = eVar3;
                obj4 = n;
                view9 = view2;
                view10 = view;
                collection2 = arrayList;
                collection = arrayList2;
            }
        }
        ArrayList<View> arrayList12 = collection;
        ArrayList<View> arrayList13 = collection2;
        l.e eVar11 = eVar10;
        Object m2 = a40Var3.m(obj5, obj4, obj3);
        for (m mVar5 : list) {
            if (!mVar5.d()) {
                Object h2 = mVar5.h();
                l.e b2 = mVar5.b();
                boolean z5 = obj3 != null && (b2 == eVar9 || b2 == eVar11);
                if (h2 != null || z5) {
                    if (xs1.V(m())) {
                        a40Var3.w(mVar5.b().f(), m2, mVar5.c(), new j(mVar5));
                    } else {
                        if (FragmentManager.E0(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: Container ");
                            sb.append(m());
                            sb.append(" has not been laid out. Completing operation ");
                            sb.append(b2);
                        }
                        mVar5.a();
                    }
                }
            }
        }
        if (xs1.V(m())) {
            androidx.fragment.app.k.A(arrayList9, 4);
            ArrayList<String> o = a40Var3.o(arrayList12);
            a40Var3.c(m(), m2);
            a40Var3.y(m(), arrayList13, arrayList12, o, g6Var5);
            androidx.fragment.app.k.A(arrayList9, 0);
            a40Var3.A(obj3, arrayList13, arrayList12);
            return hashMap;
        }
        return hashMap;
    }
}
