package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.Format;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class qk1 extends xa implements Handler.Callback {
    public final wh1 A;
    public final k30 B;
    public boolean C;
    public boolean D;
    public int E;
    public Format F;
    public uh1 G;
    public xh1 H;
    public yh1 I;
    public yh1 J;
    public int K;
    public final Handler y;
    public final pk1 z;

    public qk1(pk1 pk1Var, Looper looper) {
        this(pk1Var, looper, wh1.a);
    }

    public qk1(pk1 pk1Var, Looper looper, wh1 wh1Var) {
        super(3);
        this.z = (pk1) s6.e(pk1Var);
        this.y = looper == null ? null : new Handler(looper, this);
        this.A = wh1Var;
        this.B = new k30();
    }

    @Override // com.daaw.xa
    public void A() {
        this.F = null;
        J();
        N();
    }

    @Override // com.daaw.xa
    public void C(long j, boolean z) {
        J();
        this.C = false;
        this.D = false;
        if (this.E != 0) {
            O();
            return;
        }
        M();
        this.G.flush();
    }

    @Override // com.daaw.xa
    public void F(Format[] formatArr, long j) {
        Format format = formatArr[0];
        this.F = format;
        if (this.G != null) {
            this.E = 1;
        } else {
            this.G = this.A.b(format);
        }
    }

    public final void J() {
        P(Collections.emptyList());
    }

    public final long K() {
        int i = this.K;
        if (i == -1 || i >= this.I.d()) {
            return Long.MAX_VALUE;
        }
        return this.I.b(this.K);
    }

    public final void L(List<ln> list) {
        this.z.h(list);
    }

    public final void M() {
        this.H = null;
        this.K = -1;
        yh1 yh1Var = this.I;
        if (yh1Var != null) {
            yh1Var.m();
            this.I = null;
        }
        yh1 yh1Var2 = this.J;
        if (yh1Var2 != null) {
            yh1Var2.m();
            this.J = null;
        }
    }

    public final void N() {
        M();
        this.G.a();
        this.G = null;
        this.E = 0;
    }

    public final void O() {
        N();
        this.G = this.A.b(this.F);
    }

    public final void P(List<ln> list) {
        Handler handler = this.y;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            L(list);
        }
    }

    @Override // com.daaw.b41
    public int a(Format format) {
        return this.A.a(format) ? xa.I(null, format.x) ? 4 : 2 : hq0.l(format.u) ? 1 : 0;
    }

    @Override // com.daaw.a41
    public boolean c() {
        return this.D;
    }

    @Override // com.daaw.a41
    public boolean d() {
        return true;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            L((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // com.daaw.a41
    public void q(long j, long j2) {
        boolean z;
        if (this.D) {
            return;
        }
        if (this.J == null) {
            this.G.b(j);
            try {
                this.J = this.G.c();
            } catch (vh1 e) {
                throw qz.a(e, x());
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.I != null) {
            long K = K();
            z = false;
            while (K <= j) {
                this.K++;
                K = K();
                z = true;
            }
        } else {
            z = false;
        }
        yh1 yh1Var = this.J;
        if (yh1Var != null) {
            if (yh1Var.j()) {
                if (!z && K() == Long.MAX_VALUE) {
                    if (this.E == 2) {
                        O();
                    } else {
                        M();
                        this.D = true;
                    }
                }
            } else if (this.J.q <= j) {
                yh1 yh1Var2 = this.I;
                if (yh1Var2 != null) {
                    yh1Var2.m();
                }
                yh1 yh1Var3 = this.J;
                this.I = yh1Var3;
                this.J = null;
                this.K = yh1Var3.a(j);
                z = true;
            }
        }
        if (z) {
            P(this.I.c(j));
        }
        if (this.E == 2) {
            return;
        }
        while (!this.C) {
            try {
                if (this.H == null) {
                    xh1 d = this.G.d();
                    this.H = d;
                    if (d == null) {
                        return;
                    }
                }
                if (this.E == 1) {
                    this.H.l(4);
                    this.G.e(this.H);
                    this.H = null;
                    this.E = 2;
                    return;
                }
                int G = G(this.B, this.H, false);
                if (G == -4) {
                    if (this.H.j()) {
                        this.C = true;
                    } else {
                        xh1 xh1Var = this.H;
                        xh1Var.u = this.B.a.L;
                        xh1Var.o();
                    }
                    this.G.e(this.H);
                    this.H = null;
                } else if (G == -3) {
                    return;
                }
            } catch (vh1 e2) {
                throw qz.a(e2, x());
            }
        }
    }
}
