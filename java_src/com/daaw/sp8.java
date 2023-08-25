package com.daaw;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes2.dex */
public final class sp8 {
    public final Object a = new Object();
    @GuardedBy("mLock")
    public Queue b;
    @GuardedBy("mLock")
    public boolean c;

    public final void a(qo8 qo8Var) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(qo8Var);
        }
    }

    public final void b(rj1 rj1Var) {
        qo8 qo8Var;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        qo8Var = (qo8) this.b.poll();
                        if (qo8Var == null) {
                            this.c = false;
                            return;
                        }
                    }
                    qo8Var.a(rj1Var);
                }
            }
        }
    }
}
