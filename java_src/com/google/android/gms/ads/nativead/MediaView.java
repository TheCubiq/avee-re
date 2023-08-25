package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.daaw.k04;
import com.daaw.nt0;
import com.daaw.sd3;
import com.google.android.gms.ads.MediaContent;
/* loaded from: classes.dex */
public class MediaView extends FrameLayout {
    public MediaContent p;
    public boolean q;
    public ImageView.ScaleType r;
    public boolean s;
    public zzb t;
    public zzc u;

    public MediaView(Context context) {
        super(context);
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public MediaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public final synchronized void a(zzb zzbVar) {
        this.t = zzbVar;
        if (this.q) {
            zzbVar.zza.b(this.p);
        }
    }

    public final synchronized void b(zzc zzcVar) {
        this.u = zzcVar;
        if (this.s) {
            zzcVar.zza.c(this.r);
        }
    }

    public MediaContent getMediaContent() {
        return this.p;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.s = true;
        this.r = scaleType;
        zzc zzcVar = this.u;
        if (zzcVar != null) {
            zzcVar.zza.c(scaleType);
        }
    }

    public void setMediaContent(MediaContent mediaContent) {
        this.q = true;
        this.p = mediaContent;
        zzb zzbVar = this.t;
        if (zzbVar != null) {
            zzbVar.zza.b(mediaContent);
        }
        if (mediaContent == null) {
            return;
        }
        try {
            sd3 zza = mediaContent.zza();
            if (zza == null || zza.q(nt0.g3(this))) {
                return;
            }
            removeAllViews();
        } catch (RemoteException e) {
            removeAllViews();
            k04.zzh("", e);
        }
    }
}
