package com.daaw;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
/* loaded from: classes.dex */
public final class wk8 {

    /* renamed from: a */
    public final f92 f31300a;

    /* renamed from: b */
    public final int f31301b;

    /* renamed from: c */
    public final int f31302c;

    /* renamed from: d */
    public final int f31303d;

    /* renamed from: e */
    public final int f31304e;

    /* renamed from: f */
    public final int f31305f;

    /* renamed from: g */
    public final int f31306g;

    /* renamed from: h */
    public final int f31307h;

    /* renamed from: i */
    public final hi8[] f31308i;

    public wk8(f92 f92Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, hi8[] hi8VarArr) {
        this.f31300a = f92Var;
        this.f31301b = i;
        this.f31302c = i2;
        this.f31303d = i3;
        this.f31304e = i4;
        this.f31305f = i5;
        this.f31306g = i6;
        this.f31307h = i7;
        this.f31308i = hi8VarArr;
    }

    /* renamed from: a */
    public final long m6027a(long j) {
        return (j * 1000000) / this.f31304e;
    }

    /* renamed from: b */
    public final AudioTrack m6026b(boolean z, o98 o98Var, int i) {
        AudioTrack audioTrack;
        AudioFormat build;
        AudioFormat build2;
        try {
            int i2 = it5.f13991a;
            if (i2 >= 29) {
                build2 = new AudioFormat.Builder().setSampleRate(this.f31304e).setChannelMask(this.f31305f).setEncoding(this.f31306g).build();
                audioTrack = new AudioTrack.Builder().setAudioAttributes(o98Var.m14434a().f32042a).setAudioFormat(build2).setTransferMode(1).setBufferSizeInBytes(this.f31307h).setSessionId(i).setOffloadedPlayback(this.f31302c == 1).build();
            } else if (i2 >= 21) {
                AudioAttributes audioAttributes = o98Var.m14434a().f32042a;
                build = new AudioFormat.Builder().setSampleRate(this.f31304e).setChannelMask(this.f31305f).setEncoding(this.f31306g).build();
                audioTrack = new AudioTrack(audioAttributes, build, this.f31307h, 1, i);
            } else {
                int i3 = o98Var.f21187a;
                audioTrack = i == 0 ? new AudioTrack(3, this.f31304e, this.f31305f, this.f31306g, this.f31307h, 1) : new AudioTrack(3, this.f31304e, this.f31305f, this.f31306g, this.f31307h, 1, i);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new jj8(state, this.f31304e, this.f31305f, this.f31307h, this.f31300a, m6025c(), null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new jj8(0, this.f31304e, this.f31305f, this.f31307h, this.f31300a, m6025c(), e);
        }
    }

    /* renamed from: c */
    public final boolean m6025c() {
        return this.f31302c == 1;
    }
}
