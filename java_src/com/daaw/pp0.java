package com.daaw;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class pp0 implements InterfaceC0828ba {

    /* renamed from: a */
    public final C2571a f23122a;

    /* renamed from: b */
    public final C1307fn f23123b;

    /* renamed from: c */
    public final Map<String, rn1> f23124c;

    /* renamed from: com.daaw.pp0$a */
    /* loaded from: classes.dex */
    public static class C2571a {

        /* renamed from: a */
        public final Context f23125a;

        /* renamed from: b */
        public Map<String, String> f23126b = null;

        public C2571a(Context context) {
            this.f23125a = context;
        }

        /* renamed from: d */
        public static Bundle m13242d(Context context) {
            ServiceInfo serviceInfo;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128)) == null) {
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: a */
        public final Map<String, String> m13245a(Context context) {
            Bundle m13242d = m13242d(context);
            if (m13242d == null) {
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : m13242d.keySet()) {
                Object obj = m13242d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        /* renamed from: b */
        public InterfaceC0612aa m13244b(String str) {
            String str2 = m13243c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (InterfaceC0612aa) Class.forName(str2).asSubclass(InterfaceC0612aa.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                String.format("Class %s is not found.", str2);
                return null;
            } catch (IllegalAccessException unused2) {
                String.format("Could not instantiate %s.", str2);
                return null;
            } catch (InstantiationException unused3) {
                String.format("Could not instantiate %s.", str2);
                return null;
            } catch (NoSuchMethodException unused4) {
                String.format("Could not instantiate %s", str2);
                return null;
            } catch (InvocationTargetException unused5) {
                String.format("Could not instantiate %s", str2);
                return null;
            }
        }

        /* renamed from: c */
        public final Map<String, String> m13243c() {
            if (this.f23126b == null) {
                this.f23126b = m13245a(this.f23125a);
            }
            return this.f23126b;
        }
    }

    public pp0(Context context, C1307fn c1307fn) {
        this(new C2571a(context), c1307fn);
    }

    public pp0(C2571a c2571a, C1307fn c1307fn) {
        this.f23124c = new HashMap();
        this.f23122a = c2571a;
        this.f23123b = c1307fn;
    }

    @Override // com.daaw.InterfaceC0828ba
    /* renamed from: a */
    public synchronized rn1 mo13246a(String str) {
        if (this.f23124c.containsKey(str)) {
            return this.f23124c.get(str);
        }
        InterfaceC0612aa m13244b = this.f23122a.m13244b(str);
        if (m13244b == null) {
            return null;
        }
        rn1 create = m13244b.create(this.f23123b.m22483a(str));
        this.f23124c.put(str, create);
        return create;
    }
}
