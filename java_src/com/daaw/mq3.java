package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzct;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzcx;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzep;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class mq3 extends NativeAd {

    /* renamed from: a */
    public final ye3 f19070a;

    /* renamed from: c */
    public final lq3 f19072c;

    /* renamed from: d */
    public final NativeAd.AdChoicesInfo f19073d;

    /* renamed from: b */
    public final List f19071b = new ArrayList();

    /* renamed from: e */
    public final List f19074e = new ArrayList();

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|2|3|(2:5|(5:8|(1:10)(1:17)|(3:12|13|14)(1:16)|15|6))|(3:19|20|(2:22|(5:25|(1:27)(1:34)|(3:29|30|31)(1:33)|32|23)))|36|37|(7:39|40|41|42|(2:44|45)|47|48)|53|40|41|42|(0)|47|48) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a5, code lost:
        com.daaw.k04.zzh("", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097 A[Catch: RemoteException -> 0x00a4, TRY_LEAVE, TryCatch #2 {RemoteException -> 0x00a4, blocks: (B:39:0x008f, B:41:0x0097), top: B:51:0x008f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mq3(ye3 ye3Var) {
        lq3 lq3Var;
        vc3 zzk;
        this.f19070a = ye3Var;
        jq3 jq3Var = null;
        try {
            List mo3803b = ye3Var.mo3803b();
            if (mo3803b != null) {
                for (Object obj : mo3803b) {
                    vc3 m8320g3 = obj instanceof IBinder ? uc3.m8320g3((IBinder) obj) : null;
                    if (m8320g3 != null) {
                        this.f19071b.add(new lq3(m8320g3));
                    }
                }
            }
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
        try {
            List zzv = this.f19070a.zzv();
            if (zzv != null) {
                for (Object obj2 : zzv) {
                    zzcw zzb = obj2 instanceof IBinder ? zzcv.zzb((IBinder) obj2) : null;
                    if (zzb != null) {
                        this.f19074e.add(new zzcx(zzb));
                    }
                }
            }
        } catch (RemoteException e2) {
            k04.zzh("", e2);
        }
        try {
            zzk = this.f19070a.zzk();
        } catch (RemoteException e3) {
            k04.zzh("", e3);
        }
        if (zzk != null) {
            lq3Var = new lq3(zzk);
            this.f19072c = lq3Var;
            if (this.f19070a.zzi() != null) {
                jq3Var = new jq3(this.f19070a.zzi());
            }
            this.f19073d = jq3Var;
        }
        lq3Var = null;
        this.f19072c = lq3Var;
        if (this.f19070a.zzi() != null) {
        }
        this.f19073d = jq3Var;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo1296a() {
        try {
            return this.f19070a.zzm();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.f19070a.mo3798k();
        } catch (RemoteException e) {
            k04.zzh("Failed to cancelUnconfirmedClick", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void destroy() {
        try {
            this.f19070a.zzx();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void enableCustomClickGesture() {
        try {
            this.f19070a.zzC();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.f19073d;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getAdvertiser() {
        try {
            return this.f19070a.zzn();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getBody() {
        try {
            return this.f19070a.zzo();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getCallToAction() {
        try {
            return this.f19070a.zzp();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Bundle getExtras() {
        try {
            Bundle zzf = this.f19070a.zzf();
            if (zzf != null) {
                return zzf;
            }
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getHeadline() {
        try {
            return this.f19070a.zzq();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final NativeAd.Image getIcon() {
        return this.f19072c;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List<NativeAd.Image> getImages() {
        return this.f19071b;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final MediaContent getMediaContent() {
        try {
            if (this.f19070a.zzj() != null) {
                return new zzep(this.f19070a.zzj(), null);
            }
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List<MuteThisAdReason> getMuteThisAdReasons() {
        return this.f19074e;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getPrice() {
        try {
            return this.f19070a.zzs();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final ResponseInfo getResponseInfo() {
        zzdn zzdnVar;
        try {
            zzdnVar = this.f19070a.zzg();
        } catch (RemoteException e) {
            k04.zzh("", e);
            zzdnVar = null;
        }
        return ResponseInfo.zza(zzdnVar);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Double getStarRating() {
        try {
            double zze = this.f19070a.zze();
            if (zze == -1.0d) {
                return null;
            }
            return Double.valueOf(zze);
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getStore() {
        try {
            return this.f19070a.zzt();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.f19070a.mo3799j();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.f19070a.mo3801g();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        try {
            try {
                if (this.f19070a.mo3801g()) {
                    if (muteThisAdReason == null) {
                        this.f19070a.mo3797v0(null);
                        return;
                    } else if (muteThisAdReason instanceof zzcx) {
                        this.f19070a.mo3797v0(((zzcx) muteThisAdReason).zza());
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

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.f19070a.mo3805W2(bundle);
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordCustomClickGesture() {
        try {
            this.f19070a.zzA();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f19070a.mo3800g2(bundle);
        } catch (RemoteException e) {
            k04.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f19070a.mo3804Z0(bundle);
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.f19070a.mo3806M1(new zzct(muteThisAdListener));
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f19070a.mo3807L0(new zzfe(onPaidEventListener));
        } catch (RemoteException e) {
            k04.zzh("Failed to setOnPaidEventListener", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setUnconfirmedClickListener(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.f19070a.mo3802d2(new xq3(unconfirmedClickListener));
        } catch (RemoteException e) {
            k04.zzh("Failed to setUnconfirmedClickListener", e);
        }
    }
}
