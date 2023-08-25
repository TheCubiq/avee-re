package com.daaw;
/* loaded from: classes.dex */
public class jr1<Result> implements Runnable {
    public b<Result> p;
    public a<Result> q;
    public volatile Result r = null;
    public volatile boolean s = false;

    /* loaded from: classes.dex */
    public interface a<Result> {
        void a(Result result);
    }

    /* loaded from: classes.dex */
    public interface b<Result> {
        Result a();
    }

    public jr1(b<Result> bVar) {
        this.p = bVar;
    }

    public void a(a<Result> aVar) {
        ir1.j.execute(this);
        this.q = aVar;
    }

    public Result b() {
        return this.r;
    }

    public boolean c() {
        return this.s;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.r = this.p.a();
        this.s = true;
        a<Result> aVar = this.q;
        if (aVar != null) {
            aVar.a(this.r);
        }
    }
}
