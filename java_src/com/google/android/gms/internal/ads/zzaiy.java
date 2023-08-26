package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
@zzadh
/* loaded from: classes2.dex */
public final class zzaiy {
    private final AtomicReference<ThreadPoolExecutor> zzcnp = new AtomicReference<>(null);
    private final Object zzcnq = new Object();
    private String zzcnr = null;
    private final AtomicBoolean zzcns = new AtomicBoolean(false);
    private final AtomicInteger zzcnt = new AtomicInteger(-1);
    private final AtomicReference<Object> zzcnu = new AtomicReference<>(null);
    private final AtomicReference<Object> zzcnv = new AtomicReference<>(null);
    private ConcurrentMap<String, Method> zzcnw = new ConcurrentHashMap(9);

    private static Bundle zza(Context context, String str, boolean z) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (NullPointerException | NumberFormatException e) {
            String valueOf = String.valueOf(str);
            zzakb.zzb(valueOf.length() != 0 ? "Invalid event ID: ".concat(valueOf) : new String("Invalid event ID: "), e);
        }
        if (z) {
            bundle.putInt("_r", 1);
        }
        return bundle;
    }

    private final Object zza(String str, Context context) {
        if (zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzcnu, true)) {
            try {
                return zzi(context, str).invoke(this.zzcnu.get(), new Object[0]);
            } catch (Exception e) {
                zza(e, str, true);
                return null;
            }
        }
        return null;
    }

    private final void zza(Context context, String str, Bundle bundle) {
        if (zzs(context) && zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzcnu, true)) {
            try {
                zzac(context).invoke(this.zzcnu.get(), "am", str, bundle);
            } catch (Exception e) {
                zza(e, "logEventInternal", true);
            }
        }
    }

    private final void zza(Exception exc, String str, boolean z) {
        if (this.zzcns.get()) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
        sb.append("Invoke Firebase method ");
        sb.append(str);
        sb.append(" error.");
        zzakb.zzdk(sb.toString());
        if (z) {
            zzakb.zzdk("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.zzcns.set(true);
        }
    }

    private final boolean zza(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet(null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception e) {
                zza(e, "getInstance", z);
                return false;
            }
        }
        return true;
    }

    private final Method zzac(Context context) {
        Method method = this.zzcnw.get("logEventInternal");
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
            this.zzcnw.put("logEventInternal", declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, "logEventInternal", true);
            return null;
        }
    }

    private final void zzb(Context context, String str, String str2) {
        if (zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzcnu, true)) {
            try {
                zzh(context, str2).invoke(this.zzcnu.get(), str);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                zzakb.v(sb.toString());
            } catch (Exception e) {
                zza(e, str2, false);
            }
        }
    }

    private final Method zzh(Context context, String str) {
        Method method = this.zzcnw.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, String.class);
            this.zzcnw.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, str, false);
            return null;
        }
    }

    private final Method zzi(Context context, String str) {
        Method method = this.zzcnw.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.zzcnw.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, str, false);
            return null;
        }
    }

    private final Method zzj(Context context, String str) {
        Method method = this.zzcnw.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, Activity.class, String.class, String.class);
            this.zzcnw.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, str, false);
            return null;
        }
    }

    public final void zza(Context context, String str, String str2) {
        if (zzs(context)) {
            zza(context, str, zza(context, str2, "_ac".equals(str)));
        }
    }

    public final void zza(Context context, String str, String str2, String str3, int i) {
        if (zzs(context)) {
            Bundle zza = zza(context, str, false);
            zza.putString("_ai", str2);
            zza.putString("type", str3);
            zza.putInt("value", i);
            zza(context, "_ar", zza);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 75);
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i);
            zzakb.v(sb.toString());
        }
    }

    public final String zzaa(final Context context) {
        if (zzs(context)) {
            long longValue = ((Long) zzkb.zzik().zzd(zznk.zzaxt)).longValue();
            if (longValue < 0) {
                return (String) zza("getAppInstanceId", context);
            }
            if (this.zzcnp.get() == null) {
                this.zzcnp.compareAndSet(null, new ThreadPoolExecutor(((Integer) zzkb.zzik().zzd(zznk.zzaxu)).intValue(), ((Integer) zzkb.zzik().zzd(zznk.zzaxu)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzaja(this)));
            }
            Future submit = this.zzcnp.get().submit(new Callable(this, context) { // from class: com.google.android.gms.internal.ads.zzaiz
                private final zzaiy zzcnx;
                private final Context zzcny;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzcnx = this;
                    this.zzcny = context;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zzcnx.zzad(this.zzcny);
                }
            });
            try {
                return (String) submit.get(longValue, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                submit.cancel(true);
                if (e instanceof TimeoutException) {
                    return "TIME_OUT";
                }
                return null;
            }
        }
        return null;
    }

    public final String zzab(Context context) {
        Object zza;
        if (zzs(context) && (zza = zza("generateEventId", context)) != null) {
            return zza.toString();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String zzad(Context context) throws Exception {
        return (String) zza("getAppInstanceId", context);
    }

    public final void zzb(Context context, String str) {
        if (zzs(context)) {
            zzb(context, str, "beginAdUnitExposure");
        }
    }

    public final void zzc(Context context, String str) {
        if (zzs(context)) {
            zzb(context, str, "endAdUnitExposure");
        }
    }

    public final void zzd(Context context, String str) {
        if (zzs(context) && (context instanceof Activity) && zza(context, "com.google.firebase.analytics.FirebaseAnalytics", this.zzcnv, false)) {
            try {
                zzj(context, "setCurrentScreen").invoke(this.zzcnv.get(), (Activity) context, str, context.getPackageName());
            } catch (Exception e) {
                zza(e, "setCurrentScreen", false);
            }
        }
    }

    public final void zze(Context context, String str) {
        zza(context, "_ac", str);
    }

    public final void zzf(Context context, String str) {
        zza(context, "_ai", str);
    }

    public final void zzg(Context context, String str) {
        zza(context, "_aq", str);
    }

    public final boolean zzs(Context context) {
        if (((Boolean) zzkb.zzik().zzd(zznk.zzaxj)).booleanValue() && !this.zzcns.get()) {
            if (this.zzcnt.get() == -1) {
                zzkb.zzif();
                if (!zzamu.zzbe(context)) {
                    zzkb.zzif();
                    if (zzamu.zzbh(context)) {
                        zzakb.zzdk("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.zzcnt.set(0);
                    }
                }
                this.zzcnt.set(1);
            }
            if (this.zzcnt.get() == 1) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzt(Context context) {
        return ((Boolean) zzkb.zzik().zzd(zznk.zzaxk)).booleanValue() && zzs(context);
    }

    public final boolean zzu(Context context) {
        return ((Boolean) zzkb.zzik().zzd(zznk.zzaxl)).booleanValue() && zzs(context);
    }

    public final boolean zzv(Context context) {
        return ((Boolean) zzkb.zzik().zzd(zznk.zzaxm)).booleanValue() && zzs(context);
    }

    public final boolean zzw(Context context) {
        return ((Boolean) zzkb.zzik().zzd(zznk.zzaxn)).booleanValue() && zzs(context);
    }

    public final boolean zzx(Context context) {
        return ((Boolean) zzkb.zzik().zzd(zznk.zzaxq)).booleanValue() && zzs(context);
    }

    public final String zzy(Context context) {
        if (zzs(context) && zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzcnu, true)) {
            try {
                String str = (String) zzi(context, "getCurrentScreenName").invoke(this.zzcnu.get(), new Object[0]);
                if (str == null) {
                    str = (String) zzi(context, "getCurrentScreenClass").invoke(this.zzcnu.get(), new Object[0]);
                }
                return str != null ? str : "";
            } catch (Exception e) {
                zza(e, "getCurrentScreenName", false);
                return "";
            }
        }
        return "";
    }

    public final String zzz(Context context) {
        if (zzs(context)) {
            synchronized (this.zzcnq) {
                if (this.zzcnr != null) {
                    return this.zzcnr;
                }
                String str = (String) zza("getGmpAppId", context);
                this.zzcnr = str;
                return str;
            }
        }
        return null;
    }
}
