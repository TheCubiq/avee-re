package com.daaw;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.c;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class k81 {
    public static final b g = new b(null);
    public boolean b;
    public Bundle c;
    public boolean d;
    public Recreator.b e;
    public final v71<String, c> a = new v71<>();
    public boolean f = true;

    /* loaded from: classes.dex */
    public interface a {
        void a(m81 m81Var);
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(pq pqVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        Bundle a();
    }

    public static final void d(k81 k81Var, sj0 sj0Var, c.b bVar) {
        boolean z;
        ug0.f(k81Var, "this$0");
        ug0.f(sj0Var, "<anonymous parameter 0>");
        ug0.f(bVar, "event");
        if (bVar == c.b.ON_START) {
            z = true;
        } else if (bVar != c.b.ON_STOP) {
            return;
        } else {
            z = false;
        }
        k81Var.f = z;
    }

    public final Bundle b(String str) {
        ug0.f(str, "key");
        if (this.d) {
            Bundle bundle = this.c;
            if (bundle != null) {
                Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
                Bundle bundle3 = this.c;
                if (bundle3 != null) {
                    bundle3.remove(str);
                }
                Bundle bundle4 = this.c;
                boolean z = false;
                if (bundle4 != null && !bundle4.isEmpty()) {
                    z = true;
                }
                if (!z) {
                    this.c = null;
                }
                return bundle2;
            }
            return null;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final c c(String str) {
        ug0.f(str, "key");
        Iterator<Map.Entry<String, c>> it = this.a.iterator();
        while (it.hasNext()) {
            Map.Entry<String, c> next = it.next();
            ug0.e(next, "components");
            c value = next.getValue();
            if (ug0.a(next.getKey(), str)) {
                return value;
            }
        }
        return null;
    }

    public final void e(androidx.lifecycle.c cVar) {
        ug0.f(cVar, "lifecycle");
        if (!(!this.b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        cVar.a(new androidx.lifecycle.d() { // from class: com.daaw.j81
            @Override // androidx.lifecycle.d
            public final void a(sj0 sj0Var, c.b bVar) {
                k81.d(k81.this, sj0Var, bVar);
            }
        });
        this.b = true;
    }

    public final void f(Bundle bundle) {
        if (!this.b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!this.d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.d = true;
    }

    public final void g(Bundle bundle) {
        ug0.f(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        v71<String, c>.d f = this.a.f();
        ug0.e(f, "this.components.iteratorWithAdditions()");
        while (f.hasNext()) {
            Map.Entry next = f.next();
            bundle2.putBundle((String) next.getKey(), ((c) next.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public final void h(String str, c cVar) {
        ug0.f(str, "key");
        ug0.f(cVar, "provider");
        if (!(this.a.k(str, cVar) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void i(Class<? extends a> cls) {
        ug0.f(cls, "clazz");
        if (!this.f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.b bVar = this.e;
        if (bVar == null) {
            bVar = new Recreator.b(this);
        }
        this.e = bVar;
        try {
            cls.getDeclaredConstructor(new Class[0]);
            Recreator.b bVar2 = this.e;
            if (bVar2 != null) {
                String name = cls.getName();
                ug0.e(name, "clazz.name");
                bVar2.b(name);
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
