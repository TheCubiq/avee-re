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

    /* renamed from: V */
    public static final int[] f13805V = {2, 1, 3, 4};

    /* renamed from: W */
    public static final aw0 f13806W = new C1724a();

    /* renamed from: X */
    public static ThreadLocal<C1370g6<Animator, C1727d>> f13807X = new ThreadLocal<>();

    /* renamed from: I */
    public ArrayList<on1> f13816I;

    /* renamed from: J */
    public ArrayList<on1> f13817J;

    /* renamed from: S */
    public AbstractC1728e f13826S;

    /* renamed from: T */
    public C1370g6<String, String> f13827T;

    /* renamed from: p */
    public String f13829p = getClass().getName();

    /* renamed from: q */
    public long f13830q = -1;

    /* renamed from: r */
    public long f13831r = -1;

    /* renamed from: s */
    public TimeInterpolator f13832s = null;

    /* renamed from: t */
    public ArrayList<Integer> f13833t = new ArrayList<>();

    /* renamed from: u */
    public ArrayList<View> f13834u = new ArrayList<>();

    /* renamed from: v */
    public ArrayList<String> f13835v = null;

    /* renamed from: w */
    public ArrayList<Class<?>> f13836w = null;

    /* renamed from: x */
    public ArrayList<Integer> f13837x = null;

    /* renamed from: y */
    public ArrayList<View> f13838y = null;

    /* renamed from: z */
    public ArrayList<Class<?>> f13839z = null;

    /* renamed from: A */
    public ArrayList<String> f13808A = null;

    /* renamed from: B */
    public ArrayList<Integer> f13809B = null;

    /* renamed from: C */
    public ArrayList<View> f13810C = null;

    /* renamed from: D */
    public ArrayList<Class<?>> f13811D = null;

    /* renamed from: E */
    public pn1 f13812E = new pn1();

    /* renamed from: F */
    public pn1 f13813F = new pn1();

    /* renamed from: G */
    public mn1 f13814G = null;

    /* renamed from: H */
    public int[] f13815H = f13805V;

    /* renamed from: K */
    public ViewGroup f13818K = null;

    /* renamed from: L */
    public boolean f13819L = false;

    /* renamed from: M */
    public ArrayList<Animator> f13820M = new ArrayList<>();

    /* renamed from: N */
    public int f13821N = 0;

    /* renamed from: O */
    public boolean f13822O = false;

    /* renamed from: P */
    public boolean f13823P = false;

    /* renamed from: Q */
    public ArrayList<InterfaceC1729f> f13824Q = null;

    /* renamed from: R */
    public ArrayList<Animator> f13825R = new ArrayList<>();

    /* renamed from: U */
    public aw0 f13828U = f13806W;

    /* renamed from: com.daaw.in1$a */
    /* loaded from: classes.dex */
    public static class C1724a extends aw0 {
        @Override // com.daaw.aw0
        /* renamed from: a */
        public Path mo19592a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: com.daaw.in1$b */
    /* loaded from: classes.dex */
    public class C1725b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C1370g6 f13840a;

        public C1725b(C1370g6 c1370g6) {
            this.f13840a = c1370g6;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13840a.remove(animator);
            in1.this.f13820M.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            in1.this.f13820M.add(animator);
        }
    }

    /* renamed from: com.daaw.in1$c */
    /* loaded from: classes.dex */
    public class C1726c extends AnimatorListenerAdapter {
        public C1726c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            in1.this.m19599t();
            animator.removeListener(this);
        }
    }

    /* renamed from: com.daaw.in1$d */
    /* loaded from: classes.dex */
    public static class C1727d {

        /* renamed from: a */
        public View f13843a;

        /* renamed from: b */
        public String f13844b;

        /* renamed from: c */
        public on1 f13845c;

        /* renamed from: d */
        public ox1 f13846d;

        /* renamed from: e */
        public in1 f13847e;

        public C1727d(View view, String str, in1 in1Var, ox1 ox1Var, on1 on1Var) {
            this.f13843a = view;
            this.f13844b = str;
            this.f13845c = on1Var;
            this.f13846d = ox1Var;
            this.f13847e = in1Var;
        }
    }

    /* renamed from: com.daaw.in1$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1728e {
    }

    /* renamed from: com.daaw.in1$f */
    /* loaded from: classes.dex */
    public interface InterfaceC1729f {
        /* renamed from: a */
        void mo9244a(in1 in1Var);

        /* renamed from: b */
        void mo9243b(in1 in1Var);

        /* renamed from: c */
        void mo9242c(in1 in1Var);

        /* renamed from: d */
        void mo15892d(in1 in1Var);

        /* renamed from: e */
        void mo9241e(in1 in1Var);
    }

    /* renamed from: B */
    public static C1370g6<Animator, C1727d> m19624B() {
        C1370g6<Animator, C1727d> c1370g6 = f13807X.get();
        if (c1370g6 == null) {
            C1370g6<Animator, C1727d> c1370g62 = new C1370g6<>();
            f13807X.set(c1370g62);
            return c1370g62;
        }
        return c1370g6;
    }

    /* renamed from: L */
    public static boolean m19615L(on1 on1Var, on1 on1Var2, String str) {
        Object obj = on1Var.f21675a.get(str);
        Object obj2 = on1Var2.f21675a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: d */
    public static void m19606d(pn1 pn1Var, View view, on1 on1Var) {
        pn1Var.f23071a.put(view, on1Var);
        int id = view.getId();
        if (id >= 0) {
            if (pn1Var.f23072b.indexOfKey(id) >= 0) {
                pn1Var.f23072b.put(id, null);
            } else {
                pn1Var.f23072b.put(id, view);
            }
        }
        String m4750N = xs1.m4750N(view);
        if (m4750N != null) {
            if (pn1Var.f23074d.containsKey(m4750N)) {
                pn1Var.f23074d.put(m4750N, null);
            } else {
                pn1Var.f23074d.put(m4750N, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (pn1Var.f23073c.m10212i(itemIdAtPosition) < 0) {
                    xs1.m4775A0(view, true);
                    pn1Var.f23073c.m10210k(itemIdAtPosition, view);
                    return;
                }
                View m10214e = pn1Var.f23073c.m10214e(itemIdAtPosition);
                if (m10214e != null) {
                    xs1.m4775A0(m10214e, false);
                    pn1Var.f23073c.m10210k(itemIdAtPosition, null);
                }
            }
        }
    }

    /* renamed from: A */
    public ln1 m19625A() {
        return null;
    }

    /* renamed from: C */
    public long m19623C() {
        return this.f13830q;
    }

    /* renamed from: D */
    public List<Integer> m19622D() {
        return this.f13833t;
    }

    /* renamed from: E */
    public List<String> m19621E() {
        return this.f13835v;
    }

    /* renamed from: F */
    public List<Class<?>> m19620F() {
        return this.f13836w;
    }

    /* renamed from: G */
    public List<View> m19619G() {
        return this.f13834u;
    }

    /* renamed from: H */
    public String[] mo9262H() {
        return null;
    }

    /* renamed from: I */
    public on1 m19618I(View view, boolean z) {
        mn1 mn1Var = this.f13814G;
        if (mn1Var != null) {
            return mn1Var.m19618I(view, z);
        }
        return (z ? this.f13812E : this.f13813F).f23071a.get(view);
    }

    /* renamed from: J */
    public boolean mo19617J(on1 on1Var, on1 on1Var2) {
        if (on1Var == null || on1Var2 == null) {
            return false;
        }
        String[] mo9262H = mo9262H();
        if (mo9262H == null) {
            for (String str : on1Var.f21675a.keySet()) {
                if (m19615L(on1Var, on1Var2, str)) {
                }
            }
            return false;
        }
        for (String str2 : mo9262H) {
            if (!m19615L(on1Var, on1Var2, str2)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: K */
    public boolean m19616K(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f13837x;
        if (arrayList3 == null || !arrayList3.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList4 = this.f13838y;
            if (arrayList4 == null || !arrayList4.contains(view)) {
                ArrayList<Class<?>> arrayList5 = this.f13839z;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f13839z.get(i).isInstance(view)) {
                            return false;
                        }
                    }
                }
                if (this.f13808A == null || xs1.m4750N(view) == null || !this.f13808A.contains(xs1.m4750N(view))) {
                    if ((this.f13833t.size() == 0 && this.f13834u.size() == 0 && (((arrayList = this.f13836w) == null || arrayList.isEmpty()) && ((arrayList2 = this.f13835v) == null || arrayList2.isEmpty()))) || this.f13833t.contains(Integer.valueOf(id)) || this.f13834u.contains(view)) {
                        return true;
                    }
                    ArrayList<String> arrayList6 = this.f13835v;
                    if (arrayList6 == null || !arrayList6.contains(xs1.m4750N(view))) {
                        if (this.f13836w != null) {
                            for (int i2 = 0; i2 < this.f13836w.size(); i2++) {
                                if (this.f13836w.get(i2).isInstance(view)) {
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

    /* renamed from: M */
    public final void m19614M(C1370g6<View, on1> c1370g6, C1370g6<View, on1> c1370g62, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && m19616K(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && m19616K(view)) {
                on1 on1Var = c1370g6.get(valueAt);
                on1 on1Var2 = c1370g62.get(view);
                if (on1Var != null && on1Var2 != null) {
                    this.f13816I.add(on1Var);
                    this.f13817J.add(on1Var2);
                    c1370g6.remove(valueAt);
                    c1370g62.remove(view);
                }
            }
        }
    }

    /* renamed from: N */
    public final void m19613N(C1370g6<View, on1> c1370g6, C1370g6<View, on1> c1370g62) {
        on1 remove;
        for (int size = c1370g6.size() - 1; size >= 0; size--) {
            View m25436i = c1370g6.m25436i(size);
            if (m25436i != null && m19616K(m25436i) && (remove = c1370g62.remove(m25436i)) != null && m19616K(remove.f21676b)) {
                this.f13816I.add(c1370g6.m25434k(size));
                this.f13817J.add(remove);
            }
        }
    }

    /* renamed from: O */
    public final void m19612O(C1370g6<View, on1> c1370g6, C1370g6<View, on1> c1370g62, sl0<View> sl0Var, sl0<View> sl0Var2) {
        View m10214e;
        int m10207o = sl0Var.m10207o();
        for (int i = 0; i < m10207o; i++) {
            View m10206p = sl0Var.m10206p(i);
            if (m10206p != null && m19616K(m10206p) && (m10214e = sl0Var2.m10214e(sl0Var.m10211j(i))) != null && m19616K(m10214e)) {
                on1 on1Var = c1370g6.get(m10206p);
                on1 on1Var2 = c1370g62.get(m10214e);
                if (on1Var != null && on1Var2 != null) {
                    this.f13816I.add(on1Var);
                    this.f13817J.add(on1Var2);
                    c1370g6.remove(m10206p);
                    c1370g62.remove(m10214e);
                }
            }
        }
    }

    /* renamed from: P */
    public final void m19611P(C1370g6<View, on1> c1370g6, C1370g6<View, on1> c1370g62, C1370g6<String, View> c1370g63, C1370g6<String, View> c1370g64) {
        View view;
        int size = c1370g63.size();
        for (int i = 0; i < size; i++) {
            View m25432m = c1370g63.m25432m(i);
            if (m25432m != null && m19616K(m25432m) && (view = c1370g64.get(c1370g63.m25436i(i))) != null && m19616K(view)) {
                on1 on1Var = c1370g6.get(m25432m);
                on1 on1Var2 = c1370g62.get(view);
                if (on1Var != null && on1Var2 != null) {
                    this.f13816I.add(on1Var);
                    this.f13817J.add(on1Var2);
                    c1370g6.remove(m25432m);
                    c1370g62.remove(view);
                }
            }
        }
    }

    /* renamed from: Q */
    public final void m19610Q(pn1 pn1Var, pn1 pn1Var2) {
        C1370g6<View, on1> c1370g6 = new C1370g6<>(pn1Var.f23071a);
        C1370g6<View, on1> c1370g62 = new C1370g6<>(pn1Var2.f23071a);
        int i = 0;
        while (true) {
            int[] iArr = this.f13815H;
            if (i >= iArr.length) {
                m19607c(c1370g6, c1370g62);
                return;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                m19613N(c1370g6, c1370g62);
            } else if (i2 == 2) {
                m19611P(c1370g6, c1370g62, pn1Var.f23074d, pn1Var2.f23074d);
            } else if (i2 == 3) {
                m19614M(c1370g6, c1370g62, pn1Var.f23072b, pn1Var2.f23072b);
            } else if (i2 == 4) {
                m19612O(c1370g6, c1370g62, pn1Var.f23073c, pn1Var2.f23073c);
            }
            i++;
        }
    }

    /* renamed from: R */
    public void mo15922R(View view) {
        if (this.f13823P) {
            return;
        }
        C1370g6<Animator, C1727d> m19624B = m19624B();
        int size = m19624B.size();
        ox1 m21226d = gu1.m21226d(view);
        for (int i = size - 1; i >= 0; i--) {
            C1727d m25432m = m19624B.m25432m(i);
            if (m25432m.f13843a != null && m21226d.equals(m25432m.f13846d)) {
                C1781j3.m19160b(m19624B.m25436i(i));
            }
        }
        ArrayList<InterfaceC1729f> arrayList = this.f13824Q;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f13824Q.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((InterfaceC1729f) arrayList2.get(i2)).mo9243b(this);
            }
        }
        this.f13822O = true;
    }

    /* renamed from: S */
    public void m19609S(ViewGroup viewGroup) {
        C1727d c1727d;
        this.f13816I = new ArrayList<>();
        this.f13817J = new ArrayList<>();
        m19610Q(this.f13812E, this.f13813F);
        C1370g6<Animator, C1727d> m19624B = m19624B();
        int size = m19624B.size();
        ox1 m21226d = gu1.m21226d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator m25436i = m19624B.m25436i(i);
            if (m25436i != null && (c1727d = m19624B.get(m25436i)) != null && c1727d.f13843a != null && m21226d.equals(c1727d.f13846d)) {
                on1 on1Var = c1727d.f13845c;
                View view = c1727d.f13843a;
                on1 m19618I = m19618I(view, true);
                on1 m19595x = m19595x(view, true);
                if (m19618I == null && m19595x == null) {
                    m19595x = this.f13813F.f23071a.get(view);
                }
                if (!(m19618I == null && m19595x == null) && c1727d.f13847e.mo19617J(on1Var, m19595x)) {
                    if (m25436i.isRunning() || m25436i.isStarted()) {
                        m25436i.cancel();
                    } else {
                        m19624B.remove(m25436i);
                    }
                }
            }
        }
        mo15894s(viewGroup, this.f13812E, this.f13813F, this.f13816I, this.f13817J);
        mo15918X();
    }

    /* renamed from: T */
    public in1 mo15921T(InterfaceC1729f interfaceC1729f) {
        ArrayList<InterfaceC1729f> arrayList = this.f13824Q;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(interfaceC1729f);
        if (this.f13824Q.size() == 0) {
            this.f13824Q = null;
        }
        return this;
    }

    /* renamed from: U */
    public in1 mo15920U(View view) {
        this.f13834u.remove(view);
        return this;
    }

    /* renamed from: V */
    public void mo15919V(View view) {
        if (this.f13822O) {
            if (!this.f13823P) {
                C1370g6<Animator, C1727d> m19624B = m19624B();
                int size = m19624B.size();
                ox1 m21226d = gu1.m21226d(view);
                for (int i = size - 1; i >= 0; i--) {
                    C1727d m25432m = m19624B.m25432m(i);
                    if (m25432m.f13843a != null && m21226d.equals(m25432m.f13846d)) {
                        C1781j3.m19159c(m19624B.m25436i(i));
                    }
                }
                ArrayList<InterfaceC1729f> arrayList = this.f13824Q;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f13824Q.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((InterfaceC1729f) arrayList2.get(i2)).mo9241e(this);
                    }
                }
            }
            this.f13822O = false;
        }
    }

    /* renamed from: W */
    public final void m19608W(Animator animator, C1370g6<Animator, C1727d> c1370g6) {
        if (animator != null) {
            animator.addListener(new C1725b(c1370g6));
            m19605e(animator);
        }
    }

    /* renamed from: X */
    public void mo15918X() {
        m19604e0();
        C1370g6<Animator, C1727d> m19624B = m19624B();
        Iterator<Animator> it = this.f13825R.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (m19624B.containsKey(next)) {
                m19604e0();
                m19608W(next, m19624B);
            }
        }
        this.f13825R.clear();
        m19599t();
    }

    /* renamed from: Y */
    public in1 mo15917Y(long j) {
        this.f13831r = j;
        return this;
    }

    /* renamed from: Z */
    public void mo15916Z(AbstractC1728e abstractC1728e) {
        this.f13826S = abstractC1728e;
    }

    /* renamed from: a */
    public in1 mo15915a(InterfaceC1729f interfaceC1729f) {
        if (this.f13824Q == null) {
            this.f13824Q = new ArrayList<>();
        }
        this.f13824Q.add(interfaceC1729f);
        return this;
    }

    /* renamed from: a0 */
    public in1 mo15914a0(TimeInterpolator timeInterpolator) {
        this.f13832s = timeInterpolator;
        return this;
    }

    /* renamed from: b */
    public in1 mo15913b(View view) {
        this.f13834u.add(view);
        return this;
    }

    /* renamed from: b0 */
    public void mo15912b0(aw0 aw0Var) {
        if (aw0Var == null) {
            aw0Var = f13806W;
        }
        this.f13828U = aw0Var;
    }

    /* renamed from: c */
    public final void m19607c(C1370g6<View, on1> c1370g6, C1370g6<View, on1> c1370g62) {
        for (int i = 0; i < c1370g6.size(); i++) {
            on1 m25432m = c1370g6.m25432m(i);
            if (m19616K(m25432m.f21676b)) {
                this.f13816I.add(m25432m);
                this.f13817J.add(null);
            }
        }
        for (int i2 = 0; i2 < c1370g62.size(); i2++) {
            on1 m25432m2 = c1370g62.m25432m(i2);
            if (m19616K(m25432m2.f21676b)) {
                this.f13817J.add(m25432m2);
                this.f13816I.add(null);
            }
        }
    }

    /* renamed from: c0 */
    public void mo15911c0(ln1 ln1Var) {
    }

    /* renamed from: d0 */
    public in1 mo15910d0(long j) {
        this.f13830q = j;
        return this;
    }

    /* renamed from: e */
    public void m19605e(Animator animator) {
        if (animator == null) {
            m19599t();
            return;
        }
        if (m19598u() >= 0) {
            animator.setDuration(m19598u());
        }
        if (m19623C() >= 0) {
            animator.setStartDelay(m19623C() + animator.getStartDelay());
        }
        if (m19596w() != null) {
            animator.setInterpolator(m19596w());
        }
        animator.addListener(new C1726c());
        animator.start();
    }

    /* renamed from: e0 */
    public void m19604e0() {
        if (this.f13821N == 0) {
            ArrayList<InterfaceC1729f> arrayList = this.f13824Q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f13824Q.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC1729f) arrayList2.get(i)).mo15892d(this);
                }
            }
            this.f13823P = false;
        }
        this.f13821N++;
    }

    /* renamed from: f */
    public void m19603f() {
        for (int size = this.f13820M.size() - 1; size >= 0; size--) {
            this.f13820M.get(size).cancel();
        }
        ArrayList<InterfaceC1729f> arrayList = this.f13824Q;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.f13824Q.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((InterfaceC1729f) arrayList2.get(i)).mo9242c(this);
        }
    }

    /* renamed from: f0 */
    public String mo15909f0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f13831r != -1) {
            str2 = str2 + "dur(" + this.f13831r + ") ";
        }
        if (this.f13830q != -1) {
            str2 = str2 + "dly(" + this.f13830q + ") ";
        }
        if (this.f13832s != null) {
            str2 = str2 + "interp(" + this.f13832s + ") ";
        }
        if (this.f13833t.size() > 0 || this.f13834u.size() > 0) {
            String str3 = str2 + "tgts(";
            if (this.f13833t.size() > 0) {
                for (int i = 0; i < this.f13833t.size(); i++) {
                    if (i > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f13833t.get(i);
                }
            }
            if (this.f13834u.size() > 0) {
                for (int i2 = 0; i2 < this.f13834u.size(); i2++) {
                    if (i2 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f13834u.get(i2);
                }
            }
            return str3 + ")";
        }
        return str2;
    }

    /* renamed from: i */
    public abstract void mo9259i(on1 on1Var);

    /* renamed from: j */
    public final void m19602j(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f13837x;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.f13838y;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f13839z;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f13839z.get(i).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    on1 on1Var = new on1(view);
                    if (z) {
                        mo9258m(on1Var);
                    } else {
                        mo9259i(on1Var);
                    }
                    on1Var.f21677c.add(this);
                    mo15904k(on1Var);
                    m19606d(z ? this.f13812E : this.f13813F, view, on1Var);
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.f13809B;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.f13810C;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.f13811D;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (this.f13811D.get(i2).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                m19602j(viewGroup.getChildAt(i3), z);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public void mo15904k(on1 on1Var) {
    }

    /* renamed from: m */
    public abstract void mo9258m(on1 on1Var);

    /* renamed from: n */
    public void m19601n(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        C1370g6<String, String> c1370g6;
        m19600o(z);
        if ((this.f13833t.size() > 0 || this.f13834u.size() > 0) && (((arrayList = this.f13835v) == null || arrayList.isEmpty()) && ((arrayList2 = this.f13836w) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f13833t.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f13833t.get(i).intValue());
                if (findViewById != null) {
                    on1 on1Var = new on1(findViewById);
                    if (z) {
                        mo9258m(on1Var);
                    } else {
                        mo9259i(on1Var);
                    }
                    on1Var.f21677c.add(this);
                    mo15904k(on1Var);
                    m19606d(z ? this.f13812E : this.f13813F, findViewById, on1Var);
                }
            }
            for (int i2 = 0; i2 < this.f13834u.size(); i2++) {
                View view = this.f13834u.get(i2);
                on1 on1Var2 = new on1(view);
                if (z) {
                    mo9258m(on1Var2);
                } else {
                    mo9259i(on1Var2);
                }
                on1Var2.f21677c.add(this);
                mo15904k(on1Var2);
                m19606d(z ? this.f13812E : this.f13813F, view, on1Var2);
            }
        } else {
            m19602j(viewGroup, z);
        }
        if (z || (c1370g6 = this.f13827T) == null) {
            return;
        }
        int size = c1370g6.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add(this.f13812E.f23074d.remove(this.f13827T.m25436i(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.f13812E.f23074d.put(this.f13827T.m25432m(i4), view2);
            }
        }
    }

    /* renamed from: o */
    public void m19600o(boolean z) {
        pn1 pn1Var;
        if (z) {
            this.f13812E.f23071a.clear();
            this.f13812E.f23072b.clear();
            pn1Var = this.f13812E;
        } else {
            this.f13813F.f23071a.clear();
            this.f13813F.f23072b.clear();
            pn1Var = this.f13813F;
        }
        pn1Var.f23073c.m10217b();
    }

    @Override // 
    /* renamed from: p */
    public in1 clone() {
        try {
            in1 in1Var = (in1) super.clone();
            in1Var.f13825R = new ArrayList<>();
            in1Var.f13812E = new pn1();
            in1Var.f13813F = new pn1();
            in1Var.f13816I = null;
            in1Var.f13817J = null;
            return in1Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: r */
    public Animator mo9257r(ViewGroup viewGroup, on1 on1Var, on1 on1Var2) {
        return null;
    }

    /* renamed from: s */
    public void mo15894s(ViewGroup viewGroup, pn1 pn1Var, pn1 pn1Var2, ArrayList<on1> arrayList, ArrayList<on1> arrayList2) {
        int i;
        View view;
        Animator animator;
        on1 on1Var;
        Animator animator2;
        on1 on1Var2;
        C1370g6<Animator, C1727d> m19624B = m19624B();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            on1 on1Var3 = arrayList.get(i2);
            on1 on1Var4 = arrayList2.get(i2);
            if (on1Var3 != null && !on1Var3.f21677c.contains(this)) {
                on1Var3 = null;
            }
            if (on1Var4 != null && !on1Var4.f21677c.contains(this)) {
                on1Var4 = null;
            }
            if (on1Var3 != null || on1Var4 != null) {
                if (on1Var3 == null || on1Var4 == null || mo19617J(on1Var3, on1Var4)) {
                    Animator mo9257r = mo9257r(viewGroup, on1Var3, on1Var4);
                    if (mo9257r != null) {
                        if (on1Var4 != null) {
                            View view2 = on1Var4.f21676b;
                            String[] mo9262H = mo9262H();
                            if (mo9262H != null && mo9262H.length > 0) {
                                on1Var2 = new on1(view2);
                                on1 on1Var5 = pn1Var2.f23071a.get(view2);
                                if (on1Var5 != null) {
                                    int i3 = 0;
                                    while (i3 < mo9262H.length) {
                                        on1Var2.f21675a.put(mo9262H[i3], on1Var5.f21675a.get(mo9262H[i3]));
                                        i3++;
                                        mo9257r = mo9257r;
                                        size = size;
                                        on1Var5 = on1Var5;
                                    }
                                }
                                Animator animator3 = mo9257r;
                                i = size;
                                int size2 = m19624B.size();
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= size2) {
                                        animator2 = animator3;
                                        break;
                                    }
                                    C1727d c1727d = m19624B.get(m19624B.m25436i(i4));
                                    if (c1727d.f13845c != null && c1727d.f13843a == view2 && c1727d.f13844b.equals(m19594y()) && c1727d.f13845c.equals(on1Var2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i4++;
                                }
                            } else {
                                i = size;
                                animator2 = mo9257r;
                                on1Var2 = null;
                            }
                            view = view2;
                            animator = animator2;
                            on1Var = on1Var2;
                        } else {
                            i = size;
                            view = on1Var3.f21676b;
                            animator = mo9257r;
                            on1Var = null;
                        }
                        if (animator != null) {
                            m19624B.put(animator, new C1727d(view, m19594y(), this, gu1.m21226d(viewGroup), on1Var));
                            this.f13825R.add(animator);
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
                Animator animator4 = this.f13825R.get(sparseIntArray.keyAt(i5));
                animator4.setStartDelay((sparseIntArray.valueAt(i5) - Long.MAX_VALUE) + animator4.getStartDelay());
            }
        }
    }

    /* renamed from: t */
    public void m19599t() {
        int i = this.f13821N - 1;
        this.f13821N = i;
        if (i == 0) {
            ArrayList<InterfaceC1729f> arrayList = this.f13824Q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f13824Q.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((InterfaceC1729f) arrayList2.get(i2)).mo9244a(this);
                }
            }
            for (int i3 = 0; i3 < this.f13812E.f23073c.m10207o(); i3++) {
                View m10206p = this.f13812E.f23073c.m10206p(i3);
                if (m10206p != null) {
                    xs1.m4775A0(m10206p, false);
                }
            }
            for (int i4 = 0; i4 < this.f13813F.f23073c.m10207o(); i4++) {
                View m10206p2 = this.f13813F.f23073c.m10206p(i4);
                if (m10206p2 != null) {
                    xs1.m4775A0(m10206p2, false);
                }
            }
            this.f13823P = true;
        }
    }

    public String toString() {
        return mo15909f0("");
    }

    /* renamed from: u */
    public long m19598u() {
        return this.f13831r;
    }

    /* renamed from: v */
    public AbstractC1728e m19597v() {
        return this.f13826S;
    }

    /* renamed from: w */
    public TimeInterpolator m19596w() {
        return this.f13832s;
    }

    /* renamed from: x */
    public on1 m19595x(View view, boolean z) {
        mn1 mn1Var = this.f13814G;
        if (mn1Var != null) {
            return mn1Var.m19595x(view, z);
        }
        ArrayList<on1> arrayList = z ? this.f13816I : this.f13817J;
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
            if (on1Var.f21676b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i >= 0) {
            return (z ? this.f13817J : this.f13816I).get(i);
        }
        return null;
    }

    /* renamed from: y */
    public String m19594y() {
        return this.f13829p;
    }

    /* renamed from: z */
    public aw0 m19593z() {
        return this.f13828U;
    }
}
