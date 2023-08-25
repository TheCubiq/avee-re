package com.daaw;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
/* loaded from: classes.dex */
public class my1 implements mz0 {
    public static final String c = ll0.f("WorkProgressUpdater");
    public final WorkDatabase a;
    public final wj1 b;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ UUID p;
        public final /* synthetic */ androidx.work.b q;
        public final /* synthetic */ sb1 r;

        public a(UUID uuid, androidx.work.b bVar, sb1 sb1Var) {
            this.p = uuid;
            this.q = bVar;
            this.r = sb1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            qy1 m;
            String uuid = this.p.toString();
            ll0 c = ll0.c();
            String str = my1.c;
            c.a(str, String.format("Updating progress for %s (%s)", this.p, this.q), new Throwable[0]);
            my1.this.a.c();
            try {
                m = my1.this.a.B().m(uuid);
            } finally {
                try {
                } finally {
                }
            }
            if (m == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (m.b == yx1.RUNNING) {
                my1.this.a.A().b(new jy1(uuid, this.q));
            } else {
                ll0.c().h(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", uuid), new Throwable[0]);
            }
            this.r.q(null);
            my1.this.a.r();
        }
    }

    public my1(WorkDatabase workDatabase, wj1 wj1Var) {
        this.a = workDatabase;
        this.b = wj1Var;
    }

    @Override // com.daaw.mz0
    public fk0<Void> a(Context context, UUID uuid, androidx.work.b bVar) {
        sb1 u = sb1.u();
        this.b.b(new a(uuid, bVar, u));
        return u;
    }
}
