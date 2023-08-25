package com.daaw;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.daaw.xk;
/* loaded from: classes.dex */
public class bj1 {
    public static final String b = ll0.f("SystemJobInfoConverter");
    public final ComponentName a;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[qs0.values().length];
            a = iArr;
            try {
                iArr[qs0.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[qs0.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[qs0.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[qs0.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[qs0.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public bj1(Context context) {
        this.a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    public static JobInfo.TriggerContentUri b(xk.a aVar) {
        return new JobInfo.TriggerContentUri(aVar.a(), aVar.b() ? 1 : 0);
    }

    public static int c(qs0 qs0Var) {
        int i = a.a[qs0Var.ordinal()];
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
                    ll0.c().a(b, String.format("API version too low. Cannot convert network type value %s", qs0Var), new Throwable[0]);
                    return 1;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static void d(JobInfo.Builder builder, qs0 qs0Var) {
        if (Build.VERSION.SDK_INT < 30 || qs0Var != qs0.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(qs0Var));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    public JobInfo a(qy1 qy1Var, int i) {
        sj sjVar = qy1Var.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", qy1Var.a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", qy1Var.d());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.a).setRequiresCharging(sjVar.g()).setRequiresDeviceIdle(sjVar.h()).setExtras(persistableBundle);
        d(extras, sjVar.b());
        if (!sjVar.h()) {
            extras.setBackoffCriteria(qy1Var.m, qy1Var.l == ha.LINEAR ? 0 : 1);
        }
        long max = Math.max(qy1Var.a() - System.currentTimeMillis(), 0L);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 28 || max > 0) {
            extras.setMinimumLatency(max);
        } else if (!qy1Var.q) {
            extras.setImportantWhileForeground(true);
        }
        if (i2 >= 24 && sjVar.e()) {
            for (xk.a aVar : sjVar.a().b()) {
                extras.addTriggerContentUri(b(aVar));
            }
            extras.setTriggerContentUpdateDelay(sjVar.c());
            extras.setTriggerContentMaxDelay(sjVar.d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(sjVar.f());
            extras.setRequiresStorageNotLow(sjVar.i());
        }
        boolean z = qy1Var.k > 0;
        if (xc.b() && qy1Var.q && !z) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
