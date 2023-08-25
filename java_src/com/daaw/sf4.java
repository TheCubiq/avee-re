package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;
/* loaded from: classes.dex */
public final class sf4 implements kf4 {
    public final dh5 a;

    public sf4(dh5 dh5Var) {
        this.a = dh5Var;
    }

    @Override // com.daaw.kf4
    public final void a(Map map) {
        if (((Boolean) zzba.zzc().b(g93.n8)).booleanValue()) {
            String str = (String) map.get("policy_violations");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.a.l(str);
        }
    }
}
