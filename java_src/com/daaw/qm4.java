package com.daaw;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class qm4 {

    /* renamed from: a */
    public final Executor f24191a;

    /* renamed from: b */
    public final ScheduledExecutorService f24192b;

    /* renamed from: c */
    public final f77 f24193c;

    /* renamed from: d */
    public volatile boolean f24194d = true;

    public qm4(Executor executor, ScheduledExecutorService scheduledExecutorService, f77 f77Var) {
        this.f24191a = executor;
        this.f24192b = scheduledExecutorService;
        this.f24193c = f77Var;
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m12333b(final qm4 qm4Var, List list, final o67 o67Var) {
        if (list == null || list.isEmpty()) {
            qm4Var.f24191a.execute(new Runnable() { // from class: com.daaw.hm4
                @Override // java.lang.Runnable
                public final void run() {
                    o67.this.mo2150b(new gi5(3));
                }
            });
            return;
        }
        f77 m10634i = s67.m10634i(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final f77 f77Var = (f77) it.next();
            m10634i = s67.m10629n(s67.m10636g(m10634i, Throwable.class, new w57() { // from class: com.daaw.im4
                @Override // com.daaw.w57
                public final f77 zza(Object obj) {
                    o67.this.mo2150b((Throwable) obj);
                    return s67.m10634i(null);
                }
            }, qm4Var.f24191a), new w57() { // from class: com.daaw.jm4
                @Override // com.daaw.w57
                public final f77 zza(Object obj) {
                    return qm4.this.m12334a(o67Var, f77Var, (zl4) obj);
                }
            }, qm4Var.f24191a);
        }
        s67.m10625r(m10634i, new pm4(qm4Var, o67Var), qm4Var.f24191a);
    }

    /* renamed from: a */
    public final /* synthetic */ f77 m12334a(o67 o67Var, f77 f77Var, zl4 zl4Var) {
        if (zl4Var != null) {
            o67Var.mo2151a(zl4Var);
        }
        return s67.m10628o(f77Var, ((Long) rb3.f25097b.m16137e()).longValue(), TimeUnit.MILLISECONDS, this.f24192b);
    }

    /* renamed from: d */
    public final /* synthetic */ void m12331d() {
        this.f24194d = false;
    }

    /* renamed from: e */
    public final void m12330e(o67 o67Var) {
        s67.m10625r(this.f24193c, new lm4(this, o67Var), this.f24191a);
    }

    /* renamed from: f */
    public final boolean m12329f() {
        return this.f24194d;
    }
}
