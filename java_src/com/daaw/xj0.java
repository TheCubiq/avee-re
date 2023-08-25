package com.daaw;
/* loaded from: classes2.dex */
public final class xj0 extends pl implements Runnable, gs {
    public final pl q;
    public final int r;
    private volatile int runningWorkers;
    public final /* synthetic */ gs s;
    public final zk0<Runnable> t;

    public xj0(pl plVar, int i) {
        this.q = plVar;
        this.r = i;
        gs gsVar = plVar instanceof gs ? (gs) plVar : null;
        this.s = gsVar == null ? vq.a() : gsVar;
        this.t = new zk0<>(false);
    }

    @Override // com.daaw.pl
    public void T(nl nlVar, Runnable runnable) {
        if (!W(runnable) && X()) {
            this.q.T(this, this);
        }
    }

    public final boolean W(Runnable runnable) {
        this.t.a(runnable);
        return this.runningWorkers >= this.r;
    }

    public final boolean X() {
        synchronized (this) {
            if (this.runningWorkers >= this.r) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r4.t.c() != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        r4.runningWorkers++;
        r1 = com.daaw.lp1.a;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            com.daaw.zk0<java.lang.Runnable> r2 = r4.t
            java.lang.Object r2 = r2.d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L2a
            r2.run()     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r2 = move-exception
            com.daaw.mw r3 = com.daaw.mw.p
            com.daaw.sl.a(r3, r2)
        L16:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L2
            com.daaw.pl r2 = r4.q
            boolean r2 = r2.U(r4)
            if (r2 == 0) goto L2
            com.daaw.pl r0 = r4.q
            r0.T(r4, r4)
            return
        L2a:
            monitor-enter(r4)
            int r1 = r4.runningWorkers     // Catch: java.lang.Throwable -> L45
            int r1 = r1 + (-1)
            r4.runningWorkers = r1     // Catch: java.lang.Throwable -> L45
            com.daaw.zk0<java.lang.Runnable> r1 = r4.t     // Catch: java.lang.Throwable -> L45
            int r1 = r1.c()     // Catch: java.lang.Throwable -> L45
            if (r1 != 0) goto L3b
            monitor-exit(r4)
            return
        L3b:
            int r1 = r4.runningWorkers     // Catch: java.lang.Throwable -> L45
            int r1 = r1 + 1
            r4.runningWorkers = r1     // Catch: java.lang.Throwable -> L45
            com.daaw.lp1 r1 = com.daaw.lp1.a     // Catch: java.lang.Throwable -> L45
            monitor-exit(r4)
            goto L1
        L45:
            r0 = move-exception
            monitor-exit(r4)
            goto L49
        L48:
            throw r0
        L49:
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.xj0.run():void");
    }
}
