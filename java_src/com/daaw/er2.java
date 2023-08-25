package com.daaw;

import android.media.AudioTrack;
import android.os.ConditionVariable;
/* loaded from: classes.dex */
public final class er2 extends Thread {
    public final /* synthetic */ AudioTrack p;
    public final /* synthetic */ or2 q;

    public er2(or2 or2Var, AudioTrack audioTrack) {
        this.q = or2Var;
        this.p = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        try {
            this.p.flush();
            this.p.release();
        } finally {
            conditionVariable = this.q.e;
            conditionVariable.open();
        }
    }
}
