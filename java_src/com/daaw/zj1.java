package com.daaw;
/* loaded from: classes2.dex */
public final class zj1 extends qj1 {
    public final Runnable r;

    public zj1(Runnable runnable, long j, uj1 uj1Var) {
        super(j, uj1Var);
        this.r = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.r.run();
        } finally {
            this.q.a();
        }
    }

    public String toString() {
        return "Task[" + aq.a(this.r) + '@' + aq.b(this.r) + ", " + this.p + ", " + this.q + ']';
    }
}
