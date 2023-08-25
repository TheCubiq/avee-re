package com.daaw;
/* loaded from: classes2.dex */
public final class zj1 extends qj1 {

    /* renamed from: r */
    public final Runnable f35167r;

    public zj1(Runnable runnable, long j, uj1 uj1Var) {
        super(j, uj1Var);
        this.f35167r = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f35167r.run();
        } finally {
            this.f24070q.mo7119a();
        }
    }

    public String toString() {
        return "Task[" + C0666aq.m27227a(this.f35167r) + '@' + C0666aq.m27226b(this.f35167r) + ", " + this.f24069p + ", " + this.f24070q + ']';
    }
}
