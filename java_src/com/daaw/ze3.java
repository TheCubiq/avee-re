package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.internal.client.zzct;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzcx;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzep;
import com.google.android.gms.ads.internal.client.zzfe;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class ze3 extends UnifiedNativeAd {

    /* renamed from: a */
    public final ye3 f35003a;

    /* renamed from: c */
    public final wc3 f35005c;

    /* renamed from: e */
    public final NativeAd.AdChoicesInfo f35007e;

    /* renamed from: b */
    public final List f35004b = new ArrayList();

    /* renamed from: d */
    public final VideoController f35006d = new VideoController();

    /* renamed from: f */
    public final List f35008f = new ArrayList();

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(3:2|3|(2:5|(6:8|(4:13|(1:15)(1:22)|(3:17|18|19)(1:21)|20)|23|(0)(0)|20|6)))|(3:25|26|(2:28|(5:31|(1:33)(1:40)|(3:35|36|37)(1:39)|38|29)))|42|43|(7:45|46|47|48|(2:50|51)|53|54)|59|46|47|48|(0)|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bc, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bd, code lost:
        com.daaw.k04.zzh("", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00af A[Catch: RemoteException -> 0x00bc, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x00bc, blocks: (B:45:0x00a7, B:47:0x00af), top: B:55:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0027 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ze3(ye3 ye3Var) {
        wc3 wc3Var;
        vc3 zzk;
        vc3 vc3Var;
        IBinder iBinder;
        this.f35003a = ye3Var;
        oc3 oc3Var = null;
        try {
            List mo3803b = ye3Var.mo3803b();
            if (mo3803b != null) {
                for (Object obj : mo3803b) {
                    if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        vc3Var = queryLocalInterface instanceof vc3 ? (vc3) queryLocalInterface : new tc3(iBinder);
                        if (vc3Var == null) {
                            this.f35004b.add(new wc3(vc3Var));
                        }
                    }
                    vc3Var = null;
                    if (vc3Var == null) {
                    }
                }
            }
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
        try {
            List zzv = this.f35003a.zzv();
            if (zzv != null) {
                for (Object obj2 : zzv) {
                    zzcw zzb = obj2 instanceof IBinder ? zzcv.zzb((IBinder) obj2) : null;
                    if (zzb != null) {
                        this.f35008f.add(new zzcx(zzb));
                    }
                }
            }
        } catch (RemoteException e2) {
            k04.zzh("", e2);
        }
        try {
            zzk = this.f35003a.zzk();
        } catch (RemoteException e3) {
            k04.zzh("", e3);
        }
        if (zzk != null) {
            wc3Var = new wc3(zzk);
            this.f35005c = wc3Var;
            if (this.f35003a.zzi() != null) {
                oc3Var = new oc3(this.f35003a.zzi());
            }
            this.f35007e = oc3Var;
        }
        wc3Var = null;
        this.f35005c = wc3Var;
        if (this.f35003a.zzi() != null) {
        }
        this.f35007e = oc3Var;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.f35003a.mo3798k();
        } catch (RemoteException e) {
            k04.zzh("Failed to cancelUnconfirmedClick", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void destroy() {
        try {
            this.f35003a.zzx();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void enableCustomClickGesture() {
        try {
            this.f35003a.zzC();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.f35007e;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getAdvertiser() {
        try {
            return this.f35003a.zzn();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getBody() {
        try {
            return this.f35003a.zzo();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getCallToAction() {
        try {
            return this.f35003a.zzp();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Bundle getExtras() {
        try {
            Bundle zzf = this.f35003a.zzf();
            if (zzf != null) {
                return zzf;
            }
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getHeadline() {
        try {
            return this.f35003a.zzq();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.Image getIcon() {
        return this.f35005c;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List<NativeAd.Image> getImages() {
        return this.f35004b;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final MediaContent getMediaContent() {
        try {
            if (this.f35003a.zzj() != null) {
                return new zzep(this.f35003a.zzj(), null);
            }
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getMediationAdapterClassName() {
        try {
            return this.f35003a.zzr();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List<MuteThisAdReason> getMuteThisAdReasons() {
        return this.f35008f;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getPrice() {
        try {
            return this.f35003a.zzs();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final ResponseInfo getResponseInfo() {
        zzdn zzdnVar;
        try {
            zzdnVar = this.f35003a.zzg();
        } catch (RemoteException e) {
            k04.zzh("", e);
            zzdnVar = null;
        }
        return ResponseInfo.zza(zzdnVar);
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Double getStarRating() {
        try {
            double zze = this.f35003a.zze();
            if (zze == -1.0d) {
                return null;
            }
            return Double.valueOf(zze);
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getStore() {
        try {
            return this.f35003a.zzt();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController getVideoController() {
        try {
            if (this.f35003a.zzh() != null) {
                this.f35006d.zzb(this.f35003a.zzh());
            }
        } catch (RemoteException e) {
            k04.zzh("Exception occurred while getting video controller", e);
        }
        return this.f35006d;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.f35003a.mo3799j();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.f35003a.mo3801g();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        try {
            try {
                if (this.f35003a.mo3801g()) {
                    if (muteThisAdReason == null) {
                        this.f35003a.mo3797v0(null);
                        return;
                    } else if (muteThisAdReason instanceof zzcx) {
                        this.f35003a.mo3797v0(((zzcx) muteThisAdReason).zza());
                        return;
                    } else {
                        k04.zzg("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                        return;
                    }
                }
            } catch (RemoteException e) {
                k04.zzh("", e);
            }
            k04.zzg("Ad is not custom mute enabled");
        } catch (RemoteException e2) {
            k04.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.f35003a.mo3805W2(bundle);
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void recordCustomClickGesture() {
        try {
            this.f35003a.zzA();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f35003a.mo3800g2(bundle);
        } catch (RemoteException e) {
            k04.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f35003a.mo3804Z0(bundle);
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.f35003a.mo3806M1(new zzct(muteThisAdListener));
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f35003a.mo3807L0(new zzfe(onPaidEventListener));
        } catch (RemoteException e) {
            k04.zzh("Failed to setOnPaidEventListener", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setUnconfirmedClickListener(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.f35003a.mo3802d2(new kf3(unconfirmedClickListener));
        } catch (RemoteException e) {
            k04.zzh("Failed to setUnconfirmedClickListener", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Object zza() {
        try {
            yd0 zzl = this.f35003a.zzl();
            if (zzl != null) {
                return nt0.m14831M(zzl);
            }
            return null;
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }
}
