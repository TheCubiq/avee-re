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

    /* renamed from: k */
    public static final jt1.InterfaceC1864b f29797k = new C3279a();

    /* renamed from: g */
    public final boolean f29801g;

    /* renamed from: d */
    public final HashMap<String, Fragment> f29798d = new HashMap<>();

    /* renamed from: e */
    public final HashMap<String, v30> f29799e = new HashMap<>();

    /* renamed from: f */
    public final HashMap<String, mt1> f29800f = new HashMap<>();

    /* renamed from: h */
    public boolean f29802h = false;

    /* renamed from: i */
    public boolean f29803i = false;

    /* renamed from: j */
    public boolean f29804j = false;

    /* renamed from: com.daaw.v30$a */
    /* loaded from: classes.dex */
    public class C3279a implements jt1.InterfaceC1864b {
        @Override // com.daaw.jt1.InterfaceC1864b
        /* renamed from: a */
        public <T extends ht1> T mo5153a(Class<T> cls) {
            return new v30(true);
        }

        @Override // com.daaw.jt1.InterfaceC1864b
        /* renamed from: b */
        public /* synthetic */ ht1 mo5152b(Class cls, AbstractC1589hn abstractC1589hn) {
            return kt1.m17441b(this, cls, abstractC1589hn);
        }
    }

    public v30(boolean z) {
        this.f29801g = z;
    }

    /* renamed from: i */
    public static v30 m7526i(mt1 mt1Var) {
        return (v30) new jt1(mt1Var, f29797k).m18255a(v30.class);
    }

    @Override // com.daaw.ht1
    /* renamed from: d */
    public void mo7531d() {
        if (FragmentManager.m29381E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
        }
        this.f29802h = true;
    }

    /* renamed from: e */
    public void m7530e(Fragment fragment) {
        if (this.f29804j) {
            FragmentManager.m29381E0(2);
        } else if (this.f29798d.containsKey(fragment.f1400u)) {
        } else {
            this.f29798d.put(fragment.f1400u, fragment);
            if (FragmentManager.m29381E0(2)) {
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
        return this.f29798d.equals(v30Var.f29798d) && this.f29799e.equals(v30Var.f29799e) && this.f29800f.equals(v30Var.f29800f);
    }

    /* renamed from: f */
    public void m7529f(Fragment fragment) {
        if (FragmentManager.m29381E0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for ");
            sb.append(fragment);
        }
        v30 v30Var = this.f29799e.get(fragment.f1400u);
        if (v30Var != null) {
            v30Var.mo7531d();
            this.f29799e.remove(fragment.f1400u);
        }
        mt1 mt1Var = this.f29800f.get(fragment.f1400u);
        if (mt1Var != null) {
            mt1Var.m15778a();
            this.f29800f.remove(fragment.f1400u);
        }
    }

    /* renamed from: g */
    public Fragment m7528g(String str) {
        return this.f29798d.get(str);
    }

    /* renamed from: h */
    public v30 m7527h(Fragment fragment) {
        v30 v30Var = this.f29799e.get(fragment.f1400u);
        if (v30Var == null) {
            v30 v30Var2 = new v30(this.f29801g);
            this.f29799e.put(fragment.f1400u, v30Var2);
            return v30Var2;
        }
        return v30Var;
    }

    public int hashCode() {
        return (((this.f29798d.hashCode() * 31) + this.f29799e.hashCode()) * 31) + this.f29800f.hashCode();
    }

    /* renamed from: j */
    public Collection<Fragment> m7525j() {
        return new ArrayList(this.f29798d.values());
    }

    /* renamed from: k */
    public mt1 m7524k(Fragment fragment) {
        mt1 mt1Var = this.f29800f.get(fragment.f1400u);
        if (mt1Var == null) {
            mt1 mt1Var2 = new mt1();
            this.f29800f.put(fragment.f1400u, mt1Var2);
            return mt1Var2;
        }
        return mt1Var;
    }

    /* renamed from: l */
    public boolean m7523l() {
        return this.f29802h;
    }

    /* renamed from: m */
    public void m7522m(Fragment fragment) {
        if (this.f29804j) {
            FragmentManager.m29381E0(2);
            return;
        }
        if ((this.f29798d.remove(fragment.f1400u) != null) && FragmentManager.m29381E0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Removed ");
            sb.append(fragment);
        }
    }

    /* renamed from: n */
    public void m7521n(boolean z) {
        this.f29804j = z;
    }

    /* renamed from: o */
    public boolean m7520o(Fragment fragment) {
        if (this.f29798d.containsKey(fragment.f1400u)) {
            return this.f29801g ? this.f29802h : !this.f29803i;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f29798d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f29799e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f29800f.keySet().iterator();
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
