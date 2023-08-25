package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;
/* loaded from: classes.dex */
public final class kh3 implements zg3 {

    /* renamed from: a */
    public final xh5 f16371a;

    public kh3(xh5 xh5Var) {
        this.f16371a = xh5Var;
    }

    @Override // com.daaw.zg3
    /* renamed from: a */
    public final void mo2341a(Object obj, Map map) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10839t8)).booleanValue()) {
            String str = (String) map.get("action");
            String str2 = (String) map.get("adUnitId");
            String str3 = (String) map.get("redirectUrl");
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                return;
            }
            String str4 = (String) map.get("format");
            if (str.equals("load") && !TextUtils.isEmpty(str4)) {
                this.f16371a.m5100l3(str2, str4, str3);
            } else if (str.equals("show")) {
                this.f16371a.m5099m3(str2, str3);
            }
        }
    }
}
