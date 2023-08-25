package com.daaw;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes2.dex */
public final class sp8 {

    /* renamed from: a */
    public final Object f26514a = new Object();
    @GuardedBy("mLock")

    /* renamed from: b */
    public Queue f26515b;
    @GuardedBy("mLock")

    /* renamed from: c */
    public boolean f26516c;

    /* renamed from: a */
    public final void m10055a(qo8 qo8Var) {
        synchronized (this.f26514a) {
            if (this.f26515b == null) {
                this.f26515b = new ArrayDeque();
            }
            this.f26515b.add(qo8Var);
        }
    }

    /* renamed from: b */
    public final void m10054b(rj1 rj1Var) {
        qo8 qo8Var;
        synchronized (this.f26514a) {
            if (this.f26515b != null && !this.f26516c) {
                this.f26516c = true;
                while (true) {
                    synchronized (this.f26514a) {
                        qo8Var = (qo8) this.f26515b.poll();
                        if (qo8Var == null) {
                            this.f26516c = false;
                            return;
                        }
                    }
                    qo8Var.mo5231a(rj1Var);
                }
            }
        }
    }
}
