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
/* renamed from: androidx.fragment.app.i */
/* loaded from: classes.dex */
public class C0313i {

    /* renamed from: a */
    public final ArrayList<Fragment> f1608a = new ArrayList<>();

    /* renamed from: b */
    public final HashMap<String, C0310h> f1609b = new HashMap<>();

    /* renamed from: c */
    public v30 f1610c;

    /* renamed from: a */
    public void m29175a(Fragment fragment) {
        if (this.f1608a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f1608a) {
            this.f1608a.add(fragment);
        }
        fragment.f1354A = true;
    }

    /* renamed from: b */
    public void m29174b() {
        this.f1609b.values().removeAll(Collections.singleton(null));
    }

    /* renamed from: c */
    public boolean m29173c(String str) {
        return this.f1609b.get(str) != null;
    }

    /* renamed from: d */
    public void m29172d(int i) {
        for (C0310h c0310h : this.f1609b.values()) {
            if (c0310h != null) {
                c0310h.m29178t(i);
            }
        }
    }

    /* renamed from: e */
    public void m29171e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f1609b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0310h c0310h : this.f1609b.values()) {
                printWriter.print(str);
                if (c0310h != null) {
                    Fragment m29187k = c0310h.m29187k();
                    printWriter.println(m29187k);
                    m29187k.mo25243k(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f1608a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f1608a.get(i).toString());
            }
        }
    }

    /* renamed from: f */
    public Fragment m29170f(String str) {
        C0310h c0310h = this.f1609b.get(str);
        if (c0310h != null) {
            return c0310h.m29187k();
        }
        return null;
    }

    /* renamed from: g */
    public Fragment m29169g(int i) {
        for (int size = this.f1608a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f1608a.get(size);
            if (fragment != null && fragment.f1365L == i) {
                return fragment;
            }
        }
        for (C0310h c0310h : this.f1609b.values()) {
            if (c0310h != null) {
                Fragment m29187k = c0310h.m29187k();
                if (m29187k.f1365L == i) {
                    return m29187k;
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    public Fragment m29168h(String str) {
        if (str != null) {
            for (int size = this.f1608a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f1608a.get(size);
                if (fragment != null && str.equals(fragment.f1367N)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (C0310h c0310h : this.f1609b.values()) {
                if (c0310h != null) {
                    Fragment m29187k = c0310h.m29187k();
                    if (str.equals(m29187k.f1367N)) {
                        return m29187k;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: i */
    public Fragment m29167i(String str) {
        Fragment m29427m;
        for (C0310h c0310h : this.f1609b.values()) {
            if (c0310h != null && (m29427m = c0310h.m29187k().m29427m(str)) != null) {
                return m29427m;
            }
        }
        return null;
    }

    /* renamed from: j */
    public int m29166j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.f1375V;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f1608a.indexOf(fragment);
        for (int i = indexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.f1608a.get(i);
            if (fragment2.f1375V == viewGroup && (view2 = fragment2.f1376W) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f1608a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f1608a.get(indexOf);
            if (fragment3.f1375V == viewGroup && (view = fragment3.f1376W) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* renamed from: k */
    public List<C0310h> m29165k() {
        ArrayList arrayList = new ArrayList();
        for (C0310h c0310h : this.f1609b.values()) {
            if (c0310h != null) {
                arrayList.add(c0310h);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public List<Fragment> m29164l() {
        ArrayList arrayList = new ArrayList();
        Iterator<C0310h> it = this.f1609b.values().iterator();
        while (it.hasNext()) {
            C0310h next = it.next();
            arrayList.add(next != null ? next.m29187k() : null);
        }
        return arrayList;
    }

    /* renamed from: m */
    public C0310h m29163m(String str) {
        return this.f1609b.get(str);
    }

    /* renamed from: n */
    public List<Fragment> m29162n() {
        ArrayList arrayList;
        if (this.f1608a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f1608a) {
            arrayList = new ArrayList(this.f1608a);
        }
        return arrayList;
    }

    /* renamed from: o */
    public v30 m29161o() {
        return this.f1610c;
    }

    /* renamed from: p */
    public void m29160p(C0310h c0310h) {
        Fragment m29187k = c0310h.m29187k();
        if (m29173c(m29187k.f1400u)) {
            return;
        }
        this.f1609b.put(m29187k.f1400u, c0310h);
        if (m29187k.f1371R) {
            if (m29187k.f1370Q) {
                this.f1610c.m7530e(m29187k);
            } else {
                this.f1610c.m7522m(m29187k);
            }
            m29187k.f1371R = false;
        }
        if (FragmentManager.m29381E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Added fragment to active set ");
            sb.append(m29187k);
        }
    }

    /* renamed from: q */
    public void m29159q(C0310h c0310h) {
        Fragment m29187k = c0310h.m29187k();
        if (m29187k.f1370Q) {
            this.f1610c.m7522m(m29187k);
        }
        if (this.f1609b.put(m29187k.f1400u, null) != null && FragmentManager.m29381E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Removed fragment from active set ");
            sb.append(m29187k);
        }
    }

    /* renamed from: r */
    public void m29158r() {
        Iterator<Fragment> it = this.f1608a.iterator();
        while (it.hasNext()) {
            C0310h c0310h = this.f1609b.get(it.next().f1400u);
            if (c0310h != null) {
                c0310h.m29185m();
            }
        }
        for (C0310h c0310h2 : this.f1609b.values()) {
            if (c0310h2 != null) {
                c0310h2.m29185m();
                Fragment m29187k = c0310h2.m29187k();
                if (m29187k.f1355B && !m29187k.m29448b0()) {
                    m29159q(c0310h2);
                }
            }
        }
    }

    /* renamed from: s */
    public void m29157s(Fragment fragment) {
        synchronized (this.f1608a) {
            this.f1608a.remove(fragment);
        }
        fragment.f1354A = false;
    }

    /* renamed from: t */
    public void m29156t() {
        this.f1609b.clear();
    }

    /* renamed from: u */
    public void m29155u(List<String> list) {
        this.f1608a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment m29170f = m29170f(str);
                if (m29170f == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.m29381E0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("restoreSaveState: added (");
                    sb.append(str);
                    sb.append("): ");
                    sb.append(m29170f);
                }
                m29175a(m29170f);
            }
        }
    }

    /* renamed from: v */
    public ArrayList<FragmentState> m29154v() {
        ArrayList<FragmentState> arrayList = new ArrayList<>(this.f1609b.size());
        for (C0310h c0310h : this.f1609b.values()) {
            if (c0310h != null) {
                Fragment m29187k = c0310h.m29187k();
                FragmentState m29180r = c0310h.m29180r();
                arrayList.add(m29180r);
                if (FragmentManager.m29381E0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Saved state of ");
                    sb.append(m29187k);
                    sb.append(": ");
                    sb.append(m29180r.f1513B);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: w */
    public ArrayList<String> m29153w() {
        synchronized (this.f1608a) {
            if (this.f1608a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f1608a.size());
            Iterator<Fragment> it = this.f1608a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f1400u);
                if (FragmentManager.m29381E0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("saveAllState: adding fragment (");
                    sb.append(next.f1400u);
                    sb.append("): ");
                    sb.append(next);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: x */
    public void m29152x(v30 v30Var) {
        this.f1610c = v30Var;
    }
}
