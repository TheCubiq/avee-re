package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class bz7 extends hz7 implements ih2 {
    public jh2 x;
    public final String y = "moov";

    public bz7(String str) {
    }

    @Override // com.daaw.ih2
    public final void d(iz7 iz7Var, ByteBuffer byteBuffer, long j, fh2 fh2Var) {
        iz7Var.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.q = iz7Var;
        this.s = iz7Var.zzb();
        iz7Var.b(iz7Var.zzb() + j);
        this.t = iz7Var.zzb();
        this.p = fh2Var;
    }

    @Override // com.daaw.ih2
    public final void n(jh2 jh2Var) {
        this.x = jh2Var;
    }

    @Override // com.daaw.ih2
    public final String zza() {
        return this.y;
    }
}
