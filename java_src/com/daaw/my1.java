package com.daaw;

import android.content.Context;
import androidx.work.C0511b;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
/* loaded from: classes.dex */
public class my1 implements mz0 {

    /* renamed from: c */
    public static final String f19289c = ll0.m16883f("WorkProgressUpdater");

    /* renamed from: a */
    public final WorkDatabase f19290a;

    /* renamed from: b */
    public final wj1 f19291b;

    /* renamed from: com.daaw.my1$a */
    /* loaded from: classes.dex */
    public class RunnableC2225a implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ UUID f19292p;

        /* renamed from: q */
        public final /* synthetic */ C0511b f19293q;

        /* renamed from: r */
        public final /* synthetic */ sb1 f19294r;

        public RunnableC2225a(UUID uuid, C0511b c0511b, sb1 sb1Var) {
            this.f19292p = uuid;
            this.f19293q = c0511b;
            this.f19294r = sb1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            qy1 mo9719m;
            String uuid = this.f19292p.toString();
            ll0 m16885c = ll0.m16885c();
            String str = my1.f19289c;
            m16885c.mo16882a(str, String.format("Updating progress for %s (%s)", this.f19292p, this.f19293q), new Throwable[0]);
            my1.this.f19290a.m26481c();
            try {
                mo9719m = my1.this.f19290a.mo27951B().mo9719m(uuid);
            } finally {
                try {
                } finally {
                }
            }
            if (mo9719m == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (mo9719m.f24625b == yx1.RUNNING) {
                my1.this.f19290a.mo27952A().mo16377b(new jy1(uuid, this.f19293q));
            } else {
                ll0.m16885c().mo16878h(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", uuid), new Throwable[0]);
            }
            this.f19294r.mo10473q(null);
            my1.this.f19290a.m26466r();
        }
    }

    public my1(WorkDatabase workDatabase, wj1 wj1Var) {
        this.f19290a = workDatabase;
        this.f19291b = wj1Var;
    }

    @Override // com.daaw.mz0
    /* renamed from: a */
    public fk0<Void> mo15655a(Context context, UUID uuid, C0511b c0511b) {
        sb1 m10470u = sb1.m10470u();
        this.f19291b.mo6051b(new RunnableC2225a(uuid, c0511b, m10470u));
        return m10470u;
    }
}
