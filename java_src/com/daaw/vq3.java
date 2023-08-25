package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzep;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import java.util.List;
/* loaded from: classes.dex */
public final class vq3 implements NativeCustomFormatAd {

    /* renamed from: a */
    public final sd3 f30465a;

    /* renamed from: b */
    public final MediaView f30466b;

    /* renamed from: c */
    public final VideoController f30467c = new VideoController();

    /* renamed from: d */
    public NativeCustomFormatAd.DisplayOpenMeasurement f30468d;

    public vq3(sd3 sd3Var) {
        Context context;
        this.f30465a = sd3Var;
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
                if (true == this.f30465a.mo2682q(nt0.m14830g3(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e2) {
                k04.zzh("", e2);
            }
        }
        this.f30466b = mediaView;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void destroy() {
        try {
            this.f30465a.zzl();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final List<String> getAvailableAssetNames() {
        try {
            return this.f30465a.zzk();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final String getCustomFormatId() {
        try {
            return this.f30465a.zzi();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final NativeCustomFormatAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.f30468d == null && this.f30465a.zzq()) {
                this.f30468d = new kq3(this.f30465a);
            }
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
        return this.f30468d;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final NativeAd.Image getImage(String str) {
        try {
            vc3 mo2681s = this.f30465a.mo2681s(str);
            if (mo2681s != null) {
                return new lq3(mo2681s);
            }
            return null;
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final MediaContent getMediaContent() {
        try {
            if (this.f30465a.zzf() != null) {
                return new zzep(this.f30465a.zzf(), this.f30465a);
            }
            return null;
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final CharSequence getText(String str) {
        try {
            return this.f30465a.mo2685F2(str);
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final VideoController getVideoController() {
        try {
            zzdq zze = this.f30465a.zze();
            if (zze != null) {
                this.f30467c.zzb(zze);
            }
        } catch (RemoteException e) {
            k04.zzh("Exception occurred while getting video controller", e);
        }
        return this.f30467c;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final MediaView getVideoMediaView() {
        return this.f30466b;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void performClick(String str) {
        try {
            this.f30465a.zzn(str);
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void recordImpression() {
        try {
            this.f30465a.zzo();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }
}
