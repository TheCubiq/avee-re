package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;
/* loaded from: classes.dex */
public final class zzab {

    /* renamed from: a */
    public boolean f36241a = false;

    /* renamed from: b */
    public float f36242b = 1.0f;

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

    /* renamed from: a */
    public final synchronized boolean m1373a() {
        return this.f36242b >= 0.0f;
    }

    public final synchronized float zza() {
        if (m1373a()) {
            return this.f36242b;
        }
        return 1.0f;
    }

    public final synchronized void zzc(boolean z) {
        this.f36241a = z;
    }

    public final synchronized void zzd(float f) {
        this.f36242b = f;
    }

    public final synchronized boolean zze() {
        return this.f36241a;
    }
}
