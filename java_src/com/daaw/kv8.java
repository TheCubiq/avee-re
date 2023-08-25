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

    /* renamed from: a */
    public final Spatializer f16780a;

    /* renamed from: b */
    public final boolean f16781b;

    /* renamed from: c */
    public Handler f16782c;

    /* renamed from: d */
    public Spatializer.OnSpatializerStateChangedListener f16783d;

    public kv8(Spatializer spatializer) {
        this.f16780a = spatializer;
        this.f16781b = spatializer.getImmersiveAudioLevel() != 0;
    }

    /* renamed from: a */
    public static kv8 m17401a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new kv8(audioManager.getSpatializer());
    }

    /* renamed from: b */
    public final void m17400b(rv8 rv8Var, Looper looper) {
        if (this.f16783d == null && this.f16782c == null) {
            this.f16783d = new jv8(this, rv8Var);
            final Handler handler = new Handler(looper);
            this.f16782c = handler;
            this.f16780a.addOnSpatializerStateChangedListener(new Executor() { // from class: com.daaw.iv8
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.f16783d);
        }
    }

    /* renamed from: c */
    public final void m17399c() {
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.f16783d;
        if (onSpatializerStateChangedListener == null || this.f16782c == null) {
            return;
        }
        this.f16780a.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
        Handler handler = this.f16782c;
        int i = it5.f13991a;
        handler.removeCallbacksAndMessages(null);
        this.f16782c = null;
        this.f16783d = null;
    }

    /* renamed from: d */
    public final boolean m17398d(o98 o98Var, f92 f92Var) {
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(it5.m19412T(("audio/eac3-joc".equals(f92Var.f9275l) && f92Var.f9288y == 16) ? 12 : f92Var.f9288y));
        int i = f92Var.f9289z;
        if (i != -1) {
            channelMask.setSampleRate(i);
        }
        return this.f16780a.canBeSpatialized(o98Var.m14434a().f32042a, channelMask.build());
    }

    /* renamed from: e */
    public final boolean m17397e() {
        return this.f16780a.isAvailable();
    }

    /* renamed from: f */
    public final boolean m17396f() {
        return this.f16780a.isEnabled();
    }

    /* renamed from: g */
    public final boolean m17395g() {
        return this.f16781b;
    }
}
