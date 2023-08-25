package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.a;
import com.daaw.a61;
import com.daaw.b61;
import com.daaw.bt;
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
    public static final long l = TimeUnit.DAYS.toMillis(1);

    /* loaded from: classes.dex */
    public class a implements ki1.c {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.daaw.ki1.c
        public ki1 a(ki1.b bVar) {
            ki1.b.a a = ki1.b.a(this.a);
            a.c(bVar.b).b(bVar.c).d(true);
            return new l40().a(a.a());
        }
    }

    /* loaded from: classes.dex */
    public class b extends b61.b {
        @Override // com.daaw.b61.b
        public void c(ji1 ji1Var) {
            super.c(ji1Var);
            ji1Var.a();
            try {
                ji1Var.h(WorkDatabase.w());
                ji1Var.s();
            } finally {
                ji1Var.C();
            }
        }
    }

    public static WorkDatabase s(Context context, Executor executor, boolean z) {
        b61.a a2;
        if (z) {
            a2 = a61.c(context, WorkDatabase.class).c();
        } else {
            a2 = a61.a(context, WorkDatabase.class, vx1.d());
            a2.f(new a(context));
        }
        return (WorkDatabase) a2.g(executor).a(u()).b(androidx.work.impl.a.a).b(new a.h(context, 2, 3)).b(androidx.work.impl.a.b).b(androidx.work.impl.a.c).b(new a.h(context, 5, 6)).b(androidx.work.impl.a.d).b(androidx.work.impl.a.e).b(androidx.work.impl.a.f).b(new a.i(context)).b(new a.h(context, 10, 11)).b(androidx.work.impl.a.g).e().d();
    }

    public static b61.b u() {
        return new b();
    }

    public static long v() {
        return System.currentTimeMillis() - l;
    }

    public static String w() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + v() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public abstract ky1 A();

    public abstract ry1 B();

    public abstract uy1 C();

    public abstract bt t();

    public abstract xy0 x();

    public abstract zi1 y();

    public abstract hy1 z();
}
