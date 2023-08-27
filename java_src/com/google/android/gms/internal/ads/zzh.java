package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.DefaultLoadControl;
/* loaded from: classes2.dex */
public final class zzh implements zzab {
    private int zzr;
    private int zzs;
    private final int zzt;
    private final float zzu;

    public zzh() {
        this(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, 1, 1.0f);
    }

    private zzh(int i, int i2, float f) {
        this.zzr = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS;
        this.zzt = 1;
        this.zzu = 1.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzab
    public final void zza(zzae zzaeVar) throws zzae {
        int i = this.zzs + 1;
        this.zzs = i;
        int i2 = this.zzr;
        this.zzr = (int) (i2 + (i2 * this.zzu));
        if (!(i <= this.zzt)) {
            throw zzaeVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzab
    public final int zzc() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzab
    public final int zzd() {
        return this.zzs;
    }
}
