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
    public static volatile e92 e;
    public static Context g;
    public static final yc8 a = new w76(l68.M("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
    public static final yc8 b = new r07(l68.M("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    public static final yc8 c = new ku7(l68.M("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
    public static final yc8 d = new f38(l68.M("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    public static final Object f = new Object();

    public static fx8 a(String str, l68 l68Var, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, l68Var, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static fx8 b(String str, boolean z, boolean z2, boolean z3) {
        return g(str, z, false, false, true);
    }

    public static /* synthetic */ String c(boolean z, String str, l68 l68Var) {
        String str2 = true != (!z && f(str, l68Var, true, false).a) ? "not allowed" : "debug cert rejected";
        MessageDigest b2 = b3.b(EvpMdRef.SHA256.JCA_NAME);
        ry0.j(b2);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, db0.a(b2.digest(l68Var.g3())), Boolean.valueOf(z), "12451000.false");
    }

    public static synchronized void d(Context context) {
        synchronized (qh8.class) {
            if (g == null) {
                if (context != null) {
                    g = context.getApplicationContext();
                }
            }
        }
    }

    public static boolean e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            h();
            boolean zzi = e.zzi();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return zzi;
        } catch (RemoteException | DynamiteModule.a unused) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    public static fx8 f(final String str, final l68 l68Var, final boolean z, boolean z2) {
        try {
            h();
            ry0.j(g);
            try {
                return e.P1(new zzs(str, l68Var, z, z2), nt0.g3(g.getPackageManager())) ? fx8.b() : new uu8(new Callable() { // from class: com.daaw.ie5
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return qh8.c(z, str, l68Var);
                    }
                }, null);
            } catch (RemoteException e2) {
                return fx8.d("module call", e2);
            }
        } catch (DynamiteModule.a e3) {
            return fx8.d("module init: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.daaw.yd0, android.os.IBinder] */
    public static fx8 g(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        String concat;
        fx8 d2;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            ry0.j(g);
            try {
                h();
                zzo zzoVar = new zzo(str, z, false, nt0.g3(g), false);
                try {
                    zzq f1 = z4 ? e.f1(zzoVar) : e.v1(zzoVar);
                    if (f1.q()) {
                        d2 = fx8.f(f1.s());
                    } else {
                        String h = f1.h();
                        PackageManager.NameNotFoundException nameNotFoundException = f1.t() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (h == null) {
                            h = "error checking package certificate";
                        }
                        d2 = fx8.g(f1.s(), f1.t(), h, nameNotFoundException);
                    }
                } catch (RemoteException e2) {
                    e = e2;
                    concat = "module call";
                    d2 = fx8.d(concat, e);
                    return d2;
                }
            } catch (DynamiteModule.a e3) {
                e = e3;
                concat = "module init: ".concat(String.valueOf(e.getMessage()));
            }
            return d2;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static void h() {
        if (e != null) {
            return;
        }
        ry0.j(g);
        synchronized (f) {
            if (e == null) {
                e = x72.I(DynamiteModule.e(g, DynamiteModule.f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
