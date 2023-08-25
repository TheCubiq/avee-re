package com.daaw;

import android.media.AudioTrack;
import android.os.SystemClock;
/* loaded from: classes.dex */
public class gr2 {

    /* renamed from: a */
    public AudioTrack f11616a;

    /* renamed from: b */
    public boolean f11617b;

    /* renamed from: c */
    public int f11618c;

    /* renamed from: d */
    public long f11619d;

    /* renamed from: e */
    public long f11620e;

    /* renamed from: f */
    public long f11621f;

    /* renamed from: g */
    public long f11622g;

    /* renamed from: h */
    public long f11623h;

    /* renamed from: i */
    public long f11624i;

    public /* synthetic */ gr2(fr2 fr2Var) {
    }

    /* renamed from: a */
    public final long m21310a() {
        if (this.f11622g != -9223372036854775807L) {
            return Math.min(this.f11624i, this.f11623h + ((((SystemClock.elapsedRealtime() * 1000) - this.f11622g) * this.f11618c) / 1000000));
        }
        int playState = this.f11616a.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = this.f11616a.getPlaybackHeadPosition() & 4294967295L;
        if (this.f11617b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f11621f = this.f11619d;
            }
            playbackHeadPosition += this.f11621f;
        }
        if (this.f11619d > playbackHeadPosition) {
            this.f11620e++;
        }
        this.f11619d = playbackHeadPosition;
        return playbackHeadPosition + (this.f11620e << 32);
    }

    /* renamed from: b */
    public final long m21309b() {
        return (m21310a() * 1000000) / this.f11618c;
    }

    /* renamed from: c */
    public long mo20464c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public long mo20463d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final void m21308e(long j) {
        this.f11623h = m21310a();
        this.f11622g = SystemClock.elapsedRealtime() * 1000;
        this.f11624i = j;
        this.f11616a.stop();
    }

    /* renamed from: f */
    public final void m21307f() {
        if (this.f11622g != -9223372036854775807L) {
            return;
        }
        this.f11616a.pause();
    }

    /* renamed from: g */
    public void mo20462g(AudioTrack audioTrack, boolean z) {
        this.f11616a = audioTrack;
        this.f11617b = z;
        this.f11622g = -9223372036854775807L;
        this.f11619d = 0L;
        this.f11620e = 0L;
        this.f11621f = 0L;
        if (audioTrack != null) {
            this.f11618c = audioTrack.getSampleRate();
        }
    }

    /* renamed from: h */
    public boolean mo20461h() {
        return false;
    }
}
