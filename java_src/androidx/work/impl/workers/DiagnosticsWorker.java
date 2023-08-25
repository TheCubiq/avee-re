package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.daaw.ey1;
import com.daaw.hy1;
import com.daaw.ll0;
import com.daaw.qy1;
import com.daaw.ry1;
import com.daaw.uy1;
import com.daaw.yi1;
import com.daaw.zi1;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {
    public static final String v = ll0.f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(qy1 qy1Var, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", qy1Var.a, qy1Var.c, num, qy1Var.b.name(), str, str2);
    }

    public static String c(hy1 hy1Var, uy1 uy1Var, zi1 zi1Var, List<qy1> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"));
        for (qy1 qy1Var : list) {
            Integer num = null;
            yi1 c = zi1Var.c(qy1Var.a);
            if (c != null) {
                num = Integer.valueOf(c.b);
            }
            sb.append(a(qy1Var, TextUtils.join(",", hy1Var.b(qy1Var.a)), num, TextUtils.join(",", uy1Var.a(qy1Var.a))));
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a doWork() {
        WorkDatabase o = ey1.k(getApplicationContext()).o();
        ry1 B = o.B();
        hy1 z = o.z();
        uy1 C = o.C();
        zi1 y = o.y();
        List<qy1> d = B.d(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<qy1> h = B.h();
        List<qy1> t = B.t(200);
        if (d != null && !d.isEmpty()) {
            ll0 c = ll0.c();
            String str = v;
            c.d(str, "Recently completed work:\n\n", new Throwable[0]);
            ll0.c().d(str, c(z, C, y, d), new Throwable[0]);
        }
        if (h != null && !h.isEmpty()) {
            ll0 c2 = ll0.c();
            String str2 = v;
            c2.d(str2, "Running work:\n\n", new Throwable[0]);
            ll0.c().d(str2, c(z, C, y, h), new Throwable[0]);
        }
        if (t != null && !t.isEmpty()) {
            ll0 c3 = ll0.c();
            String str3 = v;
            c3.d(str3, "Enqueued work:\n\n", new Throwable[0]);
            ll0.c().d(str3, c(z, C, y, t), new Throwable[0]);
        }
        return ListenableWorker.a.c();
    }
}
