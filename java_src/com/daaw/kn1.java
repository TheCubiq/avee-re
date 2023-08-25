package com.daaw;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class kn1 {
    public static in1 a = new y7();
    public static ThreadLocal<WeakReference<g6<ViewGroup, ArrayList<in1>>>> b = new ThreadLocal<>();
    public static ArrayList<ViewGroup> c = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        public in1 p;
        public ViewGroup q;

        /* renamed from: com.daaw.kn1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0060a extends jn1 {
            public final /* synthetic */ g6 a;

            public C0060a(g6 g6Var) {
                this.a = g6Var;
            }

            @Override // com.daaw.in1.f
            public void a(in1 in1Var) {
                ((ArrayList) this.a.get(a.this.q)).remove(in1Var);
                in1Var.T(this);
            }
        }

        public a(in1 in1Var, ViewGroup viewGroup) {
            this.p = in1Var;
            this.q = viewGroup;
        }

        public final void a() {
            this.q.getViewTreeObserver().removeOnPreDrawListener(this);
            this.q.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (kn1.c.remove(this.q)) {
                g6<ViewGroup, ArrayList<in1>> b = kn1.b();
                ArrayList<in1> arrayList = b.get(this.q);
                ArrayList arrayList2 = null;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    b.put(this.q, arrayList);
                } else if (arrayList.size() > 0) {
                    arrayList2 = new ArrayList(arrayList);
                }
                arrayList.add(this.p);
                this.p.a(new C0060a(b));
                this.p.n(this.q, false);
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((in1) it.next()).V(this.q);
                    }
                }
                this.p.S(this.q);
                return true;
            }
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            kn1.c.remove(this.q);
            ArrayList<in1> arrayList = kn1.b().get(this.q);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<in1> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().V(this.q);
                }
            }
            this.p.o(true);
        }
    }

    public static void a(ViewGroup viewGroup, in1 in1Var) {
        if (c.contains(viewGroup) || !xs1.V(viewGroup)) {
            return;
        }
        c.add(viewGroup);
        if (in1Var == null) {
            in1Var = a;
        }
        in1 clone = in1Var.clone();
        d(viewGroup, clone);
        p81.c(viewGroup, null);
        c(viewGroup, clone);
    }

    public static g6<ViewGroup, ArrayList<in1>> b() {
        g6<ViewGroup, ArrayList<in1>> g6Var;
        WeakReference<g6<ViewGroup, ArrayList<in1>>> weakReference = b.get();
        if (weakReference == null || (g6Var = weakReference.get()) == null) {
            g6<ViewGroup, ArrayList<in1>> g6Var2 = new g6<>();
            b.set(new WeakReference<>(g6Var2));
            return g6Var2;
        }
        return g6Var;
    }

    public static void c(ViewGroup viewGroup, in1 in1Var) {
        if (in1Var == null || viewGroup == null) {
            return;
        }
        a aVar = new a(in1Var, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    public static void d(ViewGroup viewGroup, in1 in1Var) {
        ArrayList<in1> arrayList = b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<in1> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().R(viewGroup);
            }
        }
        if (in1Var != null) {
            in1Var.n(viewGroup, true);
        }
        p81 b2 = p81.b(viewGroup);
        if (b2 != null) {
            b2.a();
        }
    }
}
