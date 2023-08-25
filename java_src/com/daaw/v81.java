package com.daaw;

import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.List;
/* loaded from: classes.dex */
public class v81 {
    public static final String a = ll0.f("Schedulers");

    public static r81 a(Context context, ey1 ey1Var) {
        if (Build.VERSION.SDK_INT >= 23) {
            cj1 cj1Var = new cj1(context, ey1Var);
            hv0.a(context, SystemJobService.class, true);
            ll0.c().a(a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return cj1Var;
        }
        r81 c = c(context);
        if (c == null) {
            ti1 ti1Var = new ti1(context);
            hv0.a(context, SystemAlarmService.class, true);
            ll0.c().a(a, "Created SystemAlarmScheduler", new Throwable[0]);
            return ti1Var;
        }
        return c;
    }

    public static void b(androidx.work.a aVar, WorkDatabase workDatabase, List<r81> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        ry1 B = workDatabase.B();
        workDatabase.c();
        try {
            List<qy1> e = B.e(aVar.h());
            List<qy1> t = B.t(200);
            if (e != null && e.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                for (qy1 qy1Var : e) {
                    B.b(qy1Var.a, currentTimeMillis);
                }
            }
            workDatabase.r();
            if (e != null && e.size() > 0) {
                qy1[] qy1VarArr = (qy1[]) e.toArray(new qy1[e.size()]);
                for (r81 r81Var : list) {
                    if (r81Var.a()) {
                        r81Var.e(qy1VarArr);
                    }
                }
            }
            if (t == null || t.size() <= 0) {
                return;
            }
            qy1[] qy1VarArr2 = (qy1[]) t.toArray(new qy1[t.size()]);
            for (r81 r81Var2 : list) {
                if (!r81Var2.a()) {
                    r81Var2.e(qy1VarArr2);
                }
            }
        } finally {
            workDatabase.g();
        }
    }

    public static r81 c(Context context) {
        try {
            r81 r81Var = (r81) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
            ll0.c().a(a, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
            return r81Var;
        } catch (Throwable th) {
            ll0.c().a(a, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
