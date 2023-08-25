package com.daaw;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
/* loaded from: classes.dex */
public class x1 {
    public static final String a = ll0.f("Alarms");

    public static void a(Context context, ey1 ey1Var, String str) {
        zi1 y = ey1Var.o().y();
        yi1 c = y.c(str);
        if (c != null) {
            b(context, str, c.b);
            ll0.c().a(a, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            y.d(str);
        }
    }

    public static void b(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, androidx.work.impl.background.systemalarm.a.b(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        ll0.c().a(a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void c(Context context, ey1 ey1Var, String str, long j) {
        int b;
        WorkDatabase o = ey1Var.o();
        zi1 y = o.y();
        yi1 c = y.c(str);
        if (c != null) {
            b(context, str, c.b);
            b = c.b;
        } else {
            b = new te0(o).b();
            y.b(new yi1(str, b));
        }
        d(context, str, b, j);
    }

    public static void d(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, androidx.work.impl.background.systemalarm.a.b(context, str), Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
