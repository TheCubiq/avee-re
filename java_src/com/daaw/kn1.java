package com.daaw;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class kn1 {

    /* renamed from: a */
    public static in1 f16464a = new C3674y7();

    /* renamed from: b */
    public static ThreadLocal<WeakReference<C1370g6<ViewGroup, ArrayList<in1>>>> f16465b = new ThreadLocal<>();

    /* renamed from: c */
    public static ArrayList<ViewGroup> f16466c = new ArrayList<>();

    /* renamed from: com.daaw.kn1$a */
    /* loaded from: classes.dex */
    public static class ViewTreeObserver$OnPreDrawListenerC1960a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: p */
        public in1 f16467p;

        /* renamed from: q */
        public ViewGroup f16468q;

        /* renamed from: com.daaw.kn1$a$a */
        /* loaded from: classes.dex */
        public class C1961a extends jn1 {

            /* renamed from: a */
            public final /* synthetic */ C1370g6 f16469a;

            public C1961a(C1370g6 c1370g6) {
                this.f16469a = c1370g6;
            }

            @Override // com.daaw.in1.InterfaceC1729f
            /* renamed from: a */
            public void mo9244a(in1 in1Var) {
                ((ArrayList) this.f16469a.get(ViewTreeObserver$OnPreDrawListenerC1960a.this.f16468q)).remove(in1Var);
                in1Var.mo15921T(this);
            }
        }

        public ViewTreeObserver$OnPreDrawListenerC1960a(in1 in1Var, ViewGroup viewGroup) {
            this.f16467p = in1Var;
            this.f16468q = viewGroup;
        }

        /* renamed from: a */
        public final void m17642a() {
            this.f16468q.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f16468q.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            m17642a();
            if (kn1.f16466c.remove(this.f16468q)) {
                C1370g6<ViewGroup, ArrayList<in1>> m17645b = kn1.m17645b();
                ArrayList<in1> arrayList = m17645b.get(this.f16468q);
                ArrayList arrayList2 = null;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    m17645b.put(this.f16468q, arrayList);
                } else if (arrayList.size() > 0) {
                    arrayList2 = new ArrayList(arrayList);
                }
                arrayList.add(this.f16467p);
                this.f16467p.mo15915a(new C1961a(m17645b));
                this.f16467p.m19601n(this.f16468q, false);
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((in1) it.next()).mo15919V(this.f16468q);
                    }
                }
                this.f16467p.m19609S(this.f16468q);
                return true;
            }
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            m17642a();
            kn1.f16466c.remove(this.f16468q);
            ArrayList<in1> arrayList = kn1.m17645b().get(this.f16468q);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<in1> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo15919V(this.f16468q);
                }
            }
            this.f16467p.m19600o(true);
        }
    }

    /* renamed from: a */
    public static void m17646a(ViewGroup viewGroup, in1 in1Var) {
        if (f16466c.contains(viewGroup) || !xs1.m4742V(viewGroup)) {
            return;
        }
        f16466c.add(viewGroup);
        if (in1Var == null) {
            in1Var = f16464a;
        }
        in1 clone = in1Var.clone();
        m17643d(viewGroup, clone);
        p81.m13593c(viewGroup, null);
        m17644c(viewGroup, clone);
    }

    /* renamed from: b */
    public static C1370g6<ViewGroup, ArrayList<in1>> m17645b() {
        C1370g6<ViewGroup, ArrayList<in1>> c1370g6;
        WeakReference<C1370g6<ViewGroup, ArrayList<in1>>> weakReference = f16465b.get();
        if (weakReference == null || (c1370g6 = weakReference.get()) == null) {
            C1370g6<ViewGroup, ArrayList<in1>> c1370g62 = new C1370g6<>();
            f16465b.set(new WeakReference<>(c1370g62));
            return c1370g62;
        }
        return c1370g6;
    }

    /* renamed from: c */
    public static void m17644c(ViewGroup viewGroup, in1 in1Var) {
        if (in1Var == null || viewGroup == null) {
            return;
        }
        ViewTreeObserver$OnPreDrawListenerC1960a viewTreeObserver$OnPreDrawListenerC1960a = new ViewTreeObserver$OnPreDrawListenerC1960a(in1Var, viewGroup);
        viewGroup.addOnAttachStateChangeListener(viewTreeObserver$OnPreDrawListenerC1960a);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC1960a);
    }

    /* renamed from: d */
    public static void m17643d(ViewGroup viewGroup, in1 in1Var) {
        ArrayList<in1> arrayList = m17645b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<in1> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo15922R(viewGroup);
            }
        }
        if (in1Var != null) {
            in1Var.m19601n(viewGroup, true);
        }
        p81 m13594b = p81.m13594b(viewGroup);
        if (m13594b != null) {
            m13594b.m13595a();
        }
    }
}
