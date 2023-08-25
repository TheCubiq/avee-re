package com.daaw;

import java.io.IOException;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public abstract class az7 implements ih2 {
    public static final oz7 y = oz7.b(az7.class);
    public final String p;
    public jh2 q;
    public ByteBuffer t;
    public long u;
    public iz7 w;
    public long v = -1;
    public ByteBuffer x = null;
    public boolean s = true;
    public boolean r = true;

    public az7(String str) {
        this.p = str;
    }

    public final synchronized void a() {
        if (this.s) {
            return;
        }
        try {
            oz7 oz7Var = y;
            String str = this.p;
            oz7Var.a(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
            this.t = this.w.R(this.u, this.v);
            this.s = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract void b(ByteBuffer byteBuffer);

    public final synchronized void c() {
        a();
        oz7 oz7Var = y;
        String str = this.p;
        oz7Var.a(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.t;
        if (byteBuffer != null) {
            this.r = true;
            byteBuffer.rewind();
            b(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.x = byteBuffer.slice();
            }
            this.t = null;
        }
    }

    @Override // com.daaw.ih2
    public final void d(iz7 iz7Var, ByteBuffer byteBuffer, long j, fh2 fh2Var) {
        this.u = iz7Var.zzb();
        byteBuffer.remaining();
        this.v = j;
        this.w = iz7Var;
        iz7Var.b(iz7Var.zzb() + j);
        this.s = false;
        this.r = false;
        c();
    }

    @Override // com.daaw.ih2
    public final void n(jh2 jh2Var) {
        this.q = jh2Var;
    }

    @Override // com.daaw.ih2
    public final String zza() {
        return this.p;
    }
}
