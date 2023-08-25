package com.daaw;
/* loaded from: classes.dex */
public class jr1<Result> implements Runnable {

    /* renamed from: p */
    public InterfaceC1858b<Result> f15347p;

    /* renamed from: q */
    public InterfaceC1857a<Result> f15348q;

    /* renamed from: r */
    public volatile Result f15349r = null;

    /* renamed from: s */
    public volatile boolean f15350s = false;

    /* renamed from: com.daaw.jr1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1857a<Result> {
        /* renamed from: a */
        void mo18315a(Result result);
    }

    /* renamed from: com.daaw.jr1$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1858b<Result> {
        /* renamed from: a */
        Result mo18314a();
    }

    public jr1(InterfaceC1858b<Result> interfaceC1858b) {
        this.f15347p = interfaceC1858b;
    }

    /* renamed from: a */
    public void m18318a(InterfaceC1857a<Result> interfaceC1857a) {
        ir1.f13941j.execute(this);
        this.f15348q = interfaceC1857a;
    }

    /* renamed from: b */
    public Result m18317b() {
        return this.f15349r;
    }

    /* renamed from: c */
    public boolean m18316c() {
        return this.f15350s;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f15349r = this.f15347p.mo18314a();
        this.f15350s = true;
        InterfaceC1857a<Result> interfaceC1857a = this.f15348q;
        if (interfaceC1857a != null) {
            interfaceC1857a.mo18315a(this.f15349r);
        }
    }
}
