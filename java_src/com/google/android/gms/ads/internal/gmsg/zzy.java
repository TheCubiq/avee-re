package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzakb;
import java.util.Map;
@zzadh
/* loaded from: classes.dex */
public final class zzy implements zzv<Object> {
    private final zzz zzbmu;

    public zzy(zzz zzzVar) {
        this.zzbmu = zzzVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final void zza(Object obj, Map<String, String> map) {
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat(map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            zzakb.zzb("Fail to parse float", e);
        }
        this.zzbmu.zzd(equals);
        this.zzbmu.zza(equals2, f);
    }
}
