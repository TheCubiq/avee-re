package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.c;
import androidx.lifecycle.d;
import com.daaw.k81;
import com.daaw.m81;
import com.daaw.pq;
import com.daaw.sj0;
import com.daaw.ug0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class Recreator implements d {
    public static final a b = new a(null);
    public final m81 a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(pq pqVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements k81.c {
        public final Set<String> a;

        public b(k81 k81Var) {
            ug0.f(k81Var, "registry");
            this.a = new LinkedHashSet();
            k81Var.h("androidx.savedstate.Restarter", this);
        }

        @Override // com.daaw.k81.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.a));
            return bundle;
        }

        public final void b(String str) {
            ug0.f(str, "className");
            this.a.add(str);
        }
    }

    public Recreator(m81 m81Var) {
        ug0.f(m81Var, "owner");
        this.a = m81Var;
    }

    @Override // androidx.lifecycle.d
    public void a(sj0 sj0Var, c.b bVar) {
        ug0.f(sj0Var, "source");
        ug0.f(bVar, "event");
        if (bVar != c.b.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        sj0Var.a().c(this);
        Bundle b2 = this.a.i().b("androidx.savedstate.Restarter");
        if (b2 == null) {
            return;
        }
        ArrayList<String> stringArrayList = b2.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            h(str);
        }
    }

    public final void h(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(k81.a.class);
            ug0.e(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    ug0.e(newInstance, "{\n                constr…wInstance()\n            }");
                    ((k81.a) newInstance).a(this.a);
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
