package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.xs1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: androidx.recyclerview.widget.c */
/* loaded from: classes.dex */
public class C0422c extends AbstractC0454m {

    /* renamed from: s */
    public static TimeInterpolator f2129s;

    /* renamed from: h */
    public ArrayList<RecyclerView.AbstractC0376c0> f2130h = new ArrayList<>();

    /* renamed from: i */
    public ArrayList<RecyclerView.AbstractC0376c0> f2131i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<C0432j> f2132j = new ArrayList<>();

    /* renamed from: k */
    public ArrayList<C0431i> f2133k = new ArrayList<>();

    /* renamed from: l */
    public ArrayList<ArrayList<RecyclerView.AbstractC0376c0>> f2134l = new ArrayList<>();

    /* renamed from: m */
    public ArrayList<ArrayList<C0432j>> f2135m = new ArrayList<>();

    /* renamed from: n */
    public ArrayList<ArrayList<C0431i>> f2136n = new ArrayList<>();

    /* renamed from: o */
    public ArrayList<RecyclerView.AbstractC0376c0> f2137o = new ArrayList<>();

    /* renamed from: p */
    public ArrayList<RecyclerView.AbstractC0376c0> f2138p = new ArrayList<>();

    /* renamed from: q */
    public ArrayList<RecyclerView.AbstractC0376c0> f2139q = new ArrayList<>();

    /* renamed from: r */
    public ArrayList<RecyclerView.AbstractC0376c0> f2140r = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.c$a */
    /* loaded from: classes.dex */
    public class RunnableC0423a implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ ArrayList f2141p;

        public RunnableC0423a(ArrayList arrayList) {
            this.f2141p = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f2141p.iterator();
            while (it.hasNext()) {
                C0432j c0432j = (C0432j) it.next();
                C0422c.this.m28271S(c0432j.f2175a, c0432j.f2176b, c0432j.f2177c, c0432j.f2178d, c0432j.f2179e);
            }
            this.f2141p.clear();
            C0422c.this.f2135m.remove(this.f2141p);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$b */
    /* loaded from: classes.dex */
    public class RunnableC0424b implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ ArrayList f2143p;

        public RunnableC0424b(ArrayList arrayList) {
            this.f2143p = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f2143p.iterator();
            while (it.hasNext()) {
                C0422c.this.m28272R((C0431i) it.next());
            }
            this.f2143p.clear();
            C0422c.this.f2136n.remove(this.f2143p);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c */
    /* loaded from: classes.dex */
    public class RunnableC0425c implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ ArrayList f2145p;

        public RunnableC0425c(ArrayList arrayList) {
            this.f2145p = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f2145p.iterator();
            while (it.hasNext()) {
                C0422c.this.m28273Q((RecyclerView.AbstractC0376c0) it.next());
            }
            this.f2145p.clear();
            C0422c.this.f2134l.remove(this.f2145p);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$d */
    /* loaded from: classes.dex */
    public class C0426d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.AbstractC0376c0 f2147a;

        /* renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f2148b;

        /* renamed from: c */
        public final /* synthetic */ View f2149c;

        public C0426d(RecyclerView.AbstractC0376c0 abstractC0376c0, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2147a = abstractC0376c0;
            this.f2148b = viewPropertyAnimator;
            this.f2149c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2148b.setListener(null);
            this.f2149c.setAlpha(1.0f);
            C0422c.this.m28158G(this.f2147a);
            C0422c.this.f2139q.remove(this.f2147a);
            C0422c.this.m28268V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0422c.this.m28157H(this.f2147a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$e */
    /* loaded from: classes.dex */
    public class C0427e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.AbstractC0376c0 f2151a;

        /* renamed from: b */
        public final /* synthetic */ View f2152b;

        /* renamed from: c */
        public final /* synthetic */ ViewPropertyAnimator f2153c;

        public C0427e(RecyclerView.AbstractC0376c0 abstractC0376c0, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f2151a = abstractC0376c0;
            this.f2152b = view;
            this.f2153c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2152b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2153c.setListener(null);
            C0422c.this.m28164A(this.f2151a);
            C0422c.this.f2137o.remove(this.f2151a);
            C0422c.this.m28268V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0422c.this.m28163B(this.f2151a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$f */
    /* loaded from: classes.dex */
    public class C0428f extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.AbstractC0376c0 f2155a;

        /* renamed from: b */
        public final /* synthetic */ int f2156b;

        /* renamed from: c */
        public final /* synthetic */ View f2157c;

        /* renamed from: d */
        public final /* synthetic */ int f2158d;

        /* renamed from: e */
        public final /* synthetic */ ViewPropertyAnimator f2159e;

        public C0428f(RecyclerView.AbstractC0376c0 abstractC0376c0, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f2155a = abstractC0376c0;
            this.f2156b = i;
            this.f2157c = view;
            this.f2158d = i2;
            this.f2159e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f2156b != 0) {
                this.f2157c.setTranslationX(0.0f);
            }
            if (this.f2158d != 0) {
                this.f2157c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2159e.setListener(null);
            C0422c.this.m28160E(this.f2155a);
            C0422c.this.f2138p.remove(this.f2155a);
            C0422c.this.m28268V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0422c.this.m28159F(this.f2155a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$g */
    /* loaded from: classes.dex */
    public class C0429g extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C0431i f2161a;

        /* renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f2162b;

        /* renamed from: c */
        public final /* synthetic */ View f2163c;

        public C0429g(C0431i c0431i, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2161a = c0431i;
            this.f2162b = viewPropertyAnimator;
            this.f2163c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2162b.setListener(null);
            this.f2163c.setAlpha(1.0f);
            this.f2163c.setTranslationX(0.0f);
            this.f2163c.setTranslationY(0.0f);
            C0422c.this.m28162C(this.f2161a.f2169a, true);
            C0422c.this.f2140r.remove(this.f2161a.f2169a);
            C0422c.this.m28268V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0422c.this.m28161D(this.f2161a.f2169a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$h */
    /* loaded from: classes.dex */
    public class C0430h extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C0431i f2165a;

        /* renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f2166b;

        /* renamed from: c */
        public final /* synthetic */ View f2167c;

        public C0430h(C0431i c0431i, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2165a = c0431i;
            this.f2166b = viewPropertyAnimator;
            this.f2167c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2166b.setListener(null);
            this.f2167c.setAlpha(1.0f);
            this.f2167c.setTranslationX(0.0f);
            this.f2167c.setTranslationY(0.0f);
            C0422c.this.m28162C(this.f2165a.f2170b, false);
            C0422c.this.f2140r.remove(this.f2165a.f2170b);
            C0422c.this.m28268V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0422c.this.m28161D(this.f2165a.f2170b, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$i */
    /* loaded from: classes.dex */
    public static class C0431i {

        /* renamed from: a */
        public RecyclerView.AbstractC0376c0 f2169a;

        /* renamed from: b */
        public RecyclerView.AbstractC0376c0 f2170b;

        /* renamed from: c */
        public int f2171c;

        /* renamed from: d */
        public int f2172d;

        /* renamed from: e */
        public int f2173e;

        /* renamed from: f */
        public int f2174f;

        public C0431i(RecyclerView.AbstractC0376c0 abstractC0376c0, RecyclerView.AbstractC0376c0 abstractC0376c02) {
            this.f2169a = abstractC0376c0;
            this.f2170b = abstractC0376c02;
        }

        public C0431i(RecyclerView.AbstractC0376c0 abstractC0376c0, RecyclerView.AbstractC0376c0 abstractC0376c02, int i, int i2, int i3, int i4) {
            this(abstractC0376c0, abstractC0376c02);
            this.f2171c = i;
            this.f2172d = i2;
            this.f2173e = i3;
            this.f2174f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f2169a + ", newHolder=" + this.f2170b + ", fromX=" + this.f2171c + ", fromY=" + this.f2172d + ", toX=" + this.f2173e + ", toY=" + this.f2174f + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$j */
    /* loaded from: classes.dex */
    public static class C0432j {

        /* renamed from: a */
        public RecyclerView.AbstractC0376c0 f2175a;

        /* renamed from: b */
        public int f2176b;

        /* renamed from: c */
        public int f2177c;

        /* renamed from: d */
        public int f2178d;

        /* renamed from: e */
        public int f2179e;

        public C0432j(RecyclerView.AbstractC0376c0 abstractC0376c0, int i, int i2, int i3, int i4) {
            this.f2175a = abstractC0376c0;
            this.f2176b = i;
            this.f2177c = i2;
            this.f2178d = i3;
            this.f2179e = i4;
        }
    }

    /* renamed from: Q */
    public void m28273Q(RecyclerView.AbstractC0376c0 abstractC0376c0) {
        View view = abstractC0376c0.f1947a;
        ViewPropertyAnimator animate = view.animate();
        this.f2137o.add(abstractC0376c0);
        animate.alpha(1.0f).setDuration(m28693l()).setListener(new C0427e(abstractC0376c0, view, animate)).start();
    }

    /* renamed from: R */
    public void m28272R(C0431i c0431i) {
        RecyclerView.AbstractC0376c0 abstractC0376c0 = c0431i.f2169a;
        View view = abstractC0376c0 == null ? null : abstractC0376c0.f1947a;
        RecyclerView.AbstractC0376c0 abstractC0376c02 = c0431i.f2170b;
        View view2 = abstractC0376c02 != null ? abstractC0376c02.f1947a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m28692m());
            this.f2140r.add(c0431i.f2169a);
            duration.translationX(c0431i.f2173e - c0431i.f2171c);
            duration.translationY(c0431i.f2174f - c0431i.f2172d);
            duration.alpha(0.0f).setListener(new C0429g(c0431i, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f2140r.add(c0431i.f2170b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m28692m()).alpha(1.0f).setListener(new C0430h(c0431i, animate, view2)).start();
        }
    }

    /* renamed from: S */
    public void m28271S(RecyclerView.AbstractC0376c0 abstractC0376c0, int i, int i2, int i3, int i4) {
        View view = abstractC0376c0.f1947a;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f2138p.add(abstractC0376c0);
        animate.setDuration(m28691n()).setListener(new C0428f(abstractC0376c0, i5, view, i6, animate)).start();
    }

    /* renamed from: T */
    public final void m28270T(RecyclerView.AbstractC0376c0 abstractC0376c0) {
        View view = abstractC0376c0.f1947a;
        ViewPropertyAnimator animate = view.animate();
        this.f2139q.add(abstractC0376c0);
        animate.setDuration(m28690o()).alpha(0.0f).setListener(new C0426d(abstractC0376c0, animate, view)).start();
    }

    /* renamed from: U */
    public void m28269U(List<RecyclerView.AbstractC0376c0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f1947a.animate().cancel();
        }
    }

    /* renamed from: V */
    public void m28268V() {
        if (mo28260p()) {
            return;
        }
        m28694i();
    }

    /* renamed from: W */
    public final void m28267W(List<C0431i> list, RecyclerView.AbstractC0376c0 abstractC0376c0) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0431i c0431i = list.get(size);
            if (m28265Y(c0431i, abstractC0376c0) && c0431i.f2169a == null && c0431i.f2170b == null) {
                list.remove(c0431i);
            }
        }
    }

    /* renamed from: X */
    public final void m28266X(C0431i c0431i) {
        RecyclerView.AbstractC0376c0 abstractC0376c0 = c0431i.f2169a;
        if (abstractC0376c0 != null) {
            m28265Y(c0431i, abstractC0376c0);
        }
        RecyclerView.AbstractC0376c0 abstractC0376c02 = c0431i.f2170b;
        if (abstractC0376c02 != null) {
            m28265Y(c0431i, abstractC0376c02);
        }
    }

    /* renamed from: Y */
    public final boolean m28265Y(C0431i c0431i, RecyclerView.AbstractC0376c0 abstractC0376c0) {
        boolean z = false;
        if (c0431i.f2170b == abstractC0376c0) {
            c0431i.f2170b = null;
        } else if (c0431i.f2169a != abstractC0376c0) {
            return false;
        } else {
            c0431i.f2169a = null;
            z = true;
        }
        abstractC0376c0.f1947a.setAlpha(1.0f);
        abstractC0376c0.f1947a.setTranslationX(0.0f);
        abstractC0376c0.f1947a.setTranslationY(0.0f);
        m28162C(abstractC0376c0, z);
        return true;
    }

    /* renamed from: Z */
    public final void m28264Z(RecyclerView.AbstractC0376c0 abstractC0376c0) {
        if (f2129s == null) {
            f2129s = new ValueAnimator().getInterpolator();
        }
        abstractC0376c0.f1947a.animate().setInterpolator(f2129s);
        mo28262j(abstractC0376c0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0385l
    /* renamed from: g */
    public boolean mo28263g(RecyclerView.AbstractC0376c0 abstractC0376c0, List<Object> list) {
        return !list.isEmpty() || super.mo28263g(abstractC0376c0, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0385l
    /* renamed from: j */
    public void mo28262j(RecyclerView.AbstractC0376c0 abstractC0376c0) {
        View view = abstractC0376c0.f1947a;
        view.animate().cancel();
        int size = this.f2132j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f2132j.get(size).f2175a == abstractC0376c0) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m28160E(abstractC0376c0);
                this.f2132j.remove(size);
            }
        }
        m28267W(this.f2133k, abstractC0376c0);
        if (this.f2130h.remove(abstractC0376c0)) {
            view.setAlpha(1.0f);
            m28158G(abstractC0376c0);
        }
        if (this.f2131i.remove(abstractC0376c0)) {
            view.setAlpha(1.0f);
            m28164A(abstractC0376c0);
        }
        for (int size2 = this.f2136n.size() - 1; size2 >= 0; size2--) {
            ArrayList<C0431i> arrayList = this.f2136n.get(size2);
            m28267W(arrayList, abstractC0376c0);
            if (arrayList.isEmpty()) {
                this.f2136n.remove(size2);
            }
        }
        for (int size3 = this.f2135m.size() - 1; size3 >= 0; size3--) {
            ArrayList<C0432j> arrayList2 = this.f2135m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f2175a == abstractC0376c0) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m28160E(abstractC0376c0);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f2135m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f2134l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.AbstractC0376c0> arrayList3 = this.f2134l.get(size5);
            if (arrayList3.remove(abstractC0376c0)) {
                view.setAlpha(1.0f);
                m28164A(abstractC0376c0);
                if (arrayList3.isEmpty()) {
                    this.f2134l.remove(size5);
                }
            }
        }
        this.f2139q.remove(abstractC0376c0);
        this.f2137o.remove(abstractC0376c0);
        this.f2140r.remove(abstractC0376c0);
        this.f2138p.remove(abstractC0376c0);
        m28268V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0385l
    /* renamed from: k */
    public void mo28261k() {
        int size = this.f2132j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0432j c0432j = this.f2132j.get(size);
            View view = c0432j.f2175a.f1947a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m28160E(c0432j.f2175a);
            this.f2132j.remove(size);
        }
        for (int size2 = this.f2130h.size() - 1; size2 >= 0; size2--) {
            m28158G(this.f2130h.get(size2));
            this.f2130h.remove(size2);
        }
        int size3 = this.f2131i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC0376c0 abstractC0376c0 = this.f2131i.get(size3);
            abstractC0376c0.f1947a.setAlpha(1.0f);
            m28164A(abstractC0376c0);
            this.f2131i.remove(size3);
        }
        for (int size4 = this.f2133k.size() - 1; size4 >= 0; size4--) {
            m28266X(this.f2133k.get(size4));
        }
        this.f2133k.clear();
        if (mo28260p()) {
            for (int size5 = this.f2135m.size() - 1; size5 >= 0; size5--) {
                ArrayList<C0432j> arrayList = this.f2135m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C0432j c0432j2 = arrayList.get(size6);
                    View view2 = c0432j2.f2175a.f1947a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m28160E(c0432j2.f2175a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f2135m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f2134l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.AbstractC0376c0> arrayList2 = this.f2134l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.AbstractC0376c0 abstractC0376c02 = arrayList2.get(size8);
                    abstractC0376c02.f1947a.setAlpha(1.0f);
                    m28164A(abstractC0376c02);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f2134l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f2136n.size() - 1; size9 >= 0; size9--) {
                ArrayList<C0431i> arrayList3 = this.f2136n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m28266X(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f2136n.remove(arrayList3);
                    }
                }
            }
            m28269U(this.f2139q);
            m28269U(this.f2138p);
            m28269U(this.f2137o);
            m28269U(this.f2140r);
            m28694i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0385l
    /* renamed from: p */
    public boolean mo28260p() {
        return (this.f2131i.isEmpty() && this.f2133k.isEmpty() && this.f2132j.isEmpty() && this.f2130h.isEmpty() && this.f2138p.isEmpty() && this.f2139q.isEmpty() && this.f2137o.isEmpty() && this.f2140r.isEmpty() && this.f2135m.isEmpty() && this.f2134l.isEmpty() && this.f2136n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0385l
    /* renamed from: u */
    public void mo28259u() {
        boolean z = !this.f2130h.isEmpty();
        boolean z2 = !this.f2132j.isEmpty();
        boolean z3 = !this.f2133k.isEmpty();
        boolean z4 = !this.f2131i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.AbstractC0376c0> it = this.f2130h.iterator();
            while (it.hasNext()) {
                m28270T(it.next());
            }
            this.f2130h.clear();
            if (z2) {
                ArrayList<C0432j> arrayList = new ArrayList<>();
                arrayList.addAll(this.f2132j);
                this.f2135m.add(arrayList);
                this.f2132j.clear();
                RunnableC0423a runnableC0423a = new RunnableC0423a(arrayList);
                if (z) {
                    xs1.m4716k0(arrayList.get(0).f2175a.f1947a, runnableC0423a, m28690o());
                } else {
                    runnableC0423a.run();
                }
            }
            if (z3) {
                ArrayList<C0431i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f2133k);
                this.f2136n.add(arrayList2);
                this.f2133k.clear();
                RunnableC0424b runnableC0424b = new RunnableC0424b(arrayList2);
                if (z) {
                    xs1.m4716k0(arrayList2.get(0).f2169a.f1947a, runnableC0424b, m28690o());
                } else {
                    runnableC0424b.run();
                }
            }
            if (z4) {
                ArrayList<RecyclerView.AbstractC0376c0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f2131i);
                this.f2134l.add(arrayList3);
                this.f2131i.clear();
                RunnableC0425c runnableC0425c = new RunnableC0425c(arrayList3);
                if (z || z2 || z3) {
                    xs1.m4716k0(arrayList3.get(0).f1947a, runnableC0425c, (z ? m28690o() : 0L) + Math.max(z2 ? m28691n() : 0L, z3 ? m28692m() : 0L));
                } else {
                    runnableC0425c.run();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0454m
    /* renamed from: w */
    public boolean mo28143w(RecyclerView.AbstractC0376c0 abstractC0376c0) {
        m28264Z(abstractC0376c0);
        abstractC0376c0.f1947a.setAlpha(0.0f);
        this.f2131i.add(abstractC0376c0);
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0454m
    /* renamed from: x */
    public boolean mo28142x(RecyclerView.AbstractC0376c0 abstractC0376c0, RecyclerView.AbstractC0376c0 abstractC0376c02, int i, int i2, int i3, int i4) {
        if (abstractC0376c0 == abstractC0376c02) {
            return mo28141y(abstractC0376c0, i, i2, i3, i4);
        }
        float translationX = abstractC0376c0.f1947a.getTranslationX();
        float translationY = abstractC0376c0.f1947a.getTranslationY();
        float alpha = abstractC0376c0.f1947a.getAlpha();
        m28264Z(abstractC0376c0);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        abstractC0376c0.f1947a.setTranslationX(translationX);
        abstractC0376c0.f1947a.setTranslationY(translationY);
        abstractC0376c0.f1947a.setAlpha(alpha);
        if (abstractC0376c02 != null) {
            m28264Z(abstractC0376c02);
            abstractC0376c02.f1947a.setTranslationX(-i5);
            abstractC0376c02.f1947a.setTranslationY(-i6);
            abstractC0376c02.f1947a.setAlpha(0.0f);
        }
        this.f2133k.add(new C0431i(abstractC0376c0, abstractC0376c02, i, i2, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0454m
    /* renamed from: y */
    public boolean mo28141y(RecyclerView.AbstractC0376c0 abstractC0376c0, int i, int i2, int i3, int i4) {
        View view = abstractC0376c0.f1947a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC0376c0.f1947a.getTranslationY());
        m28264Z(abstractC0376c0);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m28160E(abstractC0376c0);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.f2132j.add(new C0432j(abstractC0376c0, translationX, translationY, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0454m
    /* renamed from: z */
    public boolean mo28140z(RecyclerView.AbstractC0376c0 abstractC0376c0) {
        m28264Z(abstractC0376c0);
        this.f2130h.add(abstractC0376c0);
        return true;
    }
}
