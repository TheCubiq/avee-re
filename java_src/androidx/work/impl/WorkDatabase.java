package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.C0516a;
import com.daaw.InterfaceC0885bt;
import com.daaw.a61;
import com.daaw.b61;
import com.daaw.hy1;
import com.daaw.ji1;
import com.daaw.ki1;
import com.daaw.ky1;
import com.daaw.l40;
import com.daaw.ry1;
import com.daaw.uy1;
import com.daaw.vx1;
import com.daaw.xy0;
import com.daaw.zi1;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public abstract class WorkDatabase extends b61 {

    /* renamed from: l */
    public static final long f2469l = TimeUnit.DAYS.toMillis(1);

    /* renamed from: androidx.work.impl.WorkDatabase$a */
    /* loaded from: classes.dex */
    public class C0513a implements ki1.InterfaceC1952c {

        /* renamed from: a */
        public final /* synthetic */ Context f2470a;

        public C0513a(Context context) {
            this.f2470a = context;
        }

        @Override // com.daaw.ki1.InterfaceC1952c
        /* renamed from: a */
        public ki1 mo13616a(ki1.C1950b c1950b) {
            ki1.C1950b.C1951a m17723a = ki1.C1950b.m17723a(this.f2470a);
            m17723a.m17720c(c1950b.f16395b).m17721b(c1950b.f16396c).m17719d(true);
            return new l40().mo13616a(m17723a.m17722a());
        }
    }

    /* renamed from: androidx.work.impl.WorkDatabase$b */
    /* loaded from: classes.dex */
    public class C0514b extends b61.AbstractC0818b {
        @Override // com.daaw.b61.AbstractC0818b
        /* renamed from: c */
        public void mo26456c(ji1 ji1Var) {
            super.mo26456c(ji1Var);
            ji1Var.mo18499a();
            try {
                ji1Var.mo18496h(WorkDatabase.m27953w());
                ji1Var.mo18494s();
            } finally {
                ji1Var.mo18503C();
            }
        }
    }

    /* renamed from: s */
    public static WorkDatabase m27956s(Context context, Executor executor, boolean z) {
        b61.C0817a m27599a;
        if (z) {
            m27599a = a61.m27597c(context, WorkDatabase.class).m26463c();
        } else {
            m27599a = a61.m27599a(context, WorkDatabase.class, vx1.m6677d());
            m27599a.m26460f(new C0513a(context));
        }
        return (WorkDatabase) m27599a.m26459g(executor).m26465a(m27955u()).m26464b(C0516a.f2479a).m26464b(new C0516a.C0524h(context, 2, 3)).m26464b(C0516a.f2480b).m26464b(C0516a.f2481c).m26464b(new C0516a.C0524h(context, 5, 6)).m26464b(C0516a.f2482d).m26464b(C0516a.f2483e).m26464b(C0516a.f2484f).m26464b(new C0516a.C0525i(context)).m26464b(new C0516a.C0524h(context, 10, 11)).m26464b(C0516a.f2485g).m26461e().m26462d();
    }

    /* renamed from: u */
    public static b61.AbstractC0818b m27955u() {
        return new C0514b();
    }

    /* renamed from: v */
    public static long m27954v() {
        return System.currentTimeMillis() - f2469l;
    }

    /* renamed from: w */
    public static String m27953w() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + m27954v() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    /* renamed from: A */
    public abstract ky1 mo27952A();

    /* renamed from: B */
    public abstract ry1 mo27951B();

    /* renamed from: C */
    public abstract uy1 mo27950C();

    /* renamed from: t */
    public abstract InterfaceC0885bt mo27938t();

    /* renamed from: x */
    public abstract xy0 mo27937x();

    /* renamed from: y */
    public abstract zi1 mo27936y();

    /* renamed from: z */
    public abstract hy1 mo27935z();
}
