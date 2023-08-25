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

    /* renamed from: v */
    public static final String f2581v = ll0.m16883f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: a */
    public static String m27871a(qy1 qy1Var, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", qy1Var.f24624a, qy1Var.f24626c, num, qy1Var.f24625b.name(), str, str2);
    }

    /* renamed from: c */
    public static String m27870c(hy1 hy1Var, uy1 uy1Var, zi1 zi1Var, List<qy1> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"));
        for (qy1 qy1Var : list) {
            Integer num = null;
            yi1 mo2277c = zi1Var.mo2277c(qy1Var.f24624a);
            if (mo2277c != null) {
                num = Integer.valueOf(mo2277c.f33688b);
            }
            sb.append(m27871a(qy1Var, TextUtils.join(",", hy1Var.mo19261b(qy1Var.f24624a)), num, TextUtils.join(",", uy1Var.mo6670a(qy1Var.f24624a))));
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public ListenableWorker.AbstractC0501a doWork() {
        WorkDatabase m23000o = ey1.m23004k(getApplicationContext()).m23000o();
        ry1 mo27951B = m23000o.mo27951B();
        hy1 mo27935z = m23000o.mo27935z();
        uy1 mo27950C = m23000o.mo27950C();
        zi1 mo27936y = m23000o.mo27936y();
        List<qy1> mo9728d = mo27951B.mo9728d(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<qy1> mo9724h = mo27951B.mo9724h();
        List<qy1> mo9712t = mo27951B.mo9712t(200);
        if (mo9728d != null && !mo9728d.isEmpty()) {
            ll0 m16885c = ll0.m16885c();
            String str = f2581v;
            m16885c.mo16880d(str, "Recently completed work:\n\n", new Throwable[0]);
            ll0.m16885c().mo16880d(str, m27870c(mo27935z, mo27950C, mo27936y, mo9728d), new Throwable[0]);
        }
        if (mo9724h != null && !mo9724h.isEmpty()) {
            ll0 m16885c2 = ll0.m16885c();
            String str2 = f2581v;
            m16885c2.mo16880d(str2, "Running work:\n\n", new Throwable[0]);
            ll0.m16885c().mo16880d(str2, m27870c(mo27935z, mo27950C, mo27936y, mo9724h), new Throwable[0]);
        }
        if (mo9712t != null && !mo9712t.isEmpty()) {
            ll0 m16885c3 = ll0.m16885c();
            String str3 = f2581v;
            m16885c3.mo16880d(str3, "Enqueued work:\n\n", new Throwable[0]);
            ll0.m16885c().mo16880d(str3, m27870c(mo27935z, mo27950C, mo27936y, mo9712t), new Throwable[0]);
        }
        return ListenableWorker.AbstractC0501a.m28004c();
    }
}
