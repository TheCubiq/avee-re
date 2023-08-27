package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzaqw;
import java.util.Map;
/* loaded from: classes.dex */
final class zzn implements zzv<zzaqw> {
    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final /* synthetic */ void zza(zzaqw zzaqwVar, Map map) {
        zzaqw zzaqwVar2 = zzaqwVar;
        com.google.android.gms.ads.internal.overlay.zzd zzub = zzaqwVar2.zzub();
        if (zzub != null) {
            zzub.close();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzd zzuc = zzaqwVar2.zzuc();
        if (zzuc != null) {
            zzuc.close();
        } else {
            zzakb.zzdk("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
