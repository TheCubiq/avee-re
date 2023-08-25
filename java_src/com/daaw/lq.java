package com.daaw;

import android.os.Handler;
import com.daaw.ia;
/* loaded from: classes.dex */
public final class lq implements ia, bn1<Object> {
    public final Handler a;
    public final ia.a b;
    public final yd1 c;
    public final zf d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ int p;
        public final /* synthetic */ long q;
        public final /* synthetic */ long r;

        public a(int i, long j, long j2) {
            this.p = i;
            this.q = j;
            this.r = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            lq.this.b.k(this.p, this.q, this.r);
        }
    }

    public lq() {
        this(null, null, 1000000L, 2000, zf.a);
    }

    public lq(Handler handler, ia.a aVar, long j, int i, zf zfVar) {
        this.a = handler;
        this.b = aVar;
        this.c = new yd1(i);
        this.d = zfVar;
        this.j = j;
    }

    @Override // com.daaw.bn1
    public synchronized void a(Object obj, int i) {
        this.g += i;
    }

    @Override // com.daaw.bn1
    public synchronized void b(Object obj) {
        s6.f(this.e > 0);
        long b = this.d.b();
        int i = (int) (b - this.f);
        long j = i;
        this.h += j;
        long j2 = this.i;
        long j3 = this.g;
        this.i = j2 + j3;
        if (i > 0) {
            this.c.a((int) Math.sqrt(j3), (float) ((8000 * j3) / j));
            if (this.h >= 2000 || this.i >= 524288) {
                this.j = this.c.d(0.5f);
            }
        }
        f(i, this.g, this.j);
        int i2 = this.e - 1;
        this.e = i2;
        if (i2 > 0) {
            this.f = b;
        }
        this.g = 0L;
    }

    @Override // com.daaw.bn1
    public synchronized void c(Object obj, pp ppVar) {
        if (this.e == 0) {
            this.f = this.d.b();
        }
        this.e++;
    }

    @Override // com.daaw.ia
    public synchronized long d() {
        return this.j;
    }

    public final void f(int i, long j, long j2) {
        Handler handler = this.a;
        if (handler == null || this.b == null) {
            return;
        }
        handler.post(new a(i, j, j2));
    }
}
