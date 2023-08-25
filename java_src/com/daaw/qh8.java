package com.daaw;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import org.conscrypt.EvpMdRef;
/* loaded from: classes.dex */
public final class qh8 {

    /* renamed from: e */
    public static volatile e92 f23969e;

    /* renamed from: g */
    public static Context f23971g;

    /* renamed from: a */
    public static final yc8 f23965a = new w76(l68.m17120M("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b */
    public static final yc8 f23966b = new r07(l68.m17120M("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c */
    public static final yc8 f23967c = new ku7(l68.m17120M("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d */
    public static final yc8 f23968d = new f38(l68.m17120M("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f */
    public static final Object f23970f = new Object();

    /* renamed from: a */
    public static fx8 m12514a(String str, l68 l68Var, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m12509f(str, l68Var, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: b */
    public static fx8 m12513b(String str, boolean z, boolean z2, boolean z3) {
        return m12508g(str, z, false, false, true);
    }

    /* renamed from: c */
    public static /* synthetic */ String m12512c(boolean z, String str, l68 l68Var) {
        String str2 = true != (!z && m12509f(str, l68Var, true, false).f10086a) ? "not allowed" : "debug cert rejected";
        MessageDigest m26514b = C0803b3.m26514b(EvpMdRef.SHA256.JCA_NAME);
        ry0.m10830j(m26514b);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, db0.m24574a(m26514b.digest(l68Var.mo3860g3())), Boolean.valueOf(z), "12451000.false");
    }

    /* renamed from: d */
    public static synchronized void m12511d(Context context) {
        synchronized (qh8.class) {
            if (f23971g == null) {
                if (context != null) {
                    f23971g = context.getApplicationContext();
                }
            }
        }
    }

    /* renamed from: e */
    public static boolean m12510e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            m12507h();
            boolean zzi = f23969e.zzi();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return zzi;
        } catch (RemoteException | DynamiteModule.C3992a unused) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    /* renamed from: f */
    public static fx8 m12509f(final String str, final l68 l68Var, final boolean z, boolean z2) {
        try {
            m12507h();
            ry0.m10830j(f23971g);
            try {
                return f23969e.mo23662P1(new zzs(str, l68Var, z, z2), nt0.m14830g3(f23971g.getPackageManager())) ? fx8.m22144b() : new uu8(new Callable() { // from class: com.daaw.ie5
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return qh8.m12512c(z, str, l68Var);
                    }
                }, null);
            } catch (RemoteException e) {
                return fx8.m22142d("module call", e);
            }
        } catch (DynamiteModule.C3992a e2) {
            return fx8.m22142d("module init: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.daaw.yd0, android.os.IBinder] */
    /* renamed from: g */
    public static fx8 m12508g(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        String concat;
        fx8 m22142d;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            ry0.m10830j(f23971g);
            try {
                m12507h();
                zzo zzoVar = new zzo(str, z, false, nt0.m14830g3(f23971g), false);
                try {
                    zzq mo23661f1 = z4 ? f23969e.mo23661f1(zzoVar) : f23969e.mo23660v1(zzoVar);
                    if (mo23661f1.m1152q()) {
                        m22142d = fx8.m22140f(mo23661f1.m1151s());
                    } else {
                        String m1153h = mo23661f1.m1153h();
                        PackageManager.NameNotFoundException nameNotFoundException = mo23661f1.m1150t() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (m1153h == null) {
                            m1153h = "error checking package certificate";
                        }
                        m22142d = fx8.m22139g(mo23661f1.m1151s(), mo23661f1.m1150t(), m1153h, nameNotFoundException);
                    }
                } catch (RemoteException e) {
                    e = e;
                    concat = "module call";
                    m22142d = fx8.m22142d(concat, e);
                    return m22142d;
                }
            } catch (DynamiteModule.C3992a e2) {
                e = e2;
                concat = "module init: ".concat(String.valueOf(e.getMessage()));
            }
            return m22142d;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: h */
    public static void m12507h() {
        if (f23969e != null) {
            return;
        }
        ry0.m10830j(f23971g);
        synchronized (f23970f) {
            if (f23969e == null) {
                f23969e = x72.m5487I(DynamiteModule.m1145e(f23971g, DynamiteModule.f36682f, "com.google.android.gms.googlecertificates").m1146d("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
