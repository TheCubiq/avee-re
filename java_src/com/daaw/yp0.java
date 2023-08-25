package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class yp0 extends xa implements Handler.Callback {
    public final Handler A;
    public final k30 B;
    public final tp0 C;
    public final Metadata[] D;
    public final long[] E;
    public int F;
    public int G;
    public rp0 H;
    public boolean I;
    public final sp0 y;
    public final xp0 z;

    public yp0(xp0 xp0Var, Looper looper) {
        this(xp0Var, looper, sp0.a);
    }

    public yp0(xp0 xp0Var, Looper looper, sp0 sp0Var) {
        super(4);
        this.z = (xp0) s6.e(xp0Var);
        this.A = looper == null ? null : new Handler(looper, this);
        this.y = (sp0) s6.e(sp0Var);
        this.B = new k30();
        this.C = new tp0();
        this.D = new Metadata[5];
        this.E = new long[5];
    }

    @Override // com.daaw.xa
    public void A() {
        J();
        this.H = null;
    }

    @Override // com.daaw.xa
    public void C(long j, boolean z) {
        J();
        this.I = false;
    }

    @Override // com.daaw.xa
    public void F(Format[] formatArr, long j) {
        this.H = this.y.b(formatArr[0]);
    }

    public final void J() {
        Arrays.fill(this.D, (Object) null);
        this.F = 0;
        this.G = 0;
    }

    public final void K(Metadata metadata) {
        Handler handler = this.A;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            L(metadata);
        }
    }

    public final void L(Metadata metadata) {
        this.z.p(metadata);
    }

    @Override // com.daaw.b41
    public int a(Format format) {
        if (this.y.a(format)) {
            return xa.I(null, format.x) ? 4 : 2;
        }
        return 0;
    }

    @Override // com.daaw.a41
    public boolean c() {
        return this.I;
    }

    @Override // com.daaw.a41
    public boolean d() {
        return true;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            L((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // com.daaw.a41
    public void q(long j, long j2) {
        if (!this.I && this.G < 5) {
            this.C.f();
            if (G(this.B, this.C, false) == -4) {
                if (this.C.j()) {
                    this.I = true;
                } else if (!this.C.i()) {
                    tp0 tp0Var = this.C;
                    tp0Var.u = this.B.a.L;
                    tp0Var.o();
                    int i = (this.F + this.G) % 5;
                    this.D[i] = this.H.a(this.C);
                    this.E[i] = this.C.s;
                    this.G++;
                }
            }
        }
        if (this.G > 0) {
            long[] jArr = this.E;
            int i2 = this.F;
            if (jArr[i2] <= j) {
                K(this.D[i2]);
                Metadata[] metadataArr = this.D;
                int i3 = this.F;
                metadataArr[i3] = null;
                this.F = (i3 + 1) % 5;
                this.G--;
            }
        }
    }
}
