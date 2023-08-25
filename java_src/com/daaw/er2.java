package com.daaw;

import android.media.AudioTrack;
import android.os.ConditionVariable;
/* loaded from: classes.dex */
public final class er2 extends Thread {

    /* renamed from: p */
    public final /* synthetic */ AudioTrack f8713p;

    /* renamed from: q */
    public final /* synthetic */ or2 f8714q;

    public er2(or2 or2Var, AudioTrack audioTrack) {
        this.f8714q = or2Var;
        this.f8713p = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        try {
            this.f8713p.flush();
            this.f8713p.release();
        } finally {
            conditionVariable = this.f8714q.f21882e;
            conditionVariable.open();
        }
    }
}
