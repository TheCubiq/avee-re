package com.daaw;
/* loaded from: classes.dex */
public final class cm8 implements lj8 {
    public final /* synthetic */ em8 a;

    public /* synthetic */ cm8(em8 em8Var, am8 am8Var) {
        this.a = em8Var;
    }

    @Override // com.daaw.lj8
    public final void a(Exception exc) {
        s95.c("MediaCodecAudioRenderer", "Audio sink error", exc);
        em8.x0(this.a).b(exc);
    }

    @Override // com.daaw.lj8
    public final void zzb() {
        em8 em8Var = this.a;
        if (em8.w0(em8Var) != null) {
            em8.w0(em8Var).zzb();
        }
    }
}
