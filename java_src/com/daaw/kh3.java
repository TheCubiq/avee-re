package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;
/* loaded from: classes.dex */
public final class kh3 implements zg3 {
    public final xh5 a;

    public kh3(xh5 xh5Var) {
        this.a = xh5Var;
    }

    @Override // com.daaw.zg3
    public final void a(Object obj, Map map) {
        if (((Boolean) zzba.zzc().b(g93.t8)).booleanValue()) {
            String str = (String) map.get("action");
            String str2 = (String) map.get("adUnitId");
            String str3 = (String) map.get("redirectUrl");
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                return;
            }
            String str4 = (String) map.get("format");
            if (str.equals("load") && !TextUtils.isEmpty(str4)) {
                this.a.l3(str2, str4, str3);
            } else if (str.equals("show")) {
                this.a.m3(str2, str3);
            }
        }
    }
}
