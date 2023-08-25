package com.daaw;

import java.util.Map;
/* loaded from: classes.dex */
public final class wg3 implements zg3 {
    @Override // com.daaw.zg3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2341a(Object obj, Map map) {
        a74 a74Var = (a74) obj;
        if (map.keySet().contains("start")) {
            a74Var.zzP().zzk();
        } else if (map.keySet().contains("stop")) {
            a74Var.zzP().zzl();
        } else if (map.keySet().contains("cancel")) {
            a74Var.zzP().zzj();
        }
    }
}
