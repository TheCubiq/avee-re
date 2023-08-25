package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;
/* loaded from: classes.dex */
public final class zzab {
    public boolean a = false;
    public float b = 1.0f;

    public static float zzb(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return streamVolume / streamMaxVolume;
    }

    public final synchronized boolean a() {
        return this.b >= 0.0f;
    }

    public final synchronized float zza() {
        if (a()) {
            return this.b;
        }
        return 1.0f;
    }

    public final synchronized void zzc(boolean z) {
        this.a = z;
    }

    public final synchronized void zzd(float f) {
        this.b = f;
    }

    public final synchronized boolean zze() {
        return this.a;
    }
}
