package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.l;
import androidx.lifecycle.c;
import com.daaw.nt1;
import com.daaw.r11;
import com.daaw.xs1;
/* loaded from: classes.dex */
public class h {
    public final g a;
    public final i b;
    public final Fragment c;
    public boolean d = false;
    public int e = -1;

    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View p;

        public a(View view) {
            this.p = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.p.removeOnAttachStateChangeListener(this);
            xs1.o0(this.p);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.EnumC0020c.values().length];
            a = iArr;
            try {
                iArr[c.EnumC0020c.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.EnumC0020c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.EnumC0020c.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.EnumC0020c.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public h(g gVar, i iVar, Fragment fragment) {
        this.a = gVar;
        this.b = iVar;
        this.c = fragment;
    }

    public h(g gVar, i iVar, Fragment fragment, FragmentState fragmentState) {
        this.a = gVar;
        this.b = iVar;
        this.c = fragment;
        fragment.r = null;
        fragment.s = null;
        fragment.G = 0;
        fragment.D = false;
        fragment.A = false;
        Fragment fragment2 = fragment.w;
        fragment.x = fragment2 != null ? fragment2.u : null;
        fragment.w = null;
        Bundle bundle = fragmentState.B;
        fragment.q = bundle == null ? new Bundle() : bundle;
    }

    public h(g gVar, i iVar, ClassLoader classLoader, d dVar, FragmentState fragmentState) {
        this.a = gVar;
        this.b = iVar;
        Fragment a2 = dVar.a(classLoader, fragmentState.p);
        this.c = a2;
        Bundle bundle = fragmentState.y;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.w1(fragmentState.y);
        a2.u = fragmentState.q;
        a2.C = fragmentState.r;
        a2.E = true;
        a2.L = fragmentState.s;
        a2.M = fragmentState.t;
        a2.N = fragmentState.u;
        a2.Q = fragmentState.v;
        a2.B = fragmentState.w;
        a2.P = fragmentState.x;
        a2.O = fragmentState.z;
        a2.g0 = c.EnumC0020c.values()[fragmentState.A];
        Bundle bundle2 = fragmentState.B;
        a2.q = bundle2 == null ? new Bundle() : bundle2;
        if (FragmentManager.E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Instantiated fragment ");
            sb.append(a2);
        }
    }

    public void a() {
        if (FragmentManager.E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto ACTIVITY_CREATED: ");
            sb.append(this.c);
        }
        Fragment fragment = this.c;
        fragment.P0(fragment.q);
        g gVar = this.a;
        Fragment fragment2 = this.c;
        gVar.a(fragment2, fragment2.q, false);
    }

    public void b() {
        int j = this.b.j(this.c);
        Fragment fragment = this.c;
        fragment.V.addView(fragment.W, j);
    }

    public void c() {
        if (FragmentManager.E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto ATTACHED: ");
            sb.append(this.c);
        }
        Fragment fragment = this.c;
        Fragment fragment2 = fragment.w;
        h hVar = null;
        if (fragment2 != null) {
            h m = this.b.m(fragment2.u);
            if (m == null) {
                throw new IllegalStateException("Fragment " + this.c + " declared target fragment " + this.c.w + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.c;
            fragment3.x = fragment3.w.u;
            fragment3.w = null;
            hVar = m;
        } else {
            String str = fragment.x;
            if (str != null && (hVar = this.b.m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.c + " declared target fragment " + this.c.x + " that does not belong to this FragmentManager!");
            }
        }
        if (hVar != null && (FragmentManager.P || hVar.k().p < 1)) {
            hVar.m();
        }
        Fragment fragment4 = this.c;
        fragment4.I = fragment4.H.s0();
        Fragment fragment5 = this.c;
        fragment5.K = fragment5.H.v0();
        this.a.g(this.c, false);
        this.c.Q0();
        this.a.b(this.c, false);
    }

    public int d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.c;
        if (fragment2.H == null) {
            return fragment2.p;
        }
        int i = this.e;
        int i2 = b.a[fragment2.g0.ordinal()];
        if (i2 != 1) {
            i = i2 != 2 ? i2 != 3 ? i2 != 4 ? Math.min(i, -1) : Math.min(i, 0) : Math.min(i, 1) : Math.min(i, 5);
        }
        Fragment fragment3 = this.c;
        if (fragment3.C) {
            if (fragment3.D) {
                i = Math.max(this.e, 2);
                View view = this.c.W;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.e < 4 ? Math.min(i, fragment3.p) : Math.min(i, 1);
            }
        }
        if (!this.c.A) {
            i = Math.min(i, 1);
        }
        l.e.b bVar = null;
        if (FragmentManager.P && (viewGroup = (fragment = this.c).V) != null) {
            bVar = l.n(viewGroup, fragment.H()).l(this);
        }
        if (bVar == l.e.b.ADDING) {
            i = Math.min(i, 6);
        } else if (bVar == l.e.b.REMOVING) {
            i = Math.max(i, 3);
        } else {
            Fragment fragment4 = this.c;
            if (fragment4.B) {
                i = fragment4.b0() ? Math.min(i, 1) : Math.min(i, -1);
            }
        }
        Fragment fragment5 = this.c;
        if (fragment5.X && fragment5.p < 5) {
            i = Math.min(i, 4);
        }
        if (FragmentManager.E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("computeExpectedState() of ");
            sb.append(i);
            sb.append(" for ");
            sb.append(this.c);
        }
        return i;
    }

    public void e() {
        if (FragmentManager.E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATED: ");
            sb.append(this.c);
        }
        Fragment fragment = this.c;
        if (fragment.f0) {
            fragment.q1(fragment.q);
            this.c.p = 1;
            return;
        }
        this.a.h(fragment, fragment.q, false);
        Fragment fragment2 = this.c;
        fragment2.T0(fragment2.q);
        g gVar = this.a;
        Fragment fragment3 = this.c;
        gVar.c(fragment3, fragment3.q, false);
    }

    public void f() {
        String str;
        if (this.c.C) {
            return;
        }
        if (FragmentManager.E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATE_VIEW: ");
            sb.append(this.c);
        }
        Fragment fragment = this.c;
        LayoutInflater Z0 = fragment.Z0(fragment.q);
        ViewGroup viewGroup = null;
        Fragment fragment2 = this.c;
        ViewGroup viewGroup2 = fragment2.V;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment2.M;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.H.n0().f(this.c.M);
                if (viewGroup == null) {
                    Fragment fragment3 = this.c;
                    if (!fragment3.E) {
                        try {
                            str = fragment3.N().getResourceName(this.c.M);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.c.M) + " (" + str + ") for fragment " + this.c);
                    }
                }
            }
        }
        Fragment fragment4 = this.c;
        fragment4.V = viewGroup;
        fragment4.V0(Z0, viewGroup, fragment4.q);
        View view = this.c.W;
        if (view != null) {
            boolean z = false;
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.c;
            fragment5.W.setTag(r11.fragment_container_view_tag, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.c;
            if (fragment6.O) {
                fragment6.W.setVisibility(8);
            }
            if (xs1.U(this.c.W)) {
                xs1.o0(this.c.W);
            } else {
                View view2 = this.c.W;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.c.m1();
            g gVar = this.a;
            Fragment fragment7 = this.c;
            gVar.m(fragment7, fragment7.W, fragment7.q, false);
            int visibility = this.c.W.getVisibility();
            float alpha = this.c.W.getAlpha();
            if (FragmentManager.P) {
                this.c.C1(alpha);
                Fragment fragment8 = this.c;
                if (fragment8.V != null && visibility == 0) {
                    View findFocus = fragment8.W.findFocus();
                    if (findFocus != null) {
                        this.c.x1(findFocus);
                        if (FragmentManager.E0(2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("requestFocus: Saved focused view ");
                            sb2.append(findFocus);
                            sb2.append(" for Fragment ");
                            sb2.append(this.c);
                        }
                    }
                    this.c.W.setAlpha(0.0f);
                }
            } else {
                Fragment fragment9 = this.c;
                if (visibility == 0 && fragment9.V != null) {
                    z = true;
                }
                fragment9.b0 = z;
            }
        }
        this.c.p = 2;
    }

    public void g() {
        Fragment f;
        if (FragmentManager.E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATED: ");
            sb.append(this.c);
        }
        Fragment fragment = this.c;
        boolean z = true;
        boolean z2 = fragment.B && !fragment.b0();
        if (!(z2 || this.b.o().o(this.c))) {
            String str = this.c.x;
            if (str != null && (f = this.b.f(str)) != null && f.Q) {
                this.c.w = f;
            }
            this.c.p = 0;
            return;
        }
        e<?> eVar = this.c.I;
        if (eVar instanceof nt1) {
            z = this.b.o().l();
        } else if (eVar.k() instanceof Activity) {
            z = true ^ ((Activity) eVar.k()).isChangingConfigurations();
        }
        if (z2 || z) {
            this.b.o().f(this.c);
        }
        this.c.W0();
        this.a.d(this.c, false);
        for (h hVar : this.b.k()) {
            if (hVar != null) {
                Fragment k = hVar.k();
                if (this.c.u.equals(k.x)) {
                    k.w = this.c;
                    k.x = null;
                }
            }
        }
        Fragment fragment2 = this.c;
        String str2 = fragment2.x;
        if (str2 != null) {
            fragment2.w = this.b.f(str2);
        }
        this.b.q(this);
    }

    public void h() {
        View view;
        if (FragmentManager.E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATE_VIEW: ");
            sb.append(this.c);
        }
        Fragment fragment = this.c;
        ViewGroup viewGroup = fragment.V;
        if (viewGroup != null && (view = fragment.W) != null) {
            viewGroup.removeView(view);
        }
        this.c.X0();
        this.a.n(this.c, false);
        Fragment fragment2 = this.c;
        fragment2.V = null;
        fragment2.W = null;
        fragment2.i0 = null;
        fragment2.j0.j(null);
        this.c.D = false;
    }

    public void i() {
        if (FragmentManager.E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom ATTACHED: ");
            sb.append(this.c);
        }
        this.c.Y0();
        boolean z = false;
        this.a.e(this.c, false);
        Fragment fragment = this.c;
        fragment.p = -1;
        fragment.I = null;
        fragment.K = null;
        fragment.H = null;
        if (fragment.B && !fragment.b0()) {
            z = true;
        }
        if (z || this.b.o().o(this.c)) {
            if (FragmentManager.E0(3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("initState called for fragment: ");
                sb2.append(this.c);
            }
            this.c.Y();
        }
    }

    public void j() {
        Fragment fragment = this.c;
        if (fragment.C && fragment.D && !fragment.F) {
            if (FragmentManager.E0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("moveto CREATE_VIEW: ");
                sb.append(this.c);
            }
            Fragment fragment2 = this.c;
            fragment2.V0(fragment2.Z0(fragment2.q), null, this.c.q);
            View view = this.c.W;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.c;
                fragment3.W.setTag(r11.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.c;
                if (fragment4.O) {
                    fragment4.W.setVisibility(8);
                }
                this.c.m1();
                g gVar = this.a;
                Fragment fragment5 = this.c;
                gVar.m(fragment5, fragment5.W, fragment5.q, false);
                this.c.p = 2;
            }
        }
    }

    public Fragment k() {
        return this.c;
    }

    public final boolean l(View view) {
        if (view == this.c.W) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.c.W) {
                return true;
            }
        }
        return false;
    }

    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.d) {
            if (FragmentManager.E0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Ignoring re-entrant call to moveToExpectedState() for ");
                sb.append(k());
                return;
            }
            return;
        }
        try {
            this.d = true;
            while (true) {
                int d = d();
                Fragment fragment = this.c;
                int i = fragment.p;
                if (d == i) {
                    if (FragmentManager.P && fragment.c0) {
                        if (fragment.W != null && (viewGroup = fragment.V) != null) {
                            l n = l.n(viewGroup, fragment.H());
                            if (this.c.O) {
                                n.c(this);
                            } else {
                                n.e(this);
                            }
                        }
                        Fragment fragment2 = this.c;
                        FragmentManager fragmentManager = fragment2.H;
                        if (fragmentManager != null) {
                            fragmentManager.C0(fragment2);
                        }
                        Fragment fragment3 = this.c;
                        fragment3.c0 = false;
                        fragment3.y0(fragment3.O);
                    }
                    return;
                } else if (d > i) {
                    switch (i + 1) {
                        case 0:
                            c();
                            continue;
                        case 1:
                            e();
                            continue;
                        case 2:
                            j();
                            f();
                            continue;
                        case 3:
                            a();
                            continue;
                        case 4:
                            if (fragment.W != null && (viewGroup2 = fragment.V) != null) {
                                l.n(viewGroup2, fragment.H()).b(l.e.c.b(this.c.W.getVisibility()), this);
                            }
                            this.c.p = 4;
                            continue;
                        case 5:
                            u();
                            continue;
                        case 6:
                            fragment.p = 6;
                            continue;
                        case 7:
                            p();
                            continue;
                        default:
                            continue;
                    }
                } else {
                    switch (i - 1) {
                        case -1:
                            i();
                            continue;
                        case 0:
                            g();
                            continue;
                        case 1:
                            h();
                            this.c.p = 1;
                            continue;
                        case 2:
                            fragment.D = false;
                            fragment.p = 2;
                            continue;
                        case 3:
                            if (FragmentManager.E0(3)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("movefrom ACTIVITY_CREATED: ");
                                sb2.append(this.c);
                            }
                            Fragment fragment4 = this.c;
                            if (fragment4.W != null && fragment4.r == null) {
                                s();
                            }
                            Fragment fragment5 = this.c;
                            if (fragment5.W != null && (viewGroup3 = fragment5.V) != null) {
                                l.n(viewGroup3, fragment5.H()).d(this);
                            }
                            this.c.p = 3;
                            continue;
                        case 4:
                            v();
                            continue;
                        case 5:
                            fragment.p = 5;
                            continue;
                        case 6:
                            n();
                            continue;
                        default:
                            continue;
                    }
                }
            }
        } finally {
            this.d = false;
        }
    }

    public void n() {
        if (FragmentManager.E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom RESUMED: ");
            sb.append(this.c);
        }
        this.c.e1();
        this.a.f(this.c, false);
    }

    public void o(ClassLoader classLoader) {
        Bundle bundle = this.c.q;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.c;
        fragment.r = fragment.q.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.c;
        fragment2.s = fragment2.q.getBundle("android:view_registry_state");
        Fragment fragment3 = this.c;
        fragment3.x = fragment3.q.getString("android:target_state");
        Fragment fragment4 = this.c;
        if (fragment4.x != null) {
            fragment4.y = fragment4.q.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.c;
        Boolean bool = fragment5.t;
        if (bool != null) {
            fragment5.Y = bool.booleanValue();
            this.c.t = null;
        } else {
            fragment5.Y = fragment5.q.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.c;
        if (fragment6.Y) {
            return;
        }
        fragment6.X = true;
    }

    public void p() {
        if (FragmentManager.E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto RESUMED: ");
            sb.append(this.c);
        }
        View B = this.c.B();
        if (B != null && l(B)) {
            boolean requestFocus = B.requestFocus();
            if (FragmentManager.E0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(B);
                sb2.append(" ");
                sb2.append(requestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.c.W.findFocus());
            }
        }
        this.c.x1(null);
        this.c.i1();
        this.a.i(this.c, false);
        Fragment fragment = this.c;
        fragment.q = null;
        fragment.r = null;
        fragment.s = null;
    }

    public final Bundle q() {
        Bundle bundle = new Bundle();
        this.c.j1(bundle);
        this.a.j(this.c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.c.W != null) {
            s();
        }
        if (this.c.r != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.c.r);
        }
        if (this.c.s != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.c.s);
        }
        if (!this.c.Y) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.c.Y);
        }
        return bundle;
    }

    public FragmentState r() {
        FragmentState fragmentState = new FragmentState(this.c);
        Fragment fragment = this.c;
        if (fragment.p <= -1 || fragmentState.B != null) {
            fragmentState.B = fragment.q;
        } else {
            Bundle q = q();
            fragmentState.B = q;
            if (this.c.x != null) {
                if (q == null) {
                    fragmentState.B = new Bundle();
                }
                fragmentState.B.putString("android:target_state", this.c.x);
                int i = this.c.y;
                if (i != 0) {
                    fragmentState.B.putInt("android:target_req_state", i);
                }
            }
        }
        return fragmentState;
    }

    public void s() {
        if (this.c.W == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.c.W.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.c.r = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.c.i0.j(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.c.s = bundle;
    }

    public void t(int i) {
        this.e = i;
    }

    public void u() {
        if (FragmentManager.E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto STARTED: ");
            sb.append(this.c);
        }
        this.c.k1();
        this.a.k(this.c, false);
    }

    public void v() {
        if (FragmentManager.E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom STARTED: ");
            sb.append(this.c);
        }
        this.c.l1();
        this.a.l(this.c, false);
    }
}
