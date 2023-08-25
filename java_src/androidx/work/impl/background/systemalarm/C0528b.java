package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.C0530d;
import com.daaw.ll0;
import com.daaw.qy1;
import com.daaw.sx1;
import java.util.ArrayList;
import java.util.List;
/* renamed from: androidx.work.impl.background.systemalarm.b */
/* loaded from: classes.dex */
public class C0528b {

    /* renamed from: e */
    public static final String f2502e = ll0.m16883f("ConstraintsCmdHandler");

    /* renamed from: a */
    public final Context f2503a;

    /* renamed from: b */
    public final int f2504b;

    /* renamed from: c */
    public final C0530d f2505c;

    /* renamed from: d */
    public final sx1 f2506d;

    public C0528b(Context context, int i, C0530d c0530d) {
        this.f2503a = context;
        this.f2504b = i;
        this.f2505c = c0530d;
        this.f2506d = new sx1(context, c0530d.m27908f(), null);
    }

    /* renamed from: a */
    public void m27916a() {
        List<qy1> mo9726f = this.f2505c.m27907g().m23000o().mo27951B().mo9726f();
        ConstraintProxy.m27934a(this.f2503a, mo9726f);
        this.f2506d.m9789d(mo9726f);
        ArrayList<qy1> arrayList = new ArrayList(mo9726f.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (qy1 qy1Var : mo9726f) {
            String str = qy1Var.f24624a;
            if (currentTimeMillis >= qy1Var.m11938a() && (!qy1Var.m11937b() || this.f2506d.m9790c(str))) {
                arrayList.add(qy1Var);
            }
        }
        for (qy1 qy1Var2 : arrayList) {
            String str2 = qy1Var2.f24624a;
            Intent m27930b = C0527a.m27930b(this.f2503a, str2);
            ll0.m16885c().mo16882a(f2502e, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            C0530d c0530d = this.f2505c;
            c0530d.m27903k(new C0530d.RunnableC0532b(c0530d, m27930b, this.f2504b));
        }
        this.f2506d.m9788e();
    }
}
