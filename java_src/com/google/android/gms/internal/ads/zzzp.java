package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class zzzp extends zzzk {
    private final zzatg zzbvi;

    public zzzp(zzatg zzatgVar) {
        this.zzbvi = zzatgVar;
    }

    private static Bundle zzbt(String str) throws RemoteException {
        String valueOf = String.valueOf(str);
        zzane.zzdk(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                return bundle2;
            }
            return bundle;
        } catch (JSONException e) {
            zzane.zzb("", e);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzj
    public final zzlo getVideoController() {
        zzatg zzatgVar = this.zzbvi;
        if (zzatgVar instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) zzatgVar).getVideoController();
            } catch (Throwable th) {
                zzane.zzb("", th);
                return null;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzzj
    public final void showInterstitial() throws RemoteException {
        zzate zzateVar = null;
        try {
            zzateVar.zzoy();
        } catch (Throwable th) {
            zzane.zzb("", th);
            throw new RemoteException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzzs, com.google.android.gms.internal.ads.zzatj] */
    @Override // com.google.android.gms.internal.ads.zzzj
    public final void zza(IObjectWrapper iObjectWrapper, String str, Bundle bundle, zzzm zzzmVar) throws RemoteException {
        int i;
        try {
            ?? zzzsVar = new zzzs(this, zzzmVar);
            zzatg zzatgVar = this.zzbvi;
            Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            char c = 65535;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c = 3;
                        break;
                    }
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c = 2;
                        break;
                    }
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                i = zzath.zzdgn;
            } else if (c == 1) {
                i = zzath.zzdgo;
            } else if (c == 2) {
                i = zzath.zzdgp;
            } else if (c != 3) {
                throw new IllegalArgumentException("Internal Error");
            } else {
                i = zzath.zzdgq;
            }
            zzatgVar.zza(new zzati(context, i, bundle), zzzsVar);
        } catch (Throwable th) {
            zzane.zzb("Error generating signals for RTB", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzj
    public final void zza(byte[] bArr, String str, Bundle bundle, IObjectWrapper iObjectWrapper, zzzf zzzfVar, zzxt zzxtVar, zzjn zzjnVar) throws RemoteException {
        try {
            zzzq zzzqVar = new zzzq(this, zzzfVar, zzxtVar);
            zzatg zzatgVar = this.zzbvi;
            new zzatf((Context) ObjectWrapper.unwrap(iObjectWrapper), bArr, zzbt(str), bundle);
            com.google.android.gms.ads.zzb.zza(zzjnVar.width, zzjnVar.height, zzjnVar.zzarb);
            zzzqVar.zzau(String.valueOf(zzatgVar.getClass().getSimpleName()).concat(" does not support banner."));
        } catch (Throwable th) {
            zzane.zzb("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzj
    public final void zza(byte[] bArr, String str, Bundle bundle, IObjectWrapper iObjectWrapper, zzzh zzzhVar, zzxt zzxtVar) throws RemoteException {
        try {
            zzzr zzzrVar = new zzzr(this, zzzhVar, zzxtVar);
            zzatg zzatgVar = this.zzbvi;
            new zzatf((Context) ObjectWrapper.unwrap(iObjectWrapper), bArr, zzbt(str), bundle);
            zzzrVar.zzau(String.valueOf(zzatgVar.getClass().getSimpleName()).concat(" does not support interstitial."));
        } catch (Throwable th) {
            zzane.zzb("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzj
    public final zzzt zznc() throws RemoteException {
        return zzzt.zza(this.zzbvi.zzwa());
    }

    @Override // com.google.android.gms.internal.ads.zzzj
    public final zzzt zznd() throws RemoteException {
        return zzzt.zza(this.zzbvi.zzvz());
    }
}
