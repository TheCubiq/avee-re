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
    public static final n00 a = new n00();

    public final <S> S a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    public final <S> List<S> b(Class<S> cls, ClassLoader classLoader) {
        try {
            return d(cls, classLoader);
        } catch (Throwable unused) {
            return sg.m(ServiceLoader.load(cls, classLoader));
        }
    }

    public final List<sm0> c() {
        sm0 sm0Var;
        if (o00.a()) {
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
                return b(sm0.class, sm0.class.getClassLoader());
            }
        }
        return b(sm0.class, sm0.class.getClassLoader());
    }

    public final <S> List<S> d(Class<S> cls, ClassLoader classLoader) {
        ArrayList<URL> list = Collections.list(classLoader.getResources(ug0.l("META-INF/services/", cls.getName())));
        ug0.e(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            pg.i(arrayList, a.e(url));
        }
        Set<String> p = sg.p(arrayList);
        if (!p.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(lg.h(p, 10));
            for (String str : p) {
                arrayList2.add(a.a(str, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }

    public final List<String> e(URL url) {
        String url2 = url.toString();
        if (!nh1.e(url2, "jar", false, 2, null)) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> f = a.f(bufferedReader);
                dg.a(bufferedReader, null);
                return f;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    dg.a(bufferedReader, th);
                    throw th2;
                }
            }
        }
        String z = oh1.z(oh1.u(url2, "jar:file:", null, 2, null), '!', null, 2, null);
        String u = oh1.u(url2, "!/", null, 2, null);
        JarFile jarFile = new JarFile(z, false);
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(u)), "UTF-8"));
            List<String> f2 = a.f(bufferedReader2);
            dg.a(bufferedReader2, null);
            jarFile.close();
            return f2;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                try {
                    jarFile.close();
                    throw th4;
                } catch (Throwable th5) {
                    xy.a(th3, th5);
                    throw th3;
                }
            }
        }
    }

    public final List<String> f(BufferedReader bufferedReader) {
        boolean z;
        boolean z2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return sg.m(linkedHashSet);
            }
            String obj = oh1.B(oh1.A(readLine, "#", null, 2, null)).toString();
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
                throw new IllegalArgumentException(ug0.l("Illegal service provider class name: ", obj).toString());
            }
            if (obj.length() > 0) {
                linkedHashSet.add(obj);
            }
        }
    }
}
