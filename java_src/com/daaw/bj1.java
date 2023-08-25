package com.daaw;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.daaw.C3552xk;
/* loaded from: classes.dex */
public class bj1 {

    /* renamed from: b */
    public static final String f4849b = ll0.m16883f("SystemJobInfoConverter");

    /* renamed from: a */
    public final ComponentName f4850a;

    /* renamed from: com.daaw.bj1$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0845a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4851a;

        static {
            int[] iArr = new int[qs0.values().length];
            f4851a = iArr;
            try {
                iArr[qs0.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4851a[qs0.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4851a[qs0.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4851a[qs0.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4851a[qs0.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public bj1(Context context) {
        this.f4850a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    /* renamed from: b */
    public static JobInfo.TriggerContentUri m26127b(C3552xk.C3553a c3553a) {
        return new JobInfo.TriggerContentUri(c3553a.m5037a(), c3553a.m5036b() ? 1 : 0);
    }

    /* renamed from: c */
    public static int m26126c(qs0 qs0Var) {
        int i = C0845a.f4851a[qs0Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5 && Build.VERSION.SDK_INT >= 26) {
                            return 4;
                        }
                    } else if (Build.VERSION.SDK_INT >= 24) {
                        return 3;
                    }
                    ll0.m16885c().mo16882a(f4849b, String.format("API version too low. Cannot convert network type value %s", qs0Var), new Throwable[0]);
                    return 1;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    /* renamed from: d */
    public static void m26125d(JobInfo.Builder builder, qs0 qs0Var) {
        if (Build.VERSION.SDK_INT < 30 || qs0Var != qs0.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(m26126c(qs0Var));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    /* renamed from: a */
    public JobInfo m26128a(qy1 qy1Var, int i) {
        C2943sj c2943sj = qy1Var.f24633j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", qy1Var.f24624a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", qy1Var.m11935d());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.f4850a).setRequiresCharging(c2943sj.m10317g()).setRequiresDeviceIdle(c2943sj.m10316h()).setExtras(persistableBundle);
        m26125d(extras, c2943sj.m10322b());
        if (!c2943sj.m10316h()) {
            extras.setBackoffCriteria(qy1Var.f24636m, qy1Var.f24635l == EnumC1520ha.LINEAR ? 0 : 1);
        }
        long max = Math.max(qy1Var.m11938a() - System.currentTimeMillis(), 0L);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 28 || max > 0) {
            extras.setMinimumLatency(max);
        } else if (!qy1Var.f24640q) {
            extras.setImportantWhileForeground(true);
        }
        if (i2 >= 24 && c2943sj.m10319e()) {
            for (C3552xk.C3553a c3553a : c2943sj.m10323a().m5039b()) {
                extras.addTriggerContentUri(m26127b(c3553a));
            }
            extras.setTriggerContentUpdateDelay(c2943sj.m10321c());
            extras.setTriggerContentMaxDelay(c2943sj.m10320d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(c2943sj.m10318f());
            extras.setRequiresStorageNotLow(c2943sj.m10315i());
        }
        boolean z = qy1Var.f24634k > 0;
        if (C3523xc.m5291b() && qy1Var.f24640q && !z) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
