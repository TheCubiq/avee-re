package com.daaw;

import android.os.Bundle;
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
import com.google.android.gms.ads.internal.client.zzcx;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzep;
import com.google.android.gms.ads.internal.client.zzfe;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class ze3 extends UnifiedNativeAd {
    public final ye3 a;
    public final wc3 c;
    public final NativeAd.AdChoicesInfo e;
    public final List b = new ArrayList();
    public final VideoController d = new VideoController();
    public final List f = new ArrayList();

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
        To view partially-correct add '--show-bad-code' argument
    */
    public ze3(com.daaw.ye3 r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.b = r1
            com.google.android.gms.ads.VideoController r1 = new com.google.android.gms.ads.VideoController
            r1.<init>()
            r5.d = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f = r1
            r5.a = r6
            r1 = 0
            java.util.List r6 = r6.b()     // Catch: android.os.RemoteException -> L5b
            if (r6 == 0) goto L5f
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L5b
        L27:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L5b
            if (r2 == 0) goto L5f
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L5b
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L5b
            if (r3 == 0) goto L4d
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L5b
            if (r2 != 0) goto L3a
            goto L4d
        L3a:
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch: android.os.RemoteException -> L5b
            boolean r4 = r3 instanceof com.daaw.vc3     // Catch: android.os.RemoteException -> L5b
            if (r4 == 0) goto L47
            com.daaw.vc3 r3 = (com.daaw.vc3) r3     // Catch: android.os.RemoteException -> L5b
            goto L4e
        L47:
            com.daaw.tc3 r3 = new com.daaw.tc3     // Catch: android.os.RemoteException -> L5b
            r3.<init>(r2)     // Catch: android.os.RemoteException -> L5b
            goto L4e
        L4d:
            r3 = r1
        L4e:
            if (r3 == 0) goto L27
            java.util.List r2 = r5.b     // Catch: android.os.RemoteException -> L5b
            com.daaw.wc3 r4 = new com.daaw.wc3     // Catch: android.os.RemoteException -> L5b
            r4.<init>(r3)     // Catch: android.os.RemoteException -> L5b
            r2.add(r4)     // Catch: android.os.RemoteException -> L5b
            goto L27
        L5b:
            r6 = move-exception
            com.daaw.k04.zzh(r0, r6)
        L5f:
            com.daaw.ye3 r6 = r5.a     // Catch: android.os.RemoteException -> L8e
            java.util.List r6 = r6.zzv()     // Catch: android.os.RemoteException -> L8e
            if (r6 == 0) goto L92
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L8e
        L6b:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L8e
            if (r2 == 0) goto L92
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L8e
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L8e
            if (r3 == 0) goto L80
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L8e
            com.google.android.gms.ads.internal.client.zzcw r2 = com.google.android.gms.ads.internal.client.zzcv.zzb(r2)     // Catch: android.os.RemoteException -> L8e
            goto L81
        L80:
            r2 = r1
        L81:
            if (r2 == 0) goto L6b
            java.util.List r3 = r5.f     // Catch: android.os.RemoteException -> L8e
            com.google.android.gms.ads.internal.client.zzcx r4 = new com.google.android.gms.ads.internal.client.zzcx     // Catch: android.os.RemoteException -> L8e
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L8e
            r3.add(r4)     // Catch: android.os.RemoteException -> L8e
            goto L6b
        L8e:
            r6 = move-exception
            com.daaw.k04.zzh(r0, r6)
        L92:
            com.daaw.ye3 r6 = r5.a     // Catch: android.os.RemoteException -> La0
            com.daaw.vc3 r6 = r6.zzk()     // Catch: android.os.RemoteException -> La0
            if (r6 == 0) goto La4
            com.daaw.wc3 r2 = new com.daaw.wc3     // Catch: android.os.RemoteException -> La0
            r2.<init>(r6)     // Catch: android.os.RemoteException -> La0
            goto La5
        La0:
            r6 = move-exception
            com.daaw.k04.zzh(r0, r6)
        La4:
            r2 = r1
        La5:
            r5.c = r2
            com.daaw.ye3 r6 = r5.a     // Catch: android.os.RemoteException -> Lbc
            com.daaw.nc3 r6 = r6.zzi()     // Catch: android.os.RemoteException -> Lbc
            if (r6 == 0) goto Lc0
            com.daaw.oc3 r6 = new com.daaw.oc3     // Catch: android.os.RemoteException -> Lbc
            com.daaw.ye3 r2 = r5.a     // Catch: android.os.RemoteException -> Lbc
            com.daaw.nc3 r2 = r2.zzi()     // Catch: android.os.RemoteException -> Lbc
            r6.<init>(r2)     // Catch: android.os.RemoteException -> Lbc
            r1 = r6
            goto Lc0
        Lbc:
            r6 = move-exception
            com.daaw.k04.zzh(r0, r6)
        Lc0:
            r5.e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ze3.<init>(com.daaw.ye3):void");
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.a.k();
        } catch (RemoteException e) {
            k04.zzh("Failed to cancelUnconfirmedClick", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void destroy() {
        try {
            this.a.zzx();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void enableCustomClickGesture() {
        try {
            this.a.zzC();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getAdvertiser() {
        try {
            return this.a.zzn();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getBody() {
        try {
            return this.a.zzo();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getCallToAction() {
        try {
            return this.a.zzp();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
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

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getHeadline() {
        try {
            return this.a.zzq();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.Image getIcon() {
        return this.c;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List<NativeAd.Image> getImages() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
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

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getMediationAdapterClassName() {
        try {
            return this.a.zzr();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List<MuteThisAdReason> getMuteThisAdReasons() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getPrice() {
        try {
            return this.a.zzs();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
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

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
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

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getStore() {
        try {
            return this.a.zzt();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController getVideoController() {
        try {
            if (this.a.zzh() != null) {
                this.d.zzb(this.a.zzh());
            }
        } catch (RemoteException e) {
            k04.zzh("Exception occurred while getting video controller", e);
        }
        return this.d;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.a.j();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.a.g();
        } catch (RemoteException e) {
            k04.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
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

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.a.W2(bundle);
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void recordCustomClickGesture() {
        try {
            this.a.zzA();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.a.g2(bundle);
        } catch (RemoteException e) {
            k04.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.a.Z0(bundle);
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.a.M1(new zzct(muteThisAdListener));
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.a.L0(new zzfe(onPaidEventListener));
        } catch (RemoteException e) {
            k04.zzh("Failed to setOnPaidEventListener", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setUnconfirmedClickListener(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.a.d2(new kf3(unconfirmedClickListener));
        } catch (RemoteException e) {
            k04.zzh("Failed to setUnconfirmedClickListener", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Object zza() {
        try {
            yd0 zzl = this.a.zzl();
            if (zzl != null) {
                return nt0.M(zzl);
            }
            return null;
        } catch (RemoteException e) {
            k04.zzh("", e);
            return null;
        }
    }
}
