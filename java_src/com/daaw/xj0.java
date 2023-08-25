package com.daaw;
/* loaded from: classes2.dex */
public final class xj0 extends AbstractC2557pl implements Runnable, InterfaceC1459gs {

    /* renamed from: q */
    public final AbstractC2557pl f32762q;

    /* renamed from: r */
    public final int f32763r;
    private volatile int runningWorkers;

    /* renamed from: s */
    public final /* synthetic */ InterfaceC1459gs f32764s;

    /* renamed from: t */
    public final zk0<Runnable> f32765t;

    public xj0(AbstractC2557pl abstractC2557pl, int i) {
        this.f32762q = abstractC2557pl;
        this.f32763r = i;
        InterfaceC1459gs interfaceC1459gs = abstractC2557pl instanceof InterfaceC1459gs ? (InterfaceC1459gs) abstractC2557pl : null;
        this.f32764s = interfaceC1459gs == null ? C3359vq.m6934a() : interfaceC1459gs;
        this.f32765t = new zk0<>(false);
    }

    @Override // com.daaw.AbstractC2557pl
    /* renamed from: T */
    public void mo5048T(InterfaceC2307nl interfaceC2307nl, Runnable runnable) {
        if (!m5047W(runnable) && m5046X()) {
            this.f32762q.mo5048T(this, this);
        }
    }

    /* renamed from: W */
    public final boolean m5047W(Runnable runnable) {
        this.f32765t.m2156a(runnable);
        return this.runningWorkers >= this.f32763r;
    }

    /* renamed from: X */
    public final boolean m5046X() {
        synchronized (this) {
            if (this.runningWorkers >= this.f32763r) {
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
        if (r4.f32765t.m2154c() != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        r4.runningWorkers++;
        r1 = com.daaw.lp1.f17593a;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        while (true) {
            int i = 0;
            while (true) {
                Runnable m2153d = this.f32765t.m2153d();
                if (m2153d == null) {
                    break;
                }
                try {
                    m2153d.run();
                } catch (Throwable th) {
                    C2954sl.m10220a(C2215mw.f19172p, th);
                }
                i++;
                if (i >= 16 && this.f32762q.mo11594U(this)) {
                    this.f32762q.mo5048T(this, this);
                    return;
                }
            }
        }
    }
}
