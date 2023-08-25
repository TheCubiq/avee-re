package com.daaw;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class qm4 {
    public final Executor a;
    public final ScheduledExecutorService b;
    public final f77 c;
    public volatile boolean d = true;

    public qm4(Executor executor, ScheduledExecutorService scheduledExecutorService, f77 f77Var) {
        this.a = executor;
        this.b = scheduledExecutorService;
        this.c = f77Var;
    }

    public static /* bridge */ /* synthetic */ void b(final qm4 qm4Var, List list, final o67 o67Var) {
        if (list == null || list.isEmpty()) {
            qm4Var.a.execute(new Runnable() { // from class: com.daaw.hm4
                @Override // java.lang.Runnable
                public final void run() {
                    o67.this.b(new gi5(3));
                }
            });
            return;
        }
        f77 i = s67.i(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final f77 f77Var = (f77) it.next();
            i = s67.n(s67.g(i, Throwable.class, new w57() { // from class: com.daaw.im4
                @Override // com.daaw.w57
                public final f77 zza(Object obj) {
                    o67.this.b((Throwable) obj);
                    return s67.i(null);
                }
            }, qm4Var.a), new w57() { // from class: com.daaw.jm4
                @Override // com.daaw.w57
                public final f77 zza(Object obj) {
                    return qm4.this.a(o67Var, f77Var, (zl4) obj);
                }
            }, qm4Var.a);
        }
        s67.r(i, new pm4(qm4Var, o67Var), qm4Var.a);
    }

    public final /* synthetic */ f77 a(o67 o67Var, f77 f77Var, zl4 zl4Var) {
        if (zl4Var != null) {
            o67Var.a(zl4Var);
        }
        return s67.o(f77Var, ((Long) rb3.b.e()).longValue(), TimeUnit.MILLISECONDS, this.b);
    }

    public final /* synthetic */ void d() {
        this.d = false;
    }

    public final void e(o67 o67Var) {
        s67.r(this.c, new lm4(this, o67Var), this.a);
    }

    public final boolean f() {
        return this.d;
    }
}
