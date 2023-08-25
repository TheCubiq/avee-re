package com.daaw;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
/* loaded from: classes.dex */
public final class cr0 {
    public static final Set<File> a = new HashSet();
    public static final boolean b = n(System.getProperty("java.vm.version"));

    /* loaded from: classes.dex */
    public static final class a {
        public static void a(ClassLoader classLoader, List<? extends File> list, File file) {
            IOException[] iOExceptionArr;
            Object obj = cr0.g(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            cr0.f(obj, "dexElements", b(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    IOException iOException = (IOException) it.next();
                }
                Field g = cr0.g(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) g.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                g.set(obj, iOExceptionArr);
                IOException iOException2 = new IOException("I/O exception during makeDexElement");
                iOException2.initCause((Throwable) arrayList.get(0));
                throw iOException2;
            }
        }

        public static Object[] b(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) {
            return (Object[]) cr0.h(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, arrayList, file, arrayList2);
        }
    }

    public static void d(Context context) {
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        String str2;
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Clearing old secondary dex dir (");
            sb3.append(file.getPath());
            sb3.append(").");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Failed to list secondary dex dir content (");
                sb4.append(file.getPath());
                sb4.append(").");
                return;
            }
            for (File file2 : listFiles) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Trying to delete old file ");
                sb5.append(file2.getPath());
                sb5.append(" of size ");
                sb5.append(file2.length());
                if (file2.delete()) {
                    sb2 = new StringBuilder();
                    str2 = "Deleted old file ";
                } else {
                    sb2 = new StringBuilder();
                    str2 = "Failed to delete old file ";
                }
                sb2.append(str2);
                sb2.append(file2.getPath());
            }
            if (file.delete()) {
                sb = new StringBuilder();
                str = "Deleted old secondary dex dir ";
            } else {
                sb = new StringBuilder();
                str = "Failed to delete secondary dex dir ";
            }
            sb.append(str);
            sb.append(file.getPath());
        }
    }

    public static void e(Context context, File file, File file2, String str, String str2, boolean z) {
        Set<File> set = a;
        synchronized (set) {
            if (set.contains(file)) {
                return;
            }
            set.add(file);
            int i = Build.VERSION.SDK_INT;
            if (i > 20) {
                StringBuilder sb = new StringBuilder();
                sb.append("MultiDex is not guaranteed to work in SDK version ");
                sb.append(i);
                sb.append(": SDK version higher than ");
                sb.append(20);
                sb.append(" should be backed by ");
                sb.append("runtime with built-in multidex capabilty but it's not the ");
                sb.append("case here: java.vm.version=\"");
                sb.append(System.getProperty("java.vm.version"));
                sb.append("\"");
            }
            ClassLoader j = j(context);
            if (j == null) {
                return;
            }
            try {
                d(context);
            } catch (Throwable unused) {
            }
            File k = k(context, file2, str);
            dr0 dr0Var = new dr0(file, k);
            IOException e = null;
            try {
                m(j, k, dr0Var.K(context, str2, false));
            } catch (IOException e2) {
                if (!z) {
                    throw e2;
                }
                m(j, k, dr0Var.K(context, str2, true));
            }
            try {
                dr0Var.close();
            } catch (IOException e3) {
                e = e3;
            }
            if (e != null) {
                throw e;
            }
        }
    }

    public static void f(Object obj, String str, Object[] objArr) {
        Field g = g(obj, str);
        Object[] objArr2 = (Object[]) g.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        g.set(obj, objArr3);
    }

    public static Field g(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    public static Method h(Object obj, String str, Class<?>... clsArr) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    public static ApplicationInfo i(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static ClassLoader j(Context context) {
        ClassLoader classLoader;
        try {
            classLoader = context.getClassLoader();
        } catch (RuntimeException unused) {
        }
        if (classLoader instanceof BaseDexClassLoader) {
            return classLoader;
        }
        return null;
    }

    public static File k(Context context, File file, String str) {
        File file2 = new File(file, "code_cache");
        try {
            o(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), "code_cache");
            o(file2);
        }
        File file3 = new File(file2, str);
        o(file3);
        return file3;
    }

    public static void l(Context context) {
        if (b) {
            return;
        }
        try {
            ApplicationInfo i = i(context);
            if (i == null) {
                return;
            }
            e(context, new File(i.sourceDir), new File(i.dataDir), "secondary-dexes", "", true);
        } catch (Exception e) {
            throw new RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
        }
    }

    public static void m(ClassLoader classLoader, File file, List<? extends File> list) {
        if (list.isEmpty()) {
            return;
        }
        a.a(classLoader, list, file);
    }

    public static boolean n(String str) {
        boolean z = false;
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (nextToken != null && nextToken2 != null) {
                try {
                    int parseInt = Integer.parseInt(nextToken);
                    int parseInt2 = Integer.parseInt(nextToken2);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("VM with version ");
        sb.append(str);
        sb.append(z ? " has multidex support" : " does not have multidex support");
        return z;
    }

    public static void o(File file) {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to create dir ");
            sb.append(file.getPath());
            sb.append(". Parent file is null.");
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to create dir ");
            sb2.append(file.getPath());
            sb2.append(". parent file is a dir ");
            sb2.append(parentFile.isDirectory());
            sb2.append(", a file ");
            sb2.append(parentFile.isFile());
            sb2.append(", exists ");
            sb2.append(parentFile.exists());
            sb2.append(", readable ");
            sb2.append(parentFile.canRead());
            sb2.append(", writable ");
            sb2.append(parentFile.canWrite());
        }
        throw new IOException("Failed to create directory " + file.getPath());
    }
}
