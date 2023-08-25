package com.daaw;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
/* loaded from: classes2.dex */
public final class n00 {

    /* renamed from: a */
    public static final n00 f19316a = new n00();

    /* renamed from: a */
    public final <S> S m15627a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    /* renamed from: b */
    public final <S> List<S> m15626b(Class<S> cls, ClassLoader classLoader) {
        try {
            return m15624d(cls, classLoader);
        } catch (Throwable unused) {
            return C2937sg.m10378m(ServiceLoader.load(cls, classLoader));
        }
    }

    /* renamed from: c */
    public final List<sm0> m15625c() {
        sm0 sm0Var;
        if (o00.m14661a()) {
            try {
                ArrayList arrayList = new ArrayList(2);
                sm0 sm0Var2 = null;
                try {
                    sm0Var = (sm0) sm0.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, sm0.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (ClassNotFoundException unused) {
                    sm0Var = null;
                }
                if (sm0Var != null) {
                    arrayList.add(sm0Var);
                }
                try {
                    sm0Var2 = (sm0) sm0.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, sm0.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (ClassNotFoundException unused2) {
                }
                if (sm0Var2 == null) {
                    return arrayList;
                }
                arrayList.add(sm0Var2);
                return arrayList;
            } catch (Throwable unused3) {
                return m15626b(sm0.class, sm0.class.getClassLoader());
            }
        }
        return m15626b(sm0.class, sm0.class.getClassLoader());
    }

    /* renamed from: d */
    public final <S> List<S> m15624d(Class<S> cls, ClassLoader classLoader) {
        ArrayList<URL> list = Collections.list(classLoader.getResources(ug0.m8262l("META-INF/services/", cls.getName())));
        ug0.m8269e(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            C2550pg.m13404i(arrayList, f19316a.m15623e(url));
        }
        Set<String> m10375p = C2937sg.m10375p(arrayList);
        if (!m10375p.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(C2037lg.m16966h(m10375p, 10));
            for (String str : m10375p) {
                arrayList2.add(f19316a.m15627a(str, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }

    /* renamed from: e */
    public final List<String> m15623e(URL url) {
        String url2 = url.toString();
        if (!nh1.m15177e(url2, "jar", false, 2, null)) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> m15622f = f19316a.m15622f(bufferedReader);
                C1080dg.m24422a(bufferedReader, null);
                return m15622f;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C1080dg.m24422a(bufferedReader, th);
                    throw th2;
                }
            }
        }
        String m14279z = oh1.m14279z(oh1.m14284u(url2, "jar:file:", null, 2, null), '!', null, 2, null);
        String m14284u = oh1.m14284u(url2, "!/", null, 2, null);
        JarFile jarFile = new JarFile(m14279z, false);
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(m14284u)), "UTF-8"));
            List<String> m15622f2 = f19316a.m15622f(bufferedReader2);
            C1080dg.m24422a(bufferedReader2, null);
            jarFile.close();
            return m15622f2;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                try {
                    jarFile.close();
                    throw th4;
                } catch (Throwable th5) {
                    C3651xy.m4411a(th3, th5);
                    throw th3;
                }
            }
        }
    }

    /* renamed from: f */
    public final List<String> m15622f(BufferedReader bufferedReader) {
        boolean z;
        boolean z2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return C2937sg.m10378m(linkedHashSet);
            }
            String obj = oh1.m14300B(oh1.m14301A(readLine, "#", null, 2, null)).toString();
            int i = 0;
            while (true) {
                if (i >= obj.length()) {
                    z = true;
                    break;
                }
                char charAt = obj.charAt(i);
                i++;
                if (charAt == '.' || Character.isJavaIdentifierPart(charAt)) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (!z2) {
                    z = false;
                    break;
                }
            }
            if (!z) {
                throw new IllegalArgumentException(ug0.m8262l("Illegal service provider class name: ", obj).toString());
            }
            if (obj.length() > 0) {
                linkedHashSet.add(obj);
            }
        }
    }
}
