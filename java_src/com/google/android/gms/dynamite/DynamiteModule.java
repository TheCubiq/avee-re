package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import com.daaw.C3554xl;
import com.daaw.el4;
import com.daaw.fs3;
import com.daaw.lo8;
import com.daaw.nm8;
import com.daaw.nt0;
import com.daaw.ot0;
import com.daaw.ry0;
import com.daaw.sh8;
import com.daaw.sx2;
import com.daaw.wp8;
import com.daaw.x70;
import com.daaw.yd0;
import com.google.android.gms.common.util.DynamiteApi;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class DynamiteModule {
    @GuardedBy("DynamiteModule.class")

    /* renamed from: h */
    public static Boolean f36684h = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: i */
    public static String f36685i = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: j */
    public static boolean f36686j = false;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: k */
    public static int f36687k = -1;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: l */
    public static Boolean f36688l;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: q */
    public static lo8 f36693q;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: r */
    public static wp8 f36694r;

    /* renamed from: a */
    public final Context f36695a;

    /* renamed from: m */
    public static final ThreadLocal f36689m = new ThreadLocal();

    /* renamed from: n */
    public static final ThreadLocal f36690n = new el4();

    /* renamed from: o */
    public static final InterfaceC3993b.InterfaceC3994a f36691o = new C3996a();

    /* renamed from: b */
    public static final InterfaceC3993b f36678b = new C3997b();

    /* renamed from: c */
    public static final InterfaceC3993b f36679c = new C3998c();

    /* renamed from: d */
    public static final InterfaceC3993b f36680d = new C3999d();

    /* renamed from: e */
    public static final InterfaceC3993b f36681e = new C4000e();

    /* renamed from: f */
    public static final InterfaceC3993b f36682f = new C4001f();

    /* renamed from: g */
    public static final InterfaceC3993b f36683g = new C4002g();

    /* renamed from: p */
    public static final InterfaceC3993b f36692p = new C4003h();

    @DynamiteApi
    /* loaded from: classes.dex */
    public static class DynamiteLoaderClassLoader {
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    /* loaded from: classes.dex */
    public static class C3992a extends Exception {
        public /* synthetic */ C3992a(String str, nm8 nm8Var) {
            super(str);
        }

        public /* synthetic */ C3992a(String str, Throwable th, nm8 nm8Var) {
            super(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    /* loaded from: classes.dex */
    public interface InterfaceC3993b {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$a */
        /* loaded from: classes.dex */
        public interface InterfaceC3994a {
            /* renamed from: a */
            int mo1136a(Context context, String str, boolean z);

            /* renamed from: b */
            int mo1135b(Context context, String str);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b */
        /* loaded from: classes.dex */
        public static class C3995b {

            /* renamed from: a */
            public int f36696a = 0;

            /* renamed from: b */
            public int f36697b = 0;

            /* renamed from: c */
            public int f36698c = 0;
        }

        /* renamed from: a */
        C3995b mo1137a(Context context, String str, InterfaceC3994a interfaceC3994a);
    }

    public DynamiteModule(Context context) {
        ry0.m10830j(context);
        this.f36695a = context;
    }

    /* renamed from: a */
    public static int m1149a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (ot0.m13981a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb = new StringBuilder();
            sb.append("Module descriptor id '");
            sb.append(valueOf);
            sb.append("' didn't match expected id '");
            sb.append(str);
            sb.append("'");
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Local module descriptor class for ");
            sb2.append(str);
            sb2.append(" not found.");
            return 0;
        } catch (Exception e) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage()));
            return 0;
        }
    }

    /* renamed from: c */
    public static int m1147c(Context context, String str) {
        return m1144f(context, str, false);
    }

    /* renamed from: e */
    public static DynamiteModule m1145e(Context context, InterfaceC3993b interfaceC3993b, String str) {
        Boolean bool;
        yd0 m16698j3;
        DynamiteModule dynamiteModule;
        wp8 wp8Var;
        Boolean valueOf;
        ThreadLocal threadLocal = f36689m;
        sh8 sh8Var = (sh8) threadLocal.get();
        sh8 sh8Var2 = new sh8(null);
        threadLocal.set(sh8Var2);
        ThreadLocal threadLocal2 = f36690n;
        long longValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            InterfaceC3993b.C3995b mo1137a = interfaceC3993b.mo1137a(context, str, f36691o);
            int i = mo1137a.f36696a;
            int i2 = mo1137a.f36697b;
            StringBuilder sb = new StringBuilder();
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i2);
            int i3 = mo1137a.f36698c;
            if (i3 != 0) {
                if (i3 == -1) {
                    if (mo1137a.f36696a != 0) {
                        i3 = -1;
                    }
                }
                if (i3 != 1 || mo1137a.f36697b != 0) {
                    if (i3 == -1) {
                        DynamiteModule m1142h = m1142h(context, str);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = sh8Var2.f26256a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(sh8Var);
                        return m1142h;
                    } else if (i3 != 1) {
                        throw new C3992a("VersionPolicy returned invalid code:" + i3, null);
                    } else {
                        try {
                            int i4 = mo1137a.f36697b;
                            try {
                                synchronized (DynamiteModule.class) {
                                    if (!m1139k(context)) {
                                        throw new C3992a("Remote loading disabled", null);
                                    }
                                    bool = f36684h;
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Selected remote version of ");
                                        sb2.append(str);
                                        sb2.append(", version >= ");
                                        sb2.append(i4);
                                        synchronized (DynamiteModule.class) {
                                            wp8Var = f36694r;
                                        }
                                        if (wp8Var == null) {
                                            throw new C3992a("DynamiteLoaderV2 was not cached.", null);
                                        }
                                        sh8 sh8Var3 = (sh8) threadLocal.get();
                                        if (sh8Var3 == null || sh8Var3.f26256a == null) {
                                            throw new C3992a("No result cursor", null);
                                        }
                                        Context applicationContext = context.getApplicationContext();
                                        Cursor cursor2 = sh8Var3.f26256a;
                                        nt0.m14830g3(null);
                                        synchronized (DynamiteModule.class) {
                                            valueOf = Boolean.valueOf(f36687k >= 2);
                                        }
                                        Context context2 = (Context) nt0.m14831M(valueOf.booleanValue() ? wp8Var.m5867g3(nt0.m14830g3(applicationContext), str, i4, nt0.m14830g3(cursor2)) : wp8Var.m5868M(nt0.m14830g3(applicationContext), str, i4, nt0.m14830g3(cursor2)));
                                        if (context2 == null) {
                                            throw new C3992a("Failed to get module context", null);
                                        }
                                        dynamiteModule = new DynamiteModule(context2);
                                    } else {
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("Selected remote version of ");
                                        sb3.append(str);
                                        sb3.append(", version >= ");
                                        sb3.append(i4);
                                        lo8 m1138l = m1138l(context);
                                        if (m1138l == null) {
                                            throw new C3992a("Failed to create IDynamiteLoader.", null);
                                        }
                                        int zze = m1138l.zze();
                                        if (zze >= 3) {
                                            sh8 sh8Var4 = (sh8) threadLocal.get();
                                            if (sh8Var4 == null) {
                                                throw new C3992a("No cached result cursor holder", null);
                                            }
                                            m16698j3 = m1138l.m16699i3(nt0.m14830g3(context), str, i4, nt0.m14830g3(sh8Var4.f26256a));
                                        } else {
                                            m16698j3 = zze == 2 ? m1138l.m16698j3(nt0.m14830g3(context), str, i4) : m1138l.m16700h3(nt0.m14830g3(context), str, i4);
                                        }
                                        Object m14831M = nt0.m14831M(m16698j3);
                                        if (m14831M == null) {
                                            throw new C3992a("Failed to load remote module.", null);
                                        }
                                        dynamiteModule = new DynamiteModule((Context) m14831M);
                                    }
                                    if (longValue == 0) {
                                        threadLocal2.remove();
                                    } else {
                                        threadLocal2.set(Long.valueOf(longValue));
                                    }
                                    Cursor cursor3 = sh8Var2.f26256a;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    threadLocal.set(sh8Var);
                                    return dynamiteModule;
                                }
                                throw new C3992a("Failed to determine which loading route to use.", null);
                            } catch (RemoteException e) {
                                throw new C3992a("Failed to load remote module.", e, null);
                            } catch (C3992a e2) {
                                throw e2;
                            } catch (Throwable th) {
                                C3554xl.m5017a(context, th);
                                throw new C3992a("Failed to load remote module.", th, null);
                            }
                        } catch (C3992a e3) {
                            String message = e3.getMessage();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Failed to load remote module: ");
                            sb4.append(message);
                            int i5 = mo1137a.f36696a;
                            if (i5 == 0 || interfaceC3993b.mo1137a(context, str, new C4004i(i5, 0)).f36698c != -1) {
                                throw new C3992a("Remote load failed. No local fallback found.", e3, null);
                            }
                            DynamiteModule m1142h2 = m1142h(context, str);
                            int i6 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                            ThreadLocal threadLocal3 = f36690n;
                            if (i6 == 0) {
                                threadLocal3.remove();
                            } else {
                                threadLocal3.set(Long.valueOf(longValue));
                            }
                            Cursor cursor4 = sh8Var2.f26256a;
                            if (cursor4 != null) {
                                cursor4.close();
                            }
                            f36689m.set(sh8Var);
                            return m1142h2;
                        }
                    }
                }
            }
            int i7 = mo1137a.f36696a;
            int i8 = mo1137a.f36697b;
            throw new C3992a("No acceptable module " + str + " found. Local version is " + i7 + " and remote version is " + i8 + ".", null);
        } catch (Throwable th2) {
            int i9 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
            ThreadLocal threadLocal4 = f36690n;
            if (i9 == 0) {
                threadLocal4.remove();
            } else {
                threadLocal4.set(Long.valueOf(longValue));
            }
            Cursor cursor5 = sh8Var2.f26256a;
            if (cursor5 != null) {
                cursor5.close();
            }
            f36689m.set(sh8Var);
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x013d, code lost:
        if (m1140j(r11) != false) goto L36;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m1144f(Context context, String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException e;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f36684h;
                Cursor cursor2 = null;
                int i = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        String obj = e2.toString();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to load module via V2: ");
                        sb.append(obj);
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader != ClassLoader.getSystemClassLoader()) {
                            if (classLoader != null) {
                                try {
                                    m1141i(classLoader);
                                } catch (C3992a unused) {
                                }
                                bool = Boolean.TRUE;
                                f36684h = bool;
                            } else if (!m1139k(context)) {
                                return 0;
                            } else {
                                if (!f36686j) {
                                    Boolean bool2 = Boolean.TRUE;
                                    if (!bool2.equals(null)) {
                                        try {
                                            int m1143g = m1143g(context, str, z, true);
                                            String str2 = f36685i;
                                            if (str2 != null && !str2.isEmpty()) {
                                                ClassLoader m9787a = sx2.m9787a();
                                                if (m9787a == null) {
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        String str3 = f36685i;
                                                        ry0.m10830j(str3);
                                                        m9787a = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                    } else {
                                                        String str4 = f36685i;
                                                        ry0.m10830j(str4);
                                                        m9787a = new fs3(str4, ClassLoader.getSystemClassLoader());
                                                    }
                                                }
                                                m1141i(m9787a);
                                                declaredField.set(null, m9787a);
                                                f36684h = bool2;
                                                return m1143g;
                                            }
                                            return m1143g;
                                        } catch (C3992a unused2) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        }
                                    }
                                }
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                            }
                        }
                        bool = Boolean.FALSE;
                        f36684h = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return m1143g(context, str, z, false);
                    } catch (C3992a e3) {
                        String message = e3.getMessage();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Failed to retrieve remote module version: ");
                        sb2.append(message);
                        return 0;
                    }
                }
                lo8 m1138l = m1138l(context);
                if (m1138l != null) {
                    try {
                        try {
                            int zze = m1138l.zze();
                            if (zze >= 3) {
                                sh8 sh8Var = (sh8) f36689m.get();
                                if (sh8Var == null || (cursor = sh8Var.f26256a) == null) {
                                    Cursor cursor3 = (Cursor) nt0.m14831M(m1138l.m16697k3(nt0.m14830g3(context), str, z, ((Long) f36690n.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i2 = cursor3.getInt(0);
                                                if (i2 > 0) {
                                                }
                                                cursor2 = cursor3;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                i = i2;
                                            }
                                        } catch (RemoteException e4) {
                                            e = e4;
                                            cursor2 = cursor3;
                                            String message2 = e.getMessage();
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append("Failed to retrieve remote module version: ");
                                            sb3.append(message2);
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            return i;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                } else {
                                    i = cursor.getInt(0);
                                }
                            } else {
                                i = zze == 2 ? m1138l.m16701g3(nt0.m14830g3(context), str, z) : m1138l.m16702M(nt0.m14830g3(context), str, z);
                            }
                        } catch (RemoteException e5) {
                            e = e5;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                return i;
            }
        } catch (Throwable th4) {
            C3554xl.m5017a(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
        r10.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c2  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m1143g(Context context, String str, boolean z, boolean z2) {
        Throwable th;
        Exception e;
        ?? r0 = 0;
        try {
            try {
                boolean z3 = true;
                Cursor query = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) f36690n.get()).longValue())).build(), null, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            boolean z4 = false;
                            int i = query.getInt(0);
                            if (i > 0) {
                                synchronized (DynamiteModule.class) {
                                    f36685i = query.getString(2);
                                    int columnIndex = query.getColumnIndex("loaderVersion");
                                    if (columnIndex >= 0) {
                                        f36687k = query.getInt(columnIndex);
                                    }
                                    int columnIndex2 = query.getColumnIndex("disableStandaloneDynamiteLoader2");
                                    if (columnIndex2 >= 0) {
                                        if (query.getInt(columnIndex2) == 0) {
                                            z3 = false;
                                        }
                                        f36686j = z3;
                                        z4 = z3;
                                    }
                                }
                                if (m1140j(query)) {
                                    query = null;
                                }
                            }
                            if (z2 && z4) {
                                throw new C3992a("forcing fallback to container DynamiteLoader impl", null);
                            }
                            return i;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        if (e instanceof C3992a) {
                            throw e;
                        }
                        throw new C3992a("V2 version check failed", e, null);
                    }
                }
                throw new C3992a("Failed to connect to dynamite module ContentResolver.", null);
            } catch (Throwable th2) {
                th = th2;
                r0 = context;
                if (r0 != 0) {
                    r0.close();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
        } catch (Throwable th3) {
            th = th3;
            if (r0 != 0) {
            }
            throw th;
        }
    }

    /* renamed from: h */
    public static DynamiteModule m1142h(Context context, String str) {
        "Selected local version of ".concat(String.valueOf(str));
        return new DynamiteModule(context.getApplicationContext());
    }

    @GuardedBy("DynamiteModule.class")
    /* renamed from: i */
    public static void m1141i(ClassLoader classLoader) {
        wp8 wp8Var;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                wp8Var = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                wp8Var = queryLocalInterface instanceof wp8 ? (wp8) queryLocalInterface : new wp8(iBinder);
            }
            f36694r = wp8Var;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new C3992a("Failed to instantiate dynamite loader", e, null);
        }
    }

    /* renamed from: j */
    public static boolean m1140j(Cursor cursor) {
        sh8 sh8Var = (sh8) f36689m.get();
        if (sh8Var == null || sh8Var.f26256a != null) {
            return false;
        }
        sh8Var.f26256a = cursor;
        return true;
    }

    @GuardedBy("DynamiteModule.class")
    /* renamed from: k */
    public static boolean m1139k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f36688l)) {
            return true;
        }
        boolean z = false;
        if (f36688l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (x70.m5492f().mo5490h(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            f36688l = valueOf;
            z = valueOf.booleanValue();
            if (z && resolveContentProvider != null && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                f36686j = true;
            }
        }
        return z;
    }

    /* renamed from: l */
    public static lo8 m1138l(Context context) {
        lo8 lo8Var;
        synchronized (DynamiteModule.class) {
            lo8 lo8Var2 = f36693q;
            if (lo8Var2 != null) {
                return lo8Var2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    lo8Var = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    lo8Var = queryLocalInterface instanceof lo8 ? (lo8) queryLocalInterface : new lo8(iBinder);
                }
                if (lo8Var != null) {
                    f36693q = lo8Var;
                    return lo8Var;
                }
            } catch (Exception e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
            }
            return null;
        }
    }

    /* renamed from: b */
    public Context m1148b() {
        return this.f36695a;
    }

    /* renamed from: d */
    public IBinder m1146d(String str) {
        try {
            return (IBinder) this.f36695a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new C3992a("Failed to instantiate module class: ".concat(String.valueOf(str)), e, null);
        }
    }
}
