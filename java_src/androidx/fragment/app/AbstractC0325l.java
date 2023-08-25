package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import com.daaw.C3423wd;
import com.daaw.ne1;
import com.daaw.r11;
import com.daaw.xs1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* renamed from: androidx.fragment.app.l */
/* loaded from: classes.dex */
public abstract class AbstractC0325l {

    /* renamed from: a */
    public final ViewGroup f1681a;

    /* renamed from: b */
    public final ArrayList<C0330e> f1682b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<C0330e> f1683c = new ArrayList<>();

    /* renamed from: d */
    public boolean f1684d = false;

    /* renamed from: e */
    public boolean f1685e = false;

    /* renamed from: androidx.fragment.app.l$a */
    /* loaded from: classes.dex */
    public class RunnableC0326a implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ C0329d f1686p;

        public RunnableC0326a(C0329d c0329d) {
            this.f1686p = c0329d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC0325l.this.f1682b.contains(this.f1686p)) {
                this.f1686p.m29085e().m29077a(this.f1686p.m29084f().f1376W);
            }
        }
    }

    /* renamed from: androidx.fragment.app.l$b */
    /* loaded from: classes.dex */
    public class RunnableC0327b implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ C0329d f1688p;

        public RunnableC0327b(C0329d c0329d) {
            this.f1688p = c0329d;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0325l.this.f1682b.remove(this.f1688p);
            AbstractC0325l.this.f1683c.remove(this.f1688p);
        }
    }

    /* renamed from: androidx.fragment.app.l$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0328c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1690a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f1691b;

        static {
            int[] iArr = new int[C0330e.EnumC0332b.values().length];
            f1691b = iArr;
            try {
                iArr[C0330e.EnumC0332b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1691b[C0330e.EnumC0332b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1691b[C0330e.EnumC0332b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[C0330e.EnumC0333c.values().length];
            f1690a = iArr2;
            try {
                iArr2[C0330e.EnumC0333c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1690a[C0330e.EnumC0333c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1690a[C0330e.EnumC0333c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1690a[C0330e.EnumC0333c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: androidx.fragment.app.l$d */
    /* loaded from: classes.dex */
    public static class C0329d extends C0330e {

        /* renamed from: h */
        public final C0310h f1692h;

        public C0329d(C0330e.EnumC0333c enumC0333c, C0330e.EnumC0332b enumC0332b, C0310h c0310h, C3423wd c3423wd) {
            super(enumC0333c, enumC0332b, c0310h.m29187k(), c3423wd);
            this.f1692h = c0310h;
        }

        @Override // androidx.fragment.app.AbstractC0325l.C0330e
        /* renamed from: c */
        public void mo29087c() {
            super.mo29087c();
            this.f1692h.m29185m();
        }

        @Override // androidx.fragment.app.AbstractC0325l.C0330e
        /* renamed from: l */
        public void mo29078l() {
            if (m29083g() == C0330e.EnumC0332b.ADDING) {
                Fragment m29187k = this.f1692h.m29187k();
                View findFocus = m29187k.f1376W.findFocus();
                if (findFocus != null) {
                    m29187k.m29398x1(findFocus);
                    if (FragmentManager.m29381E0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("requestFocus: Saved focused view ");
                        sb.append(findFocus);
                        sb.append(" for Fragment ");
                        sb.append(m29187k);
                    }
                }
                View m29417p1 = m29084f().m29417p1();
                if (m29417p1.getParent() == null) {
                    this.f1692h.m29196b();
                    m29417p1.setAlpha(0.0f);
                }
                if (m29417p1.getAlpha() == 0.0f && m29417p1.getVisibility() == 0) {
                    m29417p1.setVisibility(4);
                }
                m29417p1.setAlpha(m29187k.m29475L());
            }
        }
    }

    /* renamed from: androidx.fragment.app.l$e */
    /* loaded from: classes.dex */
    public static class C0330e {

        /* renamed from: a */
        public EnumC0333c f1693a;

        /* renamed from: b */
        public EnumC0332b f1694b;

        /* renamed from: c */
        public final Fragment f1695c;

        /* renamed from: d */
        public final List<Runnable> f1696d = new ArrayList();

        /* renamed from: e */
        public final HashSet<C3423wd> f1697e = new HashSet<>();

        /* renamed from: f */
        public boolean f1698f = false;

        /* renamed from: g */
        public boolean f1699g = false;

        /* renamed from: androidx.fragment.app.l$e$a */
        /* loaded from: classes.dex */
        public class C0331a implements C3423wd.InterfaceC3425b {
            public C0331a() {
            }

            @Override // com.daaw.C3423wd.InterfaceC3425b
            /* renamed from: a */
            public void mo6167a() {
                C0330e.this.m29088b();
            }
        }

        /* renamed from: androidx.fragment.app.l$e$b */
        /* loaded from: classes.dex */
        public enum EnumC0332b {
            NONE,
            ADDING,
            REMOVING
        }

        /* renamed from: androidx.fragment.app.l$e$c */
        /* loaded from: classes.dex */
        public enum EnumC0333c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* renamed from: b */
            public static EnumC0333c m29076b(int i) {
                if (i != 0) {
                    if (i != 4) {
                        if (i == 8) {
                            return GONE;
                        }
                        throw new IllegalArgumentException("Unknown visibility " + i);
                    }
                    return INVISIBLE;
                }
                return VISIBLE;
            }

            /* renamed from: c */
            public static EnumC0333c m29075c(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : m29076b(view.getVisibility());
            }

            /* renamed from: a */
            public void m29077a(View view) {
                int i;
                int i2 = C0328c.f1690a[ordinal()];
                if (i2 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.m29381E0(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: Removing view ");
                            sb.append(view);
                            sb.append(" from container ");
                            sb.append(viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i2 == 2) {
                    if (FragmentManager.m29381E0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: Setting view ");
                        sb2.append(view);
                        sb2.append(" to VISIBLE");
                    }
                    i = 0;
                } else if (i2 != 3) {
                    if (i2 != 4) {
                        return;
                    }
                    if (FragmentManager.m29381E0(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("SpecialEffectsController: Setting view ");
                        sb3.append(view);
                        sb3.append(" to INVISIBLE");
                    }
                    view.setVisibility(4);
                    return;
                } else {
                    if (FragmentManager.m29381E0(2)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("SpecialEffectsController: Setting view ");
                        sb4.append(view);
                        sb4.append(" to GONE");
                    }
                    i = 8;
                }
                view.setVisibility(i);
            }
        }

        public C0330e(EnumC0333c enumC0333c, EnumC0332b enumC0332b, Fragment fragment, C3423wd c3423wd) {
            this.f1693a = enumC0333c;
            this.f1694b = enumC0332b;
            this.f1695c = fragment;
            c3423wd.m6171c(new C0331a());
        }

        /* renamed from: a */
        public final void m29089a(Runnable runnable) {
            this.f1696d.add(runnable);
        }

        /* renamed from: b */
        public final void m29088b() {
            if (m29082h()) {
                return;
            }
            this.f1698f = true;
            if (this.f1697e.isEmpty()) {
                mo29087c();
                return;
            }
            Iterator it = new ArrayList(this.f1697e).iterator();
            while (it.hasNext()) {
                ((C3423wd) it.next()).m6173a();
            }
        }

        /* renamed from: c */
        public void mo29087c() {
            if (this.f1699g) {
                return;
            }
            if (FragmentManager.m29381E0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("SpecialEffectsController: ");
                sb.append(this);
                sb.append(" has called complete.");
            }
            this.f1699g = true;
            for (Runnable runnable : this.f1696d) {
                runnable.run();
            }
        }

        /* renamed from: d */
        public final void m29086d(C3423wd c3423wd) {
            if (this.f1697e.remove(c3423wd) && this.f1697e.isEmpty()) {
                mo29087c();
            }
        }

        /* renamed from: e */
        public EnumC0333c m29085e() {
            return this.f1693a;
        }

        /* renamed from: f */
        public final Fragment m29084f() {
            return this.f1695c;
        }

        /* renamed from: g */
        public EnumC0332b m29083g() {
            return this.f1694b;
        }

        /* renamed from: h */
        public final boolean m29082h() {
            return this.f1698f;
        }

        /* renamed from: i */
        public final boolean m29081i() {
            return this.f1699g;
        }

        /* renamed from: j */
        public final void m29080j(C3423wd c3423wd) {
            mo29078l();
            this.f1697e.add(c3423wd);
        }

        /* renamed from: k */
        public final void m29079k(EnumC0333c enumC0333c, EnumC0332b enumC0332b) {
            EnumC0332b enumC0332b2;
            int i = C0328c.f1691b[enumC0332b.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && this.f1693a != EnumC0333c.REMOVED) {
                        if (FragmentManager.m29381E0(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: For fragment ");
                            sb.append(this.f1695c);
                            sb.append(" mFinalState = ");
                            sb.append(this.f1693a);
                            sb.append(" -> ");
                            sb.append(enumC0333c);
                            sb.append(". ");
                        }
                        this.f1693a = enumC0333c;
                        return;
                    }
                    return;
                }
                if (FragmentManager.m29381E0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: For fragment ");
                    sb2.append(this.f1695c);
                    sb2.append(" mFinalState = ");
                    sb2.append(this.f1693a);
                    sb2.append(" -> REMOVED. mLifecycleImpact  = ");
                    sb2.append(this.f1694b);
                    sb2.append(" to REMOVING.");
                }
                this.f1693a = EnumC0333c.REMOVED;
                enumC0332b2 = EnumC0332b.REMOVING;
            } else if (this.f1693a != EnumC0333c.REMOVED) {
                return;
            } else {
                if (FragmentManager.m29381E0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: For fragment ");
                    sb3.append(this.f1695c);
                    sb3.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                    sb3.append(this.f1694b);
                    sb3.append(" to ADDING.");
                }
                this.f1693a = EnumC0333c.VISIBLE;
                enumC0332b2 = EnumC0332b.ADDING;
            }
            this.f1694b = enumC0332b2;
        }

        /* renamed from: l */
        public void mo29078l() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f1693a + "} {mLifecycleImpact = " + this.f1694b + "} {mFragment = " + this.f1695c + "}";
        }
    }

    public AbstractC0325l(ViewGroup viewGroup) {
        this.f1681a = viewGroup;
    }

    /* renamed from: n */
    public static AbstractC0325l m29094n(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return m29093o(viewGroup, fragmentManager.m29278x0());
    }

    /* renamed from: o */
    public static AbstractC0325l m29093o(ViewGroup viewGroup, ne1 ne1Var) {
        int i = r11.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof AbstractC0325l) {
            return (AbstractC0325l) tag;
        }
        AbstractC0325l mo15210a = ne1Var.mo15210a(viewGroup);
        viewGroup.setTag(i, mo15210a);
        return mo15210a;
    }

    /* renamed from: a */
    public final void m29107a(C0330e.EnumC0333c enumC0333c, C0330e.EnumC0332b enumC0332b, C0310h c0310h) {
        synchronized (this.f1682b) {
            C3423wd c3423wd = new C3423wd();
            C0330e m29100h = m29100h(c0310h.m29187k());
            if (m29100h != null) {
                m29100h.m29079k(enumC0333c, enumC0332b);
                return;
            }
            C0329d c0329d = new C0329d(enumC0333c, enumC0332b, c0310h, c3423wd);
            this.f1682b.add(c0329d);
            c0329d.m29089a(new RunnableC0326a(c0329d));
            c0329d.m29089a(new RunnableC0327b(c0329d));
        }
    }

    /* renamed from: b */
    public void m29106b(C0330e.EnumC0333c enumC0333c, C0310h c0310h) {
        if (FragmentManager.m29381E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing add operation for fragment ");
            sb.append(c0310h.m29187k());
        }
        m29107a(enumC0333c, C0330e.EnumC0332b.ADDING, c0310h);
    }

    /* renamed from: c */
    public void m29105c(C0310h c0310h) {
        if (FragmentManager.m29381E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing hide operation for fragment ");
            sb.append(c0310h.m29187k());
        }
        m29107a(C0330e.EnumC0333c.GONE, C0330e.EnumC0332b.NONE, c0310h);
    }

    /* renamed from: d */
    public void m29104d(C0310h c0310h) {
        if (FragmentManager.m29381E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing remove operation for fragment ");
            sb.append(c0310h.m29187k());
        }
        m29107a(C0330e.EnumC0333c.REMOVED, C0330e.EnumC0332b.REMOVING, c0310h);
    }

    /* renamed from: e */
    public void m29103e(C0310h c0310h) {
        if (FragmentManager.m29381E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing show operation for fragment ");
            sb.append(c0310h.m29187k());
        }
        m29107a(C0330e.EnumC0333c.VISIBLE, C0330e.EnumC0332b.NONE, c0310h);
    }

    /* renamed from: f */
    public abstract void mo29102f(List<C0330e> list, boolean z);

    /* renamed from: g */
    public void m29101g() {
        if (this.f1685e) {
            return;
        }
        if (!xs1.m4743U(this.f1681a)) {
            m29098j();
            this.f1684d = false;
            return;
        }
        synchronized (this.f1682b) {
            if (!this.f1682b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f1683c);
                this.f1683c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C0330e c0330e = (C0330e) it.next();
                    if (FragmentManager.m29381E0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: Cancelling operation ");
                        sb.append(c0330e);
                    }
                    c0330e.m29088b();
                    if (!c0330e.m29081i()) {
                        this.f1683c.add(c0330e);
                    }
                }
                m29091q();
                ArrayList arrayList2 = new ArrayList(this.f1682b);
                this.f1682b.clear();
                this.f1683c.addAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((C0330e) it2.next()).mo29078l();
                }
                mo29102f(arrayList2, this.f1684d);
                this.f1684d = false;
            }
        }
    }

    /* renamed from: h */
    public final C0330e m29100h(Fragment fragment) {
        Iterator<C0330e> it = this.f1682b.iterator();
        while (it.hasNext()) {
            C0330e next = it.next();
            if (next.m29084f().equals(fragment) && !next.m29082h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: i */
    public final C0330e m29099i(Fragment fragment) {
        Iterator<C0330e> it = this.f1683c.iterator();
        while (it.hasNext()) {
            C0330e next = it.next();
            if (next.m29084f().equals(fragment) && !next.m29082h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: j */
    public void m29098j() {
        String str;
        String str2;
        boolean m4743U = xs1.m4743U(this.f1681a);
        synchronized (this.f1682b) {
            m29091q();
            Iterator<C0330e> it = this.f1682b.iterator();
            while (it.hasNext()) {
                it.next().mo29078l();
            }
            Iterator it2 = new ArrayList(this.f1683c).iterator();
            while (it2.hasNext()) {
                C0330e c0330e = (C0330e) it2.next();
                if (FragmentManager.m29381E0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (m4743U) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f1681a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(c0330e);
                }
                c0330e.m29088b();
            }
            Iterator it3 = new ArrayList(this.f1682b).iterator();
            while (it3.hasNext()) {
                C0330e c0330e2 = (C0330e) it3.next();
                if (FragmentManager.m29381E0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (m4743U) {
                        str = "";
                    } else {
                        str = "Container " + this.f1681a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(c0330e2);
                }
                c0330e2.m29088b();
            }
        }
    }

    /* renamed from: k */
    public void m29097k() {
        if (this.f1685e) {
            this.f1685e = false;
            m29101g();
        }
    }

    /* renamed from: l */
    public C0330e.EnumC0332b m29096l(C0310h c0310h) {
        C0330e m29100h = m29100h(c0310h.m29187k());
        C0330e.EnumC0332b m29083g = m29100h != null ? m29100h.m29083g() : null;
        C0330e m29099i = m29099i(c0310h.m29187k());
        return (m29099i == null || !(m29083g == null || m29083g == C0330e.EnumC0332b.NONE)) ? m29083g : m29099i.m29083g();
    }

    /* renamed from: m */
    public ViewGroup m29095m() {
        return this.f1681a;
    }

    /* renamed from: p */
    public void m29092p() {
        synchronized (this.f1682b) {
            m29091q();
            this.f1685e = false;
            int size = this.f1682b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                C0330e c0330e = this.f1682b.get(size);
                C0330e.EnumC0333c m29075c = C0330e.EnumC0333c.m29075c(c0330e.m29084f().f1376W);
                C0330e.EnumC0333c m29085e = c0330e.m29085e();
                C0330e.EnumC0333c enumC0333c = C0330e.EnumC0333c.VISIBLE;
                if (m29085e == enumC0333c && m29075c != enumC0333c) {
                    this.f1685e = c0330e.m29084f().m29444d0();
                    break;
                }
                size--;
            }
        }
    }

    /* renamed from: q */
    public final void m29091q() {
        Iterator<C0330e> it = this.f1682b.iterator();
        while (it.hasNext()) {
            C0330e next = it.next();
            if (next.m29083g() == C0330e.EnumC0332b.ADDING) {
                next.m29079k(C0330e.EnumC0333c.m29076b(next.m29084f().m29417p1().getVisibility()), C0330e.EnumC0332b.NONE);
            }
        }
    }

    /* renamed from: r */
    public void m29090r(boolean z) {
        this.f1684d = z;
    }
}
