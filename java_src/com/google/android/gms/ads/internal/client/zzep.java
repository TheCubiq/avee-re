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

    /* renamed from: a */
    public final sc3 f36179a;

    /* renamed from: b */
    public final VideoController f36180b = new VideoController();

    /* renamed from: c */
    public final sd3 f36181c;

    public zzep(sc3 sc3Var, sd3 sd3Var) {
        this.f36179a = sc3Var;
        this.f36181c = sd3Var;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getAspectRatio() {
        try {
            return this.f36179a.zze();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getCurrentTime() {
        try {
            return this.f36179a.zzf();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getDuration() {
        try {
            return this.f36179a.zzg();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final Drawable getMainImage() {
        try {
            yd0 zzi = this.f36179a.zzi();
            if (zzi != null) {
                return (Drawable) nt0.m14831M(zzi);
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
            if (this.f36179a.zzh() != null) {
                this.f36180b.zzb(this.f36179a.zzh());
            }
        } catch (RemoteException e) {
            k04.zzh("Exception occurred while getting video controller", e);
        }
        return this.f36180b;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean hasVideoContent() {
        try {
            return this.f36179a.zzk();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final void setMainImage(Drawable drawable) {
        try {
            this.f36179a.zzj(nt0.m14830g3(drawable));
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final sd3 zza() {
        return this.f36181c;
    }

    public final sc3 zzb() {
        return this.f36179a;
    }
}
