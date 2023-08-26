package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzkb;
import com.google.android.gms.internal.ads.zznk;
import java.util.Map;
/* loaded from: classes.dex */
final class zzr implements zzv<zzaqw> {
    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final /* synthetic */ void zza(zzaqw zzaqwVar, Map map) {
        zzaqw zzaqwVar2 = zzaqwVar;
        if (((Boolean) zzkb.zzik().zzd(zznk.zzbad)).booleanValue()) {
            zzaqwVar2.zzaj(!Boolean.parseBoolean((String) map.get("disabled")));
        }
    }
}
