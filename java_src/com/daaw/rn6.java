package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class rn6 implements on6 {
    public final on6 a;
    public final Queue b = new LinkedBlockingQueue();
    public final int c = ((Integer) zzba.zzc().b(g93.N7)).intValue();
    public final AtomicBoolean d = new AtomicBoolean(false);

    public rn6(on6 on6Var, ScheduledExecutorService scheduledExecutorService) {
        this.a = on6Var;
        long intValue = ((Integer) zzba.zzc().b(g93.M7)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: com.daaw.qn6
            @Override // java.lang.Runnable
            public final void run() {
                rn6.c(rn6.this);
            }
        }, intValue, intValue, TimeUnit.MILLISECONDS);
    }

    public static /* synthetic */ void c(rn6 rn6Var) {
        while (!rn6Var.b.isEmpty()) {
            rn6Var.a.a((nn6) rn6Var.b.remove());
        }
    }

    @Override // com.daaw.on6
    public final void a(nn6 nn6Var) {
        if (this.b.size() < this.c) {
            this.b.offer(nn6Var);
        } else if (this.d.getAndSet(true)) {
        } else {
            Queue queue = this.b;
            nn6 b = nn6.b("dropped_event");
            Map j = nn6Var.j();
            if (j.containsKey("action")) {
                b.a("dropped_action", (String) j.get("action"));
            }
            queue.offer(b);
        }
    }

    @Override // com.daaw.on6
    public final String b(nn6 nn6Var) {
        return this.a.b(nn6Var);
    }
}
