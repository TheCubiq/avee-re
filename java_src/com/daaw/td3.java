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
    public final sd3 a;
    public final MediaView b;
    public final VideoController c = new VideoController();
    public NativeCustomTemplateAd.DisplayOpenMeasurement d;

    public td3(sd3 sd3Var) {
        Context context;
        this.a = sd3Var;
        MediaView mediaView = null;
        try {
            context = (Context) nt0.M(sd3Var.zzh());
        } catch (RemoteException | NullPointerException e) {
            k04.zzh("", e);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (true == this.a.q(nt0.g3(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e2) {
                k04.zzh("", e2);
            }
        }
        this.b = mediaView;
    }

    public final sd3 a() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void destroy() {
        try {
            this.a.zzl();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final List<String> getAvailableAssetNames() {
        try {
            return this.a.zzk();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final String getCustomTemplateId() {
        try {
            return this.a.zzi();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final NativeCustomTemplateAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.d == null && this.a.zzq()) {
                this.d = new pc3(this.a);
            }
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
        return this.d;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final NativeAd.Image getImage(String str) {
        try {
            vc3 s = this.a.s(str);
            if (s != null) {
                return new wc3(s);
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
            return this.a.F2(str);
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final VideoController getVideoController() {
        try {
            zzdq zze = this.a.zze();
            if (zze != null) {
                this.c.zzb(zze);
            }
        } catch (RemoteException e) {
            k04.zzh("Exception occurred while getting video controller", e);
        }
        return this.c;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final MediaView getVideoMediaView() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void performClick(String str) {
        try {
            this.a.zzn(str);
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void recordImpression() {
        try {
            this.a.zzo();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }
}
