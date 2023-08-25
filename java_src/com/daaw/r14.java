package com.daaw;

import android.media.MediaPlayer;
/* loaded from: classes.dex */
public final class r14 implements Runnable {
    public final /* synthetic */ MediaPlayer p;
    public final /* synthetic */ c24 q;

    public r14(c24 c24Var, MediaPlayer mediaPlayer) {
        this.q = c24Var;
        this.p = mediaPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d24 d24Var;
        d24 d24Var2;
        c24.I(this.q, this.p);
        c24 c24Var = this.q;
        d24Var = c24Var.F;
        if (d24Var != null) {
            d24Var2 = c24Var.F;
            d24Var2.zzf();
        }
    }
}
