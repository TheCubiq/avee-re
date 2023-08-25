package com.daaw;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C0527a;
/* renamed from: com.daaw.x1 */
/* loaded from: classes.dex */
public class C3491x1 {

    /* renamed from: a */
    public static final String f31727a = ll0.m16883f("Alarms");

    /* renamed from: a */
    public static void m5657a(Context context, ey1 ey1Var, String str) {
        zi1 mo27936y = ey1Var.m23000o().mo27936y();
        yi1 mo2277c = mo27936y.mo2277c(str);
        if (mo2277c != null) {
            m5656b(context, str, mo2277c.f33688b);
            ll0.m16885c().mo16882a(f31727a, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            mo27936y.mo2276d(str);
        }
    }

    /* renamed from: b */
    public static void m5656b(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C0527a.m27930b(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        ll0.m16885c().mo16882a(f31727a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    /* renamed from: c */
    public static void m5655c(Context context, ey1 ey1Var, String str, long j) {
        int m9236b;
        WorkDatabase m23000o = ey1Var.m23000o();
        zi1 mo27936y = m23000o.mo27936y();
        yi1 mo2277c = mo27936y.mo2277c(str);
        if (mo2277c != null) {
            m5656b(context, str, mo2277c.f33688b);
            m9236b = mo2277c.f33688b;
        } else {
            m9236b = new te0(m23000o).m9236b();
            mo27936y.mo2278b(new yi1(str, m9236b));
        }
        m5654d(context, str, m9236b, j);
    }

    /* renamed from: d */
    public static void m5654d(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C0527a.m27930b(context, str), Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
