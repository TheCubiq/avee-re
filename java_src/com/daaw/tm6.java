package com.daaw;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
/* loaded from: classes2.dex */
public final class tm6 extends Thread {
    public final Object p;
    public final BlockingQueue q;
    public boolean r = false;
    public final /* synthetic */ vn6 s;

    public tm6(vn6 vn6Var, String str, BlockingQueue blockingQueue) {
        this.s = vn6Var;
        ry0.j(str);
        ry0.j(blockingQueue);
        this.p = new Object();
        this.q = blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.p) {
            this.p.notifyAll();
        }
    }

    public final void b() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        tm6 tm6Var;
        tm6 tm6Var2;
        obj = this.s.i;
        synchronized (obj) {
            if (!this.r) {
                semaphore = this.s.j;
                semaphore.release();
                obj2 = this.s.i;
                obj2.notifyAll();
                vn6 vn6Var = this.s;
                tm6Var = vn6Var.c;
                if (this == tm6Var) {
                    vn6Var.c = null;
                } else {
                    tm6Var2 = vn6Var.d;
                    if (this == tm6Var2) {
                        vn6Var.d = null;
                    } else {
                        vn6Var.a.i().q().a("Current scheduler thread is neither worker nor network");
                    }
                }
                this.r = true;
            }
        }
    }

    public final void c(InterruptedException interruptedException) {
        this.s.a.i().w().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        Object obj;
        boolean z = false;
        while (!z) {
            try {
                semaphore = this.s.j;
                semaphore.acquire();
                z = true;
            } catch (InterruptedException e) {
                c(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                ql6 ql6Var = (ql6) this.q.poll();
                if (ql6Var != null) {
                    Process.setThreadPriority(true != ql6Var.q ? 10 : threadPriority);
                    ql6Var.run();
                } else {
                    synchronized (this.p) {
                        if (this.q.peek() == null) {
                            vn6.B(this.s);
                            try {
                                this.p.wait(30000L);
                            } catch (InterruptedException e2) {
                                c(e2);
                            }
                        }
                    }
                    obj = this.s.i;
                    synchronized (obj) {
                        if (this.q.peek() == null) {
                            b();
                            return;
                        }
                    }
                }
            }
        } finally {
            b();
        }
    }
}
