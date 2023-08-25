package com.daaw;

import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class eg3 implements zg3 {
    @Override // com.daaw.zg3
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        JSONObject zzb;
        a74 a74Var = (a74) obj;
        ec3 zzM = a74Var.zzM();
        if (zzM == null || (zzb = zzM.zzb()) == null) {
            a74Var.l("nativeClickMetaReady", new JSONObject());
        } else {
            a74Var.l("nativeClickMetaReady", zzb);
        }
    }
}
