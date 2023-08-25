package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class yp0 extends AbstractC3517xa implements Handler.Callback {

    /* renamed from: A */
    public final Handler f33910A;

    /* renamed from: B */
    public final k30 f33911B;

    /* renamed from: C */
    public final tp0 f33912C;

    /* renamed from: D */
    public final Metadata[] f33913D;

    /* renamed from: E */
    public final long[] f33914E;

    /* renamed from: F */
    public int f33915F;

    /* renamed from: G */
    public int f33916G;

    /* renamed from: H */
    public rp0 f33917H;

    /* renamed from: I */
    public boolean f33918I;

    /* renamed from: y */
    public final sp0 f33919y;

    /* renamed from: z */
    public final xp0 f33920z;

    public yp0(xp0 xp0Var, Looper looper) {
        this(xp0Var, looper, sp0.f26479a);
    }

    public yp0(xp0 xp0Var, Looper looper, sp0 sp0Var) {
        super(4);
        this.f33920z = (xp0) C2914s6.m10686e(xp0Var);
        this.f33910A = looper == null ? null : new Handler(looper, this);
        this.f33919y = (sp0) C2914s6.m10686e(sp0Var);
        this.f33911B = new k30();
        this.f33912C = new tp0();
        this.f33913D = new Metadata[5];
        this.f33914E = new long[5];
    }

    @Override // com.daaw.AbstractC3517xa
    /* renamed from: A */
    public void mo3466A() {
        m3463J();
        this.f33917H = null;
    }

    @Override // com.daaw.AbstractC3517xa
    /* renamed from: C */
    public void mo3465C(long j, boolean z) {
        m3463J();
        this.f33918I = false;
    }

    @Override // com.daaw.AbstractC3517xa
    /* renamed from: F */
    public void mo3464F(Format[] formatArr, long j) {
        this.f33917H = this.f33919y.mo10094b(formatArr[0]);
    }

    /* renamed from: J */
    public final void m3463J() {
        Arrays.fill(this.f33913D, (Object) null);
        this.f33915F = 0;
        this.f33916G = 0;
    }

    /* renamed from: K */
    public final void m3462K(Metadata metadata) {
        Handler handler = this.f33910A;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            m3461L(metadata);
        }
    }

    /* renamed from: L */
    public final void m3461L(Metadata metadata) {
        this.f33920z.mo4856p(metadata);
    }

    @Override // com.daaw.b41
    /* renamed from: a */
    public int mo3460a(Format format) {
        if (this.f33919y.mo10095a(format)) {
            return AbstractC3517xa.m5365I(null, format.f35724x) ? 4 : 2;
        }
        return 0;
    }

    @Override // com.daaw.a41
    /* renamed from: c */
    public boolean mo3459c() {
        return this.f33918I;
    }

    @Override // com.daaw.a41
    /* renamed from: d */
    public boolean mo3458d() {
        return true;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m3461L((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // com.daaw.a41
    /* renamed from: q */
    public void mo3457q(long j, long j2) {
        if (!this.f33918I && this.f33916G < 5) {
            this.f33912C.mo3749f();
            if (m5367G(this.f33911B, this.f33912C, false) == -4) {
                if (this.f33912C.m11437j()) {
                    this.f33918I = true;
                } else if (!this.f33912C.m11438i()) {
                    tp0 tp0Var = this.f33912C;
                    tp0Var.f27939u = this.f33911B.f15633a.f35711L;
                    tp0Var.m21350o();
                    int i = (this.f33915F + this.f33916G) % 5;
                    this.f33913D[i] = this.f33917H.mo11098a(this.f33912C);
                    this.f33914E[i] = this.f33912C.f11566s;
                    this.f33916G++;
                }
            }
        }
        if (this.f33916G > 0) {
            long[] jArr = this.f33914E;
            int i2 = this.f33915F;
            if (jArr[i2] <= j) {
                m3462K(this.f33913D[i2]);
                Metadata[] metadataArr = this.f33913D;
                int i3 = this.f33915F;
                metadataArr[i3] = null;
                this.f33915F = (i3 + 1) % 5;
                this.f33916G--;
            }
        }
    }
}
