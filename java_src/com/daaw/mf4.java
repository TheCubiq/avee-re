package com.daaw;

import com.google.android.gms.ads.internal.util.zzg;
import java.util.Map;
/* loaded from: classes.dex */
public final class mf4 implements kf4 {

    /* renamed from: a */
    public final zzg f18854a;

    public mf4(zzg zzgVar) {
        this.f18854a = zzgVar;
    }

    @Override // com.daaw.kf4
    /* renamed from: a */
    public final void mo6086a(Map map) {
        this.f18854a.zzx(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}
