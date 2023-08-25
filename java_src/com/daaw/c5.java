package com.daaw;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class c5 {
    public static volatile c5 d;
    public static final Object e = new Object();
    public final Context c;
    public final Set<Class<? extends wf0<?>>> b = new HashSet();
    public final Map<Class<?>, Object> a = new HashMap();

    public c5(Context context) {
        this.c = context.getApplicationContext();
    }

    public static c5 e(Context context) {
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = new c5(context);
                }
            }
        }
        return d;
    }

    public void a() {
        try {
            try {
                jm1.a("Startup");
                b(this.c.getPackageManager().getProviderInfo(new ComponentName(this.c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e2) {
                throw new if1(e2);
            }
        } finally {
            jm1.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(Bundle bundle) {
        String string = this.c.getString(d21.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (wf0.class.isAssignableFrom(cls)) {
                            this.b.add(cls);
                        }
                    }
                }
                for (Class<? extends wf0<?>> cls2 : this.b) {
                    d(cls2, hashSet);
                }
            } catch (ClassNotFoundException e2) {
                throw new if1(e2);
            }
        }
    }

    public <T> T c(Class<? extends wf0<?>> cls) {
        T t;
        synchronized (e) {
            t = (T) this.a.get(cls);
            if (t == null) {
                t = (T) d(cls, new HashSet());
            }
        }
        return t;
    }

    public final <T> T d(Class<? extends wf0<?>> cls, Set<Class<?>> set) {
        T t;
        if (jm1.d()) {
            try {
                jm1.a(cls.getSimpleName());
            } finally {
                jm1.b();
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.a.containsKey(cls)) {
            t = (T) this.a.get(cls);
        } else {
            set.add(cls);
            wf0<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            List<Class<? extends wf0<?>>> a = newInstance.a();
            if (!a.isEmpty()) {
                for (Class<? extends wf0<?>> cls2 : a) {
                    if (!this.a.containsKey(cls2)) {
                        d(cls2, set);
                    }
                }
            }
            t = (T) newInstance.b(this.c);
            set.remove(cls);
            this.a.put(cls, t);
        }
        return t;
    }

    public <T> T f(Class<? extends wf0<T>> cls) {
        return (T) c(cls);
    }

    public boolean g(Class<? extends wf0<?>> cls) {
        return this.b.contains(cls);
    }
}
