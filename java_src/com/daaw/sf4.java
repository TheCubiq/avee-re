package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;
/* loaded from: classes.dex */
public final class sf4 implements kf4 {

    /* renamed from: a */
    public final dh5 f26230a;

    public sf4(dh5 dh5Var) {
        this.f26230a = dh5Var;
    }

    @Override // com.daaw.kf4
    /* renamed from: a */
    public final void mo6086a(Map map) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10773n8)).booleanValue()) {
            String str = (String) map.get("policy_violations");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f26230a.m24399l(str);
        }
    }
}
