package com.daaw;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
/* loaded from: classes.dex */
public final class wk8 {
    public final f92 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final hi8[] i;

    public wk8(f92 f92Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, hi8[] hi8VarArr) {
        this.a = f92Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = hi8VarArr;
    }

    public final long a(long j) {
        return (j * 1000000) / this.e;
    }

    public final AudioTrack b(boolean z, o98 o98Var, int i) {
        AudioTrack audioTrack;
        AudioFormat build;
        AudioFormat build2;
        try {
            int i2 = it5.a;
            if (i2 >= 29) {
                build2 = new AudioFormat.Builder().setSampleRate(this.e).setChannelMask(this.f).setEncoding(this.g).build();
                audioTrack = new AudioTrack.Builder().setAudioAttributes(o98Var.a().a).setAudioFormat(build2).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i).setOffloadedPlayback(this.c == 1).build();
            } else if (i2 >= 21) {
                AudioAttributes audioAttributes = o98Var.a().a;
                build = new AudioFormat.Builder().setSampleRate(this.e).setChannelMask(this.f).setEncoding(this.g).build();
                audioTrack = new AudioTrack(audioAttributes, build, this.h, 1, i);
            } else {
                int i3 = o98Var.a;
                audioTrack = i == 0 ? new AudioTrack(3, this.e, this.f, this.g, this.h, 1) : new AudioTrack(3, this.e, this.f, this.g, this.h, 1, i);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new jj8(state, this.e, this.f, this.h, this.a, c(), null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new jj8(0, this.e, this.f, this.h, this.a, c(), e);
        }
    }

    public final boolean c() {
        return this.c == 1;
    }
}
