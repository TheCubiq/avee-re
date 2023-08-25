package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class bz7 extends hz7 implements ih2 {

    /* renamed from: x */
    public jh2 f5299x;

    /* renamed from: y */
    public final String f5300y = "moov";

    public bz7(String str) {
    }

    @Override // com.daaw.ih2
    /* renamed from: d */
    public final void mo19823d(iz7 iz7Var, ByteBuffer byteBuffer, long j, fh2 fh2Var) {
        iz7Var.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.f13081q = iz7Var;
        this.f13083s = iz7Var.zzb();
        iz7Var.mo12773b(iz7Var.zzb() + j);
        this.f13084t = iz7Var.zzb();
        this.f13080p = fh2Var;
    }

    @Override // com.daaw.ih2
    /* renamed from: n */
    public final void mo19822n(jh2 jh2Var) {
        this.f5299x = jh2Var;
    }

    @Override // com.daaw.ih2
    public final String zza() {
        return this.f5300y;
    }
}
