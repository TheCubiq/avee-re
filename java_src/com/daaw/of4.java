package com.daaw;

import com.google.android.gms.ads.internal.util.zzg;
import java.util.Map;
/* loaded from: classes.dex */
public final class of4 implements kf4 {

    /* renamed from: a */
    public final zzg f21535a;

    public of4(zzg zzgVar) {
        this.f21535a = zzgVar;
    }

    @Override // com.daaw.kf4
    /* renamed from: a */
    public final void mo6086a(Map map) {
        this.f21535a.zzz(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }
}
