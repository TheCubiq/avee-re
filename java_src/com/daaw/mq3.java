package com.daaw;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzct;
import com.google.android.gms.ads.internal.client.zzcx;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzep;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class mq3 extends NativeAd {
    public final ye3 a;
    public final lq3 c;
    public final NativeAd.AdChoicesInfo d;
    public final List b = new ArrayList();
    public final List e = new ArrayList();

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
        To view partially-correct add '--show-bad-code' argument
    */
    public mq3(com.daaw.ye3 r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.b = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.e = r1
            r5.a = r6
            r1 = 0
            java.util.List r6 = r6.b()     // Catch: android.os.RemoteException -> L43
            if (r6 == 0) goto L47
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L43
        L20:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L43
            if (r2 == 0) goto L47
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L43
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L43
            if (r3 == 0) goto L35
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L43
            com.daaw.vc3 r2 = com.daaw.uc3.g3(r2)     // Catch: android.os.RemoteException -> L43
            goto L36
        L35:
            r2 = r1
        L36:
            if (r2 == 0) goto L20
            java.util.List r3 = r5.b     // Catch: android.os.RemoteException -> L43
            com.daaw.lq3 r4 = new com.daaw.lq3     // Catch: android.os.RemoteException -> L43
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L43
            r3.add(r4)     // Catch: android.os.RemoteException -> L43
            goto L20
        L43:
            r6 = move-exception
            com.daaw.k04.zzh(r0, r6)
        L47:
            com.daaw.ye3 r6 = r5.a     // Catch: android.os.RemoteException -> L76
            java.util.List r6 = r6.zzv()     // Catch: android.os.RemoteException -> L76
            if (r6 == 0) goto L7a
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L76
        L53:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L76
            if (r2 == 0) goto L7a
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L76
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L76
            if (r3 == 0) goto L68
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L76
            com.google.android.gms.ads.internal.client.zzcw r2 = com.google.android.gms.ads.internal.client.zzcv.zzb(r2)     // Catch: android.os.RemoteException -> L76
            goto L69
        L68:
            r2 = r1
        L69:
            if (r2 == 0) goto L53
            java.util.List r3 = r5.e     // Catch: android.os.RemoteException -> L76
            com.google.android.gms.ads.internal.client.zzcx r4 = new com.google.android.gms.ads.internal.client.zzcx     // Catch: android.os.RemoteException -> L76
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L76
            r3.add(r4)     // Catch: android.os.RemoteException -> L76
            goto L53
        L76:
            r6 = move-exception
            com.daaw.k04.zzh(r0, r6)
        L7a:
            com.daaw.ye3 r6 = r5.a     // Catch: android.os.RemoteException -> L88
            com.daaw.vc3 r6 = r6.zzk()     // Catch: android.os.RemoteException -> L88
            if (r6 == 0) goto L8c
            com.daaw.lq3 r2 = new com.daaw.lq3     // Catch: android.os.RemoteException -> L88
            r2.<init>(r6)     // Catch: android.os.RemoteException -> L88
            goto L8d
        L88:
            r6 = move-exception
            com.daaw.k04.zzh(r0, r6)
        L8c:
            r2 = r1
        L8d:
            r5.c = r2
            com.daaw.ye3 r6 = r5.a     // Catch: android.os.RemoteException -> La4
            com.daaw.nc3 r6 = r6.zzi()     // Catch: android.os.RemoteException -> La4
            if (r6 == 0) goto La8
            com.daaw.jq3 r6 = new com.daaw.jq3     // Catch: android.os.RemoteException -> La4
            com.daaw.ye3 r2 = r5.a     // Catch: android.os.RemoteException -> La4
            com.daaw.nc3 r2 = r2.zzi()     // Catch: android.os.RemoteException -> La4
            r6.<init>(r2)     // Catch: android.os.RemoteException -> La4
            r1 = r6
            goto La8
        La4:
            r6 = move-exception
            com.daaw.k04.zzh(r0, r6)
        La8:
            r5.d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.mq3.<init>(com.daaw.ye3):void");
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final /* bridge */ /* synthetic */ Object a() {
        try {
            return this.a.zzm();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.a.k();
        } catch (RemoteException e) {
            k04.zzh("Failed to cancelUnconfirmedClick", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void destroy() {
        try {
            this.a.zzx();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void enableCustomClickGesture() {
        try {
            this.a.zzC();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getAdvertiser() {
        try {
            return this.a.zzn();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getBody() {
        try {
            return this.a.zzo();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getCallToAction() {
        try {
            return this.a.zzp();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Bundle getExtras() {
        try {
            Bundle zzf = this.a.zzf();
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
            return this.a.zzq();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final NativeAd.Image getIcon() {
        return this.c;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List<NativeAd.Image> getImages() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final MediaContent getMediaContent() {
        try {
            if (this.a.zzj() != null) {
                return new zzep(this.a.zzj(), null);
            }
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List<MuteThisAdReason> getMuteThisAdReasons() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getPrice() {
        try {
            return this.a.zzs();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final ResponseInfo getResponseInfo() {
        zzdn zzdnVar;
        try {
            zzdnVar = this.a.zzg();
        } catch (RemoteException e) {
            k04.zzh("", e);
            zzdnVar = null;
        }
        return ResponseInfo.zza(zzdnVar);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Double getStarRating() {
        try {
            double zze = this.a.zze();
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
            return this.a.zzt();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.a.j();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.a.g();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        try {
            try {
                if (this.a.g()) {
                    if (muteThisAdReason == null) {
                        this.a.v0(null);
                        return;
                    } else if (muteThisAdReason instanceof zzcx) {
                        this.a.v0(((zzcx) muteThisAdReason).zza());
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
            this.a.W2(bundle);
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordCustomClickGesture() {
        try {
            this.a.zzA();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.a.g2(bundle);
        } catch (RemoteException e) {
            k04.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.a.Z0(bundle);
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.a.M1(new zzct(muteThisAdListener));
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.a.L0(new zzfe(onPaidEventListener));
        } catch (RemoteException e) {
            k04.zzh("Failed to setOnPaidEventListener", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setUnconfirmedClickListener(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.a.d2(new xq3(unconfirmedClickListener));
        } catch (RemoteException e) {
            k04.zzh("Failed to setUnconfirmedClickListener", e);
        }
    }
}
