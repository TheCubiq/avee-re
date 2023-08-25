package com.daaw;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;
/* loaded from: classes.dex */
public final class eo8 implements ap8 {
    public final iz6 b;
    public final iz6 c;

    public eo8(int i, boolean z) {
        co8 co8Var = new co8(i);
        do8 do8Var = new do8(i);
        this.b = co8Var;
        this.c = do8Var;
    }

    public static /* synthetic */ HandlerThread a(int i) {
        String l;
        l = go8.l(i, "ExoPlayer:MediaCodecAsyncAdapter:");
        return new HandlerThread(l);
    }

    public static /* synthetic */ HandlerThread b(int i) {
        String l;
        l = go8.l(i, "ExoPlayer:MediaCodecQueueingThread:");
        return new HandlerThread(l);
    }

    public final go8 c(zo8 zo8Var) {
        MediaCodec mediaCodec;
        go8 go8Var;
        String str = zo8Var.a.a;
        go8 go8Var2 = null;
        try {
            int i = it5.a;
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                go8Var = new go8(mediaCodec, a(((co8) this.b).p), b(((do8) this.c).p), false, null);
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            mediaCodec = null;
        }
        try {
            Trace.endSection();
            go8.k(go8Var, zo8Var.b, zo8Var.d, null, 0);
            return go8Var;
        } catch (Exception e3) {
            e = e3;
            go8Var2 = go8Var;
            if (go8Var2 != null) {
                go8Var2.zzl();
            } else if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }
}
