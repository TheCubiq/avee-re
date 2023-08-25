package com.daaw;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class f26 implements i76 {
    public final g77 a;
    public final Context b;

    public f26(g77 g77Var, Context context) {
        this.a = g77Var;
        this.b = context;
    }

    public final /* synthetic */ k26 a() {
        int i;
        AudioManager audioManager = (AudioManager) this.b.getSystemService("audio");
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        int i2 = -1;
        if (((Boolean) zzba.zzc().b(g93.d9)).booleanValue()) {
            i = zzt.zzq().zzj(audioManager);
            i2 = audioManager.getStreamMaxVolume(3);
        } else {
            i = -1;
        }
        return new k26(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i, i2, audioManager.getRingerMode(), audioManager.getStreamVolume(2), zzt.zzr().zza(), zzt.zzr().zze());
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 13;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.a.M(new Callable() { // from class: com.daaw.e26
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f26.this.a();
            }
        });
    }
}
