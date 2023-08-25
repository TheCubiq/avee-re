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
/* renamed from: com.daaw.fi */
/* loaded from: classes2.dex */
public final class C1287fi<T> {

    /* renamed from: a */
    public final T f9613a;

    /* renamed from: b */
    public final InterfaceC1290c<T> f9614b;

    /* renamed from: com.daaw.fi$b */
    /* loaded from: classes2.dex */
    public static class C1289b implements InterfaceC1290c<Context> {

        /* renamed from: a */
        public final Class<? extends Service> f9615a;

        public C1289b(Class<? extends Service> cls) {
            this.f9615a = cls;
        }

        /* renamed from: b */
        public final Bundle m22628b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f9615a), 128);
                if (serviceInfo == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f9615a);
                    sb.append(" has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @Override // com.daaw.C1287fi.InterfaceC1290c
        /* renamed from: c */
        public List<String> mo22626a(Context context) {
            Bundle m22628b = m22628b(context);
            if (m22628b == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : m22628b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(m22628b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.daaw.fi$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC1290c<T> {
        /* renamed from: a */
        List<String> mo22626a(T t);
    }

    public C1287fi(T t, InterfaceC1290c<T> interfaceC1290c) {
        this.f9613a = t;
        this.f9614b = interfaceC1290c;
    }

    /* renamed from: c */
    public static C1287fi<Context> m22631c(Context context, Class<? extends Service> cls) {
        return new C1287fi<>(context, new C1289b(cls));
    }

    /* renamed from: d */
    public static ComponentRegistrar m22630d(String str) {
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

    /* renamed from: b */
    public List<b01<ComponentRegistrar>> m22632b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f9614b.mo22626a(this.f9613a)) {
            arrayList.add(new b01() { // from class: com.daaw.ei
                @Override // com.daaw.b01
                public final Object get() {
                    ComponentRegistrar m22630d;
                    m22630d = C1287fi.m22630d(str);
                    return m22630d;
                }
            });
        }
        return arrayList;
    }
}
