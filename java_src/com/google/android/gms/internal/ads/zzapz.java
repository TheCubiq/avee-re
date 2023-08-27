package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.exoplayer2.util.MimeTypes;
@zzadh
/* loaded from: classes2.dex */
public final class zzapz implements AudioManager.OnAudioFocusChangeListener {
    private final AudioManager mAudioManager;
    private boolean zzcxs;
    private final zzaqa zzdaq;
    private boolean zzdar;
    private boolean zzdas;
    private float zzdat = 1.0f;

    public zzapz(Context context, zzaqa zzaqaVar) {
        this.mAudioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.zzdaq = zzaqaVar;
    }

    private final void zztw() {
        boolean z;
        boolean z2;
        boolean z3 = this.zzcxs && !this.zzdas && this.zzdat > 0.0f;
        if (z3 && !(z2 = this.zzdar)) {
            AudioManager audioManager = this.mAudioManager;
            if (audioManager != null && !z2) {
                this.zzdar = audioManager.requestAudioFocus(this, 3, 2) == 1;
            }
            this.zzdaq.zzst();
        } else if (z3 || !(z = this.zzdar)) {
        } else {
            AudioManager audioManager2 = this.mAudioManager;
            if (audioManager2 != null && z) {
                this.zzdar = audioManager2.abandonAudioFocus(this) == 0;
            }
            this.zzdaq.zzst();
        }
    }

    public final float getVolume() {
        float f = this.zzdas ? 0.0f : this.zzdat;
        if (this.zzdar) {
            return f;
        }
        return 0.0f;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.zzdar = i > 0;
        this.zzdaq.zzst();
    }

    public final void setMuted(boolean z) {
        this.zzdas = z;
        zztw();
    }

    public final void setVolume(float f) {
        this.zzdat = f;
        zztw();
    }

    public final void zztt() {
        this.zzcxs = true;
        zztw();
    }

    public final void zztu() {
        this.zzcxs = false;
        zztw();
    }
}
