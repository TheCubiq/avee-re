package com.daaw;

import android.content.Context;
import android.os.Build;
import androidx.work.C0507a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.List;
/* loaded from: classes.dex */
public class v81 {

    /* renamed from: a */
    public static final String f30006a = ll0.m16883f("Schedulers");

    /* renamed from: a */
    public static r81 m7347a(Context context, ey1 ey1Var) {
        if (Build.VERSION.SDK_INT >= 23) {
            cj1 cj1Var = new cj1(context, ey1Var);
            hv0.m20390a(context, SystemJobService.class, true);
            ll0.m16885c().mo16882a(f30006a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return cj1Var;
        }
        r81 m7345c = m7345c(context);
        if (m7345c == null) {
            ti1 ti1Var = new ti1(context);
            hv0.m20390a(context, SystemAlarmService.class, true);
            ll0.m16885c().mo16882a(f30006a, "Created SystemAlarmScheduler", new Throwable[0]);
            return ti1Var;
        }
        return m7345c;
    }

    /* renamed from: b */
    public static void m7346b(C0507a c0507a, WorkDatabase workDatabase, List<r81> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        ry1 mo27951B = workDatabase.mo27951B();
        workDatabase.m26481c();
        try {
            List<qy1> mo9727e = mo27951B.mo9727e(c0507a.m27980h());
            List<qy1> mo9712t = mo27951B.mo9712t(200);
            if (mo9727e != null && mo9727e.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                for (qy1 qy1Var : mo9727e) {
                    mo27951B.mo9730b(qy1Var.f24624a, currentTimeMillis);
                }
            }
            workDatabase.m26466r();
            if (mo9727e != null && mo9727e.size() > 0) {
                qy1[] qy1VarArr = (qy1[]) mo9727e.toArray(new qy1[mo9727e.size()]);
                for (r81 r81Var : list) {
                    if (r81Var.mo9090a()) {
                        r81Var.mo9087e(qy1VarArr);
                    }
                }
            }
            if (mo9712t == null || mo9712t.size() <= 0) {
                return;
            }
            qy1[] qy1VarArr2 = (qy1[]) mo9712t.toArray(new qy1[mo9712t.size()]);
            for (r81 r81Var2 : list) {
                if (!r81Var2.mo9090a()) {
                    r81Var2.mo9087e(qy1VarArr2);
                }
            }
        } finally {
            workDatabase.m26477g();
        }
    }

    /* renamed from: c */
    public static r81 m7345c(Context context) {
        try {
            r81 r81Var = (r81) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
            ll0.m16885c().mo16882a(f30006a, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
            return r81Var;
        } catch (Throwable th) {
            ll0.m16885c().mo16882a(f30006a, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
