package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import com.daaw.el4;
import com.daaw.lo8;
import com.daaw.nm8;
import com.daaw.nt0;
import com.daaw.ot0;
import com.daaw.ry0;
import com.daaw.sh8;
import com.daaw.wp8;
import com.daaw.x70;
import com.daaw.xl;
import com.daaw.yd0;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class DynamiteModule {
    @GuardedBy("DynamiteModule.class")
    public static Boolean h = null;
    @GuardedBy("DynamiteModule.class")
    public static String i = null;
    @GuardedBy("DynamiteModule.class")
    public static boolean j = false;
    @GuardedBy("DynamiteModule.class")
    public static int k = -1;
    @GuardedBy("DynamiteModule.class")
    public static Boolean l;
    @GuardedBy("DynamiteModule.class")
    public static lo8 q;
    @GuardedBy("DynamiteModule.class")
    public static wp8 r;
    public final Context a;
    public static final ThreadLocal m = new ThreadLocal();
    public static final ThreadLocal n = new el4();
    public static final b.a o = new com.google.android.gms.dynamite.a();
    public static final b b = new com.google.android.gms.dynamite.b();
    public static final b c = new c();
    public static final b d = new d();
    public static final b e = new e();
    public static final b f = new f();
    public static final b g = new g();
    public static final b p = new h();

    @DynamiteApi
    /* loaded from: classes.dex */
    public static class DynamiteLoaderClassLoader {
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    /* loaded from: classes.dex */
    public static class a extends Exception {
        public /* synthetic */ a(String str, nm8 nm8Var) {
            super(str);
        }

        public /* synthetic */ a(String str, Throwable th, nm8 nm8Var) {
            super(str, th);
        }
    }

    /* loaded from: classes.dex */
    public interface b {

        /* loaded from: classes.dex */
        public interface a {
            int a(Context context, String str, boolean z);

            int b(Context context, String str);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0097b {
            public int a = 0;
            public int b = 0;
            public int c = 0;
        }

        C0097b a(Context context, String str, a aVar);
    }

    public DynamiteModule(Context context) {
        ry0.j(context);
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (ot0.a(declaredField.get(null), str)) {
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
        } catch (Exception e2) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage()));
            return 0;
        }
    }

    public static int c(Context context, String str) {
        return f(context, str, false);
    }

    public static DynamiteModule e(Context context, b bVar, String str) {
        Boolean bool;
        yd0 j3;
        DynamiteModule dynamiteModule;
        wp8 wp8Var;
        Boolean valueOf;
        ThreadLocal threadLocal = m;
        sh8 sh8Var = (sh8) threadLocal.get();
        sh8 sh8Var2 = new sh8(null);
        threadLocal.set(sh8Var2);
        ThreadLocal threadLocal2 = n;
        long longValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            b.C0097b a2 = bVar.a(context, str, o);
            int i2 = a2.a;
            int i3 = a2.b;
            StringBuilder sb = new StringBuilder();
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i2);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i3);
            int i4 = a2.c;
            if (i4 != 0) {
                if (i4 == -1) {
                    if (a2.a != 0) {
                        i4 = -1;
                    }
                }
                if (i4 != 1 || a2.b != 0) {
                    if (i4 == -1) {
                        DynamiteModule h2 = h(context, str);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = sh8Var2.a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(sh8Var);
                        return h2;
                    } else if (i4 != 1) {
                        throw new a("VersionPolicy returned invalid code:" + i4, null);
                    } else {
                        try {
                            int i5 = a2.b;
                            try {
                                synchronized (DynamiteModule.class) {
                                    if (!k(context)) {
                                        throw new a("Remote loading disabled", null);
                                    }
                                    bool = h;
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Selected remote version of ");
                                        sb2.append(str);
                                        sb2.append(", version >= ");
                                        sb2.append(i5);
                                        synchronized (DynamiteModule.class) {
                                            wp8Var = r;
                                        }
                                        if (wp8Var == null) {
                                            throw new a("DynamiteLoaderV2 was not cached.", null);
                                        }
                                        sh8 sh8Var3 = (sh8) threadLocal.get();
                                        if (sh8Var3 == null || sh8Var3.a == null) {
                                            throw new a("No result cursor", null);
                                        }
                                        Context applicationContext = context.getApplicationContext();
                                        Cursor cursor2 = sh8Var3.a;
                                        nt0.g3(null);
                                        synchronized (DynamiteModule.class) {
                                            valueOf = Boolean.valueOf(k >= 2);
                                        }
                                        Context context2 = (Context) nt0.M(valueOf.booleanValue() ? wp8Var.g3(nt0.g3(applicationContext), str, i5, nt0.g3(cursor2)) : wp8Var.M(nt0.g3(applicationContext), str, i5, nt0.g3(cursor2)));
                                        if (context2 == null) {
                                            throw new a("Failed to get module context", null);
                                        }
                                        dynamiteModule = new DynamiteModule(context2);
                                    } else {
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("Selected remote version of ");
                                        sb3.append(str);
                                        sb3.append(", version >= ");
                                        sb3.append(i5);
                                        lo8 l2 = l(context);
                                        if (l2 == null) {
                                            throw new a("Failed to create IDynamiteLoader.", null);
                                        }
                                        int zze = l2.zze();
                                        if (zze >= 3) {
                                            sh8 sh8Var4 = (sh8) threadLocal.get();
                                            if (sh8Var4 == null) {
                                                throw new a("No cached result cursor holder", null);
                                            }
                                            j3 = l2.i3(nt0.g3(context), str, i5, nt0.g3(sh8Var4.a));
                                        } else {
                                            j3 = zze == 2 ? l2.j3(nt0.g3(context), str, i5) : l2.h3(nt0.g3(context), str, i5);
                                        }
                                        Object M = nt0.M(j3);
                                        if (M == null) {
                                            throw new a("Failed to load remote module.", null);
                                        }
                                        dynamiteModule = new DynamiteModule((Context) M);
                                    }
                                    if (longValue == 0) {
                                        threadLocal2.remove();
                                    } else {
                                        threadLocal2.set(Long.valueOf(longValue));
                                    }
                                    Cursor cursor3 = sh8Var2.a;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    threadLocal.set(sh8Var);
                                    return dynamiteModule;
                                }
                                throw new a("Failed to determine which loading route to use.", null);
                            } catch (RemoteException e2) {
                                throw new a("Failed to load remote module.", e2, null);
                            } catch (a e3) {
                                throw e3;
                            } catch (Throwable th) {
                                xl.a(context, th);
                                throw new a("Failed to load remote module.", th, null);
                            }
                        } catch (a e4) {
                            String message = e4.getMessage();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Failed to load remote module: ");
                            sb4.append(message);
                            int i6 = a2.a;
                            if (i6 == 0 || bVar.a(context, str, new i(i6, 0)).c != -1) {
                                throw new a("Remote load failed. No local fallback found.", e4, null);
                            }
                            DynamiteModule h3 = h(context, str);
                            int i7 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                            ThreadLocal threadLocal3 = n;
                            if (i7 == 0) {
                                threadLocal3.remove();
                            } else {
                                threadLocal3.set(Long.valueOf(longValue));
                            }
                            Cursor cursor4 = sh8Var2.a;
                            if (cursor4 != null) {
                                cursor4.close();
                            }
                            m.set(sh8Var);
                            return h3;
                        }
                    }
                }
            }
            int i8 = a2.a;
            int i9 = a2.b;
            throw new a("No acceptable module " + str + " found. Local version is " + i8 + " and remote version is " + i9 + ".", null);
        } catch (Throwable th2) {
            int i10 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
            ThreadLocal threadLocal4 = n;
            if (i10 == 0) {
                threadLocal4.remove();
            } else {
                threadLocal4.set(Long.valueOf(longValue));
            }
            Cursor cursor5 = sh8Var2.a;
            if (cursor5 != null) {
                cursor5.close();
            }
            m.set(sh8Var);
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x013d, code lost:
        if (j(r11) != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int f(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.f(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
        r10.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c2  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int g(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            r0 = 0
            java.lang.ThreadLocal r1 = com.google.android.gms.dynamite.DynamiteModule.n     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L19
            r10 = r4
        L19:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            r12.<init>()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            android.net.Uri r4 = r10.build()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            if (r10 == 0) goto La3
            boolean r11 = r10.moveToFirst()     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lbe
            if (r11 == 0) goto La3
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lbe
            if (r12 <= 0) goto L8e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lbe
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.dynamite.DynamiteModule.i = r2     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 < 0) goto L6f
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.dynamite.DynamiteModule.k = r2     // Catch: java.lang.Throwable -> L8b
        L6f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader2"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 < 0) goto L82
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L7e
            goto L7f
        L7e:
            r9 = 0
        L7f:
            com.google.android.gms.dynamite.DynamiteModule.j = r9     // Catch: java.lang.Throwable -> L8b
            r11 = r9
        L82:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8b
            boolean r1 = j(r10)     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lbe
            if (r1 == 0) goto L8e
            r10 = r0
            goto L8e
        L8b:
            r11 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8b
            throw r11     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lbe
        L8e:
            if (r13 == 0) goto L9d
            if (r11 != 0) goto L93
            goto L9d
        L93:
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lbe
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lbe
            throw r11     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lbe
        L9b:
            r11 = move-exception
            goto Lb1
        L9d:
            if (r10 == 0) goto La2
            r10.close()
        La2:
            return r12
        La3:
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lbe
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lbe
            throw r11     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lbe
        Lab:
            r10 = move-exception
            r11 = r10
            goto Lc0
        Lae:
            r10 = move-exception
            r11 = r10
            r10 = r0
        Lb1:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.a     // Catch: java.lang.Throwable -> Lbe
            if (r12 == 0) goto Lb6
            throw r11     // Catch: java.lang.Throwable -> Lbe
        Lb6:
            com.google.android.gms.dynamite.DynamiteModule$a r12 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r13 = "V2 version check failed"
            r12.<init>(r13, r11, r0)     // Catch: java.lang.Throwable -> Lbe
            throw r12     // Catch: java.lang.Throwable -> Lbe
        Lbe:
            r11 = move-exception
            r0 = r10
        Lc0:
            if (r0 == 0) goto Lc5
            r0.close()
        Lc5:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    public static DynamiteModule h(Context context, String str) {
        "Selected local version of ".concat(String.valueOf(str));
        return new DynamiteModule(context.getApplicationContext());
    }

    @GuardedBy("DynamiteModule.class")
    public static void i(ClassLoader classLoader) {
        wp8 wp8Var;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                wp8Var = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                wp8Var = queryLocalInterface instanceof wp8 ? (wp8) queryLocalInterface : new wp8(iBinder);
            }
            r = wp8Var;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new a("Failed to instantiate dynamite loader", e2, null);
        }
    }

    public static boolean j(Cursor cursor) {
        sh8 sh8Var = (sh8) m.get();
        if (sh8Var == null || sh8Var.a != null) {
            return false;
        }
        sh8Var.a = cursor;
        return true;
    }

    @GuardedBy("DynamiteModule.class")
    public static boolean k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(l)) {
            return true;
        }
        boolean z = false;
        if (l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (x70.f().h(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            l = valueOf;
            z = valueOf.booleanValue();
            if (z && resolveContentProvider != null && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                j = true;
            }
        }
        return z;
    }

    public static lo8 l(Context context) {
        lo8 lo8Var;
        synchronized (DynamiteModule.class) {
            lo8 lo8Var2 = q;
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
                    q = lo8Var;
                    return lo8Var;
                }
            } catch (Exception e2) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
            }
            return null;
        }
    }

    public Context b() {
        return this.a;
    }

    public IBinder d(String str) {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e2, null);
        }
    }
}
