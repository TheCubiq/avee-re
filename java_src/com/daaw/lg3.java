package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.util.Map;
/* loaded from: classes.dex */
public final class lg3 implements zg3 {
    @Override // com.daaw.zg3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2341a(Object obj, Map map) {
        a74 a74Var = (a74) obj;
        try {
            String str = (String) map.get("enabled");
            if (!wx6.m5724c("true", str) && !wx6.m5724c("false", str)) {
                return;
            }
            lv6.m16482j(a74Var.getContext()).m16478n(Boolean.parseBoolean(str));
        } catch (IOException e) {
            zzt.zzo().m11902u(e, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
