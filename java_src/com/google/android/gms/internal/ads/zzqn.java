package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;
@zzadh
/* loaded from: classes2.dex */
public final class zzqn extends NativeAppInstallAd {
    private final zzqk zzbkn;
    private final zzpz zzbkp;
    private final NativeAd.AdChoicesInfo zzbkq;
    private final List<NativeAd.Image> zzbko = new ArrayList();
    private final VideoController zzasv = new VideoController();

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(3:2|3|(2:5|(5:8|(1:22)(2:12|(1:14)(1:21))|(3:16|17|18)(1:20)|19|6)))|(2:24|25)|(7:27|28|29|30|(2:32|33)|35|36)|41|28|29|30|(0)|35|36) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
        com.google.android.gms.internal.ads.zzane.zzb("", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074 A[Catch: RemoteException -> 0x0081, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x0081, blocks: (B:30:0x006c, B:32:0x0074), top: B:38:0x006c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzqn(zzqk zzqkVar) {
        zzpz zzpzVar;
        zzpw zzjz;
        zzpw zzpwVar;
        IBinder iBinder;
        this.zzbkn = zzqkVar;
        zzpv zzpvVar = null;
        try {
            List images = zzqkVar.getImages();
            if (images != null) {
                for (Object obj : images) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        zzpwVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        zzpwVar = queryLocalInterface instanceof zzpw ? (zzpw) queryLocalInterface : new zzpy(iBinder);
                    }
                    if (zzpwVar != null) {
                        this.zzbko.add(new zzpz(zzpwVar));
                    }
                }
            }
        } catch (RemoteException e) {
            zzane.zzb("", e);
        }
        try {
            zzjz = this.zzbkn.zzjz();
        } catch (RemoteException e2) {
            zzane.zzb("", e2);
        }
        if (zzjz != null) {
            zzpzVar = new zzpz(zzjz);
            this.zzbkp = zzpzVar;
            if (this.zzbkn.zzkf() != null) {
                zzpvVar = new zzpv(this.zzbkn.zzkf());
            }
            this.zzbkq = zzpvVar;
        }
        zzpzVar = null;
        this.zzbkp = zzpzVar;
        if (this.zzbkn.zzkf() != null) {
        }
        this.zzbkq = zzpvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.formats.NativeAd
    /* renamed from: zzka */
    public final IObjectWrapper zzbe() {
        try {
            return this.zzbkn.zzka();
        } catch (RemoteException e) {
            zzane.zzb("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final void destroy() {
        try {
            this.zzbkn.destroy();
        } catch (RemoteException e) {
            zzane.zzb("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.zzbkq;
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getBody() {
        try {
            return this.zzbkn.getBody();
        } catch (RemoteException e) {
            zzane.zzb("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getCallToAction() {
        try {
            return this.zzbkn.getCallToAction();
        } catch (RemoteException e) {
            zzane.zzb("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final Bundle getExtras() {
        try {
            return this.zzbkn.getExtras();
        } catch (RemoteException e) {
            zzane.zzb("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getHeadline() {
        try {
            return this.zzbkn.getHeadline();
        } catch (RemoteException e) {
            zzane.zzb("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final NativeAd.Image getIcon() {
        return this.zzbkp;
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final List<NativeAd.Image> getImages() {
        return this.zzbko;
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getMediationAdapterClassName() {
        try {
            return this.zzbkn.getMediationAdapterClassName();
        } catch (RemoteException e) {
            zzane.zzb("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getPrice() {
        try {
            return this.zzbkn.getPrice();
        } catch (RemoteException e) {
            zzane.zzb("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final Double getStarRating() {
        try {
            double starRating = this.zzbkn.getStarRating();
            if (starRating == -1.0d) {
                return null;
            }
            return Double.valueOf(starRating);
        } catch (RemoteException e) {
            zzane.zzb("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getStore() {
        try {
            return this.zzbkn.getStore();
        } catch (RemoteException e) {
            zzane.zzb("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final VideoController getVideoController() {
        try {
            if (this.zzbkn.getVideoController() != null) {
                this.zzasv.zza(this.zzbkn.getVideoController());
            }
        } catch (RemoteException e) {
            zzane.zzb("Exception occurred while getting video controller", e);
        }
        return this.zzasv;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.zzbkn.performClick(bundle);
        } catch (RemoteException e) {
            zzane.zzb("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zzbkn.recordImpression(bundle);
        } catch (RemoteException e) {
            zzane.zzb("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zzbkn.reportTouchEvent(bundle);
        } catch (RemoteException e) {
            zzane.zzb("", e);
        }
    }
}
