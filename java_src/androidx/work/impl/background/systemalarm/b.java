package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.d;
import com.daaw.ll0;
import com.daaw.qy1;
import com.daaw.sx1;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class b {
    public static final String e = ll0.f("ConstraintsCmdHandler");
    public final Context a;
    public final int b;
    public final d c;
    public final sx1 d;

    public b(Context context, int i, d dVar) {
        this.a = context;
        this.b = i;
        this.c = dVar;
        this.d = new sx1(context, dVar.f(), null);
    }

    public void a() {
        List<qy1> f = this.c.g().o().B().f();
        ConstraintProxy.a(this.a, f);
        this.d.d(f);
        ArrayList<qy1> arrayList = new ArrayList(f.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (qy1 qy1Var : f) {
            String str = qy1Var.a;
            if (currentTimeMillis >= qy1Var.a() && (!qy1Var.b() || this.d.c(str))) {
                arrayList.add(qy1Var);
            }
        }
        for (qy1 qy1Var2 : arrayList) {
            String str2 = qy1Var2.a;
            Intent b = a.b(this.a, str2);
            ll0.c().a(e, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            d dVar = this.c;
            dVar.k(new d.b(dVar, b, this.b));
        }
        this.d.e();
    }
}
