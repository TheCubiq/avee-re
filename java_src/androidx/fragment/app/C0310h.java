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
import androidx.fragment.app.AbstractC0325l;
import androidx.lifecycle.AbstractC0344c;
import com.daaw.nt1;
import com.daaw.r11;
import com.daaw.xs1;
/* renamed from: androidx.fragment.app.h */
/* loaded from: classes.dex */
public class C0310h {

    /* renamed from: a */
    public final C0308g f1600a;

    /* renamed from: b */
    public final C0313i f1601b;

    /* renamed from: c */
    public final Fragment f1602c;

    /* renamed from: d */
    public boolean f1603d = false;

    /* renamed from: e */
    public int f1604e = -1;

    /* renamed from: androidx.fragment.app.h$a */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC0311a implements View.OnAttachStateChangeListener {

        /* renamed from: p */
        public final /* synthetic */ View f1605p;

        public View$OnAttachStateChangeListenerC0311a(View view) {
            this.f1605p = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f1605p.removeOnAttachStateChangeListener(this);
            xs1.m4708o0(this.f1605p);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.fragment.app.h$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0312b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1607a;

        static {
            int[] iArr = new int[AbstractC0344c.EnumC0347c.values().length];
            f1607a = iArr;
            try {
                iArr[AbstractC0344c.EnumC0347c.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1607a[AbstractC0344c.EnumC0347c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1607a[AbstractC0344c.EnumC0347c.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1607a[AbstractC0344c.EnumC0347c.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C0310h(C0308g c0308g, C0313i c0313i, Fragment fragment) {
        this.f1600a = c0308g;
        this.f1601b = c0313i;
        this.f1602c = fragment;
    }

    public C0310h(C0308g c0308g, C0313i c0313i, Fragment fragment, FragmentState fragmentState) {
        this.f1600a = c0308g;
        this.f1601b = c0313i;
        this.f1602c = fragment;
        fragment.f1397r = null;
        fragment.f1398s = null;
        fragment.f1360G = 0;
        fragment.f1357D = false;
        fragment.f1354A = false;
        Fragment fragment2 = fragment.f1402w;
        fragment.f1403x = fragment2 != null ? fragment2.f1400u : null;
        fragment.f1402w = null;
        Bundle bundle = fragmentState.f1513B;
        fragment.f1396q = bundle == null ? new Bundle() : bundle;
    }

    public C0310h(C0308g c0308g, C0313i c0313i, ClassLoader classLoader, C0304d c0304d, FragmentState fragmentState) {
        this.f1600a = c0308g;
        this.f1601b = c0313i;
        Fragment mo29219a = c0304d.mo29219a(classLoader, fragmentState.f1514p);
        this.f1602c = mo29219a;
        Bundle bundle = fragmentState.f1523y;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        mo29219a.m29400w1(fragmentState.f1523y);
        mo29219a.f1400u = fragmentState.f1515q;
        mo29219a.f1356C = fragmentState.f1516r;
        mo29219a.f1358E = true;
        mo29219a.f1365L = fragmentState.f1517s;
        mo29219a.f1366M = fragmentState.f1518t;
        mo29219a.f1367N = fragmentState.f1519u;
        mo29219a.f1370Q = fragmentState.f1520v;
        mo29219a.f1355B = fragmentState.f1521w;
        mo29219a.f1369P = fragmentState.f1522x;
        mo29219a.f1368O = fragmentState.f1524z;
        mo29219a.f1386g0 = AbstractC0344c.EnumC0347c.values()[fragmentState.f1512A];
        Bundle bundle2 = fragmentState.f1513B;
        mo29219a.f1396q = bundle2 == null ? new Bundle() : bundle2;
        if (FragmentManager.m29381E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Instantiated fragment ");
            sb.append(mo29219a);
        }
    }

    /* renamed from: a */
    public void m29197a() {
        if (FragmentManager.m29381E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto ACTIVITY_CREATED: ");
            sb.append(this.f1602c);
        }
        Fragment fragment = this.f1602c;
        fragment.m29470P0(fragment.f1396q);
        C0308g c0308g = this.f1600a;
        Fragment fragment2 = this.f1602c;
        c0308g.m29211a(fragment2, fragment2.f1396q, false);
    }

    /* renamed from: b */
    public void m29196b() {
        int m29166j = this.f1601b.m29166j(this.f1602c);
        Fragment fragment = this.f1602c;
        fragment.f1375V.addView(fragment.f1376W, m29166j);
    }

    /* renamed from: c */
    public void m29195c() {
        if (FragmentManager.m29381E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto ATTACHED: ");
            sb.append(this.f1602c);
        }
        Fragment fragment = this.f1602c;
        Fragment fragment2 = fragment.f1402w;
        C0310h c0310h = null;
        if (fragment2 != null) {
            C0310h m29163m = this.f1601b.m29163m(fragment2.f1400u);
            if (m29163m == null) {
                throw new IllegalStateException("Fragment " + this.f1602c + " declared target fragment " + this.f1602c.f1402w + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f1602c;
            fragment3.f1403x = fragment3.f1402w.f1400u;
            fragment3.f1402w = null;
            c0310h = m29163m;
        } else {
            String str = fragment.f1403x;
            if (str != null && (c0310h = this.f1601b.m29163m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f1602c + " declared target fragment " + this.f1602c.f1403x + " that does not belong to this FragmentManager!");
            }
        }
        if (c0310h != null && (FragmentManager.f1436P || c0310h.m29187k().f1395p < 1)) {
            c0310h.m29185m();
        }
        Fragment fragment4 = this.f1602c;
        fragment4.f1362I = fragment4.f1361H.m29288s0();
        Fragment fragment5 = this.f1602c;
        fragment5.f1364K = fragment5.f1361H.m29282v0();
        this.f1600a.m29205g(this.f1602c, false);
        this.f1602c.m29468Q0();
        this.f1600a.m29210b(this.f1602c, false);
    }

    /* renamed from: d */
    public int m29194d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f1602c;
        if (fragment2.f1361H == null) {
            return fragment2.f1395p;
        }
        int i = this.f1604e;
        int i2 = C0312b.f1607a[fragment2.f1386g0.ordinal()];
        if (i2 != 1) {
            i = i2 != 2 ? i2 != 3 ? i2 != 4 ? Math.min(i, -1) : Math.min(i, 0) : Math.min(i, 1) : Math.min(i, 5);
        }
        Fragment fragment3 = this.f1602c;
        if (fragment3.f1356C) {
            if (fragment3.f1357D) {
                i = Math.max(this.f1604e, 2);
                View view = this.f1602c.f1376W;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f1604e < 4 ? Math.min(i, fragment3.f1395p) : Math.min(i, 1);
            }
        }
        if (!this.f1602c.f1354A) {
            i = Math.min(i, 1);
        }
        AbstractC0325l.C0330e.EnumC0332b enumC0332b = null;
        if (FragmentManager.f1436P && (viewGroup = (fragment = this.f1602c).f1375V) != null) {
            enumC0332b = AbstractC0325l.m29094n(viewGroup, fragment.m29481H()).m29096l(this);
        }
        if (enumC0332b == AbstractC0325l.C0330e.EnumC0332b.ADDING) {
            i = Math.min(i, 6);
        } else if (enumC0332b == AbstractC0325l.C0330e.EnumC0332b.REMOVING) {
            i = Math.max(i, 3);
        } else {
            Fragment fragment4 = this.f1602c;
            if (fragment4.f1355B) {
                i = fragment4.m29448b0() ? Math.min(i, 1) : Math.min(i, -1);
            }
        }
        Fragment fragment5 = this.f1602c;
        if (fragment5.f1377X && fragment5.f1395p < 5) {
            i = Math.min(i, 4);
        }
        if (FragmentManager.m29381E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("computeExpectedState() of ");
            sb.append(i);
            sb.append(" for ");
            sb.append(this.f1602c);
        }
        return i;
    }

    /* renamed from: e */
    public void m29193e() {
        if (FragmentManager.m29381E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATED: ");
            sb.append(this.f1602c);
        }
        Fragment fragment = this.f1602c;
        if (fragment.f1385f0) {
            fragment.m29414q1(fragment.f1396q);
            this.f1602c.f1395p = 1;
            return;
        }
        this.f1600a.m29204h(fragment, fragment.f1396q, false);
        Fragment fragment2 = this.f1602c;
        fragment2.m29462T0(fragment2.f1396q);
        C0308g c0308g = this.f1600a;
        Fragment fragment3 = this.f1602c;
        c0308g.m29209c(fragment3, fragment3.f1396q, false);
    }

    /* renamed from: f */
    public void m29192f() {
        String str;
        if (this.f1602c.f1356C) {
            return;
        }
        if (FragmentManager.m29381E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATE_VIEW: ");
            sb.append(this.f1602c);
        }
        Fragment fragment = this.f1602c;
        LayoutInflater m29451Z0 = fragment.m29451Z0(fragment.f1396q);
        ViewGroup viewGroup = null;
        Fragment fragment2 = this.f1602c;
        ViewGroup viewGroup2 = fragment2.f1375V;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment2.f1366M;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f1602c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.f1361H.m29298n0().mo11810f(this.f1602c.f1366M);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f1602c;
                    if (!fragment3.f1358E) {
                        try {
                            str = fragment3.m29473N().getResourceName(this.f1602c.f1366M);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f1602c.f1366M) + " (" + str + ") for fragment " + this.f1602c);
                    }
                }
            }
        }
        Fragment fragment4 = this.f1602c;
        fragment4.f1375V = viewGroup;
        fragment4.mo13988V0(m29451Z0, viewGroup, fragment4.f1396q);
        View view = this.f1602c.f1376W;
        if (view != null) {
            boolean z = false;
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f1602c;
            fragment5.f1376W.setTag(r11.fragment_container_view_tag, fragment5);
            if (viewGroup != null) {
                m29196b();
            }
            Fragment fragment6 = this.f1602c;
            if (fragment6.f1368O) {
                fragment6.f1376W.setVisibility(8);
            }
            if (xs1.m4743U(this.f1602c.f1376W)) {
                xs1.m4708o0(this.f1602c.f1376W);
            } else {
                View view2 = this.f1602c.f1376W;
                view2.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC0311a(view2));
            }
            this.f1602c.m29425m1();
            C0308g c0308g = this.f1600a;
            Fragment fragment7 = this.f1602c;
            c0308g.m29199m(fragment7, fragment7.f1376W, fragment7.f1396q, false);
            int visibility = this.f1602c.f1376W.getVisibility();
            float alpha = this.f1602c.f1376W.getAlpha();
            if (FragmentManager.f1436P) {
                this.f1602c.m29493C1(alpha);
                Fragment fragment8 = this.f1602c;
                if (fragment8.f1375V != null && visibility == 0) {
                    View findFocus = fragment8.f1376W.findFocus();
                    if (findFocus != null) {
                        this.f1602c.m29398x1(findFocus);
                        if (FragmentManager.m29381E0(2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("requestFocus: Saved focused view ");
                            sb2.append(findFocus);
                            sb2.append(" for Fragment ");
                            sb2.append(this.f1602c);
                        }
                    }
                    this.f1602c.f1376W.setAlpha(0.0f);
                }
            } else {
                Fragment fragment9 = this.f1602c;
                if (visibility == 0 && fragment9.f1375V != null) {
                    z = true;
                }
                fragment9.f1381b0 = z;
            }
        }
        this.f1602c.f1395p = 2;
    }

    /* renamed from: g */
    public void m29191g() {
        Fragment m29170f;
        if (FragmentManager.m29381E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATED: ");
            sb.append(this.f1602c);
        }
        Fragment fragment = this.f1602c;
        boolean z = true;
        boolean z2 = fragment.f1355B && !fragment.m29448b0();
        if (!(z2 || this.f1601b.m29161o().m7520o(this.f1602c))) {
            String str = this.f1602c.f1403x;
            if (str != null && (m29170f = this.f1601b.m29170f(str)) != null && m29170f.f1370Q) {
                this.f1602c.f1402w = m29170f;
            }
            this.f1602c.f1395p = 0;
            return;
        }
        AbstractC0305e<?> abstractC0305e = this.f1602c.f1362I;
        if (abstractC0305e instanceof nt1) {
            z = this.f1601b.m29161o().m7523l();
        } else if (abstractC0305e.m29214k() instanceof Activity) {
            z = true ^ ((Activity) abstractC0305e.m29214k()).isChangingConfigurations();
        }
        if (z2 || z) {
            this.f1601b.m29161o().m7529f(this.f1602c);
        }
        this.f1602c.m29457W0();
        this.f1600a.m29208d(this.f1602c, false);
        for (C0310h c0310h : this.f1601b.m29165k()) {
            if (c0310h != null) {
                Fragment m29187k = c0310h.m29187k();
                if (this.f1602c.f1400u.equals(m29187k.f1403x)) {
                    m29187k.f1402w = this.f1602c;
                    m29187k.f1403x = null;
                }
            }
        }
        Fragment fragment2 = this.f1602c;
        String str2 = fragment2.f1403x;
        if (str2 != null) {
            fragment2.f1402w = this.f1601b.m29170f(str2);
        }
        this.f1601b.m29159q(this);
    }

    /* renamed from: h */
    public void m29190h() {
        View view;
        if (FragmentManager.m29381E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATE_VIEW: ");
            sb.append(this.f1602c);
        }
        Fragment fragment = this.f1602c;
        ViewGroup viewGroup = fragment.f1375V;
        if (viewGroup != null && (view = fragment.f1376W) != null) {
            viewGroup.removeView(view);
        }
        this.f1602c.m29455X0();
        this.f1600a.m29198n(this.f1602c, false);
        Fragment fragment2 = this.f1602c;
        fragment2.f1375V = null;
        fragment2.f1376W = null;
        fragment2.f1388i0 = null;
        fragment2.f1389j0.mo15133j(null);
        this.f1602c.f1357D = false;
    }

    /* renamed from: i */
    public void m29189i() {
        if (FragmentManager.m29381E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom ATTACHED: ");
            sb.append(this.f1602c);
        }
        this.f1602c.m29453Y0();
        boolean z = false;
        this.f1600a.m29207e(this.f1602c, false);
        Fragment fragment = this.f1602c;
        fragment.f1395p = -1;
        fragment.f1362I = null;
        fragment.f1364K = null;
        fragment.f1361H = null;
        if (fragment.f1355B && !fragment.m29448b0()) {
            z = true;
        }
        if (z || this.f1601b.m29161o().m7520o(this.f1602c)) {
            if (FragmentManager.m29381E0(3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("initState called for fragment: ");
                sb2.append(this.f1602c);
            }
            this.f1602c.m29454Y();
        }
    }

    /* renamed from: j */
    public void m29188j() {
        Fragment fragment = this.f1602c;
        if (fragment.f1356C && fragment.f1357D && !fragment.f1359F) {
            if (FragmentManager.m29381E0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("moveto CREATE_VIEW: ");
                sb.append(this.f1602c);
            }
            Fragment fragment2 = this.f1602c;
            fragment2.mo13988V0(fragment2.m29451Z0(fragment2.f1396q), null, this.f1602c.f1396q);
            View view = this.f1602c.f1376W;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f1602c;
                fragment3.f1376W.setTag(r11.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f1602c;
                if (fragment4.f1368O) {
                    fragment4.f1376W.setVisibility(8);
                }
                this.f1602c.m29425m1();
                C0308g c0308g = this.f1600a;
                Fragment fragment5 = this.f1602c;
                c0308g.m29199m(fragment5, fragment5.f1376W, fragment5.f1396q, false);
                this.f1602c.f1395p = 2;
            }
        }
    }

    /* renamed from: k */
    public Fragment m29187k() {
        return this.f1602c;
    }

    /* renamed from: l */
    public final boolean m29186l(View view) {
        if (view == this.f1602c.f1376W) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f1602c.f1376W) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public void m29185m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f1603d) {
            if (FragmentManager.m29381E0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Ignoring re-entrant call to moveToExpectedState() for ");
                sb.append(m29187k());
                return;
            }
            return;
        }
        try {
            this.f1603d = true;
            while (true) {
                int m29194d = m29194d();
                Fragment fragment = this.f1602c;
                int i = fragment.f1395p;
                if (m29194d == i) {
                    if (FragmentManager.f1436P && fragment.f1382c0) {
                        if (fragment.f1376W != null && (viewGroup = fragment.f1375V) != null) {
                            AbstractC0325l m29094n = AbstractC0325l.m29094n(viewGroup, fragment.m29481H());
                            if (this.f1602c.f1368O) {
                                m29094n.m29105c(this);
                            } else {
                                m29094n.m29103e(this);
                            }
                        }
                        Fragment fragment2 = this.f1602c;
                        FragmentManager fragmentManager = fragment2.f1361H;
                        if (fragmentManager != null) {
                            fragmentManager.m29385C0(fragment2);
                        }
                        Fragment fragment3 = this.f1602c;
                        fragment3.f1382c0 = false;
                        fragment3.m29396y0(fragment3.f1368O);
                    }
                    return;
                } else if (m29194d > i) {
                    switch (i + 1) {
                        case 0:
                            m29195c();
                            continue;
                        case 1:
                            m29193e();
                            continue;
                        case 2:
                            m29188j();
                            m29192f();
                            continue;
                        case 3:
                            m29197a();
                            continue;
                        case 4:
                            if (fragment.f1376W != null && (viewGroup2 = fragment.f1375V) != null) {
                                AbstractC0325l.m29094n(viewGroup2, fragment.m29481H()).m29106b(AbstractC0325l.C0330e.EnumC0333c.m29076b(this.f1602c.f1376W.getVisibility()), this);
                            }
                            this.f1602c.f1395p = 4;
                            continue;
                        case 5:
                            m29177u();
                            continue;
                        case 6:
                            fragment.f1395p = 6;
                            continue;
                        case 7:
                            m29182p();
                            continue;
                        default:
                            continue;
                    }
                } else {
                    switch (i - 1) {
                        case -1:
                            m29189i();
                            continue;
                        case 0:
                            m29191g();
                            continue;
                        case 1:
                            m29190h();
                            this.f1602c.f1395p = 1;
                            continue;
                        case 2:
                            fragment.f1357D = false;
                            fragment.f1395p = 2;
                            continue;
                        case 3:
                            if (FragmentManager.m29381E0(3)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("movefrom ACTIVITY_CREATED: ");
                                sb2.append(this.f1602c);
                            }
                            Fragment fragment4 = this.f1602c;
                            if (fragment4.f1376W != null && fragment4.f1397r == null) {
                                m29179s();
                            }
                            Fragment fragment5 = this.f1602c;
                            if (fragment5.f1376W != null && (viewGroup3 = fragment5.f1375V) != null) {
                                AbstractC0325l.m29094n(viewGroup3, fragment5.m29481H()).m29104d(this);
                            }
                            this.f1602c.f1395p = 3;
                            continue;
                        case 4:
                            m29176v();
                            continue;
                        case 5:
                            fragment.f1395p = 5;
                            continue;
                        case 6:
                            m29184n();
                            continue;
                        default:
                            continue;
                    }
                }
            }
        } finally {
            this.f1603d = false;
        }
    }

    /* renamed from: n */
    public void m29184n() {
        if (FragmentManager.m29381E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom RESUMED: ");
            sb.append(this.f1602c);
        }
        this.f1602c.m29441e1();
        this.f1600a.m29206f(this.f1602c, false);
    }

    /* renamed from: o */
    public void m29183o(ClassLoader classLoader) {
        Bundle bundle = this.f1602c.f1396q;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f1602c;
        fragment.f1397r = fragment.f1396q.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f1602c;
        fragment2.f1398s = fragment2.f1396q.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f1602c;
        fragment3.f1403x = fragment3.f1396q.getString("android:target_state");
        Fragment fragment4 = this.f1602c;
        if (fragment4.f1403x != null) {
            fragment4.f1404y = fragment4.f1396q.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f1602c;
        Boolean bool = fragment5.f1399t;
        if (bool != null) {
            fragment5.f1378Y = bool.booleanValue();
            this.f1602c.f1399t = null;
        } else {
            fragment5.f1378Y = fragment5.f1396q.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f1602c;
        if (fragment6.f1378Y) {
            return;
        }
        fragment6.f1377X = true;
    }

    /* renamed from: p */
    public void m29182p() {
        if (FragmentManager.m29381E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto RESUMED: ");
            sb.append(this.f1602c);
        }
        View m29498B = this.f1602c.m29498B();
        if (m29498B != null && m29186l(m29498B)) {
            boolean requestFocus = m29498B.requestFocus();
            if (FragmentManager.m29381E0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(m29498B);
                sb2.append(" ");
                sb2.append(requestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f1602c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f1602c.f1376W.findFocus());
            }
        }
        this.f1602c.m29398x1(null);
        this.f1602c.m29432i1();
        this.f1600a.m29203i(this.f1602c, false);
        Fragment fragment = this.f1602c;
        fragment.f1396q = null;
        fragment.f1397r = null;
        fragment.f1398s = null;
    }

    /* renamed from: q */
    public final Bundle m29181q() {
        Bundle bundle = new Bundle();
        this.f1602c.m29431j1(bundle);
        this.f1600a.m29202j(this.f1602c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f1602c.f1376W != null) {
            m29179s();
        }
        if (this.f1602c.f1397r != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f1602c.f1397r);
        }
        if (this.f1602c.f1398s != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f1602c.f1398s);
        }
        if (!this.f1602c.f1378Y) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f1602c.f1378Y);
        }
        return bundle;
    }

    /* renamed from: r */
    public FragmentState m29180r() {
        FragmentState fragmentState = new FragmentState(this.f1602c);
        Fragment fragment = this.f1602c;
        if (fragment.f1395p <= -1 || fragmentState.f1513B != null) {
            fragmentState.f1513B = fragment.f1396q;
        } else {
            Bundle m29181q = m29181q();
            fragmentState.f1513B = m29181q;
            if (this.f1602c.f1403x != null) {
                if (m29181q == null) {
                    fragmentState.f1513B = new Bundle();
                }
                fragmentState.f1513B.putString("android:target_state", this.f1602c.f1403x);
                int i = this.f1602c.f1404y;
                if (i != 0) {
                    fragmentState.f1513B.putInt("android:target_req_state", i);
                }
            }
        }
        return fragmentState;
    }

    /* renamed from: s */
    public void m29179s() {
        if (this.f1602c.f1376W == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f1602c.f1376W.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f1602c.f1397r = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f1602c.f1388i0.m25634j(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f1602c.f1398s = bundle;
    }

    /* renamed from: t */
    public void m29178t(int i) {
        this.f1604e = i;
    }

    /* renamed from: u */
    public void m29177u() {
        if (FragmentManager.m29381E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto STARTED: ");
            sb.append(this.f1602c);
        }
        this.f1602c.m29430k1();
        this.f1600a.m29201k(this.f1602c, false);
    }

    /* renamed from: v */
    public void m29176v() {
        if (FragmentManager.m29381E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom STARTED: ");
            sb.append(this.f1602c);
        }
        this.f1602c.m29428l1();
        this.f1600a.m29200l(this.f1602c, false);
    }
}
