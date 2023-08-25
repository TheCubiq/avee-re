package com.daaw;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
/* loaded from: classes.dex */
public class xx1 implements j30 {
    public static final String d = ll0.f("WMFgUpdater");
    public final wj1 a;
    public final i30 b;
    public final ry1 c;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ sb1 p;
        public final /* synthetic */ UUID q;
        public final /* synthetic */ g30 r;
        public final /* synthetic */ Context s;

        public a(sb1 sb1Var, UUID uuid, g30 g30Var, Context context) {
            this.p = sb1Var;
            this.q = uuid;
            this.r = g30Var;
            this.s = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.p.isCancelled()) {
                    String uuid = this.q.toString();
                    yx1 l = xx1.this.c.l(uuid);
                    if (l == null || l.a()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    xx1.this.b.a(uuid, this.r);
                    this.s.startService(androidx.work.impl.foreground.a.a(this.s, uuid, this.r));
                }
                this.p.q(null);
            } catch (Throwable th) {
                this.p.r(th);
            }
        }
    }

    public xx1(WorkDatabase workDatabase, i30 i30Var, wj1 wj1Var) {
        this.b = i30Var;
        this.a = wj1Var;
        this.c = workDatabase.B();
    }

    @Override // com.daaw.j30
    public fk0<Void> a(Context context, UUID uuid, g30 g30Var) {
        sb1 u = sb1.u();
        this.a.b(new a(u, uuid, g30Var, context));
        return u;
    }
}
