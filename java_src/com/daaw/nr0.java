package com.daaw;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.Format;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class nr0 extends bo0 {
    public int A0;
    public int B0;
    public String C0;
    public int D0;
    public ne0 E0;
    public WeakReference<Object> F0;
    public int G0;

    public nr0(ne0 ne0Var, int i, WeakReference<Object> weakReference, Context context, eo0 eo0Var, yu<i40> yuVar, boolean z, Handler handler, n7 n7Var, g7 g7Var, m7... m7VarArr) {
        super(context, eo0Var, yuVar, z, handler, n7Var, g7Var, m7VarArr);
        this.A0 = 44100;
        this.B0 = 2;
        this.C0 = "audio/raw";
        this.G0 = 0;
        this.F0 = weakReference;
        this.D0 = i;
        this.E0 = ne0Var;
        kv1.a(this, i, ne0Var);
    }

    @Override // com.daaw.bo0, com.daaw.do0, com.daaw.xa
    public void A() {
        ne0 b = kv1.b(this, this.D0, this.E0);
        if (b != null) {
            b.e(false);
        }
        super.A();
    }

    @Override // com.daaw.bo0, com.daaw.do0, com.daaw.xa
    public void B(boolean z) {
        ne0 b = kv1.b(this, this.D0, this.E0);
        if (b != null) {
            b.e(true);
        }
        super.B(z);
    }

    @Override // com.daaw.bo0, com.daaw.do0, com.daaw.xa
    public void C(long j, boolean z) {
        super.C(j, z);
    }

    @Override // com.daaw.bo0
    public void F0(int i) {
        super.F0(i);
        ne0 b = kv1.b(this, this.D0, this.E0);
        if (b != null) {
            b.a(i);
        }
    }

    @Override // com.daaw.bo0, com.daaw.do0
    public void g0(Format format) {
        super.g0(format);
        int i = format.q;
        if (i < 0) {
            this.G0 = 16;
        } else {
            this.G0 = (i / format.H) / format.G;
        }
    }

    @Override // com.daaw.bo0, com.daaw.do0
    public void h0(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.A0 = 44100;
        this.B0 = 2;
        this.C0 = "audio/raw";
        if (mediaFormat.containsKey("sample-rate")) {
            this.A0 = mediaFormat.getInteger("sample-rate");
        }
        if (mediaFormat.containsKey("channel-count")) {
            this.B0 = mediaFormat.getInteger("channel-count");
        }
        if (mediaFormat.containsKey("mime")) {
            this.C0 = mediaFormat.getString("mime");
        }
        super.h0(mediaCodec, mediaFormat);
    }

    @Override // com.daaw.bo0, com.daaw.do0
    public boolean l0(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        ne0 b = kv1.b(this, this.D0, this.E0);
        if (!z && (i2 & 2) == 0 && b != null && i >= 0 && i < 8192 && byteBuffer != null) {
            b.c(byteBuffer, j3 - 0, i, this.A0, this.B0, this.G0, j - 0);
        }
        return super.l0(j, j2, mediaCodec, byteBuffer, i, i2, j3, z);
    }
}
