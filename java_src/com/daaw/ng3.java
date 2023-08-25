package com.daaw;

import com.google.android.gms.ads.internal.overlay.zzl;
import java.util.Map;
/* loaded from: classes.dex */
public final class ng3 implements zg3 {
    @Override // com.daaw.zg3
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        a74 a74Var = (a74) obj;
        if (a74Var.p() != null) {
            a74Var.p().zza();
        }
        zzl zzN = a74Var.zzN();
        if (zzN != null) {
            zzN.zzb();
            return;
        }
        zzl zzO = a74Var.zzO();
        if (zzO != null) {
            zzO.zzb();
        } else {
            k04.zzj("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
