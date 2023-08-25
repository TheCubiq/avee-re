package com.daaw;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
@TargetApi(19)
/* loaded from: classes.dex */
public final class hr2 extends gr2 {
    public final AudioTimestamp j;
    public long k;
    public long l;
    public long m;

    public hr2() {
        super(null);
        this.j = new AudioTimestamp();
    }

    @Override // com.daaw.gr2
    public final long c() {
        return this.m;
    }

    @Override // com.daaw.gr2
    public final long d() {
        return this.j.nanoTime;
    }

    @Override // com.daaw.gr2
    public final void g(AudioTrack audioTrack, boolean z) {
        super.g(audioTrack, z);
        this.k = 0L;
        this.l = 0L;
        this.m = 0L;
    }

    @Override // com.daaw.gr2
    public final boolean h() {
        boolean timestamp = this.a.getTimestamp(this.j);
        if (timestamp) {
            long j = this.j.framePosition;
            if (this.l > j) {
                this.k++;
            }
            this.l = j;
            this.m = j + (this.k << 32);
        }
        return timestamp;
    }
}
