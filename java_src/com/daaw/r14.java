package com.daaw;

import android.media.MediaPlayer;
/* loaded from: classes.dex */
public final class r14 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ MediaPlayer f24729p;

    /* renamed from: q */
    public final /* synthetic */ c24 f24730q;

    public r14(c24 c24Var, MediaPlayer mediaPlayer) {
        this.f24730q = c24Var;
        this.f24729p = mediaPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d24 d24Var;
        d24 d24Var2;
        c24.m25676I(this.f24730q, this.f24729p);
        c24 c24Var = this.f24730q;
        d24Var = c24Var.f5387F;
        if (d24Var != null) {
            d24Var2 = c24Var.f5387F;
            d24Var2.zzf();
        }
    }
}
