package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.j;
import com.daaw.kl0;
import java.io.PrintWriter;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class a extends j implements FragmentManager.m {
    public final FragmentManager t;
    public boolean u;
    public int v;

    public a(FragmentManager fragmentManager) {
        super(fragmentManager.p0(), fragmentManager.s0() != null ? fragmentManager.s0().k().getClassLoader() : null);
        this.v = -1;
        this.t = fragmentManager;
    }

    public static boolean z(j.a aVar) {
        Fragment fragment = aVar.b;
        return (fragment == null || !fragment.A || fragment.W == null || fragment.P || fragment.O || !fragment.d0()) ? false : true;
    }

    public boolean A() {
        for (int i = 0; i < this.c.size(); i++) {
            if (z(this.c.get(i))) {
                return true;
            }
        }
        return false;
    }

    public void B() {
        if (this.s != null) {
            for (int i = 0; i < this.s.size(); i++) {
                this.s.get(i).run();
            }
            this.s = null;
        }
    }

    public void C(Fragment.h hVar) {
        for (int i = 0; i < this.c.size(); i++) {
            j.a aVar = this.c.get(i);
            if (z(aVar)) {
                aVar.b.A1(hVar);
            }
        }
    }

    public Fragment D(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            j.a aVar = this.c.get(size);
            int i = aVar.a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.b;
                            break;
                        case 10:
                            aVar.h = aVar.g;
                            break;
                    }
                }
                arrayList.add(aVar.b);
            }
            arrayList.remove(aVar.b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.m
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.i) {
            this.t.e(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.j
    public int f() {
        return q(false);
    }

    @Override // androidx.fragment.app.j
    public int g() {
        return q(true);
    }

    @Override // androidx.fragment.app.j
    public void h() {
        j();
        this.t.b0(this, false);
    }

    @Override // androidx.fragment.app.j
    public void i() {
        j();
        this.t.b0(this, true);
    }

    @Override // androidx.fragment.app.j
    public void k(int i, Fragment fragment, String str, int i2) {
        super.k(i, fragment, str, i2);
        fragment.H = this.t;
    }

    @Override // androidx.fragment.app.j
    public j l(Fragment fragment) {
        FragmentManager fragmentManager = fragment.H;
        if (fragmentManager == null || fragmentManager == this.t) {
            return super.l(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public void p(int i) {
        if (this.i) {
            if (FragmentManager.E0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i);
            }
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                j.a aVar = this.c.get(i2);
                Fragment fragment = aVar.b;
                if (fragment != null) {
                    fragment.G += i;
                    if (FragmentManager.E0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Bump nesting of ");
                        sb2.append(aVar.b);
                        sb2.append(" to ");
                        sb2.append(aVar.b.G);
                    }
                }
            }
        }
    }

    public int q(boolean z) {
        if (this.u) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Commit: ");
            sb.append(this);
            PrintWriter printWriter = new PrintWriter(new kl0("FragmentManager"));
            r("  ", printWriter);
            printWriter.close();
        }
        this.u = true;
        this.v = this.i ? this.t.i() : -1;
        this.t.Y(this, z);
        return this.v;
    }

    public void r(String str, PrintWriter printWriter) {
        s(str, printWriter, true);
    }

    public void s(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.k);
            printWriter.print(" mIndex=");
            printWriter.print(this.v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.u);
            if (this.h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.h));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.f != 0 || this.g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.m);
            }
            if (this.n != 0 || this.o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.o);
            }
        }
        if (this.c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            j.a aVar = this.c.get(i);
            switch (aVar.a) {
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
                    str2 = "cmd=" + aVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.b);
            if (z) {
                if (aVar.c != 0 || aVar.d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.d));
                }
                if (aVar.e != 0 || aVar.f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f));
                }
            }
        }
    }

    public void t() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            j.a aVar = this.c.get(i);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.B1(false);
                fragment.z1(this.h);
                fragment.D1(this.p, this.q);
            }
            switch (aVar.a) {
                case 1:
                    fragment.u1(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.t.g1(fragment, false);
                    this.t.g(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
                case 3:
                    fragment.u1(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.t.Z0(fragment);
                    break;
                case 4:
                    fragment.u1(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.t.B0(fragment);
                    break;
                case 5:
                    fragment.u1(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.t.g1(fragment, false);
                    this.t.k1(fragment);
                    break;
                case 6:
                    fragment.u1(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.t.x(fragment);
                    break;
                case 7:
                    fragment.u1(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.t.g1(fragment, false);
                    this.t.k(fragment);
                    break;
                case 8:
                    this.t.i1(fragment);
                    break;
                case 9:
                    this.t.i1(null);
                    break;
                case 10:
                    this.t.h1(fragment, aVar.h);
                    break;
            }
            if (!this.r && aVar.a != 1 && fragment != null && !FragmentManager.P) {
                this.t.M0(fragment);
            }
        }
        if (this.r || FragmentManager.P) {
            return;
        }
        FragmentManager fragmentManager = this.t;
        fragmentManager.N0(fragmentManager.q, true);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.v >= 0) {
            sb.append(" #");
            sb.append(this.v);
        }
        if (this.k != null) {
            sb.append(" ");
            sb.append(this.k);
        }
        sb.append("}");
        return sb.toString();
    }

    public void u(boolean z) {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            j.a aVar = this.c.get(size);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.B1(true);
                fragment.z1(FragmentManager.d1(this.h));
                fragment.D1(this.q, this.p);
            }
            switch (aVar.a) {
                case 1:
                    fragment.u1(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.t.g1(fragment, true);
                    this.t.Z0(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
                case 3:
                    fragment.u1(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.t.g(fragment);
                    break;
                case 4:
                    fragment.u1(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.t.k1(fragment);
                    break;
                case 5:
                    fragment.u1(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.t.g1(fragment, true);
                    this.t.B0(fragment);
                    break;
                case 6:
                    fragment.u1(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.t.k(fragment);
                    break;
                case 7:
                    fragment.u1(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.t.g1(fragment, true);
                    this.t.x(fragment);
                    break;
                case 8:
                    this.t.i1(null);
                    break;
                case 9:
                    this.t.i1(fragment);
                    break;
                case 10:
                    this.t.h1(fragment, aVar.g);
                    break;
            }
            if (!this.r && aVar.a != 3 && fragment != null && !FragmentManager.P) {
                this.t.M0(fragment);
            }
        }
        if (this.r || !z || FragmentManager.P) {
            return;
        }
        FragmentManager fragmentManager = this.t;
        fragmentManager.N0(fragmentManager.q, true);
    }

    public Fragment v(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.c.size()) {
            j.a aVar = this.c.get(i);
            int i2 = aVar.a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.b;
                    int i3 = fragment3.M;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.M == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.c.add(i, new j.a(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                j.a aVar2 = new j.a(3, fragment4);
                                aVar2.c = aVar.c;
                                aVar2.e = aVar.e;
                                aVar2.d = aVar.d;
                                aVar2.f = aVar.f;
                                this.c.add(i, aVar2);
                                arrayList.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.c.remove(i);
                        i--;
                    } else {
                        aVar.a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList.remove(aVar.b);
                    Fragment fragment5 = aVar.b;
                    if (fragment5 == fragment2) {
                        this.c.add(i, new j.a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.c.add(i, new j.a(9, fragment2));
                        i++;
                        fragment2 = aVar.b;
                    }
                }
                i++;
            }
            arrayList.add(aVar.b);
            i++;
        }
        return fragment2;
    }

    public String w() {
        return this.k;
    }

    public boolean x(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.c.get(i2).b;
            int i3 = fragment != null ? fragment.M : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    public boolean y(ArrayList<a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.c.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.c.get(i4).b;
            int i5 = fragment != null ? fragment.M : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    a aVar = arrayList.get(i6);
                    int size2 = aVar.c.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.c.get(i7).b;
                        if ((fragment2 != null ? fragment2.M : 0) == i5) {
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
