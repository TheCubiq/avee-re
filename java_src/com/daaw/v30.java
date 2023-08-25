package com.daaw;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.daaw.jt1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class v30 extends ht1 {
    public static final jt1.b k = new a();
    public final boolean g;
    public final HashMap<String, Fragment> d = new HashMap<>();
    public final HashMap<String, v30> e = new HashMap<>();
    public final HashMap<String, mt1> f = new HashMap<>();
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;

    /* loaded from: classes.dex */
    public class a implements jt1.b {
        @Override // com.daaw.jt1.b
        public <T extends ht1> T a(Class<T> cls) {
            return new v30(true);
        }

        @Override // com.daaw.jt1.b
        public /* synthetic */ ht1 b(Class cls, hn hnVar) {
            return kt1.b(this, cls, hnVar);
        }
    }

    public v30(boolean z) {
        this.g = z;
    }

    public static v30 i(mt1 mt1Var) {
        return (v30) new jt1(mt1Var, k).a(v30.class);
    }

    @Override // com.daaw.ht1
    public void d() {
        if (FragmentManager.E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
        }
        this.h = true;
    }

    public void e(Fragment fragment) {
        if (this.j) {
            FragmentManager.E0(2);
        } else if (this.d.containsKey(fragment.u)) {
        } else {
            this.d.put(fragment.u, fragment);
            if (FragmentManager.E0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Updating retained Fragments: Added ");
                sb.append(fragment);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v30.class != obj.getClass()) {
            return false;
        }
        v30 v30Var = (v30) obj;
        return this.d.equals(v30Var.d) && this.e.equals(v30Var.e) && this.f.equals(v30Var.f);
    }

    public void f(Fragment fragment) {
        if (FragmentManager.E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for ");
            sb.append(fragment);
        }
        v30 v30Var = this.e.get(fragment.u);
        if (v30Var != null) {
            v30Var.d();
            this.e.remove(fragment.u);
        }
        mt1 mt1Var = this.f.get(fragment.u);
        if (mt1Var != null) {
            mt1Var.a();
            this.f.remove(fragment.u);
        }
    }

    public Fragment g(String str) {
        return this.d.get(str);
    }

    public v30 h(Fragment fragment) {
        v30 v30Var = this.e.get(fragment.u);
        if (v30Var == null) {
            v30 v30Var2 = new v30(this.g);
            this.e.put(fragment.u, v30Var2);
            return v30Var2;
        }
        return v30Var;
    }

    public int hashCode() {
        return (((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public Collection<Fragment> j() {
        return new ArrayList(this.d.values());
    }

    public mt1 k(Fragment fragment) {
        mt1 mt1Var = this.f.get(fragment.u);
        if (mt1Var == null) {
            mt1 mt1Var2 = new mt1();
            this.f.put(fragment.u, mt1Var2);
            return mt1Var2;
        }
        return mt1Var;
    }

    public boolean l() {
        return this.h;
    }

    public void m(Fragment fragment) {
        if (this.j) {
            FragmentManager.E0(2);
            return;
        }
        if ((this.d.remove(fragment.u) != null) && FragmentManager.E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Removed ");
            sb.append(fragment);
        }
    }

    public void n(boolean z) {
        this.j = z;
    }

    public boolean o(Fragment fragment) {
        if (this.d.containsKey(fragment.u)) {
            return this.g ? this.h : !this.i;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
