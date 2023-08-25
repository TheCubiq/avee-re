package com.daaw;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0344c;
import androidx.lifecycle.InterfaceC0348d;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class k81 {

    /* renamed from: g */
    public static final C1921b f15781g = new C1921b(null);

    /* renamed from: b */
    public boolean f15783b;

    /* renamed from: c */
    public Bundle f15784c;

    /* renamed from: d */
    public boolean f15785d;

    /* renamed from: e */
    public Recreator.C0485b f15786e;

    /* renamed from: a */
    public final v71<String, InterfaceC1922c> f15782a = new v71<>();

    /* renamed from: f */
    public boolean f15787f = true;

    /* renamed from: com.daaw.k81$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1920a {
        /* renamed from: a */
        void mo17964a(m81 m81Var);
    }

    /* renamed from: com.daaw.k81$b */
    /* loaded from: classes.dex */
    public static final class C1921b {
        public C1921b() {
        }

        public /* synthetic */ C1921b(C2575pq c2575pq) {
            this();
        }
    }

    /* renamed from: com.daaw.k81$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1922c {
        /* renamed from: a */
        Bundle mo5117a();
    }

    /* renamed from: d */
    public static final void m17970d(k81 k81Var, sj0 sj0Var, AbstractC0344c.EnumC0346b enumC0346b) {
        boolean z;
        ug0.m8268f(k81Var, "this$0");
        ug0.m8268f(sj0Var, "<anonymous parameter 0>");
        ug0.m8268f(enumC0346b, "event");
        if (enumC0346b == AbstractC0344c.EnumC0346b.ON_START) {
            z = true;
        } else if (enumC0346b != AbstractC0344c.EnumC0346b.ON_STOP) {
            return;
        } else {
            z = false;
        }
        k81Var.f15787f = z;
    }

    /* renamed from: b */
    public final Bundle m17972b(String str) {
        ug0.m8268f(str, "key");
        if (this.f15785d) {
            Bundle bundle = this.f15784c;
            if (bundle != null) {
                Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
                Bundle bundle3 = this.f15784c;
                if (bundle3 != null) {
                    bundle3.remove(str);
                }
                Bundle bundle4 = this.f15784c;
                boolean z = false;
                if (bundle4 != null && !bundle4.isEmpty()) {
                    z = true;
                }
                if (!z) {
                    this.f15784c = null;
                }
                return bundle2;
            }
            return null;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    /* renamed from: c */
    public final InterfaceC1922c m17971c(String str) {
        ug0.m8268f(str, "key");
        Iterator<Map.Entry<String, InterfaceC1922c>> it = this.f15782a.iterator();
        while (it.hasNext()) {
            Map.Entry<String, InterfaceC1922c> next = it.next();
            ug0.m8269e(next, "components");
            InterfaceC1922c value = next.getValue();
            if (ug0.m8273a(next.getKey(), str)) {
                return value;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m17969e(AbstractC0344c abstractC0344c) {
        ug0.m8268f(abstractC0344c, "lifecycle");
        if (!(!this.f15783b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        abstractC0344c.mo29048a(new InterfaceC0348d() { // from class: com.daaw.j81
            @Override // androidx.lifecycle.InterfaceC0348d
            /* renamed from: a */
            public final void mo18735a(sj0 sj0Var, AbstractC0344c.EnumC0346b enumC0346b) {
                k81.m17970d(k81.this, sj0Var, enumC0346b);
            }
        });
        this.f15783b = true;
    }

    /* renamed from: f */
    public final void m17968f(Bundle bundle) {
        if (!this.f15783b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!this.f15785d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.f15784c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f15785d = true;
    }

    /* renamed from: g */
    public final void m17967g(Bundle bundle) {
        ug0.m8268f(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f15784c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        v71<String, InterfaceC1922c>.C3311d m7373f = this.f15782a.m7373f();
        ug0.m8269e(m7373f, "this.components.iteratorWithAdditions()");
        while (m7373f.hasNext()) {
            Map.Entry next = m7373f.next();
            bundle2.putBundle((String) next.getKey(), ((InterfaceC1922c) next.getValue()).mo5117a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* renamed from: h */
    public final void m17966h(String str, InterfaceC1922c interfaceC1922c) {
        ug0.m8268f(str, "key");
        ug0.m8268f(interfaceC1922c, "provider");
        if (!(this.f15782a.mo7370k(str, interfaceC1922c) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    /* renamed from: i */
    public final void m17965i(Class<? extends InterfaceC1920a> cls) {
        ug0.m8268f(cls, "clazz");
        if (!this.f15787f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.C0485b c0485b = this.f15786e;
        if (c0485b == null) {
            c0485b = new Recreator.C0485b(this);
        }
        this.f15786e = c0485b;
        try {
            cls.getDeclaredConstructor(new Class[0]);
            Recreator.C0485b c0485b2 = this.f15786e;
            if (c0485b2 != null) {
                String name = cls.getName();
                ug0.m8269e(name, "clazz.name");
                c0485b2.m28062b(name);
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
