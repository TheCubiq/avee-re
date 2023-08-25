package com.daaw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
/* loaded from: classes.dex */
public final class dg2 implements pf2 {
    public final Map a = new HashMap();
    public final ye2 b;
    public final BlockingQueue c;
    public final df2 d;

    public dg2(ye2 ye2Var, BlockingQueue blockingQueue, df2 df2Var, byte[] bArr) {
        this.d = df2Var;
        this.b = ye2Var;
        this.c = blockingQueue;
    }

    @Override // com.daaw.pf2
    public final void a(qf2 qf2Var, wf2 wf2Var) {
        List<qf2> list;
        ve2 ve2Var = wf2Var.b;
        if (ve2Var == null || ve2Var.a(System.currentTimeMillis())) {
            zza(qf2Var);
            return;
        }
        String zzj = qf2Var.zzj();
        synchronized (this) {
            list = (List) this.a.remove(zzj);
        }
        if (list != null) {
            if (cg2.a) {
                cg2.d("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), zzj);
            }
            for (qf2 qf2Var2 : list) {
                this.d.b(qf2Var2, wf2Var, null);
            }
        }
    }

    public final synchronized boolean b(qf2 qf2Var) {
        String zzj = qf2Var.zzj();
        if (!this.a.containsKey(zzj)) {
            this.a.put(zzj, null);
            qf2Var.h(this);
            if (cg2.a) {
                cg2.a("new request, sending to network %s", zzj);
            }
            return false;
        }
        List list = (List) this.a.get(zzj);
        if (list == null) {
            list = new ArrayList();
        }
        qf2Var.zzm("waiting-for-response");
        list.add(qf2Var);
        this.a.put(zzj, list);
        if (cg2.a) {
            cg2.a("Request for cacheKey=%s is in flight, putting on hold.", zzj);
        }
        return true;
    }

    @Override // com.daaw.pf2
    public final synchronized void zza(qf2 qf2Var) {
        String zzj = qf2Var.zzj();
        List list = (List) this.a.remove(zzj);
        if (list == null || list.isEmpty()) {
            return;
        }
        if (cg2.a) {
            cg2.d("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), zzj);
        }
        qf2 qf2Var2 = (qf2) list.remove(0);
        this.a.put(zzj, list);
        qf2Var2.h(this);
        try {
            this.c.put(qf2Var2);
        } catch (InterruptedException e) {
            cg2.b("Couldn't add request to queue. %s", e.toString());
            Thread.currentThread().interrupt();
            this.b.b();
        }
    }
}
