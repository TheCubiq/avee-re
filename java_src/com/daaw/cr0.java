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

    /* renamed from: a */
    public static final Set<File> f6108a = new HashSet();

    /* renamed from: b */
    public static final boolean f6109b = m25083n(System.getProperty("java.vm.version"));

    /* renamed from: com.daaw.cr0$a */
    /* loaded from: classes.dex */
    public static final class C0990a {
        /* renamed from: a */
        public static void m25081a(ClassLoader classLoader, List<? extends File> list, File file) {
            IOException[] iOExceptionArr;
            Object obj = cr0.m25090g(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            cr0.m25091f(obj, "dexElements", m25080b(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    IOException iOException = (IOException) it.next();
                }
                Field m25090g = cr0.m25090g(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) m25090g.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                m25090g.set(obj, iOExceptionArr);
                IOException iOException2 = new IOException("I/O exception during makeDexElement");
                iOException2.initCause((Throwable) arrayList.get(0));
                throw iOException2;
            }
        }

        /* renamed from: b */
        public static Object[] m25080b(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) {
            return (Object[]) cr0.m25089h(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, arrayList, file, arrayList2);
        }
    }

    /* renamed from: d */
    public static void m25093d(Context context) {
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

    /* renamed from: e */
    public static void m25092e(Context context, File file, File file2, String str, String str2, boolean z) {
        Set<File> set = f6108a;
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
            ClassLoader m25087j = m25087j(context);
            if (m25087j == null) {
                return;
            }
            try {
                m25093d(context);
            } catch (Throwable unused) {
            }
            File m25086k = m25086k(context, file2, str);
            dr0 dr0Var = new dr0(file, m25086k);
            IOException e = null;
            try {
                m25084m(m25087j, m25086k, dr0Var.m24074K(context, str2, false));
            } catch (IOException e2) {
                if (!z) {
                    throw e2;
                }
                m25084m(m25087j, m25086k, dr0Var.m24074K(context, str2, true));
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

    /* renamed from: f */
    public static void m25091f(Object obj, String str, Object[] objArr) {
        Field m25090g = m25090g(obj, str);
        Object[] objArr2 = (Object[]) m25090g.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        m25090g.set(obj, objArr3);
    }

    /* renamed from: g */
    public static Field m25090g(Object obj, String str) {
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

    /* renamed from: h */
    public static Method m25089h(Object obj, String str, Class<?>... clsArr) {
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

    /* renamed from: i */
    public static ApplicationInfo m25088i(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static ClassLoader m25087j(Context context) {
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

    /* renamed from: k */
    public static File m25086k(Context context, File file, String str) {
        File file2 = new File(file, "code_cache");
        try {
            m25082o(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), "code_cache");
            m25082o(file2);
        }
        File file3 = new File(file2, str);
        m25082o(file3);
        return file3;
    }

    /* renamed from: l */
    public static void m25085l(Context context) {
        if (f6109b) {
            return;
        }
        try {
            ApplicationInfo m25088i = m25088i(context);
            if (m25088i == null) {
                return;
            }
            m25092e(context, new File(m25088i.sourceDir), new File(m25088i.dataDir), "secondary-dexes", "", true);
        } catch (Exception e) {
            throw new RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
        }
    }

    /* renamed from: m */
    public static void m25084m(ClassLoader classLoader, File file, List<? extends File> list) {
        if (list.isEmpty()) {
            return;
        }
        C0990a.m25081a(classLoader, list, file);
    }

    /* renamed from: n */
    public static boolean m25083n(String str) {
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

    /* renamed from: o */
    public static void m25082o(File file) {
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
