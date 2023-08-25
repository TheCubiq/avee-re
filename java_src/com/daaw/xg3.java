package com.daaw;

import java.util.Map;
/* loaded from: classes.dex */
public final class xg3 implements zg3 {
    @Override // com.daaw.zg3
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        a74 a74Var = (a74) obj;
        if (map.keySet().contains("start")) {
            a74Var.w(true);
        }
        if (map.keySet().contains("stop")) {
            a74Var.w(false);
        }
    }
}
