package com.daaw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
/* loaded from: classes.dex */
public final class dg2 implements pf2 {

    /* renamed from: a */
    public final Map f7043a = new HashMap();

    /* renamed from: b */
    public final ye2 f7044b;

    /* renamed from: c */
    public final BlockingQueue f7045c;

    /* renamed from: d */
    public final df2 f7046d;

    public dg2(ye2 ye2Var, BlockingQueue blockingQueue, df2 df2Var, byte[] bArr) {
        this.f7046d = df2Var;
        this.f7044b = ye2Var;
        this.f7045c = blockingQueue;
    }

    @Override // com.daaw.pf2
    /* renamed from: a */
    public final void mo13408a(qf2 qf2Var, wf2 wf2Var) {
        List<qf2> list;
        ve2 ve2Var = wf2Var.f31213b;
        if (ve2Var == null || ve2Var.m7211a(System.currentTimeMillis())) {
            zza(qf2Var);
            return;
        }
        String zzj = qf2Var.zzj();
        synchronized (this) {
            list = (List) this.f7043a.remove(zzj);
        }
        if (list != null) {
            if (cg2.f5792a) {
                cg2.m25389d("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), zzj);
            }
            for (qf2 qf2Var2 : list) {
                this.f7046d.m24429b(qf2Var2, wf2Var, null);
            }
        }
    }

    /* renamed from: b */
    public final synchronized boolean m24418b(qf2 qf2Var) {
        String zzj = qf2Var.zzj();
        if (!this.f7043a.containsKey(zzj)) {
            this.f7043a.put(zzj, null);
            qf2Var.m12564h(this);
            if (cg2.f5792a) {
                cg2.m25392a("new request, sending to network %s", zzj);
            }
            return false;
        }
        List list = (List) this.f7043a.get(zzj);
        if (list == null) {
            list = new ArrayList();
        }
        qf2Var.zzm("waiting-for-response");
        list.add(qf2Var);
        this.f7043a.put(zzj, list);
        if (cg2.f5792a) {
            cg2.m25392a("Request for cacheKey=%s is in flight, putting on hold.", zzj);
        }
        return true;
    }

    @Override // com.daaw.pf2
    public final synchronized void zza(qf2 qf2Var) {
        String zzj = qf2Var.zzj();
        List list = (List) this.f7043a.remove(zzj);
        if (list == null || list.isEmpty()) {
            return;
        }
        if (cg2.f5792a) {
            cg2.m25389d("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), zzj);
        }
        qf2 qf2Var2 = (qf2) list.remove(0);
        this.f7043a.put(zzj, list);
        qf2Var2.m12564h(this);
        try {
            this.f7045c.put(qf2Var2);
        } catch (InterruptedException e) {
            cg2.m25391b("Couldn't add request to queue. %s", e.toString());
            Thread.currentThread().interrupt();
            this.f7044b.m3809b();
        }
    }
}
