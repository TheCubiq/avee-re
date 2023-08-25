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

    /* renamed from: a */
    public final gq2[] f25466a;

    /* renamed from: b */
    public final fx2 f25467b;

    /* renamed from: c */
    public final dx2 f25468c;

    /* renamed from: d */
    public final Handler f25469d;

    /* renamed from: e */
    public final aq2 f25470e;

    /* renamed from: f */
    public final CopyOnWriteArraySet f25471f;

    /* renamed from: g */
    public final lq2 f25472g;

    /* renamed from: h */
    public final kq2 f25473h;

    /* renamed from: i */
    public boolean f25474i;

    /* renamed from: j */
    public boolean f25475j;

    /* renamed from: k */
    public int f25476k;

    /* renamed from: l */
    public int f25477l;

    /* renamed from: m */
    public int f25478m;

    /* renamed from: n */
    public boolean f25479n;

    /* renamed from: o */
    public mq2 f25480o;

    /* renamed from: p */
    public Object f25481p;

    /* renamed from: q */
    public rw2 f25482q;

    /* renamed from: r */
    public dx2 f25483r;

    /* renamed from: s */
    public fq2 f25484s;

    /* renamed from: t */
    public tp2 f25485t;

    /* renamed from: u */
    public long f25486u;

    @SuppressLint({"HandlerLeak"})
    public rp2(gq2[] gq2VarArr, fx2 fx2Var, y34 y34Var, byte[] bArr) {
        String str = pz2.f23551e;
        StringBuilder sb = new StringBuilder();
        sb.append("Init ExoPlayerLib/2.4.2 [");
        sb.append(str);
        sb.append("]");
        this.f25466a = gq2VarArr;
        Objects.requireNonNull(fx2Var);
        this.f25467b = fx2Var;
        this.f25475j = false;
        this.f25476k = 1;
        this.f25471f = new CopyOnWriteArraySet();
        dx2 dx2Var = new dx2(new vw2[2], null);
        this.f25468c = dx2Var;
        this.f25480o = mq2.f19069a;
        this.f25472g = new lq2();
        this.f25473h = new kq2();
        this.f25482q = rw2.f25665d;
        this.f25483r = dx2Var;
        this.f25484s = fq2.f9781d;
        qp2 qp2Var = new qp2(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f25469d = qp2Var;
        tp2 tp2Var = new tp2(0, 0L);
        this.f25485t = tp2Var;
        this.f25470e = new aq2(gq2VarArr, fx2Var, y34Var, this.f25475j, 0, qp2Var, tp2Var, this, null);
    }

    /* renamed from: a */
    public final int m11097a() {
        if (!this.f25480o.m15847h() && this.f25477l <= 0) {
            this.f25480o.mo15851d(this.f25485t.f27941a, this.f25473h, false);
        }
        return 0;
    }

    /* renamed from: b */
    public final void m11096b(Message message) {
        switch (message.what) {
            case 0:
                this.f25478m--;
                return;
            case 1:
                this.f25476k = message.arg1;
                Iterator it = this.f25471f.iterator();
                while (it.hasNext()) {
                    ((lp2) it.next()).mo16685B(this.f25475j, this.f25476k);
                }
                return;
            case 2:
                this.f25479n = message.arg1 != 0;
                Iterator it2 = this.f25471f.iterator();
                while (it2.hasNext()) {
                    ((lp2) it2.next()).zza(this.f25479n);
                }
                return;
            case 3:
                if (this.f25478m == 0) {
                    gx2 gx2Var = (gx2) message.obj;
                    this.f25474i = true;
                    this.f25482q = gx2Var.f11831a;
                    this.f25483r = gx2Var.f11832b;
                    this.f25467b.mo22149b(gx2Var.f11833c);
                    Iterator it3 = this.f25471f.iterator();
                    while (it3.hasNext()) {
                        ((lp2) it3.next()).mo16684h(this.f25482q, this.f25483r);
                    }
                    return;
                }
                return;
            case 4:
                int i = this.f25477l - 1;
                this.f25477l = i;
                if (i == 0) {
                    this.f25485t = (tp2) message.obj;
                    if (message.arg1 != 0) {
                        Iterator it4 = this.f25471f.iterator();
                        while (it4.hasNext()) {
                            ((lp2) it4.next()).zze();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.f25477l == 0) {
                    this.f25485t = (tp2) message.obj;
                    Iterator it5 = this.f25471f.iterator();
                    while (it5.hasNext()) {
                        ((lp2) it5.next()).zze();
                    }
                    return;
                }
                return;
            case 6:
                zp2 zp2Var = (zp2) message.obj;
                this.f25477l -= zp2Var.f35371d;
                if (this.f25478m == 0) {
                    this.f25480o = zp2Var.f35368a;
                    this.f25481p = zp2Var.f35369b;
                    this.f25485t = zp2Var.f35370c;
                    Iterator it6 = this.f25471f.iterator();
                    while (it6.hasNext()) {
                        ((lp2) it6.next()).mo16681z(this.f25480o, this.f25481p);
                    }
                    return;
                }
                return;
            case 7:
                fq2 fq2Var = (fq2) message.obj;
                if (this.f25484s.equals(fq2Var)) {
                    return;
                }
                this.f25484s = fq2Var;
                Iterator it7 = this.f25471f.iterator();
                while (it7.hasNext()) {
                    ((lp2) it7.next()).mo16682v(fq2Var);
                }
                return;
            case 8:
                kp2 kp2Var = (kp2) message.obj;
                Iterator it8 = this.f25471f.iterator();
                while (it8.hasNext()) {
                    ((lp2) it8.next()).mo16683m(kp2Var);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.daaw.op2
    /* renamed from: i */
    public final void mo11095i(int i) {
        this.f25470e.m27170x(i);
    }

    @Override // com.daaw.op2
    /* renamed from: j */
    public final void mo11094j(long j) {
        m11097a();
        if (!this.f25480o.m15847h() && this.f25480o.mo15852c() <= 0) {
            throw new dq2(this.f25480o, 0, j);
        }
        this.f25477l++;
        if (!this.f25480o.m15847h()) {
            this.f25480o.m15848g(0, this.f25472g, false);
            long m18345a = jp2.m18345a(j);
            long j2 = this.f25480o.mo15851d(0, this.f25473h, false).f16696c;
            if (j2 != -9223372036854775807L) {
                int i = (m18345a > j2 ? 1 : (m18345a == j2 ? 0 : -1));
            }
        }
        this.f25486u = j;
        this.f25470e.m27206B(this.f25480o, 0, jp2.m18345a(j));
        Iterator it = this.f25471f.iterator();
        while (it.hasNext()) {
            ((lp2) it.next()).zze();
        }
    }

    @Override // com.daaw.op2
    /* renamed from: k */
    public final void mo11093k(boolean z) {
        if (this.f25475j != z) {
            this.f25475j = z;
            this.f25470e.m27202F(z);
            Iterator it = this.f25471f.iterator();
            while (it.hasNext()) {
                ((lp2) it.next()).mo16685B(z, this.f25476k);
            }
        }
    }

    @Override // com.daaw.op2
    /* renamed from: l */
    public final void mo11092l(lp2 lp2Var) {
        this.f25471f.remove(lp2Var);
    }

    @Override // com.daaw.op2
    /* renamed from: m */
    public final void mo11091m(yv2 yv2Var) {
        if (!this.f25480o.m15847h() || this.f25481p != null) {
            this.f25480o = mq2.f19069a;
            this.f25481p = null;
            Iterator it = this.f25471f.iterator();
            while (it.hasNext()) {
                ((lp2) it.next()).mo16681z(this.f25480o, this.f25481p);
            }
        }
        if (this.f25474i) {
            this.f25474i = false;
            this.f25482q = rw2.f25665d;
            this.f25483r = this.f25468c;
            this.f25467b.mo22149b(null);
            Iterator it2 = this.f25471f.iterator();
            while (it2.hasNext()) {
                ((lp2) it2.next()).mo16684h(this.f25482q, this.f25483r);
            }
        }
        this.f25478m++;
        this.f25470e.m27168z(yv2Var, true);
    }

    @Override // com.daaw.op2
    /* renamed from: n */
    public final void mo11090n(np2... np2VarArr) {
        if (!this.f25470e.m27199I()) {
            this.f25470e.m27172v(np2VarArr);
        } else if (this.f25470e.m27200H(np2VarArr)) {
        } else {
            Iterator it = this.f25471f.iterator();
            while (it.hasNext()) {
                ((lp2) it.next()).mo16683m(kp2.m17546c(new RuntimeException(new TimeoutException("ExoPlayer3 blockingSendMessages timeout"))));
            }
        }
    }

    @Override // com.daaw.op2
    /* renamed from: o */
    public final void mo11089o(np2... np2VarArr) {
        this.f25470e.m27205C(np2VarArr);
    }

    @Override // com.daaw.op2
    /* renamed from: p */
    public final void mo11088p(int i) {
        this.f25470e.m27204D(i);
    }

    @Override // com.daaw.op2
    /* renamed from: q */
    public final void mo11087q(int i) {
        this.f25470e.m27203E(i);
    }

    @Override // com.daaw.op2
    /* renamed from: r */
    public final void mo11086r(lp2 lp2Var) {
        this.f25471f.add(lp2Var);
    }

    @Override // com.daaw.op2
    public final int zza() {
        return this.f25476k;
    }

    @Override // com.daaw.op2
    public final long zzb() {
        if (this.f25480o.m15847h() || this.f25477l > 0) {
            return this.f25486u;
        }
        this.f25480o.mo15851d(this.f25485t.f27941a, this.f25473h, false);
        return jp2.m18344b(0L) + jp2.m18344b(this.f25485t.f27944d);
    }

    @Override // com.daaw.op2
    public final long zzc() {
        if (this.f25480o.m15847h() || this.f25477l > 0) {
            return this.f25486u;
        }
        this.f25480o.mo15851d(this.f25485t.f27941a, this.f25473h, false);
        return jp2.m18344b(0L) + jp2.m18344b(this.f25485t.f27943c);
    }

    @Override // com.daaw.op2
    public final long zzd() {
        if (this.f25480o.m15847h()) {
            return -9223372036854775807L;
        }
        mq2 mq2Var = this.f25480o;
        m11097a();
        return jp2.m18344b(mq2Var.m15848g(0, this.f25472g, false).f17631a);
    }

    @Override // com.daaw.op2
    public final void zzg() {
        this.f25470e.m27171w();
    }

    @Override // com.daaw.op2
    public final void zzi() {
        this.f25470e.m27169y();
    }

    @Override // com.daaw.op2
    public final void zzk() {
        if (!this.f25470e.m27199I()) {
            this.f25470e.m27207A();
        } else if (!this.f25470e.m27198J()) {
            Iterator it = this.f25471f.iterator();
            while (it.hasNext()) {
                ((lp2) it.next()).mo16683m(kp2.m17546c(new RuntimeException(new TimeoutException("ExoPlayer3 release timeout"))));
            }
        }
        this.f25469d.removeCallbacksAndMessages(null);
    }

    @Override // com.daaw.op2
    public final void zzr() {
        this.f25470e.m27201G();
    }
}
