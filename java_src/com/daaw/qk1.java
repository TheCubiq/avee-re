package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.Format;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class qk1 extends AbstractC3517xa implements Handler.Callback {

    /* renamed from: A */
    public final wh1 f24105A;

    /* renamed from: B */
    public final k30 f24106B;

    /* renamed from: C */
    public boolean f24107C;

    /* renamed from: D */
    public boolean f24108D;

    /* renamed from: E */
    public int f24109E;

    /* renamed from: F */
    public Format f24110F;

    /* renamed from: G */
    public uh1 f24111G;

    /* renamed from: H */
    public xh1 f24112H;

    /* renamed from: I */
    public yh1 f24113I;

    /* renamed from: J */
    public yh1 f24114J;

    /* renamed from: K */
    public int f24115K;

    /* renamed from: y */
    public final Handler f24116y;

    /* renamed from: z */
    public final pk1 f24117z;

    public qk1(pk1 pk1Var, Looper looper) {
        this(pk1Var, looper, wh1.f31244a);
    }

    public qk1(pk1 pk1Var, Looper looper, wh1 wh1Var) {
        super(3);
        this.f24117z = (pk1) C2914s6.m10686e(pk1Var);
        this.f24116y = looper == null ? null : new Handler(looper, this);
        this.f24105A = wh1Var;
        this.f24106B = new k30();
    }

    @Override // com.daaw.AbstractC3517xa
    /* renamed from: A */
    public void mo3466A() {
        this.f24110F = null;
        m12370J();
        m12366N();
    }

    @Override // com.daaw.AbstractC3517xa
    /* renamed from: C */
    public void mo3465C(long j, boolean z) {
        m12370J();
        this.f24107C = false;
        this.f24108D = false;
        if (this.f24109E != 0) {
            m12365O();
            return;
        }
        m12367M();
        this.f24111G.flush();
    }

    @Override // com.daaw.AbstractC3517xa
    /* renamed from: F */
    public void mo3464F(Format[] formatArr, long j) {
        Format format = formatArr[0];
        this.f24110F = format;
        if (this.f24111G != null) {
            this.f24109E = 1;
        } else {
            this.f24111G = this.f24105A.mo6066b(format);
        }
    }

    /* renamed from: J */
    public final void m12370J() {
        m12364P(Collections.emptyList());
    }

    /* renamed from: K */
    public final long m12369K() {
        int i = this.f24115K;
        if (i == -1 || i >= this.f24113I.mo3750d()) {
            return Long.MAX_VALUE;
        }
        return this.f24113I.mo3752b(this.f24115K);
    }

    /* renamed from: L */
    public final void m12368L(List<C2099ln> list) {
        this.f24117z.mo1491h(list);
    }

    /* renamed from: M */
    public final void m12367M() {
        this.f24112H = null;
        this.f24115K = -1;
        yh1 yh1Var = this.f24113I;
        if (yh1Var != null) {
            yh1Var.mo3748m();
            this.f24113I = null;
        }
        yh1 yh1Var2 = this.f24114J;
        if (yh1Var2 != null) {
            yh1Var2.mo3748m();
            this.f24114J = null;
        }
    }

    /* renamed from: N */
    public final void m12366N() {
        m12367M();
        this.f24111G.mo16074a();
        this.f24111G = null;
        this.f24109E = 0;
    }

    /* renamed from: O */
    public final void m12365O() {
        m12366N();
        this.f24111G = this.f24105A.mo6066b(this.f24110F);
    }

    /* renamed from: P */
    public final void m12364P(List<C2099ln> list) {
        Handler handler = this.f24116y;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            m12368L(list);
        }
    }

    @Override // com.daaw.b41
    /* renamed from: a */
    public int mo3460a(Format format) {
        return this.f24105A.mo6067a(format) ? AbstractC3517xa.m5365I(null, format.f35724x) ? 4 : 2 : hq0.m20493l(format.f35721u) ? 1 : 0;
    }

    @Override // com.daaw.a41
    /* renamed from: c */
    public boolean mo3459c() {
        return this.f24108D;
    }

    @Override // com.daaw.a41
    /* renamed from: d */
    public boolean mo3458d() {
        return true;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m12368L((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // com.daaw.a41
    /* renamed from: q */
    public void mo3457q(long j, long j2) {
        boolean z;
        if (this.f24108D) {
            return;
        }
        if (this.f24114J == null) {
            this.f24111G.mo8184b(j);
            try {
                this.f24114J = this.f24111G.mo16073c();
            } catch (vh1 e) {
                throw C2802qz.m11927a(e, m5348x());
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f24113I != null) {
            long m12369K = m12369K();
            z = false;
            while (m12369K <= j) {
                this.f24115K++;
                m12369K = m12369K();
                z = true;
            }
        } else {
            z = false;
        }
        yh1 yh1Var = this.f24114J;
        if (yh1Var != null) {
            if (yh1Var.m11437j()) {
                if (!z && m12369K() == Long.MAX_VALUE) {
                    if (this.f24109E == 2) {
                        m12365O();
                    } else {
                        m12367M();
                        this.f24108D = true;
                    }
                }
            } else if (this.f24114J.f3671q <= j) {
                yh1 yh1Var2 = this.f24113I;
                if (yh1Var2 != null) {
                    yh1Var2.mo3748m();
                }
                yh1 yh1Var3 = this.f24114J;
                this.f24113I = yh1Var3;
                this.f24114J = null;
                this.f24115K = yh1Var3.mo3753a(j);
                z = true;
            }
        }
        if (z) {
            m12364P(this.f24113I.mo3751c(j));
        }
        if (this.f24109E == 2) {
            return;
        }
        while (!this.f24107C) {
            try {
                if (this.f24112H == null) {
                    xh1 mo16072d = this.f24111G.mo16072d();
                    this.f24112H = mo16072d;
                    if (mo16072d == null) {
                        return;
                    }
                }
                if (this.f24109E == 1) {
                    this.f24112H.m11435l(4);
                    this.f24111G.mo16071e(this.f24112H);
                    this.f24112H = null;
                    this.f24109E = 2;
                    return;
                }
                int m5367G = m5367G(this.f24106B, this.f24112H, false);
                if (m5367G == -4) {
                    if (this.f24112H.m11437j()) {
                        this.f24107C = true;
                    } else {
                        xh1 xh1Var = this.f24112H;
                        xh1Var.f32717u = this.f24106B.f15633a.f35711L;
                        xh1Var.m21350o();
                    }
                    this.f24111G.mo16071e(this.f24112H);
                    this.f24112H = null;
                } else if (m5367G == -3) {
                    return;
                }
            } catch (vh1 e2) {
                throw C2802qz.m11927a(e2, m5348x());
            }
        }
    }
}
