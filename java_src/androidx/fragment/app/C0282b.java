package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.AbstractC0325l;
import androidx.fragment.app.C0297c;
import com.daaw.C1370g6;
import com.daaw.C3423wd;
import com.daaw.a40;
import com.daaw.bt1;
import com.daaw.nu0;
import com.daaw.ty0;
import com.daaw.xs1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: androidx.fragment.app.b */
/* loaded from: classes.dex */
public class C0282b extends AbstractC0325l {

    /* renamed from: androidx.fragment.app.b$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0283a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1528a;

        static {
            int[] iArr = new int[AbstractC0325l.C0330e.EnumC0333c.values().length];
            f1528a = iArr;
            try {
                iArr[AbstractC0325l.C0330e.EnumC0333c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1528a[AbstractC0325l.C0330e.EnumC0333c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1528a[AbstractC0325l.C0330e.EnumC0333c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1528a[AbstractC0325l.C0330e.EnumC0333c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$b */
    /* loaded from: classes.dex */
    public class RunnableC0284b implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ List f1529p;

        /* renamed from: q */
        public final /* synthetic */ AbstractC0325l.C0330e f1530q;

        public RunnableC0284b(List list, AbstractC0325l.C0330e c0330e) {
            this.f1529p = list;
            this.f1530q = c0330e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1529p.contains(this.f1530q)) {
                this.f1529p.remove(this.f1530q);
                C0282b.this.m29240s(this.f1530q);
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$c */
    /* loaded from: classes.dex */
    public class C0285c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f1532a;

        /* renamed from: b */
        public final /* synthetic */ View f1533b;

        /* renamed from: c */
        public final /* synthetic */ boolean f1534c;

        /* renamed from: d */
        public final /* synthetic */ AbstractC0325l.C0330e f1535d;

        /* renamed from: e */
        public final /* synthetic */ C0294k f1536e;

        public C0285c(ViewGroup viewGroup, View view, boolean z, AbstractC0325l.C0330e c0330e, C0294k c0294k) {
            this.f1532a = viewGroup;
            this.f1533b = view;
            this.f1534c = z;
            this.f1535d = c0330e;
            this.f1536e = c0294k;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1532a.endViewTransition(this.f1533b);
            if (this.f1534c) {
                this.f1535d.m29085e().m29077a(this.f1533b);
            }
            this.f1536e.m29233a();
        }
    }

    /* renamed from: androidx.fragment.app.b$d */
    /* loaded from: classes.dex */
    public class C0286d implements C3423wd.InterfaceC3425b {

        /* renamed from: a */
        public final /* synthetic */ Animator f1538a;

        public C0286d(Animator animator) {
            this.f1538a = animator;
        }

        @Override // com.daaw.C3423wd.InterfaceC3425b
        /* renamed from: a */
        public void mo6167a() {
            this.f1538a.end();
        }
    }

    /* renamed from: androidx.fragment.app.b$e  reason: invalid class name */
    /* loaded from: classes.dex */
    public class animationAnimation$AnimationListenerC0287e implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f1540a;

        /* renamed from: b */
        public final /* synthetic */ View f1541b;

        /* renamed from: c */
        public final /* synthetic */ C0294k f1542c;

        /* renamed from: androidx.fragment.app.b$e$a */
        /* loaded from: classes.dex */
        public class RunnableC0288a implements Runnable {
            public RunnableC0288a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                animationAnimation$AnimationListenerC0287e animationanimation_animationlistenerc0287e = animationAnimation$AnimationListenerC0287e.this;
                animationanimation_animationlistenerc0287e.f1540a.endViewTransition(animationanimation_animationlistenerc0287e.f1541b);
                animationAnimation$AnimationListenerC0287e.this.f1542c.m29233a();
            }
        }

        public animationAnimation$AnimationListenerC0287e(ViewGroup viewGroup, View view, C0294k c0294k) {
            this.f1540a = viewGroup;
            this.f1541b = view;
            this.f1542c = c0294k;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f1540a.post(new RunnableC0288a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.b$f */
    /* loaded from: classes.dex */
    public class C0289f implements C3423wd.InterfaceC3425b {

        /* renamed from: a */
        public final /* synthetic */ View f1545a;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f1546b;

        /* renamed from: c */
        public final /* synthetic */ C0294k f1547c;

        public C0289f(View view, ViewGroup viewGroup, C0294k c0294k) {
            this.f1545a = view;
            this.f1546b = viewGroup;
            this.f1547c = c0294k;
        }

        @Override // com.daaw.C3423wd.InterfaceC3425b
        /* renamed from: a */
        public void mo6167a() {
            this.f1545a.clearAnimation();
            this.f1546b.endViewTransition(this.f1545a);
            this.f1547c.m29233a();
        }
    }

    /* renamed from: androidx.fragment.app.b$g */
    /* loaded from: classes.dex */
    public class RunnableC0290g implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ AbstractC0325l.C0330e f1549p;

        /* renamed from: q */
        public final /* synthetic */ AbstractC0325l.C0330e f1550q;

        /* renamed from: r */
        public final /* synthetic */ boolean f1551r;

        /* renamed from: s */
        public final /* synthetic */ C1370g6 f1552s;

        public RunnableC0290g(AbstractC0325l.C0330e c0330e, AbstractC0325l.C0330e c0330e2, boolean z, C1370g6 c1370g6) {
            this.f1549p = c0330e;
            this.f1550q = c0330e2;
            this.f1551r = z;
            this.f1552s = c1370g6;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0316k.m29130f(this.f1549p.m29084f(), this.f1550q.m29084f(), this.f1551r, this.f1552s, false);
        }
    }

    /* renamed from: androidx.fragment.app.b$h */
    /* loaded from: classes.dex */
    public class RunnableC0291h implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ a40 f1554p;

        /* renamed from: q */
        public final /* synthetic */ View f1555q;

        /* renamed from: r */
        public final /* synthetic */ Rect f1556r;

        public RunnableC0291h(a40 a40Var, View view, Rect rect) {
            this.f1554p = a40Var;
            this.f1555q = view;
            this.f1556r = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1554p.m27617k(this.f1555q, this.f1556r);
        }
    }

    /* renamed from: androidx.fragment.app.b$i */
    /* loaded from: classes.dex */
    public class RunnableC0292i implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ ArrayList f1558p;

        public RunnableC0292i(ArrayList arrayList) {
            this.f1558p = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0316k.m29137A(this.f1558p, 4);
        }
    }

    /* renamed from: androidx.fragment.app.b$j */
    /* loaded from: classes.dex */
    public class RunnableC0293j implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ C0296m f1560p;

        public RunnableC0293j(C0296m c0296m) {
            this.f1560p = c0296m;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1560p.m29233a();
        }
    }

    /* renamed from: androidx.fragment.app.b$k */
    /* loaded from: classes.dex */
    public static class C0294k extends C0295l {

        /* renamed from: c */
        public boolean f1562c;

        /* renamed from: d */
        public boolean f1563d;

        /* renamed from: e */
        public C0297c.C0302d f1564e;

        public C0294k(AbstractC0325l.C0330e c0330e, C3423wd c3423wd, boolean z) {
            super(c0330e, c3423wd);
            this.f1563d = false;
            this.f1562c = z;
        }

        /* renamed from: e */
        public C0297c.C0302d m29234e(Context context) {
            if (this.f1563d) {
                return this.f1564e;
            }
            C0297c.C0302d m29221c = C0297c.m29221c(context, m29232b().m29084f(), m29232b().m29085e() == AbstractC0325l.C0330e.EnumC0333c.VISIBLE, this.f1562c);
            this.f1564e = m29221c;
            this.f1563d = true;
            return m29221c;
        }
    }

    /* renamed from: androidx.fragment.app.b$l */
    /* loaded from: classes.dex */
    public static class C0295l {

        /* renamed from: a */
        public final AbstractC0325l.C0330e f1565a;

        /* renamed from: b */
        public final C3423wd f1566b;

        public C0295l(AbstractC0325l.C0330e c0330e, C3423wd c3423wd) {
            this.f1565a = c0330e;
            this.f1566b = c3423wd;
        }

        /* renamed from: a */
        public void m29233a() {
            this.f1565a.m29086d(this.f1566b);
        }

        /* renamed from: b */
        public AbstractC0325l.C0330e m29232b() {
            return this.f1565a;
        }

        /* renamed from: c */
        public C3423wd m29231c() {
            return this.f1566b;
        }

        /* renamed from: d */
        public boolean m29230d() {
            AbstractC0325l.C0330e.EnumC0333c enumC0333c;
            AbstractC0325l.C0330e.EnumC0333c m29075c = AbstractC0325l.C0330e.EnumC0333c.m29075c(this.f1565a.m29084f().f1376W);
            AbstractC0325l.C0330e.EnumC0333c m29085e = this.f1565a.m29085e();
            return m29075c == m29085e || !(m29075c == (enumC0333c = AbstractC0325l.C0330e.EnumC0333c.VISIBLE) || m29085e == enumC0333c);
        }
    }

    /* renamed from: androidx.fragment.app.b$m */
    /* loaded from: classes.dex */
    public static class C0296m extends C0295l {

        /* renamed from: c */
        public final Object f1567c;

        /* renamed from: d */
        public final boolean f1568d;

        /* renamed from: e */
        public final Object f1569e;

        public C0296m(AbstractC0325l.C0330e c0330e, C3423wd c3423wd, boolean z, boolean z2) {
            super(c0330e, c3423wd);
            boolean z3;
            Object obj;
            if (c0330e.m29085e() == AbstractC0325l.C0330e.EnumC0333c.VISIBLE) {
                Fragment m29084f = c0330e.m29084f();
                this.f1567c = z ? m29084f.m29474M() : m29084f.m29401w();
                Fragment m29084f2 = c0330e.m29084f();
                z3 = z ? m29084f2.m29419p() : m29084f2.m29421o();
            } else {
                Fragment m29084f3 = c0330e.m29084f();
                this.f1567c = z ? m29084f3.m29472O() : m29084f3.m29394z();
                z3 = true;
            }
            this.f1568d = z3;
            if (z2) {
                Fragment m29084f4 = c0330e.m29084f();
                obj = z ? m29084f4.m29469Q() : m29084f4.m29471P();
            } else {
                obj = null;
            }
            this.f1569e = obj;
        }

        /* renamed from: e */
        public a40 m29229e() {
            a40 m29228f = m29228f(this.f1567c);
            a40 m29228f2 = m29228f(this.f1569e);
            if (m29228f == null || m29228f2 == null || m29228f == m29228f2) {
                return m29228f != null ? m29228f : m29228f2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + m29232b().m29084f() + " returned Transition " + this.f1567c + " which uses a different Transition  type than its shared element transition " + this.f1569e);
        }

        /* renamed from: f */
        public final a40 m29228f(Object obj) {
            if (obj == null) {
                return null;
            }
            a40 a40Var = C0316k.f1639b;
            if (a40Var == null || !a40Var.mo2902e(obj)) {
                a40 a40Var2 = C0316k.f1640c;
                if (a40Var2 == null || !a40Var2.mo2902e(obj)) {
                    throw new IllegalArgumentException("Transition " + obj + " for fragment " + m29232b().m29084f() + " is not a valid framework Transition or AndroidX Transition");
                }
                return a40Var2;
            }
            return a40Var;
        }

        /* renamed from: g */
        public Object m29227g() {
            return this.f1569e;
        }

        /* renamed from: h */
        public Object m29226h() {
            return this.f1567c;
        }

        /* renamed from: i */
        public boolean m29225i() {
            return this.f1569e != null;
        }

        /* renamed from: j */
        public boolean m29224j() {
            return this.f1568d;
        }
    }

    public C0282b(ViewGroup viewGroup) {
        super(viewGroup);
    }

    @Override // androidx.fragment.app.AbstractC0325l
    /* renamed from: f */
    public void mo29102f(List<AbstractC0325l.C0330e> list, boolean z) {
        AbstractC0325l.C0330e c0330e = null;
        AbstractC0325l.C0330e c0330e2 = null;
        for (AbstractC0325l.C0330e c0330e3 : list) {
            AbstractC0325l.C0330e.EnumC0333c m29075c = AbstractC0325l.C0330e.EnumC0333c.m29075c(c0330e3.m29084f().f1376W);
            int i = C0283a.f1528a[c0330e3.m29085e().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                if (m29075c == AbstractC0325l.C0330e.EnumC0333c.VISIBLE && c0330e == null) {
                    c0330e = c0330e3;
                }
            } else if (i == 4 && m29075c != AbstractC0325l.C0330e.EnumC0333c.VISIBLE) {
                c0330e2 = c0330e3;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<AbstractC0325l.C0330e> arrayList3 = new ArrayList(list);
        for (AbstractC0325l.C0330e c0330e4 : list) {
            C3423wd c3423wd = new C3423wd();
            c0330e4.m29080j(c3423wd);
            arrayList.add(new C0294k(c0330e4, c3423wd, z));
            C3423wd c3423wd2 = new C3423wd();
            c0330e4.m29080j(c3423wd2);
            boolean z2 = false;
            if (z) {
                if (c0330e4 != c0330e) {
                    arrayList2.add(new C0296m(c0330e4, c3423wd2, z, z2));
                    c0330e4.m29089a(new RunnableC0284b(arrayList3, c0330e4));
                }
                z2 = true;
                arrayList2.add(new C0296m(c0330e4, c3423wd2, z, z2));
                c0330e4.m29089a(new RunnableC0284b(arrayList3, c0330e4));
            } else {
                if (c0330e4 != c0330e2) {
                    arrayList2.add(new C0296m(c0330e4, c3423wd2, z, z2));
                    c0330e4.m29089a(new RunnableC0284b(arrayList3, c0330e4));
                }
                z2 = true;
                arrayList2.add(new C0296m(c0330e4, c3423wd2, z, z2));
                c0330e4.m29089a(new RunnableC0284b(arrayList3, c0330e4));
            }
        }
        Map<AbstractC0325l.C0330e, Boolean> m29235x = m29235x(arrayList2, arrayList3, z, c0330e, c0330e2);
        m29236w(arrayList, arrayList3, m29235x.containsValue(Boolean.TRUE), m29235x);
        for (AbstractC0325l.C0330e c0330e5 : arrayList3) {
            m29240s(c0330e5);
        }
        arrayList3.clear();
    }

    /* renamed from: s */
    public void m29240s(AbstractC0325l.C0330e c0330e) {
        c0330e.m29085e().m29077a(c0330e.m29084f().f1376W);
    }

    /* renamed from: t */
    public void m29239t(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (bt1.m25838a(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                m29239t(arrayList, childAt);
            }
        }
    }

    /* renamed from: u */
    public void m29238u(Map<String, View> map, View view) {
        String m4750N = xs1.m4750N(view);
        if (m4750N != null) {
            map.put(m4750N, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m29238u(map, childAt);
                }
            }
        }
    }

    /* renamed from: v */
    public void m29237v(C1370g6<String, View> c1370g6, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = c1370g6.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(xs1.m4750N(it.next().getValue()))) {
                it.remove();
            }
        }
    }

    /* renamed from: w */
    public final void m29236w(List<C0294k> list, List<AbstractC0325l.C0330e> list2, boolean z, Map<AbstractC0325l.C0330e, Boolean> map) {
        StringBuilder sb;
        String str;
        C0297c.C0302d m29234e;
        ViewGroup m29095m = m29095m();
        Context context = m29095m.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (C0294k c0294k : list) {
            if (c0294k.m29230d() || (m29234e = c0294k.m29234e(context)) == null) {
                c0294k.m29233a();
            } else {
                Animator animator = m29234e.f1582b;
                if (animator == null) {
                    arrayList.add(c0294k);
                } else {
                    AbstractC0325l.C0330e m29232b = c0294k.m29232b();
                    Fragment m29084f = m29232b.m29084f();
                    if (Boolean.TRUE.equals(map.get(m29232b))) {
                        if (FragmentManager.m29381E0(2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Ignoring Animator set on ");
                            sb2.append(m29084f);
                            sb2.append(" as this Fragment was involved in a Transition.");
                        }
                        c0294k.m29233a();
                    } else {
                        boolean z3 = m29232b.m29085e() == AbstractC0325l.C0330e.EnumC0333c.GONE;
                        if (z3) {
                            list2.remove(m29232b);
                        }
                        View view = m29084f.f1376W;
                        m29095m.startViewTransition(view);
                        animator.addListener(new C0285c(m29095m, view, z3, m29232b, c0294k));
                        animator.setTarget(view);
                        animator.start();
                        c0294k.m29231c().m6171c(new C0286d(animator));
                        z2 = true;
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0294k c0294k2 = (C0294k) it.next();
            AbstractC0325l.C0330e m29232b2 = c0294k2.m29232b();
            Fragment m29084f2 = m29232b2.m29084f();
            if (z) {
                if (FragmentManager.m29381E0(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(m29084f2);
                    str = " as Animations cannot run alongside Transitions.";
                    sb.append(str);
                }
                c0294k2.m29233a();
            } else if (z2) {
                if (FragmentManager.m29381E0(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(m29084f2);
                    str = " as Animations cannot run alongside Animators.";
                    sb.append(str);
                }
                c0294k2.m29233a();
            } else {
                View view2 = m29084f2.f1376W;
                Animation animation = (Animation) ty0.m8699f(((C0297c.C0302d) ty0.m8699f(c0294k2.m29234e(context))).f1581a);
                if (m29232b2.m29085e() != AbstractC0325l.C0330e.EnumC0333c.REMOVED) {
                    view2.startAnimation(animation);
                    c0294k2.m29233a();
                } else {
                    m29095m.startViewTransition(view2);
                    C0297c.RunnableC0303e runnableC0303e = new C0297c.RunnableC0303e(animation, m29095m, view2);
                    runnableC0303e.setAnimationListener(new animationAnimation$AnimationListenerC0287e(m29095m, view2, c0294k2));
                    view2.startAnimation(runnableC0303e);
                }
                c0294k2.m29231c().m6171c(new C0289f(view2, m29095m, c0294k2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    public final Map<AbstractC0325l.C0330e, Boolean> m29235x(List<C0296m> list, List<AbstractC0325l.C0330e> list2, boolean z, AbstractC0325l.C0330e c0330e, AbstractC0325l.C0330e c0330e2) {
        View view;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        AbstractC0325l.C0330e c0330e3;
        AbstractC0325l.C0330e c0330e4;
        View view2;
        Object mo2899n;
        C1370g6 c1370g6;
        ArrayList<View> arrayList3;
        AbstractC0325l.C0330e c0330e5;
        ArrayList<View> arrayList4;
        Rect rect;
        View view3;
        a40 a40Var;
        AbstractC0325l.C0330e c0330e6;
        View view4;
        boolean z2 = z;
        AbstractC0325l.C0330e c0330e7 = c0330e;
        AbstractC0325l.C0330e c0330e8 = c0330e2;
        HashMap hashMap = new HashMap();
        a40 a40Var2 = null;
        for (C0296m c0296m : list) {
            if (!c0296m.m29230d()) {
                a40 m29229e = c0296m.m29229e();
                if (a40Var2 == null) {
                    a40Var2 = m29229e;
                } else if (m29229e != null && a40Var2 != m29229e) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + c0296m.m29232b().m29084f() + " returned Transition " + c0296m.m29226h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (a40Var2 == null) {
            for (C0296m c0296m2 : list) {
                hashMap.put(c0296m2.m29232b(), Boolean.FALSE);
                c0296m2.m29233a();
            }
            return hashMap;
        }
        View view5 = new View(m29095m().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList5 = new ArrayList<>();
        ArrayList<View> arrayList6 = new ArrayList<>();
        C1370g6 c1370g62 = new C1370g6();
        Object obj3 = null;
        View view6 = null;
        boolean z3 = false;
        for (C0296m c0296m3 : list) {
            if (!c0296m3.m29225i() || c0330e7 == null || c0330e8 == null) {
                c1370g6 = c1370g62;
                arrayList3 = arrayList6;
                c0330e5 = c0330e7;
                arrayList4 = arrayList5;
                rect = rect2;
                view3 = view5;
                a40Var = a40Var2;
                c0330e6 = c0330e8;
                view6 = view6;
            } else {
                Object mo2907B = a40Var2.mo2907B(a40Var2.mo2901g(c0296m3.m29227g()));
                ArrayList<String> m29467R = c0330e2.m29084f().m29467R();
                ArrayList<String> m29467R2 = c0330e.m29084f().m29467R();
                ArrayList<String> m29465S = c0330e.m29084f().m29465S();
                View view7 = view6;
                int i = 0;
                while (i < m29465S.size()) {
                    int indexOf = m29467R.indexOf(m29465S.get(i));
                    ArrayList<String> arrayList7 = m29465S;
                    if (indexOf != -1) {
                        m29467R.set(indexOf, m29467R2.get(i));
                    }
                    i++;
                    m29465S = arrayList7;
                }
                ArrayList<String> m29465S2 = c0330e2.m29084f().m29465S();
                Fragment m29084f = c0330e.m29084f();
                if (z2) {
                    m29084f.m29399x();
                    c0330e2.m29084f().m29501A();
                } else {
                    m29084f.m29501A();
                    c0330e2.m29084f().m29399x();
                }
                int i2 = 0;
                for (int size = m29467R.size(); i2 < size; size = size) {
                    c1370g62.put(m29467R.get(i2), m29465S2.get(i2));
                    i2++;
                }
                C1370g6<String, View> c1370g63 = new C1370g6<>();
                m29238u(c1370g63, c0330e.m29084f().f1376W);
                c1370g63.m21905o(m29467R);
                c1370g62.m21905o(c1370g63.keySet());
                C1370g6<String, View> c1370g64 = new C1370g6<>();
                m29238u(c1370g64, c0330e2.m29084f().f1376W);
                c1370g64.m21905o(m29465S2);
                c1370g64.m21905o(c1370g62.values());
                C0316k.m29112x(c1370g62, c1370g64);
                m29237v(c1370g63, c1370g62.keySet());
                m29237v(c1370g64, c1370g62.values());
                if (c1370g62.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    c1370g6 = c1370g62;
                    arrayList3 = arrayList6;
                    c0330e5 = c0330e7;
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    a40Var = a40Var2;
                    view6 = view7;
                    obj3 = null;
                    c0330e6 = c0330e8;
                } else {
                    C0316k.m29130f(c0330e2.m29084f(), c0330e.m29084f(), z2, c1370g63, true);
                    c1370g6 = c1370g62;
                    ArrayList<View> arrayList8 = arrayList6;
                    nu0.m14792a(m29095m(), new RunnableC0290g(c0330e2, c0330e, z, c1370g64));
                    arrayList5.addAll(c1370g63.values());
                    if (m29467R.isEmpty()) {
                        view6 = view7;
                    } else {
                        View view8 = c1370g63.get(m29467R.get(0));
                        a40Var2.mo2893v(mo2907B, view8);
                        view6 = view8;
                    }
                    arrayList3 = arrayList8;
                    arrayList3.addAll(c1370g64.values());
                    if (!m29465S2.isEmpty() && (view4 = c1370g64.get(m29465S2.get(0))) != null) {
                        nu0.m14792a(m29095m(), new RunnableC0291h(a40Var2, view4, rect2));
                        z3 = true;
                    }
                    a40Var2.mo2891z(mo2907B, view5, arrayList5);
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    a40Var = a40Var2;
                    a40Var2.mo2895t(mo2907B, null, null, null, null, mo2907B, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    c0330e5 = c0330e;
                    hashMap.put(c0330e5, bool);
                    c0330e6 = c0330e2;
                    hashMap.put(c0330e6, bool);
                    obj3 = mo2907B;
                }
            }
            c0330e7 = c0330e5;
            arrayList5 = arrayList4;
            rect2 = rect;
            view5 = view3;
            c0330e8 = c0330e6;
            c1370g62 = c1370g6;
            z2 = z;
            arrayList6 = arrayList3;
            a40Var2 = a40Var;
        }
        View view9 = view6;
        C1370g6 c1370g65 = c1370g62;
        Collection<?> collection = arrayList6;
        AbstractC0325l.C0330e c0330e9 = c0330e7;
        Collection<?> collection2 = arrayList5;
        Rect rect3 = rect2;
        View view10 = view5;
        a40 a40Var3 = a40Var2;
        AbstractC0325l.C0330e c0330e10 = c0330e8;
        ArrayList arrayList9 = new ArrayList();
        Object obj4 = null;
        Object obj5 = null;
        for (C0296m c0296m4 : list) {
            if (c0296m4.m29230d()) {
                hashMap.put(c0296m4.m29232b(), Boolean.FALSE);
                c0296m4.m29233a();
            } else {
                Object mo2901g = a40Var3.mo2901g(c0296m4.m29226h());
                AbstractC0325l.C0330e m29232b = c0296m4.m29232b();
                boolean z4 = obj3 != null && (m29232b == c0330e9 || m29232b == c0330e10);
                if (mo2901g == null) {
                    if (!z4) {
                        hashMap.put(m29232b, Boolean.FALSE);
                        c0296m4.m29233a();
                    }
                    arrayList2 = collection;
                    arrayList = collection2;
                    view = view10;
                    mo2899n = obj4;
                    c0330e3 = c0330e10;
                    view2 = view9;
                } else {
                    ArrayList<View> arrayList10 = new ArrayList<>();
                    Object obj6 = obj4;
                    m29239t(arrayList10, m29232b.m29084f().f1376W);
                    if (z4) {
                        if (m29232b == c0330e9) {
                            arrayList10.removeAll(collection2);
                        } else {
                            arrayList10.removeAll(collection);
                        }
                    }
                    if (arrayList10.isEmpty()) {
                        a40Var3.mo2905a(mo2901g, view10);
                        arrayList2 = collection;
                        arrayList = collection2;
                        view = view10;
                        c0330e4 = m29232b;
                        obj2 = obj5;
                        c0330e3 = c0330e10;
                        obj = obj6;
                    } else {
                        a40Var3.mo2904b(mo2901g, arrayList10);
                        view = view10;
                        obj = obj6;
                        arrayList = collection2;
                        obj2 = obj5;
                        arrayList2 = collection;
                        c0330e3 = c0330e10;
                        a40Var3.mo2895t(mo2901g, mo2901g, arrayList10, null, null, null, null);
                        if (m29232b.m29085e() == AbstractC0325l.C0330e.EnumC0333c.GONE) {
                            c0330e4 = m29232b;
                            list2.remove(c0330e4);
                            ArrayList<View> arrayList11 = new ArrayList<>(arrayList10);
                            arrayList11.remove(c0330e4.m29084f().f1376W);
                            a40Var3.mo2896r(mo2901g, c0330e4.m29084f().f1376W, arrayList11);
                            nu0.m14792a(m29095m(), new RunnableC0292i(arrayList10));
                        } else {
                            c0330e4 = m29232b;
                        }
                    }
                    if (c0330e4.m29085e() == AbstractC0325l.C0330e.EnumC0333c.VISIBLE) {
                        arrayList9.addAll(arrayList10);
                        if (z3) {
                            a40Var3.mo2894u(mo2901g, rect3);
                        }
                        view2 = view9;
                    } else {
                        view2 = view9;
                        a40Var3.mo2893v(mo2901g, view2);
                    }
                    hashMap.put(c0330e4, Boolean.TRUE);
                    if (c0296m4.m29224j()) {
                        obj5 = a40Var3.mo2899n(obj2, mo2901g, null);
                        mo2899n = obj;
                    } else {
                        mo2899n = a40Var3.mo2899n(obj, mo2901g, null);
                        obj5 = obj2;
                    }
                }
                c0330e10 = c0330e3;
                obj4 = mo2899n;
                view9 = view2;
                view10 = view;
                collection2 = arrayList;
                collection = arrayList2;
            }
        }
        ArrayList<View> arrayList12 = collection;
        ArrayList<View> arrayList13 = collection2;
        AbstractC0325l.C0330e c0330e11 = c0330e10;
        Object mo2900m = a40Var3.mo2900m(obj5, obj4, obj3);
        for (C0296m c0296m5 : list) {
            if (!c0296m5.m29230d()) {
                Object m29226h = c0296m5.m29226h();
                AbstractC0325l.C0330e m29232b2 = c0296m5.m29232b();
                boolean z5 = obj3 != null && (m29232b2 == c0330e9 || m29232b2 == c0330e11);
                if (m29226h != null || z5) {
                    if (xs1.m4742V(m29095m())) {
                        a40Var3.mo2892w(c0296m5.m29232b().m29084f(), mo2900m, c0296m5.m29231c(), new RunnableC0293j(c0296m5));
                    } else {
                        if (FragmentManager.m29381E0(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: Container ");
                            sb.append(m29095m());
                            sb.append(" has not been laid out. Completing operation ");
                            sb.append(m29232b2);
                        }
                        c0296m5.m29233a();
                    }
                }
            }
        }
        if (xs1.m4742V(m29095m())) {
            C0316k.m29137A(arrayList9, 4);
            ArrayList<String> m27615o = a40Var3.m27615o(arrayList12);
            a40Var3.mo2903c(m29095m(), mo2900m);
            a40Var3.m27612y(m29095m(), arrayList13, arrayList12, m27615o, c1370g65);
            C0316k.m29137A(arrayList9, 0);
            a40Var3.mo2908A(obj3, arrayList13, arrayList12);
            return hashMap;
        }
        return hashMap;
    }
}
