package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.internal.client.zzdq;
import java.util.List;
/* loaded from: classes.dex */
public final class td3 implements NativeCustomTemplateAd {

    /* renamed from: a */
    public final sd3 f27508a;

    /* renamed from: b */
    public final MediaView f27509b;

    /* renamed from: c */
    public final VideoController f27510c = new VideoController();

    /* renamed from: d */
    public NativeCustomTemplateAd.DisplayOpenMeasurement f27511d;

    public td3(sd3 sd3Var) {
        Context context;
        this.f27508a = sd3Var;
        MediaView mediaView = null;
        try {
            context = (Context) nt0.m14831M(sd3Var.zzh());
        } catch (RemoteException | NullPointerException e) {
            k04.zzh("", e);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (true == this.f27508a.mo2682q(nt0.m14830g3(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e2) {
                k04.zzh("", e2);
            }
        }
        this.f27509b = mediaView;
    }

    /* renamed from: a */
    public final sd3 m9280a() {
        return this.f27508a;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void destroy() {
        try {
            this.f27508a.zzl();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final List<String> getAvailableAssetNames() {
        try {
            return this.f27508a.zzk();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final String getCustomTemplateId() {
        try {
            return this.f27508a.zzi();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final NativeCustomTemplateAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.f27511d == null && this.f27508a.zzq()) {
                this.f27511d = new pc3(this.f27508a);
            }
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
        return this.f27511d;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final NativeAd.Image getImage(String str) {
        try {
            vc3 mo2681s = this.f27508a.mo2681s(str);
            if (mo2681s != null) {
                return new wc3(mo2681s);
            }
            return null;
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final CharSequence getText(String str) {
        try {
            return this.f27508a.mo2685F2(str);
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final VideoController getVideoController() {
        try {
            zzdq zze = this.f27508a.zze();
            if (zze != null) {
                this.f27510c.zzb(zze);
            }
        } catch (RemoteException e) {
            k04.zzh("Exception occurred while getting video controller", e);
        }
        return this.f27510c;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final MediaView getVideoMediaView() {
        return this.f27509b;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void performClick(String str) {
        try {
            this.f27508a.zzn(str);
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void recordImpression() {
        try {
            this.f27508a.zzo();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }
}
