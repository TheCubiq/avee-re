package com.daaw;

import android.media.AudioTrack;
/* loaded from: classes.dex */
public final class ml8 extends AudioTrack.StreamEventCallback {

    /* renamed from: a */
    public final /* synthetic */ sl8 f18967a;

    /* renamed from: b */
    public final /* synthetic */ ol8 f18968b;

    public ml8(ol8 ol8Var, sl8 sl8Var) {
        this.f18968b = ol8Var;
        this.f18967a = sl8Var;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        AudioTrack audioTrack2;
        lj8 lj8Var;
        boolean z;
        lj8 lj8Var2;
        audioTrack2 = this.f18968b.f21648c.f26401q;
        if (audioTrack.equals(audioTrack2)) {
            sl8 sl8Var = this.f18968b.f21648c;
            lj8Var = sl8Var.f26398n;
            if (lj8Var != null) {
                z = sl8Var.f26377O;
                if (z) {
                    lj8Var2 = sl8Var.f26398n;
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
        audioTrack2 = this.f18968b.f21648c.f26401q;
        if (audioTrack.equals(audioTrack2)) {
            sl8 sl8Var = this.f18968b.f21648c;
            lj8Var = sl8Var.f26398n;
            if (lj8Var != null) {
                z = sl8Var.f26377O;
                if (z) {
                    lj8Var2 = sl8Var.f26398n;
                    lj8Var2.zzb();
                }
            }
        }
    }
}
