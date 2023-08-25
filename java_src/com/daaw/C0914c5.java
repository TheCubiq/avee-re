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
/* renamed from: com.daaw.c5 */
/* loaded from: classes.dex */
public final class C0914c5 {

    /* renamed from: d */
    public static volatile C0914c5 f5480d;

    /* renamed from: e */
    public static final Object f5481e = new Object();

    /* renamed from: c */
    public final Context f5484c;

    /* renamed from: b */
    public final Set<Class<? extends wf0<?>>> f5483b = new HashSet();

    /* renamed from: a */
    public final Map<Class<?>, Object> f5482a = new HashMap();

    public C0914c5(Context context) {
        this.f5484c = context.getApplicationContext();
    }

    /* renamed from: e */
    public static C0914c5 m25621e(Context context) {
        if (f5480d == null) {
            synchronized (f5481e) {
                if (f5480d == null) {
                    f5480d = new C0914c5(context);
                }
            }
        }
        return f5480d;
    }

    /* renamed from: a */
    public void m25625a() {
        try {
            try {
                jm1.m18417a("Startup");
                m25624b(this.f5484c.getPackageManager().getProviderInfo(new ComponentName(this.f5484c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e) {
                throw new if1(e);
            }
        } finally {
            jm1.m18416b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public void m25624b(Bundle bundle) {
        String string = this.f5484c.getString(d21.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (wf0.class.isAssignableFrom(cls)) {
                            this.f5483b.add(cls);
                        }
                    }
                }
                for (Class<? extends wf0<?>> cls2 : this.f5483b) {
                    m25622d(cls2, hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new if1(e);
            }
        }
    }

    /* renamed from: c */
    public <T> T m25623c(Class<? extends wf0<?>> cls) {
        T t;
        synchronized (f5481e) {
            t = (T) this.f5482a.get(cls);
            if (t == null) {
                t = (T) m25622d(cls, new HashSet());
            }
        }
        return t;
    }

    /* renamed from: d */
    public final <T> T m25622d(Class<? extends wf0<?>> cls, Set<Class<?>> set) {
        T t;
        if (jm1.m18414d()) {
            try {
                jm1.m18417a(cls.getSimpleName());
            } finally {
                jm1.m18416b();
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f5482a.containsKey(cls)) {
            t = (T) this.f5482a.get(cls);
        } else {
            set.add(cls);
            wf0<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            List<Class<? extends wf0<?>>> mo6098a = newInstance.mo6098a();
            if (!mo6098a.isEmpty()) {
                for (Class<? extends wf0<?>> cls2 : mo6098a) {
                    if (!this.f5482a.containsKey(cls2)) {
                        m25622d(cls2, set);
                    }
                }
            }
            t = (T) newInstance.mo6097b(this.f5484c);
            set.remove(cls);
            this.f5482a.put(cls, t);
        }
        return t;
    }

    /* renamed from: f */
    public <T> T m25620f(Class<? extends wf0<T>> cls) {
        return (T) m25623c(cls);
    }

    /* renamed from: g */
    public boolean m25619g(Class<? extends wf0<?>> cls) {
        return this.f5483b.contains(cls);
    }
}
