package com.daaw;

import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class dg3 implements zg3 {
    @Override // com.daaw.zg3
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        JSONObject zza;
        a74 a74Var = (a74) obj;
        ec3 zzM = a74Var.zzM();
        if (zzM == null || (zza = zzM.zza()) == null) {
            a74Var.l("nativeAdViewSignalsReady", new JSONObject());
        } else {
            a74Var.l("nativeAdViewSignalsReady", zza);
        }
    }
}
