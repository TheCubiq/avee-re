package com.daaw;

import java.util.Map;
/* loaded from: classes.dex */
public final class sg3 implements zg3 {
    @Override // com.daaw.zg3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2341a(Object obj, Map map) {
        a74 a74Var = (a74) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            a74Var.zzbn();
        } else if ("resume".equals(str)) {
            a74Var.zzbo();
        }
    }
}
