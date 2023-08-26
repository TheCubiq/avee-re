package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;
@zzadh
/* loaded from: classes2.dex */
public abstract class zzapg extends TextureView implements zzaqa {
    protected final zzapp zzcxk;
    protected final zzapz zzcxl;

    public zzapg(Context context) {
        super(context);
        this.zzcxk = new zzapp();
        this.zzcxl = new zzapz(context, this);
    }

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void pause();

    public abstract void play();

    public abstract void seekTo(int i);

    public abstract void setVideoPath(String str);

    public abstract void stop();

    public abstract void zza(float f, float f2);

    public abstract void zza(zzapf zzapfVar);

    public abstract String zzsp();

    public abstract void zzst();
}
