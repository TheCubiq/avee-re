package com.daaw;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class kv8 {
    public final Spatializer a;
    public final boolean b;
    public Handler c;
    public Spatializer.OnSpatializerStateChangedListener d;

    public kv8(Spatializer spatializer) {
        this.a = spatializer;
        this.b = spatializer.getImmersiveAudioLevel() != 0;
    }

    public static kv8 a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new kv8(audioManager.getSpatializer());
    }

    public final void b(rv8 rv8Var, Looper looper) {
        if (this.d == null && this.c == null) {
            this.d = new jv8(this, rv8Var);
            final Handler handler = new Handler(looper);
            this.c = handler;
            this.a.addOnSpatializerStateChangedListener(new Executor() { // from class: com.daaw.iv8
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.d);
        }
    }

    public final void c() {
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.d;
        if (onSpatializerStateChangedListener == null || this.c == null) {
            return;
        }
        this.a.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
        Handler handler = this.c;
        int i = it5.a;
        handler.removeCallbacksAndMessages(null);
        this.c = null;
        this.d = null;
    }

    public final boolean d(o98 o98Var, f92 f92Var) {
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(it5.T(("audio/eac3-joc".equals(f92Var.l) && f92Var.y == 16) ? 12 : f92Var.y));
        int i = f92Var.z;
        if (i != -1) {
            channelMask.setSampleRate(i);
        }
        return this.a.canBeSpatialized(o98Var.a().a, channelMask.build());
    }

    public final boolean e() {
        return this.a.isAvailable();
    }

    public final boolean f() {
        return this.a.isEnabled();
    }

    public final boolean g() {
        return this.b;
    }
}
