package com.daaw;
/* loaded from: classes.dex */
public final class cm8 implements lj8 {

    /* renamed from: a */
    public final /* synthetic */ em8 f5958a;

    public /* synthetic */ cm8(em8 em8Var, am8 am8Var) {
        this.f5958a = em8Var;
    }

    @Override // com.daaw.lj8
    /* renamed from: a */
    public final void mo16898a(Exception exc) {
        s95.m10495c("MediaCodecAudioRenderer", "Audio sink error", exc);
        em8.m23366x0(this.f5958a).m24331b(exc);
    }

    @Override // com.daaw.lj8
    public final void zzb() {
        em8 em8Var = this.f5958a;
        if (em8.m23367w0(em8Var) != null) {
            em8.m23367w0(em8Var).zzb();
        }
    }
}
