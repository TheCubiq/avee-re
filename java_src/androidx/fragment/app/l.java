package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import com.daaw.ne1;
import com.daaw.r11;
import com.daaw.wd;
import com.daaw.xs1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public abstract class l {
    public final ViewGroup a;
    public final ArrayList<e> b = new ArrayList<>();
    public final ArrayList<e> c = new ArrayList<>();
    public boolean d = false;
    public boolean e = false;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ d p;

        public a(d dVar) {
            this.p = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (l.this.b.contains(this.p)) {
                this.p.e().a(this.p.f().W);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ d p;

        public b(d dVar) {
            this.p = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            l.this.b.remove(this.p);
            l.this.c.remove(this.p);
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[e.b.values().length];
            b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d extends e {
        public final h h;

        public d(e.c cVar, e.b bVar, h hVar, wd wdVar) {
            super(cVar, bVar, hVar.k(), wdVar);
            this.h = hVar;
        }

        @Override // androidx.fragment.app.l.e
        public void c() {
            super.c();
            this.h.m();
        }

        @Override // androidx.fragment.app.l.e
        public void l() {
            if (g() == e.b.ADDING) {
                Fragment k = this.h.k();
                View findFocus = k.W.findFocus();
                if (findFocus != null) {
                    k.x1(findFocus);
                    if (FragmentManager.E0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("requestFocus: Saved focused view ");
                        sb.append(findFocus);
                        sb.append(" for Fragment ");
                        sb.append(k);
                    }
                }
                View p1 = f().p1();
                if (p1.getParent() == null) {
                    this.h.b();
                    p1.setAlpha(0.0f);
                }
                if (p1.getAlpha() == 0.0f && p1.getVisibility() == 0) {
                    p1.setVisibility(4);
                }
                p1.setAlpha(k.L());
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public c a;
        public b b;
        public final Fragment c;
        public final List<Runnable> d = new ArrayList();
        public final HashSet<wd> e = new HashSet<>();
        public boolean f = false;
        public boolean g = false;

        /* loaded from: classes.dex */
        public class a implements wd.b {
            public a() {
            }

            @Override // com.daaw.wd.b
            public void a() {
                e.this.b();
            }
        }

        /* loaded from: classes.dex */
        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* loaded from: classes.dex */
        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static c b(int i) {
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

            public static c c(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : b(view.getVisibility());
            }

            public void a(View view) {
                int i;
                int i2 = c.a[ordinal()];
                if (i2 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.E0(2)) {
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
                    if (FragmentManager.E0(2)) {
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
                    if (FragmentManager.E0(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("SpecialEffectsController: Setting view ");
                        sb3.append(view);
                        sb3.append(" to INVISIBLE");
                    }
                    view.setVisibility(4);
                    return;
                } else {
                    if (FragmentManager.E0(2)) {
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

        public e(c cVar, b bVar, Fragment fragment, wd wdVar) {
            this.a = cVar;
            this.b = bVar;
            this.c = fragment;
            wdVar.c(new a());
        }

        public final void a(Runnable runnable) {
            this.d.add(runnable);
        }

        public final void b() {
            if (h()) {
                return;
            }
            this.f = true;
            if (this.e.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.e).iterator();
            while (it.hasNext()) {
                ((wd) it.next()).a();
            }
        }

        public void c() {
            if (this.g) {
                return;
            }
            if (FragmentManager.E0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("SpecialEffectsController: ");
                sb.append(this);
                sb.append(" has called complete.");
            }
            this.g = true;
            for (Runnable runnable : this.d) {
                runnable.run();
            }
        }

        public final void d(wd wdVar) {
            if (this.e.remove(wdVar) && this.e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.a;
        }

        public final Fragment f() {
            return this.c;
        }

        public b g() {
            return this.b;
        }

        public final boolean h() {
            return this.f;
        }

        public final boolean i() {
            return this.g;
        }

        public final void j(wd wdVar) {
            l();
            this.e.add(wdVar);
        }

        public final void k(c cVar, b bVar) {
            b bVar2;
            int i = c.b[bVar.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && this.a != c.REMOVED) {
                        if (FragmentManager.E0(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: For fragment ");
                            sb.append(this.c);
                            sb.append(" mFinalState = ");
                            sb.append(this.a);
                            sb.append(" -> ");
                            sb.append(cVar);
                            sb.append(". ");
                        }
                        this.a = cVar;
                        return;
                    }
                    return;
                }
                if (FragmentManager.E0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: For fragment ");
                    sb2.append(this.c);
                    sb2.append(" mFinalState = ");
                    sb2.append(this.a);
                    sb2.append(" -> REMOVED. mLifecycleImpact  = ");
                    sb2.append(this.b);
                    sb2.append(" to REMOVING.");
                }
                this.a = c.REMOVED;
                bVar2 = b.REMOVING;
            } else if (this.a != c.REMOVED) {
                return;
            } else {
                if (FragmentManager.E0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: For fragment ");
                    sb3.append(this.c);
                    sb3.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                    sb3.append(this.b);
                    sb3.append(" to ADDING.");
                }
                this.a = c.VISIBLE;
                bVar2 = b.ADDING;
            }
            this.b = bVar2;
        }

        public void l() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.a + "} {mLifecycleImpact = " + this.b + "} {mFragment = " + this.c + "}";
        }
    }

    public l(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static l n(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return o(viewGroup, fragmentManager.x0());
    }

    public static l o(ViewGroup viewGroup, ne1 ne1Var) {
        int i = r11.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof l) {
            return (l) tag;
        }
        l a2 = ne1Var.a(viewGroup);
        viewGroup.setTag(i, a2);
        return a2;
    }

    public final void a(e.c cVar, e.b bVar, h hVar) {
        synchronized (this.b) {
            wd wdVar = new wd();
            e h = h(hVar.k());
            if (h != null) {
                h.k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, hVar, wdVar);
            this.b.add(dVar);
            dVar.a(new a(dVar));
            dVar.a(new b(dVar));
        }
    }

    public void b(e.c cVar, h hVar) {
        if (FragmentManager.E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing add operation for fragment ");
            sb.append(hVar.k());
        }
        a(cVar, e.b.ADDING, hVar);
    }

    public void c(h hVar) {
        if (FragmentManager.E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing hide operation for fragment ");
            sb.append(hVar.k());
        }
        a(e.c.GONE, e.b.NONE, hVar);
    }

    public void d(h hVar) {
        if (FragmentManager.E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing remove operation for fragment ");
            sb.append(hVar.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, hVar);
    }

    public void e(h hVar) {
        if (FragmentManager.E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing show operation for fragment ");
            sb.append(hVar.k());
        }
        a(e.c.VISIBLE, e.b.NONE, hVar);
    }

    public abstract void f(List<e> list, boolean z);

    public void g() {
        if (this.e) {
            return;
        }
        if (!xs1.U(this.a)) {
            j();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            if (!this.b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.c);
                this.c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (FragmentManager.E0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: Cancelling operation ");
                        sb.append(eVar);
                    }
                    eVar.b();
                    if (!eVar.i()) {
                        this.c.add(eVar);
                    }
                }
                q();
                ArrayList arrayList2 = new ArrayList(this.b);
                this.b.clear();
                this.c.addAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).l();
                }
                f(arrayList2, this.d);
                this.d = false;
            }
        }
    }

    public final e h(Fragment fragment) {
        Iterator<e> it = this.b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    public final e i(Fragment fragment) {
        Iterator<e> it = this.c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    public void j() {
        String str;
        String str2;
        boolean U = xs1.U(this.a);
        synchronized (this.b) {
            q();
            Iterator<e> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().l();
            }
            Iterator it2 = new ArrayList(this.c).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (FragmentManager.E0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (U) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(eVar);
                }
                eVar.b();
            }
            Iterator it3 = new ArrayList(this.b).iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (FragmentManager.E0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (U) {
                        str = "";
                    } else {
                        str = "Container " + this.a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(eVar2);
                }
                eVar2.b();
            }
        }
    }

    public void k() {
        if (this.e) {
            this.e = false;
            g();
        }
    }

    public e.b l(h hVar) {
        e h = h(hVar.k());
        e.b g = h != null ? h.g() : null;
        e i = i(hVar.k());
        return (i == null || !(g == null || g == e.b.NONE)) ? g : i.g();
    }

    public ViewGroup m() {
        return this.a;
    }

    public void p() {
        synchronized (this.b) {
            q();
            this.e = false;
            int size = this.b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = this.b.get(size);
                e.c c2 = e.c.c(eVar.f().W);
                e.c e2 = eVar.e();
                e.c cVar = e.c.VISIBLE;
                if (e2 == cVar && c2 != cVar) {
                    this.e = eVar.f().d0();
                    break;
                }
                size--;
            }
        }
    }

    public final void q() {
        Iterator<e> it = this.b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.g() == e.b.ADDING) {
                next.k(e.c.b(next.f().p1().getVisibility()), e.b.NONE);
            }
        }
    }

    public void r(boolean z) {
        this.d = z;
    }
}
