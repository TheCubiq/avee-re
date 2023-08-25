package com.daaw;

import com.google.android.gms.ads.internal.util.zzg;
import java.util.Map;
/* loaded from: classes.dex */
public final class of4 implements kf4 {
    public final zzg a;

    public of4(zzg zzgVar) {
        this.a = zzgVar;
    }

    @Override // com.daaw.kf4
    public final void a(Map map) {
        this.a.zzz(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }
}
