package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0344c;
import androidx.lifecycle.InterfaceC0348d;
import com.daaw.C2575pq;
import com.daaw.k81;
import com.daaw.m81;
import com.daaw.sj0;
import com.daaw.ug0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class Recreator implements InterfaceC0348d {

    /* renamed from: b */
    public static final C0484a f2331b = new C0484a(null);

    /* renamed from: a */
    public final m81 f2332a;

    /* renamed from: androidx.savedstate.Recreator$a */
    /* loaded from: classes.dex */
    public static final class C0484a {
        public C0484a() {
        }

        public /* synthetic */ C0484a(C2575pq c2575pq) {
            this();
        }
    }

    /* renamed from: androidx.savedstate.Recreator$b */
    /* loaded from: classes.dex */
    public static final class C0485b implements k81.InterfaceC1922c {

        /* renamed from: a */
        public final Set<String> f2333a;

        public C0485b(k81 k81Var) {
            ug0.m8268f(k81Var, "registry");
            this.f2333a = new LinkedHashSet();
            k81Var.m17966h("androidx.savedstate.Restarter", this);
        }

        @Override // com.daaw.k81.InterfaceC1922c
        /* renamed from: a */
        public Bundle mo5117a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f2333a));
            return bundle;
        }

        /* renamed from: b */
        public final void m28062b(String str) {
            ug0.m8268f(str, "className");
            this.f2333a.add(str);
        }
    }

    public Recreator(m81 m81Var) {
        ug0.m8268f(m81Var, "owner");
        this.f2332a = m81Var;
    }

    @Override // androidx.lifecycle.InterfaceC0348d
    /* renamed from: a */
    public void mo18735a(sj0 sj0Var, AbstractC0344c.EnumC0346b enumC0346b) {
        ug0.m8268f(sj0Var, "source");
        ug0.m8268f(enumC0346b, "event");
        if (enumC0346b != AbstractC0344c.EnumC0346b.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        sj0Var.mo2327a().mo29046c(this);
        Bundle m17972b = this.f2332a.mo16178i().m17972b("androidx.savedstate.Restarter");
        if (m17972b == null) {
            return;
        }
        ArrayList<String> stringArrayList = m17972b.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            m28063h(str);
        }
    }

    /* renamed from: h */
    public final void m28063h(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(k81.InterfaceC1920a.class);
            ug0.m8269e(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    ug0.m8269e(newInstance, "{\n                constr…wInstance()\n            }");
                    ((k81.InterfaceC1920a) newInstance).mo17964a(this.f2332a);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }
}
