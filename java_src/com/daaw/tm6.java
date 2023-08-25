package com.daaw;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
/* loaded from: classes2.dex */
public final class tm6 extends Thread {

    /* renamed from: p */
    public final Object f27871p;

    /* renamed from: q */
    public final BlockingQueue f27872q;

    /* renamed from: r */
    public boolean f27873r = false;

    /* renamed from: s */
    public final /* synthetic */ vn6 f27874s;

    public tm6(vn6 vn6Var, String str, BlockingQueue blockingQueue) {
        this.f27874s = vn6Var;
        ry0.m10830j(str);
        ry0.m10830j(blockingQueue);
        this.f27871p = new Object();
        this.f27872q = blockingQueue;
        setName(str);
    }

    /* renamed from: a */
    public final void m8963a() {
        synchronized (this.f27871p) {
            this.f27871p.notifyAll();
        }
    }

    /* renamed from: b */
    public final void m8962b() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        tm6 tm6Var;
        tm6 tm6Var2;
        obj = this.f27874s.f30367i;
        synchronized (obj) {
            if (!this.f27873r) {
                semaphore = this.f27874s.f30368j;
                semaphore.release();
                obj2 = this.f27874s.f30367i;
                obj2.notifyAll();
                vn6 vn6Var = this.f27874s;
                tm6Var = vn6Var.f30361c;
                if (this == tm6Var) {
                    vn6Var.f30361c = null;
                } else {
                    tm6Var2 = vn6Var.f30362d;
                    if (this == tm6Var2) {
                        vn6Var.f30362d = null;
                    } else {
                        vn6Var.f25143a.mo3895i().m14160q().m20653a("Current scheduler thread is neither worker nor network");
                    }
                }
                this.f27873r = true;
            }
        }
    }

    /* renamed from: c */
    public final void m8961c(InterruptedException interruptedException) {
        this.f27874s.f25143a.mo3895i().m14155w().m20652b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        Object obj;
        boolean z = false;
        while (!z) {
            try {
                semaphore = this.f27874s.f30368j;
                semaphore.acquire();
                z = true;
            } catch (InterruptedException e) {
                m8961c(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                ql6 ql6Var = (ql6) this.f27872q.poll();
                if (ql6Var != null) {
                    Process.setThreadPriority(true != ql6Var.f24147q ? 10 : threadPriority);
                    ql6Var.run();
                } else {
                    synchronized (this.f27871p) {
                        if (this.f27872q.peek() == null) {
                            vn6.m6995B(this.f27874s);
                            try {
                                this.f27871p.wait(30000L);
                            } catch (InterruptedException e2) {
                                m8961c(e2);
                            }
                        }
                    }
                    obj = this.f27874s.f30367i;
                    synchronized (obj) {
                        if (this.f27872q.peek() == null) {
                            m8962b();
                            return;
                        }
                    }
                }
            }
        } finally {
            m8962b();
        }
    }
}
