package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzchu;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class et3 implements gt3 {
    public static final Object f = new Object();
    public static gt3 g;
    public static gt3 h;
    public final Context b;
    public final ExecutorService d;
    public final zzchu e;
    public final Object a = new Object();
    public final WeakHashMap c = new WeakHashMap();

    public et3(Context context, zzchu zzchuVar) {
        fv6.a();
        this.d = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.e = zzchuVar;
    }

    public static gt3 c(Context context) {
        synchronized (f) {
            if (g == null) {
                if (((Boolean) nb3.e.e()).booleanValue()) {
                    if (!((Boolean) zzba.zzc().b(g93.X6)).booleanValue()) {
                        g = new et3(context, zzchu.h());
                    }
                }
                g = new ft3();
            }
        }
        return g;
    }

    public static gt3 d(Context context, zzchu zzchuVar) {
        synchronized (f) {
            if (h == null) {
                if (((Boolean) nb3.e.e()).booleanValue()) {
                    if (!((Boolean) zzba.zzc().b(g93.X6)).booleanValue()) {
                        et3 et3Var = new et3(context, zzchuVar);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (et3Var.a) {
                                et3Var.c.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new dt3(et3Var, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new ct3(et3Var, Thread.getDefaultUncaughtExceptionHandler()));
                        h = et3Var;
                    }
                }
                h = new ft3();
            }
        }
        return h;
    }

    public static String e(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String f(Throwable th) {
        return hz6.c(d04.k(e(th)));
    }

    @Override // com.daaw.gt3
    public final void a(Throwable th, String str) {
        b(th, str, 1.0f);
    }

    @Override // com.daaw.gt3
    public final void b(Throwable th, String str, float f2) {
        boolean z;
        String str2;
        if (d04.l(th) == null) {
            return;
        }
        String name = th.getClass().getName();
        String e = e(th);
        String f3 = ((Boolean) zzba.zzc().b(g93.T7)).booleanValue() ? f(th) : "";
        double d = f2;
        double random = Math.random();
        int i = f2 > 0.0f ? (int) (1.0f / f2) : 1;
        if (random < d) {
            ArrayList<String> arrayList = new ArrayList();
            try {
                z = ez1.a(this.b).g();
            } catch (Throwable th2) {
                k04.zzh("Error fetching instant app info", th2);
                z = false;
            }
            try {
                str2 = this.b.getPackageName();
            } catch (Throwable unused) {
                k04.zzj("Cannot obtain package name, proceeding.");
                str2 = "unknown";
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str3 = Build.MANUFACTURER;
            String str4 = Build.MODEL;
            if (!str4.startsWith(str3)) {
                str4 = str3 + " " + str4;
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", str4).appendQueryParameter("js", this.e.p).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", e).appendQueryParameter("eids", TextUtils.join(",", g93.a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "496518605").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(nb3.c.e())).appendQueryParameter("gmscv", String.valueOf(x70.f().a(this.b))).appendQueryParameter("lite", true != this.e.t ? "0" : "1");
            if (!TextUtils.isEmpty(f3)) {
                appendQueryParameter2.appendQueryParameter("hash", f3);
            }
            arrayList.add(appendQueryParameter2.toString());
            for (final String str5 : arrayList) {
                final p04 p04Var = new p04(null);
                this.d.execute(new Runnable() { // from class: com.daaw.bt3
                    @Override // java.lang.Runnable
                    public final void run() {
                        p04.this.zza(str5);
                    }
                });
            }
        }
    }

    public final void g(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= d04.u(stackTraceElement.getClassName());
                    z2 |= et3.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!z || z2) {
                return;
            }
            b(th, "", 1.0f);
        }
    }
}
