package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.daaw.d04;
import com.daaw.dw3;
import com.daaw.ew3;
import com.daaw.k04;
import com.daaw.tv3;
import com.daaw.vv3;
import com.daaw.yd0;
import com.daaw.zv3;
import com.google.android.gms.internal.ads.zzcdy;
/* loaded from: classes.dex */
public final class zzfc extends vv3 {
    /* renamed from: g3 */
    public static void m1392g3(final dw3 dw3Var) {
        k04.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        d04.f6340b.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfb
            @Override // java.lang.Runnable
            public final void run() {
                dw3 dw3Var2 = dw3.this;
                if (dw3Var2 != null) {
                    try {
                        dw3Var2.zze(1);
                    } catch (RemoteException e) {
                        k04.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
        });
    }

    @Override // com.daaw.wv3
    public final Bundle zzb() {
        return new Bundle();
    }

    @Override // com.daaw.wv3
    public final zzdn zzc() {
        return null;
    }

    @Override // com.daaw.wv3
    public final tv3 zzd() {
        return null;
    }

    @Override // com.daaw.wv3
    public final String zze() {
        return "";
    }

    @Override // com.daaw.wv3
    public final void zzf(zzl zzlVar, dw3 dw3Var) {
        m1392g3(dw3Var);
    }

    @Override // com.daaw.wv3
    public final void zzg(zzl zzlVar, dw3 dw3Var) {
        m1392g3(dw3Var);
    }

    @Override // com.daaw.wv3
    public final void zzh(boolean z) {
    }

    @Override // com.daaw.wv3
    public final void zzi(zzdd zzddVar) {
    }

    @Override // com.daaw.wv3
    public final void zzj(zzdg zzdgVar) {
    }

    @Override // com.daaw.wv3
    public final void zzk(zv3 zv3Var) {
    }

    @Override // com.daaw.wv3
    public final void zzl(zzcdy zzcdyVar) {
    }

    @Override // com.daaw.wv3
    public final void zzm(yd0 yd0Var) {
    }

    @Override // com.daaw.wv3
    public final void zzn(yd0 yd0Var, boolean z) {
    }

    @Override // com.daaw.wv3
    public final boolean zzo() {
        return false;
    }

    @Override // com.daaw.wv3
    public final void zzp(ew3 ew3Var) {
    }
}
