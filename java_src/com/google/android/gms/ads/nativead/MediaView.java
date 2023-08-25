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

    /* renamed from: p */
    public MediaContent f36447p;

    /* renamed from: q */
    public boolean f36448q;

    /* renamed from: r */
    public ImageView.ScaleType f36449r;

    /* renamed from: s */
    public boolean f36450s;

    /* renamed from: t */
    public zzb f36451t;

    /* renamed from: u */
    public zzc f36452u;

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

    /* renamed from: a */
    public final synchronized void m1298a(zzb zzbVar) {
        this.f36451t = zzbVar;
        if (this.f36448q) {
            zzbVar.zza.m1286b(this.f36447p);
        }
    }

    /* renamed from: b */
    public final synchronized void m1297b(zzc zzcVar) {
        this.f36452u = zzcVar;
        if (this.f36450s) {
            zzcVar.zza.m1285c(this.f36449r);
        }
    }

    public MediaContent getMediaContent() {
        return this.f36447p;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f36450s = true;
        this.f36449r = scaleType;
        zzc zzcVar = this.f36452u;
        if (zzcVar != null) {
            zzcVar.zza.m1285c(scaleType);
        }
    }

    public void setMediaContent(MediaContent mediaContent) {
        this.f36448q = true;
        this.f36447p = mediaContent;
        zzb zzbVar = this.f36451t;
        if (zzbVar != null) {
            zzbVar.zza.m1286b(mediaContent);
        }
        if (mediaContent == null) {
            return;
        }
        try {
            sd3 zza = mediaContent.zza();
            if (zza == null || zza.mo2682q(nt0.m14830g3(this))) {
                return;
            }
            removeAllViews();
        } catch (RemoteException e) {
            removeAllViews();
            k04.zzh("", e);
        }
    }
}
