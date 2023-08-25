package com.daaw;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
@TargetApi(19)
/* loaded from: classes.dex */
public final class hr2 extends gr2 {

    /* renamed from: j */
    public final AudioTimestamp f12870j;

    /* renamed from: k */
    public long f12871k;

    /* renamed from: l */
    public long f12872l;

    /* renamed from: m */
    public long f12873m;

    public hr2() {
        super(null);
        this.f12870j = new AudioTimestamp();
    }

    @Override // com.daaw.gr2
    /* renamed from: c */
    public final long mo20464c() {
        return this.f12873m;
    }

    @Override // com.daaw.gr2
    /* renamed from: d */
    public final long mo20463d() {
        return this.f12870j.nanoTime;
    }

    @Override // com.daaw.gr2
    /* renamed from: g */
    public final void mo20462g(AudioTrack audioTrack, boolean z) {
        super.mo20462g(audioTrack, z);
        this.f12871k = 0L;
        this.f12872l = 0L;
        this.f12873m = 0L;
    }

    @Override // com.daaw.gr2
    /* renamed from: h */
    public final boolean mo20461h() {
        boolean timestamp = this.f11616a.getTimestamp(this.f12870j);
        if (timestamp) {
            long j = this.f12870j.framePosition;
            if (this.f12872l > j) {
                this.f12871k++;
            }
            this.f12872l = j;
            this.f12873m = j + (this.f12871k << 32);
        }
        return timestamp;
    }
}
