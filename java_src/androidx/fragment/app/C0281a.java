package androidx.fragment.app;

import androidx.fragment.app.AbstractC0314j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.daaw.kl0;
import java.io.PrintWriter;
import java.util.ArrayList;
/* renamed from: androidx.fragment.app.a */
/* loaded from: classes.dex */
public final class C0281a extends AbstractC0314j implements FragmentManager.InterfaceC0276m {

    /* renamed from: t */
    public final FragmentManager f1525t;

    /* renamed from: u */
    public boolean f1526u;

    /* renamed from: v */
    public int f1527v;

    public C0281a(FragmentManager fragmentManager) {
        super(fragmentManager.m29294p0(), fragmentManager.m29288s0() != null ? fragmentManager.m29288s0().m29214k().getClassLoader() : null);
        this.f1527v = -1;
        this.f1525t = fragmentManager;
    }

    /* renamed from: z */
    public static boolean m29241z(AbstractC0314j.C0315a c0315a) {
        Fragment fragment = c0315a.f1631b;
        return (fragment == null || !fragment.f1354A || fragment.f1376W == null || fragment.f1369P || fragment.f1368O || !fragment.m29444d0()) ? false : true;
    }

    /* renamed from: A */
    public boolean m29256A() {
        for (int i = 0; i < this.f1613c.size(); i++) {
            if (m29241z(this.f1613c.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    public void m29255B() {
        if (this.f1629s != null) {
            for (int i = 0; i < this.f1629s.size(); i++) {
                this.f1629s.get(i).run();
            }
            this.f1629s = null;
        }
    }

    /* renamed from: C */
    public void m29254C(Fragment.InterfaceC0261h interfaceC0261h) {
        for (int i = 0; i < this.f1613c.size(); i++) {
            AbstractC0314j.C0315a c0315a = this.f1613c.get(i);
            if (m29241z(c0315a)) {
                c0315a.f1631b.m29499A1(interfaceC0261h);
            }
        }
    }

    /* renamed from: D */
    public Fragment m29253D(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f1613c.size() - 1; size >= 0; size--) {
            AbstractC0314j.C0315a c0315a = this.f1613c.get(size);
            int i = c0315a.f1630a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = c0315a.f1631b;
                            break;
                        case 10:
                            c0315a.f1637h = c0315a.f1636g;
                            break;
                    }
                }
                arrayList.add(c0315a.f1631b);
            }
            arrayList.remove(c0315a.f1631b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC0276m
    /* renamed from: a */
    public boolean mo29252a(ArrayList<C0281a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.m29381E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f1619i) {
            this.f1525t.m29326e(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.AbstractC0314j
    /* renamed from: f */
    public int mo29147f() {
        return m29250q(false);
    }

    @Override // androidx.fragment.app.AbstractC0314j
    /* renamed from: g */
    public int mo29146g() {
        return m29250q(true);
    }

    @Override // androidx.fragment.app.AbstractC0314j
    /* renamed from: h */
    public void mo29145h() {
        m29143j();
        this.f1525t.m29334b0(this, false);
    }

    @Override // androidx.fragment.app.AbstractC0314j
    /* renamed from: i */
    public void mo29144i() {
        m29143j();
        this.f1525t.m29334b0(this, true);
    }

    @Override // androidx.fragment.app.AbstractC0314j
    /* renamed from: k */
    public void mo29142k(int i, Fragment fragment, String str, int i2) {
        super.mo29142k(i, fragment, str, i2);
        fragment.f1361H = this.f1525t;
    }

    @Override // androidx.fragment.app.AbstractC0314j
    /* renamed from: l */
    public AbstractC0314j mo29141l(Fragment fragment) {
        FragmentManager fragmentManager = fragment.f1361H;
        if (fragmentManager == null || fragmentManager == this.f1525t) {
            return super.mo29141l(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: p */
    public void m29251p(int i) {
        if (this.f1619i) {
            if (FragmentManager.m29381E0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i);
            }
            int size = this.f1613c.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC0314j.C0315a c0315a = this.f1613c.get(i2);
                Fragment fragment = c0315a.f1631b;
                if (fragment != null) {
                    fragment.f1360G += i;
                    if (FragmentManager.m29381E0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Bump nesting of ");
                        sb2.append(c0315a.f1631b);
                        sb2.append(" to ");
                        sb2.append(c0315a.f1631b.f1360G);
                    }
                }
            }
        }
    }

    /* renamed from: q */
    public int m29250q(boolean z) {
        if (this.f1526u) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.m29381E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Commit: ");
            sb.append(this);
            PrintWriter printWriter = new PrintWriter(new kl0("FragmentManager"));
            m29249r("  ", printWriter);
            printWriter.close();
        }
        this.f1526u = true;
        this.f1527v = this.f1619i ? this.f1525t.m29314i() : -1;
        this.f1525t.m29342Y(this, z);
        return this.f1527v;
    }

    /* renamed from: r */
    public void m29249r(String str, PrintWriter printWriter) {
        m29248s(str, printWriter, true);
    }

    /* renamed from: s */
    public void m29248s(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1621k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1527v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1526u);
            if (this.f1618h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1618h));
            }
            if (this.f1614d != 0 || this.f1615e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1614d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1615e));
            }
            if (this.f1616f != 0 || this.f1617g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1616f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1617g));
            }
            if (this.f1622l != 0 || this.f1623m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1622l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1623m);
            }
            if (this.f1624n != 0 || this.f1625o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1624n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1625o);
            }
        }
        if (this.f1613c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f1613c.size();
        for (int i = 0; i < size; i++) {
            AbstractC0314j.C0315a c0315a = this.f1613c.get(i);
            switch (c0315a.f1630a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c0315a.f1630a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c0315a.f1631b);
            if (z) {
                if (c0315a.f1632c != 0 || c0315a.f1633d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c0315a.f1632c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c0315a.f1633d));
                }
                if (c0315a.f1634e != 0 || c0315a.f1635f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c0315a.f1634e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c0315a.f1635f));
                }
            }
        }
    }

    /* renamed from: t */
    public void m29247t() {
        int size = this.f1613c.size();
        for (int i = 0; i < size; i++) {
            AbstractC0314j.C0315a c0315a = this.f1613c.get(i);
            Fragment fragment = c0315a.f1631b;
            if (fragment != null) {
                fragment.m29496B1(false);
                fragment.m29392z1(this.f1618h);
                fragment.m29490D1(this.f1626p, this.f1627q);
            }
            switch (c0315a.f1630a) {
                case 1:
                    fragment.m29404u1(c0315a.f1632c, c0315a.f1633d, c0315a.f1634e, c0315a.f1635f);
                    this.f1525t.m29318g1(fragment, false);
                    this.f1525t.m29320g(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c0315a.f1630a);
                case 3:
                    fragment.m29404u1(c0315a.f1632c, c0315a.f1633d, c0315a.f1634e, c0315a.f1635f);
                    this.f1525t.m29339Z0(fragment);
                    break;
                case 4:
                    fragment.m29404u1(c0315a.f1632c, c0315a.f1633d, c0315a.f1634e, c0315a.f1635f);
                    this.f1525t.m29387B0(fragment);
                    break;
                case 5:
                    fragment.m29404u1(c0315a.f1632c, c0315a.f1633d, c0315a.f1634e, c0315a.f1635f);
                    this.f1525t.m29318g1(fragment, false);
                    this.f1525t.m29306k1(fragment);
                    break;
                case 6:
                    fragment.m29404u1(c0315a.f1632c, c0315a.f1633d, c0315a.f1634e, c0315a.f1635f);
                    this.f1525t.m29279x(fragment);
                    break;
                case 7:
                    fragment.m29404u1(c0315a.f1632c, c0315a.f1633d, c0315a.f1634e, c0315a.f1635f);
                    this.f1525t.m29318g1(fragment, false);
                    this.f1525t.m29308k(fragment);
                    break;
                case 8:
                    this.f1525t.m29312i1(fragment);
                    break;
                case 9:
                    this.f1525t.m29312i1(null);
                    break;
                case 10:
                    this.f1525t.m29315h1(fragment, c0315a.f1637h);
                    break;
            }
            if (!this.f1628r && c0315a.f1630a != 1 && fragment != null && !FragmentManager.f1436P) {
                this.f1525t.m29365M0(fragment);
            }
        }
        if (this.f1628r || FragmentManager.f1436P) {
            return;
        }
        FragmentManager fragmentManager = this.f1525t;
        fragmentManager.m29363N0(fragmentManager.f1467q, true);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1527v >= 0) {
            sb.append(" #");
            sb.append(this.f1527v);
        }
        if (this.f1621k != null) {
            sb.append(" ");
            sb.append(this.f1621k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u */
    public void m29246u(boolean z) {
        for (int size = this.f1613c.size() - 1; size >= 0; size--) {
            AbstractC0314j.C0315a c0315a = this.f1613c.get(size);
            Fragment fragment = c0315a.f1631b;
            if (fragment != null) {
                fragment.m29496B1(true);
                fragment.m29392z1(FragmentManager.m29327d1(this.f1618h));
                fragment.m29490D1(this.f1627q, this.f1626p);
            }
            switch (c0315a.f1630a) {
                case 1:
                    fragment.m29404u1(c0315a.f1632c, c0315a.f1633d, c0315a.f1634e, c0315a.f1635f);
                    this.f1525t.m29318g1(fragment, true);
                    this.f1525t.m29339Z0(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c0315a.f1630a);
                case 3:
                    fragment.m29404u1(c0315a.f1632c, c0315a.f1633d, c0315a.f1634e, c0315a.f1635f);
                    this.f1525t.m29320g(fragment);
                    break;
                case 4:
                    fragment.m29404u1(c0315a.f1632c, c0315a.f1633d, c0315a.f1634e, c0315a.f1635f);
                    this.f1525t.m29306k1(fragment);
                    break;
                case 5:
                    fragment.m29404u1(c0315a.f1632c, c0315a.f1633d, c0315a.f1634e, c0315a.f1635f);
                    this.f1525t.m29318g1(fragment, true);
                    this.f1525t.m29387B0(fragment);
                    break;
                case 6:
                    fragment.m29404u1(c0315a.f1632c, c0315a.f1633d, c0315a.f1634e, c0315a.f1635f);
                    this.f1525t.m29308k(fragment);
                    break;
                case 7:
                    fragment.m29404u1(c0315a.f1632c, c0315a.f1633d, c0315a.f1634e, c0315a.f1635f);
                    this.f1525t.m29318g1(fragment, true);
                    this.f1525t.m29279x(fragment);
                    break;
                case 8:
                    this.f1525t.m29312i1(null);
                    break;
                case 9:
                    this.f1525t.m29312i1(fragment);
                    break;
                case 10:
                    this.f1525t.m29315h1(fragment, c0315a.f1636g);
                    break;
            }
            if (!this.f1628r && c0315a.f1630a != 3 && fragment != null && !FragmentManager.f1436P) {
                this.f1525t.m29365M0(fragment);
            }
        }
        if (this.f1628r || !z || FragmentManager.f1436P) {
            return;
        }
        FragmentManager fragmentManager = this.f1525t;
        fragmentManager.m29363N0(fragmentManager.f1467q, true);
    }

    /* renamed from: v */
    public Fragment m29245v(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f1613c.size()) {
            AbstractC0314j.C0315a c0315a = this.f1613c.get(i);
            int i2 = c0315a.f1630a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = c0315a.f1631b;
                    int i3 = fragment3.f1366M;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.f1366M == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f1613c.add(i, new AbstractC0314j.C0315a(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                AbstractC0314j.C0315a c0315a2 = new AbstractC0314j.C0315a(3, fragment4);
                                c0315a2.f1632c = c0315a.f1632c;
                                c0315a2.f1634e = c0315a.f1634e;
                                c0315a2.f1633d = c0315a.f1633d;
                                c0315a2.f1635f = c0315a.f1635f;
                                this.f1613c.add(i, c0315a2);
                                arrayList.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f1613c.remove(i);
                        i--;
                    } else {
                        c0315a.f1630a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList.remove(c0315a.f1631b);
                    Fragment fragment5 = c0315a.f1631b;
                    if (fragment5 == fragment2) {
                        this.f1613c.add(i, new AbstractC0314j.C0315a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f1613c.add(i, new AbstractC0314j.C0315a(9, fragment2));
                        i++;
                        fragment2 = c0315a.f1631b;
                    }
                }
                i++;
            }
            arrayList.add(c0315a.f1631b);
            i++;
        }
        return fragment2;
    }

    /* renamed from: w */
    public String m29244w() {
        return this.f1621k;
    }

    /* renamed from: x */
    public boolean m29243x(int i) {
        int size = this.f1613c.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f1613c.get(i2).f1631b;
            int i3 = fragment != null ? fragment.f1366M : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    public boolean m29242y(ArrayList<C0281a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f1613c.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f1613c.get(i4).f1631b;
            int i5 = fragment != null ? fragment.f1366M : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0281a c0281a = arrayList.get(i6);
                    int size2 = c0281a.f1613c.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = c0281a.f1613c.get(i7).f1631b;
                        if ((fragment2 != null ? fragment2.f1366M : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }
}
