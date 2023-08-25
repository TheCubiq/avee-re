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

    /* renamed from: f */
    public static final Object f8807f = new Object();

    /* renamed from: g */
    public static gt3 f8808g;

    /* renamed from: h */
    public static gt3 f8809h;

    /* renamed from: b */
    public final Context f8811b;

    /* renamed from: d */
    public final ExecutorService f8813d;

    /* renamed from: e */
    public final zzchu f8814e;

    /* renamed from: a */
    public final Object f8810a = new Object();

    /* renamed from: c */
    public final WeakHashMap f8812c = new WeakHashMap();

    public et3(Context context, zzchu zzchuVar) {
        fv6.m22241a();
        this.f8813d = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.f8811b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f8814e = zzchuVar;
    }

    /* renamed from: c */
    public static gt3 m23193c(Context context) {
        synchronized (f8807f) {
            if (f8808g == null) {
                if (((Boolean) nb3.f19785e.m16137e()).booleanValue()) {
                    if (!((Boolean) zzba.zzc().m23658b(g93.f10598X6)).booleanValue()) {
                        f8808g = new et3(context, zzchu.m1093h());
                    }
                }
                f8808g = new ft3();
            }
        }
        return f8808g;
    }

    /* renamed from: d */
    public static gt3 m23192d(Context context, zzchu zzchuVar) {
        synchronized (f8807f) {
            if (f8809h == null) {
                if (((Boolean) nb3.f19785e.m16137e()).booleanValue()) {
                    if (!((Boolean) zzba.zzc().m23658b(g93.f10598X6)).booleanValue()) {
                        et3 et3Var = new et3(context, zzchuVar);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (et3Var.f8810a) {
                                et3Var.f8812c.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new dt3(et3Var, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new ct3(et3Var, Thread.getDefaultUncaughtExceptionHandler()));
                        f8809h = et3Var;
                    }
                }
                f8809h = new ft3();
            }
        }
        return f8809h;
    }

    /* renamed from: e */
    public static String m23191e(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: f */
    public static String m23190f(Throwable th) {
        return hz6.m20316c(d04.m24821k(m23191e(th)));
    }

    @Override // com.daaw.gt3
    /* renamed from: a */
    public final void mo21236a(Throwable th, String str) {
        mo21235b(th, str, 1.0f);
    }

    @Override // com.daaw.gt3
    /* renamed from: b */
    public final void mo21235b(Throwable th, String str, float f) {
        boolean z;
        String str2;
        if (d04.m24820l(th) == null) {
            return;
        }
        String name = th.getClass().getName();
        String m23191e = m23191e(th);
        String m23190f = ((Boolean) zzba.zzc().m23658b(g93.f10559T7)).booleanValue() ? m23190f(th) : "";
        double d = f;
        double random = Math.random();
        int i = f > 0.0f ? (int) (1.0f / f) : 1;
        if (random < d) {
            ArrayList<String> arrayList = new ArrayList();
            try {
                z = ez1.m22979a(this.f8811b).m19340g();
            } catch (Throwable th2) {
                k04.zzh("Error fetching instant app info", th2);
                z = false;
            }
            try {
                str2 = this.f8811b.getPackageName();
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
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", str4).appendQueryParameter("js", this.f8814e.f36993p).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", m23191e).appendQueryParameter("eids", TextUtils.join(",", g93.m21881a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "496518605").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(nb3.f19783c.m16137e())).appendQueryParameter("gmscv", String.valueOf(x70.m5492f().m5497a(this.f8811b))).appendQueryParameter("lite", true != this.f8814e.f36997t ? "0" : "1");
            if (!TextUtils.isEmpty(m23190f)) {
                appendQueryParameter2.appendQueryParameter("hash", m23190f);
            }
            arrayList.add(appendQueryParameter2.toString());
            for (final String str5 : arrayList) {
                final p04 p04Var = new p04(null);
                this.f8813d.execute(new Runnable() { // from class: com.daaw.bt3
                    @Override // java.lang.Runnable
                    public final void run() {
                        p04.this.zza(str5);
                    }
                });
            }
        }
    }

    /* renamed from: g */
    public final void m23189g(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= d04.m24811u(stackTraceElement.getClassName());
                    z2 |= et3.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!z || z2) {
                return;
            }
            mo21235b(th, "", 1.0f);
        }
    }
}
