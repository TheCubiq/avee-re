package com.daaw;

import android.media.AudioTrack;
/* loaded from: classes.dex */
public final class ml8 extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ sl8 a;
    public final /* synthetic */ ol8 b;

    public ml8(ol8 ol8Var, sl8 sl8Var) {
        this.b = ol8Var;
        this.a = sl8Var;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        AudioTrack audioTrack2;
        lj8 lj8Var;
        boolean z;
        lj8 lj8Var2;
        audioTrack2 = this.b.c.q;
        if (audioTrack.equals(audioTrack2)) {
            sl8 sl8Var = this.b.c;
            lj8Var = sl8Var.n;
            if (lj8Var != null) {
                z = sl8Var.O;
                if (z) {
                    lj8Var2 = sl8Var.n;
                    lj8Var2.zzb();
                }
            }
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        lj8 lj8Var;
        boolean z;
        lj8 lj8Var2;
        audioTrack2 = this.b.c.q;
        if (audioTrack.equals(audioTrack2)) {
            sl8 sl8Var = this.b.c;
            lj8Var = sl8Var.n;
            if (lj8Var != null) {
                z = sl8Var.O;
                if (z) {
                    lj8Var2 = sl8Var.n;
                    lj8Var2.zzb();
                }
            }
        }
    }
}
