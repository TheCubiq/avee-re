package androidx.lifecycle;

import com.daaw.o40;
import com.daaw.rj0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: androidx.lifecycle.f */
/* loaded from: classes.dex */
public class C0351f {

    /* renamed from: a */
    public static Map<Class<?>, Integer> f1769a = new HashMap();

    /* renamed from: b */
    public static Map<Class<?>, List<Constructor<? extends InterfaceC0343b>>> f1770b = new HashMap();

    /* renamed from: a */
    public static InterfaceC0343b m29031a(Constructor<? extends InterfaceC0343b> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    public static Constructor<? extends InterfaceC0343b> m29030b(Class<?> cls) {
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r0 != null ? r0.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String m29029c = m29029c(canonicalName);
            if (!name.isEmpty()) {
                m29029c = name + "." + m29029c;
            }
            Constructor declaredConstructor = Class.forName(m29029c).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static String m29029c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: d */
    public static int m29028d(Class<?> cls) {
        Integer num = f1769a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int m29025g = m29025g(cls);
        f1769a.put(cls, Integer.valueOf(m29025g));
        return m29025g;
    }

    /* renamed from: e */
    public static boolean m29027e(Class<?> cls) {
        return cls != null && rj0.class.isAssignableFrom(cls);
    }

    /* renamed from: f */
    public static InterfaceC0348d m29026f(Object obj) {
        boolean z = obj instanceof InterfaceC0348d;
        boolean z2 = obj instanceof o40;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((o40) obj, (InterfaceC0348d) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((o40) obj, null);
        }
        if (z) {
            return (InterfaceC0348d) obj;
        }
        Class<?> cls = obj.getClass();
        if (m29028d(cls) == 2) {
            List<Constructor<? extends InterfaceC0343b>> list = f1770b.get(cls);
            if (list.size() == 1) {
                return new SingleGeneratedAdapterObserver(m29031a(list.get(0), obj));
            }
            InterfaceC0343b[] interfaceC0343bArr = new InterfaceC0343b[list.size()];
            for (int i = 0; i < list.size(); i++) {
                interfaceC0343bArr[i] = m29031a(list.get(i), obj);
            }
            return new CompositeGeneratedAdaptersObserver(interfaceC0343bArr);
        }
        return new ReflectiveGenericLifecycleObserver(obj);
    }

    /* renamed from: g */
    public static int m29025g(Class<?> cls) {
        Class<?>[] interfaces;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends InterfaceC0343b> m29030b = m29030b(cls);
        if (m29030b != null) {
            f1770b.put(cls, Collections.singletonList(m29030b));
            return 2;
        } else if (C0340a.f1743c.m29058d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m29027e(superclass)) {
                if (m29028d(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f1770b.get(superclass));
            }
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (m29027e(cls2)) {
                    if (m29028d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f1770b.get(cls2));
                }
            }
            if (arrayList != null) {
                f1770b.put(cls, arrayList);
                return 2;
            }
            return 1;
        }
    }
}
