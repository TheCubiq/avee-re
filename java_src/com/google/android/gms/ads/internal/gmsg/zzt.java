package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.zzaqw;
import java.util.Map;
/* loaded from: classes.dex */
final class zzt implements zzv<zzaqw> {
    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final /* synthetic */ void zza(zzaqw zzaqwVar, Map map) {
        zzaqw zzaqwVar2 = zzaqwVar;
        if (map.keySet().contains("start")) {
            zzaqwVar2.zzuf().zzva();
        } else if (map.keySet().contains("stop")) {
            zzaqwVar2.zzuf().zzvb();
        } else if (map.keySet().contains("cancel")) {
            zzaqwVar2.zzuf().zzvc();
        }
    }
}
