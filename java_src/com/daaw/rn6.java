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

    /* renamed from: a */
    public final on6 f25426a;

    /* renamed from: b */
    public final Queue f25427b = new LinkedBlockingQueue();

    /* renamed from: c */
    public final int f25428c = ((Integer) zzba.zzc().m23658b(g93.f10499N7)).intValue();

    /* renamed from: d */
    public final AtomicBoolean f25429d = new AtomicBoolean(false);

    public rn6(on6 on6Var, ScheduledExecutorService scheduledExecutorService) {
        this.f25426a = on6Var;
        long intValue = ((Integer) zzba.zzc().m23658b(g93.f10489M7)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: com.daaw.qn6
            @Override // java.lang.Runnable
            public final void run() {
                rn6.m11142c(rn6.this);
            }
        }, intValue, intValue, TimeUnit.MILLISECONDS);
    }

    /* renamed from: c */
    public static /* synthetic */ void m11142c(rn6 rn6Var) {
        while (!rn6Var.f25427b.isEmpty()) {
            rn6Var.f25426a.mo7889a((nn6) rn6Var.f25427b.remove());
        }
    }

    @Override // com.daaw.on6
    /* renamed from: a */
    public final void mo7889a(nn6 nn6Var) {
        if (this.f25427b.size() < this.f25428c) {
            this.f25427b.offer(nn6Var);
        } else if (this.f25429d.getAndSet(true)) {
        } else {
            Queue queue = this.f25427b;
            nn6 m14953b = nn6.m14953b("dropped_event");
            Map m14945j = nn6Var.m14945j();
            if (m14945j.containsKey("action")) {
                m14953b.m14954a("dropped_action", (String) m14945j.get("action"));
            }
            queue.offer(m14953b);
        }
    }

    @Override // com.daaw.on6
    /* renamed from: b */
    public final String mo7888b(nn6 nn6Var) {
        return this.f25426a.mo7888b(nn6Var);
    }
}
