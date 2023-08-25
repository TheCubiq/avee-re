package com.daaw;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;
/* loaded from: classes.dex */
public final class eo8 implements ap8 {

    /* renamed from: b */
    public final iz6 f8640b;

    /* renamed from: c */
    public final iz6 f8641c;

    public eo8(int i, boolean z) {
        co8 co8Var = new co8(i);
        do8 do8Var = new do8(i);
        this.f8640b = co8Var;
        this.f8641c = do8Var;
    }

    /* renamed from: a */
    public static /* synthetic */ HandlerThread m23328a(int i) {
        String m21368l;
        m21368l = go8.m21368l(i, "ExoPlayer:MediaCodecAsyncAdapter:");
        return new HandlerThread(m21368l);
    }

    /* renamed from: b */
    public static /* synthetic */ HandlerThread m23327b(int i) {
        String m21368l;
        m21368l = go8.m21368l(i, "ExoPlayer:MediaCodecQueueingThread:");
        return new HandlerThread(m21368l);
    }

    /* renamed from: c */
    public final go8 m23326c(zo8 zo8Var) {
        MediaCodec mediaCodec;
        go8 go8Var;
        String str = zo8Var.f35330a.f8666a;
        go8 go8Var2 = null;
        try {
            int i = it5.f13991a;
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                go8Var = new go8(mediaCodec, m23328a(((co8) this.f8640b).f6015p), m23327b(((do8) this.f8641c).f7593p), false, null);
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            mediaCodec = null;
        }
        try {
            Trace.endSection();
            go8.m21369k(go8Var, zo8Var.f35331b, zo8Var.f35333d, null, 0);
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
