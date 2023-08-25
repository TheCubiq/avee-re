package com.daaw;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
/* loaded from: classes.dex */
public final class tj8 {

    /* renamed from: a */
    public final AudioTrack f27794a;

    /* renamed from: b */
    public final AudioTimestamp f27795b = new AudioTimestamp();

    /* renamed from: c */
    public long f27796c;

    /* renamed from: d */
    public long f27797d;

    /* renamed from: e */
    public long f27798e;

    public tj8(AudioTrack audioTrack) {
        this.f27794a = audioTrack;
    }

    /* renamed from: a */
    public final long m9070a() {
        return this.f27798e;
    }

    /* renamed from: b */
    public final long m9069b() {
        return this.f27795b.nanoTime / 1000;
    }

    /* renamed from: c */
    public final boolean m9068c() {
        boolean timestamp = this.f27794a.getTimestamp(this.f27795b);
        if (timestamp) {
            long j = this.f27795b.framePosition;
            if (this.f27797d > j) {
                this.f27796c++;
            }
            this.f27797d = j;
            this.f27798e = j + (this.f27796c << 32);
        }
        return timestamp;
    }
}
