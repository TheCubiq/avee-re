package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.util.Map;
/* loaded from: classes.dex */
public final class kg3 implements zg3 {
    @Override // com.daaw.zg3
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        a74 a74Var = (a74) obj;
        try {
            kv6.k(a74Var.getContext()).l();
            lv6.j(a74Var.getContext()).k();
        } catch (IOException e) {
            zzt.zzo().u(e, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
