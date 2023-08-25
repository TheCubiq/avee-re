package com.daaw;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class fi<T> {
    public final T a;
    public final c<T> b;

    /* loaded from: classes2.dex */
    public static class b implements c<Context> {
        public final Class<? extends Service> a;

        public b(Class<? extends Service> cls) {
            this.a = cls;
        }

        public final Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.a), 128);
                if (serviceInfo == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.a);
                    sb.append(" has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @Override // com.daaw.fi.c
        /* renamed from: c */
        public List<String> a(Context context) {
            Bundle b = b(context);
            if (b == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public interface c<T> {
        List<String> a(T t);
    }

    public fi(T t, c<T> cVar) {
        this.a = t;
        this.b = cVar;
    }

    public static fi<Context> c(Context context, Class<? extends Service> cls) {
        return new fi<>(context, new b(cls));
    }

    public static ComponentRegistrar d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new yg0(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            String.format("Class %s is not an found.", str);
            return null;
        } catch (IllegalAccessException e) {
            throw new yg0(String.format("Could not instantiate %s.", str), e);
        } catch (InstantiationException e2) {
            throw new yg0(String.format("Could not instantiate %s.", str), e2);
        } catch (NoSuchMethodException e3) {
            throw new yg0(String.format("Could not instantiate %s", str), e3);
        } catch (InvocationTargetException e4) {
            throw new yg0(String.format("Could not instantiate %s", str), e4);
        }
    }

    public List<b01<ComponentRegistrar>> b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.b.a(this.a)) {
            arrayList.add(new b01() { // from class: com.daaw.ei
                @Override // com.daaw.b01
                public final Object get() {
                    ComponentRegistrar d;
                    d = fi.d(str);
                    return d;
                }
            });
        }
        return arrayList;
    }
}
