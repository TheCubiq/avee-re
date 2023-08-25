package com.daaw;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class rp2 implements op2 {
    public final gq2[] a;
    public final fx2 b;
    public final dx2 c;
    public final Handler d;
    public final aq2 e;
    public final CopyOnWriteArraySet f;
    public final lq2 g;
    public final kq2 h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public mq2 o;
    public Object p;
    public rw2 q;
    public dx2 r;
    public fq2 s;
    public tp2 t;
    public long u;

    @SuppressLint({"HandlerLeak"})
    public rp2(gq2[] gq2VarArr, fx2 fx2Var, y34 y34Var, byte[] bArr) {
        String str = pz2.e;
        StringBuilder sb = new StringBuilder();
        sb.append("Init ExoPlayerLib/2.4.2 [");
        sb.append(str);
        sb.append("]");
        this.a = gq2VarArr;
        Objects.requireNonNull(fx2Var);
        this.b = fx2Var;
        this.j = false;
        this.k = 1;
        this.f = new CopyOnWriteArraySet();
        dx2 dx2Var = new dx2(new vw2[2], null);
        this.c = dx2Var;
        this.o = mq2.a;
        this.g = new lq2();
        this.h = new kq2();
        this.q = rw2.d;
        this.r = dx2Var;
        this.s = fq2.d;
        qp2 qp2Var = new qp2(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.d = qp2Var;
        tp2 tp2Var = new tp2(0, 0L);
        this.t = tp2Var;
        this.e = new aq2(gq2VarArr, fx2Var, y34Var, this.j, 0, qp2Var, tp2Var, this, null);
    }

    public final int a() {
        if (!this.o.h() && this.l <= 0) {
            this.o.d(this.t.a, this.h, false);
        }
        return 0;
    }

    public final void b(Message message) {
        switch (message.what) {
            case 0:
                this.m--;
                return;
            case 1:
                this.k = message.arg1;
                Iterator it = this.f.iterator();
                while (it.hasNext()) {
                    ((lp2) it.next()).B(this.j, this.k);
                }
                return;
            case 2:
                this.n = message.arg1 != 0;
                Iterator it2 = this.f.iterator();
                while (it2.hasNext()) {
                    ((lp2) it2.next()).zza(this.n);
                }
                return;
            case 3:
                if (this.m == 0) {
                    gx2 gx2Var = (gx2) message.obj;
                    this.i = true;
                    this.q = gx2Var.a;
                    this.r = gx2Var.b;
                    this.b.b(gx2Var.c);
                    Iterator it3 = this.f.iterator();
                    while (it3.hasNext()) {
                        ((lp2) it3.next()).h(this.q, this.r);
                    }
                    return;
                }
                return;
            case 4:
                int i = this.l - 1;
                this.l = i;
                if (i == 0) {
                    this.t = (tp2) message.obj;
                    if (message.arg1 != 0) {
                        Iterator it4 = this.f.iterator();
                        while (it4.hasNext()) {
                            ((lp2) it4.next()).zze();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.l == 0) {
                    this.t = (tp2) message.obj;
                    Iterator it5 = this.f.iterator();
                    while (it5.hasNext()) {
                        ((lp2) it5.next()).zze();
                    }
                    return;
                }
                return;
            case 6:
                zp2 zp2Var = (zp2) message.obj;
                this.l -= zp2Var.d;
                if (this.m == 0) {
                    this.o = zp2Var.a;
                    this.p = zp2Var.b;
                    this.t = zp2Var.c;
                    Iterator it6 = this.f.iterator();
                    while (it6.hasNext()) {
                        ((lp2) it6.next()).z(this.o, this.p);
                    }
                    return;
                }
                return;
            case 7:
                fq2 fq2Var = (fq2) message.obj;
                if (this.s.equals(fq2Var)) {
                    return;
                }
                this.s = fq2Var;
                Iterator it7 = this.f.iterator();
                while (it7.hasNext()) {
                    ((lp2) it7.next()).v(fq2Var);
                }
                return;
            case 8:
                kp2 kp2Var = (kp2) message.obj;
                Iterator it8 = this.f.iterator();
                while (it8.hasNext()) {
                    ((lp2) it8.next()).m(kp2Var);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.daaw.op2
    public final void i(int i) {
        this.e.x(i);
    }

    @Override // com.daaw.op2
    public final void j(long j) {
        a();
        if (!this.o.h() && this.o.c() <= 0) {
            throw new dq2(this.o, 0, j);
        }
        this.l++;
        if (!this.o.h()) {
            this.o.g(0, this.g, false);
            long a = jp2.a(j);
            long j2 = this.o.d(0, this.h, false).c;
            if (j2 != -9223372036854775807L) {
                int i = (a > j2 ? 1 : (a == j2 ? 0 : -1));
            }
        }
        this.u = j;
        this.e.B(this.o, 0, jp2.a(j));
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((lp2) it.next()).zze();
        }
    }

    @Override // com.daaw.op2
    public final void k(boolean z) {
        if (this.j != z) {
            this.j = z;
            this.e.F(z);
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((lp2) it.next()).B(z, this.k);
            }
        }
    }

    @Override // com.daaw.op2
    public final void l(lp2 lp2Var) {
        this.f.remove(lp2Var);
    }

    @Override // com.daaw.op2
    public final void m(yv2 yv2Var) {
        if (!this.o.h() || this.p != null) {
            this.o = mq2.a;
            this.p = null;
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((lp2) it.next()).z(this.o, this.p);
            }
        }
        if (this.i) {
            this.i = false;
            this.q = rw2.d;
            this.r = this.c;
            this.b.b(null);
            Iterator it2 = this.f.iterator();
            while (it2.hasNext()) {
                ((lp2) it2.next()).h(this.q, this.r);
            }
        }
        this.m++;
        this.e.z(yv2Var, true);
    }

    @Override // com.daaw.op2
    public final void n(np2... np2VarArr) {
        if (!this.e.I()) {
            this.e.v(np2VarArr);
        } else if (this.e.H(np2VarArr)) {
        } else {
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((lp2) it.next()).m(kp2.c(new RuntimeException(new TimeoutException("ExoPlayer3 blockingSendMessages timeout"))));
            }
        }
    }

    @Override // com.daaw.op2
    public final void o(np2... np2VarArr) {
        this.e.C(np2VarArr);
    }

    @Override // com.daaw.op2
    public final void p(int i) {
        this.e.D(i);
    }

    @Override // com.daaw.op2
    public final void q(int i) {
        this.e.E(i);
    }

    @Override // com.daaw.op2
    public final void r(lp2 lp2Var) {
        this.f.add(lp2Var);
    }

    @Override // com.daaw.op2
    public final int zza() {
        return this.k;
    }

    @Override // com.daaw.op2
    public final long zzb() {
        if (this.o.h() || this.l > 0) {
            return this.u;
        }
        this.o.d(this.t.a, this.h, false);
        return jp2.b(0L) + jp2.b(this.t.d);
    }

    @Override // com.daaw.op2
    public final long zzc() {
        if (this.o.h() || this.l > 0) {
            return this.u;
        }
        this.o.d(this.t.a, this.h, false);
        return jp2.b(0L) + jp2.b(this.t.c);
    }

    @Override // com.daaw.op2
    public final long zzd() {
        if (this.o.h()) {
            return -9223372036854775807L;
        }
        mq2 mq2Var = this.o;
        a();
        return jp2.b(mq2Var.g(0, this.g, false).a);
    }

    @Override // com.daaw.op2
    public final void zzg() {
        this.e.w();
    }

    @Override // com.daaw.op2
    public final void zzi() {
        this.e.y();
    }

    @Override // com.daaw.op2
    public final void zzk() {
        if (!this.e.I()) {
            this.e.A();
        } else if (!this.e.J()) {
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((lp2) it.next()).m(kp2.c(new RuntimeException(new TimeoutException("ExoPlayer3 release timeout"))));
            }
        }
        this.d.removeCallbacksAndMessages(null);
    }

    @Override // com.daaw.op2
    public final void zzr() {
        this.e.G();
    }
}
