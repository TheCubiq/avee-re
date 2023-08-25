package com.daaw;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C0538a;
import java.util.UUID;
/* loaded from: classes.dex */
public class xx1 implements j30 {

    /* renamed from: d */
    public static final String f33095d = ll0.m16883f("WMFgUpdater");

    /* renamed from: a */
    public final wj1 f33096a;

    /* renamed from: b */
    public final i30 f33097b;

    /* renamed from: c */
    public final ry1 f33098c;

    /* renamed from: com.daaw.xx1$a */
    /* loaded from: classes.dex */
    public class RunnableC3650a implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ sb1 f33099p;

        /* renamed from: q */
        public final /* synthetic */ UUID f33100q;

        /* renamed from: r */
        public final /* synthetic */ g30 f33101r;

        /* renamed from: s */
        public final /* synthetic */ Context f33102s;

        public RunnableC3650a(sb1 sb1Var, UUID uuid, g30 g30Var, Context context) {
            this.f33099p = sb1Var;
            this.f33100q = uuid;
            this.f33101r = g30Var;
            this.f33102s = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f33099p.isCancelled()) {
                    String uuid = this.f33100q.toString();
                    yx1 mo9720l = xx1.this.f33098c.mo9720l(uuid);
                    if (mo9720l == null || mo9720l.m3106a()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    xx1.this.f33097b.mo18160a(uuid, this.f33101r);
                    this.f33102s.startService(C0538a.m27897a(this.f33102s, uuid, this.f33101r));
                }
                this.f33099p.mo10473q(null);
            } catch (Throwable th) {
                this.f33099p.mo10472r(th);
            }
        }
    }

    public xx1(WorkDatabase workDatabase, i30 i30Var, wj1 wj1Var) {
        this.f33097b = i30Var;
        this.f33096a = wj1Var;
        this.f33098c = workDatabase.mo27951B();
    }

    @Override // com.daaw.j30
    /* renamed from: a */
    public fk0<Void> mo4415a(Context context, UUID uuid, g30 g30Var) {
        sb1 m10470u = sb1.m10470u();
        this.f33096a.mo6051b(new RunnableC3650a(m10470u, uuid, g30Var, context));
        return m10470u;
    }
}
