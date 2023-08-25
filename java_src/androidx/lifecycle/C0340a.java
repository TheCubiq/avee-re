package androidx.lifecycle;

import androidx.lifecycle.AbstractC0344c;
import com.daaw.sj0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Deprecated
/* renamed from: androidx.lifecycle.a */
/* loaded from: classes.dex */
public final class C0340a {

    /* renamed from: c */
    public static C0340a f1743c = new C0340a();

    /* renamed from: a */
    public final Map<Class<?>, C0341a> f1744a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, Boolean> f1745b = new HashMap();

    @Deprecated
    /* renamed from: androidx.lifecycle.a$a */
    /* loaded from: classes.dex */
    public static class C0341a {

        /* renamed from: a */
        public final Map<AbstractC0344c.EnumC0346b, List<C0342b>> f1746a = new HashMap();

        /* renamed from: b */
        public final Map<C0342b, AbstractC0344c.EnumC0346b> f1747b;

        public C0341a(Map<C0342b, AbstractC0344c.EnumC0346b> map) {
            this.f1747b = map;
            for (Map.Entry<C0342b, AbstractC0344c.EnumC0346b> entry : map.entrySet()) {
                AbstractC0344c.EnumC0346b value = entry.getValue();
                List<C0342b> list = this.f1746a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f1746a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        /* renamed from: b */
        public static void m29055b(List<C0342b> list, sj0 sj0Var, AbstractC0344c.EnumC0346b enumC0346b, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).m29054a(sj0Var, enumC0346b, obj);
                }
            }
        }

        /* renamed from: a */
        public void m29056a(sj0 sj0Var, AbstractC0344c.EnumC0346b enumC0346b, Object obj) {
            m29055b(this.f1746a.get(enumC0346b), sj0Var, enumC0346b, obj);
            m29055b(this.f1746a.get(AbstractC0344c.EnumC0346b.ON_ANY), sj0Var, enumC0346b, obj);
        }
    }

    @Deprecated
    /* renamed from: androidx.lifecycle.a$b */
    /* loaded from: classes.dex */
    public static final class C0342b {

        /* renamed from: a */
        public final int f1748a;

        /* renamed from: b */
        public final Method f1749b;

        public C0342b(int i, Method method) {
            this.f1748a = i;
            this.f1749b = method;
            method.setAccessible(true);
        }

        /* renamed from: a */
        public void m29054a(sj0 sj0Var, AbstractC0344c.EnumC0346b enumC0346b, Object obj) {
            try {
                int i = this.f1748a;
                if (i == 0) {
                    this.f1749b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f1749b.invoke(obj, sj0Var);
                } else if (i != 2) {
                } else {
                    this.f1749b.invoke(obj, sj0Var, enumC0346b);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0342b) {
                C0342b c0342b = (C0342b) obj;
                return this.f1748a == c0342b.f1748a && this.f1749b.getName().equals(c0342b.f1749b.getName());
            }
            return false;
        }

        public int hashCode() {
            return (this.f1748a * 31) + this.f1749b.getName().hashCode();
        }
    }

    /* renamed from: a */
    public final C0341a m29061a(Class<?> cls, Method[] methodArr) {
        int i;
        C0341a m29059c;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (m29059c = m29059c(superclass)) != null) {
            hashMap.putAll(m29059c.f1747b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C0342b, AbstractC0344c.EnumC0346b> entry : m29059c(cls2).f1747b.entrySet()) {
                m29057e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m29060b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC0352g interfaceC0352g = (InterfaceC0352g) method.getAnnotation(InterfaceC0352g.class);
            if (interfaceC0352g != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (!parameterTypes[0].isAssignableFrom(sj0.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i = 1;
                }
                AbstractC0344c.EnumC0346b value = interfaceC0352g.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(AbstractC0344c.EnumC0346b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != AbstractC0344c.EnumC0346b.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m29057e(hashMap, new C0342b(i, method), value, cls);
                z = true;
            }
        }
        C0341a c0341a = new C0341a(hashMap);
        this.f1744a.put(cls, c0341a);
        this.f1745b.put(cls, Boolean.valueOf(z));
        return c0341a;
    }

    /* renamed from: b */
    public final Method[] m29060b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: c */
    public C0341a m29059c(Class<?> cls) {
        C0341a c0341a = this.f1744a.get(cls);
        return c0341a != null ? c0341a : m29061a(cls, null);
    }

    /* renamed from: d */
    public boolean m29058d(Class<?> cls) {
        Boolean bool = this.f1745b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] m29060b = m29060b(cls);
        for (Method method : m29060b) {
            if (((InterfaceC0352g) method.getAnnotation(InterfaceC0352g.class)) != null) {
                m29061a(cls, m29060b);
                return true;
            }
        }
        this.f1745b.put(cls, Boolean.FALSE);
        return false;
    }

    /* renamed from: e */
    public final void m29057e(Map<C0342b, AbstractC0344c.EnumC0346b> map, C0342b c0342b, AbstractC0344c.EnumC0346b enumC0346b, Class<?> cls) {
        AbstractC0344c.EnumC0346b enumC0346b2 = map.get(c0342b);
        if (enumC0346b2 == null || enumC0346b == enumC0346b2) {
            if (enumC0346b2 == null) {
                map.put(c0342b, enumC0346b);
                return;
            }
            return;
        }
        Method method = c0342b.f1749b;
        throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0346b2 + ", new value " + enumC0346b);
    }
}
