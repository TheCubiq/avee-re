package com.daaw;

import android.os.Handler;
import com.daaw.InterfaceC1671ia;
/* renamed from: com.daaw.lq */
/* loaded from: classes.dex */
public final class C2106lq implements InterfaceC1671ia, bn1<Object> {

    /* renamed from: a */
    public final Handler f17611a;

    /* renamed from: b */
    public final InterfaceC1671ia.InterfaceC1672a f17612b;

    /* renamed from: c */
    public final yd1 f17613c;

    /* renamed from: d */
    public final InterfaceC3836zf f17614d;

    /* renamed from: e */
    public int f17615e;

    /* renamed from: f */
    public long f17616f;

    /* renamed from: g */
    public long f17617g;

    /* renamed from: h */
    public long f17618h;

    /* renamed from: i */
    public long f17619i;

    /* renamed from: j */
    public long f17620j;

    /* renamed from: com.daaw.lq$a */
    /* loaded from: classes.dex */
    public class RunnableC2107a implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ int f17621p;

        /* renamed from: q */
        public final /* synthetic */ long f17622q;

        /* renamed from: r */
        public final /* synthetic */ long f17623r;

        public RunnableC2107a(int i, long j, long j2) {
            this.f17621p = i;
            this.f17622q = j;
            this.f17623r = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2106lq.this.f17612b.mo14628k(this.f17621p, this.f17622q, this.f17623r);
        }
    }

    public C2106lq() {
        this(null, null, 1000000L, 2000, InterfaceC3836zf.f35013a);
    }

    public C2106lq(Handler handler, InterfaceC1671ia.InterfaceC1672a interfaceC1672a, long j, int i, InterfaceC3836zf interfaceC3836zf) {
        this.f17611a = handler;
        this.f17612b = interfaceC1672a;
        this.f17613c = new yd1(i);
        this.f17614d = interfaceC3836zf;
        this.f17620j = j;
    }

    @Override // com.daaw.bn1
    /* renamed from: a */
    public synchronized void mo16680a(Object obj, int i) {
        this.f17617g += i;
    }

    @Override // com.daaw.bn1
    /* renamed from: b */
    public synchronized void mo16679b(Object obj) {
        C2914s6.m10685f(this.f17615e > 0);
        long mo2363b = this.f17614d.mo2363b();
        int i = (int) (mo2363b - this.f17616f);
        long j = i;
        this.f17618h += j;
        long j2 = this.f17619i;
        long j3 = this.f17617g;
        this.f17619i = j2 + j3;
        if (i > 0) {
            this.f17613c.m3856a((int) Math.sqrt(j3), (float) ((8000 * j3) / j));
            if (this.f17618h >= 2000 || this.f17619i >= 524288) {
                this.f17620j = this.f17613c.m3853d(0.5f);
            }
        }
        m16675f(i, this.f17617g, this.f17620j);
        int i2 = this.f17615e - 1;
        this.f17615e = i2;
        if (i2 > 0) {
            this.f17616f = mo2363b;
        }
        this.f17617g = 0L;
    }

    @Override // com.daaw.bn1
    /* renamed from: c */
    public synchronized void mo16678c(Object obj, C2570pp c2570pp) {
        if (this.f17615e == 0) {
            this.f17616f = this.f17614d.mo2363b();
        }
        this.f17615e++;
    }

    @Override // com.daaw.InterfaceC1671ia
    /* renamed from: d */
    public synchronized long mo16677d() {
        return this.f17620j;
    }

    /* renamed from: f */
    public final void m16675f(int i, long j, long j2) {
        Handler handler = this.f17611a;
        if (handler == null || this.f17612b == null) {
            return;
        }
        handler.post(new RunnableC2107a(i, j, j2));
    }
}
