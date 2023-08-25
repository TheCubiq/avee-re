package com.google.android.gms.ads.internal.client;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.daaw.k04;
import com.daaw.nt0;
import com.daaw.sc3;
import com.daaw.sd3;
import com.daaw.yd0;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
/* loaded from: classes.dex */
public final class zzep implements MediaContent {
    public final sc3 a;
    public final VideoController b = new VideoController();
    public final sd3 c;

    public zzep(sc3 sc3Var, sd3 sd3Var) {
        this.a = sc3Var;
        this.c = sd3Var;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getAspectRatio() {
        try {
            return this.a.zze();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getCurrentTime() {
        try {
            return this.a.zzf();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getDuration() {
        try {
            return this.a.zzg();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final Drawable getMainImage() {
        try {
            yd0 zzi = this.a.zzi();
            if (zzi != null) {
                return (Drawable) nt0.M(zzi);
            }
            return null;
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final VideoController getVideoController() {
        try {
            if (this.a.zzh() != null) {
                this.b.zzb(this.a.zzh());
            }
        } catch (RemoteException e) {
            k04.zzh("Exception occurred while getting video controller", e);
        }
        return this.b;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean hasVideoContent() {
        try {
            return this.a.zzk();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final void setMainImage(Drawable drawable) {
        try {
            this.a.zzj(nt0.g3(drawable));
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final sd3 zza() {
        return this.c;
    }

    public final sc3 zzb() {
        return this.a;
    }
}
