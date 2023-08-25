package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.util.Map;
/* loaded from: classes.dex */
public final class kg3 implements zg3 {
    @Override // com.daaw.zg3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2341a(Object obj, Map map) {
        a74 a74Var = (a74) obj;
        try {
            kv6.m17404k(a74Var.getContext()).m17403l();
            lv6.m16482j(a74Var.getContext()).m16481k();
        } catch (IOException e) {
            zzt.zzo().m11902u(e, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
