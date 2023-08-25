package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import com.daaw.v30;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class i {
    public final ArrayList<Fragment> a = new ArrayList<>();
    public final HashMap<String, h> b = new HashMap<>();
    public v30 c;

    public void a(Fragment fragment) {
        if (this.a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.a) {
            this.a.add(fragment);
        }
        fragment.A = true;
    }

    public void b() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    public boolean c(String str) {
        return this.b.get(str) != null;
    }

    public void d(int i) {
        for (h hVar : this.b.values()) {
            if (hVar != null) {
                hVar.t(i);
            }
        }
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (h hVar : this.b.values()) {
                printWriter.print(str);
                if (hVar != null) {
                    Fragment k = hVar.k();
                    printWriter.println(k);
                    k.k(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.a.get(i).toString());
            }
        }
    }

    public Fragment f(String str) {
        h hVar = this.b.get(str);
        if (hVar != null) {
            return hVar.k();
        }
        return null;
    }

    public Fragment g(int i) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.a.get(size);
            if (fragment != null && fragment.L == i) {
                return fragment;
            }
        }
        for (h hVar : this.b.values()) {
            if (hVar != null) {
                Fragment k = hVar.k();
                if (k.L == i) {
                    return k;
                }
            }
        }
        return null;
    }

    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.a.get(size);
                if (fragment != null && str.equals(fragment.N)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (h hVar : this.b.values()) {
                if (hVar != null) {
                    Fragment k = hVar.k();
                    if (str.equals(k.N)) {
                        return k;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public Fragment i(String str) {
        Fragment m;
        for (h hVar : this.b.values()) {
            if (hVar != null && (m = hVar.k().m(str)) != null) {
                return m;
            }
        }
        return null;
    }

    public int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.V;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.a.indexOf(fragment);
        for (int i = indexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.a.get(i);
            if (fragment2.V == viewGroup && (view2 = fragment2.W) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.a.size()) {
                return -1;
            }
            Fragment fragment3 = this.a.get(indexOf);
            if (fragment3.V == viewGroup && (view = fragment3.W) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    public List<h> k() {
        ArrayList arrayList = new ArrayList();
        for (h hVar : this.b.values()) {
            if (hVar != null) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    public List<Fragment> l() {
        ArrayList arrayList = new ArrayList();
        Iterator<h> it = this.b.values().iterator();
        while (it.hasNext()) {
            h next = it.next();
            arrayList.add(next != null ? next.k() : null);
        }
        return arrayList;
    }

    public h m(String str) {
        return this.b.get(str);
    }

    public List<Fragment> n() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public v30 o() {
        return this.c;
    }

    public void p(h hVar) {
        Fragment k = hVar.k();
        if (c(k.u)) {
            return;
        }
        this.b.put(k.u, hVar);
        if (k.R) {
            if (k.Q) {
                this.c.e(k);
            } else {
                this.c.m(k);
            }
            k.R = false;
        }
        if (FragmentManager.E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Added fragment to active set ");
            sb.append(k);
        }
    }

    public void q(h hVar) {
        Fragment k = hVar.k();
        if (k.Q) {
            this.c.m(k);
        }
        if (this.b.put(k.u, null) != null && FragmentManager.E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Removed fragment from active set ");
            sb.append(k);
        }
    }

    public void r() {
        Iterator<Fragment> it = this.a.iterator();
        while (it.hasNext()) {
            h hVar = this.b.get(it.next().u);
            if (hVar != null) {
                hVar.m();
            }
        }
        for (h hVar2 : this.b.values()) {
            if (hVar2 != null) {
                hVar2.m();
                Fragment k = hVar2.k();
                if (k.B && !k.b0()) {
                    q(hVar2);
                }
            }
        }
    }

    public void s(Fragment fragment) {
        synchronized (this.a) {
            this.a.remove(fragment);
        }
        fragment.A = false;
    }

    public void t() {
        this.b.clear();
    }

    public void u(List<String> list) {
        this.a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment f = f(str);
                if (f == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.E0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("restoreSaveState: added (");
                    sb.append(str);
                    sb.append("): ");
                    sb.append(f);
                }
                a(f);
            }
        }
    }

    public ArrayList<FragmentState> v() {
        ArrayList<FragmentState> arrayList = new ArrayList<>(this.b.size());
        for (h hVar : this.b.values()) {
            if (hVar != null) {
                Fragment k = hVar.k();
                FragmentState r = hVar.r();
                arrayList.add(r);
                if (FragmentManager.E0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Saved state of ");
                    sb.append(k);
                    sb.append(": ");
                    sb.append(r.B);
                }
            }
        }
        return arrayList;
    }

    public ArrayList<String> w() {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.a.size());
            Iterator<Fragment> it = this.a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.u);
                if (FragmentManager.E0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("saveAllState: adding fragment (");
                    sb.append(next.u);
                    sb.append("): ");
                    sb.append(next);
                }
            }
            return arrayList;
        }
    }

    public void x(v30 v30Var) {
        this.c = v30Var;
    }
}
